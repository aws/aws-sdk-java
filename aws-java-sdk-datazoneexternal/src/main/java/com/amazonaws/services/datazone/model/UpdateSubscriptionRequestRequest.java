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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSubscriptionRequestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription request is to be updated.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The identifier of the subscription request that is to be updated.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The reason for the <code>UpdateSubscriptionRequest</code> action.
     * </p>
     */
    private String requestReason;

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription request is to be updated.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which a subscription request is to be updated.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription request is to be updated.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which a subscription request is to be updated.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription request is to be updated.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which a subscription request is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionRequestRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the subscription request that is to be updated.
     * </p>
     * 
     * @param identifier
     *        The identifier of the subscription request that is to be updated.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the subscription request that is to be updated.
     * </p>
     * 
     * @return The identifier of the subscription request that is to be updated.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the subscription request that is to be updated.
     * </p>
     * 
     * @param identifier
     *        The identifier of the subscription request that is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionRequestRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The reason for the <code>UpdateSubscriptionRequest</code> action.
     * </p>
     * 
     * @param requestReason
     *        The reason for the <code>UpdateSubscriptionRequest</code> action.
     */

    public void setRequestReason(String requestReason) {
        this.requestReason = requestReason;
    }

    /**
     * <p>
     * The reason for the <code>UpdateSubscriptionRequest</code> action.
     * </p>
     * 
     * @return The reason for the <code>UpdateSubscriptionRequest</code> action.
     */

    public String getRequestReason() {
        return this.requestReason;
    }

    /**
     * <p>
     * The reason for the <code>UpdateSubscriptionRequest</code> action.
     * </p>
     * 
     * @param requestReason
     *        The reason for the <code>UpdateSubscriptionRequest</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionRequestRequest withRequestReason(String requestReason) {
        setRequestReason(requestReason);
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getRequestReason() != null)
            sb.append("RequestReason: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSubscriptionRequestRequest == false)
            return false;
        UpdateSubscriptionRequestRequest other = (UpdateSubscriptionRequestRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getRequestReason() == null ^ this.getRequestReason() == null)
            return false;
        if (other.getRequestReason() != null && other.getRequestReason().equals(this.getRequestReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRequestReason() == null) ? 0 : getRequestReason().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSubscriptionRequestRequest clone() {
        return (UpdateSubscriptionRequestRequest) super.clone();
    }

}
