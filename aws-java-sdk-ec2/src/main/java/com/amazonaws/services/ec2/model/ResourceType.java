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
public enum ResourceType {

    CustomerGateway("customer-gateway"),
    DhcpOptions("dhcp-options"),
    Image("image"),
    Instance("instance"),
    InternetGateway("internet-gateway"),
    NetworkAcl("network-acl"),
    NetworkInterface("network-interface"),
    ReservedInstances("reserved-instances"),
    RouteTable("route-table"),
    Snapshot("snapshot"),
    SpotInstancesRequest("spot-instances-request"),
    Subnet("subnet"),
    SecurityGroup("security-group"),
    Volume("volume"),
    Vpc("vpc"),
    VpnConnection("vpn-connection"),
    VpnGateway("vpn-gateway");

    private String value;

    private ResourceType(String value) {
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
     * @return ResourceType corresponding to the value
     */
    public static ResourceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("customer-gateway".equals(value)) {
            return CustomerGateway;
        } else if ("dhcp-options".equals(value)) {
            return DhcpOptions;
        } else if ("image".equals(value)) {
            return Image;
        } else if ("instance".equals(value)) {
            return Instance;
        } else if ("internet-gateway".equals(value)) {
            return InternetGateway;
        } else if ("network-acl".equals(value)) {
            return NetworkAcl;
        } else if ("network-interface".equals(value)) {
            return NetworkInterface;
        } else if ("reserved-instances".equals(value)) {
            return ReservedInstances;
        } else if ("route-table".equals(value)) {
            return RouteTable;
        } else if ("snapshot".equals(value)) {
            return Snapshot;
        } else if ("spot-instances-request".equals(value)) {
            return SpotInstancesRequest;
        } else if ("subnet".equals(value)) {
            return Subnet;
        } else if ("security-group".equals(value)) {
            return SecurityGroup;
        } else if ("volume".equals(value)) {
            return Volume;
        } else if ("vpc".equals(value)) {
            return Vpc;
        } else if ("vpn-connection".equals(value)) {
            return VpnConnection;
        } else if ("vpn-gateway".equals(value)) {
            return VpnGateway;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}