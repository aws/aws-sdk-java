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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetServiceQuotaIncreaseRequestFromTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceQuotaIncreaseRequestFromTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the service that you want to use.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * Specifies the quota you want.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * Specifies the AWS Region for the quota that you want to use.
     * </p>
     */
    private String awsRegion;

    /**
     * <p>
     * Specifies the service that you want to use.
     * </p>
     * 
     * @param serviceCode
     *        Specifies the service that you want to use.
     */

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Specifies the service that you want to use.
     * </p>
     * 
     * @return Specifies the service that you want to use.
     */

    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Specifies the service that you want to use.
     * </p>
     * 
     * @param serviceCode
     *        Specifies the service that you want to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceQuotaIncreaseRequestFromTemplateRequest withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * Specifies the quota you want.
     * </p>
     * 
     * @param quotaCode
     *        Specifies the quota you want.
     */

    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * Specifies the quota you want.
     * </p>
     * 
     * @return Specifies the quota you want.
     */

    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * Specifies the quota you want.
     * </p>
     * 
     * @param quotaCode
     *        Specifies the quota you want.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceQuotaIncreaseRequestFromTemplateRequest withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * Specifies the AWS Region for the quota that you want to use.
     * </p>
     * 
     * @param awsRegion
     *        Specifies the AWS Region for the quota that you want to use.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * Specifies the AWS Region for the quota that you want to use.
     * </p>
     * 
     * @return Specifies the AWS Region for the quota that you want to use.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * Specifies the AWS Region for the quota that you want to use.
     * </p>
     * 
     * @param awsRegion
     *        Specifies the AWS Region for the quota that you want to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceQuotaIncreaseRequestFromTemplateRequest withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
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
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceQuotaIncreaseRequestFromTemplateRequest == false)
            return false;
        GetServiceQuotaIncreaseRequestFromTemplateRequest other = (GetServiceQuotaIncreaseRequestFromTemplateRequest) obj;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getQuotaCode() == null ^ this.getQuotaCode() == null)
            return false;
        if (other.getQuotaCode() != null && other.getQuotaCode().equals(this.getQuotaCode()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode + ((getQuotaCode() == null) ? 0 : getQuotaCode().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceQuotaIncreaseRequestFromTemplateRequest clone() {
        return (GetServiceQuotaIncreaseRequestFromTemplateRequest) super.clone();
    }

}
