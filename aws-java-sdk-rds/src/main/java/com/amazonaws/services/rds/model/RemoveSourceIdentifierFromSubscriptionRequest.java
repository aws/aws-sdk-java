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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveSourceIdentifierFromSubscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveSourceIdentifierFromSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the RDS event notification subscription you want to remove a source identifier from.
     * </p>
     */
    private String subscriptionName;
    /**
     * <p>
     * The source identifier to be removed from the subscription, such as the <b>DB instance identifier</b> for a DB
     * instance or the name of a security group.
     * </p>
     */
    private String sourceIdentifier;

    /**
     * <p>
     * The name of the RDS event notification subscription you want to remove a source identifier from.
     * </p>
     * 
     * @param subscriptionName
     *        The name of the RDS event notification subscription you want to remove a source identifier from.
     */

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    /**
     * <p>
     * The name of the RDS event notification subscription you want to remove a source identifier from.
     * </p>
     * 
     * @return The name of the RDS event notification subscription you want to remove a source identifier from.
     */

    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * <p>
     * The name of the RDS event notification subscription you want to remove a source identifier from.
     * </p>
     * 
     * @param subscriptionName
     *        The name of the RDS event notification subscription you want to remove a source identifier from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveSourceIdentifierFromSubscriptionRequest withSubscriptionName(String subscriptionName) {
        setSubscriptionName(subscriptionName);
        return this;
    }

    /**
     * <p>
     * The source identifier to be removed from the subscription, such as the <b>DB instance identifier</b> for a DB
     * instance or the name of a security group.
     * </p>
     * 
     * @param sourceIdentifier
     *        The source identifier to be removed from the subscription, such as the <b>DB instance identifier</b> for a
     *        DB instance or the name of a security group.
     */

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * The source identifier to be removed from the subscription, such as the <b>DB instance identifier</b> for a DB
     * instance or the name of a security group.
     * </p>
     * 
     * @return The source identifier to be removed from the subscription, such as the <b>DB instance identifier</b> for
     *         a DB instance or the name of a security group.
     */

    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * <p>
     * The source identifier to be removed from the subscription, such as the <b>DB instance identifier</b> for a DB
     * instance or the name of a security group.
     * </p>
     * 
     * @param sourceIdentifier
     *        The source identifier to be removed from the subscription, such as the <b>DB instance identifier</b> for a
     *        DB instance or the name of a security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveSourceIdentifierFromSubscriptionRequest withSourceIdentifier(String sourceIdentifier) {
        setSourceIdentifier(sourceIdentifier);
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
        if (getSubscriptionName() != null)
            sb.append("SubscriptionName: ").append(getSubscriptionName()).append(",");
        if (getSourceIdentifier() != null)
            sb.append("SourceIdentifier: ").append(getSourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveSourceIdentifierFromSubscriptionRequest == false)
            return false;
        RemoveSourceIdentifierFromSubscriptionRequest other = (RemoveSourceIdentifierFromSubscriptionRequest) obj;
        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null)
            return false;
        if (other.getSubscriptionName() != null && other.getSubscriptionName().equals(this.getSubscriptionName()) == false)
            return false;
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null)
            return false;
        if (other.getSourceIdentifier() != null && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscriptionName() == null) ? 0 : getSubscriptionName().hashCode());
        hashCode = prime * hashCode + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public RemoveSourceIdentifierFromSubscriptionRequest clone() {
        return (RemoveSourceIdentifierFromSubscriptionRequest) super.clone();
    }

}
