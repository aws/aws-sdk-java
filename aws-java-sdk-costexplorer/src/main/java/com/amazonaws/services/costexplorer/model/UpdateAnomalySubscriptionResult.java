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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateAnomalySubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAnomalySubscriptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A cost anomaly subscription ARN.
     * </p>
     */
    private String subscriptionArn;

    /**
     * <p>
     * A cost anomaly subscription ARN.
     * </p>
     * 
     * @param subscriptionArn
     *        A cost anomaly subscription ARN.
     */

    public void setSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
    }

    /**
     * <p>
     * A cost anomaly subscription ARN.
     * </p>
     * 
     * @return A cost anomaly subscription ARN.
     */

    public String getSubscriptionArn() {
        return this.subscriptionArn;
    }

    /**
     * <p>
     * A cost anomaly subscription ARN.
     * </p>
     * 
     * @param subscriptionArn
     *        A cost anomaly subscription ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalySubscriptionResult withSubscriptionArn(String subscriptionArn) {
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

        if (obj instanceof UpdateAnomalySubscriptionResult == false)
            return false;
        UpdateAnomalySubscriptionResult other = (UpdateAnomalySubscriptionResult) obj;
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
    public UpdateAnomalySubscriptionResult clone() {
        try {
            return (UpdateAnomalySubscriptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
