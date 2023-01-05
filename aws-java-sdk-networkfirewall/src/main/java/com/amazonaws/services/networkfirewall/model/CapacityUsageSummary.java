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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The capacity usage summary of the resources used by the <a>ReferenceSets</a> in a firewall.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/CapacityUsageSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityUsageSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the capacity usage of the CIDR blocks used by the IP set references in a firewall.
     * </p>
     */
    private CIDRSummary cIDRs;

    /**
     * <p>
     * Describes the capacity usage of the CIDR blocks used by the IP set references in a firewall.
     * </p>
     * 
     * @param cIDRs
     *        Describes the capacity usage of the CIDR blocks used by the IP set references in a firewall.
     */

    public void setCIDRs(CIDRSummary cIDRs) {
        this.cIDRs = cIDRs;
    }

    /**
     * <p>
     * Describes the capacity usage of the CIDR blocks used by the IP set references in a firewall.
     * </p>
     * 
     * @return Describes the capacity usage of the CIDR blocks used by the IP set references in a firewall.
     */

    public CIDRSummary getCIDRs() {
        return this.cIDRs;
    }

    /**
     * <p>
     * Describes the capacity usage of the CIDR blocks used by the IP set references in a firewall.
     * </p>
     * 
     * @param cIDRs
     *        Describes the capacity usage of the CIDR blocks used by the IP set references in a firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityUsageSummary withCIDRs(CIDRSummary cIDRs) {
        setCIDRs(cIDRs);
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
        if (getCIDRs() != null)
            sb.append("CIDRs: ").append(getCIDRs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityUsageSummary == false)
            return false;
        CapacityUsageSummary other = (CapacityUsageSummary) obj;
        if (other.getCIDRs() == null ^ this.getCIDRs() == null)
            return false;
        if (other.getCIDRs() != null && other.getCIDRs().equals(this.getCIDRs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCIDRs() == null) ? 0 : getCIDRs().hashCode());
        return hashCode;
    }

    @Override
    public CapacityUsageSummary clone() {
        try {
            return (CapacityUsageSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.CapacityUsageSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
