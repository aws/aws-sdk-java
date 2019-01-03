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
 * Specifies the part of a web request that you want to inspect for snippets of malicious SQL code and indicates whether
 * you want to add the specification to a <a>SqlInjectionMatchSet</a> or delete it from a
 * <code>SqlInjectionMatchSet</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/SqlInjectionMatchSetUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqlInjectionMatchSetUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SqlInjectionMatchSetUpdate</a> to a <a>SqlInjectionMatchSet</a>. Use
     * <code>DELETE</code> to remove a <code>SqlInjectionMatchSetUpdate</code> from a <code>SqlInjectionMatchSet</code>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious SQL code and, if
     * you want AWS WAF to inspect a header, the name of the header.
     * </p>
     */
    private SqlInjectionMatchTuple sqlInjectionMatchTuple;

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SqlInjectionMatchSetUpdate</a> to a <a>SqlInjectionMatchSet</a>. Use
     * <code>DELETE</code> to remove a <code>SqlInjectionMatchSetUpdate</code> from a <code>SqlInjectionMatchSet</code>.
     * </p>
     * 
     * @param action
     *        Specify <code>INSERT</code> to add a <a>SqlInjectionMatchSetUpdate</a> to a <a>SqlInjectionMatchSet</a>.
     *        Use <code>DELETE</code> to remove a <code>SqlInjectionMatchSetUpdate</code> from a
     *        <code>SqlInjectionMatchSet</code>.
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SqlInjectionMatchSetUpdate</a> to a <a>SqlInjectionMatchSet</a>. Use
     * <code>DELETE</code> to remove a <code>SqlInjectionMatchSetUpdate</code> from a <code>SqlInjectionMatchSet</code>.
     * </p>
     * 
     * @return Specify <code>INSERT</code> to add a <a>SqlInjectionMatchSetUpdate</a> to a <a>SqlInjectionMatchSet</a>.
     *         Use <code>DELETE</code> to remove a <code>SqlInjectionMatchSetUpdate</code> from a
     *         <code>SqlInjectionMatchSet</code>.
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SqlInjectionMatchSetUpdate</a> to a <a>SqlInjectionMatchSet</a>. Use
     * <code>DELETE</code> to remove a <code>SqlInjectionMatchSetUpdate</code> from a <code>SqlInjectionMatchSet</code>.
     * </p>
     * 
     * @param action
     *        Specify <code>INSERT</code> to add a <a>SqlInjectionMatchSetUpdate</a> to a <a>SqlInjectionMatchSet</a>.
     *        Use <code>DELETE</code> to remove a <code>SqlInjectionMatchSetUpdate</code> from a
     *        <code>SqlInjectionMatchSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public SqlInjectionMatchSetUpdate withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SqlInjectionMatchSetUpdate</a> to a <a>SqlInjectionMatchSet</a>. Use
     * <code>DELETE</code> to remove a <code>SqlInjectionMatchSetUpdate</code> from a <code>SqlInjectionMatchSet</code>.
     * </p>
     * 
     * @param action
     *        Specify <code>INSERT</code> to add a <a>SqlInjectionMatchSetUpdate</a> to a <a>SqlInjectionMatchSet</a>.
     *        Use <code>DELETE</code> to remove a <code>SqlInjectionMatchSetUpdate</code> from a
     *        <code>SqlInjectionMatchSet</code>.
     * @see ChangeAction
     */

    public void setAction(ChangeAction action) {
        withAction(action);
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SqlInjectionMatchSetUpdate</a> to a <a>SqlInjectionMatchSet</a>. Use
     * <code>DELETE</code> to remove a <code>SqlInjectionMatchSetUpdate</code> from a <code>SqlInjectionMatchSet</code>.
     * </p>
     * 
     * @param action
     *        Specify <code>INSERT</code> to add a <a>SqlInjectionMatchSetUpdate</a> to a <a>SqlInjectionMatchSet</a>.
     *        Use <code>DELETE</code> to remove a <code>SqlInjectionMatchSetUpdate</code> from a
     *        <code>SqlInjectionMatchSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public SqlInjectionMatchSetUpdate withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious SQL code and, if
     * you want AWS WAF to inspect a header, the name of the header.
     * </p>
     * 
     * @param sqlInjectionMatchTuple
     *        Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious SQL code
     *        and, if you want AWS WAF to inspect a header, the name of the header.
     */

    public void setSqlInjectionMatchTuple(SqlInjectionMatchTuple sqlInjectionMatchTuple) {
        this.sqlInjectionMatchTuple = sqlInjectionMatchTuple;
    }

    /**
     * <p>
     * Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious SQL code and, if
     * you want AWS WAF to inspect a header, the name of the header.
     * </p>
     * 
     * @return Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious SQL code
     *         and, if you want AWS WAF to inspect a header, the name of the header.
     */

    public SqlInjectionMatchTuple getSqlInjectionMatchTuple() {
        return this.sqlInjectionMatchTuple;
    }

    /**
     * <p>
     * Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious SQL code and, if
     * you want AWS WAF to inspect a header, the name of the header.
     * </p>
     * 
     * @param sqlInjectionMatchTuple
     *        Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious SQL code
     *        and, if you want AWS WAF to inspect a header, the name of the header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlInjectionMatchSetUpdate withSqlInjectionMatchTuple(SqlInjectionMatchTuple sqlInjectionMatchTuple) {
        setSqlInjectionMatchTuple(sqlInjectionMatchTuple);
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
        if (getSqlInjectionMatchTuple() != null)
            sb.append("SqlInjectionMatchTuple: ").append(getSqlInjectionMatchTuple());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqlInjectionMatchSetUpdate == false)
            return false;
        SqlInjectionMatchSetUpdate other = (SqlInjectionMatchSetUpdate) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getSqlInjectionMatchTuple() == null ^ this.getSqlInjectionMatchTuple() == null)
            return false;
        if (other.getSqlInjectionMatchTuple() != null && other.getSqlInjectionMatchTuple().equals(this.getSqlInjectionMatchTuple()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getSqlInjectionMatchTuple() == null) ? 0 : getSqlInjectionMatchTuple().hashCode());
        return hashCode;
    }

    @Override
    public SqlInjectionMatchSetUpdate clone() {
        try {
            return (SqlInjectionMatchSetUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.SqlInjectionMatchSetUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
