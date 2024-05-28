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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The logging configuration associated with an Amazon Chime SDK Voice Connector. Specifies whether SIP message logs can
 * be sent to Amazon CloudWatch Logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/LoggingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Boolean that enables sending SIP message logs to Amazon CloudWatch.
     * </p>
     */
    private Boolean enableSIPLogs;
    /**
     * <p>
     * Enables or disables media metrics logging.
     * </p>
     */
    private Boolean enableMediaMetricLogs;

    /**
     * <p>
     * Boolean that enables sending SIP message logs to Amazon CloudWatch.
     * </p>
     * 
     * @param enableSIPLogs
     *        Boolean that enables sending SIP message logs to Amazon CloudWatch.
     */

    public void setEnableSIPLogs(Boolean enableSIPLogs) {
        this.enableSIPLogs = enableSIPLogs;
    }

    /**
     * <p>
     * Boolean that enables sending SIP message logs to Amazon CloudWatch.
     * </p>
     * 
     * @return Boolean that enables sending SIP message logs to Amazon CloudWatch.
     */

    public Boolean getEnableSIPLogs() {
        return this.enableSIPLogs;
    }

    /**
     * <p>
     * Boolean that enables sending SIP message logs to Amazon CloudWatch.
     * </p>
     * 
     * @param enableSIPLogs
     *        Boolean that enables sending SIP message logs to Amazon CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withEnableSIPLogs(Boolean enableSIPLogs) {
        setEnableSIPLogs(enableSIPLogs);
        return this;
    }

    /**
     * <p>
     * Boolean that enables sending SIP message logs to Amazon CloudWatch.
     * </p>
     * 
     * @return Boolean that enables sending SIP message logs to Amazon CloudWatch.
     */

    public Boolean isEnableSIPLogs() {
        return this.enableSIPLogs;
    }

    /**
     * <p>
     * Enables or disables media metrics logging.
     * </p>
     * 
     * @param enableMediaMetricLogs
     *        Enables or disables media metrics logging.
     */

    public void setEnableMediaMetricLogs(Boolean enableMediaMetricLogs) {
        this.enableMediaMetricLogs = enableMediaMetricLogs;
    }

    /**
     * <p>
     * Enables or disables media metrics logging.
     * </p>
     * 
     * @return Enables or disables media metrics logging.
     */

    public Boolean getEnableMediaMetricLogs() {
        return this.enableMediaMetricLogs;
    }

    /**
     * <p>
     * Enables or disables media metrics logging.
     * </p>
     * 
     * @param enableMediaMetricLogs
     *        Enables or disables media metrics logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withEnableMediaMetricLogs(Boolean enableMediaMetricLogs) {
        setEnableMediaMetricLogs(enableMediaMetricLogs);
        return this;
    }

    /**
     * <p>
     * Enables or disables media metrics logging.
     * </p>
     * 
     * @return Enables or disables media metrics logging.
     */

    public Boolean isEnableMediaMetricLogs() {
        return this.enableMediaMetricLogs;
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
        if (getEnableSIPLogs() != null)
            sb.append("EnableSIPLogs: ").append(getEnableSIPLogs()).append(",");
        if (getEnableMediaMetricLogs() != null)
            sb.append("EnableMediaMetricLogs: ").append(getEnableMediaMetricLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfiguration == false)
            return false;
        LoggingConfiguration other = (LoggingConfiguration) obj;
        if (other.getEnableSIPLogs() == null ^ this.getEnableSIPLogs() == null)
            return false;
        if (other.getEnableSIPLogs() != null && other.getEnableSIPLogs().equals(this.getEnableSIPLogs()) == false)
            return false;
        if (other.getEnableMediaMetricLogs() == null ^ this.getEnableMediaMetricLogs() == null)
            return false;
        if (other.getEnableMediaMetricLogs() != null && other.getEnableMediaMetricLogs().equals(this.getEnableMediaMetricLogs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableSIPLogs() == null) ? 0 : getEnableSIPLogs().hashCode());
        hashCode = prime * hashCode + ((getEnableMediaMetricLogs() == null) ? 0 : getEnableMediaMetricLogs().hashCode());
        return hashCode;
    }

    @Override
    public LoggingConfiguration clone() {
        try {
            return (LoggingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.LoggingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
