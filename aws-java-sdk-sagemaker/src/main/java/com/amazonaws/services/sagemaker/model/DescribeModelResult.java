/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the Amazon SageMaker model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The location of the primary inference code, associated artifacts, and custom environment map that the inference
     * code uses when it is deployed in production.
     * </p>
     */
    private ContainerDefinition primaryContainer;
    /**
     * <p>
     * The description of additional optional containers that you defined when creating the model.
     * </p>
     */
    private java.util.List<ContainerDefinition> supplementalContainers;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that you specified for the model.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * A timestamp that shows when the model was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     */
    private String modelArn;

    /**
     * <p>
     * Name of the Amazon SageMaker model.
     * </p>
     * 
     * @param modelName
     *        Name of the Amazon SageMaker model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * Name of the Amazon SageMaker model.
     * </p>
     * 
     * @return Name of the Amazon SageMaker model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * Name of the Amazon SageMaker model.
     * </p>
     * 
     * @param modelName
     *        Name of the Amazon SageMaker model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The location of the primary inference code, associated artifacts, and custom environment map that the inference
     * code uses when it is deployed in production.
     * </p>
     * 
     * @param primaryContainer
     *        The location of the primary inference code, associated artifacts, and custom environment map that the
     *        inference code uses when it is deployed in production.
     */

    public void setPrimaryContainer(ContainerDefinition primaryContainer) {
        this.primaryContainer = primaryContainer;
    }

    /**
     * <p>
     * The location of the primary inference code, associated artifacts, and custom environment map that the inference
     * code uses when it is deployed in production.
     * </p>
     * 
     * @return The location of the primary inference code, associated artifacts, and custom environment map that the
     *         inference code uses when it is deployed in production.
     */

    public ContainerDefinition getPrimaryContainer() {
        return this.primaryContainer;
    }

    /**
     * <p>
     * The location of the primary inference code, associated artifacts, and custom environment map that the inference
     * code uses when it is deployed in production.
     * </p>
     * 
     * @param primaryContainer
     *        The location of the primary inference code, associated artifacts, and custom environment map that the
     *        inference code uses when it is deployed in production.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withPrimaryContainer(ContainerDefinition primaryContainer) {
        setPrimaryContainer(primaryContainer);
        return this;
    }

    /**
     * <p>
     * The description of additional optional containers that you defined when creating the model.
     * </p>
     * 
     * @return The description of additional optional containers that you defined when creating the model.
     */

    public java.util.List<ContainerDefinition> getSupplementalContainers() {
        return supplementalContainers;
    }

    /**
     * <p>
     * The description of additional optional containers that you defined when creating the model.
     * </p>
     * 
     * @param supplementalContainers
     *        The description of additional optional containers that you defined when creating the model.
     */

    public void setSupplementalContainers(java.util.Collection<ContainerDefinition> supplementalContainers) {
        if (supplementalContainers == null) {
            this.supplementalContainers = null;
            return;
        }

        this.supplementalContainers = new java.util.ArrayList<ContainerDefinition>(supplementalContainers);
    }

    /**
     * <p>
     * The description of additional optional containers that you defined when creating the model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupplementalContainers(java.util.Collection)} or
     * {@link #withSupplementalContainers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supplementalContainers
     *        The description of additional optional containers that you defined when creating the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withSupplementalContainers(ContainerDefinition... supplementalContainers) {
        if (this.supplementalContainers == null) {
            setSupplementalContainers(new java.util.ArrayList<ContainerDefinition>(supplementalContainers.length));
        }
        for (ContainerDefinition ele : supplementalContainers) {
            this.supplementalContainers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The description of additional optional containers that you defined when creating the model.
     * </p>
     * 
     * @param supplementalContainers
     *        The description of additional optional containers that you defined when creating the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withSupplementalContainers(java.util.Collection<ContainerDefinition> supplementalContainers) {
        setSupplementalContainers(supplementalContainers);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that you specified for the model.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that you specified for the model.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that you specified for the model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that you specified for the model.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that you specified for the model.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that you specified for the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the model was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the model was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the model was created.
     * </p>
     * 
     * @return A timestamp that shows when the model was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the model was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the model was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the model.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getPrimaryContainer() != null)
            sb.append("PrimaryContainer: ").append(getPrimaryContainer()).append(",");
        if (getSupplementalContainers() != null)
            sb.append("SupplementalContainers: ").append(getSupplementalContainers()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeModelResult == false)
            return false;
        DescribeModelResult other = (DescribeModelResult) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getPrimaryContainer() == null ^ this.getPrimaryContainer() == null)
            return false;
        if (other.getPrimaryContainer() != null && other.getPrimaryContainer().equals(this.getPrimaryContainer()) == false)
            return false;
        if (other.getSupplementalContainers() == null ^ this.getSupplementalContainers() == null)
            return false;
        if (other.getSupplementalContainers() != null && other.getSupplementalContainers().equals(this.getSupplementalContainers()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getPrimaryContainer() == null) ? 0 : getPrimaryContainer().hashCode());
        hashCode = prime * hashCode + ((getSupplementalContainers() == null) ? 0 : getSupplementalContainers().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeModelResult clone() {
        try {
            return (DescribeModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
