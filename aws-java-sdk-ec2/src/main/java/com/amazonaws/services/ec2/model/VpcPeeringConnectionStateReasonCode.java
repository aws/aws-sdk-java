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

package com.amazonaws.services.ec2.model;

/**
 * 
 */
public enum VpcPeeringConnectionStateReasonCode {

    InitiatingRequest("initiating-request"),
    PendingAcceptance("pending-acceptance"),
    Active("active"),
    Deleted("deleted"),
    Rejected("rejected"),
    Failed("failed"),
    Expired("expired"),
    Provisioning("provisioning"),
    Deleting("deleting");

    private String value;

    private VpcPeeringConnectionStateReasonCode(String value) {
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
     * @return VpcPeeringConnectionStateReasonCode corresponding to the value
     */
    public static VpcPeeringConnectionStateReasonCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("initiating-request".equals(value)) {
            return InitiatingRequest;
        } else if ("pending-acceptance".equals(value)) {
            return PendingAcceptance;
        } else if ("active".equals(value)) {
            return Active;
        } else if ("deleted".equals(value)) {
            return Deleted;
        } else if ("rejected".equals(value)) {
            return Rejected;
        } else if ("failed".equals(value)) {
            return Failed;
        } else if ("expired".equals(value)) {
            return Expired;
        } else if ("provisioning".equals(value)) {
            return Provisioning;
        } else if ("deleting".equals(value)) {
            return Deleting;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}