/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Provides details of the <code>ScheduleLambdaFunction</code> decision.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
 * </p>
 * <ul>
 * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
 * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
 * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
 * <ul>
 * <li><code>activityType.name</code>: String constraint. The key is <code>swf:activityType.name</code>.</li>
 * <li><code>activityType.version</code>: String constraint. The key is <code>swf:activityType.version</code>.</li>
 * <li><code>taskList</code>: String constraint. The key is <code>swf:taskList.name</code>.</li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
 * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
 * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
 * Amazon SWF Workflows</a>.
 * </p>
 */
public class ScheduleLambdaFunctionDecisionAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * <b>Required.</b> The SWF <code>id</code> of the AWS Lambda task.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     */
    private String id;
    /**
     * <p>
     * <b>Required.</b> The name of the AWS Lambda function to invoke.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The input provided to the AWS Lambda function.
     * </p>
     */
    private String input;
    /**
     * <p>
     * If set, specifies the maximum duration the function may take to execute.
     * </p>
     */
    private String startToCloseTimeout;

    /**
     * <p>
     * <b>Required.</b> The SWF <code>id</code> of the AWS Lambda task.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @param id
     *        Required.</b> The SWF <code>id</code> of the AWS Lambda task.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * <b>Required.</b> The SWF <code>id</code> of the AWS Lambda task.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @return Required.</b> The SWF <code>id</code> of the AWS Lambda task.</p>
     *         <p>
     *         The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * <b>Required.</b> The SWF <code>id</code> of the AWS Lambda task.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @param id
     *        Required.</b> The SWF <code>id</code> of the AWS Lambda task.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleLambdaFunctionDecisionAttributes withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * <b>Required.</b> The name of the AWS Lambda function to invoke.
     * </p>
     * 
     * @param name
     *        Required.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * <b>Required.</b> The name of the AWS Lambda function to invoke.
     * </p>
     * 
     * @return Required.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * <b>Required.</b> The name of the AWS Lambda function to invoke.
     * </p>
     * 
     * @param name
     *        Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleLambdaFunctionDecisionAttributes withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The input provided to the AWS Lambda function.
     * </p>
     * 
     * @param input
     *        The input provided to the AWS Lambda function.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The input provided to the AWS Lambda function.
     * </p>
     * 
     * @return The input provided to the AWS Lambda function.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The input provided to the AWS Lambda function.
     * </p>
     * 
     * @param input
     *        The input provided to the AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleLambdaFunctionDecisionAttributes withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * If set, specifies the maximum duration the function may take to execute.
     * </p>
     * 
     * @param startToCloseTimeout
     *        If set, specifies the maximum duration the function may take to execute.
     */

    public void setStartToCloseTimeout(String startToCloseTimeout) {
        this.startToCloseTimeout = startToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the maximum duration the function may take to execute.
     * </p>
     * 
     * @return If set, specifies the maximum duration the function may take to execute.
     */

    public String getStartToCloseTimeout() {
        return this.startToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the maximum duration the function may take to execute.
     * </p>
     * 
     * @param startToCloseTimeout
     *        If set, specifies the maximum duration the function may take to execute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleLambdaFunctionDecisionAttributes withStartToCloseTimeout(String startToCloseTimeout) {
        setStartToCloseTimeout(startToCloseTimeout);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getInput() != null)
            sb.append("Input: " + getInput() + ",");
        if (getStartToCloseTimeout() != null)
            sb.append("StartToCloseTimeout: " + getStartToCloseTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleLambdaFunctionDecisionAttributes == false)
            return false;
        ScheduleLambdaFunctionDecisionAttributes other = (ScheduleLambdaFunctionDecisionAttributes) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getStartToCloseTimeout() == null ^ this.getStartToCloseTimeout() == null)
            return false;
        if (other.getStartToCloseTimeout() != null && other.getStartToCloseTimeout().equals(this.getStartToCloseTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getStartToCloseTimeout() == null) ? 0 : getStartToCloseTimeout().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleLambdaFunctionDecisionAttributes clone() {
        try {
            return (ScheduleLambdaFunctionDecisionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
