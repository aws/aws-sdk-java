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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The outbound caller ID name, number, and outbound whisper flow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/OutboundCallerConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutboundCallerConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The caller ID name.
     * </p>
     */
    private String outboundCallerIdName;
    /**
     * <p>
     * The caller ID number.
     * </p>
     */
    private String outboundCallerIdNumberId;
    /**
     * <p>
     * The outbound whisper flow to be used during an outbound call.
     * </p>
     */
    private String outboundFlowId;

    /**
     * <p>
     * The caller ID name.
     * </p>
     * 
     * @param outboundCallerIdName
     *        The caller ID name.
     */

    public void setOutboundCallerIdName(String outboundCallerIdName) {
        this.outboundCallerIdName = outboundCallerIdName;
    }

    /**
     * <p>
     * The caller ID name.
     * </p>
     * 
     * @return The caller ID name.
     */

    public String getOutboundCallerIdName() {
        return this.outboundCallerIdName;
    }

    /**
     * <p>
     * The caller ID name.
     * </p>
     * 
     * @param outboundCallerIdName
     *        The caller ID name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutboundCallerConfig withOutboundCallerIdName(String outboundCallerIdName) {
        setOutboundCallerIdName(outboundCallerIdName);
        return this;
    }

    /**
     * <p>
     * The caller ID number.
     * </p>
     * 
     * @param outboundCallerIdNumberId
     *        The caller ID number.
     */

    public void setOutboundCallerIdNumberId(String outboundCallerIdNumberId) {
        this.outboundCallerIdNumberId = outboundCallerIdNumberId;
    }

    /**
     * <p>
     * The caller ID number.
     * </p>
     * 
     * @return The caller ID number.
     */

    public String getOutboundCallerIdNumberId() {
        return this.outboundCallerIdNumberId;
    }

    /**
     * <p>
     * The caller ID number.
     * </p>
     * 
     * @param outboundCallerIdNumberId
     *        The caller ID number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutboundCallerConfig withOutboundCallerIdNumberId(String outboundCallerIdNumberId) {
        setOutboundCallerIdNumberId(outboundCallerIdNumberId);
        return this;
    }

    /**
     * <p>
     * The outbound whisper flow to be used during an outbound call.
     * </p>
     * 
     * @param outboundFlowId
     *        The outbound whisper flow to be used during an outbound call.
     */

    public void setOutboundFlowId(String outboundFlowId) {
        this.outboundFlowId = outboundFlowId;
    }

    /**
     * <p>
     * The outbound whisper flow to be used during an outbound call.
     * </p>
     * 
     * @return The outbound whisper flow to be used during an outbound call.
     */

    public String getOutboundFlowId() {
        return this.outboundFlowId;
    }

    /**
     * <p>
     * The outbound whisper flow to be used during an outbound call.
     * </p>
     * 
     * @param outboundFlowId
     *        The outbound whisper flow to be used during an outbound call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutboundCallerConfig withOutboundFlowId(String outboundFlowId) {
        setOutboundFlowId(outboundFlowId);
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
        if (getOutboundCallerIdName() != null)
            sb.append("OutboundCallerIdName: ").append(getOutboundCallerIdName()).append(",");
        if (getOutboundCallerIdNumberId() != null)
            sb.append("OutboundCallerIdNumberId: ").append(getOutboundCallerIdNumberId()).append(",");
        if (getOutboundFlowId() != null)
            sb.append("OutboundFlowId: ").append(getOutboundFlowId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutboundCallerConfig == false)
            return false;
        OutboundCallerConfig other = (OutboundCallerConfig) obj;
        if (other.getOutboundCallerIdName() == null ^ this.getOutboundCallerIdName() == null)
            return false;
        if (other.getOutboundCallerIdName() != null && other.getOutboundCallerIdName().equals(this.getOutboundCallerIdName()) == false)
            return false;
        if (other.getOutboundCallerIdNumberId() == null ^ this.getOutboundCallerIdNumberId() == null)
            return false;
        if (other.getOutboundCallerIdNumberId() != null && other.getOutboundCallerIdNumberId().equals(this.getOutboundCallerIdNumberId()) == false)
            return false;
        if (other.getOutboundFlowId() == null ^ this.getOutboundFlowId() == null)
            return false;
        if (other.getOutboundFlowId() != null && other.getOutboundFlowId().equals(this.getOutboundFlowId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutboundCallerIdName() == null) ? 0 : getOutboundCallerIdName().hashCode());
        hashCode = prime * hashCode + ((getOutboundCallerIdNumberId() == null) ? 0 : getOutboundCallerIdNumberId().hashCode());
        hashCode = prime * hashCode + ((getOutboundFlowId() == null) ? 0 : getOutboundFlowId().hashCode());
        return hashCode;
    }

    @Override
    public OutboundCallerConfig clone() {
        try {
            return (OutboundCallerConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.OutboundCallerConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
