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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the details for the file location for the file that's being used in the workflow. Only applicable if you
 * are using S3 storage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/S3FileLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3FileLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the S3 bucket that contains the file being used.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the object.
     * </p>
     */
    private String key;
    /**
     * <p>
     * Specifies the file version.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * The entity tag is a hash of the object. The ETag reflects changes only to the contents of an object, not its
     * metadata.
     * </p>
     */
    private String etag;

    /**
     * <p>
     * Specifies the S3 bucket that contains the file being used.
     * </p>
     * 
     * @param bucket
     *        Specifies the S3 bucket that contains the file being used.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Specifies the S3 bucket that contains the file being used.
     * </p>
     * 
     * @return Specifies the S3 bucket that contains the file being used.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * Specifies the S3 bucket that contains the file being used.
     * </p>
     * 
     * @param bucket
     *        Specifies the S3 bucket that contains the file being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3FileLocation withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the object.
     * </p>
     * 
     * @param key
     *        The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the
     *        object.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the object.
     * </p>
     * 
     * @return The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the
     *         object.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the object.
     * </p>
     * 
     * @param key
     *        The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the
     *        object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3FileLocation withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Specifies the file version.
     * </p>
     * 
     * @param versionId
     *        Specifies the file version.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Specifies the file version.
     * </p>
     * 
     * @return Specifies the file version.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * Specifies the file version.
     * </p>
     * 
     * @param versionId
     *        Specifies the file version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3FileLocation withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * The entity tag is a hash of the object. The ETag reflects changes only to the contents of an object, not its
     * metadata.
     * </p>
     * 
     * @param etag
     *        The entity tag is a hash of the object. The ETag reflects changes only to the contents of an object, not
     *        its metadata.
     */

    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * <p>
     * The entity tag is a hash of the object. The ETag reflects changes only to the contents of an object, not its
     * metadata.
     * </p>
     * 
     * @return The entity tag is a hash of the object. The ETag reflects changes only to the contents of an object, not
     *         its metadata.
     */

    public String getEtag() {
        return this.etag;
    }

    /**
     * <p>
     * The entity tag is a hash of the object. The ETag reflects changes only to the contents of an object, not its
     * metadata.
     * </p>
     * 
     * @param etag
     *        The entity tag is a hash of the object. The ETag reflects changes only to the contents of an object, not
     *        its metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3FileLocation withEtag(String etag) {
        setEtag(etag);
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
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getEtag() != null)
            sb.append("Etag: ").append(getEtag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3FileLocation == false)
            return false;
        S3FileLocation other = (S3FileLocation) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getEtag() == null ^ this.getEtag() == null)
            return false;
        if (other.getEtag() != null && other.getEtag().equals(this.getEtag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getEtag() == null) ? 0 : getEtag().hashCode());
        return hashCode;
    }

    @Override
    public S3FileLocation clone() {
        try {
            return (S3FileLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.S3FileLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
