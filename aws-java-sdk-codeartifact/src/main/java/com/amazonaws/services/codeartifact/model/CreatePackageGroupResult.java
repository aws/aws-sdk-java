/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CreatePackageGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePackageGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the created package group after processing the request.
     * </p>
     */
    private PackageGroupDescription packageGroup;

    /**
     * <p>
     * Information about the created package group after processing the request.
     * </p>
     * 
     * @param packageGroup
     *        Information about the created package group after processing the request.
     */

    public void setPackageGroup(PackageGroupDescription packageGroup) {
        this.packageGroup = packageGroup;
    }

    /**
     * <p>
     * Information about the created package group after processing the request.
     * </p>
     * 
     * @return Information about the created package group after processing the request.
     */

    public PackageGroupDescription getPackageGroup() {
        return this.packageGroup;
    }

    /**
     * <p>
     * Information about the created package group after processing the request.
     * </p>
     * 
     * @param packageGroup
     *        Information about the created package group after processing the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageGroupResult withPackageGroup(PackageGroupDescription packageGroup) {
        setPackageGroup(packageGroup);
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
        if (getPackageGroup() != null)
            sb.append("PackageGroup: ").append(getPackageGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePackageGroupResult == false)
            return false;
        CreatePackageGroupResult other = (CreatePackageGroupResult) obj;
        if (other.getPackageGroup() == null ^ this.getPackageGroup() == null)
            return false;
        if (other.getPackageGroup() != null && other.getPackageGroup().equals(this.getPackageGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageGroup() == null) ? 0 : getPackageGroup().hashCode());
        return hashCode;
    }

    @Override
    public CreatePackageGroupResult clone() {
        try {
            return (CreatePackageGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
