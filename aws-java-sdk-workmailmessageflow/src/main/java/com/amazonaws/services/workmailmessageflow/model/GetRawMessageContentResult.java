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
package com.amazonaws.services.workmailmessageflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmailmessageflow-2019-05-01/GetRawMessageContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRawMessageContentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The raw content of the email message, in MIME format.
     * </p>
     */
    private java.io.InputStream messageContent;

    /**
     * <p>
     * The raw content of the email message, in MIME format.
     * </p>
     * 
     * @param messageContent
     *        The raw content of the email message, in MIME format.
     */

    public void setMessageContent(java.io.InputStream messageContent) {
        this.messageContent = messageContent;
    }

    /**
     * <p>
     * The raw content of the email message, in MIME format.
     * </p>
     * 
     * @return The raw content of the email message, in MIME format.
     */

    public java.io.InputStream getMessageContent() {
        return this.messageContent;
    }

    /**
     * <p>
     * The raw content of the email message, in MIME format.
     * </p>
     * 
     * @param messageContent
     *        The raw content of the email message, in MIME format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRawMessageContentResult withMessageContent(java.io.InputStream messageContent) {
        setMessageContent(messageContent);
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
        if (getMessageContent() != null)
            sb.append("MessageContent: ").append(getMessageContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRawMessageContentResult == false)
            return false;
        GetRawMessageContentResult other = (GetRawMessageContentResult) obj;
        if (other.getMessageContent() == null ^ this.getMessageContent() == null)
            return false;
        if (other.getMessageContent() != null && other.getMessageContent().equals(this.getMessageContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageContent() == null) ? 0 : getMessageContent().hashCode());
        return hashCode;
    }

    @Override
    public GetRawMessageContentResult clone() {
        try {
            return (GetRawMessageContentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
