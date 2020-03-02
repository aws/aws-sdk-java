/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImagePipeline" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateImagePipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the image pipeline.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the image pipeline.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that will be used to configure images created by this image
     * pipeline.
     * </p>
     */
    private String imageRecipeArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that will be used to build images created by
     * this image pipeline.
     * </p>
     */
    private String infrastructureConfigurationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that will be used to configure and distribute
     * images created by this image pipeline.
     * </p>
     */
    private String distributionConfigurationArn;
    /**
     * <p>
     * The image test configuration of the image pipeline.
     * </p>
     */
    private ImageTestsConfiguration imageTestsConfiguration;
    /**
     * <p>
     * The schedule of the image pipeline.
     * </p>
     */
    private Schedule schedule;
    /**
     * <p>
     * The status of the image pipeline.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tags of the image pipeline.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the image pipeline.
     * </p>
     * 
     * @param name
     *        The name of the image pipeline.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the image pipeline.
     * </p>
     * 
     * @return The name of the image pipeline.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the image pipeline.
     * </p>
     * 
     * @param name
     *        The name of the image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImagePipelineRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the image pipeline.
     * </p>
     * 
     * @param description
     *        The description of the image pipeline.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the image pipeline.
     * </p>
     * 
     * @return The description of the image pipeline.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the image pipeline.
     * </p>
     * 
     * @param description
     *        The description of the image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImagePipelineRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that will be used to configure images created by this image
     * pipeline.
     * </p>
     * 
     * @param imageRecipeArn
     *        The Amazon Resource Name (ARN) of the image recipe that will be used to configure images created by this
     *        image pipeline.
     */

    public void setImageRecipeArn(String imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that will be used to configure images created by this image
     * pipeline.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image recipe that will be used to configure images created by this
     *         image pipeline.
     */

    public String getImageRecipeArn() {
        return this.imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that will be used to configure images created by this image
     * pipeline.
     * </p>
     * 
     * @param imageRecipeArn
     *        The Amazon Resource Name (ARN) of the image recipe that will be used to configure images created by this
     *        image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImagePipelineRequest withImageRecipeArn(String imageRecipeArn) {
        setImageRecipeArn(imageRecipeArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that will be used to build images created by
     * this image pipeline.
     * </p>
     * 
     * @param infrastructureConfigurationArn
     *        The Amazon Resource Name (ARN) of the infrastructure configuration that will be used to build images
     *        created by this image pipeline.
     */

    public void setInfrastructureConfigurationArn(String infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that will be used to build images created by
     * this image pipeline.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the infrastructure configuration that will be used to build images
     *         created by this image pipeline.
     */

    public String getInfrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that will be used to build images created by
     * this image pipeline.
     * </p>
     * 
     * @param infrastructureConfigurationArn
     *        The Amazon Resource Name (ARN) of the infrastructure configuration that will be used to build images
     *        created by this image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImagePipelineRequest withInfrastructureConfigurationArn(String infrastructureConfigurationArn) {
        setInfrastructureConfigurationArn(infrastructureConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that will be used to configure and distribute
     * images created by this image pipeline.
     * </p>
     * 
     * @param distributionConfigurationArn
     *        The Amazon Resource Name (ARN) of the distribution configuration that will be used to configure and
     *        distribute images created by this image pipeline.
     */

    public void setDistributionConfigurationArn(String distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that will be used to configure and distribute
     * images created by this image pipeline.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the distribution configuration that will be used to configure and
     *         distribute images created by this image pipeline.
     */

    public String getDistributionConfigurationArn() {
        return this.distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that will be used to configure and distribute
     * images created by this image pipeline.
     * </p>
     * 
     * @param distributionConfigurationArn
     *        The Amazon Resource Name (ARN) of the distribution configuration that will be used to configure and
     *        distribute images created by this image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImagePipelineRequest withDistributionConfigurationArn(String distributionConfigurationArn) {
        setDistributionConfigurationArn(distributionConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The image test configuration of the image pipeline.
     * </p>
     * 
     * @param imageTestsConfiguration
     *        The image test configuration of the image pipeline.
     */

    public void setImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
    }

    /**
     * <p>
     * The image test configuration of the image pipeline.
     * </p>
     * 
     * @return The image test configuration of the image pipeline.
     */

    public ImageTestsConfiguration getImageTestsConfiguration() {
        return this.imageTestsConfiguration;
    }

    /**
     * <p>
     * The image test configuration of the image pipeline.
     * </p>
     * 
     * @param imageTestsConfiguration
     *        The image test configuration of the image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImagePipelineRequest withImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
        setImageTestsConfiguration(imageTestsConfiguration);
        return this;
    }

    /**
     * <p>
     * The schedule of the image pipeline.
     * </p>
     * 
     * @param schedule
     *        The schedule of the image pipeline.
     */

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule of the image pipeline.
     * </p>
     * 
     * @return The schedule of the image pipeline.
     */

    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule of the image pipeline.
     * </p>
     * 
     * @param schedule
     *        The schedule of the image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImagePipelineRequest withSchedule(Schedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The status of the image pipeline.
     * </p>
     * 
     * @param status
     *        The status of the image pipeline.
     * @see PipelineStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the image pipeline.
     * </p>
     * 
     * @return The status of the image pipeline.
     * @see PipelineStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the image pipeline.
     * </p>
     * 
     * @param status
     *        The status of the image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineStatus
     */

    public CreateImagePipelineRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the image pipeline.
     * </p>
     * 
     * @param status
     *        The status of the image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineStatus
     */

    public CreateImagePipelineRequest withStatus(PipelineStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The tags of the image pipeline.
     * </p>
     * 
     * @return The tags of the image pipeline.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the image pipeline.
     * </p>
     * 
     * @param tags
     *        The tags of the image pipeline.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the image pipeline.
     * </p>
     * 
     * @param tags
     *        The tags of the image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImagePipelineRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateImagePipelineRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateImagePipelineRequest addTagsEntry(String key, String value) {
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

    public CreateImagePipelineRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token used to make this request idempotent.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * 
     * @return The idempotency token used to make this request idempotent.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token used to make this request idempotent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImagePipelineRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getImageRecipeArn() != null)
            sb.append("ImageRecipeArn: ").append(getImageRecipeArn()).append(",");
        if (getInfrastructureConfigurationArn() != null)
            sb.append("InfrastructureConfigurationArn: ").append(getInfrastructureConfigurationArn()).append(",");
        if (getDistributionConfigurationArn() != null)
            sb.append("DistributionConfigurationArn: ").append(getDistributionConfigurationArn()).append(",");
        if (getImageTestsConfiguration() != null)
            sb.append("ImageTestsConfiguration: ").append(getImageTestsConfiguration()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImagePipelineRequest == false)
            return false;
        CreateImagePipelineRequest other = (CreateImagePipelineRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getImageRecipeArn() == null ^ this.getImageRecipeArn() == null)
            return false;
        if (other.getImageRecipeArn() != null && other.getImageRecipeArn().equals(this.getImageRecipeArn()) == false)
            return false;
        if (other.getInfrastructureConfigurationArn() == null ^ this.getInfrastructureConfigurationArn() == null)
            return false;
        if (other.getInfrastructureConfigurationArn() != null
                && other.getInfrastructureConfigurationArn().equals(this.getInfrastructureConfigurationArn()) == false)
            return false;
        if (other.getDistributionConfigurationArn() == null ^ this.getDistributionConfigurationArn() == null)
            return false;
        if (other.getDistributionConfigurationArn() != null && other.getDistributionConfigurationArn().equals(this.getDistributionConfigurationArn()) == false)
            return false;
        if (other.getImageTestsConfiguration() == null ^ this.getImageTestsConfiguration() == null)
            return false;
        if (other.getImageTestsConfiguration() != null && other.getImageTestsConfiguration().equals(this.getImageTestsConfiguration()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getImageRecipeArn() == null) ? 0 : getImageRecipeArn().hashCode());
        hashCode = prime * hashCode + ((getInfrastructureConfigurationArn() == null) ? 0 : getInfrastructureConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getDistributionConfigurationArn() == null) ? 0 : getDistributionConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getImageTestsConfiguration() == null) ? 0 : getImageTestsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateImagePipelineRequest clone() {
        return (CreateImagePipelineRequest) super.clone();
    }

}
