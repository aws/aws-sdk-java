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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3ObjectMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ObjectMetadata implements Serializable, Cloneable {

    /** <p/> */
    private String cacheControl;
    /** <p/> */
    private String contentDisposition;
    /** <p/> */
    private String contentEncoding;
    /** <p/> */
    private String contentLanguage;
    /** <p/> */
    private java.util.Map<String, String> userMetadata;
    /** <p/> */
    private Long contentLength;
    /** <p/> */
    private String contentMD5;
    /** <p/> */
    private String contentType;
    /** <p/> */
    private java.util.Date httpExpiresDate;
    /** <p/> */
    private Boolean requesterCharged;
    /** <p/> */
    private String sSEAlgorithm;

    /**
     * <p/>
     * 
     * @param cacheControl
     */

    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * <p/>
     * 
     * @param cacheControl
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectMetadata withCacheControl(String cacheControl) {
        setCacheControl(cacheControl);
        return this;
    }

    /**
     * <p/>
     * 
     * @param contentDisposition
     */

    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * <p/>
     * 
     * @param contentDisposition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectMetadata withContentDisposition(String contentDisposition) {
        setContentDisposition(contentDisposition);
        return this;
    }

    /**
     * <p/>
     * 
     * @param contentEncoding
     */

    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * <p/>
     * 
     * @param contentEncoding
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectMetadata withContentEncoding(String contentEncoding) {
        setContentEncoding(contentEncoding);
        return this;
    }

    /**
     * <p/>
     * 
     * @param contentLanguage
     */

    public void setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * <p/>
     * 
     * @param contentLanguage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectMetadata withContentLanguage(String contentLanguage) {
        setContentLanguage(contentLanguage);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Map<String, String> getUserMetadata() {
        return userMetadata;
    }

    /**
     * <p/>
     * 
     * @param userMetadata
     */

    public void setUserMetadata(java.util.Map<String, String> userMetadata) {
        this.userMetadata = userMetadata;
    }

    /**
     * <p/>
     * 
     * @param userMetadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectMetadata withUserMetadata(java.util.Map<String, String> userMetadata) {
        setUserMetadata(userMetadata);
        return this;
    }

    /**
     * Add a single UserMetadata entry
     *
     * @see S3ObjectMetadata#withUserMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectMetadata addUserMetadataEntry(String key, String value) {
        if (null == this.userMetadata) {
            this.userMetadata = new java.util.HashMap<String, String>();
        }
        if (this.userMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.userMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectMetadata clearUserMetadataEntries() {
        this.userMetadata = null;
        return this;
    }

    /**
     * <p/>
     * 
     * @param contentLength
     */

    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * <p/>
     * 
     * @param contentLength
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectMetadata withContentLength(Long contentLength) {
        setContentLength(contentLength);
        return this;
    }

    /**
     * <p/>
     * 
     * @param contentMD5
     */

    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getContentMD5() {
        return this.contentMD5;
    }

    /**
     * <p/>
     * 
     * @param contentMD5
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectMetadata withContentMD5(String contentMD5) {
        setContentMD5(contentMD5);
        return this;
    }

    /**
     * <p/>
     * 
     * @param contentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p/>
     * 
     * @param contentType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectMetadata withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param httpExpiresDate
     */

    public void setHttpExpiresDate(java.util.Date httpExpiresDate) {
        this.httpExpiresDate = httpExpiresDate;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Date getHttpExpiresDate() {
        return this.httpExpiresDate;
    }

    /**
     * <p/>
     * 
     * @param httpExpiresDate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectMetadata withHttpExpiresDate(java.util.Date httpExpiresDate) {
        setHttpExpiresDate(httpExpiresDate);
        return this;
    }

    /**
     * <p/>
     * 
     * @param requesterCharged
     */

    public void setRequesterCharged(Boolean requesterCharged) {
        this.requesterCharged = requesterCharged;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean getRequesterCharged() {
        return this.requesterCharged;
    }

    /**
     * <p/>
     * 
     * @param requesterCharged
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectMetadata withRequesterCharged(Boolean requesterCharged) {
        setRequesterCharged(requesterCharged);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean isRequesterCharged() {
        return this.requesterCharged;
    }

    /**
     * <p/>
     * 
     * @param sSEAlgorithm
     * @see S3SSEAlgorithm
     */

    public void setSSEAlgorithm(String sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm;
    }

    /**
     * <p/>
     * 
     * @return
     * @see S3SSEAlgorithm
     */

    public String getSSEAlgorithm() {
        return this.sSEAlgorithm;
    }

    /**
     * <p/>
     * 
     * @param sSEAlgorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3SSEAlgorithm
     */

    public S3ObjectMetadata withSSEAlgorithm(String sSEAlgorithm) {
        setSSEAlgorithm(sSEAlgorithm);
        return this;
    }

    /**
     * <p/>
     * 
     * @param sSEAlgorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3SSEAlgorithm
     */

    public S3ObjectMetadata withSSEAlgorithm(S3SSEAlgorithm sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm.toString();
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
        if (getCacheControl() != null)
            sb.append("CacheControl: ").append(getCacheControl()).append(",");
        if (getContentDisposition() != null)
            sb.append("ContentDisposition: ").append(getContentDisposition()).append(",");
        if (getContentEncoding() != null)
            sb.append("ContentEncoding: ").append(getContentEncoding()).append(",");
        if (getContentLanguage() != null)
            sb.append("ContentLanguage: ").append(getContentLanguage()).append(",");
        if (getUserMetadata() != null)
            sb.append("UserMetadata: ").append(getUserMetadata()).append(",");
        if (getContentLength() != null)
            sb.append("ContentLength: ").append(getContentLength()).append(",");
        if (getContentMD5() != null)
            sb.append("ContentMD5: ").append(getContentMD5()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getHttpExpiresDate() != null)
            sb.append("HttpExpiresDate: ").append(getHttpExpiresDate()).append(",");
        if (getRequesterCharged() != null)
            sb.append("RequesterCharged: ").append(getRequesterCharged()).append(",");
        if (getSSEAlgorithm() != null)
            sb.append("SSEAlgorithm: ").append(getSSEAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ObjectMetadata == false)
            return false;
        S3ObjectMetadata other = (S3ObjectMetadata) obj;
        if (other.getCacheControl() == null ^ this.getCacheControl() == null)
            return false;
        if (other.getCacheControl() != null && other.getCacheControl().equals(this.getCacheControl()) == false)
            return false;
        if (other.getContentDisposition() == null ^ this.getContentDisposition() == null)
            return false;
        if (other.getContentDisposition() != null && other.getContentDisposition().equals(this.getContentDisposition()) == false)
            return false;
        if (other.getContentEncoding() == null ^ this.getContentEncoding() == null)
            return false;
        if (other.getContentEncoding() != null && other.getContentEncoding().equals(this.getContentEncoding()) == false)
            return false;
        if (other.getContentLanguage() == null ^ this.getContentLanguage() == null)
            return false;
        if (other.getContentLanguage() != null && other.getContentLanguage().equals(this.getContentLanguage()) == false)
            return false;
        if (other.getUserMetadata() == null ^ this.getUserMetadata() == null)
            return false;
        if (other.getUserMetadata() != null && other.getUserMetadata().equals(this.getUserMetadata()) == false)
            return false;
        if (other.getContentLength() == null ^ this.getContentLength() == null)
            return false;
        if (other.getContentLength() != null && other.getContentLength().equals(this.getContentLength()) == false)
            return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null)
            return false;
        if (other.getContentMD5() != null && other.getContentMD5().equals(this.getContentMD5()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getHttpExpiresDate() == null ^ this.getHttpExpiresDate() == null)
            return false;
        if (other.getHttpExpiresDate() != null && other.getHttpExpiresDate().equals(this.getHttpExpiresDate()) == false)
            return false;
        if (other.getRequesterCharged() == null ^ this.getRequesterCharged() == null)
            return false;
        if (other.getRequesterCharged() != null && other.getRequesterCharged().equals(this.getRequesterCharged()) == false)
            return false;
        if (other.getSSEAlgorithm() == null ^ this.getSSEAlgorithm() == null)
            return false;
        if (other.getSSEAlgorithm() != null && other.getSSEAlgorithm().equals(this.getSSEAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheControl() == null) ? 0 : getCacheControl().hashCode());
        hashCode = prime * hashCode + ((getContentDisposition() == null) ? 0 : getContentDisposition().hashCode());
        hashCode = prime * hashCode + ((getContentEncoding() == null) ? 0 : getContentEncoding().hashCode());
        hashCode = prime * hashCode + ((getContentLanguage() == null) ? 0 : getContentLanguage().hashCode());
        hashCode = prime * hashCode + ((getUserMetadata() == null) ? 0 : getUserMetadata().hashCode());
        hashCode = prime * hashCode + ((getContentLength() == null) ? 0 : getContentLength().hashCode());
        hashCode = prime * hashCode + ((getContentMD5() == null) ? 0 : getContentMD5().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getHttpExpiresDate() == null) ? 0 : getHttpExpiresDate().hashCode());
        hashCode = prime * hashCode + ((getRequesterCharged() == null) ? 0 : getRequesterCharged().hashCode());
        hashCode = prime * hashCode + ((getSSEAlgorithm() == null) ? 0 : getSSEAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public S3ObjectMetadata clone() {
        try {
            return (S3ObjectMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
