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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A resource catalog containing all of the resources of a specific resource type within a resource owner account. For
 * an example on sharing the Amazon SageMaker Feature Store <code>DefaultFeatureGroupCatalog</code>, see <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/feature-store-cross-account-discoverability-share-sagemaker-catalog.html"
 * >Share Amazon SageMaker Catalog resource type</a> in the Amazon SageMaker Developer Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ResourceCatalog" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceCatalog implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <code>ResourceCatalog</code>.
     * </p>
     */
    private String resourceCatalogArn;
    /**
     * <p>
     * The name of the <code>ResourceCatalog</code>.
     * </p>
     */
    private String resourceCatalogName;
    /**
     * <p>
     * A free form description of the <code>ResourceCatalog</code>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time the <code>ResourceCatalog</code> was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <code>ResourceCatalog</code>.
     * </p>
     * 
     * @param resourceCatalogArn
     *        The Amazon Resource Name (ARN) of the <code>ResourceCatalog</code>.
     */

    public void setResourceCatalogArn(String resourceCatalogArn) {
        this.resourceCatalogArn = resourceCatalogArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <code>ResourceCatalog</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the <code>ResourceCatalog</code>.
     */

    public String getResourceCatalogArn() {
        return this.resourceCatalogArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <code>ResourceCatalog</code>.
     * </p>
     * 
     * @param resourceCatalogArn
     *        The Amazon Resource Name (ARN) of the <code>ResourceCatalog</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCatalog withResourceCatalogArn(String resourceCatalogArn) {
        setResourceCatalogArn(resourceCatalogArn);
        return this;
    }

    /**
     * <p>
     * The name of the <code>ResourceCatalog</code>.
     * </p>
     * 
     * @param resourceCatalogName
     *        The name of the <code>ResourceCatalog</code>.
     */

    public void setResourceCatalogName(String resourceCatalogName) {
        this.resourceCatalogName = resourceCatalogName;
    }

    /**
     * <p>
     * The name of the <code>ResourceCatalog</code>.
     * </p>
     * 
     * @return The name of the <code>ResourceCatalog</code>.
     */

    public String getResourceCatalogName() {
        return this.resourceCatalogName;
    }

    /**
     * <p>
     * The name of the <code>ResourceCatalog</code>.
     * </p>
     * 
     * @param resourceCatalogName
     *        The name of the <code>ResourceCatalog</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCatalog withResourceCatalogName(String resourceCatalogName) {
        setResourceCatalogName(resourceCatalogName);
        return this;
    }

    /**
     * <p>
     * A free form description of the <code>ResourceCatalog</code>.
     * </p>
     * 
     * @param description
     *        A free form description of the <code>ResourceCatalog</code>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A free form description of the <code>ResourceCatalog</code>.
     * </p>
     * 
     * @return A free form description of the <code>ResourceCatalog</code>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A free form description of the <code>ResourceCatalog</code>.
     * </p>
     * 
     * @param description
     *        A free form description of the <code>ResourceCatalog</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCatalog withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time the <code>ResourceCatalog</code> was created.
     * </p>
     * 
     * @param creationTime
     *        The time the <code>ResourceCatalog</code> was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the <code>ResourceCatalog</code> was created.
     * </p>
     * 
     * @return The time the <code>ResourceCatalog</code> was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the <code>ResourceCatalog</code> was created.
     * </p>
     * 
     * @param creationTime
     *        The time the <code>ResourceCatalog</code> was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCatalog withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getResourceCatalogArn() != null)
            sb.append("ResourceCatalogArn: ").append(getResourceCatalogArn()).append(",");
        if (getResourceCatalogName() != null)
            sb.append("ResourceCatalogName: ").append(getResourceCatalogName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceCatalog == false)
            return false;
        ResourceCatalog other = (ResourceCatalog) obj;
        if (other.getResourceCatalogArn() == null ^ this.getResourceCatalogArn() == null)
            return false;
        if (other.getResourceCatalogArn() != null && other.getResourceCatalogArn().equals(this.getResourceCatalogArn()) == false)
            return false;
        if (other.getResourceCatalogName() == null ^ this.getResourceCatalogName() == null)
            return false;
        if (other.getResourceCatalogName() != null && other.getResourceCatalogName().equals(this.getResourceCatalogName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceCatalogArn() == null) ? 0 : getResourceCatalogArn().hashCode());
        hashCode = prime * hashCode + ((getResourceCatalogName() == null) ? 0 : getResourceCatalogName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public ResourceCatalog clone() {
        try {
            return (ResourceCatalog) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ResourceCatalogMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
