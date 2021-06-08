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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListDatabases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatabasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The names of databases.
     * </p>
     */
    private java.util.List<String> databases;
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
     * The names of databases.
     * </p>
     * 
     * @return The names of databases.
     */

    public java.util.List<String> getDatabases() {
        return databases;
    }

    /**
     * <p>
     * The names of databases.
     * </p>
     * 
     * @param databases
     *        The names of databases.
     */

    public void setDatabases(java.util.Collection<String> databases) {
        if (databases == null) {
            this.databases = null;
            return;
        }

        this.databases = new java.util.ArrayList<String>(databases);
    }

    /**
     * <p>
     * The names of databases.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatabases(java.util.Collection)} or {@link #withDatabases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param databases
     *        The names of databases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatabasesResult withDatabases(String... databases) {
        if (this.databases == null) {
            setDatabases(new java.util.ArrayList<String>(databases.length));
        }
        for (String ele : databases) {
            this.databases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of databases.
     * </p>
     * 
     * @param databases
     *        The names of databases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatabasesResult withDatabases(java.util.Collection<String> databases) {
        setDatabases(databases);
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

    public ListDatabasesResult withNextToken(String nextToken) {
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

        if (obj instanceof ListDatabasesResult == false)
            return false;
        ListDatabasesResult other = (ListDatabasesResult) obj;
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
    public ListDatabasesResult clone() {
        try {
            return (ListDatabasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
