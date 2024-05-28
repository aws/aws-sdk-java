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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DisableFederation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableFederationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the event data store for which you want to disable Lake query federation.
     * </p>
     */
    private String eventDataStore;

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the event data store for which you want to disable Lake query federation.
     * </p>
     * 
     * @param eventDataStore
     *        The ARN (or ID suffix of the ARN) of the event data store for which you want to disable Lake query
     *        federation.
     */

    public void setEventDataStore(String eventDataStore) {
        this.eventDataStore = eventDataStore;
    }

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the event data store for which you want to disable Lake query federation.
     * </p>
     * 
     * @return The ARN (or ID suffix of the ARN) of the event data store for which you want to disable Lake query
     *         federation.
     */

    public String getEventDataStore() {
        return this.eventDataStore;
    }

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the event data store for which you want to disable Lake query federation.
     * </p>
     * 
     * @param eventDataStore
     *        The ARN (or ID suffix of the ARN) of the event data store for which you want to disable Lake query
     *        federation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableFederationRequest withEventDataStore(String eventDataStore) {
        setEventDataStore(eventDataStore);
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
        if (getEventDataStore() != null)
            sb.append("EventDataStore: ").append(getEventDataStore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableFederationRequest == false)
            return false;
        DisableFederationRequest other = (DisableFederationRequest) obj;
        if (other.getEventDataStore() == null ^ this.getEventDataStore() == null)
            return false;
        if (other.getEventDataStore() != null && other.getEventDataStore().equals(this.getEventDataStore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventDataStore() == null) ? 0 : getEventDataStore().hashCode());
        return hashCode;
    }

    @Override
    public DisableFederationRequest clone() {
        return (DisableFederationRequest) super.clone();
    }

}
