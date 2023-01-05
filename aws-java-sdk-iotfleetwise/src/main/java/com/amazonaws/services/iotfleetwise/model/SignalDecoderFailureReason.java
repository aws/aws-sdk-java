/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotfleetwise.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SignalDecoderFailureReason {

    DUPLICATE_SIGNAL("DUPLICATE_SIGNAL"),
    CONFLICTING_SIGNAL("CONFLICTING_SIGNAL"),
    SIGNAL_TO_ADD_ALREADY_EXISTS("SIGNAL_TO_ADD_ALREADY_EXISTS"),
    SIGNAL_NOT_ASSOCIATED_WITH_NETWORK_INTERFACE("SIGNAL_NOT_ASSOCIATED_WITH_NETWORK_INTERFACE"),
    NETWORK_INTERFACE_TYPE_INCOMPATIBLE_WITH_SIGNAL_DECODER_TYPE("NETWORK_INTERFACE_TYPE_INCOMPATIBLE_WITH_SIGNAL_DECODER_TYPE"),
    SIGNAL_NOT_IN_MODEL("SIGNAL_NOT_IN_MODEL"),
    CAN_SIGNAL_INFO_IS_NULL("CAN_SIGNAL_INFO_IS_NULL"),
    OBD_SIGNAL_INFO_IS_NULL("OBD_SIGNAL_INFO_IS_NULL"),
    NO_DECODER_INFO_FOR_SIGNAL_IN_MODEL("NO_DECODER_INFO_FOR_SIGNAL_IN_MODEL");

    private String value;

    private SignalDecoderFailureReason(String value) {
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
     * @return SignalDecoderFailureReason corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static SignalDecoderFailureReason fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (SignalDecoderFailureReason enumEntry : SignalDecoderFailureReason.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
