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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Workflow specific execution metrics for <code>APPFLOW_INTEGRATION</code> workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/AppflowIntegrationWorkflowMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppflowIntegrationWorkflowMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Number of records processed in <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     */
    private Long recordsProcessed;
    /**
     * <p>
     * Total steps completed in <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     */
    private Long stepsCompleted;
    /**
     * <p>
     * Total steps in <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     */
    private Long totalSteps;

    /**
     * <p>
     * Number of records processed in <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param recordsProcessed
     *        Number of records processed in <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public void setRecordsProcessed(Long recordsProcessed) {
        this.recordsProcessed = recordsProcessed;
    }

    /**
     * <p>
     * Number of records processed in <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @return Number of records processed in <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public Long getRecordsProcessed() {
        return this.recordsProcessed;
    }

    /**
     * <p>
     * Number of records processed in <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param recordsProcessed
     *        Number of records processed in <code>APPFLOW_INTEGRATION</code> workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppflowIntegrationWorkflowMetrics withRecordsProcessed(Long recordsProcessed) {
        setRecordsProcessed(recordsProcessed);
        return this;
    }

    /**
     * <p>
     * Total steps completed in <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param stepsCompleted
     *        Total steps completed in <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public void setStepsCompleted(Long stepsCompleted) {
        this.stepsCompleted = stepsCompleted;
    }

    /**
     * <p>
     * Total steps completed in <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @return Total steps completed in <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public Long getStepsCompleted() {
        return this.stepsCompleted;
    }

    /**
     * <p>
     * Total steps completed in <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param stepsCompleted
     *        Total steps completed in <code>APPFLOW_INTEGRATION</code> workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppflowIntegrationWorkflowMetrics withStepsCompleted(Long stepsCompleted) {
        setStepsCompleted(stepsCompleted);
        return this;
    }

    /**
     * <p>
     * Total steps in <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param totalSteps
     *        Total steps in <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public void setTotalSteps(Long totalSteps) {
        this.totalSteps = totalSteps;
    }

    /**
     * <p>
     * Total steps in <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @return Total steps in <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public Long getTotalSteps() {
        return this.totalSteps;
    }

    /**
     * <p>
     * Total steps in <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param totalSteps
     *        Total steps in <code>APPFLOW_INTEGRATION</code> workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppflowIntegrationWorkflowMetrics withTotalSteps(Long totalSteps) {
        setTotalSteps(totalSteps);
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
        if (getRecordsProcessed() != null)
            sb.append("RecordsProcessed: ").append(getRecordsProcessed()).append(",");
        if (getStepsCompleted() != null)
            sb.append("StepsCompleted: ").append(getStepsCompleted()).append(",");
        if (getTotalSteps() != null)
            sb.append("TotalSteps: ").append(getTotalSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppflowIntegrationWorkflowMetrics == false)
            return false;
        AppflowIntegrationWorkflowMetrics other = (AppflowIntegrationWorkflowMetrics) obj;
        if (other.getRecordsProcessed() == null ^ this.getRecordsProcessed() == null)
            return false;
        if (other.getRecordsProcessed() != null && other.getRecordsProcessed().equals(this.getRecordsProcessed()) == false)
            return false;
        if (other.getStepsCompleted() == null ^ this.getStepsCompleted() == null)
            return false;
        if (other.getStepsCompleted() != null && other.getStepsCompleted().equals(this.getStepsCompleted()) == false)
            return false;
        if (other.getTotalSteps() == null ^ this.getTotalSteps() == null)
            return false;
        if (other.getTotalSteps() != null && other.getTotalSteps().equals(this.getTotalSteps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordsProcessed() == null) ? 0 : getRecordsProcessed().hashCode());
        hashCode = prime * hashCode + ((getStepsCompleted() == null) ? 0 : getStepsCompleted().hashCode());
        hashCode = prime * hashCode + ((getTotalSteps() == null) ? 0 : getTotalSteps().hashCode());
        return hashCode;
    }

    @Override
    public AppflowIntegrationWorkflowMetrics clone() {
        try {
            return (AppflowIntegrationWorkflowMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.AppflowIntegrationWorkflowMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
