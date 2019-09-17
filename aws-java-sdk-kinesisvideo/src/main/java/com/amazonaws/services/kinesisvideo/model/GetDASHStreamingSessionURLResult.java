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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/GetDASHStreamingSessionURL"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDASHStreamingSessionURLResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The URL (containing the session token) that a media player can use to retrieve the MPEG-DASH manifest.
     * </p>
     */
    private String dASHStreamingSessionURL;

    /**
     * <p>
     * The URL (containing the session token) that a media player can use to retrieve the MPEG-DASH manifest.
     * </p>
     * 
     * @param dASHStreamingSessionURL
     *        The URL (containing the session token) that a media player can use to retrieve the MPEG-DASH manifest.
     */

    public void setDASHStreamingSessionURL(String dASHStreamingSessionURL) {
        this.dASHStreamingSessionURL = dASHStreamingSessionURL;
    }

    /**
     * <p>
     * The URL (containing the session token) that a media player can use to retrieve the MPEG-DASH manifest.
     * </p>
     * 
     * @return The URL (containing the session token) that a media player can use to retrieve the MPEG-DASH manifest.
     */

    public String getDASHStreamingSessionURL() {
        return this.dASHStreamingSessionURL;
    }

    /**
     * <p>
     * The URL (containing the session token) that a media player can use to retrieve the MPEG-DASH manifest.
     * </p>
     * 
     * @param dASHStreamingSessionURL
     *        The URL (containing the session token) that a media player can use to retrieve the MPEG-DASH manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDASHStreamingSessionURLResult withDASHStreamingSessionURL(String dASHStreamingSessionURL) {
        setDASHStreamingSessionURL(dASHStreamingSessionURL);
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
        if (getDASHStreamingSessionURL() != null)
            sb.append("DASHStreamingSessionURL: ").append(getDASHStreamingSessionURL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDASHStreamingSessionURLResult == false)
            return false;
        GetDASHStreamingSessionURLResult other = (GetDASHStreamingSessionURLResult) obj;
        if (other.getDASHStreamingSessionURL() == null ^ this.getDASHStreamingSessionURL() == null)
            return false;
        if (other.getDASHStreamingSessionURL() != null && other.getDASHStreamingSessionURL().equals(this.getDASHStreamingSessionURL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDASHStreamingSessionURL() == null) ? 0 : getDASHStreamingSessionURL().hashCode());
        return hashCode;
    }

    @Override
    public GetDASHStreamingSessionURLResult clone() {
        try {
            return (GetDASHStreamingSessionURLResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
