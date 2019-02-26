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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/Image" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Image implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the image.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the image.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ARN of the image from which this image was created.
     * </p>
     */
    private String baseImageArn;
    /**
     * <p>
     * The image name to display.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The image starts in the <code>PENDING</code> state. If image creation succeeds, the state is
     * <code>AVAILABLE</code>. If image creation fails, the state is <code>FAILED</code>.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Indicates whether the image is public or private.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * Indicates whether an image builder can be launched from this image.
     * </p>
     */
    private Boolean imageBuilderSupported;
    /**
     * <p>
     * The operating system platform of the image.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The description to display.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The reason why the last state change occurred.
     * </p>
     */
    private ImageStateChangeReason stateChangeReason;
    /**
     * <p>
     * The applications associated with the image.
     * </p>
     */
    private java.util.List<Application> applications;
    /**
     * <p>
     * The time the image was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The release date of the public base image. For private images, this date is the release date of the base image
     * from which the image was created.
     * </p>
     */
    private java.util.Date publicBaseImageReleasedDate;
    /**
     * <p>
     * The version of the AppStream 2.0 agent to use for instances that are launched from this image.
     * </p>
     */
    private String appstreamAgentVersion;
    /**
     * <p>
     * The permissions to provide to the destination AWS account for the specified image.
     * </p>
     */
    private ImagePermissions imagePermissions;

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
     * The ARN of the image.
     * </p>
     * 
     * @param arn
     *        The ARN of the image.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the image.
     * </p>
     * 
     * @return The ARN of the image.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the image.
     * </p>
     * 
     * @param arn
     *        The ARN of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ARN of the image from which this image was created.
     * </p>
     * 
     * @param baseImageArn
     *        The ARN of the image from which this image was created.
     */

    public void setBaseImageArn(String baseImageArn) {
        this.baseImageArn = baseImageArn;
    }

    /**
     * <p>
     * The ARN of the image from which this image was created.
     * </p>
     * 
     * @return The ARN of the image from which this image was created.
     */

    public String getBaseImageArn() {
        return this.baseImageArn;
    }

    /**
     * <p>
     * The ARN of the image from which this image was created.
     * </p>
     * 
     * @param baseImageArn
     *        The ARN of the image from which this image was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withBaseImageArn(String baseImageArn) {
        setBaseImageArn(baseImageArn);
        return this;
    }

    /**
     * <p>
     * The image name to display.
     * </p>
     * 
     * @param displayName
     *        The image name to display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The image name to display.
     * </p>
     * 
     * @return The image name to display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The image name to display.
     * </p>
     * 
     * @param displayName
     *        The image name to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The image starts in the <code>PENDING</code> state. If image creation succeeds, the state is
     * <code>AVAILABLE</code>. If image creation fails, the state is <code>FAILED</code>.
     * </p>
     * 
     * @param state
     *        The image starts in the <code>PENDING</code> state. If image creation succeeds, the state is
     *        <code>AVAILABLE</code>. If image creation fails, the state is <code>FAILED</code>.
     * @see ImageState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The image starts in the <code>PENDING</code> state. If image creation succeeds, the state is
     * <code>AVAILABLE</code>. If image creation fails, the state is <code>FAILED</code>.
     * </p>
     * 
     * @return The image starts in the <code>PENDING</code> state. If image creation succeeds, the state is
     *         <code>AVAILABLE</code>. If image creation fails, the state is <code>FAILED</code>.
     * @see ImageState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The image starts in the <code>PENDING</code> state. If image creation succeeds, the state is
     * <code>AVAILABLE</code>. If image creation fails, the state is <code>FAILED</code>.
     * </p>
     * 
     * @param state
     *        The image starts in the <code>PENDING</code> state. If image creation succeeds, the state is
     *        <code>AVAILABLE</code>. If image creation fails, the state is <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageState
     */

    public Image withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The image starts in the <code>PENDING</code> state. If image creation succeeds, the state is
     * <code>AVAILABLE</code>. If image creation fails, the state is <code>FAILED</code>.
     * </p>
     * 
     * @param state
     *        The image starts in the <code>PENDING</code> state. If image creation succeeds, the state is
     *        <code>AVAILABLE</code>. If image creation fails, the state is <code>FAILED</code>.
     * @see ImageState
     */

    public void setState(ImageState state) {
        withState(state);
    }

    /**
     * <p>
     * The image starts in the <code>PENDING</code> state. If image creation succeeds, the state is
     * <code>AVAILABLE</code>. If image creation fails, the state is <code>FAILED</code>.
     * </p>
     * 
     * @param state
     *        The image starts in the <code>PENDING</code> state. If image creation succeeds, the state is
     *        <code>AVAILABLE</code>. If image creation fails, the state is <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageState
     */

    public Image withState(ImageState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the image is public or private.
     * </p>
     * 
     * @param visibility
     *        Indicates whether the image is public or private.
     * @see VisibilityType
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * Indicates whether the image is public or private.
     * </p>
     * 
     * @return Indicates whether the image is public or private.
     * @see VisibilityType
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * Indicates whether the image is public or private.
     * </p>
     * 
     * @param visibility
     *        Indicates whether the image is public or private.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VisibilityType
     */

    public Image withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * Indicates whether the image is public or private.
     * </p>
     * 
     * @param visibility
     *        Indicates whether the image is public or private.
     * @see VisibilityType
     */

    public void setVisibility(VisibilityType visibility) {
        withVisibility(visibility);
    }

    /**
     * <p>
     * Indicates whether the image is public or private.
     * </p>
     * 
     * @param visibility
     *        Indicates whether the image is public or private.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VisibilityType
     */

    public Image withVisibility(VisibilityType visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether an image builder can be launched from this image.
     * </p>
     * 
     * @param imageBuilderSupported
     *        Indicates whether an image builder can be launched from this image.
     */

    public void setImageBuilderSupported(Boolean imageBuilderSupported) {
        this.imageBuilderSupported = imageBuilderSupported;
    }

    /**
     * <p>
     * Indicates whether an image builder can be launched from this image.
     * </p>
     * 
     * @return Indicates whether an image builder can be launched from this image.
     */

    public Boolean getImageBuilderSupported() {
        return this.imageBuilderSupported;
    }

    /**
     * <p>
     * Indicates whether an image builder can be launched from this image.
     * </p>
     * 
     * @param imageBuilderSupported
     *        Indicates whether an image builder can be launched from this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withImageBuilderSupported(Boolean imageBuilderSupported) {
        setImageBuilderSupported(imageBuilderSupported);
        return this;
    }

    /**
     * <p>
     * Indicates whether an image builder can be launched from this image.
     * </p>
     * 
     * @return Indicates whether an image builder can be launched from this image.
     */

    public Boolean isImageBuilderSupported() {
        return this.imageBuilderSupported;
    }

    /**
     * <p>
     * The operating system platform of the image.
     * </p>
     * 
     * @param platform
     *        The operating system platform of the image.
     * @see PlatformType
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The operating system platform of the image.
     * </p>
     * 
     * @return The operating system platform of the image.
     * @see PlatformType
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The operating system platform of the image.
     * </p>
     * 
     * @param platform
     *        The operating system platform of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public Image withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The operating system platform of the image.
     * </p>
     * 
     * @param platform
     *        The operating system platform of the image.
     * @see PlatformType
     */

    public void setPlatform(PlatformType platform) {
        withPlatform(platform);
    }

    /**
     * <p>
     * The operating system platform of the image.
     * </p>
     * 
     * @param platform
     *        The operating system platform of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public Image withPlatform(PlatformType platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The description to display.
     * </p>
     * 
     * @param description
     *        The description to display.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description to display.
     * </p>
     * 
     * @return The description to display.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description to display.
     * </p>
     * 
     * @param description
     *        The description to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The reason why the last state change occurred.
     * </p>
     * 
     * @param stateChangeReason
     *        The reason why the last state change occurred.
     */

    public void setStateChangeReason(ImageStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * The reason why the last state change occurred.
     * </p>
     * 
     * @return The reason why the last state change occurred.
     */

    public ImageStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * <p>
     * The reason why the last state change occurred.
     * </p>
     * 
     * @param stateChangeReason
     *        The reason why the last state change occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withStateChangeReason(ImageStateChangeReason stateChangeReason) {
        setStateChangeReason(stateChangeReason);
        return this;
    }

    /**
     * <p>
     * The applications associated with the image.
     * </p>
     * 
     * @return The applications associated with the image.
     */

    public java.util.List<Application> getApplications() {
        return applications;
    }

    /**
     * <p>
     * The applications associated with the image.
     * </p>
     * 
     * @param applications
     *        The applications associated with the image.
     */

    public void setApplications(java.util.Collection<Application> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }

        this.applications = new java.util.ArrayList<Application>(applications);
    }

    /**
     * <p>
     * The applications associated with the image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplications(java.util.Collection)} or {@link #withApplications(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param applications
     *        The applications associated with the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withApplications(Application... applications) {
        if (this.applications == null) {
            setApplications(new java.util.ArrayList<Application>(applications.length));
        }
        for (Application ele : applications) {
            this.applications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The applications associated with the image.
     * </p>
     * 
     * @param applications
     *        The applications associated with the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withApplications(java.util.Collection<Application> applications) {
        setApplications(applications);
        return this;
    }

    /**
     * <p>
     * The time the image was created.
     * </p>
     * 
     * @param createdTime
     *        The time the image was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time the image was created.
     * </p>
     * 
     * @return The time the image was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time the image was created.
     * </p>
     * 
     * @param createdTime
     *        The time the image was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The release date of the public base image. For private images, this date is the release date of the base image
     * from which the image was created.
     * </p>
     * 
     * @param publicBaseImageReleasedDate
     *        The release date of the public base image. For private images, this date is the release date of the base
     *        image from which the image was created.
     */

    public void setPublicBaseImageReleasedDate(java.util.Date publicBaseImageReleasedDate) {
        this.publicBaseImageReleasedDate = publicBaseImageReleasedDate;
    }

    /**
     * <p>
     * The release date of the public base image. For private images, this date is the release date of the base image
     * from which the image was created.
     * </p>
     * 
     * @return The release date of the public base image. For private images, this date is the release date of the base
     *         image from which the image was created.
     */

    public java.util.Date getPublicBaseImageReleasedDate() {
        return this.publicBaseImageReleasedDate;
    }

    /**
     * <p>
     * The release date of the public base image. For private images, this date is the release date of the base image
     * from which the image was created.
     * </p>
     * 
     * @param publicBaseImageReleasedDate
     *        The release date of the public base image. For private images, this date is the release date of the base
     *        image from which the image was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withPublicBaseImageReleasedDate(java.util.Date publicBaseImageReleasedDate) {
        setPublicBaseImageReleasedDate(publicBaseImageReleasedDate);
        return this;
    }

    /**
     * <p>
     * The version of the AppStream 2.0 agent to use for instances that are launched from this image.
     * </p>
     * 
     * @param appstreamAgentVersion
     *        The version of the AppStream 2.0 agent to use for instances that are launched from this image.
     */

    public void setAppstreamAgentVersion(String appstreamAgentVersion) {
        this.appstreamAgentVersion = appstreamAgentVersion;
    }

    /**
     * <p>
     * The version of the AppStream 2.0 agent to use for instances that are launched from this image.
     * </p>
     * 
     * @return The version of the AppStream 2.0 agent to use for instances that are launched from this image.
     */

    public String getAppstreamAgentVersion() {
        return this.appstreamAgentVersion;
    }

    /**
     * <p>
     * The version of the AppStream 2.0 agent to use for instances that are launched from this image.
     * </p>
     * 
     * @param appstreamAgentVersion
     *        The version of the AppStream 2.0 agent to use for instances that are launched from this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withAppstreamAgentVersion(String appstreamAgentVersion) {
        setAppstreamAgentVersion(appstreamAgentVersion);
        return this;
    }

    /**
     * <p>
     * The permissions to provide to the destination AWS account for the specified image.
     * </p>
     * 
     * @param imagePermissions
     *        The permissions to provide to the destination AWS account for the specified image.
     */

    public void setImagePermissions(ImagePermissions imagePermissions) {
        this.imagePermissions = imagePermissions;
    }

    /**
     * <p>
     * The permissions to provide to the destination AWS account for the specified image.
     * </p>
     * 
     * @return The permissions to provide to the destination AWS account for the specified image.
     */

    public ImagePermissions getImagePermissions() {
        return this.imagePermissions;
    }

    /**
     * <p>
     * The permissions to provide to the destination AWS account for the specified image.
     * </p>
     * 
     * @param imagePermissions
     *        The permissions to provide to the destination AWS account for the specified image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withImagePermissions(ImagePermissions imagePermissions) {
        setImagePermissions(imagePermissions);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getBaseImageArn() != null)
            sb.append("BaseImageArn: ").append(getBaseImageArn()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
        if (getImageBuilderSupported() != null)
            sb.append("ImageBuilderSupported: ").append(getImageBuilderSupported()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStateChangeReason() != null)
            sb.append("StateChangeReason: ").append(getStateChangeReason()).append(",");
        if (getApplications() != null)
            sb.append("Applications: ").append(getApplications()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getPublicBaseImageReleasedDate() != null)
            sb.append("PublicBaseImageReleasedDate: ").append(getPublicBaseImageReleasedDate()).append(",");
        if (getAppstreamAgentVersion() != null)
            sb.append("AppstreamAgentVersion: ").append(getAppstreamAgentVersion()).append(",");
        if (getImagePermissions() != null)
            sb.append("ImagePermissions: ").append(getImagePermissions());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBaseImageArn() == null ^ this.getBaseImageArn() == null)
            return false;
        if (other.getBaseImageArn() != null && other.getBaseImageArn().equals(this.getBaseImageArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getImageBuilderSupported() == null ^ this.getImageBuilderSupported() == null)
            return false;
        if (other.getImageBuilderSupported() != null && other.getImageBuilderSupported().equals(this.getImageBuilderSupported()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null)
            return false;
        if (other.getStateChangeReason() != null && other.getStateChangeReason().equals(this.getStateChangeReason()) == false)
            return false;
        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getPublicBaseImageReleasedDate() == null ^ this.getPublicBaseImageReleasedDate() == null)
            return false;
        if (other.getPublicBaseImageReleasedDate() != null && other.getPublicBaseImageReleasedDate().equals(this.getPublicBaseImageReleasedDate()) == false)
            return false;
        if (other.getAppstreamAgentVersion() == null ^ this.getAppstreamAgentVersion() == null)
            return false;
        if (other.getAppstreamAgentVersion() != null && other.getAppstreamAgentVersion().equals(this.getAppstreamAgentVersion()) == false)
            return false;
        if (other.getImagePermissions() == null ^ this.getImagePermissions() == null)
            return false;
        if (other.getImagePermissions() != null && other.getImagePermissions().equals(this.getImagePermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBaseImageArn() == null) ? 0 : getBaseImageArn().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getImageBuilderSupported() == null) ? 0 : getImageBuilderSupported().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStateChangeReason() == null) ? 0 : getStateChangeReason().hashCode());
        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getPublicBaseImageReleasedDate() == null) ? 0 : getPublicBaseImageReleasedDate().hashCode());
        hashCode = prime * hashCode + ((getAppstreamAgentVersion() == null) ? 0 : getAppstreamAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getImagePermissions() == null) ? 0 : getImagePermissions().hashCode());
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
        com.amazonaws.services.appstream.model.transform.ImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
