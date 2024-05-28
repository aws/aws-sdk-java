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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateEksAnywhereSubscription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEksAnywhereSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the subscription.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A boolean indicating whether or not to automatically renew the subscription.
     * </p>
     */
    private Boolean autoRenew;
    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The ID of the subscription.
     * </p>
     * 
     * @param id
     *        The ID of the subscription.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the subscription.
     * </p>
     * 
     * @return The ID of the subscription.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the subscription.
     * </p>
     * 
     * @param id
     *        The ID of the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEksAnywhereSubscriptionRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether or not to automatically renew the subscription.
     * </p>
     * 
     * @param autoRenew
     *        A boolean indicating whether or not to automatically renew the subscription.
     */

    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * <p>
     * A boolean indicating whether or not to automatically renew the subscription.
     * </p>
     * 
     * @return A boolean indicating whether or not to automatically renew the subscription.
     */

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * A boolean indicating whether or not to automatically renew the subscription.
     * </p>
     * 
     * @param autoRenew
     *        A boolean indicating whether or not to automatically renew the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEksAnywhereSubscriptionRequest withAutoRenew(Boolean autoRenew) {
        setAutoRenew(autoRenew);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether or not to automatically renew the subscription.
     * </p>
     * 
     * @return A boolean indicating whether or not to automatically renew the subscription.
     */

    public Boolean isAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEksAnywhereSubscriptionRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getAutoRenew() != null)
            sb.append("AutoRenew: ").append(getAutoRenew()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEksAnywhereSubscriptionRequest == false)
            return false;
        UpdateEksAnywhereSubscriptionRequest other = (UpdateEksAnywhereSubscriptionRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAutoRenew() == null ^ this.getAutoRenew() == null)
            return false;
        if (other.getAutoRenew() != null && other.getAutoRenew().equals(this.getAutoRenew()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getAutoRenew() == null) ? 0 : getAutoRenew().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEksAnywhereSubscriptionRequest clone() {
        return (UpdateEksAnywhereSubscriptionRequest) super.clone();
    }

}
