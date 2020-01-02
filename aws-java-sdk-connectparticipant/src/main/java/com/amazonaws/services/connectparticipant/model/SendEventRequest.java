/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/SendEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendEventRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The content type of the request. Supported types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.typing
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.connection.acknowledged
     * </p>
     * </li>
     * </ul>
     */
    private String contentType;
    /**
     * <p>
     * The content of the event to be sent (for example, message text). This is not yet supported.
     * </p>
     */
    private String content;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     */
    private String connectionToken;

    /**
     * <p>
     * The content type of the request. Supported types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.typing
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.connection.acknowledged
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        The content type of the request. Supported types are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        application/vnd.amazonaws.connect.event.typing
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        application/vnd.amazonaws.connect.event.connection.acknowledged
     *        </p>
     *        </li>
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the request. Supported types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.typing
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.connection.acknowledged
     * </p>
     * </li>
     * </ul>
     * 
     * @return The content type of the request. Supported types are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         application/vnd.amazonaws.connect.event.typing
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         application/vnd.amazonaws.connect.event.connection.acknowledged
     *         </p>
     *         </li>
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the request. Supported types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.typing
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.connection.acknowledged
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        The content type of the request. Supported types are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        application/vnd.amazonaws.connect.event.typing
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        application/vnd.amazonaws.connect.event.connection.acknowledged
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The content of the event to be sent (for example, message text). This is not yet supported.
     * </p>
     * 
     * @param content
     *        The content of the event to be sent (for example, message text). This is not yet supported.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the event to be sent (for example, message text). This is not yet supported.
     * </p>
     * 
     * @return The content of the event to be sent (for example, message text). This is not yet supported.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the event to be sent (for example, message text). This is not yet supported.
     * </p>
     * 
     * @param content
     *        The content of the event to be sent (for example, message text). This is not yet supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * 
     * @param connectionToken
     *        The authentication token associated with the participant's connection.
     */

    public void setConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
    }

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * 
     * @return The authentication token associated with the participant's connection.
     */

    public String getConnectionToken() {
        return this.connectionToken;
    }

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * 
     * @param connectionToken
     *        The authentication token associated with the participant's connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest withConnectionToken(String connectionToken) {
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

        if (obj instanceof SendEventRequest == false)
            return false;
        SendEventRequest other = (SendEventRequest) obj;
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
    public SendEventRequest clone() {
        return (SendEventRequest) super.clone();
    }

}
