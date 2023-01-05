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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>Field</code> of the channel that you want to search.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/SearchField" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An <code>enum</code> value that indicates the key to search the channel on. <code>MEMBERS</code> allows you to
     * search channels based on memberships. You can use it with the <code>EQUALS</code> operator to get channels whose
     * memberships are equal to the specified values, and with the <code>INCLUDES</code> operator to get channels whose
     * memberships include the specified values.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The values that you want to search for, a list of strings. The values must be <code>AppInstanceUserArns</code>
     * specified as a list of strings.
     * </p>
     * <note>
     * <p>
     * This operation isn't supported for <code>AppInstanceUsers</code> with large number of memberships.
     * </p>
     * </note>
     */
    private java.util.List<String> values;
    /**
     * <p>
     * The operator used to compare field values, currently <code>EQUALS</code> or <code>INCLUDES</code>. Use the
     * <code>EQUALS</code> operator to find channels whose memberships equal the specified values. Use the
     * <code>INCLUDES</code> operator to find channels whose memberships include the specified values.
     * </p>
     */
    private String operator;

    /**
     * <p>
     * An <code>enum</code> value that indicates the key to search the channel on. <code>MEMBERS</code> allows you to
     * search channels based on memberships. You can use it with the <code>EQUALS</code> operator to get channels whose
     * memberships are equal to the specified values, and with the <code>INCLUDES</code> operator to get channels whose
     * memberships include the specified values.
     * </p>
     * 
     * @param key
     *        An <code>enum</code> value that indicates the key to search the channel on. <code>MEMBERS</code> allows
     *        you to search channels based on memberships. You can use it with the <code>EQUALS</code> operator to get
     *        channels whose memberships are equal to the specified values, and with the <code>INCLUDES</code> operator
     *        to get channels whose memberships include the specified values.
     * @see SearchFieldKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * An <code>enum</code> value that indicates the key to search the channel on. <code>MEMBERS</code> allows you to
     * search channels based on memberships. You can use it with the <code>EQUALS</code> operator to get channels whose
     * memberships are equal to the specified values, and with the <code>INCLUDES</code> operator to get channels whose
     * memberships include the specified values.
     * </p>
     * 
     * @return An <code>enum</code> value that indicates the key to search the channel on. <code>MEMBERS</code> allows
     *         you to search channels based on memberships. You can use it with the <code>EQUALS</code> operator to get
     *         channels whose memberships are equal to the specified values, and with the <code>INCLUDES</code> operator
     *         to get channels whose memberships include the specified values.
     * @see SearchFieldKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * An <code>enum</code> value that indicates the key to search the channel on. <code>MEMBERS</code> allows you to
     * search channels based on memberships. You can use it with the <code>EQUALS</code> operator to get channels whose
     * memberships are equal to the specified values, and with the <code>INCLUDES</code> operator to get channels whose
     * memberships include the specified values.
     * </p>
     * 
     * @param key
     *        An <code>enum</code> value that indicates the key to search the channel on. <code>MEMBERS</code> allows
     *        you to search channels based on memberships. You can use it with the <code>EQUALS</code> operator to get
     *        channels whose memberships are equal to the specified values, and with the <code>INCLUDES</code> operator
     *        to get channels whose memberships include the specified values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchFieldKey
     */

    public SearchField withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * An <code>enum</code> value that indicates the key to search the channel on. <code>MEMBERS</code> allows you to
     * search channels based on memberships. You can use it with the <code>EQUALS</code> operator to get channels whose
     * memberships are equal to the specified values, and with the <code>INCLUDES</code> operator to get channels whose
     * memberships include the specified values.
     * </p>
     * 
     * @param key
     *        An <code>enum</code> value that indicates the key to search the channel on. <code>MEMBERS</code> allows
     *        you to search channels based on memberships. You can use it with the <code>EQUALS</code> operator to get
     *        channels whose memberships are equal to the specified values, and with the <code>INCLUDES</code> operator
     *        to get channels whose memberships include the specified values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchFieldKey
     */

    public SearchField withKey(SearchFieldKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The values that you want to search for, a list of strings. The values must be <code>AppInstanceUserArns</code>
     * specified as a list of strings.
     * </p>
     * <note>
     * <p>
     * This operation isn't supported for <code>AppInstanceUsers</code> with large number of memberships.
     * </p>
     * </note>
     * 
     * @return The values that you want to search for, a list of strings. The values must be
     *         <code>AppInstanceUserArns</code> specified as a list of strings.</p> <note>
     *         <p>
     *         This operation isn't supported for <code>AppInstanceUsers</code> with large number of memberships.
     *         </p>
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values that you want to search for, a list of strings. The values must be <code>AppInstanceUserArns</code>
     * specified as a list of strings.
     * </p>
     * <note>
     * <p>
     * This operation isn't supported for <code>AppInstanceUsers</code> with large number of memberships.
     * </p>
     * </note>
     * 
     * @param values
     *        The values that you want to search for, a list of strings. The values must be
     *        <code>AppInstanceUserArns</code> specified as a list of strings.</p> <note>
     *        <p>
     *        This operation isn't supported for <code>AppInstanceUsers</code> with large number of memberships.
     *        </p>
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
     * The values that you want to search for, a list of strings. The values must be <code>AppInstanceUserArns</code>
     * specified as a list of strings.
     * </p>
     * <note>
     * <p>
     * This operation isn't supported for <code>AppInstanceUsers</code> with large number of memberships.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values that you want to search for, a list of strings. The values must be
     *        <code>AppInstanceUserArns</code> specified as a list of strings.</p> <note>
     *        <p>
     *        This operation isn't supported for <code>AppInstanceUsers</code> with large number of memberships.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchField withValues(String... values) {
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
     * The values that you want to search for, a list of strings. The values must be <code>AppInstanceUserArns</code>
     * specified as a list of strings.
     * </p>
     * <note>
     * <p>
     * This operation isn't supported for <code>AppInstanceUsers</code> with large number of memberships.
     * </p>
     * </note>
     * 
     * @param values
     *        The values that you want to search for, a list of strings. The values must be
     *        <code>AppInstanceUserArns</code> specified as a list of strings.</p> <note>
     *        <p>
     *        This operation isn't supported for <code>AppInstanceUsers</code> with large number of memberships.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchField withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The operator used to compare field values, currently <code>EQUALS</code> or <code>INCLUDES</code>. Use the
     * <code>EQUALS</code> operator to find channels whose memberships equal the specified values. Use the
     * <code>INCLUDES</code> operator to find channels whose memberships include the specified values.
     * </p>
     * 
     * @param operator
     *        The operator used to compare field values, currently <code>EQUALS</code> or <code>INCLUDES</code>. Use the
     *        <code>EQUALS</code> operator to find channels whose memberships equal the specified values. Use the
     *        <code>INCLUDES</code> operator to find channels whose memberships include the specified values.
     * @see SearchFieldOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator used to compare field values, currently <code>EQUALS</code> or <code>INCLUDES</code>. Use the
     * <code>EQUALS</code> operator to find channels whose memberships equal the specified values. Use the
     * <code>INCLUDES</code> operator to find channels whose memberships include the specified values.
     * </p>
     * 
     * @return The operator used to compare field values, currently <code>EQUALS</code> or <code>INCLUDES</code>. Use
     *         the <code>EQUALS</code> operator to find channels whose memberships equal the specified values. Use the
     *         <code>INCLUDES</code> operator to find channels whose memberships include the specified values.
     * @see SearchFieldOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator used to compare field values, currently <code>EQUALS</code> or <code>INCLUDES</code>. Use the
     * <code>EQUALS</code> operator to find channels whose memberships equal the specified values. Use the
     * <code>INCLUDES</code> operator to find channels whose memberships include the specified values.
     * </p>
     * 
     * @param operator
     *        The operator used to compare field values, currently <code>EQUALS</code> or <code>INCLUDES</code>. Use the
     *        <code>EQUALS</code> operator to find channels whose memberships equal the specified values. Use the
     *        <code>INCLUDES</code> operator to find channels whose memberships include the specified values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchFieldOperator
     */

    public SearchField withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operator used to compare field values, currently <code>EQUALS</code> or <code>INCLUDES</code>. Use the
     * <code>EQUALS</code> operator to find channels whose memberships equal the specified values. Use the
     * <code>INCLUDES</code> operator to find channels whose memberships include the specified values.
     * </p>
     * 
     * @param operator
     *        The operator used to compare field values, currently <code>EQUALS</code> or <code>INCLUDES</code>. Use the
     *        <code>EQUALS</code> operator to find channels whose memberships equal the specified values. Use the
     *        <code>INCLUDES</code> operator to find channels whose memberships include the specified values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchFieldOperator
     */

    public SearchField withOperator(SearchFieldOperator operator) {
        this.operator = operator.toString();
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchField == false)
            return false;
        SearchField other = (SearchField) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public SearchField clone() {
        try {
            return (SearchField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmessaging.model.transform.SearchFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
