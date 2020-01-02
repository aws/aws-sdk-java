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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a request to create a message template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateTemplateMessageBody" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTemplateMessageBody implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template that was created.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The message that's returned from the API for the request to create the message template.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The unique identifier for the request to create the message template.
     * </p>
     */
    private String requestID;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template that was created.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the message template that was created.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template that was created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the message template that was created.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template that was created.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the message template that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateMessageBody withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The message that's returned from the API for the request to create the message template.
     * </p>
     * 
     * @param message
     *        The message that's returned from the API for the request to create the message template.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message that's returned from the API for the request to create the message template.
     * </p>
     * 
     * @return The message that's returned from the API for the request to create the message template.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message that's returned from the API for the request to create the message template.
     * </p>
     * 
     * @param message
     *        The message that's returned from the API for the request to create the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateMessageBody withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the request to create the message template.
     * </p>
     * 
     * @param requestID
     *        The unique identifier for the request to create the message template.
     */

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    /**
     * <p>
     * The unique identifier for the request to create the message template.
     * </p>
     * 
     * @return The unique identifier for the request to create the message template.
     */

    public String getRequestID() {
        return this.requestID;
    }

    /**
     * <p>
     * The unique identifier for the request to create the message template.
     * </p>
     * 
     * @param requestID
     *        The unique identifier for the request to create the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateMessageBody withRequestID(String requestID) {
        setRequestID(requestID);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getRequestID() != null)
            sb.append("RequestID: ").append(getRequestID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTemplateMessageBody == false)
            return false;
        CreateTemplateMessageBody other = (CreateTemplateMessageBody) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getRequestID() == null ^ this.getRequestID() == null)
            return false;
        if (other.getRequestID() != null && other.getRequestID().equals(this.getRequestID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getRequestID() == null) ? 0 : getRequestID().hashCode());
        return hashCode;
    }

    @Override
    public CreateTemplateMessageBody clone() {
        try {
            return (CreateTemplateMessageBody) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.CreateTemplateMessageBodyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
