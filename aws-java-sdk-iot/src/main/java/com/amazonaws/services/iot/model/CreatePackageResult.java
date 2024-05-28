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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePackageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the software package.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the package.
     * </p>
     */
    private String packageArn;
    /**
     * <p>
     * The package description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the software package.
     * </p>
     * 
     * @param packageName
     *        The name of the software package.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The name of the software package.
     * </p>
     * 
     * @return The name of the software package.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * The name of the software package.
     * </p>
     * 
     * @param packageName
     *        The name of the software package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageResult withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the package.
     * </p>
     * 
     * @param packageArn
     *        The Amazon Resource Name (ARN) for the package.
     */

    public void setPackageArn(String packageArn) {
        this.packageArn = packageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the package.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the package.
     */

    public String getPackageArn() {
        return this.packageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the package.
     * </p>
     * 
     * @param packageArn
     *        The Amazon Resource Name (ARN) for the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageResult withPackageArn(String packageArn) {
        setPackageArn(packageArn);
        return this;
    }

    /**
     * <p>
     * The package description.
     * </p>
     * 
     * @param description
     *        The package description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The package description.
     * </p>
     * 
     * @return The package description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The package description.
     * </p>
     * 
     * @param description
     *        The package description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageResult withDescription(String description) {
        setDescription(description);
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
        if (getPackageArn() != null)
            sb.append("PackageArn: ").append(getPackageArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***");
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
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getPackageArn() == null ^ this.getPackageArn() == null)
            return false;
        if (other.getPackageArn() != null && other.getPackageArn().equals(this.getPackageArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getPackageArn() == null) ? 0 : getPackageArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
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
