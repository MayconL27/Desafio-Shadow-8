package com.banco.Main.domain;

import com.banco.Main.domain.infoConta.ContaStatus;
import com.banco.Main.domain.infoConta.NomeBanco;
import com.banco.Main.domain.infoConta.TipoConta;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "CONTAS")
@Entity
public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name="UUIDGenerator",strategy = "uuid")
    @GeneratedValue(generator = "UUIDGenerator")
    private String id;
    @Column(nullable = false)
    @NotBlank
    private String idCliente;
    @Column(nullable = false)
    @NotBlank
    private String documento;
    @Column(nullable = false)
    private ContaStatus contaStatus; // PENDENTE, ATIVO, BLOQUEADO.
    @Column(nullable = false)
    private NomeBanco nomeBanco; // BANCOPE, BANCOSP;
    @Column(nullable = false)
    private TipoConta tipoConta;  //PJ, PF, GOV;
    @Column(nullable = false)
    private Integer agencia; // 5 Digitos
    @Column(nullable = false, unique = true)
    private Integer numeroConta; // 6 Digitos
    @Column(nullable = false)
    private Integer digito; // 1 Digitos
    private Double saldo = 0.0;

}
