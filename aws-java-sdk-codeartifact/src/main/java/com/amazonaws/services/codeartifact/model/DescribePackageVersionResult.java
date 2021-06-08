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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DescribePackageVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePackageVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html">
     * PackageVersionDescription</a> object that contains information about the requested package version.
     * </p>
     */
    private PackageVersionDescription packageVersion;

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html">
     * PackageVersionDescription</a> object that contains information about the requested package version.
     * </p>
     * 
     * @param packageVersion
     *        A <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html"
     *        >PackageVersionDescription</a> object that contains information about the requested package version.
     */

    public void setPackageVersion(PackageVersionDescription packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html">
     * PackageVersionDescription</a> object that contains information about the requested package version.
     * </p>
     * 
     * @return A <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html"
     *         >PackageVersionDescription</a> object that contains information about the requested package version.
     */

    public PackageVersionDescription getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html">
     * PackageVersionDescription</a> object that contains information about the requested package version.
     * </p>
     * 
     * @param packageVersion
     *        A <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html"
     *        >PackageVersionDescription</a> object that contains information about the requested package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageVersionResult withPackageVersion(PackageVersionDescription packageVersion) {
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

        if (obj instanceof DescribePackageVersionResult == false)
            return false;
        DescribePackageVersionResult other = (DescribePackageVersionResult) obj;
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

        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribePackageVersionResult clone() {
        try {
            return (DescribePackageVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
