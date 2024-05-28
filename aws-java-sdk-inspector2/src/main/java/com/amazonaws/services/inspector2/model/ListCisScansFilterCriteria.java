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
 * A list of CIS scans filter criteria.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCisScansFilterCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCisScansFilterCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of failed checks filters.
     * </p>
     */
    private java.util.List<CisNumberFilter> failedChecksFilters;
    /**
     * <p>
     * The list of scan ARN filters.
     * </p>
     */
    private java.util.List<CisStringFilter> scanArnFilters;
    /**
     * <p>
     * The list of scan at filters.
     * </p>
     */
    private java.util.List<CisDateFilter> scanAtFilters;
    /**
     * <p>
     * The list of scan configuration ARN filters.
     * </p>
     */
    private java.util.List<CisStringFilter> scanConfigurationArnFilters;
    /**
     * <p>
     * The list of scan name filters.
     * </p>
     */
    private java.util.List<CisStringFilter> scanNameFilters;
    /**
     * <p>
     * The list of scan status filters.
     * </p>
     */
    private java.util.List<CisScanStatusFilter> scanStatusFilters;
    /**
     * <p>
     * The list of scheduled by filters.
     * </p>
     */
    private java.util.List<CisStringFilter> scheduledByFilters;
    /**
     * <p>
     * The list of target account ID filters.
     * </p>
     */
    private java.util.List<CisStringFilter> targetAccountIdFilters;
    /**
     * <p>
     * The list of target resource ID filters.
     * </p>
     */
    private java.util.List<CisStringFilter> targetResourceIdFilters;
    /**
     * <p>
     * The list of target resource tag filters.
     * </p>
     */
    private java.util.List<TagFilter> targetResourceTagFilters;

    /**
     * <p>
     * The list of failed checks filters.
     * </p>
     * 
     * @return The list of failed checks filters.
     */

    public java.util.List<CisNumberFilter> getFailedChecksFilters() {
        return failedChecksFilters;
    }

    /**
     * <p>
     * The list of failed checks filters.
     * </p>
     * 
     * @param failedChecksFilters
     *        The list of failed checks filters.
     */

    public void setFailedChecksFilters(java.util.Collection<CisNumberFilter> failedChecksFilters) {
        if (failedChecksFilters == null) {
            this.failedChecksFilters = null;
            return;
        }

        this.failedChecksFilters = new java.util.ArrayList<CisNumberFilter>(failedChecksFilters);
    }

    /**
     * <p>
     * The list of failed checks filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedChecksFilters(java.util.Collection)} or {@link #withFailedChecksFilters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param failedChecksFilters
     *        The list of failed checks filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withFailedChecksFilters(CisNumberFilter... failedChecksFilters) {
        if (this.failedChecksFilters == null) {
            setFailedChecksFilters(new java.util.ArrayList<CisNumberFilter>(failedChecksFilters.length));
        }
        for (CisNumberFilter ele : failedChecksFilters) {
            this.failedChecksFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of failed checks filters.
     * </p>
     * 
     * @param failedChecksFilters
     *        The list of failed checks filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withFailedChecksFilters(java.util.Collection<CisNumberFilter> failedChecksFilters) {
        setFailedChecksFilters(failedChecksFilters);
        return this;
    }

    /**
     * <p>
     * The list of scan ARN filters.
     * </p>
     * 
     * @return The list of scan ARN filters.
     */

    public java.util.List<CisStringFilter> getScanArnFilters() {
        return scanArnFilters;
    }

    /**
     * <p>
     * The list of scan ARN filters.
     * </p>
     * 
     * @param scanArnFilters
     *        The list of scan ARN filters.
     */

    public void setScanArnFilters(java.util.Collection<CisStringFilter> scanArnFilters) {
        if (scanArnFilters == null) {
            this.scanArnFilters = null;
            return;
        }

        this.scanArnFilters = new java.util.ArrayList<CisStringFilter>(scanArnFilters);
    }

    /**
     * <p>
     * The list of scan ARN filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScanArnFilters(java.util.Collection)} or {@link #withScanArnFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param scanArnFilters
     *        The list of scan ARN filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withScanArnFilters(CisStringFilter... scanArnFilters) {
        if (this.scanArnFilters == null) {
            setScanArnFilters(new java.util.ArrayList<CisStringFilter>(scanArnFilters.length));
        }
        for (CisStringFilter ele : scanArnFilters) {
            this.scanArnFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of scan ARN filters.
     * </p>
     * 
     * @param scanArnFilters
     *        The list of scan ARN filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withScanArnFilters(java.util.Collection<CisStringFilter> scanArnFilters) {
        setScanArnFilters(scanArnFilters);
        return this;
    }

    /**
     * <p>
     * The list of scan at filters.
     * </p>
     * 
     * @return The list of scan at filters.
     */

    public java.util.List<CisDateFilter> getScanAtFilters() {
        return scanAtFilters;
    }

    /**
     * <p>
     * The list of scan at filters.
     * </p>
     * 
     * @param scanAtFilters
     *        The list of scan at filters.
     */

    public void setScanAtFilters(java.util.Collection<CisDateFilter> scanAtFilters) {
        if (scanAtFilters == null) {
            this.scanAtFilters = null;
            return;
        }

        this.scanAtFilters = new java.util.ArrayList<CisDateFilter>(scanAtFilters);
    }

    /**
     * <p>
     * The list of scan at filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScanAtFilters(java.util.Collection)} or {@link #withScanAtFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param scanAtFilters
     *        The list of scan at filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withScanAtFilters(CisDateFilter... scanAtFilters) {
        if (this.scanAtFilters == null) {
            setScanAtFilters(new java.util.ArrayList<CisDateFilter>(scanAtFilters.length));
        }
        for (CisDateFilter ele : scanAtFilters) {
            this.scanAtFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of scan at filters.
     * </p>
     * 
     * @param scanAtFilters
     *        The list of scan at filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withScanAtFilters(java.util.Collection<CisDateFilter> scanAtFilters) {
        setScanAtFilters(scanAtFilters);
        return this;
    }

    /**
     * <p>
     * The list of scan configuration ARN filters.
     * </p>
     * 
     * @return The list of scan configuration ARN filters.
     */

    public java.util.List<CisStringFilter> getScanConfigurationArnFilters() {
        return scanConfigurationArnFilters;
    }

    /**
     * <p>
     * The list of scan configuration ARN filters.
     * </p>
     * 
     * @param scanConfigurationArnFilters
     *        The list of scan configuration ARN filters.
     */

    public void setScanConfigurationArnFilters(java.util.Collection<CisStringFilter> scanConfigurationArnFilters) {
        if (scanConfigurationArnFilters == null) {
            this.scanConfigurationArnFilters = null;
            return;
        }

        this.scanConfigurationArnFilters = new java.util.ArrayList<CisStringFilter>(scanConfigurationArnFilters);
    }

    /**
     * <p>
     * The list of scan configuration ARN filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScanConfigurationArnFilters(java.util.Collection)} or
     * {@link #withScanConfigurationArnFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param scanConfigurationArnFilters
     *        The list of scan configuration ARN filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withScanConfigurationArnFilters(CisStringFilter... scanConfigurationArnFilters) {
        if (this.scanConfigurationArnFilters == null) {
            setScanConfigurationArnFilters(new java.util.ArrayList<CisStringFilter>(scanConfigurationArnFilters.length));
        }
        for (CisStringFilter ele : scanConfigurationArnFilters) {
            this.scanConfigurationArnFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of scan configuration ARN filters.
     * </p>
     * 
     * @param scanConfigurationArnFilters
     *        The list of scan configuration ARN filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withScanConfigurationArnFilters(java.util.Collection<CisStringFilter> scanConfigurationArnFilters) {
        setScanConfigurationArnFilters(scanConfigurationArnFilters);
        return this;
    }

    /**
     * <p>
     * The list of scan name filters.
     * </p>
     * 
     * @return The list of scan name filters.
     */

    public java.util.List<CisStringFilter> getScanNameFilters() {
        return scanNameFilters;
    }

    /**
     * <p>
     * The list of scan name filters.
     * </p>
     * 
     * @param scanNameFilters
     *        The list of scan name filters.
     */

    public void setScanNameFilters(java.util.Collection<CisStringFilter> scanNameFilters) {
        if (scanNameFilters == null) {
            this.scanNameFilters = null;
            return;
        }

        this.scanNameFilters = new java.util.ArrayList<CisStringFilter>(scanNameFilters);
    }

    /**
     * <p>
     * The list of scan name filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScanNameFilters(java.util.Collection)} or {@link #withScanNameFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scanNameFilters
     *        The list of scan name filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withScanNameFilters(CisStringFilter... scanNameFilters) {
        if (this.scanNameFilters == null) {
            setScanNameFilters(new java.util.ArrayList<CisStringFilter>(scanNameFilters.length));
        }
        for (CisStringFilter ele : scanNameFilters) {
            this.scanNameFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of scan name filters.
     * </p>
     * 
     * @param scanNameFilters
     *        The list of scan name filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withScanNameFilters(java.util.Collection<CisStringFilter> scanNameFilters) {
        setScanNameFilters(scanNameFilters);
        return this;
    }

    /**
     * <p>
     * The list of scan status filters.
     * </p>
     * 
     * @return The list of scan status filters.
     */

    public java.util.List<CisScanStatusFilter> getScanStatusFilters() {
        return scanStatusFilters;
    }

    /**
     * <p>
     * The list of scan status filters.
     * </p>
     * 
     * @param scanStatusFilters
     *        The list of scan status filters.
     */

    public void setScanStatusFilters(java.util.Collection<CisScanStatusFilter> scanStatusFilters) {
        if (scanStatusFilters == null) {
            this.scanStatusFilters = null;
            return;
        }

        this.scanStatusFilters = new java.util.ArrayList<CisScanStatusFilter>(scanStatusFilters);
    }

    /**
     * <p>
     * The list of scan status filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScanStatusFilters(java.util.Collection)} or {@link #withScanStatusFilters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param scanStatusFilters
     *        The list of scan status filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withScanStatusFilters(CisScanStatusFilter... scanStatusFilters) {
        if (this.scanStatusFilters == null) {
            setScanStatusFilters(new java.util.ArrayList<CisScanStatusFilter>(scanStatusFilters.length));
        }
        for (CisScanStatusFilter ele : scanStatusFilters) {
            this.scanStatusFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of scan status filters.
     * </p>
     * 
     * @param scanStatusFilters
     *        The list of scan status filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withScanStatusFilters(java.util.Collection<CisScanStatusFilter> scanStatusFilters) {
        setScanStatusFilters(scanStatusFilters);
        return this;
    }

    /**
     * <p>
     * The list of scheduled by filters.
     * </p>
     * 
     * @return The list of scheduled by filters.
     */

    public java.util.List<CisStringFilter> getScheduledByFilters() {
        return scheduledByFilters;
    }

    /**
     * <p>
     * The list of scheduled by filters.
     * </p>
     * 
     * @param scheduledByFilters
     *        The list of scheduled by filters.
     */

    public void setScheduledByFilters(java.util.Collection<CisStringFilter> scheduledByFilters) {
        if (scheduledByFilters == null) {
            this.scheduledByFilters = null;
            return;
        }

        this.scheduledByFilters = new java.util.ArrayList<CisStringFilter>(scheduledByFilters);
    }

    /**
     * <p>
     * The list of scheduled by filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduledByFilters(java.util.Collection)} or {@link #withScheduledByFilters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param scheduledByFilters
     *        The list of scheduled by filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withScheduledByFilters(CisStringFilter... scheduledByFilters) {
        if (this.scheduledByFilters == null) {
            setScheduledByFilters(new java.util.ArrayList<CisStringFilter>(scheduledByFilters.length));
        }
        for (CisStringFilter ele : scheduledByFilters) {
            this.scheduledByFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of scheduled by filters.
     * </p>
     * 
     * @param scheduledByFilters
     *        The list of scheduled by filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withScheduledByFilters(java.util.Collection<CisStringFilter> scheduledByFilters) {
        setScheduledByFilters(scheduledByFilters);
        return this;
    }

    /**
     * <p>
     * The list of target account ID filters.
     * </p>
     * 
     * @return The list of target account ID filters.
     */

    public java.util.List<CisStringFilter> getTargetAccountIdFilters() {
        return targetAccountIdFilters;
    }

    /**
     * <p>
     * The list of target account ID filters.
     * </p>
     * 
     * @param targetAccountIdFilters
     *        The list of target account ID filters.
     */

    public void setTargetAccountIdFilters(java.util.Collection<CisStringFilter> targetAccountIdFilters) {
        if (targetAccountIdFilters == null) {
            this.targetAccountIdFilters = null;
            return;
        }

        this.targetAccountIdFilters = new java.util.ArrayList<CisStringFilter>(targetAccountIdFilters);
    }

    /**
     * <p>
     * The list of target account ID filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetAccountIdFilters(java.util.Collection)} or
     * {@link #withTargetAccountIdFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetAccountIdFilters
     *        The list of target account ID filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withTargetAccountIdFilters(CisStringFilter... targetAccountIdFilters) {
        if (this.targetAccountIdFilters == null) {
            setTargetAccountIdFilters(new java.util.ArrayList<CisStringFilter>(targetAccountIdFilters.length));
        }
        for (CisStringFilter ele : targetAccountIdFilters) {
            this.targetAccountIdFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of target account ID filters.
     * </p>
     * 
     * @param targetAccountIdFilters
     *        The list of target account ID filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withTargetAccountIdFilters(java.util.Collection<CisStringFilter> targetAccountIdFilters) {
        setTargetAccountIdFilters(targetAccountIdFilters);
        return this;
    }

    /**
     * <p>
     * The list of target resource ID filters.
     * </p>
     * 
     * @return The list of target resource ID filters.
     */

    public java.util.List<CisStringFilter> getTargetResourceIdFilters() {
        return targetResourceIdFilters;
    }

    /**
     * <p>
     * The list of target resource ID filters.
     * </p>
     * 
     * @param targetResourceIdFilters
     *        The list of target resource ID filters.
     */

    public void setTargetResourceIdFilters(java.util.Collection<CisStringFilter> targetResourceIdFilters) {
        if (targetResourceIdFilters == null) {
            this.targetResourceIdFilters = null;
            return;
        }

        this.targetResourceIdFilters = new java.util.ArrayList<CisStringFilter>(targetResourceIdFilters);
    }

    /**
     * <p>
     * The list of target resource ID filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetResourceIdFilters(java.util.Collection)} or
     * {@link #withTargetResourceIdFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetResourceIdFilters
     *        The list of target resource ID filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withTargetResourceIdFilters(CisStringFilter... targetResourceIdFilters) {
        if (this.targetResourceIdFilters == null) {
            setTargetResourceIdFilters(new java.util.ArrayList<CisStringFilter>(targetResourceIdFilters.length));
        }
        for (CisStringFilter ele : targetResourceIdFilters) {
            this.targetResourceIdFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of target resource ID filters.
     * </p>
     * 
     * @param targetResourceIdFilters
     *        The list of target resource ID filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withTargetResourceIdFilters(java.util.Collection<CisStringFilter> targetResourceIdFilters) {
        setTargetResourceIdFilters(targetResourceIdFilters);
        return this;
    }

    /**
     * <p>
     * The list of target resource tag filters.
     * </p>
     * 
     * @return The list of target resource tag filters.
     */

    public java.util.List<TagFilter> getTargetResourceTagFilters() {
        return targetResourceTagFilters;
    }

    /**
     * <p>
     * The list of target resource tag filters.
     * </p>
     * 
     * @param targetResourceTagFilters
     *        The list of target resource tag filters.
     */

    public void setTargetResourceTagFilters(java.util.Collection<TagFilter> targetResourceTagFilters) {
        if (targetResourceTagFilters == null) {
            this.targetResourceTagFilters = null;
            return;
        }

        this.targetResourceTagFilters = new java.util.ArrayList<TagFilter>(targetResourceTagFilters);
    }

    /**
     * <p>
     * The list of target resource tag filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetResourceTagFilters(java.util.Collection)} or
     * {@link #withTargetResourceTagFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetResourceTagFilters
     *        The list of target resource tag filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withTargetResourceTagFilters(TagFilter... targetResourceTagFilters) {
        if (this.targetResourceTagFilters == null) {
            setTargetResourceTagFilters(new java.util.ArrayList<TagFilter>(targetResourceTagFilters.length));
        }
        for (TagFilter ele : targetResourceTagFilters) {
            this.targetResourceTagFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of target resource tag filters.
     * </p>
     * 
     * @param targetResourceTagFilters
     *        The list of target resource tag filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansFilterCriteria withTargetResourceTagFilters(java.util.Collection<TagFilter> targetResourceTagFilters) {
        setTargetResourceTagFilters(targetResourceTagFilters);
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
        if (getFailedChecksFilters() != null)
            sb.append("FailedChecksFilters: ").append(getFailedChecksFilters()).append(",");
        if (getScanArnFilters() != null)
            sb.append("ScanArnFilters: ").append(getScanArnFilters()).append(",");
        if (getScanAtFilters() != null)
            sb.append("ScanAtFilters: ").append(getScanAtFilters()).append(",");
        if (getScanConfigurationArnFilters() != null)
            sb.append("ScanConfigurationArnFilters: ").append(getScanConfigurationArnFilters()).append(",");
        if (getScanNameFilters() != null)
            sb.append("ScanNameFilters: ").append(getScanNameFilters()).append(",");
        if (getScanStatusFilters() != null)
            sb.append("ScanStatusFilters: ").append(getScanStatusFilters()).append(",");
        if (getScheduledByFilters() != null)
            sb.append("ScheduledByFilters: ").append(getScheduledByFilters()).append(",");
        if (getTargetAccountIdFilters() != null)
            sb.append("TargetAccountIdFilters: ").append(getTargetAccountIdFilters()).append(",");
        if (getTargetResourceIdFilters() != null)
            sb.append("TargetResourceIdFilters: ").append(getTargetResourceIdFilters()).append(",");
        if (getTargetResourceTagFilters() != null)
            sb.append("TargetResourceTagFilters: ").append(getTargetResourceTagFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCisScansFilterCriteria == false)
            return false;
        ListCisScansFilterCriteria other = (ListCisScansFilterCriteria) obj;
        if (other.getFailedChecksFilters() == null ^ this.getFailedChecksFilters() == null)
            return false;
        if (other.getFailedChecksFilters() != null && other.getFailedChecksFilters().equals(this.getFailedChecksFilters()) == false)
            return false;
        if (other.getScanArnFilters() == null ^ this.getScanArnFilters() == null)
            return false;
        if (other.getScanArnFilters() != null && other.getScanArnFilters().equals(this.getScanArnFilters()) == false)
            return false;
        if (other.getScanAtFilters() == null ^ this.getScanAtFilters() == null)
            return false;
        if (other.getScanAtFilters() != null && other.getScanAtFilters().equals(this.getScanAtFilters()) == false)
            return false;
        if (other.getScanConfigurationArnFilters() == null ^ this.getScanConfigurationArnFilters() == null)
            return false;
        if (other.getScanConfigurationArnFilters() != null && other.getScanConfigurationArnFilters().equals(this.getScanConfigurationArnFilters()) == false)
            return false;
        if (other.getScanNameFilters() == null ^ this.getScanNameFilters() == null)
            return false;
        if (other.getScanNameFilters() != null && other.getScanNameFilters().equals(this.getScanNameFilters()) == false)
            return false;
        if (other.getScanStatusFilters() == null ^ this.getScanStatusFilters() == null)
            return false;
        if (other.getScanStatusFilters() != null && other.getScanStatusFilters().equals(this.getScanStatusFilters()) == false)
            return false;
        if (other.getScheduledByFilters() == null ^ this.getScheduledByFilters() == null)
            return false;
        if (other.getScheduledByFilters() != null && other.getScheduledByFilters().equals(this.getScheduledByFilters()) == false)
            return false;
        if (other.getTargetAccountIdFilters() == null ^ this.getTargetAccountIdFilters() == null)
            return false;
        if (other.getTargetAccountIdFilters() != null && other.getTargetAccountIdFilters().equals(this.getTargetAccountIdFilters()) == false)
            return false;
        if (other.getTargetResourceIdFilters() == null ^ this.getTargetResourceIdFilters() == null)
            return false;
        if (other.getTargetResourceIdFilters() != null && other.getTargetResourceIdFilters().equals(this.getTargetResourceIdFilters()) == false)
            return false;
        if (other.getTargetResourceTagFilters() == null ^ this.getTargetResourceTagFilters() == null)
            return false;
        if (other.getTargetResourceTagFilters() != null && other.getTargetResourceTagFilters().equals(this.getTargetResourceTagFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedChecksFilters() == null) ? 0 : getFailedChecksFilters().hashCode());
        hashCode = prime * hashCode + ((getScanArnFilters() == null) ? 0 : getScanArnFilters().hashCode());
        hashCode = prime * hashCode + ((getScanAtFilters() == null) ? 0 : getScanAtFilters().hashCode());
        hashCode = prime * hashCode + ((getScanConfigurationArnFilters() == null) ? 0 : getScanConfigurationArnFilters().hashCode());
        hashCode = prime * hashCode + ((getScanNameFilters() == null) ? 0 : getScanNameFilters().hashCode());
        hashCode = prime * hashCode + ((getScanStatusFilters() == null) ? 0 : getScanStatusFilters().hashCode());
        hashCode = prime * hashCode + ((getScheduledByFilters() == null) ? 0 : getScheduledByFilters().hashCode());
        hashCode = prime * hashCode + ((getTargetAccountIdFilters() == null) ? 0 : getTargetAccountIdFilters().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceIdFilters() == null) ? 0 : getTargetResourceIdFilters().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceTagFilters() == null) ? 0 : getTargetResourceTagFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListCisScansFilterCriteria clone() {
        try {
            return (ListCisScansFilterCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.ListCisScansFilterCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
