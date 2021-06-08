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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteMonitoringSubscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMonitoringSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the distribution that you are disabling metrics for.
     * </p>
     */
    private String distributionId;

    /**
     * <p>
     * The ID of the distribution that you are disabling metrics for.
     * </p>
     * 
     * @param distributionId
     *        The ID of the distribution that you are disabling metrics for.
     */

    public void setDistributionId(String distributionId) {
        this.distributionId = distributionId;
    }

    /**
     * <p>
     * The ID of the distribution that you are disabling metrics for.
     * </p>
     * 
     * @return The ID of the distribution that you are disabling metrics for.
     */

    public String getDistributionId() {
        return this.distributionId;
    }

    /**
     * <p>
     * The ID of the distribution that you are disabling metrics for.
     * </p>
     * 
     * @param distributionId
     *        The ID of the distribution that you are disabling metrics for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMonitoringSubscriptionRequest withDistributionId(String distributionId) {
        setDistributionId(distributionId);
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
        if (getDistributionId() != null)
            sb.append("DistributionId: ").append(getDistributionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMonitoringSubscriptionRequest == false)
            return false;
        DeleteMonitoringSubscriptionRequest other = (DeleteMonitoringSubscriptionRequest) obj;
        if (other.getDistributionId() == null ^ this.getDistributionId() == null)
            return false;
        if (other.getDistributionId() != null && other.getDistributionId().equals(this.getDistributionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistributionId() == null) ? 0 : getDistributionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMonitoringSubscriptionRequest clone() {
        return (DeleteMonitoringSubscriptionRequest) super.clone();
    }

}
