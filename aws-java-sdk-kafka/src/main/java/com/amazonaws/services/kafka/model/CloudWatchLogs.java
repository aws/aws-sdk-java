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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CloudWatchLogs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLogs implements Serializable, Cloneable, StructuredPojo {

    private Boolean enabled;

    private String logGroup;

    /**
     * @param enabled
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * @return
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @param enabled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogs withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * @return
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * @param logGroup
     */

    public void setLogGroup(String logGroup) {
        this.logGroup = logGroup;
    }

    /**
     * @return
     */

    public String getLogGroup() {
        return this.logGroup;
    }

    /**
     * @param logGroup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogs withLogGroup(String logGroup) {
        setLogGroup(logGroup);
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
        if (getLogGroup() != null)
            sb.append("LogGroup: ").append(getLogGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLogs == false)
            return false;
        CloudWatchLogs other = (CloudWatchLogs) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getLogGroup() == null ^ this.getLogGroup() == null)
            return false;
        if (other.getLogGroup() != null && other.getLogGroup().equals(this.getLogGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getLogGroup() == null) ? 0 : getLogGroup().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchLogs clone() {
        try {
            return (CloudWatchLogs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.CloudWatchLogsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
