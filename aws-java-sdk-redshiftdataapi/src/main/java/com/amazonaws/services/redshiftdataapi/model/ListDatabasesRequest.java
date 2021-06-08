/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshiftdataapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListDatabases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatabasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or
     * temporary credentials.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The name of the database. This parameter is required when authenticating using temporary credentials.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The database user name. This parameter is required when authenticating using temporary credentials.
     * </p>
     */
    private String dbUser;
    /**
     * <p>
     * The maximum number of databases to return in the response. If more databases exist than fit in one response, then
     * <code>NextToken</code> is returned to page through the results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned NextToken
     * value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response
     * records have been retrieved for the request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating
     * using AWS Secrets Manager.
     * </p>
     */
    private String secretArn;

    /**
     * <p>
     * The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or
     * temporary credentials.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or
     *        temporary credentials.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or
     * temporary credentials.
     * </p>
     * 
     * @return The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager
     *         or temporary credentials.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or
     * temporary credentials.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or
     *        temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatabasesRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the database. This parameter is required when authenticating using temporary credentials.
     * </p>
     * 
     * @param database
     *        The name of the database. This parameter is required when authenticating using temporary credentials.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The name of the database. This parameter is required when authenticating using temporary credentials.
     * </p>
     * 
     * @return The name of the database. This parameter is required when authenticating using temporary credentials.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The name of the database. This parameter is required when authenticating using temporary credentials.
     * </p>
     * 
     * @param database
     *        The name of the database. This parameter is required when authenticating using temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatabasesRequest withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The database user name. This parameter is required when authenticating using temporary credentials.
     * </p>
     * 
     * @param dbUser
     *        The database user name. This parameter is required when authenticating using temporary credentials.
     */

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * <p>
     * The database user name. This parameter is required when authenticating using temporary credentials.
     * </p>
     * 
     * @return The database user name. This parameter is required when authenticating using temporary credentials.
     */

    public String getDbUser() {
        return this.dbUser;
    }

    /**
     * <p>
     * The database user name. This parameter is required when authenticating using temporary credentials.
     * </p>
     * 
     * @param dbUser
     *        The database user name. This parameter is required when authenticating using temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatabasesRequest withDbUser(String dbUser) {
        setDbUser(dbUser);
        return this;
    }

    /**
     * <p>
     * The maximum number of databases to return in the response. If more databases exist than fit in one response, then
     * <code>NextToken</code> is returned to page through the results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of databases to return in the response. If more databases exist than fit in one
     *        response, then <code>NextToken</code> is returned to page through the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of databases to return in the response. If more databases exist than fit in one response, then
     * <code>NextToken</code> is returned to page through the results.
     * </p>
     * 
     * @return The maximum number of databases to return in the response. If more databases exist than fit in one
     *         response, then <code>NextToken</code> is returned to page through the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of databases to return in the response. If more databases exist than fit in one response, then
     * <code>NextToken</code> is returned to page through the results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of databases to return in the response. If more databases exist than fit in one
     *        response, then <code>NextToken</code> is returned to page through the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatabasesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned NextToken
     * value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response
     * records have been retrieved for the request.
     * </p>
     * 
     * @param nextToken
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty,
     *        all response records have been retrieved for the request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned NextToken
     * value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response
     * records have been retrieved for the request.
     * </p>
     * 
     * @return A value that indicates the starting point for the next set of response records in a subsequent request.
     *         If a value is returned in a response, you can retrieve the next set of records by providing this returned
     *         NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is
     *         empty, all response records have been retrieved for the request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned NextToken
     * value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response
     * records have been retrieved for the request.
     * </p>
     * 
     * @param nextToken
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty,
     *        all response records have been retrieved for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatabasesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating
     * using AWS Secrets Manager.
     * </p>
     * 
     * @param secretArn
     *        The name or ARN of the secret that enables access to the database. This parameter is required when
     *        authenticating using AWS Secrets Manager.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating
     * using AWS Secrets Manager.
     * </p>
     * 
     * @return The name or ARN of the secret that enables access to the database. This parameter is required when
     *         authenticating using AWS Secrets Manager.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating
     * using AWS Secrets Manager.
     * </p>
     * 
     * @param secretArn
     *        The name or ARN of the secret that enables access to the database. This parameter is required when
     *        authenticating using AWS Secrets Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatabasesRequest withSecretArn(String secretArn) {
        setSecretArn(secretArn);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getDbUser() != null)
            sb.append("DbUser: ").append(getDbUser()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDatabasesRequest == false)
            return false;
        ListDatabasesRequest other = (ListDatabasesRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getDbUser() == null ^ this.getDbUser() == null)
            return false;
        if (other.getDbUser() != null && other.getDbUser().equals(this.getDbUser()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getDbUser() == null) ? 0 : getDbUser().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        return hashCode;
    }

    @Override
    public ListDatabasesRequest clone() {
        return (ListDatabasesRequest) super.clone();
    }

}
