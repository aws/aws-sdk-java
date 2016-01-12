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
public enum ExtraParamName {

    DUNS_NUMBER("DUNS_NUMBER"),
    BRAND_NUMBER("BRAND_NUMBER"),
    BIRTH_DEPARTMENT("BIRTH_DEPARTMENT"),
    BIRTH_DATE_IN_YYYY_MM_DD("BIRTH_DATE_IN_YYYY_MM_DD"),
    BIRTH_COUNTRY("BIRTH_COUNTRY"),
    BIRTH_CITY("BIRTH_CITY"),
    DOCUMENT_NUMBER("DOCUMENT_NUMBER"),
    AU_ID_NUMBER("AU_ID_NUMBER"),
    AU_ID_TYPE("AU_ID_TYPE"),
    CA_LEGAL_TYPE("CA_LEGAL_TYPE"),
    ES_IDENTIFICATION("ES_IDENTIFICATION"),
    ES_IDENTIFICATION_TYPE("ES_IDENTIFICATION_TYPE"),
    ES_LEGAL_FORM("ES_LEGAL_FORM"),
    FI_BUSINESS_NUMBER("FI_BUSINESS_NUMBER"),
    FI_ID_NUMBER("FI_ID_NUMBER"),
    IT_PIN("IT_PIN"),
    RU_PASSPORT_DATA("RU_PASSPORT_DATA"),
    SE_ID_NUMBER("SE_ID_NUMBER"),
    SG_ID_NUMBER("SG_ID_NUMBER"),
    VAT_NUMBER("VAT_NUMBER");

    private String value;

    private ExtraParamName(String value) {
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
     * @return ExtraParamName corresponding to the value
     */
    public static ExtraParamName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("DUNS_NUMBER".equals(value)) {
            return DUNS_NUMBER;
        } else if ("BRAND_NUMBER".equals(value)) {
            return BRAND_NUMBER;
        } else if ("BIRTH_DEPARTMENT".equals(value)) {
            return BIRTH_DEPARTMENT;
        } else if ("BIRTH_DATE_IN_YYYY_MM_DD".equals(value)) {
            return BIRTH_DATE_IN_YYYY_MM_DD;
        } else if ("BIRTH_COUNTRY".equals(value)) {
            return BIRTH_COUNTRY;
        } else if ("BIRTH_CITY".equals(value)) {
            return BIRTH_CITY;
        } else if ("DOCUMENT_NUMBER".equals(value)) {
            return DOCUMENT_NUMBER;
        } else if ("AU_ID_NUMBER".equals(value)) {
            return AU_ID_NUMBER;
        } else if ("AU_ID_TYPE".equals(value)) {
            return AU_ID_TYPE;
        } else if ("CA_LEGAL_TYPE".equals(value)) {
            return CA_LEGAL_TYPE;
        } else if ("ES_IDENTIFICATION".equals(value)) {
            return ES_IDENTIFICATION;
        } else if ("ES_IDENTIFICATION_TYPE".equals(value)) {
            return ES_IDENTIFICATION_TYPE;
        } else if ("ES_LEGAL_FORM".equals(value)) {
            return ES_LEGAL_FORM;
        } else if ("FI_BUSINESS_NUMBER".equals(value)) {
            return FI_BUSINESS_NUMBER;
        } else if ("FI_ID_NUMBER".equals(value)) {
            return FI_ID_NUMBER;
        } else if ("IT_PIN".equals(value)) {
            return IT_PIN;
        } else if ("RU_PASSPORT_DATA".equals(value)) {
            return RU_PASSPORT_DATA;
        } else if ("SE_ID_NUMBER".equals(value)) {
            return SE_ID_NUMBER;
        } else if ("SG_ID_NUMBER".equals(value)) {
            return SG_ID_NUMBER;
        } else if ("VAT_NUMBER".equals(value)) {
            return VAT_NUMBER;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}