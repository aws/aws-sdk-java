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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteAccessLogSubscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAccessLogSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the access log subscription.
     * </p>
     */
    private String accessLogSubscriptionIdentifier;

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the access log subscription.
     * </p>
     * 
     * @param accessLogSubscriptionIdentifier
     *        The ID or Amazon Resource Name (ARN) of the access log subscription.
     */

    public void setAccessLogSubscriptionIdentifier(String accessLogSubscriptionIdentifier) {
        this.accessLogSubscriptionIdentifier = accessLogSubscriptionIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the access log subscription.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the access log subscription.
     */

    public String getAccessLogSubscriptionIdentifier() {
        return this.accessLogSubscriptionIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the access log subscription.
     * </p>
     * 
     * @param accessLogSubscriptionIdentifier
     *        The ID or Amazon Resource Name (ARN) of the access log subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAccessLogSubscriptionRequest withAccessLogSubscriptionIdentifier(String accessLogSubscriptionIdentifier) {
        setAccessLogSubscriptionIdentifier(accessLogSubscriptionIdentifier);
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
        if (getAccessLogSubscriptionIdentifier() != null)
            sb.append("AccessLogSubscriptionIdentifier: ").append(getAccessLogSubscriptionIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAccessLogSubscriptionRequest == false)
            return false;
        DeleteAccessLogSubscriptionRequest other = (DeleteAccessLogSubscriptionRequest) obj;
        if (other.getAccessLogSubscriptionIdentifier() == null ^ this.getAccessLogSubscriptionIdentifier() == null)
            return false;
        if (other.getAccessLogSubscriptionIdentifier() != null
                && other.getAccessLogSubscriptionIdentifier().equals(this.getAccessLogSubscriptionIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessLogSubscriptionIdentifier() == null) ? 0 : getAccessLogSubscriptionIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAccessLogSubscriptionRequest clone() {
        return (DeleteAccessLogSubscriptionRequest) super.clone();
    }

}
