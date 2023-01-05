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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure that contains the notification information for the KVS images delivery. If this parameter is null, the
 * configuration will be deleted from the stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/NotificationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates if a notification configuration is enabled or disabled.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The destination information required to deliver a notification to a customer.
     * </p>
     */
    private NotificationDestinationConfig destinationConfig;

    /**
     * <p>
     * Indicates if a notification configuration is enabled or disabled.
     * </p>
     * 
     * @param status
     *        Indicates if a notification configuration is enabled or disabled.
     * @see ConfigurationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates if a notification configuration is enabled or disabled.
     * </p>
     * 
     * @return Indicates if a notification configuration is enabled or disabled.
     * @see ConfigurationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates if a notification configuration is enabled or disabled.
     * </p>
     * 
     * @param status
     *        Indicates if a notification configuration is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationStatus
     */

    public NotificationConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates if a notification configuration is enabled or disabled.
     * </p>
     * 
     * @param status
     *        Indicates if a notification configuration is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationStatus
     */

    public NotificationConfiguration withStatus(ConfigurationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The destination information required to deliver a notification to a customer.
     * </p>
     * 
     * @param destinationConfig
     *        The destination information required to deliver a notification to a customer.
     */

    public void setDestinationConfig(NotificationDestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
    }

    /**
     * <p>
     * The destination information required to deliver a notification to a customer.
     * </p>
     * 
     * @return The destination information required to deliver a notification to a customer.
     */

    public NotificationDestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    /**
     * <p>
     * The destination information required to deliver a notification to a customer.
     * </p>
     * 
     * @param destinationConfig
     *        The destination information required to deliver a notification to a customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationConfiguration withDestinationConfig(NotificationDestinationConfig destinationConfig) {
        setDestinationConfig(destinationConfig);
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
        if (getDestinationConfig() != null)
            sb.append("DestinationConfig: ").append(getDestinationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationConfiguration == false)
            return false;
        NotificationConfiguration other = (NotificationConfiguration) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDestinationConfig() == null ^ this.getDestinationConfig() == null)
            return false;
        if (other.getDestinationConfig() != null && other.getDestinationConfig().equals(this.getDestinationConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDestinationConfig() == null) ? 0 : getDestinationConfig().hashCode());
        return hashCode;
    }

    @Override
    public NotificationConfiguration clone() {
        try {
            return (NotificationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.NotificationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
