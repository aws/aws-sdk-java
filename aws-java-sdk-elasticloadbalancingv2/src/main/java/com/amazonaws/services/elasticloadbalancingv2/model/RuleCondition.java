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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a condition for a rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/RuleCondition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleCondition implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the field. The possible values are <code>host-header</code> and <code>path-pattern</code>.
     * </p>
     */
    private String field;
    /**
     * <p>
     * The condition value.
     * </p>
     * <p>
     * If the field name is <code>host-header</code>, you can specify a single host name (for example, my.example.com).
     * A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following
     * characters. You can include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * - .
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the field name is <code>path-pattern</code>, you can specify a single path pattern (for example, /img/*). A
     * path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following
     * characters. You can include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the field. The possible values are <code>host-header</code> and <code>path-pattern</code>.
     * </p>
     * 
     * @param field
     *        The name of the field. The possible values are <code>host-header</code> and <code>path-pattern</code>.
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * The name of the field. The possible values are <code>host-header</code> and <code>path-pattern</code>.
     * </p>
     * 
     * @return The name of the field. The possible values are <code>host-header</code> and <code>path-pattern</code>.
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * The name of the field. The possible values are <code>host-header</code> and <code>path-pattern</code>.
     * </p>
     * 
     * @param field
     *        The name of the field. The possible values are <code>host-header</code> and <code>path-pattern</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * The condition value.
     * </p>
     * <p>
     * If the field name is <code>host-header</code>, you can specify a single host name (for example, my.example.com).
     * A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following
     * characters. You can include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * - .
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the field name is <code>path-pattern</code>, you can specify a single path pattern (for example, /img/*). A
     * path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following
     * characters. You can include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The condition value.</p>
     *         <p>
     *         If the field name is <code>host-header</code>, you can specify a single host name (for example,
     *         my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain
     *         any of the following characters. You can include up to three wildcard characters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A-Z, a-z, 0-9
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         - .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         (matches 0 or more characters)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ? (matches exactly 1 character)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the field name is <code>path-pattern</code>, you can specify a single path pattern (for example,
     *         /img/*). A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of
     *         the following characters. You can include up to three wildcard characters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A-Z, a-z, 0-9
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         _ - . $ / ~ " ' @ : +
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         &amp; (using &amp;amp;)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         (matches 0 or more characters)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ? (matches exactly 1 character)
     *         </p>
     *         </li>
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The condition value.
     * </p>
     * <p>
     * If the field name is <code>host-header</code>, you can specify a single host name (for example, my.example.com).
     * A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following
     * characters. You can include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * - .
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the field name is <code>path-pattern</code>, you can specify a single path pattern (for example, /img/*). A
     * path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following
     * characters. You can include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * 
     * @param values
     *        The condition value.</p>
     *        <p>
     *        If the field name is <code>host-header</code>, you can specify a single host name (for example,
     *        my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain
     *        any of the following characters. You can include up to three wildcard characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        - .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the field name is <code>path-pattern</code>, you can specify a single path pattern (for example,
     *        /img/*). A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of
     *        the following characters. You can include up to three wildcard characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _ - . $ / ~ " ' @ : +
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        &amp; (using &amp;amp;)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The condition value.
     * </p>
     * <p>
     * If the field name is <code>host-header</code>, you can specify a single host name (for example, my.example.com).
     * A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following
     * characters. You can include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * - .
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the field name is <code>path-pattern</code>, you can specify a single path pattern (for example, /img/*). A
     * path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following
     * characters. You can include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The condition value.</p>
     *        <p>
     *        If the field name is <code>host-header</code>, you can specify a single host name (for example,
     *        my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain
     *        any of the following characters. You can include up to three wildcard characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        - .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the field name is <code>path-pattern</code>, you can specify a single path pattern (for example,
     *        /img/*). A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of
     *        the following characters. You can include up to three wildcard characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _ - . $ / ~ " ' @ : +
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        &amp; (using &amp;amp;)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The condition value.
     * </p>
     * <p>
     * If the field name is <code>host-header</code>, you can specify a single host name (for example, my.example.com).
     * A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following
     * characters. You can include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * - .
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the field name is <code>path-pattern</code>, you can specify a single path pattern (for example, /img/*). A
     * path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following
     * characters. You can include up to three wildcard characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * 
     * @param values
     *        The condition value.</p>
     *        <p>
     *        If the field name is <code>host-header</code>, you can specify a single host name (for example,
     *        my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain
     *        any of the following characters. You can include up to three wildcard characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        - .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the field name is <code>path-pattern</code>, you can specify a single path pattern (for example,
     *        /img/*). A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of
     *        the following characters. You can include up to three wildcard characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _ - . $ / ~ " ' @ : +
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        &amp; (using &amp;amp;)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleCondition == false)
            return false;
        RuleCondition other = (RuleCondition) obj;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public RuleCondition clone() {
        try {
            return (RuleCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
