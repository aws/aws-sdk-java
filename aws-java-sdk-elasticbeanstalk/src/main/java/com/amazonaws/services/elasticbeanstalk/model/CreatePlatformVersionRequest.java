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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to create a new platform version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreatePlatformVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePlatformVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your custom platform.
     * </p>
     */
    private String platformName;
    /**
     * <p>
     * The number, such as 1.0.2, for the new platform version.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * The location of the platform definition archive in Amazon S3.
     * </p>
     */
    private S3Location platformDefinitionBundle;
    /**
     * <p>
     * The name of the builder environment.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The configuration option settings to apply to the builder environment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting> optionSettings;
    /**
     * <p>
     * Specifies the tags applied to the new platform version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the platform version. Environments that you create using the
     * platform version don't inherit the tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of your custom platform.
     * </p>
     * 
     * @param platformName
     *        The name of your custom platform.
     */

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    /**
     * <p>
     * The name of your custom platform.
     * </p>
     * 
     * @return The name of your custom platform.
     */

    public String getPlatformName() {
        return this.platformName;
    }

    /**
     * <p>
     * The name of your custom platform.
     * </p>
     * 
     * @param platformName
     *        The name of your custom platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlatformVersionRequest withPlatformName(String platformName) {
        setPlatformName(platformName);
        return this;
    }

    /**
     * <p>
     * The number, such as 1.0.2, for the new platform version.
     * </p>
     * 
     * @param platformVersion
     *        The number, such as 1.0.2, for the new platform version.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The number, such as 1.0.2, for the new platform version.
     * </p>
     * 
     * @return The number, such as 1.0.2, for the new platform version.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The number, such as 1.0.2, for the new platform version.
     * </p>
     * 
     * @param platformVersion
     *        The number, such as 1.0.2, for the new platform version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlatformVersionRequest withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * The location of the platform definition archive in Amazon S3.
     * </p>
     * 
     * @param platformDefinitionBundle
     *        The location of the platform definition archive in Amazon S3.
     */

    public void setPlatformDefinitionBundle(S3Location platformDefinitionBundle) {
        this.platformDefinitionBundle = platformDefinitionBundle;
    }

    /**
     * <p>
     * The location of the platform definition archive in Amazon S3.
     * </p>
     * 
     * @return The location of the platform definition archive in Amazon S3.
     */

    public S3Location getPlatformDefinitionBundle() {
        return this.platformDefinitionBundle;
    }

    /**
     * <p>
     * The location of the platform definition archive in Amazon S3.
     * </p>
     * 
     * @param platformDefinitionBundle
     *        The location of the platform definition archive in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlatformVersionRequest withPlatformDefinitionBundle(S3Location platformDefinitionBundle) {
        setPlatformDefinitionBundle(platformDefinitionBundle);
        return this;
    }

    /**
     * <p>
     * The name of the builder environment.
     * </p>
     * 
     * @param environmentName
     *        The name of the builder environment.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the builder environment.
     * </p>
     * 
     * @return The name of the builder environment.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the builder environment.
     * </p>
     * 
     * @param environmentName
     *        The name of the builder environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlatformVersionRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The configuration option settings to apply to the builder environment.
     * </p>
     * 
     * @return The configuration option settings to apply to the builder environment.
     */

    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        if (optionSettings == null) {
            optionSettings = new com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>();
        }
        return optionSettings;
    }

    /**
     * <p>
     * The configuration option settings to apply to the builder environment.
     * </p>
     * 
     * @param optionSettings
     *        The configuration option settings to apply to the builder environment.
     */

    public void setOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        if (optionSettings == null) {
            this.optionSettings = null;
            return;
        }

        this.optionSettings = new com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>(optionSettings);
    }

    /**
     * <p>
     * The configuration option settings to apply to the builder environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionSettings(java.util.Collection)} or {@link #withOptionSettings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param optionSettings
     *        The configuration option settings to apply to the builder environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlatformVersionRequest withOptionSettings(ConfigurationOptionSetting... optionSettings) {
        if (this.optionSettings == null) {
            setOptionSettings(new com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>(optionSettings.length));
        }
        for (ConfigurationOptionSetting ele : optionSettings) {
            this.optionSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration option settings to apply to the builder environment.
     * </p>
     * 
     * @param optionSettings
     *        The configuration option settings to apply to the builder environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlatformVersionRequest withOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
        return this;
    }

    /**
     * <p>
     * Specifies the tags applied to the new platform version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the platform version. Environments that you create using the
     * platform version don't inherit the tags.
     * </p>
     * 
     * @return Specifies the tags applied to the new platform version.</p>
     *         <p>
     *         Elastic Beanstalk applies these tags only to the platform version. Environments that you create using the
     *         platform version don't inherit the tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Specifies the tags applied to the new platform version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the platform version. Environments that you create using the
     * platform version don't inherit the tags.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to the new platform version.</p>
     *        <p>
     *        Elastic Beanstalk applies these tags only to the platform version. Environments that you create using the
     *        platform version don't inherit the tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Specifies the tags applied to the new platform version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the platform version. Environments that you create using the
     * platform version don't inherit the tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to the new platform version.</p>
     *        <p>
     *        Elastic Beanstalk applies these tags only to the platform version. Environments that you create using the
     *        platform version don't inherit the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlatformVersionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the tags applied to the new platform version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the platform version. Environments that you create using the
     * platform version don't inherit the tags.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to the new platform version.</p>
     *        <p>
     *        Elastic Beanstalk applies these tags only to the platform version. Environments that you create using the
     *        platform version don't inherit the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlatformVersionRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getPlatformName() != null)
            sb.append("PlatformName: ").append(getPlatformName()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getPlatformDefinitionBundle() != null)
            sb.append("PlatformDefinitionBundle: ").append(getPlatformDefinitionBundle()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: ").append(getOptionSettings()).append(",");
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

        if (obj instanceof CreatePlatformVersionRequest == false)
            return false;
        CreatePlatformVersionRequest other = (CreatePlatformVersionRequest) obj;
        if (other.getPlatformName() == null ^ this.getPlatformName() == null)
            return false;
        if (other.getPlatformName() != null && other.getPlatformName().equals(this.getPlatformName()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getPlatformDefinitionBundle() == null ^ this.getPlatformDefinitionBundle() == null)
            return false;
        if (other.getPlatformDefinitionBundle() != null && other.getPlatformDefinitionBundle().equals(this.getPlatformDefinitionBundle()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null)
            return false;
        if (other.getOptionSettings() != null && other.getOptionSettings().equals(this.getOptionSettings()) == false)
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

        hashCode = prime * hashCode + ((getPlatformName() == null) ? 0 : getPlatformName().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getPlatformDefinitionBundle() == null) ? 0 : getPlatformDefinitionBundle().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePlatformVersionRequest clone() {
        return (CreatePlatformVersionRequest) super.clone();
    }

}
