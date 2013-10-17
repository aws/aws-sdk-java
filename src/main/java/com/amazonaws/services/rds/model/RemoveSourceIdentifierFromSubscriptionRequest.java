/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#removeSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest) RemoveSourceIdentifierFromSubscription operation}.
 * <p>
 * Removes a source identifier from an existing RDS event notification subscription.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#removeSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest)
 */
public class RemoveSourceIdentifierFromSubscriptionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the RDS event notification subscription you want to remove
     * a source identifier from.
     */
    private String subscriptionName;

    /**
     * The source identifier to be removed from the subscription, such as the
     * <b>DB instance identifier</b> for a DB instance or the name of a
     * security group.
     */
    private String sourceIdentifier;

    /**
     * The name of the RDS event notification subscription you want to remove
     * a source identifier from.
     *
     * @return The name of the RDS event notification subscription you want to remove
     *         a source identifier from.
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }
    
    /**
     * The name of the RDS event notification subscription you want to remove
     * a source identifier from.
     *
     * @param subscriptionName The name of the RDS event notification subscription you want to remove
     *         a source identifier from.
     */
    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }
    
    /**
     * The name of the RDS event notification subscription you want to remove
     * a source identifier from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subscriptionName The name of the RDS event notification subscription you want to remove
     *         a source identifier from.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemoveSourceIdentifierFromSubscriptionRequest withSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }

    /**
     * The source identifier to be removed from the subscription, such as the
     * <b>DB instance identifier</b> for a DB instance or the name of a
     * security group.
     *
     * @return The source identifier to be removed from the subscription, such as the
     *         <b>DB instance identifier</b> for a DB instance or the name of a
     *         security group.
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }
    
    /**
     * The source identifier to be removed from the subscription, such as the
     * <b>DB instance identifier</b> for a DB instance or the name of a
     * security group.
     *
     * @param sourceIdentifier The source identifier to be removed from the subscription, such as the
     *         <b>DB instance identifier</b> for a DB instance or the name of a
     *         security group.
     */
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }
    
    /**
     * The source identifier to be removed from the subscription, such as the
     * <b>DB instance identifier</b> for a DB instance or the name of a
     * security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceIdentifier The source identifier to be removed from the subscription, such as the
     *         <b>DB instance identifier</b> for a DB instance or the name of a
     *         security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemoveSourceIdentifierFromSubscriptionRequest withSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSubscriptionName() != null) sb.append("SubscriptionName: " + getSubscriptionName() + ",");
        if (getSourceIdentifier() != null) sb.append("SourceIdentifier: " + getSourceIdentifier() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RemoveSourceIdentifierFromSubscriptionRequest == false) return false;
        RemoveSourceIdentifierFromSubscriptionRequest other = (RemoveSourceIdentifierFromSubscriptionRequest)obj;
        
        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null) return false;
        if (other.getSubscriptionName() != null && other.getSubscriptionName().equals(this.getSubscriptionName()) == false) return false; 
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null) return false;
        if (other.getSourceIdentifier() != null && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false) return false; 
        return true;
    }
    
}
    