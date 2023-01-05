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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeFleetAdvisorDatabases" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetAdvisorDatabasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Provides descriptions of the Fleet Advisor collector databases, including the database's collector, ID, and name.
     * </p>
     */
    private java.util.List<DatabaseResponse> databases;
    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Provides descriptions of the Fleet Advisor collector databases, including the database's collector, ID, and name.
     * </p>
     * 
     * @return Provides descriptions of the Fleet Advisor collector databases, including the database's collector, ID,
     *         and name.
     */

    public java.util.List<DatabaseResponse> getDatabases() {
        return databases;
    }

    /**
     * <p>
     * Provides descriptions of the Fleet Advisor collector databases, including the database's collector, ID, and name.
     * </p>
     * 
     * @param databases
     *        Provides descriptions of the Fleet Advisor collector databases, including the database's collector, ID,
     *        and name.
     */

    public void setDatabases(java.util.Collection<DatabaseResponse> databases) {
        if (databases == null) {
            this.databases = null;
            return;
        }

        this.databases = new java.util.ArrayList<DatabaseResponse>(databases);
    }

    /**
     * <p>
     * Provides descriptions of the Fleet Advisor collector databases, including the database's collector, ID, and name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatabases(java.util.Collection)} or {@link #withDatabases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param databases
     *        Provides descriptions of the Fleet Advisor collector databases, including the database's collector, ID,
     *        and name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetAdvisorDatabasesResult withDatabases(DatabaseResponse... databases) {
        if (this.databases == null) {
            setDatabases(new java.util.ArrayList<DatabaseResponse>(databases.length));
        }
        for (DatabaseResponse ele : databases) {
            this.databases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides descriptions of the Fleet Advisor collector databases, including the database's collector, ID, and name.
     * </p>
     * 
     * @param databases
     *        Provides descriptions of the Fleet Advisor collector databases, including the database's collector, ID,
     *        and name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetAdvisorDatabasesResult withDatabases(java.util.Collection<DatabaseResponse> databases) {
        setDatabases(databases);
        return this;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned, there are more results available. The value of
     *        <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged.
     * </p>
     * 
     * @return If <code>NextToken</code> is returned, there are more results available. The value of
     *         <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page. Keep all other arguments unchanged.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned, there are more results available. The value of
     *        <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetAdvisorDatabasesResult withNextToken(String nextToken) {
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
        if (getDatabases() != null)
            sb.append("Databases: ").append(getDatabases()).append(",");
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

        if (obj instanceof DescribeFleetAdvisorDatabasesResult == false)
            return false;
        DescribeFleetAdvisorDatabasesResult other = (DescribeFleetAdvisorDatabasesResult) obj;
        if (other.getDatabases() == null ^ this.getDatabases() == null)
            return false;
        if (other.getDatabases() != null && other.getDatabases().equals(this.getDatabases()) == false)
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

        hashCode = prime * hashCode + ((getDatabases() == null) ? 0 : getDatabases().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetAdvisorDatabasesResult clone() {
        try {
            return (DescribeFleetAdvisorDatabasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
