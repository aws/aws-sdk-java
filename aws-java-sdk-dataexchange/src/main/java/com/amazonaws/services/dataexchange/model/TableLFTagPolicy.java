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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The LF-tag policy for a table resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/TableLFTagPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableLFTagPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of LF-tag conditions that apply to table resources.
     * </p>
     */
    private java.util.List<LFTag> expression;

    /**
     * <p>
     * A list of LF-tag conditions that apply to table resources.
     * </p>
     * 
     * @return A list of LF-tag conditions that apply to table resources.
     */

    public java.util.List<LFTag> getExpression() {
        return expression;
    }

    /**
     * <p>
     * A list of LF-tag conditions that apply to table resources.
     * </p>
     * 
     * @param expression
     *        A list of LF-tag conditions that apply to table resources.
     */

    public void setExpression(java.util.Collection<LFTag> expression) {
        if (expression == null) {
            this.expression = null;
            return;
        }

        this.expression = new java.util.ArrayList<LFTag>(expression);
    }

    /**
     * <p>
     * A list of LF-tag conditions that apply to table resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExpression(java.util.Collection)} or {@link #withExpression(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param expression
     *        A list of LF-tag conditions that apply to table resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableLFTagPolicy withExpression(LFTag... expression) {
        if (this.expression == null) {
            setExpression(new java.util.ArrayList<LFTag>(expression.length));
        }
        for (LFTag ele : expression) {
            this.expression.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of LF-tag conditions that apply to table resources.
     * </p>
     * 
     * @param expression
     *        A list of LF-tag conditions that apply to table resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableLFTagPolicy withExpression(java.util.Collection<LFTag> expression) {
        setExpression(expression);
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
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableLFTagPolicy == false)
            return false;
        TableLFTagPolicy other = (TableLFTagPolicy) obj;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        return hashCode;
    }

    @Override
    public TableLFTagPolicy clone() {
        try {
            return (TableLFTagPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.TableLFTagPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
