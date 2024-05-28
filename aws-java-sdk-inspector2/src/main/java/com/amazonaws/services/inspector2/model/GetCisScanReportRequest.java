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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetCisScanReport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCisScanReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The format of the report. Valid values are <code>PDF</code> and <code>CSV</code>. If no value is specified, the
     * report format defaults to <code>PDF</code>.
     * </p>
     */
    private String reportFormat;
    /**
     * <p>
     * The scan ARN.
     * </p>
     */
    private String scanArn;
    /**
     * <p>
     * The target accounts.
     * </p>
     */
    private java.util.List<String> targetAccounts;

    /**
     * <p>
     * The format of the report. Valid values are <code>PDF</code> and <code>CSV</code>. If no value is specified, the
     * report format defaults to <code>PDF</code>.
     * </p>
     * 
     * @param reportFormat
     *        The format of the report. Valid values are <code>PDF</code> and <code>CSV</code>. If no value is
     *        specified, the report format defaults to <code>PDF</code>.
     * @see CisReportFormat
     */

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    /**
     * <p>
     * The format of the report. Valid values are <code>PDF</code> and <code>CSV</code>. If no value is specified, the
     * report format defaults to <code>PDF</code>.
     * </p>
     * 
     * @return The format of the report. Valid values are <code>PDF</code> and <code>CSV</code>. If no value is
     *         specified, the report format defaults to <code>PDF</code>.
     * @see CisReportFormat
     */

    public String getReportFormat() {
        return this.reportFormat;
    }

    /**
     * <p>
     * The format of the report. Valid values are <code>PDF</code> and <code>CSV</code>. If no value is specified, the
     * report format defaults to <code>PDF</code>.
     * </p>
     * 
     * @param reportFormat
     *        The format of the report. Valid values are <code>PDF</code> and <code>CSV</code>. If no value is
     *        specified, the report format defaults to <code>PDF</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisReportFormat
     */

    public GetCisScanReportRequest withReportFormat(String reportFormat) {
        setReportFormat(reportFormat);
        return this;
    }

    /**
     * <p>
     * The format of the report. Valid values are <code>PDF</code> and <code>CSV</code>. If no value is specified, the
     * report format defaults to <code>PDF</code>.
     * </p>
     * 
     * @param reportFormat
     *        The format of the report. Valid values are <code>PDF</code> and <code>CSV</code>. If no value is
     *        specified, the report format defaults to <code>PDF</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisReportFormat
     */

    public GetCisScanReportRequest withReportFormat(CisReportFormat reportFormat) {
        this.reportFormat = reportFormat.toString();
        return this;
    }

    /**
     * <p>
     * The scan ARN.
     * </p>
     * 
     * @param scanArn
     *        The scan ARN.
     */

    public void setScanArn(String scanArn) {
        this.scanArn = scanArn;
    }

    /**
     * <p>
     * The scan ARN.
     * </p>
     * 
     * @return The scan ARN.
     */

    public String getScanArn() {
        return this.scanArn;
    }

    /**
     * <p>
     * The scan ARN.
     * </p>
     * 
     * @param scanArn
     *        The scan ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCisScanReportRequest withScanArn(String scanArn) {
        setScanArn(scanArn);
        return this;
    }

    /**
     * <p>
     * The target accounts.
     * </p>
     * 
     * @return The target accounts.
     */

    public java.util.List<String> getTargetAccounts() {
        return targetAccounts;
    }

    /**
     * <p>
     * The target accounts.
     * </p>
     * 
     * @param targetAccounts
     *        The target accounts.
     */

    public void setTargetAccounts(java.util.Collection<String> targetAccounts) {
        if (targetAccounts == null) {
            this.targetAccounts = null;
            return;
        }

        this.targetAccounts = new java.util.ArrayList<String>(targetAccounts);
    }

    /**
     * <p>
     * The target accounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetAccounts(java.util.Collection)} or {@link #withTargetAccounts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param targetAccounts
     *        The target accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCisScanReportRequest withTargetAccounts(String... targetAccounts) {
        if (this.targetAccounts == null) {
            setTargetAccounts(new java.util.ArrayList<String>(targetAccounts.length));
        }
        for (String ele : targetAccounts) {
            this.targetAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The target accounts.
     * </p>
     * 
     * @param targetAccounts
     *        The target accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCisScanReportRequest withTargetAccounts(java.util.Collection<String> targetAccounts) {
        setTargetAccounts(targetAccounts);
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
        if (getReportFormat() != null)
            sb.append("ReportFormat: ").append(getReportFormat()).append(",");
        if (getScanArn() != null)
            sb.append("ScanArn: ").append(getScanArn()).append(",");
        if (getTargetAccounts() != null)
            sb.append("TargetAccounts: ").append(getTargetAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCisScanReportRequest == false)
            return false;
        GetCisScanReportRequest other = (GetCisScanReportRequest) obj;
        if (other.getReportFormat() == null ^ this.getReportFormat() == null)
            return false;
        if (other.getReportFormat() != null && other.getReportFormat().equals(this.getReportFormat()) == false)
            return false;
        if (other.getScanArn() == null ^ this.getScanArn() == null)
            return false;
        if (other.getScanArn() != null && other.getScanArn().equals(this.getScanArn()) == false)
            return false;
        if (other.getTargetAccounts() == null ^ this.getTargetAccounts() == null)
            return false;
        if (other.getTargetAccounts() != null && other.getTargetAccounts().equals(this.getTargetAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportFormat() == null) ? 0 : getReportFormat().hashCode());
        hashCode = prime * hashCode + ((getScanArn() == null) ? 0 : getScanArn().hashCode());
        hashCode = prime * hashCode + ((getTargetAccounts() == null) ? 0 : getTargetAccounts().hashCode());
        return hashCode;
    }

    @Override
    public GetCisScanReportRequest clone() {
        return (GetCisScanReportRequest) super.clone();
    }

}
