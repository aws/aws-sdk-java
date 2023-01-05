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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a client authentication method for a directory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ClientAuthenticationSettingInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientAuthenticationSettingInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of client authentication for the specified directory. If no type is specified, a list of all client
     * authentication types that are supported for the directory is retrieved.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Whether the client authentication type is enabled or disabled for the specified directory.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time when the status of the client authentication type was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The type of client authentication for the specified directory. If no type is specified, a list of all client
     * authentication types that are supported for the directory is retrieved.
     * </p>
     * 
     * @param type
     *        The type of client authentication for the specified directory. If no type is specified, a list of all
     *        client authentication types that are supported for the directory is retrieved.
     * @see ClientAuthenticationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of client authentication for the specified directory. If no type is specified, a list of all client
     * authentication types that are supported for the directory is retrieved.
     * </p>
     * 
     * @return The type of client authentication for the specified directory. If no type is specified, a list of all
     *         client authentication types that are supported for the directory is retrieved.
     * @see ClientAuthenticationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of client authentication for the specified directory. If no type is specified, a list of all client
     * authentication types that are supported for the directory is retrieved.
     * </p>
     * 
     * @param type
     *        The type of client authentication for the specified directory. If no type is specified, a list of all
     *        client authentication types that are supported for the directory is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientAuthenticationType
     */

    public ClientAuthenticationSettingInfo withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of client authentication for the specified directory. If no type is specified, a list of all client
     * authentication types that are supported for the directory is retrieved.
     * </p>
     * 
     * @param type
     *        The type of client authentication for the specified directory. If no type is specified, a list of all
     *        client authentication types that are supported for the directory is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientAuthenticationType
     */

    public ClientAuthenticationSettingInfo withType(ClientAuthenticationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Whether the client authentication type is enabled or disabled for the specified directory.
     * </p>
     * 
     * @param status
     *        Whether the client authentication type is enabled or disabled for the specified directory.
     * @see ClientAuthenticationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Whether the client authentication type is enabled or disabled for the specified directory.
     * </p>
     * 
     * @return Whether the client authentication type is enabled or disabled for the specified directory.
     * @see ClientAuthenticationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Whether the client authentication type is enabled or disabled for the specified directory.
     * </p>
     * 
     * @param status
     *        Whether the client authentication type is enabled or disabled for the specified directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientAuthenticationStatus
     */

    public ClientAuthenticationSettingInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Whether the client authentication type is enabled or disabled for the specified directory.
     * </p>
     * 
     * @param status
     *        Whether the client authentication type is enabled or disabled for the specified directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientAuthenticationStatus
     */

    public ClientAuthenticationSettingInfo withStatus(ClientAuthenticationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the status of the client authentication type was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time when the status of the client authentication type was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time when the status of the client authentication type was last updated.
     * </p>
     * 
     * @return The date and time when the status of the client authentication type was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time when the status of the client authentication type was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time when the status of the client authentication type was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientAuthenticationSettingInfo withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientAuthenticationSettingInfo == false)
            return false;
        ClientAuthenticationSettingInfo other = (ClientAuthenticationSettingInfo) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public ClientAuthenticationSettingInfo clone() {
        try {
            return (ClientAuthenticationSettingInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.ClientAuthenticationSettingInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
