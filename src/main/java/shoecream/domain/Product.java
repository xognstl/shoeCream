package shoecream.domain;

import jakarta.persistence.*;
import lombok.Data;
import shoecream.domain.en.ProductStates;

import java.time.LocalDateTime;

@Entity
@Data
public class Product {

    @Id
    @Column(name = "PRODUCT_ID")
    private Long Id;

    @Column(name = "PRODUCT_CODE")
    private String productCode;

    @Column(name = "CREATE_DT")
    private LocalDateTime createDt;

    @Column(name = "MODIFIED_DT")
    private LocalDateTime modifiedDt;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "NAME_KR")
    private String nameKr;

    @Column(name = "NAME_EN")
    private String nameEn;

    @Column(name = "CATEGORY")
    private String category;

    @OneToOne
    @JoinColumn(name = "BRAND_ID")
    private Brand brand;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATES")
    private ProductStates states;

    @Column(name = "VIEW_CNT")
    private int viewCnt;
}
