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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetServiceQuota" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceQuotaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the <a>ServiceQuota</a> object which contains all values for a quota.
     * </p>
     */
    private ServiceQuota quota;

    /**
     * <p>
     * Returns the <a>ServiceQuota</a> object which contains all values for a quota.
     * </p>
     * 
     * @param quota
     *        Returns the <a>ServiceQuota</a> object which contains all values for a quota.
     */

    public void setQuota(ServiceQuota quota) {
        this.quota = quota;
    }

    /**
     * <p>
     * Returns the <a>ServiceQuota</a> object which contains all values for a quota.
     * </p>
     * 
     * @return Returns the <a>ServiceQuota</a> object which contains all values for a quota.
     */

    public ServiceQuota getQuota() {
        return this.quota;
    }

    /**
     * <p>
     * Returns the <a>ServiceQuota</a> object which contains all values for a quota.
     * </p>
     * 
     * @param quota
     *        Returns the <a>ServiceQuota</a> object which contains all values for a quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceQuotaResult withQuota(ServiceQuota quota) {
        setQuota(quota);
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
        if (getQuota() != null)
            sb.append("Quota: ").append(getQuota());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceQuotaResult == false)
            return false;
        GetServiceQuotaResult other = (GetServiceQuotaResult) obj;
        if (other.getQuota() == null ^ this.getQuota() == null)
            return false;
        if (other.getQuota() != null && other.getQuota().equals(this.getQuota()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuota() == null) ? 0 : getQuota().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceQuotaResult clone() {
        try {
            return (GetServiceQuotaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
