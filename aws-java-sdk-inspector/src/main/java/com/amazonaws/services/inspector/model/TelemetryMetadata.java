/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata about the Amazon Inspector application data metrics collected by the agent. This data type is used as
 * the response element in the <a>GetTelemetryMetadata</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/TelemetryMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TelemetryMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A specific type of behavioral data that is collected by the agent.
     * </p>
     */
    private String messageType;
    /**
     * <p>
     * The count of messages that the agent sends to the Amazon Inspector service.
     * </p>
     */
    private Long count;
    /**
     * <p>
     * The data size of messages that the agent sends to the Amazon Inspector service.
     * </p>
     */
    private Long dataSize;

    /**
     * <p>
     * A specific type of behavioral data that is collected by the agent.
     * </p>
     * 
     * @param messageType
     *        A specific type of behavioral data that is collected by the agent.
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * A specific type of behavioral data that is collected by the agent.
     * </p>
     * 
     * @return A specific type of behavioral data that is collected by the agent.
     */

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * <p>
     * A specific type of behavioral data that is collected by the agent.
     * </p>
     * 
     * @param messageType
     *        A specific type of behavioral data that is collected by the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TelemetryMetadata withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * <p>
     * The count of messages that the agent sends to the Amazon Inspector service.
     * </p>
     * 
     * @param count
     *        The count of messages that the agent sends to the Amazon Inspector service.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The count of messages that the agent sends to the Amazon Inspector service.
     * </p>
     * 
     * @return The count of messages that the agent sends to the Amazon Inspector service.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * The count of messages that the agent sends to the Amazon Inspector service.
     * </p>
     * 
     * @param count
     *        The count of messages that the agent sends to the Amazon Inspector service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TelemetryMetadata withCount(Long count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The data size of messages that the agent sends to the Amazon Inspector service.
     * </p>
     * 
     * @param dataSize
     *        The data size of messages that the agent sends to the Amazon Inspector service.
     */

    public void setDataSize(Long dataSize) {
        this.dataSize = dataSize;
    }

    /**
     * <p>
     * The data size of messages that the agent sends to the Amazon Inspector service.
     * </p>
     * 
     * @return The data size of messages that the agent sends to the Amazon Inspector service.
     */

    public Long getDataSize() {
        return this.dataSize;
    }

    /**
     * <p>
     * The data size of messages that the agent sends to the Amazon Inspector service.
     * </p>
     * 
     * @param dataSize
     *        The data size of messages that the agent sends to the Amazon Inspector service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TelemetryMetadata withDataSize(Long dataSize) {
        setDataSize(dataSize);
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
        if (getMessageType() != null)
            sb.append("MessageType: ").append(getMessageType()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getDataSize() != null)
            sb.append("DataSize: ").append(getDataSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TelemetryMetadata == false)
            return false;
        TelemetryMetadata other = (TelemetryMetadata) obj;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getDataSize() == null ^ this.getDataSize() == null)
            return false;
        if (other.getDataSize() != null && other.getDataSize().equals(this.getDataSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getDataSize() == null) ? 0 : getDataSize().hashCode());
        return hashCode;
    }

    @Override
    public TelemetryMetadata clone() {
        try {
            return (TelemetryMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.TelemetryMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
