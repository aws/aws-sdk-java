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
    CA_BUSINESS_ENTITY_TYPE("CA_BUSINESS_ENTITY_TYPE"),
    ES_IDENTIFICATION("ES_IDENTIFICATION"),
    ES_IDENTIFICATION_TYPE("ES_IDENTIFICATION_TYPE"),
    ES_LEGAL_FORM("ES_LEGAL_FORM"),
    FI_BUSINESS_NUMBER("FI_BUSINESS_NUMBER"),
    FI_ID_NUMBER("FI_ID_NUMBER"),
    FI_NATIONALITY("FI_NATIONALITY"),
    FI_ORGANIZATION_TYPE("FI_ORGANIZATION_TYPE"),
    IT_PIN("IT_PIN"),
    IT_REGISTRANT_ENTITY_TYPE("IT_REGISTRANT_ENTITY_TYPE"),
    RU_PASSPORT_DATA("RU_PASSPORT_DATA"),
    SE_ID_NUMBER("SE_ID_NUMBER"),
    SG_ID_NUMBER("SG_ID_NUMBER"),
    VAT_NUMBER("VAT_NUMBER"),
    UK_CONTACT_TYPE("UK_CONTACT_TYPE"),
    UK_COMPANY_NUMBER("UK_COMPANY_NUMBER");

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
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ExtraParamName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ExtraParamName enumEntry : ExtraParamName.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
