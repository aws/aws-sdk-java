/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The description to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The domain execution role to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     */
    private String domainExecutionRole;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Specifies the timestamp of when the domain was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The name to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The single sign-on option of the Amazon DataZone domain.
     * </p>
     */
    private SingleSignOn singleSignOn;

    /**
     * <p>
     * The description to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     * 
     * @param description
     *        The description to be updated as part of the <code>UpdateDomain</code> action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     * 
     * @return The description to be updated as part of the <code>UpdateDomain</code> action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     * 
     * @param description
     *        The description to be updated as part of the <code>UpdateDomain</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The domain execution role to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     * 
     * @param domainExecutionRole
     *        The domain execution role to be updated as part of the <code>UpdateDomain</code> action.
     */

    public void setDomainExecutionRole(String domainExecutionRole) {
        this.domainExecutionRole = domainExecutionRole;
    }

    /**
     * <p>
     * The domain execution role to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     * 
     * @return The domain execution role to be updated as part of the <code>UpdateDomain</code> action.
     */

    public String getDomainExecutionRole() {
        return this.domainExecutionRole;
    }

    /**
     * <p>
     * The domain execution role to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     * 
     * @param domainExecutionRole
     *        The domain execution role to be updated as part of the <code>UpdateDomain</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainResult withDomainExecutionRole(String domainExecutionRole) {
        setDomainExecutionRole(domainExecutionRole);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @param id
     *        The identifier of the Amazon DataZone domain.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @param id
     *        The identifier of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Specifies the timestamp of when the domain was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies the timestamp of when the domain was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies the timestamp of when the domain was last updated.
     * </p>
     * 
     * @return Specifies the timestamp of when the domain was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies the timestamp of when the domain was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies the timestamp of when the domain was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     * 
     * @param name
     *        The name to be updated as part of the <code>UpdateDomain</code> action.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     * 
     * @return The name to be updated as part of the <code>UpdateDomain</code> action.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     * 
     * @param name
     *        The name to be updated as part of the <code>UpdateDomain</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The single sign-on option of the Amazon DataZone domain.
     * </p>
     * 
     * @param singleSignOn
     *        The single sign-on option of the Amazon DataZone domain.
     */

    public void setSingleSignOn(SingleSignOn singleSignOn) {
        this.singleSignOn = singleSignOn;
    }

    /**
     * <p>
     * The single sign-on option of the Amazon DataZone domain.
     * </p>
     * 
     * @return The single sign-on option of the Amazon DataZone domain.
     */

    public SingleSignOn getSingleSignOn() {
        return this.singleSignOn;
    }

    /**
     * <p>
     * The single sign-on option of the Amazon DataZone domain.
     * </p>
     * 
     * @param singleSignOn
     *        The single sign-on option of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainResult withSingleSignOn(SingleSignOn singleSignOn) {
        setSingleSignOn(singleSignOn);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDomainExecutionRole() != null)
            sb.append("DomainExecutionRole: ").append(getDomainExecutionRole()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSingleSignOn() != null)
            sb.append("SingleSignOn: ").append(getSingleSignOn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainResult == false)
            return false;
        UpdateDomainResult other = (UpdateDomainResult) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainExecutionRole() == null ^ this.getDomainExecutionRole() == null)
            return false;
        if (other.getDomainExecutionRole() != null && other.getDomainExecutionRole().equals(this.getDomainExecutionRole()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSingleSignOn() == null ^ this.getSingleSignOn() == null)
            return false;
        if (other.getSingleSignOn() != null && other.getSingleSignOn().equals(this.getSingleSignOn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainExecutionRole() == null) ? 0 : getDomainExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSingleSignOn() == null) ? 0 : getSingleSignOn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainResult clone() {
        try {
            return (UpdateDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
