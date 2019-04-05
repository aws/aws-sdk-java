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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a connection between two services.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/Edge" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Edge implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of the edge. Unique within a service map.
     * </p>
     */
    private Integer referenceId;
    /**
     * <p>
     * The start time of the first segment on the edge.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the last segment on the edge.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Response statistics for segments on the edge.
     * </p>
     */
    private EdgeStatistics summaryStatistics;
    /**
     * <p>
     * A histogram that maps the spread of client response times on an edge.
     * </p>
     */
    private java.util.List<HistogramEntry> responseTimeHistogram;
    /**
     * <p>
     * Aliases for the edge.
     * </p>
     */
    private java.util.List<Alias> aliases;

    /**
     * <p>
     * Identifier of the edge. Unique within a service map.
     * </p>
     * 
     * @param referenceId
     *        Identifier of the edge. Unique within a service map.
     */

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * Identifier of the edge. Unique within a service map.
     * </p>
     * 
     * @return Identifier of the edge. Unique within a service map.
     */

    public Integer getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * Identifier of the edge. Unique within a service map.
     * </p>
     * 
     * @param referenceId
     *        Identifier of the edge. Unique within a service map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Edge withReferenceId(Integer referenceId) {
        setReferenceId(referenceId);
        return this;
    }

    /**
     * <p>
     * The start time of the first segment on the edge.
     * </p>
     * 
     * @param startTime
     *        The start time of the first segment on the edge.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the first segment on the edge.
     * </p>
     * 
     * @return The start time of the first segment on the edge.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the first segment on the edge.
     * </p>
     * 
     * @param startTime
     *        The start time of the first segment on the edge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Edge withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the last segment on the edge.
     * </p>
     * 
     * @param endTime
     *        The end time of the last segment on the edge.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the last segment on the edge.
     * </p>
     * 
     * @return The end time of the last segment on the edge.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the last segment on the edge.
     * </p>
     * 
     * @param endTime
     *        The end time of the last segment on the edge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Edge withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Response statistics for segments on the edge.
     * </p>
     * 
     * @param summaryStatistics
     *        Response statistics for segments on the edge.
     */

    public void setSummaryStatistics(EdgeStatistics summaryStatistics) {
        this.summaryStatistics = summaryStatistics;
    }

    /**
     * <p>
     * Response statistics for segments on the edge.
     * </p>
     * 
     * @return Response statistics for segments on the edge.
     */

    public EdgeStatistics getSummaryStatistics() {
        return this.summaryStatistics;
    }

    /**
     * <p>
     * Response statistics for segments on the edge.
     * </p>
     * 
     * @param summaryStatistics
     *        Response statistics for segments on the edge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Edge withSummaryStatistics(EdgeStatistics summaryStatistics) {
        setSummaryStatistics(summaryStatistics);
        return this;
    }

    /**
     * <p>
     * A histogram that maps the spread of client response times on an edge.
     * </p>
     * 
     * @return A histogram that maps the spread of client response times on an edge.
     */

    public java.util.List<HistogramEntry> getResponseTimeHistogram() {
        return responseTimeHistogram;
    }

    /**
     * <p>
     * A histogram that maps the spread of client response times on an edge.
     * </p>
     * 
     * @param responseTimeHistogram
     *        A histogram that maps the spread of client response times on an edge.
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
     * A histogram that maps the spread of client response times on an edge.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResponseTimeHistogram(java.util.Collection)} or
     * {@link #withResponseTimeHistogram(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param responseTimeHistogram
     *        A histogram that maps the spread of client response times on an edge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Edge withResponseTimeHistogram(HistogramEntry... responseTimeHistogram) {
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
     * A histogram that maps the spread of client response times on an edge.
     * </p>
     * 
     * @param responseTimeHistogram
     *        A histogram that maps the spread of client response times on an edge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Edge withResponseTimeHistogram(java.util.Collection<HistogramEntry> responseTimeHistogram) {
        setResponseTimeHistogram(responseTimeHistogram);
        return this;
    }

    /**
     * <p>
     * Aliases for the edge.
     * </p>
     * 
     * @return Aliases for the edge.
     */

    public java.util.List<Alias> getAliases() {
        return aliases;
    }

    /**
     * <p>
     * Aliases for the edge.
     * </p>
     * 
     * @param aliases
     *        Aliases for the edge.
     */

    public void setAliases(java.util.Collection<Alias> aliases) {
        if (aliases == null) {
            this.aliases = null;
            return;
        }

        this.aliases = new java.util.ArrayList<Alias>(aliases);
    }

    /**
     * <p>
     * Aliases for the edge.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliases(java.util.Collection)} or {@link #withAliases(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param aliases
     *        Aliases for the edge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Edge withAliases(Alias... aliases) {
        if (this.aliases == null) {
            setAliases(new java.util.ArrayList<Alias>(aliases.length));
        }
        for (Alias ele : aliases) {
            this.aliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Aliases for the edge.
     * </p>
     * 
     * @param aliases
     *        Aliases for the edge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Edge withAliases(java.util.Collection<Alias> aliases) {
        setAliases(aliases);
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
        if (getReferenceId() != null)
            sb.append("ReferenceId: ").append(getReferenceId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getSummaryStatistics() != null)
            sb.append("SummaryStatistics: ").append(getSummaryStatistics()).append(",");
        if (getResponseTimeHistogram() != null)
            sb.append("ResponseTimeHistogram: ").append(getResponseTimeHistogram()).append(",");
        if (getAliases() != null)
            sb.append("Aliases: ").append(getAliases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Edge == false)
            return false;
        Edge other = (Edge) obj;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getSummaryStatistics() == null ^ this.getSummaryStatistics() == null)
            return false;
        if (other.getSummaryStatistics() != null && other.getSummaryStatistics().equals(this.getSummaryStatistics()) == false)
            return false;
        if (other.getResponseTimeHistogram() == null ^ this.getResponseTimeHistogram() == null)
            return false;
        if (other.getResponseTimeHistogram() != null && other.getResponseTimeHistogram().equals(this.getResponseTimeHistogram()) == false)
            return false;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getSummaryStatistics() == null) ? 0 : getSummaryStatistics().hashCode());
        hashCode = prime * hashCode + ((getResponseTimeHistogram() == null) ? 0 : getResponseTimeHistogram().hashCode());
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        return hashCode;
    }

    @Override
    public Edge clone() {
        try {
            return (Edge) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.EdgeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
