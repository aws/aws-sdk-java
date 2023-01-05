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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The filter to use to identify the subset of headers to inspect in a web request.
 * </p>
 * <p>
 * You must specify exactly one setting: either <code>All</code>, <code>IncludedHeaders</code>, or
 * <code>ExcludedHeaders</code>.
 * </p>
 * <p>
 * Example JSON: <code>"MatchPattern": { "ExcludedHeaders": {"KeyToExclude1", "KeyToExclude2"} }</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/HeaderMatchPattern" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HeaderMatchPattern implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Inspect all headers.
     * </p>
     */
    private All all;
    /**
     * <p>
     * Inspect only the headers that have a key that matches one of the strings specified here.
     * </p>
     */
    private java.util.List<String> includedHeaders;
    /**
     * <p>
     * Inspect only the headers whose keys don't match any of the strings specified here.
     * </p>
     */
    private java.util.List<String> excludedHeaders;

    /**
     * <p>
     * Inspect all headers.
     * </p>
     * 
     * @param all
     *        Inspect all headers.
     */

    public void setAll(All all) {
        this.all = all;
    }

    /**
     * <p>
     * Inspect all headers.
     * </p>
     * 
     * @return Inspect all headers.
     */

    public All getAll() {
        return this.all;
    }

    /**
     * <p>
     * Inspect all headers.
     * </p>
     * 
     * @param all
     *        Inspect all headers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderMatchPattern withAll(All all) {
        setAll(all);
        return this;
    }

    /**
     * <p>
     * Inspect only the headers that have a key that matches one of the strings specified here.
     * </p>
     * 
     * @return Inspect only the headers that have a key that matches one of the strings specified here.
     */

    public java.util.List<String> getIncludedHeaders() {
        return includedHeaders;
    }

    /**
     * <p>
     * Inspect only the headers that have a key that matches one of the strings specified here.
     * </p>
     * 
     * @param includedHeaders
     *        Inspect only the headers that have a key that matches one of the strings specified here.
     */

    public void setIncludedHeaders(java.util.Collection<String> includedHeaders) {
        if (includedHeaders == null) {
            this.includedHeaders = null;
            return;
        }

        this.includedHeaders = new java.util.ArrayList<String>(includedHeaders);
    }

    /**
     * <p>
     * Inspect only the headers that have a key that matches one of the strings specified here.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludedHeaders(java.util.Collection)} or {@link #withIncludedHeaders(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param includedHeaders
     *        Inspect only the headers that have a key that matches one of the strings specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderMatchPattern withIncludedHeaders(String... includedHeaders) {
        if (this.includedHeaders == null) {
            setIncludedHeaders(new java.util.ArrayList<String>(includedHeaders.length));
        }
        for (String ele : includedHeaders) {
            this.includedHeaders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Inspect only the headers that have a key that matches one of the strings specified here.
     * </p>
     * 
     * @param includedHeaders
     *        Inspect only the headers that have a key that matches one of the strings specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderMatchPattern withIncludedHeaders(java.util.Collection<String> includedHeaders) {
        setIncludedHeaders(includedHeaders);
        return this;
    }

    /**
     * <p>
     * Inspect only the headers whose keys don't match any of the strings specified here.
     * </p>
     * 
     * @return Inspect only the headers whose keys don't match any of the strings specified here.
     */

    public java.util.List<String> getExcludedHeaders() {
        return excludedHeaders;
    }

    /**
     * <p>
     * Inspect only the headers whose keys don't match any of the strings specified here.
     * </p>
     * 
     * @param excludedHeaders
     *        Inspect only the headers whose keys don't match any of the strings specified here.
     */

    public void setExcludedHeaders(java.util.Collection<String> excludedHeaders) {
        if (excludedHeaders == null) {
            this.excludedHeaders = null;
            return;
        }

        this.excludedHeaders = new java.util.ArrayList<String>(excludedHeaders);
    }

    /**
     * <p>
     * Inspect only the headers whose keys don't match any of the strings specified here.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedHeaders(java.util.Collection)} or {@link #withExcludedHeaders(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param excludedHeaders
     *        Inspect only the headers whose keys don't match any of the strings specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderMatchPattern withExcludedHeaders(String... excludedHeaders) {
        if (this.excludedHeaders == null) {
            setExcludedHeaders(new java.util.ArrayList<String>(excludedHeaders.length));
        }
        for (String ele : excludedHeaders) {
            this.excludedHeaders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Inspect only the headers whose keys don't match any of the strings specified here.
     * </p>
     * 
     * @param excludedHeaders
     *        Inspect only the headers whose keys don't match any of the strings specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderMatchPattern withExcludedHeaders(java.util.Collection<String> excludedHeaders) {
        setExcludedHeaders(excludedHeaders);
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
        if (getAll() != null)
            sb.append("All: ").append(getAll()).append(",");
        if (getIncludedHeaders() != null)
            sb.append("IncludedHeaders: ").append(getIncludedHeaders()).append(",");
        if (getExcludedHeaders() != null)
            sb.append("ExcludedHeaders: ").append(getExcludedHeaders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HeaderMatchPattern == false)
            return false;
        HeaderMatchPattern other = (HeaderMatchPattern) obj;
        if (other.getAll() == null ^ this.getAll() == null)
            return false;
        if (other.getAll() != null && other.getAll().equals(this.getAll()) == false)
            return false;
        if (other.getIncludedHeaders() == null ^ this.getIncludedHeaders() == null)
            return false;
        if (other.getIncludedHeaders() != null && other.getIncludedHeaders().equals(this.getIncludedHeaders()) == false)
            return false;
        if (other.getExcludedHeaders() == null ^ this.getExcludedHeaders() == null)
            return false;
        if (other.getExcludedHeaders() != null && other.getExcludedHeaders().equals(this.getExcludedHeaders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAll() == null) ? 0 : getAll().hashCode());
        hashCode = prime * hashCode + ((getIncludedHeaders() == null) ? 0 : getIncludedHeaders().hashCode());
        hashCode = prime * hashCode + ((getExcludedHeaders() == null) ? 0 : getExcludedHeaders().hashCode());
        return hashCode;
    }

    @Override
    public HeaderMatchPattern clone() {
        try {
            return (HeaderMatchPattern) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.HeaderMatchPatternMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
