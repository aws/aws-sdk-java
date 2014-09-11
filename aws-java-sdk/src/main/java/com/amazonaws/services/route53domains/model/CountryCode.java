/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Country Code
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
     *            real value
     * @return CountryCode corresponding to the value
     */
    public static CountryCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("AD".equals(value)) {
            return CountryCode.AD;
        } else if ("AE".equals(value)) {
            return CountryCode.AE;
        } else if ("AF".equals(value)) {
            return CountryCode.AF;
        } else if ("AG".equals(value)) {
            return CountryCode.AG;
        } else if ("AI".equals(value)) {
            return CountryCode.AI;
        } else if ("AL".equals(value)) {
            return CountryCode.AL;
        } else if ("AM".equals(value)) {
            return CountryCode.AM;
        } else if ("AN".equals(value)) {
            return CountryCode.AN;
        } else if ("AO".equals(value)) {
            return CountryCode.AO;
        } else if ("AQ".equals(value)) {
            return CountryCode.AQ;
        } else if ("AR".equals(value)) {
            return CountryCode.AR;
        } else if ("AS".equals(value)) {
            return CountryCode.AS;
        } else if ("AT".equals(value)) {
            return CountryCode.AT;
        } else if ("AU".equals(value)) {
            return CountryCode.AU;
        } else if ("AW".equals(value)) {
            return CountryCode.AW;
        } else if ("AZ".equals(value)) {
            return CountryCode.AZ;
        } else if ("BA".equals(value)) {
            return CountryCode.BA;
        } else if ("BB".equals(value)) {
            return CountryCode.BB;
        } else if ("BD".equals(value)) {
            return CountryCode.BD;
        } else if ("BE".equals(value)) {
            return CountryCode.BE;
        } else if ("BF".equals(value)) {
            return CountryCode.BF;
        } else if ("BG".equals(value)) {
            return CountryCode.BG;
        } else if ("BH".equals(value)) {
            return CountryCode.BH;
        } else if ("BI".equals(value)) {
            return CountryCode.BI;
        } else if ("BJ".equals(value)) {
            return CountryCode.BJ;
        } else if ("BL".equals(value)) {
            return CountryCode.BL;
        } else if ("BM".equals(value)) {
            return CountryCode.BM;
        } else if ("BN".equals(value)) {
            return CountryCode.BN;
        } else if ("BO".equals(value)) {
            return CountryCode.BO;
        } else if ("BR".equals(value)) {
            return CountryCode.BR;
        } else if ("BS".equals(value)) {
            return CountryCode.BS;
        } else if ("BT".equals(value)) {
            return CountryCode.BT;
        } else if ("BW".equals(value)) {
            return CountryCode.BW;
        } else if ("BY".equals(value)) {
            return CountryCode.BY;
        } else if ("BZ".equals(value)) {
            return CountryCode.BZ;
        } else if ("CA".equals(value)) {
            return CountryCode.CA;
        } else if ("CC".equals(value)) {
            return CountryCode.CC;
        } else if ("CD".equals(value)) {
            return CountryCode.CD;
        } else if ("CF".equals(value)) {
            return CountryCode.CF;
        } else if ("CG".equals(value)) {
            return CountryCode.CG;
        } else if ("CH".equals(value)) {
            return CountryCode.CH;
        } else if ("CI".equals(value)) {
            return CountryCode.CI;
        } else if ("CK".equals(value)) {
            return CountryCode.CK;
        } else if ("CL".equals(value)) {
            return CountryCode.CL;
        } else if ("CM".equals(value)) {
            return CountryCode.CM;
        } else if ("CN".equals(value)) {
            return CountryCode.CN;
        } else if ("CO".equals(value)) {
            return CountryCode.CO;
        } else if ("CR".equals(value)) {
            return CountryCode.CR;
        } else if ("CU".equals(value)) {
            return CountryCode.CU;
        } else if ("CV".equals(value)) {
            return CountryCode.CV;
        } else if ("CX".equals(value)) {
            return CountryCode.CX;
        } else if ("CY".equals(value)) {
            return CountryCode.CY;
        } else if ("CZ".equals(value)) {
            return CountryCode.CZ;
        } else if ("DE".equals(value)) {
            return CountryCode.DE;
        } else if ("DJ".equals(value)) {
            return CountryCode.DJ;
        } else if ("DK".equals(value)) {
            return CountryCode.DK;
        } else if ("DM".equals(value)) {
            return CountryCode.DM;
        } else if ("DO".equals(value)) {
            return CountryCode.DO;
        } else if ("DZ".equals(value)) {
            return CountryCode.DZ;
        } else if ("EC".equals(value)) {
            return CountryCode.EC;
        } else if ("EE".equals(value)) {
            return CountryCode.EE;
        } else if ("EG".equals(value)) {
            return CountryCode.EG;
        } else if ("ER".equals(value)) {
            return CountryCode.ER;
        } else if ("ES".equals(value)) {
            return CountryCode.ES;
        } else if ("ET".equals(value)) {
            return CountryCode.ET;
        } else if ("FI".equals(value)) {
            return CountryCode.FI;
        } else if ("FJ".equals(value)) {
            return CountryCode.FJ;
        } else if ("FK".equals(value)) {
            return CountryCode.FK;
        } else if ("FM".equals(value)) {
            return CountryCode.FM;
        } else if ("FO".equals(value)) {
            return CountryCode.FO;
        } else if ("FR".equals(value)) {
            return CountryCode.FR;
        } else if ("GA".equals(value)) {
            return CountryCode.GA;
        } else if ("GB".equals(value)) {
            return CountryCode.GB;
        } else if ("GD".equals(value)) {
            return CountryCode.GD;
        } else if ("GE".equals(value)) {
            return CountryCode.GE;
        } else if ("GH".equals(value)) {
            return CountryCode.GH;
        } else if ("GI".equals(value)) {
            return CountryCode.GI;
        } else if ("GL".equals(value)) {
            return CountryCode.GL;
        } else if ("GM".equals(value)) {
            return CountryCode.GM;
        } else if ("GN".equals(value)) {
            return CountryCode.GN;
        } else if ("GQ".equals(value)) {
            return CountryCode.GQ;
        } else if ("GR".equals(value)) {
            return CountryCode.GR;
        } else if ("GT".equals(value)) {
            return CountryCode.GT;
        } else if ("GU".equals(value)) {
            return CountryCode.GU;
        } else if ("GW".equals(value)) {
            return CountryCode.GW;
        } else if ("GY".equals(value)) {
            return CountryCode.GY;
        } else if ("HK".equals(value)) {
            return CountryCode.HK;
        } else if ("HN".equals(value)) {
            return CountryCode.HN;
        } else if ("HR".equals(value)) {
            return CountryCode.HR;
        } else if ("HT".equals(value)) {
            return CountryCode.HT;
        } else if ("HU".equals(value)) {
            return CountryCode.HU;
        } else if ("ID".equals(value)) {
            return CountryCode.ID;
        } else if ("IE".equals(value)) {
            return CountryCode.IE;
        } else if ("IL".equals(value)) {
            return CountryCode.IL;
        } else if ("IM".equals(value)) {
            return CountryCode.IM;
        } else if ("IN".equals(value)) {
            return CountryCode.IN;
        } else if ("IQ".equals(value)) {
            return CountryCode.IQ;
        } else if ("IR".equals(value)) {
            return CountryCode.IR;
        } else if ("IS".equals(value)) {
            return CountryCode.IS;
        } else if ("IT".equals(value)) {
            return CountryCode.IT;
        } else if ("JM".equals(value)) {
            return CountryCode.JM;
        } else if ("JO".equals(value)) {
            return CountryCode.JO;
        } else if ("JP".equals(value)) {
            return CountryCode.JP;
        } else if ("KE".equals(value)) {
            return CountryCode.KE;
        } else if ("KG".equals(value)) {
            return CountryCode.KG;
        } else if ("KH".equals(value)) {
            return CountryCode.KH;
        } else if ("KI".equals(value)) {
            return CountryCode.KI;
        } else if ("KM".equals(value)) {
            return CountryCode.KM;
        } else if ("KN".equals(value)) {
            return CountryCode.KN;
        } else if ("KP".equals(value)) {
            return CountryCode.KP;
        } else if ("KR".equals(value)) {
            return CountryCode.KR;
        } else if ("KW".equals(value)) {
            return CountryCode.KW;
        } else if ("KY".equals(value)) {
            return CountryCode.KY;
        } else if ("KZ".equals(value)) {
            return CountryCode.KZ;
        } else if ("LA".equals(value)) {
            return CountryCode.LA;
        } else if ("LB".equals(value)) {
            return CountryCode.LB;
        } else if ("LC".equals(value)) {
            return CountryCode.LC;
        } else if ("LI".equals(value)) {
            return CountryCode.LI;
        } else if ("LK".equals(value)) {
            return CountryCode.LK;
        } else if ("LR".equals(value)) {
            return CountryCode.LR;
        } else if ("LS".equals(value)) {
            return CountryCode.LS;
        } else if ("LT".equals(value)) {
            return CountryCode.LT;
        } else if ("LU".equals(value)) {
            return CountryCode.LU;
        } else if ("LV".equals(value)) {
            return CountryCode.LV;
        } else if ("LY".equals(value)) {
            return CountryCode.LY;
        } else if ("MA".equals(value)) {
            return CountryCode.MA;
        } else if ("MC".equals(value)) {
            return CountryCode.MC;
        } else if ("MD".equals(value)) {
            return CountryCode.MD;
        } else if ("ME".equals(value)) {
            return CountryCode.ME;
        } else if ("MF".equals(value)) {
            return CountryCode.MF;
        } else if ("MG".equals(value)) {
            return CountryCode.MG;
        } else if ("MH".equals(value)) {
            return CountryCode.MH;
        } else if ("MK".equals(value)) {
            return CountryCode.MK;
        } else if ("ML".equals(value)) {
            return CountryCode.ML;
        } else if ("MM".equals(value)) {
            return CountryCode.MM;
        } else if ("MN".equals(value)) {
            return CountryCode.MN;
        } else if ("MO".equals(value)) {
            return CountryCode.MO;
        } else if ("MP".equals(value)) {
            return CountryCode.MP;
        } else if ("MR".equals(value)) {
            return CountryCode.MR;
        } else if ("MS".equals(value)) {
            return CountryCode.MS;
        } else if ("MT".equals(value)) {
            return CountryCode.MT;
        } else if ("MU".equals(value)) {
            return CountryCode.MU;
        } else if ("MV".equals(value)) {
            return CountryCode.MV;
        } else if ("MW".equals(value)) {
            return CountryCode.MW;
        } else if ("MX".equals(value)) {
            return CountryCode.MX;
        } else if ("MY".equals(value)) {
            return CountryCode.MY;
        } else if ("MZ".equals(value)) {
            return CountryCode.MZ;
        } else if ("NA".equals(value)) {
            return CountryCode.NA;
        } else if ("NC".equals(value)) {
            return CountryCode.NC;
        } else if ("NE".equals(value)) {
            return CountryCode.NE;
        } else if ("NG".equals(value)) {
            return CountryCode.NG;
        } else if ("NI".equals(value)) {
            return CountryCode.NI;
        } else if ("NL".equals(value)) {
            return CountryCode.NL;
        } else if ("NO".equals(value)) {
            return CountryCode.NO;
        } else if ("NP".equals(value)) {
            return CountryCode.NP;
        } else if ("NR".equals(value)) {
            return CountryCode.NR;
        } else if ("NU".equals(value)) {
            return CountryCode.NU;
        } else if ("NZ".equals(value)) {
            return CountryCode.NZ;
        } else if ("OM".equals(value)) {
            return CountryCode.OM;
        } else if ("PA".equals(value)) {
            return CountryCode.PA;
        } else if ("PE".equals(value)) {
            return CountryCode.PE;
        } else if ("PF".equals(value)) {
            return CountryCode.PF;
        } else if ("PG".equals(value)) {
            return CountryCode.PG;
        } else if ("PH".equals(value)) {
            return CountryCode.PH;
        } else if ("PK".equals(value)) {
            return CountryCode.PK;
        } else if ("PL".equals(value)) {
            return CountryCode.PL;
        } else if ("PM".equals(value)) {
            return CountryCode.PM;
        } else if ("PN".equals(value)) {
            return CountryCode.PN;
        } else if ("PR".equals(value)) {
            return CountryCode.PR;
        } else if ("PT".equals(value)) {
            return CountryCode.PT;
        } else if ("PW".equals(value)) {
            return CountryCode.PW;
        } else if ("PY".equals(value)) {
            return CountryCode.PY;
        } else if ("QA".equals(value)) {
            return CountryCode.QA;
        } else if ("RO".equals(value)) {
            return CountryCode.RO;
        } else if ("RS".equals(value)) {
            return CountryCode.RS;
        } else if ("RU".equals(value)) {
            return CountryCode.RU;
        } else if ("RW".equals(value)) {
            return CountryCode.RW;
        } else if ("SA".equals(value)) {
            return CountryCode.SA;
        } else if ("SB".equals(value)) {
            return CountryCode.SB;
        } else if ("SC".equals(value)) {
            return CountryCode.SC;
        } else if ("SD".equals(value)) {
            return CountryCode.SD;
        } else if ("SE".equals(value)) {
            return CountryCode.SE;
        } else if ("SG".equals(value)) {
            return CountryCode.SG;
        } else if ("SH".equals(value)) {
            return CountryCode.SH;
        } else if ("SI".equals(value)) {
            return CountryCode.SI;
        } else if ("SK".equals(value)) {
            return CountryCode.SK;
        } else if ("SL".equals(value)) {
            return CountryCode.SL;
        } else if ("SM".equals(value)) {
            return CountryCode.SM;
        } else if ("SN".equals(value)) {
            return CountryCode.SN;
        } else if ("SO".equals(value)) {
            return CountryCode.SO;
        } else if ("SR".equals(value)) {
            return CountryCode.SR;
        } else if ("ST".equals(value)) {
            return CountryCode.ST;
        } else if ("SV".equals(value)) {
            return CountryCode.SV;
        } else if ("SY".equals(value)) {
            return CountryCode.SY;
        } else if ("SZ".equals(value)) {
            return CountryCode.SZ;
        } else if ("TC".equals(value)) {
            return CountryCode.TC;
        } else if ("TD".equals(value)) {
            return CountryCode.TD;
        } else if ("TG".equals(value)) {
            return CountryCode.TG;
        } else if ("TH".equals(value)) {
            return CountryCode.TH;
        } else if ("TJ".equals(value)) {
            return CountryCode.TJ;
        } else if ("TK".equals(value)) {
            return CountryCode.TK;
        } else if ("TL".equals(value)) {
            return CountryCode.TL;
        } else if ("TM".equals(value)) {
            return CountryCode.TM;
        } else if ("TN".equals(value)) {
            return CountryCode.TN;
        } else if ("TO".equals(value)) {
            return CountryCode.TO;
        } else if ("TR".equals(value)) {
            return CountryCode.TR;
        } else if ("TT".equals(value)) {
            return CountryCode.TT;
        } else if ("TV".equals(value)) {
            return CountryCode.TV;
        } else if ("TW".equals(value)) {
            return CountryCode.TW;
        } else if ("TZ".equals(value)) {
            return CountryCode.TZ;
        } else if ("UA".equals(value)) {
            return CountryCode.UA;
        } else if ("UG".equals(value)) {
            return CountryCode.UG;
        } else if ("US".equals(value)) {
            return CountryCode.US;
        } else if ("UY".equals(value)) {
            return CountryCode.UY;
        } else if ("UZ".equals(value)) {
            return CountryCode.UZ;
        } else if ("VA".equals(value)) {
            return CountryCode.VA;
        } else if ("VC".equals(value)) {
            return CountryCode.VC;
        } else if ("VE".equals(value)) {
            return CountryCode.VE;
        } else if ("VG".equals(value)) {
            return CountryCode.VG;
        } else if ("VI".equals(value)) {
            return CountryCode.VI;
        } else if ("VN".equals(value)) {
            return CountryCode.VN;
        } else if ("VU".equals(value)) {
            return CountryCode.VU;
        } else if ("WF".equals(value)) {
            return CountryCode.WF;
        } else if ("WS".equals(value)) {
            return CountryCode.WS;
        } else if ("YE".equals(value)) {
            return CountryCode.YE;
        } else if ("YT".equals(value)) {
            return CountryCode.YT;
        } else if ("ZA".equals(value)) {
            return CountryCode.ZA;
        } else if ("ZM".equals(value)) {
            return CountryCode.ZM;
        } else if ("ZW".equals(value)) {
            return CountryCode.ZW;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    