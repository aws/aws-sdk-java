/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested, and assessed.
     * </p>
     */
    private String imageRecipeArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured and tested.
     * </p>
     */
    private String containerRecipeArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that defines and configures the outputs of your
     * pipeline.
     * </p>
     */
    private String distributionConfigurationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that defines the environment in which your
     * image will be built and tested.
     * </p>
     */
    private String infrastructureConfigurationArn;
    /**
     * <p>
     * The image tests configuration of the image.
     * </p>
     */
    private ImageTestsConfiguration imageTestsConfiguration;
    /**
     * <p>
     * Collects additional information about the image being created, including the operating system (OS) version and
     * package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by
     * default.
     * </p>
     */
    private Boolean enhancedImageMetadataEnabled;
    /**
     * <p>
     * The tags of the image.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Contains settings for vulnerability scans.
     * </p>
     */
    private ImageScanningConfiguration imageScanningConfiguration;
    /**
     * <p>
     * Contains an array of workflow configuration objects.
     * </p>
     */
    private java.util.List<WorkflowConfiguration> workflows;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder access to perform
     * workflow actions.
     * </p>
     */
    private String executionRole;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested, and assessed.
     * </p>
     * 
     * @param imageRecipeArn
     *        The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested, and
     *        assessed.
     */

    public void setImageRecipeArn(String imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested, and assessed.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested, and
     *         assessed.
     */

    public String getImageRecipeArn() {
        return this.imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested, and assessed.
     * </p>
     * 
     * @param imageRecipeArn
     *        The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested, and
     *        assessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withImageRecipeArn(String imageRecipeArn) {
        setImageRecipeArn(imageRecipeArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured and tested.
     * </p>
     * 
     * @param containerRecipeArn
     *        The Amazon Resource Name (ARN) of the container recipe that defines how images are configured and tested.
     */

    public void setContainerRecipeArn(String containerRecipeArn) {
        this.containerRecipeArn = containerRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured and tested.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container recipe that defines how images are configured and tested.
     */

    public String getContainerRecipeArn() {
        return this.containerRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured and tested.
     * </p>
     * 
     * @param containerRecipeArn
     *        The Amazon Resource Name (ARN) of the container recipe that defines how images are configured and tested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withContainerRecipeArn(String containerRecipeArn) {
        setContainerRecipeArn(containerRecipeArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that defines and configures the outputs of your
     * pipeline.
     * </p>
     * 
     * @param distributionConfigurationArn
     *        The Amazon Resource Name (ARN) of the distribution configuration that defines and configures the outputs
     *        of your pipeline.
     */

    public void setDistributionConfigurationArn(String distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that defines and configures the outputs of your
     * pipeline.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the distribution configuration that defines and configures the outputs
     *         of your pipeline.
     */

    public String getDistributionConfigurationArn() {
        return this.distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that defines and configures the outputs of your
     * pipeline.
     * </p>
     * 
     * @param distributionConfigurationArn
     *        The Amazon Resource Name (ARN) of the distribution configuration that defines and configures the outputs
     *        of your pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withDistributionConfigurationArn(String distributionConfigurationArn) {
        setDistributionConfigurationArn(distributionConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that defines the environment in which your
     * image will be built and tested.
     * </p>
     * 
     * @param infrastructureConfigurationArn
     *        The Amazon Resource Name (ARN) of the infrastructure configuration that defines the environment in which
     *        your image will be built and tested.
     */

    public void setInfrastructureConfigurationArn(String infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that defines the environment in which your
     * image will be built and tested.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the infrastructure configuration that defines the environment in which
     *         your image will be built and tested.
     */

    public String getInfrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that defines the environment in which your
     * image will be built and tested.
     * </p>
     * 
     * @param infrastructureConfigurationArn
     *        The Amazon Resource Name (ARN) of the infrastructure configuration that defines the environment in which
     *        your image will be built and tested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withInfrastructureConfigurationArn(String infrastructureConfigurationArn) {
        setInfrastructureConfigurationArn(infrastructureConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The image tests configuration of the image.
     * </p>
     * 
     * @param imageTestsConfiguration
     *        The image tests configuration of the image.
     */

    public void setImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
    }

    /**
     * <p>
     * The image tests configuration of the image.
     * </p>
     * 
     * @return The image tests configuration of the image.
     */

    public ImageTestsConfiguration getImageTestsConfiguration() {
        return this.imageTestsConfiguration;
    }

    /**
     * <p>
     * The image tests configuration of the image.
     * </p>
     * 
     * @param imageTestsConfiguration
     *        The image tests configuration of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
        setImageTestsConfiguration(imageTestsConfiguration);
        return this;
    }

    /**
     * <p>
     * Collects additional information about the image being created, including the operating system (OS) version and
     * package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by
     * default.
     * </p>
     * 
     * @param enhancedImageMetadataEnabled
     *        Collects additional information about the image being created, including the operating system (OS) version
     *        and package list. This information is used to enhance the overall experience of using EC2 Image Builder.
     *        Enabled by default.
     */

    public void setEnhancedImageMetadataEnabled(Boolean enhancedImageMetadataEnabled) {
        this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
    }

    /**
     * <p>
     * Collects additional information about the image being created, including the operating system (OS) version and
     * package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by
     * default.
     * </p>
     * 
     * @return Collects additional information about the image being created, including the operating system (OS)
     *         version and package list. This information is used to enhance the overall experience of using EC2 Image
     *         Builder. Enabled by default.
     */

    public Boolean getEnhancedImageMetadataEnabled() {
        return this.enhancedImageMetadataEnabled;
    }

    /**
     * <p>
     * Collects additional information about the image being created, including the operating system (OS) version and
     * package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by
     * default.
     * </p>
     * 
     * @param enhancedImageMetadataEnabled
     *        Collects additional information about the image being created, including the operating system (OS) version
     *        and package list. This information is used to enhance the overall experience of using EC2 Image Builder.
     *        Enabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withEnhancedImageMetadataEnabled(Boolean enhancedImageMetadataEnabled) {
        setEnhancedImageMetadataEnabled(enhancedImageMetadataEnabled);
        return this;
    }

    /**
     * <p>
     * Collects additional information about the image being created, including the operating system (OS) version and
     * package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by
     * default.
     * </p>
     * 
     * @return Collects additional information about the image being created, including the operating system (OS)
     *         version and package list. This information is used to enhance the overall experience of using EC2 Image
     *         Builder. Enabled by default.
     */

    public Boolean isEnhancedImageMetadataEnabled() {
        return this.enhancedImageMetadataEnabled;
    }

    /**
     * <p>
     * The tags of the image.
     * </p>
     * 
     * @return The tags of the image.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the image.
     * </p>
     * 
     * @param tags
     *        The tags of the image.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the image.
     * </p>
     * 
     * @param tags
     *        The tags of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateImageRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *         see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Contains settings for vulnerability scans.
     * </p>
     * 
     * @param imageScanningConfiguration
     *        Contains settings for vulnerability scans.
     */

    public void setImageScanningConfiguration(ImageScanningConfiguration imageScanningConfiguration) {
        this.imageScanningConfiguration = imageScanningConfiguration;
    }

    /**
     * <p>
     * Contains settings for vulnerability scans.
     * </p>
     * 
     * @return Contains settings for vulnerability scans.
     */

    public ImageScanningConfiguration getImageScanningConfiguration() {
        return this.imageScanningConfiguration;
    }

    /**
     * <p>
     * Contains settings for vulnerability scans.
     * </p>
     * 
     * @param imageScanningConfiguration
     *        Contains settings for vulnerability scans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withImageScanningConfiguration(ImageScanningConfiguration imageScanningConfiguration) {
        setImageScanningConfiguration(imageScanningConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains an array of workflow configuration objects.
     * </p>
     * 
     * @return Contains an array of workflow configuration objects.
     */

    public java.util.List<WorkflowConfiguration> getWorkflows() {
        return workflows;
    }

    /**
     * <p>
     * Contains an array of workflow configuration objects.
     * </p>
     * 
     * @param workflows
     *        Contains an array of workflow configuration objects.
     */

    public void setWorkflows(java.util.Collection<WorkflowConfiguration> workflows) {
        if (workflows == null) {
            this.workflows = null;
            return;
        }

        this.workflows = new java.util.ArrayList<WorkflowConfiguration>(workflows);
    }

    /**
     * <p>
     * Contains an array of workflow configuration objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkflows(java.util.Collection)} or {@link #withWorkflows(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workflows
     *        Contains an array of workflow configuration objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withWorkflows(WorkflowConfiguration... workflows) {
        if (this.workflows == null) {
            setWorkflows(new java.util.ArrayList<WorkflowConfiguration>(workflows.length));
        }
        for (WorkflowConfiguration ele : workflows) {
            this.workflows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains an array of workflow configuration objects.
     * </p>
     * 
     * @param workflows
     *        Contains an array of workflow configuration objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withWorkflows(java.util.Collection<WorkflowConfiguration> workflows) {
        setWorkflows(workflows);
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder access to perform
     * workflow actions.
     * </p>
     * 
     * @param executionRole
     *        The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder access to
     *        perform workflow actions.
     */

    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder access to perform
     * workflow actions.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder access to
     *         perform workflow actions.
     */

    public String getExecutionRole() {
        return this.executionRole;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder access to perform
     * workflow actions.
     * </p>
     * 
     * @param executionRole
     *        The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder access to
     *        perform workflow actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withExecutionRole(String executionRole) {
        setExecutionRole(executionRole);
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
        if (getImageRecipeArn() != null)
            sb.append("ImageRecipeArn: ").append(getImageRecipeArn()).append(",");
        if (getContainerRecipeArn() != null)
            sb.append("ContainerRecipeArn: ").append(getContainerRecipeArn()).append(",");
        if (getDistributionConfigurationArn() != null)
            sb.append("DistributionConfigurationArn: ").append(getDistributionConfigurationArn()).append(",");
        if (getInfrastructureConfigurationArn() != null)
            sb.append("InfrastructureConfigurationArn: ").append(getInfrastructureConfigurationArn()).append(",");
        if (getImageTestsConfiguration() != null)
            sb.append("ImageTestsConfiguration: ").append(getImageTestsConfiguration()).append(",");
        if (getEnhancedImageMetadataEnabled() != null)
            sb.append("EnhancedImageMetadataEnabled: ").append(getEnhancedImageMetadataEnabled()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getImageScanningConfiguration() != null)
            sb.append("ImageScanningConfiguration: ").append(getImageScanningConfiguration()).append(",");
        if (getWorkflows() != null)
            sb.append("Workflows: ").append(getWorkflows()).append(",");
        if (getExecutionRole() != null)
            sb.append("ExecutionRole: ").append(getExecutionRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImageRequest == false)
            return false;
        CreateImageRequest other = (CreateImageRequest) obj;
        if (other.getImageRecipeArn() == null ^ this.getImageRecipeArn() == null)
            return false;
        if (other.getImageRecipeArn() != null && other.getImageRecipeArn().equals(this.getImageRecipeArn()) == false)
            return false;
        if (other.getContainerRecipeArn() == null ^ this.getContainerRecipeArn() == null)
            return false;
        if (other.getContainerRecipeArn() != null && other.getContainerRecipeArn().equals(this.getContainerRecipeArn()) == false)
            return false;
        if (other.getDistributionConfigurationArn() == null ^ this.getDistributionConfigurationArn() == null)
            return false;
        if (other.getDistributionConfigurationArn() != null && other.getDistributionConfigurationArn().equals(this.getDistributionConfigurationArn()) == false)
            return false;
        if (other.getInfrastructureConfigurationArn() == null ^ this.getInfrastructureConfigurationArn() == null)
            return false;
        if (other.getInfrastructureConfigurationArn() != null
                && other.getInfrastructureConfigurationArn().equals(this.getInfrastructureConfigurationArn()) == false)
            return false;
        if (other.getImageTestsConfiguration() == null ^ this.getImageTestsConfiguration() == null)
            return false;
        if (other.getImageTestsConfiguration() != null && other.getImageTestsConfiguration().equals(this.getImageTestsConfiguration()) == false)
            return false;
        if (other.getEnhancedImageMetadataEnabled() == null ^ this.getEnhancedImageMetadataEnabled() == null)
            return false;
        if (other.getEnhancedImageMetadataEnabled() != null && other.getEnhancedImageMetadataEnabled().equals(this.getEnhancedImageMetadataEnabled()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getImageScanningConfiguration() == null ^ this.getImageScanningConfiguration() == null)
            return false;
        if (other.getImageScanningConfiguration() != null && other.getImageScanningConfiguration().equals(this.getImageScanningConfiguration()) == false)
            return false;
        if (other.getWorkflows() == null ^ this.getWorkflows() == null)
            return false;
        if (other.getWorkflows() != null && other.getWorkflows().equals(this.getWorkflows()) == false)
            return false;
        if (other.getExecutionRole() == null ^ this.getExecutionRole() == null)
            return false;
        if (other.getExecutionRole() != null && other.getExecutionRole().equals(this.getExecutionRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageRecipeArn() == null) ? 0 : getImageRecipeArn().hashCode());
        hashCode = prime * hashCode + ((getContainerRecipeArn() == null) ? 0 : getContainerRecipeArn().hashCode());
        hashCode = prime * hashCode + ((getDistributionConfigurationArn() == null) ? 0 : getDistributionConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getInfrastructureConfigurationArn() == null) ? 0 : getInfrastructureConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getImageTestsConfiguration() == null) ? 0 : getImageTestsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEnhancedImageMetadataEnabled() == null) ? 0 : getEnhancedImageMetadataEnabled().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getImageScanningConfiguration() == null) ? 0 : getImageScanningConfiguration().hashCode());
        hashCode = prime * hashCode + ((getWorkflows() == null) ? 0 : getWorkflows().hashCode());
        hashCode = prime * hashCode + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        return hashCode;
    }

    @Override
    public CreateImageRequest clone() {
        return (CreateImageRequest) super.clone();
    }

}
