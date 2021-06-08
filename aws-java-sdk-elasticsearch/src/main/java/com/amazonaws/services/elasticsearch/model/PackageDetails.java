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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Basic information about a package.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Internal ID of the package.
     * </p>
     */
    private String packageID;
    /**
     * <p>
     * User specified name of the package.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * Currently supports only TXT-DICTIONARY.
     * </p>
     */
    private String packageType;
    /**
     * <p>
     * User-specified description of the package.
     * </p>
     */
    private String packageDescription;
    /**
     * <p>
     * Current state of the package. Values are COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     * </p>
     */
    private String packageStatus;
    /**
     * <p>
     * Timestamp which tells creation date of the package.
     * </p>
     */
    private java.util.Date createdAt;

    private java.util.Date lastUpdatedAt;

    private String availablePackageVersion;
    /**
     * <p>
     * Additional information if the package is in an error state. Null otherwise.
     * </p>
     */
    private ErrorDetails errorDetails;

    /**
     * <p>
     * Internal ID of the package.
     * </p>
     * 
     * @param packageID
     *        Internal ID of the package.
     */

    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    /**
     * <p>
     * Internal ID of the package.
     * </p>
     * 
     * @return Internal ID of the package.
     */

    public String getPackageID() {
        return this.packageID;
    }

    /**
     * <p>
     * Internal ID of the package.
     * </p>
     * 
     * @param packageID
     *        Internal ID of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageDetails withPackageID(String packageID) {
        setPackageID(packageID);
        return this;
    }

    /**
     * <p>
     * User specified name of the package.
     * </p>
     * 
     * @param packageName
     *        User specified name of the package.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * User specified name of the package.
     * </p>
     * 
     * @return User specified name of the package.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * User specified name of the package.
     * </p>
     * 
     * @param packageName
     *        User specified name of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageDetails withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * Currently supports only TXT-DICTIONARY.
     * </p>
     * 
     * @param packageType
     *        Currently supports only TXT-DICTIONARY.
     * @see PackageType
     */

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    /**
     * <p>
     * Currently supports only TXT-DICTIONARY.
     * </p>
     * 
     * @return Currently supports only TXT-DICTIONARY.
     * @see PackageType
     */

    public String getPackageType() {
        return this.packageType;
    }

    /**
     * <p>
     * Currently supports only TXT-DICTIONARY.
     * </p>
     * 
     * @param packageType
     *        Currently supports only TXT-DICTIONARY.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageType
     */

    public PackageDetails withPackageType(String packageType) {
        setPackageType(packageType);
        return this;
    }

    /**
     * <p>
     * Currently supports only TXT-DICTIONARY.
     * </p>
     * 
     * @param packageType
     *        Currently supports only TXT-DICTIONARY.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageType
     */

    public PackageDetails withPackageType(PackageType packageType) {
        this.packageType = packageType.toString();
        return this;
    }

    /**
     * <p>
     * User-specified description of the package.
     * </p>
     * 
     * @param packageDescription
     *        User-specified description of the package.
     */

    public void setPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
    }

    /**
     * <p>
     * User-specified description of the package.
     * </p>
     * 
     * @return User-specified description of the package.
     */

    public String getPackageDescription() {
        return this.packageDescription;
    }

    /**
     * <p>
     * User-specified description of the package.
     * </p>
     * 
     * @param packageDescription
     *        User-specified description of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageDetails withPackageDescription(String packageDescription) {
        setPackageDescription(packageDescription);
        return this;
    }

    /**
     * <p>
     * Current state of the package. Values are COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     * </p>
     * 
     * @param packageStatus
     *        Current state of the package. Values are COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     * @see PackageStatus
     */

    public void setPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
    }

    /**
     * <p>
     * Current state of the package. Values are COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     * </p>
     * 
     * @return Current state of the package. Values are COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     * @see PackageStatus
     */

    public String getPackageStatus() {
        return this.packageStatus;
    }

    /**
     * <p>
     * Current state of the package. Values are COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     * </p>
     * 
     * @param packageStatus
     *        Current state of the package. Values are COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageStatus
     */

    public PackageDetails withPackageStatus(String packageStatus) {
        setPackageStatus(packageStatus);
        return this;
    }

    /**
     * <p>
     * Current state of the package. Values are COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     * </p>
     * 
     * @param packageStatus
     *        Current state of the package. Values are COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageStatus
     */

    public PackageDetails withPackageStatus(PackageStatus packageStatus) {
        this.packageStatus = packageStatus.toString();
        return this;
    }

    /**
     * <p>
     * Timestamp which tells creation date of the package.
     * </p>
     * 
     * @param createdAt
     *        Timestamp which tells creation date of the package.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Timestamp which tells creation date of the package.
     * </p>
     * 
     * @return Timestamp which tells creation date of the package.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Timestamp which tells creation date of the package.
     * </p>
     * 
     * @param createdAt
     *        Timestamp which tells creation date of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageDetails withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * @param lastUpdatedAt
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * @return
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * @param lastUpdatedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageDetails withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * @param availablePackageVersion
     */

    public void setAvailablePackageVersion(String availablePackageVersion) {
        this.availablePackageVersion = availablePackageVersion;
    }

    /**
     * @return
     */

    public String getAvailablePackageVersion() {
        return this.availablePackageVersion;
    }

    /**
     * @param availablePackageVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageDetails withAvailablePackageVersion(String availablePackageVersion) {
        setAvailablePackageVersion(availablePackageVersion);
        return this;
    }

    /**
     * <p>
     * Additional information if the package is in an error state. Null otherwise.
     * </p>
     * 
     * @param errorDetails
     *        Additional information if the package is in an error state. Null otherwise.
     */

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * <p>
     * Additional information if the package is in an error state. Null otherwise.
     * </p>
     * 
     * @return Additional information if the package is in an error state. Null otherwise.
     */

    public ErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    /**
     * <p>
     * Additional information if the package is in an error state. Null otherwise.
     * </p>
     * 
     * @param errorDetails
     *        Additional information if the package is in an error state. Null otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageDetails withErrorDetails(ErrorDetails errorDetails) {
        setErrorDetails(errorDetails);
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
            sb.append("PackageID: ").append(getPackageID()).append(",");
        if (getPackageName() != null)
            sb.append("PackageName: ").append(getPackageName()).append(",");
        if (getPackageType() != null)
            sb.append("PackageType: ").append(getPackageType()).append(",");
        if (getPackageDescription() != null)
            sb.append("PackageDescription: ").append(getPackageDescription()).append(",");
        if (getPackageStatus() != null)
            sb.append("PackageStatus: ").append(getPackageStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getAvailablePackageVersion() != null)
            sb.append("AvailablePackageVersion: ").append(getAvailablePackageVersion()).append(",");
        if (getErrorDetails() != null)
            sb.append("ErrorDetails: ").append(getErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageDetails == false)
            return false;
        PackageDetails other = (PackageDetails) obj;
        if (other.getPackageID() == null ^ this.getPackageID() == null)
            return false;
        if (other.getPackageID() != null && other.getPackageID().equals(this.getPackageID()) == false)
            return false;
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
        if (other.getPackageStatus() == null ^ this.getPackageStatus() == null)
            return false;
        if (other.getPackageStatus() != null && other.getPackageStatus().equals(this.getPackageStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getAvailablePackageVersion() == null ^ this.getAvailablePackageVersion() == null)
            return false;
        if (other.getAvailablePackageVersion() != null && other.getAvailablePackageVersion().equals(this.getAvailablePackageVersion()) == false)
            return false;
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageID() == null) ? 0 : getPackageID().hashCode());
        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getPackageType() == null) ? 0 : getPackageType().hashCode());
        hashCode = prime * hashCode + ((getPackageDescription() == null) ? 0 : getPackageDescription().hashCode());
        hashCode = prime * hashCode + ((getPackageStatus() == null) ? 0 : getPackageStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getAvailablePackageVersion() == null) ? 0 : getAvailablePackageVersion().hashCode());
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public PackageDetails clone() {
        try {
            return (PackageDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.PackageDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
