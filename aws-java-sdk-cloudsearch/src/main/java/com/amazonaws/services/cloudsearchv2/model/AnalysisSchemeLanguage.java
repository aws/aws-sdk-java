/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Analysis Scheme Language
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
     *            real value
     * @return AnalysisSchemeLanguage corresponding to the value
     */
    public static AnalysisSchemeLanguage fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("ar".equals(value)) {
            return AnalysisSchemeLanguage.Ar;
        } else if ("bg".equals(value)) {
            return AnalysisSchemeLanguage.Bg;
        } else if ("ca".equals(value)) {
            return AnalysisSchemeLanguage.Ca;
        } else if ("cs".equals(value)) {
            return AnalysisSchemeLanguage.Cs;
        } else if ("da".equals(value)) {
            return AnalysisSchemeLanguage.Da;
        } else if ("de".equals(value)) {
            return AnalysisSchemeLanguage.De;
        } else if ("el".equals(value)) {
            return AnalysisSchemeLanguage.El;
        } else if ("en".equals(value)) {
            return AnalysisSchemeLanguage.En;
        } else if ("es".equals(value)) {
            return AnalysisSchemeLanguage.Es;
        } else if ("eu".equals(value)) {
            return AnalysisSchemeLanguage.Eu;
        } else if ("fa".equals(value)) {
            return AnalysisSchemeLanguage.Fa;
        } else if ("fi".equals(value)) {
            return AnalysisSchemeLanguage.Fi;
        } else if ("fr".equals(value)) {
            return AnalysisSchemeLanguage.Fr;
        } else if ("ga".equals(value)) {
            return AnalysisSchemeLanguage.Ga;
        } else if ("gl".equals(value)) {
            return AnalysisSchemeLanguage.Gl;
        } else if ("he".equals(value)) {
            return AnalysisSchemeLanguage.He;
        } else if ("hi".equals(value)) {
            return AnalysisSchemeLanguage.Hi;
        } else if ("hu".equals(value)) {
            return AnalysisSchemeLanguage.Hu;
        } else if ("hy".equals(value)) {
            return AnalysisSchemeLanguage.Hy;
        } else if ("id".equals(value)) {
            return AnalysisSchemeLanguage.Id;
        } else if ("it".equals(value)) {
            return AnalysisSchemeLanguage.It;
        } else if ("ja".equals(value)) {
            return AnalysisSchemeLanguage.Ja;
        } else if ("ko".equals(value)) {
            return AnalysisSchemeLanguage.Ko;
        } else if ("lv".equals(value)) {
            return AnalysisSchemeLanguage.Lv;
        } else if ("mul".equals(value)) {
            return AnalysisSchemeLanguage.Mul;
        } else if ("nl".equals(value)) {
            return AnalysisSchemeLanguage.Nl;
        } else if ("no".equals(value)) {
            return AnalysisSchemeLanguage.No;
        } else if ("pt".equals(value)) {
            return AnalysisSchemeLanguage.Pt;
        } else if ("ro".equals(value)) {
            return AnalysisSchemeLanguage.Ro;
        } else if ("ru".equals(value)) {
            return AnalysisSchemeLanguage.Ru;
        } else if ("sv".equals(value)) {
            return AnalysisSchemeLanguage.Sv;
        } else if ("th".equals(value)) {
            return AnalysisSchemeLanguage.Th;
        } else if ("tr".equals(value)) {
            return AnalysisSchemeLanguage.Tr;
        } else if ("zh-Hans".equals(value)) {
            return AnalysisSchemeLanguage.ZhHans;
        } else if ("zh-Hant".equals(value)) {
            return AnalysisSchemeLanguage.ZhHant;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    