/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specify the configurations you want to use for subscriber notification to notify the subscriber when new data is
 * written to the data lake for sources that the subscriber consumes in Security Lake.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/NotificationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configurations for HTTPS subscriber notification.
     * </p>
     */
    private HttpsNotificationConfiguration httpsNotificationConfiguration;
    /**
     * <p>
     * The configurations for SQS subscriber notification.
     * </p>
     */
    private SqsNotificationConfiguration sqsNotificationConfiguration;

    /**
     * <p>
     * The configurations for HTTPS subscriber notification.
     * </p>
     * 
     * @param httpsNotificationConfiguration
     *        The configurations for HTTPS subscriber notification.
     */

    public void setHttpsNotificationConfiguration(HttpsNotificationConfiguration httpsNotificationConfiguration) {
        this.httpsNotificationConfiguration = httpsNotificationConfiguration;
    }

    /**
     * <p>
     * The configurations for HTTPS subscriber notification.
     * </p>
     * 
     * @return The configurations for HTTPS subscriber notification.
     */

    public HttpsNotificationConfiguration getHttpsNotificationConfiguration() {
        return this.httpsNotificationConfiguration;
    }

    /**
     * <p>
     * The configurations for HTTPS subscriber notification.
     * </p>
     * 
     * @param httpsNotificationConfiguration
     *        The configurations for HTTPS subscriber notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationConfiguration withHttpsNotificationConfiguration(HttpsNotificationConfiguration httpsNotificationConfiguration) {
        setHttpsNotificationConfiguration(httpsNotificationConfiguration);
        return this;
    }

    /**
     * <p>
     * The configurations for SQS subscriber notification.
     * </p>
     * 
     * @param sqsNotificationConfiguration
     *        The configurations for SQS subscriber notification.
     */

    public void setSqsNotificationConfiguration(SqsNotificationConfiguration sqsNotificationConfiguration) {
        this.sqsNotificationConfiguration = sqsNotificationConfiguration;
    }

    /**
     * <p>
     * The configurations for SQS subscriber notification.
     * </p>
     * 
     * @return The configurations for SQS subscriber notification.
     */

    public SqsNotificationConfiguration getSqsNotificationConfiguration() {
        return this.sqsNotificationConfiguration;
    }

    /**
     * <p>
     * The configurations for SQS subscriber notification.
     * </p>
     * 
     * @param sqsNotificationConfiguration
     *        The configurations for SQS subscriber notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationConfiguration withSqsNotificationConfiguration(SqsNotificationConfiguration sqsNotificationConfiguration) {
        setSqsNotificationConfiguration(sqsNotificationConfiguration);
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
        if (getHttpsNotificationConfiguration() != null)
            sb.append("HttpsNotificationConfiguration: ").append(getHttpsNotificationConfiguration()).append(",");
        if (getSqsNotificationConfiguration() != null)
            sb.append("SqsNotificationConfiguration: ").append(getSqsNotificationConfiguration());
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
        if (other.getHttpsNotificationConfiguration() == null ^ this.getHttpsNotificationConfiguration() == null)
            return false;
        if (other.getHttpsNotificationConfiguration() != null
                && other.getHttpsNotificationConfiguration().equals(this.getHttpsNotificationConfiguration()) == false)
            return false;
        if (other.getSqsNotificationConfiguration() == null ^ this.getSqsNotificationConfiguration() == null)
            return false;
        if (other.getSqsNotificationConfiguration() != null && other.getSqsNotificationConfiguration().equals(this.getSqsNotificationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpsNotificationConfiguration() == null) ? 0 : getHttpsNotificationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSqsNotificationConfiguration() == null) ? 0 : getSqsNotificationConfiguration().hashCode());
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
        com.amazonaws.services.securitylake.model.transform.NotificationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
