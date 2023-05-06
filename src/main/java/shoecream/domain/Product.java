package shoecream.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Product {

    @Id
    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "PRODUCT_CODE")
    private String productCode;

    @Column(name = "CREATE_DT")
    private LocalDateTime createDt;

    @Column(name = "MODIFIED_DT")
    private LocalDateTime modifiedDt;





}
