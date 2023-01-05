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
 * An output configuration for a package import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/PackageImportJobOutputConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageImportJobOutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The package version's output configuration.
     * </p>
     */
    private PackageVersionOutputConfig packageVersionOutputConfig;

    /**
     * <p>
     * The package version's output configuration.
     * </p>
     * 
     * @param packageVersionOutputConfig
     *        The package version's output configuration.
     */

    public void setPackageVersionOutputConfig(PackageVersionOutputConfig packageVersionOutputConfig) {
        this.packageVersionOutputConfig = packageVersionOutputConfig;
    }

    /**
     * <p>
     * The package version's output configuration.
     * </p>
     * 
     * @return The package version's output configuration.
     */

    public PackageVersionOutputConfig getPackageVersionOutputConfig() {
        return this.packageVersionOutputConfig;
    }

    /**
     * <p>
     * The package version's output configuration.
     * </p>
     * 
     * @param packageVersionOutputConfig
     *        The package version's output configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageImportJobOutputConfig withPackageVersionOutputConfig(PackageVersionOutputConfig packageVersionOutputConfig) {
        setPackageVersionOutputConfig(packageVersionOutputConfig);
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
        if (getPackageVersionOutputConfig() != null)
            sb.append("PackageVersionOutputConfig: ").append(getPackageVersionOutputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageImportJobOutputConfig == false)
            return false;
        PackageImportJobOutputConfig other = (PackageImportJobOutputConfig) obj;
        if (other.getPackageVersionOutputConfig() == null ^ this.getPackageVersionOutputConfig() == null)
            return false;
        if (other.getPackageVersionOutputConfig() != null && other.getPackageVersionOutputConfig().equals(this.getPackageVersionOutputConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageVersionOutputConfig() == null) ? 0 : getPackageVersionOutputConfig().hashCode());
        return hashCode;
    }

    @Override
    public PackageImportJobOutputConfig clone() {
        try {
            return (PackageImportJobOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.PackageImportJobOutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
