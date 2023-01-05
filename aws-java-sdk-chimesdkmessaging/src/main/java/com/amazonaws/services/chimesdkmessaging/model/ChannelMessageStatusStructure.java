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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Stores information about a message status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ChannelMessageStatusStructure"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelMessageStatusStructure implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The message status value.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Contains more details about the messasge status.
     * </p>
     */
    private String detail;

    /**
     * <p>
     * The message status value.
     * </p>
     * 
     * @param value
     *        The message status value.
     * @see ChannelMessageStatus
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The message status value.
     * </p>
     * 
     * @return The message status value.
     * @see ChannelMessageStatus
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The message status value.
     * </p>
     * 
     * @param value
     *        The message status value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMessageStatus
     */

    public ChannelMessageStatusStructure withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The message status value.
     * </p>
     * 
     * @param value
     *        The message status value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMessageStatus
     */

    public ChannelMessageStatusStructure withValue(ChannelMessageStatus value) {
        this.value = value.toString();
        return this;
    }

    /**
     * <p>
     * Contains more details about the messasge status.
     * </p>
     * 
     * @param detail
     *        Contains more details about the messasge status.
     */

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * <p>
     * Contains more details about the messasge status.
     * </p>
     * 
     * @return Contains more details about the messasge status.
     */

    public String getDetail() {
        return this.detail;
    }

    /**
     * <p>
     * Contains more details about the messasge status.
     * </p>
     * 
     * @param detail
     *        Contains more details about the messasge status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessageStatusStructure withDetail(String detail) {
        setDetail(detail);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getDetail() != null)
            sb.append("Detail: ").append(getDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelMessageStatusStructure == false)
            return false;
        ChannelMessageStatusStructure other = (ChannelMessageStatusStructure) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getDetail() == null ^ this.getDetail() == null)
            return false;
        if (other.getDetail() != null && other.getDetail().equals(this.getDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return hashCode;
    }

    @Override
    public ChannelMessageStatusStructure clone() {
        try {
            return (ChannelMessageStatusStructure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmessaging.model.transform.ChannelMessageStatusStructureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
