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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application. This name is visible to users when display name is not specified.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The display name of the application. This name is visible to users in the application catalog.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The description of the application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The location in S3 of the application icon.
     * </p>
     */
    private S3Location iconS3Location;
    /**
     * <p>
     * The launch path of the application.
     * </p>
     */
    private String launchPath;
    /**
     * <p>
     * The working directory of the application.
     * </p>
     */
    private String workingDirectory;
    /**
     * <p>
     * The launch parameters of the application.
     * </p>
     */
    private String launchParameters;
    /**
     * <p>
     * The platforms the application supports. WINDOWS_SERVER_2019 and AMAZON_LINUX2 are supported for Elastic fleets.
     * </p>
     */
    private java.util.List<String> platforms;
    /**
     * <p>
     * The instance families the application supports. Valid values are GENERAL_PURPOSE and GRAPHICS_G4.
     * </p>
     */
    private java.util.List<String> instanceFamilies;
    /**
     * <p>
     * The app block ARN to which the application should be associated
     * </p>
     */
    private String appBlockArn;
    /**
     * <p>
     * The tags assigned to the application.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the application. This name is visible to users when display name is not specified.
     * </p>
     * 
     * @param name
     *        The name of the application. This name is visible to users when display name is not specified.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application. This name is visible to users when display name is not specified.
     * </p>
     * 
     * @return The name of the application. This name is visible to users when display name is not specified.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application. This name is visible to users when display name is not specified.
     * </p>
     * 
     * @param name
     *        The name of the application. This name is visible to users when display name is not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The display name of the application. This name is visible to users in the application catalog.
     * </p>
     * 
     * @param displayName
     *        The display name of the application. This name is visible to users in the application catalog.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the application. This name is visible to users in the application catalog.
     * </p>
     * 
     * @return The display name of the application. This name is visible to users in the application catalog.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the application. This name is visible to users in the application catalog.
     * </p>
     * 
     * @param displayName
     *        The display name of the application. This name is visible to users in the application catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @return The description of the application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The location in S3 of the application icon.
     * </p>
     * 
     * @param iconS3Location
     *        The location in S3 of the application icon.
     */

    public void setIconS3Location(S3Location iconS3Location) {
        this.iconS3Location = iconS3Location;
    }

    /**
     * <p>
     * The location in S3 of the application icon.
     * </p>
     * 
     * @return The location in S3 of the application icon.
     */

    public S3Location getIconS3Location() {
        return this.iconS3Location;
    }

    /**
     * <p>
     * The location in S3 of the application icon.
     * </p>
     * 
     * @param iconS3Location
     *        The location in S3 of the application icon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withIconS3Location(S3Location iconS3Location) {
        setIconS3Location(iconS3Location);
        return this;
    }

    /**
     * <p>
     * The launch path of the application.
     * </p>
     * 
     * @param launchPath
     *        The launch path of the application.
     */

    public void setLaunchPath(String launchPath) {
        this.launchPath = launchPath;
    }

    /**
     * <p>
     * The launch path of the application.
     * </p>
     * 
     * @return The launch path of the application.
     */

    public String getLaunchPath() {
        return this.launchPath;
    }

    /**
     * <p>
     * The launch path of the application.
     * </p>
     * 
     * @param launchPath
     *        The launch path of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withLaunchPath(String launchPath) {
        setLaunchPath(launchPath);
        return this;
    }

    /**
     * <p>
     * The working directory of the application.
     * </p>
     * 
     * @param workingDirectory
     *        The working directory of the application.
     */

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    /**
     * <p>
     * The working directory of the application.
     * </p>
     * 
     * @return The working directory of the application.
     */

    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

    /**
     * <p>
     * The working directory of the application.
     * </p>
     * 
     * @param workingDirectory
     *        The working directory of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withWorkingDirectory(String workingDirectory) {
        setWorkingDirectory(workingDirectory);
        return this;
    }

    /**
     * <p>
     * The launch parameters of the application.
     * </p>
     * 
     * @param launchParameters
     *        The launch parameters of the application.
     */

    public void setLaunchParameters(String launchParameters) {
        this.launchParameters = launchParameters;
    }

    /**
     * <p>
     * The launch parameters of the application.
     * </p>
     * 
     * @return The launch parameters of the application.
     */

    public String getLaunchParameters() {
        return this.launchParameters;
    }

    /**
     * <p>
     * The launch parameters of the application.
     * </p>
     * 
     * @param launchParameters
     *        The launch parameters of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withLaunchParameters(String launchParameters) {
        setLaunchParameters(launchParameters);
        return this;
    }

    /**
     * <p>
     * The platforms the application supports. WINDOWS_SERVER_2019 and AMAZON_LINUX2 are supported for Elastic fleets.
     * </p>
     * 
     * @return The platforms the application supports. WINDOWS_SERVER_2019 and AMAZON_LINUX2 are supported for Elastic
     *         fleets.
     * @see PlatformType
     */

    public java.util.List<String> getPlatforms() {
        return platforms;
    }

    /**
     * <p>
     * The platforms the application supports. WINDOWS_SERVER_2019 and AMAZON_LINUX2 are supported for Elastic fleets.
     * </p>
     * 
     * @param platforms
     *        The platforms the application supports. WINDOWS_SERVER_2019 and AMAZON_LINUX2 are supported for Elastic
     *        fleets.
     * @see PlatformType
     */

    public void setPlatforms(java.util.Collection<String> platforms) {
        if (platforms == null) {
            this.platforms = null;
            return;
        }

        this.platforms = new java.util.ArrayList<String>(platforms);
    }

    /**
     * <p>
     * The platforms the application supports. WINDOWS_SERVER_2019 and AMAZON_LINUX2 are supported for Elastic fleets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatforms(java.util.Collection)} or {@link #withPlatforms(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param platforms
     *        The platforms the application supports. WINDOWS_SERVER_2019 and AMAZON_LINUX2 are supported for Elastic
     *        fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public CreateApplicationRequest withPlatforms(String... platforms) {
        if (this.platforms == null) {
            setPlatforms(new java.util.ArrayList<String>(platforms.length));
        }
        for (String ele : platforms) {
            this.platforms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The platforms the application supports. WINDOWS_SERVER_2019 and AMAZON_LINUX2 are supported for Elastic fleets.
     * </p>
     * 
     * @param platforms
     *        The platforms the application supports. WINDOWS_SERVER_2019 and AMAZON_LINUX2 are supported for Elastic
     *        fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public CreateApplicationRequest withPlatforms(java.util.Collection<String> platforms) {
        setPlatforms(platforms);
        return this;
    }

    /**
     * <p>
     * The platforms the application supports. WINDOWS_SERVER_2019 and AMAZON_LINUX2 are supported for Elastic fleets.
     * </p>
     * 
     * @param platforms
     *        The platforms the application supports. WINDOWS_SERVER_2019 and AMAZON_LINUX2 are supported for Elastic
     *        fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public CreateApplicationRequest withPlatforms(PlatformType... platforms) {
        java.util.ArrayList<String> platformsCopy = new java.util.ArrayList<String>(platforms.length);
        for (PlatformType value : platforms) {
            platformsCopy.add(value.toString());
        }
        if (getPlatforms() == null) {
            setPlatforms(platformsCopy);
        } else {
            getPlatforms().addAll(platformsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The instance families the application supports. Valid values are GENERAL_PURPOSE and GRAPHICS_G4.
     * </p>
     * 
     * @return The instance families the application supports. Valid values are GENERAL_PURPOSE and GRAPHICS_G4.
     */

    public java.util.List<String> getInstanceFamilies() {
        return instanceFamilies;
    }

    /**
     * <p>
     * The instance families the application supports. Valid values are GENERAL_PURPOSE and GRAPHICS_G4.
     * </p>
     * 
     * @param instanceFamilies
     *        The instance families the application supports. Valid values are GENERAL_PURPOSE and GRAPHICS_G4.
     */

    public void setInstanceFamilies(java.util.Collection<String> instanceFamilies) {
        if (instanceFamilies == null) {
            this.instanceFamilies = null;
            return;
        }

        this.instanceFamilies = new java.util.ArrayList<String>(instanceFamilies);
    }

    /**
     * <p>
     * The instance families the application supports. Valid values are GENERAL_PURPOSE and GRAPHICS_G4.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceFamilies(java.util.Collection)} or {@link #withInstanceFamilies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param instanceFamilies
     *        The instance families the application supports. Valid values are GENERAL_PURPOSE and GRAPHICS_G4.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withInstanceFamilies(String... instanceFamilies) {
        if (this.instanceFamilies == null) {
            setInstanceFamilies(new java.util.ArrayList<String>(instanceFamilies.length));
        }
        for (String ele : instanceFamilies) {
            this.instanceFamilies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance families the application supports. Valid values are GENERAL_PURPOSE and GRAPHICS_G4.
     * </p>
     * 
     * @param instanceFamilies
     *        The instance families the application supports. Valid values are GENERAL_PURPOSE and GRAPHICS_G4.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withInstanceFamilies(java.util.Collection<String> instanceFamilies) {
        setInstanceFamilies(instanceFamilies);
        return this;
    }

    /**
     * <p>
     * The app block ARN to which the application should be associated
     * </p>
     * 
     * @param appBlockArn
     *        The app block ARN to which the application should be associated
     */

    public void setAppBlockArn(String appBlockArn) {
        this.appBlockArn = appBlockArn;
    }

    /**
     * <p>
     * The app block ARN to which the application should be associated
     * </p>
     * 
     * @return The app block ARN to which the application should be associated
     */

    public String getAppBlockArn() {
        return this.appBlockArn;
    }

    /**
     * <p>
     * The app block ARN to which the application should be associated
     * </p>
     * 
     * @param appBlockArn
     *        The app block ARN to which the application should be associated
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withAppBlockArn(String appBlockArn) {
        setAppBlockArn(appBlockArn);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the application.
     * </p>
     * 
     * @return The tags assigned to the application.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the application.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the application.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the application.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateApplicationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest addTagsEntry(String key, String value) {
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

    public CreateApplicationRequest clearTagsEntries() {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIconS3Location() != null)
            sb.append("IconS3Location: ").append(getIconS3Location()).append(",");
        if (getLaunchPath() != null)
            sb.append("LaunchPath: ").append(getLaunchPath()).append(",");
        if (getWorkingDirectory() != null)
            sb.append("WorkingDirectory: ").append(getWorkingDirectory()).append(",");
        if (getLaunchParameters() != null)
            sb.append("LaunchParameters: ").append(getLaunchParameters()).append(",");
        if (getPlatforms() != null)
            sb.append("Platforms: ").append(getPlatforms()).append(",");
        if (getInstanceFamilies() != null)
            sb.append("InstanceFamilies: ").append(getInstanceFamilies()).append(",");
        if (getAppBlockArn() != null)
            sb.append("AppBlockArn: ").append(getAppBlockArn()).append(",");
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

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIconS3Location() == null ^ this.getIconS3Location() == null)
            return false;
        if (other.getIconS3Location() != null && other.getIconS3Location().equals(this.getIconS3Location()) == false)
            return false;
        if (other.getLaunchPath() == null ^ this.getLaunchPath() == null)
            return false;
        if (other.getLaunchPath() != null && other.getLaunchPath().equals(this.getLaunchPath()) == false)
            return false;
        if (other.getWorkingDirectory() == null ^ this.getWorkingDirectory() == null)
            return false;
        if (other.getWorkingDirectory() != null && other.getWorkingDirectory().equals(this.getWorkingDirectory()) == false)
            return false;
        if (other.getLaunchParameters() == null ^ this.getLaunchParameters() == null)
            return false;
        if (other.getLaunchParameters() != null && other.getLaunchParameters().equals(this.getLaunchParameters()) == false)
            return false;
        if (other.getPlatforms() == null ^ this.getPlatforms() == null)
            return false;
        if (other.getPlatforms() != null && other.getPlatforms().equals(this.getPlatforms()) == false)
            return false;
        if (other.getInstanceFamilies() == null ^ this.getInstanceFamilies() == null)
            return false;
        if (other.getInstanceFamilies() != null && other.getInstanceFamilies().equals(this.getInstanceFamilies()) == false)
            return false;
        if (other.getAppBlockArn() == null ^ this.getAppBlockArn() == null)
            return false;
        if (other.getAppBlockArn() != null && other.getAppBlockArn().equals(this.getAppBlockArn()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIconS3Location() == null) ? 0 : getIconS3Location().hashCode());
        hashCode = prime * hashCode + ((getLaunchPath() == null) ? 0 : getLaunchPath().hashCode());
        hashCode = prime * hashCode + ((getWorkingDirectory() == null) ? 0 : getWorkingDirectory().hashCode());
        hashCode = prime * hashCode + ((getLaunchParameters() == null) ? 0 : getLaunchParameters().hashCode());
        hashCode = prime * hashCode + ((getPlatforms() == null) ? 0 : getPlatforms().hashCode());
        hashCode = prime * hashCode + ((getInstanceFamilies() == null) ? 0 : getInstanceFamilies().hashCode());
        hashCode = prime * hashCode + ((getAppBlockArn() == null) ? 0 : getAppBlockArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }

}
