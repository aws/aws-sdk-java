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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A constant value that is used in a range filter to specify the endpoints of the range.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopicRangeFilterConstant"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicRangeFilterConstant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data type of the constant value that is used in a range filter. Valid values for this structure are
     * <code>RANGE</code>.
     * </p>
     */
    private String constantType;
    /**
     * <p>
     * The value of the constant that is used to specify the endpoints of a range filter.
     * </p>
     */
    private RangeConstant rangeConstant;

    /**
     * <p>
     * The data type of the constant value that is used in a range filter. Valid values for this structure are
     * <code>RANGE</code>.
     * </p>
     * 
     * @param constantType
     *        The data type of the constant value that is used in a range filter. Valid values for this structure are
     *        <code>RANGE</code>.
     * @see ConstantType
     */

    public void setConstantType(String constantType) {
        this.constantType = constantType;
    }

    /**
     * <p>
     * The data type of the constant value that is used in a range filter. Valid values for this structure are
     * <code>RANGE</code>.
     * </p>
     * 
     * @return The data type of the constant value that is used in a range filter. Valid values for this structure are
     *         <code>RANGE</code>.
     * @see ConstantType
     */

    public String getConstantType() {
        return this.constantType;
    }

    /**
     * <p>
     * The data type of the constant value that is used in a range filter. Valid values for this structure are
     * <code>RANGE</code>.
     * </p>
     * 
     * @param constantType
     *        The data type of the constant value that is used in a range filter. Valid values for this structure are
     *        <code>RANGE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConstantType
     */

    public TopicRangeFilterConstant withConstantType(String constantType) {
        setConstantType(constantType);
        return this;
    }

    /**
     * <p>
     * The data type of the constant value that is used in a range filter. Valid values for this structure are
     * <code>RANGE</code>.
     * </p>
     * 
     * @param constantType
     *        The data type of the constant value that is used in a range filter. Valid values for this structure are
     *        <code>RANGE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConstantType
     */

    public TopicRangeFilterConstant withConstantType(ConstantType constantType) {
        this.constantType = constantType.toString();
        return this;
    }

    /**
     * <p>
     * The value of the constant that is used to specify the endpoints of a range filter.
     * </p>
     * 
     * @param rangeConstant
     *        The value of the constant that is used to specify the endpoints of a range filter.
     */

    public void setRangeConstant(RangeConstant rangeConstant) {
        this.rangeConstant = rangeConstant;
    }

    /**
     * <p>
     * The value of the constant that is used to specify the endpoints of a range filter.
     * </p>
     * 
     * @return The value of the constant that is used to specify the endpoints of a range filter.
     */

    public RangeConstant getRangeConstant() {
        return this.rangeConstant;
    }

    /**
     * <p>
     * The value of the constant that is used to specify the endpoints of a range filter.
     * </p>
     * 
     * @param rangeConstant
     *        The value of the constant that is used to specify the endpoints of a range filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRangeFilterConstant withRangeConstant(RangeConstant rangeConstant) {
        setRangeConstant(rangeConstant);
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
        if (getConstantType() != null)
            sb.append("ConstantType: ").append(getConstantType()).append(",");
        if (getRangeConstant() != null)
            sb.append("RangeConstant: ").append(getRangeConstant());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicRangeFilterConstant == false)
            return false;
        TopicRangeFilterConstant other = (TopicRangeFilterConstant) obj;
        if (other.getConstantType() == null ^ this.getConstantType() == null)
            return false;
        if (other.getConstantType() != null && other.getConstantType().equals(this.getConstantType()) == false)
            return false;
        if (other.getRangeConstant() == null ^ this.getRangeConstant() == null)
            return false;
        if (other.getRangeConstant() != null && other.getRangeConstant().equals(this.getRangeConstant()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConstantType() == null) ? 0 : getConstantType().hashCode());
        hashCode = prime * hashCode + ((getRangeConstant() == null) ? 0 : getRangeConstant().hashCode());
        return hashCode;
    }

    @Override
    public TopicRangeFilterConstant clone() {
        try {
            return (TopicRangeFilterConstant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopicRangeFilterConstantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
