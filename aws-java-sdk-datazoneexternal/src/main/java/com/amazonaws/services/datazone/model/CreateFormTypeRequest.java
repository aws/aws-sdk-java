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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateFormType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFormTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
    private String domainIdentifier;
    /**
     * <p>
     * The model of this Amazon DataZone metadata form type.
     * </p>
     */
    private Model model;
    /**
     * <p>
     * The name of this Amazon DataZone metadata form type.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the Amazon DataZone project that owns this metadata form type.
     * </p>
     */
    private String owningProjectIdentifier;
    /**
     * <p>
     * The status of this Amazon DataZone metadata form type.
     * </p>
     */
    private String status;

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

    public CreateFormTypeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this metadata form type is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which this metadata form type is created.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this metadata form type is created.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which this metadata form type is created.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this metadata form type is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which this metadata form type is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFormTypeRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The model of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @param model
     *        The model of this Amazon DataZone metadata form type.
     */

    public void setModel(Model model) {
        this.model = model;
    }

    /**
     * <p>
     * The model of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @return The model of this Amazon DataZone metadata form type.
     */

    public Model getModel() {
        return this.model;
    }

    /**
     * <p>
     * The model of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @param model
     *        The model of this Amazon DataZone metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFormTypeRequest withModel(Model model) {
        setModel(model);
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

    public CreateFormTypeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone project that owns this metadata form type.
     * </p>
     * 
     * @param owningProjectIdentifier
     *        The ID of the Amazon DataZone project that owns this metadata form type.
     */

    public void setOwningProjectIdentifier(String owningProjectIdentifier) {
        this.owningProjectIdentifier = owningProjectIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone project that owns this metadata form type.
     * </p>
     * 
     * @return The ID of the Amazon DataZone project that owns this metadata form type.
     */

    public String getOwningProjectIdentifier() {
        return this.owningProjectIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone project that owns this metadata form type.
     * </p>
     * 
     * @param owningProjectIdentifier
     *        The ID of the Amazon DataZone project that owns this metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFormTypeRequest withOwningProjectIdentifier(String owningProjectIdentifier) {
        setOwningProjectIdentifier(owningProjectIdentifier);
        return this;
    }

    /**
     * <p>
     * The status of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @param status
     *        The status of this Amazon DataZone metadata form type.
     * @see FormTypeStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @return The status of this Amazon DataZone metadata form type.
     * @see FormTypeStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @param status
     *        The status of this Amazon DataZone metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormTypeStatus
     */

    public CreateFormTypeRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of this Amazon DataZone metadata form type.
     * </p>
     * 
     * @param status
     *        The status of this Amazon DataZone metadata form type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormTypeStatus
     */

    public CreateFormTypeRequest withStatus(FormTypeStatus status) {
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getOwningProjectIdentifier() != null)
            sb.append("OwningProjectIdentifier: ").append(getOwningProjectIdentifier()).append(",");
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

        if (obj instanceof CreateFormTypeRequest == false)
            return false;
        CreateFormTypeRequest other = (CreateFormTypeRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwningProjectIdentifier() == null ^ this.getOwningProjectIdentifier() == null)
            return false;
        if (other.getOwningProjectIdentifier() != null && other.getOwningProjectIdentifier().equals(this.getOwningProjectIdentifier()) == false)
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
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwningProjectIdentifier() == null) ? 0 : getOwningProjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateFormTypeRequest clone() {
        return (CreateFormTypeRequest) super.clone();
    }

}
