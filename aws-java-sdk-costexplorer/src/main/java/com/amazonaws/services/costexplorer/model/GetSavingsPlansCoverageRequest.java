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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansCoverage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSavingsPlansCoverageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The time period that you want the usage and costs for. The <code>Start</code> date must be within 13 months. The
     * <code>End</code> date must be after the <code>Start</code> date, and before the current date. Future dates can't
     * be used as an <code>End</code> date.
     * </p>
     */
    private DateInterval timePeriod;
    /**
     * <p>
     * You can group the data using the attributes <code>INSTANCE_FAMILY</code>, <code>REGION</code>, or
     * <code>SERVICE</code>.
     * </p>
     */
    private java.util.List<GroupDefinition> groupBy;
    /**
     * <p>
     * The granularity of the Amazon Web Services cost data for your Savings Plans. <code>Granularity</code> can't be
     * set if <code>GroupBy</code> is set.
     * </p>
     * <p>
     * The <code>GetSavingsPlansCoverage</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     */
    private String granularity;
    /**
     * <p>
     * Filters Savings Plans coverage data by dimensions. You can filter data for Savings Plans usage with the following
     * dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetSavingsPlansCoverage</code> uses the same <a
     * href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object as the other operations, but only <code>AND</code> is supported among each dimension. If there are
     * multiple values for a dimension, they are OR'd together.
     * </p>
     */
    private Expression filter;
    /**
     * <p>
     * The measurement that you want your Savings Plans coverage reported in. The only valid value is
     * <code>SpendCoveredBySavingsPlans</code>.
     * </p>
     */
    private java.util.List<String> metrics;
    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of items to be returned in a response. The default is <code>20</code>, with a minimum value of
     * <code>1</code>.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The time period that you want the usage and costs for. The <code>Start</code> date must be within 13 months. The
     * <code>End</code> date must be after the <code>Start</code> date, and before the current date. Future dates can't
     * be used as an <code>End</code> date.
     * </p>
     * 
     * @param timePeriod
     *        The time period that you want the usage and costs for. The <code>Start</code> date must be within 13
     *        months. The <code>End</code> date must be after the <code>Start</code> date, and before the current date.
     *        Future dates can't be used as an <code>End</code> date.
     */

    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The time period that you want the usage and costs for. The <code>Start</code> date must be within 13 months. The
     * <code>End</code> date must be after the <code>Start</code> date, and before the current date. Future dates can't
     * be used as an <code>End</code> date.
     * </p>
     * 
     * @return The time period that you want the usage and costs for. The <code>Start</code> date must be within 13
     *         months. The <code>End</code> date must be after the <code>Start</code> date, and before the current date.
     *         Future dates can't be used as an <code>End</code> date.
     */

    public DateInterval getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * The time period that you want the usage and costs for. The <code>Start</code> date must be within 13 months. The
     * <code>End</code> date must be after the <code>Start</code> date, and before the current date. Future dates can't
     * be used as an <code>End</code> date.
     * </p>
     * 
     * @param timePeriod
     *        The time period that you want the usage and costs for. The <code>Start</code> date must be within 13
     *        months. The <code>End</code> date must be after the <code>Start</code> date, and before the current date.
     *        Future dates can't be used as an <code>End</code> date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansCoverageRequest withTimePeriod(DateInterval timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * <p>
     * You can group the data using the attributes <code>INSTANCE_FAMILY</code>, <code>REGION</code>, or
     * <code>SERVICE</code>.
     * </p>
     * 
     * @return You can group the data using the attributes <code>INSTANCE_FAMILY</code>, <code>REGION</code>, or
     *         <code>SERVICE</code>.
     */

    public java.util.List<GroupDefinition> getGroupBy() {
        return groupBy;
    }

    /**
     * <p>
     * You can group the data using the attributes <code>INSTANCE_FAMILY</code>, <code>REGION</code>, or
     * <code>SERVICE</code>.
     * </p>
     * 
     * @param groupBy
     *        You can group the data using the attributes <code>INSTANCE_FAMILY</code>, <code>REGION</code>, or
     *        <code>SERVICE</code>.
     */

    public void setGroupBy(java.util.Collection<GroupDefinition> groupBy) {
        if (groupBy == null) {
            this.groupBy = null;
            return;
        }

        this.groupBy = new java.util.ArrayList<GroupDefinition>(groupBy);
    }

    /**
     * <p>
     * You can group the data using the attributes <code>INSTANCE_FAMILY</code>, <code>REGION</code>, or
     * <code>SERVICE</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupBy(java.util.Collection)} or {@link #withGroupBy(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param groupBy
     *        You can group the data using the attributes <code>INSTANCE_FAMILY</code>, <code>REGION</code>, or
     *        <code>SERVICE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansCoverageRequest withGroupBy(GroupDefinition... groupBy) {
        if (this.groupBy == null) {
            setGroupBy(new java.util.ArrayList<GroupDefinition>(groupBy.length));
        }
        for (GroupDefinition ele : groupBy) {
            this.groupBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * You can group the data using the attributes <code>INSTANCE_FAMILY</code>, <code>REGION</code>, or
     * <code>SERVICE</code>.
     * </p>
     * 
     * @param groupBy
     *        You can group the data using the attributes <code>INSTANCE_FAMILY</code>, <code>REGION</code>, or
     *        <code>SERVICE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansCoverageRequest withGroupBy(java.util.Collection<GroupDefinition> groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * The granularity of the Amazon Web Services cost data for your Savings Plans. <code>Granularity</code> can't be
     * set if <code>GroupBy</code> is set.
     * </p>
     * <p>
     * The <code>GetSavingsPlansCoverage</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @param granularity
     *        The granularity of the Amazon Web Services cost data for your Savings Plans. <code>Granularity</code> 
     *        can't be set if <code>GroupBy</code> is set.</p>
     *        <p>
     *        The <code>GetSavingsPlansCoverage</code> operation supports only <code>DAILY</code> and
     *        <code>MONTHLY</code> granularities.
     * @see Granularity
     */

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    /**
     * <p>
     * The granularity of the Amazon Web Services cost data for your Savings Plans. <code>Granularity</code> can't be
     * set if <code>GroupBy</code> is set.
     * </p>
     * <p>
     * The <code>GetSavingsPlansCoverage</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @return The granularity of the Amazon Web Services cost data for your Savings Plans. <code>Granularity</code> 
     *         can't be set if <code>GroupBy</code> is set.</p>
     *         <p>
     *         The <code>GetSavingsPlansCoverage</code> operation supports only <code>DAILY</code> and
     *         <code>MONTHLY</code> granularities.
     * @see Granularity
     */

    public String getGranularity() {
        return this.granularity;
    }

    /**
     * <p>
     * The granularity of the Amazon Web Services cost data for your Savings Plans. <code>Granularity</code> can't be
     * set if <code>GroupBy</code> is set.
     * </p>
     * <p>
     * The <code>GetSavingsPlansCoverage</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @param granularity
     *        The granularity of the Amazon Web Services cost data for your Savings Plans. <code>Granularity</code> 
     *        can't be set if <code>GroupBy</code> is set.</p>
     *        <p>
     *        The <code>GetSavingsPlansCoverage</code> operation supports only <code>DAILY</code> and
     *        <code>MONTHLY</code> granularities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Granularity
     */

    public GetSavingsPlansCoverageRequest withGranularity(String granularity) {
        setGranularity(granularity);
        return this;
    }

    /**
     * <p>
     * The granularity of the Amazon Web Services cost data for your Savings Plans. <code>Granularity</code> can't be
     * set if <code>GroupBy</code> is set.
     * </p>
     * <p>
     * The <code>GetSavingsPlansCoverage</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @param granularity
     *        The granularity of the Amazon Web Services cost data for your Savings Plans. <code>Granularity</code> 
     *        can't be set if <code>GroupBy</code> is set.</p>
     *        <p>
     *        The <code>GetSavingsPlansCoverage</code> operation supports only <code>DAILY</code> and
     *        <code>MONTHLY</code> granularities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Granularity
     */

    public GetSavingsPlansCoverageRequest withGranularity(Granularity granularity) {
        this.granularity = granularity.toString();
        return this;
    }

    /**
     * <p>
     * Filters Savings Plans coverage data by dimensions. You can filter data for Savings Plans usage with the following
     * dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetSavingsPlansCoverage</code> uses the same <a
     * href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object as the other operations, but only <code>AND</code> is supported among each dimension. If there are
     * multiple values for a dimension, they are OR'd together.
     * </p>
     * 
     * @param filter
     *        Filters Savings Plans coverage data by dimensions. You can filter data for Savings Plans usage with the
     *        following dimensions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LINKED_ACCOUNT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTANCE_FAMILY</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>GetSavingsPlansCoverage</code> uses the same <a
     *        href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *        >Expression</a> object as the other operations, but only <code>AND</code> is supported among each
     *        dimension. If there are multiple values for a dimension, they are OR'd together.
     */

    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filters Savings Plans coverage data by dimensions. You can filter data for Savings Plans usage with the following
     * dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetSavingsPlansCoverage</code> uses the same <a
     * href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object as the other operations, but only <code>AND</code> is supported among each dimension. If there are
     * multiple values for a dimension, they are OR'd together.
     * </p>
     * 
     * @return Filters Savings Plans coverage data by dimensions. You can filter data for Savings Plans usage with the
     *         following dimensions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LINKED_ACCOUNT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REGION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SERVICE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSTANCE_FAMILY</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>GetSavingsPlansCoverage</code> uses the same <a
     *         href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *         >Expression</a> object as the other operations, but only <code>AND</code> is supported among each
     *         dimension. If there are multiple values for a dimension, they are OR'd together.
     */

    public Expression getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Filters Savings Plans coverage data by dimensions. You can filter data for Savings Plans usage with the following
     * dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetSavingsPlansCoverage</code> uses the same <a
     * href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object as the other operations, but only <code>AND</code> is supported among each dimension. If there are
     * multiple values for a dimension, they are OR'd together.
     * </p>
     * 
     * @param filter
     *        Filters Savings Plans coverage data by dimensions. You can filter data for Savings Plans usage with the
     *        following dimensions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LINKED_ACCOUNT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTANCE_FAMILY</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>GetSavingsPlansCoverage</code> uses the same <a
     *        href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *        >Expression</a> object as the other operations, but only <code>AND</code> is supported among each
     *        dimension. If there are multiple values for a dimension, they are OR'd together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansCoverageRequest withFilter(Expression filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The measurement that you want your Savings Plans coverage reported in. The only valid value is
     * <code>SpendCoveredBySavingsPlans</code>.
     * </p>
     * 
     * @return The measurement that you want your Savings Plans coverage reported in. The only valid value is
     *         <code>SpendCoveredBySavingsPlans</code>.
     */

    public java.util.List<String> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * The measurement that you want your Savings Plans coverage reported in. The only valid value is
     * <code>SpendCoveredBySavingsPlans</code>.
     * </p>
     * 
     * @param metrics
     *        The measurement that you want your Savings Plans coverage reported in. The only valid value is
     *        <code>SpendCoveredBySavingsPlans</code>.
     */

    public void setMetrics(java.util.Collection<String> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new java.util.ArrayList<String>(metrics);
    }

    /**
     * <p>
     * The measurement that you want your Savings Plans coverage reported in. The only valid value is
     * <code>SpendCoveredBySavingsPlans</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        The measurement that you want your Savings Plans coverage reported in. The only valid value is
     *        <code>SpendCoveredBySavingsPlans</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansCoverageRequest withMetrics(String... metrics) {
        if (this.metrics == null) {
            setMetrics(new java.util.ArrayList<String>(metrics.length));
        }
        for (String ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The measurement that you want your Savings Plans coverage reported in. The only valid value is
     * <code>SpendCoveredBySavingsPlans</code>.
     * </p>
     * 
     * @param metrics
     *        The measurement that you want your Savings Plans coverage reported in. The only valid value is
     *        <code>SpendCoveredBySavingsPlans</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansCoverageRequest withMetrics(java.util.Collection<String> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @return The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *         from a previous call has more results than the maximum page size.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansCoverageRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of items to be returned in a response. The default is <code>20</code>, with a minimum value of
     * <code>1</code>.
     * </p>
     * 
     * @param maxResults
     *        The number of items to be returned in a response. The default is <code>20</code>, with a minimum value of
     *        <code>1</code>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of items to be returned in a response. The default is <code>20</code>, with a minimum value of
     * <code>1</code>.
     * </p>
     * 
     * @return The number of items to be returned in a response. The default is <code>20</code>, with a minimum value of
     *         <code>1</code>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of items to be returned in a response. The default is <code>20</code>, with a minimum value of
     * <code>1</code>.
     * </p>
     * 
     * @param maxResults
     *        The number of items to be returned in a response. The default is <code>20</code>, with a minimum value of
     *        <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansCoverageRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod()).append(",");
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
        if (getGranularity() != null)
            sb.append("Granularity: ").append(getGranularity()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSavingsPlansCoverageRequest == false)
            return false;
        GetSavingsPlansCoverageRequest other = (GetSavingsPlansCoverageRequest) obj;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getGranularity() == null ^ this.getGranularity() == null)
            return false;
        if (other.getGranularity() != null && other.getGranularity().equals(this.getGranularity()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getGranularity() == null) ? 0 : getGranularity().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetSavingsPlansCoverageRequest clone() {
        return (GetSavingsPlansCoverageRequest) super.clone();
    }

}
