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
package com.amazonaws.services.mediapackage.model;

import javax.annotation.Generated;

/**
 * This setting allows the delivery restriction flags on SCTE-35 segmentation descriptors to determine whether a message
 * signals an ad. Choosing "NONE" means no SCTE-35 messages become ads. Choosing "RESTRICTED" means SCTE-35 messages of
 * the types specified in AdTriggers that contain delivery restrictions will be treated as ads. Choosing "UNRESTRICTED"
 * means SCTE-35 messages of the types specified in AdTriggers that do not contain delivery restrictions will be treated
 * as ads. Choosing "BOTH" means all SCTE-35 messages of the types specified in AdTriggers will be treated as ads. Note
 * that Splice Insert messages do not have these flags and are always treated as ads if specified in AdTriggers.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AdsOnDeliveryRestrictions {

    NONE("NONE"),
    RESTRICTED("RESTRICTED"),
    UNRESTRICTED("UNRESTRICTED"),
    BOTH("BOTH");

    private String value;

    private AdsOnDeliveryRestrictions(String value) {
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
     * @return AdsOnDeliveryRestrictions corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AdsOnDeliveryRestrictions fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AdsOnDeliveryRestrictions enumEntry : AdsOnDeliveryRestrictions.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
