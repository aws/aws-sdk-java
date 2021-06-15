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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateInstanceStorageConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInstanceStorageConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource type and storage config for the given
     * instance ID.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * A valid resource type.
     * </p>
     */
    private String resourceType;

    private InstanceStorageConfig storageConfig;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceStorageConfigRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource type and storage config for the given
     * instance ID.
     * </p>
     * 
     * @param associationId
     *        The existing association identifier that uniquely identifies the resource type and storage config for the
     *        given instance ID.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource type and storage config for the given
     * instance ID.
     * </p>
     * 
     * @return The existing association identifier that uniquely identifies the resource type and storage config for the
     *         given instance ID.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource type and storage config for the given
     * instance ID.
     * </p>
     * 
     * @param associationId
     *        The existing association identifier that uniquely identifies the resource type and storage config for the
     *        given instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceStorageConfigRequest withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * 
     * @param resourceType
     *        A valid resource type.
     * @see InstanceStorageResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * 
     * @return A valid resource type.
     * @see InstanceStorageResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * 
     * @param resourceType
     *        A valid resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStorageResourceType
     */

    public UpdateInstanceStorageConfigRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * 
     * @param resourceType
     *        A valid resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStorageResourceType
     */

    public UpdateInstanceStorageConfigRequest withResourceType(InstanceStorageResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * @param storageConfig
     */

    public void setStorageConfig(InstanceStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
    }

    /**
     * @return
     */

    public InstanceStorageConfig getStorageConfig() {
        return this.storageConfig;
    }

    /**
     * @param storageConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceStorageConfigRequest withStorageConfig(InstanceStorageConfig storageConfig) {
        setStorageConfig(storageConfig);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getStorageConfig() != null)
            sb.append("StorageConfig: ").append(getStorageConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInstanceStorageConfigRequest == false)
            return false;
        UpdateInstanceStorageConfigRequest other = (UpdateInstanceStorageConfigRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getStorageConfig() == null ^ this.getStorageConfig() == null)
            return false;
        if (other.getStorageConfig() != null && other.getStorageConfig().equals(this.getStorageConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getStorageConfig() == null) ? 0 : getStorageConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInstanceStorageConfigRequest clone() {
        return (UpdateInstanceStorageConfigRequest) super.clone();
    }

}
