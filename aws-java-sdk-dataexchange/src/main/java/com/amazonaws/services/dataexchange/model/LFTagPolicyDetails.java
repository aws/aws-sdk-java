/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the LF-tag policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/LFTagPolicyDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LFTagPolicyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the AWS Glue Data Catalog.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The resource type for which the LF-tag policy applies.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Details for the Lake Formation Resources included in the LF-tag policy.
     * </p>
     */
    private LFResourceDetails resourceDetails;

    /**
     * <p>
     * The identifier for the AWS Glue Data Catalog.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the AWS Glue Data Catalog.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The identifier for the AWS Glue Data Catalog.
     * </p>
     * 
     * @return The identifier for the AWS Glue Data Catalog.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The identifier for the AWS Glue Data Catalog.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the AWS Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LFTagPolicyDetails withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The resource type for which the LF-tag policy applies.
     * </p>
     * 
     * @param resourceType
     *        The resource type for which the LF-tag policy applies.
     * @see LFResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type for which the LF-tag policy applies.
     * </p>
     * 
     * @return The resource type for which the LF-tag policy applies.
     * @see LFResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type for which the LF-tag policy applies.
     * </p>
     * 
     * @param resourceType
     *        The resource type for which the LF-tag policy applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LFResourceType
     */

    public LFTagPolicyDetails withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type for which the LF-tag policy applies.
     * </p>
     * 
     * @param resourceType
     *        The resource type for which the LF-tag policy applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LFResourceType
     */

    public LFTagPolicyDetails withResourceType(LFResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Details for the Lake Formation Resources included in the LF-tag policy.
     * </p>
     * 
     * @param resourceDetails
     *        Details for the Lake Formation Resources included in the LF-tag policy.
     */

    public void setResourceDetails(LFResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    /**
     * <p>
     * Details for the Lake Formation Resources included in the LF-tag policy.
     * </p>
     * 
     * @return Details for the Lake Formation Resources included in the LF-tag policy.
     */

    public LFResourceDetails getResourceDetails() {
        return this.resourceDetails;
    }

    /**
     * <p>
     * Details for the Lake Formation Resources included in the LF-tag policy.
     * </p>
     * 
     * @param resourceDetails
     *        Details for the Lake Formation Resources included in the LF-tag policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LFTagPolicyDetails withResourceDetails(LFResourceDetails resourceDetails) {
        setResourceDetails(resourceDetails);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceDetails() != null)
            sb.append("ResourceDetails: ").append(getResourceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LFTagPolicyDetails == false)
            return false;
        LFTagPolicyDetails other = (LFTagPolicyDetails) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceDetails() == null ^ this.getResourceDetails() == null)
            return false;
        if (other.getResourceDetails() != null && other.getResourceDetails().equals(this.getResourceDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceDetails() == null) ? 0 : getResourceDetails().hashCode());
        return hashCode;
    }

    @Override
    public LFTagPolicyDetails clone() {
        try {
            return (LFTagPolicyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.LFTagPolicyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
