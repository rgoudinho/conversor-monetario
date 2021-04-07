package br.edu.utfpr.currency_converter.model.domain;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "currency")
@Data
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Currency{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(name = "currency_name")
    private String currencyName;

    @NonNull
    @Column(name = "value_relative_real")
    private double valueRelativeReal;
}
