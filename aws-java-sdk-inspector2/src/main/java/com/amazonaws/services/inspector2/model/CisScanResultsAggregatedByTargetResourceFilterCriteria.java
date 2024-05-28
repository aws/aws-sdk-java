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
 * The scan results aggregated by target resource filter criteria.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CisScanResultsAggregatedByTargetResourceFilterCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisScanResultsAggregatedByTargetResourceFilterCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The criteria's account ID filters.
     * </p>
     */
    private java.util.List<CisStringFilter> accountIdFilters;
    /**
     * <p>
     * The criteria's check ID filters.
     * </p>
     */
    private java.util.List<CisStringFilter> checkIdFilters;
    /**
     * <p>
     * The criteria's failed checks filters.
     * </p>
     */
    private java.util.List<CisNumberFilter> failedChecksFilters;
    /**
     * <p>
     * The criteria's platform filters.
     * </p>
     */
    private java.util.List<CisStringFilter> platformFilters;
    /**
     * <p>
     * The criteria's status filter.
     * </p>
     */
    private java.util.List<CisResultStatusFilter> statusFilters;
    /**
     * <p>
     * The criteria's target resource ID filters.
     * </p>
     */
    private java.util.List<CisStringFilter> targetResourceIdFilters;
    /**
     * <p>
     * The criteria's target resource tag filters.
     * </p>
     */
    private java.util.List<TagFilter> targetResourceTagFilters;
    /**
     * <p>
     * The criteria's target status filters.
     * </p>
     */
    private java.util.List<CisTargetStatusFilter> targetStatusFilters;
    /**
     * <p>
     * The criteria's target status reason filters.
     * </p>
     */
    private java.util.List<CisTargetStatusReasonFilter> targetStatusReasonFilters;

    /**
     * <p>
     * The criteria's account ID filters.
     * </p>
     * 
     * @return The criteria's account ID filters.
     */

    public java.util.List<CisStringFilter> getAccountIdFilters() {
        return accountIdFilters;
    }

    /**
     * <p>
     * The criteria's account ID filters.
     * </p>
     * 
     * @param accountIdFilters
     *        The criteria's account ID filters.
     */

    public void setAccountIdFilters(java.util.Collection<CisStringFilter> accountIdFilters) {
        if (accountIdFilters == null) {
            this.accountIdFilters = null;
            return;
        }

        this.accountIdFilters = new java.util.ArrayList<CisStringFilter>(accountIdFilters);
    }

    /**
     * <p>
     * The criteria's account ID filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIdFilters(java.util.Collection)} or {@link #withAccountIdFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param accountIdFilters
     *        The criteria's account ID filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withAccountIdFilters(CisStringFilter... accountIdFilters) {
        if (this.accountIdFilters == null) {
            setAccountIdFilters(new java.util.ArrayList<CisStringFilter>(accountIdFilters.length));
        }
        for (CisStringFilter ele : accountIdFilters) {
            this.accountIdFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The criteria's account ID filters.
     * </p>
     * 
     * @param accountIdFilters
     *        The criteria's account ID filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withAccountIdFilters(java.util.Collection<CisStringFilter> accountIdFilters) {
        setAccountIdFilters(accountIdFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's check ID filters.
     * </p>
     * 
     * @return The criteria's check ID filters.
     */

    public java.util.List<CisStringFilter> getCheckIdFilters() {
        return checkIdFilters;
    }

    /**
     * <p>
     * The criteria's check ID filters.
     * </p>
     * 
     * @param checkIdFilters
     *        The criteria's check ID filters.
     */

    public void setCheckIdFilters(java.util.Collection<CisStringFilter> checkIdFilters) {
        if (checkIdFilters == null) {
            this.checkIdFilters = null;
            return;
        }

        this.checkIdFilters = new java.util.ArrayList<CisStringFilter>(checkIdFilters);
    }

    /**
     * <p>
     * The criteria's check ID filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCheckIdFilters(java.util.Collection)} or {@link #withCheckIdFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param checkIdFilters
     *        The criteria's check ID filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withCheckIdFilters(CisStringFilter... checkIdFilters) {
        if (this.checkIdFilters == null) {
            setCheckIdFilters(new java.util.ArrayList<CisStringFilter>(checkIdFilters.length));
        }
        for (CisStringFilter ele : checkIdFilters) {
            this.checkIdFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The criteria's check ID filters.
     * </p>
     * 
     * @param checkIdFilters
     *        The criteria's check ID filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withCheckIdFilters(java.util.Collection<CisStringFilter> checkIdFilters) {
        setCheckIdFilters(checkIdFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's failed checks filters.
     * </p>
     * 
     * @return The criteria's failed checks filters.
     */

    public java.util.List<CisNumberFilter> getFailedChecksFilters() {
        return failedChecksFilters;
    }

    /**
     * <p>
     * The criteria's failed checks filters.
     * </p>
     * 
     * @param failedChecksFilters
     *        The criteria's failed checks filters.
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
     * The criteria's failed checks filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedChecksFilters(java.util.Collection)} or {@link #withFailedChecksFilters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param failedChecksFilters
     *        The criteria's failed checks filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withFailedChecksFilters(CisNumberFilter... failedChecksFilters) {
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
     * The criteria's failed checks filters.
     * </p>
     * 
     * @param failedChecksFilters
     *        The criteria's failed checks filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withFailedChecksFilters(java.util.Collection<CisNumberFilter> failedChecksFilters) {
        setFailedChecksFilters(failedChecksFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's platform filters.
     * </p>
     * 
     * @return The criteria's platform filters.
     */

    public java.util.List<CisStringFilter> getPlatformFilters() {
        return platformFilters;
    }

    /**
     * <p>
     * The criteria's platform filters.
     * </p>
     * 
     * @param platformFilters
     *        The criteria's platform filters.
     */

    public void setPlatformFilters(java.util.Collection<CisStringFilter> platformFilters) {
        if (platformFilters == null) {
            this.platformFilters = null;
            return;
        }

        this.platformFilters = new java.util.ArrayList<CisStringFilter>(platformFilters);
    }

    /**
     * <p>
     * The criteria's platform filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatformFilters(java.util.Collection)} or {@link #withPlatformFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param platformFilters
     *        The criteria's platform filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withPlatformFilters(CisStringFilter... platformFilters) {
        if (this.platformFilters == null) {
            setPlatformFilters(new java.util.ArrayList<CisStringFilter>(platformFilters.length));
        }
        for (CisStringFilter ele : platformFilters) {
            this.platformFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The criteria's platform filters.
     * </p>
     * 
     * @param platformFilters
     *        The criteria's platform filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withPlatformFilters(java.util.Collection<CisStringFilter> platformFilters) {
        setPlatformFilters(platformFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's status filter.
     * </p>
     * 
     * @return The criteria's status filter.
     */

    public java.util.List<CisResultStatusFilter> getStatusFilters() {
        return statusFilters;
    }

    /**
     * <p>
     * The criteria's status filter.
     * </p>
     * 
     * @param statusFilters
     *        The criteria's status filter.
     */

    public void setStatusFilters(java.util.Collection<CisResultStatusFilter> statusFilters) {
        if (statusFilters == null) {
            this.statusFilters = null;
            return;
        }

        this.statusFilters = new java.util.ArrayList<CisResultStatusFilter>(statusFilters);
    }

    /**
     * <p>
     * The criteria's status filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatusFilters(java.util.Collection)} or {@link #withStatusFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param statusFilters
     *        The criteria's status filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withStatusFilters(CisResultStatusFilter... statusFilters) {
        if (this.statusFilters == null) {
            setStatusFilters(new java.util.ArrayList<CisResultStatusFilter>(statusFilters.length));
        }
        for (CisResultStatusFilter ele : statusFilters) {
            this.statusFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The criteria's status filter.
     * </p>
     * 
     * @param statusFilters
     *        The criteria's status filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withStatusFilters(java.util.Collection<CisResultStatusFilter> statusFilters) {
        setStatusFilters(statusFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's target resource ID filters.
     * </p>
     * 
     * @return The criteria's target resource ID filters.
     */

    public java.util.List<CisStringFilter> getTargetResourceIdFilters() {
        return targetResourceIdFilters;
    }

    /**
     * <p>
     * The criteria's target resource ID filters.
     * </p>
     * 
     * @param targetResourceIdFilters
     *        The criteria's target resource ID filters.
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
     * The criteria's target resource ID filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetResourceIdFilters(java.util.Collection)} or
     * {@link #withTargetResourceIdFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetResourceIdFilters
     *        The criteria's target resource ID filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withTargetResourceIdFilters(CisStringFilter... targetResourceIdFilters) {
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
     * The criteria's target resource ID filters.
     * </p>
     * 
     * @param targetResourceIdFilters
     *        The criteria's target resource ID filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withTargetResourceIdFilters(java.util.Collection<CisStringFilter> targetResourceIdFilters) {
        setTargetResourceIdFilters(targetResourceIdFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's target resource tag filters.
     * </p>
     * 
     * @return The criteria's target resource tag filters.
     */

    public java.util.List<TagFilter> getTargetResourceTagFilters() {
        return targetResourceTagFilters;
    }

    /**
     * <p>
     * The criteria's target resource tag filters.
     * </p>
     * 
     * @param targetResourceTagFilters
     *        The criteria's target resource tag filters.
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
     * The criteria's target resource tag filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetResourceTagFilters(java.util.Collection)} or
     * {@link #withTargetResourceTagFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetResourceTagFilters
     *        The criteria's target resource tag filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withTargetResourceTagFilters(TagFilter... targetResourceTagFilters) {
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
     * The criteria's target resource tag filters.
     * </p>
     * 
     * @param targetResourceTagFilters
     *        The criteria's target resource tag filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withTargetResourceTagFilters(java.util.Collection<TagFilter> targetResourceTagFilters) {
        setTargetResourceTagFilters(targetResourceTagFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's target status filters.
     * </p>
     * 
     * @return The criteria's target status filters.
     */

    public java.util.List<CisTargetStatusFilter> getTargetStatusFilters() {
        return targetStatusFilters;
    }

    /**
     * <p>
     * The criteria's target status filters.
     * </p>
     * 
     * @param targetStatusFilters
     *        The criteria's target status filters.
     */

    public void setTargetStatusFilters(java.util.Collection<CisTargetStatusFilter> targetStatusFilters) {
        if (targetStatusFilters == null) {
            this.targetStatusFilters = null;
            return;
        }

        this.targetStatusFilters = new java.util.ArrayList<CisTargetStatusFilter>(targetStatusFilters);
    }

    /**
     * <p>
     * The criteria's target status filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetStatusFilters(java.util.Collection)} or {@link #withTargetStatusFilters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param targetStatusFilters
     *        The criteria's target status filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withTargetStatusFilters(CisTargetStatusFilter... targetStatusFilters) {
        if (this.targetStatusFilters == null) {
            setTargetStatusFilters(new java.util.ArrayList<CisTargetStatusFilter>(targetStatusFilters.length));
        }
        for (CisTargetStatusFilter ele : targetStatusFilters) {
            this.targetStatusFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The criteria's target status filters.
     * </p>
     * 
     * @param targetStatusFilters
     *        The criteria's target status filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withTargetStatusFilters(java.util.Collection<CisTargetStatusFilter> targetStatusFilters) {
        setTargetStatusFilters(targetStatusFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's target status reason filters.
     * </p>
     * 
     * @return The criteria's target status reason filters.
     */

    public java.util.List<CisTargetStatusReasonFilter> getTargetStatusReasonFilters() {
        return targetStatusReasonFilters;
    }

    /**
     * <p>
     * The criteria's target status reason filters.
     * </p>
     * 
     * @param targetStatusReasonFilters
     *        The criteria's target status reason filters.
     */

    public void setTargetStatusReasonFilters(java.util.Collection<CisTargetStatusReasonFilter> targetStatusReasonFilters) {
        if (targetStatusReasonFilters == null) {
            this.targetStatusReasonFilters = null;
            return;
        }

        this.targetStatusReasonFilters = new java.util.ArrayList<CisTargetStatusReasonFilter>(targetStatusReasonFilters);
    }

    /**
     * <p>
     * The criteria's target status reason filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetStatusReasonFilters(java.util.Collection)} or
     * {@link #withTargetStatusReasonFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetStatusReasonFilters
     *        The criteria's target status reason filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withTargetStatusReasonFilters(CisTargetStatusReasonFilter... targetStatusReasonFilters) {
        if (this.targetStatusReasonFilters == null) {
            setTargetStatusReasonFilters(new java.util.ArrayList<CisTargetStatusReasonFilter>(targetStatusReasonFilters.length));
        }
        for (CisTargetStatusReasonFilter ele : targetStatusReasonFilters) {
            this.targetStatusReasonFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The criteria's target status reason filters.
     * </p>
     * 
     * @param targetStatusReasonFilters
     *        The criteria's target status reason filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByTargetResourceFilterCriteria withTargetStatusReasonFilters(
            java.util.Collection<CisTargetStatusReasonFilter> targetStatusReasonFilters) {
        setTargetStatusReasonFilters(targetStatusReasonFilters);
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
        if (getAccountIdFilters() != null)
            sb.append("AccountIdFilters: ").append(getAccountIdFilters()).append(",");
        if (getCheckIdFilters() != null)
            sb.append("CheckIdFilters: ").append(getCheckIdFilters()).append(",");
        if (getFailedChecksFilters() != null)
            sb.append("FailedChecksFilters: ").append(getFailedChecksFilters()).append(",");
        if (getPlatformFilters() != null)
            sb.append("PlatformFilters: ").append(getPlatformFilters()).append(",");
        if (getStatusFilters() != null)
            sb.append("StatusFilters: ").append(getStatusFilters()).append(",");
        if (getTargetResourceIdFilters() != null)
            sb.append("TargetResourceIdFilters: ").append(getTargetResourceIdFilters()).append(",");
        if (getTargetResourceTagFilters() != null)
            sb.append("TargetResourceTagFilters: ").append(getTargetResourceTagFilters()).append(",");
        if (getTargetStatusFilters() != null)
            sb.append("TargetStatusFilters: ").append(getTargetStatusFilters()).append(",");
        if (getTargetStatusReasonFilters() != null)
            sb.append("TargetStatusReasonFilters: ").append(getTargetStatusReasonFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CisScanResultsAggregatedByTargetResourceFilterCriteria == false)
            return false;
        CisScanResultsAggregatedByTargetResourceFilterCriteria other = (CisScanResultsAggregatedByTargetResourceFilterCriteria) obj;
        if (other.getAccountIdFilters() == null ^ this.getAccountIdFilters() == null)
            return false;
        if (other.getAccountIdFilters() != null && other.getAccountIdFilters().equals(this.getAccountIdFilters()) == false)
            return false;
        if (other.getCheckIdFilters() == null ^ this.getCheckIdFilters() == null)
            return false;
        if (other.getCheckIdFilters() != null && other.getCheckIdFilters().equals(this.getCheckIdFilters()) == false)
            return false;
        if (other.getFailedChecksFilters() == null ^ this.getFailedChecksFilters() == null)
            return false;
        if (other.getFailedChecksFilters() != null && other.getFailedChecksFilters().equals(this.getFailedChecksFilters()) == false)
            return false;
        if (other.getPlatformFilters() == null ^ this.getPlatformFilters() == null)
            return false;
        if (other.getPlatformFilters() != null && other.getPlatformFilters().equals(this.getPlatformFilters()) == false)
            return false;
        if (other.getStatusFilters() == null ^ this.getStatusFilters() == null)
            return false;
        if (other.getStatusFilters() != null && other.getStatusFilters().equals(this.getStatusFilters()) == false)
            return false;
        if (other.getTargetResourceIdFilters() == null ^ this.getTargetResourceIdFilters() == null)
            return false;
        if (other.getTargetResourceIdFilters() != null && other.getTargetResourceIdFilters().equals(this.getTargetResourceIdFilters()) == false)
            return false;
        if (other.getTargetResourceTagFilters() == null ^ this.getTargetResourceTagFilters() == null)
            return false;
        if (other.getTargetResourceTagFilters() != null && other.getTargetResourceTagFilters().equals(this.getTargetResourceTagFilters()) == false)
            return false;
        if (other.getTargetStatusFilters() == null ^ this.getTargetStatusFilters() == null)
            return false;
        if (other.getTargetStatusFilters() != null && other.getTargetStatusFilters().equals(this.getTargetStatusFilters()) == false)
            return false;
        if (other.getTargetStatusReasonFilters() == null ^ this.getTargetStatusReasonFilters() == null)
            return false;
        if (other.getTargetStatusReasonFilters() != null && other.getTargetStatusReasonFilters().equals(this.getTargetStatusReasonFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIdFilters() == null) ? 0 : getAccountIdFilters().hashCode());
        hashCode = prime * hashCode + ((getCheckIdFilters() == null) ? 0 : getCheckIdFilters().hashCode());
        hashCode = prime * hashCode + ((getFailedChecksFilters() == null) ? 0 : getFailedChecksFilters().hashCode());
        hashCode = prime * hashCode + ((getPlatformFilters() == null) ? 0 : getPlatformFilters().hashCode());
        hashCode = prime * hashCode + ((getStatusFilters() == null) ? 0 : getStatusFilters().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceIdFilters() == null) ? 0 : getTargetResourceIdFilters().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceTagFilters() == null) ? 0 : getTargetResourceTagFilters().hashCode());
        hashCode = prime * hashCode + ((getTargetStatusFilters() == null) ? 0 : getTargetStatusFilters().hashCode());
        hashCode = prime * hashCode + ((getTargetStatusReasonFilters() == null) ? 0 : getTargetStatusReasonFilters().hashCode());
        return hashCode;
    }

    @Override
    public CisScanResultsAggregatedByTargetResourceFilterCriteria clone() {
        try {
            return (CisScanResultsAggregatedByTargetResourceFilterCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CisScanResultsAggregatedByTargetResourceFilterCriteriaMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
