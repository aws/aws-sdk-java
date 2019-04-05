/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.route53domains.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CountryCode {

    AD("AD"),
    AE("AE"),
    AF("AF"),
    AG("AG"),
    AI("AI"),
    AL("AL"),
    AM("AM"),
    AN("AN"),
    AO("AO"),
    AQ("AQ"),
    AR("AR"),
    AS("AS"),
    AT("AT"),
    AU("AU"),
    AW("AW"),
    AZ("AZ"),
    BA("BA"),
    BB("BB"),
    BD("BD"),
    BE("BE"),
    BF("BF"),
    BG("BG"),
    BH("BH"),
    BI("BI"),
    BJ("BJ"),
    BL("BL"),
    BM("BM"),
    BN("BN"),
    BO("BO"),
    BR("BR"),
    BS("BS"),
    BT("BT"),
    BW("BW"),
    BY("BY"),
    BZ("BZ"),
    CA("CA"),
    CC("CC"),
    CD("CD"),
    CF("CF"),
    CG("CG"),
    CH("CH"),
    CI("CI"),
    CK("CK"),
    CL("CL"),
    CM("CM"),
    CN("CN"),
    CO("CO"),
    CR("CR"),
    CU("CU"),
    CV("CV"),
    CX("CX"),
    CY("CY"),
    CZ("CZ"),
    DE("DE"),
    DJ("DJ"),
    DK("DK"),
    DM("DM"),
    DO("DO"),
    DZ("DZ"),
    EC("EC"),
    EE("EE"),
    EG("EG"),
    ER("ER"),
    ES("ES"),
    ET("ET"),
    FI("FI"),
    FJ("FJ"),
    FK("FK"),
    FM("FM"),
    FO("FO"),
    FR("FR"),
    GA("GA"),
    GB("GB"),
    GD("GD"),
    GE("GE"),
    GH("GH"),
    GI("GI"),
    GL("GL"),
    GM("GM"),
    GN("GN"),
    GQ("GQ"),
    GR("GR"),
    GT("GT"),
    GU("GU"),
    GW("GW"),
    GY("GY"),
    HK("HK"),
    HN("HN"),
    HR("HR"),
    HT("HT"),
    HU("HU"),
    ID("ID"),
    IE("IE"),
    IL("IL"),
    IM("IM"),
    IN("IN"),
    IQ("IQ"),
    IR("IR"),
    IS("IS"),
    IT("IT"),
    JM("JM"),
    JO("JO"),
    JP("JP"),
    KE("KE"),
    KG("KG"),
    KH("KH"),
    KI("KI"),
    KM("KM"),
    KN("KN"),
    KP("KP"),
    KR("KR"),
    KW("KW"),
    KY("KY"),
    KZ("KZ"),
    LA("LA"),
    LB("LB"),
    LC("LC"),
    LI("LI"),
    LK("LK"),
    LR("LR"),
    LS("LS"),
    LT("LT"),
    LU("LU"),
    LV("LV"),
    LY("LY"),
    MA("MA"),
    MC("MC"),
    MD("MD"),
    ME("ME"),
    MF("MF"),
    MG("MG"),
    MH("MH"),
    MK("MK"),
    ML("ML"),
    MM("MM"),
    MN("MN"),
    MO("MO"),
    MP("MP"),
    MR("MR"),
    MS("MS"),
    MT("MT"),
    MU("MU"),
    MV("MV"),
    MW("MW"),
    MX("MX"),
    MY("MY"),
    MZ("MZ"),
    NA("NA"),
    NC("NC"),
    NE("NE"),
    NG("NG"),
    NI("NI"),
    NL("NL"),
    NO("NO"),
    NP("NP"),
    NR("NR"),
    NU("NU"),
    NZ("NZ"),
    OM("OM"),
    PA("PA"),
    PE("PE"),
    PF("PF"),
    PG("PG"),
    PH("PH"),
    PK("PK"),
    PL("PL"),
    PM("PM"),
    PN("PN"),
    PR("PR"),
    PT("PT"),
    PW("PW"),
    PY("PY"),
    QA("QA"),
    RO("RO"),
    RS("RS"),
    RU("RU"),
    RW("RW"),
    SA("SA"),
    SB("SB"),
    SC("SC"),
    SD("SD"),
    SE("SE"),
    SG("SG"),
    SH("SH"),
    SI("SI"),
    SK("SK"),
    SL("SL"),
    SM("SM"),
    SN("SN"),
    SO("SO"),
    SR("SR"),
    ST("ST"),
    SV("SV"),
    SY("SY"),
    SZ("SZ"),
    TC("TC"),
    TD("TD"),
    TG("TG"),
    TH("TH"),
    TJ("TJ"),
    TK("TK"),
    TL("TL"),
    TM("TM"),
    TN("TN"),
    TO("TO"),
    TR("TR"),
    TT("TT"),
    TV("TV"),
    TW("TW"),
    TZ("TZ"),
    UA("UA"),
    UG("UG"),
    US("US"),
    UY("UY"),
    UZ("UZ"),
    VA("VA"),
    VC("VC"),
    VE("VE"),
    VG("VG"),
    VI("VI"),
    VN("VN"),
    VU("VU"),
    WF("WF"),
    WS("WS"),
    YE("YE"),
    YT("YT"),
    ZA("ZA"),
    ZM("ZM"),
    ZW("ZW");

    private String value;

    private CountryCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return CountryCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static CountryCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (CountryCode enumEntry : CountryCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
