package io.craftgate.response.common;

import io.craftgate.model.*;
import io.craftgate.response.dto.MerchantPos;
import io.craftgate.response.dto.PaymentError;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class BasePaymentResponse {

    private Long id;
    private LocalDateTime createdDate;
    private BigDecimal price;
    private BigDecimal paidPrice;
    private BigDecimal walletPrice;
    private Currency currency;
    private Long buyerMemberId;
    private Integer installment;
    private String conversationId;
    private String externalId;
    private PaymentType paymentType;
    private PaymentGroup paymentGroup;
    private PaymentStatus paymentStatus;
    private PaymentPhase paymentPhase;
    private Boolean isThreeDS;
    private BigDecimal merchantCommissionRate;
    private BigDecimal merchantCommissionRateAmount;
    private Boolean paidWithStoredCard;
    private String binNumber;
    private String lastFourDigits;
    private String authCode;
    private String hostReference;
    private String transId;
    private String orderId;
    private CardType cardType;
    private CardAssociation cardAssociation;
    private String cardBrand;
    private MerchantPos pos;
    private PaymentError paymentError;
}