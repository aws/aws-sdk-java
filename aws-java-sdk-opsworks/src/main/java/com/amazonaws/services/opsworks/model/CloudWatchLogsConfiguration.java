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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the Amazon CloudWatch logs configuration for a layer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CloudWatchLogsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLogsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether CloudWatch Logs is enabled for a layer.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * A list of configuration options for CloudWatch Logs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CloudWatchLogsLogStream> logStreams;

    /**
     * <p>
     * Whether CloudWatch Logs is enabled for a layer.
     * </p>
     * 
     * @param enabled
     *        Whether CloudWatch Logs is enabled for a layer.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether CloudWatch Logs is enabled for a layer.
     * </p>
     * 
     * @return Whether CloudWatch Logs is enabled for a layer.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether CloudWatch Logs is enabled for a layer.
     * </p>
     * 
     * @param enabled
     *        Whether CloudWatch Logs is enabled for a layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether CloudWatch Logs is enabled for a layer.
     * </p>
     * 
     * @return Whether CloudWatch Logs is enabled for a layer.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A list of configuration options for CloudWatch Logs.
     * </p>
     * 
     * @return A list of configuration options for CloudWatch Logs.
     */

    public java.util.List<CloudWatchLogsLogStream> getLogStreams() {
        if (logStreams == null) {
            logStreams = new com.amazonaws.internal.SdkInternalList<CloudWatchLogsLogStream>();
        }
        return logStreams;
    }

    /**
     * <p>
     * A list of configuration options for CloudWatch Logs.
     * </p>
     * 
     * @param logStreams
     *        A list of configuration options for CloudWatch Logs.
     */

    public void setLogStreams(java.util.Collection<CloudWatchLogsLogStream> logStreams) {
        if (logStreams == null) {
            this.logStreams = null;
            return;
        }

        this.logStreams = new com.amazonaws.internal.SdkInternalList<CloudWatchLogsLogStream>(logStreams);
    }

    /**
     * <p>
     * A list of configuration options for CloudWatch Logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogStreams(java.util.Collection)} or {@link #withLogStreams(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param logStreams
     *        A list of configuration options for CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsConfiguration withLogStreams(CloudWatchLogsLogStream... logStreams) {
        if (this.logStreams == null) {
            setLogStreams(new com.amazonaws.internal.SdkInternalList<CloudWatchLogsLogStream>(logStreams.length));
        }
        for (CloudWatchLogsLogStream ele : logStreams) {
            this.logStreams.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of configuration options for CloudWatch Logs.
     * </p>
     * 
     * @param logStreams
     *        A list of configuration options for CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsConfiguration withLogStreams(java.util.Collection<CloudWatchLogsLogStream> logStreams) {
        setLogStreams(logStreams);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getLogStreams() != null)
            sb.append("LogStreams: ").append(getLogStreams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLogsConfiguration == false)
            return false;
        CloudWatchLogsConfiguration other = (CloudWatchLogsConfiguration) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getLogStreams() == null ^ this.getLogStreams() == null)
            return false;
        if (other.getLogStreams() != null && other.getLogStreams().equals(this.getLogStreams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getLogStreams() == null) ? 0 : getLogStreams().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchLogsConfiguration clone() {
        try {
            return (CloudWatchLogsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.CloudWatchLogsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
