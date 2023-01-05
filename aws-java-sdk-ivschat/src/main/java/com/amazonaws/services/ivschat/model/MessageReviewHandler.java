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
package com.amazonaws.services.ivschat.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for optional message review.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/MessageReviewHandler" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageReviewHandler implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the fallback behavior (whether the message is allowed or denied) if the handler does not return a valid
     * response, encounters an error, or times out. (For the timeout period, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/service-quotas.html"> Service Quotas</a>.) If allowed, the
     * message is delivered with returned content to all users connected to the room. If denied, the message is not
     * delivered to any user. Default: <code>ALLOW</code>.
     * </p>
     */
    private String fallbackResult;
    /**
     * <p>
     * Identifier of the message review handler. Currently this must be an ARN of a lambda function.
     * </p>
     */
    private String uri;

    /**
     * <p>
     * Specifies the fallback behavior (whether the message is allowed or denied) if the handler does not return a valid
     * response, encounters an error, or times out. (For the timeout period, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/service-quotas.html"> Service Quotas</a>.) If allowed, the
     * message is delivered with returned content to all users connected to the room. If denied, the message is not
     * delivered to any user. Default: <code>ALLOW</code>.
     * </p>
     * 
     * @param fallbackResult
     *        Specifies the fallback behavior (whether the message is allowed or denied) if the handler does not return
     *        a valid response, encounters an error, or times out. (For the timeout period, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/userguide/service-quotas.html"> Service Quotas</a>.) If
     *        allowed, the message is delivered with returned content to all users connected to the room. If denied, the
     *        message is not delivered to any user. Default: <code>ALLOW</code>.
     * @see FallbackResult
     */

    public void setFallbackResult(String fallbackResult) {
        this.fallbackResult = fallbackResult;
    }

    /**
     * <p>
     * Specifies the fallback behavior (whether the message is allowed or denied) if the handler does not return a valid
     * response, encounters an error, or times out. (For the timeout period, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/service-quotas.html"> Service Quotas</a>.) If allowed, the
     * message is delivered with returned content to all users connected to the room. If denied, the message is not
     * delivered to any user. Default: <code>ALLOW</code>.
     * </p>
     * 
     * @return Specifies the fallback behavior (whether the message is allowed or denied) if the handler does not return
     *         a valid response, encounters an error, or times out. (For the timeout period, see <a
     *         href="https://docs.aws.amazon.com/ivs/latest/userguide/service-quotas.html"> Service Quotas</a>.) If
     *         allowed, the message is delivered with returned content to all users connected to the room. If denied,
     *         the message is not delivered to any user. Default: <code>ALLOW</code>.
     * @see FallbackResult
     */

    public String getFallbackResult() {
        return this.fallbackResult;
    }

    /**
     * <p>
     * Specifies the fallback behavior (whether the message is allowed or denied) if the handler does not return a valid
     * response, encounters an error, or times out. (For the timeout period, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/service-quotas.html"> Service Quotas</a>.) If allowed, the
     * message is delivered with returned content to all users connected to the room. If denied, the message is not
     * delivered to any user. Default: <code>ALLOW</code>.
     * </p>
     * 
     * @param fallbackResult
     *        Specifies the fallback behavior (whether the message is allowed or denied) if the handler does not return
     *        a valid response, encounters an error, or times out. (For the timeout period, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/userguide/service-quotas.html"> Service Quotas</a>.) If
     *        allowed, the message is delivered with returned content to all users connected to the room. If denied, the
     *        message is not delivered to any user. Default: <code>ALLOW</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FallbackResult
     */

    public MessageReviewHandler withFallbackResult(String fallbackResult) {
        setFallbackResult(fallbackResult);
        return this;
    }

    /**
     * <p>
     * Specifies the fallback behavior (whether the message is allowed or denied) if the handler does not return a valid
     * response, encounters an error, or times out. (For the timeout period, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/service-quotas.html"> Service Quotas</a>.) If allowed, the
     * message is delivered with returned content to all users connected to the room. If denied, the message is not
     * delivered to any user. Default: <code>ALLOW</code>.
     * </p>
     * 
     * @param fallbackResult
     *        Specifies the fallback behavior (whether the message is allowed or denied) if the handler does not return
     *        a valid response, encounters an error, or times out. (For the timeout period, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/userguide/service-quotas.html"> Service Quotas</a>.) If
     *        allowed, the message is delivered with returned content to all users connected to the room. If denied, the
     *        message is not delivered to any user. Default: <code>ALLOW</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FallbackResult
     */

    public MessageReviewHandler withFallbackResult(FallbackResult fallbackResult) {
        this.fallbackResult = fallbackResult.toString();
        return this;
    }

    /**
     * <p>
     * Identifier of the message review handler. Currently this must be an ARN of a lambda function.
     * </p>
     * 
     * @param uri
     *        Identifier of the message review handler. Currently this must be an ARN of a lambda function.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * Identifier of the message review handler. Currently this must be an ARN of a lambda function.
     * </p>
     * 
     * @return Identifier of the message review handler. Currently this must be an ARN of a lambda function.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * Identifier of the message review handler. Currently this must be an ARN of a lambda function.
     * </p>
     * 
     * @param uri
     *        Identifier of the message review handler. Currently this must be an ARN of a lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageReviewHandler withUri(String uri) {
        setUri(uri);
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
        if (getFallbackResult() != null)
            sb.append("FallbackResult: ").append(getFallbackResult()).append(",");
        if (getUri() != null)
            sb.append("Uri: ").append(getUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageReviewHandler == false)
            return false;
        MessageReviewHandler other = (MessageReviewHandler) obj;
        if (other.getFallbackResult() == null ^ this.getFallbackResult() == null)
            return false;
        if (other.getFallbackResult() != null && other.getFallbackResult().equals(this.getFallbackResult()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFallbackResult() == null) ? 0 : getFallbackResult().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        return hashCode;
    }

    @Override
    public MessageReviewHandler clone() {
        try {
            return (MessageReviewHandler) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivschat.model.transform.MessageReviewHandlerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
