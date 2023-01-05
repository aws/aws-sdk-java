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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/QueryLineage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryLineageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of resource Amazon Resource Name (ARN) that represent the starting point for your lineage query.
     * </p>
     */
    private java.util.List<String> startArns;
    /**
     * <p>
     * Associations between lineage entities have a direction. This parameter determines the direction from the
     * StartArn(s) that the query traverses.
     * </p>
     */
    private String direction;
    /**
     * <p>
     * Setting this value to <code>True</code> retrieves not only the entities of interest but also the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking-entities.html">Associations</a> and
     * lineage entities on the path. Set to <code>False</code> to only return lineage entities that match your query.
     * </p>
     */
    private Boolean includeEdges;
    /**
     * <p>
     * A set of filtering parameters that allow you to specify which entities should be returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Properties - Key-value pairs to match on the lineage entities' properties.
     * </p>
     * </li>
     * <li>
     * <p>
     * LineageTypes - A set of lineage entity types to match on. For example: <code>TrialComponent</code>,
     * <code>Artifact</code>, or <code>Context</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CreatedBefore - Filter entities created before this date.
     * </p>
     * </li>
     * <li>
     * <p>
     * ModifiedBefore - Filter entities modified before this date.
     * </p>
     * </li>
     * <li>
     * <p>
     * ModifiedAfter - Filter entities modified after this date.
     * </p>
     * </li>
     * </ul>
     */
    private QueryFilters filters;
    /**
     * <p>
     * The maximum depth in lineage relationships from the <code>StartArns</code> that are traversed. Depth is a measure
     * of the number of <code>Associations</code> from the <code>StartArn</code> entity to the matched results.
     * </p>
     */
    private Integer maxDepth;
    /**
     * <p>
     * Limits the number of vertices in the results. Use the <code>NextToken</code> in a response to to retrieve the
     * next page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Limits the number of vertices in the request. Use the <code>NextToken</code> in a response to to retrieve the
     * next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of resource Amazon Resource Name (ARN) that represent the starting point for your lineage query.
     * </p>
     * 
     * @return A list of resource Amazon Resource Name (ARN) that represent the starting point for your lineage query.
     */

    public java.util.List<String> getStartArns() {
        return startArns;
    }

    /**
     * <p>
     * A list of resource Amazon Resource Name (ARN) that represent the starting point for your lineage query.
     * </p>
     * 
     * @param startArns
     *        A list of resource Amazon Resource Name (ARN) that represent the starting point for your lineage query.
     */

    public void setStartArns(java.util.Collection<String> startArns) {
        if (startArns == null) {
            this.startArns = null;
            return;
        }

        this.startArns = new java.util.ArrayList<String>(startArns);
    }

    /**
     * <p>
     * A list of resource Amazon Resource Name (ARN) that represent the starting point for your lineage query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStartArns(java.util.Collection)} or {@link #withStartArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param startArns
     *        A list of resource Amazon Resource Name (ARN) that represent the starting point for your lineage query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryLineageRequest withStartArns(String... startArns) {
        if (this.startArns == null) {
            setStartArns(new java.util.ArrayList<String>(startArns.length));
        }
        for (String ele : startArns) {
            this.startArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource Amazon Resource Name (ARN) that represent the starting point for your lineage query.
     * </p>
     * 
     * @param startArns
     *        A list of resource Amazon Resource Name (ARN) that represent the starting point for your lineage query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryLineageRequest withStartArns(java.util.Collection<String> startArns) {
        setStartArns(startArns);
        return this;
    }

    /**
     * <p>
     * Associations between lineage entities have a direction. This parameter determines the direction from the
     * StartArn(s) that the query traverses.
     * </p>
     * 
     * @param direction
     *        Associations between lineage entities have a direction. This parameter determines the direction from the
     *        StartArn(s) that the query traverses.
     * @see Direction
     */

    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * <p>
     * Associations between lineage entities have a direction. This parameter determines the direction from the
     * StartArn(s) that the query traverses.
     * </p>
     * 
     * @return Associations between lineage entities have a direction. This parameter determines the direction from the
     *         StartArn(s) that the query traverses.
     * @see Direction
     */

    public String getDirection() {
        return this.direction;
    }

    /**
     * <p>
     * Associations between lineage entities have a direction. This parameter determines the direction from the
     * StartArn(s) that the query traverses.
     * </p>
     * 
     * @param direction
     *        Associations between lineage entities have a direction. This parameter determines the direction from the
     *        StartArn(s) that the query traverses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Direction
     */

    public QueryLineageRequest withDirection(String direction) {
        setDirection(direction);
        return this;
    }

    /**
     * <p>
     * Associations between lineage entities have a direction. This parameter determines the direction from the
     * StartArn(s) that the query traverses.
     * </p>
     * 
     * @param direction
     *        Associations between lineage entities have a direction. This parameter determines the direction from the
     *        StartArn(s) that the query traverses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Direction
     */

    public QueryLineageRequest withDirection(Direction direction) {
        this.direction = direction.toString();
        return this;
    }

    /**
     * <p>
     * Setting this value to <code>True</code> retrieves not only the entities of interest but also the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking-entities.html">Associations</a> and
     * lineage entities on the path. Set to <code>False</code> to only return lineage entities that match your query.
     * </p>
     * 
     * @param includeEdges
     *        Setting this value to <code>True</code> retrieves not only the entities of interest but also the <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking-entities.html">Associations</a> and
     *        lineage entities on the path. Set to <code>False</code> to only return lineage entities that match your
     *        query.
     */

    public void setIncludeEdges(Boolean includeEdges) {
        this.includeEdges = includeEdges;
    }

    /**
     * <p>
     * Setting this value to <code>True</code> retrieves not only the entities of interest but also the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking-entities.html">Associations</a> and
     * lineage entities on the path. Set to <code>False</code> to only return lineage entities that match your query.
     * </p>
     * 
     * @return Setting this value to <code>True</code> retrieves not only the entities of interest but also the <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking-entities.html">Associations</a>
     *         and lineage entities on the path. Set to <code>False</code> to only return lineage entities that match
     *         your query.
     */

    public Boolean getIncludeEdges() {
        return this.includeEdges;
    }

    /**
     * <p>
     * Setting this value to <code>True</code> retrieves not only the entities of interest but also the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking-entities.html">Associations</a> and
     * lineage entities on the path. Set to <code>False</code> to only return lineage entities that match your query.
     * </p>
     * 
     * @param includeEdges
     *        Setting this value to <code>True</code> retrieves not only the entities of interest but also the <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking-entities.html">Associations</a> and
     *        lineage entities on the path. Set to <code>False</code> to only return lineage entities that match your
     *        query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryLineageRequest withIncludeEdges(Boolean includeEdges) {
        setIncludeEdges(includeEdges);
        return this;
    }

    /**
     * <p>
     * Setting this value to <code>True</code> retrieves not only the entities of interest but also the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking-entities.html">Associations</a> and
     * lineage entities on the path. Set to <code>False</code> to only return lineage entities that match your query.
     * </p>
     * 
     * @return Setting this value to <code>True</code> retrieves not only the entities of interest but also the <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/lineage-tracking-entities.html">Associations</a>
     *         and lineage entities on the path. Set to <code>False</code> to only return lineage entities that match
     *         your query.
     */

    public Boolean isIncludeEdges() {
        return this.includeEdges;
    }

    /**
     * <p>
     * A set of filtering parameters that allow you to specify which entities should be returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Properties - Key-value pairs to match on the lineage entities' properties.
     * </p>
     * </li>
     * <li>
     * <p>
     * LineageTypes - A set of lineage entity types to match on. For example: <code>TrialComponent</code>,
     * <code>Artifact</code>, or <code>Context</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CreatedBefore - Filter entities created before this date.
     * </p>
     * </li>
     * <li>
     * <p>
     * ModifiedBefore - Filter entities modified before this date.
     * </p>
     * </li>
     * <li>
     * <p>
     * ModifiedAfter - Filter entities modified after this date.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A set of filtering parameters that allow you to specify which entities should be returned.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Properties - Key-value pairs to match on the lineage entities' properties.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LineageTypes - A set of lineage entity types to match on. For example: <code>TrialComponent</code>,
     *        <code>Artifact</code>, or <code>Context</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CreatedBefore - Filter entities created before this date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ModifiedBefore - Filter entities modified before this date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ModifiedAfter - Filter entities modified after this date.
     *        </p>
     *        </li>
     */

    public void setFilters(QueryFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * A set of filtering parameters that allow you to specify which entities should be returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Properties - Key-value pairs to match on the lineage entities' properties.
     * </p>
     * </li>
     * <li>
     * <p>
     * LineageTypes - A set of lineage entity types to match on. For example: <code>TrialComponent</code>,
     * <code>Artifact</code>, or <code>Context</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CreatedBefore - Filter entities created before this date.
     * </p>
     * </li>
     * <li>
     * <p>
     * ModifiedBefore - Filter entities modified before this date.
     * </p>
     * </li>
     * <li>
     * <p>
     * ModifiedAfter - Filter entities modified after this date.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A set of filtering parameters that allow you to specify which entities should be returned.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Properties - Key-value pairs to match on the lineage entities' properties.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LineageTypes - A set of lineage entity types to match on. For example: <code>TrialComponent</code>,
     *         <code>Artifact</code>, or <code>Context</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CreatedBefore - Filter entities created before this date.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ModifiedBefore - Filter entities modified before this date.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ModifiedAfter - Filter entities modified after this date.
     *         </p>
     *         </li>
     */

    public QueryFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * A set of filtering parameters that allow you to specify which entities should be returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Properties - Key-value pairs to match on the lineage entities' properties.
     * </p>
     * </li>
     * <li>
     * <p>
     * LineageTypes - A set of lineage entity types to match on. For example: <code>TrialComponent</code>,
     * <code>Artifact</code>, or <code>Context</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CreatedBefore - Filter entities created before this date.
     * </p>
     * </li>
     * <li>
     * <p>
     * ModifiedBefore - Filter entities modified before this date.
     * </p>
     * </li>
     * <li>
     * <p>
     * ModifiedAfter - Filter entities modified after this date.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A set of filtering parameters that allow you to specify which entities should be returned.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Properties - Key-value pairs to match on the lineage entities' properties.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LineageTypes - A set of lineage entity types to match on. For example: <code>TrialComponent</code>,
     *        <code>Artifact</code>, or <code>Context</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CreatedBefore - Filter entities created before this date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ModifiedBefore - Filter entities modified before this date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ModifiedAfter - Filter entities modified after this date.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryLineageRequest withFilters(QueryFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum depth in lineage relationships from the <code>StartArns</code> that are traversed. Depth is a measure
     * of the number of <code>Associations</code> from the <code>StartArn</code> entity to the matched results.
     * </p>
     * 
     * @param maxDepth
     *        The maximum depth in lineage relationships from the <code>StartArns</code> that are traversed. Depth is a
     *        measure of the number of <code>Associations</code> from the <code>StartArn</code> entity to the matched
     *        results.
     */

    public void setMaxDepth(Integer maxDepth) {
        this.maxDepth = maxDepth;
    }

    /**
     * <p>
     * The maximum depth in lineage relationships from the <code>StartArns</code> that are traversed. Depth is a measure
     * of the number of <code>Associations</code> from the <code>StartArn</code> entity to the matched results.
     * </p>
     * 
     * @return The maximum depth in lineage relationships from the <code>StartArns</code> that are traversed. Depth is a
     *         measure of the number of <code>Associations</code> from the <code>StartArn</code> entity to the matched
     *         results.
     */

    public Integer getMaxDepth() {
        return this.maxDepth;
    }

    /**
     * <p>
     * The maximum depth in lineage relationships from the <code>StartArns</code> that are traversed. Depth is a measure
     * of the number of <code>Associations</code> from the <code>StartArn</code> entity to the matched results.
     * </p>
     * 
     * @param maxDepth
     *        The maximum depth in lineage relationships from the <code>StartArns</code> that are traversed. Depth is a
     *        measure of the number of <code>Associations</code> from the <code>StartArn</code> entity to the matched
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryLineageRequest withMaxDepth(Integer maxDepth) {
        setMaxDepth(maxDepth);
        return this;
    }

    /**
     * <p>
     * Limits the number of vertices in the results. Use the <code>NextToken</code> in a response to to retrieve the
     * next page of results.
     * </p>
     * 
     * @param maxResults
     *        Limits the number of vertices in the results. Use the <code>NextToken</code> in a response to to retrieve
     *        the next page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Limits the number of vertices in the results. Use the <code>NextToken</code> in a response to to retrieve the
     * next page of results.
     * </p>
     * 
     * @return Limits the number of vertices in the results. Use the <code>NextToken</code> in a response to to retrieve
     *         the next page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Limits the number of vertices in the results. Use the <code>NextToken</code> in a response to to retrieve the
     * next page of results.
     * </p>
     * 
     * @param maxResults
     *        Limits the number of vertices in the results. Use the <code>NextToken</code> in a response to to retrieve
     *        the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryLineageRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Limits the number of vertices in the request. Use the <code>NextToken</code> in a response to to retrieve the
     * next page of results.
     * </p>
     * 
     * @param nextToken
     *        Limits the number of vertices in the request. Use the <code>NextToken</code> in a response to to retrieve
     *        the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Limits the number of vertices in the request. Use the <code>NextToken</code> in a response to to retrieve the
     * next page of results.
     * </p>
     * 
     * @return Limits the number of vertices in the request. Use the <code>NextToken</code> in a response to to retrieve
     *         the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Limits the number of vertices in the request. Use the <code>NextToken</code> in a response to to retrieve the
     * next page of results.
     * </p>
     * 
     * @param nextToken
     *        Limits the number of vertices in the request. Use the <code>NextToken</code> in a response to to retrieve
     *        the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryLineageRequest withNextToken(String nextToken) {
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
        if (getStartArns() != null)
            sb.append("StartArns: ").append(getStartArns()).append(",");
        if (getDirection() != null)
            sb.append("Direction: ").append(getDirection()).append(",");
        if (getIncludeEdges() != null)
            sb.append("IncludeEdges: ").append(getIncludeEdges()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxDepth() != null)
            sb.append("MaxDepth: ").append(getMaxDepth()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof QueryLineageRequest == false)
            return false;
        QueryLineageRequest other = (QueryLineageRequest) obj;
        if (other.getStartArns() == null ^ this.getStartArns() == null)
            return false;
        if (other.getStartArns() != null && other.getStartArns().equals(this.getStartArns()) == false)
            return false;
        if (other.getDirection() == null ^ this.getDirection() == null)
            return false;
        if (other.getDirection() != null && other.getDirection().equals(this.getDirection()) == false)
            return false;
        if (other.getIncludeEdges() == null ^ this.getIncludeEdges() == null)
            return false;
        if (other.getIncludeEdges() != null && other.getIncludeEdges().equals(this.getIncludeEdges()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxDepth() == null ^ this.getMaxDepth() == null)
            return false;
        if (other.getMaxDepth() != null && other.getMaxDepth().equals(this.getMaxDepth()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getStartArns() == null) ? 0 : getStartArns().hashCode());
        hashCode = prime * hashCode + ((getDirection() == null) ? 0 : getDirection().hashCode());
        hashCode = prime * hashCode + ((getIncludeEdges() == null) ? 0 : getIncludeEdges().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxDepth() == null) ? 0 : getMaxDepth().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public QueryLineageRequest clone() {
        return (QueryLineageRequest) super.clone();
    }

}
