/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The location of the primary docker image containing inference code, associated artifacts, and custom environment
     * map that the inference code uses when the model is deployed into production.
     * </p>
     */
    private ContainerDefinition primaryContainer;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts and
     * docker image for deployment on ML compute instances. Deploying on ML compute instances is part of model hosting.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the new model.
     * </p>
     * 
     * @param modelName
     *        The name of the new model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the new model.
     * </p>
     * 
     * @return The name of the new model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the new model.
     * </p>
     * 
     * @param modelName
     *        The name of the new model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The location of the primary docker image containing inference code, associated artifacts, and custom environment
     * map that the inference code uses when the model is deployed into production.
     * </p>
     * 
     * @param primaryContainer
     *        The location of the primary docker image containing inference code, associated artifacts, and custom
     *        environment map that the inference code uses when the model is deployed into production.
     */

    public void setPrimaryContainer(ContainerDefinition primaryContainer) {
        this.primaryContainer = primaryContainer;
    }

    /**
     * <p>
     * The location of the primary docker image containing inference code, associated artifacts, and custom environment
     * map that the inference code uses when the model is deployed into production.
     * </p>
     * 
     * @return The location of the primary docker image containing inference code, associated artifacts, and custom
     *         environment map that the inference code uses when the model is deployed into production.
     */

    public ContainerDefinition getPrimaryContainer() {
        return this.primaryContainer;
    }

    /**
     * <p>
     * The location of the primary docker image containing inference code, associated artifacts, and custom environment
     * map that the inference code uses when the model is deployed into production.
     * </p>
     * 
     * @param primaryContainer
     *        The location of the primary docker image containing inference code, associated artifacts, and custom
     *        environment map that the inference code uses when the model is deployed into production.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withPrimaryContainer(ContainerDefinition primaryContainer) {
        setPrimaryContainer(primaryContainer);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts and
     * docker image for deployment on ML compute instances. Deploying on ML compute instances is part of model hosting.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts
     *        and docker image for deployment on ML compute instances. Deploying on ML compute instances is part of
     *        model hosting. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts and
     * docker image for deployment on ML compute instances. Deploying on ML compute instances is part of model hosting.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts
     *         and docker image for deployment on ML compute instances. Deploying on ML compute instances is part of
     *         model hosting. For more information, see <a
     *         href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts and
     * docker image for deployment on ML compute instances. Deploying on ML compute instances is part of model hosting.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts
     *        and docker image for deployment on ML compute instances. Deploying on ML compute instances is part of
     *        model hosting. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @return An array of key-value pairs. For more information, see <a
     *         href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *         >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. For more information, see <a
     *        href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
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
     * An array of key-value pairs. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. For more information, see <a
     *        href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withTags(Tag... tags) {
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
     * An array of key-value pairs. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. For more information, see <a
     *        href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
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

        if (obj instanceof CreateModelRequest == false)
            return false;
        CreateModelRequest other = (CreateModelRequest) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getPrimaryContainer() == null ^ this.getPrimaryContainer() == null)
            return false;
        if (other.getPrimaryContainer() != null && other.getPrimaryContainer().equals(this.getPrimaryContainer()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getPrimaryContainer() == null) ? 0 : getPrimaryContainer().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelRequest clone() {
        return (CreateModelRequest) super.clone();
    }

}
