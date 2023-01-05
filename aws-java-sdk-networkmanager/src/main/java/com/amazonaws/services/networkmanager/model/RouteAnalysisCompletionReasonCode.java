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
package com.amazonaws.services.networkmanager.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum RouteAnalysisCompletionReasonCode {

    TRANSIT_GATEWAY_ATTACHMENT_NOT_FOUND("TRANSIT_GATEWAY_ATTACHMENT_NOT_FOUND"),
    TRANSIT_GATEWAY_ATTACHMENT_NOT_IN_TRANSIT_GATEWAY("TRANSIT_GATEWAY_ATTACHMENT_NOT_IN_TRANSIT_GATEWAY"),
    CYCLIC_PATH_DETECTED("CYCLIC_PATH_DETECTED"),
    TRANSIT_GATEWAY_ATTACHMENT_STABLE_ROUTE_TABLE_NOT_FOUND("TRANSIT_GATEWAY_ATTACHMENT_STABLE_ROUTE_TABLE_NOT_FOUND"),
    ROUTE_NOT_FOUND("ROUTE_NOT_FOUND"),
    BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND("BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND"),
    INACTIVE_ROUTE_FOR_DESTINATION_FOUND("INACTIVE_ROUTE_FOR_DESTINATION_FOUND"),
    TRANSIT_GATEWAY_ATTACHMENT_ATTACH_ARN_NO_MATCH("TRANSIT_GATEWAY_ATTACHMENT_ATTACH_ARN_NO_MATCH"),
    MAX_HOPS_EXCEEDED("MAX_HOPS_EXCEEDED"),
    POSSIBLE_MIDDLEBOX("POSSIBLE_MIDDLEBOX"),
    NO_DESTINATION_ARN_PROVIDED("NO_DESTINATION_ARN_PROVIDED");

    private String value;

    private RouteAnalysisCompletionReasonCode(String value) {
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
     * @return RouteAnalysisCompletionReasonCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static RouteAnalysisCompletionReasonCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (RouteAnalysisCompletionReasonCode enumEntry : RouteAnalysisCompletionReasonCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
