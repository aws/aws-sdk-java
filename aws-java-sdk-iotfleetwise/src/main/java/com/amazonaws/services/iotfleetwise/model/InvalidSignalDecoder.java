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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A reason that a signal decoder isn't valid.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/InvalidSignalDecoder" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidSignalDecoder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a signal decoder that isn't valid.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A message about why the signal decoder isn't valid.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The name of a signal decoder that isn't valid.
     * </p>
     * 
     * @param name
     *        The name of a signal decoder that isn't valid.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a signal decoder that isn't valid.
     * </p>
     * 
     * @return The name of a signal decoder that isn't valid.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a signal decoder that isn't valid.
     * </p>
     * 
     * @param name
     *        The name of a signal decoder that isn't valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidSignalDecoder withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A message about why the signal decoder isn't valid.
     * </p>
     * 
     * @param reason
     *        A message about why the signal decoder isn't valid.
     * @see SignalDecoderFailureReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A message about why the signal decoder isn't valid.
     * </p>
     * 
     * @return A message about why the signal decoder isn't valid.
     * @see SignalDecoderFailureReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A message about why the signal decoder isn't valid.
     * </p>
     * 
     * @param reason
     *        A message about why the signal decoder isn't valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SignalDecoderFailureReason
     */

    public InvalidSignalDecoder withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * A message about why the signal decoder isn't valid.
     * </p>
     * 
     * @param reason
     *        A message about why the signal decoder isn't valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SignalDecoderFailureReason
     */

    public InvalidSignalDecoder withReason(SignalDecoderFailureReason reason) {
        this.reason = reason.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvalidSignalDecoder == false)
            return false;
        InvalidSignalDecoder other = (InvalidSignalDecoder) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public InvalidSignalDecoder clone() {
        try {
            return (InvalidSignalDecoder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.InvalidSignalDecoderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
