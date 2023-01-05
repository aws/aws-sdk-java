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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetMetricRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the fleet metric to create.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The search query string.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * The type of the aggregation query.
     * </p>
     */
    private AggregationType aggregationType;
    /**
     * <p>
     * The time in seconds between fleet metric emissions. Range [60(1 min), 86400(1 day)] and must be multiple of 60.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The field to aggregate.
     * </p>
     */
    private String aggregationField;
    /**
     * <p>
     * The fleet metric description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The query version.
     * </p>
     */
    private String queryVersion;
    /**
     * <p>
     * The name of the index to search.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * Used to support unit transformation such as milliseconds to seconds. The unit must be supported by <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     * >CW metric</a>. Default to null.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * Metadata, which can be used to manage the fleet metric.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the fleet metric to create.
     * </p>
     * 
     * @param metricName
     *        The name of the fleet metric to create.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the fleet metric to create.
     * </p>
     * 
     * @return The name of the fleet metric to create.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the fleet metric to create.
     * </p>
     * 
     * @param metricName
     *        The name of the fleet metric to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetMetricRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The search query string.
     * </p>
     * 
     * @param queryString
     *        The search query string.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The search query string.
     * </p>
     * 
     * @return The search query string.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The search query string.
     * </p>
     * 
     * @param queryString
     *        The search query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetMetricRequest withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The type of the aggregation query.
     * </p>
     * 
     * @param aggregationType
     *        The type of the aggregation query.
     */

    public void setAggregationType(AggregationType aggregationType) {
        this.aggregationType = aggregationType;
    }

    /**
     * <p>
     * The type of the aggregation query.
     * </p>
     * 
     * @return The type of the aggregation query.
     */

    public AggregationType getAggregationType() {
        return this.aggregationType;
    }

    /**
     * <p>
     * The type of the aggregation query.
     * </p>
     * 
     * @param aggregationType
     *        The type of the aggregation query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetMetricRequest withAggregationType(AggregationType aggregationType) {
        setAggregationType(aggregationType);
        return this;
    }

    /**
     * <p>
     * The time in seconds between fleet metric emissions. Range [60(1 min), 86400(1 day)] and must be multiple of 60.
     * </p>
     * 
     * @param period
     *        The time in seconds between fleet metric emissions. Range [60(1 min), 86400(1 day)] and must be multiple
     *        of 60.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The time in seconds between fleet metric emissions. Range [60(1 min), 86400(1 day)] and must be multiple of 60.
     * </p>
     * 
     * @return The time in seconds between fleet metric emissions. Range [60(1 min), 86400(1 day)] and must be multiple
     *         of 60.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The time in seconds between fleet metric emissions. Range [60(1 min), 86400(1 day)] and must be multiple of 60.
     * </p>
     * 
     * @param period
     *        The time in seconds between fleet metric emissions. Range [60(1 min), 86400(1 day)] and must be multiple
     *        of 60.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetMetricRequest withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The field to aggregate.
     * </p>
     * 
     * @param aggregationField
     *        The field to aggregate.
     */

    public void setAggregationField(String aggregationField) {
        this.aggregationField = aggregationField;
    }

    /**
     * <p>
     * The field to aggregate.
     * </p>
     * 
     * @return The field to aggregate.
     */

    public String getAggregationField() {
        return this.aggregationField;
    }

    /**
     * <p>
     * The field to aggregate.
     * </p>
     * 
     * @param aggregationField
     *        The field to aggregate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetMetricRequest withAggregationField(String aggregationField) {
        setAggregationField(aggregationField);
        return this;
    }

    /**
     * <p>
     * The fleet metric description.
     * </p>
     * 
     * @param description
     *        The fleet metric description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The fleet metric description.
     * </p>
     * 
     * @return The fleet metric description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The fleet metric description.
     * </p>
     * 
     * @param description
     *        The fleet metric description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetMetricRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The query version.
     * </p>
     * 
     * @param queryVersion
     *        The query version.
     */

    public void setQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
    }

    /**
     * <p>
     * The query version.
     * </p>
     * 
     * @return The query version.
     */

    public String getQueryVersion() {
        return this.queryVersion;
    }

    /**
     * <p>
     * The query version.
     * </p>
     * 
     * @param queryVersion
     *        The query version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetMetricRequest withQueryVersion(String queryVersion) {
        setQueryVersion(queryVersion);
        return this;
    }

    /**
     * <p>
     * The name of the index to search.
     * </p>
     * 
     * @param indexName
     *        The name of the index to search.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the index to search.
     * </p>
     * 
     * @return The name of the index to search.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the index to search.
     * </p>
     * 
     * @param indexName
     *        The name of the index to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetMetricRequest withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * Used to support unit transformation such as milliseconds to seconds. The unit must be supported by <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     * >CW metric</a>. Default to null.
     * </p>
     * 
     * @param unit
     *        Used to support unit transformation such as milliseconds to seconds. The unit must be supported by <a
     *        href=
     *        "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     *        >CW metric</a>. Default to null.
     * @see FleetMetricUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * Used to support unit transformation such as milliseconds to seconds. The unit must be supported by <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     * >CW metric</a>. Default to null.
     * </p>
     * 
     * @return Used to support unit transformation such as milliseconds to seconds. The unit must be supported by <a
     *         href=
     *         "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     *         >CW metric</a>. Default to null.
     * @see FleetMetricUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * Used to support unit transformation such as milliseconds to seconds. The unit must be supported by <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     * >CW metric</a>. Default to null.
     * </p>
     * 
     * @param unit
     *        Used to support unit transformation such as milliseconds to seconds. The unit must be supported by <a
     *        href=
     *        "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     *        >CW metric</a>. Default to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetMetricUnit
     */

    public CreateFleetMetricRequest withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * Used to support unit transformation such as milliseconds to seconds. The unit must be supported by <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     * >CW metric</a>. Default to null.
     * </p>
     * 
     * @param unit
     *        Used to support unit transformation such as milliseconds to seconds. The unit must be supported by <a
     *        href=
     *        "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     *        >CW metric</a>. Default to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetMetricUnit
     */

    public CreateFleetMetricRequest withUnit(FleetMetricUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * Metadata, which can be used to manage the fleet metric.
     * </p>
     * 
     * @return Metadata, which can be used to manage the fleet metric.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata, which can be used to manage the fleet metric.
     * </p>
     * 
     * @param tags
     *        Metadata, which can be used to manage the fleet metric.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata, which can be used to manage the fleet metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata, which can be used to manage the fleet metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetMetricRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata, which can be used to manage the fleet metric.
     * </p>
     * 
     * @param tags
     *        Metadata, which can be used to manage the fleet metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetMetricRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getAggregationType() != null)
            sb.append("AggregationType: ").append(getAggregationType()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getAggregationField() != null)
            sb.append("AggregationField: ").append(getAggregationField()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getQueryVersion() != null)
            sb.append("QueryVersion: ").append(getQueryVersion()).append(",");
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFleetMetricRequest == false)
            return false;
        CreateFleetMetricRequest other = (CreateFleetMetricRequest) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getAggregationType() == null ^ this.getAggregationType() == null)
            return false;
        if (other.getAggregationType() != null && other.getAggregationType().equals(this.getAggregationType()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getAggregationField() == null ^ this.getAggregationField() == null)
            return false;
        if (other.getAggregationField() != null && other.getAggregationField().equals(this.getAggregationField()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getQueryVersion() == null ^ this.getQueryVersion() == null)
            return false;
        if (other.getQueryVersion() != null && other.getQueryVersion().equals(this.getQueryVersion()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getAggregationType() == null) ? 0 : getAggregationType().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getAggregationField() == null) ? 0 : getAggregationField().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getQueryVersion() == null) ? 0 : getQueryVersion().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetMetricRequest clone() {
        return (CreateFleetMetricRequest) super.clone();
    }

}
