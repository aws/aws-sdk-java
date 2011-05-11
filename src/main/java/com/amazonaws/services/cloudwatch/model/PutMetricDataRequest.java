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
 * Container for the parameters to the {@link com.amazonaws.services.cloudwatch.AmazonCloudWatch#putMetricData(PutMetricDataRequest) PutMetricData operation}.
 * <p>
 * Publishes metric data points to Amazon CloudWatch. Amazon Cloudwatch
 * associates the data points with the specified metric. If the specified
 * metric does not exist, Amazon CloudWatch creates the metric.
 * </p>
 * <p>
 * <b>NOTE:</b> If you create a metric with the PutMetricData action,
 * allow up to fifteen minutes for the metric to appear in calls to the
 * ListMetrics action.
 * </p>
 * <p>
 * The size of a PutMetricData request is limited to 8 KB for HTTP GET
 * requests and 40 KB for HTTP POST requests.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> Although the Value parameter accepts numbers of type
 * Double, Amazon CloudWatch truncates values with very large exponents.
 * Values with base-10 exponents greater than 126 (1 x 10^126) are
 * truncated. Likewise, values with base-10 exponents less than -130 (1 x
 * 10^-130) are also truncated.
 * </p>
 *
 * @see com.amazonaws.services.cloudwatch.AmazonCloudWatch#putMetricData(PutMetricDataRequest)
 */
public class PutMetricDataRequest extends AmazonWebServiceRequest {

    /**
     * The namespace for the metric data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     */
    private String namespace;

    /**
     * A list of data describing the metric.
     */
    private java.util.List<MetricDatum> metricData;

    /**
     * The namespace for the metric data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @return The namespace for the metric data.
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * The namespace for the metric data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The namespace for the metric data.
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    /**
     * The namespace for the metric data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The namespace for the metric data.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricDataRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    
    
    /**
     * A list of data describing the metric.
     *
     * @return A list of data describing the metric.
     */
    public java.util.List<MetricDatum> getMetricData() {
        if (metricData == null) {
            metricData = new java.util.ArrayList<MetricDatum>();
        }
        return metricData;
    }
    
    /**
     * A list of data describing the metric.
     *
     * @param metricData A list of data describing the metric.
     */
    public void setMetricData(java.util.Collection<MetricDatum> metricData) {
        java.util.List<MetricDatum> metricDataCopy = new java.util.ArrayList<MetricDatum>();
        if (metricData != null) {
            metricDataCopy.addAll(metricData);
        }
        this.metricData = metricDataCopy;
    }
    
    /**
     * A list of data describing the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricData A list of data describing the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricDataRequest withMetricData(MetricDatum... metricData) {
        for (MetricDatum value : metricData) {
            getMetricData().add(value);
        }
        return this;
    }
    
    /**
     * A list of data describing the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricData A list of data describing the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricDataRequest withMetricData(java.util.Collection<MetricDatum> metricData) {
        java.util.List<MetricDatum> metricDataCopy = new java.util.ArrayList<MetricDatum>();
        if (metricData != null) {
            metricDataCopy.addAll(metricData);
        }
        this.metricData = metricDataCopy;

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
        sb.append("MetricData: " + metricData + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    