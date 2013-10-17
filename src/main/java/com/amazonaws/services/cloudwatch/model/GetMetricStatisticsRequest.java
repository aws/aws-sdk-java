/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudwatch.AmazonCloudWatch#getMetricStatistics(GetMetricStatisticsRequest) GetMetricStatistics operation}.
 * <p>
 * Gets statistics for the specified metric.
 * </p>
 * <p>
 * <b>NOTE:</b> The maximum number of data points returned from a single GetMetricStatistics request is 1,440. If a request is made that generates more
 * than 1,440 data points, Amazon CloudWatch returns an error. In such a case, alter the request by narrowing the specified time range or increasing the
 * specified period. Alternatively, make multiple requests across adjacent time ranges.
 * </p>
 * <p>
 * Amazon CloudWatch aggregates data points based on the length of the <code>period</code> that you specify. For example, if you request statistics with
 * a one-minute granularity, Amazon CloudWatch aggregates data points with time stamps that fall within the same one-minute period. In such a case, the
 * data points queried can greatly outnumber the data points returned.
 * </p>
 * <p>
 * <b>NOTE:</b> The maximum number of data points that can be queried is 50,850; whereas the maximum number of data points returned is 1,440.
 * </p>
 * <p>
 * The following examples show various statistics allowed by the data point query maximum of 50,850 when you call <code>GetMetricStatistics</code> on
 * Amazon EC2 instances with detailed (one-minute) monitoring enabled:
 * </p>
 * 
 * <ul>
 * <li>Statistics for up to 400 instances for a span of one hour</li>
 * <li>Statistics for up to 35 instances over a span of 24 hours</li>
 * <li>Statistics for up to 2 instances over a span of 2 weeks</li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.cloudwatch.AmazonCloudWatch#getMetricStatistics(GetMetricStatisticsRequest)
 */
public class GetMetricStatisticsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The namespace of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     */
    private String namespace;

    /**
     * The name of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String metricName;

    /**
     * A list of dimensions describing qualities of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Dimension> dimensions;

    /**
     * The time stamp to use for determining the first datapoint to return.
     * The value specified is inclusive; results include datapoints with the
     * time stamp specified. <note> The specified start time is rounded down
     * to the nearest value. Datapoints are returned for start times up to
     * two weeks in the past. Specified start times that are more than two
     * weeks in the past will not return datapoints for metrics that are
     * older than two weeks. </note>
     */
    private java.util.Date startTime;

    /**
     * The time stamp to use for determining the last datapoint to return.
     * The value specified is exclusive; results will include datapoints up
     * to the time stamp specified.
     */
    private java.util.Date endTime;

    /**
     * The granularity, in seconds, of the returned datapoints.
     * <code>Period</code> must be at least 60 seconds and must be a multiple
     * of 60. The default value is 60.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     */
    private Integer period;

    /**
     * The metric statistics to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> statistics;

    /**
     * The unit for the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     */
    private String unit;

    /**
     * The namespace of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @return The namespace of the metric.
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * The namespace of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The namespace of the metric.
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    /**
     * The namespace of the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The namespace of the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetMetricStatisticsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * The name of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The name of the metric.
     */
    public String getMetricName() {
        return metricName;
    }
    
    /**
     * The name of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName The name of the metric.
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }
    
    /**
     * The name of the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName The name of the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetMetricStatisticsRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * A list of dimensions describing qualities of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return A list of dimensions describing qualities of the metric.
     */
    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
              dimensions = new com.amazonaws.internal.ListWithAutoConstructFlag<Dimension>();
              dimensions.setAutoConstruct(true);
        }
        return dimensions;
    }
    
    /**
     * A list of dimensions describing qualities of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions A list of dimensions describing qualities of the metric.
     */
    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Dimension> dimensionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Dimension>(dimensions.size());
        dimensionsCopy.addAll(dimensions);
        this.dimensions = dimensionsCopy;
    }
    
    /**
     * A list of dimensions describing qualities of the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions A list of dimensions describing qualities of the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetMetricStatisticsRequest withDimensions(Dimension... dimensions) {
        if (getDimensions() == null) setDimensions(new java.util.ArrayList<Dimension>(dimensions.length));
        for (Dimension value : dimensions) {
            getDimensions().add(value);
        }
        return this;
    }
    
    /**
     * A list of dimensions describing qualities of the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions A list of dimensions describing qualities of the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetMetricStatisticsRequest withDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Dimension> dimensionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Dimension>(dimensions.size());
            dimensionsCopy.addAll(dimensions);
            this.dimensions = dimensionsCopy;
        }

        return this;
    }

    /**
     * The time stamp to use for determining the first datapoint to return.
     * The value specified is inclusive; results include datapoints with the
     * time stamp specified. <note> The specified start time is rounded down
     * to the nearest value. Datapoints are returned for start times up to
     * two weeks in the past. Specified start times that are more than two
     * weeks in the past will not return datapoints for metrics that are
     * older than two weeks. </note>
     *
     * @return The time stamp to use for determining the first datapoint to return.
     *         The value specified is inclusive; results include datapoints with the
     *         time stamp specified. <note> The specified start time is rounded down
     *         to the nearest value. Datapoints are returned for start times up to
     *         two weeks in the past. Specified start times that are more than two
     *         weeks in the past will not return datapoints for metrics that are
     *         older than two weeks. </note>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The time stamp to use for determining the first datapoint to return.
     * The value specified is inclusive; results include datapoints with the
     * time stamp specified. <note> The specified start time is rounded down
     * to the nearest value. Datapoints are returned for start times up to
     * two weeks in the past. Specified start times that are more than two
     * weeks in the past will not return datapoints for metrics that are
     * older than two weeks. </note>
     *
     * @param startTime The time stamp to use for determining the first datapoint to return.
     *         The value specified is inclusive; results include datapoints with the
     *         time stamp specified. <note> The specified start time is rounded down
     *         to the nearest value. Datapoints are returned for start times up to
     *         two weeks in the past. Specified start times that are more than two
     *         weeks in the past will not return datapoints for metrics that are
     *         older than two weeks. </note>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The time stamp to use for determining the first datapoint to return.
     * The value specified is inclusive; results include datapoints with the
     * time stamp specified. <note> The specified start time is rounded down
     * to the nearest value. Datapoints are returned for start times up to
     * two weeks in the past. Specified start times that are more than two
     * weeks in the past will not return datapoints for metrics that are
     * older than two weeks. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The time stamp to use for determining the first datapoint to return.
     *         The value specified is inclusive; results include datapoints with the
     *         time stamp specified. <note> The specified start time is rounded down
     *         to the nearest value. Datapoints are returned for start times up to
     *         two weeks in the past. Specified start times that are more than two
     *         weeks in the past will not return datapoints for metrics that are
     *         older than two weeks. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetMetricStatisticsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The time stamp to use for determining the last datapoint to return.
     * The value specified is exclusive; results will include datapoints up
     * to the time stamp specified.
     *
     * @return The time stamp to use for determining the last datapoint to return.
     *         The value specified is exclusive; results will include datapoints up
     *         to the time stamp specified.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * The time stamp to use for determining the last datapoint to return.
     * The value specified is exclusive; results will include datapoints up
     * to the time stamp specified.
     *
     * @param endTime The time stamp to use for determining the last datapoint to return.
     *         The value specified is exclusive; results will include datapoints up
     *         to the time stamp specified.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * The time stamp to use for determining the last datapoint to return.
     * The value specified is exclusive; results will include datapoints up
     * to the time stamp specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime The time stamp to use for determining the last datapoint to return.
     *         The value specified is exclusive; results will include datapoints up
     *         to the time stamp specified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetMetricStatisticsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * The granularity, in seconds, of the returned datapoints.
     * <code>Period</code> must be at least 60 seconds and must be a multiple
     * of 60. The default value is 60.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @return The granularity, in seconds, of the returned datapoints.
     *         <code>Period</code> must be at least 60 seconds and must be a multiple
     *         of 60. The default value is 60.
     */
    public Integer getPeriod() {
        return period;
    }
    
    /**
     * The granularity, in seconds, of the returned datapoints.
     * <code>Period</code> must be at least 60 seconds and must be a multiple
     * of 60. The default value is 60.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period The granularity, in seconds, of the returned datapoints.
     *         <code>Period</code> must be at least 60 seconds and must be a multiple
     *         of 60. The default value is 60.
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }
    
    /**
     * The granularity, in seconds, of the returned datapoints.
     * <code>Period</code> must be at least 60 seconds and must be a multiple
     * of 60. The default value is 60.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period The granularity, in seconds, of the returned datapoints.
     *         <code>Period</code> must be at least 60 seconds and must be a multiple
     *         of 60. The default value is 60.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetMetricStatisticsRequest withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * The metric statistics to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5<br/>
     *
     * @return The metric statistics to return.
     */
    public java.util.List<String> getStatistics() {
        if (statistics == null) {
              statistics = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              statistics.setAutoConstruct(true);
        }
        return statistics;
    }
    
    /**
     * The metric statistics to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5<br/>
     *
     * @param statistics The metric statistics to return.
     */
    public void setStatistics(java.util.Collection<String> statistics) {
        if (statistics == null) {
            this.statistics = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> statisticsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(statistics.size());
        statisticsCopy.addAll(statistics);
        this.statistics = statisticsCopy;
    }
    
    /**
     * The metric statistics to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5<br/>
     *
     * @param statistics The metric statistics to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetMetricStatisticsRequest withStatistics(String... statistics) {
        if (getStatistics() == null) setStatistics(new java.util.ArrayList<String>(statistics.length));
        for (String value : statistics) {
            getStatistics().add(value);
        }
        return this;
    }
    
    /**
     * The metric statistics to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5<br/>
     *
     * @param statistics The metric statistics to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetMetricStatisticsRequest withStatistics(java.util.Collection<String> statistics) {
        if (statistics == null) {
            this.statistics = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> statisticsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(statistics.size());
            statisticsCopy.addAll(statistics);
            this.statistics = statisticsCopy;
        }

        return this;
    }

    /**
     * The metric statistics to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5<br/>
     *
     * @param statistics The metric statistics to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetMetricStatisticsRequest withStatistics(Statistic... statistics) {
        java.util.ArrayList<String> statisticsCopy = new java.util.ArrayList<String>(statistics.length);
        for (Statistic member : statistics) {
            statisticsCopy.add(member.toString());
        }
        if (getStatistics() == null) {
            setStatistics(statisticsCopy);
        } else {
            getStatistics().addAll(statisticsCopy);
        }
        return this;
    }

    /**
     * The unit for the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @return The unit for the metric.
     *
     * @see StandardUnit
     */
    public String getUnit() {
        return unit;
    }
    
    /**
     * The unit for the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The unit for the metric.
     *
     * @see StandardUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    /**
     * The unit for the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The unit for the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StandardUnit
     */
    public GetMetricStatisticsRequest withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * The unit for the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The unit for the metric.
     *
     * @see StandardUnit
     */
    public void setUnit(StandardUnit unit) {
        this.unit = unit.toString();
    }
    
    /**
     * The unit for the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The unit for the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StandardUnit
     */
    public GetMetricStatisticsRequest withUnit(StandardUnit unit) {
        this.unit = unit.toString();
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
        if (getNamespace() != null) sb.append("Namespace: " + getNamespace() + ",");
        if (getMetricName() != null) sb.append("MetricName: " + getMetricName() + ",");
        if (getDimensions() != null) sb.append("Dimensions: " + getDimensions() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getPeriod() != null) sb.append("Period: " + getPeriod() + ",");
        if (getStatistics() != null) sb.append("Statistics: " + getStatistics() + ",");
        if (getUnit() != null) sb.append("Unit: " + getUnit() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode()); 
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode()); 
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode()); 
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode()); 
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode()); 
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode()); 
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetMetricStatisticsRequest == false) return false;
        GetMetricStatisticsRequest other = (GetMetricStatisticsRequest)obj;
        
        if (other.getNamespace() == null ^ this.getNamespace() == null) return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false) return false; 
        if (other.getMetricName() == null ^ this.getMetricName() == null) return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false) return false; 
        if (other.getDimensions() == null ^ this.getDimensions() == null) return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getPeriod() == null ^ this.getPeriod() == null) return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false) return false; 
        if (other.getStatistics() == null ^ this.getStatistics() == null) return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false) return false; 
        if (other.getUnit() == null ^ this.getUnit() == null) return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false) return false; 
        return true;
    }
    
}
    