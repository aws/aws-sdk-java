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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for QueryObjects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/QueryObjects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryObjectsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the pipeline.
     * </p>
     */
    private String pipelineId;
    /**
     * <p>
     * The query that defines the objects to be returned. The <code>Query</code> object can contain a maximum of ten
     * selectors. The conditions in the query are limited to top-level String fields in the object. These filters can be
     * applied to components, instances, and attempts.
     * </p>
     */
    private Query query;
    /**
     * <p>
     * Indicates whether the query applies to components or instances. The possible values are: <code>COMPONENT</code>,
     * <code>INSTANCE</code>, and <code>ATTEMPT</code>.
     * </p>
     */
    private String sphere;
    /**
     * <p>
     * The starting point for the results to be returned. For the first call, this value should be empty. As long as
     * there are more results, continue to call <code>QueryObjects</code> with the marker value from the previous call
     * to retrieve the next set of results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of object names that <code>QueryObjects</code> will return in a single call. The default value
     * is 100.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The ID of the pipeline.
     * </p>
     * 
     * @param pipelineId
     *        The ID of the pipeline.
     */

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * <p>
     * The ID of the pipeline.
     * </p>
     * 
     * @return The ID of the pipeline.
     */

    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * <p>
     * The ID of the pipeline.
     * </p>
     * 
     * @param pipelineId
     *        The ID of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryObjectsRequest withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
        return this;
    }

    /**
     * <p>
     * The query that defines the objects to be returned. The <code>Query</code> object can contain a maximum of ten
     * selectors. The conditions in the query are limited to top-level String fields in the object. These filters can be
     * applied to components, instances, and attempts.
     * </p>
     * 
     * @param query
     *        The query that defines the objects to be returned. The <code>Query</code> object can contain a maximum of
     *        ten selectors. The conditions in the query are limited to top-level String fields in the object. These
     *        filters can be applied to components, instances, and attempts.
     */

    public void setQuery(Query query) {
        this.query = query;
    }

    /**
     * <p>
     * The query that defines the objects to be returned. The <code>Query</code> object can contain a maximum of ten
     * selectors. The conditions in the query are limited to top-level String fields in the object. These filters can be
     * applied to components, instances, and attempts.
     * </p>
     * 
     * @return The query that defines the objects to be returned. The <code>Query</code> object can contain a maximum of
     *         ten selectors. The conditions in the query are limited to top-level String fields in the object. These
     *         filters can be applied to components, instances, and attempts.
     */

    public Query getQuery() {
        return this.query;
    }

    /**
     * <p>
     * The query that defines the objects to be returned. The <code>Query</code> object can contain a maximum of ten
     * selectors. The conditions in the query are limited to top-level String fields in the object. These filters can be
     * applied to components, instances, and attempts.
     * </p>
     * 
     * @param query
     *        The query that defines the objects to be returned. The <code>Query</code> object can contain a maximum of
     *        ten selectors. The conditions in the query are limited to top-level String fields in the object. These
     *        filters can be applied to components, instances, and attempts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryObjectsRequest withQuery(Query query) {
        setQuery(query);
        return this;
    }

    /**
     * <p>
     * Indicates whether the query applies to components or instances. The possible values are: <code>COMPONENT</code>,
     * <code>INSTANCE</code>, and <code>ATTEMPT</code>.
     * </p>
     * 
     * @param sphere
     *        Indicates whether the query applies to components or instances. The possible values are:
     *        <code>COMPONENT</code>, <code>INSTANCE</code>, and <code>ATTEMPT</code>.
     */

    public void setSphere(String sphere) {
        this.sphere = sphere;
    }

    /**
     * <p>
     * Indicates whether the query applies to components or instances. The possible values are: <code>COMPONENT</code>,
     * <code>INSTANCE</code>, and <code>ATTEMPT</code>.
     * </p>
     * 
     * @return Indicates whether the query applies to components or instances. The possible values are:
     *         <code>COMPONENT</code>, <code>INSTANCE</code>, and <code>ATTEMPT</code>.
     */

    public String getSphere() {
        return this.sphere;
    }

    /**
     * <p>
     * Indicates whether the query applies to components or instances. The possible values are: <code>COMPONENT</code>,
     * <code>INSTANCE</code>, and <code>ATTEMPT</code>.
     * </p>
     * 
     * @param sphere
     *        Indicates whether the query applies to components or instances. The possible values are:
     *        <code>COMPONENT</code>, <code>INSTANCE</code>, and <code>ATTEMPT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryObjectsRequest withSphere(String sphere) {
        setSphere(sphere);
        return this;
    }

    /**
     * <p>
     * The starting point for the results to be returned. For the first call, this value should be empty. As long as
     * there are more results, continue to call <code>QueryObjects</code> with the marker value from the previous call
     * to retrieve the next set of results.
     * </p>
     * 
     * @param marker
     *        The starting point for the results to be returned. For the first call, this value should be empty. As long
     *        as there are more results, continue to call <code>QueryObjects</code> with the marker value from the
     *        previous call to retrieve the next set of results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The starting point for the results to be returned. For the first call, this value should be empty. As long as
     * there are more results, continue to call <code>QueryObjects</code> with the marker value from the previous call
     * to retrieve the next set of results.
     * </p>
     * 
     * @return The starting point for the results to be returned. For the first call, this value should be empty. As
     *         long as there are more results, continue to call <code>QueryObjects</code> with the marker value from the
     *         previous call to retrieve the next set of results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The starting point for the results to be returned. For the first call, this value should be empty. As long as
     * there are more results, continue to call <code>QueryObjects</code> with the marker value from the previous call
     * to retrieve the next set of results.
     * </p>
     * 
     * @param marker
     *        The starting point for the results to be returned. For the first call, this value should be empty. As long
     *        as there are more results, continue to call <code>QueryObjects</code> with the marker value from the
     *        previous call to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryObjectsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of object names that <code>QueryObjects</code> will return in a single call. The default value
     * is 100.
     * </p>
     * 
     * @param limit
     *        The maximum number of object names that <code>QueryObjects</code> will return in a single call. The
     *        default value is 100.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of object names that <code>QueryObjects</code> will return in a single call. The default value
     * is 100.
     * </p>
     * 
     * @return The maximum number of object names that <code>QueryObjects</code> will return in a single call. The
     *         default value is 100.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of object names that <code>QueryObjects</code> will return in a single call. The default value
     * is 100.
     * </p>
     * 
     * @param limit
     *        The maximum number of object names that <code>QueryObjects</code> will return in a single call. The
     *        default value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryObjectsRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getPipelineId() != null)
            sb.append("PipelineId: ").append(getPipelineId()).append(",");
        if (getQuery() != null)
            sb.append("Query: ").append(getQuery()).append(",");
        if (getSphere() != null)
            sb.append("Sphere: ").append(getSphere()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryObjectsRequest == false)
            return false;
        QueryObjectsRequest other = (QueryObjectsRequest) obj;
        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        if (other.getSphere() == null ^ this.getSphere() == null)
            return false;
        if (other.getSphere() != null && other.getSphere().equals(this.getSphere()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode());
        hashCode = prime * hashCode + ((getSphere() == null) ? 0 : getSphere().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public QueryObjectsRequest clone() {
        return (QueryObjectsRequest) super.clone();
    }

}
