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
 * Details for workflow of type <code>APPFLOW_INTEGRATION</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/AppflowIntegration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppflowIntegration implements Serializable, Cloneable, StructuredPojo {

    private FlowDefinition flowDefinition;
    /**
     * <p>
     * Batches in workflow of type <code>APPFLOW_INTEGRATION</code>.
     * </p>
     */
    private java.util.List<Batch> batches;

    /**
     * @param flowDefinition
     */

    public void setFlowDefinition(FlowDefinition flowDefinition) {
        this.flowDefinition = flowDefinition;
    }

    /**
     * @return
     */

    public FlowDefinition getFlowDefinition() {
        return this.flowDefinition;
    }

    /**
     * @param flowDefinition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppflowIntegration withFlowDefinition(FlowDefinition flowDefinition) {
        setFlowDefinition(flowDefinition);
        return this;
    }

    /**
     * <p>
     * Batches in workflow of type <code>APPFLOW_INTEGRATION</code>.
     * </p>
     * 
     * @return Batches in workflow of type <code>APPFLOW_INTEGRATION</code>.
     */

    public java.util.List<Batch> getBatches() {
        return batches;
    }

    /**
     * <p>
     * Batches in workflow of type <code>APPFLOW_INTEGRATION</code>.
     * </p>
     * 
     * @param batches
     *        Batches in workflow of type <code>APPFLOW_INTEGRATION</code>.
     */

    public void setBatches(java.util.Collection<Batch> batches) {
        if (batches == null) {
            this.batches = null;
            return;
        }

        this.batches = new java.util.ArrayList<Batch>(batches);
    }

    /**
     * <p>
     * Batches in workflow of type <code>APPFLOW_INTEGRATION</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBatches(java.util.Collection)} or {@link #withBatches(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param batches
     *        Batches in workflow of type <code>APPFLOW_INTEGRATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppflowIntegration withBatches(Batch... batches) {
        if (this.batches == null) {
            setBatches(new java.util.ArrayList<Batch>(batches.length));
        }
        for (Batch ele : batches) {
            this.batches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Batches in workflow of type <code>APPFLOW_INTEGRATION</code>.
     * </p>
     * 
     * @param batches
     *        Batches in workflow of type <code>APPFLOW_INTEGRATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppflowIntegration withBatches(java.util.Collection<Batch> batches) {
        setBatches(batches);
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
        if (getFlowDefinition() != null)
            sb.append("FlowDefinition: ").append(getFlowDefinition()).append(",");
        if (getBatches() != null)
            sb.append("Batches: ").append(getBatches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppflowIntegration == false)
            return false;
        AppflowIntegration other = (AppflowIntegration) obj;
        if (other.getFlowDefinition() == null ^ this.getFlowDefinition() == null)
            return false;
        if (other.getFlowDefinition() != null && other.getFlowDefinition().equals(this.getFlowDefinition()) == false)
            return false;
        if (other.getBatches() == null ^ this.getBatches() == null)
            return false;
        if (other.getBatches() != null && other.getBatches().equals(this.getBatches()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowDefinition() == null) ? 0 : getFlowDefinition().hashCode());
        hashCode = prime * hashCode + ((getBatches() == null) ? 0 : getBatches().hashCode());
        return hashCode;
    }

    @Override
    public AppflowIntegration clone() {
        try {
            return (AppflowIntegration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.AppflowIntegrationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
