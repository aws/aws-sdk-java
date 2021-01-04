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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListStatements" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStatementsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of SQL statements to return in the response. If more SQL statements exist than fit in one
     * response, then <code>NextToken</code> is returned to page through the results.
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
     * The name of the SQL statement specified as input to <code>ExecuteStatement</code> to identify the query. You can
     * list multiple statements by providing a prefix that matches the beginning of the statement name. For example, to
     * list myStatement1, myStatement2, myStatement3, and so on, then provide the a value of <code>myStatement</code>.
     * Data API does a case-sensitive match of SQL statement names to the prefix value you provide.
     * </p>
     */
    private String statementName;
    /**
     * <p>
     * The status of the SQL statement to list. Status values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ABORTED - The query run was stopped by the user.
     * </p>
     * </li>
     * <li>
     * <p>
     * ALL - A status value that includes all query statuses. This value can be used to filter results.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The query run failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * FINISHED - The query has finished running.
     * </p>
     * </li>
     * <li>
     * <p>
     * PICKED - The query has been chosen to be run.
     * </p>
     * </li>
     * <li>
     * <p>
     * STARTED - The query run has started.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUBMITTED - The query was submitted, but not yet processed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The maximum number of SQL statements to return in the response. If more SQL statements exist than fit in one
     * response, then <code>NextToken</code> is returned to page through the results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of SQL statements to return in the response. If more SQL statements exist than fit in
     *        one response, then <code>NextToken</code> is returned to page through the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of SQL statements to return in the response. If more SQL statements exist than fit in one
     * response, then <code>NextToken</code> is returned to page through the results.
     * </p>
     * 
     * @return The maximum number of SQL statements to return in the response. If more SQL statements exist than fit in
     *         one response, then <code>NextToken</code> is returned to page through the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of SQL statements to return in the response. If more SQL statements exist than fit in one
     * response, then <code>NextToken</code> is returned to page through the results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of SQL statements to return in the response. If more SQL statements exist than fit in
     *        one response, then <code>NextToken</code> is returned to page through the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStatementsRequest withMaxResults(Integer maxResults) {
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

    public ListStatementsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The name of the SQL statement specified as input to <code>ExecuteStatement</code> to identify the query. You can
     * list multiple statements by providing a prefix that matches the beginning of the statement name. For example, to
     * list myStatement1, myStatement2, myStatement3, and so on, then provide the a value of <code>myStatement</code>.
     * Data API does a case-sensitive match of SQL statement names to the prefix value you provide.
     * </p>
     * 
     * @param statementName
     *        The name of the SQL statement specified as input to <code>ExecuteStatement</code> to identify the query.
     *        You can list multiple statements by providing a prefix that matches the beginning of the statement name.
     *        For example, to list myStatement1, myStatement2, myStatement3, and so on, then provide the a value of
     *        <code>myStatement</code>. Data API does a case-sensitive match of SQL statement names to the prefix value
     *        you provide.
     */

    public void setStatementName(String statementName) {
        this.statementName = statementName;
    }

    /**
     * <p>
     * The name of the SQL statement specified as input to <code>ExecuteStatement</code> to identify the query. You can
     * list multiple statements by providing a prefix that matches the beginning of the statement name. For example, to
     * list myStatement1, myStatement2, myStatement3, and so on, then provide the a value of <code>myStatement</code>.
     * Data API does a case-sensitive match of SQL statement names to the prefix value you provide.
     * </p>
     * 
     * @return The name of the SQL statement specified as input to <code>ExecuteStatement</code> to identify the query.
     *         You can list multiple statements by providing a prefix that matches the beginning of the statement name.
     *         For example, to list myStatement1, myStatement2, myStatement3, and so on, then provide the a value of
     *         <code>myStatement</code>. Data API does a case-sensitive match of SQL statement names to the prefix value
     *         you provide.
     */

    public String getStatementName() {
        return this.statementName;
    }

    /**
     * <p>
     * The name of the SQL statement specified as input to <code>ExecuteStatement</code> to identify the query. You can
     * list multiple statements by providing a prefix that matches the beginning of the statement name. For example, to
     * list myStatement1, myStatement2, myStatement3, and so on, then provide the a value of <code>myStatement</code>.
     * Data API does a case-sensitive match of SQL statement names to the prefix value you provide.
     * </p>
     * 
     * @param statementName
     *        The name of the SQL statement specified as input to <code>ExecuteStatement</code> to identify the query.
     *        You can list multiple statements by providing a prefix that matches the beginning of the statement name.
     *        For example, to list myStatement1, myStatement2, myStatement3, and so on, then provide the a value of
     *        <code>myStatement</code>. Data API does a case-sensitive match of SQL statement names to the prefix value
     *        you provide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStatementsRequest withStatementName(String statementName) {
        setStatementName(statementName);
        return this;
    }

    /**
     * <p>
     * The status of the SQL statement to list. Status values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ABORTED - The query run was stopped by the user.
     * </p>
     * </li>
     * <li>
     * <p>
     * ALL - A status value that includes all query statuses. This value can be used to filter results.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The query run failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * FINISHED - The query has finished running.
     * </p>
     * </li>
     * <li>
     * <p>
     * PICKED - The query has been chosen to be run.
     * </p>
     * </li>
     * <li>
     * <p>
     * STARTED - The query run has started.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUBMITTED - The query was submitted, but not yet processed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the SQL statement to list. Status values are defined as follows: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ABORTED - The query run was stopped by the user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ALL - A status value that includes all query statuses. This value can be used to filter results.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED - The query run failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FINISHED - The query has finished running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PICKED - The query has been chosen to be run.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STARTED - The query run has started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUBMITTED - The query was submitted, but not yet processed.
     *        </p>
     *        </li>
     * @see StatusString
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the SQL statement to list. Status values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ABORTED - The query run was stopped by the user.
     * </p>
     * </li>
     * <li>
     * <p>
     * ALL - A status value that includes all query statuses. This value can be used to filter results.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The query run failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * FINISHED - The query has finished running.
     * </p>
     * </li>
     * <li>
     * <p>
     * PICKED - The query has been chosen to be run.
     * </p>
     * </li>
     * <li>
     * <p>
     * STARTED - The query run has started.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUBMITTED - The query was submitted, but not yet processed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the SQL statement to list. Status values are defined as follows: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ABORTED - The query run was stopped by the user.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ALL - A status value that includes all query statuses. This value can be used to filter results.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FAILED - The query run failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FINISHED - The query has finished running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PICKED - The query has been chosen to be run.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STARTED - The query run has started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SUBMITTED - The query was submitted, but not yet processed.
     *         </p>
     *         </li>
     * @see StatusString
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the SQL statement to list. Status values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ABORTED - The query run was stopped by the user.
     * </p>
     * </li>
     * <li>
     * <p>
     * ALL - A status value that includes all query statuses. This value can be used to filter results.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The query run failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * FINISHED - The query has finished running.
     * </p>
     * </li>
     * <li>
     * <p>
     * PICKED - The query has been chosen to be run.
     * </p>
     * </li>
     * <li>
     * <p>
     * STARTED - The query run has started.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUBMITTED - The query was submitted, but not yet processed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the SQL statement to list. Status values are defined as follows: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ABORTED - The query run was stopped by the user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ALL - A status value that includes all query statuses. This value can be used to filter results.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED - The query run failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FINISHED - The query has finished running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PICKED - The query has been chosen to be run.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STARTED - The query run has started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUBMITTED - The query was submitted, but not yet processed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusString
     */

    public ListStatementsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the SQL statement to list. Status values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ABORTED - The query run was stopped by the user.
     * </p>
     * </li>
     * <li>
     * <p>
     * ALL - A status value that includes all query statuses. This value can be used to filter results.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The query run failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * FINISHED - The query has finished running.
     * </p>
     * </li>
     * <li>
     * <p>
     * PICKED - The query has been chosen to be run.
     * </p>
     * </li>
     * <li>
     * <p>
     * STARTED - The query run has started.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUBMITTED - The query was submitted, but not yet processed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the SQL statement to list. Status values are defined as follows: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ABORTED - The query run was stopped by the user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ALL - A status value that includes all query statuses. This value can be used to filter results.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED - The query run failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FINISHED - The query has finished running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PICKED - The query has been chosen to be run.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STARTED - The query run has started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUBMITTED - The query was submitted, but not yet processed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusString
     */

    public ListStatementsRequest withStatus(StatusString status) {
        this.status = status.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStatementName() != null)
            sb.append("StatementName: ").append(getStatementName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStatementsRequest == false)
            return false;
        ListStatementsRequest other = (ListStatementsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStatementName() == null ^ this.getStatementName() == null)
            return false;
        if (other.getStatementName() != null && other.getStatementName().equals(this.getStatementName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStatementName() == null) ? 0 : getStatementName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListStatementsRequest clone() {
        return (ListStatementsRequest) super.clone();
    }

}
