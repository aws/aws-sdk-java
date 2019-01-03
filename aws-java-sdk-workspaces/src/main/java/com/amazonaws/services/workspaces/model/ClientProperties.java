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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Amazon WorkSpaces client.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ClientProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether users can cache their credentials on the Amazon WorkSpaces client. When enabled, users can
     * choose to reconnect to their WorkSpaces without re-entering their credentials.
     * </p>
     */
    private String reconnectEnabled;

    /**
     * <p>
     * Specifies whether users can cache their credentials on the Amazon WorkSpaces client. When enabled, users can
     * choose to reconnect to their WorkSpaces without re-entering their credentials.
     * </p>
     * 
     * @param reconnectEnabled
     *        Specifies whether users can cache their credentials on the Amazon WorkSpaces client. When enabled, users
     *        can choose to reconnect to their WorkSpaces without re-entering their credentials.
     * @see ReconnectEnum
     */

    public void setReconnectEnabled(String reconnectEnabled) {
        this.reconnectEnabled = reconnectEnabled;
    }

    /**
     * <p>
     * Specifies whether users can cache their credentials on the Amazon WorkSpaces client. When enabled, users can
     * choose to reconnect to their WorkSpaces without re-entering their credentials.
     * </p>
     * 
     * @return Specifies whether users can cache their credentials on the Amazon WorkSpaces client. When enabled, users
     *         can choose to reconnect to their WorkSpaces without re-entering their credentials.
     * @see ReconnectEnum
     */

    public String getReconnectEnabled() {
        return this.reconnectEnabled;
    }

    /**
     * <p>
     * Specifies whether users can cache their credentials on the Amazon WorkSpaces client. When enabled, users can
     * choose to reconnect to their WorkSpaces without re-entering their credentials.
     * </p>
     * 
     * @param reconnectEnabled
     *        Specifies whether users can cache their credentials on the Amazon WorkSpaces client. When enabled, users
     *        can choose to reconnect to their WorkSpaces without re-entering their credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReconnectEnum
     */

    public ClientProperties withReconnectEnabled(String reconnectEnabled) {
        setReconnectEnabled(reconnectEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether users can cache their credentials on the Amazon WorkSpaces client. When enabled, users can
     * choose to reconnect to their WorkSpaces without re-entering their credentials.
     * </p>
     * 
     * @param reconnectEnabled
     *        Specifies whether users can cache their credentials on the Amazon WorkSpaces client. When enabled, users
     *        can choose to reconnect to their WorkSpaces without re-entering their credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReconnectEnum
     */

    public ClientProperties withReconnectEnabled(ReconnectEnum reconnectEnabled) {
        this.reconnectEnabled = reconnectEnabled.toString();
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
        if (getReconnectEnabled() != null)
            sb.append("ReconnectEnabled: ").append(getReconnectEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientProperties == false)
            return false;
        ClientProperties other = (ClientProperties) obj;
        if (other.getReconnectEnabled() == null ^ this.getReconnectEnabled() == null)
            return false;
        if (other.getReconnectEnabled() != null && other.getReconnectEnabled().equals(this.getReconnectEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReconnectEnabled() == null) ? 0 : getReconnectEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ClientProperties clone() {
        try {
            return (ClientProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.ClientPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
