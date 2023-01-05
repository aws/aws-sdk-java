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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the user name, server ID, and session ID for a workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UserDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique string that identifies a user account associated with a server.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The system-assigned unique identifier for a Transfer server instance.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The system-assigned unique identifier for a session that corresponds to the workflow.
     * </p>
     */
    private String sessionId;

    /**
     * <p>
     * A unique string that identifies a user account associated with a server.
     * </p>
     * 
     * @param userName
     *        A unique string that identifies a user account associated with a server.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * A unique string that identifies a user account associated with a server.
     * </p>
     * 
     * @return A unique string that identifies a user account associated with a server.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * A unique string that identifies a user account associated with a server.
     * </p>
     * 
     * @param userName
     *        A unique string that identifies a user account associated with a server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDetails withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The system-assigned unique identifier for a Transfer server instance.
     * </p>
     * 
     * @param serverId
     *        The system-assigned unique identifier for a Transfer server instance.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * The system-assigned unique identifier for a Transfer server instance.
     * </p>
     * 
     * @return The system-assigned unique identifier for a Transfer server instance.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * The system-assigned unique identifier for a Transfer server instance.
     * </p>
     * 
     * @param serverId
     *        The system-assigned unique identifier for a Transfer server instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDetails withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The system-assigned unique identifier for a session that corresponds to the workflow.
     * </p>
     * 
     * @param sessionId
     *        The system-assigned unique identifier for a session that corresponds to the workflow.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The system-assigned unique identifier for a session that corresponds to the workflow.
     * </p>
     * 
     * @return The system-assigned unique identifier for a session that corresponds to the workflow.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The system-assigned unique identifier for a session that corresponds to the workflow.
     * </p>
     * 
     * @param sessionId
     *        The system-assigned unique identifier for a session that corresponds to the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDetails withSessionId(String sessionId) {
        setSessionId(sessionId);
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserDetails == false)
            return false;
        UserDetails other = (UserDetails) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        return hashCode;
    }

    @Override
    public UserDetails clone() {
        try {
            return (UserDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.UserDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
