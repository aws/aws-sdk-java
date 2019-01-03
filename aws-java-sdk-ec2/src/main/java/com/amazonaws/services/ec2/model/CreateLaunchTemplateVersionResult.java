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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLaunchTemplateVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the launch template version.
     * </p>
     */
    private LaunchTemplateVersion launchTemplateVersion;

    /**
     * <p>
     * Information about the launch template version.
     * </p>
     * 
     * @param launchTemplateVersion
     *        Information about the launch template version.
     */

    public void setLaunchTemplateVersion(LaunchTemplateVersion launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
    }

    /**
     * <p>
     * Information about the launch template version.
     * </p>
     * 
     * @return Information about the launch template version.
     */

    public LaunchTemplateVersion getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    /**
     * <p>
     * Information about the launch template version.
     * </p>
     * 
     * @param launchTemplateVersion
     *        Information about the launch template version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchTemplateVersionResult withLaunchTemplateVersion(LaunchTemplateVersion launchTemplateVersion) {
        setLaunchTemplateVersion(launchTemplateVersion);
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
        if (getLaunchTemplateVersion() != null)
            sb.append("LaunchTemplateVersion: ").append(getLaunchTemplateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLaunchTemplateVersionResult == false)
            return false;
        CreateLaunchTemplateVersionResult other = (CreateLaunchTemplateVersionResult) obj;
        if (other.getLaunchTemplateVersion() == null ^ this.getLaunchTemplateVersion() == null)
            return false;
        if (other.getLaunchTemplateVersion() != null && other.getLaunchTemplateVersion().equals(this.getLaunchTemplateVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchTemplateVersion() == null) ? 0 : getLaunchTemplateVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateLaunchTemplateVersionResult clone() {
        try {
            return (CreateLaunchTemplateVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
