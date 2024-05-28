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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetAssociatedPackageGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssociatedPackageGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The package group that is associated with the requested package.
     * </p>
     */
    private PackageGroupDescription packageGroup;
    /**
     * <p>
     * Describes the strength of the association between the package and package group. A strong match is also known as
     * an exact match, and a weak match is known as a relative match.
     * </p>
     */
    private String associationType;

    /**
     * <p>
     * The package group that is associated with the requested package.
     * </p>
     * 
     * @param packageGroup
     *        The package group that is associated with the requested package.
     */

    public void setPackageGroup(PackageGroupDescription packageGroup) {
        this.packageGroup = packageGroup;
    }

    /**
     * <p>
     * The package group that is associated with the requested package.
     * </p>
     * 
     * @return The package group that is associated with the requested package.
     */

    public PackageGroupDescription getPackageGroup() {
        return this.packageGroup;
    }

    /**
     * <p>
     * The package group that is associated with the requested package.
     * </p>
     * 
     * @param packageGroup
     *        The package group that is associated with the requested package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssociatedPackageGroupResult withPackageGroup(PackageGroupDescription packageGroup) {
        setPackageGroup(packageGroup);
        return this;
    }

    /**
     * <p>
     * Describes the strength of the association between the package and package group. A strong match is also known as
     * an exact match, and a weak match is known as a relative match.
     * </p>
     * 
     * @param associationType
     *        Describes the strength of the association between the package and package group. A strong match is also
     *        known as an exact match, and a weak match is known as a relative match.
     * @see PackageGroupAssociationType
     */

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * Describes the strength of the association between the package and package group. A strong match is also known as
     * an exact match, and a weak match is known as a relative match.
     * </p>
     * 
     * @return Describes the strength of the association between the package and package group. A strong match is also
     *         known as an exact match, and a weak match is known as a relative match.
     * @see PackageGroupAssociationType
     */

    public String getAssociationType() {
        return this.associationType;
    }

    /**
     * <p>
     * Describes the strength of the association between the package and package group. A strong match is also known as
     * an exact match, and a weak match is known as a relative match.
     * </p>
     * 
     * @param associationType
     *        Describes the strength of the association between the package and package group. A strong match is also
     *        known as an exact match, and a weak match is known as a relative match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageGroupAssociationType
     */

    public GetAssociatedPackageGroupResult withAssociationType(String associationType) {
        setAssociationType(associationType);
        return this;
    }

    /**
     * <p>
     * Describes the strength of the association between the package and package group. A strong match is also known as
     * an exact match, and a weak match is known as a relative match.
     * </p>
     * 
     * @param associationType
     *        Describes the strength of the association between the package and package group. A strong match is also
     *        known as an exact match, and a weak match is known as a relative match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageGroupAssociationType
     */

    public GetAssociatedPackageGroupResult withAssociationType(PackageGroupAssociationType associationType) {
        this.associationType = associationType.toString();
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
            sb.append("PackageGroup: ").append(getPackageGroup()).append(",");
        if (getAssociationType() != null)
            sb.append("AssociationType: ").append(getAssociationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssociatedPackageGroupResult == false)
            return false;
        GetAssociatedPackageGroupResult other = (GetAssociatedPackageGroupResult) obj;
        if (other.getPackageGroup() == null ^ this.getPackageGroup() == null)
            return false;
        if (other.getPackageGroup() != null && other.getPackageGroup().equals(this.getPackageGroup()) == false)
            return false;
        if (other.getAssociationType() == null ^ this.getAssociationType() == null)
            return false;
        if (other.getAssociationType() != null && other.getAssociationType().equals(this.getAssociationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageGroup() == null) ? 0 : getPackageGroup().hashCode());
        hashCode = prime * hashCode + ((getAssociationType() == null) ? 0 : getAssociationType().hashCode());
        return hashCode;
    }

    @Override
    public GetAssociatedPackageGroupResult clone() {
        try {
            return (GetAssociatedPackageGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
