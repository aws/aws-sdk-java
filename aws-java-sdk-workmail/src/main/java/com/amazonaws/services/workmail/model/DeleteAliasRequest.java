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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the organization under which the user exists.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The identifier for the member (user or group) from which to have the aliases removed.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The aliases to be removed from the user's set of aliases. Duplicate entries in the list are collapsed into single
     * entries (the list is transformed into a set).
     * </p>
     */
    private String alias;

    /**
     * <p>
     * The identifier for the organization under which the user exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization under which the user exists.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the user exists.
     * </p>
     * 
     * @return The identifier for the organization under which the user exists.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the user exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization under which the user exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAliasRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The identifier for the member (user or group) from which to have the aliases removed.
     * </p>
     * 
     * @param entityId
     *        The identifier for the member (user or group) from which to have the aliases removed.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier for the member (user or group) from which to have the aliases removed.
     * </p>
     * 
     * @return The identifier for the member (user or group) from which to have the aliases removed.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The identifier for the member (user or group) from which to have the aliases removed.
     * </p>
     * 
     * @param entityId
     *        The identifier for the member (user or group) from which to have the aliases removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAliasRequest withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The aliases to be removed from the user's set of aliases. Duplicate entries in the list are collapsed into single
     * entries (the list is transformed into a set).
     * </p>
     * 
     * @param alias
     *        The aliases to be removed from the user's set of aliases. Duplicate entries in the list are collapsed into
     *        single entries (the list is transformed into a set).
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The aliases to be removed from the user's set of aliases. Duplicate entries in the list are collapsed into single
     * entries (the list is transformed into a set).
     * </p>
     * 
     * @return The aliases to be removed from the user's set of aliases. Duplicate entries in the list are collapsed
     *         into single entries (the list is transformed into a set).
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The aliases to be removed from the user's set of aliases. Duplicate entries in the list are collapsed into single
     * entries (the list is transformed into a set).
     * </p>
     * 
     * @param alias
     *        The aliases to be removed from the user's set of aliases. Duplicate entries in the list are collapsed into
     *        single entries (the list is transformed into a set).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAliasRequest withAlias(String alias) {
        setAlias(alias);
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
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAliasRequest == false)
            return false;
        DeleteAliasRequest other = (DeleteAliasRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAliasRequest clone() {
        return (DeleteAliasRequest) super.clone();
    }

}
