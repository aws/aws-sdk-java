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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetServiceLastAccessedDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceLastAccessedDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

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
     * A <code>ServiceLastAccessed</code> object that contains details about the most recent attempt to access the
     * service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServiceLastAccessed> servicesLastAccessed;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the generated
     * report job was completed or failed.
     * </p>
     * <p>
     * This field is null if the job is still in progress, as indicated by a <code>JobStatus</code> value of
     * <code>IN_PROGRESS</code>.
     * </p>
     */
    private java.util.Date jobCompletionDate;
    /**
     * <p/>
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
    /**
     * <p>
     * An object that contains details about the reason the operation failed.
     * </p>
     */
    private ErrorDetails error;

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

    public GetServiceLastAccessedDetailsResult withJobStatus(String jobStatus) {
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

    public GetServiceLastAccessedDetailsResult withJobStatus(JobStatusType jobStatus) {
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

    public GetServiceLastAccessedDetailsResult withJobCreationDate(java.util.Date jobCreationDate) {
        setJobCreationDate(jobCreationDate);
        return this;
    }

    /**
     * <p>
     * A <code>ServiceLastAccessed</code> object that contains details about the most recent attempt to access the
     * service.
     * </p>
     * 
     * @return A <code>ServiceLastAccessed</code> object that contains details about the most recent attempt to access
     *         the service.
     */

    public java.util.List<ServiceLastAccessed> getServicesLastAccessed() {
        if (servicesLastAccessed == null) {
            servicesLastAccessed = new com.amazonaws.internal.SdkInternalList<ServiceLastAccessed>();
        }
        return servicesLastAccessed;
    }

    /**
     * <p>
     * A <code>ServiceLastAccessed</code> object that contains details about the most recent attempt to access the
     * service.
     * </p>
     * 
     * @param servicesLastAccessed
     *        A <code>ServiceLastAccessed</code> object that contains details about the most recent attempt to access
     *        the service.
     */

    public void setServicesLastAccessed(java.util.Collection<ServiceLastAccessed> servicesLastAccessed) {
        if (servicesLastAccessed == null) {
            this.servicesLastAccessed = null;
            return;
        }

        this.servicesLastAccessed = new com.amazonaws.internal.SdkInternalList<ServiceLastAccessed>(servicesLastAccessed);
    }

    /**
     * <p>
     * A <code>ServiceLastAccessed</code> object that contains details about the most recent attempt to access the
     * service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServicesLastAccessed(java.util.Collection)} or {@link #withServicesLastAccessed(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param servicesLastAccessed
     *        A <code>ServiceLastAccessed</code> object that contains details about the most recent attempt to access
     *        the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceLastAccessedDetailsResult withServicesLastAccessed(ServiceLastAccessed... servicesLastAccessed) {
        if (this.servicesLastAccessed == null) {
            setServicesLastAccessed(new com.amazonaws.internal.SdkInternalList<ServiceLastAccessed>(servicesLastAccessed.length));
        }
        for (ServiceLastAccessed ele : servicesLastAccessed) {
            this.servicesLastAccessed.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A <code>ServiceLastAccessed</code> object that contains details about the most recent attempt to access the
     * service.
     * </p>
     * 
     * @param servicesLastAccessed
     *        A <code>ServiceLastAccessed</code> object that contains details about the most recent attempt to access
     *        the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceLastAccessedDetailsResult withServicesLastAccessed(java.util.Collection<ServiceLastAccessed> servicesLastAccessed) {
        setServicesLastAccessed(servicesLastAccessed);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the generated
     * report job was completed or failed.
     * </p>
     * <p>
     * This field is null if the job is still in progress, as indicated by a <code>JobStatus</code> value of
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param jobCompletionDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        generated report job was completed or failed.</p>
     *        <p>
     *        This field is null if the job is still in progress, as indicated by a <code>JobStatus</code> value of
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
     * This field is null if the job is still in progress, as indicated by a <code>JobStatus</code> value of
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         generated report job was completed or failed.</p>
     *         <p>
     *         This field is null if the job is still in progress, as indicated by a <code>JobStatus</code> value of
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
     * This field is null if the job is still in progress, as indicated by a <code>JobStatus</code> value of
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param jobCompletionDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        generated report job was completed or failed.</p>
     *        <p>
     *        This field is null if the job is still in progress, as indicated by a <code>JobStatus</code> value of
     *        <code>IN_PROGRESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceLastAccessedDetailsResult withJobCompletionDate(java.util.Date jobCompletionDate) {
        setJobCompletionDate(jobCompletionDate);
        return this;
    }

    /**
     * <p/>
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @param isTruncated
     *        <p>
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
     * <p/>
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @return <p>
     *         A flag that indicates whether there are more items to return. If your results were truncated, you can
     *         make a subsequent pagination request using the <code>Marker</code> request parameter to retrieve more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code> number of results even when there
     *         are more results available. We recommend that you check <code>IsTruncated</code> after every call to
     *         ensure that you receive all your results.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p/>
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @param isTruncated
     *        <p>
     *        A flag that indicates whether there are more items to return. If your results were truncated, you can make
     *        a subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items.
     *        Note that IAM might return fewer than the <code>MaxItems</code> number of results even when there are more
     *        results available. We recommend that you check <code>IsTruncated</code> after every call to ensure that
     *        you receive all your results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceLastAccessedDetailsResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p/>
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @return <p>
     *         A flag that indicates whether there are more items to return. If your results were truncated, you can
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

    public GetServiceLastAccessedDetailsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * An object that contains details about the reason the operation failed.
     * </p>
     * 
     * @param error
     *        An object that contains details about the reason the operation failed.
     */

    public void setError(ErrorDetails error) {
        this.error = error;
    }

    /**
     * <p>
     * An object that contains details about the reason the operation failed.
     * </p>
     * 
     * @return An object that contains details about the reason the operation failed.
     */

    public ErrorDetails getError() {
        return this.error;
    }

    /**
     * <p>
     * An object that contains details about the reason the operation failed.
     * </p>
     * 
     * @param error
     *        An object that contains details about the reason the operation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceLastAccessedDetailsResult withError(ErrorDetails error) {
        setError(error);
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
        if (getServicesLastAccessed() != null)
            sb.append("ServicesLastAccessed: ").append(getServicesLastAccessed()).append(",");
        if (getJobCompletionDate() != null)
            sb.append("JobCompletionDate: ").append(getJobCompletionDate()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceLastAccessedDetailsResult == false)
            return false;
        GetServiceLastAccessedDetailsResult other = (GetServiceLastAccessedDetailsResult) obj;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getJobCreationDate() == null ^ this.getJobCreationDate() == null)
            return false;
        if (other.getJobCreationDate() != null && other.getJobCreationDate().equals(this.getJobCreationDate()) == false)
            return false;
        if (other.getServicesLastAccessed() == null ^ this.getServicesLastAccessed() == null)
            return false;
        if (other.getServicesLastAccessed() != null && other.getServicesLastAccessed().equals(this.getServicesLastAccessed()) == false)
            return false;
        if (other.getJobCompletionDate() == null ^ this.getJobCompletionDate() == null)
            return false;
        if (other.getJobCompletionDate() != null && other.getJobCompletionDate().equals(this.getJobCompletionDate()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getJobCreationDate() == null) ? 0 : getJobCreationDate().hashCode());
        hashCode = prime * hashCode + ((getServicesLastAccessed() == null) ? 0 : getServicesLastAccessed().hashCode());
        hashCode = prime * hashCode + ((getJobCompletionDate() == null) ? 0 : getJobCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceLastAccessedDetailsResult clone() {
        try {
            return (GetServiceLastAccessedDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
