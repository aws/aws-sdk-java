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
package com.amazonaws.services.ec2.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum NetworkInterfaceType {

    Interface("interface"),
    NatGateway("natGateway"),
    Efa("efa"),
    Trunk("trunk"),
    Load_balancer("load_balancer"),
    Network_load_balancer("network_load_balancer"),
    Vpc_endpoint("vpc_endpoint"),
    Branch("branch"),
    Transit_gateway("transit_gateway"),
    Lambda("lambda"),
    Quicksight("quicksight"),
    Global_accelerator_managed("global_accelerator_managed"),
    Api_gateway_managed("api_gateway_managed"),
    Gateway_load_balancer("gateway_load_balancer"),
    Gateway_load_balancer_endpoint("gateway_load_balancer_endpoint"),
    Iot_rules_managed("iot_rules_managed"),
    Aws_codestar_connections_managed("aws_codestar_connections_managed");

    private String value;

    private NetworkInterfaceType(String value) {
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
     * @return NetworkInterfaceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static NetworkInterfaceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (NetworkInterfaceType enumEntry : NetworkInterfaceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
