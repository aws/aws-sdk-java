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
 * Identifies a model that you want to host and the resources chosen to deploy for hosting it. If you are deploying
 * multiple models, tell SageMaker how to distribute traffic among the models by specifying variant weights.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProductionVariant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductionVariant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the production variant.
     * </p>
     */
    private String variantName;
    /**
     * <p>
     * The name of the model that you want to host. This is the name that you specified when creating the model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * Number of instances to launch initially.
     * </p>
     */
    private Integer initialInstanceCount;
    /**
     * <p>
     * The ML compute instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Determines initial traffic distribution among all of the models that you specify in the endpoint configuration.
     * The traffic to a production variant is determined by the ratio of the <code>VariantWeight</code> to the sum of
     * all <code>VariantWeight</code> values across all ProductionVariants. If unspecified, it defaults to 1.0.
     * </p>
     */
    private Float initialVariantWeight;
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
     * Specifies configuration for a core dump from the model container when the process crashes.
     * </p>
     */
    private ProductionVariantCoreDumpConfig coreDumpConfig;
    /**
     * <p>
     * The serverless configuration for an endpoint. Specifies a serverless endpoint configuration instead of an
     * instance-based endpoint configuration.
     * </p>
     */
    private ProductionVariantServerlessConfig serverlessConfig;
    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to individual inference instance associated with the
     * production variant. Currenly only Amazon EBS gp2 storage volumes are supported.
     * </p>
     */
    private Integer volumeSizeInGB;
    /**
     * <p>
     * The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to the
     * individual inference instance associated with this production variant.
     * </p>
     */
    private Integer modelDataDownloadTimeoutInSeconds;
    /**
     * <p>
     * The timeout value, in seconds, for your inference container to pass health check by SageMaker Hosting. For more
     * information about health check, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests"
     * >How Your Container Should Respond to Health Check (Ping) Requests</a>.
     * </p>
     */
    private Integer containerStartupHealthCheckTimeoutInSeconds;

    /**
     * <p>
     * The name of the production variant.
     * </p>
     * 
     * @param variantName
     *        The name of the production variant.
     */

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    /**
     * <p>
     * The name of the production variant.
     * </p>
     * 
     * @return The name of the production variant.
     */

    public String getVariantName() {
        return this.variantName;
    }

    /**
     * <p>
     * The name of the production variant.
     * </p>
     * 
     * @param variantName
     *        The name of the production variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariant withVariantName(String variantName) {
        setVariantName(variantName);
        return this;
    }

    /**
     * <p>
     * The name of the model that you want to host. This is the name that you specified when creating the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model that you want to host. This is the name that you specified when creating the model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model that you want to host. This is the name that you specified when creating the model.
     * </p>
     * 
     * @return The name of the model that you want to host. This is the name that you specified when creating the model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model that you want to host. This is the name that you specified when creating the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model that you want to host. This is the name that you specified when creating the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariant withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * Number of instances to launch initially.
     * </p>
     * 
     * @param initialInstanceCount
     *        Number of instances to launch initially.
     */

    public void setInitialInstanceCount(Integer initialInstanceCount) {
        this.initialInstanceCount = initialInstanceCount;
    }

    /**
     * <p>
     * Number of instances to launch initially.
     * </p>
     * 
     * @return Number of instances to launch initially.
     */

    public Integer getInitialInstanceCount() {
        return this.initialInstanceCount;
    }

    /**
     * <p>
     * Number of instances to launch initially.
     * </p>
     * 
     * @param initialInstanceCount
     *        Number of instances to launch initially.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariant withInitialInstanceCount(Integer initialInstanceCount) {
        setInitialInstanceCount(initialInstanceCount);
        return this;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * 
     * @param instanceType
     *        The ML compute instance type.
     * @see ProductionVariantInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * 
     * @return The ML compute instance type.
     * @see ProductionVariantInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * 
     * @param instanceType
     *        The ML compute instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductionVariantInstanceType
     */

    public ProductionVariant withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * 
     * @param instanceType
     *        The ML compute instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductionVariantInstanceType
     */

    public ProductionVariant withInstanceType(ProductionVariantInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * Determines initial traffic distribution among all of the models that you specify in the endpoint configuration.
     * The traffic to a production variant is determined by the ratio of the <code>VariantWeight</code> to the sum of
     * all <code>VariantWeight</code> values across all ProductionVariants. If unspecified, it defaults to 1.0.
     * </p>
     * 
     * @param initialVariantWeight
     *        Determines initial traffic distribution among all of the models that you specify in the endpoint
     *        configuration. The traffic to a production variant is determined by the ratio of the
     *        <code>VariantWeight</code> to the sum of all <code>VariantWeight</code> values across all
     *        ProductionVariants. If unspecified, it defaults to 1.0.
     */

    public void setInitialVariantWeight(Float initialVariantWeight) {
        this.initialVariantWeight = initialVariantWeight;
    }

    /**
     * <p>
     * Determines initial traffic distribution among all of the models that you specify in the endpoint configuration.
     * The traffic to a production variant is determined by the ratio of the <code>VariantWeight</code> to the sum of
     * all <code>VariantWeight</code> values across all ProductionVariants. If unspecified, it defaults to 1.0.
     * </p>
     * 
     * @return Determines initial traffic distribution among all of the models that you specify in the endpoint
     *         configuration. The traffic to a production variant is determined by the ratio of the
     *         <code>VariantWeight</code> to the sum of all <code>VariantWeight</code> values across all
     *         ProductionVariants. If unspecified, it defaults to 1.0.
     */

    public Float getInitialVariantWeight() {
        return this.initialVariantWeight;
    }

    /**
     * <p>
     * Determines initial traffic distribution among all of the models that you specify in the endpoint configuration.
     * The traffic to a production variant is determined by the ratio of the <code>VariantWeight</code> to the sum of
     * all <code>VariantWeight</code> values across all ProductionVariants. If unspecified, it defaults to 1.0.
     * </p>
     * 
     * @param initialVariantWeight
     *        Determines initial traffic distribution among all of the models that you specify in the endpoint
     *        configuration. The traffic to a production variant is determined by the ratio of the
     *        <code>VariantWeight</code> to the sum of all <code>VariantWeight</code> values across all
     *        ProductionVariants. If unspecified, it defaults to 1.0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariant withInitialVariantWeight(Float initialVariantWeight) {
        setInitialVariantWeight(initialVariantWeight);
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

    public ProductionVariant withAcceleratorType(String acceleratorType) {
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

    public ProductionVariant withAcceleratorType(ProductionVariantAcceleratorType acceleratorType) {
        this.acceleratorType = acceleratorType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies configuration for a core dump from the model container when the process crashes.
     * </p>
     * 
     * @param coreDumpConfig
     *        Specifies configuration for a core dump from the model container when the process crashes.
     */

    public void setCoreDumpConfig(ProductionVariantCoreDumpConfig coreDumpConfig) {
        this.coreDumpConfig = coreDumpConfig;
    }

    /**
     * <p>
     * Specifies configuration for a core dump from the model container when the process crashes.
     * </p>
     * 
     * @return Specifies configuration for a core dump from the model container when the process crashes.
     */

    public ProductionVariantCoreDumpConfig getCoreDumpConfig() {
        return this.coreDumpConfig;
    }

    /**
     * <p>
     * Specifies configuration for a core dump from the model container when the process crashes.
     * </p>
     * 
     * @param coreDumpConfig
     *        Specifies configuration for a core dump from the model container when the process crashes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariant withCoreDumpConfig(ProductionVariantCoreDumpConfig coreDumpConfig) {
        setCoreDumpConfig(coreDumpConfig);
        return this;
    }

    /**
     * <p>
     * The serverless configuration for an endpoint. Specifies a serverless endpoint configuration instead of an
     * instance-based endpoint configuration.
     * </p>
     * 
     * @param serverlessConfig
     *        The serverless configuration for an endpoint. Specifies a serverless endpoint configuration instead of an
     *        instance-based endpoint configuration.
     */

    public void setServerlessConfig(ProductionVariantServerlessConfig serverlessConfig) {
        this.serverlessConfig = serverlessConfig;
    }

    /**
     * <p>
     * The serverless configuration for an endpoint. Specifies a serverless endpoint configuration instead of an
     * instance-based endpoint configuration.
     * </p>
     * 
     * @return The serverless configuration for an endpoint. Specifies a serverless endpoint configuration instead of an
     *         instance-based endpoint configuration.
     */

    public ProductionVariantServerlessConfig getServerlessConfig() {
        return this.serverlessConfig;
    }

    /**
     * <p>
     * The serverless configuration for an endpoint. Specifies a serverless endpoint configuration instead of an
     * instance-based endpoint configuration.
     * </p>
     * 
     * @param serverlessConfig
     *        The serverless configuration for an endpoint. Specifies a serverless endpoint configuration instead of an
     *        instance-based endpoint configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariant withServerlessConfig(ProductionVariantServerlessConfig serverlessConfig) {
        setServerlessConfig(serverlessConfig);
        return this;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to individual inference instance associated with the
     * production variant. Currenly only Amazon EBS gp2 storage volumes are supported.
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size, in GB, of the ML storage volume attached to individual inference instance associated with the
     *        production variant. Currenly only Amazon EBS gp2 storage volumes are supported.
     */

    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to individual inference instance associated with the
     * production variant. Currenly only Amazon EBS gp2 storage volumes are supported.
     * </p>
     * 
     * @return The size, in GB, of the ML storage volume attached to individual inference instance associated with the
     *         production variant. Currenly only Amazon EBS gp2 storage volumes are supported.
     */

    public Integer getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to individual inference instance associated with the
     * production variant. Currenly only Amazon EBS gp2 storage volumes are supported.
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size, in GB, of the ML storage volume attached to individual inference instance associated with the
     *        production variant. Currenly only Amazon EBS gp2 storage volumes are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariant withVolumeSizeInGB(Integer volumeSizeInGB) {
        setVolumeSizeInGB(volumeSizeInGB);
        return this;
    }

    /**
     * <p>
     * The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to the
     * individual inference instance associated with this production variant.
     * </p>
     * 
     * @param modelDataDownloadTimeoutInSeconds
     *        The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to
     *        the individual inference instance associated with this production variant.
     */

    public void setModelDataDownloadTimeoutInSeconds(Integer modelDataDownloadTimeoutInSeconds) {
        this.modelDataDownloadTimeoutInSeconds = modelDataDownloadTimeoutInSeconds;
    }

    /**
     * <p>
     * The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to the
     * individual inference instance associated with this production variant.
     * </p>
     * 
     * @return The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to
     *         the individual inference instance associated with this production variant.
     */

    public Integer getModelDataDownloadTimeoutInSeconds() {
        return this.modelDataDownloadTimeoutInSeconds;
    }

    /**
     * <p>
     * The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to the
     * individual inference instance associated with this production variant.
     * </p>
     * 
     * @param modelDataDownloadTimeoutInSeconds
     *        The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to
     *        the individual inference instance associated with this production variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariant withModelDataDownloadTimeoutInSeconds(Integer modelDataDownloadTimeoutInSeconds) {
        setModelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * The timeout value, in seconds, for your inference container to pass health check by SageMaker Hosting. For more
     * information about health check, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests"
     * >How Your Container Should Respond to Health Check (Ping) Requests</a>.
     * </p>
     * 
     * @param containerStartupHealthCheckTimeoutInSeconds
     *        The timeout value, in seconds, for your inference container to pass health check by SageMaker Hosting. For
     *        more information about health check, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests"
     *        >How Your Container Should Respond to Health Check (Ping) Requests</a>.
     */

    public void setContainerStartupHealthCheckTimeoutInSeconds(Integer containerStartupHealthCheckTimeoutInSeconds) {
        this.containerStartupHealthCheckTimeoutInSeconds = containerStartupHealthCheckTimeoutInSeconds;
    }

    /**
     * <p>
     * The timeout value, in seconds, for your inference container to pass health check by SageMaker Hosting. For more
     * information about health check, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests"
     * >How Your Container Should Respond to Health Check (Ping) Requests</a>.
     * </p>
     * 
     * @return The timeout value, in seconds, for your inference container to pass health check by SageMaker Hosting.
     *         For more information about health check, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests"
     *         >How Your Container Should Respond to Health Check (Ping) Requests</a>.
     */

    public Integer getContainerStartupHealthCheckTimeoutInSeconds() {
        return this.containerStartupHealthCheckTimeoutInSeconds;
    }

    /**
     * <p>
     * The timeout value, in seconds, for your inference container to pass health check by SageMaker Hosting. For more
     * information about health check, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests"
     * >How Your Container Should Respond to Health Check (Ping) Requests</a>.
     * </p>
     * 
     * @param containerStartupHealthCheckTimeoutInSeconds
     *        The timeout value, in seconds, for your inference container to pass health check by SageMaker Hosting. For
     *        more information about health check, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests"
     *        >How Your Container Should Respond to Health Check (Ping) Requests</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariant withContainerStartupHealthCheckTimeoutInSeconds(Integer containerStartupHealthCheckTimeoutInSeconds) {
        setContainerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds);
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getInitialInstanceCount() != null)
            sb.append("InitialInstanceCount: ").append(getInitialInstanceCount()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInitialVariantWeight() != null)
            sb.append("InitialVariantWeight: ").append(getInitialVariantWeight()).append(",");
        if (getAcceleratorType() != null)
            sb.append("AcceleratorType: ").append(getAcceleratorType()).append(",");
        if (getCoreDumpConfig() != null)
            sb.append("CoreDumpConfig: ").append(getCoreDumpConfig()).append(",");
        if (getServerlessConfig() != null)
            sb.append("ServerlessConfig: ").append(getServerlessConfig()).append(",");
        if (getVolumeSizeInGB() != null)
            sb.append("VolumeSizeInGB: ").append(getVolumeSizeInGB()).append(",");
        if (getModelDataDownloadTimeoutInSeconds() != null)
            sb.append("ModelDataDownloadTimeoutInSeconds: ").append(getModelDataDownloadTimeoutInSeconds()).append(",");
        if (getContainerStartupHealthCheckTimeoutInSeconds() != null)
            sb.append("ContainerStartupHealthCheckTimeoutInSeconds: ").append(getContainerStartupHealthCheckTimeoutInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductionVariant == false)
            return false;
        ProductionVariant other = (ProductionVariant) obj;
        if (other.getVariantName() == null ^ this.getVariantName() == null)
            return false;
        if (other.getVariantName() != null && other.getVariantName().equals(this.getVariantName()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getInitialInstanceCount() == null ^ this.getInitialInstanceCount() == null)
            return false;
        if (other.getInitialInstanceCount() != null && other.getInitialInstanceCount().equals(this.getInitialInstanceCount()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInitialVariantWeight() == null ^ this.getInitialVariantWeight() == null)
            return false;
        if (other.getInitialVariantWeight() != null && other.getInitialVariantWeight().equals(this.getInitialVariantWeight()) == false)
            return false;
        if (other.getAcceleratorType() == null ^ this.getAcceleratorType() == null)
            return false;
        if (other.getAcceleratorType() != null && other.getAcceleratorType().equals(this.getAcceleratorType()) == false)
            return false;
        if (other.getCoreDumpConfig() == null ^ this.getCoreDumpConfig() == null)
            return false;
        if (other.getCoreDumpConfig() != null && other.getCoreDumpConfig().equals(this.getCoreDumpConfig()) == false)
            return false;
        if (other.getServerlessConfig() == null ^ this.getServerlessConfig() == null)
            return false;
        if (other.getServerlessConfig() != null && other.getServerlessConfig().equals(this.getServerlessConfig()) == false)
            return false;
        if (other.getVolumeSizeInGB() == null ^ this.getVolumeSizeInGB() == null)
            return false;
        if (other.getVolumeSizeInGB() != null && other.getVolumeSizeInGB().equals(this.getVolumeSizeInGB()) == false)
            return false;
        if (other.getModelDataDownloadTimeoutInSeconds() == null ^ this.getModelDataDownloadTimeoutInSeconds() == null)
            return false;
        if (other.getModelDataDownloadTimeoutInSeconds() != null
                && other.getModelDataDownloadTimeoutInSeconds().equals(this.getModelDataDownloadTimeoutInSeconds()) == false)
            return false;
        if (other.getContainerStartupHealthCheckTimeoutInSeconds() == null ^ this.getContainerStartupHealthCheckTimeoutInSeconds() == null)
            return false;
        if (other.getContainerStartupHealthCheckTimeoutInSeconds() != null
                && other.getContainerStartupHealthCheckTimeoutInSeconds().equals(this.getContainerStartupHealthCheckTimeoutInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariantName() == null) ? 0 : getVariantName().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getInitialInstanceCount() == null) ? 0 : getInitialInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInitialVariantWeight() == null) ? 0 : getInitialVariantWeight().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorType() == null) ? 0 : getAcceleratorType().hashCode());
        hashCode = prime * hashCode + ((getCoreDumpConfig() == null) ? 0 : getCoreDumpConfig().hashCode());
        hashCode = prime * hashCode + ((getServerlessConfig() == null) ? 0 : getServerlessConfig().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeInGB() == null) ? 0 : getVolumeSizeInGB().hashCode());
        hashCode = prime * hashCode + ((getModelDataDownloadTimeoutInSeconds() == null) ? 0 : getModelDataDownloadTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getContainerStartupHealthCheckTimeoutInSeconds() == null) ? 0 : getContainerStartupHealthCheckTimeoutInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public ProductionVariant clone() {
        try {
            return (ProductionVariant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProductionVariantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
