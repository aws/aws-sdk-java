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
 * Container for request parameters to <code> <a>CreatePackage</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePackageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the package.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * Type of package. Currently supports only TXT-DICTIONARY.
     * </p>
     */
    private String packageType;
    /**
     * <p>
     * Description of the package.
     * </p>
     */
    private String packageDescription;
    /**
     * <p>
     * The customer S3 location <code>PackageSource</code> for importing the package.
     * </p>
     */
    private PackageSource packageSource;

    /**
     * <p>
     * Unique identifier for the package.
     * </p>
     * 
     * @param packageName
     *        Unique identifier for the package.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * Unique identifier for the package.
     * </p>
     * 
     * @return Unique identifier for the package.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * Unique identifier for the package.
     * </p>
     * 
     * @param packageName
     *        Unique identifier for the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageRequest withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * Type of package. Currently supports only TXT-DICTIONARY.
     * </p>
     * 
     * @param packageType
     *        Type of package. Currently supports only TXT-DICTIONARY.
     * @see PackageType
     */

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    /**
     * <p>
     * Type of package. Currently supports only TXT-DICTIONARY.
     * </p>
     * 
     * @return Type of package. Currently supports only TXT-DICTIONARY.
     * @see PackageType
     */

    public String getPackageType() {
        return this.packageType;
    }

    /**
     * <p>
     * Type of package. Currently supports only TXT-DICTIONARY.
     * </p>
     * 
     * @param packageType
     *        Type of package. Currently supports only TXT-DICTIONARY.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageType
     */

    public CreatePackageRequest withPackageType(String packageType) {
        setPackageType(packageType);
        return this;
    }

    /**
     * <p>
     * Type of package. Currently supports only TXT-DICTIONARY.
     * </p>
     * 
     * @param packageType
     *        Type of package. Currently supports only TXT-DICTIONARY.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageType
     */

    public CreatePackageRequest withPackageType(PackageType packageType) {
        this.packageType = packageType.toString();
        return this;
    }

    /**
     * <p>
     * Description of the package.
     * </p>
     * 
     * @param packageDescription
     *        Description of the package.
     */

    public void setPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
    }

    /**
     * <p>
     * Description of the package.
     * </p>
     * 
     * @return Description of the package.
     */

    public String getPackageDescription() {
        return this.packageDescription;
    }

    /**
     * <p>
     * Description of the package.
     * </p>
     * 
     * @param packageDescription
     *        Description of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageRequest withPackageDescription(String packageDescription) {
        setPackageDescription(packageDescription);
        return this;
    }

    /**
     * <p>
     * The customer S3 location <code>PackageSource</code> for importing the package.
     * </p>
     * 
     * @param packageSource
     *        The customer S3 location <code>PackageSource</code> for importing the package.
     */

    public void setPackageSource(PackageSource packageSource) {
        this.packageSource = packageSource;
    }

    /**
     * <p>
     * The customer S3 location <code>PackageSource</code> for importing the package.
     * </p>
     * 
     * @return The customer S3 location <code>PackageSource</code> for importing the package.
     */

    public PackageSource getPackageSource() {
        return this.packageSource;
    }

    /**
     * <p>
     * The customer S3 location <code>PackageSource</code> for importing the package.
     * </p>
     * 
     * @param packageSource
     *        The customer S3 location <code>PackageSource</code> for importing the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageRequest withPackageSource(PackageSource packageSource) {
        setPackageSource(packageSource);
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
        if (getPackageName() != null)
            sb.append("PackageName: ").append(getPackageName()).append(",");
        if (getPackageType() != null)
            sb.append("PackageType: ").append(getPackageType()).append(",");
        if (getPackageDescription() != null)
            sb.append("PackageDescription: ").append(getPackageDescription()).append(",");
        if (getPackageSource() != null)
            sb.append("PackageSource: ").append(getPackageSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePackageRequest == false)
            return false;
        CreatePackageRequest other = (CreatePackageRequest) obj;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getPackageType() == null ^ this.getPackageType() == null)
            return false;
        if (other.getPackageType() != null && other.getPackageType().equals(this.getPackageType()) == false)
            return false;
        if (other.getPackageDescription() == null ^ this.getPackageDescription() == null)
            return false;
        if (other.getPackageDescription() != null && other.getPackageDescription().equals(this.getPackageDescription()) == false)
            return false;
        if (other.getPackageSource() == null ^ this.getPackageSource() == null)
            return false;
        if (other.getPackageSource() != null && other.getPackageSource().equals(this.getPackageSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getPackageType() == null) ? 0 : getPackageType().hashCode());
        hashCode = prime * hashCode + ((getPackageDescription() == null) ? 0 : getPackageDescription().hashCode());
        hashCode = prime * hashCode + ((getPackageSource() == null) ? 0 : getPackageSource().hashCode());
        return hashCode;
    }

    @Override
    public CreatePackageRequest clone() {
        return (CreatePackageRequest) super.clone();
    }

}
