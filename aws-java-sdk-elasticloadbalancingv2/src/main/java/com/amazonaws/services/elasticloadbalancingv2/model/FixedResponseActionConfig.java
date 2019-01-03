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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about an action that returns a custom HTTP response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/FixedResponseActionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FixedResponseActionConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The message.
     * </p>
     */
    private String messageBody;
    /**
     * <p>
     * The HTTP response code (2XX, 4XX, or 5XX).
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * The content type.
     * </p>
     * <p>
     * Valid Values: text/plain | text/css | text/html | application/javascript | application/json
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The message.
     * </p>
     * 
     * @param messageBody
     *        The message.
     */

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    /**
     * <p>
     * The message.
     * </p>
     * 
     * @return The message.
     */

    public String getMessageBody() {
        return this.messageBody;
    }

    /**
     * <p>
     * The message.
     * </p>
     * 
     * @param messageBody
     *        The message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FixedResponseActionConfig withMessageBody(String messageBody) {
        setMessageBody(messageBody);
        return this;
    }

    /**
     * <p>
     * The HTTP response code (2XX, 4XX, or 5XX).
     * </p>
     * 
     * @param statusCode
     *        The HTTP response code (2XX, 4XX, or 5XX).
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP response code (2XX, 4XX, or 5XX).
     * </p>
     * 
     * @return The HTTP response code (2XX, 4XX, or 5XX).
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The HTTP response code (2XX, 4XX, or 5XX).
     * </p>
     * 
     * @param statusCode
     *        The HTTP response code (2XX, 4XX, or 5XX).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FixedResponseActionConfig withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The content type.
     * </p>
     * <p>
     * Valid Values: text/plain | text/css | text/html | application/javascript | application/json
     * </p>
     * 
     * @param contentType
     *        The content type.</p>
     *        <p>
     *        Valid Values: text/plain | text/css | text/html | application/javascript | application/json
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type.
     * </p>
     * <p>
     * Valid Values: text/plain | text/css | text/html | application/javascript | application/json
     * </p>
     * 
     * @return The content type.</p>
     *         <p>
     *         Valid Values: text/plain | text/css | text/html | application/javascript | application/json
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type.
     * </p>
     * <p>
     * Valid Values: text/plain | text/css | text/html | application/javascript | application/json
     * </p>
     * 
     * @param contentType
     *        The content type.</p>
     *        <p>
     *        Valid Values: text/plain | text/css | text/html | application/javascript | application/json
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FixedResponseActionConfig withContentType(String contentType) {
        setContentType(contentType);
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
        if (getMessageBody() != null)
            sb.append("MessageBody: ").append(getMessageBody()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FixedResponseActionConfig == false)
            return false;
        FixedResponseActionConfig other = (FixedResponseActionConfig) obj;
        if (other.getMessageBody() == null ^ this.getMessageBody() == null)
            return false;
        if (other.getMessageBody() != null && other.getMessageBody().equals(this.getMessageBody()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageBody() == null) ? 0 : getMessageBody().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public FixedResponseActionConfig clone() {
        try {
            return (FixedResponseActionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
