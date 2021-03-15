/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the execute command session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/Session" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Session implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the execute command session.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * A URL back to managed agent on the container that the SSM Session Manager client uses to send commands and
     * receive output from the container.
     * </p>
     */
    private String streamUrl;
    /**
     * <p>
     * An encrypted token value containing session and caller information. Used to authenticate the connection to the
     * container.
     * </p>
     */
    private String tokenValue;

    /**
     * <p>
     * The ID of the execute command session.
     * </p>
     * 
     * @param sessionId
     *        The ID of the execute command session.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The ID of the execute command session.
     * </p>
     * 
     * @return The ID of the execute command session.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The ID of the execute command session.
     * </p>
     * 
     * @param sessionId
     *        The ID of the execute command session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * A URL back to managed agent on the container that the SSM Session Manager client uses to send commands and
     * receive output from the container.
     * </p>
     * 
     * @param streamUrl
     *        A URL back to managed agent on the container that the SSM Session Manager client uses to send commands and
     *        receive output from the container.
     */

    public void setStreamUrl(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    /**
     * <p>
     * A URL back to managed agent on the container that the SSM Session Manager client uses to send commands and
     * receive output from the container.
     * </p>
     * 
     * @return A URL back to managed agent on the container that the SSM Session Manager client uses to send commands
     *         and receive output from the container.
     */

    public String getStreamUrl() {
        return this.streamUrl;
    }

    /**
     * <p>
     * A URL back to managed agent on the container that the SSM Session Manager client uses to send commands and
     * receive output from the container.
     * </p>
     * 
     * @param streamUrl
     *        A URL back to managed agent on the container that the SSM Session Manager client uses to send commands and
     *        receive output from the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withStreamUrl(String streamUrl) {
        setStreamUrl(streamUrl);
        return this;
    }

    /**
     * <p>
     * An encrypted token value containing session and caller information. Used to authenticate the connection to the
     * container.
     * </p>
     * 
     * @param tokenValue
     *        An encrypted token value containing session and caller information. Used to authenticate the connection to
     *        the container.
     */

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    /**
     * <p>
     * An encrypted token value containing session and caller information. Used to authenticate the connection to the
     * container.
     * </p>
     * 
     * @return An encrypted token value containing session and caller information. Used to authenticate the connection
     *         to the container.
     */

    public String getTokenValue() {
        return this.tokenValue;
    }

    /**
     * <p>
     * An encrypted token value containing session and caller information. Used to authenticate the connection to the
     * container.
     * </p>
     * 
     * @param tokenValue
     *        An encrypted token value containing session and caller information. Used to authenticate the connection to
     *        the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withTokenValue(String tokenValue) {
        setTokenValue(tokenValue);
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
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getStreamUrl() != null)
            sb.append("StreamUrl: ").append(getStreamUrl()).append(",");
        if (getTokenValue() != null)
            sb.append("TokenValue: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Session == false)
            return false;
        Session other = (Session) obj;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getStreamUrl() == null ^ this.getStreamUrl() == null)
            return false;
        if (other.getStreamUrl() != null && other.getStreamUrl().equals(this.getStreamUrl()) == false)
            return false;
        if (other.getTokenValue() == null ^ this.getTokenValue() == null)
            return false;
        if (other.getTokenValue() != null && other.getTokenValue().equals(this.getTokenValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getStreamUrl() == null) ? 0 : getStreamUrl().hashCode());
        hashCode = prime * hashCode + ((getTokenValue() == null) ? 0 : getTokenValue().hashCode());
        return hashCode;
    }

    @Override
    public Session clone() {
        try {
            return (Session) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.SessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
