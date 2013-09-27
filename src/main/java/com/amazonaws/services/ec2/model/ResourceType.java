/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Resource Type
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
     *            real value
     * @return ResourceType corresponding to the value
     */
    public static ResourceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("customer-gateway".equals(value)) {
            return ResourceType.CustomerGateway;
        } else if ("dhcp-options".equals(value)) {
            return ResourceType.DhcpOptions;
        } else if ("image".equals(value)) {
            return ResourceType.Image;
        } else if ("instance".equals(value)) {
            return ResourceType.Instance;
        } else if ("internet-gateway".equals(value)) {
            return ResourceType.InternetGateway;
        } else if ("network-acl".equals(value)) {
            return ResourceType.NetworkAcl;
        } else if ("network-interface".equals(value)) {
            return ResourceType.NetworkInterface;
        } else if ("reserved-instances".equals(value)) {
            return ResourceType.ReservedInstances;
        } else if ("route-table".equals(value)) {
            return ResourceType.RouteTable;
        } else if ("snapshot".equals(value)) {
            return ResourceType.Snapshot;
        } else if ("spot-instances-request".equals(value)) {
            return ResourceType.SpotInstancesRequest;
        } else if ("subnet".equals(value)) {
            return ResourceType.Subnet;
        } else if ("security-group".equals(value)) {
            return ResourceType.SecurityGroup;
        } else if ("volume".equals(value)) {
            return ResourceType.Volume;
        } else if ("vpc".equals(value)) {
            return ResourceType.Vpc;
        } else if ("vpn-connection".equals(value)) {
            return ResourceType.VpnConnection;
        } else if ("vpn-gateway".equals(value)) {
            return ResourceType.VpnGateway;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    