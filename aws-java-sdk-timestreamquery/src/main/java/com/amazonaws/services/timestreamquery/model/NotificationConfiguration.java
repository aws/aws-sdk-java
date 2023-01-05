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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Notification configuration for a scheduled query. A notification is sent by Timestream when a scheduled query is
 * created, its state is updated or when it is deleted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/NotificationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details on SNS configuration.
     * </p>
     */
    private SnsConfiguration snsConfiguration;

    /**
     * <p>
     * Details on SNS configuration.
     * </p>
     * 
     * @param snsConfiguration
     *        Details on SNS configuration.
     */

    public void setSnsConfiguration(SnsConfiguration snsConfiguration) {
        this.snsConfiguration = snsConfiguration;
    }

    /**
     * <p>
     * Details on SNS configuration.
     * </p>
     * 
     * @return Details on SNS configuration.
     */

    public SnsConfiguration getSnsConfiguration() {
        return this.snsConfiguration;
    }

    /**
     * <p>
     * Details on SNS configuration.
     * </p>
     * 
     * @param snsConfiguration
     *        Details on SNS configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationConfiguration withSnsConfiguration(SnsConfiguration snsConfiguration) {
        setSnsConfiguration(snsConfiguration);
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
        if (getSnsConfiguration() != null)
            sb.append("SnsConfiguration: ").append(getSnsConfiguration());
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
        if (other.getSnsConfiguration() == null ^ this.getSnsConfiguration() == null)
            return false;
        if (other.getSnsConfiguration() != null && other.getSnsConfiguration().equals(this.getSnsConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnsConfiguration() == null) ? 0 : getSnsConfiguration().hashCode());
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
        com.amazonaws.services.timestreamquery.model.transform.NotificationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
