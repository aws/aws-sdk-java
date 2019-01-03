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
 * A complex type that contains <code>SqlInjectionMatchTuple</code> objects, which specify the parts of web requests
 * that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want AWS WAF to inspect a header, the
 * name of the header. If a <code>SqlInjectionMatchSet</code> contains more than one <code>SqlInjectionMatchTuple</code>
 * object, a request needs to include snippets of SQL code in only one of the specified parts of the request to be
 * considered a match.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/SqlInjectionMatchSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqlInjectionMatchSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for a <code>SqlInjectionMatchSet</code>. You use <code>SqlInjectionMatchSetId</code> to get
     * information about a <code>SqlInjectionMatchSet</code> (see <a>GetSqlInjectionMatchSet</a>), update a
     * <code>SqlInjectionMatchSet</code> (see <a>UpdateSqlInjectionMatchSet</a>), insert a
     * <code>SqlInjectionMatchSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see
     * <a>UpdateRule</a>), and delete a <code>SqlInjectionMatchSet</code> from AWS WAF (see
     * <a>DeleteSqlInjectionMatchSet</a>).
     * </p>
     * <p>
     * <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     */
    private String sqlInjectionMatchSetId;
    /**
     * <p>
     * The name, if any, of the <code>SqlInjectionMatchSet</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL code.
     * </p>
     */
    private java.util.List<SqlInjectionMatchTuple> sqlInjectionMatchTuples;

    /**
     * <p>
     * A unique identifier for a <code>SqlInjectionMatchSet</code>. You use <code>SqlInjectionMatchSetId</code> to get
     * information about a <code>SqlInjectionMatchSet</code> (see <a>GetSqlInjectionMatchSet</a>), update a
     * <code>SqlInjectionMatchSet</code> (see <a>UpdateSqlInjectionMatchSet</a>), insert a
     * <code>SqlInjectionMatchSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see
     * <a>UpdateRule</a>), and delete a <code>SqlInjectionMatchSet</code> from AWS WAF (see
     * <a>DeleteSqlInjectionMatchSet</a>).
     * </p>
     * <p>
     * <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     * 
     * @param sqlInjectionMatchSetId
     *        A unique identifier for a <code>SqlInjectionMatchSet</code>. You use <code>SqlInjectionMatchSetId</code>
     *        to get information about a <code>SqlInjectionMatchSet</code> (see <a>GetSqlInjectionMatchSet</a>), update
     *        a <code>SqlInjectionMatchSet</code> (see <a>UpdateSqlInjectionMatchSet</a>), insert a
     *        <code>SqlInjectionMatchSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see
     *        <a>UpdateRule</a>), and delete a <code>SqlInjectionMatchSet</code> from AWS WAF (see
     *        <a>DeleteSqlInjectionMatchSet</a>).</p>
     *        <p>
     *        <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     *        <a>ListSqlInjectionMatchSets</a>.
     */

    public void setSqlInjectionMatchSetId(String sqlInjectionMatchSetId) {
        this.sqlInjectionMatchSetId = sqlInjectionMatchSetId;
    }

    /**
     * <p>
     * A unique identifier for a <code>SqlInjectionMatchSet</code>. You use <code>SqlInjectionMatchSetId</code> to get
     * information about a <code>SqlInjectionMatchSet</code> (see <a>GetSqlInjectionMatchSet</a>), update a
     * <code>SqlInjectionMatchSet</code> (see <a>UpdateSqlInjectionMatchSet</a>), insert a
     * <code>SqlInjectionMatchSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see
     * <a>UpdateRule</a>), and delete a <code>SqlInjectionMatchSet</code> from AWS WAF (see
     * <a>DeleteSqlInjectionMatchSet</a>).
     * </p>
     * <p>
     * <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     * 
     * @return A unique identifier for a <code>SqlInjectionMatchSet</code>. You use <code>SqlInjectionMatchSetId</code>
     *         to get information about a <code>SqlInjectionMatchSet</code> (see <a>GetSqlInjectionMatchSet</a>), update
     *         a <code>SqlInjectionMatchSet</code> (see <a>UpdateSqlInjectionMatchSet</a>), insert a
     *         <code>SqlInjectionMatchSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see
     *         <a>UpdateRule</a>), and delete a <code>SqlInjectionMatchSet</code> from AWS WAF (see
     *         <a>DeleteSqlInjectionMatchSet</a>).</p>
     *         <p>
     *         <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     *         <a>ListSqlInjectionMatchSets</a>.
     */

    public String getSqlInjectionMatchSetId() {
        return this.sqlInjectionMatchSetId;
    }

    /**
     * <p>
     * A unique identifier for a <code>SqlInjectionMatchSet</code>. You use <code>SqlInjectionMatchSetId</code> to get
     * information about a <code>SqlInjectionMatchSet</code> (see <a>GetSqlInjectionMatchSet</a>), update a
     * <code>SqlInjectionMatchSet</code> (see <a>UpdateSqlInjectionMatchSet</a>), insert a
     * <code>SqlInjectionMatchSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see
     * <a>UpdateRule</a>), and delete a <code>SqlInjectionMatchSet</code> from AWS WAF (see
     * <a>DeleteSqlInjectionMatchSet</a>).
     * </p>
     * <p>
     * <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     * 
     * @param sqlInjectionMatchSetId
     *        A unique identifier for a <code>SqlInjectionMatchSet</code>. You use <code>SqlInjectionMatchSetId</code>
     *        to get information about a <code>SqlInjectionMatchSet</code> (see <a>GetSqlInjectionMatchSet</a>), update
     *        a <code>SqlInjectionMatchSet</code> (see <a>UpdateSqlInjectionMatchSet</a>), insert a
     *        <code>SqlInjectionMatchSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see
     *        <a>UpdateRule</a>), and delete a <code>SqlInjectionMatchSet</code> from AWS WAF (see
     *        <a>DeleteSqlInjectionMatchSet</a>).</p>
     *        <p>
     *        <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     *        <a>ListSqlInjectionMatchSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlInjectionMatchSet withSqlInjectionMatchSetId(String sqlInjectionMatchSetId) {
        setSqlInjectionMatchSetId(sqlInjectionMatchSetId);
        return this;
    }

    /**
     * <p>
     * The name, if any, of the <code>SqlInjectionMatchSet</code>.
     * </p>
     * 
     * @param name
     *        The name, if any, of the <code>SqlInjectionMatchSet</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name, if any, of the <code>SqlInjectionMatchSet</code>.
     * </p>
     * 
     * @return The name, if any, of the <code>SqlInjectionMatchSet</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name, if any, of the <code>SqlInjectionMatchSet</code>.
     * </p>
     * 
     * @param name
     *        The name, if any, of the <code>SqlInjectionMatchSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlInjectionMatchSet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL code.
     * </p>
     * 
     * @return Specifies the parts of web requests that you want to inspect for snippets of malicious SQL code.
     */

    public java.util.List<SqlInjectionMatchTuple> getSqlInjectionMatchTuples() {
        return sqlInjectionMatchTuples;
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL code.
     * </p>
     * 
     * @param sqlInjectionMatchTuples
     *        Specifies the parts of web requests that you want to inspect for snippets of malicious SQL code.
     */

    public void setSqlInjectionMatchTuples(java.util.Collection<SqlInjectionMatchTuple> sqlInjectionMatchTuples) {
        if (sqlInjectionMatchTuples == null) {
            this.sqlInjectionMatchTuples = null;
            return;
        }

        this.sqlInjectionMatchTuples = new java.util.ArrayList<SqlInjectionMatchTuple>(sqlInjectionMatchTuples);
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL code.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSqlInjectionMatchTuples(java.util.Collection)} or
     * {@link #withSqlInjectionMatchTuples(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sqlInjectionMatchTuples
     *        Specifies the parts of web requests that you want to inspect for snippets of malicious SQL code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlInjectionMatchSet withSqlInjectionMatchTuples(SqlInjectionMatchTuple... sqlInjectionMatchTuples) {
        if (this.sqlInjectionMatchTuples == null) {
            setSqlInjectionMatchTuples(new java.util.ArrayList<SqlInjectionMatchTuple>(sqlInjectionMatchTuples.length));
        }
        for (SqlInjectionMatchTuple ele : sqlInjectionMatchTuples) {
            this.sqlInjectionMatchTuples.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL code.
     * </p>
     * 
     * @param sqlInjectionMatchTuples
     *        Specifies the parts of web requests that you want to inspect for snippets of malicious SQL code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlInjectionMatchSet withSqlInjectionMatchTuples(java.util.Collection<SqlInjectionMatchTuple> sqlInjectionMatchTuples) {
        setSqlInjectionMatchTuples(sqlInjectionMatchTuples);
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
        if (getSqlInjectionMatchSetId() != null)
            sb.append("SqlInjectionMatchSetId: ").append(getSqlInjectionMatchSetId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSqlInjectionMatchTuples() != null)
            sb.append("SqlInjectionMatchTuples: ").append(getSqlInjectionMatchTuples());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqlInjectionMatchSet == false)
            return false;
        SqlInjectionMatchSet other = (SqlInjectionMatchSet) obj;
        if (other.getSqlInjectionMatchSetId() == null ^ this.getSqlInjectionMatchSetId() == null)
            return false;
        if (other.getSqlInjectionMatchSetId() != null && other.getSqlInjectionMatchSetId().equals(this.getSqlInjectionMatchSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSqlInjectionMatchTuples() == null ^ this.getSqlInjectionMatchTuples() == null)
            return false;
        if (other.getSqlInjectionMatchTuples() != null && other.getSqlInjectionMatchTuples().equals(this.getSqlInjectionMatchTuples()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSqlInjectionMatchSetId() == null) ? 0 : getSqlInjectionMatchSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSqlInjectionMatchTuples() == null) ? 0 : getSqlInjectionMatchTuples().hashCode());
        return hashCode;
    }

    @Override
    public SqlInjectionMatchSet clone() {
        try {
            return (SqlInjectionMatchSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.SqlInjectionMatchSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
