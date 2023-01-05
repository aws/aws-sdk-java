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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A package version output configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/PackageVersionOutputConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageVersionOutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates that the version is recommended for all users.
     * </p>
     */
    private Boolean markLatest;
    /**
     * <p>
     * The output's package name.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * The output's package version.
     * </p>
     */
    private String packageVersion;

    /**
     * <p>
     * Indicates that the version is recommended for all users.
     * </p>
     * 
     * @param markLatest
     *        Indicates that the version is recommended for all users.
     */

    public void setMarkLatest(Boolean markLatest) {
        this.markLatest = markLatest;
    }

    /**
     * <p>
     * Indicates that the version is recommended for all users.
     * </p>
     * 
     * @return Indicates that the version is recommended for all users.
     */

    public Boolean getMarkLatest() {
        return this.markLatest;
    }

    /**
     * <p>
     * Indicates that the version is recommended for all users.
     * </p>
     * 
     * @param markLatest
     *        Indicates that the version is recommended for all users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionOutputConfig withMarkLatest(Boolean markLatest) {
        setMarkLatest(markLatest);
        return this;
    }

    /**
     * <p>
     * Indicates that the version is recommended for all users.
     * </p>
     * 
     * @return Indicates that the version is recommended for all users.
     */

    public Boolean isMarkLatest() {
        return this.markLatest;
    }

    /**
     * <p>
     * The output's package name.
     * </p>
     * 
     * @param packageName
     *        The output's package name.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The output's package name.
     * </p>
     * 
     * @return The output's package name.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * The output's package name.
     * </p>
     * 
     * @param packageName
     *        The output's package name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionOutputConfig withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * The output's package version.
     * </p>
     * 
     * @param packageVersion
     *        The output's package version.
     */

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * The output's package version.
     * </p>
     * 
     * @return The output's package version.
     */

    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * <p>
     * The output's package version.
     * </p>
     * 
     * @param packageVersion
     *        The output's package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionOutputConfig withPackageVersion(String packageVersion) {
        setPackageVersion(packageVersion);
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
        if (getMarkLatest() != null)
            sb.append("MarkLatest: ").append(getMarkLatest()).append(",");
        if (getPackageName() != null)
            sb.append("PackageName: ").append(getPackageName()).append(",");
        if (getPackageVersion() != null)
            sb.append("PackageVersion: ").append(getPackageVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageVersionOutputConfig == false)
            return false;
        PackageVersionOutputConfig other = (PackageVersionOutputConfig) obj;
        if (other.getMarkLatest() == null ^ this.getMarkLatest() == null)
            return false;
        if (other.getMarkLatest() != null && other.getMarkLatest().equals(this.getMarkLatest()) == false)
            return false;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null && other.getPackageVersion().equals(this.getPackageVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarkLatest() == null) ? 0 : getMarkLatest().hashCode());
        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        return hashCode;
    }

    @Override
    public PackageVersionOutputConfig clone() {
        try {
            return (PackageVersionOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.PackageVersionOutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
