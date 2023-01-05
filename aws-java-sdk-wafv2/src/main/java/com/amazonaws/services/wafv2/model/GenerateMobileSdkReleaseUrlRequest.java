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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GenerateMobileSdkReleaseUrl" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateMobileSdkReleaseUrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The device platform.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The release version. For the latest available version, specify <code>LATEST</code>.
     * </p>
     */
    private String releaseVersion;

    /**
     * <p>
     * The device platform.
     * </p>
     * 
     * @param platform
     *        The device platform.
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The device platform.
     * </p>
     * 
     * @return The device platform.
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The device platform.
     * </p>
     * 
     * @param platform
     *        The device platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public GenerateMobileSdkReleaseUrlRequest withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The device platform.
     * </p>
     * 
     * @param platform
     *        The device platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public GenerateMobileSdkReleaseUrlRequest withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The release version. For the latest available version, specify <code>LATEST</code>.
     * </p>
     * 
     * @param releaseVersion
     *        The release version. For the latest available version, specify <code>LATEST</code>.
     */

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    /**
     * <p>
     * The release version. For the latest available version, specify <code>LATEST</code>.
     * </p>
     * 
     * @return The release version. For the latest available version, specify <code>LATEST</code>.
     */

    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    /**
     * <p>
     * The release version. For the latest available version, specify <code>LATEST</code>.
     * </p>
     * 
     * @param releaseVersion
     *        The release version. For the latest available version, specify <code>LATEST</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateMobileSdkReleaseUrlRequest withReleaseVersion(String releaseVersion) {
        setReleaseVersion(releaseVersion);
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
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getReleaseVersion() != null)
            sb.append("ReleaseVersion: ").append(getReleaseVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateMobileSdkReleaseUrlRequest == false)
            return false;
        GenerateMobileSdkReleaseUrlRequest other = (GenerateMobileSdkReleaseUrlRequest) obj;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getReleaseVersion() == null ^ this.getReleaseVersion() == null)
            return false;
        if (other.getReleaseVersion() != null && other.getReleaseVersion().equals(this.getReleaseVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getReleaseVersion() == null) ? 0 : getReleaseVersion().hashCode());
        return hashCode;
    }

    @Override
    public GenerateMobileSdkReleaseUrlRequest clone() {
        return (GenerateMobileSdkReleaseUrlRequest) super.clone();
    }

}
