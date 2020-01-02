/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Input parameters in the form of key-value pairs for the conformance pack, both of which you define. Keys can have a
 * maximum character length of 128 characters, and values can have a maximum length of 256 characters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConformancePackInputParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConformancePackInputParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One part of a key-value pair.
     * </p>
     */
    private String parameterName;
    /**
     * <p>
     * Another part of the key-value pair.
     * </p>
     */
    private String parameterValue;

    /**
     * <p>
     * One part of a key-value pair.
     * </p>
     * 
     * @param parameterName
     *        One part of a key-value pair.
     */

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * One part of a key-value pair.
     * </p>
     * 
     * @return One part of a key-value pair.
     */

    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * <p>
     * One part of a key-value pair.
     * </p>
     * 
     * @param parameterName
     *        One part of a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackInputParameter withParameterName(String parameterName) {
        setParameterName(parameterName);
        return this;
    }

    /**
     * <p>
     * Another part of the key-value pair.
     * </p>
     * 
     * @param parameterValue
     *        Another part of the key-value pair.
     */

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    /**
     * <p>
     * Another part of the key-value pair.
     * </p>
     * 
     * @return Another part of the key-value pair.
     */

    public String getParameterValue() {
        return this.parameterValue;
    }

    /**
     * <p>
     * Another part of the key-value pair.
     * </p>
     * 
     * @param parameterValue
     *        Another part of the key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackInputParameter withParameterValue(String parameterValue) {
        setParameterValue(parameterValue);
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
        if (getParameterName() != null)
            sb.append("ParameterName: ").append(getParameterName()).append(",");
        if (getParameterValue() != null)
            sb.append("ParameterValue: ").append(getParameterValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConformancePackInputParameter == false)
            return false;
        ConformancePackInputParameter other = (ConformancePackInputParameter) obj;
        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false)
            return false;
        if (other.getParameterValue() == null ^ this.getParameterValue() == null)
            return false;
        if (other.getParameterValue() != null && other.getParameterValue().equals(this.getParameterValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode());
        return hashCode;
    }

    @Override
    public ConformancePackInputParameter clone() {
        try {
            return (ConformancePackInputParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConformancePackInputParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
