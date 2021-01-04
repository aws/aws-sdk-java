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
 * Describes the request headers that a Lightsail distribution bases caching on.
 * </p>
 * <p>
 * For the headers that you specify, your distribution caches separate versions of the specified content based on the
 * header values in viewer requests. For example, suppose viewer requests for <code>logo.jpg</code> contain a custom
 * <code>product</code> header that has a value of either <code>acme</code> or <code>apex</code>, and you configure your
 * distribution to cache your content based on values in the <code>product</code> header. Your distribution forwards the
 * <code>product</code> header to the origin and caches the response from the origin once for each header value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/HeaderObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HeaderObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The headers that you want your distribution to forward to your origin and base caching on.
     * </p>
     * <p>
     * You can configure your distribution to do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>all</code> </b> - Forward all headers to your origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>none</code> </b> - Forward only the default headers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>allow-list</code> </b> - Forward only the headers you specify using the <code>headersAllowList</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     */
    private String option;
    /**
     * <p>
     * The specific headers to forward to your distribution's origin.
     * </p>
     */
    private java.util.List<String> headersAllowList;

    /**
     * <p>
     * The headers that you want your distribution to forward to your origin and base caching on.
     * </p>
     * <p>
     * You can configure your distribution to do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>all</code> </b> - Forward all headers to your origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>none</code> </b> - Forward only the default headers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>allow-list</code> </b> - Forward only the headers you specify using the <code>headersAllowList</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param option
     *        The headers that you want your distribution to forward to your origin and base caching on.</p>
     *        <p>
     *        You can configure your distribution to do one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>all</code> </b> - Forward all headers to your origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>none</code> </b> - Forward only the default headers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>allow-list</code> </b> - Forward only the headers you specify using the
     *        <code>headersAllowList</code> parameter.
     *        </p>
     *        </li>
     * @see ForwardValues
     */

    public void setOption(String option) {
        this.option = option;
    }

    /**
     * <p>
     * The headers that you want your distribution to forward to your origin and base caching on.
     * </p>
     * <p>
     * You can configure your distribution to do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>all</code> </b> - Forward all headers to your origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>none</code> </b> - Forward only the default headers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>allow-list</code> </b> - Forward only the headers you specify using the <code>headersAllowList</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The headers that you want your distribution to forward to your origin and base caching on.</p>
     *         <p>
     *         You can configure your distribution to do one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>all</code> </b> - Forward all headers to your origin.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>none</code> </b> - Forward only the default headers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>allow-list</code> </b> - Forward only the headers you specify using the
     *         <code>headersAllowList</code> parameter.
     *         </p>
     *         </li>
     * @see ForwardValues
     */

    public String getOption() {
        return this.option;
    }

    /**
     * <p>
     * The headers that you want your distribution to forward to your origin and base caching on.
     * </p>
     * <p>
     * You can configure your distribution to do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>all</code> </b> - Forward all headers to your origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>none</code> </b> - Forward only the default headers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>allow-list</code> </b> - Forward only the headers you specify using the <code>headersAllowList</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param option
     *        The headers that you want your distribution to forward to your origin and base caching on.</p>
     *        <p>
     *        You can configure your distribution to do one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>all</code> </b> - Forward all headers to your origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>none</code> </b> - Forward only the default headers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>allow-list</code> </b> - Forward only the headers you specify using the
     *        <code>headersAllowList</code> parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ForwardValues
     */

    public HeaderObject withOption(String option) {
        setOption(option);
        return this;
    }

    /**
     * <p>
     * The headers that you want your distribution to forward to your origin and base caching on.
     * </p>
     * <p>
     * You can configure your distribution to do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>all</code> </b> - Forward all headers to your origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>none</code> </b> - Forward only the default headers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>allow-list</code> </b> - Forward only the headers you specify using the <code>headersAllowList</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param option
     *        The headers that you want your distribution to forward to your origin and base caching on.</p>
     *        <p>
     *        You can configure your distribution to do one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>all</code> </b> - Forward all headers to your origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>none</code> </b> - Forward only the default headers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>allow-list</code> </b> - Forward only the headers you specify using the
     *        <code>headersAllowList</code> parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ForwardValues
     */

    public HeaderObject withOption(ForwardValues option) {
        this.option = option.toString();
        return this;
    }

    /**
     * <p>
     * The specific headers to forward to your distribution's origin.
     * </p>
     * 
     * @return The specific headers to forward to your distribution's origin.
     * @see HeaderEnum
     */

    public java.util.List<String> getHeadersAllowList() {
        return headersAllowList;
    }

    /**
     * <p>
     * The specific headers to forward to your distribution's origin.
     * </p>
     * 
     * @param headersAllowList
     *        The specific headers to forward to your distribution's origin.
     * @see HeaderEnum
     */

    public void setHeadersAllowList(java.util.Collection<String> headersAllowList) {
        if (headersAllowList == null) {
            this.headersAllowList = null;
            return;
        }

        this.headersAllowList = new java.util.ArrayList<String>(headersAllowList);
    }

    /**
     * <p>
     * The specific headers to forward to your distribution's origin.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeadersAllowList(java.util.Collection)} or {@link #withHeadersAllowList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param headersAllowList
     *        The specific headers to forward to your distribution's origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HeaderEnum
     */

    public HeaderObject withHeadersAllowList(String... headersAllowList) {
        if (this.headersAllowList == null) {
            setHeadersAllowList(new java.util.ArrayList<String>(headersAllowList.length));
        }
        for (String ele : headersAllowList) {
            this.headersAllowList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The specific headers to forward to your distribution's origin.
     * </p>
     * 
     * @param headersAllowList
     *        The specific headers to forward to your distribution's origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HeaderEnum
     */

    public HeaderObject withHeadersAllowList(java.util.Collection<String> headersAllowList) {
        setHeadersAllowList(headersAllowList);
        return this;
    }

    /**
     * <p>
     * The specific headers to forward to your distribution's origin.
     * </p>
     * 
     * @param headersAllowList
     *        The specific headers to forward to your distribution's origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HeaderEnum
     */

    public HeaderObject withHeadersAllowList(HeaderEnum... headersAllowList) {
        java.util.ArrayList<String> headersAllowListCopy = new java.util.ArrayList<String>(headersAllowList.length);
        for (HeaderEnum value : headersAllowList) {
            headersAllowListCopy.add(value.toString());
        }
        if (getHeadersAllowList() == null) {
            setHeadersAllowList(headersAllowListCopy);
        } else {
            getHeadersAllowList().addAll(headersAllowListCopy);
        }
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
        if (getHeadersAllowList() != null)
            sb.append("HeadersAllowList: ").append(getHeadersAllowList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HeaderObject == false)
            return false;
        HeaderObject other = (HeaderObject) obj;
        if (other.getOption() == null ^ this.getOption() == null)
            return false;
        if (other.getOption() != null && other.getOption().equals(this.getOption()) == false)
            return false;
        if (other.getHeadersAllowList() == null ^ this.getHeadersAllowList() == null)
            return false;
        if (other.getHeadersAllowList() != null && other.getHeadersAllowList().equals(this.getHeadersAllowList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOption() == null) ? 0 : getOption().hashCode());
        hashCode = prime * hashCode + ((getHeadersAllowList() == null) ? 0 : getHeadersAllowList().hashCode());
        return hashCode;
    }

    @Override
    public HeaderObject clone() {
        try {
            return (HeaderObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.HeaderObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
