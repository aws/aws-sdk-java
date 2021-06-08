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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a quota increase request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ServiceQuotaIncreaseRequestInTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaIncreaseRequestInTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The service identifier.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The service name.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The quota identifier.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The quota name.
     * </p>
     */
    private String quotaName;
    /**
     * <p>
     * The new, increased value of the quota.
     * </p>
     */
    private Double desiredValue;
    /**
     * <p>
     * The AWS Region.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * The unit of measurement.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * Indicates whether the quota is global.
     * </p>
     */
    private Boolean globalQuota;

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

    public ServiceQuotaIncreaseRequestInTemplate withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The service name.
     * </p>
     * 
     * @param serviceName
     *        The service name.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The service name.
     * </p>
     * 
     * @return The service name.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The service name.
     * </p>
     * 
     * @param serviceName
     *        The service name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaIncreaseRequestInTemplate withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

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

    public ServiceQuotaIncreaseRequestInTemplate withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The quota name.
     * </p>
     * 
     * @param quotaName
     *        The quota name.
     */

    public void setQuotaName(String quotaName) {
        this.quotaName = quotaName;
    }

    /**
     * <p>
     * The quota name.
     * </p>
     * 
     * @return The quota name.
     */

    public String getQuotaName() {
        return this.quotaName;
    }

    /**
     * <p>
     * The quota name.
     * </p>
     * 
     * @param quotaName
     *        The quota name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaIncreaseRequestInTemplate withQuotaName(String quotaName) {
        setQuotaName(quotaName);
        return this;
    }

    /**
     * <p>
     * The new, increased value of the quota.
     * </p>
     * 
     * @param desiredValue
     *        The new, increased value of the quota.
     */

    public void setDesiredValue(Double desiredValue) {
        this.desiredValue = desiredValue;
    }

    /**
     * <p>
     * The new, increased value of the quota.
     * </p>
     * 
     * @return The new, increased value of the quota.
     */

    public Double getDesiredValue() {
        return this.desiredValue;
    }

    /**
     * <p>
     * The new, increased value of the quota.
     * </p>
     * 
     * @param desiredValue
     *        The new, increased value of the quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaIncreaseRequestInTemplate withDesiredValue(Double desiredValue) {
        setDesiredValue(desiredValue);
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

    public ServiceQuotaIncreaseRequestInTemplate withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * The unit of measurement.
     * </p>
     * 
     * @param unit
     *        The unit of measurement.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measurement.
     * </p>
     * 
     * @return The unit of measurement.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of measurement.
     * </p>
     * 
     * @param unit
     *        The unit of measurement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaIncreaseRequestInTemplate withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * Indicates whether the quota is global.
     * </p>
     * 
     * @param globalQuota
     *        Indicates whether the quota is global.
     */

    public void setGlobalQuota(Boolean globalQuota) {
        this.globalQuota = globalQuota;
    }

    /**
     * <p>
     * Indicates whether the quota is global.
     * </p>
     * 
     * @return Indicates whether the quota is global.
     */

    public Boolean getGlobalQuota() {
        return this.globalQuota;
    }

    /**
     * <p>
     * Indicates whether the quota is global.
     * </p>
     * 
     * @param globalQuota
     *        Indicates whether the quota is global.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaIncreaseRequestInTemplate withGlobalQuota(Boolean globalQuota) {
        setGlobalQuota(globalQuota);
        return this;
    }

    /**
     * <p>
     * Indicates whether the quota is global.
     * </p>
     * 
     * @return Indicates whether the quota is global.
     */

    public Boolean isGlobalQuota() {
        return this.globalQuota;
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
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getQuotaCode() != null)
            sb.append("QuotaCode: ").append(getQuotaCode()).append(",");
        if (getQuotaName() != null)
            sb.append("QuotaName: ").append(getQuotaName()).append(",");
        if (getDesiredValue() != null)
            sb.append("DesiredValue: ").append(getDesiredValue()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getGlobalQuota() != null)
            sb.append("GlobalQuota: ").append(getGlobalQuota());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceQuotaIncreaseRequestInTemplate == false)
            return false;
        ServiceQuotaIncreaseRequestInTemplate other = (ServiceQuotaIncreaseRequestInTemplate) obj;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getQuotaCode() == null ^ this.getQuotaCode() == null)
            return false;
        if (other.getQuotaCode() != null && other.getQuotaCode().equals(this.getQuotaCode()) == false)
            return false;
        if (other.getQuotaName() == null ^ this.getQuotaName() == null)
            return false;
        if (other.getQuotaName() != null && other.getQuotaName().equals(this.getQuotaName()) == false)
            return false;
        if (other.getDesiredValue() == null ^ this.getDesiredValue() == null)
            return false;
        if (other.getDesiredValue() != null && other.getDesiredValue().equals(this.getDesiredValue()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getGlobalQuota() == null ^ this.getGlobalQuota() == null)
            return false;
        if (other.getGlobalQuota() != null && other.getGlobalQuota().equals(this.getGlobalQuota()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getQuotaCode() == null) ? 0 : getQuotaCode().hashCode());
        hashCode = prime * hashCode + ((getQuotaName() == null) ? 0 : getQuotaName().hashCode());
        hashCode = prime * hashCode + ((getDesiredValue() == null) ? 0 : getDesiredValue().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getGlobalQuota() == null) ? 0 : getGlobalQuota().hashCode());
        return hashCode;
    }

    @Override
    public ServiceQuotaIncreaseRequestInTemplate clone() {
        try {
            return (ServiceQuotaIncreaseRequestInTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicequotas.model.transform.ServiceQuotaIncreaseRequestInTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
