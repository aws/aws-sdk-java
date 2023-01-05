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

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the DNS options for an endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DnsOptionsSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnsOptionsSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The DNS records created for the endpoint.
     * </p>
     */
    private String dnsRecordIpType;

    /**
     * <p>
     * The DNS records created for the endpoint.
     * </p>
     * 
     * @param dnsRecordIpType
     *        The DNS records created for the endpoint.
     * @see DnsRecordIpType
     */

    public void setDnsRecordIpType(String dnsRecordIpType) {
        this.dnsRecordIpType = dnsRecordIpType;
    }

    /**
     * <p>
     * The DNS records created for the endpoint.
     * </p>
     * 
     * @return The DNS records created for the endpoint.
     * @see DnsRecordIpType
     */

    public String getDnsRecordIpType() {
        return this.dnsRecordIpType;
    }

    /**
     * <p>
     * The DNS records created for the endpoint.
     * </p>
     * 
     * @param dnsRecordIpType
     *        The DNS records created for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsRecordIpType
     */

    public DnsOptionsSpecification withDnsRecordIpType(String dnsRecordIpType) {
        setDnsRecordIpType(dnsRecordIpType);
        return this;
    }

    /**
     * <p>
     * The DNS records created for the endpoint.
     * </p>
     * 
     * @param dnsRecordIpType
     *        The DNS records created for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsRecordIpType
     */

    public DnsOptionsSpecification withDnsRecordIpType(DnsRecordIpType dnsRecordIpType) {
        this.dnsRecordIpType = dnsRecordIpType.toString();
        return this;
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
        if (getDnsRecordIpType() != null)
            sb.append("DnsRecordIpType: ").append(getDnsRecordIpType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsOptionsSpecification == false)
            return false;
        DnsOptionsSpecification other = (DnsOptionsSpecification) obj;
        if (other.getDnsRecordIpType() == null ^ this.getDnsRecordIpType() == null)
            return false;
        if (other.getDnsRecordIpType() != null && other.getDnsRecordIpType().equals(this.getDnsRecordIpType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDnsRecordIpType() == null) ? 0 : getDnsRecordIpType().hashCode());
        return hashCode;
    }

    @Override
    public DnsOptionsSpecification clone() {
        try {
            return (DnsOptionsSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
