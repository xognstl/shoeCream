package shoecream.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import shoecream.domain.en.BrandStates;

import java.time.LocalDateTime;

@Entity
@Data
public class Brand {

    @Id
    @Column(name = "BRAND_ID")
    private Long id;

    @Column(name = "NAME_KR")
    private String nameKr;

    @Column(name = "NAME_EN")
    private String nameEn;

    @Column(name = "STATES")
    private BrandStates states;

    @Column(name = "CREATE_DT")
    private LocalDateTime createDt;

    @Column(name = "MODIFIED_DT")
    private LocalDateTime modifiedDt;
}
