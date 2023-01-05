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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * Contains engine data processing unit (DPU) configuration settings and parameter mappings.
     * </p>
     */
    private EngineConfiguration engineConfiguration;
    /**
     * <p>
     * The notebook version. This value is required only when requesting that a notebook server be started for the
     * session. The only valid notebook version is <code>Jupyter1.0</code>.
     * </p>
     */
    private String notebookVersion;
    /**
     * <p>
     * The idle timeout in minutes for the session.
     * </p>
     */
    private Integer sessionIdleTimeoutInMinutes;
    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the session is idempotent (executes only
     * once). If another <code>StartSessionRequest</code> is received, the same response is returned and another session
     * is not created. If a parameter has changed, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK
     * for Java) auto-generate the token for users. If you are not using the Amazon Web Services SDK or the Amazon Web
     * Services CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     */
    private String clientRequestToken;

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

    public StartSessionRequest withDescription(String description) {
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

    public StartSessionRequest withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
        return this;
    }

    /**
     * <p>
     * Contains engine data processing unit (DPU) configuration settings and parameter mappings.
     * </p>
     * 
     * @param engineConfiguration
     *        Contains engine data processing unit (DPU) configuration settings and parameter mappings.
     */

    public void setEngineConfiguration(EngineConfiguration engineConfiguration) {
        this.engineConfiguration = engineConfiguration;
    }

    /**
     * <p>
     * Contains engine data processing unit (DPU) configuration settings and parameter mappings.
     * </p>
     * 
     * @return Contains engine data processing unit (DPU) configuration settings and parameter mappings.
     */

    public EngineConfiguration getEngineConfiguration() {
        return this.engineConfiguration;
    }

    /**
     * <p>
     * Contains engine data processing unit (DPU) configuration settings and parameter mappings.
     * </p>
     * 
     * @param engineConfiguration
     *        Contains engine data processing unit (DPU) configuration settings and parameter mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionRequest withEngineConfiguration(EngineConfiguration engineConfiguration) {
        setEngineConfiguration(engineConfiguration);
        return this;
    }

    /**
     * <p>
     * The notebook version. This value is required only when requesting that a notebook server be started for the
     * session. The only valid notebook version is <code>Jupyter1.0</code>.
     * </p>
     * 
     * @param notebookVersion
     *        The notebook version. This value is required only when requesting that a notebook server be started for
     *        the session. The only valid notebook version is <code>Jupyter1.0</code>.
     */

    public void setNotebookVersion(String notebookVersion) {
        this.notebookVersion = notebookVersion;
    }

    /**
     * <p>
     * The notebook version. This value is required only when requesting that a notebook server be started for the
     * session. The only valid notebook version is <code>Jupyter1.0</code>.
     * </p>
     * 
     * @return The notebook version. This value is required only when requesting that a notebook server be started for
     *         the session. The only valid notebook version is <code>Jupyter1.0</code>.
     */

    public String getNotebookVersion() {
        return this.notebookVersion;
    }

    /**
     * <p>
     * The notebook version. This value is required only when requesting that a notebook server be started for the
     * session. The only valid notebook version is <code>Jupyter1.0</code>.
     * </p>
     * 
     * @param notebookVersion
     *        The notebook version. This value is required only when requesting that a notebook server be started for
     *        the session. The only valid notebook version is <code>Jupyter1.0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionRequest withNotebookVersion(String notebookVersion) {
        setNotebookVersion(notebookVersion);
        return this;
    }

    /**
     * <p>
     * The idle timeout in minutes for the session.
     * </p>
     * 
     * @param sessionIdleTimeoutInMinutes
     *        The idle timeout in minutes for the session.
     */

    public void setSessionIdleTimeoutInMinutes(Integer sessionIdleTimeoutInMinutes) {
        this.sessionIdleTimeoutInMinutes = sessionIdleTimeoutInMinutes;
    }

    /**
     * <p>
     * The idle timeout in minutes for the session.
     * </p>
     * 
     * @return The idle timeout in minutes for the session.
     */

    public Integer getSessionIdleTimeoutInMinutes() {
        return this.sessionIdleTimeoutInMinutes;
    }

    /**
     * <p>
     * The idle timeout in minutes for the session.
     * </p>
     * 
     * @param sessionIdleTimeoutInMinutes
     *        The idle timeout in minutes for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionRequest withSessionIdleTimeoutInMinutes(Integer sessionIdleTimeoutInMinutes) {
        setSessionIdleTimeoutInMinutes(sessionIdleTimeoutInMinutes);
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the session is idempotent (executes only
     * once). If another <code>StartSessionRequest</code> is received, the same response is returned and another session
     * is not created. If a parameter has changed, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK
     * for Java) auto-generate the token for users. If you are not using the Amazon Web Services SDK or the Amazon Web
     * Services CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     * 
     * @param clientRequestToken
     *        A unique case-sensitive string used to ensure the request to create the session is idempotent (executes
     *        only once). If another <code>StartSessionRequest</code> is received, the same response is returned and
     *        another session is not created. If a parameter has changed, an error is returned.</p> <important>
     *        <p>
     *        This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services
     *        SDK for Java) auto-generate the token for users. If you are not using the Amazon Web Services SDK or the
     *        Amazon Web Services CLI, you must provide this token or the action will fail.
     *        </p>
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the session is idempotent (executes only
     * once). If another <code>StartSessionRequest</code> is received, the same response is returned and another session
     * is not created. If a parameter has changed, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK
     * for Java) auto-generate the token for users. If you are not using the Amazon Web Services SDK or the Amazon Web
     * Services CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     * 
     * @return A unique case-sensitive string used to ensure the request to create the session is idempotent (executes
     *         only once). If another <code>StartSessionRequest</code> is received, the same response is returned and
     *         another session is not created. If a parameter has changed, an error is returned.</p> <important>
     *         <p>
     *         This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web
     *         Services SDK for Java) auto-generate the token for users. If you are not using the Amazon Web Services
     *         SDK or the Amazon Web Services CLI, you must provide this token or the action will fail.
     *         </p>
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the session is idempotent (executes only
     * once). If another <code>StartSessionRequest</code> is received, the same response is returned and another session
     * is not created. If a parameter has changed, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK
     * for Java) auto-generate the token for users. If you are not using the Amazon Web Services SDK or the Amazon Web
     * Services CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     * 
     * @param clientRequestToken
     *        A unique case-sensitive string used to ensure the request to create the session is idempotent (executes
     *        only once). If another <code>StartSessionRequest</code> is received, the same response is returned and
     *        another session is not created. If a parameter has changed, an error is returned.</p> <important>
     *        <p>
     *        This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services
     *        SDK for Java) auto-generate the token for users. If you are not using the Amazon Web Services SDK or the
     *        Amazon Web Services CLI, you must provide this token or the action will fail.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup()).append(",");
        if (getEngineConfiguration() != null)
            sb.append("EngineConfiguration: ").append(getEngineConfiguration()).append(",");
        if (getNotebookVersion() != null)
            sb.append("NotebookVersion: ").append(getNotebookVersion()).append(",");
        if (getSessionIdleTimeoutInMinutes() != null)
            sb.append("SessionIdleTimeoutInMinutes: ").append(getSessionIdleTimeoutInMinutes()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSessionRequest == false)
            return false;
        StartSessionRequest other = (StartSessionRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        if (other.getEngineConfiguration() == null ^ this.getEngineConfiguration() == null)
            return false;
        if (other.getEngineConfiguration() != null && other.getEngineConfiguration().equals(this.getEngineConfiguration()) == false)
            return false;
        if (other.getNotebookVersion() == null ^ this.getNotebookVersion() == null)
            return false;
        if (other.getNotebookVersion() != null && other.getNotebookVersion().equals(this.getNotebookVersion()) == false)
            return false;
        if (other.getSessionIdleTimeoutInMinutes() == null ^ this.getSessionIdleTimeoutInMinutes() == null)
            return false;
        if (other.getSessionIdleTimeoutInMinutes() != null && other.getSessionIdleTimeoutInMinutes().equals(this.getSessionIdleTimeoutInMinutes()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        hashCode = prime * hashCode + ((getEngineConfiguration() == null) ? 0 : getEngineConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNotebookVersion() == null) ? 0 : getNotebookVersion().hashCode());
        hashCode = prime * hashCode + ((getSessionIdleTimeoutInMinutes() == null) ? 0 : getSessionIdleTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public StartSessionRequest clone() {
        return (StartSessionRequest) super.clone();
    }

}
