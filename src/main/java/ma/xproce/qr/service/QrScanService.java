package ma.xproce.qr.service;

import ma.xproce.qr.dao.entities.Scan;
import ma.xproce.qr.dao.repositorie.ScanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

@Service
public class QrScanService {

    @Autowired
    private ScanRepository scanRepository;

    public void logScan(String ip, String userAgent) {
        System.out.println(ip);
        System.out.println(userAgent);
        Scan scan=Scan.builder().ipAddress(ip).userAgent(userAgent).timestamp(LocalDateTime.now()).build();
        System.out.println(scan);
        System.out.println(scanRepository.save(scan));
    }
}

