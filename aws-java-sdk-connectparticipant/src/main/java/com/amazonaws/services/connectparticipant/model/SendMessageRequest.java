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
package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/SendMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the content. Supported types are <code>text/plain</code>, <code>text/markdown</code>, and
     * <code>application/json</code>.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The content of the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>text/plain</code> and <code>text/markdown</code>, the Length Constraints are Minimum of 1, Maximum of
     * 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>application/json</code>, the Length Constraints are Minimum of 1, Maximum of 12000.
     * </p>
     * </li>
     * </ul>
     */
    private String content;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The authentication token associated with the connection.
     * </p>
     */
    private String connectionToken;

    /**
     * <p>
     * The type of the content. Supported types are <code>text/plain</code>, <code>text/markdown</code>, and
     * <code>application/json</code>.
     * </p>
     * 
     * @param contentType
     *        The type of the content. Supported types are <code>text/plain</code>, <code>text/markdown</code>, and
     *        <code>application/json</code>.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The type of the content. Supported types are <code>text/plain</code>, <code>text/markdown</code>, and
     * <code>application/json</code>.
     * </p>
     * 
     * @return The type of the content. Supported types are <code>text/plain</code>, <code>text/markdown</code>, and
     *         <code>application/json</code>.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The type of the content. Supported types are <code>text/plain</code>, <code>text/markdown</code>, and
     * <code>application/json</code>.
     * </p>
     * 
     * @param contentType
     *        The type of the content. Supported types are <code>text/plain</code>, <code>text/markdown</code>, and
     *        <code>application/json</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The content of the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>text/plain</code> and <code>text/markdown</code>, the Length Constraints are Minimum of 1, Maximum of
     * 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>application/json</code>, the Length Constraints are Minimum of 1, Maximum of 12000.
     * </p>
     * </li>
     * </ul>
     * 
     * @param content
     *        The content of the message. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>text/plain</code> and <code>text/markdown</code>, the Length Constraints are Minimum of 1,
     *        Maximum of 1024.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>application/json</code>, the Length Constraints are Minimum of 1, Maximum of 12000.
     *        </p>
     *        </li>
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>text/plain</code> and <code>text/markdown</code>, the Length Constraints are Minimum of 1, Maximum of
     * 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>application/json</code>, the Length Constraints are Minimum of 1, Maximum of 12000.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The content of the message. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>text/plain</code> and <code>text/markdown</code>, the Length Constraints are Minimum of 1,
     *         Maximum of 1024.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>application/json</code>, the Length Constraints are Minimum of 1, Maximum of 12000.
     *         </p>
     *         </li>
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>text/plain</code> and <code>text/markdown</code>, the Length Constraints are Minimum of 1, Maximum of
     * 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>application/json</code>, the Length Constraints are Minimum of 1, Maximum of 12000.
     * </p>
     * </li>
     * </ul>
     * 
     * @param content
     *        The content of the message. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>text/plain</code> and <code>text/markdown</code>, the Length Constraints are Minimum of 1,
     *        Maximum of 1024.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>application/json</code>, the Length Constraints are Minimum of 1, Maximum of 12000.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *         provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see
     *         <a href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making
     *         retries safe with idempotent APIs</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The authentication token associated with the connection.
     * </p>
     * 
     * @param connectionToken
     *        The authentication token associated with the connection.
     */

    public void setConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
    }

    /**
     * <p>
     * The authentication token associated with the connection.
     * </p>
     * 
     * @return The authentication token associated with the connection.
     */

    public String getConnectionToken() {
        return this.connectionToken;
    }

    /**
     * <p>
     * The authentication token associated with the connection.
     * </p>
     * 
     * @param connectionToken
     *        The authentication token associated with the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageRequest withConnectionToken(String connectionToken) {
        setConnectionToken(connectionToken);
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getConnectionToken() != null)
            sb.append("ConnectionToken: ").append(getConnectionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendMessageRequest == false)
            return false;
        SendMessageRequest other = (SendMessageRequest) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getConnectionToken() == null ^ this.getConnectionToken() == null)
            return false;
        if (other.getConnectionToken() != null && other.getConnectionToken().equals(this.getConnectionToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getConnectionToken() == null) ? 0 : getConnectionToken().hashCode());
        return hashCode;
    }

    @Override
    public SendMessageRequest clone() {
        return (SendMessageRequest) super.clone();
    }

}
