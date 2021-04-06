package br.edu.utfpr.currency_converter.model.domain;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "conversion")
@Data
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Conversion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private float value;

    @NonNull
    @Column(name = "starting_currency")
    private String startingCurrency;

    @NonNull
    @Column(name = "converted_currency")
    private String convertedCurrency;

    @ManyToOne
    @NonNull
    private User user;
}
