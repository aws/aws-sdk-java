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
 * An image build version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/Image" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Image implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the image.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The semantic version of the image.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The platform of the image.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The state of the image.
     * </p>
     */
    private ImageState state;
    /**
     * <p>
     * The image recipe used when creating the image.
     * </p>
     */
    private ImageRecipe imageRecipe;
    /**
     * <p>
     * The name of the image pipeline that created this image.
     * </p>
     */
    private String sourcePipelineName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that created this image.
     * </p>
     */
    private String sourcePipelineArn;
    /**
     * <p>
     * The infrastructure used when creating this image.
     * </p>
     */
    private InfrastructureConfiguration infrastructureConfiguration;
    /**
     * <p>
     * The distribution configuration used when creating this image.
     * </p>
     */
    private DistributionConfiguration distributionConfiguration;
    /**
     * <p>
     * The image tests configuration used when creating this image.
     * </p>
     */
    private ImageTestsConfiguration imageTestsConfiguration;
    /**
     * <p>
     * The date on which this image was created.
     * </p>
     */
    private String dateCreated;
    /**
     * <p>
     * The output resources produced when creating this image.
     * </p>
     */
    private OutputResources outputResources;
    /**
     * <p>
     * The tags of the image.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the image.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param name
     *        The name of the image.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @return The name of the image.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param name
     *        The name of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The semantic version of the image.
     * </p>
     * 
     * @param version
     *        The semantic version of the image.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The semantic version of the image.
     * </p>
     * 
     * @return The semantic version of the image.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The semantic version of the image.
     * </p>
     * 
     * @param version
     *        The semantic version of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The platform of the image.
     * </p>
     * 
     * @param platform
     *        The platform of the image.
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the image.
     * </p>
     * 
     * @return The platform of the image.
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the image.
     * </p>
     * 
     * @param platform
     *        The platform of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public Image withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform of the image.
     * </p>
     * 
     * @param platform
     *        The platform of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public Image withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The state of the image.
     * </p>
     * 
     * @param state
     *        The state of the image.
     */

    public void setState(ImageState state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the image.
     * </p>
     * 
     * @return The state of the image.
     */

    public ImageState getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the image.
     * </p>
     * 
     * @param state
     *        The state of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withState(ImageState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The image recipe used when creating the image.
     * </p>
     * 
     * @param imageRecipe
     *        The image recipe used when creating the image.
     */

    public void setImageRecipe(ImageRecipe imageRecipe) {
        this.imageRecipe = imageRecipe;
    }

    /**
     * <p>
     * The image recipe used when creating the image.
     * </p>
     * 
     * @return The image recipe used when creating the image.
     */

    public ImageRecipe getImageRecipe() {
        return this.imageRecipe;
    }

    /**
     * <p>
     * The image recipe used when creating the image.
     * </p>
     * 
     * @param imageRecipe
     *        The image recipe used when creating the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withImageRecipe(ImageRecipe imageRecipe) {
        setImageRecipe(imageRecipe);
        return this;
    }

    /**
     * <p>
     * The name of the image pipeline that created this image.
     * </p>
     * 
     * @param sourcePipelineName
     *        The name of the image pipeline that created this image.
     */

    public void setSourcePipelineName(String sourcePipelineName) {
        this.sourcePipelineName = sourcePipelineName;
    }

    /**
     * <p>
     * The name of the image pipeline that created this image.
     * </p>
     * 
     * @return The name of the image pipeline that created this image.
     */

    public String getSourcePipelineName() {
        return this.sourcePipelineName;
    }

    /**
     * <p>
     * The name of the image pipeline that created this image.
     * </p>
     * 
     * @param sourcePipelineName
     *        The name of the image pipeline that created this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withSourcePipelineName(String sourcePipelineName) {
        setSourcePipelineName(sourcePipelineName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that created this image.
     * </p>
     * 
     * @param sourcePipelineArn
     *        The Amazon Resource Name (ARN) of the image pipeline that created this image.
     */

    public void setSourcePipelineArn(String sourcePipelineArn) {
        this.sourcePipelineArn = sourcePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that created this image.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image pipeline that created this image.
     */

    public String getSourcePipelineArn() {
        return this.sourcePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that created this image.
     * </p>
     * 
     * @param sourcePipelineArn
     *        The Amazon Resource Name (ARN) of the image pipeline that created this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withSourcePipelineArn(String sourcePipelineArn) {
        setSourcePipelineArn(sourcePipelineArn);
        return this;
    }

    /**
     * <p>
     * The infrastructure used when creating this image.
     * </p>
     * 
     * @param infrastructureConfiguration
     *        The infrastructure used when creating this image.
     */

    public void setInfrastructureConfiguration(InfrastructureConfiguration infrastructureConfiguration) {
        this.infrastructureConfiguration = infrastructureConfiguration;
    }

    /**
     * <p>
     * The infrastructure used when creating this image.
     * </p>
     * 
     * @return The infrastructure used when creating this image.
     */

    public InfrastructureConfiguration getInfrastructureConfiguration() {
        return this.infrastructureConfiguration;
    }

    /**
     * <p>
     * The infrastructure used when creating this image.
     * </p>
     * 
     * @param infrastructureConfiguration
     *        The infrastructure used when creating this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withInfrastructureConfiguration(InfrastructureConfiguration infrastructureConfiguration) {
        setInfrastructureConfiguration(infrastructureConfiguration);
        return this;
    }

    /**
     * <p>
     * The distribution configuration used when creating this image.
     * </p>
     * 
     * @param distributionConfiguration
     *        The distribution configuration used when creating this image.
     */

    public void setDistributionConfiguration(DistributionConfiguration distributionConfiguration) {
        this.distributionConfiguration = distributionConfiguration;
    }

    /**
     * <p>
     * The distribution configuration used when creating this image.
     * </p>
     * 
     * @return The distribution configuration used when creating this image.
     */

    public DistributionConfiguration getDistributionConfiguration() {
        return this.distributionConfiguration;
    }

    /**
     * <p>
     * The distribution configuration used when creating this image.
     * </p>
     * 
     * @param distributionConfiguration
     *        The distribution configuration used when creating this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withDistributionConfiguration(DistributionConfiguration distributionConfiguration) {
        setDistributionConfiguration(distributionConfiguration);
        return this;
    }

    /**
     * <p>
     * The image tests configuration used when creating this image.
     * </p>
     * 
     * @param imageTestsConfiguration
     *        The image tests configuration used when creating this image.
     */

    public void setImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
    }

    /**
     * <p>
     * The image tests configuration used when creating this image.
     * </p>
     * 
     * @return The image tests configuration used when creating this image.
     */

    public ImageTestsConfiguration getImageTestsConfiguration() {
        return this.imageTestsConfiguration;
    }

    /**
     * <p>
     * The image tests configuration used when creating this image.
     * </p>
     * 
     * @param imageTestsConfiguration
     *        The image tests configuration used when creating this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
        setImageTestsConfiguration(imageTestsConfiguration);
        return this;
    }

    /**
     * <p>
     * The date on which this image was created.
     * </p>
     * 
     * @param dateCreated
     *        The date on which this image was created.
     */

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date on which this image was created.
     * </p>
     * 
     * @return The date on which this image was created.
     */

    public String getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date on which this image was created.
     * </p>
     * 
     * @param dateCreated
     *        The date on which this image was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withDateCreated(String dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The output resources produced when creating this image.
     * </p>
     * 
     * @param outputResources
     *        The output resources produced when creating this image.
     */

    public void setOutputResources(OutputResources outputResources) {
        this.outputResources = outputResources;
    }

    /**
     * <p>
     * The output resources produced when creating this image.
     * </p>
     * 
     * @return The output resources produced when creating this image.
     */

    public OutputResources getOutputResources() {
        return this.outputResources;
    }

    /**
     * <p>
     * The output resources produced when creating this image.
     * </p>
     * 
     * @param outputResources
     *        The output resources produced when creating this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withOutputResources(OutputResources outputResources) {
        setOutputResources(outputResources);
        return this;
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

    public Image withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Image#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Image addTagsEntry(String key, String value) {
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

    public Image clearTagsEntries() {
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getImageRecipe() != null)
            sb.append("ImageRecipe: ").append(getImageRecipe()).append(",");
        if (getSourcePipelineName() != null)
            sb.append("SourcePipelineName: ").append(getSourcePipelineName()).append(",");
        if (getSourcePipelineArn() != null)
            sb.append("SourcePipelineArn: ").append(getSourcePipelineArn()).append(",");
        if (getInfrastructureConfiguration() != null)
            sb.append("InfrastructureConfiguration: ").append(getInfrastructureConfiguration()).append(",");
        if (getDistributionConfiguration() != null)
            sb.append("DistributionConfiguration: ").append(getDistributionConfiguration()).append(",");
        if (getImageTestsConfiguration() != null)
            sb.append("ImageTestsConfiguration: ").append(getImageTestsConfiguration()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getOutputResources() != null)
            sb.append("OutputResources: ").append(getOutputResources()).append(",");
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

        if (obj instanceof Image == false)
            return false;
        Image other = (Image) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getImageRecipe() == null ^ this.getImageRecipe() == null)
            return false;
        if (other.getImageRecipe() != null && other.getImageRecipe().equals(this.getImageRecipe()) == false)
            return false;
        if (other.getSourcePipelineName() == null ^ this.getSourcePipelineName() == null)
            return false;
        if (other.getSourcePipelineName() != null && other.getSourcePipelineName().equals(this.getSourcePipelineName()) == false)
            return false;
        if (other.getSourcePipelineArn() == null ^ this.getSourcePipelineArn() == null)
            return false;
        if (other.getSourcePipelineArn() != null && other.getSourcePipelineArn().equals(this.getSourcePipelineArn()) == false)
            return false;
        if (other.getInfrastructureConfiguration() == null ^ this.getInfrastructureConfiguration() == null)
            return false;
        if (other.getInfrastructureConfiguration() != null && other.getInfrastructureConfiguration().equals(this.getInfrastructureConfiguration()) == false)
            return false;
        if (other.getDistributionConfiguration() == null ^ this.getDistributionConfiguration() == null)
            return false;
        if (other.getDistributionConfiguration() != null && other.getDistributionConfiguration().equals(this.getDistributionConfiguration()) == false)
            return false;
        if (other.getImageTestsConfiguration() == null ^ this.getImageTestsConfiguration() == null)
            return false;
        if (other.getImageTestsConfiguration() != null && other.getImageTestsConfiguration().equals(this.getImageTestsConfiguration()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getOutputResources() == null ^ this.getOutputResources() == null)
            return false;
        if (other.getOutputResources() != null && other.getOutputResources().equals(this.getOutputResources()) == false)
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
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getImageRecipe() == null) ? 0 : getImageRecipe().hashCode());
        hashCode = prime * hashCode + ((getSourcePipelineName() == null) ? 0 : getSourcePipelineName().hashCode());
        hashCode = prime * hashCode + ((getSourcePipelineArn() == null) ? 0 : getSourcePipelineArn().hashCode());
        hashCode = prime * hashCode + ((getInfrastructureConfiguration() == null) ? 0 : getInfrastructureConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDistributionConfiguration() == null) ? 0 : getDistributionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getImageTestsConfiguration() == null) ? 0 : getImageTestsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getOutputResources() == null) ? 0 : getOutputResources().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Image clone() {
        try {
            return (Image) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
