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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateAssetType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssetTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The descripton of the custom asset type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the Amazon DataZone domain where the custom asset type is being created.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The metadata forms that are to be attached to the custom asset type.
     * </p>
     */
    private java.util.Map<String, FormEntryInput> formsInput;
    /**
     * <p>
     * The name of the custom asset type.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the Amazon DataZone project that is to own the custom asset type.
     * </p>
     */
    private String owningProjectIdentifier;

    /**
     * <p>
     * The descripton of the custom asset type.
     * </p>
     * 
     * @param description
     *        The descripton of the custom asset type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The descripton of the custom asset type.
     * </p>
     * 
     * @return The descripton of the custom asset type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The descripton of the custom asset type.
     * </p>
     * 
     * @param description
     *        The descripton of the custom asset type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetTypeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the Amazon DataZone domain where the custom asset type is being created.
     * </p>
     * 
     * @param domainIdentifier
     *        The unique identifier of the Amazon DataZone domain where the custom asset type is being created.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the Amazon DataZone domain where the custom asset type is being created.
     * </p>
     * 
     * @return The unique identifier of the Amazon DataZone domain where the custom asset type is being created.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the Amazon DataZone domain where the custom asset type is being created.
     * </p>
     * 
     * @param domainIdentifier
     *        The unique identifier of the Amazon DataZone domain where the custom asset type is being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetTypeRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The metadata forms that are to be attached to the custom asset type.
     * </p>
     * 
     * @return The metadata forms that are to be attached to the custom asset type.
     */

    public java.util.Map<String, FormEntryInput> getFormsInput() {
        return formsInput;
    }

    /**
     * <p>
     * The metadata forms that are to be attached to the custom asset type.
     * </p>
     * 
     * @param formsInput
     *        The metadata forms that are to be attached to the custom asset type.
     */

    public void setFormsInput(java.util.Map<String, FormEntryInput> formsInput) {
        this.formsInput = formsInput;
    }

    /**
     * <p>
     * The metadata forms that are to be attached to the custom asset type.
     * </p>
     * 
     * @param formsInput
     *        The metadata forms that are to be attached to the custom asset type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetTypeRequest withFormsInput(java.util.Map<String, FormEntryInput> formsInput) {
        setFormsInput(formsInput);
        return this;
    }

    /**
     * Add a single FormsInput entry
     *
     * @see CreateAssetTypeRequest#withFormsInput
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetTypeRequest addFormsInputEntry(String key, FormEntryInput value) {
        if (null == this.formsInput) {
            this.formsInput = new java.util.HashMap<String, FormEntryInput>();
        }
        if (this.formsInput.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.formsInput.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FormsInput.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetTypeRequest clearFormsInputEntries() {
        this.formsInput = null;
        return this;
    }

    /**
     * <p>
     * The name of the custom asset type.
     * </p>
     * 
     * @param name
     *        The name of the custom asset type.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom asset type.
     * </p>
     * 
     * @return The name of the custom asset type.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the custom asset type.
     * </p>
     * 
     * @param name
     *        The name of the custom asset type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetTypeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project that is to own the custom asset type.
     * </p>
     * 
     * @param owningProjectIdentifier
     *        The identifier of the Amazon DataZone project that is to own the custom asset type.
     */

    public void setOwningProjectIdentifier(String owningProjectIdentifier) {
        this.owningProjectIdentifier = owningProjectIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project that is to own the custom asset type.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone project that is to own the custom asset type.
     */

    public String getOwningProjectIdentifier() {
        return this.owningProjectIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project that is to own the custom asset type.
     * </p>
     * 
     * @param owningProjectIdentifier
     *        The identifier of the Amazon DataZone project that is to own the custom asset type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetTypeRequest withOwningProjectIdentifier(String owningProjectIdentifier) {
        setOwningProjectIdentifier(owningProjectIdentifier);
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
        if (getFormsInput() != null)
            sb.append("FormsInput: ").append(getFormsInput()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwningProjectIdentifier() != null)
            sb.append("OwningProjectIdentifier: ").append(getOwningProjectIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssetTypeRequest == false)
            return false;
        CreateAssetTypeRequest other = (CreateAssetTypeRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getFormsInput() == null ^ this.getFormsInput() == null)
            return false;
        if (other.getFormsInput() != null && other.getFormsInput().equals(this.getFormsInput()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwningProjectIdentifier() == null ^ this.getOwningProjectIdentifier() == null)
            return false;
        if (other.getOwningProjectIdentifier() != null && other.getOwningProjectIdentifier().equals(this.getOwningProjectIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFormsInput() == null) ? 0 : getFormsInput().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwningProjectIdentifier() == null) ? 0 : getOwningProjectIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssetTypeRequest clone() {
        return (CreateAssetTypeRequest) super.clone();
    }

}
