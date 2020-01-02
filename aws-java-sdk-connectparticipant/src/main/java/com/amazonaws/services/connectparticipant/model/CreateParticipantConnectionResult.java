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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/CreateParticipantConnection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateParticipantConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Creates the participant's websocket connection.
     * </p>
     */
    private Websocket websocket;
    /**
     * <p>
     * Creates the participant's connection credentials. The authentication token associated with the participant's
     * connection.
     * </p>
     */
    private ConnectionCredentials connectionCredentials;

    /**
     * <p>
     * Creates the participant's websocket connection.
     * </p>
     * 
     * @param websocket
     *        Creates the participant's websocket connection.
     */

    public void setWebsocket(Websocket websocket) {
        this.websocket = websocket;
    }

    /**
     * <p>
     * Creates the participant's websocket connection.
     * </p>
     * 
     * @return Creates the participant's websocket connection.
     */

    public Websocket getWebsocket() {
        return this.websocket;
    }

    /**
     * <p>
     * Creates the participant's websocket connection.
     * </p>
     * 
     * @param websocket
     *        Creates the participant's websocket connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateParticipantConnectionResult withWebsocket(Websocket websocket) {
        setWebsocket(websocket);
        return this;
    }

    /**
     * <p>
     * Creates the participant's connection credentials. The authentication token associated with the participant's
     * connection.
     * </p>
     * 
     * @param connectionCredentials
     *        Creates the participant's connection credentials. The authentication token associated with the
     *        participant's connection.
     */

    public void setConnectionCredentials(ConnectionCredentials connectionCredentials) {
        this.connectionCredentials = connectionCredentials;
    }

    /**
     * <p>
     * Creates the participant's connection credentials. The authentication token associated with the participant's
     * connection.
     * </p>
     * 
     * @return Creates the participant's connection credentials. The authentication token associated with the
     *         participant's connection.
     */

    public ConnectionCredentials getConnectionCredentials() {
        return this.connectionCredentials;
    }

    /**
     * <p>
     * Creates the participant's connection credentials. The authentication token associated with the participant's
     * connection.
     * </p>
     * 
     * @param connectionCredentials
     *        Creates the participant's connection credentials. The authentication token associated with the
     *        participant's connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateParticipantConnectionResult withConnectionCredentials(ConnectionCredentials connectionCredentials) {
        setConnectionCredentials(connectionCredentials);
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
        if (getWebsocket() != null)
            sb.append("Websocket: ").append(getWebsocket()).append(",");
        if (getConnectionCredentials() != null)
            sb.append("ConnectionCredentials: ").append(getConnectionCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateParticipantConnectionResult == false)
            return false;
        CreateParticipantConnectionResult other = (CreateParticipantConnectionResult) obj;
        if (other.getWebsocket() == null ^ this.getWebsocket() == null)
            return false;
        if (other.getWebsocket() != null && other.getWebsocket().equals(this.getWebsocket()) == false)
            return false;
        if (other.getConnectionCredentials() == null ^ this.getConnectionCredentials() == null)
            return false;
        if (other.getConnectionCredentials() != null && other.getConnectionCredentials().equals(this.getConnectionCredentials()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebsocket() == null) ? 0 : getWebsocket().hashCode());
        hashCode = prime * hashCode + ((getConnectionCredentials() == null) ? 0 : getConnectionCredentials().hashCode());
        return hashCode;
    }

    @Override
    public CreateParticipantConnectionResult clone() {
        try {
            return (CreateParticipantConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
