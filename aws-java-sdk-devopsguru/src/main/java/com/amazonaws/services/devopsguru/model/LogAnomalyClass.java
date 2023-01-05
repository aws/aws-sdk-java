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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an anomalous log event found within a log group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/LogAnomalyClass" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogAnomalyClass implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon CloudWatch log stream that the anomalous log event belongs to. A log stream is a sequence
     * of log events that share the same source.
     * </p>
     */
    private String logStreamName;
    /**
     * <p>
     * The type of log anomaly that has been detected.
     * </p>
     */
    private String logAnomalyType;
    /**
     * <p>
     * The token where the anomaly was detected. This may refer to an exception or another location, or it may be blank
     * for log anomalies such as format anomalies.
     * </p>
     */
    private String logAnomalyToken;
    /**
     * <p>
     * The ID of the log event.
     * </p>
     */
    private String logEventId;
    /**
     * <p>
     * The explanation for why the log event is considered an anomaly.
     * </p>
     */
    private String explanation;
    /**
     * <p>
     * The number of log lines where this anomalous log event occurs.
     * </p>
     */
    private Integer numberOfLogLinesOccurrences;
    /**
     * <p>
     * The time of the first occurrence of the anomalous log event.
     * </p>
     */
    private java.util.Date logEventTimestamp;

    /**
     * <p>
     * The name of the Amazon CloudWatch log stream that the anomalous log event belongs to. A log stream is a sequence
     * of log events that share the same source.
     * </p>
     * 
     * @param logStreamName
     *        The name of the Amazon CloudWatch log stream that the anomalous log event belongs to. A log stream is a
     *        sequence of log events that share the same source.
     */

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch log stream that the anomalous log event belongs to. A log stream is a sequence
     * of log events that share the same source.
     * </p>
     * 
     * @return The name of the Amazon CloudWatch log stream that the anomalous log event belongs to. A log stream is a
     *         sequence of log events that share the same source.
     */

    public String getLogStreamName() {
        return this.logStreamName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch log stream that the anomalous log event belongs to. A log stream is a sequence
     * of log events that share the same source.
     * </p>
     * 
     * @param logStreamName
     *        The name of the Amazon CloudWatch log stream that the anomalous log event belongs to. A log stream is a
     *        sequence of log events that share the same source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogAnomalyClass withLogStreamName(String logStreamName) {
        setLogStreamName(logStreamName);
        return this;
    }

    /**
     * <p>
     * The type of log anomaly that has been detected.
     * </p>
     * 
     * @param logAnomalyType
     *        The type of log anomaly that has been detected.
     * @see LogAnomalyType
     */

    public void setLogAnomalyType(String logAnomalyType) {
        this.logAnomalyType = logAnomalyType;
    }

    /**
     * <p>
     * The type of log anomaly that has been detected.
     * </p>
     * 
     * @return The type of log anomaly that has been detected.
     * @see LogAnomalyType
     */

    public String getLogAnomalyType() {
        return this.logAnomalyType;
    }

    /**
     * <p>
     * The type of log anomaly that has been detected.
     * </p>
     * 
     * @param logAnomalyType
     *        The type of log anomaly that has been detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogAnomalyType
     */

    public LogAnomalyClass withLogAnomalyType(String logAnomalyType) {
        setLogAnomalyType(logAnomalyType);
        return this;
    }

    /**
     * <p>
     * The type of log anomaly that has been detected.
     * </p>
     * 
     * @param logAnomalyType
     *        The type of log anomaly that has been detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogAnomalyType
     */

    public LogAnomalyClass withLogAnomalyType(LogAnomalyType logAnomalyType) {
        this.logAnomalyType = logAnomalyType.toString();
        return this;
    }

    /**
     * <p>
     * The token where the anomaly was detected. This may refer to an exception or another location, or it may be blank
     * for log anomalies such as format anomalies.
     * </p>
     * 
     * @param logAnomalyToken
     *        The token where the anomaly was detected. This may refer to an exception or another location, or it may be
     *        blank for log anomalies such as format anomalies.
     */

    public void setLogAnomalyToken(String logAnomalyToken) {
        this.logAnomalyToken = logAnomalyToken;
    }

    /**
     * <p>
     * The token where the anomaly was detected. This may refer to an exception or another location, or it may be blank
     * for log anomalies such as format anomalies.
     * </p>
     * 
     * @return The token where the anomaly was detected. This may refer to an exception or another location, or it may
     *         be blank for log anomalies such as format anomalies.
     */

    public String getLogAnomalyToken() {
        return this.logAnomalyToken;
    }

    /**
     * <p>
     * The token where the anomaly was detected. This may refer to an exception or another location, or it may be blank
     * for log anomalies such as format anomalies.
     * </p>
     * 
     * @param logAnomalyToken
     *        The token where the anomaly was detected. This may refer to an exception or another location, or it may be
     *        blank for log anomalies such as format anomalies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogAnomalyClass withLogAnomalyToken(String logAnomalyToken) {
        setLogAnomalyToken(logAnomalyToken);
        return this;
    }

    /**
     * <p>
     * The ID of the log event.
     * </p>
     * 
     * @param logEventId
     *        The ID of the log event.
     */

    public void setLogEventId(String logEventId) {
        this.logEventId = logEventId;
    }

    /**
     * <p>
     * The ID of the log event.
     * </p>
     * 
     * @return The ID of the log event.
     */

    public String getLogEventId() {
        return this.logEventId;
    }

    /**
     * <p>
     * The ID of the log event.
     * </p>
     * 
     * @param logEventId
     *        The ID of the log event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogAnomalyClass withLogEventId(String logEventId) {
        setLogEventId(logEventId);
        return this;
    }

    /**
     * <p>
     * The explanation for why the log event is considered an anomaly.
     * </p>
     * 
     * @param explanation
     *        The explanation for why the log event is considered an anomaly.
     */

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    /**
     * <p>
     * The explanation for why the log event is considered an anomaly.
     * </p>
     * 
     * @return The explanation for why the log event is considered an anomaly.
     */

    public String getExplanation() {
        return this.explanation;
    }

    /**
     * <p>
     * The explanation for why the log event is considered an anomaly.
     * </p>
     * 
     * @param explanation
     *        The explanation for why the log event is considered an anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogAnomalyClass withExplanation(String explanation) {
        setExplanation(explanation);
        return this;
    }

    /**
     * <p>
     * The number of log lines where this anomalous log event occurs.
     * </p>
     * 
     * @param numberOfLogLinesOccurrences
     *        The number of log lines where this anomalous log event occurs.
     */

    public void setNumberOfLogLinesOccurrences(Integer numberOfLogLinesOccurrences) {
        this.numberOfLogLinesOccurrences = numberOfLogLinesOccurrences;
    }

    /**
     * <p>
     * The number of log lines where this anomalous log event occurs.
     * </p>
     * 
     * @return The number of log lines where this anomalous log event occurs.
     */

    public Integer getNumberOfLogLinesOccurrences() {
        return this.numberOfLogLinesOccurrences;
    }

    /**
     * <p>
     * The number of log lines where this anomalous log event occurs.
     * </p>
     * 
     * @param numberOfLogLinesOccurrences
     *        The number of log lines where this anomalous log event occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogAnomalyClass withNumberOfLogLinesOccurrences(Integer numberOfLogLinesOccurrences) {
        setNumberOfLogLinesOccurrences(numberOfLogLinesOccurrences);
        return this;
    }

    /**
     * <p>
     * The time of the first occurrence of the anomalous log event.
     * </p>
     * 
     * @param logEventTimestamp
     *        The time of the first occurrence of the anomalous log event.
     */

    public void setLogEventTimestamp(java.util.Date logEventTimestamp) {
        this.logEventTimestamp = logEventTimestamp;
    }

    /**
     * <p>
     * The time of the first occurrence of the anomalous log event.
     * </p>
     * 
     * @return The time of the first occurrence of the anomalous log event.
     */

    public java.util.Date getLogEventTimestamp() {
        return this.logEventTimestamp;
    }

    /**
     * <p>
     * The time of the first occurrence of the anomalous log event.
     * </p>
     * 
     * @param logEventTimestamp
     *        The time of the first occurrence of the anomalous log event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogAnomalyClass withLogEventTimestamp(java.util.Date logEventTimestamp) {
        setLogEventTimestamp(logEventTimestamp);
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
        if (getLogStreamName() != null)
            sb.append("LogStreamName: ").append(getLogStreamName()).append(",");
        if (getLogAnomalyType() != null)
            sb.append("LogAnomalyType: ").append(getLogAnomalyType()).append(",");
        if (getLogAnomalyToken() != null)
            sb.append("LogAnomalyToken: ").append(getLogAnomalyToken()).append(",");
        if (getLogEventId() != null)
            sb.append("LogEventId: ").append(getLogEventId()).append(",");
        if (getExplanation() != null)
            sb.append("Explanation: ").append(getExplanation()).append(",");
        if (getNumberOfLogLinesOccurrences() != null)
            sb.append("NumberOfLogLinesOccurrences: ").append(getNumberOfLogLinesOccurrences()).append(",");
        if (getLogEventTimestamp() != null)
            sb.append("LogEventTimestamp: ").append(getLogEventTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogAnomalyClass == false)
            return false;
        LogAnomalyClass other = (LogAnomalyClass) obj;
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        if (other.getLogAnomalyType() == null ^ this.getLogAnomalyType() == null)
            return false;
        if (other.getLogAnomalyType() != null && other.getLogAnomalyType().equals(this.getLogAnomalyType()) == false)
            return false;
        if (other.getLogAnomalyToken() == null ^ this.getLogAnomalyToken() == null)
            return false;
        if (other.getLogAnomalyToken() != null && other.getLogAnomalyToken().equals(this.getLogAnomalyToken()) == false)
            return false;
        if (other.getLogEventId() == null ^ this.getLogEventId() == null)
            return false;
        if (other.getLogEventId() != null && other.getLogEventId().equals(this.getLogEventId()) == false)
            return false;
        if (other.getExplanation() == null ^ this.getExplanation() == null)
            return false;
        if (other.getExplanation() != null && other.getExplanation().equals(this.getExplanation()) == false)
            return false;
        if (other.getNumberOfLogLinesOccurrences() == null ^ this.getNumberOfLogLinesOccurrences() == null)
            return false;
        if (other.getNumberOfLogLinesOccurrences() != null && other.getNumberOfLogLinesOccurrences().equals(this.getNumberOfLogLinesOccurrences()) == false)
            return false;
        if (other.getLogEventTimestamp() == null ^ this.getLogEventTimestamp() == null)
            return false;
        if (other.getLogEventTimestamp() != null && other.getLogEventTimestamp().equals(this.getLogEventTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode());
        hashCode = prime * hashCode + ((getLogAnomalyType() == null) ? 0 : getLogAnomalyType().hashCode());
        hashCode = prime * hashCode + ((getLogAnomalyToken() == null) ? 0 : getLogAnomalyToken().hashCode());
        hashCode = prime * hashCode + ((getLogEventId() == null) ? 0 : getLogEventId().hashCode());
        hashCode = prime * hashCode + ((getExplanation() == null) ? 0 : getExplanation().hashCode());
        hashCode = prime * hashCode + ((getNumberOfLogLinesOccurrences() == null) ? 0 : getNumberOfLogLinesOccurrences().hashCode());
        hashCode = prime * hashCode + ((getLogEventTimestamp() == null) ? 0 : getLogEventTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public LogAnomalyClass clone() {
        try {
            return (LogAnomalyClass) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.LogAnomalyClassMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
