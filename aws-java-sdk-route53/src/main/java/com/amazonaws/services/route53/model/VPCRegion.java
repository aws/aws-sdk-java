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

package com.amazonaws.services.route53.model;

/**
 * 
 */
public enum VPCRegion {

    UsEast1("us-east-1"),
    UsWest1("us-west-1"),
    UsWest2("us-west-2"),
    EuWest1("eu-west-1"),
    EuCentral1("eu-central-1"),
    ApSoutheast1("ap-southeast-1"),
    ApSoutheast2("ap-southeast-2"),
    ApNortheast1("ap-northeast-1"),
    SaEast1("sa-east-1"),
    CnNorth1("cn-north-1");

    private String value;

    private VPCRegion(String value) {
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
     * @return VPCRegion corresponding to the value
     */
    public static VPCRegion fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("us-east-1".equals(value)) {
            return UsEast1;
        } else if ("us-west-1".equals(value)) {
            return UsWest1;
        } else if ("us-west-2".equals(value)) {
            return UsWest2;
        } else if ("eu-west-1".equals(value)) {
            return EuWest1;
        } else if ("eu-central-1".equals(value)) {
            return EuCentral1;
        } else if ("ap-southeast-1".equals(value)) {
            return ApSoutheast1;
        } else if ("ap-southeast-2".equals(value)) {
            return ApSoutheast2;
        } else if ("ap-northeast-1".equals(value)) {
            return ApNortheast1;
        } else if ("sa-east-1".equals(value)) {
            return SaEast1;
        } else if ("cn-north-1".equals(value)) {
            return CnNorth1;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}