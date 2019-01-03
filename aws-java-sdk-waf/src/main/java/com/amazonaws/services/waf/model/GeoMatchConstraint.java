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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The country from which web requests originate that you want AWS WAF to search for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GeoMatchConstraint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeoMatchConstraint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of geographical area you want AWS WAF to search for. Currently <code>Country</code> is the only valid
     * value.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The country that you want AWS WAF to search for.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of geographical area you want AWS WAF to search for. Currently <code>Country</code> is the only valid
     * value.
     * </p>
     * 
     * @param type
     *        The type of geographical area you want AWS WAF to search for. Currently <code>Country</code> is the only
     *        valid value.
     * @see GeoMatchConstraintType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of geographical area you want AWS WAF to search for. Currently <code>Country</code> is the only valid
     * value.
     * </p>
     * 
     * @return The type of geographical area you want AWS WAF to search for. Currently <code>Country</code> is the only
     *         valid value.
     * @see GeoMatchConstraintType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of geographical area you want AWS WAF to search for. Currently <code>Country</code> is the only valid
     * value.
     * </p>
     * 
     * @param type
     *        The type of geographical area you want AWS WAF to search for. Currently <code>Country</code> is the only
     *        valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeoMatchConstraintType
     */

    public GeoMatchConstraint withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of geographical area you want AWS WAF to search for. Currently <code>Country</code> is the only valid
     * value.
     * </p>
     * 
     * @param type
     *        The type of geographical area you want AWS WAF to search for. Currently <code>Country</code> is the only
     *        valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeoMatchConstraintType
     */

    public GeoMatchConstraint withType(GeoMatchConstraintType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The country that you want AWS WAF to search for.
     * </p>
     * 
     * @param value
     *        The country that you want AWS WAF to search for.
     * @see GeoMatchConstraintValue
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The country that you want AWS WAF to search for.
     * </p>
     * 
     * @return The country that you want AWS WAF to search for.
     * @see GeoMatchConstraintValue
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The country that you want AWS WAF to search for.
     * </p>
     * 
     * @param value
     *        The country that you want AWS WAF to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeoMatchConstraintValue
     */

    public GeoMatchConstraint withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The country that you want AWS WAF to search for.
     * </p>
     * 
     * @param value
     *        The country that you want AWS WAF to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeoMatchConstraintValue
     */

    public GeoMatchConstraint withValue(GeoMatchConstraintValue value) {
        this.value = value.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof GeoMatchConstraint == false)
            return false;
        GeoMatchConstraint other = (GeoMatchConstraint) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public GeoMatchConstraint clone() {
        try {
            return (GeoMatchConstraint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.GeoMatchConstraintMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
