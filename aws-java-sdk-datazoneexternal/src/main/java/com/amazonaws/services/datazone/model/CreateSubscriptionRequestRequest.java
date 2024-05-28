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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubscriptionRequestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the subscription request is created.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The reason for the subscription request.
     * </p>
     */
    private String requestReason;
    /**
     * <p>
     * The published asset for which the subscription grant is to be created.
     * </p>
     */
    private java.util.List<SubscribedListingInput> subscribedListings;
    /**
     * <p>
     * The Amazon DataZone principals for whom the subscription request is created.
     * </p>
     */
    private java.util.List<SubscribedPrincipalInput> subscribedPrincipals;

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the subscription request is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which the subscription request is created.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the subscription request is created.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which the subscription request is created.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the subscription request is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which the subscription request is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The reason for the subscription request.
     * </p>
     * 
     * @param requestReason
     *        The reason for the subscription request.
     */

    public void setRequestReason(String requestReason) {
        this.requestReason = requestReason;
    }

    /**
     * <p>
     * The reason for the subscription request.
     * </p>
     * 
     * @return The reason for the subscription request.
     */

    public String getRequestReason() {
        return this.requestReason;
    }

    /**
     * <p>
     * The reason for the subscription request.
     * </p>
     * 
     * @param requestReason
     *        The reason for the subscription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestRequest withRequestReason(String requestReason) {
        setRequestReason(requestReason);
        return this;
    }

    /**
     * <p>
     * The published asset for which the subscription grant is to be created.
     * </p>
     * 
     * @return The published asset for which the subscription grant is to be created.
     */

    public java.util.List<SubscribedListingInput> getSubscribedListings() {
        return subscribedListings;
    }

    /**
     * <p>
     * The published asset for which the subscription grant is to be created.
     * </p>
     * 
     * @param subscribedListings
     *        The published asset for which the subscription grant is to be created.
     */

    public void setSubscribedListings(java.util.Collection<SubscribedListingInput> subscribedListings) {
        if (subscribedListings == null) {
            this.subscribedListings = null;
            return;
        }

        this.subscribedListings = new java.util.ArrayList<SubscribedListingInput>(subscribedListings);
    }

    /**
     * <p>
     * The published asset for which the subscription grant is to be created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscribedListings(java.util.Collection)} or {@link #withSubscribedListings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param subscribedListings
     *        The published asset for which the subscription grant is to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestRequest withSubscribedListings(SubscribedListingInput... subscribedListings) {
        if (this.subscribedListings == null) {
            setSubscribedListings(new java.util.ArrayList<SubscribedListingInput>(subscribedListings.length));
        }
        for (SubscribedListingInput ele : subscribedListings) {
            this.subscribedListings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The published asset for which the subscription grant is to be created.
     * </p>
     * 
     * @param subscribedListings
     *        The published asset for which the subscription grant is to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestRequest withSubscribedListings(java.util.Collection<SubscribedListingInput> subscribedListings) {
        setSubscribedListings(subscribedListings);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone principals for whom the subscription request is created.
     * </p>
     * 
     * @return The Amazon DataZone principals for whom the subscription request is created.
     */

    public java.util.List<SubscribedPrincipalInput> getSubscribedPrincipals() {
        return subscribedPrincipals;
    }

    /**
     * <p>
     * The Amazon DataZone principals for whom the subscription request is created.
     * </p>
     * 
     * @param subscribedPrincipals
     *        The Amazon DataZone principals for whom the subscription request is created.
     */

    public void setSubscribedPrincipals(java.util.Collection<SubscribedPrincipalInput> subscribedPrincipals) {
        if (subscribedPrincipals == null) {
            this.subscribedPrincipals = null;
            return;
        }

        this.subscribedPrincipals = new java.util.ArrayList<SubscribedPrincipalInput>(subscribedPrincipals);
    }

    /**
     * <p>
     * The Amazon DataZone principals for whom the subscription request is created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscribedPrincipals(java.util.Collection)} or {@link #withSubscribedPrincipals(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param subscribedPrincipals
     *        The Amazon DataZone principals for whom the subscription request is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestRequest withSubscribedPrincipals(SubscribedPrincipalInput... subscribedPrincipals) {
        if (this.subscribedPrincipals == null) {
            setSubscribedPrincipals(new java.util.ArrayList<SubscribedPrincipalInput>(subscribedPrincipals.length));
        }
        for (SubscribedPrincipalInput ele : subscribedPrincipals) {
            this.subscribedPrincipals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone principals for whom the subscription request is created.
     * </p>
     * 
     * @param subscribedPrincipals
     *        The Amazon DataZone principals for whom the subscription request is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestRequest withSubscribedPrincipals(java.util.Collection<SubscribedPrincipalInput> subscribedPrincipals) {
        setSubscribedPrincipals(subscribedPrincipals);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getRequestReason() != null)
            sb.append("RequestReason: ").append("***Sensitive Data Redacted***").append(",");
        if (getSubscribedListings() != null)
            sb.append("SubscribedListings: ").append(getSubscribedListings()).append(",");
        if (getSubscribedPrincipals() != null)
            sb.append("SubscribedPrincipals: ").append(getSubscribedPrincipals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSubscriptionRequestRequest == false)
            return false;
        CreateSubscriptionRequestRequest other = (CreateSubscriptionRequestRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getRequestReason() == null ^ this.getRequestReason() == null)
            return false;
        if (other.getRequestReason() != null && other.getRequestReason().equals(this.getRequestReason()) == false)
            return false;
        if (other.getSubscribedListings() == null ^ this.getSubscribedListings() == null)
            return false;
        if (other.getSubscribedListings() != null && other.getSubscribedListings().equals(this.getSubscribedListings()) == false)
            return false;
        if (other.getSubscribedPrincipals() == null ^ this.getSubscribedPrincipals() == null)
            return false;
        if (other.getSubscribedPrincipals() != null && other.getSubscribedPrincipals().equals(this.getSubscribedPrincipals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRequestReason() == null) ? 0 : getRequestReason().hashCode());
        hashCode = prime * hashCode + ((getSubscribedListings() == null) ? 0 : getSubscribedListings().hashCode());
        hashCode = prime * hashCode + ((getSubscribedPrincipals() == null) ? 0 : getSubscribedPrincipals().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubscriptionRequestRequest clone() {
        return (CreateSubscriptionRequestRequest) super.clone();
    }

}
