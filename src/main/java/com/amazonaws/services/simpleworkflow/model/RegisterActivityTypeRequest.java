/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#registerActivityType(RegisterActivityTypeRequest) RegisterActivityType operation}.
 * <p>
 * Registers a new <i>activity type</i> along with its configuration settings in the specified domain.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> A TypeAlreadyExists fault is returned if the type already exists in the domain. You cannot change any configuration settings of the
 * type after its registration, and it must be registered as a new version.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
 * </p>
 * 
 * <ul>
 * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
 * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
 * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
 * <ul>
 * <li> <code>defaultTaskList</code> : String constraint. The key is <code>swf:defaultTaskList.name</code> .</li>
 * <li> <code>name</code> : String constraint. The key is <code>swf:name</code> .</li>
 * <li> <code>version</code> : String constraint. The key is <code>swf:version</code> .</li>
 * 
 * </ul>
 * </li>
 * 
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action
 * fails by throwing <code>OperationNotPermitted</code> . For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a> .
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#registerActivityType(RegisterActivityTypeRequest)
 */
public class RegisterActivityTypeRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the domain in which this activity is to be registered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String domain;

    /**
     * The name of the activity type within the domain. <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * The version of the activity type. <note> The activity type consists of
     * the name and version, the combination of which must be unique within
     * the domain. </note> <p>The specified string must not start or end with
     * whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String version;

    /**
     * A textual description of the activity type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * If set, specifies the default maximum duration that a worker can take
     * to process tasks of this activity type. This default can be overridden
     * when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultTaskStartToCloseTimeout;

    /**
     * If set, specifies the default maximum time before which a worker
     * processing a task of this type must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the
     * activity task is automatically timed out. This default can be
     * overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity
     * worker subsequently attempts to record a heartbeat or returns a
     * result, the activity worker receives an <code>UnknownResource</code>
     * fault. In this case, Amazon SWF no longer considers the activity task
     * to be valid; the activity worker should clean up the activity task.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultTaskHeartbeatTimeout;

    /**
     * If set, specifies the default task list to use for scheduling tasks of
     * this activity type. This default task list is used if a task list is
     * not provided when a task is scheduled through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>.
     */
    private TaskList defaultTaskList;

    /**
     * If set, specifies the default maximum duration that a task of this
     * activity type can wait before being assigned to a worker. This default
     * can be overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultTaskScheduleToStartTimeout;

    /**
     * If set, specifies the default maximum duration for a task of this
     * activity type. This default can be overridden when scheduling an
     * activity task using the <code>ScheduleActivityTask</code>
     * <a>Decision</a>. <p>The valid values are integers greater than or
     * equal to <code>0</code>. An integer value can be used to specify the
     * duration in seconds while <code>NONE</code> can be used to specify
     * unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultTaskScheduleToCloseTimeout;

    /**
     * The name of the domain in which this activity is to be registered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the domain in which this activity is to be registered.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The name of the domain in which this activity is to be registered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain in which this activity is to be registered.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The name of the domain in which this activity is to be registered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain in which this activity is to be registered.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterActivityTypeRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * The name of the activity type within the domain. <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the activity type within the domain. <p>The specified
     *         string must not start or end with whitespace. It must not contain a
     *         <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     *         (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *         \u009f). Also, it must not contain the literal string "arn".
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the activity type within the domain. <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The name of the activity type within the domain. <p>The specified
     *         string must not start or end with whitespace. It must not contain a
     *         <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     *         (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *         \u009f). Also, it must not contain the literal string "arn".
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the activity type within the domain. <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The name of the activity type within the domain. <p>The specified
     *         string must not start or end with whitespace. It must not contain a
     *         <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     *         (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *         \u009f). Also, it must not contain the literal string "arn".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterActivityTypeRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The version of the activity type. <note> The activity type consists of
     * the name and version, the combination of which must be unique within
     * the domain. </note> <p>The specified string must not start or end with
     * whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The version of the activity type. <note> The activity type consists of
     *         the name and version, the combination of which must be unique within
     *         the domain. </note> <p>The specified string must not start or end with
     *         whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     */
    public String getVersion() {
        return version;
    }
    
    /**
     * The version of the activity type. <note> The activity type consists of
     * the name and version, the combination of which must be unique within
     * the domain. </note> <p>The specified string must not start or end with
     * whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param version The version of the activity type. <note> The activity type consists of
     *         the name and version, the combination of which must be unique within
     *         the domain. </note> <p>The specified string must not start or end with
     *         whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /**
     * The version of the activity type. <note> The activity type consists of
     * the name and version, the combination of which must be unique within
     * the domain. </note> <p>The specified string must not start or end with
     * whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param version The version of the activity type. <note> The activity type consists of
     *         the name and version, the combination of which must be unique within
     *         the domain. </note> <p>The specified string must not start or end with
     *         whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterActivityTypeRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * A textual description of the activity type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return A textual description of the activity type.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A textual description of the activity type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description A textual description of the activity type.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A textual description of the activity type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description A textual description of the activity type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterActivityTypeRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * If set, specifies the default maximum duration that a worker can take
     * to process tasks of this activity type. This default can be overridden
     * when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return If set, specifies the default maximum duration that a worker can take
     *         to process tasks of this activity type. This default can be overridden
     *         when scheduling an activity task using the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     */
    public String getDefaultTaskStartToCloseTimeout() {
        return defaultTaskStartToCloseTimeout;
    }
    
    /**
     * If set, specifies the default maximum duration that a worker can take
     * to process tasks of this activity type. This default can be overridden
     * when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskStartToCloseTimeout If set, specifies the default maximum duration that a worker can take
     *         to process tasks of this activity type. This default can be overridden
     *         when scheduling an activity task using the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     */
    public void setDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        this.defaultTaskStartToCloseTimeout = defaultTaskStartToCloseTimeout;
    }
    
    /**
     * If set, specifies the default maximum duration that a worker can take
     * to process tasks of this activity type. This default can be overridden
     * when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskStartToCloseTimeout If set, specifies the default maximum duration that a worker can take
     *         to process tasks of this activity type. This default can be overridden
     *         when scheduling an activity task using the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterActivityTypeRequest withDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        this.defaultTaskStartToCloseTimeout = defaultTaskStartToCloseTimeout;
        return this;
    }

    /**
     * If set, specifies the default maximum time before which a worker
     * processing a task of this type must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the
     * activity task is automatically timed out. This default can be
     * overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity
     * worker subsequently attempts to record a heartbeat or returns a
     * result, the activity worker receives an <code>UnknownResource</code>
     * fault. In this case, Amazon SWF no longer considers the activity task
     * to be valid; the activity worker should clean up the activity task.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return If set, specifies the default maximum time before which a worker
     *         processing a task of this type must report progress by calling
     *         <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the
     *         activity task is automatically timed out. This default can be
     *         overridden when scheduling an activity task using the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity
     *         worker subsequently attempts to record a heartbeat or returns a
     *         result, the activity worker receives an <code>UnknownResource</code>
     *         fault. In this case, Amazon SWF no longer considers the activity task
     *         to be valid; the activity worker should clean up the activity task.
     *         <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     */
    public String getDefaultTaskHeartbeatTimeout() {
        return defaultTaskHeartbeatTimeout;
    }
    
    /**
     * If set, specifies the default maximum time before which a worker
     * processing a task of this type must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the
     * activity task is automatically timed out. This default can be
     * overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity
     * worker subsequently attempts to record a heartbeat or returns a
     * result, the activity worker receives an <code>UnknownResource</code>
     * fault. In this case, Amazon SWF no longer considers the activity task
     * to be valid; the activity worker should clean up the activity task.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskHeartbeatTimeout If set, specifies the default maximum time before which a worker
     *         processing a task of this type must report progress by calling
     *         <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the
     *         activity task is automatically timed out. This default can be
     *         overridden when scheduling an activity task using the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity
     *         worker subsequently attempts to record a heartbeat or returns a
     *         result, the activity worker receives an <code>UnknownResource</code>
     *         fault. In this case, Amazon SWF no longer considers the activity task
     *         to be valid; the activity worker should clean up the activity task.
     *         <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     */
    public void setDefaultTaskHeartbeatTimeout(String defaultTaskHeartbeatTimeout) {
        this.defaultTaskHeartbeatTimeout = defaultTaskHeartbeatTimeout;
    }
    
    /**
     * If set, specifies the default maximum time before which a worker
     * processing a task of this type must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the
     * activity task is automatically timed out. This default can be
     * overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity
     * worker subsequently attempts to record a heartbeat or returns a
     * result, the activity worker receives an <code>UnknownResource</code>
     * fault. In this case, Amazon SWF no longer considers the activity task
     * to be valid; the activity worker should clean up the activity task.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskHeartbeatTimeout If set, specifies the default maximum time before which a worker
     *         processing a task of this type must report progress by calling
     *         <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the
     *         activity task is automatically timed out. This default can be
     *         overridden when scheduling an activity task using the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity
     *         worker subsequently attempts to record a heartbeat or returns a
     *         result, the activity worker receives an <code>UnknownResource</code>
     *         fault. In this case, Amazon SWF no longer considers the activity task
     *         to be valid; the activity worker should clean up the activity task.
     *         <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterActivityTypeRequest withDefaultTaskHeartbeatTimeout(String defaultTaskHeartbeatTimeout) {
        this.defaultTaskHeartbeatTimeout = defaultTaskHeartbeatTimeout;
        return this;
    }

    /**
     * If set, specifies the default task list to use for scheduling tasks of
     * this activity type. This default task list is used if a task list is
     * not provided when a task is scheduled through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>.
     *
     * @return If set, specifies the default task list to use for scheduling tasks of
     *         this activity type. This default task list is used if a task list is
     *         not provided when a task is scheduled through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>.
     */
    public TaskList getDefaultTaskList() {
        return defaultTaskList;
    }
    
    /**
     * If set, specifies the default task list to use for scheduling tasks of
     * this activity type. This default task list is used if a task list is
     * not provided when a task is scheduled through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>.
     *
     * @param defaultTaskList If set, specifies the default task list to use for scheduling tasks of
     *         this activity type. This default task list is used if a task list is
     *         not provided when a task is scheduled through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>.
     */
    public void setDefaultTaskList(TaskList defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
    }
    
    /**
     * If set, specifies the default task list to use for scheduling tasks of
     * this activity type. This default task list is used if a task list is
     * not provided when a task is scheduled through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultTaskList If set, specifies the default task list to use for scheduling tasks of
     *         this activity type. This default task list is used if a task list is
     *         not provided when a task is scheduled through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterActivityTypeRequest withDefaultTaskList(TaskList defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
        return this;
    }

    /**
     * If set, specifies the default maximum duration that a task of this
     * activity type can wait before being assigned to a worker. This default
     * can be overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return If set, specifies the default maximum duration that a task of this
     *         activity type can wait before being assigned to a worker. This default
     *         can be overridden when scheduling an activity task using the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     */
    public String getDefaultTaskScheduleToStartTimeout() {
        return defaultTaskScheduleToStartTimeout;
    }
    
    /**
     * If set, specifies the default maximum duration that a task of this
     * activity type can wait before being assigned to a worker. This default
     * can be overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskScheduleToStartTimeout If set, specifies the default maximum duration that a task of this
     *         activity type can wait before being assigned to a worker. This default
     *         can be overridden when scheduling an activity task using the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     */
    public void setDefaultTaskScheduleToStartTimeout(String defaultTaskScheduleToStartTimeout) {
        this.defaultTaskScheduleToStartTimeout = defaultTaskScheduleToStartTimeout;
    }
    
    /**
     * If set, specifies the default maximum duration that a task of this
     * activity type can wait before being assigned to a worker. This default
     * can be overridden when scheduling an activity task using the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskScheduleToStartTimeout If set, specifies the default maximum duration that a task of this
     *         activity type can wait before being assigned to a worker. This default
     *         can be overridden when scheduling an activity task using the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterActivityTypeRequest withDefaultTaskScheduleToStartTimeout(String defaultTaskScheduleToStartTimeout) {
        this.defaultTaskScheduleToStartTimeout = defaultTaskScheduleToStartTimeout;
        return this;
    }

    /**
     * If set, specifies the default maximum duration for a task of this
     * activity type. This default can be overridden when scheduling an
     * activity task using the <code>ScheduleActivityTask</code>
     * <a>Decision</a>. <p>The valid values are integers greater than or
     * equal to <code>0</code>. An integer value can be used to specify the
     * duration in seconds while <code>NONE</code> can be used to specify
     * unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return If set, specifies the default maximum duration for a task of this
     *         activity type. This default can be overridden when scheduling an
     *         activity task using the <code>ScheduleActivityTask</code>
     *         <a>Decision</a>. <p>The valid values are integers greater than or
     *         equal to <code>0</code>. An integer value can be used to specify the
     *         duration in seconds while <code>NONE</code> can be used to specify
     *         unlimited duration.
     */
    public String getDefaultTaskScheduleToCloseTimeout() {
        return defaultTaskScheduleToCloseTimeout;
    }
    
    /**
     * If set, specifies the default maximum duration for a task of this
     * activity type. This default can be overridden when scheduling an
     * activity task using the <code>ScheduleActivityTask</code>
     * <a>Decision</a>. <p>The valid values are integers greater than or
     * equal to <code>0</code>. An integer value can be used to specify the
     * duration in seconds while <code>NONE</code> can be used to specify
     * unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskScheduleToCloseTimeout If set, specifies the default maximum duration for a task of this
     *         activity type. This default can be overridden when scheduling an
     *         activity task using the <code>ScheduleActivityTask</code>
     *         <a>Decision</a>. <p>The valid values are integers greater than or
     *         equal to <code>0</code>. An integer value can be used to specify the
     *         duration in seconds while <code>NONE</code> can be used to specify
     *         unlimited duration.
     */
    public void setDefaultTaskScheduleToCloseTimeout(String defaultTaskScheduleToCloseTimeout) {
        this.defaultTaskScheduleToCloseTimeout = defaultTaskScheduleToCloseTimeout;
    }
    
    /**
     * If set, specifies the default maximum duration for a task of this
     * activity type. This default can be overridden when scheduling an
     * activity task using the <code>ScheduleActivityTask</code>
     * <a>Decision</a>. <p>The valid values are integers greater than or
     * equal to <code>0</code>. An integer value can be used to specify the
     * duration in seconds while <code>NONE</code> can be used to specify
     * unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskScheduleToCloseTimeout If set, specifies the default maximum duration for a task of this
     *         activity type. This default can be overridden when scheduling an
     *         activity task using the <code>ScheduleActivityTask</code>
     *         <a>Decision</a>. <p>The valid values are integers greater than or
     *         equal to <code>0</code>. An integer value can be used to specify the
     *         duration in seconds while <code>NONE</code> can be used to specify
     *         unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterActivityTypeRequest withDefaultTaskScheduleToCloseTimeout(String defaultTaskScheduleToCloseTimeout) {
        this.defaultTaskScheduleToCloseTimeout = defaultTaskScheduleToCloseTimeout;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomain() != null) sb.append("Domain: " + getDomain() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getVersion() != null) sb.append("Version: " + getVersion() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getDefaultTaskStartToCloseTimeout() != null) sb.append("DefaultTaskStartToCloseTimeout: " + getDefaultTaskStartToCloseTimeout() + ",");
        if (getDefaultTaskHeartbeatTimeout() != null) sb.append("DefaultTaskHeartbeatTimeout: " + getDefaultTaskHeartbeatTimeout() + ",");
        if (getDefaultTaskList() != null) sb.append("DefaultTaskList: " + getDefaultTaskList() + ",");
        if (getDefaultTaskScheduleToStartTimeout() != null) sb.append("DefaultTaskScheduleToStartTimeout: " + getDefaultTaskScheduleToStartTimeout() + ",");
        if (getDefaultTaskScheduleToCloseTimeout() != null) sb.append("DefaultTaskScheduleToCloseTimeout: " + getDefaultTaskScheduleToCloseTimeout() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getDefaultTaskScheduleToStartTimeout() == null) ? 0 : getDefaultTaskScheduleToStartTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultTaskScheduleToCloseTimeout() == null) ? 0 : getDefaultTaskScheduleToCloseTimeout().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RegisterActivityTypeRequest == false) return false;
        RegisterActivityTypeRequest other = (RegisterActivityTypeRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getDefaultTaskStartToCloseTimeout() == null ^ this.getDefaultTaskStartToCloseTimeout() == null) return false;
        if (other.getDefaultTaskStartToCloseTimeout() != null && other.getDefaultTaskStartToCloseTimeout().equals(this.getDefaultTaskStartToCloseTimeout()) == false) return false; 
        if (other.getDefaultTaskHeartbeatTimeout() == null ^ this.getDefaultTaskHeartbeatTimeout() == null) return false;
        if (other.getDefaultTaskHeartbeatTimeout() != null && other.getDefaultTaskHeartbeatTimeout().equals(this.getDefaultTaskHeartbeatTimeout()) == false) return false; 
        if (other.getDefaultTaskList() == null ^ this.getDefaultTaskList() == null) return false;
        if (other.getDefaultTaskList() != null && other.getDefaultTaskList().equals(this.getDefaultTaskList()) == false) return false; 
        if (other.getDefaultTaskScheduleToStartTimeout() == null ^ this.getDefaultTaskScheduleToStartTimeout() == null) return false;
        if (other.getDefaultTaskScheduleToStartTimeout() != null && other.getDefaultTaskScheduleToStartTimeout().equals(this.getDefaultTaskScheduleToStartTimeout()) == false) return false; 
        if (other.getDefaultTaskScheduleToCloseTimeout() == null ^ this.getDefaultTaskScheduleToCloseTimeout() == null) return false;
        if (other.getDefaultTaskScheduleToCloseTimeout() != null && other.getDefaultTaskScheduleToCloseTimeout().equals(this.getDefaultTaskScheduleToCloseTimeout()) == false) return false; 
        return true;
    }
    
}
    