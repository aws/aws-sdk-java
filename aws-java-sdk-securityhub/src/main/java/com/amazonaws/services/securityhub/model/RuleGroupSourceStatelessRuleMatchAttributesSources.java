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
 * A source IP addresses and address range to inspect for.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/RuleGroupSourceStatelessRuleMatchAttributesSources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupSourceStatelessRuleMatchAttributesSources implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An IP address or a block of IP addresses.
     * </p>
     */
    private String addressDefinition;

    /**
     * <p>
     * An IP address or a block of IP addresses.
     * </p>
     * 
     * @param addressDefinition
     *        An IP address or a block of IP addresses.
     */

    public void setAddressDefinition(String addressDefinition) {
        this.addressDefinition = addressDefinition;
    }

    /**
     * <p>
     * An IP address or a block of IP addresses.
     * </p>
     * 
     * @return An IP address or a block of IP addresses.
     */

    public String getAddressDefinition() {
        return this.addressDefinition;
    }

    /**
     * <p>
     * An IP address or a block of IP addresses.
     * </p>
     * 
     * @param addressDefinition
     *        An IP address or a block of IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributesSources withAddressDefinition(String addressDefinition) {
        setAddressDefinition(addressDefinition);
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
        if (getAddressDefinition() != null)
            sb.append("AddressDefinition: ").append(getAddressDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroupSourceStatelessRuleMatchAttributesSources == false)
            return false;
        RuleGroupSourceStatelessRuleMatchAttributesSources other = (RuleGroupSourceStatelessRuleMatchAttributesSources) obj;
        if (other.getAddressDefinition() == null ^ this.getAddressDefinition() == null)
            return false;
        if (other.getAddressDefinition() != null && other.getAddressDefinition().equals(this.getAddressDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddressDefinition() == null) ? 0 : getAddressDefinition().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupSourceStatelessRuleMatchAttributesSources clone() {
        try {
            return (RuleGroupSourceStatelessRuleMatchAttributesSources) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.RuleGroupSourceStatelessRuleMatchAttributesSourcesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
