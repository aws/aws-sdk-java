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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an application in the application catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/Application" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Application implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The application name to display.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The URL for the application icon. This URL might be time-limited.
     * </p>
     */
    private String iconURL;
    /**
     * <p>
     * The path to the application executable in the instance.
     * </p>
     */
    private String launchPath;
    /**
     * <p>
     * The arguments that are passed to the application at launch.
     * </p>
     */
    private String launchParameters;
    /**
     * <p>
     * If there is a problem, the application can be disabled after image creation.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Additional attributes that describe the application.
     * </p>
     */
    private java.util.Map<String, String> metadata;
    /**
     * <p>
     * The working directory for the application.
     * </p>
     */
    private String workingDirectory;
    /**
     * <p>
     * The description of the application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the application.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The app block ARN of the application.
     * </p>
     */
    private String appBlockArn;
    /**
     * <p>
     * The S3 location of the application icon.
     * </p>
     */
    private S3Location iconS3Location;
    /**
     * <p>
     * The platforms on which the application can run.
     * </p>
     */
    private java.util.List<String> platforms;
    /**
     * <p>
     * The instance families for the application.
     * </p>
     */
    private java.util.List<String> instanceFamilies;
    /**
     * <p>
     * The time at which the application was created within the app block.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The application name to display.
     * </p>
     * 
     * @param displayName
     *        The application name to display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The application name to display.
     * </p>
     * 
     * @return The application name to display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The application name to display.
     * </p>
     * 
     * @param displayName
     *        The application name to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The URL for the application icon. This URL might be time-limited.
     * </p>
     * 
     * @param iconURL
     *        The URL for the application icon. This URL might be time-limited.
     */

    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    /**
     * <p>
     * The URL for the application icon. This URL might be time-limited.
     * </p>
     * 
     * @return The URL for the application icon. This URL might be time-limited.
     */

    public String getIconURL() {
        return this.iconURL;
    }

    /**
     * <p>
     * The URL for the application icon. This URL might be time-limited.
     * </p>
     * 
     * @param iconURL
     *        The URL for the application icon. This URL might be time-limited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withIconURL(String iconURL) {
        setIconURL(iconURL);
        return this;
    }

    /**
     * <p>
     * The path to the application executable in the instance.
     * </p>
     * 
     * @param launchPath
     *        The path to the application executable in the instance.
     */

    public void setLaunchPath(String launchPath) {
        this.launchPath = launchPath;
    }

    /**
     * <p>
     * The path to the application executable in the instance.
     * </p>
     * 
     * @return The path to the application executable in the instance.
     */

    public String getLaunchPath() {
        return this.launchPath;
    }

    /**
     * <p>
     * The path to the application executable in the instance.
     * </p>
     * 
     * @param launchPath
     *        The path to the application executable in the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withLaunchPath(String launchPath) {
        setLaunchPath(launchPath);
        return this;
    }

    /**
     * <p>
     * The arguments that are passed to the application at launch.
     * </p>
     * 
     * @param launchParameters
     *        The arguments that are passed to the application at launch.
     */

    public void setLaunchParameters(String launchParameters) {
        this.launchParameters = launchParameters;
    }

    /**
     * <p>
     * The arguments that are passed to the application at launch.
     * </p>
     * 
     * @return The arguments that are passed to the application at launch.
     */

    public String getLaunchParameters() {
        return this.launchParameters;
    }

    /**
     * <p>
     * The arguments that are passed to the application at launch.
     * </p>
     * 
     * @param launchParameters
     *        The arguments that are passed to the application at launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withLaunchParameters(String launchParameters) {
        setLaunchParameters(launchParameters);
        return this;
    }

    /**
     * <p>
     * If there is a problem, the application can be disabled after image creation.
     * </p>
     * 
     * @param enabled
     *        If there is a problem, the application can be disabled after image creation.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * If there is a problem, the application can be disabled after image creation.
     * </p>
     * 
     * @return If there is a problem, the application can be disabled after image creation.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * If there is a problem, the application can be disabled after image creation.
     * </p>
     * 
     * @param enabled
     *        If there is a problem, the application can be disabled after image creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * If there is a problem, the application can be disabled after image creation.
     * </p>
     * 
     * @return If there is a problem, the application can be disabled after image creation.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Additional attributes that describe the application.
     * </p>
     * 
     * @return Additional attributes that describe the application.
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * Additional attributes that describe the application.
     * </p>
     * 
     * @param metadata
     *        Additional attributes that describe the application.
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Additional attributes that describe the application.
     * </p>
     * 
     * @param metadata
     *        Additional attributes that describe the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see Application#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Application addMetadataEntry(String key, String value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, String>();
        }
        if (this.metadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * The working directory for the application.
     * </p>
     * 
     * @param workingDirectory
     *        The working directory for the application.
     */

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    /**
     * <p>
     * The working directory for the application.
     * </p>
     * 
     * @return The working directory for the application.
     */

    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

    /**
     * <p>
     * The working directory for the application.
     * </p>
     * 
     * @param workingDirectory
     *        The working directory for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withWorkingDirectory(String workingDirectory) {
        setWorkingDirectory(workingDirectory);
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

    public Application withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @param arn
     *        The ARN of the application.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @return The ARN of the application.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @param arn
     *        The ARN of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The app block ARN of the application.
     * </p>
     * 
     * @param appBlockArn
     *        The app block ARN of the application.
     */

    public void setAppBlockArn(String appBlockArn) {
        this.appBlockArn = appBlockArn;
    }

    /**
     * <p>
     * The app block ARN of the application.
     * </p>
     * 
     * @return The app block ARN of the application.
     */

    public String getAppBlockArn() {
        return this.appBlockArn;
    }

    /**
     * <p>
     * The app block ARN of the application.
     * </p>
     * 
     * @param appBlockArn
     *        The app block ARN of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withAppBlockArn(String appBlockArn) {
        setAppBlockArn(appBlockArn);
        return this;
    }

    /**
     * <p>
     * The S3 location of the application icon.
     * </p>
     * 
     * @param iconS3Location
     *        The S3 location of the application icon.
     */

    public void setIconS3Location(S3Location iconS3Location) {
        this.iconS3Location = iconS3Location;
    }

    /**
     * <p>
     * The S3 location of the application icon.
     * </p>
     * 
     * @return The S3 location of the application icon.
     */

    public S3Location getIconS3Location() {
        return this.iconS3Location;
    }

    /**
     * <p>
     * The S3 location of the application icon.
     * </p>
     * 
     * @param iconS3Location
     *        The S3 location of the application icon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withIconS3Location(S3Location iconS3Location) {
        setIconS3Location(iconS3Location);
        return this;
    }

    /**
     * <p>
     * The platforms on which the application can run.
     * </p>
     * 
     * @return The platforms on which the application can run.
     * @see PlatformType
     */

    public java.util.List<String> getPlatforms() {
        return platforms;
    }

    /**
     * <p>
     * The platforms on which the application can run.
     * </p>
     * 
     * @param platforms
     *        The platforms on which the application can run.
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
     * The platforms on which the application can run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatforms(java.util.Collection)} or {@link #withPlatforms(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param platforms
     *        The platforms on which the application can run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public Application withPlatforms(String... platforms) {
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
     * The platforms on which the application can run.
     * </p>
     * 
     * @param platforms
     *        The platforms on which the application can run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public Application withPlatforms(java.util.Collection<String> platforms) {
        setPlatforms(platforms);
        return this;
    }

    /**
     * <p>
     * The platforms on which the application can run.
     * </p>
     * 
     * @param platforms
     *        The platforms on which the application can run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public Application withPlatforms(PlatformType... platforms) {
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
     * The instance families for the application.
     * </p>
     * 
     * @return The instance families for the application.
     */

    public java.util.List<String> getInstanceFamilies() {
        return instanceFamilies;
    }

    /**
     * <p>
     * The instance families for the application.
     * </p>
     * 
     * @param instanceFamilies
     *        The instance families for the application.
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
     * The instance families for the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceFamilies(java.util.Collection)} or {@link #withInstanceFamilies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param instanceFamilies
     *        The instance families for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withInstanceFamilies(String... instanceFamilies) {
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
     * The instance families for the application.
     * </p>
     * 
     * @param instanceFamilies
     *        The instance families for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withInstanceFamilies(java.util.Collection<String> instanceFamilies) {
        setInstanceFamilies(instanceFamilies);
        return this;
    }

    /**
     * <p>
     * The time at which the application was created within the app block.
     * </p>
     * 
     * @param createdTime
     *        The time at which the application was created within the app block.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time at which the application was created within the app block.
     * </p>
     * 
     * @return The time at which the application was created within the app block.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time at which the application was created within the app block.
     * </p>
     * 
     * @param createdTime
     *        The time at which the application was created within the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
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
        if (getIconURL() != null)
            sb.append("IconURL: ").append(getIconURL()).append(",");
        if (getLaunchPath() != null)
            sb.append("LaunchPath: ").append(getLaunchPath()).append(",");
        if (getLaunchParameters() != null)
            sb.append("LaunchParameters: ").append(getLaunchParameters()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getWorkingDirectory() != null)
            sb.append("WorkingDirectory: ").append(getWorkingDirectory()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAppBlockArn() != null)
            sb.append("AppBlockArn: ").append(getAppBlockArn()).append(",");
        if (getIconS3Location() != null)
            sb.append("IconS3Location: ").append(getIconS3Location()).append(",");
        if (getPlatforms() != null)
            sb.append("Platforms: ").append(getPlatforms()).append(",");
        if (getInstanceFamilies() != null)
            sb.append("InstanceFamilies: ").append(getInstanceFamilies()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Application == false)
            return false;
        Application other = (Application) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getIconURL() == null ^ this.getIconURL() == null)
            return false;
        if (other.getIconURL() != null && other.getIconURL().equals(this.getIconURL()) == false)
            return false;
        if (other.getLaunchPath() == null ^ this.getLaunchPath() == null)
            return false;
        if (other.getLaunchPath() != null && other.getLaunchPath().equals(this.getLaunchPath()) == false)
            return false;
        if (other.getLaunchParameters() == null ^ this.getLaunchParameters() == null)
            return false;
        if (other.getLaunchParameters() != null && other.getLaunchParameters().equals(this.getLaunchParameters()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getWorkingDirectory() == null ^ this.getWorkingDirectory() == null)
            return false;
        if (other.getWorkingDirectory() != null && other.getWorkingDirectory().equals(this.getWorkingDirectory()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAppBlockArn() == null ^ this.getAppBlockArn() == null)
            return false;
        if (other.getAppBlockArn() != null && other.getAppBlockArn().equals(this.getAppBlockArn()) == false)
            return false;
        if (other.getIconS3Location() == null ^ this.getIconS3Location() == null)
            return false;
        if (other.getIconS3Location() != null && other.getIconS3Location().equals(this.getIconS3Location()) == false)
            return false;
        if (other.getPlatforms() == null ^ this.getPlatforms() == null)
            return false;
        if (other.getPlatforms() != null && other.getPlatforms().equals(this.getPlatforms()) == false)
            return false;
        if (other.getInstanceFamilies() == null ^ this.getInstanceFamilies() == null)
            return false;
        if (other.getInstanceFamilies() != null && other.getInstanceFamilies().equals(this.getInstanceFamilies()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getIconURL() == null) ? 0 : getIconURL().hashCode());
        hashCode = prime * hashCode + ((getLaunchPath() == null) ? 0 : getLaunchPath().hashCode());
        hashCode = prime * hashCode + ((getLaunchParameters() == null) ? 0 : getLaunchParameters().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getWorkingDirectory() == null) ? 0 : getWorkingDirectory().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAppBlockArn() == null) ? 0 : getAppBlockArn().hashCode());
        hashCode = prime * hashCode + ((getIconS3Location() == null) ? 0 : getIconS3Location().hashCode());
        hashCode = prime * hashCode + ((getPlatforms() == null) ? 0 : getPlatforms().hashCode());
        hashCode = prime * hashCode + ((getInstanceFamilies() == null) ? 0 : getInstanceFamilies().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public Application clone() {
        try {
            return (Application) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.ApplicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
