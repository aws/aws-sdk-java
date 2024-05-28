/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Inspect a string containing the list of the request's header names, ordered as they appear in the web request that
 * WAF receives for inspection. WAF generates the string and then uses that as the field to match component in its
 * inspection. WAF separates the header names in the string using colons and no added spaces, for example
 * <code>host:user-agent:accept:authorization:referer</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/HeaderOrder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HeaderOrder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * What WAF should do if the headers of the request are more numerous or larger than WAF can inspect. WAF does not
     * support inspecting the entire contents of request headers when they exceed 8 KB (8192 bytes) or 200 total
     * headers. The underlying host service forwards a maximum of 200 headers and at most 8 KB of header contents to
     * WAF.
     * </p>
     * <p>
     * The options for oversize handling are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Inspect the available headers normally, according to the rule inspection criteria.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to the
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     * </p>
     * </li>
     * </ul>
     */
    private String oversizeHandling;

    /**
     * <p>
     * What WAF should do if the headers of the request are more numerous or larger than WAF can inspect. WAF does not
     * support inspecting the entire contents of request headers when they exceed 8 KB (8192 bytes) or 200 total
     * headers. The underlying host service forwards a maximum of 200 headers and at most 8 KB of header contents to
     * WAF.
     * </p>
     * <p>
     * The options for oversize handling are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Inspect the available headers normally, according to the rule inspection criteria.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to the
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     * </p>
     * </li>
     * </ul>
     * 
     * @param oversizeHandling
     *        What WAF should do if the headers of the request are more numerous or larger than WAF can inspect. WAF
     *        does not support inspecting the entire contents of request headers when they exceed 8 KB (8192 bytes) or
     *        200 total headers. The underlying host service forwards a maximum of 200 headers and at most 8 KB of
     *        header contents to WAF. </p>
     *        <p>
     *        The options for oversize handling are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONTINUE</code> - Inspect the available headers normally, according to the rule inspection criteria.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to
     *        the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     *        </p>
     *        </li>
     * @see OversizeHandling
     */

    public void setOversizeHandling(String oversizeHandling) {
        this.oversizeHandling = oversizeHandling;
    }

    /**
     * <p>
     * What WAF should do if the headers of the request are more numerous or larger than WAF can inspect. WAF does not
     * support inspecting the entire contents of request headers when they exceed 8 KB (8192 bytes) or 200 total
     * headers. The underlying host service forwards a maximum of 200 headers and at most 8 KB of header contents to
     * WAF.
     * </p>
     * <p>
     * The options for oversize handling are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Inspect the available headers normally, according to the rule inspection criteria.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to the
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     * </p>
     * </li>
     * </ul>
     * 
     * @return What WAF should do if the headers of the request are more numerous or larger than WAF can inspect. WAF
     *         does not support inspecting the entire contents of request headers when they exceed 8 KB (8192 bytes) or
     *         200 total headers. The underlying host service forwards a maximum of 200 headers and at most 8 KB of
     *         header contents to WAF. </p>
     *         <p>
     *         The options for oversize handling are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CONTINUE</code> - Inspect the available headers normally, according to the rule inspection
     *         criteria.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to
     *         the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     *         </p>
     *         </li>
     * @see OversizeHandling
     */

    public String getOversizeHandling() {
        return this.oversizeHandling;
    }

    /**
     * <p>
     * What WAF should do if the headers of the request are more numerous or larger than WAF can inspect. WAF does not
     * support inspecting the entire contents of request headers when they exceed 8 KB (8192 bytes) or 200 total
     * headers. The underlying host service forwards a maximum of 200 headers and at most 8 KB of header contents to
     * WAF.
     * </p>
     * <p>
     * The options for oversize handling are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Inspect the available headers normally, according to the rule inspection criteria.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to the
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     * </p>
     * </li>
     * </ul>
     * 
     * @param oversizeHandling
     *        What WAF should do if the headers of the request are more numerous or larger than WAF can inspect. WAF
     *        does not support inspecting the entire contents of request headers when they exceed 8 KB (8192 bytes) or
     *        200 total headers. The underlying host service forwards a maximum of 200 headers and at most 8 KB of
     *        header contents to WAF. </p>
     *        <p>
     *        The options for oversize handling are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONTINUE</code> - Inspect the available headers normally, according to the rule inspection criteria.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to
     *        the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OversizeHandling
     */

    public HeaderOrder withOversizeHandling(String oversizeHandling) {
        setOversizeHandling(oversizeHandling);
        return this;
    }

    /**
     * <p>
     * What WAF should do if the headers of the request are more numerous or larger than WAF can inspect. WAF does not
     * support inspecting the entire contents of request headers when they exceed 8 KB (8192 bytes) or 200 total
     * headers. The underlying host service forwards a maximum of 200 headers and at most 8 KB of header contents to
     * WAF.
     * </p>
     * <p>
     * The options for oversize handling are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Inspect the available headers normally, according to the rule inspection criteria.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to the
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     * </p>
     * </li>
     * </ul>
     * 
     * @param oversizeHandling
     *        What WAF should do if the headers of the request are more numerous or larger than WAF can inspect. WAF
     *        does not support inspecting the entire contents of request headers when they exceed 8 KB (8192 bytes) or
     *        200 total headers. The underlying host service forwards a maximum of 200 headers and at most 8 KB of
     *        header contents to WAF. </p>
     *        <p>
     *        The options for oversize handling are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONTINUE</code> - Inspect the available headers normally, according to the rule inspection criteria.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MATCH</code> - Treat the web request as matching the rule statement. WAF applies the rule action to
     *        the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OversizeHandling
     */

    public HeaderOrder withOversizeHandling(OversizeHandling oversizeHandling) {
        this.oversizeHandling = oversizeHandling.toString();
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
        if (getOversizeHandling() != null)
            sb.append("OversizeHandling: ").append(getOversizeHandling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HeaderOrder == false)
            return false;
        HeaderOrder other = (HeaderOrder) obj;
        if (other.getOversizeHandling() == null ^ this.getOversizeHandling() == null)
            return false;
        if (other.getOversizeHandling() != null && other.getOversizeHandling().equals(this.getOversizeHandling()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOversizeHandling() == null) ? 0 : getOversizeHandling().hashCode());
        return hashCode;
    }

    @Override
    public HeaderOrder clone() {
        try {
            return (HeaderOrder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.HeaderOrderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
