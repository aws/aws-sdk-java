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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateImpersonationRole" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateImpersonationRoleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The idempotency token for the client request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The WorkMail organization to create the new impersonation role within.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The name of the new impersonation role.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The impersonation role's type. The available impersonation role types are <code>READ_ONLY</code> or
     * <code>FULL_ACCESS</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The description of the new impersonation role.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The list of rules for the impersonation role.
     * </p>
     */
    private java.util.List<ImpersonationRule> rules;

    /**
     * <p>
     * The idempotency token for the client request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the client request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for the client request.
     * </p>
     * 
     * @return The idempotency token for the client request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token for the client request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the client request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImpersonationRoleRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The WorkMail organization to create the new impersonation role within.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization to create the new impersonation role within.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The WorkMail organization to create the new impersonation role within.
     * </p>
     * 
     * @return The WorkMail organization to create the new impersonation role within.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The WorkMail organization to create the new impersonation role within.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization to create the new impersonation role within.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImpersonationRoleRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The name of the new impersonation role.
     * </p>
     * 
     * @param name
     *        The name of the new impersonation role.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new impersonation role.
     * </p>
     * 
     * @return The name of the new impersonation role.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new impersonation role.
     * </p>
     * 
     * @param name
     *        The name of the new impersonation role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImpersonationRoleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The impersonation role's type. The available impersonation role types are <code>READ_ONLY</code> or
     * <code>FULL_ACCESS</code>.
     * </p>
     * 
     * @param type
     *        The impersonation role's type. The available impersonation role types are <code>READ_ONLY</code> or
     *        <code>FULL_ACCESS</code>.
     * @see ImpersonationRoleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The impersonation role's type. The available impersonation role types are <code>READ_ONLY</code> or
     * <code>FULL_ACCESS</code>.
     * </p>
     * 
     * @return The impersonation role's type. The available impersonation role types are <code>READ_ONLY</code> or
     *         <code>FULL_ACCESS</code>.
     * @see ImpersonationRoleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The impersonation role's type. The available impersonation role types are <code>READ_ONLY</code> or
     * <code>FULL_ACCESS</code>.
     * </p>
     * 
     * @param type
     *        The impersonation role's type. The available impersonation role types are <code>READ_ONLY</code> or
     *        <code>FULL_ACCESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImpersonationRoleType
     */

    public CreateImpersonationRoleRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The impersonation role's type. The available impersonation role types are <code>READ_ONLY</code> or
     * <code>FULL_ACCESS</code>.
     * </p>
     * 
     * @param type
     *        The impersonation role's type. The available impersonation role types are <code>READ_ONLY</code> or
     *        <code>FULL_ACCESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImpersonationRoleType
     */

    public CreateImpersonationRoleRequest withType(ImpersonationRoleType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The description of the new impersonation role.
     * </p>
     * 
     * @param description
     *        The description of the new impersonation role.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the new impersonation role.
     * </p>
     * 
     * @return The description of the new impersonation role.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the new impersonation role.
     * </p>
     * 
     * @param description
     *        The description of the new impersonation role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImpersonationRoleRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The list of rules for the impersonation role.
     * </p>
     * 
     * @return The list of rules for the impersonation role.
     */

    public java.util.List<ImpersonationRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The list of rules for the impersonation role.
     * </p>
     * 
     * @param rules
     *        The list of rules for the impersonation role.
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
     * The list of rules for the impersonation role.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The list of rules for the impersonation role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImpersonationRoleRequest withRules(ImpersonationRule... rules) {
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
     * The list of rules for the impersonation role.
     * </p>
     * 
     * @param rules
     *        The list of rules for the impersonation role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImpersonationRoleRequest withRules(java.util.Collection<ImpersonationRule> rules) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
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

        if (obj instanceof CreateImpersonationRoleRequest == false)
            return false;
        CreateImpersonationRoleRequest other = (CreateImpersonationRoleRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public CreateImpersonationRoleRequest clone() {
        return (CreateImpersonationRoleRequest) super.clone();
    }

}
