/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the query string parameters that an Amazon Lightsail content delivery network (CDN) distribution to bases
 * caching on.
 * </p>
 * <p>
 * For the query strings that you specify, your distribution caches separate versions of the specified content based on
 * the query string values in viewer requests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/QueryStringObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryStringObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the distribution forwards and caches based on query strings.
     * </p>
     */
    private Boolean option;
    /**
     * <p>
     * The specific query strings that the distribution forwards to the origin.
     * </p>
     * <p>
     * Your distribution will cache content based on the specified query strings.
     * </p>
     * <p>
     * If the <code>option</code> parameter is true, then your distribution forwards all query strings, regardless of
     * what you specify using the <code>queryStringsAllowList</code> parameter.
     * </p>
     */
    private java.util.List<String> queryStringsAllowList;

    /**
     * <p>
     * Indicates whether the distribution forwards and caches based on query strings.
     * </p>
     * 
     * @param option
     *        Indicates whether the distribution forwards and caches based on query strings.
     */

    public void setOption(Boolean option) {
        this.option = option;
    }

    /**
     * <p>
     * Indicates whether the distribution forwards and caches based on query strings.
     * </p>
     * 
     * @return Indicates whether the distribution forwards and caches based on query strings.
     */

    public Boolean getOption() {
        return this.option;
    }

    /**
     * <p>
     * Indicates whether the distribution forwards and caches based on query strings.
     * </p>
     * 
     * @param option
     *        Indicates whether the distribution forwards and caches based on query strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStringObject withOption(Boolean option) {
        setOption(option);
        return this;
    }

    /**
     * <p>
     * Indicates whether the distribution forwards and caches based on query strings.
     * </p>
     * 
     * @return Indicates whether the distribution forwards and caches based on query strings.
     */

    public Boolean isOption() {
        return this.option;
    }

    /**
     * <p>
     * The specific query strings that the distribution forwards to the origin.
     * </p>
     * <p>
     * Your distribution will cache content based on the specified query strings.
     * </p>
     * <p>
     * If the <code>option</code> parameter is true, then your distribution forwards all query strings, regardless of
     * what you specify using the <code>queryStringsAllowList</code> parameter.
     * </p>
     * 
     * @return The specific query strings that the distribution forwards to the origin.</p>
     *         <p>
     *         Your distribution will cache content based on the specified query strings.
     *         </p>
     *         <p>
     *         If the <code>option</code> parameter is true, then your distribution forwards all query strings,
     *         regardless of what you specify using the <code>queryStringsAllowList</code> parameter.
     */

    public java.util.List<String> getQueryStringsAllowList() {
        return queryStringsAllowList;
    }

    /**
     * <p>
     * The specific query strings that the distribution forwards to the origin.
     * </p>
     * <p>
     * Your distribution will cache content based on the specified query strings.
     * </p>
     * <p>
     * If the <code>option</code> parameter is true, then your distribution forwards all query strings, regardless of
     * what you specify using the <code>queryStringsAllowList</code> parameter.
     * </p>
     * 
     * @param queryStringsAllowList
     *        The specific query strings that the distribution forwards to the origin.</p>
     *        <p>
     *        Your distribution will cache content based on the specified query strings.
     *        </p>
     *        <p>
     *        If the <code>option</code> parameter is true, then your distribution forwards all query strings,
     *        regardless of what you specify using the <code>queryStringsAllowList</code> parameter.
     */

    public void setQueryStringsAllowList(java.util.Collection<String> queryStringsAllowList) {
        if (queryStringsAllowList == null) {
            this.queryStringsAllowList = null;
            return;
        }

        this.queryStringsAllowList = new java.util.ArrayList<String>(queryStringsAllowList);
    }

    /**
     * <p>
     * The specific query strings that the distribution forwards to the origin.
     * </p>
     * <p>
     * Your distribution will cache content based on the specified query strings.
     * </p>
     * <p>
     * If the <code>option</code> parameter is true, then your distribution forwards all query strings, regardless of
     * what you specify using the <code>queryStringsAllowList</code> parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryStringsAllowList(java.util.Collection)} or
     * {@link #withQueryStringsAllowList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param queryStringsAllowList
     *        The specific query strings that the distribution forwards to the origin.</p>
     *        <p>
     *        Your distribution will cache content based on the specified query strings.
     *        </p>
     *        <p>
     *        If the <code>option</code> parameter is true, then your distribution forwards all query strings,
     *        regardless of what you specify using the <code>queryStringsAllowList</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStringObject withQueryStringsAllowList(String... queryStringsAllowList) {
        if (this.queryStringsAllowList == null) {
            setQueryStringsAllowList(new java.util.ArrayList<String>(queryStringsAllowList.length));
        }
        for (String ele : queryStringsAllowList) {
            this.queryStringsAllowList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The specific query strings that the distribution forwards to the origin.
     * </p>
     * <p>
     * Your distribution will cache content based on the specified query strings.
     * </p>
     * <p>
     * If the <code>option</code> parameter is true, then your distribution forwards all query strings, regardless of
     * what you specify using the <code>queryStringsAllowList</code> parameter.
     * </p>
     * 
     * @param queryStringsAllowList
     *        The specific query strings that the distribution forwards to the origin.</p>
     *        <p>
     *        Your distribution will cache content based on the specified query strings.
     *        </p>
     *        <p>
     *        If the <code>option</code> parameter is true, then your distribution forwards all query strings,
     *        regardless of what you specify using the <code>queryStringsAllowList</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStringObject withQueryStringsAllowList(java.util.Collection<String> queryStringsAllowList) {
        setQueryStringsAllowList(queryStringsAllowList);
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
        if (getOption() != null)
            sb.append("Option: ").append(getOption()).append(",");
        if (getQueryStringsAllowList() != null)
            sb.append("QueryStringsAllowList: ").append(getQueryStringsAllowList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryStringObject == false)
            return false;
        QueryStringObject other = (QueryStringObject) obj;
        if (other.getOption() == null ^ this.getOption() == null)
            return false;
        if (other.getOption() != null && other.getOption().equals(this.getOption()) == false)
            return false;
        if (other.getQueryStringsAllowList() == null ^ this.getQueryStringsAllowList() == null)
            return false;
        if (other.getQueryStringsAllowList() != null && other.getQueryStringsAllowList().equals(this.getQueryStringsAllowList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOption() == null) ? 0 : getOption().hashCode());
        hashCode = prime * hashCode + ((getQueryStringsAllowList() == null) ? 0 : getQueryStringsAllowList().hashCode());
        return hashCode;
    }

    @Override
    public QueryStringObject clone() {
        try {
            return (QueryStringObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.QueryStringObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
