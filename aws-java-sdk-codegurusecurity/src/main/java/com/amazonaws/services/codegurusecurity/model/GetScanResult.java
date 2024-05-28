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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetScan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetScanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The type of analysis CodeGuru Security performed in the scan, either <code>Security</code> or <code>All</code>.
     * The <code>Security</code> type only generates findings related to security. The <code>All</code> type generates
     * both security findings and quality findings.
     * </p>
     */
    private String analysisType;
    /**
     * <p>
     * The time the scan was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The number of times a scan has been re-run on a revised resource.
     * </p>
     */
    private Long numberOfRevisions;
    /**
     * <p>
     * UUID that identifies the individual scan run.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * The name of the scan.
     * </p>
     */
    private String scanName;
    /**
     * <p>
     * The ARN for the scan name.
     * </p>
     */
    private String scanNameArn;
    /**
     * <p>
     * The current state of the scan. Pass either <code>InProgress</code>, <code>Successful</code>, or
     * <code>Failed</code>.
     * </p>
     */
    private String scanState;
    /**
     * <p>
     * The time when the scan was last updated. Only available for <code>STANDARD</code> scan types.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The type of analysis CodeGuru Security performed in the scan, either <code>Security</code> or <code>All</code>.
     * The <code>Security</code> type only generates findings related to security. The <code>All</code> type generates
     * both security findings and quality findings.
     * </p>
     * 
     * @param analysisType
     *        The type of analysis CodeGuru Security performed in the scan, either <code>Security</code> or
     *        <code>All</code>. The <code>Security</code> type only generates findings related to security. The
     *        <code>All</code> type generates both security findings and quality findings.
     * @see AnalysisType
     */

    public void setAnalysisType(String analysisType) {
        this.analysisType = analysisType;
    }

    /**
     * <p>
     * The type of analysis CodeGuru Security performed in the scan, either <code>Security</code> or <code>All</code>.
     * The <code>Security</code> type only generates findings related to security. The <code>All</code> type generates
     * both security findings and quality findings.
     * </p>
     * 
     * @return The type of analysis CodeGuru Security performed in the scan, either <code>Security</code> or
     *         <code>All</code>. The <code>Security</code> type only generates findings related to security. The
     *         <code>All</code> type generates both security findings and quality findings.
     * @see AnalysisType
     */

    public String getAnalysisType() {
        return this.analysisType;
    }

    /**
     * <p>
     * The type of analysis CodeGuru Security performed in the scan, either <code>Security</code> or <code>All</code>.
     * The <code>Security</code> type only generates findings related to security. The <code>All</code> type generates
     * both security findings and quality findings.
     * </p>
     * 
     * @param analysisType
     *        The type of analysis CodeGuru Security performed in the scan, either <code>Security</code> or
     *        <code>All</code>. The <code>Security</code> type only generates findings related to security. The
     *        <code>All</code> type generates both security findings and quality findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisType
     */

    public GetScanResult withAnalysisType(String analysisType) {
        setAnalysisType(analysisType);
        return this;
    }

    /**
     * <p>
     * The type of analysis CodeGuru Security performed in the scan, either <code>Security</code> or <code>All</code>.
     * The <code>Security</code> type only generates findings related to security. The <code>All</code> type generates
     * both security findings and quality findings.
     * </p>
     * 
     * @param analysisType
     *        The type of analysis CodeGuru Security performed in the scan, either <code>Security</code> or
     *        <code>All</code>. The <code>Security</code> type only generates findings related to security. The
     *        <code>All</code> type generates both security findings and quality findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisType
     */

    public GetScanResult withAnalysisType(AnalysisType analysisType) {
        this.analysisType = analysisType.toString();
        return this;
    }

    /**
     * <p>
     * The time the scan was created.
     * </p>
     * 
     * @param createdAt
     *        The time the scan was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time the scan was created.
     * </p>
     * 
     * @return The time the scan was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time the scan was created.
     * </p>
     * 
     * @param createdAt
     *        The time the scan was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScanResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The number of times a scan has been re-run on a revised resource.
     * </p>
     * 
     * @param numberOfRevisions
     *        The number of times a scan has been re-run on a revised resource.
     */

    public void setNumberOfRevisions(Long numberOfRevisions) {
        this.numberOfRevisions = numberOfRevisions;
    }

    /**
     * <p>
     * The number of times a scan has been re-run on a revised resource.
     * </p>
     * 
     * @return The number of times a scan has been re-run on a revised resource.
     */

    public Long getNumberOfRevisions() {
        return this.numberOfRevisions;
    }

    /**
     * <p>
     * The number of times a scan has been re-run on a revised resource.
     * </p>
     * 
     * @param numberOfRevisions
     *        The number of times a scan has been re-run on a revised resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScanResult withNumberOfRevisions(Long numberOfRevisions) {
        setNumberOfRevisions(numberOfRevisions);
        return this;
    }

    /**
     * <p>
     * UUID that identifies the individual scan run.
     * </p>
     * 
     * @param runId
     *        UUID that identifies the individual scan run.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * UUID that identifies the individual scan run.
     * </p>
     * 
     * @return UUID that identifies the individual scan run.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * UUID that identifies the individual scan run.
     * </p>
     * 
     * @param runId
     *        UUID that identifies the individual scan run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScanResult withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * The name of the scan.
     * </p>
     * 
     * @param scanName
     *        The name of the scan.
     */

    public void setScanName(String scanName) {
        this.scanName = scanName;
    }

    /**
     * <p>
     * The name of the scan.
     * </p>
     * 
     * @return The name of the scan.
     */

    public String getScanName() {
        return this.scanName;
    }

    /**
     * <p>
     * The name of the scan.
     * </p>
     * 
     * @param scanName
     *        The name of the scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScanResult withScanName(String scanName) {
        setScanName(scanName);
        return this;
    }

    /**
     * <p>
     * The ARN for the scan name.
     * </p>
     * 
     * @param scanNameArn
     *        The ARN for the scan name.
     */

    public void setScanNameArn(String scanNameArn) {
        this.scanNameArn = scanNameArn;
    }

    /**
     * <p>
     * The ARN for the scan name.
     * </p>
     * 
     * @return The ARN for the scan name.
     */

    public String getScanNameArn() {
        return this.scanNameArn;
    }

    /**
     * <p>
     * The ARN for the scan name.
     * </p>
     * 
     * @param scanNameArn
     *        The ARN for the scan name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScanResult withScanNameArn(String scanNameArn) {
        setScanNameArn(scanNameArn);
        return this;
    }

    /**
     * <p>
     * The current state of the scan. Pass either <code>InProgress</code>, <code>Successful</code>, or
     * <code>Failed</code>.
     * </p>
     * 
     * @param scanState
     *        The current state of the scan. Pass either <code>InProgress</code>, <code>Successful</code>, or
     *        <code>Failed</code>.
     * @see ScanState
     */

    public void setScanState(String scanState) {
        this.scanState = scanState;
    }

    /**
     * <p>
     * The current state of the scan. Pass either <code>InProgress</code>, <code>Successful</code>, or
     * <code>Failed</code>.
     * </p>
     * 
     * @return The current state of the scan. Pass either <code>InProgress</code>, <code>Successful</code>, or
     *         <code>Failed</code>.
     * @see ScanState
     */

    public String getScanState() {
        return this.scanState;
    }

    /**
     * <p>
     * The current state of the scan. Pass either <code>InProgress</code>, <code>Successful</code>, or
     * <code>Failed</code>.
     * </p>
     * 
     * @param scanState
     *        The current state of the scan. Pass either <code>InProgress</code>, <code>Successful</code>, or
     *        <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanState
     */

    public GetScanResult withScanState(String scanState) {
        setScanState(scanState);
        return this;
    }

    /**
     * <p>
     * The current state of the scan. Pass either <code>InProgress</code>, <code>Successful</code>, or
     * <code>Failed</code>.
     * </p>
     * 
     * @param scanState
     *        The current state of the scan. Pass either <code>InProgress</code>, <code>Successful</code>, or
     *        <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanState
     */

    public GetScanResult withScanState(ScanState scanState) {
        this.scanState = scanState.toString();
        return this;
    }

    /**
     * <p>
     * The time when the scan was last updated. Only available for <code>STANDARD</code> scan types.
     * </p>
     * 
     * @param updatedAt
     *        The time when the scan was last updated. Only available for <code>STANDARD</code> scan types.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time when the scan was last updated. Only available for <code>STANDARD</code> scan types.
     * </p>
     * 
     * @return The time when the scan was last updated. Only available for <code>STANDARD</code> scan types.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time when the scan was last updated. Only available for <code>STANDARD</code> scan types.
     * </p>
     * 
     * @param updatedAt
     *        The time when the scan was last updated. Only available for <code>STANDARD</code> scan types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScanResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAnalysisType() != null)
            sb.append("AnalysisType: ").append(getAnalysisType()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getNumberOfRevisions() != null)
            sb.append("NumberOfRevisions: ").append(getNumberOfRevisions()).append(",");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getScanName() != null)
            sb.append("ScanName: ").append(getScanName()).append(",");
        if (getScanNameArn() != null)
            sb.append("ScanNameArn: ").append(getScanNameArn()).append(",");
        if (getScanState() != null)
            sb.append("ScanState: ").append(getScanState()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetScanResult == false)
            return false;
        GetScanResult other = (GetScanResult) obj;
        if (other.getAnalysisType() == null ^ this.getAnalysisType() == null)
            return false;
        if (other.getAnalysisType() != null && other.getAnalysisType().equals(this.getAnalysisType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getNumberOfRevisions() == null ^ this.getNumberOfRevisions() == null)
            return false;
        if (other.getNumberOfRevisions() != null && other.getNumberOfRevisions().equals(this.getNumberOfRevisions()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getScanName() == null ^ this.getScanName() == null)
            return false;
        if (other.getScanName() != null && other.getScanName().equals(this.getScanName()) == false)
            return false;
        if (other.getScanNameArn() == null ^ this.getScanNameArn() == null)
            return false;
        if (other.getScanNameArn() != null && other.getScanNameArn().equals(this.getScanNameArn()) == false)
            return false;
        if (other.getScanState() == null ^ this.getScanState() == null)
            return false;
        if (other.getScanState() != null && other.getScanState().equals(this.getScanState()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalysisType() == null) ? 0 : getAnalysisType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getNumberOfRevisions() == null) ? 0 : getNumberOfRevisions().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getScanName() == null) ? 0 : getScanName().hashCode());
        hashCode = prime * hashCode + ((getScanNameArn() == null) ? 0 : getScanNameArn().hashCode());
        hashCode = prime * hashCode + ((getScanState() == null) ? 0 : getScanState().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetScanResult clone() {
        try {
            return (GetScanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
