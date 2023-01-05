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
 * Configuration for streaming workstations created using this launch profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StreamConfigurationCreate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamConfigurationCreate implements Serializable, Cloneable, StructuredPojo {

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
     * Allows or deactivates the use of the system clipboard to copy and paste between the streaming session and
     * streaming client.
     * </p>
     */
    private String clipboardMode;
    /**
     * <p>
     * The EC2 instance types that users can select from when launching a streaming session with this launch profile.
     * </p>
     */
    private java.util.List<String> ec2InstanceTypes;
    /**
     * <p>
     * The length of time, in minutes, that a streaming session can be active before it is stopped or terminated. After
     * this point, Nimble Studio automatically terminates or stops the session. The default length of time is 690
     * minutes, and the maximum length of time is 30 days.
     * </p>
     */
    private Integer maxSessionLengthInMinutes;
    /**
     * <p>
     * Integer that determines if you can start and stop your sessions and how long a session can stay in the
     * <code>STOPPED</code> state. The default value is 0. The maximum value is 5760.
     * </p>
     * <p>
     * This field is allowed only when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code> and
     * <code>automaticTerminationMode</code> is <code>ACTIVATED</code>.
     * </p>
     * <p>
     * If the value is set to 0, your sessions can’t be <code>STOPPED</code>. If you then call
     * <code>StopStreamingSession</code>, the session fails. If the time that a session stays in the <code>READY</code>
     * state exceeds the <code>maxSessionLengthInMinutes</code> value, the session will automatically be terminated
     * (instead of <code>STOPPED</code>).
     * </p>
     * <p>
     * If the value is set to a positive number, the session can be stopped. You can call
     * <code>StopStreamingSession</code> to stop sessions in the <code>READY</code> state. If the time that a session
     * stays in the <code>READY</code> state exceeds the <code>maxSessionLengthInMinutes</code> value, the session will
     * automatically be stopped (instead of terminated).
     * </p>
     */
    private Integer maxStoppedSessionLengthInMinutes;
    /**
     * <p>
     * Configures how streaming sessions are backed up when launched from this launch profile.
     * </p>
     */
    private StreamConfigurationSessionBackup sessionBackup;
    /**
     * <p>
     * Determine if a streaming session created from this launch profile can configure persistent storage. This means
     * that <code>volumeConfiguration</code> and <code>automaticTerminationMode</code> are configured.
     * </p>
     */
    private String sessionPersistenceMode;
    /**
     * <p>
     * The upload storage for a streaming workstation that is created using this launch profile.
     * </p>
     */
    private StreamConfigurationSessionStorage sessionStorage;
    /**
     * <p>
     * The streaming images that users can select from when launching a streaming session with this launch profile.
     * </p>
     */
    private java.util.List<String> streamingImageIds;
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

    public StreamConfigurationCreate withAutomaticTerminationMode(String automaticTerminationMode) {
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

    public StreamConfigurationCreate withAutomaticTerminationMode(AutomaticTerminationMode automaticTerminationMode) {
        this.automaticTerminationMode = automaticTerminationMode.toString();
        return this;
    }

    /**
     * <p>
     * Allows or deactivates the use of the system clipboard to copy and paste between the streaming session and
     * streaming client.
     * </p>
     * 
     * @param clipboardMode
     *        Allows or deactivates the use of the system clipboard to copy and paste between the streaming session and
     *        streaming client.
     * @see StreamingClipboardMode
     */

    public void setClipboardMode(String clipboardMode) {
        this.clipboardMode = clipboardMode;
    }

    /**
     * <p>
     * Allows or deactivates the use of the system clipboard to copy and paste between the streaming session and
     * streaming client.
     * </p>
     * 
     * @return Allows or deactivates the use of the system clipboard to copy and paste between the streaming session and
     *         streaming client.
     * @see StreamingClipboardMode
     */

    public String getClipboardMode() {
        return this.clipboardMode;
    }

    /**
     * <p>
     * Allows or deactivates the use of the system clipboard to copy and paste between the streaming session and
     * streaming client.
     * </p>
     * 
     * @param clipboardMode
     *        Allows or deactivates the use of the system clipboard to copy and paste between the streaming session and
     *        streaming client.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingClipboardMode
     */

    public StreamConfigurationCreate withClipboardMode(String clipboardMode) {
        setClipboardMode(clipboardMode);
        return this;
    }

    /**
     * <p>
     * Allows or deactivates the use of the system clipboard to copy and paste between the streaming session and
     * streaming client.
     * </p>
     * 
     * @param clipboardMode
     *        Allows or deactivates the use of the system clipboard to copy and paste between the streaming session and
     *        streaming client.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingClipboardMode
     */

    public StreamConfigurationCreate withClipboardMode(StreamingClipboardMode clipboardMode) {
        this.clipboardMode = clipboardMode.toString();
        return this;
    }

    /**
     * <p>
     * The EC2 instance types that users can select from when launching a streaming session with this launch profile.
     * </p>
     * 
     * @return The EC2 instance types that users can select from when launching a streaming session with this launch
     *         profile.
     * @see StreamingInstanceType
     */

    public java.util.List<String> getEc2InstanceTypes() {
        return ec2InstanceTypes;
    }

    /**
     * <p>
     * The EC2 instance types that users can select from when launching a streaming session with this launch profile.
     * </p>
     * 
     * @param ec2InstanceTypes
     *        The EC2 instance types that users can select from when launching a streaming session with this launch
     *        profile.
     * @see StreamingInstanceType
     */

    public void setEc2InstanceTypes(java.util.Collection<String> ec2InstanceTypes) {
        if (ec2InstanceTypes == null) {
            this.ec2InstanceTypes = null;
            return;
        }

        this.ec2InstanceTypes = new java.util.ArrayList<String>(ec2InstanceTypes);
    }

    /**
     * <p>
     * The EC2 instance types that users can select from when launching a streaming session with this launch profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2InstanceTypes(java.util.Collection)} or {@link #withEc2InstanceTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ec2InstanceTypes
     *        The EC2 instance types that users can select from when launching a streaming session with this launch
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingInstanceType
     */

    public StreamConfigurationCreate withEc2InstanceTypes(String... ec2InstanceTypes) {
        if (this.ec2InstanceTypes == null) {
            setEc2InstanceTypes(new java.util.ArrayList<String>(ec2InstanceTypes.length));
        }
        for (String ele : ec2InstanceTypes) {
            this.ec2InstanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 instance types that users can select from when launching a streaming session with this launch profile.
     * </p>
     * 
     * @param ec2InstanceTypes
     *        The EC2 instance types that users can select from when launching a streaming session with this launch
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingInstanceType
     */

    public StreamConfigurationCreate withEc2InstanceTypes(java.util.Collection<String> ec2InstanceTypes) {
        setEc2InstanceTypes(ec2InstanceTypes);
        return this;
    }

    /**
     * <p>
     * The EC2 instance types that users can select from when launching a streaming session with this launch profile.
     * </p>
     * 
     * @param ec2InstanceTypes
     *        The EC2 instance types that users can select from when launching a streaming session with this launch
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingInstanceType
     */

    public StreamConfigurationCreate withEc2InstanceTypes(StreamingInstanceType... ec2InstanceTypes) {
        java.util.ArrayList<String> ec2InstanceTypesCopy = new java.util.ArrayList<String>(ec2InstanceTypes.length);
        for (StreamingInstanceType value : ec2InstanceTypes) {
            ec2InstanceTypesCopy.add(value.toString());
        }
        if (getEc2InstanceTypes() == null) {
            setEc2InstanceTypes(ec2InstanceTypesCopy);
        } else {
            getEc2InstanceTypes().addAll(ec2InstanceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The length of time, in minutes, that a streaming session can be active before it is stopped or terminated. After
     * this point, Nimble Studio automatically terminates or stops the session. The default length of time is 690
     * minutes, and the maximum length of time is 30 days.
     * </p>
     * 
     * @param maxSessionLengthInMinutes
     *        The length of time, in minutes, that a streaming session can be active before it is stopped or terminated.
     *        After this point, Nimble Studio automatically terminates or stops the session. The default length of time
     *        is 690 minutes, and the maximum length of time is 30 days.
     */

    public void setMaxSessionLengthInMinutes(Integer maxSessionLengthInMinutes) {
        this.maxSessionLengthInMinutes = maxSessionLengthInMinutes;
    }

    /**
     * <p>
     * The length of time, in minutes, that a streaming session can be active before it is stopped or terminated. After
     * this point, Nimble Studio automatically terminates or stops the session. The default length of time is 690
     * minutes, and the maximum length of time is 30 days.
     * </p>
     * 
     * @return The length of time, in minutes, that a streaming session can be active before it is stopped or
     *         terminated. After this point, Nimble Studio automatically terminates or stops the session. The default
     *         length of time is 690 minutes, and the maximum length of time is 30 days.
     */

    public Integer getMaxSessionLengthInMinutes() {
        return this.maxSessionLengthInMinutes;
    }

    /**
     * <p>
     * The length of time, in minutes, that a streaming session can be active before it is stopped or terminated. After
     * this point, Nimble Studio automatically terminates or stops the session. The default length of time is 690
     * minutes, and the maximum length of time is 30 days.
     * </p>
     * 
     * @param maxSessionLengthInMinutes
     *        The length of time, in minutes, that a streaming session can be active before it is stopped or terminated.
     *        After this point, Nimble Studio automatically terminates or stops the session. The default length of time
     *        is 690 minutes, and the maximum length of time is 30 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamConfigurationCreate withMaxSessionLengthInMinutes(Integer maxSessionLengthInMinutes) {
        setMaxSessionLengthInMinutes(maxSessionLengthInMinutes);
        return this;
    }

    /**
     * <p>
     * Integer that determines if you can start and stop your sessions and how long a session can stay in the
     * <code>STOPPED</code> state. The default value is 0. The maximum value is 5760.
     * </p>
     * <p>
     * This field is allowed only when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code> and
     * <code>automaticTerminationMode</code> is <code>ACTIVATED</code>.
     * </p>
     * <p>
     * If the value is set to 0, your sessions can’t be <code>STOPPED</code>. If you then call
     * <code>StopStreamingSession</code>, the session fails. If the time that a session stays in the <code>READY</code>
     * state exceeds the <code>maxSessionLengthInMinutes</code> value, the session will automatically be terminated
     * (instead of <code>STOPPED</code>).
     * </p>
     * <p>
     * If the value is set to a positive number, the session can be stopped. You can call
     * <code>StopStreamingSession</code> to stop sessions in the <code>READY</code> state. If the time that a session
     * stays in the <code>READY</code> state exceeds the <code>maxSessionLengthInMinutes</code> value, the session will
     * automatically be stopped (instead of terminated).
     * </p>
     * 
     * @param maxStoppedSessionLengthInMinutes
     *        Integer that determines if you can start and stop your sessions and how long a session can stay in the
     *        <code>STOPPED</code> state. The default value is 0. The maximum value is 5760.</p>
     *        <p>
     *        This field is allowed only when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code> and
     *        <code>automaticTerminationMode</code> is <code>ACTIVATED</code>.
     *        </p>
     *        <p>
     *        If the value is set to 0, your sessions can’t be <code>STOPPED</code>. If you then call
     *        <code>StopStreamingSession</code>, the session fails. If the time that a session stays in the
     *        <code>READY</code> state exceeds the <code>maxSessionLengthInMinutes</code> value, the session will
     *        automatically be terminated (instead of <code>STOPPED</code>).
     *        </p>
     *        <p>
     *        If the value is set to a positive number, the session can be stopped. You can call
     *        <code>StopStreamingSession</code> to stop sessions in the <code>READY</code> state. If the time that a
     *        session stays in the <code>READY</code> state exceeds the <code>maxSessionLengthInMinutes</code> value,
     *        the session will automatically be stopped (instead of terminated).
     */

    public void setMaxStoppedSessionLengthInMinutes(Integer maxStoppedSessionLengthInMinutes) {
        this.maxStoppedSessionLengthInMinutes = maxStoppedSessionLengthInMinutes;
    }

    /**
     * <p>
     * Integer that determines if you can start and stop your sessions and how long a session can stay in the
     * <code>STOPPED</code> state. The default value is 0. The maximum value is 5760.
     * </p>
     * <p>
     * This field is allowed only when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code> and
     * <code>automaticTerminationMode</code> is <code>ACTIVATED</code>.
     * </p>
     * <p>
     * If the value is set to 0, your sessions can’t be <code>STOPPED</code>. If you then call
     * <code>StopStreamingSession</code>, the session fails. If the time that a session stays in the <code>READY</code>
     * state exceeds the <code>maxSessionLengthInMinutes</code> value, the session will automatically be terminated
     * (instead of <code>STOPPED</code>).
     * </p>
     * <p>
     * If the value is set to a positive number, the session can be stopped. You can call
     * <code>StopStreamingSession</code> to stop sessions in the <code>READY</code> state. If the time that a session
     * stays in the <code>READY</code> state exceeds the <code>maxSessionLengthInMinutes</code> value, the session will
     * automatically be stopped (instead of terminated).
     * </p>
     * 
     * @return Integer that determines if you can start and stop your sessions and how long a session can stay in the
     *         <code>STOPPED</code> state. The default value is 0. The maximum value is 5760.</p>
     *         <p>
     *         This field is allowed only when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code> and
     *         <code>automaticTerminationMode</code> is <code>ACTIVATED</code>.
     *         </p>
     *         <p>
     *         If the value is set to 0, your sessions can’t be <code>STOPPED</code>. If you then call
     *         <code>StopStreamingSession</code>, the session fails. If the time that a session stays in the
     *         <code>READY</code> state exceeds the <code>maxSessionLengthInMinutes</code> value, the session will
     *         automatically be terminated (instead of <code>STOPPED</code>).
     *         </p>
     *         <p>
     *         If the value is set to a positive number, the session can be stopped. You can call
     *         <code>StopStreamingSession</code> to stop sessions in the <code>READY</code> state. If the time that a
     *         session stays in the <code>READY</code> state exceeds the <code>maxSessionLengthInMinutes</code> value,
     *         the session will automatically be stopped (instead of terminated).
     */

    public Integer getMaxStoppedSessionLengthInMinutes() {
        return this.maxStoppedSessionLengthInMinutes;
    }

    /**
     * <p>
     * Integer that determines if you can start and stop your sessions and how long a session can stay in the
     * <code>STOPPED</code> state. The default value is 0. The maximum value is 5760.
     * </p>
     * <p>
     * This field is allowed only when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code> and
     * <code>automaticTerminationMode</code> is <code>ACTIVATED</code>.
     * </p>
     * <p>
     * If the value is set to 0, your sessions can’t be <code>STOPPED</code>. If you then call
     * <code>StopStreamingSession</code>, the session fails. If the time that a session stays in the <code>READY</code>
     * state exceeds the <code>maxSessionLengthInMinutes</code> value, the session will automatically be terminated
     * (instead of <code>STOPPED</code>).
     * </p>
     * <p>
     * If the value is set to a positive number, the session can be stopped. You can call
     * <code>StopStreamingSession</code> to stop sessions in the <code>READY</code> state. If the time that a session
     * stays in the <code>READY</code> state exceeds the <code>maxSessionLengthInMinutes</code> value, the session will
     * automatically be stopped (instead of terminated).
     * </p>
     * 
     * @param maxStoppedSessionLengthInMinutes
     *        Integer that determines if you can start and stop your sessions and how long a session can stay in the
     *        <code>STOPPED</code> state. The default value is 0. The maximum value is 5760.</p>
     *        <p>
     *        This field is allowed only when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code> and
     *        <code>automaticTerminationMode</code> is <code>ACTIVATED</code>.
     *        </p>
     *        <p>
     *        If the value is set to 0, your sessions can’t be <code>STOPPED</code>. If you then call
     *        <code>StopStreamingSession</code>, the session fails. If the time that a session stays in the
     *        <code>READY</code> state exceeds the <code>maxSessionLengthInMinutes</code> value, the session will
     *        automatically be terminated (instead of <code>STOPPED</code>).
     *        </p>
     *        <p>
     *        If the value is set to a positive number, the session can be stopped. You can call
     *        <code>StopStreamingSession</code> to stop sessions in the <code>READY</code> state. If the time that a
     *        session stays in the <code>READY</code> state exceeds the <code>maxSessionLengthInMinutes</code> value,
     *        the session will automatically be stopped (instead of terminated).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamConfigurationCreate withMaxStoppedSessionLengthInMinutes(Integer maxStoppedSessionLengthInMinutes) {
        setMaxStoppedSessionLengthInMinutes(maxStoppedSessionLengthInMinutes);
        return this;
    }

    /**
     * <p>
     * Configures how streaming sessions are backed up when launched from this launch profile.
     * </p>
     * 
     * @param sessionBackup
     *        Configures how streaming sessions are backed up when launched from this launch profile.
     */

    public void setSessionBackup(StreamConfigurationSessionBackup sessionBackup) {
        this.sessionBackup = sessionBackup;
    }

    /**
     * <p>
     * Configures how streaming sessions are backed up when launched from this launch profile.
     * </p>
     * 
     * @return Configures how streaming sessions are backed up when launched from this launch profile.
     */

    public StreamConfigurationSessionBackup getSessionBackup() {
        return this.sessionBackup;
    }

    /**
     * <p>
     * Configures how streaming sessions are backed up when launched from this launch profile.
     * </p>
     * 
     * @param sessionBackup
     *        Configures how streaming sessions are backed up when launched from this launch profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamConfigurationCreate withSessionBackup(StreamConfigurationSessionBackup sessionBackup) {
        setSessionBackup(sessionBackup);
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

    public StreamConfigurationCreate withSessionPersistenceMode(String sessionPersistenceMode) {
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

    public StreamConfigurationCreate withSessionPersistenceMode(SessionPersistenceMode sessionPersistenceMode) {
        this.sessionPersistenceMode = sessionPersistenceMode.toString();
        return this;
    }

    /**
     * <p>
     * The upload storage for a streaming workstation that is created using this launch profile.
     * </p>
     * 
     * @param sessionStorage
     *        The upload storage for a streaming workstation that is created using this launch profile.
     */

    public void setSessionStorage(StreamConfigurationSessionStorage sessionStorage) {
        this.sessionStorage = sessionStorage;
    }

    /**
     * <p>
     * The upload storage for a streaming workstation that is created using this launch profile.
     * </p>
     * 
     * @return The upload storage for a streaming workstation that is created using this launch profile.
     */

    public StreamConfigurationSessionStorage getSessionStorage() {
        return this.sessionStorage;
    }

    /**
     * <p>
     * The upload storage for a streaming workstation that is created using this launch profile.
     * </p>
     * 
     * @param sessionStorage
     *        The upload storage for a streaming workstation that is created using this launch profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamConfigurationCreate withSessionStorage(StreamConfigurationSessionStorage sessionStorage) {
        setSessionStorage(sessionStorage);
        return this;
    }

    /**
     * <p>
     * The streaming images that users can select from when launching a streaming session with this launch profile.
     * </p>
     * 
     * @return The streaming images that users can select from when launching a streaming session with this launch
     *         profile.
     */

    public java.util.List<String> getStreamingImageIds() {
        return streamingImageIds;
    }

    /**
     * <p>
     * The streaming images that users can select from when launching a streaming session with this launch profile.
     * </p>
     * 
     * @param streamingImageIds
     *        The streaming images that users can select from when launching a streaming session with this launch
     *        profile.
     */

    public void setStreamingImageIds(java.util.Collection<String> streamingImageIds) {
        if (streamingImageIds == null) {
            this.streamingImageIds = null;
            return;
        }

        this.streamingImageIds = new java.util.ArrayList<String>(streamingImageIds);
    }

    /**
     * <p>
     * The streaming images that users can select from when launching a streaming session with this launch profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreamingImageIds(java.util.Collection)} or {@link #withStreamingImageIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param streamingImageIds
     *        The streaming images that users can select from when launching a streaming session with this launch
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamConfigurationCreate withStreamingImageIds(String... streamingImageIds) {
        if (this.streamingImageIds == null) {
            setStreamingImageIds(new java.util.ArrayList<String>(streamingImageIds.length));
        }
        for (String ele : streamingImageIds) {
            this.streamingImageIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The streaming images that users can select from when launching a streaming session with this launch profile.
     * </p>
     * 
     * @param streamingImageIds
     *        The streaming images that users can select from when launching a streaming session with this launch
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamConfigurationCreate withStreamingImageIds(java.util.Collection<String> streamingImageIds) {
        setStreamingImageIds(streamingImageIds);
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

    public StreamConfigurationCreate withVolumeConfiguration(VolumeConfiguration volumeConfiguration) {
        setVolumeConfiguration(volumeConfiguration);
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
        if (getAutomaticTerminationMode() != null)
            sb.append("AutomaticTerminationMode: ").append(getAutomaticTerminationMode()).append(",");
        if (getClipboardMode() != null)
            sb.append("ClipboardMode: ").append(getClipboardMode()).append(",");
        if (getEc2InstanceTypes() != null)
            sb.append("Ec2InstanceTypes: ").append(getEc2InstanceTypes()).append(",");
        if (getMaxSessionLengthInMinutes() != null)
            sb.append("MaxSessionLengthInMinutes: ").append(getMaxSessionLengthInMinutes()).append(",");
        if (getMaxStoppedSessionLengthInMinutes() != null)
            sb.append("MaxStoppedSessionLengthInMinutes: ").append(getMaxStoppedSessionLengthInMinutes()).append(",");
        if (getSessionBackup() != null)
            sb.append("SessionBackup: ").append(getSessionBackup()).append(",");
        if (getSessionPersistenceMode() != null)
            sb.append("SessionPersistenceMode: ").append(getSessionPersistenceMode()).append(",");
        if (getSessionStorage() != null)
            sb.append("SessionStorage: ").append(getSessionStorage()).append(",");
        if (getStreamingImageIds() != null)
            sb.append("StreamingImageIds: ").append(getStreamingImageIds()).append(",");
        if (getVolumeConfiguration() != null)
            sb.append("VolumeConfiguration: ").append(getVolumeConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamConfigurationCreate == false)
            return false;
        StreamConfigurationCreate other = (StreamConfigurationCreate) obj;
        if (other.getAutomaticTerminationMode() == null ^ this.getAutomaticTerminationMode() == null)
            return false;
        if (other.getAutomaticTerminationMode() != null && other.getAutomaticTerminationMode().equals(this.getAutomaticTerminationMode()) == false)
            return false;
        if (other.getClipboardMode() == null ^ this.getClipboardMode() == null)
            return false;
        if (other.getClipboardMode() != null && other.getClipboardMode().equals(this.getClipboardMode()) == false)
            return false;
        if (other.getEc2InstanceTypes() == null ^ this.getEc2InstanceTypes() == null)
            return false;
        if (other.getEc2InstanceTypes() != null && other.getEc2InstanceTypes().equals(this.getEc2InstanceTypes()) == false)
            return false;
        if (other.getMaxSessionLengthInMinutes() == null ^ this.getMaxSessionLengthInMinutes() == null)
            return false;
        if (other.getMaxSessionLengthInMinutes() != null && other.getMaxSessionLengthInMinutes().equals(this.getMaxSessionLengthInMinutes()) == false)
            return false;
        if (other.getMaxStoppedSessionLengthInMinutes() == null ^ this.getMaxStoppedSessionLengthInMinutes() == null)
            return false;
        if (other.getMaxStoppedSessionLengthInMinutes() != null
                && other.getMaxStoppedSessionLengthInMinutes().equals(this.getMaxStoppedSessionLengthInMinutes()) == false)
            return false;
        if (other.getSessionBackup() == null ^ this.getSessionBackup() == null)
            return false;
        if (other.getSessionBackup() != null && other.getSessionBackup().equals(this.getSessionBackup()) == false)
            return false;
        if (other.getSessionPersistenceMode() == null ^ this.getSessionPersistenceMode() == null)
            return false;
        if (other.getSessionPersistenceMode() != null && other.getSessionPersistenceMode().equals(this.getSessionPersistenceMode()) == false)
            return false;
        if (other.getSessionStorage() == null ^ this.getSessionStorage() == null)
            return false;
        if (other.getSessionStorage() != null && other.getSessionStorage().equals(this.getSessionStorage()) == false)
            return false;
        if (other.getStreamingImageIds() == null ^ this.getStreamingImageIds() == null)
            return false;
        if (other.getStreamingImageIds() != null && other.getStreamingImageIds().equals(this.getStreamingImageIds()) == false)
            return false;
        if (other.getVolumeConfiguration() == null ^ this.getVolumeConfiguration() == null)
            return false;
        if (other.getVolumeConfiguration() != null && other.getVolumeConfiguration().equals(this.getVolumeConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomaticTerminationMode() == null) ? 0 : getAutomaticTerminationMode().hashCode());
        hashCode = prime * hashCode + ((getClipboardMode() == null) ? 0 : getClipboardMode().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceTypes() == null) ? 0 : getEc2InstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getMaxSessionLengthInMinutes() == null) ? 0 : getMaxSessionLengthInMinutes().hashCode());
        hashCode = prime * hashCode + ((getMaxStoppedSessionLengthInMinutes() == null) ? 0 : getMaxStoppedSessionLengthInMinutes().hashCode());
        hashCode = prime * hashCode + ((getSessionBackup() == null) ? 0 : getSessionBackup().hashCode());
        hashCode = prime * hashCode + ((getSessionPersistenceMode() == null) ? 0 : getSessionPersistenceMode().hashCode());
        hashCode = prime * hashCode + ((getSessionStorage() == null) ? 0 : getSessionStorage().hashCode());
        hashCode = prime * hashCode + ((getStreamingImageIds() == null) ? 0 : getStreamingImageIds().hashCode());
        hashCode = prime * hashCode + ((getVolumeConfiguration() == null) ? 0 : getVolumeConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public StreamConfigurationCreate clone() {
        try {
            return (StreamConfigurationCreate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StreamConfigurationCreateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
