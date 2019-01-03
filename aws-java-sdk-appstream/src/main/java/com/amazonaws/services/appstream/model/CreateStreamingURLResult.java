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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStreamingURL" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStreamingURLResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The URL to start the AppStream 2.0 streaming session.
     * </p>
     */
    private String streamingURL;
    /**
     * <p>
     * The elapsed time, in seconds after the Unix epoch, when this URL expires.
     * </p>
     */
    private java.util.Date expires;

    /**
     * <p>
     * The URL to start the AppStream 2.0 streaming session.
     * </p>
     * 
     * @param streamingURL
     *        The URL to start the AppStream 2.0 streaming session.
     */

    public void setStreamingURL(String streamingURL) {
        this.streamingURL = streamingURL;
    }

    /**
     * <p>
     * The URL to start the AppStream 2.0 streaming session.
     * </p>
     * 
     * @return The URL to start the AppStream 2.0 streaming session.
     */

    public String getStreamingURL() {
        return this.streamingURL;
    }

    /**
     * <p>
     * The URL to start the AppStream 2.0 streaming session.
     * </p>
     * 
     * @param streamingURL
     *        The URL to start the AppStream 2.0 streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingURLResult withStreamingURL(String streamingURL) {
        setStreamingURL(streamingURL);
        return this;
    }

    /**
     * <p>
     * The elapsed time, in seconds after the Unix epoch, when this URL expires.
     * </p>
     * 
     * @param expires
     *        The elapsed time, in seconds after the Unix epoch, when this URL expires.
     */

    public void setExpires(java.util.Date expires) {
        this.expires = expires;
    }

    /**
     * <p>
     * The elapsed time, in seconds after the Unix epoch, when this URL expires.
     * </p>
     * 
     * @return The elapsed time, in seconds after the Unix epoch, when this URL expires.
     */

    public java.util.Date getExpires() {
        return this.expires;
    }

    /**
     * <p>
     * The elapsed time, in seconds after the Unix epoch, when this URL expires.
     * </p>
     * 
     * @param expires
     *        The elapsed time, in seconds after the Unix epoch, when this URL expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingURLResult withExpires(java.util.Date expires) {
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
        if (getStreamingURL() != null)
            sb.append("StreamingURL: ").append(getStreamingURL()).append(",");
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

        if (obj instanceof CreateStreamingURLResult == false)
            return false;
        CreateStreamingURLResult other = (CreateStreamingURLResult) obj;
        if (other.getStreamingURL() == null ^ this.getStreamingURL() == null)
            return false;
        if (other.getStreamingURL() != null && other.getStreamingURL().equals(this.getStreamingURL()) == false)
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

        hashCode = prime * hashCode + ((getStreamingURL() == null) ? 0 : getStreamingURL().hashCode());
        hashCode = prime * hashCode + ((getExpires() == null) ? 0 : getExpires().hashCode());
        return hashCode;
    }

    @Override
    public CreateStreamingURLResult clone() {
        try {
            return (CreateStreamingURLResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
