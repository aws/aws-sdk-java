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

/**
 * <p>
 * The response to a <a>GetSqlInjectionMatchSet</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSqlInjectionMatchSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSqlInjectionMatchSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the <a>SqlInjectionMatchSet</a> that you specified in the <code>GetSqlInjectionMatchSet</code>
     * request. For more information, see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SqlInjectionMatchSet</a>: Contains <code>Name</code>, <code>SqlInjectionMatchSetId</code>, and an array of
     * <code>SqlInjectionMatchTuple</code> objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SqlInjectionMatchTuple</a>: Each <code>SqlInjectionMatchTuple</code> object contains <code>FieldToMatch</code>
     * and <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     */
    private SqlInjectionMatchSet sqlInjectionMatchSet;

    /**
     * <p>
     * Information about the <a>SqlInjectionMatchSet</a> that you specified in the <code>GetSqlInjectionMatchSet</code>
     * request. For more information, see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SqlInjectionMatchSet</a>: Contains <code>Name</code>, <code>SqlInjectionMatchSetId</code>, and an array of
     * <code>SqlInjectionMatchTuple</code> objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SqlInjectionMatchTuple</a>: Each <code>SqlInjectionMatchTuple</code> object contains <code>FieldToMatch</code>
     * and <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sqlInjectionMatchSet
     *        Information about the <a>SqlInjectionMatchSet</a> that you specified in the
     *        <code>GetSqlInjectionMatchSet</code> request. For more information, see the following topics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>SqlInjectionMatchSet</a>: Contains <code>Name</code>, <code>SqlInjectionMatchSetId</code>, and an array
     *        of <code>SqlInjectionMatchTuple</code> objects
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>SqlInjectionMatchTuple</a>: Each <code>SqlInjectionMatchTuple</code> object contains
     *        <code>FieldToMatch</code> and <code>TextTransformation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *        </p>
     *        </li>
     */

    public void setSqlInjectionMatchSet(SqlInjectionMatchSet sqlInjectionMatchSet) {
        this.sqlInjectionMatchSet = sqlInjectionMatchSet;
    }

    /**
     * <p>
     * Information about the <a>SqlInjectionMatchSet</a> that you specified in the <code>GetSqlInjectionMatchSet</code>
     * request. For more information, see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SqlInjectionMatchSet</a>: Contains <code>Name</code>, <code>SqlInjectionMatchSetId</code>, and an array of
     * <code>SqlInjectionMatchTuple</code> objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SqlInjectionMatchTuple</a>: Each <code>SqlInjectionMatchTuple</code> object contains <code>FieldToMatch</code>
     * and <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the <a>SqlInjectionMatchSet</a> that you specified in the
     *         <code>GetSqlInjectionMatchSet</code> request. For more information, see the following topics:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>SqlInjectionMatchSet</a>: Contains <code>Name</code>, <code>SqlInjectionMatchSetId</code>, and an
     *         array of <code>SqlInjectionMatchTuple</code> objects
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>SqlInjectionMatchTuple</a>: Each <code>SqlInjectionMatchTuple</code> object contains
     *         <code>FieldToMatch</code> and <code>TextTransformation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *         </p>
     *         </li>
     */

    public SqlInjectionMatchSet getSqlInjectionMatchSet() {
        return this.sqlInjectionMatchSet;
    }

    /**
     * <p>
     * Information about the <a>SqlInjectionMatchSet</a> that you specified in the <code>GetSqlInjectionMatchSet</code>
     * request. For more information, see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SqlInjectionMatchSet</a>: Contains <code>Name</code>, <code>SqlInjectionMatchSetId</code>, and an array of
     * <code>SqlInjectionMatchTuple</code> objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SqlInjectionMatchTuple</a>: Each <code>SqlInjectionMatchTuple</code> object contains <code>FieldToMatch</code>
     * and <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sqlInjectionMatchSet
     *        Information about the <a>SqlInjectionMatchSet</a> that you specified in the
     *        <code>GetSqlInjectionMatchSet</code> request. For more information, see the following topics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>SqlInjectionMatchSet</a>: Contains <code>Name</code>, <code>SqlInjectionMatchSetId</code>, and an array
     *        of <code>SqlInjectionMatchTuple</code> objects
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>SqlInjectionMatchTuple</a>: Each <code>SqlInjectionMatchTuple</code> object contains
     *        <code>FieldToMatch</code> and <code>TextTransformation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSqlInjectionMatchSetResult withSqlInjectionMatchSet(SqlInjectionMatchSet sqlInjectionMatchSet) {
        setSqlInjectionMatchSet(sqlInjectionMatchSet);
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
        if (getSqlInjectionMatchSet() != null)
            sb.append("SqlInjectionMatchSet: ").append(getSqlInjectionMatchSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSqlInjectionMatchSetResult == false)
            return false;
        GetSqlInjectionMatchSetResult other = (GetSqlInjectionMatchSetResult) obj;
        if (other.getSqlInjectionMatchSet() == null ^ this.getSqlInjectionMatchSet() == null)
            return false;
        if (other.getSqlInjectionMatchSet() != null && other.getSqlInjectionMatchSet().equals(this.getSqlInjectionMatchSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSqlInjectionMatchSet() == null) ? 0 : getSqlInjectionMatchSet().hashCode());
        return hashCode;
    }

    @Override
    public GetSqlInjectionMatchSetResult clone() {
        try {
            return (GetSqlInjectionMatchSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
