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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the streaming session backup.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StreamingSessionBackup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingSessionBackup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are unique
     * across all Regions.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the backup.
     * </p>
     */
    private String backupId;
    /**
     * <p>
     * The ISO timestamp in for when the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The ID of the launch profile which allowed the backups for the streaming session.
     * </p>
     */
    private String launchProfileId;
    /**
     * <p>
     * The user ID of the user that owns the streaming session.
     * </p>
     */
    private String ownedBy;
    /**
     * <p>
     * The streaming session ID for the <code>StreamingSessionBackup</code>.
     * </p>
     */
    private String sessionId;

    private String state;
    /**
     * <p>
     * The status code.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * The status message for the streaming session backup.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * A collection of labels, in the form of key-value pairs, that apply to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are unique
     * across all Regions.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are
     *        unique across all Regions.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are unique
     * across all Regions.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are
     *         unique across all Regions.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are unique
     * across all Regions.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are
     *        unique across all Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSessionBackup withArn(String arn) {
        setArn(arn);
        return this;
    }

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

    public StreamingSessionBackup withBackupId(String backupId) {
        setBackupId(backupId);
        return this;
    }

    /**
     * <p>
     * The ISO timestamp in for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The ISO timestamp in for when the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The ISO timestamp in for when the resource was created.
     * </p>
     * 
     * @return The ISO timestamp in for when the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The ISO timestamp in for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The ISO timestamp in for when the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSessionBackup withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The ID of the launch profile which allowed the backups for the streaming session.
     * </p>
     * 
     * @param launchProfileId
     *        The ID of the launch profile which allowed the backups for the streaming session.
     */

    public void setLaunchProfileId(String launchProfileId) {
        this.launchProfileId = launchProfileId;
    }

    /**
     * <p>
     * The ID of the launch profile which allowed the backups for the streaming session.
     * </p>
     * 
     * @return The ID of the launch profile which allowed the backups for the streaming session.
     */

    public String getLaunchProfileId() {
        return this.launchProfileId;
    }

    /**
     * <p>
     * The ID of the launch profile which allowed the backups for the streaming session.
     * </p>
     * 
     * @param launchProfileId
     *        The ID of the launch profile which allowed the backups for the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSessionBackup withLaunchProfileId(String launchProfileId) {
        setLaunchProfileId(launchProfileId);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that owns the streaming session.
     * </p>
     * 
     * @param ownedBy
     *        The user ID of the user that owns the streaming session.
     */

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    /**
     * <p>
     * The user ID of the user that owns the streaming session.
     * </p>
     * 
     * @return The user ID of the user that owns the streaming session.
     */

    public String getOwnedBy() {
        return this.ownedBy;
    }

    /**
     * <p>
     * The user ID of the user that owns the streaming session.
     * </p>
     * 
     * @param ownedBy
     *        The user ID of the user that owns the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSessionBackup withOwnedBy(String ownedBy) {
        setOwnedBy(ownedBy);
        return this;
    }

    /**
     * <p>
     * The streaming session ID for the <code>StreamingSessionBackup</code>.
     * </p>
     * 
     * @param sessionId
     *        The streaming session ID for the <code>StreamingSessionBackup</code>.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The streaming session ID for the <code>StreamingSessionBackup</code>.
     * </p>
     * 
     * @return The streaming session ID for the <code>StreamingSessionBackup</code>.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The streaming session ID for the <code>StreamingSessionBackup</code>.
     * </p>
     * 
     * @param sessionId
     *        The streaming session ID for the <code>StreamingSessionBackup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSessionBackup withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * @param state
     * @see StreamingSessionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * @see StreamingSessionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionState
     */

    public StreamingSessionBackup withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionState
     */

    public StreamingSessionBackup withState(StreamingSessionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param statusCode
     *        The status code.
     * @see StreamingSessionStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @return The status code.
     * @see StreamingSessionStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param statusCode
     *        The status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionStatusCode
     */

    public StreamingSessionBackup withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param statusCode
     *        The status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionStatusCode
     */

    public StreamingSessionBackup withStatusCode(StreamingSessionStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the streaming session backup.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the streaming session backup.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the streaming session backup.
     * </p>
     * 
     * @return The status message for the streaming session backup.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for the streaming session backup.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the streaming session backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSessionBackup withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * A collection of labels, in the form of key-value pairs, that apply to this resource.
     * </p>
     * 
     * @return A collection of labels, in the form of key-value pairs, that apply to this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key-value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key-value pairs, that apply to this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key-value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key-value pairs, that apply to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSessionBackup withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StreamingSessionBackup#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSessionBackup addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSessionBackup clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getBackupId() != null)
            sb.append("BackupId: ").append(getBackupId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLaunchProfileId() != null)
            sb.append("LaunchProfileId: ").append(getLaunchProfileId()).append(",");
        if (getOwnedBy() != null)
            sb.append("OwnedBy: ").append(getOwnedBy()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingSessionBackup == false)
            return false;
        StreamingSessionBackup other = (StreamingSessionBackup) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLaunchProfileId() == null ^ this.getLaunchProfileId() == null)
            return false;
        if (other.getLaunchProfileId() != null && other.getLaunchProfileId().equals(this.getLaunchProfileId()) == false)
            return false;
        if (other.getOwnedBy() == null ^ this.getOwnedBy() == null)
            return false;
        if (other.getOwnedBy() != null && other.getOwnedBy().equals(this.getOwnedBy()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLaunchProfileId() == null) ? 0 : getLaunchProfileId().hashCode());
        hashCode = prime * hashCode + ((getOwnedBy() == null) ? 0 : getOwnedBy().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StreamingSessionBackup clone() {
        try {
            return (StreamingSessionBackup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StreamingSessionBackupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
