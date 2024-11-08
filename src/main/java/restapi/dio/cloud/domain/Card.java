package restapi.dio.cloud.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;


@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "availabel_limit", nullable = false, scale = 2,precision = 13)
    private BigDecimal limit;

    @Column(unique = true)
    private Long CVC;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public Long getCVC() {
        return CVC;
    }

    public void setCVC(Long CVC) {
        this.CVC = CVC;
    }
}

