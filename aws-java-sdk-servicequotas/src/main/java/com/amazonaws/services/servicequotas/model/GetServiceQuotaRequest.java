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
package com.amazonaws.services.servicequotas.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetServiceQuota" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceQuotaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the service identifier. To find the service code value for an Amazon Web Services service, use the
     * <a>ListServices</a> operation.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * Specifies the quota identifier. To find the quota code for a specific quota, use the <a>ListServiceQuotas</a>
     * operation, and look for the <code>QuotaCode</code> response in the output for the quota you want.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * Specifies the Amazon Web Services account or resource to which the quota applies. The value in this field depends
     * on the context scope associated with the specified service quota.
     * </p>
     */
    private String contextId;

    /**
     * <p>
     * Specifies the service identifier. To find the service code value for an Amazon Web Services service, use the
     * <a>ListServices</a> operation.
     * </p>
     * 
     * @param serviceCode
     *        Specifies the service identifier. To find the service code value for an Amazon Web Services service, use
     *        the <a>ListServices</a> operation.
     */

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Specifies the service identifier. To find the service code value for an Amazon Web Services service, use the
     * <a>ListServices</a> operation.
     * </p>
     * 
     * @return Specifies the service identifier. To find the service code value for an Amazon Web Services service, use
     *         the <a>ListServices</a> operation.
     */

    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Specifies the service identifier. To find the service code value for an Amazon Web Services service, use the
     * <a>ListServices</a> operation.
     * </p>
     * 
     * @param serviceCode
     *        Specifies the service identifier. To find the service code value for an Amazon Web Services service, use
     *        the <a>ListServices</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceQuotaRequest withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * Specifies the quota identifier. To find the quota code for a specific quota, use the <a>ListServiceQuotas</a>
     * operation, and look for the <code>QuotaCode</code> response in the output for the quota you want.
     * </p>
     * 
     * @param quotaCode
     *        Specifies the quota identifier. To find the quota code for a specific quota, use the
     *        <a>ListServiceQuotas</a> operation, and look for the <code>QuotaCode</code> response in the output for the
     *        quota you want.
     */

    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * Specifies the quota identifier. To find the quota code for a specific quota, use the <a>ListServiceQuotas</a>
     * operation, and look for the <code>QuotaCode</code> response in the output for the quota you want.
     * </p>
     * 
     * @return Specifies the quota identifier. To find the quota code for a specific quota, use the
     *         <a>ListServiceQuotas</a> operation, and look for the <code>QuotaCode</code> response in the output for
     *         the quota you want.
     */

    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * Specifies the quota identifier. To find the quota code for a specific quota, use the <a>ListServiceQuotas</a>
     * operation, and look for the <code>QuotaCode</code> response in the output for the quota you want.
     * </p>
     * 
     * @param quotaCode
     *        Specifies the quota identifier. To find the quota code for a specific quota, use the
     *        <a>ListServiceQuotas</a> operation, and look for the <code>QuotaCode</code> response in the output for the
     *        quota you want.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceQuotaRequest withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Web Services account or resource to which the quota applies. The value in this field depends
     * on the context scope associated with the specified service quota.
     * </p>
     * 
     * @param contextId
     *        Specifies the Amazon Web Services account or resource to which the quota applies. The value in this field
     *        depends on the context scope associated with the specified service quota.
     */

    public void setContextId(String contextId) {
        this.contextId = contextId;
    }

    /**
     * <p>
     * Specifies the Amazon Web Services account or resource to which the quota applies. The value in this field depends
     * on the context scope associated with the specified service quota.
     * </p>
     * 
     * @return Specifies the Amazon Web Services account or resource to which the quota applies. The value in this field
     *         depends on the context scope associated with the specified service quota.
     */

    public String getContextId() {
        return this.contextId;
    }

    /**
     * <p>
     * Specifies the Amazon Web Services account or resource to which the quota applies. The value in this field depends
     * on the context scope associated with the specified service quota.
     * </p>
     * 
     * @param contextId
     *        Specifies the Amazon Web Services account or resource to which the quota applies. The value in this field
     *        depends on the context scope associated with the specified service quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceQuotaRequest withContextId(String contextId) {
        setContextId(contextId);
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
        if (getServiceCode() != null)
            sb.append("ServiceCode: ").append(getServiceCode()).append(",");
        if (getQuotaCode() != null)
            sb.append("QuotaCode: ").append(getQuotaCode()).append(",");
        if (getContextId() != null)
            sb.append("ContextId: ").append(getContextId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceQuotaRequest == false)
            return false;
        GetServiceQuotaRequest other = (GetServiceQuotaRequest) obj;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getQuotaCode() == null ^ this.getQuotaCode() == null)
            return false;
        if (other.getQuotaCode() != null && other.getQuotaCode().equals(this.getQuotaCode()) == false)
            return false;
        if (other.getContextId() == null ^ this.getContextId() == null)
            return false;
        if (other.getContextId() != null && other.getContextId().equals(this.getContextId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode + ((getQuotaCode() == null) ? 0 : getQuotaCode().hashCode());
        hashCode = prime * hashCode + ((getContextId() == null) ? 0 : getContextId().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceQuotaRequest clone() {
        return (GetServiceQuotaRequest) super.clone();
    }

}
