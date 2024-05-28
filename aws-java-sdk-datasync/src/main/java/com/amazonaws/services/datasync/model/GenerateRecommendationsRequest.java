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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/GenerateRecommendations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your on-premises
     * storage system.
     * </p>
     */
    private String discoveryJobArn;
    /**
     * <p>
     * Specifies the universally unique identifiers (UUIDs) of the resources in your storage system that you want
     * recommendations on.
     * </p>
     */
    private java.util.List<String> resourceIds;
    /**
     * <p>
     * Specifies the type of resource in your storage system that you want recommendations on.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your on-premises
     * storage system.
     * </p>
     * 
     * @param discoveryJobArn
     *        Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your
     *        on-premises storage system.
     */

    public void setDiscoveryJobArn(String discoveryJobArn) {
        this.discoveryJobArn = discoveryJobArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your on-premises
     * storage system.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your
     *         on-premises storage system.
     */

    public String getDiscoveryJobArn() {
        return this.discoveryJobArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your on-premises
     * storage system.
     * </p>
     * 
     * @param discoveryJobArn
     *        Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your
     *        on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateRecommendationsRequest withDiscoveryJobArn(String discoveryJobArn) {
        setDiscoveryJobArn(discoveryJobArn);
        return this;
    }

    /**
     * <p>
     * Specifies the universally unique identifiers (UUIDs) of the resources in your storage system that you want
     * recommendations on.
     * </p>
     * 
     * @return Specifies the universally unique identifiers (UUIDs) of the resources in your storage system that you
     *         want recommendations on.
     */

    public java.util.List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * <p>
     * Specifies the universally unique identifiers (UUIDs) of the resources in your storage system that you want
     * recommendations on.
     * </p>
     * 
     * @param resourceIds
     *        Specifies the universally unique identifiers (UUIDs) of the resources in your storage system that you want
     *        recommendations on.
     */

    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new java.util.ArrayList<String>(resourceIds);
    }

    /**
     * <p>
     * Specifies the universally unique identifiers (UUIDs) of the resources in your storage system that you want
     * recommendations on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        Specifies the universally unique identifiers (UUIDs) of the resources in your storage system that you want
     *        recommendations on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateRecommendationsRequest withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new java.util.ArrayList<String>(resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the universally unique identifiers (UUIDs) of the resources in your storage system that you want
     * recommendations on.
     * </p>
     * 
     * @param resourceIds
     *        Specifies the universally unique identifiers (UUIDs) of the resources in your storage system that you want
     *        recommendations on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateRecommendationsRequest withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

    /**
     * <p>
     * Specifies the type of resource in your storage system that you want recommendations on.
     * </p>
     * 
     * @param resourceType
     *        Specifies the type of resource in your storage system that you want recommendations on.
     * @see DiscoveryResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Specifies the type of resource in your storage system that you want recommendations on.
     * </p>
     * 
     * @return Specifies the type of resource in your storage system that you want recommendations on.
     * @see DiscoveryResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Specifies the type of resource in your storage system that you want recommendations on.
     * </p>
     * 
     * @param resourceType
     *        Specifies the type of resource in your storage system that you want recommendations on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryResourceType
     */

    public GenerateRecommendationsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of resource in your storage system that you want recommendations on.
     * </p>
     * 
     * @param resourceType
     *        Specifies the type of resource in your storage system that you want recommendations on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryResourceType
     */

    public GenerateRecommendationsRequest withResourceType(DiscoveryResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getDiscoveryJobArn() != null)
            sb.append("DiscoveryJobArn: ").append(getDiscoveryJobArn()).append(",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateRecommendationsRequest == false)
            return false;
        GenerateRecommendationsRequest other = (GenerateRecommendationsRequest) obj;
        if (other.getDiscoveryJobArn() == null ^ this.getDiscoveryJobArn() == null)
            return false;
        if (other.getDiscoveryJobArn() != null && other.getDiscoveryJobArn().equals(this.getDiscoveryJobArn()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiscoveryJobArn() == null) ? 0 : getDiscoveryJobArn().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public GenerateRecommendationsRequest clone() {
        return (GenerateRecommendationsRequest) super.clone();
    }

}
