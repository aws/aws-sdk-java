/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the scanning configuration for a repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/RepositoryScanningConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryScanningConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the repository.
     * </p>
     */
    private String repositoryArn;
    /**
     * <p>
     * The name of the repository.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * Whether or not scan on push is configured for the repository.
     * </p>
     */
    private Boolean scanOnPush;
    /**
     * <p>
     * The scan frequency for the repository.
     * </p>
     */
    private String scanFrequency;
    /**
     * <p>
     * The scan filters applied to the repository.
     * </p>
     */
    private java.util.List<ScanningRepositoryFilter> appliedScanFilters;

    /**
     * <p>
     * The ARN of the repository.
     * </p>
     * 
     * @param repositoryArn
     *        The ARN of the repository.
     */

    public void setRepositoryArn(String repositoryArn) {
        this.repositoryArn = repositoryArn;
    }

    /**
     * <p>
     * The ARN of the repository.
     * </p>
     * 
     * @return The ARN of the repository.
     */

    public String getRepositoryArn() {
        return this.repositoryArn;
    }

    /**
     * <p>
     * The ARN of the repository.
     * </p>
     * 
     * @param repositoryArn
     *        The ARN of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryScanningConfiguration withRepositoryArn(String repositoryArn) {
        setRepositoryArn(repositoryArn);
        return this;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @return The name of the repository.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryScanningConfiguration withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * Whether or not scan on push is configured for the repository.
     * </p>
     * 
     * @param scanOnPush
     *        Whether or not scan on push is configured for the repository.
     */

    public void setScanOnPush(Boolean scanOnPush) {
        this.scanOnPush = scanOnPush;
    }

    /**
     * <p>
     * Whether or not scan on push is configured for the repository.
     * </p>
     * 
     * @return Whether or not scan on push is configured for the repository.
     */

    public Boolean getScanOnPush() {
        return this.scanOnPush;
    }

    /**
     * <p>
     * Whether or not scan on push is configured for the repository.
     * </p>
     * 
     * @param scanOnPush
     *        Whether or not scan on push is configured for the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryScanningConfiguration withScanOnPush(Boolean scanOnPush) {
        setScanOnPush(scanOnPush);
        return this;
    }

    /**
     * <p>
     * Whether or not scan on push is configured for the repository.
     * </p>
     * 
     * @return Whether or not scan on push is configured for the repository.
     */

    public Boolean isScanOnPush() {
        return this.scanOnPush;
    }

    /**
     * <p>
     * The scan frequency for the repository.
     * </p>
     * 
     * @param scanFrequency
     *        The scan frequency for the repository.
     * @see ScanFrequency
     */

    public void setScanFrequency(String scanFrequency) {
        this.scanFrequency = scanFrequency;
    }

    /**
     * <p>
     * The scan frequency for the repository.
     * </p>
     * 
     * @return The scan frequency for the repository.
     * @see ScanFrequency
     */

    public String getScanFrequency() {
        return this.scanFrequency;
    }

    /**
     * <p>
     * The scan frequency for the repository.
     * </p>
     * 
     * @param scanFrequency
     *        The scan frequency for the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanFrequency
     */

    public RepositoryScanningConfiguration withScanFrequency(String scanFrequency) {
        setScanFrequency(scanFrequency);
        return this;
    }

    /**
     * <p>
     * The scan frequency for the repository.
     * </p>
     * 
     * @param scanFrequency
     *        The scan frequency for the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanFrequency
     */

    public RepositoryScanningConfiguration withScanFrequency(ScanFrequency scanFrequency) {
        this.scanFrequency = scanFrequency.toString();
        return this;
    }

    /**
     * <p>
     * The scan filters applied to the repository.
     * </p>
     * 
     * @return The scan filters applied to the repository.
     */

    public java.util.List<ScanningRepositoryFilter> getAppliedScanFilters() {
        return appliedScanFilters;
    }

    /**
     * <p>
     * The scan filters applied to the repository.
     * </p>
     * 
     * @param appliedScanFilters
     *        The scan filters applied to the repository.
     */

    public void setAppliedScanFilters(java.util.Collection<ScanningRepositoryFilter> appliedScanFilters) {
        if (appliedScanFilters == null) {
            this.appliedScanFilters = null;
            return;
        }

        this.appliedScanFilters = new java.util.ArrayList<ScanningRepositoryFilter>(appliedScanFilters);
    }

    /**
     * <p>
     * The scan filters applied to the repository.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppliedScanFilters(java.util.Collection)} or {@link #withAppliedScanFilters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param appliedScanFilters
     *        The scan filters applied to the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryScanningConfiguration withAppliedScanFilters(ScanningRepositoryFilter... appliedScanFilters) {
        if (this.appliedScanFilters == null) {
            setAppliedScanFilters(new java.util.ArrayList<ScanningRepositoryFilter>(appliedScanFilters.length));
        }
        for (ScanningRepositoryFilter ele : appliedScanFilters) {
            this.appliedScanFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The scan filters applied to the repository.
     * </p>
     * 
     * @param appliedScanFilters
     *        The scan filters applied to the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryScanningConfiguration withAppliedScanFilters(java.util.Collection<ScanningRepositoryFilter> appliedScanFilters) {
        setAppliedScanFilters(appliedScanFilters);
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
        if (getRepositoryArn() != null)
            sb.append("RepositoryArn: ").append(getRepositoryArn()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getScanOnPush() != null)
            sb.append("ScanOnPush: ").append(getScanOnPush()).append(",");
        if (getScanFrequency() != null)
            sb.append("ScanFrequency: ").append(getScanFrequency()).append(",");
        if (getAppliedScanFilters() != null)
            sb.append("AppliedScanFilters: ").append(getAppliedScanFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryScanningConfiguration == false)
            return false;
        RepositoryScanningConfiguration other = (RepositoryScanningConfiguration) obj;
        if (other.getRepositoryArn() == null ^ this.getRepositoryArn() == null)
            return false;
        if (other.getRepositoryArn() != null && other.getRepositoryArn().equals(this.getRepositoryArn()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getScanOnPush() == null ^ this.getScanOnPush() == null)
            return false;
        if (other.getScanOnPush() != null && other.getScanOnPush().equals(this.getScanOnPush()) == false)
            return false;
        if (other.getScanFrequency() == null ^ this.getScanFrequency() == null)
            return false;
        if (other.getScanFrequency() != null && other.getScanFrequency().equals(this.getScanFrequency()) == false)
            return false;
        if (other.getAppliedScanFilters() == null ^ this.getAppliedScanFilters() == null)
            return false;
        if (other.getAppliedScanFilters() != null && other.getAppliedScanFilters().equals(this.getAppliedScanFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryArn() == null) ? 0 : getRepositoryArn().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getScanOnPush() == null) ? 0 : getScanOnPush().hashCode());
        hashCode = prime * hashCode + ((getScanFrequency() == null) ? 0 : getScanFrequency().hashCode());
        hashCode = prime * hashCode + ((getAppliedScanFilters() == null) ? 0 : getAppliedScanFilters().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryScanningConfiguration clone() {
        try {
            return (RepositoryScanningConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.RepositoryScanningConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
