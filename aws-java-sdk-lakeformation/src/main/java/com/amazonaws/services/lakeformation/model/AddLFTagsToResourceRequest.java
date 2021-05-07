/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/AddLFTagsToResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddLFTagsToResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The resource to which to attach a tag.
     * </p>
     */
    private Resource resource;
    /**
     * <p>
     * The tags to attach to the resource.
     * </p>
     */
    private java.util.List<LFTagPair> lFTags;

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your AWS Lake Formation environment.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @return The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *         metadata store. It contains database definitions, table definitions, and other control information to
     *         manage your AWS Lake Formation environment.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your AWS Lake Formation environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddLFTagsToResourceRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The resource to which to attach a tag.
     * </p>
     * 
     * @param resource
     *        The resource to which to attach a tag.
     */

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource to which to attach a tag.
     * </p>
     * 
     * @return The resource to which to attach a tag.
     */

    public Resource getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource to which to attach a tag.
     * </p>
     * 
     * @param resource
     *        The resource to which to attach a tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddLFTagsToResourceRequest withResource(Resource resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The tags to attach to the resource.
     * </p>
     * 
     * @return The tags to attach to the resource.
     */

    public java.util.List<LFTagPair> getLFTags() {
        return lFTags;
    }

    /**
     * <p>
     * The tags to attach to the resource.
     * </p>
     * 
     * @param lFTags
     *        The tags to attach to the resource.
     */

    public void setLFTags(java.util.Collection<LFTagPair> lFTags) {
        if (lFTags == null) {
            this.lFTags = null;
            return;
        }

        this.lFTags = new java.util.ArrayList<LFTagPair>(lFTags);
    }

    /**
     * <p>
     * The tags to attach to the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLFTags(java.util.Collection)} or {@link #withLFTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param lFTags
     *        The tags to attach to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddLFTagsToResourceRequest withLFTags(LFTagPair... lFTags) {
        if (this.lFTags == null) {
            setLFTags(new java.util.ArrayList<LFTagPair>(lFTags.length));
        }
        for (LFTagPair ele : lFTags) {
            this.lFTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to attach to the resource.
     * </p>
     * 
     * @param lFTags
     *        The tags to attach to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddLFTagsToResourceRequest withLFTags(java.util.Collection<LFTagPair> lFTags) {
        setLFTags(lFTags);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getLFTags() != null)
            sb.append("LFTags: ").append(getLFTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddLFTagsToResourceRequest == false)
            return false;
        AddLFTagsToResourceRequest other = (AddLFTagsToResourceRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getLFTags() == null ^ this.getLFTags() == null)
            return false;
        if (other.getLFTags() != null && other.getLFTags().equals(this.getLFTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getLFTags() == null) ? 0 : getLFTags().hashCode());
        return hashCode;
    }

    @Override
    public AddLFTagsToResourceRequest clone() {
        return (AddLFTagsToResourceRequest) super.clone();
    }

}
