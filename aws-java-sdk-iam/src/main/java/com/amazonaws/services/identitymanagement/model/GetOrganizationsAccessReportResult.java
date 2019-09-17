/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetOrganizationsAccessReport" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOrganizationsAccessReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the report job
     * was created.
     * </p>
     */
    private java.util.Date jobCreationDate;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the generated
     * report job was completed or failed.
     * </p>
     * <p>
     * This field is null if the job is still in progress, as indicated by a job status value of
     * <code>IN_PROGRESS</code>.
     * </p>
     */
    private java.util.Date jobCompletionDate;
    /**
     * <p>
     * The number of services that the applicable SCPs allow account principals to access.
     * </p>
     */
    private Integer numberOfServicesAccessible;
    /**
     * <p>
     * The number of services that account principals are allowed but did not attempt to access.
     * </p>
     */
    private Integer numberOfServicesNotAccessed;
    /**
     * <p>
     * An object that contains details about the most recent attempt to access the service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AccessDetail> accessDetails;
    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     */
    private String marker;

    private ErrorDetails errorDetails;

    /**
     * <p>
     * The status of the job.
     * </p>
     * 
     * @param jobStatus
     *        The status of the job.
     * @see JobStatusType
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * 
     * @return The status of the job.
     * @see JobStatusType
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * 
     * @param jobStatus
     *        The status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatusType
     */

    public GetOrganizationsAccessReportResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * 
     * @param jobStatus
     *        The status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatusType
     */

    public GetOrganizationsAccessReportResult withJobStatus(JobStatusType jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the report job
     * was created.
     * </p>
     * 
     * @param jobCreationDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        report job was created.
     */

    public void setJobCreationDate(java.util.Date jobCreationDate) {
        this.jobCreationDate = jobCreationDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the report job
     * was created.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         report job was created.
     */

    public java.util.Date getJobCreationDate() {
        return this.jobCreationDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the report job
     * was created.
     * </p>
     * 
     * @param jobCreationDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        report job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationsAccessReportResult withJobCreationDate(java.util.Date jobCreationDate) {
        setJobCreationDate(jobCreationDate);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the generated
     * report job was completed or failed.
     * </p>
     * <p>
     * This field is null if the job is still in progress, as indicated by a job status value of
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param jobCompletionDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        generated report job was completed or failed.</p>
     *        <p>
     *        This field is null if the job is still in progress, as indicated by a job status value of
     *        <code>IN_PROGRESS</code>.
     */

    public void setJobCompletionDate(java.util.Date jobCompletionDate) {
        this.jobCompletionDate = jobCompletionDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the generated
     * report job was completed or failed.
     * </p>
     * <p>
     * This field is null if the job is still in progress, as indicated by a job status value of
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         generated report job was completed or failed.</p>
     *         <p>
     *         This field is null if the job is still in progress, as indicated by a job status value of
     *         <code>IN_PROGRESS</code>.
     */

    public java.util.Date getJobCompletionDate() {
        return this.jobCompletionDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the generated
     * report job was completed or failed.
     * </p>
     * <p>
     * This field is null if the job is still in progress, as indicated by a job status value of
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param jobCompletionDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        generated report job was completed or failed.</p>
     *        <p>
     *        This field is null if the job is still in progress, as indicated by a job status value of
     *        <code>IN_PROGRESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationsAccessReportResult withJobCompletionDate(java.util.Date jobCompletionDate) {
        setJobCompletionDate(jobCompletionDate);
        return this;
    }

    /**
     * <p>
     * The number of services that the applicable SCPs allow account principals to access.
     * </p>
     * 
     * @param numberOfServicesAccessible
     *        The number of services that the applicable SCPs allow account principals to access.
     */

    public void setNumberOfServicesAccessible(Integer numberOfServicesAccessible) {
        this.numberOfServicesAccessible = numberOfServicesAccessible;
    }

    /**
     * <p>
     * The number of services that the applicable SCPs allow account principals to access.
     * </p>
     * 
     * @return The number of services that the applicable SCPs allow account principals to access.
     */

    public Integer getNumberOfServicesAccessible() {
        return this.numberOfServicesAccessible;
    }

    /**
     * <p>
     * The number of services that the applicable SCPs allow account principals to access.
     * </p>
     * 
     * @param numberOfServicesAccessible
     *        The number of services that the applicable SCPs allow account principals to access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationsAccessReportResult withNumberOfServicesAccessible(Integer numberOfServicesAccessible) {
        setNumberOfServicesAccessible(numberOfServicesAccessible);
        return this;
    }

    /**
     * <p>
     * The number of services that account principals are allowed but did not attempt to access.
     * </p>
     * 
     * @param numberOfServicesNotAccessed
     *        The number of services that account principals are allowed but did not attempt to access.
     */

    public void setNumberOfServicesNotAccessed(Integer numberOfServicesNotAccessed) {
        this.numberOfServicesNotAccessed = numberOfServicesNotAccessed;
    }

    /**
     * <p>
     * The number of services that account principals are allowed but did not attempt to access.
     * </p>
     * 
     * @return The number of services that account principals are allowed but did not attempt to access.
     */

    public Integer getNumberOfServicesNotAccessed() {
        return this.numberOfServicesNotAccessed;
    }

    /**
     * <p>
     * The number of services that account principals are allowed but did not attempt to access.
     * </p>
     * 
     * @param numberOfServicesNotAccessed
     *        The number of services that account principals are allowed but did not attempt to access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationsAccessReportResult withNumberOfServicesNotAccessed(Integer numberOfServicesNotAccessed) {
        setNumberOfServicesNotAccessed(numberOfServicesNotAccessed);
        return this;
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access the service.
     * </p>
     * 
     * @return An object that contains details about the most recent attempt to access the service.
     */

    public java.util.List<AccessDetail> getAccessDetails() {
        if (accessDetails == null) {
            accessDetails = new com.amazonaws.internal.SdkInternalList<AccessDetail>();
        }
        return accessDetails;
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access the service.
     * </p>
     * 
     * @param accessDetails
     *        An object that contains details about the most recent attempt to access the service.
     */

    public void setAccessDetails(java.util.Collection<AccessDetail> accessDetails) {
        if (accessDetails == null) {
            this.accessDetails = null;
            return;
        }

        this.accessDetails = new com.amazonaws.internal.SdkInternalList<AccessDetail>(accessDetails);
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessDetails(java.util.Collection)} or {@link #withAccessDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param accessDetails
     *        An object that contains details about the most recent attempt to access the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationsAccessReportResult withAccessDetails(AccessDetail... accessDetails) {
        if (this.accessDetails == null) {
            setAccessDetails(new com.amazonaws.internal.SdkInternalList<AccessDetail>(accessDetails.length));
        }
        for (AccessDetail ele : accessDetails) {
            this.accessDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access the service.
     * </p>
     * 
     * @param accessDetails
     *        An object that contains details about the most recent attempt to access the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationsAccessReportResult withAccessDetails(java.util.Collection<AccessDetail> accessDetails) {
        setAccessDetails(accessDetails);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more items to return. If your results were truncated, you can make
     *        a subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items.
     *        Note that IAM might return fewer than the <code>MaxItems</code> number of results even when there are more
     *        results available. We recommend that you check <code>IsTruncated</code> after every call to ensure that
     *        you receive all your results.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @return A flag that indicates whether there are more items to return. If your results were truncated, you can
     *         make a subsequent pagination request using the <code>Marker</code> request parameter to retrieve more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code> number of results even when there
     *         are more results available. We recommend that you check <code>IsTruncated</code> after every call to
     *         ensure that you receive all your results.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more items to return. If your results were truncated, you can make
     *        a subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items.
     *        Note that IAM might return fewer than the <code>MaxItems</code> number of results even when there are more
     *        results available. We recommend that you check <code>IsTruncated</code> after every call to ensure that
     *        you receive all your results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationsAccessReportResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @return A flag that indicates whether there are more items to return. If your results were truncated, you can
     *         make a subsequent pagination request using the <code>Marker</code> request parameter to retrieve more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code> number of results even when there
     *         are more results available. We recommend that you check <code>IsTruncated</code> after every call to
     *         ensure that you receive all your results.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     * 
     * @param marker
     *        When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use
     *        for the <code>Marker</code> parameter in a subsequent pagination request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     * 
     * @return When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use
     *         for the <code>Marker</code> parameter in a subsequent pagination request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     * 
     * @param marker
     *        When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use
     *        for the <code>Marker</code> parameter in a subsequent pagination request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationsAccessReportResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * @param errorDetails
     */

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * @return
     */

    public ErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    /**
     * @param errorDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationsAccessReportResult withErrorDetails(ErrorDetails errorDetails) {
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
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getJobCreationDate() != null)
            sb.append("JobCreationDate: ").append(getJobCreationDate()).append(",");
        if (getJobCompletionDate() != null)
            sb.append("JobCompletionDate: ").append(getJobCompletionDate()).append(",");
        if (getNumberOfServicesAccessible() != null)
            sb.append("NumberOfServicesAccessible: ").append(getNumberOfServicesAccessible()).append(",");
        if (getNumberOfServicesNotAccessed() != null)
            sb.append("NumberOfServicesNotAccessed: ").append(getNumberOfServicesNotAccessed()).append(",");
        if (getAccessDetails() != null)
            sb.append("AccessDetails: ").append(getAccessDetails()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
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

        if (obj instanceof GetOrganizationsAccessReportResult == false)
            return false;
        GetOrganizationsAccessReportResult other = (GetOrganizationsAccessReportResult) obj;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getJobCreationDate() == null ^ this.getJobCreationDate() == null)
            return false;
        if (other.getJobCreationDate() != null && other.getJobCreationDate().equals(this.getJobCreationDate()) == false)
            return false;
        if (other.getJobCompletionDate() == null ^ this.getJobCompletionDate() == null)
            return false;
        if (other.getJobCompletionDate() != null && other.getJobCompletionDate().equals(this.getJobCompletionDate()) == false)
            return false;
        if (other.getNumberOfServicesAccessible() == null ^ this.getNumberOfServicesAccessible() == null)
            return false;
        if (other.getNumberOfServicesAccessible() != null && other.getNumberOfServicesAccessible().equals(this.getNumberOfServicesAccessible()) == false)
            return false;
        if (other.getNumberOfServicesNotAccessed() == null ^ this.getNumberOfServicesNotAccessed() == null)
            return false;
        if (other.getNumberOfServicesNotAccessed() != null && other.getNumberOfServicesNotAccessed().equals(this.getNumberOfServicesNotAccessed()) == false)
            return false;
        if (other.getAccessDetails() == null ^ this.getAccessDetails() == null)
            return false;
        if (other.getAccessDetails() != null && other.getAccessDetails().equals(this.getAccessDetails()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
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

        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getJobCreationDate() == null) ? 0 : getJobCreationDate().hashCode());
        hashCode = prime * hashCode + ((getJobCompletionDate() == null) ? 0 : getJobCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getNumberOfServicesAccessible() == null) ? 0 : getNumberOfServicesAccessible().hashCode());
        hashCode = prime * hashCode + ((getNumberOfServicesNotAccessed() == null) ? 0 : getNumberOfServicesNotAccessed().hashCode());
        hashCode = prime * hashCode + ((getAccessDetails() == null) ? 0 : getAccessDetails().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public GetOrganizationsAccessReportResult clone() {
        try {
            return (GetOrganizationsAccessReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
