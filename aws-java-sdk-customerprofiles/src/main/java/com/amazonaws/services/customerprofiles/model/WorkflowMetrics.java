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
 * Generic object containing workflow execution metrics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/WorkflowMetrics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Workflow execution metrics for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     */
    private AppflowIntegrationWorkflowMetrics appflowIntegration;

    /**
     * <p>
     * Workflow execution metrics for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param appflowIntegration
     *        Workflow execution metrics for <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public void setAppflowIntegration(AppflowIntegrationWorkflowMetrics appflowIntegration) {
        this.appflowIntegration = appflowIntegration;
    }

    /**
     * <p>
     * Workflow execution metrics for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @return Workflow execution metrics for <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public AppflowIntegrationWorkflowMetrics getAppflowIntegration() {
        return this.appflowIntegration;
    }

    /**
     * <p>
     * Workflow execution metrics for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param appflowIntegration
     *        Workflow execution metrics for <code>APPFLOW_INTEGRATION</code> workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowMetrics withAppflowIntegration(AppflowIntegrationWorkflowMetrics appflowIntegration) {
        setAppflowIntegration(appflowIntegration);
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
        if (getAppflowIntegration() != null)
            sb.append("AppflowIntegration: ").append(getAppflowIntegration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowMetrics == false)
            return false;
        WorkflowMetrics other = (WorkflowMetrics) obj;
        if (other.getAppflowIntegration() == null ^ this.getAppflowIntegration() == null)
            return false;
        if (other.getAppflowIntegration() != null && other.getAppflowIntegration().equals(this.getAppflowIntegration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppflowIntegration() == null) ? 0 : getAppflowIntegration().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowMetrics clone() {
        try {
            return (WorkflowMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.WorkflowMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
