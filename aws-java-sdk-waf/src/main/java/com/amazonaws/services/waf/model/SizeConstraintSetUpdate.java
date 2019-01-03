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
 * Specifies the part of a web request that you want to inspect the size of and indicates whether you want to add the
 * specification to a <a>SizeConstraintSet</a> or delete it from a <code>SizeConstraintSet</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/SizeConstraintSetUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SizeConstraintSetUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>. Use
     * <code>DELETE</code> to remove a <code>SizeConstraintSetUpdate</code> from a <code>SizeConstraintSet</code>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Specifies a constraint on the size of a part of the web request. AWS WAF uses the <code>Size</code>,
     * <code>ComparisonOperator</code>, and <code>FieldToMatch</code> to build an expression in the form of "
     * <code>Size</code> <code>ComparisonOperator</code> size in bytes of <code>FieldToMatch</code>". If that expression
     * is true, the <code>SizeConstraint</code> is considered to match.
     * </p>
     */
    private SizeConstraint sizeConstraint;

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>. Use
     * <code>DELETE</code> to remove a <code>SizeConstraintSetUpdate</code> from a <code>SizeConstraintSet</code>.
     * </p>
     * 
     * @param action
     *        Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>. Use
     *        <code>DELETE</code> to remove a <code>SizeConstraintSetUpdate</code> from a <code>SizeConstraintSet</code>
     *        .
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>. Use
     * <code>DELETE</code> to remove a <code>SizeConstraintSetUpdate</code> from a <code>SizeConstraintSet</code>.
     * </p>
     * 
     * @return Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>. Use
     *         <code>DELETE</code> to remove a <code>SizeConstraintSetUpdate</code> from a
     *         <code>SizeConstraintSet</code>.
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>. Use
     * <code>DELETE</code> to remove a <code>SizeConstraintSetUpdate</code> from a <code>SizeConstraintSet</code>.
     * </p>
     * 
     * @param action
     *        Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>. Use
     *        <code>DELETE</code> to remove a <code>SizeConstraintSetUpdate</code> from a <code>SizeConstraintSet</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public SizeConstraintSetUpdate withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>. Use
     * <code>DELETE</code> to remove a <code>SizeConstraintSetUpdate</code> from a <code>SizeConstraintSet</code>.
     * </p>
     * 
     * @param action
     *        Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>. Use
     *        <code>DELETE</code> to remove a <code>SizeConstraintSetUpdate</code> from a <code>SizeConstraintSet</code>
     *        .
     * @see ChangeAction
     */

    public void setAction(ChangeAction action) {
        withAction(action);
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>. Use
     * <code>DELETE</code> to remove a <code>SizeConstraintSetUpdate</code> from a <code>SizeConstraintSet</code>.
     * </p>
     * 
     * @param action
     *        Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>. Use
     *        <code>DELETE</code> to remove a <code>SizeConstraintSetUpdate</code> from a <code>SizeConstraintSet</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public SizeConstraintSetUpdate withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a constraint on the size of a part of the web request. AWS WAF uses the <code>Size</code>,
     * <code>ComparisonOperator</code>, and <code>FieldToMatch</code> to build an expression in the form of "
     * <code>Size</code> <code>ComparisonOperator</code> size in bytes of <code>FieldToMatch</code>". If that expression
     * is true, the <code>SizeConstraint</code> is considered to match.
     * </p>
     * 
     * @param sizeConstraint
     *        Specifies a constraint on the size of a part of the web request. AWS WAF uses the <code>Size</code>,
     *        <code>ComparisonOperator</code>, and <code>FieldToMatch</code> to build an expression in the form of "
     *        <code>Size</code> <code>ComparisonOperator</code> size in bytes of <code>FieldToMatch</code>". If that
     *        expression is true, the <code>SizeConstraint</code> is considered to match.
     */

    public void setSizeConstraint(SizeConstraint sizeConstraint) {
        this.sizeConstraint = sizeConstraint;
    }

    /**
     * <p>
     * Specifies a constraint on the size of a part of the web request. AWS WAF uses the <code>Size</code>,
     * <code>ComparisonOperator</code>, and <code>FieldToMatch</code> to build an expression in the form of "
     * <code>Size</code> <code>ComparisonOperator</code> size in bytes of <code>FieldToMatch</code>". If that expression
     * is true, the <code>SizeConstraint</code> is considered to match.
     * </p>
     * 
     * @return Specifies a constraint on the size of a part of the web request. AWS WAF uses the <code>Size</code>,
     *         <code>ComparisonOperator</code>, and <code>FieldToMatch</code> to build an expression in the form of "
     *         <code>Size</code> <code>ComparisonOperator</code> size in bytes of <code>FieldToMatch</code>". If that
     *         expression is true, the <code>SizeConstraint</code> is considered to match.
     */

    public SizeConstraint getSizeConstraint() {
        return this.sizeConstraint;
    }

    /**
     * <p>
     * Specifies a constraint on the size of a part of the web request. AWS WAF uses the <code>Size</code>,
     * <code>ComparisonOperator</code>, and <code>FieldToMatch</code> to build an expression in the form of "
     * <code>Size</code> <code>ComparisonOperator</code> size in bytes of <code>FieldToMatch</code>". If that expression
     * is true, the <code>SizeConstraint</code> is considered to match.
     * </p>
     * 
     * @param sizeConstraint
     *        Specifies a constraint on the size of a part of the web request. AWS WAF uses the <code>Size</code>,
     *        <code>ComparisonOperator</code>, and <code>FieldToMatch</code> to build an expression in the form of "
     *        <code>Size</code> <code>ComparisonOperator</code> size in bytes of <code>FieldToMatch</code>". If that
     *        expression is true, the <code>SizeConstraint</code> is considered to match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SizeConstraintSetUpdate withSizeConstraint(SizeConstraint sizeConstraint) {
        setSizeConstraint(sizeConstraint);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getSizeConstraint() != null)
            sb.append("SizeConstraint: ").append(getSizeConstraint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SizeConstraintSetUpdate == false)
            return false;
        SizeConstraintSetUpdate other = (SizeConstraintSetUpdate) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getSizeConstraint() == null ^ this.getSizeConstraint() == null)
            return false;
        if (other.getSizeConstraint() != null && other.getSizeConstraint().equals(this.getSizeConstraint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getSizeConstraint() == null) ? 0 : getSizeConstraint().hashCode());
        return hashCode;
    }

    @Override
    public SizeConstraintSetUpdate clone() {
        try {
            return (SizeConstraintSetUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.SizeConstraintSetUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
