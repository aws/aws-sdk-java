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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about an execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ExecutionListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     */
    private String executionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed state machine.
     * </p>
     */
    private String stateMachineArn;
    /**
     * <p>
     * The name of the execution.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status of the execution.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date the execution started.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * If the execution already ended, the date the execution stopped.
     * </p>
     */
    private java.util.Date stopDate;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Map Run. This field is returned only if <code>mapRunArn</code> was specified
     * in the <code>ListExecutions</code> API action. If <code>stateMachineArn</code> was specified in
     * <code>ListExecutions</code>, the <code>mapRunArn</code> isn't returned.
     * </p>
     */
    private String mapRunArn;
    /**
     * <p>
     * The total number of items processed in a child workflow execution. This field is returned only if
     * <code>mapRunArn</code> was specified in the <code>ListExecutions</code> API action. If
     * <code>stateMachineArn</code> was specified in <code>ListExecutions</code>, the <code>itemCount</code> field isn't
     * returned.
     * </p>
     */
    private Integer itemCount;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) that identifies the execution.
     */

    public void setExecutionArn(String executionArn) {
        this.executionArn = executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the execution.
     */

    public String getExecutionArn() {
        return this.executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) that identifies the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionListItem withExecutionArn(String executionArn) {
        setExecutionArn(executionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the executed state machine.
     */

    public void setStateMachineArn(String stateMachineArn) {
        this.stateMachineArn = stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed state machine.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the executed state machine.
     */

    public String getStateMachineArn() {
        return this.stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the executed state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionListItem withStateMachineArn(String stateMachineArn) {
        setStateMachineArn(stateMachineArn);
        return this;
    }

    /**
     * <p>
     * The name of the execution.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     * 
     * @param name
     *        The name of the execution.</p>
     *        <p>
     *        A name must <i>not</i> contain:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        white space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        brackets <code>&lt; &gt; { } [ ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        wildcard characters <code>? *</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the execution.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     * 
     * @return The name of the execution.</p>
     *         <p>
     *         A name must <i>not</i> contain:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         white space
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         brackets <code>&lt; &gt; { } [ ]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         wildcard characters <code>? *</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the execution.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     * 
     * @param name
     *        The name of the execution.</p>
     *        <p>
     *        A name must <i>not</i> contain:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        white space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        brackets <code>&lt; &gt; { } [ ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        wildcard characters <code>? *</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionListItem withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param status
     *        The current status of the execution.
     * @see ExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @return The current status of the execution.
     * @see ExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param status
     *        The current status of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public ExecutionListItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param status
     *        The current status of the execution.
     * @see ExecutionStatus
     */

    public void setStatus(ExecutionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param status
     *        The current status of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public ExecutionListItem withStatus(ExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date the execution started.
     * </p>
     * 
     * @param startDate
     *        The date the execution started.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date the execution started.
     * </p>
     * 
     * @return The date the execution started.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The date the execution started.
     * </p>
     * 
     * @param startDate
     *        The date the execution started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionListItem withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * If the execution already ended, the date the execution stopped.
     * </p>
     * 
     * @param stopDate
     *        If the execution already ended, the date the execution stopped.
     */

    public void setStopDate(java.util.Date stopDate) {
        this.stopDate = stopDate;
    }

    /**
     * <p>
     * If the execution already ended, the date the execution stopped.
     * </p>
     * 
     * @return If the execution already ended, the date the execution stopped.
     */

    public java.util.Date getStopDate() {
        return this.stopDate;
    }

    /**
     * <p>
     * If the execution already ended, the date the execution stopped.
     * </p>
     * 
     * @param stopDate
     *        If the execution already ended, the date the execution stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionListItem withStopDate(java.util.Date stopDate) {
        setStopDate(stopDate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Map Run. This field is returned only if <code>mapRunArn</code> was specified
     * in the <code>ListExecutions</code> API action. If <code>stateMachineArn</code> was specified in
     * <code>ListExecutions</code>, the <code>mapRunArn</code> isn't returned.
     * </p>
     * 
     * @param mapRunArn
     *        The Amazon Resource Name (ARN) of a Map Run. This field is returned only if <code>mapRunArn</code> was
     *        specified in the <code>ListExecutions</code> API action. If <code>stateMachineArn</code> was specified in
     *        <code>ListExecutions</code>, the <code>mapRunArn</code> isn't returned.
     */

    public void setMapRunArn(String mapRunArn) {
        this.mapRunArn = mapRunArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Map Run. This field is returned only if <code>mapRunArn</code> was specified
     * in the <code>ListExecutions</code> API action. If <code>stateMachineArn</code> was specified in
     * <code>ListExecutions</code>, the <code>mapRunArn</code> isn't returned.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a Map Run. This field is returned only if <code>mapRunArn</code> was
     *         specified in the <code>ListExecutions</code> API action. If <code>stateMachineArn</code> was specified in
     *         <code>ListExecutions</code>, the <code>mapRunArn</code> isn't returned.
     */

    public String getMapRunArn() {
        return this.mapRunArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Map Run. This field is returned only if <code>mapRunArn</code> was specified
     * in the <code>ListExecutions</code> API action. If <code>stateMachineArn</code> was specified in
     * <code>ListExecutions</code>, the <code>mapRunArn</code> isn't returned.
     * </p>
     * 
     * @param mapRunArn
     *        The Amazon Resource Name (ARN) of a Map Run. This field is returned only if <code>mapRunArn</code> was
     *        specified in the <code>ListExecutions</code> API action. If <code>stateMachineArn</code> was specified in
     *        <code>ListExecutions</code>, the <code>mapRunArn</code> isn't returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionListItem withMapRunArn(String mapRunArn) {
        setMapRunArn(mapRunArn);
        return this;
    }

    /**
     * <p>
     * The total number of items processed in a child workflow execution. This field is returned only if
     * <code>mapRunArn</code> was specified in the <code>ListExecutions</code> API action. If
     * <code>stateMachineArn</code> was specified in <code>ListExecutions</code>, the <code>itemCount</code> field isn't
     * returned.
     * </p>
     * 
     * @param itemCount
     *        The total number of items processed in a child workflow execution. This field is returned only if
     *        <code>mapRunArn</code> was specified in the <code>ListExecutions</code> API action. If
     *        <code>stateMachineArn</code> was specified in <code>ListExecutions</code>, the <code>itemCount</code>
     *        field isn't returned.
     */

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * The total number of items processed in a child workflow execution. This field is returned only if
     * <code>mapRunArn</code> was specified in the <code>ListExecutions</code> API action. If
     * <code>stateMachineArn</code> was specified in <code>ListExecutions</code>, the <code>itemCount</code> field isn't
     * returned.
     * </p>
     * 
     * @return The total number of items processed in a child workflow execution. This field is returned only if
     *         <code>mapRunArn</code> was specified in the <code>ListExecutions</code> API action. If
     *         <code>stateMachineArn</code> was specified in <code>ListExecutions</code>, the <code>itemCount</code>
     *         field isn't returned.
     */

    public Integer getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * The total number of items processed in a child workflow execution. This field is returned only if
     * <code>mapRunArn</code> was specified in the <code>ListExecutions</code> API action. If
     * <code>stateMachineArn</code> was specified in <code>ListExecutions</code>, the <code>itemCount</code> field isn't
     * returned.
     * </p>
     * 
     * @param itemCount
     *        The total number of items processed in a child workflow execution. This field is returned only if
     *        <code>mapRunArn</code> was specified in the <code>ListExecutions</code> API action. If
     *        <code>stateMachineArn</code> was specified in <code>ListExecutions</code>, the <code>itemCount</code>
     *        field isn't returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionListItem withItemCount(Integer itemCount) {
        setItemCount(itemCount);
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
        if (getExecutionArn() != null)
            sb.append("ExecutionArn: ").append(getExecutionArn()).append(",");
        if (getStateMachineArn() != null)
            sb.append("StateMachineArn: ").append(getStateMachineArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getStopDate() != null)
            sb.append("StopDate: ").append(getStopDate()).append(",");
        if (getMapRunArn() != null)
            sb.append("MapRunArn: ").append(getMapRunArn()).append(",");
        if (getItemCount() != null)
            sb.append("ItemCount: ").append(getItemCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionListItem == false)
            return false;
        ExecutionListItem other = (ExecutionListItem) obj;
        if (other.getExecutionArn() == null ^ this.getExecutionArn() == null)
            return false;
        if (other.getExecutionArn() != null && other.getExecutionArn().equals(this.getExecutionArn()) == false)
            return false;
        if (other.getStateMachineArn() == null ^ this.getStateMachineArn() == null)
            return false;
        if (other.getStateMachineArn() != null && other.getStateMachineArn().equals(this.getStateMachineArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getStopDate() == null ^ this.getStopDate() == null)
            return false;
        if (other.getStopDate() != null && other.getStopDate().equals(this.getStopDate()) == false)
            return false;
        if (other.getMapRunArn() == null ^ this.getMapRunArn() == null)
            return false;
        if (other.getMapRunArn() != null && other.getMapRunArn().equals(this.getMapRunArn()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionArn() == null) ? 0 : getExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getStateMachineArn() == null) ? 0 : getStateMachineArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getStopDate() == null) ? 0 : getStopDate().hashCode());
        hashCode = prime * hashCode + ((getMapRunArn() == null) ? 0 : getMapRunArn().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionListItem clone() {
        try {
            return (ExecutionListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.ExecutionListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
