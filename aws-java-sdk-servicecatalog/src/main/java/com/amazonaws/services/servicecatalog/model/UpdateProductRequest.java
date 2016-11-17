/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateProductRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The identifier of the product for the update request.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The updated product name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The updated owner of the product.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The updated text description of the product.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The updated distributor of the product.
     * </p>
     */
    private String distributor;
    /**
     * <p>
     * The updated support description for the product.
     * </p>
     */
    private String supportDescription;
    /**
     * <p>
     * The updated support email for the product.
     * </p>
     */
    private String supportEmail;
    /**
     * <p>
     * The updated support URL for the product.
     * </p>
     */
    private String supportUrl;
    /**
     * <p>
     * Tags to add to the existing list of tags associated with the product.
     * </p>
     */
    private java.util.List<Tag> addTags;
    /**
     * <p>
     * Tags to remove from the existing list of tags associated with the product.
     * </p>
     */
    private java.util.List<String> removeTags;

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @param acceptLanguage
     *        The language code to use for this operation. Supported language codes are as follows:</p>
     *        <p>
     *        "en" (English)
     *        </p>
     *        <p>
     *        "jp" (Japanese)
     *        </p>
     *        <p>
     *        "zh" (Chinese)
     *        </p>
     *        <p>
     *        If no code is specified, "en" is used as the default.
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @return The language code to use for this operation. Supported language codes are as follows:</p>
     *         <p>
     *         "en" (English)
     *         </p>
     *         <p>
     *         "jp" (Japanese)
     *         </p>
     *         <p>
     *         "zh" (Chinese)
     *         </p>
     *         <p>
     *         If no code is specified, "en" is used as the default.
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @param acceptLanguage
     *        The language code to use for this operation. Supported language codes are as follows:</p>
     *        <p>
     *        "en" (English)
     *        </p>
     *        <p>
     *        "jp" (Japanese)
     *        </p>
     *        <p>
     *        "zh" (Chinese)
     *        </p>
     *        <p>
     *        If no code is specified, "en" is used as the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The identifier of the product for the update request.
     * </p>
     * 
     * @param id
     *        The identifier of the product for the update request.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the product for the update request.
     * </p>
     * 
     * @return The identifier of the product for the update request.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the product for the update request.
     * </p>
     * 
     * @param id
     *        The identifier of the product for the update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The updated product name.
     * </p>
     * 
     * @param name
     *        The updated product name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The updated product name.
     * </p>
     * 
     * @return The updated product name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The updated product name.
     * </p>
     * 
     * @param name
     *        The updated product name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The updated owner of the product.
     * </p>
     * 
     * @param owner
     *        The updated owner of the product.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The updated owner of the product.
     * </p>
     * 
     * @return The updated owner of the product.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The updated owner of the product.
     * </p>
     * 
     * @param owner
     *        The updated owner of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductRequest withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The updated text description of the product.
     * </p>
     * 
     * @param description
     *        The updated text description of the product.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated text description of the product.
     * </p>
     * 
     * @return The updated text description of the product.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated text description of the product.
     * </p>
     * 
     * @param description
     *        The updated text description of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The updated distributor of the product.
     * </p>
     * 
     * @param distributor
     *        The updated distributor of the product.
     */

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    /**
     * <p>
     * The updated distributor of the product.
     * </p>
     * 
     * @return The updated distributor of the product.
     */

    public String getDistributor() {
        return this.distributor;
    }

    /**
     * <p>
     * The updated distributor of the product.
     * </p>
     * 
     * @param distributor
     *        The updated distributor of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductRequest withDistributor(String distributor) {
        setDistributor(distributor);
        return this;
    }

    /**
     * <p>
     * The updated support description for the product.
     * </p>
     * 
     * @param supportDescription
     *        The updated support description for the product.
     */

    public void setSupportDescription(String supportDescription) {
        this.supportDescription = supportDescription;
    }

    /**
     * <p>
     * The updated support description for the product.
     * </p>
     * 
     * @return The updated support description for the product.
     */

    public String getSupportDescription() {
        return this.supportDescription;
    }

    /**
     * <p>
     * The updated support description for the product.
     * </p>
     * 
     * @param supportDescription
     *        The updated support description for the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductRequest withSupportDescription(String supportDescription) {
        setSupportDescription(supportDescription);
        return this;
    }

    /**
     * <p>
     * The updated support email for the product.
     * </p>
     * 
     * @param supportEmail
     *        The updated support email for the product.
     */

    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    /**
     * <p>
     * The updated support email for the product.
     * </p>
     * 
     * @return The updated support email for the product.
     */

    public String getSupportEmail() {
        return this.supportEmail;
    }

    /**
     * <p>
     * The updated support email for the product.
     * </p>
     * 
     * @param supportEmail
     *        The updated support email for the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductRequest withSupportEmail(String supportEmail) {
        setSupportEmail(supportEmail);
        return this;
    }

    /**
     * <p>
     * The updated support URL for the product.
     * </p>
     * 
     * @param supportUrl
     *        The updated support URL for the product.
     */

    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    /**
     * <p>
     * The updated support URL for the product.
     * </p>
     * 
     * @return The updated support URL for the product.
     */

    public String getSupportUrl() {
        return this.supportUrl;
    }

    /**
     * <p>
     * The updated support URL for the product.
     * </p>
     * 
     * @param supportUrl
     *        The updated support URL for the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductRequest withSupportUrl(String supportUrl) {
        setSupportUrl(supportUrl);
        return this;
    }

    /**
     * <p>
     * Tags to add to the existing list of tags associated with the product.
     * </p>
     * 
     * @return Tags to add to the existing list of tags associated with the product.
     */

    public java.util.List<Tag> getAddTags() {
        return addTags;
    }

    /**
     * <p>
     * Tags to add to the existing list of tags associated with the product.
     * </p>
     * 
     * @param addTags
     *        Tags to add to the existing list of tags associated with the product.
     */

    public void setAddTags(java.util.Collection<Tag> addTags) {
        if (addTags == null) {
            this.addTags = null;
            return;
        }

        this.addTags = new java.util.ArrayList<Tag>(addTags);
    }

    /**
     * <p>
     * Tags to add to the existing list of tags associated with the product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddTags(java.util.Collection)} or {@link #withAddTags(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param addTags
     *        Tags to add to the existing list of tags associated with the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductRequest withAddTags(Tag... addTags) {
        if (this.addTags == null) {
            setAddTags(new java.util.ArrayList<Tag>(addTags.length));
        }
        for (Tag ele : addTags) {
            this.addTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to add to the existing list of tags associated with the product.
     * </p>
     * 
     * @param addTags
     *        Tags to add to the existing list of tags associated with the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductRequest withAddTags(java.util.Collection<Tag> addTags) {
        setAddTags(addTags);
        return this;
    }

    /**
     * <p>
     * Tags to remove from the existing list of tags associated with the product.
     * </p>
     * 
     * @return Tags to remove from the existing list of tags associated with the product.
     */

    public java.util.List<String> getRemoveTags() {
        return removeTags;
    }

    /**
     * <p>
     * Tags to remove from the existing list of tags associated with the product.
     * </p>
     * 
     * @param removeTags
     *        Tags to remove from the existing list of tags associated with the product.
     */

    public void setRemoveTags(java.util.Collection<String> removeTags) {
        if (removeTags == null) {
            this.removeTags = null;
            return;
        }

        this.removeTags = new java.util.ArrayList<String>(removeTags);
    }

    /**
     * <p>
     * Tags to remove from the existing list of tags associated with the product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveTags(java.util.Collection)} or {@link #withRemoveTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param removeTags
     *        Tags to remove from the existing list of tags associated with the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductRequest withRemoveTags(String... removeTags) {
        if (this.removeTags == null) {
            setRemoveTags(new java.util.ArrayList<String>(removeTags.length));
        }
        for (String ele : removeTags) {
            this.removeTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to remove from the existing list of tags associated with the product.
     * </p>
     * 
     * @param removeTags
     *        Tags to remove from the existing list of tags associated with the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductRequest withRemoveTags(java.util.Collection<String> removeTags) {
        setRemoveTags(removeTags);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: " + getAcceptLanguage() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDistributor() != null)
            sb.append("Distributor: " + getDistributor() + ",");
        if (getSupportDescription() != null)
            sb.append("SupportDescription: " + getSupportDescription() + ",");
        if (getSupportEmail() != null)
            sb.append("SupportEmail: " + getSupportEmail() + ",");
        if (getSupportUrl() != null)
            sb.append("SupportUrl: " + getSupportUrl() + ",");
        if (getAddTags() != null)
            sb.append("AddTags: " + getAddTags() + ",");
        if (getRemoveTags() != null)
            sb.append("RemoveTags: " + getRemoveTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProductRequest == false)
            return false;
        UpdateProductRequest other = (UpdateProductRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDistributor() == null ^ this.getDistributor() == null)
            return false;
        if (other.getDistributor() != null && other.getDistributor().equals(this.getDistributor()) == false)
            return false;
        if (other.getSupportDescription() == null ^ this.getSupportDescription() == null)
            return false;
        if (other.getSupportDescription() != null && other.getSupportDescription().equals(this.getSupportDescription()) == false)
            return false;
        if (other.getSupportEmail() == null ^ this.getSupportEmail() == null)
            return false;
        if (other.getSupportEmail() != null && other.getSupportEmail().equals(this.getSupportEmail()) == false)
            return false;
        if (other.getSupportUrl() == null ^ this.getSupportUrl() == null)
            return false;
        if (other.getSupportUrl() != null && other.getSupportUrl().equals(this.getSupportUrl()) == false)
            return false;
        if (other.getAddTags() == null ^ this.getAddTags() == null)
            return false;
        if (other.getAddTags() != null && other.getAddTags().equals(this.getAddTags()) == false)
            return false;
        if (other.getRemoveTags() == null ^ this.getRemoveTags() == null)
            return false;
        if (other.getRemoveTags() != null && other.getRemoveTags().equals(this.getRemoveTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDistributor() == null) ? 0 : getDistributor().hashCode());
        hashCode = prime * hashCode + ((getSupportDescription() == null) ? 0 : getSupportDescription().hashCode());
        hashCode = prime * hashCode + ((getSupportEmail() == null) ? 0 : getSupportEmail().hashCode());
        hashCode = prime * hashCode + ((getSupportUrl() == null) ? 0 : getSupportUrl().hashCode());
        hashCode = prime * hashCode + ((getAddTags() == null) ? 0 : getAddTags().hashCode());
        hashCode = prime * hashCode + ((getRemoveTags() == null) ? 0 : getRemoveTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProductRequest clone() {
        return (UpdateProductRequest) super.clone();
    }
}
