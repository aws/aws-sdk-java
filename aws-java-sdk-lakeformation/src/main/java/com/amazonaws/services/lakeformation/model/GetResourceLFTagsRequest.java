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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetResourceLFTags" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceLFTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The resource for which you want to return tags.
     * </p>
     */
    private Resource resource;
    /**
     * <p>
     * Indicates whether to show the assigned tags.
     * </p>
     */
    private Boolean showAssignedLFTags;

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

    public GetResourceLFTagsRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The resource for which you want to return tags.
     * </p>
     * 
     * @param resource
     *        The resource for which you want to return tags.
     */

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource for which you want to return tags.
     * </p>
     * 
     * @return The resource for which you want to return tags.
     */

    public Resource getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource for which you want to return tags.
     * </p>
     * 
     * @param resource
     *        The resource for which you want to return tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceLFTagsRequest withResource(Resource resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * Indicates whether to show the assigned tags.
     * </p>
     * 
     * @param showAssignedLFTags
     *        Indicates whether to show the assigned tags.
     */

    public void setShowAssignedLFTags(Boolean showAssignedLFTags) {
        this.showAssignedLFTags = showAssignedLFTags;
    }

    /**
     * <p>
     * Indicates whether to show the assigned tags.
     * </p>
     * 
     * @return Indicates whether to show the assigned tags.
     */

    public Boolean getShowAssignedLFTags() {
        return this.showAssignedLFTags;
    }

    /**
     * <p>
     * Indicates whether to show the assigned tags.
     * </p>
     * 
     * @param showAssignedLFTags
     *        Indicates whether to show the assigned tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceLFTagsRequest withShowAssignedLFTags(Boolean showAssignedLFTags) {
        setShowAssignedLFTags(showAssignedLFTags);
        return this;
    }

    /**
     * <p>
     * Indicates whether to show the assigned tags.
     * </p>
     * 
     * @return Indicates whether to show the assigned tags.
     */

    public Boolean isShowAssignedLFTags() {
        return this.showAssignedLFTags;
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
        if (getShowAssignedLFTags() != null)
            sb.append("ShowAssignedLFTags: ").append(getShowAssignedLFTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceLFTagsRequest == false)
            return false;
        GetResourceLFTagsRequest other = (GetResourceLFTagsRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getShowAssignedLFTags() == null ^ this.getShowAssignedLFTags() == null)
            return false;
        if (other.getShowAssignedLFTags() != null && other.getShowAssignedLFTags().equals(this.getShowAssignedLFTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getShowAssignedLFTags() == null) ? 0 : getShowAssignedLFTags().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceLFTagsRequest clone() {
        return (GetResourceLFTagsRequest) super.clone();
    }

}
