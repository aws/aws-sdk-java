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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteEdgeDeploymentStage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEdgeDeploymentStageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the edge deployment plan from which the stage will be deleted.
     * </p>
     */
    private String edgeDeploymentPlanName;
    /**
     * <p>
     * The name of the stage.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * The name of the edge deployment plan from which the stage will be deleted.
     * </p>
     * 
     * @param edgeDeploymentPlanName
     *        The name of the edge deployment plan from which the stage will be deleted.
     */

    public void setEdgeDeploymentPlanName(String edgeDeploymentPlanName) {
        this.edgeDeploymentPlanName = edgeDeploymentPlanName;
    }

    /**
     * <p>
     * The name of the edge deployment plan from which the stage will be deleted.
     * </p>
     * 
     * @return The name of the edge deployment plan from which the stage will be deleted.
     */

    public String getEdgeDeploymentPlanName() {
        return this.edgeDeploymentPlanName;
    }

    /**
     * <p>
     * The name of the edge deployment plan from which the stage will be deleted.
     * </p>
     * 
     * @param edgeDeploymentPlanName
     *        The name of the edge deployment plan from which the stage will be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEdgeDeploymentStageRequest withEdgeDeploymentPlanName(String edgeDeploymentPlanName) {
        setEdgeDeploymentPlanName(edgeDeploymentPlanName);
        return this;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param stageName
     *        The name of the stage.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @return The name of the stage.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param stageName
     *        The name of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEdgeDeploymentStageRequest withStageName(String stageName) {
        setStageName(stageName);
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
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEdgeDeploymentStageRequest == false)
            return false;
        DeleteEdgeDeploymentStageRequest other = (DeleteEdgeDeploymentStageRequest) obj;
        if (other.getEdgeDeploymentPlanName() == null ^ this.getEdgeDeploymentPlanName() == null)
            return false;
        if (other.getEdgeDeploymentPlanName() != null && other.getEdgeDeploymentPlanName().equals(this.getEdgeDeploymentPlanName()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEdgeDeploymentPlanName() == null) ? 0 : getEdgeDeploymentPlanName().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEdgeDeploymentStageRequest clone() {
        return (DeleteEdgeDeploymentStageRequest) super.clone();
    }

}
