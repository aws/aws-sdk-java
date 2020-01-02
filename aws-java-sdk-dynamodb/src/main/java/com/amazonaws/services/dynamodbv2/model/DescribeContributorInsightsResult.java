/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeContributorInsights"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeContributorInsightsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the table being described.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The name of the global secondary index being described.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * List of names of the associated Alpine rules.
     * </p>
     */
    private java.util.List<String> contributorInsightsRuleList;
    /**
     * <p>
     * Current Status contributor insights.
     * </p>
     */
    private String contributorInsightsStatus;
    /**
     * <p>
     * Timestamp of the last time the status was changed.
     * </p>
     */
    private java.util.Date lastUpdateDateTime;
    /**
     * <p>
     * Returns information about the last failure that encountered.
     * </p>
     * <p>
     * The most common exceptions for a FAILED status are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * LimitExceededException - Per-account Amazon CloudWatch Contributor Insights rule limit reached. Please disable
     * Contributor Insights for other tables/indexes OR disable Contributor Insights rules before retrying.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Amazon CloudWatch Contributor Insights rules cannot be modified due to insufficient
     * permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Failed to create service-linked role for Contributor Insights due to insufficient
     * permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * InternalServerError - Failed to create Amazon CloudWatch Contributor Insights rules. Please retry request.
     * </p>
     * </li>
     * </ul>
     */
    private FailureException failureException;

    /**
     * <p>
     * The name of the table being described.
     * </p>
     * 
     * @param tableName
     *        The name of the table being described.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table being described.
     * </p>
     * 
     * @return The name of the table being described.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table being described.
     * </p>
     * 
     * @param tableName
     *        The name of the table being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContributorInsightsResult withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The name of the global secondary index being described.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index being described.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the global secondary index being described.
     * </p>
     * 
     * @return The name of the global secondary index being described.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the global secondary index being described.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContributorInsightsResult withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * List of names of the associated Alpine rules.
     * </p>
     * 
     * @return List of names of the associated Alpine rules.
     */

    public java.util.List<String> getContributorInsightsRuleList() {
        return contributorInsightsRuleList;
    }

    /**
     * <p>
     * List of names of the associated Alpine rules.
     * </p>
     * 
     * @param contributorInsightsRuleList
     *        List of names of the associated Alpine rules.
     */

    public void setContributorInsightsRuleList(java.util.Collection<String> contributorInsightsRuleList) {
        if (contributorInsightsRuleList == null) {
            this.contributorInsightsRuleList = null;
            return;
        }

        this.contributorInsightsRuleList = new java.util.ArrayList<String>(contributorInsightsRuleList);
    }

    /**
     * <p>
     * List of names of the associated Alpine rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContributorInsightsRuleList(java.util.Collection)} or
     * {@link #withContributorInsightsRuleList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param contributorInsightsRuleList
     *        List of names of the associated Alpine rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContributorInsightsResult withContributorInsightsRuleList(String... contributorInsightsRuleList) {
        if (this.contributorInsightsRuleList == null) {
            setContributorInsightsRuleList(new java.util.ArrayList<String>(contributorInsightsRuleList.length));
        }
        for (String ele : contributorInsightsRuleList) {
            this.contributorInsightsRuleList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of names of the associated Alpine rules.
     * </p>
     * 
     * @param contributorInsightsRuleList
     *        List of names of the associated Alpine rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContributorInsightsResult withContributorInsightsRuleList(java.util.Collection<String> contributorInsightsRuleList) {
        setContributorInsightsRuleList(contributorInsightsRuleList);
        return this;
    }

    /**
     * <p>
     * Current Status contributor insights.
     * </p>
     * 
     * @param contributorInsightsStatus
     *        Current Status contributor insights.
     * @see ContributorInsightsStatus
     */

    public void setContributorInsightsStatus(String contributorInsightsStatus) {
        this.contributorInsightsStatus = contributorInsightsStatus;
    }

    /**
     * <p>
     * Current Status contributor insights.
     * </p>
     * 
     * @return Current Status contributor insights.
     * @see ContributorInsightsStatus
     */

    public String getContributorInsightsStatus() {
        return this.contributorInsightsStatus;
    }

    /**
     * <p>
     * Current Status contributor insights.
     * </p>
     * 
     * @param contributorInsightsStatus
     *        Current Status contributor insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContributorInsightsStatus
     */

    public DescribeContributorInsightsResult withContributorInsightsStatus(String contributorInsightsStatus) {
        setContributorInsightsStatus(contributorInsightsStatus);
        return this;
    }

    /**
     * <p>
     * Current Status contributor insights.
     * </p>
     * 
     * @param contributorInsightsStatus
     *        Current Status contributor insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContributorInsightsStatus
     */

    public DescribeContributorInsightsResult withContributorInsightsStatus(ContributorInsightsStatus contributorInsightsStatus) {
        this.contributorInsightsStatus = contributorInsightsStatus.toString();
        return this;
    }

    /**
     * <p>
     * Timestamp of the last time the status was changed.
     * </p>
     * 
     * @param lastUpdateDateTime
     *        Timestamp of the last time the status was changed.
     */

    public void setLastUpdateDateTime(java.util.Date lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    /**
     * <p>
     * Timestamp of the last time the status was changed.
     * </p>
     * 
     * @return Timestamp of the last time the status was changed.
     */

    public java.util.Date getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }

    /**
     * <p>
     * Timestamp of the last time the status was changed.
     * </p>
     * 
     * @param lastUpdateDateTime
     *        Timestamp of the last time the status was changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContributorInsightsResult withLastUpdateDateTime(java.util.Date lastUpdateDateTime) {
        setLastUpdateDateTime(lastUpdateDateTime);
        return this;
    }

    /**
     * <p>
     * Returns information about the last failure that encountered.
     * </p>
     * <p>
     * The most common exceptions for a FAILED status are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * LimitExceededException - Per-account Amazon CloudWatch Contributor Insights rule limit reached. Please disable
     * Contributor Insights for other tables/indexes OR disable Contributor Insights rules before retrying.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Amazon CloudWatch Contributor Insights rules cannot be modified due to insufficient
     * permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Failed to create service-linked role for Contributor Insights due to insufficient
     * permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * InternalServerError - Failed to create Amazon CloudWatch Contributor Insights rules. Please retry request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureException
     *        Returns information about the last failure that encountered.</p>
     *        <p>
     *        The most common exceptions for a FAILED status are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        LimitExceededException - Per-account Amazon CloudWatch Contributor Insights rule limit reached. Please
     *        disable Contributor Insights for other tables/indexes OR disable Contributor Insights rules before
     *        retrying.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AccessDeniedException - Amazon CloudWatch Contributor Insights rules cannot be modified due to
     *        insufficient permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AccessDeniedException - Failed to create service-linked role for Contributor Insights due to insufficient
     *        permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InternalServerError - Failed to create Amazon CloudWatch Contributor Insights rules. Please retry request.
     *        </p>
     *        </li>
     */

    public void setFailureException(FailureException failureException) {
        this.failureException = failureException;
    }

    /**
     * <p>
     * Returns information about the last failure that encountered.
     * </p>
     * <p>
     * The most common exceptions for a FAILED status are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * LimitExceededException - Per-account Amazon CloudWatch Contributor Insights rule limit reached. Please disable
     * Contributor Insights for other tables/indexes OR disable Contributor Insights rules before retrying.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Amazon CloudWatch Contributor Insights rules cannot be modified due to insufficient
     * permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Failed to create service-linked role for Contributor Insights due to insufficient
     * permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * InternalServerError - Failed to create Amazon CloudWatch Contributor Insights rules. Please retry request.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Returns information about the last failure that encountered.</p>
     *         <p>
     *         The most common exceptions for a FAILED status are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         LimitExceededException - Per-account Amazon CloudWatch Contributor Insights rule limit reached. Please
     *         disable Contributor Insights for other tables/indexes OR disable Contributor Insights rules before
     *         retrying.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AccessDeniedException - Amazon CloudWatch Contributor Insights rules cannot be modified due to
     *         insufficient permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AccessDeniedException - Failed to create service-linked role for Contributor Insights due to insufficient
     *         permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         InternalServerError - Failed to create Amazon CloudWatch Contributor Insights rules. Please retry
     *         request.
     *         </p>
     *         </li>
     */

    public FailureException getFailureException() {
        return this.failureException;
    }

    /**
     * <p>
     * Returns information about the last failure that encountered.
     * </p>
     * <p>
     * The most common exceptions for a FAILED status are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * LimitExceededException - Per-account Amazon CloudWatch Contributor Insights rule limit reached. Please disable
     * Contributor Insights for other tables/indexes OR disable Contributor Insights rules before retrying.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Amazon CloudWatch Contributor Insights rules cannot be modified due to insufficient
     * permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * AccessDeniedException - Failed to create service-linked role for Contributor Insights due to insufficient
     * permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * InternalServerError - Failed to create Amazon CloudWatch Contributor Insights rules. Please retry request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureException
     *        Returns information about the last failure that encountered.</p>
     *        <p>
     *        The most common exceptions for a FAILED status are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        LimitExceededException - Per-account Amazon CloudWatch Contributor Insights rule limit reached. Please
     *        disable Contributor Insights for other tables/indexes OR disable Contributor Insights rules before
     *        retrying.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AccessDeniedException - Amazon CloudWatch Contributor Insights rules cannot be modified due to
     *        insufficient permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AccessDeniedException - Failed to create service-linked role for Contributor Insights due to insufficient
     *        permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InternalServerError - Failed to create Amazon CloudWatch Contributor Insights rules. Please retry request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContributorInsightsResult withFailureException(FailureException failureException) {
        setFailureException(failureException);
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getContributorInsightsRuleList() != null)
            sb.append("ContributorInsightsRuleList: ").append(getContributorInsightsRuleList()).append(",");
        if (getContributorInsightsStatus() != null)
            sb.append("ContributorInsightsStatus: ").append(getContributorInsightsStatus()).append(",");
        if (getLastUpdateDateTime() != null)
            sb.append("LastUpdateDateTime: ").append(getLastUpdateDateTime()).append(",");
        if (getFailureException() != null)
            sb.append("FailureException: ").append(getFailureException());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeContributorInsightsResult == false)
            return false;
        DescribeContributorInsightsResult other = (DescribeContributorInsightsResult) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getContributorInsightsRuleList() == null ^ this.getContributorInsightsRuleList() == null)
            return false;
        if (other.getContributorInsightsRuleList() != null && other.getContributorInsightsRuleList().equals(this.getContributorInsightsRuleList()) == false)
            return false;
        if (other.getContributorInsightsStatus() == null ^ this.getContributorInsightsStatus() == null)
            return false;
        if (other.getContributorInsightsStatus() != null && other.getContributorInsightsStatus().equals(this.getContributorInsightsStatus()) == false)
            return false;
        if (other.getLastUpdateDateTime() == null ^ this.getLastUpdateDateTime() == null)
            return false;
        if (other.getLastUpdateDateTime() != null && other.getLastUpdateDateTime().equals(this.getLastUpdateDateTime()) == false)
            return false;
        if (other.getFailureException() == null ^ this.getFailureException() == null)
            return false;
        if (other.getFailureException() != null && other.getFailureException().equals(this.getFailureException()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getContributorInsightsRuleList() == null) ? 0 : getContributorInsightsRuleList().hashCode());
        hashCode = prime * hashCode + ((getContributorInsightsStatus() == null) ? 0 : getContributorInsightsStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateDateTime() == null) ? 0 : getLastUpdateDateTime().hashCode());
        hashCode = prime * hashCode + ((getFailureException() == null) ? 0 : getFailureException().hashCode());
        return hashCode;
    }

    @Override
    public DescribeContributorInsightsResult clone() {
        try {
            return (DescribeContributorInsightsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
