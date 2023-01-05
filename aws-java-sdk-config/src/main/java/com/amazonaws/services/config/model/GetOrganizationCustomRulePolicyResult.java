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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetOrganizationCustomRulePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOrganizationCustomRulePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The policy definition containing the logic for your organization Config Custom Policy rule.
     * </p>
     */
    private String policyText;

    /**
     * <p>
     * The policy definition containing the logic for your organization Config Custom Policy rule.
     * </p>
     * 
     * @param policyText
     *        The policy definition containing the logic for your organization Config Custom Policy rule.
     */

    public void setPolicyText(String policyText) {
        this.policyText = policyText;
    }

    /**
     * <p>
     * The policy definition containing the logic for your organization Config Custom Policy rule.
     * </p>
     * 
     * @return The policy definition containing the logic for your organization Config Custom Policy rule.
     */

    public String getPolicyText() {
        return this.policyText;
    }

    /**
     * <p>
     * The policy definition containing the logic for your organization Config Custom Policy rule.
     * </p>
     * 
     * @param policyText
     *        The policy definition containing the logic for your organization Config Custom Policy rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationCustomRulePolicyResult withPolicyText(String policyText) {
        setPolicyText(policyText);
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
        if (getPolicyText() != null)
            sb.append("PolicyText: ").append(getPolicyText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOrganizationCustomRulePolicyResult == false)
            return false;
        GetOrganizationCustomRulePolicyResult other = (GetOrganizationCustomRulePolicyResult) obj;
        if (other.getPolicyText() == null ^ this.getPolicyText() == null)
            return false;
        if (other.getPolicyText() != null && other.getPolicyText().equals(this.getPolicyText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyText() == null) ? 0 : getPolicyText().hashCode());
        return hashCode;
    }

    @Override
    public GetOrganizationCustomRulePolicyResult clone() {
        try {
            return (GetOrganizationCustomRulePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
