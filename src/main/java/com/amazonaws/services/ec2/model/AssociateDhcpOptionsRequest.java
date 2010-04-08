/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * 
 * </p>
 */
public class AssociateDhcpOptionsRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the DHCP options to associate with the VPC. Specify
     * "default" to associate the default DHCP options with the VPC.
     */
    private String dhcpOptionsId;

    /**
     * The ID of the VPC to associate the DHCP options with.
     */
    private String vpcId;

    /**
     * The ID of the DHCP options to associate with the VPC. Specify
     * "default" to associate the default DHCP options with the VPC.
     *
     * @return The ID of the DHCP options to associate with the VPC. Specify
     *         "default" to associate the default DHCP options with the VPC.
     */
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }
    
    /**
     * The ID of the DHCP options to associate with the VPC. Specify
     * "default" to associate the default DHCP options with the VPC.
     *
     * @param dhcpOptionsId The ID of the DHCP options to associate with the VPC. Specify
     *         "default" to associate the default DHCP options with the VPC.
     */
    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }
    
    /**
     * The ID of the DHCP options to associate with the VPC. Specify
     * "default" to associate the default DHCP options with the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptionsId The ID of the DHCP options to associate with the VPC. Specify
     *         "default" to associate the default DHCP options with the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AssociateDhcpOptionsRequest withDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
        return this;
    }
    
    
    /**
     * The ID of the VPC to associate the DHCP options with.
     *
     * @return The ID of the VPC to associate the DHCP options with.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC to associate the DHCP options with.
     *
     * @param vpcId The ID of the VPC to associate the DHCP options with.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC to associate the DHCP options with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC to associate the DHCP options with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AssociateDhcpOptionsRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("DhcpOptionsId: " + dhcpOptionsId + ", ");
        sb.append("VpcId: " + vpcId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    