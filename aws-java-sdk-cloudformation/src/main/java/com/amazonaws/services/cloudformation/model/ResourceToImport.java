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
 * Describes the target resource of an import operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ResourceToImport" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceToImport implements Serializable, Cloneable {

    /**
     * <p>
     * The type of resource to import into your stack, such as <code>AWS::S3::Bucket</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The logical ID of the target resource as specified in the template.
     * </p>
     */
    private String logicalResourceId;
    /**
     * <p>
     * A key-value pair that identifies the target resource. The key is an identifier property (for example,
     * <code>BucketName</code> for <code>AWS::S3::Bucket</code> resources) and the value is the actual property value
     * (for example, <code>MyS3Bucket</code>).
     * </p>
     */
    private java.util.Map<String, String> resourceIdentifier;

    /**
     * <p>
     * The type of resource to import into your stack, such as <code>AWS::S3::Bucket</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to import into your stack, such as <code>AWS::S3::Bucket</code>.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource to import into your stack, such as <code>AWS::S3::Bucket</code>.
     * </p>
     * 
     * @return The type of resource to import into your stack, such as <code>AWS::S3::Bucket</code>.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource to import into your stack, such as <code>AWS::S3::Bucket</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to import into your stack, such as <code>AWS::S3::Bucket</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceToImport withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The logical ID of the target resource as specified in the template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical ID of the target resource as specified in the template.
     */

    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The logical ID of the target resource as specified in the template.
     * </p>
     * 
     * @return The logical ID of the target resource as specified in the template.
     */

    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * The logical ID of the target resource as specified in the template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical ID of the target resource as specified in the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceToImport withLogicalResourceId(String logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * A key-value pair that identifies the target resource. The key is an identifier property (for example,
     * <code>BucketName</code> for <code>AWS::S3::Bucket</code> resources) and the value is the actual property value
     * (for example, <code>MyS3Bucket</code>).
     * </p>
     * 
     * @return A key-value pair that identifies the target resource. The key is an identifier property (for example,
     *         <code>BucketName</code> for <code>AWS::S3::Bucket</code> resources) and the value is the actual property
     *         value (for example, <code>MyS3Bucket</code>).
     */

    public java.util.Map<String, String> getResourceIdentifier() {
        return resourceIdentifier;
    }

    /**
     * <p>
     * A key-value pair that identifies the target resource. The key is an identifier property (for example,
     * <code>BucketName</code> for <code>AWS::S3::Bucket</code> resources) and the value is the actual property value
     * (for example, <code>MyS3Bucket</code>).
     * </p>
     * 
     * @param resourceIdentifier
     *        A key-value pair that identifies the target resource. The key is an identifier property (for example,
     *        <code>BucketName</code> for <code>AWS::S3::Bucket</code> resources) and the value is the actual property
     *        value (for example, <code>MyS3Bucket</code>).
     */

    public void setResourceIdentifier(java.util.Map<String, String> resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * A key-value pair that identifies the target resource. The key is an identifier property (for example,
     * <code>BucketName</code> for <code>AWS::S3::Bucket</code> resources) and the value is the actual property value
     * (for example, <code>MyS3Bucket</code>).
     * </p>
     * 
     * @param resourceIdentifier
     *        A key-value pair that identifies the target resource. The key is an identifier property (for example,
     *        <code>BucketName</code> for <code>AWS::S3::Bucket</code> resources) and the value is the actual property
     *        value (for example, <code>MyS3Bucket</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceToImport withResourceIdentifier(java.util.Map<String, String> resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * Add a single ResourceIdentifier entry
     *
     * @see ResourceToImport#withResourceIdentifier
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ResourceToImport addResourceIdentifierEntry(String key, String value) {
        if (null == this.resourceIdentifier) {
            this.resourceIdentifier = new java.util.HashMap<String, String>();
        }
        if (this.resourceIdentifier.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.resourceIdentifier.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResourceIdentifier.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceToImport clearResourceIdentifierEntries() {
        this.resourceIdentifier = null;
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
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceToImport == false)
            return false;
        ResourceToImport other = (ResourceToImport) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ResourceToImport clone() {
        try {
            return (ResourceToImport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
