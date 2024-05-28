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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateFormType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFormTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The description of this Amazon DataZone metadata form type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this metadata form type is created.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The name of this Amazon DataZone metadata form type.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this metadata form type was originally created.
     * </p>
     */
    private String originDomainId;
    /**
     * <p>
     * The ID of the project in which this Amazon DataZone metadata form type was originally created.
     * </p>
     */
    private String originProjectId;
    /**
     * <p>
     * The ID of the project that owns this Amazon DataZone metadata form type.
     * </p>
     */
    private String owningProjectId;
    /**
     * <p>
     * The revision of this Amazon DataZone metadata form type.
     * </p>
     */
    private String revision;

    /**
     * <p>
     * The description of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @param description
     *        The description of this Amazon DataZone metadata form type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @return The description of this Amazon DataZone metadata form type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @param description
     *        The description of this Amazon DataZone metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFormTypeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this metadata form type is created.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which this metadata form type is created.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this metadata form type is created.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which this metadata form type is created.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this metadata form type is created.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which this metadata form type is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFormTypeResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The name of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @param name
     *        The name of this Amazon DataZone metadata form type.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @return The name of this Amazon DataZone metadata form type.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @param name
     *        The name of this Amazon DataZone metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFormTypeResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this metadata form type was originally created.
     * </p>
     * 
     * @param originDomainId
     *        The ID of the Amazon DataZone domain in which this metadata form type was originally created.
     */

    public void setOriginDomainId(String originDomainId) {
        this.originDomainId = originDomainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this metadata form type was originally created.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which this metadata form type was originally created.
     */

    public String getOriginDomainId() {
        return this.originDomainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this metadata form type was originally created.
     * </p>
     * 
     * @param originDomainId
     *        The ID of the Amazon DataZone domain in which this metadata form type was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFormTypeResult withOriginDomainId(String originDomainId) {
        setOriginDomainId(originDomainId);
        return this;
    }

    /**
     * <p>
     * The ID of the project in which this Amazon DataZone metadata form type was originally created.
     * </p>
     * 
     * @param originProjectId
     *        The ID of the project in which this Amazon DataZone metadata form type was originally created.
     */

    public void setOriginProjectId(String originProjectId) {
        this.originProjectId = originProjectId;
    }

    /**
     * <p>
     * The ID of the project in which this Amazon DataZone metadata form type was originally created.
     * </p>
     * 
     * @return The ID of the project in which this Amazon DataZone metadata form type was originally created.
     */

    public String getOriginProjectId() {
        return this.originProjectId;
    }

    /**
     * <p>
     * The ID of the project in which this Amazon DataZone metadata form type was originally created.
     * </p>
     * 
     * @param originProjectId
     *        The ID of the project in which this Amazon DataZone metadata form type was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFormTypeResult withOriginProjectId(String originProjectId) {
        setOriginProjectId(originProjectId);
        return this;
    }

    /**
     * <p>
     * The ID of the project that owns this Amazon DataZone metadata form type.
     * </p>
     * 
     * @param owningProjectId
     *        The ID of the project that owns this Amazon DataZone metadata form type.
     */

    public void setOwningProjectId(String owningProjectId) {
        this.owningProjectId = owningProjectId;
    }

    /**
     * <p>
     * The ID of the project that owns this Amazon DataZone metadata form type.
     * </p>
     * 
     * @return The ID of the project that owns this Amazon DataZone metadata form type.
     */

    public String getOwningProjectId() {
        return this.owningProjectId;
    }

    /**
     * <p>
     * The ID of the project that owns this Amazon DataZone metadata form type.
     * </p>
     * 
     * @param owningProjectId
     *        The ID of the project that owns this Amazon DataZone metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFormTypeResult withOwningProjectId(String owningProjectId) {
        setOwningProjectId(owningProjectId);
        return this;
    }

    /**
     * <p>
     * The revision of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @param revision
     *        The revision of this Amazon DataZone metadata form type.
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @return The revision of this Amazon DataZone metadata form type.
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @param revision
     *        The revision of this Amazon DataZone metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFormTypeResult withRevision(String revision) {
        setRevision(revision);
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getOriginDomainId() != null)
            sb.append("OriginDomainId: ").append(getOriginDomainId()).append(",");
        if (getOriginProjectId() != null)
            sb.append("OriginProjectId: ").append(getOriginProjectId()).append(",");
        if (getOwningProjectId() != null)
            sb.append("OwningProjectId: ").append(getOwningProjectId()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFormTypeResult == false)
            return false;
        CreateFormTypeResult other = (CreateFormTypeResult) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOriginDomainId() == null ^ this.getOriginDomainId() == null)
            return false;
        if (other.getOriginDomainId() != null && other.getOriginDomainId().equals(this.getOriginDomainId()) == false)
            return false;
        if (other.getOriginProjectId() == null ^ this.getOriginProjectId() == null)
            return false;
        if (other.getOriginProjectId() != null && other.getOriginProjectId().equals(this.getOriginProjectId()) == false)
            return false;
        if (other.getOwningProjectId() == null ^ this.getOwningProjectId() == null)
            return false;
        if (other.getOwningProjectId() != null && other.getOwningProjectId().equals(this.getOwningProjectId()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOriginDomainId() == null) ? 0 : getOriginDomainId().hashCode());
        hashCode = prime * hashCode + ((getOriginProjectId() == null) ? 0 : getOriginProjectId().hashCode());
        hashCode = prime * hashCode + ((getOwningProjectId() == null) ? 0 : getOwningProjectId().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public CreateFormTypeResult clone() {
        try {
            return (CreateFormTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
