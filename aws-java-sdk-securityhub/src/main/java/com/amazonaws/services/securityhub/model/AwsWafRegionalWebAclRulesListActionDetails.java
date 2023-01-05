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
 * The action that WAF takes when a web request matches all conditions in the rule, such as allow, block, or count the
 * request.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafRegionalWebAclRulesListActionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafRegionalWebAclRulesListActionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * For actions that are associated with a rule, the action that WAF takes when a web request matches all conditions
     * in a rule.
     * </p>
     */
    private String type;

    /**
     * <p>
     * For actions that are associated with a rule, the action that WAF takes when a web request matches all conditions
     * in a rule.
     * </p>
     * 
     * @param type
     *        For actions that are associated with a rule, the action that WAF takes when a web request matches all
     *        conditions in a rule.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * For actions that are associated with a rule, the action that WAF takes when a web request matches all conditions
     * in a rule.
     * </p>
     * 
     * @return For actions that are associated with a rule, the action that WAF takes when a web request matches all
     *         conditions in a rule.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * For actions that are associated with a rule, the action that WAF takes when a web request matches all conditions
     * in a rule.
     * </p>
     * 
     * @param type
     *        For actions that are associated with a rule, the action that WAF takes when a web request matches all
     *        conditions in a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalWebAclRulesListActionDetails withType(String type) {
        setType(type);
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

        if (obj instanceof AwsWafRegionalWebAclRulesListActionDetails == false)
            return false;
        AwsWafRegionalWebAclRulesListActionDetails other = (AwsWafRegionalWebAclRulesListActionDetails) obj;
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafRegionalWebAclRulesListActionDetails clone() {
        try {
            return (AwsWafRegionalWebAclRulesListActionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafRegionalWebAclRulesListActionDetailsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
