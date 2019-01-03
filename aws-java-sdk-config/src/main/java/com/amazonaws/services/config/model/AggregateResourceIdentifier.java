/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details that identify a resource that is collected by AWS Config aggregator, including the resource type, ID, (if
 * available) the custom resource name, the source account, and source region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/AggregateResourceIdentifier" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregateResourceIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 12-digit account ID of the source account.
     * </p>
     */
    private String sourceAccountId;
    /**
     * <p>
     * The source region where data is aggregated.
     * </p>
     */
    private String sourceRegion;
    /**
     * <p>
     * The ID of the AWS resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of the AWS resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The name of the AWS resource.
     * </p>
     */
    private String resourceName;

    /**
     * <p>
     * The 12-digit account ID of the source account.
     * </p>
     * 
     * @param sourceAccountId
     *        The 12-digit account ID of the source account.
     */

    public void setSourceAccountId(String sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    /**
     * <p>
     * The 12-digit account ID of the source account.
     * </p>
     * 
     * @return The 12-digit account ID of the source account.
     */

    public String getSourceAccountId() {
        return this.sourceAccountId;
    }

    /**
     * <p>
     * The 12-digit account ID of the source account.
     * </p>
     * 
     * @param sourceAccountId
     *        The 12-digit account ID of the source account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateResourceIdentifier withSourceAccountId(String sourceAccountId) {
        setSourceAccountId(sourceAccountId);
        return this;
    }

    /**
     * <p>
     * The source region where data is aggregated.
     * </p>
     * 
     * @param sourceRegion
     *        The source region where data is aggregated.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The source region where data is aggregated.
     * </p>
     * 
     * @return The source region where data is aggregated.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The source region where data is aggregated.
     * </p>
     * 
     * @param sourceRegion
     *        The source region where data is aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateResourceIdentifier withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the AWS resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the AWS resource.
     * </p>
     * 
     * @return The ID of the AWS resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the AWS resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateResourceIdentifier withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of the AWS resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the AWS resource.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the AWS resource.
     * </p>
     * 
     * @return The type of the AWS resource.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the AWS resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public AggregateResourceIdentifier withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the AWS resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public AggregateResourceIdentifier withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the AWS resource.
     * </p>
     * 
     * @param resourceName
     *        The name of the AWS resource.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the AWS resource.
     * </p>
     * 
     * @return The name of the AWS resource.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the AWS resource.
     * </p>
     * 
     * @param resourceName
     *        The name of the AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateResourceIdentifier withResourceName(String resourceName) {
        setResourceName(resourceName);
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
        if (getSourceAccountId() != null)
            sb.append("SourceAccountId: ").append(getSourceAccountId()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregateResourceIdentifier == false)
            return false;
        AggregateResourceIdentifier other = (AggregateResourceIdentifier) obj;
        if (other.getSourceAccountId() == null ^ this.getSourceAccountId() == null)
            return false;
        if (other.getSourceAccountId() != null && other.getSourceAccountId().equals(this.getSourceAccountId()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceAccountId() == null) ? 0 : getSourceAccountId().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        return hashCode;
    }

    @Override
    public AggregateResourceIdentifier clone() {
        try {
            return (AggregateResourceIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.AggregateResourceIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
