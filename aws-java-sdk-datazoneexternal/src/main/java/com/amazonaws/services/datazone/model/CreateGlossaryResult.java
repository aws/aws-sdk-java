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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateGlossary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGlossaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The description of this business glossary.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this business glossary is created.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The ID of this business glossary.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of this business glossary.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the project that currently owns this business glossary.
     * </p>
     */
    private String owningProjectId;
    /**
     * <p>
     * The status of this business glossary.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The description of this business glossary.
     * </p>
     * 
     * @param description
     *        The description of this business glossary.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of this business glossary.
     * </p>
     * 
     * @return The description of this business glossary.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of this business glossary.
     * </p>
     * 
     * @param description
     *        The description of this business glossary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlossaryResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this business glossary is created.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which this business glossary is created.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this business glossary is created.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which this business glossary is created.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this business glossary is created.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which this business glossary is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlossaryResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The ID of this business glossary.
     * </p>
     * 
     * @param id
     *        The ID of this business glossary.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of this business glossary.
     * </p>
     * 
     * @return The ID of this business glossary.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of this business glossary.
     * </p>
     * 
     * @param id
     *        The ID of this business glossary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlossaryResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of this business glossary.
     * </p>
     * 
     * @param name
     *        The name of this business glossary.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this business glossary.
     * </p>
     * 
     * @return The name of this business glossary.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this business glossary.
     * </p>
     * 
     * @param name
     *        The name of this business glossary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlossaryResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the project that currently owns this business glossary.
     * </p>
     * 
     * @param owningProjectId
     *        The ID of the project that currently owns this business glossary.
     */

    public void setOwningProjectId(String owningProjectId) {
        this.owningProjectId = owningProjectId;
    }

    /**
     * <p>
     * The ID of the project that currently owns this business glossary.
     * </p>
     * 
     * @return The ID of the project that currently owns this business glossary.
     */

    public String getOwningProjectId() {
        return this.owningProjectId;
    }

    /**
     * <p>
     * The ID of the project that currently owns this business glossary.
     * </p>
     * 
     * @param owningProjectId
     *        The ID of the project that currently owns this business glossary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlossaryResult withOwningProjectId(String owningProjectId) {
        setOwningProjectId(owningProjectId);
        return this;
    }

    /**
     * <p>
     * The status of this business glossary.
     * </p>
     * 
     * @param status
     *        The status of this business glossary.
     * @see GlossaryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this business glossary.
     * </p>
     * 
     * @return The status of this business glossary.
     * @see GlossaryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of this business glossary.
     * </p>
     * 
     * @param status
     *        The status of this business glossary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlossaryStatus
     */

    public CreateGlossaryResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of this business glossary.
     * </p>
     * 
     * @param status
     *        The status of this business glossary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlossaryStatus
     */

    public CreateGlossaryResult withStatus(GlossaryStatus status) {
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getOwningProjectId() != null)
            sb.append("OwningProjectId: ").append(getOwningProjectId()).append(",");
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

        if (obj instanceof CreateGlossaryResult == false)
            return false;
        CreateGlossaryResult other = (CreateGlossaryResult) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwningProjectId() == null ^ this.getOwningProjectId() == null)
            return false;
        if (other.getOwningProjectId() != null && other.getOwningProjectId().equals(this.getOwningProjectId()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwningProjectId() == null) ? 0 : getOwningProjectId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateGlossaryResult clone() {
        try {
            return (CreateGlossaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
