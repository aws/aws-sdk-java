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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListDataSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataSourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>DataSource</code> objects.
     * </p>
     */
    private java.util.List<DataSource> dataSources;
    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The <code>DataSource</code> objects.
     * </p>
     * 
     * @return The <code>DataSource</code> objects.
     */

    public java.util.List<DataSource> getDataSources() {
        return dataSources;
    }

    /**
     * <p>
     * The <code>DataSource</code> objects.
     * </p>
     * 
     * @param dataSources
     *        The <code>DataSource</code> objects.
     */

    public void setDataSources(java.util.Collection<DataSource> dataSources) {
        if (dataSources == null) {
            this.dataSources = null;
            return;
        }

        this.dataSources = new java.util.ArrayList<DataSource>(dataSources);
    }

    /**
     * <p>
     * The <code>DataSource</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSources(java.util.Collection)} or {@link #withDataSources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataSources
     *        The <code>DataSource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesResult withDataSources(DataSource... dataSources) {
        if (this.dataSources == null) {
            setDataSources(new java.util.ArrayList<DataSource>(dataSources.length));
        }
        for (DataSource ele : dataSources) {
            this.dataSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>DataSource</code> objects.
     * </p>
     * 
     * @param dataSources
     *        The <code>DataSource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesResult withDataSources(java.util.Collection<DataSource> dataSources) {
        setDataSources(dataSources);
        return this;
    }

    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier to be passed in the next request to this operation to return the next set of items in the
     *        list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     * 
     * @return An identifier to be passed in the next request to this operation to return the next set of items in the
     *         list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier to be passed in the next request to this operation to return the next set of items in the
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesResult withNextToken(String nextToken) {
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
        if (getDataSources() != null)
            sb.append("DataSources: ").append(getDataSources()).append(",");
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

        if (obj instanceof ListDataSourcesResult == false)
            return false;
        ListDataSourcesResult other = (ListDataSourcesResult) obj;
        if (other.getDataSources() == null ^ this.getDataSources() == null)
            return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false)
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

        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDataSourcesResult clone() {
        try {
            return (ListDataSourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
