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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEdgeDeploymentPlan"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEdgeDeploymentPlanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of edge deployment plan.
     * </p>
     */
    private String edgeDeploymentPlanArn;
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
     * The number of edge devices with the successful deployment.
     * </p>
     */
    private Integer edgeDeploymentSuccess;
    /**
     * <p>
     * The number of edge devices yet to pick up deployment, or in progress.
     * </p>
     */
    private Integer edgeDeploymentPending;
    /**
     * <p>
     * The number of edge devices that failed the deployment.
     * </p>
     */
    private Integer edgeDeploymentFailed;
    /**
     * <p>
     * List of stages in the edge deployment plan.
     * </p>
     */
    private java.util.List<DeploymentStageStatusSummary> stages;
    /**
     * <p>
     * Token to use when calling the next set of stages in the edge deployment plan.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The time when the edge deployment plan was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time when the edge deployment plan was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The ARN of edge deployment plan.
     * </p>
     * 
     * @param edgeDeploymentPlanArn
     *        The ARN of edge deployment plan.
     */

    public void setEdgeDeploymentPlanArn(String edgeDeploymentPlanArn) {
        this.edgeDeploymentPlanArn = edgeDeploymentPlanArn;
    }

    /**
     * <p>
     * The ARN of edge deployment plan.
     * </p>
     * 
     * @return The ARN of edge deployment plan.
     */

    public String getEdgeDeploymentPlanArn() {
        return this.edgeDeploymentPlanArn;
    }

    /**
     * <p>
     * The ARN of edge deployment plan.
     * </p>
     * 
     * @param edgeDeploymentPlanArn
     *        The ARN of edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgeDeploymentPlanResult withEdgeDeploymentPlanArn(String edgeDeploymentPlanArn) {
        setEdgeDeploymentPlanArn(edgeDeploymentPlanArn);
        return this;
    }

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

    public DescribeEdgeDeploymentPlanResult withEdgeDeploymentPlanName(String edgeDeploymentPlanName) {
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

    public DescribeEdgeDeploymentPlanResult withModelConfigs(EdgeDeploymentModelConfig... modelConfigs) {
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

    public DescribeEdgeDeploymentPlanResult withModelConfigs(java.util.Collection<EdgeDeploymentModelConfig> modelConfigs) {
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

    public DescribeEdgeDeploymentPlanResult withDeviceFleetName(String deviceFleetName) {
        setDeviceFleetName(deviceFleetName);
        return this;
    }

    /**
     * <p>
     * The number of edge devices with the successful deployment.
     * </p>
     * 
     * @param edgeDeploymentSuccess
     *        The number of edge devices with the successful deployment.
     */

    public void setEdgeDeploymentSuccess(Integer edgeDeploymentSuccess) {
        this.edgeDeploymentSuccess = edgeDeploymentSuccess;
    }

    /**
     * <p>
     * The number of edge devices with the successful deployment.
     * </p>
     * 
     * @return The number of edge devices with the successful deployment.
     */

    public Integer getEdgeDeploymentSuccess() {
        return this.edgeDeploymentSuccess;
    }

    /**
     * <p>
     * The number of edge devices with the successful deployment.
     * </p>
     * 
     * @param edgeDeploymentSuccess
     *        The number of edge devices with the successful deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgeDeploymentPlanResult withEdgeDeploymentSuccess(Integer edgeDeploymentSuccess) {
        setEdgeDeploymentSuccess(edgeDeploymentSuccess);
        return this;
    }

    /**
     * <p>
     * The number of edge devices yet to pick up deployment, or in progress.
     * </p>
     * 
     * @param edgeDeploymentPending
     *        The number of edge devices yet to pick up deployment, or in progress.
     */

    public void setEdgeDeploymentPending(Integer edgeDeploymentPending) {
        this.edgeDeploymentPending = edgeDeploymentPending;
    }

    /**
     * <p>
     * The number of edge devices yet to pick up deployment, or in progress.
     * </p>
     * 
     * @return The number of edge devices yet to pick up deployment, or in progress.
     */

    public Integer getEdgeDeploymentPending() {
        return this.edgeDeploymentPending;
    }

    /**
     * <p>
     * The number of edge devices yet to pick up deployment, or in progress.
     * </p>
     * 
     * @param edgeDeploymentPending
     *        The number of edge devices yet to pick up deployment, or in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgeDeploymentPlanResult withEdgeDeploymentPending(Integer edgeDeploymentPending) {
        setEdgeDeploymentPending(edgeDeploymentPending);
        return this;
    }

    /**
     * <p>
     * The number of edge devices that failed the deployment.
     * </p>
     * 
     * @param edgeDeploymentFailed
     *        The number of edge devices that failed the deployment.
     */

    public void setEdgeDeploymentFailed(Integer edgeDeploymentFailed) {
        this.edgeDeploymentFailed = edgeDeploymentFailed;
    }

    /**
     * <p>
     * The number of edge devices that failed the deployment.
     * </p>
     * 
     * @return The number of edge devices that failed the deployment.
     */

    public Integer getEdgeDeploymentFailed() {
        return this.edgeDeploymentFailed;
    }

    /**
     * <p>
     * The number of edge devices that failed the deployment.
     * </p>
     * 
     * @param edgeDeploymentFailed
     *        The number of edge devices that failed the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgeDeploymentPlanResult withEdgeDeploymentFailed(Integer edgeDeploymentFailed) {
        setEdgeDeploymentFailed(edgeDeploymentFailed);
        return this;
    }

    /**
     * <p>
     * List of stages in the edge deployment plan.
     * </p>
     * 
     * @return List of stages in the edge deployment plan.
     */

    public java.util.List<DeploymentStageStatusSummary> getStages() {
        return stages;
    }

    /**
     * <p>
     * List of stages in the edge deployment plan.
     * </p>
     * 
     * @param stages
     *        List of stages in the edge deployment plan.
     */

    public void setStages(java.util.Collection<DeploymentStageStatusSummary> stages) {
        if (stages == null) {
            this.stages = null;
            return;
        }

        this.stages = new java.util.ArrayList<DeploymentStageStatusSummary>(stages);
    }

    /**
     * <p>
     * List of stages in the edge deployment plan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStages(java.util.Collection)} or {@link #withStages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param stages
     *        List of stages in the edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgeDeploymentPlanResult withStages(DeploymentStageStatusSummary... stages) {
        if (this.stages == null) {
            setStages(new java.util.ArrayList<DeploymentStageStatusSummary>(stages.length));
        }
        for (DeploymentStageStatusSummary ele : stages) {
            this.stages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of stages in the edge deployment plan.
     * </p>
     * 
     * @param stages
     *        List of stages in the edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgeDeploymentPlanResult withStages(java.util.Collection<DeploymentStageStatusSummary> stages) {
        setStages(stages);
        return this;
    }

    /**
     * <p>
     * Token to use when calling the next set of stages in the edge deployment plan.
     * </p>
     * 
     * @param nextToken
     *        Token to use when calling the next set of stages in the edge deployment plan.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token to use when calling the next set of stages in the edge deployment plan.
     * </p>
     * 
     * @return Token to use when calling the next set of stages in the edge deployment plan.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token to use when calling the next set of stages in the edge deployment plan.
     * </p>
     * 
     * @param nextToken
     *        Token to use when calling the next set of stages in the edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgeDeploymentPlanResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The time when the edge deployment plan was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the edge deployment plan was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the edge deployment plan was created.
     * </p>
     * 
     * @return The time when the edge deployment plan was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the edge deployment plan was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the edge deployment plan was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgeDeploymentPlanResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time when the edge deployment plan was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time when the edge deployment plan was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time when the edge deployment plan was last updated.
     * </p>
     * 
     * @return The time when the edge deployment plan was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time when the edge deployment plan was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time when the edge deployment plan was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgeDeploymentPlanResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getEdgeDeploymentPlanArn() != null)
            sb.append("EdgeDeploymentPlanArn: ").append(getEdgeDeploymentPlanArn()).append(",");
        if (getEdgeDeploymentPlanName() != null)
            sb.append("EdgeDeploymentPlanName: ").append(getEdgeDeploymentPlanName()).append(",");
        if (getModelConfigs() != null)
            sb.append("ModelConfigs: ").append(getModelConfigs()).append(",");
        if (getDeviceFleetName() != null)
            sb.append("DeviceFleetName: ").append(getDeviceFleetName()).append(",");
        if (getEdgeDeploymentSuccess() != null)
            sb.append("EdgeDeploymentSuccess: ").append(getEdgeDeploymentSuccess()).append(",");
        if (getEdgeDeploymentPending() != null)
            sb.append("EdgeDeploymentPending: ").append(getEdgeDeploymentPending()).append(",");
        if (getEdgeDeploymentFailed() != null)
            sb.append("EdgeDeploymentFailed: ").append(getEdgeDeploymentFailed()).append(",");
        if (getStages() != null)
            sb.append("Stages: ").append(getStages()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEdgeDeploymentPlanResult == false)
            return false;
        DescribeEdgeDeploymentPlanResult other = (DescribeEdgeDeploymentPlanResult) obj;
        if (other.getEdgeDeploymentPlanArn() == null ^ this.getEdgeDeploymentPlanArn() == null)
            return false;
        if (other.getEdgeDeploymentPlanArn() != null && other.getEdgeDeploymentPlanArn().equals(this.getEdgeDeploymentPlanArn()) == false)
            return false;
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
        if (other.getEdgeDeploymentSuccess() == null ^ this.getEdgeDeploymentSuccess() == null)
            return false;
        if (other.getEdgeDeploymentSuccess() != null && other.getEdgeDeploymentSuccess().equals(this.getEdgeDeploymentSuccess()) == false)
            return false;
        if (other.getEdgeDeploymentPending() == null ^ this.getEdgeDeploymentPending() == null)
            return false;
        if (other.getEdgeDeploymentPending() != null && other.getEdgeDeploymentPending().equals(this.getEdgeDeploymentPending()) == false)
            return false;
        if (other.getEdgeDeploymentFailed() == null ^ this.getEdgeDeploymentFailed() == null)
            return false;
        if (other.getEdgeDeploymentFailed() != null && other.getEdgeDeploymentFailed().equals(this.getEdgeDeploymentFailed()) == false)
            return false;
        if (other.getStages() == null ^ this.getStages() == null)
            return false;
        if (other.getStages() != null && other.getStages().equals(this.getStages()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEdgeDeploymentPlanArn() == null) ? 0 : getEdgeDeploymentPlanArn().hashCode());
        hashCode = prime * hashCode + ((getEdgeDeploymentPlanName() == null) ? 0 : getEdgeDeploymentPlanName().hashCode());
        hashCode = prime * hashCode + ((getModelConfigs() == null) ? 0 : getModelConfigs().hashCode());
        hashCode = prime * hashCode + ((getDeviceFleetName() == null) ? 0 : getDeviceFleetName().hashCode());
        hashCode = prime * hashCode + ((getEdgeDeploymentSuccess() == null) ? 0 : getEdgeDeploymentSuccess().hashCode());
        hashCode = prime * hashCode + ((getEdgeDeploymentPending() == null) ? 0 : getEdgeDeploymentPending().hashCode());
        hashCode = prime * hashCode + ((getEdgeDeploymentFailed() == null) ? 0 : getEdgeDeploymentFailed().hashCode());
        hashCode = prime * hashCode + ((getStages() == null) ? 0 : getStages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEdgeDeploymentPlanResult clone() {
        try {
            return (DescribeEdgeDeploymentPlanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
