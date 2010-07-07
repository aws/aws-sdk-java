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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createCustomerGateway(CreateCustomerGatewayRequest) CreateCustomerGateway operation}.
 * <p>
 * Provides information to AWS about your customer gateway device. The
 * customer gateway is the appliance at your end of the VPN connection
 * (compared to the VPN gateway, which is the device at the AWS side of
 * the VPN connection). You can have a single active customer gateway per
 * AWS account (active means that you've created a VPN connection to use
 * with the customer gateway). AWS might delete any customer gateway that
 * you create with this operation if you leave it inactive for an
 * extended period of time.
 * </p>
 * <p>
 * You must provide the Internet-routable IP address of the customer
 * gateway's external interface. The IP address must be static.
 * </p>
 * <p>
 * You must also provide the device's Border Gateway Protocol (BGP)
 * Autonomous System Number (ASN). You can use an existing ASN assigned
 * to your network. If you don't have an ASN already, you can use a
 * private ASN (in the 64512 - 65534 range). For more information about
 * ASNs, go to <a
 * href="http://en.wikipedia.org/wiki/Autonomous_system_%28Internet%29.">
 * http://en.wikipedia.org/wiki/Autonomous_system_%28Internet%29 </a> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createCustomerGateway(CreateCustomerGatewayRequest)
 */
public class CreateCustomerGatewayRequest extends AmazonWebServiceRequest {

    /**
     * The type of VPN connection this customer gateway supports.
     */
    private String type;

    /**
     * 
     */
    private String publicIp;

    /**
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     * Number (ASN).
     */
    private Integer bgpAsn;

    /**
     * The type of VPN connection this customer gateway supports.
     *
     * @return The type of VPN connection this customer gateway supports.
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of VPN connection this customer gateway supports.
     *
     * @param type The type of VPN connection this customer gateway supports.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of VPN connection this customer gateway supports.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The type of VPN connection this customer gateway supports.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCustomerGatewayRequest withType(String type) {
        this.type = type;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * 
     *
     * @param publicIp 
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCustomerGatewayRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    
    
    /**
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     * Number (ASN).
     *
     * @return The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     *         Number (ASN).
     */
    public Integer getBgpAsn() {
        return bgpAsn;
    }
    
    /**
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     * Number (ASN).
     *
     * @param bgpAsn The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     *         Number (ASN).
     */
    public void setBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
    }
    
    /**
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     * Number (ASN).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bgpAsn The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     *         Number (ASN).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCustomerGatewayRequest withBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("Type: " + type + ", ");
        sb.append("PublicIp: " + publicIp + ", ");
        sb.append("BgpAsn: " + bgpAsn + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    