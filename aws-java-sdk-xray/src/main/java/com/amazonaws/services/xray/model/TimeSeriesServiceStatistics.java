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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of TimeSeriesStatistic structures.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/TimeSeriesServiceStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSeriesServiceStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Timestamp of the window for which statistics are aggregated.
     * </p>
     */
    private java.util.Date timestamp;

    private EdgeStatistics edgeSummaryStatistics;

    private ServiceStatistics serviceSummaryStatistics;
    /**
     * <p>
     * The response time histogram for the selected entities.
     * </p>
     */
    private java.util.List<HistogramEntry> responseTimeHistogram;

    /**
     * <p>
     * Timestamp of the window for which statistics are aggregated.
     * </p>
     * 
     * @param timestamp
     *        Timestamp of the window for which statistics are aggregated.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Timestamp of the window for which statistics are aggregated.
     * </p>
     * 
     * @return Timestamp of the window for which statistics are aggregated.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Timestamp of the window for which statistics are aggregated.
     * </p>
     * 
     * @param timestamp
     *        Timestamp of the window for which statistics are aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesServiceStatistics withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * @param edgeSummaryStatistics
     */

    public void setEdgeSummaryStatistics(EdgeStatistics edgeSummaryStatistics) {
        this.edgeSummaryStatistics = edgeSummaryStatistics;
    }

    /**
     * @return
     */

    public EdgeStatistics getEdgeSummaryStatistics() {
        return this.edgeSummaryStatistics;
    }

    /**
     * @param edgeSummaryStatistics
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesServiceStatistics withEdgeSummaryStatistics(EdgeStatistics edgeSummaryStatistics) {
        setEdgeSummaryStatistics(edgeSummaryStatistics);
        return this;
    }

    /**
     * @param serviceSummaryStatistics
     */

    public void setServiceSummaryStatistics(ServiceStatistics serviceSummaryStatistics) {
        this.serviceSummaryStatistics = serviceSummaryStatistics;
    }

    /**
     * @return
     */

    public ServiceStatistics getServiceSummaryStatistics() {
        return this.serviceSummaryStatistics;
    }

    /**
     * @param serviceSummaryStatistics
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesServiceStatistics withServiceSummaryStatistics(ServiceStatistics serviceSummaryStatistics) {
        setServiceSummaryStatistics(serviceSummaryStatistics);
        return this;
    }

    /**
     * <p>
     * The response time histogram for the selected entities.
     * </p>
     * 
     * @return The response time histogram for the selected entities.
     */

    public java.util.List<HistogramEntry> getResponseTimeHistogram() {
        return responseTimeHistogram;
    }

    /**
     * <p>
     * The response time histogram for the selected entities.
     * </p>
     * 
     * @param responseTimeHistogram
     *        The response time histogram for the selected entities.
     */

    public void setResponseTimeHistogram(java.util.Collection<HistogramEntry> responseTimeHistogram) {
        if (responseTimeHistogram == null) {
            this.responseTimeHistogram = null;
            return;
        }

        this.responseTimeHistogram = new java.util.ArrayList<HistogramEntry>(responseTimeHistogram);
    }

    /**
     * <p>
     * The response time histogram for the selected entities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResponseTimeHistogram(java.util.Collection)} or
     * {@link #withResponseTimeHistogram(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param responseTimeHistogram
     *        The response time histogram for the selected entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesServiceStatistics withResponseTimeHistogram(HistogramEntry... responseTimeHistogram) {
        if (this.responseTimeHistogram == null) {
            setResponseTimeHistogram(new java.util.ArrayList<HistogramEntry>(responseTimeHistogram.length));
        }
        for (HistogramEntry ele : responseTimeHistogram) {
            this.responseTimeHistogram.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The response time histogram for the selected entities.
     * </p>
     * 
     * @param responseTimeHistogram
     *        The response time histogram for the selected entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesServiceStatistics withResponseTimeHistogram(java.util.Collection<HistogramEntry> responseTimeHistogram) {
        setResponseTimeHistogram(responseTimeHistogram);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getEdgeSummaryStatistics() != null)
            sb.append("EdgeSummaryStatistics: ").append(getEdgeSummaryStatistics()).append(",");
        if (getServiceSummaryStatistics() != null)
            sb.append("ServiceSummaryStatistics: ").append(getServiceSummaryStatistics()).append(",");
        if (getResponseTimeHistogram() != null)
            sb.append("ResponseTimeHistogram: ").append(getResponseTimeHistogram());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeSeriesServiceStatistics == false)
            return false;
        TimeSeriesServiceStatistics other = (TimeSeriesServiceStatistics) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getEdgeSummaryStatistics() == null ^ this.getEdgeSummaryStatistics() == null)
            return false;
        if (other.getEdgeSummaryStatistics() != null && other.getEdgeSummaryStatistics().equals(this.getEdgeSummaryStatistics()) == false)
            return false;
        if (other.getServiceSummaryStatistics() == null ^ this.getServiceSummaryStatistics() == null)
            return false;
        if (other.getServiceSummaryStatistics() != null && other.getServiceSummaryStatistics().equals(this.getServiceSummaryStatistics()) == false)
            return false;
        if (other.getResponseTimeHistogram() == null ^ this.getResponseTimeHistogram() == null)
            return false;
        if (other.getResponseTimeHistogram() != null && other.getResponseTimeHistogram().equals(this.getResponseTimeHistogram()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEdgeSummaryStatistics() == null) ? 0 : getEdgeSummaryStatistics().hashCode());
        hashCode = prime * hashCode + ((getServiceSummaryStatistics() == null) ? 0 : getServiceSummaryStatistics().hashCode());
        hashCode = prime * hashCode + ((getResponseTimeHistogram() == null) ? 0 : getResponseTimeHistogram().hashCode());
        return hashCode;
    }

    @Override
    public TimeSeriesServiceStatistics clone() {
        try {
            return (TimeSeriesServiceStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.TimeSeriesServiceStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
