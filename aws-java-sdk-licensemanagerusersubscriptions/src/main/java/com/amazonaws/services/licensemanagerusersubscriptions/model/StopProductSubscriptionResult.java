/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanagerusersubscriptions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/StopProductSubscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopProductSubscriptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Metadata that describes the start product subscription operation.
     * </p>
     */
    private ProductUserSummary productUserSummary;

    /**
     * <p>
     * Metadata that describes the start product subscription operation.
     * </p>
     * 
     * @param productUserSummary
     *        Metadata that describes the start product subscription operation.
     */

    public void setProductUserSummary(ProductUserSummary productUserSummary) {
        this.productUserSummary = productUserSummary;
    }

    /**
     * <p>
     * Metadata that describes the start product subscription operation.
     * </p>
     * 
     * @return Metadata that describes the start product subscription operation.
     */

    public ProductUserSummary getProductUserSummary() {
        return this.productUserSummary;
    }

    /**
     * <p>
     * Metadata that describes the start product subscription operation.
     * </p>
     * 
     * @param productUserSummary
     *        Metadata that describes the start product subscription operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopProductSubscriptionResult withProductUserSummary(ProductUserSummary productUserSummary) {
        setProductUserSummary(productUserSummary);
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
        if (getProductUserSummary() != null)
            sb.append("ProductUserSummary: ").append(getProductUserSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopProductSubscriptionResult == false)
            return false;
        StopProductSubscriptionResult other = (StopProductSubscriptionResult) obj;
        if (other.getProductUserSummary() == null ^ this.getProductUserSummary() == null)
            return false;
        if (other.getProductUserSummary() != null && other.getProductUserSummary().equals(this.getProductUserSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductUserSummary() == null) ? 0 : getProductUserSummary().hashCode());
        return hashCode;
    }

    @Override
    public StopProductSubscriptionResult clone() {
        try {
            return (StopProductSubscriptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
