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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEdgeDeploymentStage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEdgeDeploymentStageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the edge deployment plan.
     * </p>
     */
    private String edgeDeploymentPlanName;
    /**
     * <p>
     * List of stages to be added to the edge deployment plan.
     * </p>
     */
    private java.util.List<DeploymentStage> stages;

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

    public CreateEdgeDeploymentStageRequest withEdgeDeploymentPlanName(String edgeDeploymentPlanName) {
        setEdgeDeploymentPlanName(edgeDeploymentPlanName);
        return this;
    }

    /**
     * <p>
     * List of stages to be added to the edge deployment plan.
     * </p>
     * 
     * @return List of stages to be added to the edge deployment plan.
     */

    public java.util.List<DeploymentStage> getStages() {
        return stages;
    }

    /**
     * <p>
     * List of stages to be added to the edge deployment plan.
     * </p>
     * 
     * @param stages
     *        List of stages to be added to the edge deployment plan.
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
     * List of stages to be added to the edge deployment plan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStages(java.util.Collection)} or {@link #withStages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param stages
     *        List of stages to be added to the edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgeDeploymentStageRequest withStages(DeploymentStage... stages) {
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
     * List of stages to be added to the edge deployment plan.
     * </p>
     * 
     * @param stages
     *        List of stages to be added to the edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgeDeploymentStageRequest withStages(java.util.Collection<DeploymentStage> stages) {
        setStages(stages);
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
        if (getStages() != null)
            sb.append("Stages: ").append(getStages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEdgeDeploymentStageRequest == false)
            return false;
        CreateEdgeDeploymentStageRequest other = (CreateEdgeDeploymentStageRequest) obj;
        if (other.getEdgeDeploymentPlanName() == null ^ this.getEdgeDeploymentPlanName() == null)
            return false;
        if (other.getEdgeDeploymentPlanName() != null && other.getEdgeDeploymentPlanName().equals(this.getEdgeDeploymentPlanName()) == false)
            return false;
        if (other.getStages() == null ^ this.getStages() == null)
            return false;
        if (other.getStages() != null && other.getStages().equals(this.getStages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEdgeDeploymentPlanName() == null) ? 0 : getEdgeDeploymentPlanName().hashCode());
        hashCode = prime * hashCode + ((getStages() == null) ? 0 : getStages().hashCode());
        return hashCode;
    }

    @Override
    public CreateEdgeDeploymentStageRequest clone() {
        return (CreateEdgeDeploymentStageRequest) super.clone();
    }

}
