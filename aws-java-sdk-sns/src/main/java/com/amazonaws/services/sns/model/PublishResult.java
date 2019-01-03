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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Response for Publish action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/Publish" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier assigned to the published message.
     * </p>
     * <p>
     * Length Constraint: Maximum 100 characters
     * </p>
     */
    private String messageId;

    /**
     * <p>
     * Unique identifier assigned to the published message.
     * </p>
     * <p>
     * Length Constraint: Maximum 100 characters
     * </p>
     * 
     * @param messageId
     *        Unique identifier assigned to the published message.</p>
     *        <p>
     *        Length Constraint: Maximum 100 characters
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * Unique identifier assigned to the published message.
     * </p>
     * <p>
     * Length Constraint: Maximum 100 characters
     * </p>
     * 
     * @return Unique identifier assigned to the published message.</p>
     *         <p>
     *         Length Constraint: Maximum 100 characters
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * Unique identifier assigned to the published message.
     * </p>
     * <p>
     * Length Constraint: Maximum 100 characters
     * </p>
     * 
     * @param messageId
     *        Unique identifier assigned to the published message.</p>
     *        <p>
     *        Length Constraint: Maximum 100 characters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishResult withMessageId(String messageId) {
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

        if (obj instanceof PublishResult == false)
            return false;
        PublishResult other = (PublishResult) obj;
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
    public PublishResult clone() {
        try {
            return (PublishResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
