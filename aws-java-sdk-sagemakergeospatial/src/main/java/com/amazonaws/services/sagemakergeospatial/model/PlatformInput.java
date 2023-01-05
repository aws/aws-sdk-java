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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/PlatformInput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlatformInput implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String comparisonOperator;
    /**
     * <p>
     * The value of the platform.
     * </p>
     */
    private String value;

    /**
     * <p/>
     * 
     * @param comparisonOperator
     * @see ComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p/>
     * 
     * @return
     * @see ComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p/>
     * 
     * @param comparisonOperator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public PlatformInput withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p/>
     * 
     * @param comparisonOperator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public PlatformInput withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * The value of the platform.
     * </p>
     * 
     * @param value
     *        The value of the platform.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the platform.
     * </p>
     * 
     * @return The value of the platform.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the platform.
     * </p>
     * 
     * @param value
     *        The value of the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformInput withValue(String value) {
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
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
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

        if (obj instanceof PlatformInput == false)
            return false;
        PlatformInput other = (PlatformInput) obj;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
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

        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public PlatformInput clone() {
        try {
            return (PlatformInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.PlatformInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
