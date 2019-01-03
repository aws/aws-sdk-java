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
 * Represents the response from the server that describes the remote access session when AWS Device Farm stops the
 * session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/StopRemoteAccessSession" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopRemoteAccessSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A container representing the metadata from the service about the remote access session you are stopping.
     * </p>
     */
    private RemoteAccessSession remoteAccessSession;

    /**
     * <p>
     * A container representing the metadata from the service about the remote access session you are stopping.
     * </p>
     * 
     * @param remoteAccessSession
     *        A container representing the metadata from the service about the remote access session you are stopping.
     */

    public void setRemoteAccessSession(RemoteAccessSession remoteAccessSession) {
        this.remoteAccessSession = remoteAccessSession;
    }

    /**
     * <p>
     * A container representing the metadata from the service about the remote access session you are stopping.
     * </p>
     * 
     * @return A container representing the metadata from the service about the remote access session you are stopping.
     */

    public RemoteAccessSession getRemoteAccessSession() {
        return this.remoteAccessSession;
    }

    /**
     * <p>
     * A container representing the metadata from the service about the remote access session you are stopping.
     * </p>
     * 
     * @param remoteAccessSession
     *        A container representing the metadata from the service about the remote access session you are stopping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopRemoteAccessSessionResult withRemoteAccessSession(RemoteAccessSession remoteAccessSession) {
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

        if (obj instanceof StopRemoteAccessSessionResult == false)
            return false;
        StopRemoteAccessSessionResult other = (StopRemoteAccessSessionResult) obj;
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
    public StopRemoteAccessSessionResult clone() {
        try {
            return (StopRemoteAccessSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
