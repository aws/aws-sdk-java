/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateCustomerGatewayRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateCustomerGateway.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomerGatewayRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateCustomerGatewayRequest> {

    /**
     * <p>
     * For devices that support BGP, the customer gateway's BGP ASN.
     * </p>
     * <p>
     * Default: 65000
     * </p>
     */
    private Integer bgpAsn;
    /**
     * <p>
     * The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * </p>
     */
    private String type;

    /**
     * Default constructor for CreateCustomerGatewayRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreateCustomerGatewayRequest() {
    }

    /**
     * Constructs a new CreateCustomerGatewayRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param type
     *        The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * @param publicIp
     *        The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     * @param bgpAsn
     *        For devices that support BGP, the customer gateway's BGP ASN.</p>
     *        <p>
     *        Default: 65000
     */
    public CreateCustomerGatewayRequest(String type, String publicIp, Integer bgpAsn) {
        setType(type);
        setPublicIp(publicIp);
        setBgpAsn(bgpAsn);
    }

    /**
     * Constructs a new CreateCustomerGatewayRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param type
     *        The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * @param publicIp
     *        The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     * @param bgpAsn
     *        For devices that support BGP, the customer gateway's BGP ASN.</p>
     *        <p>
     *        Default: 65000
     */
    public CreateCustomerGatewayRequest(GatewayType type, String publicIp, Integer bgpAsn) {
        setType(type.toString());
        setPublicIp(publicIp);
        setBgpAsn(bgpAsn);
    }

    /**
     * <p>
     * For devices that support BGP, the customer gateway's BGP ASN.
     * </p>
     * <p>
     * Default: 65000
     * </p>
     * 
     * @param bgpAsn
     *        For devices that support BGP, the customer gateway's BGP ASN.</p>
     *        <p>
     *        Default: 65000
     */

    public void setBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    /**
     * <p>
     * For devices that support BGP, the customer gateway's BGP ASN.
     * </p>
     * <p>
     * Default: 65000
     * </p>
     * 
     * @return For devices that support BGP, the customer gateway's BGP ASN.</p>
     *         <p>
     *         Default: 65000
     */

    public Integer getBgpAsn() {
        return this.bgpAsn;
    }

    /**
     * <p>
     * For devices that support BGP, the customer gateway's BGP ASN.
     * </p>
     * <p>
     * Default: 65000
     * </p>
     * 
     * @param bgpAsn
     *        For devices that support BGP, the customer gateway's BGP ASN.</p>
     *        <p>
     *        Default: 65000
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomerGatewayRequest withBgpAsn(Integer bgpAsn) {
        setBgpAsn(bgpAsn);
        return this;
    }

    /**
     * <p>
     * The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     * </p>
     * 
     * @param publicIp
     *        The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     * </p>
     * 
     * @return The Internet-routable IP address for the customer gateway's outside interface. The address must be
     *         static.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     * </p>
     * 
     * @param publicIp
     *        The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomerGatewayRequest withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * </p>
     * 
     * @param type
     *        The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * @see GatewayType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * </p>
     * 
     * @return The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * @see GatewayType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * </p>
     * 
     * @param type
     *        The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public CreateCustomerGatewayRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * </p>
     * 
     * @param type
     *        The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * @see GatewayType
     */

    public void setType(GatewayType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * </p>
     * 
     * @param type
     *        The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public CreateCustomerGatewayRequest withType(GatewayType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateCustomerGatewayRequest> getDryRunRequest() {
        Request<CreateCustomerGatewayRequest> request = new CreateCustomerGatewayRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBgpAsn() != null)
            sb.append("BgpAsn: ").append(getBgpAsn()).append(",");
        if (getPublicIp() != null)
            sb.append("PublicIp: ").append(getPublicIp()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomerGatewayRequest == false)
            return false;
        CreateCustomerGatewayRequest other = (CreateCustomerGatewayRequest) obj;
        if (other.getBgpAsn() == null ^ this.getBgpAsn() == null)
            return false;
        if (other.getBgpAsn() != null && other.getBgpAsn().equals(this.getBgpAsn()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBgpAsn() == null) ? 0 : getBgpAsn().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomerGatewayRequest clone() {
        return (CreateCustomerGatewayRequest) super.clone();
    }
}
