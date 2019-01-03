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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the call execution that includes an execution ID, the type of execution (for example,
 * <code>Command</code>), and the date/time of the execution using a datetime object that is saved in the following
 * format: yyyy-MM-dd'T'HH:mm:ss'Z'.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ComplianceExecutionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComplianceExecutionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     * </p>
     */
    private java.util.Date executionTime;
    /**
     * <p>
     * An ID created by the system when <code>PutComplianceItems</code> was called. For example, <code>CommandID</code>
     * is a valid execution ID. You can use this ID in subsequent calls.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * The type of execution. For example, <code>Command</code> is a valid execution type.
     * </p>
     */
    private String executionType;

    /**
     * <p>
     * The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     * </p>
     * 
     * @param executionTime
     *        The time the execution ran as a datetime object that is saved in the following format:
     *        yyyy-MM-dd'T'HH:mm:ss'Z'.
     */

    public void setExecutionTime(java.util.Date executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * <p>
     * The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     * </p>
     * 
     * @return The time the execution ran as a datetime object that is saved in the following format:
     *         yyyy-MM-dd'T'HH:mm:ss'Z'.
     */

    public java.util.Date getExecutionTime() {
        return this.executionTime;
    }

    /**
     * <p>
     * The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     * </p>
     * 
     * @param executionTime
     *        The time the execution ran as a datetime object that is saved in the following format:
     *        yyyy-MM-dd'T'HH:mm:ss'Z'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceExecutionSummary withExecutionTime(java.util.Date executionTime) {
        setExecutionTime(executionTime);
        return this;
    }

    /**
     * <p>
     * An ID created by the system when <code>PutComplianceItems</code> was called. For example, <code>CommandID</code>
     * is a valid execution ID. You can use this ID in subsequent calls.
     * </p>
     * 
     * @param executionId
     *        An ID created by the system when <code>PutComplianceItems</code> was called. For example,
     *        <code>CommandID</code> is a valid execution ID. You can use this ID in subsequent calls.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * An ID created by the system when <code>PutComplianceItems</code> was called. For example, <code>CommandID</code>
     * is a valid execution ID. You can use this ID in subsequent calls.
     * </p>
     * 
     * @return An ID created by the system when <code>PutComplianceItems</code> was called. For example,
     *         <code>CommandID</code> is a valid execution ID. You can use this ID in subsequent calls.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * An ID created by the system when <code>PutComplianceItems</code> was called. For example, <code>CommandID</code>
     * is a valid execution ID. You can use this ID in subsequent calls.
     * </p>
     * 
     * @param executionId
     *        An ID created by the system when <code>PutComplianceItems</code> was called. For example,
     *        <code>CommandID</code> is a valid execution ID. You can use this ID in subsequent calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceExecutionSummary withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * The type of execution. For example, <code>Command</code> is a valid execution type.
     * </p>
     * 
     * @param executionType
     *        The type of execution. For example, <code>Command</code> is a valid execution type.
     */

    public void setExecutionType(String executionType) {
        this.executionType = executionType;
    }

    /**
     * <p>
     * The type of execution. For example, <code>Command</code> is a valid execution type.
     * </p>
     * 
     * @return The type of execution. For example, <code>Command</code> is a valid execution type.
     */

    public String getExecutionType() {
        return this.executionType;
    }

    /**
     * <p>
     * The type of execution. For example, <code>Command</code> is a valid execution type.
     * </p>
     * 
     * @param executionType
     *        The type of execution. For example, <code>Command</code> is a valid execution type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceExecutionSummary withExecutionType(String executionType) {
        setExecutionType(executionType);
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
        if (getExecutionTime() != null)
            sb.append("ExecutionTime: ").append(getExecutionTime()).append(",");
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId()).append(",");
        if (getExecutionType() != null)
            sb.append("ExecutionType: ").append(getExecutionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComplianceExecutionSummary == false)
            return false;
        ComplianceExecutionSummary other = (ComplianceExecutionSummary) obj;
        if (other.getExecutionTime() == null ^ this.getExecutionTime() == null)
            return false;
        if (other.getExecutionTime() != null && other.getExecutionTime().equals(this.getExecutionTime()) == false)
            return false;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getExecutionType() == null ^ this.getExecutionType() == null)
            return false;
        if (other.getExecutionType() != null && other.getExecutionType().equals(this.getExecutionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getExecutionType() == null) ? 0 : getExecutionType().hashCode());
        return hashCode;
    }

    @Override
    public ComplianceExecutionSummary clone() {
        try {
            return (ComplianceExecutionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ComplianceExecutionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
