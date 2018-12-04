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

package com.amazonaws.services.cloudsearchv2.model;

/**
 * <p>
 * An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF RFC
 * 4646</a> language code or <code>mul</code> for multiple languages.
 * </p>
 */
public enum AnalysisSchemeLanguage {

    Ar("ar"),
    Bg("bg"),
    Ca("ca"),
    Cs("cs"),
    Da("da"),
    De("de"),
    El("el"),
    En("en"),
    Es("es"),
    Eu("eu"),
    Fa("fa"),
    Fi("fi"),
    Fr("fr"),
    Ga("ga"),
    Gl("gl"),
    He("he"),
    Hi("hi"),
    Hu("hu"),
    Hy("hy"),
    Id("id"),
    It("it"),
    Ja("ja"),
    Ko("ko"),
    Lv("lv"),
    Mul("mul"),
    Nl("nl"),
    No("no"),
    Pt("pt"),
    Ro("ro"),
    Ru("ru"),
    Sv("sv"),
    Th("th"),
    Tr("tr"),
    ZhHans("zh-Hans"),
    ZhHant("zh-Hant");

    private String value;

    private AnalysisSchemeLanguage(String value) {
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
     * @return AnalysisSchemeLanguage corresponding to the value
     */
    public static AnalysisSchemeLanguage fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("ar".equals(value)) {
            return Ar;
        } else if ("bg".equals(value)) {
            return Bg;
        } else if ("ca".equals(value)) {
            return Ca;
        } else if ("cs".equals(value)) {
            return Cs;
        } else if ("da".equals(value)) {
            return Da;
        } else if ("de".equals(value)) {
            return De;
        } else if ("el".equals(value)) {
            return El;
        } else if ("en".equals(value)) {
            return En;
        } else if ("es".equals(value)) {
            return Es;
        } else if ("eu".equals(value)) {
            return Eu;
        } else if ("fa".equals(value)) {
            return Fa;
        } else if ("fi".equals(value)) {
            return Fi;
        } else if ("fr".equals(value)) {
            return Fr;
        } else if ("ga".equals(value)) {
            return Ga;
        } else if ("gl".equals(value)) {
            return Gl;
        } else if ("he".equals(value)) {
            return He;
        } else if ("hi".equals(value)) {
            return Hi;
        } else if ("hu".equals(value)) {
            return Hu;
        } else if ("hy".equals(value)) {
            return Hy;
        } else if ("id".equals(value)) {
            return Id;
        } else if ("it".equals(value)) {
            return It;
        } else if ("ja".equals(value)) {
            return Ja;
        } else if ("ko".equals(value)) {
            return Ko;
        } else if ("lv".equals(value)) {
            return Lv;
        } else if ("mul".equals(value)) {
            return Mul;
        } else if ("nl".equals(value)) {
            return Nl;
        } else if ("no".equals(value)) {
            return No;
        } else if ("pt".equals(value)) {
            return Pt;
        } else if ("ro".equals(value)) {
            return Ro;
        } else if ("ru".equals(value)) {
            return Ru;
        } else if ("sv".equals(value)) {
            return Sv;
        } else if ("th".equals(value)) {
            return Th;
        } else if ("tr".equals(value)) {
            return Tr;
        } else if ("zh-Hans".equals(value)) {
            return ZhHans;
        } else if ("zh-Hant".equals(value)) {
            return ZhHant;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}