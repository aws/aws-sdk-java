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
 * The properties of a model as returned by the <a>Search</a> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Model" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Model implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the model.
     * </p>
     */
    private String modelName;

    private ContainerDefinition primaryContainer;
    /**
     * <p>
     * The containers in the inference pipeline.
     * </p>
     */
    private java.util.List<ContainerDefinition> containers;

    private InferenceExecutionConfig inferenceExecutionConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that you specified for the model.
     * </p>
     */
    private String executionRoleArn;

    private VpcConfig vpcConfig;
    /**
     * <p>
     * A timestamp that indicates when the model was created.
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
     * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * </p>
     */
    private Boolean enableNetworkIsolation;
    /**
     * <p>
     * A list of key-value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @return The name of the model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * @param primaryContainer
     */

    public void setPrimaryContainer(ContainerDefinition primaryContainer) {
        this.primaryContainer = primaryContainer;
    }

    /**
     * @return
     */

    public ContainerDefinition getPrimaryContainer() {
        return this.primaryContainer;
    }

    /**
     * @param primaryContainer
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withPrimaryContainer(ContainerDefinition primaryContainer) {
        setPrimaryContainer(primaryContainer);
        return this;
    }

    /**
     * <p>
     * The containers in the inference pipeline.
     * </p>
     * 
     * @return The containers in the inference pipeline.
     */

    public java.util.List<ContainerDefinition> getContainers() {
        return containers;
    }

    /**
     * <p>
     * The containers in the inference pipeline.
     * </p>
     * 
     * @param containers
     *        The containers in the inference pipeline.
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
     * The containers in the inference pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        The containers in the inference pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withContainers(ContainerDefinition... containers) {
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
     * The containers in the inference pipeline.
     * </p>
     * 
     * @param containers
     *        The containers in the inference pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withContainers(java.util.Collection<ContainerDefinition> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * @param inferenceExecutionConfig
     */

    public void setInferenceExecutionConfig(InferenceExecutionConfig inferenceExecutionConfig) {
        this.inferenceExecutionConfig = inferenceExecutionConfig;
    }

    /**
     * @return
     */

    public InferenceExecutionConfig getInferenceExecutionConfig() {
        return this.inferenceExecutionConfig;
    }

    /**
     * @param inferenceExecutionConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withInferenceExecutionConfig(InferenceExecutionConfig inferenceExecutionConfig) {
        setInferenceExecutionConfig(inferenceExecutionConfig);
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

    public Model withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * @param vpcConfig
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * @return
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * @param vpcConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the model was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when the model was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the model was created.
     * </p>
     * 
     * @return A timestamp that indicates when the model was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the model was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when the model was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withCreationTime(java.util.Date creationTime) {
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

    public Model withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * </p>
     * 
     * @param enableNetworkIsolation
     *        Isolates the model container. No inbound or outbound network calls can be made to or from the model
     *        container.
     */

    public void setEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        this.enableNetworkIsolation = enableNetworkIsolation;
    }

    /**
     * <p>
     * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * </p>
     * 
     * @return Isolates the model container. No inbound or outbound network calls can be made to or from the model
     *         container.
     */

    public Boolean getEnableNetworkIsolation() {
        return this.enableNetworkIsolation;
    }

    /**
     * <p>
     * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * </p>
     * 
     * @param enableNetworkIsolation
     *        Isolates the model container. No inbound or outbound network calls can be made to or from the model
     *        container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        setEnableNetworkIsolation(enableNetworkIsolation);
        return this;
    }

    /**
     * <p>
     * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * </p>
     * 
     * @return Isolates the model container. No inbound or outbound network calls can be made to or from the model
     *         container.
     */

    public Boolean isEnableNetworkIsolation() {
        return this.enableNetworkIsolation;
    }

    /**
     * <p>
     * A list of key-value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @return A list of key-value pairs associated with the model. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs associated with the model. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
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
     * A list of key-value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs associated with the model. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withTags(Tag... tags) {
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
     * A list of key-value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs associated with the model. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withTags(java.util.Collection<Tag> tags) {
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getPrimaryContainer() != null)
            sb.append("PrimaryContainer: ").append(getPrimaryContainer()).append(",");
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers()).append(",");
        if (getInferenceExecutionConfig() != null)
            sb.append("InferenceExecutionConfig: ").append(getInferenceExecutionConfig()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getEnableNetworkIsolation() != null)
            sb.append("EnableNetworkIsolation: ").append(getEnableNetworkIsolation()).append(",");
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

        if (obj instanceof Model == false)
            return false;
        Model other = (Model) obj;
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
        if (other.getInferenceExecutionConfig() == null ^ this.getInferenceExecutionConfig() == null)
            return false;
        if (other.getInferenceExecutionConfig() != null && other.getInferenceExecutionConfig().equals(this.getInferenceExecutionConfig()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getEnableNetworkIsolation() == null ^ this.getEnableNetworkIsolation() == null)
            return false;
        if (other.getEnableNetworkIsolation() != null && other.getEnableNetworkIsolation().equals(this.getEnableNetworkIsolation()) == false)
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
        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getInferenceExecutionConfig() == null) ? 0 : getInferenceExecutionConfig().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getEnableNetworkIsolation() == null) ? 0 : getEnableNetworkIsolation().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Model clone() {
        try {
            return (Model) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
