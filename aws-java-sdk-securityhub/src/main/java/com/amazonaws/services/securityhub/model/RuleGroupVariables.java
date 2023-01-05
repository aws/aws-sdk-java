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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional settings to use in the specified rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/RuleGroupVariables" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupVariables implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of IP addresses and address ranges, in CIDR notation.
     * </p>
     */
    private RuleGroupVariablesIpSetsDetails ipSets;
    /**
     * <p>
     * A list of port ranges.
     * </p>
     */
    private RuleGroupVariablesPortSetsDetails portSets;

    /**
     * <p>
     * A list of IP addresses and address ranges, in CIDR notation.
     * </p>
     * 
     * @param ipSets
     *        A list of IP addresses and address ranges, in CIDR notation.
     */

    public void setIpSets(RuleGroupVariablesIpSetsDetails ipSets) {
        this.ipSets = ipSets;
    }

    /**
     * <p>
     * A list of IP addresses and address ranges, in CIDR notation.
     * </p>
     * 
     * @return A list of IP addresses and address ranges, in CIDR notation.
     */

    public RuleGroupVariablesIpSetsDetails getIpSets() {
        return this.ipSets;
    }

    /**
     * <p>
     * A list of IP addresses and address ranges, in CIDR notation.
     * </p>
     * 
     * @param ipSets
     *        A list of IP addresses and address ranges, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupVariables withIpSets(RuleGroupVariablesIpSetsDetails ipSets) {
        setIpSets(ipSets);
        return this;
    }

    /**
     * <p>
     * A list of port ranges.
     * </p>
     * 
     * @param portSets
     *        A list of port ranges.
     */

    public void setPortSets(RuleGroupVariablesPortSetsDetails portSets) {
        this.portSets = portSets;
    }

    /**
     * <p>
     * A list of port ranges.
     * </p>
     * 
     * @return A list of port ranges.
     */

    public RuleGroupVariablesPortSetsDetails getPortSets() {
        return this.portSets;
    }

    /**
     * <p>
     * A list of port ranges.
     * </p>
     * 
     * @param portSets
     *        A list of port ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupVariables withPortSets(RuleGroupVariablesPortSetsDetails portSets) {
        setPortSets(portSets);
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
        if (getIpSets() != null)
            sb.append("IpSets: ").append(getIpSets()).append(",");
        if (getPortSets() != null)
            sb.append("PortSets: ").append(getPortSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroupVariables == false)
            return false;
        RuleGroupVariables other = (RuleGroupVariables) obj;
        if (other.getIpSets() == null ^ this.getIpSets() == null)
            return false;
        if (other.getIpSets() != null && other.getIpSets().equals(this.getIpSets()) == false)
            return false;
        if (other.getPortSets() == null ^ this.getPortSets() == null)
            return false;
        if (other.getPortSets() != null && other.getPortSets().equals(this.getPortSets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpSets() == null) ? 0 : getIpSets().hashCode());
        hashCode = prime * hashCode + ((getPortSets() == null) ? 0 : getPortSets().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupVariables clone() {
        try {
            return (RuleGroupVariables) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.RuleGroupVariablesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
