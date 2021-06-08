/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DeleteAnomalySubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAnomalySubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the cost anomaly subscription that you want to delete.
     * </p>
     */
    private String subscriptionArn;

    /**
     * <p>
     * The unique identifier of the cost anomaly subscription that you want to delete.
     * </p>
     * 
     * @param subscriptionArn
     *        The unique identifier of the cost anomaly subscription that you want to delete.
     */

    public void setSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
    }

    /**
     * <p>
     * The unique identifier of the cost anomaly subscription that you want to delete.
     * </p>
     * 
     * @return The unique identifier of the cost anomaly subscription that you want to delete.
     */

    public String getSubscriptionArn() {
        return this.subscriptionArn;
    }

    /**
     * <p>
     * The unique identifier of the cost anomaly subscription that you want to delete.
     * </p>
     * 
     * @param subscriptionArn
     *        The unique identifier of the cost anomaly subscription that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAnomalySubscriptionRequest withSubscriptionArn(String subscriptionArn) {
        setSubscriptionArn(subscriptionArn);
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
        if (getSubscriptionArn() != null)
            sb.append("SubscriptionArn: ").append(getSubscriptionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAnomalySubscriptionRequest == false)
            return false;
        DeleteAnomalySubscriptionRequest other = (DeleteAnomalySubscriptionRequest) obj;
        if (other.getSubscriptionArn() == null ^ this.getSubscriptionArn() == null)
            return false;
        if (other.getSubscriptionArn() != null && other.getSubscriptionArn().equals(this.getSubscriptionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscriptionArn() == null) ? 0 : getSubscriptionArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAnomalySubscriptionRequest clone() {
        return (DeleteAnomalySubscriptionRequest) super.clone();
    }

}
