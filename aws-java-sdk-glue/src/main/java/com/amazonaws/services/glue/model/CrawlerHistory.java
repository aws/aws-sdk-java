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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the information for a run of a crawler.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CrawlerHistory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrawlerHistory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A UUID identifier for each crawl.
     * </p>
     */
    private String crawlId;
    /**
     * <p>
     * The state of the crawl.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The date and time on which the crawl started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time on which the crawl ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * A run summary for the specific crawl in JSON. Contains the catalog tables and partitions that were added,
     * updated, or deleted.
     * </p>
     */
    private String summary;
    /**
     * <p>
     * If an error occurred, the error message associated with the crawl.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The log group associated with the crawl.
     * </p>
     */
    private String logGroup;
    /**
     * <p>
     * The log stream associated with the crawl.
     * </p>
     */
    private String logStream;
    /**
     * <p>
     * The prefix for a CloudWatch message about this crawl.
     * </p>
     */
    private String messagePrefix;
    /**
     * <p>
     * The number of data processing units (DPU) used in hours for the crawl.
     * </p>
     */
    private Double dPUHour;

    /**
     * <p>
     * A UUID identifier for each crawl.
     * </p>
     * 
     * @param crawlId
     *        A UUID identifier for each crawl.
     */

    public void setCrawlId(String crawlId) {
        this.crawlId = crawlId;
    }

    /**
     * <p>
     * A UUID identifier for each crawl.
     * </p>
     * 
     * @return A UUID identifier for each crawl.
     */

    public String getCrawlId() {
        return this.crawlId;
    }

    /**
     * <p>
     * A UUID identifier for each crawl.
     * </p>
     * 
     * @param crawlId
     *        A UUID identifier for each crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerHistory withCrawlId(String crawlId) {
        setCrawlId(crawlId);
        return this;
    }

    /**
     * <p>
     * The state of the crawl.
     * </p>
     * 
     * @param state
     *        The state of the crawl.
     * @see CrawlerHistoryState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the crawl.
     * </p>
     * 
     * @return The state of the crawl.
     * @see CrawlerHistoryState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the crawl.
     * </p>
     * 
     * @param state
     *        The state of the crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CrawlerHistoryState
     */

    public CrawlerHistory withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the crawl.
     * </p>
     * 
     * @param state
     *        The state of the crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CrawlerHistoryState
     */

    public CrawlerHistory withState(CrawlerHistoryState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time on which the crawl started.
     * </p>
     * 
     * @param startTime
     *        The date and time on which the crawl started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time on which the crawl started.
     * </p>
     * 
     * @return The date and time on which the crawl started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time on which the crawl started.
     * </p>
     * 
     * @param startTime
     *        The date and time on which the crawl started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerHistory withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time on which the crawl ended.
     * </p>
     * 
     * @param endTime
     *        The date and time on which the crawl ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time on which the crawl ended.
     * </p>
     * 
     * @return The date and time on which the crawl ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time on which the crawl ended.
     * </p>
     * 
     * @param endTime
     *        The date and time on which the crawl ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerHistory withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * A run summary for the specific crawl in JSON. Contains the catalog tables and partitions that were added,
     * updated, or deleted.
     * </p>
     * 
     * @param summary
     *        A run summary for the specific crawl in JSON. Contains the catalog tables and partitions that were added,
     *        updated, or deleted.
     */

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * A run summary for the specific crawl in JSON. Contains the catalog tables and partitions that were added,
     * updated, or deleted.
     * </p>
     * 
     * @return A run summary for the specific crawl in JSON. Contains the catalog tables and partitions that were added,
     *         updated, or deleted.
     */

    public String getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * A run summary for the specific crawl in JSON. Contains the catalog tables and partitions that were added,
     * updated, or deleted.
     * </p>
     * 
     * @param summary
     *        A run summary for the specific crawl in JSON. Contains the catalog tables and partitions that were added,
     *        updated, or deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerHistory withSummary(String summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * If an error occurred, the error message associated with the crawl.
     * </p>
     * 
     * @param errorMessage
     *        If an error occurred, the error message associated with the crawl.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * If an error occurred, the error message associated with the crawl.
     * </p>
     * 
     * @return If an error occurred, the error message associated with the crawl.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * If an error occurred, the error message associated with the crawl.
     * </p>
     * 
     * @param errorMessage
     *        If an error occurred, the error message associated with the crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerHistory withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The log group associated with the crawl.
     * </p>
     * 
     * @param logGroup
     *        The log group associated with the crawl.
     */

    public void setLogGroup(String logGroup) {
        this.logGroup = logGroup;
    }

    /**
     * <p>
     * The log group associated with the crawl.
     * </p>
     * 
     * @return The log group associated with the crawl.
     */

    public String getLogGroup() {
        return this.logGroup;
    }

    /**
     * <p>
     * The log group associated with the crawl.
     * </p>
     * 
     * @param logGroup
     *        The log group associated with the crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerHistory withLogGroup(String logGroup) {
        setLogGroup(logGroup);
        return this;
    }

    /**
     * <p>
     * The log stream associated with the crawl.
     * </p>
     * 
     * @param logStream
     *        The log stream associated with the crawl.
     */

    public void setLogStream(String logStream) {
        this.logStream = logStream;
    }

    /**
     * <p>
     * The log stream associated with the crawl.
     * </p>
     * 
     * @return The log stream associated with the crawl.
     */

    public String getLogStream() {
        return this.logStream;
    }

    /**
     * <p>
     * The log stream associated with the crawl.
     * </p>
     * 
     * @param logStream
     *        The log stream associated with the crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerHistory withLogStream(String logStream) {
        setLogStream(logStream);
        return this;
    }

    /**
     * <p>
     * The prefix for a CloudWatch message about this crawl.
     * </p>
     * 
     * @param messagePrefix
     *        The prefix for a CloudWatch message about this crawl.
     */

    public void setMessagePrefix(String messagePrefix) {
        this.messagePrefix = messagePrefix;
    }

    /**
     * <p>
     * The prefix for a CloudWatch message about this crawl.
     * </p>
     * 
     * @return The prefix for a CloudWatch message about this crawl.
     */

    public String getMessagePrefix() {
        return this.messagePrefix;
    }

    /**
     * <p>
     * The prefix for a CloudWatch message about this crawl.
     * </p>
     * 
     * @param messagePrefix
     *        The prefix for a CloudWatch message about this crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerHistory withMessagePrefix(String messagePrefix) {
        setMessagePrefix(messagePrefix);
        return this;
    }

    /**
     * <p>
     * The number of data processing units (DPU) used in hours for the crawl.
     * </p>
     * 
     * @param dPUHour
     *        The number of data processing units (DPU) used in hours for the crawl.
     */

    public void setDPUHour(Double dPUHour) {
        this.dPUHour = dPUHour;
    }

    /**
     * <p>
     * The number of data processing units (DPU) used in hours for the crawl.
     * </p>
     * 
     * @return The number of data processing units (DPU) used in hours for the crawl.
     */

    public Double getDPUHour() {
        return this.dPUHour;
    }

    /**
     * <p>
     * The number of data processing units (DPU) used in hours for the crawl.
     * </p>
     * 
     * @param dPUHour
     *        The number of data processing units (DPU) used in hours for the crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerHistory withDPUHour(Double dPUHour) {
        setDPUHour(dPUHour);
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
        if (getCrawlId() != null)
            sb.append("CrawlId: ").append(getCrawlId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getLogGroup() != null)
            sb.append("LogGroup: ").append(getLogGroup()).append(",");
        if (getLogStream() != null)
            sb.append("LogStream: ").append(getLogStream()).append(",");
        if (getMessagePrefix() != null)
            sb.append("MessagePrefix: ").append(getMessagePrefix()).append(",");
        if (getDPUHour() != null)
            sb.append("DPUHour: ").append(getDPUHour());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrawlerHistory == false)
            return false;
        CrawlerHistory other = (CrawlerHistory) obj;
        if (other.getCrawlId() == null ^ this.getCrawlId() == null)
            return false;
        if (other.getCrawlId() != null && other.getCrawlId().equals(this.getCrawlId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getLogGroup() == null ^ this.getLogGroup() == null)
            return false;
        if (other.getLogGroup() != null && other.getLogGroup().equals(this.getLogGroup()) == false)
            return false;
        if (other.getLogStream() == null ^ this.getLogStream() == null)
            return false;
        if (other.getLogStream() != null && other.getLogStream().equals(this.getLogStream()) == false)
            return false;
        if (other.getMessagePrefix() == null ^ this.getMessagePrefix() == null)
            return false;
        if (other.getMessagePrefix() != null && other.getMessagePrefix().equals(this.getMessagePrefix()) == false)
            return false;
        if (other.getDPUHour() == null ^ this.getDPUHour() == null)
            return false;
        if (other.getDPUHour() != null && other.getDPUHour().equals(this.getDPUHour()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawlId() == null) ? 0 : getCrawlId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLogGroup() == null) ? 0 : getLogGroup().hashCode());
        hashCode = prime * hashCode + ((getLogStream() == null) ? 0 : getLogStream().hashCode());
        hashCode = prime * hashCode + ((getMessagePrefix() == null) ? 0 : getMessagePrefix().hashCode());
        hashCode = prime * hashCode + ((getDPUHour() == null) ? 0 : getDPUHour().hashCode());
        return hashCode;
    }

    @Override
    public CrawlerHistory clone() {
        try {
            return (CrawlerHistory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CrawlerHistoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
