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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing metadata for a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ResourceMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The unique identifier for the resource.
     * </p>
     */
    private String uid;
    /**
     * <p>
     * The version of the resource. Resources are created at version 1, and this version is incremented each time that
     * they're updated.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the resource.
     * </p>
     * 
     * @param arn
     *        The full Amazon Resource Name (ARN) for the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the resource.
     * </p>
     * 
     * @return The full Amazon Resource Name (ARN) for the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the resource.
     * </p>
     * 
     * @param arn
     *        The full Amazon Resource Name (ARN) for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMetadata withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMetadata withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The Unix epoch timestamp in seconds for when the resource was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was last updated.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The Unix epoch timestamp in seconds for when the resource was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMetadata withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the resource.
     * </p>
     * 
     * @param uid
     *        The unique identifier for the resource.
     */

    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * <p>
     * The unique identifier for the resource.
     * </p>
     * 
     * @return The unique identifier for the resource.
     */

    public String getUid() {
        return this.uid;
    }

    /**
     * <p>
     * The unique identifier for the resource.
     * </p>
     * 
     * @param uid
     *        The unique identifier for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMetadata withUid(String uid) {
        setUid(uid);
        return this;
    }

    /**
     * <p>
     * The version of the resource. Resources are created at version 1, and this version is incremented each time that
     * they're updated.
     * </p>
     * 
     * @param version
     *        The version of the resource. Resources are created at version 1, and this version is incremented each time
     *        that they're updated.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the resource. Resources are created at version 1, and this version is incremented each time that
     * they're updated.
     * </p>
     * 
     * @return The version of the resource. Resources are created at version 1, and this version is incremented each
     *         time that they're updated.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the resource. Resources are created at version 1, and this version is incremented each time that
     * they're updated.
     * </p>
     * 
     * @param version
     *        The version of the resource. Resources are created at version 1, and this version is incremented each time
     *        that they're updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMetadata withVersion(Long version) {
        setVersion(version);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getUid() != null)
            sb.append("Uid: ").append(getUid()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceMetadata == false)
            return false;
        ResourceMetadata other = (ResourceMetadata) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getUid() == null ^ this.getUid() == null)
            return false;
        if (other.getUid() != null && other.getUid().equals(this.getUid()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUid() == null) ? 0 : getUid().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public ResourceMetadata clone() {
        try {
            return (ResourceMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.ResourceMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
