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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The profile notification summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ProfileNotificationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfileNotificationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current profile version.
     * </p>
     */
    private String currentProfileVersion;
    /**
     * <p>
     * The latest profile version.
     * </p>
     */
    private String latestProfileVersion;
    /**
     * <p>
     * Type of notification.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The profile ARN.
     * </p>
     */
    private String profileArn;
    /**
     * <p>
     * The profile name.
     * </p>
     */
    private String profileName;

    private String workloadId;

    private String workloadName;

    /**
     * <p>
     * The current profile version.
     * </p>
     * 
     * @param currentProfileVersion
     *        The current profile version.
     */

    public void setCurrentProfileVersion(String currentProfileVersion) {
        this.currentProfileVersion = currentProfileVersion;
    }

    /**
     * <p>
     * The current profile version.
     * </p>
     * 
     * @return The current profile version.
     */

    public String getCurrentProfileVersion() {
        return this.currentProfileVersion;
    }

    /**
     * <p>
     * The current profile version.
     * </p>
     * 
     * @param currentProfileVersion
     *        The current profile version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileNotificationSummary withCurrentProfileVersion(String currentProfileVersion) {
        setCurrentProfileVersion(currentProfileVersion);
        return this;
    }

    /**
     * <p>
     * The latest profile version.
     * </p>
     * 
     * @param latestProfileVersion
     *        The latest profile version.
     */

    public void setLatestProfileVersion(String latestProfileVersion) {
        this.latestProfileVersion = latestProfileVersion;
    }

    /**
     * <p>
     * The latest profile version.
     * </p>
     * 
     * @return The latest profile version.
     */

    public String getLatestProfileVersion() {
        return this.latestProfileVersion;
    }

    /**
     * <p>
     * The latest profile version.
     * </p>
     * 
     * @param latestProfileVersion
     *        The latest profile version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileNotificationSummary withLatestProfileVersion(String latestProfileVersion) {
        setLatestProfileVersion(latestProfileVersion);
        return this;
    }

    /**
     * <p>
     * Type of notification.
     * </p>
     * 
     * @param type
     *        Type of notification.
     * @see ProfileNotificationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of notification.
     * </p>
     * 
     * @return Type of notification.
     * @see ProfileNotificationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of notification.
     * </p>
     * 
     * @param type
     *        Type of notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileNotificationType
     */

    public ProfileNotificationSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of notification.
     * </p>
     * 
     * @param type
     *        Type of notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileNotificationType
     */

    public ProfileNotificationSummary withType(ProfileNotificationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The profile ARN.
     * </p>
     * 
     * @param profileArn
     *        The profile ARN.
     */

    public void setProfileArn(String profileArn) {
        this.profileArn = profileArn;
    }

    /**
     * <p>
     * The profile ARN.
     * </p>
     * 
     * @return The profile ARN.
     */

    public String getProfileArn() {
        return this.profileArn;
    }

    /**
     * <p>
     * The profile ARN.
     * </p>
     * 
     * @param profileArn
     *        The profile ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileNotificationSummary withProfileArn(String profileArn) {
        setProfileArn(profileArn);
        return this;
    }

    /**
     * <p>
     * The profile name.
     * </p>
     * 
     * @param profileName
     *        The profile name.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The profile name.
     * </p>
     * 
     * @return The profile name.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The profile name.
     * </p>
     * 
     * @param profileName
     *        The profile name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileNotificationSummary withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * @param workloadId
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * @return
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @param workloadId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileNotificationSummary withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * @param workloadName
     */

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    /**
     * @return
     */

    public String getWorkloadName() {
        return this.workloadName;
    }

    /**
     * @param workloadName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileNotificationSummary withWorkloadName(String workloadName) {
        setWorkloadName(workloadName);
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
        if (getCurrentProfileVersion() != null)
            sb.append("CurrentProfileVersion: ").append(getCurrentProfileVersion()).append(",");
        if (getLatestProfileVersion() != null)
            sb.append("LatestProfileVersion: ").append(getLatestProfileVersion()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getProfileArn() != null)
            sb.append("ProfileArn: ").append(getProfileArn()).append(",");
        if (getProfileName() != null)
            sb.append("ProfileName: ").append(getProfileName()).append(",");
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getWorkloadName() != null)
            sb.append("WorkloadName: ").append(getWorkloadName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProfileNotificationSummary == false)
            return false;
        ProfileNotificationSummary other = (ProfileNotificationSummary) obj;
        if (other.getCurrentProfileVersion() == null ^ this.getCurrentProfileVersion() == null)
            return false;
        if (other.getCurrentProfileVersion() != null && other.getCurrentProfileVersion().equals(this.getCurrentProfileVersion()) == false)
            return false;
        if (other.getLatestProfileVersion() == null ^ this.getLatestProfileVersion() == null)
            return false;
        if (other.getLatestProfileVersion() != null && other.getLatestProfileVersion().equals(this.getLatestProfileVersion()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getProfileArn() == null ^ this.getProfileArn() == null)
            return false;
        if (other.getProfileArn() != null && other.getProfileArn().equals(this.getProfileArn()) == false)
            return false;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getWorkloadName() == null ^ this.getWorkloadName() == null)
            return false;
        if (other.getWorkloadName() != null && other.getWorkloadName().equals(this.getWorkloadName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrentProfileVersion() == null) ? 0 : getCurrentProfileVersion().hashCode());
        hashCode = prime * hashCode + ((getLatestProfileVersion() == null) ? 0 : getLatestProfileVersion().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getProfileArn() == null) ? 0 : getProfileArn().hashCode());
        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getWorkloadName() == null) ? 0 : getWorkloadName().hashCode());
        return hashCode;
    }

    @Override
    public ProfileNotificationSummary clone() {
        try {
            return (ProfileNotificationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ProfileNotificationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
