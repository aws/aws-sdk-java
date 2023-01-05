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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The settings for delivering connector logs to Amazon CloudWatch Logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CloudWatchLogsLogDelivery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLogsLogDelivery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether log delivery to Amazon CloudWatch Logs is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The name of the CloudWatch log group that is the destination for log delivery.
     * </p>
     */
    private String logGroup;

    /**
     * <p>
     * Whether log delivery to Amazon CloudWatch Logs is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether log delivery to Amazon CloudWatch Logs is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether log delivery to Amazon CloudWatch Logs is enabled.
     * </p>
     * 
     * @return Whether log delivery to Amazon CloudWatch Logs is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether log delivery to Amazon CloudWatch Logs is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether log delivery to Amazon CloudWatch Logs is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsLogDelivery withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether log delivery to Amazon CloudWatch Logs is enabled.
     * </p>
     * 
     * @return Whether log delivery to Amazon CloudWatch Logs is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The name of the CloudWatch log group that is the destination for log delivery.
     * </p>
     * 
     * @param logGroup
     *        The name of the CloudWatch log group that is the destination for log delivery.
     */

    public void setLogGroup(String logGroup) {
        this.logGroup = logGroup;
    }

    /**
     * <p>
     * The name of the CloudWatch log group that is the destination for log delivery.
     * </p>
     * 
     * @return The name of the CloudWatch log group that is the destination for log delivery.
     */

    public String getLogGroup() {
        return this.logGroup;
    }

    /**
     * <p>
     * The name of the CloudWatch log group that is the destination for log delivery.
     * </p>
     * 
     * @param logGroup
     *        The name of the CloudWatch log group that is the destination for log delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsLogDelivery withLogGroup(String logGroup) {
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

        if (obj instanceof CloudWatchLogsLogDelivery == false)
            return false;
        CloudWatchLogsLogDelivery other = (CloudWatchLogsLogDelivery) obj;
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
    public CloudWatchLogsLogDelivery clone() {
        try {
            return (CloudWatchLogsLogDelivery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.CloudWatchLogsLogDeliveryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
