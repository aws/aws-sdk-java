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
package com.amazonaws.services.scheduler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The templated target type for the EventBridge <a
 * href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html"> <code>PutEvents</code> </a>
 * API operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/EventBridgeParameters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventBridgeParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event detail.
     * </p>
     */
    private String detailType;
    /**
     * <p>
     * The source of the event.
     * </p>
     */
    private String source;

    /**
     * <p>
     * A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event detail.
     * </p>
     * 
     * @param detailType
     *        A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event
     *        detail.
     */

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    /**
     * <p>
     * A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event detail.
     * </p>
     * 
     * @return A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event
     *         detail.
     */

    public String getDetailType() {
        return this.detailType;
    }

    /**
     * <p>
     * A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event detail.
     * </p>
     * 
     * @param detailType
     *        A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event
     *        detail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventBridgeParameters withDetailType(String detailType) {
        setDetailType(detailType);
        return this;
    }

    /**
     * <p>
     * The source of the event.
     * </p>
     * 
     * @param source
     *        The source of the event.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the event.
     * </p>
     * 
     * @return The source of the event.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the event.
     * </p>
     * 
     * @param source
     *        The source of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventBridgeParameters withSource(String source) {
        setSource(source);
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
        if (getDetailType() != null)
            sb.append("DetailType: ").append(getDetailType()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventBridgeParameters == false)
            return false;
        EventBridgeParameters other = (EventBridgeParameters) obj;
        if (other.getDetailType() == null ^ this.getDetailType() == null)
            return false;
        if (other.getDetailType() != null && other.getDetailType().equals(this.getDetailType()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetailType() == null) ? 0 : getDetailType().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public EventBridgeParameters clone() {
        try {
            return (EventBridgeParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.scheduler.model.transform.EventBridgeParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
