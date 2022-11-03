/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateImpersonationRole" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateImpersonationRoleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The WorkMail organization that contains the impersonation role to update.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The ID of the impersonation role to update.
     * </p>
     */
    private String impersonationRoleId;
    /**
     * <p>
     * The updated impersonation role name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The updated impersonation role type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The updated impersonation role description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The updated list of rules.
     * </p>
     */
    private java.util.List<ImpersonationRule> rules;

    /**
     * <p>
     * The WorkMail organization that contains the impersonation role to update.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization that contains the impersonation role to update.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The WorkMail organization that contains the impersonation role to update.
     * </p>
     * 
     * @return The WorkMail organization that contains the impersonation role to update.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The WorkMail organization that contains the impersonation role to update.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization that contains the impersonation role to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImpersonationRoleRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The ID of the impersonation role to update.
     * </p>
     * 
     * @param impersonationRoleId
     *        The ID of the impersonation role to update.
     */

    public void setImpersonationRoleId(String impersonationRoleId) {
        this.impersonationRoleId = impersonationRoleId;
    }

    /**
     * <p>
     * The ID of the impersonation role to update.
     * </p>
     * 
     * @return The ID of the impersonation role to update.
     */

    public String getImpersonationRoleId() {
        return this.impersonationRoleId;
    }

    /**
     * <p>
     * The ID of the impersonation role to update.
     * </p>
     * 
     * @param impersonationRoleId
     *        The ID of the impersonation role to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImpersonationRoleRequest withImpersonationRoleId(String impersonationRoleId) {
        setImpersonationRoleId(impersonationRoleId);
        return this;
    }

    /**
     * <p>
     * The updated impersonation role name.
     * </p>
     * 
     * @param name
     *        The updated impersonation role name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The updated impersonation role name.
     * </p>
     * 
     * @return The updated impersonation role name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The updated impersonation role name.
     * </p>
     * 
     * @param name
     *        The updated impersonation role name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImpersonationRoleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The updated impersonation role type.
     * </p>
     * 
     * @param type
     *        The updated impersonation role type.
     * @see ImpersonationRoleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The updated impersonation role type.
     * </p>
     * 
     * @return The updated impersonation role type.
     * @see ImpersonationRoleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The updated impersonation role type.
     * </p>
     * 
     * @param type
     *        The updated impersonation role type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImpersonationRoleType
     */

    public UpdateImpersonationRoleRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The updated impersonation role type.
     * </p>
     * 
     * @param type
     *        The updated impersonation role type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImpersonationRoleType
     */

    public UpdateImpersonationRoleRequest withType(ImpersonationRoleType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The updated impersonation role description.
     * </p>
     * 
     * @param description
     *        The updated impersonation role description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated impersonation role description.
     * </p>
     * 
     * @return The updated impersonation role description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated impersonation role description.
     * </p>
     * 
     * @param description
     *        The updated impersonation role description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImpersonationRoleRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The updated list of rules.
     * </p>
     * 
     * @return The updated list of rules.
     */

    public java.util.List<ImpersonationRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The updated list of rules.
     * </p>
     * 
     * @param rules
     *        The updated list of rules.
     */

    public void setRules(java.util.Collection<ImpersonationRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<ImpersonationRule>(rules);
    }

    /**
     * <p>
     * The updated list of rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The updated list of rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImpersonationRoleRequest withRules(ImpersonationRule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<ImpersonationRule>(rules.length));
        }
        for (ImpersonationRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The updated list of rules.
     * </p>
     * 
     * @param rules
     *        The updated list of rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImpersonationRoleRequest withRules(java.util.Collection<ImpersonationRule> rules) {
        setRules(rules);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getImpersonationRoleId() != null)
            sb.append("ImpersonationRoleId: ").append(getImpersonationRoleId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateImpersonationRoleRequest == false)
            return false;
        UpdateImpersonationRoleRequest other = (UpdateImpersonationRoleRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getImpersonationRoleId() == null ^ this.getImpersonationRoleId() == null)
            return false;
        if (other.getImpersonationRoleId() != null && other.getImpersonationRoleId().equals(this.getImpersonationRoleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getImpersonationRoleId() == null) ? 0 : getImpersonationRoleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public UpdateImpersonationRoleRequest clone() {
        return (UpdateImpersonationRoleRequest) super.clone();
    }

}
