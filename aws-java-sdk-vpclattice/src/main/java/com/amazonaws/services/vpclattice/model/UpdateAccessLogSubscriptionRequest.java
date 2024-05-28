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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateAccessLogSubscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccessLogSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the access log subscription.
     * </p>
     */
    private String accessLogSubscriptionIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access log destination.
     * </p>
     */
    private String destinationArn;

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

    public UpdateAccessLogSubscriptionRequest withAccessLogSubscriptionIdentifier(String accessLogSubscriptionIdentifier) {
        setAccessLogSubscriptionIdentifier(accessLogSubscriptionIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access log destination.
     * </p>
     * 
     * @param destinationArn
     *        The Amazon Resource Name (ARN) of the access log destination.
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access log destination.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the access log destination.
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access log destination.
     * </p>
     * 
     * @param destinationArn
     *        The Amazon Resource Name (ARN) of the access log destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessLogSubscriptionRequest withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
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
            sb.append("AccessLogSubscriptionIdentifier: ").append(getAccessLogSubscriptionIdentifier()).append(",");
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccessLogSubscriptionRequest == false)
            return false;
        UpdateAccessLogSubscriptionRequest other = (UpdateAccessLogSubscriptionRequest) obj;
        if (other.getAccessLogSubscriptionIdentifier() == null ^ this.getAccessLogSubscriptionIdentifier() == null)
            return false;
        if (other.getAccessLogSubscriptionIdentifier() != null
                && other.getAccessLogSubscriptionIdentifier().equals(this.getAccessLogSubscriptionIdentifier()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessLogSubscriptionIdentifier() == null) ? 0 : getAccessLogSubscriptionIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccessLogSubscriptionRequest clone() {
        return (UpdateAccessLogSubscriptionRequest) super.clone();
    }

}
