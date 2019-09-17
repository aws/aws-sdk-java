/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDatabases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDatabasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>Database</code> objects from the specified catalog.
     * </p>
     */
    private java.util.List<Database> databaseList;
    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>Database</code> objects from the specified catalog.
     * </p>
     * 
     * @return A list of <code>Database</code> objects from the specified catalog.
     */

    public java.util.List<Database> getDatabaseList() {
        return databaseList;
    }

    /**
     * <p>
     * A list of <code>Database</code> objects from the specified catalog.
     * </p>
     * 
     * @param databaseList
     *        A list of <code>Database</code> objects from the specified catalog.
     */

    public void setDatabaseList(java.util.Collection<Database> databaseList) {
        if (databaseList == null) {
            this.databaseList = null;
            return;
        }

        this.databaseList = new java.util.ArrayList<Database>(databaseList);
    }

    /**
     * <p>
     * A list of <code>Database</code> objects from the specified catalog.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatabaseList(java.util.Collection)} or {@link #withDatabaseList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param databaseList
     *        A list of <code>Database</code> objects from the specified catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatabasesResult withDatabaseList(Database... databaseList) {
        if (this.databaseList == null) {
            setDatabaseList(new java.util.ArrayList<Database>(databaseList.length));
        }
        for (Database ele : databaseList) {
            this.databaseList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Database</code> objects from the specified catalog.
     * </p>
     * 
     * @param databaseList
     *        A list of <code>Database</code> objects from the specified catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatabasesResult withDatabaseList(java.util.Collection<Database> databaseList) {
        setDatabaseList(databaseList);
        return this;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token for paginating the returned list of tokens, returned if the current segment of the
     *        list is not the last.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     * 
     * @return A continuation token for paginating the returned list of tokens, returned if the current segment of the
     *         list is not the last.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token for paginating the returned list of tokens, returned if the current segment of the
     *        list is not the last.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatabasesResult withNextToken(String nextToken) {
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
        if (getDatabaseList() != null)
            sb.append("DatabaseList: ").append(getDatabaseList()).append(",");
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

        if (obj instanceof GetDatabasesResult == false)
            return false;
        GetDatabasesResult other = (GetDatabasesResult) obj;
        if (other.getDatabaseList() == null ^ this.getDatabaseList() == null)
            return false;
        if (other.getDatabaseList() != null && other.getDatabaseList().equals(this.getDatabaseList()) == false)
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

        hashCode = prime * hashCode + ((getDatabaseList() == null) ? 0 : getDatabaseList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDatabasesResult clone() {
        try {
            return (GetDatabasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
