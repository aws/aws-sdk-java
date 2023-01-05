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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A model displayed in the Amazon SageMaker Model Dashboard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelDashboardModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelDashboardModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A model displayed in the Model Dashboard.
     * </p>
     */
    private Model model;
    /**
     * <p>
     * The endpoints that host a model.
     * </p>
     */
    private java.util.List<ModelDashboardEndpoint> endpoints;

    private TransformJob lastBatchTransformJob;
    /**
     * <p>
     * The monitoring schedules for a model.
     * </p>
     */
    private java.util.List<ModelDashboardMonitoringSchedule> monitoringSchedules;
    /**
     * <p>
     * The model card for a model.
     * </p>
     */
    private ModelDashboardModelCard modelCard;

    /**
     * <p>
     * A model displayed in the Model Dashboard.
     * </p>
     * 
     * @param model
     *        A model displayed in the Model Dashboard.
     */

    public void setModel(Model model) {
        this.model = model;
    }

    /**
     * <p>
     * A model displayed in the Model Dashboard.
     * </p>
     * 
     * @return A model displayed in the Model Dashboard.
     */

    public Model getModel() {
        return this.model;
    }

    /**
     * <p>
     * A model displayed in the Model Dashboard.
     * </p>
     * 
     * @param model
     *        A model displayed in the Model Dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModel withModel(Model model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * The endpoints that host a model.
     * </p>
     * 
     * @return The endpoints that host a model.
     */

    public java.util.List<ModelDashboardEndpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * The endpoints that host a model.
     * </p>
     * 
     * @param endpoints
     *        The endpoints that host a model.
     */

    public void setEndpoints(java.util.Collection<ModelDashboardEndpoint> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<ModelDashboardEndpoint>(endpoints);
    }

    /**
     * <p>
     * The endpoints that host a model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpoints(java.util.Collection)} or {@link #withEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpoints
     *        The endpoints that host a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModel withEndpoints(ModelDashboardEndpoint... endpoints) {
        if (this.endpoints == null) {
            setEndpoints(new java.util.ArrayList<ModelDashboardEndpoint>(endpoints.length));
        }
        for (ModelDashboardEndpoint ele : endpoints) {
            this.endpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The endpoints that host a model.
     * </p>
     * 
     * @param endpoints
     *        The endpoints that host a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModel withEndpoints(java.util.Collection<ModelDashboardEndpoint> endpoints) {
        setEndpoints(endpoints);
        return this;
    }

    /**
     * @param lastBatchTransformJob
     */

    public void setLastBatchTransformJob(TransformJob lastBatchTransformJob) {
        this.lastBatchTransformJob = lastBatchTransformJob;
    }

    /**
     * @return
     */

    public TransformJob getLastBatchTransformJob() {
        return this.lastBatchTransformJob;
    }

    /**
     * @param lastBatchTransformJob
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModel withLastBatchTransformJob(TransformJob lastBatchTransformJob) {
        setLastBatchTransformJob(lastBatchTransformJob);
        return this;
    }

    /**
     * <p>
     * The monitoring schedules for a model.
     * </p>
     * 
     * @return The monitoring schedules for a model.
     */

    public java.util.List<ModelDashboardMonitoringSchedule> getMonitoringSchedules() {
        return monitoringSchedules;
    }

    /**
     * <p>
     * The monitoring schedules for a model.
     * </p>
     * 
     * @param monitoringSchedules
     *        The monitoring schedules for a model.
     */

    public void setMonitoringSchedules(java.util.Collection<ModelDashboardMonitoringSchedule> monitoringSchedules) {
        if (monitoringSchedules == null) {
            this.monitoringSchedules = null;
            return;
        }

        this.monitoringSchedules = new java.util.ArrayList<ModelDashboardMonitoringSchedule>(monitoringSchedules);
    }

    /**
     * <p>
     * The monitoring schedules for a model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitoringSchedules(java.util.Collection)} or {@link #withMonitoringSchedules(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param monitoringSchedules
     *        The monitoring schedules for a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModel withMonitoringSchedules(ModelDashboardMonitoringSchedule... monitoringSchedules) {
        if (this.monitoringSchedules == null) {
            setMonitoringSchedules(new java.util.ArrayList<ModelDashboardMonitoringSchedule>(monitoringSchedules.length));
        }
        for (ModelDashboardMonitoringSchedule ele : monitoringSchedules) {
            this.monitoringSchedules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The monitoring schedules for a model.
     * </p>
     * 
     * @param monitoringSchedules
     *        The monitoring schedules for a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModel withMonitoringSchedules(java.util.Collection<ModelDashboardMonitoringSchedule> monitoringSchedules) {
        setMonitoringSchedules(monitoringSchedules);
        return this;
    }

    /**
     * <p>
     * The model card for a model.
     * </p>
     * 
     * @param modelCard
     *        The model card for a model.
     */

    public void setModelCard(ModelDashboardModelCard modelCard) {
        this.modelCard = modelCard;
    }

    /**
     * <p>
     * The model card for a model.
     * </p>
     * 
     * @return The model card for a model.
     */

    public ModelDashboardModelCard getModelCard() {
        return this.modelCard;
    }

    /**
     * <p>
     * The model card for a model.
     * </p>
     * 
     * @param modelCard
     *        The model card for a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModel withModelCard(ModelDashboardModelCard modelCard) {
        setModelCard(modelCard);
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
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints()).append(",");
        if (getLastBatchTransformJob() != null)
            sb.append("LastBatchTransformJob: ").append(getLastBatchTransformJob()).append(",");
        if (getMonitoringSchedules() != null)
            sb.append("MonitoringSchedules: ").append(getMonitoringSchedules()).append(",");
        if (getModelCard() != null)
            sb.append("ModelCard: ").append(getModelCard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelDashboardModel == false)
            return false;
        ModelDashboardModel other = (ModelDashboardModel) obj;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        if (other.getLastBatchTransformJob() == null ^ this.getLastBatchTransformJob() == null)
            return false;
        if (other.getLastBatchTransformJob() != null && other.getLastBatchTransformJob().equals(this.getLastBatchTransformJob()) == false)
            return false;
        if (other.getMonitoringSchedules() == null ^ this.getMonitoringSchedules() == null)
            return false;
        if (other.getMonitoringSchedules() != null && other.getMonitoringSchedules().equals(this.getMonitoringSchedules()) == false)
            return false;
        if (other.getModelCard() == null ^ this.getModelCard() == null)
            return false;
        if (other.getModelCard() != null && other.getModelCard().equals(this.getModelCard()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode + ((getLastBatchTransformJob() == null) ? 0 : getLastBatchTransformJob().hashCode());
        hashCode = prime * hashCode + ((getMonitoringSchedules() == null) ? 0 : getMonitoringSchedules().hashCode());
        hashCode = prime * hashCode + ((getModelCard() == null) ? 0 : getModelCard().hashCode());
        return hashCode;
    }

    @Override
    public ModelDashboardModel clone() {
        try {
            return (ModelDashboardModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelDashboardModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
