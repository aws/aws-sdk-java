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
 * A streaming session is a virtual workstation created using a particular launch profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StreamingSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingSession implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are unique
     * across all Regions.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Indicates if a streaming session created from this launch profile should be terminated automatically or retained
     * without termination after being in a <code>STOPPED</code> state.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <code>ACTIVATED</code>, the streaming session is scheduled for termination after being in the
     * <code>STOPPED</code> state for the time specified in <code>maxStoppedSessionLengthInMinutes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>DEACTIVATED</code>, the streaming session can remain in the <code>STOPPED</code> state indefinitely.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>. When allowed,
     * the default value for this parameter is <code>DEACTIVATED</code>.
     * </p>
     */
    private String automaticTerminationMode;
    /**
     * <p>
     * Shows the current backup setting of the session.
     * </p>
     */
    private String backupMode;
    /**
     * <p>
     * The ISO timestamp in seconds for when the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user ID of the user that created the streaming session.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The EC2 Instance type used for the streaming session.
     * </p>
     */
    private String ec2InstanceType;
    /**
     * <p>
     * The ID of the launch profile used to control access from the streaming session.
     * </p>
     */
    private String launchProfileId;
    /**
     * <p>
     * The maximum number of backups of a streaming session that you can have. When the maximum number of backups is
     * reached, the oldest backup is deleted.
     * </p>
     */
    private Integer maxBackupsToRetain;
    /**
     * <p>
     * The user ID of the user that owns the streaming session. The user that owns the session will be logging into the
     * session and interacting with the virtual workstation.
     * </p>
     */
    private String ownedBy;
    /**
     * <p>
     * The session ID.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * Determine if a streaming session created from this launch profile can configure persistent storage. This means
     * that <code>volumeConfiguration</code> and <code>automaticTerminationMode</code> are configured.
     * </p>
     */
    private String sessionPersistenceMode;
    /**
     * <p>
     * The time the session entered <code>START_IN_PROGRESS</code> state.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The user ID of the user that started the streaming session.
     * </p>
     */
    private String startedBy;
    /**
     * <p>
     * The backup ID used to restore a streaming session.
     * </p>
     */
    private String startedFromBackupId;
    /**
     * <p>
     * The current state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The status code.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * The status message for the streaming session.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The time the streaming session will automatically be stopped if the user doesn’t stop the session themselves.
     * </p>
     */
    private java.util.Date stopAt;
    /**
     * <p>
     * The time the session entered <code>STOP_IN_PROGRESS</code> state.
     * </p>
     */
    private java.util.Date stoppedAt;
    /**
     * <p>
     * The user ID of the user that stopped the streaming session.
     * </p>
     */
    private String stoppedBy;
    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     */
    private String streamingImageId;
    /**
     * <p>
     * A collection of labels, in the form of key-value pairs, that apply to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The time the streaming session will automatically terminate if not terminated by the user.
     * </p>
     */
    private java.util.Date terminateAt;
    /**
     * <p>
     * The ISO timestamp in seconds for when the resource was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     */
    private String updatedBy;
    /**
     * <p>
     * Custom volume configuration for the root volumes that are attached to streaming sessions.
     * </p>
     * <p>
     * This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>.
     * </p>
     */
    private VolumeConfiguration volumeConfiguration;
    /**
     * <p>
     * Determine if an EBS volume created from this streaming session will be backed up.
     * </p>
     */
    private String volumeRetentionMode;

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

    public StreamingSession withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Indicates if a streaming session created from this launch profile should be terminated automatically or retained
     * without termination after being in a <code>STOPPED</code> state.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <code>ACTIVATED</code>, the streaming session is scheduled for termination after being in the
     * <code>STOPPED</code> state for the time specified in <code>maxStoppedSessionLengthInMinutes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>DEACTIVATED</code>, the streaming session can remain in the <code>STOPPED</code> state indefinitely.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>. When allowed,
     * the default value for this parameter is <code>DEACTIVATED</code>.
     * </p>
     * 
     * @param automaticTerminationMode
     *        Indicates if a streaming session created from this launch profile should be terminated automatically or
     *        retained without termination after being in a <code>STOPPED</code> state.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        When <code>ACTIVATED</code>, the streaming session is scheduled for termination after being in the
     *        <code>STOPPED</code> state for the time specified in <code>maxStoppedSessionLengthInMinutes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>DEACTIVATED</code>, the streaming session can remain in the <code>STOPPED</code> state
     *        indefinitely.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>. When
     *        allowed, the default value for this parameter is <code>DEACTIVATED</code>.
     * @see AutomaticTerminationMode
     */

    public void setAutomaticTerminationMode(String automaticTerminationMode) {
        this.automaticTerminationMode = automaticTerminationMode;
    }

    /**
     * <p>
     * Indicates if a streaming session created from this launch profile should be terminated automatically or retained
     * without termination after being in a <code>STOPPED</code> state.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <code>ACTIVATED</code>, the streaming session is scheduled for termination after being in the
     * <code>STOPPED</code> state for the time specified in <code>maxStoppedSessionLengthInMinutes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>DEACTIVATED</code>, the streaming session can remain in the <code>STOPPED</code> state indefinitely.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>. When allowed,
     * the default value for this parameter is <code>DEACTIVATED</code>.
     * </p>
     * 
     * @return Indicates if a streaming session created from this launch profile should be terminated automatically or
     *         retained without termination after being in a <code>STOPPED</code> state.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         When <code>ACTIVATED</code>, the streaming session is scheduled for termination after being in the
     *         <code>STOPPED</code> state for the time specified in <code>maxStoppedSessionLengthInMinutes</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When <code>DEACTIVATED</code>, the streaming session can remain in the <code>STOPPED</code> state
     *         indefinitely.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>. When
     *         allowed, the default value for this parameter is <code>DEACTIVATED</code>.
     * @see AutomaticTerminationMode
     */

    public String getAutomaticTerminationMode() {
        return this.automaticTerminationMode;
    }

    /**
     * <p>
     * Indicates if a streaming session created from this launch profile should be terminated automatically or retained
     * without termination after being in a <code>STOPPED</code> state.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <code>ACTIVATED</code>, the streaming session is scheduled for termination after being in the
     * <code>STOPPED</code> state for the time specified in <code>maxStoppedSessionLengthInMinutes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>DEACTIVATED</code>, the streaming session can remain in the <code>STOPPED</code> state indefinitely.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>. When allowed,
     * the default value for this parameter is <code>DEACTIVATED</code>.
     * </p>
     * 
     * @param automaticTerminationMode
     *        Indicates if a streaming session created from this launch profile should be terminated automatically or
     *        retained without termination after being in a <code>STOPPED</code> state.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        When <code>ACTIVATED</code>, the streaming session is scheduled for termination after being in the
     *        <code>STOPPED</code> state for the time specified in <code>maxStoppedSessionLengthInMinutes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>DEACTIVATED</code>, the streaming session can remain in the <code>STOPPED</code> state
     *        indefinitely.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>. When
     *        allowed, the default value for this parameter is <code>DEACTIVATED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomaticTerminationMode
     */

    public StreamingSession withAutomaticTerminationMode(String automaticTerminationMode) {
        setAutomaticTerminationMode(automaticTerminationMode);
        return this;
    }

    /**
     * <p>
     * Indicates if a streaming session created from this launch profile should be terminated automatically or retained
     * without termination after being in a <code>STOPPED</code> state.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <code>ACTIVATED</code>, the streaming session is scheduled for termination after being in the
     * <code>STOPPED</code> state for the time specified in <code>maxStoppedSessionLengthInMinutes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>DEACTIVATED</code>, the streaming session can remain in the <code>STOPPED</code> state indefinitely.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>. When allowed,
     * the default value for this parameter is <code>DEACTIVATED</code>.
     * </p>
     * 
     * @param automaticTerminationMode
     *        Indicates if a streaming session created from this launch profile should be terminated automatically or
     *        retained without termination after being in a <code>STOPPED</code> state.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        When <code>ACTIVATED</code>, the streaming session is scheduled for termination after being in the
     *        <code>STOPPED</code> state for the time specified in <code>maxStoppedSessionLengthInMinutes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>DEACTIVATED</code>, the streaming session can remain in the <code>STOPPED</code> state
     *        indefinitely.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>. When
     *        allowed, the default value for this parameter is <code>DEACTIVATED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomaticTerminationMode
     */

    public StreamingSession withAutomaticTerminationMode(AutomaticTerminationMode automaticTerminationMode) {
        this.automaticTerminationMode = automaticTerminationMode.toString();
        return this;
    }

    /**
     * <p>
     * Shows the current backup setting of the session.
     * </p>
     * 
     * @param backupMode
     *        Shows the current backup setting of the session.
     * @see SessionBackupMode
     */

    public void setBackupMode(String backupMode) {
        this.backupMode = backupMode;
    }

    /**
     * <p>
     * Shows the current backup setting of the session.
     * </p>
     * 
     * @return Shows the current backup setting of the session.
     * @see SessionBackupMode
     */

    public String getBackupMode() {
        return this.backupMode;
    }

    /**
     * <p>
     * Shows the current backup setting of the session.
     * </p>
     * 
     * @param backupMode
     *        Shows the current backup setting of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionBackupMode
     */

    public StreamingSession withBackupMode(String backupMode) {
        setBackupMode(backupMode);
        return this;
    }

    /**
     * <p>
     * Shows the current backup setting of the session.
     * </p>
     * 
     * @param backupMode
     *        Shows the current backup setting of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionBackupMode
     */

    public StreamingSession withBackupMode(SessionBackupMode backupMode) {
        this.backupMode = backupMode.toString();
        return this;
    }

    /**
     * <p>
     * The ISO timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The ISO timestamp in seconds for when the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The ISO timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @return The ISO timestamp in seconds for when the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The ISO timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The ISO timestamp in seconds for when the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that created the streaming session.
     * </p>
     * 
     * @param createdBy
     *        The user ID of the user that created the streaming session.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user ID of the user that created the streaming session.
     * </p>
     * 
     * @return The user ID of the user that created the streaming session.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user ID of the user that created the streaming session.
     * </p>
     * 
     * @param createdBy
     *        The user ID of the user that created the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The EC2 Instance type used for the streaming session.
     * </p>
     * 
     * @param ec2InstanceType
     *        The EC2 Instance type used for the streaming session.
     */

    public void setEc2InstanceType(String ec2InstanceType) {
        this.ec2InstanceType = ec2InstanceType;
    }

    /**
     * <p>
     * The EC2 Instance type used for the streaming session.
     * </p>
     * 
     * @return The EC2 Instance type used for the streaming session.
     */

    public String getEc2InstanceType() {
        return this.ec2InstanceType;
    }

    /**
     * <p>
     * The EC2 Instance type used for the streaming session.
     * </p>
     * 
     * @param ec2InstanceType
     *        The EC2 Instance type used for the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withEc2InstanceType(String ec2InstanceType) {
        setEc2InstanceType(ec2InstanceType);
        return this;
    }

    /**
     * <p>
     * The ID of the launch profile used to control access from the streaming session.
     * </p>
     * 
     * @param launchProfileId
     *        The ID of the launch profile used to control access from the streaming session.
     */

    public void setLaunchProfileId(String launchProfileId) {
        this.launchProfileId = launchProfileId;
    }

    /**
     * <p>
     * The ID of the launch profile used to control access from the streaming session.
     * </p>
     * 
     * @return The ID of the launch profile used to control access from the streaming session.
     */

    public String getLaunchProfileId() {
        return this.launchProfileId;
    }

    /**
     * <p>
     * The ID of the launch profile used to control access from the streaming session.
     * </p>
     * 
     * @param launchProfileId
     *        The ID of the launch profile used to control access from the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withLaunchProfileId(String launchProfileId) {
        setLaunchProfileId(launchProfileId);
        return this;
    }

    /**
     * <p>
     * The maximum number of backups of a streaming session that you can have. When the maximum number of backups is
     * reached, the oldest backup is deleted.
     * </p>
     * 
     * @param maxBackupsToRetain
     *        The maximum number of backups of a streaming session that you can have. When the maximum number of backups
     *        is reached, the oldest backup is deleted.
     */

    public void setMaxBackupsToRetain(Integer maxBackupsToRetain) {
        this.maxBackupsToRetain = maxBackupsToRetain;
    }

    /**
     * <p>
     * The maximum number of backups of a streaming session that you can have. When the maximum number of backups is
     * reached, the oldest backup is deleted.
     * </p>
     * 
     * @return The maximum number of backups of a streaming session that you can have. When the maximum number of
     *         backups is reached, the oldest backup is deleted.
     */

    public Integer getMaxBackupsToRetain() {
        return this.maxBackupsToRetain;
    }

    /**
     * <p>
     * The maximum number of backups of a streaming session that you can have. When the maximum number of backups is
     * reached, the oldest backup is deleted.
     * </p>
     * 
     * @param maxBackupsToRetain
     *        The maximum number of backups of a streaming session that you can have. When the maximum number of backups
     *        is reached, the oldest backup is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withMaxBackupsToRetain(Integer maxBackupsToRetain) {
        setMaxBackupsToRetain(maxBackupsToRetain);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that owns the streaming session. The user that owns the session will be logging into the
     * session and interacting with the virtual workstation.
     * </p>
     * 
     * @param ownedBy
     *        The user ID of the user that owns the streaming session. The user that owns the session will be logging
     *        into the session and interacting with the virtual workstation.
     */

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    /**
     * <p>
     * The user ID of the user that owns the streaming session. The user that owns the session will be logging into the
     * session and interacting with the virtual workstation.
     * </p>
     * 
     * @return The user ID of the user that owns the streaming session. The user that owns the session will be logging
     *         into the session and interacting with the virtual workstation.
     */

    public String getOwnedBy() {
        return this.ownedBy;
    }

    /**
     * <p>
     * The user ID of the user that owns the streaming session. The user that owns the session will be logging into the
     * session and interacting with the virtual workstation.
     * </p>
     * 
     * @param ownedBy
     *        The user ID of the user that owns the streaming session. The user that owns the session will be logging
     *        into the session and interacting with the virtual workstation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withOwnedBy(String ownedBy) {
        setOwnedBy(ownedBy);
        return this;
    }

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

    public StreamingSession withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * Determine if a streaming session created from this launch profile can configure persistent storage. This means
     * that <code>volumeConfiguration</code> and <code>automaticTerminationMode</code> are configured.
     * </p>
     * 
     * @param sessionPersistenceMode
     *        Determine if a streaming session created from this launch profile can configure persistent storage. This
     *        means that <code>volumeConfiguration</code> and <code>automaticTerminationMode</code> are configured.
     * @see SessionPersistenceMode
     */

    public void setSessionPersistenceMode(String sessionPersistenceMode) {
        this.sessionPersistenceMode = sessionPersistenceMode;
    }

    /**
     * <p>
     * Determine if a streaming session created from this launch profile can configure persistent storage. This means
     * that <code>volumeConfiguration</code> and <code>automaticTerminationMode</code> are configured.
     * </p>
     * 
     * @return Determine if a streaming session created from this launch profile can configure persistent storage. This
     *         means that <code>volumeConfiguration</code> and <code>automaticTerminationMode</code> are configured.
     * @see SessionPersistenceMode
     */

    public String getSessionPersistenceMode() {
        return this.sessionPersistenceMode;
    }

    /**
     * <p>
     * Determine if a streaming session created from this launch profile can configure persistent storage. This means
     * that <code>volumeConfiguration</code> and <code>automaticTerminationMode</code> are configured.
     * </p>
     * 
     * @param sessionPersistenceMode
     *        Determine if a streaming session created from this launch profile can configure persistent storage. This
     *        means that <code>volumeConfiguration</code> and <code>automaticTerminationMode</code> are configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionPersistenceMode
     */

    public StreamingSession withSessionPersistenceMode(String sessionPersistenceMode) {
        setSessionPersistenceMode(sessionPersistenceMode);
        return this;
    }

    /**
     * <p>
     * Determine if a streaming session created from this launch profile can configure persistent storage. This means
     * that <code>volumeConfiguration</code> and <code>automaticTerminationMode</code> are configured.
     * </p>
     * 
     * @param sessionPersistenceMode
     *        Determine if a streaming session created from this launch profile can configure persistent storage. This
     *        means that <code>volumeConfiguration</code> and <code>automaticTerminationMode</code> are configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionPersistenceMode
     */

    public StreamingSession withSessionPersistenceMode(SessionPersistenceMode sessionPersistenceMode) {
        this.sessionPersistenceMode = sessionPersistenceMode.toString();
        return this;
    }

    /**
     * <p>
     * The time the session entered <code>START_IN_PROGRESS</code> state.
     * </p>
     * 
     * @param startedAt
     *        The time the session entered <code>START_IN_PROGRESS</code> state.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The time the session entered <code>START_IN_PROGRESS</code> state.
     * </p>
     * 
     * @return The time the session entered <code>START_IN_PROGRESS</code> state.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The time the session entered <code>START_IN_PROGRESS</code> state.
     * </p>
     * 
     * @param startedAt
     *        The time the session entered <code>START_IN_PROGRESS</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that started the streaming session.
     * </p>
     * 
     * @param startedBy
     *        The user ID of the user that started the streaming session.
     */

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * The user ID of the user that started the streaming session.
     * </p>
     * 
     * @return The user ID of the user that started the streaming session.
     */

    public String getStartedBy() {
        return this.startedBy;
    }

    /**
     * <p>
     * The user ID of the user that started the streaming session.
     * </p>
     * 
     * @param startedBy
     *        The user ID of the user that started the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withStartedBy(String startedBy) {
        setStartedBy(startedBy);
        return this;
    }

    /**
     * <p>
     * The backup ID used to restore a streaming session.
     * </p>
     * 
     * @param startedFromBackupId
     *        The backup ID used to restore a streaming session.
     */

    public void setStartedFromBackupId(String startedFromBackupId) {
        this.startedFromBackupId = startedFromBackupId;
    }

    /**
     * <p>
     * The backup ID used to restore a streaming session.
     * </p>
     * 
     * @return The backup ID used to restore a streaming session.
     */

    public String getStartedFromBackupId() {
        return this.startedFromBackupId;
    }

    /**
     * <p>
     * The backup ID used to restore a streaming session.
     * </p>
     * 
     * @param startedFromBackupId
     *        The backup ID used to restore a streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withStartedFromBackupId(String startedFromBackupId) {
        setStartedFromBackupId(startedFromBackupId);
        return this;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @see StreamingSessionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @return The current state.
     * @see StreamingSessionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionState
     */

    public StreamingSession withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionState
     */

    public StreamingSession withState(StreamingSessionState state) {
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

    public StreamingSession withStatusCode(String statusCode) {
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

    public StreamingSession withStatusCode(StreamingSessionStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the streaming session.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the streaming session.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the streaming session.
     * </p>
     * 
     * @return The status message for the streaming session.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for the streaming session.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The time the streaming session will automatically be stopped if the user doesn’t stop the session themselves.
     * </p>
     * 
     * @param stopAt
     *        The time the streaming session will automatically be stopped if the user doesn’t stop the session
     *        themselves.
     */

    public void setStopAt(java.util.Date stopAt) {
        this.stopAt = stopAt;
    }

    /**
     * <p>
     * The time the streaming session will automatically be stopped if the user doesn’t stop the session themselves.
     * </p>
     * 
     * @return The time the streaming session will automatically be stopped if the user doesn’t stop the session
     *         themselves.
     */

    public java.util.Date getStopAt() {
        return this.stopAt;
    }

    /**
     * <p>
     * The time the streaming session will automatically be stopped if the user doesn’t stop the session themselves.
     * </p>
     * 
     * @param stopAt
     *        The time the streaming session will automatically be stopped if the user doesn’t stop the session
     *        themselves.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withStopAt(java.util.Date stopAt) {
        setStopAt(stopAt);
        return this;
    }

    /**
     * <p>
     * The time the session entered <code>STOP_IN_PROGRESS</code> state.
     * </p>
     * 
     * @param stoppedAt
     *        The time the session entered <code>STOP_IN_PROGRESS</code> state.
     */

    public void setStoppedAt(java.util.Date stoppedAt) {
        this.stoppedAt = stoppedAt;
    }

    /**
     * <p>
     * The time the session entered <code>STOP_IN_PROGRESS</code> state.
     * </p>
     * 
     * @return The time the session entered <code>STOP_IN_PROGRESS</code> state.
     */

    public java.util.Date getStoppedAt() {
        return this.stoppedAt;
    }

    /**
     * <p>
     * The time the session entered <code>STOP_IN_PROGRESS</code> state.
     * </p>
     * 
     * @param stoppedAt
     *        The time the session entered <code>STOP_IN_PROGRESS</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withStoppedAt(java.util.Date stoppedAt) {
        setStoppedAt(stoppedAt);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that stopped the streaming session.
     * </p>
     * 
     * @param stoppedBy
     *        The user ID of the user that stopped the streaming session.
     */

    public void setStoppedBy(String stoppedBy) {
        this.stoppedBy = stoppedBy;
    }

    /**
     * <p>
     * The user ID of the user that stopped the streaming session.
     * </p>
     * 
     * @return The user ID of the user that stopped the streaming session.
     */

    public String getStoppedBy() {
        return this.stoppedBy;
    }

    /**
     * <p>
     * The user ID of the user that stopped the streaming session.
     * </p>
     * 
     * @param stoppedBy
     *        The user ID of the user that stopped the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withStoppedBy(String stoppedBy) {
        setStoppedBy(stoppedBy);
        return this;
    }

    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     * 
     * @param streamingImageId
     *        The ID of the streaming image.
     */

    public void setStreamingImageId(String streamingImageId) {
        this.streamingImageId = streamingImageId;
    }

    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     * 
     * @return The ID of the streaming image.
     */

    public String getStreamingImageId() {
        return this.streamingImageId;
    }

    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     * 
     * @param streamingImageId
     *        The ID of the streaming image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withStreamingImageId(String streamingImageId) {
        setStreamingImageId(streamingImageId);
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

    public StreamingSession withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StreamingSession#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession addTagsEntry(String key, String value) {
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

    public StreamingSession clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The time the streaming session will automatically terminate if not terminated by the user.
     * </p>
     * 
     * @param terminateAt
     *        The time the streaming session will automatically terminate if not terminated by the user.
     */

    public void setTerminateAt(java.util.Date terminateAt) {
        this.terminateAt = terminateAt;
    }

    /**
     * <p>
     * The time the streaming session will automatically terminate if not terminated by the user.
     * </p>
     * 
     * @return The time the streaming session will automatically terminate if not terminated by the user.
     */

    public java.util.Date getTerminateAt() {
        return this.terminateAt;
    }

    /**
     * <p>
     * The time the streaming session will automatically terminate if not terminated by the user.
     * </p>
     * 
     * @param terminateAt
     *        The time the streaming session will automatically terminate if not terminated by the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withTerminateAt(java.util.Date terminateAt) {
        setTerminateAt(terminateAt);
        return this;
    }

    /**
     * <p>
     * The ISO timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The ISO timestamp in seconds for when the resource was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The ISO timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @return The ISO timestamp in seconds for when the resource was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The ISO timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The ISO timestamp in seconds for when the resource was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     * 
     * @param updatedBy
     *        The user ID of the user that most recently updated the resource.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     * 
     * @return The user ID of the user that most recently updated the resource.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     * 
     * @param updatedBy
     *        The user ID of the user that most recently updated the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    /**
     * <p>
     * Custom volume configuration for the root volumes that are attached to streaming sessions.
     * </p>
     * <p>
     * This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>.
     * </p>
     * 
     * @param volumeConfiguration
     *        Custom volume configuration for the root volumes that are attached to streaming sessions.</p>
     *        <p>
     *        This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>.
     */

    public void setVolumeConfiguration(VolumeConfiguration volumeConfiguration) {
        this.volumeConfiguration = volumeConfiguration;
    }

    /**
     * <p>
     * Custom volume configuration for the root volumes that are attached to streaming sessions.
     * </p>
     * <p>
     * This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>.
     * </p>
     * 
     * @return Custom volume configuration for the root volumes that are attached to streaming sessions.</p>
     *         <p>
     *         This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>.
     */

    public VolumeConfiguration getVolumeConfiguration() {
        return this.volumeConfiguration;
    }

    /**
     * <p>
     * Custom volume configuration for the root volumes that are attached to streaming sessions.
     * </p>
     * <p>
     * This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>.
     * </p>
     * 
     * @param volumeConfiguration
     *        Custom volume configuration for the root volumes that are attached to streaming sessions.</p>
     *        <p>
     *        This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withVolumeConfiguration(VolumeConfiguration volumeConfiguration) {
        setVolumeConfiguration(volumeConfiguration);
        return this;
    }

    /**
     * <p>
     * Determine if an EBS volume created from this streaming session will be backed up.
     * </p>
     * 
     * @param volumeRetentionMode
     *        Determine if an EBS volume created from this streaming session will be backed up.
     * @see VolumeRetentionMode
     */

    public void setVolumeRetentionMode(String volumeRetentionMode) {
        this.volumeRetentionMode = volumeRetentionMode;
    }

    /**
     * <p>
     * Determine if an EBS volume created from this streaming session will be backed up.
     * </p>
     * 
     * @return Determine if an EBS volume created from this streaming session will be backed up.
     * @see VolumeRetentionMode
     */

    public String getVolumeRetentionMode() {
        return this.volumeRetentionMode;
    }

    /**
     * <p>
     * Determine if an EBS volume created from this streaming session will be backed up.
     * </p>
     * 
     * @param volumeRetentionMode
     *        Determine if an EBS volume created from this streaming session will be backed up.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeRetentionMode
     */

    public StreamingSession withVolumeRetentionMode(String volumeRetentionMode) {
        setVolumeRetentionMode(volumeRetentionMode);
        return this;
    }

    /**
     * <p>
     * Determine if an EBS volume created from this streaming session will be backed up.
     * </p>
     * 
     * @param volumeRetentionMode
     *        Determine if an EBS volume created from this streaming session will be backed up.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeRetentionMode
     */

    public StreamingSession withVolumeRetentionMode(VolumeRetentionMode volumeRetentionMode) {
        this.volumeRetentionMode = volumeRetentionMode.toString();
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
        if (getAutomaticTerminationMode() != null)
            sb.append("AutomaticTerminationMode: ").append(getAutomaticTerminationMode()).append(",");
        if (getBackupMode() != null)
            sb.append("BackupMode: ").append(getBackupMode()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getEc2InstanceType() != null)
            sb.append("Ec2InstanceType: ").append(getEc2InstanceType()).append(",");
        if (getLaunchProfileId() != null)
            sb.append("LaunchProfileId: ").append(getLaunchProfileId()).append(",");
        if (getMaxBackupsToRetain() != null)
            sb.append("MaxBackupsToRetain: ").append(getMaxBackupsToRetain()).append(",");
        if (getOwnedBy() != null)
            sb.append("OwnedBy: ").append(getOwnedBy()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getSessionPersistenceMode() != null)
            sb.append("SessionPersistenceMode: ").append(getSessionPersistenceMode()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStartedBy() != null)
            sb.append("StartedBy: ").append(getStartedBy()).append(",");
        if (getStartedFromBackupId() != null)
            sb.append("StartedFromBackupId: ").append(getStartedFromBackupId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStopAt() != null)
            sb.append("StopAt: ").append(getStopAt()).append(",");
        if (getStoppedAt() != null)
            sb.append("StoppedAt: ").append(getStoppedAt()).append(",");
        if (getStoppedBy() != null)
            sb.append("StoppedBy: ").append(getStoppedBy()).append(",");
        if (getStreamingImageId() != null)
            sb.append("StreamingImageId: ").append(getStreamingImageId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTerminateAt() != null)
            sb.append("TerminateAt: ").append(getTerminateAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy()).append(",");
        if (getVolumeConfiguration() != null)
            sb.append("VolumeConfiguration: ").append(getVolumeConfiguration()).append(",");
        if (getVolumeRetentionMode() != null)
            sb.append("VolumeRetentionMode: ").append(getVolumeRetentionMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingSession == false)
            return false;
        StreamingSession other = (StreamingSession) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAutomaticTerminationMode() == null ^ this.getAutomaticTerminationMode() == null)
            return false;
        if (other.getAutomaticTerminationMode() != null && other.getAutomaticTerminationMode().equals(this.getAutomaticTerminationMode()) == false)
            return false;
        if (other.getBackupMode() == null ^ this.getBackupMode() == null)
            return false;
        if (other.getBackupMode() != null && other.getBackupMode().equals(this.getBackupMode()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getEc2InstanceType() == null ^ this.getEc2InstanceType() == null)
            return false;
        if (other.getEc2InstanceType() != null && other.getEc2InstanceType().equals(this.getEc2InstanceType()) == false)
            return false;
        if (other.getLaunchProfileId() == null ^ this.getLaunchProfileId() == null)
            return false;
        if (other.getLaunchProfileId() != null && other.getLaunchProfileId().equals(this.getLaunchProfileId()) == false)
            return false;
        if (other.getMaxBackupsToRetain() == null ^ this.getMaxBackupsToRetain() == null)
            return false;
        if (other.getMaxBackupsToRetain() != null && other.getMaxBackupsToRetain().equals(this.getMaxBackupsToRetain()) == false)
            return false;
        if (other.getOwnedBy() == null ^ this.getOwnedBy() == null)
            return false;
        if (other.getOwnedBy() != null && other.getOwnedBy().equals(this.getOwnedBy()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getSessionPersistenceMode() == null ^ this.getSessionPersistenceMode() == null)
            return false;
        if (other.getSessionPersistenceMode() != null && other.getSessionPersistenceMode().equals(this.getSessionPersistenceMode()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getStartedFromBackupId() == null ^ this.getStartedFromBackupId() == null)
            return false;
        if (other.getStartedFromBackupId() != null && other.getStartedFromBackupId().equals(this.getStartedFromBackupId()) == false)
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
        if (other.getStopAt() == null ^ this.getStopAt() == null)
            return false;
        if (other.getStopAt() != null && other.getStopAt().equals(this.getStopAt()) == false)
            return false;
        if (other.getStoppedAt() == null ^ this.getStoppedAt() == null)
            return false;
        if (other.getStoppedAt() != null && other.getStoppedAt().equals(this.getStoppedAt()) == false)
            return false;
        if (other.getStoppedBy() == null ^ this.getStoppedBy() == null)
            return false;
        if (other.getStoppedBy() != null && other.getStoppedBy().equals(this.getStoppedBy()) == false)
            return false;
        if (other.getStreamingImageId() == null ^ this.getStreamingImageId() == null)
            return false;
        if (other.getStreamingImageId() != null && other.getStreamingImageId().equals(this.getStreamingImageId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTerminateAt() == null ^ this.getTerminateAt() == null)
            return false;
        if (other.getTerminateAt() != null && other.getTerminateAt().equals(this.getTerminateAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        if (other.getVolumeConfiguration() == null ^ this.getVolumeConfiguration() == null)
            return false;
        if (other.getVolumeConfiguration() != null && other.getVolumeConfiguration().equals(this.getVolumeConfiguration()) == false)
            return false;
        if (other.getVolumeRetentionMode() == null ^ this.getVolumeRetentionMode() == null)
            return false;
        if (other.getVolumeRetentionMode() != null && other.getVolumeRetentionMode().equals(this.getVolumeRetentionMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAutomaticTerminationMode() == null) ? 0 : getAutomaticTerminationMode().hashCode());
        hashCode = prime * hashCode + ((getBackupMode() == null) ? 0 : getBackupMode().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceType() == null) ? 0 : getEc2InstanceType().hashCode());
        hashCode = prime * hashCode + ((getLaunchProfileId() == null) ? 0 : getLaunchProfileId().hashCode());
        hashCode = prime * hashCode + ((getMaxBackupsToRetain() == null) ? 0 : getMaxBackupsToRetain().hashCode());
        hashCode = prime * hashCode + ((getOwnedBy() == null) ? 0 : getOwnedBy().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getSessionPersistenceMode() == null) ? 0 : getSessionPersistenceMode().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getStartedFromBackupId() == null) ? 0 : getStartedFromBackupId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStopAt() == null) ? 0 : getStopAt().hashCode());
        hashCode = prime * hashCode + ((getStoppedAt() == null) ? 0 : getStoppedAt().hashCode());
        hashCode = prime * hashCode + ((getStoppedBy() == null) ? 0 : getStoppedBy().hashCode());
        hashCode = prime * hashCode + ((getStreamingImageId() == null) ? 0 : getStreamingImageId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTerminateAt() == null) ? 0 : getTerminateAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getVolumeConfiguration() == null) ? 0 : getVolumeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVolumeRetentionMode() == null) ? 0 : getVolumeRetentionMode().hashCode());
        return hashCode;
    }

    @Override
    public StreamingSession clone() {
        try {
            return (StreamingSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StreamingSessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
