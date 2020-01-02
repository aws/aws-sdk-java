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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListDataflowEndpointGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataflowEndpointGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of dataflow endpoint groups.
     * </p>
     */
    private java.util.List<DataflowEndpointListItem> dataflowEndpointGroupList;
    /**
     * <p>
     * Next token returned in the response of a previous <code>ListDataflowEndpointGroups</code> call. Used to get the
     * next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of dataflow endpoint groups.
     * </p>
     * 
     * @return A list of dataflow endpoint groups.
     */

    public java.util.List<DataflowEndpointListItem> getDataflowEndpointGroupList() {
        return dataflowEndpointGroupList;
    }

    /**
     * <p>
     * A list of dataflow endpoint groups.
     * </p>
     * 
     * @param dataflowEndpointGroupList
     *        A list of dataflow endpoint groups.
     */

    public void setDataflowEndpointGroupList(java.util.Collection<DataflowEndpointListItem> dataflowEndpointGroupList) {
        if (dataflowEndpointGroupList == null) {
            this.dataflowEndpointGroupList = null;
            return;
        }

        this.dataflowEndpointGroupList = new java.util.ArrayList<DataflowEndpointListItem>(dataflowEndpointGroupList);
    }

    /**
     * <p>
     * A list of dataflow endpoint groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataflowEndpointGroupList(java.util.Collection)} or
     * {@link #withDataflowEndpointGroupList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dataflowEndpointGroupList
     *        A list of dataflow endpoint groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataflowEndpointGroupsResult withDataflowEndpointGroupList(DataflowEndpointListItem... dataflowEndpointGroupList) {
        if (this.dataflowEndpointGroupList == null) {
            setDataflowEndpointGroupList(new java.util.ArrayList<DataflowEndpointListItem>(dataflowEndpointGroupList.length));
        }
        for (DataflowEndpointListItem ele : dataflowEndpointGroupList) {
            this.dataflowEndpointGroupList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of dataflow endpoint groups.
     * </p>
     * 
     * @param dataflowEndpointGroupList
     *        A list of dataflow endpoint groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataflowEndpointGroupsResult withDataflowEndpointGroupList(java.util.Collection<DataflowEndpointListItem> dataflowEndpointGroupList) {
        setDataflowEndpointGroupList(dataflowEndpointGroupList);
        return this;
    }

    /**
     * <p>
     * Next token returned in the response of a previous <code>ListDataflowEndpointGroups</code> call. Used to get the
     * next page of results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous <code>ListDataflowEndpointGroups</code> call. Used to
     *        get the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous <code>ListDataflowEndpointGroups</code> call. Used to get the
     * next page of results.
     * </p>
     * 
     * @return Next token returned in the response of a previous <code>ListDataflowEndpointGroups</code> call. Used to
     *         get the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous <code>ListDataflowEndpointGroups</code> call. Used to get the
     * next page of results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous <code>ListDataflowEndpointGroups</code> call. Used to
     *        get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataflowEndpointGroupsResult withNextToken(String nextToken) {
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
        if (getDataflowEndpointGroupList() != null)
            sb.append("DataflowEndpointGroupList: ").append(getDataflowEndpointGroupList()).append(",");
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

        if (obj instanceof ListDataflowEndpointGroupsResult == false)
            return false;
        ListDataflowEndpointGroupsResult other = (ListDataflowEndpointGroupsResult) obj;
        if (other.getDataflowEndpointGroupList() == null ^ this.getDataflowEndpointGroupList() == null)
            return false;
        if (other.getDataflowEndpointGroupList() != null && other.getDataflowEndpointGroupList().equals(this.getDataflowEndpointGroupList()) == false)
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

        hashCode = prime * hashCode + ((getDataflowEndpointGroupList() == null) ? 0 : getDataflowEndpointGroupList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDataflowEndpointGroupsResult clone() {
        try {
            return (ListDataflowEndpointGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
