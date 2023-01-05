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
 * The production variant summary for a deployment when an endpoint is creating or updating with the
 * <code> <a>CreateEndpoint</a> </code> or <code> <a>UpdateEndpoint</a> </code> operations. Describes the
 * <code>VariantStatus </code>, weight and capacity for a production variant associated with an endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/PendingProductionVariantSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingProductionVariantSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the variant.
     * </p>
     */
    private String variantName;
    /**
     * <p>
     * An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     * inference images deployed on instances of this <code>ProductionVariant</code>.
     * </p>
     */
    private java.util.List<DeployedImage> deployedImages;
    /**
     * <p>
     * The weight associated with the variant.
     * </p>
     */
    private Float currentWeight;
    /**
     * <p>
     * The requested weight for the variant in this deployment, as specified in the endpoint configuration for the
     * endpoint. The value is taken from the request to the <code> <a>CreateEndpointConfig</a> </code> operation.
     * </p>
     */
    private Float desiredWeight;
    /**
     * <p>
     * The number of instances associated with the variant.
     * </p>
     */
    private Integer currentInstanceCount;
    /**
     * <p>
     * The number of instances requested in this deployment, as specified in the endpoint configuration for the
     * endpoint. The value is taken from the request to the <code> <a>CreateEndpointConfig</a> </code> operation.
     * </p>
     */
    private Integer desiredInstanceCount;
    /**
     * <p>
     * The type of instances associated with the variant.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The size of the Elastic Inference (EI) instance to use for the production variant. EI instances provide on-demand
     * GPU computing for inference. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     */
    private String acceleratorType;
    /**
     * <p>
     * The endpoint variant status which describes the current deployment stage status or operational status.
     * </p>
     */
    private java.util.List<ProductionVariantStatus> variantStatus;
    /**
     * <p>
     * The serverless configuration for the endpoint.
     * </p>
     */
    private ProductionVariantServerlessConfig currentServerlessConfig;
    /**
     * <p>
     * The serverless configuration requested for this deployment, as specified in the endpoint configuration for the
     * endpoint.
     * </p>
     */
    private ProductionVariantServerlessConfig desiredServerlessConfig;

    /**
     * <p>
     * The name of the variant.
     * </p>
     * 
     * @param variantName
     *        The name of the variant.
     */

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    /**
     * <p>
     * The name of the variant.
     * </p>
     * 
     * @return The name of the variant.
     */

    public String getVariantName() {
        return this.variantName;
    }

    /**
     * <p>
     * The name of the variant.
     * </p>
     * 
     * @param variantName
     *        The name of the variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingProductionVariantSummary withVariantName(String variantName) {
        setVariantName(variantName);
        return this;
    }

    /**
     * <p>
     * An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     * inference images deployed on instances of this <code>ProductionVariant</code>.
     * </p>
     * 
     * @return An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of
     *         the inference images deployed on instances of this <code>ProductionVariant</code>.
     */

    public java.util.List<DeployedImage> getDeployedImages() {
        return deployedImages;
    }

    /**
     * <p>
     * An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     * inference images deployed on instances of this <code>ProductionVariant</code>.
     * </p>
     * 
     * @param deployedImages
     *        An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     *        inference images deployed on instances of this <code>ProductionVariant</code>.
     */

    public void setDeployedImages(java.util.Collection<DeployedImage> deployedImages) {
        if (deployedImages == null) {
            this.deployedImages = null;
            return;
        }

        this.deployedImages = new java.util.ArrayList<DeployedImage>(deployedImages);
    }

    /**
     * <p>
     * An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     * inference images deployed on instances of this <code>ProductionVariant</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeployedImages(java.util.Collection)} or {@link #withDeployedImages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param deployedImages
     *        An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     *        inference images deployed on instances of this <code>ProductionVariant</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingProductionVariantSummary withDeployedImages(DeployedImage... deployedImages) {
        if (this.deployedImages == null) {
            setDeployedImages(new java.util.ArrayList<DeployedImage>(deployedImages.length));
        }
        for (DeployedImage ele : deployedImages) {
            this.deployedImages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     * inference images deployed on instances of this <code>ProductionVariant</code>.
     * </p>
     * 
     * @param deployedImages
     *        An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     *        inference images deployed on instances of this <code>ProductionVariant</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingProductionVariantSummary withDeployedImages(java.util.Collection<DeployedImage> deployedImages) {
        setDeployedImages(deployedImages);
        return this;
    }

    /**
     * <p>
     * The weight associated with the variant.
     * </p>
     * 
     * @param currentWeight
     *        The weight associated with the variant.
     */

    public void setCurrentWeight(Float currentWeight) {
        this.currentWeight = currentWeight;
    }

    /**
     * <p>
     * The weight associated with the variant.
     * </p>
     * 
     * @return The weight associated with the variant.
     */

    public Float getCurrentWeight() {
        return this.currentWeight;
    }

    /**
     * <p>
     * The weight associated with the variant.
     * </p>
     * 
     * @param currentWeight
     *        The weight associated with the variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingProductionVariantSummary withCurrentWeight(Float currentWeight) {
        setCurrentWeight(currentWeight);
        return this;
    }

    /**
     * <p>
     * The requested weight for the variant in this deployment, as specified in the endpoint configuration for the
     * endpoint. The value is taken from the request to the <code> <a>CreateEndpointConfig</a> </code> operation.
     * </p>
     * 
     * @param desiredWeight
     *        The requested weight for the variant in this deployment, as specified in the endpoint configuration for
     *        the endpoint. The value is taken from the request to the <code> <a>CreateEndpointConfig</a> </code>
     *        operation.
     */

    public void setDesiredWeight(Float desiredWeight) {
        this.desiredWeight = desiredWeight;
    }

    /**
     * <p>
     * The requested weight for the variant in this deployment, as specified in the endpoint configuration for the
     * endpoint. The value is taken from the request to the <code> <a>CreateEndpointConfig</a> </code> operation.
     * </p>
     * 
     * @return The requested weight for the variant in this deployment, as specified in the endpoint configuration for
     *         the endpoint. The value is taken from the request to the <code> <a>CreateEndpointConfig</a> </code>
     *         operation.
     */

    public Float getDesiredWeight() {
        return this.desiredWeight;
    }

    /**
     * <p>
     * The requested weight for the variant in this deployment, as specified in the endpoint configuration for the
     * endpoint. The value is taken from the request to the <code> <a>CreateEndpointConfig</a> </code> operation.
     * </p>
     * 
     * @param desiredWeight
     *        The requested weight for the variant in this deployment, as specified in the endpoint configuration for
     *        the endpoint. The value is taken from the request to the <code> <a>CreateEndpointConfig</a> </code>
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingProductionVariantSummary withDesiredWeight(Float desiredWeight) {
        setDesiredWeight(desiredWeight);
        return this;
    }

    /**
     * <p>
     * The number of instances associated with the variant.
     * </p>
     * 
     * @param currentInstanceCount
     *        The number of instances associated with the variant.
     */

    public void setCurrentInstanceCount(Integer currentInstanceCount) {
        this.currentInstanceCount = currentInstanceCount;
    }

    /**
     * <p>
     * The number of instances associated with the variant.
     * </p>
     * 
     * @return The number of instances associated with the variant.
     */

    public Integer getCurrentInstanceCount() {
        return this.currentInstanceCount;
    }

    /**
     * <p>
     * The number of instances associated with the variant.
     * </p>
     * 
     * @param currentInstanceCount
     *        The number of instances associated with the variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingProductionVariantSummary withCurrentInstanceCount(Integer currentInstanceCount) {
        setCurrentInstanceCount(currentInstanceCount);
        return this;
    }

    /**
     * <p>
     * The number of instances requested in this deployment, as specified in the endpoint configuration for the
     * endpoint. The value is taken from the request to the <code> <a>CreateEndpointConfig</a> </code> operation.
     * </p>
     * 
     * @param desiredInstanceCount
     *        The number of instances requested in this deployment, as specified in the endpoint configuration for the
     *        endpoint. The value is taken from the request to the <code> <a>CreateEndpointConfig</a> </code> operation.
     */

    public void setDesiredInstanceCount(Integer desiredInstanceCount) {
        this.desiredInstanceCount = desiredInstanceCount;
    }

    /**
     * <p>
     * The number of instances requested in this deployment, as specified in the endpoint configuration for the
     * endpoint. The value is taken from the request to the <code> <a>CreateEndpointConfig</a> </code> operation.
     * </p>
     * 
     * @return The number of instances requested in this deployment, as specified in the endpoint configuration for the
     *         endpoint. The value is taken from the request to the <code> <a>CreateEndpointConfig</a> </code>
     *         operation.
     */

    public Integer getDesiredInstanceCount() {
        return this.desiredInstanceCount;
    }

    /**
     * <p>
     * The number of instances requested in this deployment, as specified in the endpoint configuration for the
     * endpoint. The value is taken from the request to the <code> <a>CreateEndpointConfig</a> </code> operation.
     * </p>
     * 
     * @param desiredInstanceCount
     *        The number of instances requested in this deployment, as specified in the endpoint configuration for the
     *        endpoint. The value is taken from the request to the <code> <a>CreateEndpointConfig</a> </code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingProductionVariantSummary withDesiredInstanceCount(Integer desiredInstanceCount) {
        setDesiredInstanceCount(desiredInstanceCount);
        return this;
    }

    /**
     * <p>
     * The type of instances associated with the variant.
     * </p>
     * 
     * @param instanceType
     *        The type of instances associated with the variant.
     * @see ProductionVariantInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of instances associated with the variant.
     * </p>
     * 
     * @return The type of instances associated with the variant.
     * @see ProductionVariantInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of instances associated with the variant.
     * </p>
     * 
     * @param instanceType
     *        The type of instances associated with the variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductionVariantInstanceType
     */

    public PendingProductionVariantSummary withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The type of instances associated with the variant.
     * </p>
     * 
     * @param instanceType
     *        The type of instances associated with the variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductionVariantInstanceType
     */

    public PendingProductionVariantSummary withInstanceType(ProductionVariantInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The size of the Elastic Inference (EI) instance to use for the production variant. EI instances provide on-demand
     * GPU computing for inference. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @param acceleratorType
     *        The size of the Elastic Inference (EI) instance to use for the production variant. EI instances provide
     *        on-demand GPU computing for inference. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *        SageMaker</a>.
     * @see ProductionVariantAcceleratorType
     */

    public void setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
    }

    /**
     * <p>
     * The size of the Elastic Inference (EI) instance to use for the production variant. EI instances provide on-demand
     * GPU computing for inference. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @return The size of the Elastic Inference (EI) instance to use for the production variant. EI instances provide
     *         on-demand GPU computing for inference. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *         SageMaker</a>.
     * @see ProductionVariantAcceleratorType
     */

    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * <p>
     * The size of the Elastic Inference (EI) instance to use for the production variant. EI instances provide on-demand
     * GPU computing for inference. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @param acceleratorType
     *        The size of the Elastic Inference (EI) instance to use for the production variant. EI instances provide
     *        on-demand GPU computing for inference. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *        SageMaker</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductionVariantAcceleratorType
     */

    public PendingProductionVariantSummary withAcceleratorType(String acceleratorType) {
        setAcceleratorType(acceleratorType);
        return this;
    }

    /**
     * <p>
     * The size of the Elastic Inference (EI) instance to use for the production variant. EI instances provide on-demand
     * GPU computing for inference. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @param acceleratorType
     *        The size of the Elastic Inference (EI) instance to use for the production variant. EI instances provide
     *        on-demand GPU computing for inference. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *        SageMaker</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductionVariantAcceleratorType
     */

    public PendingProductionVariantSummary withAcceleratorType(ProductionVariantAcceleratorType acceleratorType) {
        this.acceleratorType = acceleratorType.toString();
        return this;
    }

    /**
     * <p>
     * The endpoint variant status which describes the current deployment stage status or operational status.
     * </p>
     * 
     * @return The endpoint variant status which describes the current deployment stage status or operational status.
     */

    public java.util.List<ProductionVariantStatus> getVariantStatus() {
        return variantStatus;
    }

    /**
     * <p>
     * The endpoint variant status which describes the current deployment stage status or operational status.
     * </p>
     * 
     * @param variantStatus
     *        The endpoint variant status which describes the current deployment stage status or operational status.
     */

    public void setVariantStatus(java.util.Collection<ProductionVariantStatus> variantStatus) {
        if (variantStatus == null) {
            this.variantStatus = null;
            return;
        }

        this.variantStatus = new java.util.ArrayList<ProductionVariantStatus>(variantStatus);
    }

    /**
     * <p>
     * The endpoint variant status which describes the current deployment stage status or operational status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVariantStatus(java.util.Collection)} or {@link #withVariantStatus(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param variantStatus
     *        The endpoint variant status which describes the current deployment stage status or operational status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingProductionVariantSummary withVariantStatus(ProductionVariantStatus... variantStatus) {
        if (this.variantStatus == null) {
            setVariantStatus(new java.util.ArrayList<ProductionVariantStatus>(variantStatus.length));
        }
        for (ProductionVariantStatus ele : variantStatus) {
            this.variantStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The endpoint variant status which describes the current deployment stage status or operational status.
     * </p>
     * 
     * @param variantStatus
     *        The endpoint variant status which describes the current deployment stage status or operational status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingProductionVariantSummary withVariantStatus(java.util.Collection<ProductionVariantStatus> variantStatus) {
        setVariantStatus(variantStatus);
        return this;
    }

    /**
     * <p>
     * The serverless configuration for the endpoint.
     * </p>
     * 
     * @param currentServerlessConfig
     *        The serverless configuration for the endpoint.
     */

    public void setCurrentServerlessConfig(ProductionVariantServerlessConfig currentServerlessConfig) {
        this.currentServerlessConfig = currentServerlessConfig;
    }

    /**
     * <p>
     * The serverless configuration for the endpoint.
     * </p>
     * 
     * @return The serverless configuration for the endpoint.
     */

    public ProductionVariantServerlessConfig getCurrentServerlessConfig() {
        return this.currentServerlessConfig;
    }

    /**
     * <p>
     * The serverless configuration for the endpoint.
     * </p>
     * 
     * @param currentServerlessConfig
     *        The serverless configuration for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingProductionVariantSummary withCurrentServerlessConfig(ProductionVariantServerlessConfig currentServerlessConfig) {
        setCurrentServerlessConfig(currentServerlessConfig);
        return this;
    }

    /**
     * <p>
     * The serverless configuration requested for this deployment, as specified in the endpoint configuration for the
     * endpoint.
     * </p>
     * 
     * @param desiredServerlessConfig
     *        The serverless configuration requested for this deployment, as specified in the endpoint configuration for
     *        the endpoint.
     */

    public void setDesiredServerlessConfig(ProductionVariantServerlessConfig desiredServerlessConfig) {
        this.desiredServerlessConfig = desiredServerlessConfig;
    }

    /**
     * <p>
     * The serverless configuration requested for this deployment, as specified in the endpoint configuration for the
     * endpoint.
     * </p>
     * 
     * @return The serverless configuration requested for this deployment, as specified in the endpoint configuration
     *         for the endpoint.
     */

    public ProductionVariantServerlessConfig getDesiredServerlessConfig() {
        return this.desiredServerlessConfig;
    }

    /**
     * <p>
     * The serverless configuration requested for this deployment, as specified in the endpoint configuration for the
     * endpoint.
     * </p>
     * 
     * @param desiredServerlessConfig
     *        The serverless configuration requested for this deployment, as specified in the endpoint configuration for
     *        the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingProductionVariantSummary withDesiredServerlessConfig(ProductionVariantServerlessConfig desiredServerlessConfig) {
        setDesiredServerlessConfig(desiredServerlessConfig);
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
        if (getVariantName() != null)
            sb.append("VariantName: ").append(getVariantName()).append(",");
        if (getDeployedImages() != null)
            sb.append("DeployedImages: ").append(getDeployedImages()).append(",");
        if (getCurrentWeight() != null)
            sb.append("CurrentWeight: ").append(getCurrentWeight()).append(",");
        if (getDesiredWeight() != null)
            sb.append("DesiredWeight: ").append(getDesiredWeight()).append(",");
        if (getCurrentInstanceCount() != null)
            sb.append("CurrentInstanceCount: ").append(getCurrentInstanceCount()).append(",");
        if (getDesiredInstanceCount() != null)
            sb.append("DesiredInstanceCount: ").append(getDesiredInstanceCount()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getAcceleratorType() != null)
            sb.append("AcceleratorType: ").append(getAcceleratorType()).append(",");
        if (getVariantStatus() != null)
            sb.append("VariantStatus: ").append(getVariantStatus()).append(",");
        if (getCurrentServerlessConfig() != null)
            sb.append("CurrentServerlessConfig: ").append(getCurrentServerlessConfig()).append(",");
        if (getDesiredServerlessConfig() != null)
            sb.append("DesiredServerlessConfig: ").append(getDesiredServerlessConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingProductionVariantSummary == false)
            return false;
        PendingProductionVariantSummary other = (PendingProductionVariantSummary) obj;
        if (other.getVariantName() == null ^ this.getVariantName() == null)
            return false;
        if (other.getVariantName() != null && other.getVariantName().equals(this.getVariantName()) == false)
            return false;
        if (other.getDeployedImages() == null ^ this.getDeployedImages() == null)
            return false;
        if (other.getDeployedImages() != null && other.getDeployedImages().equals(this.getDeployedImages()) == false)
            return false;
        if (other.getCurrentWeight() == null ^ this.getCurrentWeight() == null)
            return false;
        if (other.getCurrentWeight() != null && other.getCurrentWeight().equals(this.getCurrentWeight()) == false)
            return false;
        if (other.getDesiredWeight() == null ^ this.getDesiredWeight() == null)
            return false;
        if (other.getDesiredWeight() != null && other.getDesiredWeight().equals(this.getDesiredWeight()) == false)
            return false;
        if (other.getCurrentInstanceCount() == null ^ this.getCurrentInstanceCount() == null)
            return false;
        if (other.getCurrentInstanceCount() != null && other.getCurrentInstanceCount().equals(this.getCurrentInstanceCount()) == false)
            return false;
        if (other.getDesiredInstanceCount() == null ^ this.getDesiredInstanceCount() == null)
            return false;
        if (other.getDesiredInstanceCount() != null && other.getDesiredInstanceCount().equals(this.getDesiredInstanceCount()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getAcceleratorType() == null ^ this.getAcceleratorType() == null)
            return false;
        if (other.getAcceleratorType() != null && other.getAcceleratorType().equals(this.getAcceleratorType()) == false)
            return false;
        if (other.getVariantStatus() == null ^ this.getVariantStatus() == null)
            return false;
        if (other.getVariantStatus() != null && other.getVariantStatus().equals(this.getVariantStatus()) == false)
            return false;
        if (other.getCurrentServerlessConfig() == null ^ this.getCurrentServerlessConfig() == null)
            return false;
        if (other.getCurrentServerlessConfig() != null && other.getCurrentServerlessConfig().equals(this.getCurrentServerlessConfig()) == false)
            return false;
        if (other.getDesiredServerlessConfig() == null ^ this.getDesiredServerlessConfig() == null)
            return false;
        if (other.getDesiredServerlessConfig() != null && other.getDesiredServerlessConfig().equals(this.getDesiredServerlessConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariantName() == null) ? 0 : getVariantName().hashCode());
        hashCode = prime * hashCode + ((getDeployedImages() == null) ? 0 : getDeployedImages().hashCode());
        hashCode = prime * hashCode + ((getCurrentWeight() == null) ? 0 : getCurrentWeight().hashCode());
        hashCode = prime * hashCode + ((getDesiredWeight() == null) ? 0 : getDesiredWeight().hashCode());
        hashCode = prime * hashCode + ((getCurrentInstanceCount() == null) ? 0 : getCurrentInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getDesiredInstanceCount() == null) ? 0 : getDesiredInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorType() == null) ? 0 : getAcceleratorType().hashCode());
        hashCode = prime * hashCode + ((getVariantStatus() == null) ? 0 : getVariantStatus().hashCode());
        hashCode = prime * hashCode + ((getCurrentServerlessConfig() == null) ? 0 : getCurrentServerlessConfig().hashCode());
        hashCode = prime * hashCode + ((getDesiredServerlessConfig() == null) ? 0 : getDesiredServerlessConfig().hashCode());
        return hashCode;
    }

    @Override
    public PendingProductionVariantSummary clone() {
        try {
            return (PendingProductionVariantSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.PendingProductionVariantSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
