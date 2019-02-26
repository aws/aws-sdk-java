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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The HITLayoutParameter data structure defines parameter values used with a HITLayout. A HITLayout is a reusable
 * Amazon Mechanical Turk project template used to provide Human Intelligence Task (HIT) question data for CreateHIT.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/HITLayoutParameter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HITLayoutParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter in the HITLayout.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value substituted for the parameter referenced in the HITLayout.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the parameter in the HITLayout.
     * </p>
     * 
     * @param name
     *        The name of the parameter in the HITLayout.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter in the HITLayout.
     * </p>
     * 
     * @return The name of the parameter in the HITLayout.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter in the HITLayout.
     * </p>
     * 
     * @param name
     *        The name of the parameter in the HITLayout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HITLayoutParameter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value substituted for the parameter referenced in the HITLayout.
     * </p>
     * 
     * @param value
     *        The value substituted for the parameter referenced in the HITLayout.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value substituted for the parameter referenced in the HITLayout.
     * </p>
     * 
     * @return The value substituted for the parameter referenced in the HITLayout.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value substituted for the parameter referenced in the HITLayout.
     * </p>
     * 
     * @param value
     *        The value substituted for the parameter referenced in the HITLayout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HITLayoutParameter withValue(String value) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof HITLayoutParameter == false)
            return false;
        HITLayoutParameter other = (HITLayoutParameter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public HITLayoutParameter clone() {
        try {
            return (HITLayoutParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.HITLayoutParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
