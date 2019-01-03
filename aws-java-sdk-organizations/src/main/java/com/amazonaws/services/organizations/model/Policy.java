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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains rules to be applied to the affected accounts. Policies can be attached directly to accounts, or to roots and
 * OUs to affect all accounts in those hierarchies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/Policy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Policy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure that contains additional details about the policy.
     * </p>
     */
    private PolicySummary policySummary;
    /**
     * <p>
     * The text content of the policy.
     * </p>
     */
    private String content;

    /**
     * <p>
     * A structure that contains additional details about the policy.
     * </p>
     * 
     * @param policySummary
     *        A structure that contains additional details about the policy.
     */

    public void setPolicySummary(PolicySummary policySummary) {
        this.policySummary = policySummary;
    }

    /**
     * <p>
     * A structure that contains additional details about the policy.
     * </p>
     * 
     * @return A structure that contains additional details about the policy.
     */

    public PolicySummary getPolicySummary() {
        return this.policySummary;
    }

    /**
     * <p>
     * A structure that contains additional details about the policy.
     * </p>
     * 
     * @param policySummary
     *        A structure that contains additional details about the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withPolicySummary(PolicySummary policySummary) {
        setPolicySummary(policySummary);
        return this;
    }

    /**
     * <p>
     * The text content of the policy.
     * </p>
     * 
     * @param content
     *        The text content of the policy.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The text content of the policy.
     * </p>
     * 
     * @return The text content of the policy.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The text content of the policy.
     * </p>
     * 
     * @param content
     *        The text content of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withContent(String content) {
        setContent(content);
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
        if (getPolicySummary() != null)
            sb.append("PolicySummary: ").append(getPolicySummary()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Policy == false)
            return false;
        Policy other = (Policy) obj;
        if (other.getPolicySummary() == null ^ this.getPolicySummary() == null)
            return false;
        if (other.getPolicySummary() != null && other.getPolicySummary().equals(this.getPolicySummary()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicySummary() == null) ? 0 : getPolicySummary().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public Policy clone() {
        try {
            return (Policy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.PolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
