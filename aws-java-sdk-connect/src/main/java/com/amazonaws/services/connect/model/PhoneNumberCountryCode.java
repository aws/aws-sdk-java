/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum PhoneNumberCountryCode {

    AF("AF"),
    AL("AL"),
    DZ("DZ"),
    AS("AS"),
    AD("AD"),
    AO("AO"),
    AI("AI"),
    AQ("AQ"),
    AG("AG"),
    AR("AR"),
    AM("AM"),
    AW("AW"),
    AU("AU"),
    AT("AT"),
    AZ("AZ"),
    BS("BS"),
    BH("BH"),
    BD("BD"),
    BB("BB"),
    BY("BY"),
    BE("BE"),
    BZ("BZ"),
    BJ("BJ"),
    BM("BM"),
    BT("BT"),
    BO("BO"),
    BA("BA"),
    BW("BW"),
    BR("BR"),
    IO("IO"),
    VG("VG"),
    BN("BN"),
    BG("BG"),
    BF("BF"),
    BI("BI"),
    KH("KH"),
    CM("CM"),
    CA("CA"),
    CV("CV"),
    KY("KY"),
    CF("CF"),
    TD("TD"),
    CL("CL"),
    CN("CN"),
    CX("CX"),
    CC("CC"),
    CO("CO"),
    KM("KM"),
    CK("CK"),
    CR("CR"),
    HR("HR"),
    CU("CU"),
    CW("CW"),
    CY("CY"),
    CZ("CZ"),
    CD("CD"),
    DK("DK"),
    DJ("DJ"),
    DM("DM"),
    DO("DO"),
    TL("TL"),
    EC("EC"),
    EG("EG"),
    SV("SV"),
    GQ("GQ"),
    ER("ER"),
    EE("EE"),
    ET("ET"),
    FK("FK"),
    FO("FO"),
    FJ("FJ"),
    FI("FI"),
    FR("FR"),
    PF("PF"),
    GA("GA"),
    GM("GM"),
    GE("GE"),
    DE("DE"),
    GH("GH"),
    GI("GI"),
    GR("GR"),
    GL("GL"),
    GD("GD"),
    GU("GU"),
    GT("GT"),
    GG("GG"),
    GN("GN"),
    GW("GW"),
    GY("GY"),
    HT("HT"),
    HN("HN"),
    HK("HK"),
    HU("HU"),
    IS("IS"),
    IN("IN"),
    ID("ID"),
    IR("IR"),
    IQ("IQ"),
    IE("IE"),
    IM("IM"),
    IL("IL"),
    IT("IT"),
    CI("CI"),
    JM("JM"),
    JP("JP"),
    JE("JE"),
    JO("JO"),
    KZ("KZ"),
    KE("KE"),
    KI("KI"),
    KW("KW"),
    KG("KG"),
    LA("LA"),
    LV("LV"),
    LB("LB"),
    LS("LS"),
    LR("LR"),
    LY("LY"),
    LI("LI"),
    LT("LT"),
    LU("LU"),
    MO("MO"),
    MK("MK"),
    MG("MG"),
    MW("MW"),
    MY("MY"),
    MV("MV"),
    ML("ML"),
    MT("MT"),
    MH("MH"),
    MR("MR"),
    MU("MU"),
    YT("YT"),
    MX("MX"),
    FM("FM"),
    MD("MD"),
    MC("MC"),
    MN("MN"),
    ME("ME"),
    MS("MS"),
    MA("MA"),
    MZ("MZ"),
    MM("MM"),
    NA("NA"),
    NR("NR"),
    NP("NP"),
    NL("NL"),
    AN("AN"),
    NC("NC"),
    NZ("NZ"),
    NI("NI"),
    NE("NE"),
    NG("NG"),
    NU("NU"),
    KP("KP"),
    MP("MP"),
    NO("NO"),
    OM("OM"),
    PK("PK"),
    PW("PW"),
    PA("PA"),
    PG("PG"),
    PY("PY"),
    PE("PE"),
    PH("PH"),
    PN("PN"),
    PL("PL"),
    PT("PT"),
    PR("PR"),
    QA("QA"),
    CG("CG"),
    RE("RE"),
    RO("RO"),
    RU("RU"),
    RW("RW"),
    BL("BL"),
    SH("SH"),
    KN("KN"),
    LC("LC"),
    MF("MF"),
    PM("PM"),
    VC("VC"),
    WS("WS"),
    SM("SM"),
    ST("ST"),
    SA("SA"),
    SN("SN"),
    RS("RS"),
    SC("SC"),
    SL("SL"),
    SG("SG"),
    SX("SX"),
    SK("SK"),
    SI("SI"),
    SB("SB"),
    SO("SO"),
    ZA("ZA"),
    KR("KR"),
    ES("ES"),
    LK("LK"),
    SD("SD"),
    SR("SR"),
    SJ("SJ"),
    SZ("SZ"),
    SE("SE"),
    CH("CH"),
    SY("SY"),
    TW("TW"),
    TJ("TJ"),
    TZ("TZ"),
    TH("TH"),
    TG("TG"),
    TK("TK"),
    TO("TO"),
    TT("TT"),
    TN("TN"),
    TR("TR"),
    TM("TM"),
    TC("TC"),
    TV("TV"),
    VI("VI"),
    UG("UG"),
    UA("UA"),
    AE("AE"),
    GB("GB"),
    US("US"),
    UY("UY"),
    UZ("UZ"),
    VU("VU"),
    VA("VA"),
    VE("VE"),
    VN("VN"),
    WF("WF"),
    EH("EH"),
    YE("YE"),
    ZM("ZM"),
    ZW("ZW");

    private String value;

    private PhoneNumberCountryCode(String value) {
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
     * @return PhoneNumberCountryCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static PhoneNumberCountryCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (PhoneNumberCountryCode enumEntry : PhoneNumberCountryCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
