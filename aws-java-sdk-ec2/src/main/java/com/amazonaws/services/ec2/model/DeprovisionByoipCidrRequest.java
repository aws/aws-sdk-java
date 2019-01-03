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
import com.amazonaws.services.ec2.model.transform.DeprovisionByoipCidrRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeprovisionByoipCidrRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeprovisionByoipCidrRequest> {

    /**
     * <p>
     * The public IPv4 address range, in CIDR notation. The prefix must be the same prefix that you specified when you
     * provisioned the address range.
     * </p>
     */
    private String cidr;

    /**
     * <p>
     * The public IPv4 address range, in CIDR notation. The prefix must be the same prefix that you specified when you
     * provisioned the address range.
     * </p>
     * 
     * @param cidr
     *        The public IPv4 address range, in CIDR notation. The prefix must be the same prefix that you specified
     *        when you provisioned the address range.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The public IPv4 address range, in CIDR notation. The prefix must be the same prefix that you specified when you
     * provisioned the address range.
     * </p>
     * 
     * @return The public IPv4 address range, in CIDR notation. The prefix must be the same prefix that you specified
     *         when you provisioned the address range.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The public IPv4 address range, in CIDR notation. The prefix must be the same prefix that you specified when you
     * provisioned the address range.
     * </p>
     * 
     * @param cidr
     *        The public IPv4 address range, in CIDR notation. The prefix must be the same prefix that you specified
     *        when you provisioned the address range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprovisionByoipCidrRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeprovisionByoipCidrRequest> getDryRunRequest() {
        Request<DeprovisionByoipCidrRequest> request = new DeprovisionByoipCidrRequestMarshaller().marshall(this);
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
            sb.append("Cidr: ").append(getCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeprovisionByoipCidrRequest == false)
            return false;
        DeprovisionByoipCidrRequest other = (DeprovisionByoipCidrRequest) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        return hashCode;
    }

    @Override
    public DeprovisionByoipCidrRequest clone() {
        return (DeprovisionByoipCidrRequest) super.clone();
    }
}
