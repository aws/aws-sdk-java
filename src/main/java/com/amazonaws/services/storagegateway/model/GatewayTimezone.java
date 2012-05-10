/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

/**
 * Gateway Timezone
 */
public enum GatewayTimezone {
    
    GMT_MINUS_1200("GMT-12:00"),
    GMT_MINUS_1100("GMT-11:00"),
    GMT_MINUS_1000("GMT-10:00"),
    GMT_MINUS_900("GMT-9:00"),
    GMT_MINUS_800("GMT-8:00"),
    GMT_MINUS_700("GMT-7:00"),
    GMT_MINUS_600("GMT-6:00"),
    GMT_MINUS_500("GMT-5:00"),
    GMT_MINUS_400("GMT-4:00"),
    GMT_MINUS_330("GMT-3:30"),
    GMT_MINUS_300("GMT-3:00"),
    GMT_MINUS_200("GMT-2:00"),
    GMT_MINUS_100("GMT-1:00"),
    GMT("GMT"),
    GMT_PLUS_100("GMT+1:00"),
    GMT_PLUS_200("GMT+2:00"),
    GMT_PLUS_300("GMT+3:00"),
    GMT_PLUS_330("GMT+3:30"),
    GMT_PLUS_400("GMT+4:00"),
    GMT_PLUS_430("GMT+4:30"),
    GMT_PLUS_500("GMT+5:00"),
    GMT_PLUS_530("GMT+5:30"),
    GMT_PLUS_545("GMT+5:45"),
    GMT_PLUS_600("GMT+6:00"),
    GMT_PLUS_700("GMT+7:00"),
    GMT_PLUS_800("GMT+8:00"),
    GMT_PLUS_900("GMT+9:00"),
    GMT_PLUS_930("GMT+9:30"),
    GMT_PLUS_1000("GMT+10:00"),
    GMT_PLUS_1100("GMT+11:00"),
    GMT_PLUS_1200("GMT+12:00");

    private String value;

    private GatewayTimezone(String value) {
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
     * @return GatewayTimezone corresponding to the value
     */
    public static GatewayTimezone fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("GMT-12:00".equals(value)) {
            return GatewayTimezone.GMT_MINUS_1200;
        } else if ("GMT-11:00".equals(value)) {
            return GatewayTimezone.GMT_MINUS_1100;
        } else if ("GMT-10:00".equals(value)) {
            return GatewayTimezone.GMT_MINUS_1000;
        } else if ("GMT-9:00".equals(value)) {
            return GatewayTimezone.GMT_MINUS_900;
        } else if ("GMT-8:00".equals(value)) {
            return GatewayTimezone.GMT_MINUS_800;
        } else if ("GMT-7:00".equals(value)) {
            return GatewayTimezone.GMT_MINUS_700;
        } else if ("GMT-6:00".equals(value)) {
            return GatewayTimezone.GMT_MINUS_600;
        } else if ("GMT-5:00".equals(value)) {
            return GatewayTimezone.GMT_MINUS_500;
        } else if ("GMT-4:00".equals(value)) {
            return GatewayTimezone.GMT_MINUS_400;
        } else if ("GMT-3:30".equals(value)) {
            return GatewayTimezone.GMT_MINUS_330;
        } else if ("GMT-3:00".equals(value)) {
            return GatewayTimezone.GMT_MINUS_300;
        } else if ("GMT-2:00".equals(value)) {
            return GatewayTimezone.GMT_MINUS_200;
        } else if ("GMT-1:00".equals(value)) {
            return GatewayTimezone.GMT_MINUS_100;
        } else if ("GMT".equals(value)) {
            return GatewayTimezone.GMT;
        } else if ("GMT+1:00".equals(value)) {
            return GatewayTimezone.GMT_PLUS_100;
        } else if ("GMT+2:00".equals(value)) {
            return GatewayTimezone.GMT_PLUS_200;
        } else if ("GMT+3:00".equals(value)) {
            return GatewayTimezone.GMT_PLUS_300;
        } else if ("GMT+3:30".equals(value)) {
            return GatewayTimezone.GMT_PLUS_330;
        } else if ("GMT+4:00".equals(value)) {
            return GatewayTimezone.GMT_PLUS_400;
        } else if ("GMT+4:30".equals(value)) {
            return GatewayTimezone.GMT_PLUS_430;
        } else if ("GMT+5:00".equals(value)) {
            return GatewayTimezone.GMT_PLUS_500;
        } else if ("GMT+5:30".equals(value)) {
            return GatewayTimezone.GMT_PLUS_530;
        } else if ("GMT+5:45".equals(value)) {
            return GatewayTimezone.GMT_PLUS_545;
        } else if ("GMT+6:00".equals(value)) {
            return GatewayTimezone.GMT_PLUS_600;
        } else if ("GMT+7:00".equals(value)) {
            return GatewayTimezone.GMT_PLUS_700;
        } else if ("GMT+8:00".equals(value)) {
            return GatewayTimezone.GMT_PLUS_800;
        } else if ("GMT+9:00".equals(value)) {
            return GatewayTimezone.GMT_PLUS_900;
        } else if ("GMT+9:30".equals(value)) {
            return GatewayTimezone.GMT_PLUS_930;
        } else if ("GMT+10:00".equals(value)) {
            return GatewayTimezone.GMT_PLUS_1000;
        } else if ("GMT+11:00".equals(value)) {
            return GatewayTimezone.GMT_PLUS_1100;
        } else if ("GMT+12:00".equals(value)) {
            return GatewayTimezone.GMT_PLUS_1200;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    