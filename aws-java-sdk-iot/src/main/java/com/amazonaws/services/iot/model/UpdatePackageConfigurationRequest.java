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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePackageConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Configuration to manage job's package version reporting. This updates the thing's reserved named shadow that the
     * job targets.
     * </p>
     */
    private VersionUpdateByJobsConfig versionUpdateByJobsConfig;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Configuration to manage job's package version reporting. This updates the thing's reserved named shadow that the
     * job targets.
     * </p>
     * 
     * @param versionUpdateByJobsConfig
     *        Configuration to manage job's package version reporting. This updates the thing's reserved named shadow
     *        that the job targets.
     */

    public void setVersionUpdateByJobsConfig(VersionUpdateByJobsConfig versionUpdateByJobsConfig) {
        this.versionUpdateByJobsConfig = versionUpdateByJobsConfig;
    }

    /**
     * <p>
     * Configuration to manage job's package version reporting. This updates the thing's reserved named shadow that the
     * job targets.
     * </p>
     * 
     * @return Configuration to manage job's package version reporting. This updates the thing's reserved named shadow
     *         that the job targets.
     */

    public VersionUpdateByJobsConfig getVersionUpdateByJobsConfig() {
        return this.versionUpdateByJobsConfig;
    }

    /**
     * <p>
     * Configuration to manage job's package version reporting. This updates the thing's reserved named shadow that the
     * job targets.
     * </p>
     * 
     * @param versionUpdateByJobsConfig
     *        Configuration to manage job's package version reporting. This updates the thing's reserved named shadow
     *        that the job targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageConfigurationRequest withVersionUpdateByJobsConfig(VersionUpdateByJobsConfig versionUpdateByJobsConfig) {
        setVersionUpdateByJobsConfig(versionUpdateByJobsConfig);
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @return A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *         reuse this client token if a new idempotent request is required.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageConfigurationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
            sb.append("VersionUpdateByJobsConfig: ").append(getVersionUpdateByJobsConfig()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePackageConfigurationRequest == false)
            return false;
        UpdatePackageConfigurationRequest other = (UpdatePackageConfigurationRequest) obj;
        if (other.getVersionUpdateByJobsConfig() == null ^ this.getVersionUpdateByJobsConfig() == null)
            return false;
        if (other.getVersionUpdateByJobsConfig() != null && other.getVersionUpdateByJobsConfig().equals(this.getVersionUpdateByJobsConfig()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersionUpdateByJobsConfig() == null) ? 0 : getVersionUpdateByJobsConfig().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePackageConfigurationRequest clone() {
        return (UpdatePackageConfigurationRequest) super.clone();
    }

}
