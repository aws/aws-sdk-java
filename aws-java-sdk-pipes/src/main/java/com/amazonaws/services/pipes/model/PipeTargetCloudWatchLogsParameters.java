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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for using an CloudWatch Logs log stream as a target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/PipeTargetCloudWatchLogsParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeTargetCloudWatchLogsParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the log stream.
     * </p>
     */
    private String logStreamName;
    /**
     * <p>
     * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     */
    private String timestamp;

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream.
     */

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * 
     * @return The name of the log stream.
     */

    public String getLogStreamName() {
        return this.logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetCloudWatchLogsParameters withLogStreamName(String logStreamName) {
        setLogStreamName(logStreamName);
        return this;
    }

    /**
     * <p>
     * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param timestamp
     *        The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     */

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @return The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     */

    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param timestamp
     *        The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetCloudWatchLogsParameters withTimestamp(String timestamp) {
        setTimestamp(timestamp);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipeTargetCloudWatchLogsParameters == false)
            return false;
        PipeTargetCloudWatchLogsParameters other = (PipeTargetCloudWatchLogsParameters) obj;
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public PipeTargetCloudWatchLogsParameters clone() {
        try {
            return (PipeTargetCloudWatchLogsParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.PipeTargetCloudWatchLogsParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
