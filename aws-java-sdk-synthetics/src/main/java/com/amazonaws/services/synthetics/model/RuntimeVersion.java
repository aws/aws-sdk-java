/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains information about one canary runtime version. For more information about runtime versions,
 * see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
 * Canary Runtime Versions</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/RuntimeVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuntimeVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the runtime version. For a list of valid runtime versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * A description of the runtime version, created by Amazon.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date that the runtime version was released.
     * </p>
     */
    private java.util.Date releaseDate;
    /**
     * <p>
     * If this runtime version is deprecated, this value is the date of deprecation.
     * </p>
     */
    private java.util.Date deprecationDate;

    /**
     * <p>
     * The name of the runtime version. For a list of valid runtime versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     * 
     * @param versionName
     *        The name of the runtime version. For a list of valid runtime versions, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     *        > Canary Runtime Versions</a>.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The name of the runtime version. For a list of valid runtime versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     * 
     * @return The name of the runtime version. For a list of valid runtime versions, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     *         > Canary Runtime Versions</a>.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * The name of the runtime version. For a list of valid runtime versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     * 
     * @param versionName
     *        The name of the runtime version. For a list of valid runtime versions, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     *        > Canary Runtime Versions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeVersion withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * A description of the runtime version, created by Amazon.
     * </p>
     * 
     * @param description
     *        A description of the runtime version, created by Amazon.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the runtime version, created by Amazon.
     * </p>
     * 
     * @return A description of the runtime version, created by Amazon.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the runtime version, created by Amazon.
     * </p>
     * 
     * @param description
     *        A description of the runtime version, created by Amazon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeVersion withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date that the runtime version was released.
     * </p>
     * 
     * @param releaseDate
     *        The date that the runtime version was released.
     */

    public void setReleaseDate(java.util.Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * <p>
     * The date that the runtime version was released.
     * </p>
     * 
     * @return The date that the runtime version was released.
     */

    public java.util.Date getReleaseDate() {
        return this.releaseDate;
    }

    /**
     * <p>
     * The date that the runtime version was released.
     * </p>
     * 
     * @param releaseDate
     *        The date that the runtime version was released.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeVersion withReleaseDate(java.util.Date releaseDate) {
        setReleaseDate(releaseDate);
        return this;
    }

    /**
     * <p>
     * If this runtime version is deprecated, this value is the date of deprecation.
     * </p>
     * 
     * @param deprecationDate
     *        If this runtime version is deprecated, this value is the date of deprecation.
     */

    public void setDeprecationDate(java.util.Date deprecationDate) {
        this.deprecationDate = deprecationDate;
    }

    /**
     * <p>
     * If this runtime version is deprecated, this value is the date of deprecation.
     * </p>
     * 
     * @return If this runtime version is deprecated, this value is the date of deprecation.
     */

    public java.util.Date getDeprecationDate() {
        return this.deprecationDate;
    }

    /**
     * <p>
     * If this runtime version is deprecated, this value is the date of deprecation.
     * </p>
     * 
     * @param deprecationDate
     *        If this runtime version is deprecated, this value is the date of deprecation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeVersion withDeprecationDate(java.util.Date deprecationDate) {
        setDeprecationDate(deprecationDate);
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
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getReleaseDate() != null)
            sb.append("ReleaseDate: ").append(getReleaseDate()).append(",");
        if (getDeprecationDate() != null)
            sb.append("DeprecationDate: ").append(getDeprecationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuntimeVersion == false)
            return false;
        RuntimeVersion other = (RuntimeVersion) obj;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getReleaseDate() == null ^ this.getReleaseDate() == null)
            return false;
        if (other.getReleaseDate() != null && other.getReleaseDate().equals(this.getReleaseDate()) == false)
            return false;
        if (other.getDeprecationDate() == null ^ this.getDeprecationDate() == null)
            return false;
        if (other.getDeprecationDate() != null && other.getDeprecationDate().equals(this.getDeprecationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getReleaseDate() == null) ? 0 : getReleaseDate().hashCode());
        hashCode = prime * hashCode + ((getDeprecationDate() == null) ? 0 : getDeprecationDate().hashCode());
        return hashCode;
    }

    @Override
    public RuntimeVersion clone() {
        try {
            return (RuntimeVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.RuntimeVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
