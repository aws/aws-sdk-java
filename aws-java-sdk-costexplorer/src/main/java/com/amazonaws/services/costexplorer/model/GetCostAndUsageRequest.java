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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostAndUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCostAndUsageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Sets the start and end dates for retrieving AWS costs. The start date is inclusive, but the end date is
     * exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     */
    private DateInterval timePeriod;
    /**
     * <p>
     * Sets the AWS cost granularity to <code>MONTHLY</code> or <code>DAILY</code>. If <code>Granularity</code> isn't
     * set, the response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetCostAndUsageRequest</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     */
    private String granularity;
    /**
     * <p>
     * Filters AWS costs by different dimensions. For example, you can specify <code>SERVICE</code> and
     * <code>LINKED_ACCOUNT</code> and get the costs that are associated with that account's usage of that service. You
     * can nest <code>Expression</code> objects to define any combination of dimension filters. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>.
     * </p>
     */
    private Expression filter;
    /**
     * <p>
     * Which metrics are returned in the query. For more information about blended and unblended rates, see <a
     * href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does the "blended"
     * annotation appear on some line items in my bill?</a>.
     * </p>
     * <p>
     * Valid values are <code>AmortizedCost</code>, <code>BlendedCost</code>, <code>NetAmortizedCost</code>,
     * <code>NetUnblendedCost</code>, <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>, and
     * <code>UsageQuantity</code>.
     * </p>
     * <note>
     * <p>
     * If you return the <code>UsageQuantity</code> metric, the service aggregates all usage numbers without taking into
     * account the units. For example, if you aggregate <code>usageQuantity</code> across all of Amazon EC2, the results
     * aren't meaningful because Amazon EC2 compute hours and data transfer are measured in different units (for
     * example, hours vs. GB). To get more meaningful <code>UsageQuantity</code> metrics, filter by
     * <code>UsageType</code> or <code>UsageTypeGroups</code>.
     * </p>
     * </note>
     * <p>
     * <code>Metrics</code> is required for <code>GetCostAndUsage</code> requests.
     * </p>
     */
    private java.util.List<String> metrics;
    /**
     * <p>
     * You can group AWS costs using up to two different groups, either dimensions, tag keys, or both.
     * </p>
     * <p>
     * When you group by tag key, you get all tag values, including empty strings.
     * </p>
     * <p>
     * Valid values are <code>AZ</code>, <code>INSTANCE_TYPE</code>, <code>LEGAL_ENTITY_NAME</code>,
     * <code>LINKED_ACCOUNT</code>, <code>OPERATION</code>, <code>PLATFORM</code>, <code>PURCHASE_TYPE</code>,
     * <code>SERVICE</code>, <code>TAGS</code>, <code>TENANCY</code>, and <code>USAGE_TYPE</code>.
     * </p>
     */
    private java.util.List<GroupDefinition> groupBy;
    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * Sets the start and end dates for retrieving AWS costs. The start date is inclusive, but the end date is
     * exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     * 
     * @param timePeriod
     *        Sets the start and end dates for retrieving AWS costs. The start date is inclusive, but the end date is
     *        exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     *        <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     *        including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     */

    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * Sets the start and end dates for retrieving AWS costs. The start date is inclusive, but the end date is
     * exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     * 
     * @return Sets the start and end dates for retrieving AWS costs. The start date is inclusive, but the end date is
     *         exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     *         <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     *         including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     */

    public DateInterval getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * Sets the start and end dates for retrieving AWS costs. The start date is inclusive, but the end date is
     * exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     * 
     * @param timePeriod
     *        Sets the start and end dates for retrieving AWS costs. The start date is inclusive, but the end date is
     *        exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     *        <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     *        including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostAndUsageRequest withTimePeriod(DateInterval timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * <p>
     * Sets the AWS cost granularity to <code>MONTHLY</code> or <code>DAILY</code>. If <code>Granularity</code> isn't
     * set, the response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetCostAndUsageRequest</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @param granularity
     *        Sets the AWS cost granularity to <code>MONTHLY</code> or <code>DAILY</code>. If <code>Granularity</code>
     *        isn't set, the response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code>
     *        or <code>DAILY</code>. </p>
     *        <p>
     *        The <code>GetCostAndUsageRequest</code> operation supports only <code>DAILY</code> and
     *        <code>MONTHLY</code> granularities.
     * @see Granularity
     */

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    /**
     * <p>
     * Sets the AWS cost granularity to <code>MONTHLY</code> or <code>DAILY</code>. If <code>Granularity</code> isn't
     * set, the response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetCostAndUsageRequest</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @return Sets the AWS cost granularity to <code>MONTHLY</code> or <code>DAILY</code>. If <code>Granularity</code>
     *         isn't set, the response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code>
     *         or <code>DAILY</code>. </p>
     *         <p>
     *         The <code>GetCostAndUsageRequest</code> operation supports only <code>DAILY</code> and
     *         <code>MONTHLY</code> granularities.
     * @see Granularity
     */

    public String getGranularity() {
        return this.granularity;
    }

    /**
     * <p>
     * Sets the AWS cost granularity to <code>MONTHLY</code> or <code>DAILY</code>. If <code>Granularity</code> isn't
     * set, the response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetCostAndUsageRequest</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @param granularity
     *        Sets the AWS cost granularity to <code>MONTHLY</code> or <code>DAILY</code>. If <code>Granularity</code>
     *        isn't set, the response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code>
     *        or <code>DAILY</code>. </p>
     *        <p>
     *        The <code>GetCostAndUsageRequest</code> operation supports only <code>DAILY</code> and
     *        <code>MONTHLY</code> granularities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Granularity
     */

    public GetCostAndUsageRequest withGranularity(String granularity) {
        setGranularity(granularity);
        return this;
    }

    /**
     * <p>
     * Sets the AWS cost granularity to <code>MONTHLY</code> or <code>DAILY</code>. If <code>Granularity</code> isn't
     * set, the response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetCostAndUsageRequest</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @param granularity
     *        Sets the AWS cost granularity to <code>MONTHLY</code> or <code>DAILY</code>. If <code>Granularity</code>
     *        isn't set, the response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code>
     *        or <code>DAILY</code>. </p>
     *        <p>
     *        The <code>GetCostAndUsageRequest</code> operation supports only <code>DAILY</code> and
     *        <code>MONTHLY</code> granularities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Granularity
     */

    public GetCostAndUsageRequest withGranularity(Granularity granularity) {
        this.granularity = granularity.toString();
        return this;
    }

    /**
     * <p>
     * Filters AWS costs by different dimensions. For example, you can specify <code>SERVICE</code> and
     * <code>LINKED_ACCOUNT</code> and get the costs that are associated with that account's usage of that service. You
     * can nest <code>Expression</code> objects to define any combination of dimension filters. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>.
     * </p>
     * 
     * @param filter
     *        Filters AWS costs by different dimensions. For example, you can specify <code>SERVICE</code> and
     *        <code>LINKED_ACCOUNT</code> and get the costs that are associated with that account's usage of that
     *        service. You can nest <code>Expression</code> objects to define any combination of dimension filters. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *        >Expression</a>.
     */

    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filters AWS costs by different dimensions. For example, you can specify <code>SERVICE</code> and
     * <code>LINKED_ACCOUNT</code> and get the costs that are associated with that account's usage of that service. You
     * can nest <code>Expression</code> objects to define any combination of dimension filters. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>.
     * </p>
     * 
     * @return Filters AWS costs by different dimensions. For example, you can specify <code>SERVICE</code> and
     *         <code>LINKED_ACCOUNT</code> and get the costs that are associated with that account's usage of that
     *         service. You can nest <code>Expression</code> objects to define any combination of dimension filters. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *         >Expression</a>.
     */

    public Expression getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Filters AWS costs by different dimensions. For example, you can specify <code>SERVICE</code> and
     * <code>LINKED_ACCOUNT</code> and get the costs that are associated with that account's usage of that service. You
     * can nest <code>Expression</code> objects to define any combination of dimension filters. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>.
     * </p>
     * 
     * @param filter
     *        Filters AWS costs by different dimensions. For example, you can specify <code>SERVICE</code> and
     *        <code>LINKED_ACCOUNT</code> and get the costs that are associated with that account's usage of that
     *        service. You can nest <code>Expression</code> objects to define any combination of dimension filters. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *        >Expression</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostAndUsageRequest withFilter(Expression filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Which metrics are returned in the query. For more information about blended and unblended rates, see <a
     * href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does the "blended"
     * annotation appear on some line items in my bill?</a>.
     * </p>
     * <p>
     * Valid values are <code>AmortizedCost</code>, <code>BlendedCost</code>, <code>NetAmortizedCost</code>,
     * <code>NetUnblendedCost</code>, <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>, and
     * <code>UsageQuantity</code>.
     * </p>
     * <note>
     * <p>
     * If you return the <code>UsageQuantity</code> metric, the service aggregates all usage numbers without taking into
     * account the units. For example, if you aggregate <code>usageQuantity</code> across all of Amazon EC2, the results
     * aren't meaningful because Amazon EC2 compute hours and data transfer are measured in different units (for
     * example, hours vs. GB). To get more meaningful <code>UsageQuantity</code> metrics, filter by
     * <code>UsageType</code> or <code>UsageTypeGroups</code>.
     * </p>
     * </note>
     * <p>
     * <code>Metrics</code> is required for <code>GetCostAndUsage</code> requests.
     * </p>
     * 
     * @return Which metrics are returned in the query. For more information about blended and unblended rates, see <a
     *         href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does the "blended"
     *         annotation appear on some line items in my bill?</a>. </p>
     *         <p>
     *         Valid values are <code>AmortizedCost</code>, <code>BlendedCost</code>, <code>NetAmortizedCost</code>,
     *         <code>NetUnblendedCost</code>, <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>, and
     *         <code>UsageQuantity</code>.
     *         </p>
     *         <note>
     *         <p>
     *         If you return the <code>UsageQuantity</code> metric, the service aggregates all usage numbers without
     *         taking into account the units. For example, if you aggregate <code>usageQuantity</code> across all of
     *         Amazon EC2, the results aren't meaningful because Amazon EC2 compute hours and data transfer are measured
     *         in different units (for example, hours vs. GB). To get more meaningful <code>UsageQuantity</code>
     *         metrics, filter by <code>UsageType</code> or <code>UsageTypeGroups</code>.
     *         </p>
     *         </note>
     *         <p>
     *         <code>Metrics</code> is required for <code>GetCostAndUsage</code> requests.
     */

    public java.util.List<String> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * Which metrics are returned in the query. For more information about blended and unblended rates, see <a
     * href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does the "blended"
     * annotation appear on some line items in my bill?</a>.
     * </p>
     * <p>
     * Valid values are <code>AmortizedCost</code>, <code>BlendedCost</code>, <code>NetAmortizedCost</code>,
     * <code>NetUnblendedCost</code>, <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>, and
     * <code>UsageQuantity</code>.
     * </p>
     * <note>
     * <p>
     * If you return the <code>UsageQuantity</code> metric, the service aggregates all usage numbers without taking into
     * account the units. For example, if you aggregate <code>usageQuantity</code> across all of Amazon EC2, the results
     * aren't meaningful because Amazon EC2 compute hours and data transfer are measured in different units (for
     * example, hours vs. GB). To get more meaningful <code>UsageQuantity</code> metrics, filter by
     * <code>UsageType</code> or <code>UsageTypeGroups</code>.
     * </p>
     * </note>
     * <p>
     * <code>Metrics</code> is required for <code>GetCostAndUsage</code> requests.
     * </p>
     * 
     * @param metrics
     *        Which metrics are returned in the query. For more information about blended and unblended rates, see <a
     *        href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does the "blended"
     *        annotation appear on some line items in my bill?</a>. </p>
     *        <p>
     *        Valid values are <code>AmortizedCost</code>, <code>BlendedCost</code>, <code>NetAmortizedCost</code>,
     *        <code>NetUnblendedCost</code>, <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>, and
     *        <code>UsageQuantity</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If you return the <code>UsageQuantity</code> metric, the service aggregates all usage numbers without
     *        taking into account the units. For example, if you aggregate <code>usageQuantity</code> across all of
     *        Amazon EC2, the results aren't meaningful because Amazon EC2 compute hours and data transfer are measured
     *        in different units (for example, hours vs. GB). To get more meaningful <code>UsageQuantity</code> metrics,
     *        filter by <code>UsageType</code> or <code>UsageTypeGroups</code>.
     *        </p>
     *        </note>
     *        <p>
     *        <code>Metrics</code> is required for <code>GetCostAndUsage</code> requests.
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
     * Which metrics are returned in the query. For more information about blended and unblended rates, see <a
     * href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does the "blended"
     * annotation appear on some line items in my bill?</a>.
     * </p>
     * <p>
     * Valid values are <code>AmortizedCost</code>, <code>BlendedCost</code>, <code>NetAmortizedCost</code>,
     * <code>NetUnblendedCost</code>, <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>, and
     * <code>UsageQuantity</code>.
     * </p>
     * <note>
     * <p>
     * If you return the <code>UsageQuantity</code> metric, the service aggregates all usage numbers without taking into
     * account the units. For example, if you aggregate <code>usageQuantity</code> across all of Amazon EC2, the results
     * aren't meaningful because Amazon EC2 compute hours and data transfer are measured in different units (for
     * example, hours vs. GB). To get more meaningful <code>UsageQuantity</code> metrics, filter by
     * <code>UsageType</code> or <code>UsageTypeGroups</code>.
     * </p>
     * </note>
     * <p>
     * <code>Metrics</code> is required for <code>GetCostAndUsage</code> requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        Which metrics are returned in the query. For more information about blended and unblended rates, see <a
     *        href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does the "blended"
     *        annotation appear on some line items in my bill?</a>. </p>
     *        <p>
     *        Valid values are <code>AmortizedCost</code>, <code>BlendedCost</code>, <code>NetAmortizedCost</code>,
     *        <code>NetUnblendedCost</code>, <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>, and
     *        <code>UsageQuantity</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If you return the <code>UsageQuantity</code> metric, the service aggregates all usage numbers without
     *        taking into account the units. For example, if you aggregate <code>usageQuantity</code> across all of
     *        Amazon EC2, the results aren't meaningful because Amazon EC2 compute hours and data transfer are measured
     *        in different units (for example, hours vs. GB). To get more meaningful <code>UsageQuantity</code> metrics,
     *        filter by <code>UsageType</code> or <code>UsageTypeGroups</code>.
     *        </p>
     *        </note>
     *        <p>
     *        <code>Metrics</code> is required for <code>GetCostAndUsage</code> requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostAndUsageRequest withMetrics(String... metrics) {
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
     * Which metrics are returned in the query. For more information about blended and unblended rates, see <a
     * href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does the "blended"
     * annotation appear on some line items in my bill?</a>.
     * </p>
     * <p>
     * Valid values are <code>AmortizedCost</code>, <code>BlendedCost</code>, <code>NetAmortizedCost</code>,
     * <code>NetUnblendedCost</code>, <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>, and
     * <code>UsageQuantity</code>.
     * </p>
     * <note>
     * <p>
     * If you return the <code>UsageQuantity</code> metric, the service aggregates all usage numbers without taking into
     * account the units. For example, if you aggregate <code>usageQuantity</code> across all of Amazon EC2, the results
     * aren't meaningful because Amazon EC2 compute hours and data transfer are measured in different units (for
     * example, hours vs. GB). To get more meaningful <code>UsageQuantity</code> metrics, filter by
     * <code>UsageType</code> or <code>UsageTypeGroups</code>.
     * </p>
     * </note>
     * <p>
     * <code>Metrics</code> is required for <code>GetCostAndUsage</code> requests.
     * </p>
     * 
     * @param metrics
     *        Which metrics are returned in the query. For more information about blended and unblended rates, see <a
     *        href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does the "blended"
     *        annotation appear on some line items in my bill?</a>. </p>
     *        <p>
     *        Valid values are <code>AmortizedCost</code>, <code>BlendedCost</code>, <code>NetAmortizedCost</code>,
     *        <code>NetUnblendedCost</code>, <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>, and
     *        <code>UsageQuantity</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If you return the <code>UsageQuantity</code> metric, the service aggregates all usage numbers without
     *        taking into account the units. For example, if you aggregate <code>usageQuantity</code> across all of
     *        Amazon EC2, the results aren't meaningful because Amazon EC2 compute hours and data transfer are measured
     *        in different units (for example, hours vs. GB). To get more meaningful <code>UsageQuantity</code> metrics,
     *        filter by <code>UsageType</code> or <code>UsageTypeGroups</code>.
     *        </p>
     *        </note>
     *        <p>
     *        <code>Metrics</code> is required for <code>GetCostAndUsage</code> requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostAndUsageRequest withMetrics(java.util.Collection<String> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * You can group AWS costs using up to two different groups, either dimensions, tag keys, or both.
     * </p>
     * <p>
     * When you group by tag key, you get all tag values, including empty strings.
     * </p>
     * <p>
     * Valid values are <code>AZ</code>, <code>INSTANCE_TYPE</code>, <code>LEGAL_ENTITY_NAME</code>,
     * <code>LINKED_ACCOUNT</code>, <code>OPERATION</code>, <code>PLATFORM</code>, <code>PURCHASE_TYPE</code>,
     * <code>SERVICE</code>, <code>TAGS</code>, <code>TENANCY</code>, and <code>USAGE_TYPE</code>.
     * </p>
     * 
     * @return You can group AWS costs using up to two different groups, either dimensions, tag keys, or both.</p>
     *         <p>
     *         When you group by tag key, you get all tag values, including empty strings.
     *         </p>
     *         <p>
     *         Valid values are <code>AZ</code>, <code>INSTANCE_TYPE</code>, <code>LEGAL_ENTITY_NAME</code>,
     *         <code>LINKED_ACCOUNT</code>, <code>OPERATION</code>, <code>PLATFORM</code>, <code>PURCHASE_TYPE</code>,
     *         <code>SERVICE</code>, <code>TAGS</code>, <code>TENANCY</code>, and <code>USAGE_TYPE</code>.
     */

    public java.util.List<GroupDefinition> getGroupBy() {
        return groupBy;
    }

    /**
     * <p>
     * You can group AWS costs using up to two different groups, either dimensions, tag keys, or both.
     * </p>
     * <p>
     * When you group by tag key, you get all tag values, including empty strings.
     * </p>
     * <p>
     * Valid values are <code>AZ</code>, <code>INSTANCE_TYPE</code>, <code>LEGAL_ENTITY_NAME</code>,
     * <code>LINKED_ACCOUNT</code>, <code>OPERATION</code>, <code>PLATFORM</code>, <code>PURCHASE_TYPE</code>,
     * <code>SERVICE</code>, <code>TAGS</code>, <code>TENANCY</code>, and <code>USAGE_TYPE</code>.
     * </p>
     * 
     * @param groupBy
     *        You can group AWS costs using up to two different groups, either dimensions, tag keys, or both.</p>
     *        <p>
     *        When you group by tag key, you get all tag values, including empty strings.
     *        </p>
     *        <p>
     *        Valid values are <code>AZ</code>, <code>INSTANCE_TYPE</code>, <code>LEGAL_ENTITY_NAME</code>,
     *        <code>LINKED_ACCOUNT</code>, <code>OPERATION</code>, <code>PLATFORM</code>, <code>PURCHASE_TYPE</code>,
     *        <code>SERVICE</code>, <code>TAGS</code>, <code>TENANCY</code>, and <code>USAGE_TYPE</code>.
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
     * You can group AWS costs using up to two different groups, either dimensions, tag keys, or both.
     * </p>
     * <p>
     * When you group by tag key, you get all tag values, including empty strings.
     * </p>
     * <p>
     * Valid values are <code>AZ</code>, <code>INSTANCE_TYPE</code>, <code>LEGAL_ENTITY_NAME</code>,
     * <code>LINKED_ACCOUNT</code>, <code>OPERATION</code>, <code>PLATFORM</code>, <code>PURCHASE_TYPE</code>,
     * <code>SERVICE</code>, <code>TAGS</code>, <code>TENANCY</code>, and <code>USAGE_TYPE</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupBy(java.util.Collection)} or {@link #withGroupBy(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param groupBy
     *        You can group AWS costs using up to two different groups, either dimensions, tag keys, or both.</p>
     *        <p>
     *        When you group by tag key, you get all tag values, including empty strings.
     *        </p>
     *        <p>
     *        Valid values are <code>AZ</code>, <code>INSTANCE_TYPE</code>, <code>LEGAL_ENTITY_NAME</code>,
     *        <code>LINKED_ACCOUNT</code>, <code>OPERATION</code>, <code>PLATFORM</code>, <code>PURCHASE_TYPE</code>,
     *        <code>SERVICE</code>, <code>TAGS</code>, <code>TENANCY</code>, and <code>USAGE_TYPE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostAndUsageRequest withGroupBy(GroupDefinition... groupBy) {
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
     * You can group AWS costs using up to two different groups, either dimensions, tag keys, or both.
     * </p>
     * <p>
     * When you group by tag key, you get all tag values, including empty strings.
     * </p>
     * <p>
     * Valid values are <code>AZ</code>, <code>INSTANCE_TYPE</code>, <code>LEGAL_ENTITY_NAME</code>,
     * <code>LINKED_ACCOUNT</code>, <code>OPERATION</code>, <code>PLATFORM</code>, <code>PURCHASE_TYPE</code>,
     * <code>SERVICE</code>, <code>TAGS</code>, <code>TENANCY</code>, and <code>USAGE_TYPE</code>.
     * </p>
     * 
     * @param groupBy
     *        You can group AWS costs using up to two different groups, either dimensions, tag keys, or both.</p>
     *        <p>
     *        When you group by tag key, you get all tag values, including empty strings.
     *        </p>
     *        <p>
     *        Valid values are <code>AZ</code>, <code>INSTANCE_TYPE</code>, <code>LEGAL_ENTITY_NAME</code>,
     *        <code>LINKED_ACCOUNT</code>, <code>OPERATION</code>, <code>PLATFORM</code>, <code>PURCHASE_TYPE</code>,
     *        <code>SERVICE</code>, <code>TAGS</code>, <code>TENANCY</code>, and <code>USAGE_TYPE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostAndUsageRequest withGroupBy(java.util.Collection<GroupDefinition> groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *        call has more results than the maximum page size.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @return The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *         call has more results than the maximum page size.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *        call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostAndUsageRequest withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getGranularity() != null)
            sb.append("Granularity: ").append(getGranularity()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCostAndUsageRequest == false)
            return false;
        GetCostAndUsageRequest other = (GetCostAndUsageRequest) obj;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
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
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getGranularity() == null) ? 0 : getGranularity().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCostAndUsageRequest clone() {
        return (GetCostAndUsageRequest) super.clone();
    }

}
