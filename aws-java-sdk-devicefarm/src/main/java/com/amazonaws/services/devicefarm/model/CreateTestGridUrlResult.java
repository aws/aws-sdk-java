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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateTestGridUrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTestGridUrlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A signed URL, expiring in <a>CreateTestGridUrlRequest$expiresInSeconds</a> seconds, to be passed to a
     * <code>RemoteWebDriver</code>.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The number of seconds the URL from <a>CreateTestGridUrlResult$url</a> stays active.
     * </p>
     */
    private java.util.Date expires;

    /**
     * <p>
     * A signed URL, expiring in <a>CreateTestGridUrlRequest$expiresInSeconds</a> seconds, to be passed to a
     * <code>RemoteWebDriver</code>.
     * </p>
     * 
     * @param url
     *        A signed URL, expiring in <a>CreateTestGridUrlRequest$expiresInSeconds</a> seconds, to be passed to a
     *        <code>RemoteWebDriver</code>.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * A signed URL, expiring in <a>CreateTestGridUrlRequest$expiresInSeconds</a> seconds, to be passed to a
     * <code>RemoteWebDriver</code>.
     * </p>
     * 
     * @return A signed URL, expiring in <a>CreateTestGridUrlRequest$expiresInSeconds</a> seconds, to be passed to a
     *         <code>RemoteWebDriver</code>.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * A signed URL, expiring in <a>CreateTestGridUrlRequest$expiresInSeconds</a> seconds, to be passed to a
     * <code>RemoteWebDriver</code>.
     * </p>
     * 
     * @param url
     *        A signed URL, expiring in <a>CreateTestGridUrlRequest$expiresInSeconds</a> seconds, to be passed to a
     *        <code>RemoteWebDriver</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestGridUrlResult withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The number of seconds the URL from <a>CreateTestGridUrlResult$url</a> stays active.
     * </p>
     * 
     * @param expires
     *        The number of seconds the URL from <a>CreateTestGridUrlResult$url</a> stays active.
     */

    public void setExpires(java.util.Date expires) {
        this.expires = expires;
    }

    /**
     * <p>
     * The number of seconds the URL from <a>CreateTestGridUrlResult$url</a> stays active.
     * </p>
     * 
     * @return The number of seconds the URL from <a>CreateTestGridUrlResult$url</a> stays active.
     */

    public java.util.Date getExpires() {
        return this.expires;
    }

    /**
     * <p>
     * The number of seconds the URL from <a>CreateTestGridUrlResult$url</a> stays active.
     * </p>
     * 
     * @param expires
     *        The number of seconds the URL from <a>CreateTestGridUrlResult$url</a> stays active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestGridUrlResult withExpires(java.util.Date expires) {
        setExpires(expires);
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
        if (getExpires() != null)
            sb.append("Expires: ").append(getExpires());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTestGridUrlResult == false)
            return false;
        CreateTestGridUrlResult other = (CreateTestGridUrlResult) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getExpires() == null ^ this.getExpires() == null)
            return false;
        if (other.getExpires() != null && other.getExpires().equals(this.getExpires()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getExpires() == null) ? 0 : getExpires().hashCode());
        return hashCode;
    }

    @Override
    public CreateTestGridUrlResult clone() {
        try {
            return (CreateTestGridUrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
