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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/GetHLSStreamingSessionURL"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHLSStreamingSessionURLResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The URL (containing the session token) that a media player can use to retrieve the HLS master playlist.
     * </p>
     */
    private String hLSStreamingSessionURL;

    /**
     * <p>
     * The URL (containing the session token) that a media player can use to retrieve the HLS master playlist.
     * </p>
     * 
     * @param hLSStreamingSessionURL
     *        The URL (containing the session token) that a media player can use to retrieve the HLS master playlist.
     */

    public void setHLSStreamingSessionURL(String hLSStreamingSessionURL) {
        this.hLSStreamingSessionURL = hLSStreamingSessionURL;
    }

    /**
     * <p>
     * The URL (containing the session token) that a media player can use to retrieve the HLS master playlist.
     * </p>
     * 
     * @return The URL (containing the session token) that a media player can use to retrieve the HLS master playlist.
     */

    public String getHLSStreamingSessionURL() {
        return this.hLSStreamingSessionURL;
    }

    /**
     * <p>
     * The URL (containing the session token) that a media player can use to retrieve the HLS master playlist.
     * </p>
     * 
     * @param hLSStreamingSessionURL
     *        The URL (containing the session token) that a media player can use to retrieve the HLS master playlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHLSStreamingSessionURLResult withHLSStreamingSessionURL(String hLSStreamingSessionURL) {
        setHLSStreamingSessionURL(hLSStreamingSessionURL);
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
        if (getHLSStreamingSessionURL() != null)
            sb.append("HLSStreamingSessionURL: ").append(getHLSStreamingSessionURL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHLSStreamingSessionURLResult == false)
            return false;
        GetHLSStreamingSessionURLResult other = (GetHLSStreamingSessionURLResult) obj;
        if (other.getHLSStreamingSessionURL() == null ^ this.getHLSStreamingSessionURL() == null)
            return false;
        if (other.getHLSStreamingSessionURL() != null && other.getHLSStreamingSessionURL().equals(this.getHLSStreamingSessionURL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHLSStreamingSessionURL() == null) ? 0 : getHLSStreamingSessionURL().hashCode());
        return hashCode;
    }

    @Override
    public GetHLSStreamingSessionURLResult clone() {
        try {
            return (GetHLSStreamingSessionURLResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
