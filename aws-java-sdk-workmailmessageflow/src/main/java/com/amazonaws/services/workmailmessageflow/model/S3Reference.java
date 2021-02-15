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
package com.amazonaws.services.workmailmessageflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon S3 object representing the updated message content, in MIME format.
 * </p>
 * <note>
 * <p>
 * The region for the S3 bucket containing the S3 object must match the region used for WorkMail operations. Also, for
 * WorkMail to process an S3 object, it must have permission to access that object. For more information, see <a
 * href="https://docs.aws.amazon.com/workmail/latest/adminguide/update-with-lambda.html"> Updating message content with
 * AWS Lambda</a>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmailmessageflow-2019-05-01/S3Reference" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Reference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 bucket name.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The S3 key object name.
     * </p>
     */
    private String key;
    /**
     * <p>
     * If you enable versioning for the bucket, you can specify the object version.
     * </p>
     */
    private String objectVersion;

    /**
     * <p>
     * The S3 bucket name.
     * </p>
     * 
     * @param bucket
     *        The S3 bucket name.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The S3 bucket name.
     * </p>
     * 
     * @return The S3 bucket name.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The S3 bucket name.
     * </p>
     * 
     * @param bucket
     *        The S3 bucket name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Reference withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The S3 key object name.
     * </p>
     * 
     * @param key
     *        The S3 key object name.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The S3 key object name.
     * </p>
     * 
     * @return The S3 key object name.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The S3 key object name.
     * </p>
     * 
     * @param key
     *        The S3 key object name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Reference withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * If you enable versioning for the bucket, you can specify the object version.
     * </p>
     * 
     * @param objectVersion
     *        If you enable versioning for the bucket, you can specify the object version.
     */

    public void setObjectVersion(String objectVersion) {
        this.objectVersion = objectVersion;
    }

    /**
     * <p>
     * If you enable versioning for the bucket, you can specify the object version.
     * </p>
     * 
     * @return If you enable versioning for the bucket, you can specify the object version.
     */

    public String getObjectVersion() {
        return this.objectVersion;
    }

    /**
     * <p>
     * If you enable versioning for the bucket, you can specify the object version.
     * </p>
     * 
     * @param objectVersion
     *        If you enable versioning for the bucket, you can specify the object version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Reference withObjectVersion(String objectVersion) {
        setObjectVersion(objectVersion);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getObjectVersion() != null)
            sb.append("ObjectVersion: ").append(getObjectVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Reference == false)
            return false;
        S3Reference other = (S3Reference) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getObjectVersion() == null ^ this.getObjectVersion() == null)
            return false;
        if (other.getObjectVersion() != null && other.getObjectVersion().equals(this.getObjectVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getObjectVersion() == null) ? 0 : getObjectVersion().hashCode());
        return hashCode;
    }

    @Override
    public S3Reference clone() {
        try {
            return (S3Reference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmailmessageflow.model.transform.S3ReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
