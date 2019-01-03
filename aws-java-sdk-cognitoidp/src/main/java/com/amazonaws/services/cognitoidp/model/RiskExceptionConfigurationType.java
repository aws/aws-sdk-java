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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The type of the configuration to override the risk decision.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/RiskExceptionConfigurationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RiskExceptionConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR notation: a
     * compact representation of an IP address and its associated routing prefix.
     * </p>
     */
    private java.util.List<String> blockedIPRangeList;
    /**
     * <p>
     * Risk detection is not performed on the IP addresses in the range list. The IP range is in CIDR notation.
     * </p>
     */
    private java.util.List<String> skippedIPRangeList;

    /**
     * <p>
     * Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR notation: a
     * compact representation of an IP address and its associated routing prefix.
     * </p>
     * 
     * @return Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR
     *         notation: a compact representation of an IP address and its associated routing prefix.
     */

    public java.util.List<String> getBlockedIPRangeList() {
        return blockedIPRangeList;
    }

    /**
     * <p>
     * Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR notation: a
     * compact representation of an IP address and its associated routing prefix.
     * </p>
     * 
     * @param blockedIPRangeList
     *        Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR
     *        notation: a compact representation of an IP address and its associated routing prefix.
     */

    public void setBlockedIPRangeList(java.util.Collection<String> blockedIPRangeList) {
        if (blockedIPRangeList == null) {
            this.blockedIPRangeList = null;
            return;
        }

        this.blockedIPRangeList = new java.util.ArrayList<String>(blockedIPRangeList);
    }

    /**
     * <p>
     * Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR notation: a
     * compact representation of an IP address and its associated routing prefix.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockedIPRangeList(java.util.Collection)} or {@link #withBlockedIPRangeList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param blockedIPRangeList
     *        Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR
     *        notation: a compact representation of an IP address and its associated routing prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RiskExceptionConfigurationType withBlockedIPRangeList(String... blockedIPRangeList) {
        if (this.blockedIPRangeList == null) {
            setBlockedIPRangeList(new java.util.ArrayList<String>(blockedIPRangeList.length));
        }
        for (String ele : blockedIPRangeList) {
            this.blockedIPRangeList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR notation: a
     * compact representation of an IP address and its associated routing prefix.
     * </p>
     * 
     * @param blockedIPRangeList
     *        Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR
     *        notation: a compact representation of an IP address and its associated routing prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RiskExceptionConfigurationType withBlockedIPRangeList(java.util.Collection<String> blockedIPRangeList) {
        setBlockedIPRangeList(blockedIPRangeList);
        return this;
    }

    /**
     * <p>
     * Risk detection is not performed on the IP addresses in the range list. The IP range is in CIDR notation.
     * </p>
     * 
     * @return Risk detection is not performed on the IP addresses in the range list. The IP range is in CIDR notation.
     */

    public java.util.List<String> getSkippedIPRangeList() {
        return skippedIPRangeList;
    }

    /**
     * <p>
     * Risk detection is not performed on the IP addresses in the range list. The IP range is in CIDR notation.
     * </p>
     * 
     * @param skippedIPRangeList
     *        Risk detection is not performed on the IP addresses in the range list. The IP range is in CIDR notation.
     */

    public void setSkippedIPRangeList(java.util.Collection<String> skippedIPRangeList) {
        if (skippedIPRangeList == null) {
            this.skippedIPRangeList = null;
            return;
        }

        this.skippedIPRangeList = new java.util.ArrayList<String>(skippedIPRangeList);
    }

    /**
     * <p>
     * Risk detection is not performed on the IP addresses in the range list. The IP range is in CIDR notation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSkippedIPRangeList(java.util.Collection)} or {@link #withSkippedIPRangeList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param skippedIPRangeList
     *        Risk detection is not performed on the IP addresses in the range list. The IP range is in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RiskExceptionConfigurationType withSkippedIPRangeList(String... skippedIPRangeList) {
        if (this.skippedIPRangeList == null) {
            setSkippedIPRangeList(new java.util.ArrayList<String>(skippedIPRangeList.length));
        }
        for (String ele : skippedIPRangeList) {
            this.skippedIPRangeList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Risk detection is not performed on the IP addresses in the range list. The IP range is in CIDR notation.
     * </p>
     * 
     * @param skippedIPRangeList
     *        Risk detection is not performed on the IP addresses in the range list. The IP range is in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RiskExceptionConfigurationType withSkippedIPRangeList(java.util.Collection<String> skippedIPRangeList) {
        setSkippedIPRangeList(skippedIPRangeList);
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
        if (getBlockedIPRangeList() != null)
            sb.append("BlockedIPRangeList: ").append(getBlockedIPRangeList()).append(",");
        if (getSkippedIPRangeList() != null)
            sb.append("SkippedIPRangeList: ").append(getSkippedIPRangeList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RiskExceptionConfigurationType == false)
            return false;
        RiskExceptionConfigurationType other = (RiskExceptionConfigurationType) obj;
        if (other.getBlockedIPRangeList() == null ^ this.getBlockedIPRangeList() == null)
            return false;
        if (other.getBlockedIPRangeList() != null && other.getBlockedIPRangeList().equals(this.getBlockedIPRangeList()) == false)
            return false;
        if (other.getSkippedIPRangeList() == null ^ this.getSkippedIPRangeList() == null)
            return false;
        if (other.getSkippedIPRangeList() != null && other.getSkippedIPRangeList().equals(this.getSkippedIPRangeList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockedIPRangeList() == null) ? 0 : getBlockedIPRangeList().hashCode());
        hashCode = prime * hashCode + ((getSkippedIPRangeList() == null) ? 0 : getSkippedIPRangeList().hashCode());
        return hashCode;
    }

    @Override
    public RiskExceptionConfigurationType clone() {
        try {
            return (RiskExceptionConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.RiskExceptionConfigurationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
