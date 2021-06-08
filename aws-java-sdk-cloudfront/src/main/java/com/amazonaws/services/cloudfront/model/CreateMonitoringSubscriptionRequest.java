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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateMonitoringSubscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMonitoringSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the distribution that you are enabling metrics for.
     * </p>
     */
    private String distributionId;
    /**
     * <p>
     * A monitoring subscription. This structure contains information about whether additional CloudWatch metrics are
     * enabled for a given CloudFront distribution.
     * </p>
     */
    private MonitoringSubscription monitoringSubscription;

    /**
     * <p>
     * The ID of the distribution that you are enabling metrics for.
     * </p>
     * 
     * @param distributionId
     *        The ID of the distribution that you are enabling metrics for.
     */

    public void setDistributionId(String distributionId) {
        this.distributionId = distributionId;
    }

    /**
     * <p>
     * The ID of the distribution that you are enabling metrics for.
     * </p>
     * 
     * @return The ID of the distribution that you are enabling metrics for.
     */

    public String getDistributionId() {
        return this.distributionId;
    }

    /**
     * <p>
     * The ID of the distribution that you are enabling metrics for.
     * </p>
     * 
     * @param distributionId
     *        The ID of the distribution that you are enabling metrics for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitoringSubscriptionRequest withDistributionId(String distributionId) {
        setDistributionId(distributionId);
        return this;
    }

    /**
     * <p>
     * A monitoring subscription. This structure contains information about whether additional CloudWatch metrics are
     * enabled for a given CloudFront distribution.
     * </p>
     * 
     * @param monitoringSubscription
     *        A monitoring subscription. This structure contains information about whether additional CloudWatch metrics
     *        are enabled for a given CloudFront distribution.
     */

    public void setMonitoringSubscription(MonitoringSubscription monitoringSubscription) {
        this.monitoringSubscription = monitoringSubscription;
    }

    /**
     * <p>
     * A monitoring subscription. This structure contains information about whether additional CloudWatch metrics are
     * enabled for a given CloudFront distribution.
     * </p>
     * 
     * @return A monitoring subscription. This structure contains information about whether additional CloudWatch
     *         metrics are enabled for a given CloudFront distribution.
     */

    public MonitoringSubscription getMonitoringSubscription() {
        return this.monitoringSubscription;
    }

    /**
     * <p>
     * A monitoring subscription. This structure contains information about whether additional CloudWatch metrics are
     * enabled for a given CloudFront distribution.
     * </p>
     * 
     * @param monitoringSubscription
     *        A monitoring subscription. This structure contains information about whether additional CloudWatch metrics
     *        are enabled for a given CloudFront distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitoringSubscriptionRequest withMonitoringSubscription(MonitoringSubscription monitoringSubscription) {
        setMonitoringSubscription(monitoringSubscription);
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
            sb.append("DistributionId: ").append(getDistributionId()).append(",");
        if (getMonitoringSubscription() != null)
            sb.append("MonitoringSubscription: ").append(getMonitoringSubscription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMonitoringSubscriptionRequest == false)
            return false;
        CreateMonitoringSubscriptionRequest other = (CreateMonitoringSubscriptionRequest) obj;
        if (other.getDistributionId() == null ^ this.getDistributionId() == null)
            return false;
        if (other.getDistributionId() != null && other.getDistributionId().equals(this.getDistributionId()) == false)
            return false;
        if (other.getMonitoringSubscription() == null ^ this.getMonitoringSubscription() == null)
            return false;
        if (other.getMonitoringSubscription() != null && other.getMonitoringSubscription().equals(this.getMonitoringSubscription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistributionId() == null) ? 0 : getDistributionId().hashCode());
        hashCode = prime * hashCode + ((getMonitoringSubscription() == null) ? 0 : getMonitoringSubscription().hashCode());
        return hashCode;
    }

    @Override
    public CreateMonitoringSubscriptionRequest clone() {
        return (CreateMonitoringSubscriptionRequest) super.clone();
    }

}
