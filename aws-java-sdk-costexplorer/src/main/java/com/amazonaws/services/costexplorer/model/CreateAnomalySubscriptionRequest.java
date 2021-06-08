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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateAnomalySubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAnomalySubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cost anomaly subscription object that you want to create.
     * </p>
     */
    private AnomalySubscription anomalySubscription;

    /**
     * <p>
     * The cost anomaly subscription object that you want to create.
     * </p>
     * 
     * @param anomalySubscription
     *        The cost anomaly subscription object that you want to create.
     */

    public void setAnomalySubscription(AnomalySubscription anomalySubscription) {
        this.anomalySubscription = anomalySubscription;
    }

    /**
     * <p>
     * The cost anomaly subscription object that you want to create.
     * </p>
     * 
     * @return The cost anomaly subscription object that you want to create.
     */

    public AnomalySubscription getAnomalySubscription() {
        return this.anomalySubscription;
    }

    /**
     * <p>
     * The cost anomaly subscription object that you want to create.
     * </p>
     * 
     * @param anomalySubscription
     *        The cost anomaly subscription object that you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnomalySubscriptionRequest withAnomalySubscription(AnomalySubscription anomalySubscription) {
        setAnomalySubscription(anomalySubscription);
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
        if (getAnomalySubscription() != null)
            sb.append("AnomalySubscription: ").append(getAnomalySubscription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAnomalySubscriptionRequest == false)
            return false;
        CreateAnomalySubscriptionRequest other = (CreateAnomalySubscriptionRequest) obj;
        if (other.getAnomalySubscription() == null ^ this.getAnomalySubscription() == null)
            return false;
        if (other.getAnomalySubscription() != null && other.getAnomalySubscription().equals(this.getAnomalySubscription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalySubscription() == null) ? 0 : getAnomalySubscription().hashCode());
        return hashCode;
    }

    @Override
    public CreateAnomalySubscriptionRequest clone() {
        return (CreateAnomalySubscriptionRequest) super.clone();
    }

}
