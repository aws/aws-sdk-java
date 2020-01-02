/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the target resources of a specific type in your import template (for example, all
 * <code>AWS::S3::Bucket</code> resources) and the properties you can provide during the import to identify resources of
 * that type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ResourceIdentifierSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceIdentifierSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The template resource type of the target resources, such as <code>AWS::S3::Bucket</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The logical IDs of the target resources of the specified <code>ResourceType</code>, as defined in the import
     * template.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> logicalResourceIds;
    /**
     * <p>
     * The resource properties you can provide during the import to identify your target resources. For example,
     * <code>BucketName</code> is a possible identifier property for <code>AWS::S3::Bucket</code> resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceIdentifiers;

    /**
     * <p>
     * The template resource type of the target resources, such as <code>AWS::S3::Bucket</code>.
     * </p>
     * 
     * @param resourceType
     *        The template resource type of the target resources, such as <code>AWS::S3::Bucket</code>.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The template resource type of the target resources, such as <code>AWS::S3::Bucket</code>.
     * </p>
     * 
     * @return The template resource type of the target resources, such as <code>AWS::S3::Bucket</code>.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The template resource type of the target resources, such as <code>AWS::S3::Bucket</code>.
     * </p>
     * 
     * @param resourceType
     *        The template resource type of the target resources, such as <code>AWS::S3::Bucket</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceIdentifierSummary withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The logical IDs of the target resources of the specified <code>ResourceType</code>, as defined in the import
     * template.
     * </p>
     * 
     * @return The logical IDs of the target resources of the specified <code>ResourceType</code>, as defined in the
     *         import template.
     */

    public java.util.List<String> getLogicalResourceIds() {
        if (logicalResourceIds == null) {
            logicalResourceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return logicalResourceIds;
    }

    /**
     * <p>
     * The logical IDs of the target resources of the specified <code>ResourceType</code>, as defined in the import
     * template.
     * </p>
     * 
     * @param logicalResourceIds
     *        The logical IDs of the target resources of the specified <code>ResourceType</code>, as defined in the
     *        import template.
     */

    public void setLogicalResourceIds(java.util.Collection<String> logicalResourceIds) {
        if (logicalResourceIds == null) {
            this.logicalResourceIds = null;
            return;
        }

        this.logicalResourceIds = new com.amazonaws.internal.SdkInternalList<String>(logicalResourceIds);
    }

    /**
     * <p>
     * The logical IDs of the target resources of the specified <code>ResourceType</code>, as defined in the import
     * template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogicalResourceIds(java.util.Collection)} or {@link #withLogicalResourceIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param logicalResourceIds
     *        The logical IDs of the target resources of the specified <code>ResourceType</code>, as defined in the
     *        import template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceIdentifierSummary withLogicalResourceIds(String... logicalResourceIds) {
        if (this.logicalResourceIds == null) {
            setLogicalResourceIds(new com.amazonaws.internal.SdkInternalList<String>(logicalResourceIds.length));
        }
        for (String ele : logicalResourceIds) {
            this.logicalResourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The logical IDs of the target resources of the specified <code>ResourceType</code>, as defined in the import
     * template.
     * </p>
     * 
     * @param logicalResourceIds
     *        The logical IDs of the target resources of the specified <code>ResourceType</code>, as defined in the
     *        import template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceIdentifierSummary withLogicalResourceIds(java.util.Collection<String> logicalResourceIds) {
        setLogicalResourceIds(logicalResourceIds);
        return this;
    }

    /**
     * <p>
     * The resource properties you can provide during the import to identify your target resources. For example,
     * <code>BucketName</code> is a possible identifier property for <code>AWS::S3::Bucket</code> resources.
     * </p>
     * 
     * @return The resource properties you can provide during the import to identify your target resources. For example,
     *         <code>BucketName</code> is a possible identifier property for <code>AWS::S3::Bucket</code> resources.
     */

    public java.util.List<String> getResourceIdentifiers() {
        if (resourceIdentifiers == null) {
            resourceIdentifiers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceIdentifiers;
    }

    /**
     * <p>
     * The resource properties you can provide during the import to identify your target resources. For example,
     * <code>BucketName</code> is a possible identifier property for <code>AWS::S3::Bucket</code> resources.
     * </p>
     * 
     * @param resourceIdentifiers
     *        The resource properties you can provide during the import to identify your target resources. For example,
     *        <code>BucketName</code> is a possible identifier property for <code>AWS::S3::Bucket</code> resources.
     */

    public void setResourceIdentifiers(java.util.Collection<String> resourceIdentifiers) {
        if (resourceIdentifiers == null) {
            this.resourceIdentifiers = null;
            return;
        }

        this.resourceIdentifiers = new com.amazonaws.internal.SdkInternalList<String>(resourceIdentifiers);
    }

    /**
     * <p>
     * The resource properties you can provide during the import to identify your target resources. For example,
     * <code>BucketName</code> is a possible identifier property for <code>AWS::S3::Bucket</code> resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIdentifiers(java.util.Collection)} or {@link #withResourceIdentifiers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceIdentifiers
     *        The resource properties you can provide during the import to identify your target resources. For example,
     *        <code>BucketName</code> is a possible identifier property for <code>AWS::S3::Bucket</code> resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceIdentifierSummary withResourceIdentifiers(String... resourceIdentifiers) {
        if (this.resourceIdentifiers == null) {
            setResourceIdentifiers(new com.amazonaws.internal.SdkInternalList<String>(resourceIdentifiers.length));
        }
        for (String ele : resourceIdentifiers) {
            this.resourceIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource properties you can provide during the import to identify your target resources. For example,
     * <code>BucketName</code> is a possible identifier property for <code>AWS::S3::Bucket</code> resources.
     * </p>
     * 
     * @param resourceIdentifiers
     *        The resource properties you can provide during the import to identify your target resources. For example,
     *        <code>BucketName</code> is a possible identifier property for <code>AWS::S3::Bucket</code> resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceIdentifierSummary withResourceIdentifiers(java.util.Collection<String> resourceIdentifiers) {
        setResourceIdentifiers(resourceIdentifiers);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getLogicalResourceIds() != null)
            sb.append("LogicalResourceIds: ").append(getLogicalResourceIds()).append(",");
        if (getResourceIdentifiers() != null)
            sb.append("ResourceIdentifiers: ").append(getResourceIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceIdentifierSummary == false)
            return false;
        ResourceIdentifierSummary other = (ResourceIdentifierSummary) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getLogicalResourceIds() == null ^ this.getLogicalResourceIds() == null)
            return false;
        if (other.getLogicalResourceIds() != null && other.getLogicalResourceIds().equals(this.getLogicalResourceIds()) == false)
            return false;
        if (other.getResourceIdentifiers() == null ^ this.getResourceIdentifiers() == null)
            return false;
        if (other.getResourceIdentifiers() != null && other.getResourceIdentifiers().equals(this.getResourceIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getLogicalResourceIds() == null) ? 0 : getLogicalResourceIds().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifiers() == null) ? 0 : getResourceIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public ResourceIdentifierSummary clone() {
        try {
            return (ResourceIdentifierSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
