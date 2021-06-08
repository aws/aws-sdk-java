/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/PutServiceQuotaIncreaseRequestIntoTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutServiceQuotaIncreaseRequestIntoTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The quota identifier.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The service identifier.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The AWS Region.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * The new, increased value for the quota.
     * </p>
     */
    private Double desiredValue;

    /**
     * <p>
     * The quota identifier.
     * </p>
     * 
     * @param quotaCode
     *        The quota identifier.
     */

    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The quota identifier.
     * </p>
     * 
     * @return The quota identifier.
     */

    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The quota identifier.
     * </p>
     * 
     * @param quotaCode
     *        The quota identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutServiceQuotaIncreaseRequestIntoTemplateRequest withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The service identifier.
     * </p>
     * 
     * @param serviceCode
     *        The service identifier.
     */

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The service identifier.
     * </p>
     * 
     * @return The service identifier.
     */

    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The service identifier.
     * </p>
     * 
     * @param serviceCode
     *        The service identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutServiceQuotaIncreaseRequestIntoTemplateRequest withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The AWS Region.
     * </p>
     * 
     * @param awsRegion
     *        The AWS Region.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The AWS Region.
     * </p>
     * 
     * @return The AWS Region.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The AWS Region.
     * </p>
     * 
     * @param awsRegion
     *        The AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutServiceQuotaIncreaseRequestIntoTemplateRequest withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * The new, increased value for the quota.
     * </p>
     * 
     * @param desiredValue
     *        The new, increased value for the quota.
     */

    public void setDesiredValue(Double desiredValue) {
        this.desiredValue = desiredValue;
    }

    /**
     * <p>
     * The new, increased value for the quota.
     * </p>
     * 
     * @return The new, increased value for the quota.
     */

    public Double getDesiredValue() {
        return this.desiredValue;
    }

    /**
     * <p>
     * The new, increased value for the quota.
     * </p>
     * 
     * @param desiredValue
     *        The new, increased value for the quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutServiceQuotaIncreaseRequestIntoTemplateRequest withDesiredValue(Double desiredValue) {
        setDesiredValue(desiredValue);
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
        if (getQuotaCode() != null)
            sb.append("QuotaCode: ").append(getQuotaCode()).append(",");
        if (getServiceCode() != null)
            sb.append("ServiceCode: ").append(getServiceCode()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getDesiredValue() != null)
            sb.append("DesiredValue: ").append(getDesiredValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutServiceQuotaIncreaseRequestIntoTemplateRequest == false)
            return false;
        PutServiceQuotaIncreaseRequestIntoTemplateRequest other = (PutServiceQuotaIncreaseRequestIntoTemplateRequest) obj;
        if (other.getQuotaCode() == null ^ this.getQuotaCode() == null)
            return false;
        if (other.getQuotaCode() != null && other.getQuotaCode().equals(this.getQuotaCode()) == false)
            return false;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getDesiredValue() == null ^ this.getDesiredValue() == null)
            return false;
        if (other.getDesiredValue() != null && other.getDesiredValue().equals(this.getDesiredValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuotaCode() == null) ? 0 : getQuotaCode().hashCode());
        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getDesiredValue() == null) ? 0 : getDesiredValue().hashCode());
        return hashCode;
    }

    @Override
    public PutServiceQuotaIncreaseRequestIntoTemplateRequest clone() {
        return (PutServiceQuotaIncreaseRequestIntoTemplateRequest) super.clone();
    }

}
