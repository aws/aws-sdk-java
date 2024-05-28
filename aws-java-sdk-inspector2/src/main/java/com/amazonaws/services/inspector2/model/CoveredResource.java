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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains details about a resource covered by Amazon Inspector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CoveredResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoveredResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID of the covered resource.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The date and time the resource was last checked for vulnerabilities.
     * </p>
     */
    private java.util.Date lastScannedAt;
    /**
     * <p>
     * The ID of the covered resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * An object that contains details about the metadata.
     * </p>
     */
    private ResourceScanMetadata resourceMetadata;
    /**
     * <p>
     * The type of the covered resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The scan method that is applied to the instance.
     * </p>
     */
    private String scanMode;
    /**
     * <p>
     * The status of the scan covering the resource.
     * </p>
     */
    private ScanStatus scanStatus;
    /**
     * <p>
     * The Amazon Inspector scan type covering the resource.
     * </p>
     */
    private String scanType;

    /**
     * <p>
     * The Amazon Web Services account ID of the covered resource.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the covered resource.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the covered resource.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the covered resource.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the covered resource.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the covered resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoveredResource withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The date and time the resource was last checked for vulnerabilities.
     * </p>
     * 
     * @param lastScannedAt
     *        The date and time the resource was last checked for vulnerabilities.
     */

    public void setLastScannedAt(java.util.Date lastScannedAt) {
        this.lastScannedAt = lastScannedAt;
    }

    /**
     * <p>
     * The date and time the resource was last checked for vulnerabilities.
     * </p>
     * 
     * @return The date and time the resource was last checked for vulnerabilities.
     */

    public java.util.Date getLastScannedAt() {
        return this.lastScannedAt;
    }

    /**
     * <p>
     * The date and time the resource was last checked for vulnerabilities.
     * </p>
     * 
     * @param lastScannedAt
     *        The date and time the resource was last checked for vulnerabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoveredResource withLastScannedAt(java.util.Date lastScannedAt) {
        setLastScannedAt(lastScannedAt);
        return this;
    }

    /**
     * <p>
     * The ID of the covered resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the covered resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the covered resource.
     * </p>
     * 
     * @return The ID of the covered resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the covered resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the covered resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoveredResource withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * An object that contains details about the metadata.
     * </p>
     * 
     * @param resourceMetadata
     *        An object that contains details about the metadata.
     */

    public void setResourceMetadata(ResourceScanMetadata resourceMetadata) {
        this.resourceMetadata = resourceMetadata;
    }

    /**
     * <p>
     * An object that contains details about the metadata.
     * </p>
     * 
     * @return An object that contains details about the metadata.
     */

    public ResourceScanMetadata getResourceMetadata() {
        return this.resourceMetadata;
    }

    /**
     * <p>
     * An object that contains details about the metadata.
     * </p>
     * 
     * @param resourceMetadata
     *        An object that contains details about the metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoveredResource withResourceMetadata(ResourceScanMetadata resourceMetadata) {
        setResourceMetadata(resourceMetadata);
        return this;
    }

    /**
     * <p>
     * The type of the covered resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the covered resource.
     * @see CoverageResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the covered resource.
     * </p>
     * 
     * @return The type of the covered resource.
     * @see CoverageResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the covered resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the covered resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoverageResourceType
     */

    public CoveredResource withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the covered resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the covered resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoverageResourceType
     */

    public CoveredResource withResourceType(CoverageResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The scan method that is applied to the instance.
     * </p>
     * 
     * @param scanMode
     *        The scan method that is applied to the instance.
     * @see ScanMode
     */

    public void setScanMode(String scanMode) {
        this.scanMode = scanMode;
    }

    /**
     * <p>
     * The scan method that is applied to the instance.
     * </p>
     * 
     * @return The scan method that is applied to the instance.
     * @see ScanMode
     */

    public String getScanMode() {
        return this.scanMode;
    }

    /**
     * <p>
     * The scan method that is applied to the instance.
     * </p>
     * 
     * @param scanMode
     *        The scan method that is applied to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanMode
     */

    public CoveredResource withScanMode(String scanMode) {
        setScanMode(scanMode);
        return this;
    }

    /**
     * <p>
     * The scan method that is applied to the instance.
     * </p>
     * 
     * @param scanMode
     *        The scan method that is applied to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanMode
     */

    public CoveredResource withScanMode(ScanMode scanMode) {
        this.scanMode = scanMode.toString();
        return this;
    }

    /**
     * <p>
     * The status of the scan covering the resource.
     * </p>
     * 
     * @param scanStatus
     *        The status of the scan covering the resource.
     */

    public void setScanStatus(ScanStatus scanStatus) {
        this.scanStatus = scanStatus;
    }

    /**
     * <p>
     * The status of the scan covering the resource.
     * </p>
     * 
     * @return The status of the scan covering the resource.
     */

    public ScanStatus getScanStatus() {
        return this.scanStatus;
    }

    /**
     * <p>
     * The status of the scan covering the resource.
     * </p>
     * 
     * @param scanStatus
     *        The status of the scan covering the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoveredResource withScanStatus(ScanStatus scanStatus) {
        setScanStatus(scanStatus);
        return this;
    }

    /**
     * <p>
     * The Amazon Inspector scan type covering the resource.
     * </p>
     * 
     * @param scanType
     *        The Amazon Inspector scan type covering the resource.
     * @see ScanType
     */

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    /**
     * <p>
     * The Amazon Inspector scan type covering the resource.
     * </p>
     * 
     * @return The Amazon Inspector scan type covering the resource.
     * @see ScanType
     */

    public String getScanType() {
        return this.scanType;
    }

    /**
     * <p>
     * The Amazon Inspector scan type covering the resource.
     * </p>
     * 
     * @param scanType
     *        The Amazon Inspector scan type covering the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanType
     */

    public CoveredResource withScanType(String scanType) {
        setScanType(scanType);
        return this;
    }

    /**
     * <p>
     * The Amazon Inspector scan type covering the resource.
     * </p>
     * 
     * @param scanType
     *        The Amazon Inspector scan type covering the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanType
     */

    public CoveredResource withScanType(ScanType scanType) {
        this.scanType = scanType.toString();
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getLastScannedAt() != null)
            sb.append("LastScannedAt: ").append(getLastScannedAt()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceMetadata() != null)
            sb.append("ResourceMetadata: ").append(getResourceMetadata()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getScanMode() != null)
            sb.append("ScanMode: ").append(getScanMode()).append(",");
        if (getScanStatus() != null)
            sb.append("ScanStatus: ").append(getScanStatus()).append(",");
        if (getScanType() != null)
            sb.append("ScanType: ").append(getScanType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoveredResource == false)
            return false;
        CoveredResource other = (CoveredResource) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getLastScannedAt() == null ^ this.getLastScannedAt() == null)
            return false;
        if (other.getLastScannedAt() != null && other.getLastScannedAt().equals(this.getLastScannedAt()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceMetadata() == null ^ this.getResourceMetadata() == null)
            return false;
        if (other.getResourceMetadata() != null && other.getResourceMetadata().equals(this.getResourceMetadata()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getScanMode() == null ^ this.getScanMode() == null)
            return false;
        if (other.getScanMode() != null && other.getScanMode().equals(this.getScanMode()) == false)
            return false;
        if (other.getScanStatus() == null ^ this.getScanStatus() == null)
            return false;
        if (other.getScanStatus() != null && other.getScanStatus().equals(this.getScanStatus()) == false)
            return false;
        if (other.getScanType() == null ^ this.getScanType() == null)
            return false;
        if (other.getScanType() != null && other.getScanType().equals(this.getScanType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getLastScannedAt() == null) ? 0 : getLastScannedAt().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceMetadata() == null) ? 0 : getResourceMetadata().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getScanMode() == null) ? 0 : getScanMode().hashCode());
        hashCode = prime * hashCode + ((getScanStatus() == null) ? 0 : getScanStatus().hashCode());
        hashCode = prime * hashCode + ((getScanType() == null) ? 0 : getScanType().hashCode());
        return hashCode;
    }

    @Override
    public CoveredResource clone() {
        try {
            return (CoveredResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CoveredResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
