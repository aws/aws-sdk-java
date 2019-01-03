/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RegisterActivityType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterActivityTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain in which this activity is to be registered.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The name of the activity type within the domain.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the activity type.
     * </p>
     * <note>
     * <p>
     * The activity type consists of the name and version, the combination of which must be unique within the domain.
     * </p>
     * </note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     */
    private String version;
    /**
     * <p>
     * A textual description of the activity type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * If set, specifies the default maximum duration that a worker can take to process tasks of this activity type.
     * This default can be overridden when scheduling an activity task using the <code>ScheduleActivityTask</code>
     * <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     */
    private String defaultTaskStartToCloseTimeout;
    /**
     * <p>
     * If set, specifies the default maximum time before which a worker processing a task of this type must report
     * progress by calling <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is
     * automatically timed out. This default can be overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity worker subsequently attempts to record a
     * heartbeat or returns a result, the activity worker receives an <code>UnknownResource</code> fault. In this case,
     * Amazon SWF no longer considers the activity task to be valid; the activity worker should clean up the activity
     * task.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     */
    private String defaultTaskHeartbeatTimeout;
    /**
     * <p>
     * If set, specifies the default task list to use for scheduling tasks of this activity type. This default task list
     * is used if a task list isn't provided when a task is scheduled through the <code>ScheduleActivityTask</code>
     * <a>Decision</a>.
     * </p>
     */
    private TaskList defaultTaskList;
    /**
     * <p>
     * The default task priority to assign to the activity type. If not assigned, then <code>0</code> is used. Valid
     * values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>in the <i>Amazon SWF Developer Guide</i>.</i>.
     * </p>
     */
    private String defaultTaskPriority;
    /**
     * <p>
     * If set, specifies the default maximum duration that a task of this activity type can wait before being assigned
     * to a worker. This default can be overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     */
    private String defaultTaskScheduleToStartTimeout;
    /**
     * <p>
     * If set, specifies the default maximum duration for a task of this activity type. This default can be overridden
     * when scheduling an activity task using the <code>ScheduleActivityTask</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     */
    private String defaultTaskScheduleToCloseTimeout;

    /**
     * <p>
     * The name of the domain in which this activity is to be registered.
     * </p>
     * 
     * @param domain
     *        The name of the domain in which this activity is to be registered.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain in which this activity is to be registered.
     * </p>
     * 
     * @return The name of the domain in which this activity is to be registered.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain in which this activity is to be registered.
     * </p>
     * 
     * @param domain
     *        The name of the domain in which this activity is to be registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterActivityTypeRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The name of the activity type within the domain.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param name
     *        The name of the activity type within the domain.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the activity type within the domain.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @return The name of the activity type within the domain.</p>
     *         <p>
     *         The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *         <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *         <code>arn</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the activity type within the domain.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param name
     *        The name of the activity type within the domain.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterActivityTypeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the activity type.
     * </p>
     * <note>
     * <p>
     * The activity type consists of the name and version, the combination of which must be unique within the domain.
     * </p>
     * </note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param version
     *        The version of the activity type.</p> <note>
     *        <p>
     *        The activity type consists of the name and version, the combination of which must be unique within the
     *        domain.
     *        </p>
     *        </note>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the activity type.
     * </p>
     * <note>
     * <p>
     * The activity type consists of the name and version, the combination of which must be unique within the domain.
     * </p>
     * </note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @return The version of the activity type.</p> <note>
     *         <p>
     *         The activity type consists of the name and version, the combination of which must be unique within the
     *         domain.
     *         </p>
     *         </note>
     *         <p>
     *         The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *         <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *         <code>arn</code>.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the activity type.
     * </p>
     * <note>
     * <p>
     * The activity type consists of the name and version, the combination of which must be unique within the domain.
     * </p>
     * </note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param version
     *        The version of the activity type.</p> <note>
     *        <p>
     *        The activity type consists of the name and version, the combination of which must be unique within the
     *        domain.
     *        </p>
     *        </note>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterActivityTypeRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * A textual description of the activity type.
     * </p>
     * 
     * @param description
     *        A textual description of the activity type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A textual description of the activity type.
     * </p>
     * 
     * @return A textual description of the activity type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A textual description of the activity type.
     * </p>
     * 
     * @param description
     *        A textual description of the activity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterActivityTypeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration that a worker can take to process tasks of this activity type.
     * This default can be overridden when scheduling an activity task using the <code>ScheduleActivityTask</code>
     * <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskStartToCloseTimeout
     *        If set, specifies the default maximum duration that a worker can take to process tasks of this activity
     *        type. This default can be overridden when scheduling an activity task using the
     *        <code>ScheduleActivityTask</code> <a>Decision</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     */

    public void setDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        this.defaultTaskStartToCloseTimeout = defaultTaskStartToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration that a worker can take to process tasks of this activity type.
     * This default can be overridden when scheduling an activity task using the <code>ScheduleActivityTask</code>
     * <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @return If set, specifies the default maximum duration that a worker can take to process tasks of this activity
     *         type. This default can be overridden when scheduling an activity task using the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>.</p>
     *         <p>
     *         The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *         <code>NONE</code> to specify unlimited duration.
     */

    public String getDefaultTaskStartToCloseTimeout() {
        return this.defaultTaskStartToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration that a worker can take to process tasks of this activity type.
     * This default can be overridden when scheduling an activity task using the <code>ScheduleActivityTask</code>
     * <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskStartToCloseTimeout
     *        If set, specifies the default maximum duration that a worker can take to process tasks of this activity
     *        type. This default can be overridden when scheduling an activity task using the
     *        <code>ScheduleActivityTask</code> <a>Decision</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterActivityTypeRequest withDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        setDefaultTaskStartToCloseTimeout(defaultTaskStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * If set, specifies the default maximum time before which a worker processing a task of this type must report
     * progress by calling <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is
     * automatically timed out. This default can be overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity worker subsequently attempts to record a
     * heartbeat or returns a result, the activity worker receives an <code>UnknownResource</code> fault. In this case,
     * Amazon SWF no longer considers the activity task to be valid; the activity worker should clean up the activity
     * task.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskHeartbeatTimeout
     *        If set, specifies the default maximum time before which a worker processing a task of this type must
     *        report progress by calling <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity
     *        task is automatically timed out. This default can be overridden when scheduling an activity task using the
     *        <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity worker subsequently attempts to record
     *        a heartbeat or returns a result, the activity worker receives an <code>UnknownResource</code> fault. In
     *        this case, Amazon SWF no longer considers the activity task to be valid; the activity worker should clean
     *        up the activity task.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     */

    public void setDefaultTaskHeartbeatTimeout(String defaultTaskHeartbeatTimeout) {
        this.defaultTaskHeartbeatTimeout = defaultTaskHeartbeatTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum time before which a worker processing a task of this type must report
     * progress by calling <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is
     * automatically timed out. This default can be overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity worker subsequently attempts to record a
     * heartbeat or returns a result, the activity worker receives an <code>UnknownResource</code> fault. In this case,
     * Amazon SWF no longer considers the activity task to be valid; the activity worker should clean up the activity
     * task.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @return If set, specifies the default maximum time before which a worker processing a task of this type must
     *         report progress by calling <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity
     *         task is automatically timed out. This default can be overridden when scheduling an activity task using
     *         the <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity worker subsequently attempts to
     *         record a heartbeat or returns a result, the activity worker receives an <code>UnknownResource</code>
     *         fault. In this case, Amazon SWF no longer considers the activity task to be valid; the activity worker
     *         should clean up the activity task.</p>
     *         <p>
     *         The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *         <code>NONE</code> to specify unlimited duration.
     */

    public String getDefaultTaskHeartbeatTimeout() {
        return this.defaultTaskHeartbeatTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum time before which a worker processing a task of this type must report
     * progress by calling <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is
     * automatically timed out. This default can be overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity worker subsequently attempts to record a
     * heartbeat or returns a result, the activity worker receives an <code>UnknownResource</code> fault. In this case,
     * Amazon SWF no longer considers the activity task to be valid; the activity worker should clean up the activity
     * task.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskHeartbeatTimeout
     *        If set, specifies the default maximum time before which a worker processing a task of this type must
     *        report progress by calling <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity
     *        task is automatically timed out. This default can be overridden when scheduling an activity task using the
     *        <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity worker subsequently attempts to record
     *        a heartbeat or returns a result, the activity worker receives an <code>UnknownResource</code> fault. In
     *        this case, Amazon SWF no longer considers the activity task to be valid; the activity worker should clean
     *        up the activity task.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterActivityTypeRequest withDefaultTaskHeartbeatTimeout(String defaultTaskHeartbeatTimeout) {
        setDefaultTaskHeartbeatTimeout(defaultTaskHeartbeatTimeout);
        return this;
    }

    /**
     * <p>
     * If set, specifies the default task list to use for scheduling tasks of this activity type. This default task list
     * is used if a task list isn't provided when a task is scheduled through the <code>ScheduleActivityTask</code>
     * <a>Decision</a>.
     * </p>
     * 
     * @param defaultTaskList
     *        If set, specifies the default task list to use for scheduling tasks of this activity type. This default
     *        task list is used if a task list isn't provided when a task is scheduled through the
     *        <code>ScheduleActivityTask</code> <a>Decision</a>.
     */

    public void setDefaultTaskList(TaskList defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
    }

    /**
     * <p>
     * If set, specifies the default task list to use for scheduling tasks of this activity type. This default task list
     * is used if a task list isn't provided when a task is scheduled through the <code>ScheduleActivityTask</code>
     * <a>Decision</a>.
     * </p>
     * 
     * @return If set, specifies the default task list to use for scheduling tasks of this activity type. This default
     *         task list is used if a task list isn't provided when a task is scheduled through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>.
     */

    public TaskList getDefaultTaskList() {
        return this.defaultTaskList;
    }

    /**
     * <p>
     * If set, specifies the default task list to use for scheduling tasks of this activity type. This default task list
     * is used if a task list isn't provided when a task is scheduled through the <code>ScheduleActivityTask</code>
     * <a>Decision</a>.
     * </p>
     * 
     * @param defaultTaskList
     *        If set, specifies the default task list to use for scheduling tasks of this activity type. This default
     *        task list is used if a task list isn't provided when a task is scheduled through the
     *        <code>ScheduleActivityTask</code> <a>Decision</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterActivityTypeRequest withDefaultTaskList(TaskList defaultTaskList) {
        setDefaultTaskList(defaultTaskList);
        return this;
    }

    /**
     * <p>
     * The default task priority to assign to the activity type. If not assigned, then <code>0</code> is used. Valid
     * values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>in the <i>Amazon SWF Developer Guide</i>.</i>.
     * </p>
     * 
     * @param defaultTaskPriority
     *        The default task priority to assign to the activity type. If not assigned, then <code>0</code> is used.
     *        Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *        <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>in the <i>Amazon SWF Developer Guide</i>.</i>.
     */

    public void setDefaultTaskPriority(String defaultTaskPriority) {
        this.defaultTaskPriority = defaultTaskPriority;
    }

    /**
     * <p>
     * The default task priority to assign to the activity type. If not assigned, then <code>0</code> is used. Valid
     * values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>in the <i>Amazon SWF Developer Guide</i>.</i>.
     * </p>
     * 
     * @return The default task priority to assign to the activity type. If not assigned, then <code>0</code> is used.
     *         Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
     *         <p>
     *         For more information about setting task priority, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *         Priority</a> in the <i>in the <i>Amazon SWF Developer Guide</i>.</i>.
     */

    public String getDefaultTaskPriority() {
        return this.defaultTaskPriority;
    }

    /**
     * <p>
     * The default task priority to assign to the activity type. If not assigned, then <code>0</code> is used. Valid
     * values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>in the <i>Amazon SWF Developer Guide</i>.</i>.
     * </p>
     * 
     * @param defaultTaskPriority
     *        The default task priority to assign to the activity type. If not assigned, then <code>0</code> is used.
     *        Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *        <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>in the <i>Amazon SWF Developer Guide</i>.</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterActivityTypeRequest withDefaultTaskPriority(String defaultTaskPriority) {
        setDefaultTaskPriority(defaultTaskPriority);
        return this;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration that a task of this activity type can wait before being assigned
     * to a worker. This default can be overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskScheduleToStartTimeout
     *        If set, specifies the default maximum duration that a task of this activity type can wait before being
     *        assigned to a worker. This default can be overridden when scheduling an activity task using the
     *        <code>ScheduleActivityTask</code> <a>Decision</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     */

    public void setDefaultTaskScheduleToStartTimeout(String defaultTaskScheduleToStartTimeout) {
        this.defaultTaskScheduleToStartTimeout = defaultTaskScheduleToStartTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration that a task of this activity type can wait before being assigned
     * to a worker. This default can be overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @return If set, specifies the default maximum duration that a task of this activity type can wait before being
     *         assigned to a worker. This default can be overridden when scheduling an activity task using the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>.</p>
     *         <p>
     *         The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *         <code>NONE</code> to specify unlimited duration.
     */

    public String getDefaultTaskScheduleToStartTimeout() {
        return this.defaultTaskScheduleToStartTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration that a task of this activity type can wait before being assigned
     * to a worker. This default can be overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskScheduleToStartTimeout
     *        If set, specifies the default maximum duration that a task of this activity type can wait before being
     *        assigned to a worker. This default can be overridden when scheduling an activity task using the
     *        <code>ScheduleActivityTask</code> <a>Decision</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterActivityTypeRequest withDefaultTaskScheduleToStartTimeout(String defaultTaskScheduleToStartTimeout) {
        setDefaultTaskScheduleToStartTimeout(defaultTaskScheduleToStartTimeout);
        return this;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration for a task of this activity type. This default can be overridden
     * when scheduling an activity task using the <code>ScheduleActivityTask</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskScheduleToCloseTimeout
     *        If set, specifies the default maximum duration for a task of this activity type. This default can be
     *        overridden when scheduling an activity task using the <code>ScheduleActivityTask</code>
     *        <a>Decision</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     */

    public void setDefaultTaskScheduleToCloseTimeout(String defaultTaskScheduleToCloseTimeout) {
        this.defaultTaskScheduleToCloseTimeout = defaultTaskScheduleToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration for a task of this activity type. This default can be overridden
     * when scheduling an activity task using the <code>ScheduleActivityTask</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @return If set, specifies the default maximum duration for a task of this activity type. This default can be
     *         overridden when scheduling an activity task using the <code>ScheduleActivityTask</code>
     *         <a>Decision</a>.</p>
     *         <p>
     *         The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *         <code>NONE</code> to specify unlimited duration.
     */

    public String getDefaultTaskScheduleToCloseTimeout() {
        return this.defaultTaskScheduleToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration for a task of this activity type. This default can be overridden
     * when scheduling an activity task using the <code>ScheduleActivityTask</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskScheduleToCloseTimeout
     *        If set, specifies the default maximum duration for a task of this activity type. This default can be
     *        overridden when scheduling an activity task using the <code>ScheduleActivityTask</code>
     *        <a>Decision</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterActivityTypeRequest withDefaultTaskScheduleToCloseTimeout(String defaultTaskScheduleToCloseTimeout) {
        setDefaultTaskScheduleToCloseTimeout(defaultTaskScheduleToCloseTimeout);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDefaultTaskStartToCloseTimeout() != null)
            sb.append("DefaultTaskStartToCloseTimeout: ").append(getDefaultTaskStartToCloseTimeout()).append(",");
        if (getDefaultTaskHeartbeatTimeout() != null)
            sb.append("DefaultTaskHeartbeatTimeout: ").append(getDefaultTaskHeartbeatTimeout()).append(",");
        if (getDefaultTaskList() != null)
            sb.append("DefaultTaskList: ").append(getDefaultTaskList()).append(",");
        if (getDefaultTaskPriority() != null)
            sb.append("DefaultTaskPriority: ").append(getDefaultTaskPriority()).append(",");
        if (getDefaultTaskScheduleToStartTimeout() != null)
            sb.append("DefaultTaskScheduleToStartTimeout: ").append(getDefaultTaskScheduleToStartTimeout()).append(",");
        if (getDefaultTaskScheduleToCloseTimeout() != null)
            sb.append("DefaultTaskScheduleToCloseTimeout: ").append(getDefaultTaskScheduleToCloseTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterActivityTypeRequest == false)
            return false;
        RegisterActivityTypeRequest other = (RegisterActivityTypeRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultTaskStartToCloseTimeout() == null ^ this.getDefaultTaskStartToCloseTimeout() == null)
            return false;
        if (other.getDefaultTaskStartToCloseTimeout() != null
                && other.getDefaultTaskStartToCloseTimeout().equals(this.getDefaultTaskStartToCloseTimeout()) == false)
            return false;
        if (other.getDefaultTaskHeartbeatTimeout() == null ^ this.getDefaultTaskHeartbeatTimeout() == null)
            return false;
        if (other.getDefaultTaskHeartbeatTimeout() != null && other.getDefaultTaskHeartbeatTimeout().equals(this.getDefaultTaskHeartbeatTimeout()) == false)
            return false;
        if (other.getDefaultTaskList() == null ^ this.getDefaultTaskList() == null)
            return false;
        if (other.getDefaultTaskList() != null && other.getDefaultTaskList().equals(this.getDefaultTaskList()) == false)
            return false;
        if (other.getDefaultTaskPriority() == null ^ this.getDefaultTaskPriority() == null)
            return false;
        if (other.getDefaultTaskPriority() != null && other.getDefaultTaskPriority().equals(this.getDefaultTaskPriority()) == false)
            return false;
        if (other.getDefaultTaskScheduleToStartTimeout() == null ^ this.getDefaultTaskScheduleToStartTimeout() == null)
            return false;
        if (other.getDefaultTaskScheduleToStartTimeout() != null
                && other.getDefaultTaskScheduleToStartTimeout().equals(this.getDefaultTaskScheduleToStartTimeout()) == false)
            return false;
        if (other.getDefaultTaskScheduleToCloseTimeout() == null ^ this.getDefaultTaskScheduleToCloseTimeout() == null)
            return false;
        if (other.getDefaultTaskScheduleToCloseTimeout() != null
                && other.getDefaultTaskScheduleToCloseTimeout().equals(this.getDefaultTaskScheduleToCloseTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskStartToCloseTimeout() == null) ? 0 : getDefaultTaskStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskHeartbeatTimeout() == null) ? 0 : getDefaultTaskHeartbeatTimeout().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskList() == null) ? 0 : getDefaultTaskList().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskPriority() == null) ? 0 : getDefaultTaskPriority().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskScheduleToStartTimeout() == null) ? 0 : getDefaultTaskScheduleToStartTimeout().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskScheduleToCloseTimeout() == null) ? 0 : getDefaultTaskScheduleToCloseTimeout().hashCode());
        return hashCode;
    }

    @Override
    public RegisterActivityTypeRequest clone() {
        return (RegisterActivityTypeRequest) super.clone();
    }

}
