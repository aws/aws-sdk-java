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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to get a <a>SqlInjectionMatchSet</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSqlInjectionMatchSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSqlInjectionMatchSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>SqlInjectionMatchSetId</code> of the <a>SqlInjectionMatchSet</a> that you want to get.
     * <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     */
    private String sqlInjectionMatchSetId;

    /**
     * <p>
     * The <code>SqlInjectionMatchSetId</code> of the <a>SqlInjectionMatchSet</a> that you want to get.
     * <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     * 
     * @param sqlInjectionMatchSetId
     *        The <code>SqlInjectionMatchSetId</code> of the <a>SqlInjectionMatchSet</a> that you want to get.
     *        <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     *        <a>ListSqlInjectionMatchSets</a>.
     */

    public void setSqlInjectionMatchSetId(String sqlInjectionMatchSetId) {
        this.sqlInjectionMatchSetId = sqlInjectionMatchSetId;
    }

    /**
     * <p>
     * The <code>SqlInjectionMatchSetId</code> of the <a>SqlInjectionMatchSet</a> that you want to get.
     * <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     * 
     * @return The <code>SqlInjectionMatchSetId</code> of the <a>SqlInjectionMatchSet</a> that you want to get.
     *         <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     *         <a>ListSqlInjectionMatchSets</a>.
     */

    public String getSqlInjectionMatchSetId() {
        return this.sqlInjectionMatchSetId;
    }

    /**
     * <p>
     * The <code>SqlInjectionMatchSetId</code> of the <a>SqlInjectionMatchSet</a> that you want to get.
     * <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     * 
     * @param sqlInjectionMatchSetId
     *        The <code>SqlInjectionMatchSetId</code> of the <a>SqlInjectionMatchSet</a> that you want to get.
     *        <code>SqlInjectionMatchSetId</code> is returned by <a>CreateSqlInjectionMatchSet</a> and by
     *        <a>ListSqlInjectionMatchSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSqlInjectionMatchSetRequest withSqlInjectionMatchSetId(String sqlInjectionMatchSetId) {
        setSqlInjectionMatchSetId(sqlInjectionMatchSetId);
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
            sb.append("SqlInjectionMatchSetId: ").append(getSqlInjectionMatchSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSqlInjectionMatchSetRequest == false)
            return false;
        GetSqlInjectionMatchSetRequest other = (GetSqlInjectionMatchSetRequest) obj;
        if (other.getSqlInjectionMatchSetId() == null ^ this.getSqlInjectionMatchSetId() == null)
            return false;
        if (other.getSqlInjectionMatchSetId() != null && other.getSqlInjectionMatchSetId().equals(this.getSqlInjectionMatchSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSqlInjectionMatchSetId() == null) ? 0 : getSqlInjectionMatchSetId().hashCode());
        return hashCode;
    }

    @Override
    public GetSqlInjectionMatchSetRequest clone() {
        return (GetSqlInjectionMatchSetRequest) super.clone();
    }

}
