package ma.xproce.qr.dao.repositorie;

import ma.xproce.qr.dao.entities.Scan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScanRepository extends JpaRepository<Scan,Long> {
}
