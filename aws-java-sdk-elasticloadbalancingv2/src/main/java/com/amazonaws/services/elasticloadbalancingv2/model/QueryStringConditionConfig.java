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
 * Information about a query string condition.
 * </p>
 * <p>
 * The query string component of a URI starts after the first '?' character and is terminated by either a '#' character
 * or the end of the URI. A typical query string contains key/value pairs separated by '&amp;' characters. The allowed
 * characters are specified by RFC 3986. Any character can be percentage encoded.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/QueryStringConditionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryStringConditionConfig implements Serializable, Cloneable {

    /**
     * <p>
     * One or more key/value pairs or values to find in the query string. The maximum size of each string is 128
     * characters. The comparison is case insensitive. The following wildcard characters are supported: * (matches 0 or
     * more characters) and ? (matches exactly 1 character). To search for a literal '*' or '?' character in a query
     * string, you must escape these characters in <code>Values</code> using a '\' character.
     * </p>
     * <p>
     * If you specify multiple key/value pairs or values, the condition is satisfied if one of them is found in the
     * query string.
     * </p>
     */
    private java.util.List<QueryStringKeyValuePair> values;

    /**
     * <p>
     * One or more key/value pairs or values to find in the query string. The maximum size of each string is 128
     * characters. The comparison is case insensitive. The following wildcard characters are supported: * (matches 0 or
     * more characters) and ? (matches exactly 1 character). To search for a literal '*' or '?' character in a query
     * string, you must escape these characters in <code>Values</code> using a '\' character.
     * </p>
     * <p>
     * If you specify multiple key/value pairs or values, the condition is satisfied if one of them is found in the
     * query string.
     * </p>
     * 
     * @return One or more key/value pairs or values to find in the query string. The maximum size of each string is 128
     *         characters. The comparison is case insensitive. The following wildcard characters are supported: *
     *         (matches 0 or more characters) and ? (matches exactly 1 character). To search for a literal '*' or '?'
     *         character in a query string, you must escape these characters in <code>Values</code> using a '\'
     *         character.</p>
     *         <p>
     *         If you specify multiple key/value pairs or values, the condition is satisfied if one of them is found in
     *         the query string.
     */

    public java.util.List<QueryStringKeyValuePair> getValues() {
        return values;
    }

    /**
     * <p>
     * One or more key/value pairs or values to find in the query string. The maximum size of each string is 128
     * characters. The comparison is case insensitive. The following wildcard characters are supported: * (matches 0 or
     * more characters) and ? (matches exactly 1 character). To search for a literal '*' or '?' character in a query
     * string, you must escape these characters in <code>Values</code> using a '\' character.
     * </p>
     * <p>
     * If you specify multiple key/value pairs or values, the condition is satisfied if one of them is found in the
     * query string.
     * </p>
     * 
     * @param values
     *        One or more key/value pairs or values to find in the query string. The maximum size of each string is 128
     *        characters. The comparison is case insensitive. The following wildcard characters are supported: *
     *        (matches 0 or more characters) and ? (matches exactly 1 character). To search for a literal '*' or '?'
     *        character in a query string, you must escape these characters in <code>Values</code> using a '\'
     *        character.</p>
     *        <p>
     *        If you specify multiple key/value pairs or values, the condition is satisfied if one of them is found in
     *        the query string.
     */

    public void setValues(java.util.Collection<QueryStringKeyValuePair> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<QueryStringKeyValuePair>(values);
    }

    /**
     * <p>
     * One or more key/value pairs or values to find in the query string. The maximum size of each string is 128
     * characters. The comparison is case insensitive. The following wildcard characters are supported: * (matches 0 or
     * more characters) and ? (matches exactly 1 character). To search for a literal '*' or '?' character in a query
     * string, you must escape these characters in <code>Values</code> using a '\' character.
     * </p>
     * <p>
     * If you specify multiple key/value pairs or values, the condition is satisfied if one of them is found in the
     * query string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        One or more key/value pairs or values to find in the query string. The maximum size of each string is 128
     *        characters. The comparison is case insensitive. The following wildcard characters are supported: *
     *        (matches 0 or more characters) and ? (matches exactly 1 character). To search for a literal '*' or '?'
     *        character in a query string, you must escape these characters in <code>Values</code> using a '\'
     *        character.</p>
     *        <p>
     *        If you specify multiple key/value pairs or values, the condition is satisfied if one of them is found in
     *        the query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStringConditionConfig withValues(QueryStringKeyValuePair... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<QueryStringKeyValuePair>(values.length));
        }
        for (QueryStringKeyValuePair ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more key/value pairs or values to find in the query string. The maximum size of each string is 128
     * characters. The comparison is case insensitive. The following wildcard characters are supported: * (matches 0 or
     * more characters) and ? (matches exactly 1 character). To search for a literal '*' or '?' character in a query
     * string, you must escape these characters in <code>Values</code> using a '\' character.
     * </p>
     * <p>
     * If you specify multiple key/value pairs or values, the condition is satisfied if one of them is found in the
     * query string.
     * </p>
     * 
     * @param values
     *        One or more key/value pairs or values to find in the query string. The maximum size of each string is 128
     *        characters. The comparison is case insensitive. The following wildcard characters are supported: *
     *        (matches 0 or more characters) and ? (matches exactly 1 character). To search for a literal '*' or '?'
     *        character in a query string, you must escape these characters in <code>Values</code> using a '\'
     *        character.</p>
     *        <p>
     *        If you specify multiple key/value pairs or values, the condition is satisfied if one of them is found in
     *        the query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStringConditionConfig withValues(java.util.Collection<QueryStringKeyValuePair> values) {
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

        if (obj instanceof QueryStringConditionConfig == false)
            return false;
        QueryStringConditionConfig other = (QueryStringConditionConfig) obj;
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

        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public QueryStringConditionConfig clone() {
        try {
            return (QueryStringConditionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
