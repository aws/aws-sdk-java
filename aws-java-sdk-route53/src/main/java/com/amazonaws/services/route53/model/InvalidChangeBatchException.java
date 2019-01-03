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
package com.amazonaws.services.route53.model;

import javax.annotation.Generated;

/**
 * <p>
 * This exception contains a list of messages that might contain one or more error messages. Each error message
 * indicates one error in the change batch.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidChangeBatchException extends com.amazonaws.services.route53.model.AmazonRoute53Exception {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Descriptive message for the error response.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> messages;

    /**
     * Constructs a new InvalidChangeBatchException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidChangeBatchException(String message) {
        super(message);
    }

    /**
     * <p>
     * Descriptive message for the error response.
     * </p>
     * 
     * @return Descriptive message for the error response.
     */

    public java.util.List<String> getMessages() {
        if (messages == null) {
            messages = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return messages;
    }

    /**
     * <p>
     * Descriptive message for the error response.
     * </p>
     * 
     * @param messages
     *        Descriptive message for the error response.
     */

    public void setMessages(java.util.Collection<String> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new com.amazonaws.internal.SdkInternalList<String>(messages);
    }

    /**
     * <p>
     * Descriptive message for the error response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        Descriptive message for the error response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidChangeBatchException withMessages(String... messages) {
        if (this.messages == null) {
            setMessages(new com.amazonaws.internal.SdkInternalList<String>(messages.length));
        }
        for (String ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Descriptive message for the error response.
     * </p>
     * 
     * @param messages
     *        Descriptive message for the error response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidChangeBatchException withMessages(java.util.Collection<String> messages) {
        setMessages(messages);
        return this;
    }

}
