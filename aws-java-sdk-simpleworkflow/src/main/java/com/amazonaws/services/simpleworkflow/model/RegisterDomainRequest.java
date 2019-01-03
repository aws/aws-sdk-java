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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RegisterDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the domain to register. The name must be unique in the region that the domain is registered in.
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
     * A text description of the domain.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The duration (in days) that records and histories of workflow executions on the domain should be kept by the
     * service. After the retention period, the workflow execution isn't available in the results of visibility calls.
     * </p>
     * <p>
     * If you pass the value <code>NONE</code> or <code>0</code> (zero), then the workflow execution history isn't
     * retained. As soon as the workflow execution completes, the execution record and its history are deleted.
     * </p>
     * <p>
     * The maximum workflow execution retention period is 90 days. For more information about Amazon SWF service limits,
     * see: <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-limits.html">Amazon SWF Service
     * Limits</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     */
    private String workflowExecutionRetentionPeriodInDays;

    /**
     * <p>
     * Name of the domain to register. The name must be unique in the region that the domain is registered in.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param name
     *        Name of the domain to register. The name must be unique in the region that the domain is registered
     *        in.</p>
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
     * Name of the domain to register. The name must be unique in the region that the domain is registered in.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @return Name of the domain to register. The name must be unique in the region that the domain is registered
     *         in.</p>
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
     * Name of the domain to register. The name must be unique in the region that the domain is registered in.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param name
     *        Name of the domain to register. The name must be unique in the region that the domain is registered
     *        in.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterDomainRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A text description of the domain.
     * </p>
     * 
     * @param description
     *        A text description of the domain.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A text description of the domain.
     * </p>
     * 
     * @return A text description of the domain.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A text description of the domain.
     * </p>
     * 
     * @param description
     *        A text description of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterDomainRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The duration (in days) that records and histories of workflow executions on the domain should be kept by the
     * service. After the retention period, the workflow execution isn't available in the results of visibility calls.
     * </p>
     * <p>
     * If you pass the value <code>NONE</code> or <code>0</code> (zero), then the workflow execution history isn't
     * retained. As soon as the workflow execution completes, the execution record and its history are deleted.
     * </p>
     * <p>
     * The maximum workflow execution retention period is 90 days. For more information about Amazon SWF service limits,
     * see: <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-limits.html">Amazon SWF Service
     * Limits</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param workflowExecutionRetentionPeriodInDays
     *        The duration (in days) that records and histories of workflow executions on the domain should be kept by
     *        the service. After the retention period, the workflow execution isn't available in the results of
     *        visibility calls.</p>
     *        <p>
     *        If you pass the value <code>NONE</code> or <code>0</code> (zero), then the workflow execution history
     *        isn't retained. As soon as the workflow execution completes, the execution record and its history are
     *        deleted.
     *        </p>
     *        <p>
     *        The maximum workflow execution retention period is 90 days. For more information about Amazon SWF service
     *        limits, see: <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-limits.html">Amazon SWF Service
     *        Limits</a> in the <i>Amazon SWF Developer Guide</i>.
     */

    public void setWorkflowExecutionRetentionPeriodInDays(String workflowExecutionRetentionPeriodInDays) {
        this.workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays;
    }

    /**
     * <p>
     * The duration (in days) that records and histories of workflow executions on the domain should be kept by the
     * service. After the retention period, the workflow execution isn't available in the results of visibility calls.
     * </p>
     * <p>
     * If you pass the value <code>NONE</code> or <code>0</code> (zero), then the workflow execution history isn't
     * retained. As soon as the workflow execution completes, the execution record and its history are deleted.
     * </p>
     * <p>
     * The maximum workflow execution retention period is 90 days. For more information about Amazon SWF service limits,
     * see: <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-limits.html">Amazon SWF Service
     * Limits</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @return The duration (in days) that records and histories of workflow executions on the domain should be kept by
     *         the service. After the retention period, the workflow execution isn't available in the results of
     *         visibility calls.</p>
     *         <p>
     *         If you pass the value <code>NONE</code> or <code>0</code> (zero), then the workflow execution history
     *         isn't retained. As soon as the workflow execution completes, the execution record and its history are
     *         deleted.
     *         </p>
     *         <p>
     *         The maximum workflow execution retention period is 90 days. For more information about Amazon SWF service
     *         limits, see: <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-limits.html">Amazon SWF Service
     *         Limits</a> in the <i>Amazon SWF Developer Guide</i>.
     */

    public String getWorkflowExecutionRetentionPeriodInDays() {
        return this.workflowExecutionRetentionPeriodInDays;
    }

    /**
     * <p>
     * The duration (in days) that records and histories of workflow executions on the domain should be kept by the
     * service. After the retention period, the workflow execution isn't available in the results of visibility calls.
     * </p>
     * <p>
     * If you pass the value <code>NONE</code> or <code>0</code> (zero), then the workflow execution history isn't
     * retained. As soon as the workflow execution completes, the execution record and its history are deleted.
     * </p>
     * <p>
     * The maximum workflow execution retention period is 90 days. For more information about Amazon SWF service limits,
     * see: <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-limits.html">Amazon SWF Service
     * Limits</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param workflowExecutionRetentionPeriodInDays
     *        The duration (in days) that records and histories of workflow executions on the domain should be kept by
     *        the service. After the retention period, the workflow execution isn't available in the results of
     *        visibility calls.</p>
     *        <p>
     *        If you pass the value <code>NONE</code> or <code>0</code> (zero), then the workflow execution history
     *        isn't retained. As soon as the workflow execution completes, the execution record and its history are
     *        deleted.
     *        </p>
     *        <p>
     *        The maximum workflow execution retention period is 90 days. For more information about Amazon SWF service
     *        limits, see: <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-limits.html">Amazon SWF Service
     *        Limits</a> in the <i>Amazon SWF Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterDomainRequest withWorkflowExecutionRetentionPeriodInDays(String workflowExecutionRetentionPeriodInDays) {
        setWorkflowExecutionRetentionPeriodInDays(workflowExecutionRetentionPeriodInDays);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getWorkflowExecutionRetentionPeriodInDays() != null)
            sb.append("WorkflowExecutionRetentionPeriodInDays: ").append(getWorkflowExecutionRetentionPeriodInDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterDomainRequest == false)
            return false;
        RegisterDomainRequest other = (RegisterDomainRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getWorkflowExecutionRetentionPeriodInDays() == null ^ this.getWorkflowExecutionRetentionPeriodInDays() == null)
            return false;
        if (other.getWorkflowExecutionRetentionPeriodInDays() != null
                && other.getWorkflowExecutionRetentionPeriodInDays().equals(this.getWorkflowExecutionRetentionPeriodInDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getWorkflowExecutionRetentionPeriodInDays() == null) ? 0 : getWorkflowExecutionRetentionPeriodInDays().hashCode());
        return hashCode;
    }

    @Override
    public RegisterDomainRequest clone() {
        return (RegisterDomainRequest) super.clone();
    }

}
