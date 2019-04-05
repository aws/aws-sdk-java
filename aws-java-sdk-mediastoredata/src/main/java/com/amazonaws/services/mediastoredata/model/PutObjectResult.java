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
package com.amazonaws.services.mediastoredata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/PutObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutObjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The SHA256 digest of the object that is persisted.
     * </p>
     */
    private String contentSHA256;
    /**
     * <p>
     * Unique identifier of the object in the container.
     * </p>
     */
    private String eTag;
    /**
     * <p>
     * The storage class where the object was persisted. The class should be “Temporal”.
     * </p>
     */
    private String storageClass;

    /**
     * <p>
     * The SHA256 digest of the object that is persisted.
     * </p>
     * 
     * @param contentSHA256
     *        The SHA256 digest of the object that is persisted.
     */

    public void setContentSHA256(String contentSHA256) {
        this.contentSHA256 = contentSHA256;
    }

    /**
     * <p>
     * The SHA256 digest of the object that is persisted.
     * </p>
     * 
     * @return The SHA256 digest of the object that is persisted.
     */

    public String getContentSHA256() {
        return this.contentSHA256;
    }

    /**
     * <p>
     * The SHA256 digest of the object that is persisted.
     * </p>
     * 
     * @param contentSHA256
     *        The SHA256 digest of the object that is persisted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectResult withContentSHA256(String contentSHA256) {
        setContentSHA256(contentSHA256);
        return this;
    }

    /**
     * <p>
     * Unique identifier of the object in the container.
     * </p>
     * 
     * @param eTag
     *        Unique identifier of the object in the container.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * Unique identifier of the object in the container.
     * </p>
     * 
     * @return Unique identifier of the object in the container.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * Unique identifier of the object in the container.
     * </p>
     * 
     * @param eTag
     *        Unique identifier of the object in the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectResult withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * <p>
     * The storage class where the object was persisted. The class should be “Temporal”.
     * </p>
     * 
     * @param storageClass
     *        The storage class where the object was persisted. The class should be “Temporal”.
     * @see StorageClass
     */

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The storage class where the object was persisted. The class should be “Temporal”.
     * </p>
     * 
     * @return The storage class where the object was persisted. The class should be “Temporal”.
     * @see StorageClass
     */

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p>
     * The storage class where the object was persisted. The class should be “Temporal”.
     * </p>
     * 
     * @param storageClass
     *        The storage class where the object was persisted. The class should be “Temporal”.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageClass
     */

    public PutObjectResult withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * <p>
     * The storage class where the object was persisted. The class should be “Temporal”.
     * </p>
     * 
     * @param storageClass
     *        The storage class where the object was persisted. The class should be “Temporal”.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageClass
     */

    public PutObjectResult withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
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
        if (getContentSHA256() != null)
            sb.append("ContentSHA256: ").append(getContentSHA256()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag()).append(",");
        if (getStorageClass() != null)
            sb.append("StorageClass: ").append(getStorageClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutObjectResult == false)
            return false;
        PutObjectResult other = (PutObjectResult) obj;
        if (other.getContentSHA256() == null ^ this.getContentSHA256() == null)
            return false;
        if (other.getContentSHA256() != null && other.getContentSHA256().equals(this.getContentSHA256()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentSHA256() == null) ? 0 : getContentSHA256().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        return hashCode;
    }

    @Override
    public PutObjectResult clone() {
        try {
            return (PutObjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
