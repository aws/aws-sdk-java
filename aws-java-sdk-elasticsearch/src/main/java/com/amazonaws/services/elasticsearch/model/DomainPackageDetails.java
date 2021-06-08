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
 * Information on a package that is associated with a domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainPackageDetails implements Serializable, Cloneable, StructuredPojo {

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
     * Timestamp of the most-recent update to the association status.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * Name of the domain you've associated a package with.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * State of the association. Values are ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     * </p>
     */
    private String domainPackageStatus;

    private String packageVersion;
    /**
     * <p>
     * The relative path on Amazon ES nodes, which can be used as synonym_path when the package is synonym file.
     * </p>
     */
    private String referencePath;
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

    public DomainPackageDetails withPackageID(String packageID) {
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

    public DomainPackageDetails withPackageName(String packageName) {
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

    public DomainPackageDetails withPackageType(String packageType) {
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

    public DomainPackageDetails withPackageType(PackageType packageType) {
        this.packageType = packageType.toString();
        return this;
    }

    /**
     * <p>
     * Timestamp of the most-recent update to the association status.
     * </p>
     * 
     * @param lastUpdated
     *        Timestamp of the most-recent update to the association status.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * Timestamp of the most-recent update to the association status.
     * </p>
     * 
     * @return Timestamp of the most-recent update to the association status.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * Timestamp of the most-recent update to the association status.
     * </p>
     * 
     * @param lastUpdated
     *        Timestamp of the most-recent update to the association status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainPackageDetails withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * Name of the domain you've associated a package with.
     * </p>
     * 
     * @param domainName
     *        Name of the domain you've associated a package with.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Name of the domain you've associated a package with.
     * </p>
     * 
     * @return Name of the domain you've associated a package with.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Name of the domain you've associated a package with.
     * </p>
     * 
     * @param domainName
     *        Name of the domain you've associated a package with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainPackageDetails withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * State of the association. Values are ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     * </p>
     * 
     * @param domainPackageStatus
     *        State of the association. Values are
     *        ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     * @see DomainPackageStatus
     */

    public void setDomainPackageStatus(String domainPackageStatus) {
        this.domainPackageStatus = domainPackageStatus;
    }

    /**
     * <p>
     * State of the association. Values are ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     * </p>
     * 
     * @return State of the association. Values are
     *         ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     * @see DomainPackageStatus
     */

    public String getDomainPackageStatus() {
        return this.domainPackageStatus;
    }

    /**
     * <p>
     * State of the association. Values are ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     * </p>
     * 
     * @param domainPackageStatus
     *        State of the association. Values are
     *        ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainPackageStatus
     */

    public DomainPackageDetails withDomainPackageStatus(String domainPackageStatus) {
        setDomainPackageStatus(domainPackageStatus);
        return this;
    }

    /**
     * <p>
     * State of the association. Values are ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     * </p>
     * 
     * @param domainPackageStatus
     *        State of the association. Values are
     *        ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainPackageStatus
     */

    public DomainPackageDetails withDomainPackageStatus(DomainPackageStatus domainPackageStatus) {
        this.domainPackageStatus = domainPackageStatus.toString();
        return this;
    }

    /**
     * @param packageVersion
     */

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * @return
     */

    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * @param packageVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainPackageDetails withPackageVersion(String packageVersion) {
        setPackageVersion(packageVersion);
        return this;
    }

    /**
     * <p>
     * The relative path on Amazon ES nodes, which can be used as synonym_path when the package is synonym file.
     * </p>
     * 
     * @param referencePath
     *        The relative path on Amazon ES nodes, which can be used as synonym_path when the package is synonym file.
     */

    public void setReferencePath(String referencePath) {
        this.referencePath = referencePath;
    }

    /**
     * <p>
     * The relative path on Amazon ES nodes, which can be used as synonym_path when the package is synonym file.
     * </p>
     * 
     * @return The relative path on Amazon ES nodes, which can be used as synonym_path when the package is synonym file.
     */

    public String getReferencePath() {
        return this.referencePath;
    }

    /**
     * <p>
     * The relative path on Amazon ES nodes, which can be used as synonym_path when the package is synonym file.
     * </p>
     * 
     * @param referencePath
     *        The relative path on Amazon ES nodes, which can be used as synonym_path when the package is synonym file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainPackageDetails withReferencePath(String referencePath) {
        setReferencePath(referencePath);
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

    public DomainPackageDetails withErrorDetails(ErrorDetails errorDetails) {
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
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getDomainPackageStatus() != null)
            sb.append("DomainPackageStatus: ").append(getDomainPackageStatus()).append(",");
        if (getPackageVersion() != null)
            sb.append("PackageVersion: ").append(getPackageVersion()).append(",");
        if (getReferencePath() != null)
            sb.append("ReferencePath: ").append(getReferencePath()).append(",");
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

        if (obj instanceof DomainPackageDetails == false)
            return false;
        DomainPackageDetails other = (DomainPackageDetails) obj;
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
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDomainPackageStatus() == null ^ this.getDomainPackageStatus() == null)
            return false;
        if (other.getDomainPackageStatus() != null && other.getDomainPackageStatus().equals(this.getDomainPackageStatus()) == false)
            return false;
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null && other.getPackageVersion().equals(this.getPackageVersion()) == false)
            return false;
        if (other.getReferencePath() == null ^ this.getReferencePath() == null)
            return false;
        if (other.getReferencePath() != null && other.getReferencePath().equals(this.getReferencePath()) == false)
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
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDomainPackageStatus() == null) ? 0 : getDomainPackageStatus().hashCode());
        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getReferencePath() == null) ? 0 : getReferencePath().hashCode());
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public DomainPackageDetails clone() {
        try {
            return (DomainPackageDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.DomainPackageDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
