/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * ExtraParam includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ExtraParam" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExtraParam implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the additional parameter required by the top-level domain.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Values corresponding to the additional parameter names required by some top-level domains.
     * </p>
     */
    private String value;

    /**
     * <p>
     * Name of the additional parameter required by the top-level domain.
     * </p>
     * 
     * @param name
     *        Name of the additional parameter required by the top-level domain.
     * @see ExtraParamName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the additional parameter required by the top-level domain.
     * </p>
     * 
     * @return Name of the additional parameter required by the top-level domain.
     * @see ExtraParamName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the additional parameter required by the top-level domain.
     * </p>
     * 
     * @param name
     *        Name of the additional parameter required by the top-level domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtraParamName
     */

    public ExtraParam withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Name of the additional parameter required by the top-level domain.
     * </p>
     * 
     * @param name
     *        Name of the additional parameter required by the top-level domain.
     * @see ExtraParamName
     */

    public void setName(ExtraParamName name) {
        withName(name);
    }

    /**
     * <p>
     * Name of the additional parameter required by the top-level domain.
     * </p>
     * 
     * @param name
     *        Name of the additional parameter required by the top-level domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtraParamName
     */

    public ExtraParam withName(ExtraParamName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * Values corresponding to the additional parameter names required by some top-level domains.
     * </p>
     * 
     * @param value
     *        Values corresponding to the additional parameter names required by some top-level domains.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Values corresponding to the additional parameter names required by some top-level domains.
     * </p>
     * 
     * @return Values corresponding to the additional parameter names required by some top-level domains.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Values corresponding to the additional parameter names required by some top-level domains.
     * </p>
     * 
     * @param value
     *        Values corresponding to the additional parameter names required by some top-level domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtraParam withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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

        if (obj instanceof ExtraParam == false)
            return false;
        ExtraParam other = (ExtraParam) obj;
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
    public ExtraParam clone() {
        try {
            return (ExtraParam) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53domains.model.transform.ExtraParamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
