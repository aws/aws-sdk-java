/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdatePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline to update.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The display name of the pipeline.
     * </p>
     */
    private String pipelineDisplayName;
    /**
     * <p>
     * The JSON pipeline definition.
     * </p>
     */
    private String pipelineDefinition;
    /**
     * <p>
     * The description of the pipeline.
     * </p>
     */
    private String pipelineDescription;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that the pipeline uses to execute.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the pipeline to update.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline to update.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline to update.
     * </p>
     * 
     * @return The name of the pipeline to update.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline to update.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineRequest withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The display name of the pipeline.
     * </p>
     * 
     * @param pipelineDisplayName
     *        The display name of the pipeline.
     */

    public void setPipelineDisplayName(String pipelineDisplayName) {
        this.pipelineDisplayName = pipelineDisplayName;
    }

    /**
     * <p>
     * The display name of the pipeline.
     * </p>
     * 
     * @return The display name of the pipeline.
     */

    public String getPipelineDisplayName() {
        return this.pipelineDisplayName;
    }

    /**
     * <p>
     * The display name of the pipeline.
     * </p>
     * 
     * @param pipelineDisplayName
     *        The display name of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineRequest withPipelineDisplayName(String pipelineDisplayName) {
        setPipelineDisplayName(pipelineDisplayName);
        return this;
    }

    /**
     * <p>
     * The JSON pipeline definition.
     * </p>
     * 
     * @param pipelineDefinition
     *        The JSON pipeline definition.
     */

    public void setPipelineDefinition(String pipelineDefinition) {
        this.pipelineDefinition = pipelineDefinition;
    }

    /**
     * <p>
     * The JSON pipeline definition.
     * </p>
     * 
     * @return The JSON pipeline definition.
     */

    public String getPipelineDefinition() {
        return this.pipelineDefinition;
    }

    /**
     * <p>
     * The JSON pipeline definition.
     * </p>
     * 
     * @param pipelineDefinition
     *        The JSON pipeline definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineRequest withPipelineDefinition(String pipelineDefinition) {
        setPipelineDefinition(pipelineDefinition);
        return this;
    }

    /**
     * <p>
     * The description of the pipeline.
     * </p>
     * 
     * @param pipelineDescription
     *        The description of the pipeline.
     */

    public void setPipelineDescription(String pipelineDescription) {
        this.pipelineDescription = pipelineDescription;
    }

    /**
     * <p>
     * The description of the pipeline.
     * </p>
     * 
     * @return The description of the pipeline.
     */

    public String getPipelineDescription() {
        return this.pipelineDescription;
    }

    /**
     * <p>
     * The description of the pipeline.
     * </p>
     * 
     * @param pipelineDescription
     *        The description of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineRequest withPipelineDescription(String pipelineDescription) {
        setPipelineDescription(pipelineDescription);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that the pipeline uses to execute.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) that the pipeline uses to execute.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that the pipeline uses to execute.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that the pipeline uses to execute.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that the pipeline uses to execute.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) that the pipeline uses to execute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getPipelineDisplayName() != null)
            sb.append("PipelineDisplayName: ").append(getPipelineDisplayName()).append(",");
        if (getPipelineDefinition() != null)
            sb.append("PipelineDefinition: ").append(getPipelineDefinition()).append(",");
        if (getPipelineDescription() != null)
            sb.append("PipelineDescription: ").append(getPipelineDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePipelineRequest == false)
            return false;
        UpdatePipelineRequest other = (UpdatePipelineRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getPipelineDisplayName() == null ^ this.getPipelineDisplayName() == null)
            return false;
        if (other.getPipelineDisplayName() != null && other.getPipelineDisplayName().equals(this.getPipelineDisplayName()) == false)
            return false;
        if (other.getPipelineDefinition() == null ^ this.getPipelineDefinition() == null)
            return false;
        if (other.getPipelineDefinition() != null && other.getPipelineDefinition().equals(this.getPipelineDefinition()) == false)
            return false;
        if (other.getPipelineDescription() == null ^ this.getPipelineDescription() == null)
            return false;
        if (other.getPipelineDescription() != null && other.getPipelineDescription().equals(this.getPipelineDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getPipelineDisplayName() == null) ? 0 : getPipelineDisplayName().hashCode());
        hashCode = prime * hashCode + ((getPipelineDefinition() == null) ? 0 : getPipelineDefinition().hashCode());
        hashCode = prime * hashCode + ((getPipelineDescription() == null) ? 0 : getPipelineDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePipelineRequest clone() {
        return (UpdatePipelineRequest) super.clone();
    }

}
