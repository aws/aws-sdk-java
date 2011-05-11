/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudwatch.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudwatch.AmazonCloudWatch#listMetrics(ListMetricsRequest) ListMetrics operation}.
 * <p>
 * Returns a list of valid metrics stored for the AWS account owner.
 * Returned metrics can be used with <code>GetMetricStatistics</code> to
 * obtain statistical data for a given metric.
 * </p>
 * <p>
 * <b>NOTE:</b> Up to 500 results are returned for any one call. To
 * retrieve further results, use returned NextToken values with
 * subsequent ListMetrics operations.
 * </p>
 * <p>
 * <b>NOTE:</b> If you create a metric with the PutMetricData action,
 * allow up to fifteen minutes for the metric to appear in calls to the
 * ListMetrics action.
 * </p>
 *
 * @see com.amazonaws.services.cloudwatch.AmazonCloudWatch#listMetrics(ListMetricsRequest)
 */
public class ListMetricsRequest extends AmazonWebServiceRequest {

    /**
     * The namespace to filter against.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     */
    private String namespace;

    /**
     * The name of the metric to filter against.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String metricName;

    /**
     * A list of dimensions to filter against.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private java.util.List<DimensionFilter> dimensions;

    /**
     * The token returned by a previous call to indicate that there is more
     * data available.
     */
    private String nextToken;

    /**
     * The namespace to filter against.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @return The namespace to filter against.
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * The namespace to filter against.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The namespace to filter against.
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    /**
     * The namespace to filter against.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The namespace to filter against.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListMetricsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    
    
    /**
     * The name of the metric to filter against.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The name of the metric to filter against.
     */
    public String getMetricName() {
        return metricName;
    }
    
    /**
     * The name of the metric to filter against.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName The name of the metric to filter against.
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }
    
    /**
     * The name of the metric to filter against.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName The name of the metric to filter against.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListMetricsRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    
    
    /**
     * A list of dimensions to filter against.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return A list of dimensions to filter against.
     */
    public java.util.List<DimensionFilter> getDimensions() {
        if (dimensions == null) {
            dimensions = new java.util.ArrayList<DimensionFilter>();
        }
        return dimensions;
    }
    
    /**
     * A list of dimensions to filter against.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions A list of dimensions to filter against.
     */
    public void setDimensions(java.util.Collection<DimensionFilter> dimensions) {
        java.util.List<DimensionFilter> dimensionsCopy = new java.util.ArrayList<DimensionFilter>();
        if (dimensions != null) {
            dimensionsCopy.addAll(dimensions);
        }
        this.dimensions = dimensionsCopy;
    }
    
    /**
     * A list of dimensions to filter against.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions A list of dimensions to filter against.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListMetricsRequest withDimensions(DimensionFilter... dimensions) {
        for (DimensionFilter value : dimensions) {
            getDimensions().add(value);
        }
        return this;
    }
    
    /**
     * A list of dimensions to filter against.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions A list of dimensions to filter against.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListMetricsRequest withDimensions(java.util.Collection<DimensionFilter> dimensions) {
        java.util.List<DimensionFilter> dimensionsCopy = new java.util.ArrayList<DimensionFilter>();
        if (dimensions != null) {
            dimensionsCopy.addAll(dimensions);
        }
        this.dimensions = dimensionsCopy;

        return this;
    }
    
    /**
     * The token returned by a previous call to indicate that there is more
     * data available.
     *
     * @return The token returned by a previous call to indicate that there is more
     *         data available.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token returned by a previous call to indicate that there is more
     * data available.
     *
     * @param nextToken The token returned by a previous call to indicate that there is more
     *         data available.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token returned by a previous call to indicate that there is more
     * data available.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token returned by a previous call to indicate that there is more
     *         data available.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListMetricsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("Namespace: " + namespace + ", ");
        sb.append("MetricName: " + metricName + ", ");
        sb.append("Dimensions: " + dimensions + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    