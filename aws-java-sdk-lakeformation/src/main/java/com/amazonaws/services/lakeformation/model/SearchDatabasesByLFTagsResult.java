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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchDatabasesByLFTags"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchDatabasesByLFTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of databases that meet the tag conditions.
     * </p>
     */
    private java.util.List<TaggedDatabase> databaseList;

    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, present if the current list segment is not the last.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     * 
     * @return A continuation token, present if the current list segment is not the last.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, present if the current list segment is not the last.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDatabasesByLFTagsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of databases that meet the tag conditions.
     * </p>
     * 
     * @return A list of databases that meet the tag conditions.
     */

    public java.util.List<TaggedDatabase> getDatabaseList() {
        return databaseList;
    }

    /**
     * <p>
     * A list of databases that meet the tag conditions.
     * </p>
     * 
     * @param databaseList
     *        A list of databases that meet the tag conditions.
     */

    public void setDatabaseList(java.util.Collection<TaggedDatabase> databaseList) {
        if (databaseList == null) {
            this.databaseList = null;
            return;
        }

        this.databaseList = new java.util.ArrayList<TaggedDatabase>(databaseList);
    }

    /**
     * <p>
     * A list of databases that meet the tag conditions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatabaseList(java.util.Collection)} or {@link #withDatabaseList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param databaseList
     *        A list of databases that meet the tag conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDatabasesByLFTagsResult withDatabaseList(TaggedDatabase... databaseList) {
        if (this.databaseList == null) {
            setDatabaseList(new java.util.ArrayList<TaggedDatabase>(databaseList.length));
        }
        for (TaggedDatabase ele : databaseList) {
            this.databaseList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of databases that meet the tag conditions.
     * </p>
     * 
     * @param databaseList
     *        A list of databases that meet the tag conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDatabasesByLFTagsResult withDatabaseList(java.util.Collection<TaggedDatabase> databaseList) {
        setDatabaseList(databaseList);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getDatabaseList() != null)
            sb.append("DatabaseList: ").append(getDatabaseList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchDatabasesByLFTagsResult == false)
            return false;
        SearchDatabasesByLFTagsResult other = (SearchDatabasesByLFTagsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDatabaseList() == null ^ this.getDatabaseList() == null)
            return false;
        if (other.getDatabaseList() != null && other.getDatabaseList().equals(this.getDatabaseList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDatabaseList() == null) ? 0 : getDatabaseList().hashCode());
        return hashCode;
    }

    @Override
    public SearchDatabasesByLFTagsResult clone() {
        try {
            return (SearchDatabasesByLFTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
