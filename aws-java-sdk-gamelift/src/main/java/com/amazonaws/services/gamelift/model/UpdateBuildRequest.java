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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateBuild" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBuildRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a build to update.
     * </p>
     */
    private String buildId;
    /**
     * <p>
     * Descriptive label that is associated with a build. Build names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Version that is associated with a build or script. Version strings do not need to be unique.
     * </p>
     */
    private String version;

    /**
     * <p>
     * Unique identifier for a build to update.
     * </p>
     * 
     * @param buildId
     *        Unique identifier for a build to update.
     */

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    /**
     * <p>
     * Unique identifier for a build to update.
     * </p>
     * 
     * @return Unique identifier for a build to update.
     */

    public String getBuildId() {
        return this.buildId;
    }

    /**
     * <p>
     * Unique identifier for a build to update.
     * </p>
     * 
     * @param buildId
     *        Unique identifier for a build to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBuildRequest withBuildId(String buildId) {
        setBuildId(buildId);
        return this;
    }

    /**
     * <p>
     * Descriptive label that is associated with a build. Build names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a build. Build names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a build. Build names do not need to be unique.
     * </p>
     * 
     * @return Descriptive label that is associated with a build. Build names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a build. Build names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a build. Build names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBuildRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Version that is associated with a build or script. Version strings do not need to be unique.
     * </p>
     * 
     * @param version
     *        Version that is associated with a build or script. Version strings do not need to be unique.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Version that is associated with a build or script. Version strings do not need to be unique.
     * </p>
     * 
     * @return Version that is associated with a build or script. Version strings do not need to be unique.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version that is associated with a build or script. Version strings do not need to be unique.
     * </p>
     * 
     * @param version
     *        Version that is associated with a build or script. Version strings do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBuildRequest withVersion(String version) {
        setVersion(version);
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
        if (getBuildId() != null)
            sb.append("BuildId: ").append(getBuildId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBuildRequest == false)
            return false;
        UpdateBuildRequest other = (UpdateBuildRequest) obj;
        if (other.getBuildId() == null ^ this.getBuildId() == null)
            return false;
        if (other.getBuildId() != null && other.getBuildId().equals(this.getBuildId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuildId() == null) ? 0 : getBuildId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBuildRequest clone() {
        return (UpdateBuildRequest) super.clone();
    }

}
