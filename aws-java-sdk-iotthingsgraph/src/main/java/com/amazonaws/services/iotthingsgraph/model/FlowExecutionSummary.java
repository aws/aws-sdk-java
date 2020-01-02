/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains summary information about a flow execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/FlowExecutionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowExecutionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the flow execution.
     * </p>
     */
    private String flowExecutionId;
    /**
     * <p>
     * The current status of the flow execution.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ID of the system instance that contains the flow.
     * </p>
     */
    private String systemInstanceId;
    /**
     * <p>
     * The ID of the flow.
     * </p>
     */
    private String flowTemplateId;
    /**
     * <p>
     * The date and time when the flow execution summary was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time when the flow execution summary was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ID of the flow execution.
     * </p>
     * 
     * @param flowExecutionId
     *        The ID of the flow execution.
     */

    public void setFlowExecutionId(String flowExecutionId) {
        this.flowExecutionId = flowExecutionId;
    }

    /**
     * <p>
     * The ID of the flow execution.
     * </p>
     * 
     * @return The ID of the flow execution.
     */

    public String getFlowExecutionId() {
        return this.flowExecutionId;
    }

    /**
     * <p>
     * The ID of the flow execution.
     * </p>
     * 
     * @param flowExecutionId
     *        The ID of the flow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowExecutionSummary withFlowExecutionId(String flowExecutionId) {
        setFlowExecutionId(flowExecutionId);
        return this;
    }

    /**
     * <p>
     * The current status of the flow execution.
     * </p>
     * 
     * @param status
     *        The current status of the flow execution.
     * @see FlowExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the flow execution.
     * </p>
     * 
     * @return The current status of the flow execution.
     * @see FlowExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the flow execution.
     * </p>
     * 
     * @param status
     *        The current status of the flow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowExecutionStatus
     */

    public FlowExecutionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the flow execution.
     * </p>
     * 
     * @param status
     *        The current status of the flow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowExecutionStatus
     */

    public FlowExecutionSummary withStatus(FlowExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the system instance that contains the flow.
     * </p>
     * 
     * @param systemInstanceId
     *        The ID of the system instance that contains the flow.
     */

    public void setSystemInstanceId(String systemInstanceId) {
        this.systemInstanceId = systemInstanceId;
    }

    /**
     * <p>
     * The ID of the system instance that contains the flow.
     * </p>
     * 
     * @return The ID of the system instance that contains the flow.
     */

    public String getSystemInstanceId() {
        return this.systemInstanceId;
    }

    /**
     * <p>
     * The ID of the system instance that contains the flow.
     * </p>
     * 
     * @param systemInstanceId
     *        The ID of the system instance that contains the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowExecutionSummary withSystemInstanceId(String systemInstanceId) {
        setSystemInstanceId(systemInstanceId);
        return this;
    }

    /**
     * <p>
     * The ID of the flow.
     * </p>
     * 
     * @param flowTemplateId
     *        The ID of the flow.
     */

    public void setFlowTemplateId(String flowTemplateId) {
        this.flowTemplateId = flowTemplateId;
    }

    /**
     * <p>
     * The ID of the flow.
     * </p>
     * 
     * @return The ID of the flow.
     */

    public String getFlowTemplateId() {
        return this.flowTemplateId;
    }

    /**
     * <p>
     * The ID of the flow.
     * </p>
     * 
     * @param flowTemplateId
     *        The ID of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowExecutionSummary withFlowTemplateId(String flowTemplateId) {
        setFlowTemplateId(flowTemplateId);
        return this;
    }

    /**
     * <p>
     * The date and time when the flow execution summary was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the flow execution summary was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the flow execution summary was created.
     * </p>
     * 
     * @return The date and time when the flow execution summary was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the flow execution summary was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the flow execution summary was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowExecutionSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time when the flow execution summary was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the flow execution summary was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time when the flow execution summary was last updated.
     * </p>
     * 
     * @return The date and time when the flow execution summary was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time when the flow execution summary was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the flow execution summary was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowExecutionSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getFlowExecutionId() != null)
            sb.append("FlowExecutionId: ").append(getFlowExecutionId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSystemInstanceId() != null)
            sb.append("SystemInstanceId: ").append(getSystemInstanceId()).append(",");
        if (getFlowTemplateId() != null)
            sb.append("FlowTemplateId: ").append(getFlowTemplateId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowExecutionSummary == false)
            return false;
        FlowExecutionSummary other = (FlowExecutionSummary) obj;
        if (other.getFlowExecutionId() == null ^ this.getFlowExecutionId() == null)
            return false;
        if (other.getFlowExecutionId() != null && other.getFlowExecutionId().equals(this.getFlowExecutionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSystemInstanceId() == null ^ this.getSystemInstanceId() == null)
            return false;
        if (other.getSystemInstanceId() != null && other.getSystemInstanceId().equals(this.getSystemInstanceId()) == false)
            return false;
        if (other.getFlowTemplateId() == null ^ this.getFlowTemplateId() == null)
            return false;
        if (other.getFlowTemplateId() != null && other.getFlowTemplateId().equals(this.getFlowTemplateId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowExecutionId() == null) ? 0 : getFlowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSystemInstanceId() == null) ? 0 : getSystemInstanceId().hashCode());
        hashCode = prime * hashCode + ((getFlowTemplateId() == null) ? 0 : getFlowTemplateId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public FlowExecutionSummary clone() {
        try {
            return (FlowExecutionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotthingsgraph.model.transform.FlowExecutionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
