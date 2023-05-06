package shoecream.domain;

import jakarta.persistence.*;
import shoecream.domain.en.TradeType;

import java.time.LocalDateTime;

@Entity
public class Trade {

    @Id
    @Column(name = "TRADE_ID")
    private Long id;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "PRODUCT_ID")
    private String productId;

    @Enumerated(EnumType.STRING)
    private TradeType type;

    @Column(name = "PRICE")
    private int price;

    @Column(name = "SIZE_ID")
    private String sizeId;

    @Column(name = "CREATE_DT")
    private LocalDateTime createDt;

}
