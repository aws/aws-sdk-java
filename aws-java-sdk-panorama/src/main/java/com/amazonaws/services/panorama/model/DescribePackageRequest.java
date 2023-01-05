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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePackageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The package's ID.
     * </p>
     */
    private String packageId;

    /**
     * <p>
     * The package's ID.
     * </p>
     * 
     * @param packageId
     *        The package's ID.
     */

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    /**
     * <p>
     * The package's ID.
     * </p>
     * 
     * @return The package's ID.
     */

    public String getPackageId() {
        return this.packageId;
    }

    /**
     * <p>
     * The package's ID.
     * </p>
     * 
     * @param packageId
     *        The package's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageRequest withPackageId(String packageId) {
        setPackageId(packageId);
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
        if (getPackageId() != null)
            sb.append("PackageId: ").append(getPackageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePackageRequest == false)
            return false;
        DescribePackageRequest other = (DescribePackageRequest) obj;
        if (other.getPackageId() == null ^ this.getPackageId() == null)
            return false;
        if (other.getPackageId() != null && other.getPackageId().equals(this.getPackageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageId() == null) ? 0 : getPackageId().hashCode());
        return hashCode;
    }

    @Override
    public DescribePackageRequest clone() {
        return (DescribePackageRequest) super.clone();
    }

}
