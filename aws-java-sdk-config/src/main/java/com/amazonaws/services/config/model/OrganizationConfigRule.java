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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/OrganizationConfigRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationConfigRule implements Serializable, Cloneable, StructuredPojo {

    private String organizationConfigRuleName;

    private String organizationConfigRuleArn;

    private OrganizationManagedRuleMetadata organizationManagedRuleMetadata;

    private OrganizationCustomRuleMetadata organizationCustomRuleMetadata;

    private com.amazonaws.internal.SdkInternalList<String> excludedAccounts;

    private java.util.Date lastUpdateTime;

    /**
     * @param organizationConfigRuleName
     */

    public void setOrganizationConfigRuleName(String organizationConfigRuleName) {
        this.organizationConfigRuleName = organizationConfigRuleName;
    }

    /**
     * @return
     */

    public String getOrganizationConfigRuleName() {
        return this.organizationConfigRuleName;
    }

    /**
     * @param organizationConfigRuleName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfigRule withOrganizationConfigRuleName(String organizationConfigRuleName) {
        setOrganizationConfigRuleName(organizationConfigRuleName);
        return this;
    }

    /**
     * @param organizationConfigRuleArn
     */

    public void setOrganizationConfigRuleArn(String organizationConfigRuleArn) {
        this.organizationConfigRuleArn = organizationConfigRuleArn;
    }

    /**
     * @return
     */

    public String getOrganizationConfigRuleArn() {
        return this.organizationConfigRuleArn;
    }

    /**
     * @param organizationConfigRuleArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfigRule withOrganizationConfigRuleArn(String organizationConfigRuleArn) {
        setOrganizationConfigRuleArn(organizationConfigRuleArn);
        return this;
    }

    /**
     * @param organizationManagedRuleMetadata
     */

    public void setOrganizationManagedRuleMetadata(OrganizationManagedRuleMetadata organizationManagedRuleMetadata) {
        this.organizationManagedRuleMetadata = organizationManagedRuleMetadata;
    }

    /**
     * @return
     */

    public OrganizationManagedRuleMetadata getOrganizationManagedRuleMetadata() {
        return this.organizationManagedRuleMetadata;
    }

    /**
     * @param organizationManagedRuleMetadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfigRule withOrganizationManagedRuleMetadata(OrganizationManagedRuleMetadata organizationManagedRuleMetadata) {
        setOrganizationManagedRuleMetadata(organizationManagedRuleMetadata);
        return this;
    }

    /**
     * @param organizationCustomRuleMetadata
     */

    public void setOrganizationCustomRuleMetadata(OrganizationCustomRuleMetadata organizationCustomRuleMetadata) {
        this.organizationCustomRuleMetadata = organizationCustomRuleMetadata;
    }

    /**
     * @return
     */

    public OrganizationCustomRuleMetadata getOrganizationCustomRuleMetadata() {
        return this.organizationCustomRuleMetadata;
    }

    /**
     * @param organizationCustomRuleMetadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfigRule withOrganizationCustomRuleMetadata(OrganizationCustomRuleMetadata organizationCustomRuleMetadata) {
        setOrganizationCustomRuleMetadata(organizationCustomRuleMetadata);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getExcludedAccounts() {
        if (excludedAccounts == null) {
            excludedAccounts = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return excludedAccounts;
    }

    /**
     * @param excludedAccounts
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedAccounts(java.util.Collection)} or {@link #withExcludedAccounts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param excludedAccounts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfigRule withExcludedAccounts(String... excludedAccounts) {
        if (this.excludedAccounts == null) {
            setExcludedAccounts(new com.amazonaws.internal.SdkInternalList<String>(excludedAccounts.length));
        }
        for (String ele : excludedAccounts) {
            this.excludedAccounts.add(ele);
        }
        return this;
    }

    /**
     * @param excludedAccounts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfigRule withExcludedAccounts(java.util.Collection<String> excludedAccounts) {
        setExcludedAccounts(excludedAccounts);
        return this;
    }

    /**
     * @param lastUpdateTime
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * @return
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * @param lastUpdateTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfigRule withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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
        if (getOrganizationConfigRuleArn() != null)
            sb.append("OrganizationConfigRuleArn: ").append(getOrganizationConfigRuleArn()).append(",");
        if (getOrganizationManagedRuleMetadata() != null)
            sb.append("OrganizationManagedRuleMetadata: ").append(getOrganizationManagedRuleMetadata()).append(",");
        if (getOrganizationCustomRuleMetadata() != null)
            sb.append("OrganizationCustomRuleMetadata: ").append(getOrganizationCustomRuleMetadata()).append(",");
        if (getExcludedAccounts() != null)
            sb.append("ExcludedAccounts: ").append(getExcludedAccounts()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationConfigRule == false)
            return false;
        OrganizationConfigRule other = (OrganizationConfigRule) obj;
        if (other.getOrganizationConfigRuleName() == null ^ this.getOrganizationConfigRuleName() == null)
            return false;
        if (other.getOrganizationConfigRuleName() != null && other.getOrganizationConfigRuleName().equals(this.getOrganizationConfigRuleName()) == false)
            return false;
        if (other.getOrganizationConfigRuleArn() == null ^ this.getOrganizationConfigRuleArn() == null)
            return false;
        if (other.getOrganizationConfigRuleArn() != null && other.getOrganizationConfigRuleArn().equals(this.getOrganizationConfigRuleArn()) == false)
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
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationConfigRuleName() == null) ? 0 : getOrganizationConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getOrganizationConfigRuleArn() == null) ? 0 : getOrganizationConfigRuleArn().hashCode());
        hashCode = prime * hashCode + ((getOrganizationManagedRuleMetadata() == null) ? 0 : getOrganizationManagedRuleMetadata().hashCode());
        hashCode = prime * hashCode + ((getOrganizationCustomRuleMetadata() == null) ? 0 : getOrganizationCustomRuleMetadata().hashCode());
        hashCode = prime * hashCode + ((getExcludedAccounts() == null) ? 0 : getExcludedAccounts().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationConfigRule clone() {
        try {
            return (OrganizationConfigRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.OrganizationConfigRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
