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
public class GetPackageVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN for the package version.
     * </p>
     */
    private String packageVersionArn;
    /**
     * <p>
     * The name of the software package.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * The name of the package version.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * The package version description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Metadata that were added to the package version that can be used to define a package version’s configuration.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * The status associated to the package version. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Error reason for a package version failure during creation or update.
     * </p>
     */
    private String errorReason;
    /**
     * <p>
     * The date when the package version was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date when the package version was last updated.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The ARN for the package version.
     * </p>
     * 
     * @param packageVersionArn
     *        The ARN for the package version.
     */

    public void setPackageVersionArn(String packageVersionArn) {
        this.packageVersionArn = packageVersionArn;
    }

    /**
     * <p>
     * The ARN for the package version.
     * </p>
     * 
     * @return The ARN for the package version.
     */

    public String getPackageVersionArn() {
        return this.packageVersionArn;
    }

    /**
     * <p>
     * The ARN for the package version.
     * </p>
     * 
     * @param packageVersionArn
     *        The ARN for the package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionResult withPackageVersionArn(String packageVersionArn) {
        setPackageVersionArn(packageVersionArn);
        return this;
    }

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

    public GetPackageVersionResult withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * The name of the package version.
     * </p>
     * 
     * @param versionName
     *        The name of the package version.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The name of the package version.
     * </p>
     * 
     * @return The name of the package version.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * The name of the package version.
     * </p>
     * 
     * @param versionName
     *        The name of the package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionResult withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * The package version description.
     * </p>
     * 
     * @param description
     *        The package version description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The package version description.
     * </p>
     * 
     * @return The package version description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The package version description.
     * </p>
     * 
     * @param description
     *        The package version description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Metadata that were added to the package version that can be used to define a package version’s configuration.
     * </p>
     * 
     * @return Metadata that were added to the package version that can be used to define a package version’s
     *         configuration.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Metadata that were added to the package version that can be used to define a package version’s configuration.
     * </p>
     * 
     * @param attributes
     *        Metadata that were added to the package version that can be used to define a package version’s
     *        configuration.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Metadata that were added to the package version that can be used to define a package version’s configuration.
     * </p>
     * 
     * @param attributes
     *        Metadata that were added to the package version that can be used to define a package version’s
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionResult withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see GetPackageVersionResult#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionResult addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionResult clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The status associated to the package version. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * 
     * @param status
     *        The status associated to the package version. For more information, see <a href=
     *        "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *        >Package version lifecycle</a>.
     * @see PackageVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status associated to the package version. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * 
     * @return The status associated to the package version. For more information, see <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *         >Package version lifecycle</a>.
     * @see PackageVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status associated to the package version. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * 
     * @param status
     *        The status associated to the package version. For more information, see <a href=
     *        "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *        >Package version lifecycle</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public GetPackageVersionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status associated to the package version. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * 
     * @param status
     *        The status associated to the package version. For more information, see <a href=
     *        "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *        >Package version lifecycle</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public GetPackageVersionResult withStatus(PackageVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Error reason for a package version failure during creation or update.
     * </p>
     * 
     * @param errorReason
     *        Error reason for a package version failure during creation or update.
     */

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    /**
     * <p>
     * Error reason for a package version failure during creation or update.
     * </p>
     * 
     * @return Error reason for a package version failure during creation or update.
     */

    public String getErrorReason() {
        return this.errorReason;
    }

    /**
     * <p>
     * Error reason for a package version failure during creation or update.
     * </p>
     * 
     * @param errorReason
     *        Error reason for a package version failure during creation or update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionResult withErrorReason(String errorReason) {
        setErrorReason(errorReason);
        return this;
    }

    /**
     * <p>
     * The date when the package version was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the package version was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the package version was created.
     * </p>
     * 
     * @return The date when the package version was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date when the package version was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the package version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date when the package version was last updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date when the package version was last updated.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date when the package version was last updated.
     * </p>
     * 
     * @return The date when the package version was last updated.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date when the package version was last updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date when the package version was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionResult withLastModifiedDate(java.util.Date lastModifiedDate) {
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
        if (getPackageVersionArn() != null)
            sb.append("PackageVersionArn: ").append(getPackageVersionArn()).append(",");
        if (getPackageName() != null)
            sb.append("PackageName: ").append(getPackageName()).append(",");
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorReason() != null)
            sb.append("ErrorReason: ").append(getErrorReason()).append(",");
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

        if (obj instanceof GetPackageVersionResult == false)
            return false;
        GetPackageVersionResult other = (GetPackageVersionResult) obj;
        if (other.getPackageVersionArn() == null ^ this.getPackageVersionArn() == null)
            return false;
        if (other.getPackageVersionArn() != null && other.getPackageVersionArn().equals(this.getPackageVersionArn()) == false)
            return false;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorReason() == null ^ this.getErrorReason() == null)
            return false;
        if (other.getErrorReason() != null && other.getErrorReason().equals(this.getErrorReason()) == false)
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

        hashCode = prime * hashCode + ((getPackageVersionArn() == null) ? 0 : getPackageVersionArn().hashCode());
        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorReason() == null) ? 0 : getErrorReason().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public GetPackageVersionResult clone() {
        try {
            return (GetPackageVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
