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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateContributorInsights" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContributorInsightsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The name of the global secondary index, if applicable.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The status of contributor insights
     * </p>
     */
    private String contributorInsightsStatus;

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @return The name of the table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContributorInsightsResult withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The name of the global secondary index, if applicable.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index, if applicable.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the global secondary index, if applicable.
     * </p>
     * 
     * @return The name of the global secondary index, if applicable.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the global secondary index, if applicable.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContributorInsightsResult withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The status of contributor insights
     * </p>
     * 
     * @param contributorInsightsStatus
     *        The status of contributor insights
     * @see ContributorInsightsStatus
     */

    public void setContributorInsightsStatus(String contributorInsightsStatus) {
        this.contributorInsightsStatus = contributorInsightsStatus;
    }

    /**
     * <p>
     * The status of contributor insights
     * </p>
     * 
     * @return The status of contributor insights
     * @see ContributorInsightsStatus
     */

    public String getContributorInsightsStatus() {
        return this.contributorInsightsStatus;
    }

    /**
     * <p>
     * The status of contributor insights
     * </p>
     * 
     * @param contributorInsightsStatus
     *        The status of contributor insights
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContributorInsightsStatus
     */

    public UpdateContributorInsightsResult withContributorInsightsStatus(String contributorInsightsStatus) {
        setContributorInsightsStatus(contributorInsightsStatus);
        return this;
    }

    /**
     * <p>
     * The status of contributor insights
     * </p>
     * 
     * @param contributorInsightsStatus
     *        The status of contributor insights
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContributorInsightsStatus
     */

    public UpdateContributorInsightsResult withContributorInsightsStatus(ContributorInsightsStatus contributorInsightsStatus) {
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

        if (obj instanceof UpdateContributorInsightsResult == false)
            return false;
        UpdateContributorInsightsResult other = (UpdateContributorInsightsResult) obj;
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
    public UpdateContributorInsightsResult clone() {
        try {
            return (UpdateContributorInsightsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
