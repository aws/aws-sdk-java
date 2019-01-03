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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Specify the language, using the ISO 639-2 three-letter code listed at
 * https://www.loc.gov/standards/iso639-2/php/code_list.php.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LanguageCode {

    ENG("ENG"),
    SPA("SPA"),
    FRA("FRA"),
    DEU("DEU"),
    GER("GER"),
    ZHO("ZHO"),
    ARA("ARA"),
    HIN("HIN"),
    JPN("JPN"),
    RUS("RUS"),
    POR("POR"),
    ITA("ITA"),
    URD("URD"),
    VIE("VIE"),
    KOR("KOR"),
    PAN("PAN"),
    ABK("ABK"),
    AAR("AAR"),
    AFR("AFR"),
    AKA("AKA"),
    SQI("SQI"),
    AMH("AMH"),
    ARG("ARG"),
    HYE("HYE"),
    ASM("ASM"),
    AVA("AVA"),
    AVE("AVE"),
    AYM("AYM"),
    AZE("AZE"),
    BAM("BAM"),
    BAK("BAK"),
    EUS("EUS"),
    BEL("BEL"),
    BEN("BEN"),
    BIH("BIH"),
    BIS("BIS"),
    BOS("BOS"),
    BRE("BRE"),
    BUL("BUL"),
    MYA("MYA"),
    CAT("CAT"),
    KHM("KHM"),
    CHA("CHA"),
    CHE("CHE"),
    NYA("NYA"),
    CHU("CHU"),
    CHV("CHV"),
    COR("COR"),
    COS("COS"),
    CRE("CRE"),
    HRV("HRV"),
    CES("CES"),
    DAN("DAN"),
    DIV("DIV"),
    NLD("NLD"),
    DZO("DZO"),
    ENM("ENM"),
    EPO("EPO"),
    EST("EST"),
    EWE("EWE"),
    FAO("FAO"),
    FIJ("FIJ"),
    FIN("FIN"),
    FRM("FRM"),
    FUL("FUL"),
    GLA("GLA"),
    GLG("GLG"),
    LUG("LUG"),
    KAT("KAT"),
    ELL("ELL"),
    GRN("GRN"),
    GUJ("GUJ"),
    HAT("HAT"),
    HAU("HAU"),
    HEB("HEB"),
    HER("HER"),
    HMO("HMO"),
    HUN("HUN"),
    ISL("ISL"),
    IDO("IDO"),
    IBO("IBO"),
    IND("IND"),
    INA("INA"),
    ILE("ILE"),
    IKU("IKU"),
    IPK("IPK"),
    GLE("GLE"),
    JAV("JAV"),
    KAL("KAL"),
    KAN("KAN"),
    KAU("KAU"),
    KAS("KAS"),
    KAZ("KAZ"),
    KIK("KIK"),
    KIN("KIN"),
    KIR("KIR"),
    KOM("KOM"),
    KON("KON"),
    KUA("KUA"),
    KUR("KUR"),
    LAO("LAO"),
    LAT("LAT"),
    LAV("LAV"),
    LIM("LIM"),
    LIN("LIN"),
    LIT("LIT"),
    LUB("LUB"),
    LTZ("LTZ"),
    MKD("MKD"),
    MLG("MLG"),
    MSA("MSA"),
    MAL("MAL"),
    MLT("MLT"),
    GLV("GLV"),
    MRI("MRI"),
    MAR("MAR"),
    MAH("MAH"),
    MON("MON"),
    NAU("NAU"),
    NAV("NAV"),
    NDE("NDE"),
    NBL("NBL"),
    NDO("NDO"),
    NEP("NEP"),
    SME("SME"),
    NOR("NOR"),
    NOB("NOB"),
    NNO("NNO"),
    OCI("OCI"),
    OJI("OJI"),
    ORI("ORI"),
    ORM("ORM"),
    OSS("OSS"),
    PLI("PLI"),
    FAS("FAS"),
    POL("POL"),
    PUS("PUS"),
    QUE("QUE"),
    QAA("QAA"),
    RON("RON"),
    ROH("ROH"),
    RUN("RUN"),
    SMO("SMO"),
    SAG("SAG"),
    SAN("SAN"),
    SRD("SRD"),
    SRB("SRB"),
    SNA("SNA"),
    III("III"),
    SND("SND"),
    SIN("SIN"),
    SLK("SLK"),
    SLV("SLV"),
    SOM("SOM"),
    SOT("SOT"),
    SUN("SUN"),
    SWA("SWA"),
    SSW("SSW"),
    SWE("SWE"),
    TGL("TGL"),
    TAH("TAH"),
    TGK("TGK"),
    TAM("TAM"),
    TAT("TAT"),
    TEL("TEL"),
    THA("THA"),
    BOD("BOD"),
    TIR("TIR"),
    TON("TON"),
    TSO("TSO"),
    TSN("TSN"),
    TUR("TUR"),
    TUK("TUK"),
    TWI("TWI"),
    UIG("UIG"),
    UKR("UKR"),
    UZB("UZB"),
    VEN("VEN"),
    VOL("VOL"),
    WLN("WLN"),
    CYM("CYM"),
    FRY("FRY"),
    WOL("WOL"),
    XHO("XHO"),
    YID("YID"),
    YOR("YOR"),
    ZHA("ZHA"),
    ZUL("ZUL"),
    ORJ("ORJ"),
    QPC("QPC"),
    TNG("TNG");

    private String value;

    private LanguageCode(String value) {
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
     * @return LanguageCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static LanguageCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (LanguageCode enumEntry : LanguageCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
