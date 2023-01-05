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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An infrastructure as code defined resource output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/Output" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Output implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The output key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The output value.
     * </p>
     */
    private String valueString;

    /**
     * <p>
     * The output key.
     * </p>
     * 
     * @param key
     *        The output key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The output key.
     * </p>
     * 
     * @return The output key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The output key.
     * </p>
     * 
     * @param key
     *        The output key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The output value.
     * </p>
     * 
     * @param valueString
     *        The output value.
     */

    public void setValueString(String valueString) {
        this.valueString = valueString;
    }

    /**
     * <p>
     * The output value.
     * </p>
     * 
     * @return The output value.
     */

    public String getValueString() {
        return this.valueString;
    }

    /**
     * <p>
     * The output value.
     * </p>
     * 
     * @param valueString
     *        The output value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withValueString(String valueString) {
        setValueString(valueString);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValueString() != null)
            sb.append("ValueString: ").append(getValueString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Output == false)
            return false;
        Output other = (Output) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValueString() == null ^ this.getValueString() == null)
            return false;
        if (other.getValueString() != null && other.getValueString().equals(this.getValueString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValueString() == null) ? 0 : getValueString().hashCode());
        return hashCode;
    }

    @Override
    public Output clone() {
        try {
            return (Output) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.OutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
