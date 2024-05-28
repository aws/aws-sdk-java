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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A search filter in Amazon DataZone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A search filter attribute in Amazon DataZone.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * A search filter value in Amazon DataZone.
     * </p>
     */
    private String value;

    /**
     * <p>
     * A search filter attribute in Amazon DataZone.
     * </p>
     * 
     * @param attribute
     *        A search filter attribute in Amazon DataZone.
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * A search filter attribute in Amazon DataZone.
     * </p>
     * 
     * @return A search filter attribute in Amazon DataZone.
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * A search filter attribute in Amazon DataZone.
     * </p>
     * 
     * @param attribute
     *        A search filter attribute in Amazon DataZone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * A search filter value in Amazon DataZone.
     * </p>
     * 
     * @param value
     *        A search filter value in Amazon DataZone.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A search filter value in Amazon DataZone.
     * </p>
     * 
     * @return A search filter value in Amazon DataZone.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A search filter value in Amazon DataZone.
     * </p>
     * 
     * @param value
     *        A search filter value in Amazon DataZone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValue(String value) {
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
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

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
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

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
