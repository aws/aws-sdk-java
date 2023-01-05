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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of adding parameters in action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SetParameterValueConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetParameterValueConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The destination parameter name of the <code>SetParameterValueConfiguration</code>.
     * </p>
     */
    private String destinationParameterName;

    private DestinationParameterValueConfiguration value;

    /**
     * <p>
     * The destination parameter name of the <code>SetParameterValueConfiguration</code>.
     * </p>
     * 
     * @param destinationParameterName
     *        The destination parameter name of the <code>SetParameterValueConfiguration</code>.
     */

    public void setDestinationParameterName(String destinationParameterName) {
        this.destinationParameterName = destinationParameterName;
    }

    /**
     * <p>
     * The destination parameter name of the <code>SetParameterValueConfiguration</code>.
     * </p>
     * 
     * @return The destination parameter name of the <code>SetParameterValueConfiguration</code>.
     */

    public String getDestinationParameterName() {
        return this.destinationParameterName;
    }

    /**
     * <p>
     * The destination parameter name of the <code>SetParameterValueConfiguration</code>.
     * </p>
     * 
     * @param destinationParameterName
     *        The destination parameter name of the <code>SetParameterValueConfiguration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetParameterValueConfiguration withDestinationParameterName(String destinationParameterName) {
        setDestinationParameterName(destinationParameterName);
        return this;
    }

    /**
     * @param value
     */

    public void setValue(DestinationParameterValueConfiguration value) {
        this.value = value;
    }

    /**
     * @return
     */

    public DestinationParameterValueConfiguration getValue() {
        return this.value;
    }

    /**
     * @param value
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetParameterValueConfiguration withValue(DestinationParameterValueConfiguration value) {
        setValue(value);
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
        if (getDestinationParameterName() != null)
            sb.append("DestinationParameterName: ").append(getDestinationParameterName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetParameterValueConfiguration == false)
            return false;
        SetParameterValueConfiguration other = (SetParameterValueConfiguration) obj;
        if (other.getDestinationParameterName() == null ^ this.getDestinationParameterName() == null)
            return false;
        if (other.getDestinationParameterName() != null && other.getDestinationParameterName().equals(this.getDestinationParameterName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationParameterName() == null) ? 0 : getDestinationParameterName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public SetParameterValueConfiguration clone() {
        try {
            return (SetParameterValueConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SetParameterValueConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
