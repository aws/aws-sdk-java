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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTableVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTableVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of strings identifying available versions of the specified table.
     * </p>
     */
    private java.util.List<TableVersion> tableVersions;
    /**
     * <p>
     * A continuation token, if the list of available versions does not include the last one.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of strings identifying available versions of the specified table.
     * </p>
     * 
     * @return A list of strings identifying available versions of the specified table.
     */

    public java.util.List<TableVersion> getTableVersions() {
        return tableVersions;
    }

    /**
     * <p>
     * A list of strings identifying available versions of the specified table.
     * </p>
     * 
     * @param tableVersions
     *        A list of strings identifying available versions of the specified table.
     */

    public void setTableVersions(java.util.Collection<TableVersion> tableVersions) {
        if (tableVersions == null) {
            this.tableVersions = null;
            return;
        }

        this.tableVersions = new java.util.ArrayList<TableVersion>(tableVersions);
    }

    /**
     * <p>
     * A list of strings identifying available versions of the specified table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTableVersions(java.util.Collection)} or {@link #withTableVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tableVersions
     *        A list of strings identifying available versions of the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableVersionsResult withTableVersions(TableVersion... tableVersions) {
        if (this.tableVersions == null) {
            setTableVersions(new java.util.ArrayList<TableVersion>(tableVersions.length));
        }
        for (TableVersion ele : tableVersions) {
            this.tableVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of strings identifying available versions of the specified table.
     * </p>
     * 
     * @param tableVersions
     *        A list of strings identifying available versions of the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableVersionsResult withTableVersions(java.util.Collection<TableVersion> tableVersions) {
        setTableVersions(tableVersions);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the list of available versions does not include the last one.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the list of available versions does not include the last one.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the list of available versions does not include the last one.
     * </p>
     * 
     * @return A continuation token, if the list of available versions does not include the last one.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if the list of available versions does not include the last one.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the list of available versions does not include the last one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableVersionsResult withNextToken(String nextToken) {
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
        if (getTableVersions() != null)
            sb.append("TableVersions: ").append(getTableVersions()).append(",");
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

        if (obj instanceof GetTableVersionsResult == false)
            return false;
        GetTableVersionsResult other = (GetTableVersionsResult) obj;
        if (other.getTableVersions() == null ^ this.getTableVersions() == null)
            return false;
        if (other.getTableVersions() != null && other.getTableVersions().equals(this.getTableVersions()) == false)
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

        hashCode = prime * hashCode + ((getTableVersions() == null) ? 0 : getTableVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetTableVersionsResult clone() {
        try {
            return (GetTableVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
