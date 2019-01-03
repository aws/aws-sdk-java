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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the output of QueryObjects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/QueryObjects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryObjectsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifiers that match the query selectors.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ids;
    /**
     * <p>
     * The starting point for the next page of results. To view the next page of results, call <code>QueryObjects</code>
     * again with this marker value. If the value is null, there are no more results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Indicates whether there are more results that can be obtained by a subsequent call.
     * </p>
     */
    private Boolean hasMoreResults;

    /**
     * <p>
     * The identifiers that match the query selectors.
     * </p>
     * 
     * @return The identifiers that match the query selectors.
     */

    public java.util.List<String> getIds() {
        if (ids == null) {
            ids = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ids;
    }

    /**
     * <p>
     * The identifiers that match the query selectors.
     * </p>
     * 
     * @param ids
     *        The identifiers that match the query selectors.
     */

    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new com.amazonaws.internal.SdkInternalList<String>(ids);
    }

    /**
     * <p>
     * The identifiers that match the query selectors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIds(java.util.Collection)} or {@link #withIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ids
     *        The identifiers that match the query selectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryObjectsResult withIds(String... ids) {
        if (this.ids == null) {
            setIds(new com.amazonaws.internal.SdkInternalList<String>(ids.length));
        }
        for (String ele : ids) {
            this.ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers that match the query selectors.
     * </p>
     * 
     * @param ids
     *        The identifiers that match the query selectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryObjectsResult withIds(java.util.Collection<String> ids) {
        setIds(ids);
        return this;
    }

    /**
     * <p>
     * The starting point for the next page of results. To view the next page of results, call <code>QueryObjects</code>
     * again with this marker value. If the value is null, there are no more results.
     * </p>
     * 
     * @param marker
     *        The starting point for the next page of results. To view the next page of results, call
     *        <code>QueryObjects</code> again with this marker value. If the value is null, there are no more results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The starting point for the next page of results. To view the next page of results, call <code>QueryObjects</code>
     * again with this marker value. If the value is null, there are no more results.
     * </p>
     * 
     * @return The starting point for the next page of results. To view the next page of results, call
     *         <code>QueryObjects</code> again with this marker value. If the value is null, there are no more results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The starting point for the next page of results. To view the next page of results, call <code>QueryObjects</code>
     * again with this marker value. If the value is null, there are no more results.
     * </p>
     * 
     * @param marker
     *        The starting point for the next page of results. To view the next page of results, call
     *        <code>QueryObjects</code> again with this marker value. If the value is null, there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryObjectsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are more results that can be obtained by a subsequent call.
     * </p>
     * 
     * @param hasMoreResults
     *        Indicates whether there are more results that can be obtained by a subsequent call.
     */

    public void setHasMoreResults(Boolean hasMoreResults) {
        this.hasMoreResults = hasMoreResults;
    }

    /**
     * <p>
     * Indicates whether there are more results that can be obtained by a subsequent call.
     * </p>
     * 
     * @return Indicates whether there are more results that can be obtained by a subsequent call.
     */

    public Boolean getHasMoreResults() {
        return this.hasMoreResults;
    }

    /**
     * <p>
     * Indicates whether there are more results that can be obtained by a subsequent call.
     * </p>
     * 
     * @param hasMoreResults
     *        Indicates whether there are more results that can be obtained by a subsequent call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryObjectsResult withHasMoreResults(Boolean hasMoreResults) {
        setHasMoreResults(hasMoreResults);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are more results that can be obtained by a subsequent call.
     * </p>
     * 
     * @return Indicates whether there are more results that can be obtained by a subsequent call.
     */

    public Boolean isHasMoreResults() {
        return this.hasMoreResults;
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
        if (getIds() != null)
            sb.append("Ids: ").append(getIds()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getHasMoreResults() != null)
            sb.append("HasMoreResults: ").append(getHasMoreResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryObjectsResult == false)
            return false;
        QueryObjectsResult other = (QueryObjectsResult) obj;
        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getHasMoreResults() == null ^ this.getHasMoreResults() == null)
            return false;
        if (other.getHasMoreResults() != null && other.getHasMoreResults().equals(this.getHasMoreResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getHasMoreResults() == null) ? 0 : getHasMoreResults().hashCode());
        return hashCode;
    }

    @Override
    public QueryObjectsResult clone() {
        try {
            return (QueryObjectsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
