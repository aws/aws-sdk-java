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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListDataSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of data sets, containing information including the creation time, the data set name, the data set
     * organization, the data set format, and the last time the data set was referenced or updated.
     * </p>
     */
    private java.util.List<DataSetSummary> dataSets;
    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to
     * retrieve the next set of items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of data sets, containing information including the creation time, the data set name, the data set
     * organization, the data set format, and the last time the data set was referenced or updated.
     * </p>
     * 
     * @return The list of data sets, containing information including the creation time, the data set name, the data
     *         set organization, the data set format, and the last time the data set was referenced or updated.
     */

    public java.util.List<DataSetSummary> getDataSets() {
        return dataSets;
    }

    /**
     * <p>
     * The list of data sets, containing information including the creation time, the data set name, the data set
     * organization, the data set format, and the last time the data set was referenced or updated.
     * </p>
     * 
     * @param dataSets
     *        The list of data sets, containing information including the creation time, the data set name, the data set
     *        organization, the data set format, and the last time the data set was referenced or updated.
     */

    public void setDataSets(java.util.Collection<DataSetSummary> dataSets) {
        if (dataSets == null) {
            this.dataSets = null;
            return;
        }

        this.dataSets = new java.util.ArrayList<DataSetSummary>(dataSets);
    }

    /**
     * <p>
     * The list of data sets, containing information including the creation time, the data set name, the data set
     * organization, the data set format, and the last time the data set was referenced or updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSets(java.util.Collection)} or {@link #withDataSets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param dataSets
     *        The list of data sets, containing information including the creation time, the data set name, the data set
     *        organization, the data set format, and the last time the data set was referenced or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSetsResult withDataSets(DataSetSummary... dataSets) {
        if (this.dataSets == null) {
            setDataSets(new java.util.ArrayList<DataSetSummary>(dataSets.length));
        }
        for (DataSetSummary ele : dataSets) {
            this.dataSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of data sets, containing information including the creation time, the data set name, the data set
     * organization, the data set format, and the last time the data set was referenced or updated.
     * </p>
     * 
     * @param dataSets
     *        The list of data sets, containing information including the creation time, the data set name, the data set
     *        organization, the data set format, and the last time the data set was referenced or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSetsResult withDataSets(java.util.Collection<DataSetSummary> dataSets) {
        setDataSets(dataSets);
        return this;
    }

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to
     * retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If there are more items to return, this contains a token that is passed to a subsequent call to this
     *        operation to retrieve the next set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to
     * retrieve the next set of items.
     * </p>
     * 
     * @return If there are more items to return, this contains a token that is passed to a subsequent call to this
     *         operation to retrieve the next set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to
     * retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If there are more items to return, this contains a token that is passed to a subsequent call to this
     *        operation to retrieve the next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSetsResult withNextToken(String nextToken) {
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
        if (getDataSets() != null)
            sb.append("DataSets: ").append(getDataSets()).append(",");
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

        if (obj instanceof ListDataSetsResult == false)
            return false;
        ListDataSetsResult other = (ListDataSetsResult) obj;
        if (other.getDataSets() == null ^ this.getDataSets() == null)
            return false;
        if (other.getDataSets() != null && other.getDataSets().equals(this.getDataSets()) == false)
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

        hashCode = prime * hashCode + ((getDataSets() == null) ? 0 : getDataSets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDataSetsResult clone() {
        try {
            return (ListDataSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
