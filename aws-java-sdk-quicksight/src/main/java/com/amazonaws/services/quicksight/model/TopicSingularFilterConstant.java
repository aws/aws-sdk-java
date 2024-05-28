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
 * A structure that represents a singular filter constant, used in filters to specify a single value to match against.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopicSingularFilterConstant"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicSingularFilterConstant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the singular filter constant. Valid values for this structure are <code>SINGULAR</code>.
     * </p>
     */
    private String constantType;
    /**
     * <p>
     * The value of the singular filter constant.
     * </p>
     */
    private String singularConstant;

    /**
     * <p>
     * The type of the singular filter constant. Valid values for this structure are <code>SINGULAR</code>.
     * </p>
     * 
     * @param constantType
     *        The type of the singular filter constant. Valid values for this structure are <code>SINGULAR</code>.
     * @see ConstantType
     */

    public void setConstantType(String constantType) {
        this.constantType = constantType;
    }

    /**
     * <p>
     * The type of the singular filter constant. Valid values for this structure are <code>SINGULAR</code>.
     * </p>
     * 
     * @return The type of the singular filter constant. Valid values for this structure are <code>SINGULAR</code>.
     * @see ConstantType
     */

    public String getConstantType() {
        return this.constantType;
    }

    /**
     * <p>
     * The type of the singular filter constant. Valid values for this structure are <code>SINGULAR</code>.
     * </p>
     * 
     * @param constantType
     *        The type of the singular filter constant. Valid values for this structure are <code>SINGULAR</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConstantType
     */

    public TopicSingularFilterConstant withConstantType(String constantType) {
        setConstantType(constantType);
        return this;
    }

    /**
     * <p>
     * The type of the singular filter constant. Valid values for this structure are <code>SINGULAR</code>.
     * </p>
     * 
     * @param constantType
     *        The type of the singular filter constant. Valid values for this structure are <code>SINGULAR</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConstantType
     */

    public TopicSingularFilterConstant withConstantType(ConstantType constantType) {
        this.constantType = constantType.toString();
        return this;
    }

    /**
     * <p>
     * The value of the singular filter constant.
     * </p>
     * 
     * @param singularConstant
     *        The value of the singular filter constant.
     */

    public void setSingularConstant(String singularConstant) {
        this.singularConstant = singularConstant;
    }

    /**
     * <p>
     * The value of the singular filter constant.
     * </p>
     * 
     * @return The value of the singular filter constant.
     */

    public String getSingularConstant() {
        return this.singularConstant;
    }

    /**
     * <p>
     * The value of the singular filter constant.
     * </p>
     * 
     * @param singularConstant
     *        The value of the singular filter constant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicSingularFilterConstant withSingularConstant(String singularConstant) {
        setSingularConstant(singularConstant);
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
        if (getSingularConstant() != null)
            sb.append("SingularConstant: ").append(getSingularConstant());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicSingularFilterConstant == false)
            return false;
        TopicSingularFilterConstant other = (TopicSingularFilterConstant) obj;
        if (other.getConstantType() == null ^ this.getConstantType() == null)
            return false;
        if (other.getConstantType() != null && other.getConstantType().equals(this.getConstantType()) == false)
            return false;
        if (other.getSingularConstant() == null ^ this.getSingularConstant() == null)
            return false;
        if (other.getSingularConstant() != null && other.getSingularConstant().equals(this.getSingularConstant()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConstantType() == null) ? 0 : getConstantType().hashCode());
        hashCode = prime * hashCode + ((getSingularConstant() == null) ? 0 : getSingularConstant().hashCode());
        return hashCode;
    }

    @Override
    public TopicSingularFilterConstant clone() {
        try {
            return (TopicSingularFilterConstant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopicSingularFilterConstantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
