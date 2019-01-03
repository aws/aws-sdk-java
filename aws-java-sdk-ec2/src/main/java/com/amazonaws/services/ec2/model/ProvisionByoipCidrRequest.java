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
import com.amazonaws.services.ec2.model.transform.ProvisionByoipCidrRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionByoipCidrRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ProvisionByoipCidrRequest> {

    /**
     * <p>
     * The public IPv4 address range, in CIDR notation. The most specific prefix that you can specify is /24. The
     * address range cannot overlap with another address range that you've brought to this or another region.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using
     * BYOIP.
     * </p>
     */
    private CidrAuthorizationContext cidrAuthorizationContext;
    /**
     * <p>
     * A description for the address range and the address pool.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The public IPv4 address range, in CIDR notation. The most specific prefix that you can specify is /24. The
     * address range cannot overlap with another address range that you've brought to this or another region.
     * </p>
     * 
     * @param cidr
     *        The public IPv4 address range, in CIDR notation. The most specific prefix that you can specify is /24. The
     *        address range cannot overlap with another address range that you've brought to this or another region.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The public IPv4 address range, in CIDR notation. The most specific prefix that you can specify is /24. The
     * address range cannot overlap with another address range that you've brought to this or another region.
     * </p>
     * 
     * @return The public IPv4 address range, in CIDR notation. The most specific prefix that you can specify is /24.
     *         The address range cannot overlap with another address range that you've brought to this or another
     *         region.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The public IPv4 address range, in CIDR notation. The most specific prefix that you can specify is /24. The
     * address range cannot overlap with another address range that you've brought to this or another region.
     * </p>
     * 
     * @param cidr
     *        The public IPv4 address range, in CIDR notation. The most specific prefix that you can specify is /24. The
     *        address range cannot overlap with another address range that you've brought to this or another region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionByoipCidrRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using
     * BYOIP.
     * </p>
     * 
     * @param cidrAuthorizationContext
     *        A signed document that proves that you are authorized to bring the specified IP address range to Amazon
     *        using BYOIP.
     */

    public void setCidrAuthorizationContext(CidrAuthorizationContext cidrAuthorizationContext) {
        this.cidrAuthorizationContext = cidrAuthorizationContext;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using
     * BYOIP.
     * </p>
     * 
     * @return A signed document that proves that you are authorized to bring the specified IP address range to Amazon
     *         using BYOIP.
     */

    public CidrAuthorizationContext getCidrAuthorizationContext() {
        return this.cidrAuthorizationContext;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using
     * BYOIP.
     * </p>
     * 
     * @param cidrAuthorizationContext
     *        A signed document that proves that you are authorized to bring the specified IP address range to Amazon
     *        using BYOIP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionByoipCidrRequest withCidrAuthorizationContext(CidrAuthorizationContext cidrAuthorizationContext) {
        setCidrAuthorizationContext(cidrAuthorizationContext);
        return this;
    }

    /**
     * <p>
     * A description for the address range and the address pool.
     * </p>
     * 
     * @param description
     *        A description for the address range and the address pool.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the address range and the address pool.
     * </p>
     * 
     * @return A description for the address range and the address pool.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the address range and the address pool.
     * </p>
     * 
     * @param description
     *        A description for the address range and the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionByoipCidrRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ProvisionByoipCidrRequest> getDryRunRequest() {
        Request<ProvisionByoipCidrRequest> request = new ProvisionByoipCidrRequestMarshaller().marshall(this);
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
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getCidrAuthorizationContext() != null)
            sb.append("CidrAuthorizationContext: ").append(getCidrAuthorizationContext()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionByoipCidrRequest == false)
            return false;
        ProvisionByoipCidrRequest other = (ProvisionByoipCidrRequest) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getCidrAuthorizationContext() == null ^ this.getCidrAuthorizationContext() == null)
            return false;
        if (other.getCidrAuthorizationContext() != null && other.getCidrAuthorizationContext().equals(this.getCidrAuthorizationContext()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getCidrAuthorizationContext() == null) ? 0 : getCidrAuthorizationContext().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionByoipCidrRequest clone() {
        return (ProvisionByoipCidrRequest) super.clone();
    }
}
