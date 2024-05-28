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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to return information about a message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetMessageInsights" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMessageInsightsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>MessageId</code> is a unique identifier for a message, and is returned when sending emails through Amazon
     * SES.
     * </p>
     */
    private String messageId;

    /**
     * <p>
     * A <code>MessageId</code> is a unique identifier for a message, and is returned when sending emails through Amazon
     * SES.
     * </p>
     * 
     * @param messageId
     *        A <code>MessageId</code> is a unique identifier for a message, and is returned when sending emails through
     *        Amazon SES.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * A <code>MessageId</code> is a unique identifier for a message, and is returned when sending emails through Amazon
     * SES.
     * </p>
     * 
     * @return A <code>MessageId</code> is a unique identifier for a message, and is returned when sending emails
     *         through Amazon SES.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * A <code>MessageId</code> is a unique identifier for a message, and is returned when sending emails through Amazon
     * SES.
     * </p>
     * 
     * @param messageId
     *        A <code>MessageId</code> is a unique identifier for a message, and is returned when sending emails through
     *        Amazon SES.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMessageInsightsRequest withMessageId(String messageId) {
        setMessageId(messageId);
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
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMessageInsightsRequest == false)
            return false;
        GetMessageInsightsRequest other = (GetMessageInsightsRequest) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        return hashCode;
    }

    @Override
    public GetMessageInsightsRequest clone() {
        return (GetMessageInsightsRequest) super.clone();
    }

}
