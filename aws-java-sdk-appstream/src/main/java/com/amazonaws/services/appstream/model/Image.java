/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * New streaming instances are booted from images. The image stores the application catalog and is connected to fleets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/Image" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Image implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the image.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN for the image.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The source image ARN from which this image was created.
     * </p>
     */
    private String baseImageArn;
    /**
     * <p>
     * The display name for the image.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The image starts in the <b>PENDING</b> state, and then moves to <b>AVAILABLE</b> if image creation succeeds and
     * <b>FAILED</b> if image creation has failed.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The visibility of an image to the user; images can be public or private.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * The operating system platform of the image.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * A meaningful description for the image.
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
     * The applications associated with an image.
     * </p>
     */
    private java.util.List<Application> applications;
    /**
     * <p>
     * The timestamp when the image was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The unique identifier for the image.
     * </p>
     * 
     * @param name
     *        The unique identifier for the image.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique identifier for the image.
     * </p>
     * 
     * @return The unique identifier for the image.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique identifier for the image.
     * </p>
     * 
     * @param name
     *        The unique identifier for the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN for the image.
     * </p>
     * 
     * @param arn
     *        The ARN for the image.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the image.
     * </p>
     * 
     * @return The ARN for the image.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN for the image.
     * </p>
     * 
     * @param arn
     *        The ARN for the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The source image ARN from which this image was created.
     * </p>
     * 
     * @param baseImageArn
     *        The source image ARN from which this image was created.
     */

    public void setBaseImageArn(String baseImageArn) {
        this.baseImageArn = baseImageArn;
    }

    /**
     * <p>
     * The source image ARN from which this image was created.
     * </p>
     * 
     * @return The source image ARN from which this image was created.
     */

    public String getBaseImageArn() {
        return this.baseImageArn;
    }

    /**
     * <p>
     * The source image ARN from which this image was created.
     * </p>
     * 
     * @param baseImageArn
     *        The source image ARN from which this image was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withBaseImageArn(String baseImageArn) {
        setBaseImageArn(baseImageArn);
        return this;
    }

    /**
     * <p>
     * The display name for the image.
     * </p>
     * 
     * @param displayName
     *        The display name for the image.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name for the image.
     * </p>
     * 
     * @return The display name for the image.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name for the image.
     * </p>
     * 
     * @param displayName
     *        The display name for the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The image starts in the <b>PENDING</b> state, and then moves to <b>AVAILABLE</b> if image creation succeeds and
     * <b>FAILED</b> if image creation has failed.
     * </p>
     * 
     * @param state
     *        The image starts in the <b>PENDING</b> state, and then moves to <b>AVAILABLE</b> if image creation
     *        succeeds and <b>FAILED</b> if image creation has failed.
     * @see ImageState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The image starts in the <b>PENDING</b> state, and then moves to <b>AVAILABLE</b> if image creation succeeds and
     * <b>FAILED</b> if image creation has failed.
     * </p>
     * 
     * @return The image starts in the <b>PENDING</b> state, and then moves to <b>AVAILABLE</b> if image creation
     *         succeeds and <b>FAILED</b> if image creation has failed.
     * @see ImageState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The image starts in the <b>PENDING</b> state, and then moves to <b>AVAILABLE</b> if image creation succeeds and
     * <b>FAILED</b> if image creation has failed.
     * </p>
     * 
     * @param state
     *        The image starts in the <b>PENDING</b> state, and then moves to <b>AVAILABLE</b> if image creation
     *        succeeds and <b>FAILED</b> if image creation has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageState
     */

    public Image withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The image starts in the <b>PENDING</b> state, and then moves to <b>AVAILABLE</b> if image creation succeeds and
     * <b>FAILED</b> if image creation has failed.
     * </p>
     * 
     * @param state
     *        The image starts in the <b>PENDING</b> state, and then moves to <b>AVAILABLE</b> if image creation
     *        succeeds and <b>FAILED</b> if image creation has failed.
     * @see ImageState
     */

    public void setState(ImageState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The image starts in the <b>PENDING</b> state, and then moves to <b>AVAILABLE</b> if image creation succeeds and
     * <b>FAILED</b> if image creation has failed.
     * </p>
     * 
     * @param state
     *        The image starts in the <b>PENDING</b> state, and then moves to <b>AVAILABLE</b> if image creation
     *        succeeds and <b>FAILED</b> if image creation has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageState
     */

    public Image withState(ImageState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The visibility of an image to the user; images can be public or private.
     * </p>
     * 
     * @param visibility
     *        The visibility of an image to the user; images can be public or private.
     * @see VisibilityType
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of an image to the user; images can be public or private.
     * </p>
     * 
     * @return The visibility of an image to the user; images can be public or private.
     * @see VisibilityType
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of an image to the user; images can be public or private.
     * </p>
     * 
     * @param visibility
     *        The visibility of an image to the user; images can be public or private.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VisibilityType
     */

    public Image withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of an image to the user; images can be public or private.
     * </p>
     * 
     * @param visibility
     *        The visibility of an image to the user; images can be public or private.
     * @see VisibilityType
     */

    public void setVisibility(VisibilityType visibility) {
        this.visibility = visibility.toString();
    }

    /**
     * <p>
     * The visibility of an image to the user; images can be public or private.
     * </p>
     * 
     * @param visibility
     *        The visibility of an image to the user; images can be public or private.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VisibilityType
     */

    public Image withVisibility(VisibilityType visibility) {
        setVisibility(visibility);
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
        this.platform = platform.toString();
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
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * A meaningful description for the image.
     * </p>
     * 
     * @param description
     *        A meaningful description for the image.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A meaningful description for the image.
     * </p>
     * 
     * @return A meaningful description for the image.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A meaningful description for the image.
     * </p>
     * 
     * @param description
     *        A meaningful description for the image.
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
     * The applications associated with an image.
     * </p>
     * 
     * @return The applications associated with an image.
     */

    public java.util.List<Application> getApplications() {
        return applications;
    }

    /**
     * <p>
     * The applications associated with an image.
     * </p>
     * 
     * @param applications
     *        The applications associated with an image.
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
     * The applications associated with an image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplications(java.util.Collection)} or {@link #withApplications(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param applications
     *        The applications associated with an image.
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
     * The applications associated with an image.
     * </p>
     * 
     * @param applications
     *        The applications associated with an image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withApplications(java.util.Collection<Application> applications) {
        setApplications(applications);
        return this;
    }

    /**
     * <p>
     * The timestamp when the image was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the image was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp when the image was created.
     * </p>
     * 
     * @return The timestamp when the image was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp when the image was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the image was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStateChangeReason() != null)
            sb.append("StateChangeReason: ").append(getStateChangeReason()).append(",");
        if (getApplications() != null)
            sb.append("Applications: ").append(getApplications()).append(",");
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
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStateChangeReason() == null) ? 0 : getStateChangeReason().hashCode());
        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
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
