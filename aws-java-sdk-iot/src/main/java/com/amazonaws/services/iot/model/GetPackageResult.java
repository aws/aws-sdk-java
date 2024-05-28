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
public class GetPackageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the software package.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * The ARN for the package.
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
     * The name of the default package version.
     * </p>
     */
    private String defaultVersionName;
    /**
     * <p>
     * The date the package was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date when the package was last updated.
     * </p>
     */
    private java.util.Date lastModifiedDate;

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

    public GetPackageResult withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * The ARN for the package.
     * </p>
     * 
     * @param packageArn
     *        The ARN for the package.
     */

    public void setPackageArn(String packageArn) {
        this.packageArn = packageArn;
    }

    /**
     * <p>
     * The ARN for the package.
     * </p>
     * 
     * @return The ARN for the package.
     */

    public String getPackageArn() {
        return this.packageArn;
    }

    /**
     * <p>
     * The ARN for the package.
     * </p>
     * 
     * @param packageArn
     *        The ARN for the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageResult withPackageArn(String packageArn) {
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

    public GetPackageResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the default package version.
     * </p>
     * 
     * @param defaultVersionName
     *        The name of the default package version.
     */

    public void setDefaultVersionName(String defaultVersionName) {
        this.defaultVersionName = defaultVersionName;
    }

    /**
     * <p>
     * The name of the default package version.
     * </p>
     * 
     * @return The name of the default package version.
     */

    public String getDefaultVersionName() {
        return this.defaultVersionName;
    }

    /**
     * <p>
     * The name of the default package version.
     * </p>
     * 
     * @param defaultVersionName
     *        The name of the default package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageResult withDefaultVersionName(String defaultVersionName) {
        setDefaultVersionName(defaultVersionName);
        return this;
    }

    /**
     * <p>
     * The date the package was created.
     * </p>
     * 
     * @param creationDate
     *        The date the package was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the package was created.
     * </p>
     * 
     * @return The date the package was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the package was created.
     * </p>
     * 
     * @param creationDate
     *        The date the package was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date when the package was last updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date when the package was last updated.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date when the package was last updated.
     * </p>
     * 
     * @return The date when the package was last updated.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date when the package was last updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date when the package was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDefaultVersionName() != null)
            sb.append("DefaultVersionName: ").append(getDefaultVersionName()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPackageResult == false)
            return false;
        GetPackageResult other = (GetPackageResult) obj;
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
        if (other.getDefaultVersionName() == null ^ this.getDefaultVersionName() == null)
            return false;
        if (other.getDefaultVersionName() != null && other.getDefaultVersionName().equals(this.getDefaultVersionName()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
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
        hashCode = prime * hashCode + ((getDefaultVersionName() == null) ? 0 : getDefaultVersionName().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public GetPackageResult clone() {
        try {
            return (GetPackageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
