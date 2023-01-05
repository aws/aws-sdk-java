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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StartStreamingSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartStreamingSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the backup.
     * </p>
     */
    private String backupId;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to
     * ensure idempotency.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The streaming session ID for the <code>StartStreamingSessionRequest</code>.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The studio ID for the StartStreamingSessionRequest.
     * </p>
     */
    private String studioId;

    /**
     * <p>
     * The ID of the backup.
     * </p>
     * 
     * @param backupId
     *        The ID of the backup.
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * The ID of the backup.
     * </p>
     * 
     * @return The ID of the backup.
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * <p>
     * The ID of the backup.
     * </p>
     * 
     * @param backupId
     *        The ID of the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartStreamingSessionRequest withBackupId(String backupId) {
        setBackupId(backupId);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to
     * ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     *        specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it for
     *        the request to ensure idempotency.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to
     * ensure idempotency.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     *         specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it
     *         for the request to ensure idempotency.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to
     * ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     *        specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it for
     *        the request to ensure idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartStreamingSessionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The streaming session ID for the <code>StartStreamingSessionRequest</code>.
     * </p>
     * 
     * @param sessionId
     *        The streaming session ID for the <code>StartStreamingSessionRequest</code>.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The streaming session ID for the <code>StartStreamingSessionRequest</code>.
     * </p>
     * 
     * @return The streaming session ID for the <code>StartStreamingSessionRequest</code>.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The streaming session ID for the <code>StartStreamingSessionRequest</code>.
     * </p>
     * 
     * @param sessionId
     *        The streaming session ID for the <code>StartStreamingSessionRequest</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartStreamingSessionRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The studio ID for the StartStreamingSessionRequest.
     * </p>
     * 
     * @param studioId
     *        The studio ID for the StartStreamingSessionRequest.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The studio ID for the StartStreamingSessionRequest.
     * </p>
     * 
     * @return The studio ID for the StartStreamingSessionRequest.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The studio ID for the StartStreamingSessionRequest.
     * </p>
     * 
     * @param studioId
     *        The studio ID for the StartStreamingSessionRequest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartStreamingSessionRequest withStudioId(String studioId) {
        setStudioId(studioId);
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
        if (getBackupId() != null)
            sb.append("BackupId: ").append(getBackupId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartStreamingSessionRequest == false)
            return false;
        StartStreamingSessionRequest other = (StartStreamingSessionRequest) obj;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        return hashCode;
    }

    @Override
    public StartStreamingSessionRequest clone() {
        return (StartStreamingSessionRequest) super.clone();
    }

}
