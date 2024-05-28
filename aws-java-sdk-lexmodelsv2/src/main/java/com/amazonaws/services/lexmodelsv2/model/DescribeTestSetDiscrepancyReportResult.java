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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeTestSetDiscrepancyReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTestSetDiscrepancyReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The unique identifier of the test set discrepancy report to describe.
     * </p>
     */
    private String testSetDiscrepancyReportId;
    /**
     * <p>
     * The test set Id for the test set discrepancy report.
     * </p>
     */
    private String testSetId;
    /**
     * <p>
     * The time and date of creation for the test set discrepancy report.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The target bot location for the test set discrepancy report.
     * </p>
     */
    private TestSetDiscrepancyReportResourceTarget target;
    /**
     * <p>
     * The status for the test set discrepancy report.
     * </p>
     */
    private String testSetDiscrepancyReportStatus;
    /**
     * <p>
     * The date and time of the last update for the test set discrepancy report.
     * </p>
     */
    private java.util.Date lastUpdatedDataTime;
    /**
     * <p>
     * The top 200 error results from the test set discrepancy report.
     * </p>
     */
    private TestSetDiscrepancyErrors testSetDiscrepancyTopErrors;
    /**
     * <p>
     * Pre-signed Amazon S3 URL to download the test set discrepancy report.
     * </p>
     */
    private String testSetDiscrepancyRawOutputUrl;
    /**
     * <p>
     * The failure report for the test set discrepancy report generation action.
     * </p>
     */
    private java.util.List<String> failureReasons;

    /**
     * <p>
     * The unique identifier of the test set discrepancy report to describe.
     * </p>
     * 
     * @param testSetDiscrepancyReportId
     *        The unique identifier of the test set discrepancy report to describe.
     */

    public void setTestSetDiscrepancyReportId(String testSetDiscrepancyReportId) {
        this.testSetDiscrepancyReportId = testSetDiscrepancyReportId;
    }

    /**
     * <p>
     * The unique identifier of the test set discrepancy report to describe.
     * </p>
     * 
     * @return The unique identifier of the test set discrepancy report to describe.
     */

    public String getTestSetDiscrepancyReportId() {
        return this.testSetDiscrepancyReportId;
    }

    /**
     * <p>
     * The unique identifier of the test set discrepancy report to describe.
     * </p>
     * 
     * @param testSetDiscrepancyReportId
     *        The unique identifier of the test set discrepancy report to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetDiscrepancyReportResult withTestSetDiscrepancyReportId(String testSetDiscrepancyReportId) {
        setTestSetDiscrepancyReportId(testSetDiscrepancyReportId);
        return this;
    }

    /**
     * <p>
     * The test set Id for the test set discrepancy report.
     * </p>
     * 
     * @param testSetId
     *        The test set Id for the test set discrepancy report.
     */

    public void setTestSetId(String testSetId) {
        this.testSetId = testSetId;
    }

    /**
     * <p>
     * The test set Id for the test set discrepancy report.
     * </p>
     * 
     * @return The test set Id for the test set discrepancy report.
     */

    public String getTestSetId() {
        return this.testSetId;
    }

    /**
     * <p>
     * The test set Id for the test set discrepancy report.
     * </p>
     * 
     * @param testSetId
     *        The test set Id for the test set discrepancy report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetDiscrepancyReportResult withTestSetId(String testSetId) {
        setTestSetId(testSetId);
        return this;
    }

    /**
     * <p>
     * The time and date of creation for the test set discrepancy report.
     * </p>
     * 
     * @param creationDateTime
     *        The time and date of creation for the test set discrepancy report.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The time and date of creation for the test set discrepancy report.
     * </p>
     * 
     * @return The time and date of creation for the test set discrepancy report.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The time and date of creation for the test set discrepancy report.
     * </p>
     * 
     * @param creationDateTime
     *        The time and date of creation for the test set discrepancy report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetDiscrepancyReportResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The target bot location for the test set discrepancy report.
     * </p>
     * 
     * @param target
     *        The target bot location for the test set discrepancy report.
     */

    public void setTarget(TestSetDiscrepancyReportResourceTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * The target bot location for the test set discrepancy report.
     * </p>
     * 
     * @return The target bot location for the test set discrepancy report.
     */

    public TestSetDiscrepancyReportResourceTarget getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target bot location for the test set discrepancy report.
     * </p>
     * 
     * @param target
     *        The target bot location for the test set discrepancy report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetDiscrepancyReportResult withTarget(TestSetDiscrepancyReportResourceTarget target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The status for the test set discrepancy report.
     * </p>
     * 
     * @param testSetDiscrepancyReportStatus
     *        The status for the test set discrepancy report.
     * @see TestSetDiscrepancyReportStatus
     */

    public void setTestSetDiscrepancyReportStatus(String testSetDiscrepancyReportStatus) {
        this.testSetDiscrepancyReportStatus = testSetDiscrepancyReportStatus;
    }

    /**
     * <p>
     * The status for the test set discrepancy report.
     * </p>
     * 
     * @return The status for the test set discrepancy report.
     * @see TestSetDiscrepancyReportStatus
     */

    public String getTestSetDiscrepancyReportStatus() {
        return this.testSetDiscrepancyReportStatus;
    }

    /**
     * <p>
     * The status for the test set discrepancy report.
     * </p>
     * 
     * @param testSetDiscrepancyReportStatus
     *        The status for the test set discrepancy report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestSetDiscrepancyReportStatus
     */

    public DescribeTestSetDiscrepancyReportResult withTestSetDiscrepancyReportStatus(String testSetDiscrepancyReportStatus) {
        setTestSetDiscrepancyReportStatus(testSetDiscrepancyReportStatus);
        return this;
    }

    /**
     * <p>
     * The status for the test set discrepancy report.
     * </p>
     * 
     * @param testSetDiscrepancyReportStatus
     *        The status for the test set discrepancy report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestSetDiscrepancyReportStatus
     */

    public DescribeTestSetDiscrepancyReportResult withTestSetDiscrepancyReportStatus(TestSetDiscrepancyReportStatus testSetDiscrepancyReportStatus) {
        this.testSetDiscrepancyReportStatus = testSetDiscrepancyReportStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time of the last update for the test set discrepancy report.
     * </p>
     * 
     * @param lastUpdatedDataTime
     *        The date and time of the last update for the test set discrepancy report.
     */

    public void setLastUpdatedDataTime(java.util.Date lastUpdatedDataTime) {
        this.lastUpdatedDataTime = lastUpdatedDataTime;
    }

    /**
     * <p>
     * The date and time of the last update for the test set discrepancy report.
     * </p>
     * 
     * @return The date and time of the last update for the test set discrepancy report.
     */

    public java.util.Date getLastUpdatedDataTime() {
        return this.lastUpdatedDataTime;
    }

    /**
     * <p>
     * The date and time of the last update for the test set discrepancy report.
     * </p>
     * 
     * @param lastUpdatedDataTime
     *        The date and time of the last update for the test set discrepancy report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetDiscrepancyReportResult withLastUpdatedDataTime(java.util.Date lastUpdatedDataTime) {
        setLastUpdatedDataTime(lastUpdatedDataTime);
        return this;
    }

    /**
     * <p>
     * The top 200 error results from the test set discrepancy report.
     * </p>
     * 
     * @param testSetDiscrepancyTopErrors
     *        The top 200 error results from the test set discrepancy report.
     */

    public void setTestSetDiscrepancyTopErrors(TestSetDiscrepancyErrors testSetDiscrepancyTopErrors) {
        this.testSetDiscrepancyTopErrors = testSetDiscrepancyTopErrors;
    }

    /**
     * <p>
     * The top 200 error results from the test set discrepancy report.
     * </p>
     * 
     * @return The top 200 error results from the test set discrepancy report.
     */

    public TestSetDiscrepancyErrors getTestSetDiscrepancyTopErrors() {
        return this.testSetDiscrepancyTopErrors;
    }

    /**
     * <p>
     * The top 200 error results from the test set discrepancy report.
     * </p>
     * 
     * @param testSetDiscrepancyTopErrors
     *        The top 200 error results from the test set discrepancy report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetDiscrepancyReportResult withTestSetDiscrepancyTopErrors(TestSetDiscrepancyErrors testSetDiscrepancyTopErrors) {
        setTestSetDiscrepancyTopErrors(testSetDiscrepancyTopErrors);
        return this;
    }

    /**
     * <p>
     * Pre-signed Amazon S3 URL to download the test set discrepancy report.
     * </p>
     * 
     * @param testSetDiscrepancyRawOutputUrl
     *        Pre-signed Amazon S3 URL to download the test set discrepancy report.
     */

    public void setTestSetDiscrepancyRawOutputUrl(String testSetDiscrepancyRawOutputUrl) {
        this.testSetDiscrepancyRawOutputUrl = testSetDiscrepancyRawOutputUrl;
    }

    /**
     * <p>
     * Pre-signed Amazon S3 URL to download the test set discrepancy report.
     * </p>
     * 
     * @return Pre-signed Amazon S3 URL to download the test set discrepancy report.
     */

    public String getTestSetDiscrepancyRawOutputUrl() {
        return this.testSetDiscrepancyRawOutputUrl;
    }

    /**
     * <p>
     * Pre-signed Amazon S3 URL to download the test set discrepancy report.
     * </p>
     * 
     * @param testSetDiscrepancyRawOutputUrl
     *        Pre-signed Amazon S3 URL to download the test set discrepancy report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetDiscrepancyReportResult withTestSetDiscrepancyRawOutputUrl(String testSetDiscrepancyRawOutputUrl) {
        setTestSetDiscrepancyRawOutputUrl(testSetDiscrepancyRawOutputUrl);
        return this;
    }

    /**
     * <p>
     * The failure report for the test set discrepancy report generation action.
     * </p>
     * 
     * @return The failure report for the test set discrepancy report generation action.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * The failure report for the test set discrepancy report generation action.
     * </p>
     * 
     * @param failureReasons
     *        The failure report for the test set discrepancy report generation action.
     */

    public void setFailureReasons(java.util.Collection<String> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<String>(failureReasons);
    }

    /**
     * <p>
     * The failure report for the test set discrepancy report generation action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        The failure report for the test set discrepancy report generation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetDiscrepancyReportResult withFailureReasons(String... failureReasons) {
        if (this.failureReasons == null) {
            setFailureReasons(new java.util.ArrayList<String>(failureReasons.length));
        }
        for (String ele : failureReasons) {
            this.failureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The failure report for the test set discrepancy report generation action.
     * </p>
     * 
     * @param failureReasons
     *        The failure report for the test set discrepancy report generation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetDiscrepancyReportResult withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
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
        if (getTestSetDiscrepancyReportId() != null)
            sb.append("TestSetDiscrepancyReportId: ").append(getTestSetDiscrepancyReportId()).append(",");
        if (getTestSetId() != null)
            sb.append("TestSetId: ").append(getTestSetId()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getTestSetDiscrepancyReportStatus() != null)
            sb.append("TestSetDiscrepancyReportStatus: ").append(getTestSetDiscrepancyReportStatus()).append(",");
        if (getLastUpdatedDataTime() != null)
            sb.append("LastUpdatedDataTime: ").append(getLastUpdatedDataTime()).append(",");
        if (getTestSetDiscrepancyTopErrors() != null)
            sb.append("TestSetDiscrepancyTopErrors: ").append(getTestSetDiscrepancyTopErrors()).append(",");
        if (getTestSetDiscrepancyRawOutputUrl() != null)
            sb.append("TestSetDiscrepancyRawOutputUrl: ").append(getTestSetDiscrepancyRawOutputUrl()).append(",");
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTestSetDiscrepancyReportResult == false)
            return false;
        DescribeTestSetDiscrepancyReportResult other = (DescribeTestSetDiscrepancyReportResult) obj;
        if (other.getTestSetDiscrepancyReportId() == null ^ this.getTestSetDiscrepancyReportId() == null)
            return false;
        if (other.getTestSetDiscrepancyReportId() != null && other.getTestSetDiscrepancyReportId().equals(this.getTestSetDiscrepancyReportId()) == false)
            return false;
        if (other.getTestSetId() == null ^ this.getTestSetId() == null)
            return false;
        if (other.getTestSetId() != null && other.getTestSetId().equals(this.getTestSetId()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getTestSetDiscrepancyReportStatus() == null ^ this.getTestSetDiscrepancyReportStatus() == null)
            return false;
        if (other.getTestSetDiscrepancyReportStatus() != null
                && other.getTestSetDiscrepancyReportStatus().equals(this.getTestSetDiscrepancyReportStatus()) == false)
            return false;
        if (other.getLastUpdatedDataTime() == null ^ this.getLastUpdatedDataTime() == null)
            return false;
        if (other.getLastUpdatedDataTime() != null && other.getLastUpdatedDataTime().equals(this.getLastUpdatedDataTime()) == false)
            return false;
        if (other.getTestSetDiscrepancyTopErrors() == null ^ this.getTestSetDiscrepancyTopErrors() == null)
            return false;
        if (other.getTestSetDiscrepancyTopErrors() != null && other.getTestSetDiscrepancyTopErrors().equals(this.getTestSetDiscrepancyTopErrors()) == false)
            return false;
        if (other.getTestSetDiscrepancyRawOutputUrl() == null ^ this.getTestSetDiscrepancyRawOutputUrl() == null)
            return false;
        if (other.getTestSetDiscrepancyRawOutputUrl() != null
                && other.getTestSetDiscrepancyRawOutputUrl().equals(this.getTestSetDiscrepancyRawOutputUrl()) == false)
            return false;
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null)
            return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestSetDiscrepancyReportId() == null) ? 0 : getTestSetDiscrepancyReportId().hashCode());
        hashCode = prime * hashCode + ((getTestSetId() == null) ? 0 : getTestSetId().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getTestSetDiscrepancyReportStatus() == null) ? 0 : getTestSetDiscrepancyReportStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDataTime() == null) ? 0 : getLastUpdatedDataTime().hashCode());
        hashCode = prime * hashCode + ((getTestSetDiscrepancyTopErrors() == null) ? 0 : getTestSetDiscrepancyTopErrors().hashCode());
        hashCode = prime * hashCode + ((getTestSetDiscrepancyRawOutputUrl() == null) ? 0 : getTestSetDiscrepancyRawOutputUrl().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTestSetDiscrepancyReportResult clone() {
        try {
            return (DescribeTestSetDiscrepancyReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
