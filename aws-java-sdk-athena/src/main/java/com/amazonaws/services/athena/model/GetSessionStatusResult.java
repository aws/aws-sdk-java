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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetSessionStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSessionStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The session ID.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * Contains information about the status of the session.
     * </p>
     */
    private SessionStatus status;

    /**
     * <p>
     * The session ID.
     * </p>
     * 
     * @param sessionId
     *        The session ID.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The session ID.
     * </p>
     * 
     * @return The session ID.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The session ID.
     * </p>
     * 
     * @param sessionId
     *        The session ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionStatusResult withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * Contains information about the status of the session.
     * </p>
     * 
     * @param status
     *        Contains information about the status of the session.
     */

    public void setStatus(SessionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * Contains information about the status of the session.
     * </p>
     * 
     * @return Contains information about the status of the session.
     */

    public SessionStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Contains information about the status of the session.
     * </p>
     * 
     * @param status
     *        Contains information about the status of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionStatusResult withStatus(SessionStatus status) {
        setStatus(status);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSessionStatusResult == false)
            return false;
        GetSessionStatusResult other = (GetSessionStatusResult) obj;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetSessionStatusResult clone() {
        try {
            return (GetSessionStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
