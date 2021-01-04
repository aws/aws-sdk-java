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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for request parameters to <code> <a>DeletePackage</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePackageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Internal ID of the package that you want to delete. Use <code>DescribePackages</code> to find this value.
     * </p>
     */
    private String packageID;

    /**
     * <p>
     * Internal ID of the package that you want to delete. Use <code>DescribePackages</code> to find this value.
     * </p>
     * 
     * @param packageID
     *        Internal ID of the package that you want to delete. Use <code>DescribePackages</code> to find this value.
     */

    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    /**
     * <p>
     * Internal ID of the package that you want to delete. Use <code>DescribePackages</code> to find this value.
     * </p>
     * 
     * @return Internal ID of the package that you want to delete. Use <code>DescribePackages</code> to find this value.
     */

    public String getPackageID() {
        return this.packageID;
    }

    /**
     * <p>
     * Internal ID of the package that you want to delete. Use <code>DescribePackages</code> to find this value.
     * </p>
     * 
     * @param packageID
     *        Internal ID of the package that you want to delete. Use <code>DescribePackages</code> to find this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePackageRequest withPackageID(String packageID) {
        setPackageID(packageID);
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
        if (getPackageID() != null)
            sb.append("PackageID: ").append(getPackageID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePackageRequest == false)
            return false;
        DeletePackageRequest other = (DeletePackageRequest) obj;
        if (other.getPackageID() == null ^ this.getPackageID() == null)
            return false;
        if (other.getPackageID() != null && other.getPackageID().equals(this.getPackageID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageID() == null) ? 0 : getPackageID().hashCode());
        return hashCode;
    }

    @Override
    public DeletePackageRequest clone() {
        return (DeletePackageRequest) super.clone();
    }

}
