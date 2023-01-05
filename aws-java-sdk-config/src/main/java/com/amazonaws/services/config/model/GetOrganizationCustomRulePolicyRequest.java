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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetOrganizationCustomRulePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOrganizationCustomRulePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your organization Config Custom Policy rule.
     * </p>
     */
    private String organizationConfigRuleName;

    /**
     * <p>
     * The name of your organization Config Custom Policy rule.
     * </p>
     * 
     * @param organizationConfigRuleName
     *        The name of your organization Config Custom Policy rule.
     */

    public void setOrganizationConfigRuleName(String organizationConfigRuleName) {
        this.organizationConfigRuleName = organizationConfigRuleName;
    }

    /**
     * <p>
     * The name of your organization Config Custom Policy rule.
     * </p>
     * 
     * @return The name of your organization Config Custom Policy rule.
     */

    public String getOrganizationConfigRuleName() {
        return this.organizationConfigRuleName;
    }

    /**
     * <p>
     * The name of your organization Config Custom Policy rule.
     * </p>
     * 
     * @param organizationConfigRuleName
     *        The name of your organization Config Custom Policy rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationCustomRulePolicyRequest withOrganizationConfigRuleName(String organizationConfigRuleName) {
        setOrganizationConfigRuleName(organizationConfigRuleName);
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
        if (getOrganizationConfigRuleName() != null)
            sb.append("OrganizationConfigRuleName: ").append(getOrganizationConfigRuleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOrganizationCustomRulePolicyRequest == false)
            return false;
        GetOrganizationCustomRulePolicyRequest other = (GetOrganizationCustomRulePolicyRequest) obj;
        if (other.getOrganizationConfigRuleName() == null ^ this.getOrganizationConfigRuleName() == null)
            return false;
        if (other.getOrganizationConfigRuleName() != null && other.getOrganizationConfigRuleName().equals(this.getOrganizationConfigRuleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationConfigRuleName() == null) ? 0 : getOrganizationConfigRuleName().hashCode());
        return hashCode;
    }

    @Override
    public GetOrganizationCustomRulePolicyRequest clone() {
        return (GetOrganizationCustomRulePolicyRequest) super.clone();
    }

}
