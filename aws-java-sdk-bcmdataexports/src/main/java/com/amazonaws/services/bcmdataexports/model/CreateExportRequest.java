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
package com.amazonaws.services.bcmdataexports.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/CreateExport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the export, including data query, name, description, and destination configuration.
     * </p>
     */
    private Export export;
    /**
     * <p>
     * An optional list of tags to associate with the specified export. Each tag consists of a key and a value, and each
     * key must be unique for the resource.
     * </p>
     */
    private java.util.List<ResourceTag> resourceTags;

    /**
     * <p>
     * The details of the export, including data query, name, description, and destination configuration.
     * </p>
     * 
     * @param export
     *        The details of the export, including data query, name, description, and destination configuration.
     */

    public void setExport(Export export) {
        this.export = export;
    }

    /**
     * <p>
     * The details of the export, including data query, name, description, and destination configuration.
     * </p>
     * 
     * @return The details of the export, including data query, name, description, and destination configuration.
     */

    public Export getExport() {
        return this.export;
    }

    /**
     * <p>
     * The details of the export, including data query, name, description, and destination configuration.
     * </p>
     * 
     * @param export
     *        The details of the export, including data query, name, description, and destination configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportRequest withExport(Export export) {
        setExport(export);
        return this;
    }

    /**
     * <p>
     * An optional list of tags to associate with the specified export. Each tag consists of a key and a value, and each
     * key must be unique for the resource.
     * </p>
     * 
     * @return An optional list of tags to associate with the specified export. Each tag consists of a key and a value,
     *         and each key must be unique for the resource.
     */

    public java.util.List<ResourceTag> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * An optional list of tags to associate with the specified export. Each tag consists of a key and a value, and each
     * key must be unique for the resource.
     * </p>
     * 
     * @param resourceTags
     *        An optional list of tags to associate with the specified export. Each tag consists of a key and a value,
     *        and each key must be unique for the resource.
     */

    public void setResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        if (resourceTags == null) {
            this.resourceTags = null;
            return;
        }

        this.resourceTags = new java.util.ArrayList<ResourceTag>(resourceTags);
    }

    /**
     * <p>
     * An optional list of tags to associate with the specified export. Each tag consists of a key and a value, and each
     * key must be unique for the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        An optional list of tags to associate with the specified export. Each tag consists of a key and a value,
     *        and each key must be unique for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportRequest withResourceTags(ResourceTag... resourceTags) {
        if (this.resourceTags == null) {
            setResourceTags(new java.util.ArrayList<ResourceTag>(resourceTags.length));
        }
        for (ResourceTag ele : resourceTags) {
            this.resourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of tags to associate with the specified export. Each tag consists of a key and a value, and each
     * key must be unique for the resource.
     * </p>
     * 
     * @param resourceTags
     *        An optional list of tags to associate with the specified export. Each tag consists of a key and a value,
     *        and each key must be unique for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportRequest withResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        setResourceTags(resourceTags);
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
        if (getExport() != null)
            sb.append("Export: ").append(getExport()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExportRequest == false)
            return false;
        CreateExportRequest other = (CreateExportRequest) obj;
        if (other.getExport() == null ^ this.getExport() == null)
            return false;
        if (other.getExport() != null && other.getExport().equals(this.getExport()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExport() == null) ? 0 : getExport().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateExportRequest clone() {
        return (CreateExportRequest) super.clone();
    }

}
