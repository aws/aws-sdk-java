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
public class RegisterTransitGatewayMulticastGroupSourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Information about the transit gateway multicast group sources.
     * </p>
     */
    private TransitGatewayMulticastRegisteredGroupSources registeredMulticastGroupSources;

    /**
     * <p>
     * Information about the transit gateway multicast group sources.
     * </p>
     * 
     * @param registeredMulticastGroupSources
     *        Information about the transit gateway multicast group sources.
     */

    public void setRegisteredMulticastGroupSources(TransitGatewayMulticastRegisteredGroupSources registeredMulticastGroupSources) {
        this.registeredMulticastGroupSources = registeredMulticastGroupSources;
    }

    /**
     * <p>
     * Information about the transit gateway multicast group sources.
     * </p>
     * 
     * @return Information about the transit gateway multicast group sources.
     */

    public TransitGatewayMulticastRegisteredGroupSources getRegisteredMulticastGroupSources() {
        return this.registeredMulticastGroupSources;
    }

    /**
     * <p>
     * Information about the transit gateway multicast group sources.
     * </p>
     * 
     * @param registeredMulticastGroupSources
     *        Information about the transit gateway multicast group sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTransitGatewayMulticastGroupSourcesResult withRegisteredMulticastGroupSources(
            TransitGatewayMulticastRegisteredGroupSources registeredMulticastGroupSources) {
        setRegisteredMulticastGroupSources(registeredMulticastGroupSources);
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
        if (getRegisteredMulticastGroupSources() != null)
            sb.append("RegisteredMulticastGroupSources: ").append(getRegisteredMulticastGroupSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTransitGatewayMulticastGroupSourcesResult == false)
            return false;
        RegisterTransitGatewayMulticastGroupSourcesResult other = (RegisterTransitGatewayMulticastGroupSourcesResult) obj;
        if (other.getRegisteredMulticastGroupSources() == null ^ this.getRegisteredMulticastGroupSources() == null)
            return false;
        if (other.getRegisteredMulticastGroupSources() != null
                && other.getRegisteredMulticastGroupSources().equals(this.getRegisteredMulticastGroupSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegisteredMulticastGroupSources() == null) ? 0 : getRegisteredMulticastGroupSources().hashCode());
        return hashCode;
    }

    @Override
    public RegisterTransitGatewayMulticastGroupSourcesResult clone() {
        try {
            return (RegisterTransitGatewayMulticastGroupSourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
