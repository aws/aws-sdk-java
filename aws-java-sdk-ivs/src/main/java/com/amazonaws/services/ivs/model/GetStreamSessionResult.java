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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetStreamSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStreamSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of stream details.
     * </p>
     */
    private StreamSession streamSession;

    /**
     * <p>
     * List of stream details.
     * </p>
     * 
     * @param streamSession
     *        List of stream details.
     */

    public void setStreamSession(StreamSession streamSession) {
        this.streamSession = streamSession;
    }

    /**
     * <p>
     * List of stream details.
     * </p>
     * 
     * @return List of stream details.
     */

    public StreamSession getStreamSession() {
        return this.streamSession;
    }

    /**
     * <p>
     * List of stream details.
     * </p>
     * 
     * @param streamSession
     *        List of stream details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStreamSessionResult withStreamSession(StreamSession streamSession) {
        setStreamSession(streamSession);
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
        if (getStreamSession() != null)
            sb.append("StreamSession: ").append(getStreamSession());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStreamSessionResult == false)
            return false;
        GetStreamSessionResult other = (GetStreamSessionResult) obj;
        if (other.getStreamSession() == null ^ this.getStreamSession() == null)
            return false;
        if (other.getStreamSession() != null && other.getStreamSession().equals(this.getStreamSession()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamSession() == null) ? 0 : getStreamSession().hashCode());
        return hashCode;
    }

    @Override
    public GetStreamSessionResult clone() {
        try {
            return (GetStreamSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
