/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * map that the inference code uses when the model is deployed for predictions.
     * </p>
     */
    private ContainerDefinition primaryContainer;
    /**
     * <p>
     * Specifies the containers in the inference pipeline.
     * </p>
     */
    private java.util.List<ContainerDefinition> containers;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts and
     * docker image for deployment on ML compute instances or for batch transform jobs. Deploying on ML compute
     * instances is part of model hosting. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     */
    private String executionRoleArn;
    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your model to connect to. Control access to and
     * from your model container by configuring the VPC. <code>VpcConfig</code> is used in hosting services and in batch
     * transform. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html">Protect Endpoints by Using an Amazon Virtual
     * Private Cloud</a> and <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html">Protect Data in
     * Batch Transform Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * </p>
     * <note>
     * <p>
     * The Semantic Segmentation built-in algorithm does not support network isolation.
     * </p>
     * </note>
     */
    private Boolean enableNetworkIsolation;

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
     * map that the inference code uses when the model is deployed for predictions.
     * </p>
     * 
     * @param primaryContainer
     *        The location of the primary docker image containing inference code, associated artifacts, and custom
     *        environment map that the inference code uses when the model is deployed for predictions.
     */

    public void setPrimaryContainer(ContainerDefinition primaryContainer) {
        this.primaryContainer = primaryContainer;
    }

    /**
     * <p>
     * The location of the primary docker image containing inference code, associated artifacts, and custom environment
     * map that the inference code uses when the model is deployed for predictions.
     * </p>
     * 
     * @return The location of the primary docker image containing inference code, associated artifacts, and custom
     *         environment map that the inference code uses when the model is deployed for predictions.
     */

    public ContainerDefinition getPrimaryContainer() {
        return this.primaryContainer;
    }

    /**
     * <p>
     * The location of the primary docker image containing inference code, associated artifacts, and custom environment
     * map that the inference code uses when the model is deployed for predictions.
     * </p>
     * 
     * @param primaryContainer
     *        The location of the primary docker image containing inference code, associated artifacts, and custom
     *        environment map that the inference code uses when the model is deployed for predictions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withPrimaryContainer(ContainerDefinition primaryContainer) {
        setPrimaryContainer(primaryContainer);
        return this;
    }

    /**
     * <p>
     * Specifies the containers in the inference pipeline.
     * </p>
     * 
     * @return Specifies the containers in the inference pipeline.
     */

    public java.util.List<ContainerDefinition> getContainers() {
        return containers;
    }

    /**
     * <p>
     * Specifies the containers in the inference pipeline.
     * </p>
     * 
     * @param containers
     *        Specifies the containers in the inference pipeline.
     */

    public void setContainers(java.util.Collection<ContainerDefinition> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<ContainerDefinition>(containers);
    }

    /**
     * <p>
     * Specifies the containers in the inference pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        Specifies the containers in the inference pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withContainers(ContainerDefinition... containers) {
        if (this.containers == null) {
            setContainers(new java.util.ArrayList<ContainerDefinition>(containers.length));
        }
        for (ContainerDefinition ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the containers in the inference pipeline.
     * </p>
     * 
     * @param containers
     *        Specifies the containers in the inference pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withContainers(java.util.Collection<ContainerDefinition> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts and
     * docker image for deployment on ML compute instances or for batch transform jobs. Deploying on ML compute
     * instances is part of model hosting. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts
     *        and docker image for deployment on ML compute instances or for batch transform jobs. Deploying on ML
     *        compute instances is part of model hosting. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     *        </p> <note>
     *        <p>
     *        To be able to pass this role to Amazon SageMaker, the caller of this API must have the
     *        <code>iam:PassRole</code> permission.
     *        </p>
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts and
     * docker image for deployment on ML compute instances or for batch transform jobs. Deploying on ML compute
     * instances is part of model hosting. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts
     *         and docker image for deployment on ML compute instances or for batch transform jobs. Deploying on ML
     *         compute instances is part of model hosting. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     *         </p> <note>
     *         <p>
     *         To be able to pass this role to Amazon SageMaker, the caller of this API must have the
     *         <code>iam:PassRole</code> permission.
     *         </p>
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts and
     * docker image for deployment on ML compute instances or for batch transform jobs. Deploying on ML compute
     * instances is part of model hosting. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts
     *        and docker image for deployment on ML compute instances or for batch transform jobs. Deploying on ML
     *        compute instances is part of model hosting. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     *        </p> <note>
     *        <p>
     *        To be able to pass this role to Amazon SageMaker, the caller of this API must have the
     *        <code>iam:PassRole</code> permission.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @return An array of key-value pairs. For more information, see <a
     *         href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *         >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
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
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
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
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
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
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your model to connect to. Control access to and
     * from your model container by configuring the VPC. <code>VpcConfig</code> is used in hosting services and in batch
     * transform. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html">Protect Endpoints by Using an Amazon Virtual
     * Private Cloud</a> and <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html">Protect Data in
     * Batch Transform Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     * 
     * @param vpcConfig
     *        A <a>VpcConfig</a> object that specifies the VPC that you want your model to connect to. Control access to
     *        and from your model container by configuring the VPC. <code>VpcConfig</code> is used in hosting services
     *        and in batch transform. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html">Protect Endpoints by Using an Amazon
     *        Virtual Private Cloud</a> and <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html">Protect Data in Batch Transform Jobs
     *        by Using an Amazon Virtual Private Cloud</a>.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your model to connect to. Control access to and
     * from your model container by configuring the VPC. <code>VpcConfig</code> is used in hosting services and in batch
     * transform. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html">Protect Endpoints by Using an Amazon Virtual
     * Private Cloud</a> and <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html">Protect Data in
     * Batch Transform Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     * 
     * @return A <a>VpcConfig</a> object that specifies the VPC that you want your model to connect to. Control access
     *         to and from your model container by configuring the VPC. <code>VpcConfig</code> is used in hosting
     *         services and in batch transform. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html">Protect Endpoints by Using an Amazon
     *         Virtual Private Cloud</a> and <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html">Protect Data in Batch Transform
     *         Jobs by Using an Amazon Virtual Private Cloud</a>.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your model to connect to. Control access to and
     * from your model container by configuring the VPC. <code>VpcConfig</code> is used in hosting services and in batch
     * transform. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html">Protect Endpoints by Using an Amazon Virtual
     * Private Cloud</a> and <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html">Protect Data in
     * Batch Transform Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     * 
     * @param vpcConfig
     *        A <a>VpcConfig</a> object that specifies the VPC that you want your model to connect to. Control access to
     *        and from your model container by configuring the VPC. <code>VpcConfig</code> is used in hosting services
     *        and in batch transform. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html">Protect Endpoints by Using an Amazon
     *        Virtual Private Cloud</a> and <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html">Protect Data in Batch Transform Jobs
     *        by Using an Amazon Virtual Private Cloud</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * </p>
     * <note>
     * <p>
     * The Semantic Segmentation built-in algorithm does not support network isolation.
     * </p>
     * </note>
     * 
     * @param enableNetworkIsolation
     *        Isolates the model container. No inbound or outbound network calls can be made to or from the model
     *        container.</p> <note>
     *        <p>
     *        The Semantic Segmentation built-in algorithm does not support network isolation.
     *        </p>
     */

    public void setEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        this.enableNetworkIsolation = enableNetworkIsolation;
    }

    /**
     * <p>
     * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * </p>
     * <note>
     * <p>
     * The Semantic Segmentation built-in algorithm does not support network isolation.
     * </p>
     * </note>
     * 
     * @return Isolates the model container. No inbound or outbound network calls can be made to or from the model
     *         container.</p> <note>
     *         <p>
     *         The Semantic Segmentation built-in algorithm does not support network isolation.
     *         </p>
     */

    public Boolean getEnableNetworkIsolation() {
        return this.enableNetworkIsolation;
    }

    /**
     * <p>
     * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * </p>
     * <note>
     * <p>
     * The Semantic Segmentation built-in algorithm does not support network isolation.
     * </p>
     * </note>
     * 
     * @param enableNetworkIsolation
     *        Isolates the model container. No inbound or outbound network calls can be made to or from the model
     *        container.</p> <note>
     *        <p>
     *        The Semantic Segmentation built-in algorithm does not support network isolation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        setEnableNetworkIsolation(enableNetworkIsolation);
        return this;
    }

    /**
     * <p>
     * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * </p>
     * <note>
     * <p>
     * The Semantic Segmentation built-in algorithm does not support network isolation.
     * </p>
     * </note>
     * 
     * @return Isolates the model container. No inbound or outbound network calls can be made to or from the model
     *         container.</p> <note>
     *         <p>
     *         The Semantic Segmentation built-in algorithm does not support network isolation.
     *         </p>
     */

    public Boolean isEnableNetworkIsolation() {
        return this.enableNetworkIsolation;
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getPrimaryContainer() != null)
            sb.append("PrimaryContainer: ").append(getPrimaryContainer()).append(",");
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getEnableNetworkIsolation() != null)
            sb.append("EnableNetworkIsolation: ").append(getEnableNetworkIsolation());
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
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getEnableNetworkIsolation() == null ^ this.getEnableNetworkIsolation() == null)
            return false;
        if (other.getEnableNetworkIsolation() != null && other.getEnableNetworkIsolation().equals(this.getEnableNetworkIsolation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getPrimaryContainer() == null) ? 0 : getPrimaryContainer().hashCode());
        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getEnableNetworkIsolation() == null) ? 0 : getEnableNetworkIsolation().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelRequest clone() {
        return (CreateModelRequest) super.clone();
    }

}
