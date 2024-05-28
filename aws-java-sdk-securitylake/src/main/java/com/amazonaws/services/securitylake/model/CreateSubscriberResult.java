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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubscriberResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Retrieve information about the subscriber created using the <code>CreateSubscriber</code> API.
     * </p>
     */
    private SubscriberResource subscriber;

    /**
     * <p>
     * Retrieve information about the subscriber created using the <code>CreateSubscriber</code> API.
     * </p>
     * 
     * @param subscriber
     *        Retrieve information about the subscriber created using the <code>CreateSubscriber</code> API.
     */

    public void setSubscriber(SubscriberResource subscriber) {
        this.subscriber = subscriber;
    }

    /**
     * <p>
     * Retrieve information about the subscriber created using the <code>CreateSubscriber</code> API.
     * </p>
     * 
     * @return Retrieve information about the subscriber created using the <code>CreateSubscriber</code> API.
     */

    public SubscriberResource getSubscriber() {
        return this.subscriber;
    }

    /**
     * <p>
     * Retrieve information about the subscriber created using the <code>CreateSubscriber</code> API.
     * </p>
     * 
     * @param subscriber
     *        Retrieve information about the subscriber created using the <code>CreateSubscriber</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberResult withSubscriber(SubscriberResource subscriber) {
        setSubscriber(subscriber);
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
        if (getSubscriber() != null)
            sb.append("Subscriber: ").append(getSubscriber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSubscriberResult == false)
            return false;
        CreateSubscriberResult other = (CreateSubscriberResult) obj;
        if (other.getSubscriber() == null ^ this.getSubscriber() == null)
            return false;
        if (other.getSubscriber() != null && other.getSubscriber().equals(this.getSubscriber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscriber() == null) ? 0 : getSubscriber().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubscriberResult clone() {
        try {
            return (CreateSubscriberResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
