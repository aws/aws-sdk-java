/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Logging configuration of the SIP media application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/SipMediaApplicationLoggingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SipMediaApplicationLoggingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables application message logs for the SIP media application.
     * </p>
     */
    private Boolean enableSipMediaApplicationMessageLogs;

    /**
     * <p>
     * Enables application message logs for the SIP media application.
     * </p>
     * 
     * @param enableSipMediaApplicationMessageLogs
     *        Enables application message logs for the SIP media application.
     */

    public void setEnableSipMediaApplicationMessageLogs(Boolean enableSipMediaApplicationMessageLogs) {
        this.enableSipMediaApplicationMessageLogs = enableSipMediaApplicationMessageLogs;
    }

    /**
     * <p>
     * Enables application message logs for the SIP media application.
     * </p>
     * 
     * @return Enables application message logs for the SIP media application.
     */

    public Boolean getEnableSipMediaApplicationMessageLogs() {
        return this.enableSipMediaApplicationMessageLogs;
    }

    /**
     * <p>
     * Enables application message logs for the SIP media application.
     * </p>
     * 
     * @param enableSipMediaApplicationMessageLogs
     *        Enables application message logs for the SIP media application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipMediaApplicationLoggingConfiguration withEnableSipMediaApplicationMessageLogs(Boolean enableSipMediaApplicationMessageLogs) {
        setEnableSipMediaApplicationMessageLogs(enableSipMediaApplicationMessageLogs);
        return this;
    }

    /**
     * <p>
     * Enables application message logs for the SIP media application.
     * </p>
     * 
     * @return Enables application message logs for the SIP media application.
     */

    public Boolean isEnableSipMediaApplicationMessageLogs() {
        return this.enableSipMediaApplicationMessageLogs;
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
        if (getEnableSipMediaApplicationMessageLogs() != null)
            sb.append("EnableSipMediaApplicationMessageLogs: ").append(getEnableSipMediaApplicationMessageLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SipMediaApplicationLoggingConfiguration == false)
            return false;
        SipMediaApplicationLoggingConfiguration other = (SipMediaApplicationLoggingConfiguration) obj;
        if (other.getEnableSipMediaApplicationMessageLogs() == null ^ this.getEnableSipMediaApplicationMessageLogs() == null)
            return false;
        if (other.getEnableSipMediaApplicationMessageLogs() != null
                && other.getEnableSipMediaApplicationMessageLogs().equals(this.getEnableSipMediaApplicationMessageLogs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableSipMediaApplicationMessageLogs() == null) ? 0 : getEnableSipMediaApplicationMessageLogs().hashCode());
        return hashCode;
    }

    @Override
    public SipMediaApplicationLoggingConfiguration clone() {
        try {
            return (SipMediaApplicationLoggingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.SipMediaApplicationLoggingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
