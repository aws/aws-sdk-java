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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The websocket for the participant's connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/Websocket" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Websocket implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL of the websocket.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The URL expiration timestamp in ISO date format.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     */
    private String connectionExpiry;

    /**
     * <p>
     * The URL of the websocket.
     * </p>
     * 
     * @param url
     *        The URL of the websocket.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL of the websocket.
     * </p>
     * 
     * @return The URL of the websocket.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL of the websocket.
     * </p>
     * 
     * @param url
     *        The URL of the websocket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Websocket withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The URL expiration timestamp in ISO date format.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     * 
     * @param connectionExpiry
     *        The URL expiration timestamp in ISO date format.</p>
     *        <p>
     *        It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     */

    public void setConnectionExpiry(String connectionExpiry) {
        this.connectionExpiry = connectionExpiry;
    }

    /**
     * <p>
     * The URL expiration timestamp in ISO date format.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     * 
     * @return The URL expiration timestamp in ISO date format.</p>
     *         <p>
     *         It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     */

    public String getConnectionExpiry() {
        return this.connectionExpiry;
    }

    /**
     * <p>
     * The URL expiration timestamp in ISO date format.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     * 
     * @param connectionExpiry
     *        The URL expiration timestamp in ISO date format.</p>
     *        <p>
     *        It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Websocket withConnectionExpiry(String connectionExpiry) {
        setConnectionExpiry(connectionExpiry);
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
        if (getConnectionExpiry() != null)
            sb.append("ConnectionExpiry: ").append(getConnectionExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Websocket == false)
            return false;
        Websocket other = (Websocket) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getConnectionExpiry() == null ^ this.getConnectionExpiry() == null)
            return false;
        if (other.getConnectionExpiry() != null && other.getConnectionExpiry().equals(this.getConnectionExpiry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getConnectionExpiry() == null) ? 0 : getConnectionExpiry().hashCode());
        return hashCode;
    }

    @Override
    public Websocket clone() {
        try {
            return (Websocket) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectparticipant.model.transform.WebsocketMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
