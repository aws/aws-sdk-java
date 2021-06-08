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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of the HTTP endpoint request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/HttpEndpointRequestConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpEndpointRequestConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the request to
     * the destination. For more information, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Encoding">Content-Encoding</a> in MDN Web
     * Docs, the official Mozilla documentation.
     * </p>
     */
    private String contentEncoding;
    /**
     * <p>
     * Describes the metadata sent to the HTTP endpoint destination.
     * </p>
     */
    private java.util.List<HttpEndpointCommonAttribute> commonAttributes;

    /**
     * <p>
     * Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the request to
     * the destination. For more information, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Encoding">Content-Encoding</a> in MDN Web
     * Docs, the official Mozilla documentation.
     * </p>
     * 
     * @param contentEncoding
     *        Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the
     *        request to the destination. For more information, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Encoding">Content-Encoding</a> in
     *        MDN Web Docs, the official Mozilla documentation.
     * @see ContentEncoding
     */

    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    /**
     * <p>
     * Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the request to
     * the destination. For more information, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Encoding">Content-Encoding</a> in MDN Web
     * Docs, the official Mozilla documentation.
     * </p>
     * 
     * @return Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the
     *         request to the destination. For more information, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Encoding">Content-Encoding</a> in
     *         MDN Web Docs, the official Mozilla documentation.
     * @see ContentEncoding
     */

    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * <p>
     * Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the request to
     * the destination. For more information, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Encoding">Content-Encoding</a> in MDN Web
     * Docs, the official Mozilla documentation.
     * </p>
     * 
     * @param contentEncoding
     *        Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the
     *        request to the destination. For more information, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Encoding">Content-Encoding</a> in
     *        MDN Web Docs, the official Mozilla documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentEncoding
     */

    public HttpEndpointRequestConfiguration withContentEncoding(String contentEncoding) {
        setContentEncoding(contentEncoding);
        return this;
    }

    /**
     * <p>
     * Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the request to
     * the destination. For more information, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Encoding">Content-Encoding</a> in MDN Web
     * Docs, the official Mozilla documentation.
     * </p>
     * 
     * @param contentEncoding
     *        Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the
     *        request to the destination. For more information, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Encoding">Content-Encoding</a> in
     *        MDN Web Docs, the official Mozilla documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentEncoding
     */

    public HttpEndpointRequestConfiguration withContentEncoding(ContentEncoding contentEncoding) {
        this.contentEncoding = contentEncoding.toString();
        return this;
    }

    /**
     * <p>
     * Describes the metadata sent to the HTTP endpoint destination.
     * </p>
     * 
     * @return Describes the metadata sent to the HTTP endpoint destination.
     */

    public java.util.List<HttpEndpointCommonAttribute> getCommonAttributes() {
        return commonAttributes;
    }

    /**
     * <p>
     * Describes the metadata sent to the HTTP endpoint destination.
     * </p>
     * 
     * @param commonAttributes
     *        Describes the metadata sent to the HTTP endpoint destination.
     */

    public void setCommonAttributes(java.util.Collection<HttpEndpointCommonAttribute> commonAttributes) {
        if (commonAttributes == null) {
            this.commonAttributes = null;
            return;
        }

        this.commonAttributes = new java.util.ArrayList<HttpEndpointCommonAttribute>(commonAttributes);
    }

    /**
     * <p>
     * Describes the metadata sent to the HTTP endpoint destination.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommonAttributes(java.util.Collection)} or {@link #withCommonAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param commonAttributes
     *        Describes the metadata sent to the HTTP endpoint destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpEndpointRequestConfiguration withCommonAttributes(HttpEndpointCommonAttribute... commonAttributes) {
        if (this.commonAttributes == null) {
            setCommonAttributes(new java.util.ArrayList<HttpEndpointCommonAttribute>(commonAttributes.length));
        }
        for (HttpEndpointCommonAttribute ele : commonAttributes) {
            this.commonAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the metadata sent to the HTTP endpoint destination.
     * </p>
     * 
     * @param commonAttributes
     *        Describes the metadata sent to the HTTP endpoint destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpEndpointRequestConfiguration withCommonAttributes(java.util.Collection<HttpEndpointCommonAttribute> commonAttributes) {
        setCommonAttributes(commonAttributes);
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
        if (getContentEncoding() != null)
            sb.append("ContentEncoding: ").append(getContentEncoding()).append(",");
        if (getCommonAttributes() != null)
            sb.append("CommonAttributes: ").append(getCommonAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpEndpointRequestConfiguration == false)
            return false;
        HttpEndpointRequestConfiguration other = (HttpEndpointRequestConfiguration) obj;
        if (other.getContentEncoding() == null ^ this.getContentEncoding() == null)
            return false;
        if (other.getContentEncoding() != null && other.getContentEncoding().equals(this.getContentEncoding()) == false)
            return false;
        if (other.getCommonAttributes() == null ^ this.getCommonAttributes() == null)
            return false;
        if (other.getCommonAttributes() != null && other.getCommonAttributes().equals(this.getCommonAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentEncoding() == null) ? 0 : getContentEncoding().hashCode());
        hashCode = prime * hashCode + ((getCommonAttributes() == null) ? 0 : getCommonAttributes().hashCode());
        return hashCode;
    }

    @Override
    public HttpEndpointRequestConfiguration clone() {
        try {
            return (HttpEndpointRequestConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.HttpEndpointRequestConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
