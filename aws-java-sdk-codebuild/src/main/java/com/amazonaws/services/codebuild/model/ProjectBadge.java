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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the build badge for the build project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ProjectBadge" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectBadge implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's build badge.
     * </p>
     */
    private Boolean badgeEnabled;
    /**
     * <p>
     * The publicly-accessible URL through which you can access the build badge for your project.
     * </p>
     * <p>
     * The publicly accessible URL through which you can access the build badge for your project.
     * </p>
     */
    private String badgeRequestUrl;

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's build badge.
     * </p>
     * 
     * @param badgeEnabled
     *        Set this to true to generate a publicly accessible URL for your project's build badge.
     */

    public void setBadgeEnabled(Boolean badgeEnabled) {
        this.badgeEnabled = badgeEnabled;
    }

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's build badge.
     * </p>
     * 
     * @return Set this to true to generate a publicly accessible URL for your project's build badge.
     */

    public Boolean getBadgeEnabled() {
        return this.badgeEnabled;
    }

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's build badge.
     * </p>
     * 
     * @param badgeEnabled
     *        Set this to true to generate a publicly accessible URL for your project's build badge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectBadge withBadgeEnabled(Boolean badgeEnabled) {
        setBadgeEnabled(badgeEnabled);
        return this;
    }

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's build badge.
     * </p>
     * 
     * @return Set this to true to generate a publicly accessible URL for your project's build badge.
     */

    public Boolean isBadgeEnabled() {
        return this.badgeEnabled;
    }

    /**
     * <p>
     * The publicly-accessible URL through which you can access the build badge for your project.
     * </p>
     * <p>
     * The publicly accessible URL through which you can access the build badge for your project.
     * </p>
     * 
     * @param badgeRequestUrl
     *        The publicly-accessible URL through which you can access the build badge for your project. </p>
     *        <p>
     *        The publicly accessible URL through which you can access the build badge for your project.
     */

    public void setBadgeRequestUrl(String badgeRequestUrl) {
        this.badgeRequestUrl = badgeRequestUrl;
    }

    /**
     * <p>
     * The publicly-accessible URL through which you can access the build badge for your project.
     * </p>
     * <p>
     * The publicly accessible URL through which you can access the build badge for your project.
     * </p>
     * 
     * @return The publicly-accessible URL through which you can access the build badge for your project. </p>
     *         <p>
     *         The publicly accessible URL through which you can access the build badge for your project.
     */

    public String getBadgeRequestUrl() {
        return this.badgeRequestUrl;
    }

    /**
     * <p>
     * The publicly-accessible URL through which you can access the build badge for your project.
     * </p>
     * <p>
     * The publicly accessible URL through which you can access the build badge for your project.
     * </p>
     * 
     * @param badgeRequestUrl
     *        The publicly-accessible URL through which you can access the build badge for your project. </p>
     *        <p>
     *        The publicly accessible URL through which you can access the build badge for your project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectBadge withBadgeRequestUrl(String badgeRequestUrl) {
        setBadgeRequestUrl(badgeRequestUrl);
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
        if (getBadgeEnabled() != null)
            sb.append("BadgeEnabled: ").append(getBadgeEnabled()).append(",");
        if (getBadgeRequestUrl() != null)
            sb.append("BadgeRequestUrl: ").append(getBadgeRequestUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectBadge == false)
            return false;
        ProjectBadge other = (ProjectBadge) obj;
        if (other.getBadgeEnabled() == null ^ this.getBadgeEnabled() == null)
            return false;
        if (other.getBadgeEnabled() != null && other.getBadgeEnabled().equals(this.getBadgeEnabled()) == false)
            return false;
        if (other.getBadgeRequestUrl() == null ^ this.getBadgeRequestUrl() == null)
            return false;
        if (other.getBadgeRequestUrl() != null && other.getBadgeRequestUrl().equals(this.getBadgeRequestUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBadgeEnabled() == null) ? 0 : getBadgeEnabled().hashCode());
        hashCode = prime * hashCode + ((getBadgeRequestUrl() == null) ? 0 : getBadgeRequestUrl().hashCode());
        return hashCode;
    }

    @Override
    public ProjectBadge clone() {
        try {
            return (ProjectBadge) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ProjectBadgeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
