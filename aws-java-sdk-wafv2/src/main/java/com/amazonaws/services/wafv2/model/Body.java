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
 * Inspect the body of the web request. The body immediately follows the request headers.
 * </p>
 * <p>
 * This is used to indicate the web request component to inspect, in the <a>FieldToMatch</a> specification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/Body" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Body implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * What WAF should do if the body is larger than WAF can inspect. WAF does not support inspecting the entire
     * contents of the body of a web request when the body exceeds 8 KB (8192 bytes). Only the first 8 KB of the request
     * body are forwarded to WAF by the underlying host service.
     * </p>
     * <p>
     * The options for oversize handling are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Inspect the body normally, according to the rule inspection criteria.
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
     * <p>
     * You can combine the <code>MATCH</code> or <code>NO_MATCH</code> settings for oversize handling with your rule and
     * web ACL action settings, so that you block any request whose body is over 8 KB.
     * </p>
     * <p>
     * Default: <code>CONTINUE</code>
     * </p>
     */
    private String oversizeHandling;

    /**
     * <p>
     * What WAF should do if the body is larger than WAF can inspect. WAF does not support inspecting the entire
     * contents of the body of a web request when the body exceeds 8 KB (8192 bytes). Only the first 8 KB of the request
     * body are forwarded to WAF by the underlying host service.
     * </p>
     * <p>
     * The options for oversize handling are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Inspect the body normally, according to the rule inspection criteria.
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
     * <p>
     * You can combine the <code>MATCH</code> or <code>NO_MATCH</code> settings for oversize handling with your rule and
     * web ACL action settings, so that you block any request whose body is over 8 KB.
     * </p>
     * <p>
     * Default: <code>CONTINUE</code>
     * </p>
     * 
     * @param oversizeHandling
     *        What WAF should do if the body is larger than WAF can inspect. WAF does not support inspecting the entire
     *        contents of the body of a web request when the body exceeds 8 KB (8192 bytes). Only the first 8 KB of the
     *        request body are forwarded to WAF by the underlying host service. </p>
     *        <p>
     *        The options for oversize handling are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONTINUE</code> - Inspect the body normally, according to the rule inspection criteria.
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
     *        </ul>
     *        <p>
     *        You can combine the <code>MATCH</code> or <code>NO_MATCH</code> settings for oversize handling with your
     *        rule and web ACL action settings, so that you block any request whose body is over 8 KB.
     *        </p>
     *        <p>
     *        Default: <code>CONTINUE</code>
     * @see OversizeHandling
     */

    public void setOversizeHandling(String oversizeHandling) {
        this.oversizeHandling = oversizeHandling;
    }

    /**
     * <p>
     * What WAF should do if the body is larger than WAF can inspect. WAF does not support inspecting the entire
     * contents of the body of a web request when the body exceeds 8 KB (8192 bytes). Only the first 8 KB of the request
     * body are forwarded to WAF by the underlying host service.
     * </p>
     * <p>
     * The options for oversize handling are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Inspect the body normally, according to the rule inspection criteria.
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
     * <p>
     * You can combine the <code>MATCH</code> or <code>NO_MATCH</code> settings for oversize handling with your rule and
     * web ACL action settings, so that you block any request whose body is over 8 KB.
     * </p>
     * <p>
     * Default: <code>CONTINUE</code>
     * </p>
     * 
     * @return What WAF should do if the body is larger than WAF can inspect. WAF does not support inspecting the entire
     *         contents of the body of a web request when the body exceeds 8 KB (8192 bytes). Only the first 8 KB of the
     *         request body are forwarded to WAF by the underlying host service. </p>
     *         <p>
     *         The options for oversize handling are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CONTINUE</code> - Inspect the body normally, according to the rule inspection criteria.
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
     *         </ul>
     *         <p>
     *         You can combine the <code>MATCH</code> or <code>NO_MATCH</code> settings for oversize handling with your
     *         rule and web ACL action settings, so that you block any request whose body is over 8 KB.
     *         </p>
     *         <p>
     *         Default: <code>CONTINUE</code>
     * @see OversizeHandling
     */

    public String getOversizeHandling() {
        return this.oversizeHandling;
    }

    /**
     * <p>
     * What WAF should do if the body is larger than WAF can inspect. WAF does not support inspecting the entire
     * contents of the body of a web request when the body exceeds 8 KB (8192 bytes). Only the first 8 KB of the request
     * body are forwarded to WAF by the underlying host service.
     * </p>
     * <p>
     * The options for oversize handling are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Inspect the body normally, according to the rule inspection criteria.
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
     * <p>
     * You can combine the <code>MATCH</code> or <code>NO_MATCH</code> settings for oversize handling with your rule and
     * web ACL action settings, so that you block any request whose body is over 8 KB.
     * </p>
     * <p>
     * Default: <code>CONTINUE</code>
     * </p>
     * 
     * @param oversizeHandling
     *        What WAF should do if the body is larger than WAF can inspect. WAF does not support inspecting the entire
     *        contents of the body of a web request when the body exceeds 8 KB (8192 bytes). Only the first 8 KB of the
     *        request body are forwarded to WAF by the underlying host service. </p>
     *        <p>
     *        The options for oversize handling are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONTINUE</code> - Inspect the body normally, according to the rule inspection criteria.
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
     *        </ul>
     *        <p>
     *        You can combine the <code>MATCH</code> or <code>NO_MATCH</code> settings for oversize handling with your
     *        rule and web ACL action settings, so that you block any request whose body is over 8 KB.
     *        </p>
     *        <p>
     *        Default: <code>CONTINUE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OversizeHandling
     */

    public Body withOversizeHandling(String oversizeHandling) {
        setOversizeHandling(oversizeHandling);
        return this;
    }

    /**
     * <p>
     * What WAF should do if the body is larger than WAF can inspect. WAF does not support inspecting the entire
     * contents of the body of a web request when the body exceeds 8 KB (8192 bytes). Only the first 8 KB of the request
     * body are forwarded to WAF by the underlying host service.
     * </p>
     * <p>
     * The options for oversize handling are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Inspect the body normally, according to the rule inspection criteria.
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
     * <p>
     * You can combine the <code>MATCH</code> or <code>NO_MATCH</code> settings for oversize handling with your rule and
     * web ACL action settings, so that you block any request whose body is over 8 KB.
     * </p>
     * <p>
     * Default: <code>CONTINUE</code>
     * </p>
     * 
     * @param oversizeHandling
     *        What WAF should do if the body is larger than WAF can inspect. WAF does not support inspecting the entire
     *        contents of the body of a web request when the body exceeds 8 KB (8192 bytes). Only the first 8 KB of the
     *        request body are forwarded to WAF by the underlying host service. </p>
     *        <p>
     *        The options for oversize handling are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONTINUE</code> - Inspect the body normally, according to the rule inspection criteria.
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
     *        </ul>
     *        <p>
     *        You can combine the <code>MATCH</code> or <code>NO_MATCH</code> settings for oversize handling with your
     *        rule and web ACL action settings, so that you block any request whose body is over 8 KB.
     *        </p>
     *        <p>
     *        Default: <code>CONTINUE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OversizeHandling
     */

    public Body withOversizeHandling(OversizeHandling oversizeHandling) {
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

        if (obj instanceof Body == false)
            return false;
        Body other = (Body) obj;
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
    public Body clone() {
        try {
            return (Body) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.BodyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
