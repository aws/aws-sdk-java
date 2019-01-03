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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/PollForActivityTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PollForActivityTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that contains the task lists being polled.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * Specifies the task list to poll for activity tasks.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     */
    private TaskList taskList;
    /**
     * <p>
     * Identity of the worker making the request, recorded in the <code>ActivityTaskStarted</code> event in the workflow
     * history. This enables diagnostic tracing when problems arise. The form of this identity is user defined.
     * </p>
     */
    private String identity;

    /**
     * <p>
     * The name of the domain that contains the task lists being polled.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the task lists being polled.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that contains the task lists being polled.
     * </p>
     * 
     * @return The name of the domain that contains the task lists being polled.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that contains the task lists being polled.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the task lists being polled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PollForActivityTaskRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Specifies the task list to poll for activity tasks.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param taskList
     *        Specifies the task list to poll for activity tasks.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     */

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    /**
     * <p>
     * Specifies the task list to poll for activity tasks.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @return Specifies the task list to poll for activity tasks.</p>
     *         <p>
     *         The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *         <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *         <code>arn</code>.
     */

    public TaskList getTaskList() {
        return this.taskList;
    }

    /**
     * <p>
     * Specifies the task list to poll for activity tasks.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param taskList
     *        Specifies the task list to poll for activity tasks.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PollForActivityTaskRequest withTaskList(TaskList taskList) {
        setTaskList(taskList);
        return this;
    }

    /**
     * <p>
     * Identity of the worker making the request, recorded in the <code>ActivityTaskStarted</code> event in the workflow
     * history. This enables diagnostic tracing when problems arise. The form of this identity is user defined.
     * </p>
     * 
     * @param identity
     *        Identity of the worker making the request, recorded in the <code>ActivityTaskStarted</code> event in the
     *        workflow history. This enables diagnostic tracing when problems arise. The form of this identity is user
     *        defined.
     */

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * Identity of the worker making the request, recorded in the <code>ActivityTaskStarted</code> event in the workflow
     * history. This enables diagnostic tracing when problems arise. The form of this identity is user defined.
     * </p>
     * 
     * @return Identity of the worker making the request, recorded in the <code>ActivityTaskStarted</code> event in the
     *         workflow history. This enables diagnostic tracing when problems arise. The form of this identity is user
     *         defined.
     */

    public String getIdentity() {
        return this.identity;
    }

    /**
     * <p>
     * Identity of the worker making the request, recorded in the <code>ActivityTaskStarted</code> event in the workflow
     * history. This enables diagnostic tracing when problems arise. The form of this identity is user defined.
     * </p>
     * 
     * @param identity
     *        Identity of the worker making the request, recorded in the <code>ActivityTaskStarted</code> event in the
     *        workflow history. This enables diagnostic tracing when problems arise. The form of this identity is user
     *        defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PollForActivityTaskRequest withIdentity(String identity) {
        setIdentity(identity);
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
        if (getTaskList() != null)
            sb.append("TaskList: ").append(getTaskList()).append(",");
        if (getIdentity() != null)
            sb.append("Identity: ").append(getIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PollForActivityTaskRequest == false)
            return false;
        PollForActivityTaskRequest other = (PollForActivityTaskRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getTaskList() == null ^ this.getTaskList() == null)
            return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false)
            return false;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode());
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        return hashCode;
    }

    @Override
    public PollForActivityTaskRequest clone() {
        return (PollForActivityTaskRequest) super.clone();
    }

}
