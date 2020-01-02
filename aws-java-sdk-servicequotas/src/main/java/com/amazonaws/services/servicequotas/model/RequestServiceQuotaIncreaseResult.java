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
package com.amazonaws.services.servicequotas.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/RequestServiceQuotaIncrease"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestServiceQuotaIncreaseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of service quota requests.
     * </p>
     */
    private RequestedServiceQuotaChange requestedQuota;

    /**
     * <p>
     * Returns a list of service quota requests.
     * </p>
     * 
     * @param requestedQuota
     *        Returns a list of service quota requests.
     */

    public void setRequestedQuota(RequestedServiceQuotaChange requestedQuota) {
        this.requestedQuota = requestedQuota;
    }

    /**
     * <p>
     * Returns a list of service quota requests.
     * </p>
     * 
     * @return Returns a list of service quota requests.
     */

    public RequestedServiceQuotaChange getRequestedQuota() {
        return this.requestedQuota;
    }

    /**
     * <p>
     * Returns a list of service quota requests.
     * </p>
     * 
     * @param requestedQuota
     *        Returns a list of service quota requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestServiceQuotaIncreaseResult withRequestedQuota(RequestedServiceQuotaChange requestedQuota) {
        setRequestedQuota(requestedQuota);
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
        if (getRequestedQuota() != null)
            sb.append("RequestedQuota: ").append(getRequestedQuota());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestServiceQuotaIncreaseResult == false)
            return false;
        RequestServiceQuotaIncreaseResult other = (RequestServiceQuotaIncreaseResult) obj;
        if (other.getRequestedQuota() == null ^ this.getRequestedQuota() == null)
            return false;
        if (other.getRequestedQuota() != null && other.getRequestedQuota().equals(this.getRequestedQuota()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestedQuota() == null) ? 0 : getRequestedQuota().hashCode());
        return hashCode;
    }

    @Override
    public RequestServiceQuotaIncreaseResult clone() {
        try {
            return (RequestServiceQuotaIncreaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
