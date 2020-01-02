/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterTransitGatewayMulticastGroupSourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Information about the deregistered group sources.
     * </p>
     */
    private TransitGatewayMulticastDeregisteredGroupSources deregisteredMulticastGroupSources;

    /**
     * <p>
     * Information about the deregistered group sources.
     * </p>
     * 
     * @param deregisteredMulticastGroupSources
     *        Information about the deregistered group sources.
     */

    public void setDeregisteredMulticastGroupSources(TransitGatewayMulticastDeregisteredGroupSources deregisteredMulticastGroupSources) {
        this.deregisteredMulticastGroupSources = deregisteredMulticastGroupSources;
    }

    /**
     * <p>
     * Information about the deregistered group sources.
     * </p>
     * 
     * @return Information about the deregistered group sources.
     */

    public TransitGatewayMulticastDeregisteredGroupSources getDeregisteredMulticastGroupSources() {
        return this.deregisteredMulticastGroupSources;
    }

    /**
     * <p>
     * Information about the deregistered group sources.
     * </p>
     * 
     * @param deregisteredMulticastGroupSources
     *        Information about the deregistered group sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterTransitGatewayMulticastGroupSourcesResult withDeregisteredMulticastGroupSources(
            TransitGatewayMulticastDeregisteredGroupSources deregisteredMulticastGroupSources) {
        setDeregisteredMulticastGroupSources(deregisteredMulticastGroupSources);
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
        if (getDeregisteredMulticastGroupSources() != null)
            sb.append("DeregisteredMulticastGroupSources: ").append(getDeregisteredMulticastGroupSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterTransitGatewayMulticastGroupSourcesResult == false)
            return false;
        DeregisterTransitGatewayMulticastGroupSourcesResult other = (DeregisterTransitGatewayMulticastGroupSourcesResult) obj;
        if (other.getDeregisteredMulticastGroupSources() == null ^ this.getDeregisteredMulticastGroupSources() == null)
            return false;
        if (other.getDeregisteredMulticastGroupSources() != null
                && other.getDeregisteredMulticastGroupSources().equals(this.getDeregisteredMulticastGroupSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeregisteredMulticastGroupSources() == null) ? 0 : getDeregisteredMulticastGroupSources().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterTransitGatewayMulticastGroupSourcesResult clone() {
        try {
            return (DeregisterTransitGatewayMulticastGroupSourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
