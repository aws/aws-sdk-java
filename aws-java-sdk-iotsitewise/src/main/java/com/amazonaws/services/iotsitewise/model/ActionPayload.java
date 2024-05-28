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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The JSON payload of the action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ActionPayload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionPayload implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The payload of the action in a JSON string.
     * </p>
     */
    private String stringValue;

    /**
     * <p>
     * The payload of the action in a JSON string.
     * </p>
     * 
     * @param stringValue
     *        The payload of the action in a JSON string.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * The payload of the action in a JSON string.
     * </p>
     * 
     * @return The payload of the action in a JSON string.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * The payload of the action in a JSON string.
     * </p>
     * 
     * @param stringValue
     *        The payload of the action in a JSON string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionPayload withStringValue(String stringValue) {
        setStringValue(stringValue);
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
        if (getStringValue() != null)
            sb.append("StringValue: ").append(getStringValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionPayload == false)
            return false;
        ActionPayload other = (ActionPayload) obj;
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        return hashCode;
    }

    @Override
    public ActionPayload clone() {
        try {
            return (ActionPayload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.ActionPayloadMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
