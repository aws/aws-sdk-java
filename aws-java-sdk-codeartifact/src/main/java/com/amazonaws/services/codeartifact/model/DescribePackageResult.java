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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DescribePackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePackageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDescription.html">
     * PackageDescription</a> object that contains information about the requested package.
     * </p>
     */
    private PackageDescription packageValue;

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDescription.html">
     * PackageDescription</a> object that contains information about the requested package.
     * </p>
     * 
     * @param packageValue
     *        A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDescription.html">
     *        PackageDescription</a> object that contains information about the requested package.
     */

    public void setPackage(PackageDescription packageValue) {
        this.packageValue = packageValue;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDescription.html">
     * PackageDescription</a> object that contains information about the requested package.
     * </p>
     * 
     * @return A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDescription.html">
     *         PackageDescription</a> object that contains information about the requested package.
     */

    public PackageDescription getPackage() {
        return this.packageValue;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDescription.html">
     * PackageDescription</a> object that contains information about the requested package.
     * </p>
     * 
     * @param packageValue
     *        A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDescription.html">
     *        PackageDescription</a> object that contains information about the requested package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageResult withPackage(PackageDescription packageValue) {
        setPackage(packageValue);
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
        if (getPackage() != null)
            sb.append("Package: ").append(getPackage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePackageResult == false)
            return false;
        DescribePackageResult other = (DescribePackageResult) obj;
        if (other.getPackage() == null ^ this.getPackage() == null)
            return false;
        if (other.getPackage() != null && other.getPackage().equals(this.getPackage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackage() == null) ? 0 : getPackage().hashCode());
        return hashCode;
    }

    @Override
    public DescribePackageResult clone() {
        try {
            return (DescribePackageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
