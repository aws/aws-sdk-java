/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A configuration for CloudWatch monitoring. You can configure your jobs to send log information to CloudWatch Logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CloudWatchMonitoringConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchMonitoringConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the log group for log publishing.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The specified name prefix for log streams.
     * </p>
     */
    private String logStreamNamePrefix;

    /**
     * <p>
     * The name of the log group for log publishing.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group for log publishing.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group for log publishing.
     * </p>
     * 
     * @return The name of the log group for log publishing.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group for log publishing.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group for log publishing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchMonitoringConfiguration withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The specified name prefix for log streams.
     * </p>
     * 
     * @param logStreamNamePrefix
     *        The specified name prefix for log streams.
     */

    public void setLogStreamNamePrefix(String logStreamNamePrefix) {
        this.logStreamNamePrefix = logStreamNamePrefix;
    }

    /**
     * <p>
     * The specified name prefix for log streams.
     * </p>
     * 
     * @return The specified name prefix for log streams.
     */

    public String getLogStreamNamePrefix() {
        return this.logStreamNamePrefix;
    }

    /**
     * <p>
     * The specified name prefix for log streams.
     * </p>
     * 
     * @param logStreamNamePrefix
     *        The specified name prefix for log streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchMonitoringConfiguration withLogStreamNamePrefix(String logStreamNamePrefix) {
        setLogStreamNamePrefix(logStreamNamePrefix);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getLogStreamNamePrefix() != null)
            sb.append("LogStreamNamePrefix: ").append(getLogStreamNamePrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchMonitoringConfiguration == false)
            return false;
        CloudWatchMonitoringConfiguration other = (CloudWatchMonitoringConfiguration) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogStreamNamePrefix() == null ^ this.getLogStreamNamePrefix() == null)
            return false;
        if (other.getLogStreamNamePrefix() != null && other.getLogStreamNamePrefix().equals(this.getLogStreamNamePrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getLogStreamNamePrefix() == null) ? 0 : getLogStreamNamePrefix().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchMonitoringConfiguration clone() {
        try {
            return (CloudWatchMonitoringConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.CloudWatchMonitoringConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
