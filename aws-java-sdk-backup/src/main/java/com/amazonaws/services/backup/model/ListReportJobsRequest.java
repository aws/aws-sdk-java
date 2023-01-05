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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListReportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReportJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Returns only report jobs with the specified report plan name.
     * </p>
     */
    private String byReportPlanName;
    /**
     * <p>
     * Returns only report jobs that were created before the date and time specified in Unix format and Coordinated
     * Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018 12:11:30 AM.
     * </p>
     */
    private java.util.Date byCreationBefore;
    /**
     * <p>
     * Returns only report jobs that were created after the date and time specified in Unix format and Coordinated
     * Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018 12:11:30 AM.
     * </p>
     */
    private java.util.Date byCreationAfter;
    /**
     * <p>
     * Returns only report jobs that are in the specified status. The statuses are:
     * </p>
     * <p>
     * <code>CREATED | RUNNING | COMPLETED | FAILED</code>
     * </p>
     */
    private String byStatus;
    /**
     * <p>
     * The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of data.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns only report jobs with the specified report plan name.
     * </p>
     * 
     * @param byReportPlanName
     *        Returns only report jobs with the specified report plan name.
     */

    public void setByReportPlanName(String byReportPlanName) {
        this.byReportPlanName = byReportPlanName;
    }

    /**
     * <p>
     * Returns only report jobs with the specified report plan name.
     * </p>
     * 
     * @return Returns only report jobs with the specified report plan name.
     */

    public String getByReportPlanName() {
        return this.byReportPlanName;
    }

    /**
     * <p>
     * Returns only report jobs with the specified report plan name.
     * </p>
     * 
     * @param byReportPlanName
     *        Returns only report jobs with the specified report plan name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportJobsRequest withByReportPlanName(String byReportPlanName) {
        setByReportPlanName(byReportPlanName);
        return this;
    }

    /**
     * <p>
     * Returns only report jobs that were created before the date and time specified in Unix format and Coordinated
     * Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018 12:11:30 AM.
     * </p>
     * 
     * @param byCreationBefore
     *        Returns only report jobs that were created before the date and time specified in Unix format and
     *        Coordinated Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018
     *        12:11:30 AM.
     */

    public void setByCreationBefore(java.util.Date byCreationBefore) {
        this.byCreationBefore = byCreationBefore;
    }

    /**
     * <p>
     * Returns only report jobs that were created before the date and time specified in Unix format and Coordinated
     * Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018 12:11:30 AM.
     * </p>
     * 
     * @return Returns only report jobs that were created before the date and time specified in Unix format and
     *         Coordinated Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018
     *         12:11:30 AM.
     */

    public java.util.Date getByCreationBefore() {
        return this.byCreationBefore;
    }

    /**
     * <p>
     * Returns only report jobs that were created before the date and time specified in Unix format and Coordinated
     * Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018 12:11:30 AM.
     * </p>
     * 
     * @param byCreationBefore
     *        Returns only report jobs that were created before the date and time specified in Unix format and
     *        Coordinated Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018
     *        12:11:30 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportJobsRequest withByCreationBefore(java.util.Date byCreationBefore) {
        setByCreationBefore(byCreationBefore);
        return this;
    }

    /**
     * <p>
     * Returns only report jobs that were created after the date and time specified in Unix format and Coordinated
     * Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018 12:11:30 AM.
     * </p>
     * 
     * @param byCreationAfter
     *        Returns only report jobs that were created after the date and time specified in Unix format and
     *        Coordinated Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018
     *        12:11:30 AM.
     */

    public void setByCreationAfter(java.util.Date byCreationAfter) {
        this.byCreationAfter = byCreationAfter;
    }

    /**
     * <p>
     * Returns only report jobs that were created after the date and time specified in Unix format and Coordinated
     * Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018 12:11:30 AM.
     * </p>
     * 
     * @return Returns only report jobs that were created after the date and time specified in Unix format and
     *         Coordinated Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018
     *         12:11:30 AM.
     */

    public java.util.Date getByCreationAfter() {
        return this.byCreationAfter;
    }

    /**
     * <p>
     * Returns only report jobs that were created after the date and time specified in Unix format and Coordinated
     * Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018 12:11:30 AM.
     * </p>
     * 
     * @param byCreationAfter
     *        Returns only report jobs that were created after the date and time specified in Unix format and
     *        Coordinated Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018
     *        12:11:30 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportJobsRequest withByCreationAfter(java.util.Date byCreationAfter) {
        setByCreationAfter(byCreationAfter);
        return this;
    }

    /**
     * <p>
     * Returns only report jobs that are in the specified status. The statuses are:
     * </p>
     * <p>
     * <code>CREATED | RUNNING | COMPLETED | FAILED</code>
     * </p>
     * 
     * @param byStatus
     *        Returns only report jobs that are in the specified status. The statuses are:</p>
     *        <p>
     *        <code>CREATED | RUNNING | COMPLETED | FAILED</code>
     */

    public void setByStatus(String byStatus) {
        this.byStatus = byStatus;
    }

    /**
     * <p>
     * Returns only report jobs that are in the specified status. The statuses are:
     * </p>
     * <p>
     * <code>CREATED | RUNNING | COMPLETED | FAILED</code>
     * </p>
     * 
     * @return Returns only report jobs that are in the specified status. The statuses are:</p>
     *         <p>
     *         <code>CREATED | RUNNING | COMPLETED | FAILED</code>
     */

    public String getByStatus() {
        return this.byStatus;
    }

    /**
     * <p>
     * Returns only report jobs that are in the specified status. The statuses are:
     * </p>
     * <p>
     * <code>CREATED | RUNNING | COMPLETED | FAILED</code>
     * </p>
     * 
     * @param byStatus
     *        Returns only report jobs that are in the specified status. The statuses are:</p>
     *        <p>
     *        <code>CREATED | RUNNING | COMPLETED | FAILED</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportJobsRequest withByStatus(String byStatus) {
        setByStatus(byStatus);
        return this;
    }

    /**
     * <p>
     * The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of data.
     * </p>
     * 
     * @param maxResults
     *        The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of
     *        data.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of data.
     * </p>
     * 
     * @return The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of
     *         data.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of data.
     * </p>
     * 
     * @param maxResults
     *        The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of
     *        data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getByReportPlanName() != null)
            sb.append("ByReportPlanName: ").append(getByReportPlanName()).append(",");
        if (getByCreationBefore() != null)
            sb.append("ByCreationBefore: ").append(getByCreationBefore()).append(",");
        if (getByCreationAfter() != null)
            sb.append("ByCreationAfter: ").append(getByCreationAfter()).append(",");
        if (getByStatus() != null)
            sb.append("ByStatus: ").append(getByStatus()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReportJobsRequest == false)
            return false;
        ListReportJobsRequest other = (ListReportJobsRequest) obj;
        if (other.getByReportPlanName() == null ^ this.getByReportPlanName() == null)
            return false;
        if (other.getByReportPlanName() != null && other.getByReportPlanName().equals(this.getByReportPlanName()) == false)
            return false;
        if (other.getByCreationBefore() == null ^ this.getByCreationBefore() == null)
            return false;
        if (other.getByCreationBefore() != null && other.getByCreationBefore().equals(this.getByCreationBefore()) == false)
            return false;
        if (other.getByCreationAfter() == null ^ this.getByCreationAfter() == null)
            return false;
        if (other.getByCreationAfter() != null && other.getByCreationAfter().equals(this.getByCreationAfter()) == false)
            return false;
        if (other.getByStatus() == null ^ this.getByStatus() == null)
            return false;
        if (other.getByStatus() != null && other.getByStatus().equals(this.getByStatus()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getByReportPlanName() == null) ? 0 : getByReportPlanName().hashCode());
        hashCode = prime * hashCode + ((getByCreationBefore() == null) ? 0 : getByCreationBefore().hashCode());
        hashCode = prime * hashCode + ((getByCreationAfter() == null) ? 0 : getByCreationAfter().hashCode());
        hashCode = prime * hashCode + ((getByStatus() == null) ? 0 : getByStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListReportJobsRequest clone() {
        return (ListReportJobsRequest) super.clone();
    }

}
