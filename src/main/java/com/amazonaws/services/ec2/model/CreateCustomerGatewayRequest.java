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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateCustomerGatewayRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createCustomerGateway(CreateCustomerGatewayRequest) CreateCustomerGateway operation}.
 * <p>
 * Provides information to AWS about your customer gateway device. The customer gateway is the appliance at your end of the VPN connection (compared to
 * the VPN gateway, which is the device at the AWS side of the VPN connection). You can have a single active customer gateway per AWS account (active
 * means that you've created a VPN connection to use with the customer gateway). AWS might delete any customer gateway that you create with this
 * operation if you leave it inactive for an extended period of time.
 * </p>
 * <p>
 * You must provide the Internet-routable IP address of the customer gateway's external interface. The IP address must be static.
 * </p>
 * <p>
 * You must also provide the device's Border Gateway Protocol (BGP) Autonomous System Number (ASN). You can use an existing ASN assigned to your
 * network. If you don't have an ASN already, you can use a private ASN (in the 64512 - 65534 range). For more information about ASNs, go to <a
 * href="http://en.wikipedia.org/wiki/Autonomous_system_%28Internet%29"> http://en.wikipedia.org/wiki/Autonomous_system_%28Internet%29 </a> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createCustomerGateway(CreateCustomerGatewayRequest)
 */
public class CreateCustomerGatewayRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateCustomerGatewayRequest> {

    /**
     * The type of VPN connection this customer gateway supports.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     */
    private String type;

    /**
     * The Internet-routable IP address for the customer gateway's outside
     * interface. The address must be static
     */
    private String publicIp;

    /**
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     * Number (ASN).
     */
    private Integer bgpAsn;

    /**
     * Default constructor for a new CreateCustomerGatewayRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateCustomerGatewayRequest() {}
    
    /**
     * Constructs a new CreateCustomerGatewayRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param type The type of VPN connection this customer gateway supports.
     * @param publicIp The Internet-routable IP address for the customer
     * gateway's outside interface. The address must be static
     * @param bgpAsn The customer gateway's Border Gateway Protocol (BGP)
     * Autonomous System Number (ASN).
     */
    public CreateCustomerGatewayRequest(String type, String publicIp, Integer bgpAsn) {
        setType(type);
        setPublicIp(publicIp);
        setBgpAsn(bgpAsn);
    }

    /**
     * Constructs a new CreateCustomerGatewayRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param type The type of VPN connection this customer gateway supports.
     * @param publicIp The Internet-routable IP address for the customer
     * gateway's outside interface. The address must be static
     * @param bgpAsn The customer gateway's Border Gateway Protocol (BGP)
     * Autonomous System Number (ASN).
     */
    public CreateCustomerGatewayRequest(GatewayType type, String publicIp, Integer bgpAsn) {
        this.type = type.toString();
        this.publicIp = publicIp;
        this.bgpAsn = bgpAsn;
    }

    /**
     * The type of VPN connection this customer gateway supports.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @return The type of VPN connection this customer gateway supports.
     *
     * @see GatewayType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of VPN connection this customer gateway supports.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection this customer gateway supports.
     *
     * @see GatewayType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of VPN connection this customer gateway supports.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection this customer gateway supports.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see GatewayType
     */
    public CreateCustomerGatewayRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of VPN connection this customer gateway supports.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection this customer gateway supports.
     *
     * @see GatewayType
     */
    public void setType(GatewayType type) {
        this.type = type.toString();
    }
    
    /**
     * The type of VPN connection this customer gateway supports.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection this customer gateway supports.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see GatewayType
     */
    public CreateCustomerGatewayRequest withType(GatewayType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * The Internet-routable IP address for the customer gateway's outside
     * interface. The address must be static
     *
     * @return The Internet-routable IP address for the customer gateway's outside
     *         interface. The address must be static
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * The Internet-routable IP address for the customer gateway's outside
     * interface. The address must be static
     *
     * @param publicIp The Internet-routable IP address for the customer gateway's outside
     *         interface. The address must be static
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * The Internet-routable IP address for the customer gateway's outside
     * interface. The address must be static
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp The Internet-routable IP address for the customer gateway's outside
     *         interface. The address must be static
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
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateCustomerGatewayRequest> getDryRunRequest() {
        Request<CreateCustomerGatewayRequest> request = new CreateCustomerGatewayRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getPublicIp() != null) sb.append("PublicIp: " + getPublicIp() + ",");
        if (getBgpAsn() != null) sb.append("BgpAsn: " + getBgpAsn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode()); 
        hashCode = prime * hashCode + ((getBgpAsn() == null) ? 0 : getBgpAsn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateCustomerGatewayRequest == false) return false;
        CreateCustomerGatewayRequest other = (CreateCustomerGatewayRequest)obj;
        
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getPublicIp() == null ^ this.getPublicIp() == null) return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false) return false; 
        if (other.getBgpAsn() == null ^ this.getBgpAsn() == null) return false;
        if (other.getBgpAsn() != null && other.getBgpAsn().equals(this.getBgpAsn()) == false) return false; 
        return true;
    }
    
}
    