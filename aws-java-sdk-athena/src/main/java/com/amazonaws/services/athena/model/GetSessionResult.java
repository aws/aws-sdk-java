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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The workgroup to which the session belongs.
     * </p>
     */
    private String workGroup;
    /**
     * <p>
     * The engine version used by the session (for example, <code>PySpark engine version 3</code>). You can get a list
     * of engine versions by calling <a>ListEngineVersions</a>.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Contains engine configuration information like DPU usage.
     * </p>
     */
    private EngineConfiguration engineConfiguration;
    /**
     * <p>
     * The notebook version.
     * </p>
     */
    private String notebookVersion;
    /**
     * <p>
     * Contains the workgroup configuration information used by the session.
     * </p>
     */
    private SessionConfiguration sessionConfiguration;
    /**
     * <p>
     * Contains information about the status of the session.
     * </p>
     */
    private SessionStatus status;
    /**
     * <p>
     * Contains the DPU execution time.
     * </p>
     */
    private SessionStatistics statistics;

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

    public GetSessionResult withSessionId(String sessionId) {
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

    public GetSessionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The workgroup to which the session belongs.
     * </p>
     * 
     * @param workGroup
     *        The workgroup to which the session belongs.
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The workgroup to which the session belongs.
     * </p>
     * 
     * @return The workgroup to which the session belongs.
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * <p>
     * The workgroup to which the session belongs.
     * </p>
     * 
     * @param workGroup
     *        The workgroup to which the session belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
        return this;
    }

    /**
     * <p>
     * The engine version used by the session (for example, <code>PySpark engine version 3</code>). You can get a list
     * of engine versions by calling <a>ListEngineVersions</a>.
     * </p>
     * 
     * @param engineVersion
     *        The engine version used by the session (for example, <code>PySpark engine version 3</code>). You can get a
     *        list of engine versions by calling <a>ListEngineVersions</a>.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version used by the session (for example, <code>PySpark engine version 3</code>). You can get a list
     * of engine versions by calling <a>ListEngineVersions</a>.
     * </p>
     * 
     * @return The engine version used by the session (for example, <code>PySpark engine version 3</code>). You can get
     *         a list of engine versions by calling <a>ListEngineVersions</a>.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version used by the session (for example, <code>PySpark engine version 3</code>). You can get a list
     * of engine versions by calling <a>ListEngineVersions</a>.
     * </p>
     * 
     * @param engineVersion
     *        The engine version used by the session (for example, <code>PySpark engine version 3</code>). You can get a
     *        list of engine versions by calling <a>ListEngineVersions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Contains engine configuration information like DPU usage.
     * </p>
     * 
     * @param engineConfiguration
     *        Contains engine configuration information like DPU usage.
     */

    public void setEngineConfiguration(EngineConfiguration engineConfiguration) {
        this.engineConfiguration = engineConfiguration;
    }

    /**
     * <p>
     * Contains engine configuration information like DPU usage.
     * </p>
     * 
     * @return Contains engine configuration information like DPU usage.
     */

    public EngineConfiguration getEngineConfiguration() {
        return this.engineConfiguration;
    }

    /**
     * <p>
     * Contains engine configuration information like DPU usage.
     * </p>
     * 
     * @param engineConfiguration
     *        Contains engine configuration information like DPU usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withEngineConfiguration(EngineConfiguration engineConfiguration) {
        setEngineConfiguration(engineConfiguration);
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

    public GetSessionResult withNotebookVersion(String notebookVersion) {
        setNotebookVersion(notebookVersion);
        return this;
    }

    /**
     * <p>
     * Contains the workgroup configuration information used by the session.
     * </p>
     * 
     * @param sessionConfiguration
     *        Contains the workgroup configuration information used by the session.
     */

    public void setSessionConfiguration(SessionConfiguration sessionConfiguration) {
        this.sessionConfiguration = sessionConfiguration;
    }

    /**
     * <p>
     * Contains the workgroup configuration information used by the session.
     * </p>
     * 
     * @return Contains the workgroup configuration information used by the session.
     */

    public SessionConfiguration getSessionConfiguration() {
        return this.sessionConfiguration;
    }

    /**
     * <p>
     * Contains the workgroup configuration information used by the session.
     * </p>
     * 
     * @param sessionConfiguration
     *        Contains the workgroup configuration information used by the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withSessionConfiguration(SessionConfiguration sessionConfiguration) {
        setSessionConfiguration(sessionConfiguration);
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

    public GetSessionResult withStatus(SessionStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Contains the DPU execution time.
     * </p>
     * 
     * @param statistics
     *        Contains the DPU execution time.
     */

    public void setStatistics(SessionStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * Contains the DPU execution time.
     * </p>
     * 
     * @return Contains the DPU execution time.
     */

    public SessionStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * Contains the DPU execution time.
     * </p>
     * 
     * @param statistics
     *        Contains the DPU execution time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withStatistics(SessionStatistics statistics) {
        setStatistics(statistics);
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
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getEngineConfiguration() != null)
            sb.append("EngineConfiguration: ").append(getEngineConfiguration()).append(",");
        if (getNotebookVersion() != null)
            sb.append("NotebookVersion: ").append(getNotebookVersion()).append(",");
        if (getSessionConfiguration() != null)
            sb.append("SessionConfiguration: ").append(getSessionConfiguration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSessionResult == false)
            return false;
        GetSessionResult other = (GetSessionResult) obj;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getEngineConfiguration() == null ^ this.getEngineConfiguration() == null)
            return false;
        if (other.getEngineConfiguration() != null && other.getEngineConfiguration().equals(this.getEngineConfiguration()) == false)
            return false;
        if (other.getNotebookVersion() == null ^ this.getNotebookVersion() == null)
            return false;
        if (other.getNotebookVersion() != null && other.getNotebookVersion().equals(this.getNotebookVersion()) == false)
            return false;
        if (other.getSessionConfiguration() == null ^ this.getSessionConfiguration() == null)
            return false;
        if (other.getSessionConfiguration() != null && other.getSessionConfiguration().equals(this.getSessionConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getEngineConfiguration() == null) ? 0 : getEngineConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNotebookVersion() == null) ? 0 : getNotebookVersion().hashCode());
        hashCode = prime * hashCode + ((getSessionConfiguration() == null) ? 0 : getSessionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        return hashCode;
    }

    @Override
    public GetSessionResult clone() {
        try {
            return (GetSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
