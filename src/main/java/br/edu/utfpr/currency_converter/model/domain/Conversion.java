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

    @ManyToOne
    @JoinColumn(name = "starting_currency")
    @NonNull
    private Currency startingCurrency;

    @ManyToOne
    @JoinColumn(name = "converted_currency")
    @NonNull
    private Currency convertedCurrency;

    @ManyToOne
    @NonNull
    private User user;
}
