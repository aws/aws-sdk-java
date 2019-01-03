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
package com.amazonaws.services.mobile.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request structure used to request generation of custom SDK and tool packages required to integrate mobile web or app
 * clients with backed AWS resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ExportBundle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportBundleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique bundle identifier.
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * Unique project identifier.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * Developer desktop or target application platform.
     * </p>
     */
    private String platform;

    /**
     * <p>
     * Unique bundle identifier.
     * </p>
     * 
     * @param bundleId
     *        Unique bundle identifier.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * Unique bundle identifier.
     * </p>
     * 
     * @return Unique bundle identifier.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * Unique bundle identifier.
     * </p>
     * 
     * @param bundleId
     *        Unique bundle identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportBundleRequest withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * Unique project identifier.
     * </p>
     * 
     * @param projectId
     *        Unique project identifier.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * Unique project identifier.
     * </p>
     * 
     * @return Unique project identifier.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * Unique project identifier.
     * </p>
     * 
     * @param projectId
     *        Unique project identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportBundleRequest withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * Developer desktop or target application platform.
     * </p>
     * 
     * @param platform
     *        Developer desktop or target application platform.
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * Developer desktop or target application platform.
     * </p>
     * 
     * @return Developer desktop or target application platform.
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * Developer desktop or target application platform.
     * </p>
     * 
     * @param platform
     *        Developer desktop or target application platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ExportBundleRequest withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * Developer desktop or target application platform.
     * </p>
     * 
     * @param platform
     *        Developer desktop or target application platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ExportBundleRequest withPlatform(Platform platform) {
        this.platform = platform.toString();
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
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportBundleRequest == false)
            return false;
        ExportBundleRequest other = (ExportBundleRequest) obj;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        return hashCode;
    }

    @Override
    public ExportBundleRequest clone() {
        return (ExportBundleRequest) super.clone();
    }

}
