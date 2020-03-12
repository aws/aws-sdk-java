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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an AWS S3 object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3ObjectDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3ObjectDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time when the object was last modified.
     * </p>
     */
    private String lastModified;
    /**
     * <p>
     * The opaque identifier assigned by a web server to a specific version of a resource found at a URL.
     * </p>
     */
    private String eTag;
    /**
     * <p>
     * The version of the object.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * A standard MIME type describing the format of the object data.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * If the object is stored using server-side encryption, the value of the server-side encryption algorithm used when
     * storing this object in Amazon S3.
     * </p>
     */
    private String serverSideEncryption;
    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key (CMK)
     * that was used for the object.
     * </p>
     */
    private String sSEKMSKeyId;

    /**
     * <p>
     * The date and time when the object was last modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time when the object was last modified.
     */

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time when the object was last modified.
     * </p>
     * 
     * @return The date and time when the object was last modified.
     */

    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date and time when the object was last modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time when the object was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3ObjectDetails withLastModified(String lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The opaque identifier assigned by a web server to a specific version of a resource found at a URL.
     * </p>
     * 
     * @param eTag
     *        The opaque identifier assigned by a web server to a specific version of a resource found at a URL.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The opaque identifier assigned by a web server to a specific version of a resource found at a URL.
     * </p>
     * 
     * @return The opaque identifier assigned by a web server to a specific version of a resource found at a URL.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The opaque identifier assigned by a web server to a specific version of a resource found at a URL.
     * </p>
     * 
     * @param eTag
     *        The opaque identifier assigned by a web server to a specific version of a resource found at a URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3ObjectDetails withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * <p>
     * The version of the object.
     * </p>
     * 
     * @param versionId
     *        The version of the object.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The version of the object.
     * </p>
     * 
     * @return The version of the object.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The version of the object.
     * </p>
     * 
     * @param versionId
     *        The version of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3ObjectDetails withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the object data.
     * </p>
     * 
     * @param contentType
     *        A standard MIME type describing the format of the object data.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the object data.
     * </p>
     * 
     * @return A standard MIME type describing the format of the object data.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the object data.
     * </p>
     * 
     * @param contentType
     *        A standard MIME type describing the format of the object data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3ObjectDetails withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * If the object is stored using server-side encryption, the value of the server-side encryption algorithm used when
     * storing this object in Amazon S3.
     * </p>
     * 
     * @param serverSideEncryption
     *        If the object is stored using server-side encryption, the value of the server-side encryption algorithm
     *        used when storing this object in Amazon S3.
     */

    public void setServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
    }

    /**
     * <p>
     * If the object is stored using server-side encryption, the value of the server-side encryption algorithm used when
     * storing this object in Amazon S3.
     * </p>
     * 
     * @return If the object is stored using server-side encryption, the value of the server-side encryption algorithm
     *         used when storing this object in Amazon S3.
     */

    public String getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    /**
     * <p>
     * If the object is stored using server-side encryption, the value of the server-side encryption algorithm used when
     * storing this object in Amazon S3.
     * </p>
     * 
     * @param serverSideEncryption
     *        If the object is stored using server-side encryption, the value of the server-side encryption algorithm
     *        used when storing this object in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3ObjectDetails withServerSideEncryption(String serverSideEncryption) {
        setServerSideEncryption(serverSideEncryption);
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key (CMK)
     * that was used for the object.
     * </p>
     * 
     * @param sSEKMSKeyId
     *        The identifier of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key
     *        (CMK) that was used for the object.
     */

    public void setSSEKMSKeyId(String sSEKMSKeyId) {
        this.sSEKMSKeyId = sSEKMSKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key (CMK)
     * that was used for the object.
     * </p>
     * 
     * @return The identifier of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key
     *         (CMK) that was used for the object.
     */

    public String getSSEKMSKeyId() {
        return this.sSEKMSKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key (CMK)
     * that was used for the object.
     * </p>
     * 
     * @param sSEKMSKeyId
     *        The identifier of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key
     *        (CMK) that was used for the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3ObjectDetails withSSEKMSKeyId(String sSEKMSKeyId) {
        setSSEKMSKeyId(sSEKMSKeyId);
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
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getServerSideEncryption() != null)
            sb.append("ServerSideEncryption: ").append(getServerSideEncryption()).append(",");
        if (getSSEKMSKeyId() != null)
            sb.append("SSEKMSKeyId: ").append(getSSEKMSKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3ObjectDetails == false)
            return false;
        AwsS3ObjectDetails other = (AwsS3ObjectDetails) obj;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getServerSideEncryption() == null ^ this.getServerSideEncryption() == null)
            return false;
        if (other.getServerSideEncryption() != null && other.getServerSideEncryption().equals(this.getServerSideEncryption()) == false)
            return false;
        if (other.getSSEKMSKeyId() == null ^ this.getSSEKMSKeyId() == null)
            return false;
        if (other.getSSEKMSKeyId() != null && other.getSSEKMSKeyId().equals(this.getSSEKMSKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryption() == null) ? 0 : getServerSideEncryption().hashCode());
        hashCode = prime * hashCode + ((getSSEKMSKeyId() == null) ? 0 : getSSEKMSKeyId().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3ObjectDetails clone() {
        try {
            return (AwsS3ObjectDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3ObjectDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
