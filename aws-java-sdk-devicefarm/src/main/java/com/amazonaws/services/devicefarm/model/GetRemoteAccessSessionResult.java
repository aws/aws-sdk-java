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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the response from the server that lists detailed information about the remote access session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetRemoteAccessSession" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRemoteAccessSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A container that lists detailed information about the remote access session.
     * </p>
     */
    private RemoteAccessSession remoteAccessSession;

    /**
     * <p>
     * A container that lists detailed information about the remote access session.
     * </p>
     * 
     * @param remoteAccessSession
     *        A container that lists detailed information about the remote access session.
     */

    public void setRemoteAccessSession(RemoteAccessSession remoteAccessSession) {
        this.remoteAccessSession = remoteAccessSession;
    }

    /**
     * <p>
     * A container that lists detailed information about the remote access session.
     * </p>
     * 
     * @return A container that lists detailed information about the remote access session.
     */

    public RemoteAccessSession getRemoteAccessSession() {
        return this.remoteAccessSession;
    }

    /**
     * <p>
     * A container that lists detailed information about the remote access session.
     * </p>
     * 
     * @param remoteAccessSession
     *        A container that lists detailed information about the remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRemoteAccessSessionResult withRemoteAccessSession(RemoteAccessSession remoteAccessSession) {
        setRemoteAccessSession(remoteAccessSession);
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
        if (getRemoteAccessSession() != null)
            sb.append("RemoteAccessSession: ").append(getRemoteAccessSession());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRemoteAccessSessionResult == false)
            return false;
        GetRemoteAccessSessionResult other = (GetRemoteAccessSessionResult) obj;
        if (other.getRemoteAccessSession() == null ^ this.getRemoteAccessSession() == null)
            return false;
        if (other.getRemoteAccessSession() != null && other.getRemoteAccessSession().equals(this.getRemoteAccessSession()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRemoteAccessSession() == null) ? 0 : getRemoteAccessSession().hashCode());
        return hashCode;
    }

    @Override
    public GetRemoteAccessSessionResult clone() {
        try {
            return (GetRemoteAccessSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
