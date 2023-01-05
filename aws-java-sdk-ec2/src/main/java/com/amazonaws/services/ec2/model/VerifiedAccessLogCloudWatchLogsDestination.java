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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Options for CloudWatch Logs as a logging destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VerifiedAccessLogCloudWatchLogsDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessLogCloudWatchLogsDestination implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether logging is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The delivery status for access logs.
     * </p>
     */
    private VerifiedAccessLogDeliveryStatus deliveryStatus;
    /**
     * <p>
     * The ID of the CloudWatch Logs log group.
     * </p>
     */
    private String logGroup;

    /**
     * <p>
     * Indicates whether logging is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether logging is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether logging is enabled.
     * </p>
     * 
     * @return Indicates whether logging is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether logging is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether logging is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessLogCloudWatchLogsDestination withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether logging is enabled.
     * </p>
     * 
     * @return Indicates whether logging is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The delivery status for access logs.
     * </p>
     * 
     * @param deliveryStatus
     *        The delivery status for access logs.
     */

    public void setDeliveryStatus(VerifiedAccessLogDeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    /**
     * <p>
     * The delivery status for access logs.
     * </p>
     * 
     * @return The delivery status for access logs.
     */

    public VerifiedAccessLogDeliveryStatus getDeliveryStatus() {
        return this.deliveryStatus;
    }

    /**
     * <p>
     * The delivery status for access logs.
     * </p>
     * 
     * @param deliveryStatus
     *        The delivery status for access logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessLogCloudWatchLogsDestination withDeliveryStatus(VerifiedAccessLogDeliveryStatus deliveryStatus) {
        setDeliveryStatus(deliveryStatus);
        return this;
    }

    /**
     * <p>
     * The ID of the CloudWatch Logs log group.
     * </p>
     * 
     * @param logGroup
     *        The ID of the CloudWatch Logs log group.
     */

    public void setLogGroup(String logGroup) {
        this.logGroup = logGroup;
    }

    /**
     * <p>
     * The ID of the CloudWatch Logs log group.
     * </p>
     * 
     * @return The ID of the CloudWatch Logs log group.
     */

    public String getLogGroup() {
        return this.logGroup;
    }

    /**
     * <p>
     * The ID of the CloudWatch Logs log group.
     * </p>
     * 
     * @param logGroup
     *        The ID of the CloudWatch Logs log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessLogCloudWatchLogsDestination withLogGroup(String logGroup) {
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
        if (getDeliveryStatus() != null)
            sb.append("DeliveryStatus: ").append(getDeliveryStatus()).append(",");
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

        if (obj instanceof VerifiedAccessLogCloudWatchLogsDestination == false)
            return false;
        VerifiedAccessLogCloudWatchLogsDestination other = (VerifiedAccessLogCloudWatchLogsDestination) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getDeliveryStatus() == null ^ this.getDeliveryStatus() == null)
            return false;
        if (other.getDeliveryStatus() != null && other.getDeliveryStatus().equals(this.getDeliveryStatus()) == false)
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
        hashCode = prime * hashCode + ((getDeliveryStatus() == null) ? 0 : getDeliveryStatus().hashCode());
        hashCode = prime * hashCode + ((getLogGroup() == null) ? 0 : getLogGroup().hashCode());
        return hashCode;
    }

    @Override
    public VerifiedAccessLogCloudWatchLogsDestination clone() {
        try {
            return (VerifiedAccessLogCloudWatchLogsDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
