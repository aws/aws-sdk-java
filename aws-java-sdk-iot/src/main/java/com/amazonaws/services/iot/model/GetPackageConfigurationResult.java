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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPackageConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The version that is associated to a specific job.
     * </p>
     */
    private VersionUpdateByJobsConfig versionUpdateByJobsConfig;

    /**
     * <p>
     * The version that is associated to a specific job.
     * </p>
     * 
     * @param versionUpdateByJobsConfig
     *        The version that is associated to a specific job.
     */

    public void setVersionUpdateByJobsConfig(VersionUpdateByJobsConfig versionUpdateByJobsConfig) {
        this.versionUpdateByJobsConfig = versionUpdateByJobsConfig;
    }

    /**
     * <p>
     * The version that is associated to a specific job.
     * </p>
     * 
     * @return The version that is associated to a specific job.
     */

    public VersionUpdateByJobsConfig getVersionUpdateByJobsConfig() {
        return this.versionUpdateByJobsConfig;
    }

    /**
     * <p>
     * The version that is associated to a specific job.
     * </p>
     * 
     * @param versionUpdateByJobsConfig
     *        The version that is associated to a specific job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageConfigurationResult withVersionUpdateByJobsConfig(VersionUpdateByJobsConfig versionUpdateByJobsConfig) {
        setVersionUpdateByJobsConfig(versionUpdateByJobsConfig);
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
        if (getVersionUpdateByJobsConfig() != null)
            sb.append("VersionUpdateByJobsConfig: ").append(getVersionUpdateByJobsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPackageConfigurationResult == false)
            return false;
        GetPackageConfigurationResult other = (GetPackageConfigurationResult) obj;
        if (other.getVersionUpdateByJobsConfig() == null ^ this.getVersionUpdateByJobsConfig() == null)
            return false;
        if (other.getVersionUpdateByJobsConfig() != null && other.getVersionUpdateByJobsConfig().equals(this.getVersionUpdateByJobsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersionUpdateByJobsConfig() == null) ? 0 : getVersionUpdateByJobsConfig().hashCode());
        return hashCode;
    }

    @Override
    public GetPackageConfigurationResult clone() {
        try {
            return (GetPackageConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
