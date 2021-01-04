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

/**
 * <p>
 * Container for response returned by <code> <a>CreatePackage</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePackageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the package <code>PackageDetails</code>.
     * </p>
     */
    private PackageDetails packageDetails;

    /**
     * <p>
     * Information about the package <code>PackageDetails</code>.
     * </p>
     * 
     * @param packageDetails
     *        Information about the package <code>PackageDetails</code>.
     */

    public void setPackageDetails(PackageDetails packageDetails) {
        this.packageDetails = packageDetails;
    }

    /**
     * <p>
     * Information about the package <code>PackageDetails</code>.
     * </p>
     * 
     * @return Information about the package <code>PackageDetails</code>.
     */

    public PackageDetails getPackageDetails() {
        return this.packageDetails;
    }

    /**
     * <p>
     * Information about the package <code>PackageDetails</code>.
     * </p>
     * 
     * @param packageDetails
     *        Information about the package <code>PackageDetails</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageResult withPackageDetails(PackageDetails packageDetails) {
        setPackageDetails(packageDetails);
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
        if (getPackageDetails() != null)
            sb.append("PackageDetails: ").append(getPackageDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePackageResult == false)
            return false;
        CreatePackageResult other = (CreatePackageResult) obj;
        if (other.getPackageDetails() == null ^ this.getPackageDetails() == null)
            return false;
        if (other.getPackageDetails() != null && other.getPackageDetails().equals(this.getPackageDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageDetails() == null) ? 0 : getPackageDetails().hashCode());
        return hashCode;
    }

    @Override
    public CreatePackageResult clone() {
        try {
            return (CreatePackageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
