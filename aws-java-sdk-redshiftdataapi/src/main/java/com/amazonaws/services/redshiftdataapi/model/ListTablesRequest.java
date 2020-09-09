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
package com.amazonaws.services.redshiftdataapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListTables" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTablesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The maximum number of tables to return in the response. If more tables exist than fit in one response, then
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
     * A pattern to filter results by schema name. Within a schema pattern, "%" means match any substring of 0 or more
     * characters and "_" means match any one character. Only schema name entries matching the search pattern are
     * returned. If <code>SchemaPattern</code> is not specified, then all tables that match <code>TablePattern</code>
     * are returned. If neither <code>SchemaPattern</code> or <code>TablePattern</code> are specified, then all tables
     * are returned.
     * </p>
     */
    private String schemaPattern;
    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating
     * using AWS Secrets Manager.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * A pattern to filter results by table name. Within a table pattern, "%" means match any substring of 0 or more
     * characters and "_" means match any one character. Only table name entries matching the search pattern are
     * returned. If <code>TablePattern</code> is not specified, then all tables that match <code>SchemaPattern</code>are
     * returned. If neither <code>SchemaPattern</code> or <code>TablePattern</code> are specified, then all tables are
     * returned.
     * </p>
     */
    private String tablePattern;

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

    public ListTablesRequest withClusterIdentifier(String clusterIdentifier) {
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

    public ListTablesRequest withDatabase(String database) {
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

    public ListTablesRequest withDbUser(String dbUser) {
        setDbUser(dbUser);
        return this;
    }

    /**
     * <p>
     * The maximum number of tables to return in the response. If more tables exist than fit in one response, then
     * <code>NextToken</code> is returned to page through the results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tables to return in the response. If more tables exist than fit in one response,
     *        then <code>NextToken</code> is returned to page through the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of tables to return in the response. If more tables exist than fit in one response, then
     * <code>NextToken</code> is returned to page through the results.
     * </p>
     * 
     * @return The maximum number of tables to return in the response. If more tables exist than fit in one response,
     *         then <code>NextToken</code> is returned to page through the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of tables to return in the response. If more tables exist than fit in one response, then
     * <code>NextToken</code> is returned to page through the results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tables to return in the response. If more tables exist than fit in one response,
     *        then <code>NextToken</code> is returned to page through the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTablesRequest withMaxResults(Integer maxResults) {
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

    public ListTablesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A pattern to filter results by schema name. Within a schema pattern, "%" means match any substring of 0 or more
     * characters and "_" means match any one character. Only schema name entries matching the search pattern are
     * returned. If <code>SchemaPattern</code> is not specified, then all tables that match <code>TablePattern</code>
     * are returned. If neither <code>SchemaPattern</code> or <code>TablePattern</code> are specified, then all tables
     * are returned.
     * </p>
     * 
     * @param schemaPattern
     *        A pattern to filter results by schema name. Within a schema pattern, "%" means match any substring of 0 or
     *        more characters and "_" means match any one character. Only schema name entries matching the search
     *        pattern are returned. If <code>SchemaPattern</code> is not specified, then all tables that match
     *        <code>TablePattern</code> are returned. If neither <code>SchemaPattern</code> or <code>TablePattern</code>
     *        are specified, then all tables are returned.
     */

    public void setSchemaPattern(String schemaPattern) {
        this.schemaPattern = schemaPattern;
    }

    /**
     * <p>
     * A pattern to filter results by schema name. Within a schema pattern, "%" means match any substring of 0 or more
     * characters and "_" means match any one character. Only schema name entries matching the search pattern are
     * returned. If <code>SchemaPattern</code> is not specified, then all tables that match <code>TablePattern</code>
     * are returned. If neither <code>SchemaPattern</code> or <code>TablePattern</code> are specified, then all tables
     * are returned.
     * </p>
     * 
     * @return A pattern to filter results by schema name. Within a schema pattern, "%" means match any substring of 0
     *         or more characters and "_" means match any one character. Only schema name entries matching the search
     *         pattern are returned. If <code>SchemaPattern</code> is not specified, then all tables that match
     *         <code>TablePattern</code> are returned. If neither <code>SchemaPattern</code> or
     *         <code>TablePattern</code> are specified, then all tables are returned.
     */

    public String getSchemaPattern() {
        return this.schemaPattern;
    }

    /**
     * <p>
     * A pattern to filter results by schema name. Within a schema pattern, "%" means match any substring of 0 or more
     * characters and "_" means match any one character. Only schema name entries matching the search pattern are
     * returned. If <code>SchemaPattern</code> is not specified, then all tables that match <code>TablePattern</code>
     * are returned. If neither <code>SchemaPattern</code> or <code>TablePattern</code> are specified, then all tables
     * are returned.
     * </p>
     * 
     * @param schemaPattern
     *        A pattern to filter results by schema name. Within a schema pattern, "%" means match any substring of 0 or
     *        more characters and "_" means match any one character. Only schema name entries matching the search
     *        pattern are returned. If <code>SchemaPattern</code> is not specified, then all tables that match
     *        <code>TablePattern</code> are returned. If neither <code>SchemaPattern</code> or <code>TablePattern</code>
     *        are specified, then all tables are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTablesRequest withSchemaPattern(String schemaPattern) {
        setSchemaPattern(schemaPattern);
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

    public ListTablesRequest withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * A pattern to filter results by table name. Within a table pattern, "%" means match any substring of 0 or more
     * characters and "_" means match any one character. Only table name entries matching the search pattern are
     * returned. If <code>TablePattern</code> is not specified, then all tables that match <code>SchemaPattern</code>are
     * returned. If neither <code>SchemaPattern</code> or <code>TablePattern</code> are specified, then all tables are
     * returned.
     * </p>
     * 
     * @param tablePattern
     *        A pattern to filter results by table name. Within a table pattern, "%" means match any substring of 0 or
     *        more characters and "_" means match any one character. Only table name entries matching the search pattern
     *        are returned. If <code>TablePattern</code> is not specified, then all tables that match
     *        <code>SchemaPattern</code>are returned. If neither <code>SchemaPattern</code> or <code>TablePattern</code>
     *        are specified, then all tables are returned.
     */

    public void setTablePattern(String tablePattern) {
        this.tablePattern = tablePattern;
    }

    /**
     * <p>
     * A pattern to filter results by table name. Within a table pattern, "%" means match any substring of 0 or more
     * characters and "_" means match any one character. Only table name entries matching the search pattern are
     * returned. If <code>TablePattern</code> is not specified, then all tables that match <code>SchemaPattern</code>are
     * returned. If neither <code>SchemaPattern</code> or <code>TablePattern</code> are specified, then all tables are
     * returned.
     * </p>
     * 
     * @return A pattern to filter results by table name. Within a table pattern, "%" means match any substring of 0 or
     *         more characters and "_" means match any one character. Only table name entries matching the search
     *         pattern are returned. If <code>TablePattern</code> is not specified, then all tables that match
     *         <code>SchemaPattern</code>are returned. If neither <code>SchemaPattern</code> or
     *         <code>TablePattern</code> are specified, then all tables are returned.
     */

    public String getTablePattern() {
        return this.tablePattern;
    }

    /**
     * <p>
     * A pattern to filter results by table name. Within a table pattern, "%" means match any substring of 0 or more
     * characters and "_" means match any one character. Only table name entries matching the search pattern are
     * returned. If <code>TablePattern</code> is not specified, then all tables that match <code>SchemaPattern</code>are
     * returned. If neither <code>SchemaPattern</code> or <code>TablePattern</code> are specified, then all tables are
     * returned.
     * </p>
     * 
     * @param tablePattern
     *        A pattern to filter results by table name. Within a table pattern, "%" means match any substring of 0 or
     *        more characters and "_" means match any one character. Only table name entries matching the search pattern
     *        are returned. If <code>TablePattern</code> is not specified, then all tables that match
     *        <code>SchemaPattern</code>are returned. If neither <code>SchemaPattern</code> or <code>TablePattern</code>
     *        are specified, then all tables are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTablesRequest withTablePattern(String tablePattern) {
        setTablePattern(tablePattern);
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
        if (getSchemaPattern() != null)
            sb.append("SchemaPattern: ").append(getSchemaPattern()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getTablePattern() != null)
            sb.append("TablePattern: ").append(getTablePattern());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTablesRequest == false)
            return false;
        ListTablesRequest other = (ListTablesRequest) obj;
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
        if (other.getSchemaPattern() == null ^ this.getSchemaPattern() == null)
            return false;
        if (other.getSchemaPattern() != null && other.getSchemaPattern().equals(this.getSchemaPattern()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getTablePattern() == null ^ this.getTablePattern() == null)
            return false;
        if (other.getTablePattern() != null && other.getTablePattern().equals(this.getTablePattern()) == false)
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
        hashCode = prime * hashCode + ((getSchemaPattern() == null) ? 0 : getSchemaPattern().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getTablePattern() == null) ? 0 : getTablePattern().hashCode());
        return hashCode;
    }

    @Override
    public ListTablesRequest clone() {
        return (ListTablesRequest) super.clone();
    }

}
