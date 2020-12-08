package io.craftgate.request;

import io.craftgate.model.MemberType;
import io.craftgate.model.SettlementEarningsDestination;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateMemberRequest {

    private Boolean isBuyer;
    private Boolean isSubMerchant;
    private MemberType memberType;
    private String memberExternalId;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String identityNumber;
    private String contactName;
    private String contactSurname;
    private String legalCompanyTitle;
    private String taxOffice;
    private String taxNumber;
    private String iban;
    private SettlementEarningsDestination settlementEarningsDestination;

}