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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the summary of an event variable that was evaluated for generating prediction.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/EventVariableSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventVariableSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The event variable name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the event variable.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The event variable source.
     * </p>
     */
    private String source;

    /**
     * <p>
     * The event variable name.
     * </p>
     * 
     * @param name
     *        The event variable name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The event variable name.
     * </p>
     * 
     * @return The event variable name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The event variable name.
     * </p>
     * 
     * @param name
     *        The event variable name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventVariableSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of the event variable.
     * </p>
     * 
     * @param value
     *        The value of the event variable.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the event variable.
     * </p>
     * 
     * @return The value of the event variable.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the event variable.
     * </p>
     * 
     * @param value
     *        The value of the event variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventVariableSummary withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The event variable source.
     * </p>
     * 
     * @param source
     *        The event variable source.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The event variable source.
     * </p>
     * 
     * @return The event variable source.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The event variable source.
     * </p>
     * 
     * @param source
     *        The event variable source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventVariableSummary withSource(String source) {
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getValue() != null)
            sb.append("Value: ").append("***Sensitive Data Redacted***").append(",");
        if (getSource() != null)
            sb.append("Source: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventVariableSummary == false)
            return false;
        EventVariableSummary other = (EventVariableSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public EventVariableSummary clone() {
        try {
            return (EventVariableSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.EventVariableSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
