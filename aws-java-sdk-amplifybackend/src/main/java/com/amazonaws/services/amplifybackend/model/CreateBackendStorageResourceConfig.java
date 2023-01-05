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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The resource configuration for creating backend storage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendStorageResourceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackendStorageResourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The authorization configuration for the storage S3 bucket.
     * </p>
     */
    private BackendStoragePermissions permissions;
    /**
     * <p>
     * The name of the storage service.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        The name of the S3 bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @return The name of the S3 bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        The name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendStorageResourceConfig withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The authorization configuration for the storage S3 bucket.
     * </p>
     * 
     * @param permissions
     *        The authorization configuration for the storage S3 bucket.
     */

    public void setPermissions(BackendStoragePermissions permissions) {
        this.permissions = permissions;
    }

    /**
     * <p>
     * The authorization configuration for the storage S3 bucket.
     * </p>
     * 
     * @return The authorization configuration for the storage S3 bucket.
     */

    public BackendStoragePermissions getPermissions() {
        return this.permissions;
    }

    /**
     * <p>
     * The authorization configuration for the storage S3 bucket.
     * </p>
     * 
     * @param permissions
     *        The authorization configuration for the storage S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendStorageResourceConfig withPermissions(BackendStoragePermissions permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The name of the storage service.
     * </p>
     * 
     * @param serviceName
     *        The name of the storage service.
     * @see ServiceName
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the storage service.
     * </p>
     * 
     * @return The name of the storage service.
     * @see ServiceName
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the storage service.
     * </p>
     * 
     * @param serviceName
     *        The name of the storage service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceName
     */

    public CreateBackendStorageResourceConfig withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The name of the storage service.
     * </p>
     * 
     * @param serviceName
     *        The name of the storage service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceName
     */

    public CreateBackendStorageResourceConfig withServiceName(ServiceName serviceName) {
        this.serviceName = serviceName.toString();
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackendStorageResourceConfig == false)
            return false;
        CreateBackendStorageResourceConfig other = (CreateBackendStorageResourceConfig) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackendStorageResourceConfig clone() {
        try {
            return (CreateBackendStorageResourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.CreateBackendStorageResourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
