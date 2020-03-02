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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of an image pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImagePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImagePipeline implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline.
     * </p>
     */
    private String arn;
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
     * The platform of the image pipeline.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
     * </p>
     */
    private String imageRecipeArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image pipeline.
     * </p>
     */
    private String infrastructureConfigurationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration associated with this image pipeline.
     * </p>
     */
    private String distributionConfigurationArn;
    /**
     * <p>
     * The image tests configuration of the image pipeline.
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
     * The date on which this image pipeline was created.
     * </p>
     */
    private String dateCreated;
    /**
     * <p>
     * The date on which this image pipeline was last updated.
     * </p>
     */
    private String dateUpdated;
    /**
     * <p>
     * The date on which this image pipeline was last run.
     * </p>
     */
    private String dateLastRun;
    /**
     * <p>
     * The date on which this image pipeline will next be run.
     * </p>
     */
    private String dateNextRun;
    /**
     * <p>
     * The tags of this image pipeline.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the image pipeline.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image pipeline.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePipeline withArn(String arn) {
        setArn(arn);
        return this;
    }

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

    public ImagePipeline withName(String name) {
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

    public ImagePipeline withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The platform of the image pipeline.
     * </p>
     * 
     * @param platform
     *        The platform of the image pipeline.
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the image pipeline.
     * </p>
     * 
     * @return The platform of the image pipeline.
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the image pipeline.
     * </p>
     * 
     * @param platform
     *        The platform of the image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ImagePipeline withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform of the image pipeline.
     * </p>
     * 
     * @param platform
     *        The platform of the image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ImagePipeline withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
     * </p>
     * 
     * @param imageRecipeArn
     *        The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
     */

    public void setImageRecipeArn(String imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
     */

    public String getImageRecipeArn() {
        return this.imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
     * </p>
     * 
     * @param imageRecipeArn
     *        The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePipeline withImageRecipeArn(String imageRecipeArn) {
        setImageRecipeArn(imageRecipeArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image pipeline.
     * </p>
     * 
     * @param infrastructureConfigurationArn
     *        The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image pipeline.
     */

    public void setInfrastructureConfigurationArn(String infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image pipeline.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image pipeline.
     */

    public String getInfrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image pipeline.
     * </p>
     * 
     * @param infrastructureConfigurationArn
     *        The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePipeline withInfrastructureConfigurationArn(String infrastructureConfigurationArn) {
        setInfrastructureConfigurationArn(infrastructureConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration associated with this image pipeline.
     * </p>
     * 
     * @param distributionConfigurationArn
     *        The Amazon Resource Name (ARN) of the distribution configuration associated with this image pipeline.
     */

    public void setDistributionConfigurationArn(String distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration associated with this image pipeline.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the distribution configuration associated with this image pipeline.
     */

    public String getDistributionConfigurationArn() {
        return this.distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration associated with this image pipeline.
     * </p>
     * 
     * @param distributionConfigurationArn
     *        The Amazon Resource Name (ARN) of the distribution configuration associated with this image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePipeline withDistributionConfigurationArn(String distributionConfigurationArn) {
        setDistributionConfigurationArn(distributionConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The image tests configuration of the image pipeline.
     * </p>
     * 
     * @param imageTestsConfiguration
     *        The image tests configuration of the image pipeline.
     */

    public void setImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
    }

    /**
     * <p>
     * The image tests configuration of the image pipeline.
     * </p>
     * 
     * @return The image tests configuration of the image pipeline.
     */

    public ImageTestsConfiguration getImageTestsConfiguration() {
        return this.imageTestsConfiguration;
    }

    /**
     * <p>
     * The image tests configuration of the image pipeline.
     * </p>
     * 
     * @param imageTestsConfiguration
     *        The image tests configuration of the image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePipeline withImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
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

    public ImagePipeline withSchedule(Schedule schedule) {
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

    public ImagePipeline withStatus(String status) {
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

    public ImagePipeline withStatus(PipelineStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date on which this image pipeline was created.
     * </p>
     * 
     * @param dateCreated
     *        The date on which this image pipeline was created.
     */

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date on which this image pipeline was created.
     * </p>
     * 
     * @return The date on which this image pipeline was created.
     */

    public String getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date on which this image pipeline was created.
     * </p>
     * 
     * @param dateCreated
     *        The date on which this image pipeline was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePipeline withDateCreated(String dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The date on which this image pipeline was last updated.
     * </p>
     * 
     * @param dateUpdated
     *        The date on which this image pipeline was last updated.
     */

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The date on which this image pipeline was last updated.
     * </p>
     * 
     * @return The date on which this image pipeline was last updated.
     */

    public String getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * <p>
     * The date on which this image pipeline was last updated.
     * </p>
     * 
     * @param dateUpdated
     *        The date on which this image pipeline was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePipeline withDateUpdated(String dateUpdated) {
        setDateUpdated(dateUpdated);
        return this;
    }

    /**
     * <p>
     * The date on which this image pipeline was last run.
     * </p>
     * 
     * @param dateLastRun
     *        The date on which this image pipeline was last run.
     */

    public void setDateLastRun(String dateLastRun) {
        this.dateLastRun = dateLastRun;
    }

    /**
     * <p>
     * The date on which this image pipeline was last run.
     * </p>
     * 
     * @return The date on which this image pipeline was last run.
     */

    public String getDateLastRun() {
        return this.dateLastRun;
    }

    /**
     * <p>
     * The date on which this image pipeline was last run.
     * </p>
     * 
     * @param dateLastRun
     *        The date on which this image pipeline was last run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePipeline withDateLastRun(String dateLastRun) {
        setDateLastRun(dateLastRun);
        return this;
    }

    /**
     * <p>
     * The date on which this image pipeline will next be run.
     * </p>
     * 
     * @param dateNextRun
     *        The date on which this image pipeline will next be run.
     */

    public void setDateNextRun(String dateNextRun) {
        this.dateNextRun = dateNextRun;
    }

    /**
     * <p>
     * The date on which this image pipeline will next be run.
     * </p>
     * 
     * @return The date on which this image pipeline will next be run.
     */

    public String getDateNextRun() {
        return this.dateNextRun;
    }

    /**
     * <p>
     * The date on which this image pipeline will next be run.
     * </p>
     * 
     * @param dateNextRun
     *        The date on which this image pipeline will next be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePipeline withDateNextRun(String dateNextRun) {
        setDateNextRun(dateNextRun);
        return this;
    }

    /**
     * <p>
     * The tags of this image pipeline.
     * </p>
     * 
     * @return The tags of this image pipeline.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of this image pipeline.
     * </p>
     * 
     * @param tags
     *        The tags of this image pipeline.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of this image pipeline.
     * </p>
     * 
     * @param tags
     *        The tags of this image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePipeline withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ImagePipeline#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ImagePipeline addTagsEntry(String key, String value) {
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

    public ImagePipeline clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
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
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: ").append(getDateUpdated()).append(",");
        if (getDateLastRun() != null)
            sb.append("DateLastRun: ").append(getDateLastRun()).append(",");
        if (getDateNextRun() != null)
            sb.append("DateNextRun: ").append(getDateNextRun()).append(",");
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

        if (obj instanceof ImagePipeline == false)
            return false;
        ImagePipeline other = (ImagePipeline) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
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
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null)
            return false;
        if (other.getDateUpdated() != null && other.getDateUpdated().equals(this.getDateUpdated()) == false)
            return false;
        if (other.getDateLastRun() == null ^ this.getDateLastRun() == null)
            return false;
        if (other.getDateLastRun() != null && other.getDateLastRun().equals(this.getDateLastRun()) == false)
            return false;
        if (other.getDateNextRun() == null ^ this.getDateNextRun() == null)
            return false;
        if (other.getDateNextRun() != null && other.getDateNextRun().equals(this.getDateNextRun()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getImageRecipeArn() == null) ? 0 : getImageRecipeArn().hashCode());
        hashCode = prime * hashCode + ((getInfrastructureConfigurationArn() == null) ? 0 : getInfrastructureConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getDistributionConfigurationArn() == null) ? 0 : getDistributionConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getImageTestsConfiguration() == null) ? 0 : getImageTestsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode + ((getDateLastRun() == null) ? 0 : getDateLastRun().hashCode());
        hashCode = prime * hashCode + ((getDateNextRun() == null) ? 0 : getDateNextRun().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ImagePipeline clone() {
        try {
            return (ImagePipeline) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ImagePipelineMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
