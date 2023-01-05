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
 * The option that determines the decimal places configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DecimalPlacesConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecimalPlacesConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The values of the decimal places.
     * </p>
     */
    private Long decimalPlaces;

    /**
     * <p>
     * The values of the decimal places.
     * </p>
     * 
     * @param decimalPlaces
     *        The values of the decimal places.
     */

    public void setDecimalPlaces(Long decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    /**
     * <p>
     * The values of the decimal places.
     * </p>
     * 
     * @return The values of the decimal places.
     */

    public Long getDecimalPlaces() {
        return this.decimalPlaces;
    }

    /**
     * <p>
     * The values of the decimal places.
     * </p>
     * 
     * @param decimalPlaces
     *        The values of the decimal places.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecimalPlacesConfiguration withDecimalPlaces(Long decimalPlaces) {
        setDecimalPlaces(decimalPlaces);
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
        if (getDecimalPlaces() != null)
            sb.append("DecimalPlaces: ").append(getDecimalPlaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecimalPlacesConfiguration == false)
            return false;
        DecimalPlacesConfiguration other = (DecimalPlacesConfiguration) obj;
        if (other.getDecimalPlaces() == null ^ this.getDecimalPlaces() == null)
            return false;
        if (other.getDecimalPlaces() != null && other.getDecimalPlaces().equals(this.getDecimalPlaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDecimalPlaces() == null) ? 0 : getDecimalPlaces().hashCode());
        return hashCode;
    }

    @Override
    public DecimalPlacesConfiguration clone() {
        try {
            return (DecimalPlacesConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DecimalPlacesConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
