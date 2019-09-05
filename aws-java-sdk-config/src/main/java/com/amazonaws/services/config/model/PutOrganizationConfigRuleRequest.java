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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutOrganizationConfigRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutOrganizationConfigRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name that you assign to an organization config rule.
     * </p>
     */
    private String organizationConfigRuleName;
    /**
     * <p>
     * An <code>OrganizationManagedRuleMetadata</code> object.
     * </p>
     */
    private OrganizationManagedRuleMetadata organizationManagedRuleMetadata;
    /**
     * <p>
     * An <code>OrganizationCustomRuleMetadata</code> object.
     * </p>
     */
    private OrganizationCustomRuleMetadata organizationCustomRuleMetadata;
    /**
     * <p>
     * A comma-separated list of accounts that you want to exclude from an organization config rule.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> excludedAccounts;

    /**
     * <p>
     * The name that you assign to an organization config rule.
     * </p>
     * 
     * @param organizationConfigRuleName
     *        The name that you assign to an organization config rule.
     */

    public void setOrganizationConfigRuleName(String organizationConfigRuleName) {
        this.organizationConfigRuleName = organizationConfigRuleName;
    }

    /**
     * <p>
     * The name that you assign to an organization config rule.
     * </p>
     * 
     * @return The name that you assign to an organization config rule.
     */

    public String getOrganizationConfigRuleName() {
        return this.organizationConfigRuleName;
    }

    /**
     * <p>
     * The name that you assign to an organization config rule.
     * </p>
     * 
     * @param organizationConfigRuleName
     *        The name that you assign to an organization config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOrganizationConfigRuleRequest withOrganizationConfigRuleName(String organizationConfigRuleName) {
        setOrganizationConfigRuleName(organizationConfigRuleName);
        return this;
    }

    /**
     * <p>
     * An <code>OrganizationManagedRuleMetadata</code> object.
     * </p>
     * 
     * @param organizationManagedRuleMetadata
     *        An <code>OrganizationManagedRuleMetadata</code> object.
     */

    public void setOrganizationManagedRuleMetadata(OrganizationManagedRuleMetadata organizationManagedRuleMetadata) {
        this.organizationManagedRuleMetadata = organizationManagedRuleMetadata;
    }

    /**
     * <p>
     * An <code>OrganizationManagedRuleMetadata</code> object.
     * </p>
     * 
     * @return An <code>OrganizationManagedRuleMetadata</code> object.
     */

    public OrganizationManagedRuleMetadata getOrganizationManagedRuleMetadata() {
        return this.organizationManagedRuleMetadata;
    }

    /**
     * <p>
     * An <code>OrganizationManagedRuleMetadata</code> object.
     * </p>
     * 
     * @param organizationManagedRuleMetadata
     *        An <code>OrganizationManagedRuleMetadata</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOrganizationConfigRuleRequest withOrganizationManagedRuleMetadata(OrganizationManagedRuleMetadata organizationManagedRuleMetadata) {
        setOrganizationManagedRuleMetadata(organizationManagedRuleMetadata);
        return this;
    }

    /**
     * <p>
     * An <code>OrganizationCustomRuleMetadata</code> object.
     * </p>
     * 
     * @param organizationCustomRuleMetadata
     *        An <code>OrganizationCustomRuleMetadata</code> object.
     */

    public void setOrganizationCustomRuleMetadata(OrganizationCustomRuleMetadata organizationCustomRuleMetadata) {
        this.organizationCustomRuleMetadata = organizationCustomRuleMetadata;
    }

    /**
     * <p>
     * An <code>OrganizationCustomRuleMetadata</code> object.
     * </p>
     * 
     * @return An <code>OrganizationCustomRuleMetadata</code> object.
     */

    public OrganizationCustomRuleMetadata getOrganizationCustomRuleMetadata() {
        return this.organizationCustomRuleMetadata;
    }

    /**
     * <p>
     * An <code>OrganizationCustomRuleMetadata</code> object.
     * </p>
     * 
     * @param organizationCustomRuleMetadata
     *        An <code>OrganizationCustomRuleMetadata</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOrganizationConfigRuleRequest withOrganizationCustomRuleMetadata(OrganizationCustomRuleMetadata organizationCustomRuleMetadata) {
        setOrganizationCustomRuleMetadata(organizationCustomRuleMetadata);
        return this;
    }

    /**
     * <p>
     * A comma-separated list of accounts that you want to exclude from an organization config rule.
     * </p>
     * 
     * @return A comma-separated list of accounts that you want to exclude from an organization config rule.
     */

    public java.util.List<String> getExcludedAccounts() {
        if (excludedAccounts == null) {
            excludedAccounts = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return excludedAccounts;
    }

    /**
     * <p>
     * A comma-separated list of accounts that you want to exclude from an organization config rule.
     * </p>
     * 
     * @param excludedAccounts
     *        A comma-separated list of accounts that you want to exclude from an organization config rule.
     */

    public void setExcludedAccounts(java.util.Collection<String> excludedAccounts) {
        if (excludedAccounts == null) {
            this.excludedAccounts = null;
            return;
        }

        this.excludedAccounts = new com.amazonaws.internal.SdkInternalList<String>(excludedAccounts);
    }

    /**
     * <p>
     * A comma-separated list of accounts that you want to exclude from an organization config rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedAccounts(java.util.Collection)} or {@link #withExcludedAccounts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param excludedAccounts
     *        A comma-separated list of accounts that you want to exclude from an organization config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOrganizationConfigRuleRequest withExcludedAccounts(String... excludedAccounts) {
        if (this.excludedAccounts == null) {
            setExcludedAccounts(new com.amazonaws.internal.SdkInternalList<String>(excludedAccounts.length));
        }
        for (String ele : excludedAccounts) {
            this.excludedAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A comma-separated list of accounts that you want to exclude from an organization config rule.
     * </p>
     * 
     * @param excludedAccounts
     *        A comma-separated list of accounts that you want to exclude from an organization config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOrganizationConfigRuleRequest withExcludedAccounts(java.util.Collection<String> excludedAccounts) {
        setExcludedAccounts(excludedAccounts);
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
            sb.append("OrganizationConfigRuleName: ").append(getOrganizationConfigRuleName()).append(",");
        if (getOrganizationManagedRuleMetadata() != null)
            sb.append("OrganizationManagedRuleMetadata: ").append(getOrganizationManagedRuleMetadata()).append(",");
        if (getOrganizationCustomRuleMetadata() != null)
            sb.append("OrganizationCustomRuleMetadata: ").append(getOrganizationCustomRuleMetadata()).append(",");
        if (getExcludedAccounts() != null)
            sb.append("ExcludedAccounts: ").append(getExcludedAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutOrganizationConfigRuleRequest == false)
            return false;
        PutOrganizationConfigRuleRequest other = (PutOrganizationConfigRuleRequest) obj;
        if (other.getOrganizationConfigRuleName() == null ^ this.getOrganizationConfigRuleName() == null)
            return false;
        if (other.getOrganizationConfigRuleName() != null && other.getOrganizationConfigRuleName().equals(this.getOrganizationConfigRuleName()) == false)
            return false;
        if (other.getOrganizationManagedRuleMetadata() == null ^ this.getOrganizationManagedRuleMetadata() == null)
            return false;
        if (other.getOrganizationManagedRuleMetadata() != null
                && other.getOrganizationManagedRuleMetadata().equals(this.getOrganizationManagedRuleMetadata()) == false)
            return false;
        if (other.getOrganizationCustomRuleMetadata() == null ^ this.getOrganizationCustomRuleMetadata() == null)
            return false;
        if (other.getOrganizationCustomRuleMetadata() != null
                && other.getOrganizationCustomRuleMetadata().equals(this.getOrganizationCustomRuleMetadata()) == false)
            return false;
        if (other.getExcludedAccounts() == null ^ this.getExcludedAccounts() == null)
            return false;
        if (other.getExcludedAccounts() != null && other.getExcludedAccounts().equals(this.getExcludedAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationConfigRuleName() == null) ? 0 : getOrganizationConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getOrganizationManagedRuleMetadata() == null) ? 0 : getOrganizationManagedRuleMetadata().hashCode());
        hashCode = prime * hashCode + ((getOrganizationCustomRuleMetadata() == null) ? 0 : getOrganizationCustomRuleMetadata().hashCode());
        hashCode = prime * hashCode + ((getExcludedAccounts() == null) ? 0 : getExcludedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public PutOrganizationConfigRuleRequest clone() {
        return (PutOrganizationConfigRuleRequest) super.clone();
    }

}
