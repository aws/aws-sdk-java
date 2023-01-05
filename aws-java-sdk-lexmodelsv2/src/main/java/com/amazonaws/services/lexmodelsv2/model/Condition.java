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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides an expression that evaluates to true or false.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/Condition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Condition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The expression string that is evaluated.
     * </p>
     */
    private String expressionString;

    /**
     * <p>
     * The expression string that is evaluated.
     * </p>
     * 
     * @param expressionString
     *        The expression string that is evaluated.
     */

    public void setExpressionString(String expressionString) {
        this.expressionString = expressionString;
    }

    /**
     * <p>
     * The expression string that is evaluated.
     * </p>
     * 
     * @return The expression string that is evaluated.
     */

    public String getExpressionString() {
        return this.expressionString;
    }

    /**
     * <p>
     * The expression string that is evaluated.
     * </p>
     * 
     * @param expressionString
     *        The expression string that is evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withExpressionString(String expressionString) {
        setExpressionString(expressionString);
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
        if (getExpressionString() != null)
            sb.append("ExpressionString: ").append(getExpressionString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Condition == false)
            return false;
        Condition other = (Condition) obj;
        if (other.getExpressionString() == null ^ this.getExpressionString() == null)
            return false;
        if (other.getExpressionString() != null && other.getExpressionString().equals(this.getExpressionString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpressionString() == null) ? 0 : getExpressionString().hashCode());
        return hashCode;
    }

    @Override
    public Condition clone() {
        try {
            return (Condition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.ConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
