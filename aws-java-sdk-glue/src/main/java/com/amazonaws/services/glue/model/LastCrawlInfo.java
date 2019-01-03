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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Status and error information about the most recent crawl.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/LastCrawlInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LastCrawlInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Status of the last crawl.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If an error occurred, the error information about the last crawl.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The log group for the last crawl.
     * </p>
     */
    private String logGroup;
    /**
     * <p>
     * The log stream for the last crawl.
     * </p>
     */
    private String logStream;
    /**
     * <p>
     * The prefix for a message about this crawl.
     * </p>
     */
    private String messagePrefix;
    /**
     * <p>
     * The time at which the crawl started.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * Status of the last crawl.
     * </p>
     * 
     * @param status
     *        Status of the last crawl.
     * @see LastCrawlStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the last crawl.
     * </p>
     * 
     * @return Status of the last crawl.
     * @see LastCrawlStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the last crawl.
     * </p>
     * 
     * @param status
     *        Status of the last crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastCrawlStatus
     */

    public LastCrawlInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the last crawl.
     * </p>
     * 
     * @param status
     *        Status of the last crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastCrawlStatus
     */

    public LastCrawlInfo withStatus(LastCrawlStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If an error occurred, the error information about the last crawl.
     * </p>
     * 
     * @param errorMessage
     *        If an error occurred, the error information about the last crawl.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * If an error occurred, the error information about the last crawl.
     * </p>
     * 
     * @return If an error occurred, the error information about the last crawl.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * If an error occurred, the error information about the last crawl.
     * </p>
     * 
     * @param errorMessage
     *        If an error occurred, the error information about the last crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastCrawlInfo withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The log group for the last crawl.
     * </p>
     * 
     * @param logGroup
     *        The log group for the last crawl.
     */

    public void setLogGroup(String logGroup) {
        this.logGroup = logGroup;
    }

    /**
     * <p>
     * The log group for the last crawl.
     * </p>
     * 
     * @return The log group for the last crawl.
     */

    public String getLogGroup() {
        return this.logGroup;
    }

    /**
     * <p>
     * The log group for the last crawl.
     * </p>
     * 
     * @param logGroup
     *        The log group for the last crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastCrawlInfo withLogGroup(String logGroup) {
        setLogGroup(logGroup);
        return this;
    }

    /**
     * <p>
     * The log stream for the last crawl.
     * </p>
     * 
     * @param logStream
     *        The log stream for the last crawl.
     */

    public void setLogStream(String logStream) {
        this.logStream = logStream;
    }

    /**
     * <p>
     * The log stream for the last crawl.
     * </p>
     * 
     * @return The log stream for the last crawl.
     */

    public String getLogStream() {
        return this.logStream;
    }

    /**
     * <p>
     * The log stream for the last crawl.
     * </p>
     * 
     * @param logStream
     *        The log stream for the last crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastCrawlInfo withLogStream(String logStream) {
        setLogStream(logStream);
        return this;
    }

    /**
     * <p>
     * The prefix for a message about this crawl.
     * </p>
     * 
     * @param messagePrefix
     *        The prefix for a message about this crawl.
     */

    public void setMessagePrefix(String messagePrefix) {
        this.messagePrefix = messagePrefix;
    }

    /**
     * <p>
     * The prefix for a message about this crawl.
     * </p>
     * 
     * @return The prefix for a message about this crawl.
     */

    public String getMessagePrefix() {
        return this.messagePrefix;
    }

    /**
     * <p>
     * The prefix for a message about this crawl.
     * </p>
     * 
     * @param messagePrefix
     *        The prefix for a message about this crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastCrawlInfo withMessagePrefix(String messagePrefix) {
        setMessagePrefix(messagePrefix);
        return this;
    }

    /**
     * <p>
     * The time at which the crawl started.
     * </p>
     * 
     * @param startTime
     *        The time at which the crawl started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time at which the crawl started.
     * </p>
     * 
     * @return The time at which the crawl started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time at which the crawl started.
     * </p>
     * 
     * @param startTime
     *        The time at which the crawl started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastCrawlInfo withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getLogGroup() != null)
            sb.append("LogGroup: ").append(getLogGroup()).append(",");
        if (getLogStream() != null)
            sb.append("LogStream: ").append(getLogStream()).append(",");
        if (getMessagePrefix() != null)
            sb.append("MessagePrefix: ").append(getMessagePrefix()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LastCrawlInfo == false)
            return false;
        LastCrawlInfo other = (LastCrawlInfo) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLogGroup() == null) ? 0 : getLogGroup().hashCode());
        hashCode = prime * hashCode + ((getLogStream() == null) ? 0 : getLogStream().hashCode());
        hashCode = prime * hashCode + ((getMessagePrefix() == null) ? 0 : getMessagePrefix().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public LastCrawlInfo clone() {
        try {
            return (LastCrawlInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.LastCrawlInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
