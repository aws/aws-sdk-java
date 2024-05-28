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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
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
     * The ID of the Amazon Web Services domain that is to be updated.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The name to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The single sign-on option to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     */
    private SingleSignOn singleSignOn;

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

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

    public UpdateDomainRequest withDescription(String description) {
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

    public UpdateDomainRequest withDomainExecutionRole(String domainExecutionRole) {
        setDomainExecutionRole(domainExecutionRole);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services domain that is to be updated.
     * </p>
     * 
     * @param identifier
     *        The ID of the Amazon Web Services domain that is to be updated.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services domain that is to be updated.
     * </p>
     * 
     * @return The ID of the Amazon Web Services domain that is to be updated.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services domain that is to be updated.
     * </p>
     * 
     * @param identifier
     *        The ID of the Amazon Web Services domain that is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
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

    public UpdateDomainRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The single sign-on option to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     * 
     * @param singleSignOn
     *        The single sign-on option to be updated as part of the <code>UpdateDomain</code> action.
     */

    public void setSingleSignOn(SingleSignOn singleSignOn) {
        this.singleSignOn = singleSignOn;
    }

    /**
     * <p>
     * The single sign-on option to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     * 
     * @return The single sign-on option to be updated as part of the <code>UpdateDomain</code> action.
     */

    public SingleSignOn getSingleSignOn() {
        return this.singleSignOn;
    }

    /**
     * <p>
     * The single sign-on option to be updated as part of the <code>UpdateDomain</code> action.
     * </p>
     * 
     * @param singleSignOn
     *        The single sign-on option to be updated as part of the <code>UpdateDomain</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainRequest withSingleSignOn(SingleSignOn singleSignOn) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDomainExecutionRole() != null)
            sb.append("DomainExecutionRole: ").append(getDomainExecutionRole()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
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

        if (obj instanceof UpdateDomainRequest == false)
            return false;
        UpdateDomainRequest other = (UpdateDomainRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainExecutionRole() == null ^ this.getDomainExecutionRole() == null)
            return false;
        if (other.getDomainExecutionRole() != null && other.getDomainExecutionRole().equals(this.getDomainExecutionRole()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainExecutionRole() == null) ? 0 : getDomainExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSingleSignOn() == null) ? 0 : getSingleSignOn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainRequest clone() {
        return (UpdateDomainRequest) super.clone();
    }

}
