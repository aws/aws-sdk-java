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
package com.amazonaws.services.datazone.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Timezone {

    UTC("UTC"),
    AFRICA_JOHANNESBURG("AFRICA_JOHANNESBURG"),
    AMERICA_MONTREAL("AMERICA_MONTREAL"),
    AMERICA_SAO_PAULO("AMERICA_SAO_PAULO"),
    ASIA_BAHRAIN("ASIA_BAHRAIN"),
    ASIA_BANGKOK("ASIA_BANGKOK"),
    ASIA_CALCUTTA("ASIA_CALCUTTA"),
    ASIA_DUBAI("ASIA_DUBAI"),
    ASIA_HONG_KONG("ASIA_HONG_KONG"),
    ASIA_JAKARTA("ASIA_JAKARTA"),
    ASIA_KUALA_LUMPUR("ASIA_KUALA_LUMPUR"),
    ASIA_SEOUL("ASIA_SEOUL"),
    ASIA_SHANGHAI("ASIA_SHANGHAI"),
    ASIA_SINGAPORE("ASIA_SINGAPORE"),
    ASIA_TAIPEI("ASIA_TAIPEI"),
    ASIA_TOKYO("ASIA_TOKYO"),
    AUSTRALIA_MELBOURNE("AUSTRALIA_MELBOURNE"),
    AUSTRALIA_SYDNEY("AUSTRALIA_SYDNEY"),
    CANADA_CENTRAL("CANADA_CENTRAL"),
    CET("CET"),
    CST6CDT("CST6CDT"),
    ETC_GMT("ETC_GMT"),
    ETC_GMT0("ETC_GMT0"),
    ETC_GMT_ADD_0("ETC_GMT_ADD_0"),
    ETC_GMT_ADD_1("ETC_GMT_ADD_1"),
    ETC_GMT_ADD_10("ETC_GMT_ADD_10"),
    ETC_GMT_ADD_11("ETC_GMT_ADD_11"),
    ETC_GMT_ADD_12("ETC_GMT_ADD_12"),
    ETC_GMT_ADD_2("ETC_GMT_ADD_2"),
    ETC_GMT_ADD_3("ETC_GMT_ADD_3"),
    ETC_GMT_ADD_4("ETC_GMT_ADD_4"),
    ETC_GMT_ADD_5("ETC_GMT_ADD_5"),
    ETC_GMT_ADD_6("ETC_GMT_ADD_6"),
    ETC_GMT_ADD_7("ETC_GMT_ADD_7"),
    ETC_GMT_ADD_8("ETC_GMT_ADD_8"),
    ETC_GMT_ADD_9("ETC_GMT_ADD_9"),
    ETC_GMT_NEG_0("ETC_GMT_NEG_0"),
    ETC_GMT_NEG_1("ETC_GMT_NEG_1"),
    ETC_GMT_NEG_10("ETC_GMT_NEG_10"),
    ETC_GMT_NEG_11("ETC_GMT_NEG_11"),
    ETC_GMT_NEG_12("ETC_GMT_NEG_12"),
    ETC_GMT_NEG_13("ETC_GMT_NEG_13"),
    ETC_GMT_NEG_14("ETC_GMT_NEG_14"),
    ETC_GMT_NEG_2("ETC_GMT_NEG_2"),
    ETC_GMT_NEG_3("ETC_GMT_NEG_3"),
    ETC_GMT_NEG_4("ETC_GMT_NEG_4"),
    ETC_GMT_NEG_5("ETC_GMT_NEG_5"),
    ETC_GMT_NEG_6("ETC_GMT_NEG_6"),
    ETC_GMT_NEG_7("ETC_GMT_NEG_7"),
    ETC_GMT_NEG_8("ETC_GMT_NEG_8"),
    ETC_GMT_NEG_9("ETC_GMT_NEG_9"),
    EUROPE_DUBLIN("EUROPE_DUBLIN"),
    EUROPE_LONDON("EUROPE_LONDON"),
    EUROPE_PARIS("EUROPE_PARIS"),
    EUROPE_STOCKHOLM("EUROPE_STOCKHOLM"),
    EUROPE_ZURICH("EUROPE_ZURICH"),
    ISRAEL("ISRAEL"),
    MEXICO_GENERAL("MEXICO_GENERAL"),
    MST7MDT("MST7MDT"),
    PACIFIC_AUCKLAND("PACIFIC_AUCKLAND"),
    US_CENTRAL("US_CENTRAL"),
    US_EASTERN("US_EASTERN"),
    US_MOUNTAIN("US_MOUNTAIN"),
    US_PACIFIC("US_PACIFIC");

    private String value;

    private Timezone(String value) {
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
     * @return Timezone corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Timezone fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Timezone enumEntry : Timezone.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
