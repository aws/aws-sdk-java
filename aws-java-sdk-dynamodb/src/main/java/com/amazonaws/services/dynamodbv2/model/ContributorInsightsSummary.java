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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a Contributor Insights summary entry..
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ContributorInsightsSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContributorInsightsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the table associated with the summary.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * Name of the index associated with the summary, if any.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * Describes the current status for contributor insights for the given table and index, if applicable.
     * </p>
     */
    private String contributorInsightsStatus;

    /**
     * <p>
     * Name of the table associated with the summary.
     * </p>
     * 
     * @param tableName
     *        Name of the table associated with the summary.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Name of the table associated with the summary.
     * </p>
     * 
     * @return Name of the table associated with the summary.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * Name of the table associated with the summary.
     * </p>
     * 
     * @param tableName
     *        Name of the table associated with the summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContributorInsightsSummary withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * Name of the index associated with the summary, if any.
     * </p>
     * 
     * @param indexName
     *        Name of the index associated with the summary, if any.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * Name of the index associated with the summary, if any.
     * </p>
     * 
     * @return Name of the index associated with the summary, if any.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * Name of the index associated with the summary, if any.
     * </p>
     * 
     * @param indexName
     *        Name of the index associated with the summary, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContributorInsightsSummary withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * Describes the current status for contributor insights for the given table and index, if applicable.
     * </p>
     * 
     * @param contributorInsightsStatus
     *        Describes the current status for contributor insights for the given table and index, if applicable.
     * @see ContributorInsightsStatus
     */

    public void setContributorInsightsStatus(String contributorInsightsStatus) {
        this.contributorInsightsStatus = contributorInsightsStatus;
    }

    /**
     * <p>
     * Describes the current status for contributor insights for the given table and index, if applicable.
     * </p>
     * 
     * @return Describes the current status for contributor insights for the given table and index, if applicable.
     * @see ContributorInsightsStatus
     */

    public String getContributorInsightsStatus() {
        return this.contributorInsightsStatus;
    }

    /**
     * <p>
     * Describes the current status for contributor insights for the given table and index, if applicable.
     * </p>
     * 
     * @param contributorInsightsStatus
     *        Describes the current status for contributor insights for the given table and index, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContributorInsightsStatus
     */

    public ContributorInsightsSummary withContributorInsightsStatus(String contributorInsightsStatus) {
        setContributorInsightsStatus(contributorInsightsStatus);
        return this;
    }

    /**
     * <p>
     * Describes the current status for contributor insights for the given table and index, if applicable.
     * </p>
     * 
     * @param contributorInsightsStatus
     *        Describes the current status for contributor insights for the given table and index, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContributorInsightsStatus
     */

    public ContributorInsightsSummary withContributorInsightsStatus(ContributorInsightsStatus contributorInsightsStatus) {
        this.contributorInsightsStatus = contributorInsightsStatus.toString();
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
        if (getContributorInsightsStatus() != null)
            sb.append("ContributorInsightsStatus: ").append(getContributorInsightsStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContributorInsightsSummary == false)
            return false;
        ContributorInsightsSummary other = (ContributorInsightsSummary) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getContributorInsightsStatus() == null ^ this.getContributorInsightsStatus() == null)
            return false;
        if (other.getContributorInsightsStatus() != null && other.getContributorInsightsStatus().equals(this.getContributorInsightsStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getContributorInsightsStatus() == null) ? 0 : getContributorInsightsStatus().hashCode());
        return hashCode;
    }

    @Override
    public ContributorInsightsSummary clone() {
        try {
            return (ContributorInsightsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ContributorInsightsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
