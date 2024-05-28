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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A summary of the resource scan. This is returned by the <code>ListResourceScan</code> API action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ResourceScanSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceScanSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan.
     * </p>
     */
    private String resourceScanId;
    /**
     * <p>
     * Status of the resource scan.
     * </p>
     * <dl>
     * <dt>INPROGRESS</dt>
     * <dd>
     * <p>
     * The resource scan is still in progress.
     * </p>
     * </dd>
     * <dt>COMPLETE</dt>
     * <dd>
     * <p>
     * The resource scan is complete.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The resource scan has expired.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The resource scan has failed.
     * </p>
     * </dd>
     * </dl>
     */
    private String status;
    /**
     * <p>
     * The reason for the resource scan status, providing more information if a failure happened.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The time that the resource scan was started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time that the resource scan was finished.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The percentage of the resource scan that has been completed.
     * </p>
     */
    private Double percentageCompleted;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan.
     * </p>
     * 
     * @param resourceScanId
     *        The Amazon Resource Name (ARN) of the resource scan.
     */

    public void setResourceScanId(String resourceScanId) {
        this.resourceScanId = resourceScanId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource scan.
     */

    public String getResourceScanId() {
        return this.resourceScanId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan.
     * </p>
     * 
     * @param resourceScanId
     *        The Amazon Resource Name (ARN) of the resource scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceScanSummary withResourceScanId(String resourceScanId) {
        setResourceScanId(resourceScanId);
        return this;
    }

    /**
     * <p>
     * Status of the resource scan.
     * </p>
     * <dl>
     * <dt>INPROGRESS</dt>
     * <dd>
     * <p>
     * The resource scan is still in progress.
     * </p>
     * </dd>
     * <dt>COMPLETE</dt>
     * <dd>
     * <p>
     * The resource scan is complete.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The resource scan has expired.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The resource scan has failed.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        Status of the resource scan.</p>
     *        <dl>
     *        <dt>INPROGRESS</dt>
     *        <dd>
     *        <p>
     *        The resource scan is still in progress.
     *        </p>
     *        </dd>
     *        <dt>COMPLETE</dt>
     *        <dd>
     *        <p>
     *        The resource scan is complete.
     *        </p>
     *        </dd>
     *        <dt>EXPIRED</dt>
     *        <dd>
     *        <p>
     *        The resource scan has expired.
     *        </p>
     *        </dd>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        The resource scan has failed.
     *        </p>
     *        </dd>
     * @see ResourceScanStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the resource scan.
     * </p>
     * <dl>
     * <dt>INPROGRESS</dt>
     * <dd>
     * <p>
     * The resource scan is still in progress.
     * </p>
     * </dd>
     * <dt>COMPLETE</dt>
     * <dd>
     * <p>
     * The resource scan is complete.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The resource scan has expired.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The resource scan has failed.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Status of the resource scan.</p>
     *         <dl>
     *         <dt>INPROGRESS</dt>
     *         <dd>
     *         <p>
     *         The resource scan is still in progress.
     *         </p>
     *         </dd>
     *         <dt>COMPLETE</dt>
     *         <dd>
     *         <p>
     *         The resource scan is complete.
     *         </p>
     *         </dd>
     *         <dt>EXPIRED</dt>
     *         <dd>
     *         <p>
     *         The resource scan has expired.
     *         </p>
     *         </dd>
     *         <dt>FAILED</dt>
     *         <dd>
     *         <p>
     *         The resource scan has failed.
     *         </p>
     *         </dd>
     * @see ResourceScanStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the resource scan.
     * </p>
     * <dl>
     * <dt>INPROGRESS</dt>
     * <dd>
     * <p>
     * The resource scan is still in progress.
     * </p>
     * </dd>
     * <dt>COMPLETE</dt>
     * <dd>
     * <p>
     * The resource scan is complete.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The resource scan has expired.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The resource scan has failed.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        Status of the resource scan.</p>
     *        <dl>
     *        <dt>INPROGRESS</dt>
     *        <dd>
     *        <p>
     *        The resource scan is still in progress.
     *        </p>
     *        </dd>
     *        <dt>COMPLETE</dt>
     *        <dd>
     *        <p>
     *        The resource scan is complete.
     *        </p>
     *        </dd>
     *        <dt>EXPIRED</dt>
     *        <dd>
     *        <p>
     *        The resource scan has expired.
     *        </p>
     *        </dd>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        The resource scan has failed.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceScanStatus
     */

    public ResourceScanSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the resource scan.
     * </p>
     * <dl>
     * <dt>INPROGRESS</dt>
     * <dd>
     * <p>
     * The resource scan is still in progress.
     * </p>
     * </dd>
     * <dt>COMPLETE</dt>
     * <dd>
     * <p>
     * The resource scan is complete.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The resource scan has expired.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The resource scan has failed.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        Status of the resource scan.</p>
     *        <dl>
     *        <dt>INPROGRESS</dt>
     *        <dd>
     *        <p>
     *        The resource scan is still in progress.
     *        </p>
     *        </dd>
     *        <dt>COMPLETE</dt>
     *        <dd>
     *        <p>
     *        The resource scan is complete.
     *        </p>
     *        </dd>
     *        <dt>EXPIRED</dt>
     *        <dd>
     *        <p>
     *        The resource scan has expired.
     *        </p>
     *        </dd>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        The resource scan has failed.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceScanStatus
     */

    public ResourceScanSummary withStatus(ResourceScanStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the resource scan status, providing more information if a failure happened.
     * </p>
     * 
     * @param statusReason
     *        The reason for the resource scan status, providing more information if a failure happened.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the resource scan status, providing more information if a failure happened.
     * </p>
     * 
     * @return The reason for the resource scan status, providing more information if a failure happened.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the resource scan status, providing more information if a failure happened.
     * </p>
     * 
     * @param statusReason
     *        The reason for the resource scan status, providing more information if a failure happened.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceScanSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The time that the resource scan was started.
     * </p>
     * 
     * @param startTime
     *        The time that the resource scan was started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time that the resource scan was started.
     * </p>
     * 
     * @return The time that the resource scan was started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time that the resource scan was started.
     * </p>
     * 
     * @param startTime
     *        The time that the resource scan was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceScanSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time that the resource scan was finished.
     * </p>
     * 
     * @param endTime
     *        The time that the resource scan was finished.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the resource scan was finished.
     * </p>
     * 
     * @return The time that the resource scan was finished.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time that the resource scan was finished.
     * </p>
     * 
     * @param endTime
     *        The time that the resource scan was finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceScanSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The percentage of the resource scan that has been completed.
     * </p>
     * 
     * @param percentageCompleted
     *        The percentage of the resource scan that has been completed.
     */

    public void setPercentageCompleted(Double percentageCompleted) {
        this.percentageCompleted = percentageCompleted;
    }

    /**
     * <p>
     * The percentage of the resource scan that has been completed.
     * </p>
     * 
     * @return The percentage of the resource scan that has been completed.
     */

    public Double getPercentageCompleted() {
        return this.percentageCompleted;
    }

    /**
     * <p>
     * The percentage of the resource scan that has been completed.
     * </p>
     * 
     * @param percentageCompleted
     *        The percentage of the resource scan that has been completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceScanSummary withPercentageCompleted(Double percentageCompleted) {
        setPercentageCompleted(percentageCompleted);
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
        if (getResourceScanId() != null)
            sb.append("ResourceScanId: ").append(getResourceScanId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getPercentageCompleted() != null)
            sb.append("PercentageCompleted: ").append(getPercentageCompleted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceScanSummary == false)
            return false;
        ResourceScanSummary other = (ResourceScanSummary) obj;
        if (other.getResourceScanId() == null ^ this.getResourceScanId() == null)
            return false;
        if (other.getResourceScanId() != null && other.getResourceScanId().equals(this.getResourceScanId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getPercentageCompleted() == null ^ this.getPercentageCompleted() == null)
            return false;
        if (other.getPercentageCompleted() != null && other.getPercentageCompleted().equals(this.getPercentageCompleted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceScanId() == null) ? 0 : getResourceScanId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getPercentageCompleted() == null) ? 0 : getPercentageCompleted().hashCode());
        return hashCode;
    }

    @Override
    public ResourceScanSummary clone() {
        try {
            return (ResourceScanSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
