/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A rule that compares an input property value to a threshold value with a comparison operator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/SimpleRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimpleRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value on the left side of the comparison operator. You can specify an AWS IoT Events input attribute as an
     * input property.
     * </p>
     */
    private String inputProperty;
    /**
     * <p>
     * The comparison operator.
     * </p>
     */
    private String comparisonOperator;
    /**
     * <p>
     * The value on the right side of the comparison operator. You can enter a number or specify an AWS IoT Events input
     * attribute.
     * </p>
     */
    private String threshold;

    /**
     * <p>
     * The value on the left side of the comparison operator. You can specify an AWS IoT Events input attribute as an
     * input property.
     * </p>
     * 
     * @param inputProperty
     *        The value on the left side of the comparison operator. You can specify an AWS IoT Events input attribute
     *        as an input property.
     */

    public void setInputProperty(String inputProperty) {
        this.inputProperty = inputProperty;
    }

    /**
     * <p>
     * The value on the left side of the comparison operator. You can specify an AWS IoT Events input attribute as an
     * input property.
     * </p>
     * 
     * @return The value on the left side of the comparison operator. You can specify an AWS IoT Events input attribute
     *         as an input property.
     */

    public String getInputProperty() {
        return this.inputProperty;
    }

    /**
     * <p>
     * The value on the left side of the comparison operator. You can specify an AWS IoT Events input attribute as an
     * input property.
     * </p>
     * 
     * @param inputProperty
     *        The value on the left side of the comparison operator. You can specify an AWS IoT Events input attribute
     *        as an input property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleRule withInputProperty(String inputProperty) {
        setInputProperty(inputProperty);
        return this;
    }

    /**
     * <p>
     * The comparison operator.
     * </p>
     * 
     * @param comparisonOperator
     *        The comparison operator.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The comparison operator.
     * </p>
     * 
     * @return The comparison operator.
     * @see ComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * The comparison operator.
     * </p>
     * 
     * @param comparisonOperator
     *        The comparison operator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public SimpleRule withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * The comparison operator.
     * </p>
     * 
     * @param comparisonOperator
     *        The comparison operator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public SimpleRule withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * The value on the right side of the comparison operator. You can enter a number or specify an AWS IoT Events input
     * attribute.
     * </p>
     * 
     * @param threshold
     *        The value on the right side of the comparison operator. You can enter a number or specify an AWS IoT
     *        Events input attribute.
     */

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The value on the right side of the comparison operator. You can enter a number or specify an AWS IoT Events input
     * attribute.
     * </p>
     * 
     * @return The value on the right side of the comparison operator. You can enter a number or specify an AWS IoT
     *         Events input attribute.
     */

    public String getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The value on the right side of the comparison operator. You can enter a number or specify an AWS IoT Events input
     * attribute.
     * </p>
     * 
     * @param threshold
     *        The value on the right side of the comparison operator. You can enter a number or specify an AWS IoT
     *        Events input attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleRule withThreshold(String threshold) {
        setThreshold(threshold);
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
        if (getInputProperty() != null)
            sb.append("InputProperty: ").append(getInputProperty()).append(",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimpleRule == false)
            return false;
        SimpleRule other = (SimpleRule) obj;
        if (other.getInputProperty() == null ^ this.getInputProperty() == null)
            return false;
        if (other.getInputProperty() != null && other.getInputProperty().equals(this.getInputProperty()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputProperty() == null) ? 0 : getInputProperty().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        return hashCode;
    }

    @Override
    public SimpleRule clone() {
        try {
            return (SimpleRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.SimpleRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
