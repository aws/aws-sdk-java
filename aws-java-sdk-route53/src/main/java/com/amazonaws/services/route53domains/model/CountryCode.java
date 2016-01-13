/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.route53domains.model;

/**
 * 
 */
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
     */
    public static CountryCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("AD".equals(value)) {
            return AD;
        } else if ("AE".equals(value)) {
            return AE;
        } else if ("AF".equals(value)) {
            return AF;
        } else if ("AG".equals(value)) {
            return AG;
        } else if ("AI".equals(value)) {
            return AI;
        } else if ("AL".equals(value)) {
            return AL;
        } else if ("AM".equals(value)) {
            return AM;
        } else if ("AN".equals(value)) {
            return AN;
        } else if ("AO".equals(value)) {
            return AO;
        } else if ("AQ".equals(value)) {
            return AQ;
        } else if ("AR".equals(value)) {
            return AR;
        } else if ("AS".equals(value)) {
            return AS;
        } else if ("AT".equals(value)) {
            return AT;
        } else if ("AU".equals(value)) {
            return AU;
        } else if ("AW".equals(value)) {
            return AW;
        } else if ("AZ".equals(value)) {
            return AZ;
        } else if ("BA".equals(value)) {
            return BA;
        } else if ("BB".equals(value)) {
            return BB;
        } else if ("BD".equals(value)) {
            return BD;
        } else if ("BE".equals(value)) {
            return BE;
        } else if ("BF".equals(value)) {
            return BF;
        } else if ("BG".equals(value)) {
            return BG;
        } else if ("BH".equals(value)) {
            return BH;
        } else if ("BI".equals(value)) {
            return BI;
        } else if ("BJ".equals(value)) {
            return BJ;
        } else if ("BL".equals(value)) {
            return BL;
        } else if ("BM".equals(value)) {
            return BM;
        } else if ("BN".equals(value)) {
            return BN;
        } else if ("BO".equals(value)) {
            return BO;
        } else if ("BR".equals(value)) {
            return BR;
        } else if ("BS".equals(value)) {
            return BS;
        } else if ("BT".equals(value)) {
            return BT;
        } else if ("BW".equals(value)) {
            return BW;
        } else if ("BY".equals(value)) {
            return BY;
        } else if ("BZ".equals(value)) {
            return BZ;
        } else if ("CA".equals(value)) {
            return CA;
        } else if ("CC".equals(value)) {
            return CC;
        } else if ("CD".equals(value)) {
            return CD;
        } else if ("CF".equals(value)) {
            return CF;
        } else if ("CG".equals(value)) {
            return CG;
        } else if ("CH".equals(value)) {
            return CH;
        } else if ("CI".equals(value)) {
            return CI;
        } else if ("CK".equals(value)) {
            return CK;
        } else if ("CL".equals(value)) {
            return CL;
        } else if ("CM".equals(value)) {
            return CM;
        } else if ("CN".equals(value)) {
            return CN;
        } else if ("CO".equals(value)) {
            return CO;
        } else if ("CR".equals(value)) {
            return CR;
        } else if ("CU".equals(value)) {
            return CU;
        } else if ("CV".equals(value)) {
            return CV;
        } else if ("CX".equals(value)) {
            return CX;
        } else if ("CY".equals(value)) {
            return CY;
        } else if ("CZ".equals(value)) {
            return CZ;
        } else if ("DE".equals(value)) {
            return DE;
        } else if ("DJ".equals(value)) {
            return DJ;
        } else if ("DK".equals(value)) {
            return DK;
        } else if ("DM".equals(value)) {
            return DM;
        } else if ("DO".equals(value)) {
            return DO;
        } else if ("DZ".equals(value)) {
            return DZ;
        } else if ("EC".equals(value)) {
            return EC;
        } else if ("EE".equals(value)) {
            return EE;
        } else if ("EG".equals(value)) {
            return EG;
        } else if ("ER".equals(value)) {
            return ER;
        } else if ("ES".equals(value)) {
            return ES;
        } else if ("ET".equals(value)) {
            return ET;
        } else if ("FI".equals(value)) {
            return FI;
        } else if ("FJ".equals(value)) {
            return FJ;
        } else if ("FK".equals(value)) {
            return FK;
        } else if ("FM".equals(value)) {
            return FM;
        } else if ("FO".equals(value)) {
            return FO;
        } else if ("FR".equals(value)) {
            return FR;
        } else if ("GA".equals(value)) {
            return GA;
        } else if ("GB".equals(value)) {
            return GB;
        } else if ("GD".equals(value)) {
            return GD;
        } else if ("GE".equals(value)) {
            return GE;
        } else if ("GH".equals(value)) {
            return GH;
        } else if ("GI".equals(value)) {
            return GI;
        } else if ("GL".equals(value)) {
            return GL;
        } else if ("GM".equals(value)) {
            return GM;
        } else if ("GN".equals(value)) {
            return GN;
        } else if ("GQ".equals(value)) {
            return GQ;
        } else if ("GR".equals(value)) {
            return GR;
        } else if ("GT".equals(value)) {
            return GT;
        } else if ("GU".equals(value)) {
            return GU;
        } else if ("GW".equals(value)) {
            return GW;
        } else if ("GY".equals(value)) {
            return GY;
        } else if ("HK".equals(value)) {
            return HK;
        } else if ("HN".equals(value)) {
            return HN;
        } else if ("HR".equals(value)) {
            return HR;
        } else if ("HT".equals(value)) {
            return HT;
        } else if ("HU".equals(value)) {
            return HU;
        } else if ("ID".equals(value)) {
            return ID;
        } else if ("IE".equals(value)) {
            return IE;
        } else if ("IL".equals(value)) {
            return IL;
        } else if ("IM".equals(value)) {
            return IM;
        } else if ("IN".equals(value)) {
            return IN;
        } else if ("IQ".equals(value)) {
            return IQ;
        } else if ("IR".equals(value)) {
            return IR;
        } else if ("IS".equals(value)) {
            return IS;
        } else if ("IT".equals(value)) {
            return IT;
        } else if ("JM".equals(value)) {
            return JM;
        } else if ("JO".equals(value)) {
            return JO;
        } else if ("JP".equals(value)) {
            return JP;
        } else if ("KE".equals(value)) {
            return KE;
        } else if ("KG".equals(value)) {
            return KG;
        } else if ("KH".equals(value)) {
            return KH;
        } else if ("KI".equals(value)) {
            return KI;
        } else if ("KM".equals(value)) {
            return KM;
        } else if ("KN".equals(value)) {
            return KN;
        } else if ("KP".equals(value)) {
            return KP;
        } else if ("KR".equals(value)) {
            return KR;
        } else if ("KW".equals(value)) {
            return KW;
        } else if ("KY".equals(value)) {
            return KY;
        } else if ("KZ".equals(value)) {
            return KZ;
        } else if ("LA".equals(value)) {
            return LA;
        } else if ("LB".equals(value)) {
            return LB;
        } else if ("LC".equals(value)) {
            return LC;
        } else if ("LI".equals(value)) {
            return LI;
        } else if ("LK".equals(value)) {
            return LK;
        } else if ("LR".equals(value)) {
            return LR;
        } else if ("LS".equals(value)) {
            return LS;
        } else if ("LT".equals(value)) {
            return LT;
        } else if ("LU".equals(value)) {
            return LU;
        } else if ("LV".equals(value)) {
            return LV;
        } else if ("LY".equals(value)) {
            return LY;
        } else if ("MA".equals(value)) {
            return MA;
        } else if ("MC".equals(value)) {
            return MC;
        } else if ("MD".equals(value)) {
            return MD;
        } else if ("ME".equals(value)) {
            return ME;
        } else if ("MF".equals(value)) {
            return MF;
        } else if ("MG".equals(value)) {
            return MG;
        } else if ("MH".equals(value)) {
            return MH;
        } else if ("MK".equals(value)) {
            return MK;
        } else if ("ML".equals(value)) {
            return ML;
        } else if ("MM".equals(value)) {
            return MM;
        } else if ("MN".equals(value)) {
            return MN;
        } else if ("MO".equals(value)) {
            return MO;
        } else if ("MP".equals(value)) {
            return MP;
        } else if ("MR".equals(value)) {
            return MR;
        } else if ("MS".equals(value)) {
            return MS;
        } else if ("MT".equals(value)) {
            return MT;
        } else if ("MU".equals(value)) {
            return MU;
        } else if ("MV".equals(value)) {
            return MV;
        } else if ("MW".equals(value)) {
            return MW;
        } else if ("MX".equals(value)) {
            return MX;
        } else if ("MY".equals(value)) {
            return MY;
        } else if ("MZ".equals(value)) {
            return MZ;
        } else if ("NA".equals(value)) {
            return NA;
        } else if ("NC".equals(value)) {
            return NC;
        } else if ("NE".equals(value)) {
            return NE;
        } else if ("NG".equals(value)) {
            return NG;
        } else if ("NI".equals(value)) {
            return NI;
        } else if ("NL".equals(value)) {
            return NL;
        } else if ("NO".equals(value)) {
            return NO;
        } else if ("NP".equals(value)) {
            return NP;
        } else if ("NR".equals(value)) {
            return NR;
        } else if ("NU".equals(value)) {
            return NU;
        } else if ("NZ".equals(value)) {
            return NZ;
        } else if ("OM".equals(value)) {
            return OM;
        } else if ("PA".equals(value)) {
            return PA;
        } else if ("PE".equals(value)) {
            return PE;
        } else if ("PF".equals(value)) {
            return PF;
        } else if ("PG".equals(value)) {
            return PG;
        } else if ("PH".equals(value)) {
            return PH;
        } else if ("PK".equals(value)) {
            return PK;
        } else if ("PL".equals(value)) {
            return PL;
        } else if ("PM".equals(value)) {
            return PM;
        } else if ("PN".equals(value)) {
            return PN;
        } else if ("PR".equals(value)) {
            return PR;
        } else if ("PT".equals(value)) {
            return PT;
        } else if ("PW".equals(value)) {
            return PW;
        } else if ("PY".equals(value)) {
            return PY;
        } else if ("QA".equals(value)) {
            return QA;
        } else if ("RO".equals(value)) {
            return RO;
        } else if ("RS".equals(value)) {
            return RS;
        } else if ("RU".equals(value)) {
            return RU;
        } else if ("RW".equals(value)) {
            return RW;
        } else if ("SA".equals(value)) {
            return SA;
        } else if ("SB".equals(value)) {
            return SB;
        } else if ("SC".equals(value)) {
            return SC;
        } else if ("SD".equals(value)) {
            return SD;
        } else if ("SE".equals(value)) {
            return SE;
        } else if ("SG".equals(value)) {
            return SG;
        } else if ("SH".equals(value)) {
            return SH;
        } else if ("SI".equals(value)) {
            return SI;
        } else if ("SK".equals(value)) {
            return SK;
        } else if ("SL".equals(value)) {
            return SL;
        } else if ("SM".equals(value)) {
            return SM;
        } else if ("SN".equals(value)) {
            return SN;
        } else if ("SO".equals(value)) {
            return SO;
        } else if ("SR".equals(value)) {
            return SR;
        } else if ("ST".equals(value)) {
            return ST;
        } else if ("SV".equals(value)) {
            return SV;
        } else if ("SY".equals(value)) {
            return SY;
        } else if ("SZ".equals(value)) {
            return SZ;
        } else if ("TC".equals(value)) {
            return TC;
        } else if ("TD".equals(value)) {
            return TD;
        } else if ("TG".equals(value)) {
            return TG;
        } else if ("TH".equals(value)) {
            return TH;
        } else if ("TJ".equals(value)) {
            return TJ;
        } else if ("TK".equals(value)) {
            return TK;
        } else if ("TL".equals(value)) {
            return TL;
        } else if ("TM".equals(value)) {
            return TM;
        } else if ("TN".equals(value)) {
            return TN;
        } else if ("TO".equals(value)) {
            return TO;
        } else if ("TR".equals(value)) {
            return TR;
        } else if ("TT".equals(value)) {
            return TT;
        } else if ("TV".equals(value)) {
            return TV;
        } else if ("TW".equals(value)) {
            return TW;
        } else if ("TZ".equals(value)) {
            return TZ;
        } else if ("UA".equals(value)) {
            return UA;
        } else if ("UG".equals(value)) {
            return UG;
        } else if ("US".equals(value)) {
            return US;
        } else if ("UY".equals(value)) {
            return UY;
        } else if ("UZ".equals(value)) {
            return UZ;
        } else if ("VA".equals(value)) {
            return VA;
        } else if ("VC".equals(value)) {
            return VC;
        } else if ("VE".equals(value)) {
            return VE;
        } else if ("VG".equals(value)) {
            return VG;
        } else if ("VI".equals(value)) {
            return VI;
        } else if ("VN".equals(value)) {
            return VN;
        } else if ("VU".equals(value)) {
            return VU;
        } else if ("WF".equals(value)) {
            return WF;
        } else if ("WS".equals(value)) {
            return WS;
        } else if ("YE".equals(value)) {
            return YE;
        } else if ("YT".equals(value)) {
            return YT;
        } else if ("ZA".equals(value)) {
            return ZA;
        } else if ("ZM".equals(value)) {
            return ZM;
        } else if ("ZW".equals(value)) {
            return ZW;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}