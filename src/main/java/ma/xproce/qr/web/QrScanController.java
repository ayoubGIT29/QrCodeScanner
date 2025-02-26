package ma.xproce.qr.web;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import ma.xproce.qr.service.QrScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/track")
public class QrScanController {

    @Autowired
    private QrScanService qrScanService;

    @GetMapping
    public ResponseEntity<Void> logScan(HttpServletRequest request) {
        System.out.println(request.getRemoteAddr());
        String ip = request.getRemoteAddr();
        String userAgent = request.getHeader("User-Agent");

        qrScanService.logScan(ip, userAgent);

        return ResponseEntity.status(HttpStatus.FOUND)
                .header("Location", "https://www.linkedin.com/in/ayoub-mounadi-93444a251/")
                .build();
    }
}

