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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A value or list of parameter values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ParameterValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the parameter value.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The field value, expressed as a String.
     * </p>
     */
    private String stringValue;

    /**
     * <p>
     * The ID of the parameter value.
     * </p>
     * 
     * @param id
     *        The ID of the parameter value.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the parameter value.
     * </p>
     * 
     * @return The ID of the parameter value.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the parameter value.
     * </p>
     * 
     * @param id
     *        The ID of the parameter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterValue withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The field value, expressed as a String.
     * </p>
     * 
     * @param stringValue
     *        The field value, expressed as a String.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * The field value, expressed as a String.
     * </p>
     * 
     * @return The field value, expressed as a String.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * The field value, expressed as a String.
     * </p>
     * 
     * @param stringValue
     *        The field value, expressed as a String.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterValue withStringValue(String stringValue) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof ParameterValue == false)
            return false;
        ParameterValue other = (ParameterValue) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        return hashCode;
    }

    @Override
    public ParameterValue clone() {
        try {
            return (ParameterValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datapipeline.model.transform.ParameterValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
