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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriberNotification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubscriberNotificationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The subscriber endpoint to which exception messages are posted.
     * </p>
     */
    private String subscriberEndpoint;

    /**
     * <p>
     * The subscriber endpoint to which exception messages are posted.
     * </p>
     * 
     * @param subscriberEndpoint
     *        The subscriber endpoint to which exception messages are posted.
     */

    public void setSubscriberEndpoint(String subscriberEndpoint) {
        this.subscriberEndpoint = subscriberEndpoint;
    }

    /**
     * <p>
     * The subscriber endpoint to which exception messages are posted.
     * </p>
     * 
     * @return The subscriber endpoint to which exception messages are posted.
     */

    public String getSubscriberEndpoint() {
        return this.subscriberEndpoint;
    }

    /**
     * <p>
     * The subscriber endpoint to which exception messages are posted.
     * </p>
     * 
     * @param subscriberEndpoint
     *        The subscriber endpoint to which exception messages are posted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberNotificationResult withSubscriberEndpoint(String subscriberEndpoint) {
        setSubscriberEndpoint(subscriberEndpoint);
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
        if (getSubscriberEndpoint() != null)
            sb.append("SubscriberEndpoint: ").append(getSubscriberEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSubscriberNotificationResult == false)
            return false;
        CreateSubscriberNotificationResult other = (CreateSubscriberNotificationResult) obj;
        if (other.getSubscriberEndpoint() == null ^ this.getSubscriberEndpoint() == null)
            return false;
        if (other.getSubscriberEndpoint() != null && other.getSubscriberEndpoint().equals(this.getSubscriberEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscriberEndpoint() == null) ? 0 : getSubscriberEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubscriberNotificationResult clone() {
        try {
            return (CreateSubscriberNotificationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
