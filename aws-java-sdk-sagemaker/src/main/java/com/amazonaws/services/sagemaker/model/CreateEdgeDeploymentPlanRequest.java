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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEdgeDeploymentPlan" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEdgeDeploymentPlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the edge deployment plan.
     * </p>
     */
    private String edgeDeploymentPlanName;
    /**
     * <p>
     * List of models associated with the edge deployment plan.
     * </p>
     */
    private java.util.List<EdgeDeploymentModelConfig> modelConfigs;
    /**
     * <p>
     * The device fleet used for this edge deployment plan.
     * </p>
     */
    private String deviceFleetName;
    /**
     * <p>
     * List of stages of the edge deployment plan. The number of stages is limited to 10 per deployment.
     * </p>
     */
    private java.util.List<DeploymentStage> stages;
    /**
     * <p>
     * List of tags with which to tag the edge deployment plan.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the edge deployment plan.
     * </p>
     * 
     * @param edgeDeploymentPlanName
     *        The name of the edge deployment plan.
     */

    public void setEdgeDeploymentPlanName(String edgeDeploymentPlanName) {
        this.edgeDeploymentPlanName = edgeDeploymentPlanName;
    }

    /**
     * <p>
     * The name of the edge deployment plan.
     * </p>
     * 
     * @return The name of the edge deployment plan.
     */

    public String getEdgeDeploymentPlanName() {
        return this.edgeDeploymentPlanName;
    }

    /**
     * <p>
     * The name of the edge deployment plan.
     * </p>
     * 
     * @param edgeDeploymentPlanName
     *        The name of the edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgeDeploymentPlanRequest withEdgeDeploymentPlanName(String edgeDeploymentPlanName) {
        setEdgeDeploymentPlanName(edgeDeploymentPlanName);
        return this;
    }

    /**
     * <p>
     * List of models associated with the edge deployment plan.
     * </p>
     * 
     * @return List of models associated with the edge deployment plan.
     */

    public java.util.List<EdgeDeploymentModelConfig> getModelConfigs() {
        return modelConfigs;
    }

    /**
     * <p>
     * List of models associated with the edge deployment plan.
     * </p>
     * 
     * @param modelConfigs
     *        List of models associated with the edge deployment plan.
     */

    public void setModelConfigs(java.util.Collection<EdgeDeploymentModelConfig> modelConfigs) {
        if (modelConfigs == null) {
            this.modelConfigs = null;
            return;
        }

        this.modelConfigs = new java.util.ArrayList<EdgeDeploymentModelConfig>(modelConfigs);
    }

    /**
     * <p>
     * List of models associated with the edge deployment plan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelConfigs(java.util.Collection)} or {@link #withModelConfigs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param modelConfigs
     *        List of models associated with the edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgeDeploymentPlanRequest withModelConfigs(EdgeDeploymentModelConfig... modelConfigs) {
        if (this.modelConfigs == null) {
            setModelConfigs(new java.util.ArrayList<EdgeDeploymentModelConfig>(modelConfigs.length));
        }
        for (EdgeDeploymentModelConfig ele : modelConfigs) {
            this.modelConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of models associated with the edge deployment plan.
     * </p>
     * 
     * @param modelConfigs
     *        List of models associated with the edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgeDeploymentPlanRequest withModelConfigs(java.util.Collection<EdgeDeploymentModelConfig> modelConfigs) {
        setModelConfigs(modelConfigs);
        return this;
    }

    /**
     * <p>
     * The device fleet used for this edge deployment plan.
     * </p>
     * 
     * @param deviceFleetName
     *        The device fleet used for this edge deployment plan.
     */

    public void setDeviceFleetName(String deviceFleetName) {
        this.deviceFleetName = deviceFleetName;
    }

    /**
     * <p>
     * The device fleet used for this edge deployment plan.
     * </p>
     * 
     * @return The device fleet used for this edge deployment plan.
     */

    public String getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * <p>
     * The device fleet used for this edge deployment plan.
     * </p>
     * 
     * @param deviceFleetName
     *        The device fleet used for this edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgeDeploymentPlanRequest withDeviceFleetName(String deviceFleetName) {
        setDeviceFleetName(deviceFleetName);
        return this;
    }

    /**
     * <p>
     * List of stages of the edge deployment plan. The number of stages is limited to 10 per deployment.
     * </p>
     * 
     * @return List of stages of the edge deployment plan. The number of stages is limited to 10 per deployment.
     */

    public java.util.List<DeploymentStage> getStages() {
        return stages;
    }

    /**
     * <p>
     * List of stages of the edge deployment plan. The number of stages is limited to 10 per deployment.
     * </p>
     * 
     * @param stages
     *        List of stages of the edge deployment plan. The number of stages is limited to 10 per deployment.
     */

    public void setStages(java.util.Collection<DeploymentStage> stages) {
        if (stages == null) {
            this.stages = null;
            return;
        }

        this.stages = new java.util.ArrayList<DeploymentStage>(stages);
    }

    /**
     * <p>
     * List of stages of the edge deployment plan. The number of stages is limited to 10 per deployment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStages(java.util.Collection)} or {@link #withStages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param stages
     *        List of stages of the edge deployment plan. The number of stages is limited to 10 per deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgeDeploymentPlanRequest withStages(DeploymentStage... stages) {
        if (this.stages == null) {
            setStages(new java.util.ArrayList<DeploymentStage>(stages.length));
        }
        for (DeploymentStage ele : stages) {
            this.stages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of stages of the edge deployment plan. The number of stages is limited to 10 per deployment.
     * </p>
     * 
     * @param stages
     *        List of stages of the edge deployment plan. The number of stages is limited to 10 per deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgeDeploymentPlanRequest withStages(java.util.Collection<DeploymentStage> stages) {
        setStages(stages);
        return this;
    }

    /**
     * <p>
     * List of tags with which to tag the edge deployment plan.
     * </p>
     * 
     * @return List of tags with which to tag the edge deployment plan.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * List of tags with which to tag the edge deployment plan.
     * </p>
     * 
     * @param tags
     *        List of tags with which to tag the edge deployment plan.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * List of tags with which to tag the edge deployment plan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        List of tags with which to tag the edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgeDeploymentPlanRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of tags with which to tag the edge deployment plan.
     * </p>
     * 
     * @param tags
     *        List of tags with which to tag the edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgeDeploymentPlanRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getEdgeDeploymentPlanName() != null)
            sb.append("EdgeDeploymentPlanName: ").append(getEdgeDeploymentPlanName()).append(",");
        if (getModelConfigs() != null)
            sb.append("ModelConfigs: ").append(getModelConfigs()).append(",");
        if (getDeviceFleetName() != null)
            sb.append("DeviceFleetName: ").append(getDeviceFleetName()).append(",");
        if (getStages() != null)
            sb.append("Stages: ").append(getStages()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEdgeDeploymentPlanRequest == false)
            return false;
        CreateEdgeDeploymentPlanRequest other = (CreateEdgeDeploymentPlanRequest) obj;
        if (other.getEdgeDeploymentPlanName() == null ^ this.getEdgeDeploymentPlanName() == null)
            return false;
        if (other.getEdgeDeploymentPlanName() != null && other.getEdgeDeploymentPlanName().equals(this.getEdgeDeploymentPlanName()) == false)
            return false;
        if (other.getModelConfigs() == null ^ this.getModelConfigs() == null)
            return false;
        if (other.getModelConfigs() != null && other.getModelConfigs().equals(this.getModelConfigs()) == false)
            return false;
        if (other.getDeviceFleetName() == null ^ this.getDeviceFleetName() == null)
            return false;
        if (other.getDeviceFleetName() != null && other.getDeviceFleetName().equals(this.getDeviceFleetName()) == false)
            return false;
        if (other.getStages() == null ^ this.getStages() == null)
            return false;
        if (other.getStages() != null && other.getStages().equals(this.getStages()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEdgeDeploymentPlanName() == null) ? 0 : getEdgeDeploymentPlanName().hashCode());
        hashCode = prime * hashCode + ((getModelConfigs() == null) ? 0 : getModelConfigs().hashCode());
        hashCode = prime * hashCode + ((getDeviceFleetName() == null) ? 0 : getDeviceFleetName().hashCode());
        hashCode = prime * hashCode + ((getStages() == null) ? 0 : getStages().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEdgeDeploymentPlanRequest clone() {
        return (CreateEdgeDeploymentPlanRequest) super.clone();
    }

}
