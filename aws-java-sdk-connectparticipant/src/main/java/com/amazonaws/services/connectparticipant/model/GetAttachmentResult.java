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
package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/GetAttachment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAttachmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pre-signed URL using which file would be downloaded from Amazon S3 by the API caller.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The expiration time of the URL in ISO timestamp. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For
     * example, 2019-11-08T02:41:28.172Z.
     * </p>
     */
    private String urlExpiry;

    /**
     * <p>
     * The pre-signed URL using which file would be downloaded from Amazon S3 by the API caller.
     * </p>
     * 
     * @param url
     *        The pre-signed URL using which file would be downloaded from Amazon S3 by the API caller.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The pre-signed URL using which file would be downloaded from Amazon S3 by the API caller.
     * </p>
     * 
     * @return The pre-signed URL using which file would be downloaded from Amazon S3 by the API caller.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The pre-signed URL using which file would be downloaded from Amazon S3 by the API caller.
     * </p>
     * 
     * @param url
     *        The pre-signed URL using which file would be downloaded from Amazon S3 by the API caller.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttachmentResult withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The expiration time of the URL in ISO timestamp. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For
     * example, 2019-11-08T02:41:28.172Z.
     * </p>
     * 
     * @param urlExpiry
     *        The expiration time of the URL in ISO timestamp. It's specified in ISO 8601 format:
     *        yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     */

    public void setUrlExpiry(String urlExpiry) {
        this.urlExpiry = urlExpiry;
    }

    /**
     * <p>
     * The expiration time of the URL in ISO timestamp. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For
     * example, 2019-11-08T02:41:28.172Z.
     * </p>
     * 
     * @return The expiration time of the URL in ISO timestamp. It's specified in ISO 8601 format:
     *         yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     */

    public String getUrlExpiry() {
        return this.urlExpiry;
    }

    /**
     * <p>
     * The expiration time of the URL in ISO timestamp. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For
     * example, 2019-11-08T02:41:28.172Z.
     * </p>
     * 
     * @param urlExpiry
     *        The expiration time of the URL in ISO timestamp. It's specified in ISO 8601 format:
     *        yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttachmentResult withUrlExpiry(String urlExpiry) {
        setUrlExpiry(urlExpiry);
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
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getUrlExpiry() != null)
            sb.append("UrlExpiry: ").append(getUrlExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAttachmentResult == false)
            return false;
        GetAttachmentResult other = (GetAttachmentResult) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getUrlExpiry() == null ^ this.getUrlExpiry() == null)
            return false;
        if (other.getUrlExpiry() != null && other.getUrlExpiry().equals(this.getUrlExpiry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getUrlExpiry() == null) ? 0 : getUrlExpiry().hashCode());
        return hashCode;
    }

    @Override
    public GetAttachmentResult clone() {
        try {
            return (GetAttachmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
