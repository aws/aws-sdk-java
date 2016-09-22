/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;

/**
 * <p>
 * Describes CloudWatch logging options for your delivery stream.
 * </p>
 */
public class CloudWatchLoggingOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Enables or disables CloudWatch logging.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The CloudWatch group name for logging. This value is required if Enabled is true.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The CloudWatch log stream name for logging. This value is required if Enabled is true.
     * </p>
     */
    private String logStreamName;

    /**
     * <p>
     * Enables or disables CloudWatch logging.
     * </p>
     * 
     * @param enabled
     *        Enables or disables CloudWatch logging.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Enables or disables CloudWatch logging.
     * </p>
     * 
     * @return Enables or disables CloudWatch logging.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Enables or disables CloudWatch logging.
     * </p>
     * 
     * @param enabled
     *        Enables or disables CloudWatch logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingOptions withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Enables or disables CloudWatch logging.
     * </p>
     * 
     * @return Enables or disables CloudWatch logging.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The CloudWatch group name for logging. This value is required if Enabled is true.
     * </p>
     * 
     * @param logGroupName
     *        The CloudWatch group name for logging. This value is required if Enabled is true.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The CloudWatch group name for logging. This value is required if Enabled is true.
     * </p>
     * 
     * @return The CloudWatch group name for logging. This value is required if Enabled is true.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The CloudWatch group name for logging. This value is required if Enabled is true.
     * </p>
     * 
     * @param logGroupName
     *        The CloudWatch group name for logging. This value is required if Enabled is true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingOptions withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The CloudWatch log stream name for logging. This value is required if Enabled is true.
     * </p>
     * 
     * @param logStreamName
     *        The CloudWatch log stream name for logging. This value is required if Enabled is true.
     */

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The CloudWatch log stream name for logging. This value is required if Enabled is true.
     * </p>
     * 
     * @return The CloudWatch log stream name for logging. This value is required if Enabled is true.
     */

    public String getLogStreamName() {
        return this.logStreamName;
    }

    /**
     * <p>
     * The CloudWatch log stream name for logging. This value is required if Enabled is true.
     * </p>
     * 
     * @param logStreamName
     *        The CloudWatch log stream name for logging. This value is required if Enabled is true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingOptions withLogStreamName(String logStreamName) {
        setLogStreamName(logStreamName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getLogStreamName() != null)
            sb.append("LogStreamName: " + getLogStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLoggingOptions == false)
            return false;
        CloudWatchLoggingOptions other = (CloudWatchLoggingOptions) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchLoggingOptions clone() {
        try {
            return (CloudWatchLoggingOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
