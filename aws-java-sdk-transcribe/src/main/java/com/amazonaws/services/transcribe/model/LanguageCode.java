/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LanguageCode {

    AfZA("af-ZA"),
    ArAE("ar-AE"),
    ArSA("ar-SA"),
    DaDK("da-DK"),
    DeCH("de-CH"),
    DeDE("de-DE"),
    EnAB("en-AB"),
    EnAU("en-AU"),
    EnGB("en-GB"),
    EnIE("en-IE"),
    EnIN("en-IN"),
    EnUS("en-US"),
    EnWL("en-WL"),
    EsES("es-ES"),
    EsUS("es-US"),
    FaIR("fa-IR"),
    FrCA("fr-CA"),
    FrFR("fr-FR"),
    HeIL("he-IL"),
    HiIN("hi-IN"),
    IdID("id-ID"),
    ItIT("it-IT"),
    JaJP("ja-JP"),
    KoKR("ko-KR"),
    MsMY("ms-MY"),
    NlNL("nl-NL"),
    PtBR("pt-BR"),
    PtPT("pt-PT"),
    RuRU("ru-RU"),
    TaIN("ta-IN"),
    TeIN("te-IN"),
    TrTR("tr-TR"),
    ZhCN("zh-CN"),
    ZhTW("zh-TW"),
    ThTH("th-TH"),
    EnZA("en-ZA"),
    EnNZ("en-NZ"),
    ViVN("vi-VN"),
    SvSE("sv-SE"),
    AbGE("ab-GE"),
    AstES("ast-ES"),
    AzAZ("az-AZ"),
    BaRU("ba-RU"),
    BeBY("be-BY"),
    BgBG("bg-BG"),
    BnIN("bn-IN"),
    BsBA("bs-BA"),
    CaES("ca-ES"),
    CkbIQ("ckb-IQ"),
    CkbIR("ckb-IR"),
    CsCZ("cs-CZ"),
    CyWL("cy-WL"),
    ElGR("el-GR"),
    EtET("et-ET"),
    EuES("eu-ES"),
    FiFI("fi-FI"),
    GlES("gl-ES"),
    GuIN("gu-IN"),
    HaNG("ha-NG"),
    HrHR("hr-HR"),
    HuHU("hu-HU"),
    HyAM("hy-AM"),
    IsIS("is-IS"),
    KaGE("ka-GE"),
    KabDZ("kab-DZ"),
    KkKZ("kk-KZ"),
    KnIN("kn-IN"),
    KyKG("ky-KG"),
    LgIN("lg-IN"),
    LtLT("lt-LT"),
    LvLV("lv-LV"),
    MhrRU("mhr-RU"),
    MiNZ("mi-NZ"),
    MkMK("mk-MK"),
    MlIN("ml-IN"),
    MnMN("mn-MN"),
    MrIN("mr-IN"),
    MtMT("mt-MT"),
    NoNO("no-NO"),
    OrIN("or-IN"),
    PaIN("pa-IN"),
    PlPL("pl-PL"),
    PsAF("ps-AF"),
    RoRO("ro-RO"),
    RwRW("rw-RW"),
    SiLK("si-LK"),
    SkSK("sk-SK"),
    SlSI("sl-SI"),
    SoSO("so-SO"),
    SrRS("sr-RS"),
    SuID("su-ID"),
    SwBI("sw-BI"),
    SwKE("sw-KE"),
    SwRW("sw-RW"),
    SwTZ("sw-TZ"),
    SwUG("sw-UG"),
    TlPH("tl-PH"),
    TtRU("tt-RU"),
    UgCN("ug-CN"),
    UkUA("uk-UA"),
    UzUZ("uz-UZ"),
    WoSN("wo-SN"),
    ZuZA("zu-ZA");

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
