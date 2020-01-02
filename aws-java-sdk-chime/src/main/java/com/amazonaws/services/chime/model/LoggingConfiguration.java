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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The logging configuration associated with an Amazon Chime Voice Connector. Specifies whether SIP message logs are
 * enabled for sending to Amazon CloudWatch Logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/LoggingConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
     * </p>
     */
    private Boolean enableSIPLogs;

    /**
     * <p>
     * When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param enableSIPLogs
     *        When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
     */

    public void setEnableSIPLogs(Boolean enableSIPLogs) {
        this.enableSIPLogs = enableSIPLogs;
    }

    /**
     * <p>
     * When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
     */

    public Boolean getEnableSIPLogs() {
        return this.enableSIPLogs;
    }

    /**
     * <p>
     * When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param enableSIPLogs
     *        When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withEnableSIPLogs(Boolean enableSIPLogs) {
        setEnableSIPLogs(enableSIPLogs);
        return this;
    }

    /**
     * <p>
     * When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
     */

    public Boolean isEnableSIPLogs() {
        return this.enableSIPLogs;
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
            sb.append("EnableSIPLogs: ").append(getEnableSIPLogs());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableSIPLogs() == null) ? 0 : getEnableSIPLogs().hashCode());
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
        com.amazonaws.services.chime.model.transform.LoggingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
