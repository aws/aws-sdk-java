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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGlossary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGlossaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The description to be updated as part of the <code>UpdateGlossary</code> action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a business glossary is to be updated.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The identifier of the business glossary to be updated.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The name to be updated as part of the <code>UpdateGlossary</code> action.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status to be updated as part of the <code>UpdateGlossary</code> action.
     * </p>
     */
    private String status;

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

    public UpdateGlossaryRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The description to be updated as part of the <code>UpdateGlossary</code> action.
     * </p>
     * 
     * @param description
     *        The description to be updated as part of the <code>UpdateGlossary</code> action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description to be updated as part of the <code>UpdateGlossary</code> action.
     * </p>
     * 
     * @return The description to be updated as part of the <code>UpdateGlossary</code> action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description to be updated as part of the <code>UpdateGlossary</code> action.
     * </p>
     * 
     * @param description
     *        The description to be updated as part of the <code>UpdateGlossary</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlossaryRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a business glossary is to be updated.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which a business glossary is to be updated.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a business glossary is to be updated.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which a business glossary is to be updated.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a business glossary is to be updated.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which a business glossary is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlossaryRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the business glossary to be updated.
     * </p>
     * 
     * @param identifier
     *        The identifier of the business glossary to be updated.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the business glossary to be updated.
     * </p>
     * 
     * @return The identifier of the business glossary to be updated.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the business glossary to be updated.
     * </p>
     * 
     * @param identifier
     *        The identifier of the business glossary to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlossaryRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateGlossary</code> action.
     * </p>
     * 
     * @param name
     *        The name to be updated as part of the <code>UpdateGlossary</code> action.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateGlossary</code> action.
     * </p>
     * 
     * @return The name to be updated as part of the <code>UpdateGlossary</code> action.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateGlossary</code> action.
     * </p>
     * 
     * @param name
     *        The name to be updated as part of the <code>UpdateGlossary</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlossaryRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateGlossary</code> action.
     * </p>
     * 
     * @param status
     *        The status to be updated as part of the <code>UpdateGlossary</code> action.
     * @see GlossaryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateGlossary</code> action.
     * </p>
     * 
     * @return The status to be updated as part of the <code>UpdateGlossary</code> action.
     * @see GlossaryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateGlossary</code> action.
     * </p>
     * 
     * @param status
     *        The status to be updated as part of the <code>UpdateGlossary</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlossaryStatus
     */

    public UpdateGlossaryRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateGlossary</code> action.
     * </p>
     * 
     * @param status
     *        The status to be updated as part of the <code>UpdateGlossary</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlossaryStatus
     */

    public UpdateGlossaryRequest withStatus(GlossaryStatus status) {
        this.status = status.toString();
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
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGlossaryRequest == false)
            return false;
        UpdateGlossaryRequest other = (UpdateGlossaryRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGlossaryRequest clone() {
        return (UpdateGlossaryRequest) super.clone();
    }

}
