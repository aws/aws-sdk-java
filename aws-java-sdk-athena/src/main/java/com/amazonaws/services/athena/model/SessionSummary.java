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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains summary information about a notebook session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/SessionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The session ID.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The session description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The engine version used by the session (for example, <code>PySpark engine version 3</code>).
     * </p>
     */
    private EngineVersion engineVersion;
    /**
     * <p>
     * The notebook version.
     * </p>
     */
    private String notebookVersion;
    /**
     * <p>
     * Contains information about the session status.
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

    public SessionSummary withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The session description.
     * </p>
     * 
     * @param description
     *        The session description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The session description.
     * </p>
     * 
     * @return The session description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The session description.
     * </p>
     * 
     * @param description
     *        The session description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The engine version used by the session (for example, <code>PySpark engine version 3</code>).
     * </p>
     * 
     * @param engineVersion
     *        The engine version used by the session (for example, <code>PySpark engine version 3</code>).
     */

    public void setEngineVersion(EngineVersion engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version used by the session (for example, <code>PySpark engine version 3</code>).
     * </p>
     * 
     * @return The engine version used by the session (for example, <code>PySpark engine version 3</code>).
     */

    public EngineVersion getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version used by the session (for example, <code>PySpark engine version 3</code>).
     * </p>
     * 
     * @param engineVersion
     *        The engine version used by the session (for example, <code>PySpark engine version 3</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSummary withEngineVersion(EngineVersion engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The notebook version.
     * </p>
     * 
     * @param notebookVersion
     *        The notebook version.
     */

    public void setNotebookVersion(String notebookVersion) {
        this.notebookVersion = notebookVersion;
    }

    /**
     * <p>
     * The notebook version.
     * </p>
     * 
     * @return The notebook version.
     */

    public String getNotebookVersion() {
        return this.notebookVersion;
    }

    /**
     * <p>
     * The notebook version.
     * </p>
     * 
     * @param notebookVersion
     *        The notebook version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSummary withNotebookVersion(String notebookVersion) {
        setNotebookVersion(notebookVersion);
        return this;
    }

    /**
     * <p>
     * Contains information about the session status.
     * </p>
     * 
     * @param status
     *        Contains information about the session status.
     */

    public void setStatus(SessionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * Contains information about the session status.
     * </p>
     * 
     * @return Contains information about the session status.
     */

    public SessionStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Contains information about the session status.
     * </p>
     * 
     * @param status
     *        Contains information about the session status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSummary withStatus(SessionStatus status) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getNotebookVersion() != null)
            sb.append("NotebookVersion: ").append(getNotebookVersion()).append(",");
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

        if (obj instanceof SessionSummary == false)
            return false;
        SessionSummary other = (SessionSummary) obj;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getNotebookVersion() == null ^ this.getNotebookVersion() == null)
            return false;
        if (other.getNotebookVersion() != null && other.getNotebookVersion().equals(this.getNotebookVersion()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getNotebookVersion() == null) ? 0 : getNotebookVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SessionSummary clone() {
        try {
            return (SessionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.SessionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
