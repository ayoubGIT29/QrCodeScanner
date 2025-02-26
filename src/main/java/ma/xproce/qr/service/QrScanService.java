package ma.xproce.qr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class QrScanService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void logScan(String ip, String userAgent) {
        String sql = "INSERT INTO qr_scans (ip_address, user_agent, scanned_at) VALUES (?, ?, NOW())";
        jdbcTemplate.update(sql, ip, userAgent);
    }
}

