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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains information about one service quota increase request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ServiceQuotaIncreaseRequestInTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaIncreaseRequestInTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The code identifier for the AWS service specified in the increase request.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The name of the AWS service specified in the increase request.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The code identifier for the service quota specified in the increase request.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The name of the service quota in the increase request.
     * </p>
     */
    private String quotaName;
    /**
     * <p>
     * Identifies the new, increased value of the service quota in the increase request.
     * </p>
     */
    private Double desiredValue;
    /**
     * <p>
     * The AWS Region where the increase request occurs.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * The unit of measure for the increase request.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * Specifies if the quota is a global quota.
     * </p>
     */
    private Boolean globalQuota;

    /**
     * <p>
     * The code identifier for the AWS service specified in the increase request.
     * </p>
     * 
     * @param serviceCode
     *        The code identifier for the AWS service specified in the increase request.
     */

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The code identifier for the AWS service specified in the increase request.
     * </p>
     * 
     * @return The code identifier for the AWS service specified in the increase request.
     */

    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The code identifier for the AWS service specified in the increase request.
     * </p>
     * 
     * @param serviceCode
     *        The code identifier for the AWS service specified in the increase request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaIncreaseRequestInTemplate withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The name of the AWS service specified in the increase request.
     * </p>
     * 
     * @param serviceName
     *        The name of the AWS service specified in the increase request.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the AWS service specified in the increase request.
     * </p>
     * 
     * @return The name of the AWS service specified in the increase request.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the AWS service specified in the increase request.
     * </p>
     * 
     * @param serviceName
     *        The name of the AWS service specified in the increase request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaIncreaseRequestInTemplate withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The code identifier for the service quota specified in the increase request.
     * </p>
     * 
     * @param quotaCode
     *        The code identifier for the service quota specified in the increase request.
     */

    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The code identifier for the service quota specified in the increase request.
     * </p>
     * 
     * @return The code identifier for the service quota specified in the increase request.
     */

    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The code identifier for the service quota specified in the increase request.
     * </p>
     * 
     * @param quotaCode
     *        The code identifier for the service quota specified in the increase request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaIncreaseRequestInTemplate withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The name of the service quota in the increase request.
     * </p>
     * 
     * @param quotaName
     *        The name of the service quota in the increase request.
     */

    public void setQuotaName(String quotaName) {
        this.quotaName = quotaName;
    }

    /**
     * <p>
     * The name of the service quota in the increase request.
     * </p>
     * 
     * @return The name of the service quota in the increase request.
     */

    public String getQuotaName() {
        return this.quotaName;
    }

    /**
     * <p>
     * The name of the service quota in the increase request.
     * </p>
     * 
     * @param quotaName
     *        The name of the service quota in the increase request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaIncreaseRequestInTemplate withQuotaName(String quotaName) {
        setQuotaName(quotaName);
        return this;
    }

    /**
     * <p>
     * Identifies the new, increased value of the service quota in the increase request.
     * </p>
     * 
     * @param desiredValue
     *        Identifies the new, increased value of the service quota in the increase request.
     */

    public void setDesiredValue(Double desiredValue) {
        this.desiredValue = desiredValue;
    }

    /**
     * <p>
     * Identifies the new, increased value of the service quota in the increase request.
     * </p>
     * 
     * @return Identifies the new, increased value of the service quota in the increase request.
     */

    public Double getDesiredValue() {
        return this.desiredValue;
    }

    /**
     * <p>
     * Identifies the new, increased value of the service quota in the increase request.
     * </p>
     * 
     * @param desiredValue
     *        Identifies the new, increased value of the service quota in the increase request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaIncreaseRequestInTemplate withDesiredValue(Double desiredValue) {
        setDesiredValue(desiredValue);
        return this;
    }

    /**
     * <p>
     * The AWS Region where the increase request occurs.
     * </p>
     * 
     * @param awsRegion
     *        The AWS Region where the increase request occurs.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The AWS Region where the increase request occurs.
     * </p>
     * 
     * @return The AWS Region where the increase request occurs.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The AWS Region where the increase request occurs.
     * </p>
     * 
     * @param awsRegion
     *        The AWS Region where the increase request occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaIncreaseRequestInTemplate withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * The unit of measure for the increase request.
     * </p>
     * 
     * @param unit
     *        The unit of measure for the increase request.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measure for the increase request.
     * </p>
     * 
     * @return The unit of measure for the increase request.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of measure for the increase request.
     * </p>
     * 
     * @param unit
     *        The unit of measure for the increase request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaIncreaseRequestInTemplate withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * Specifies if the quota is a global quota.
     * </p>
     * 
     * @param globalQuota
     *        Specifies if the quota is a global quota.
     */

    public void setGlobalQuota(Boolean globalQuota) {
        this.globalQuota = globalQuota;
    }

    /**
     * <p>
     * Specifies if the quota is a global quota.
     * </p>
     * 
     * @return Specifies if the quota is a global quota.
     */

    public Boolean getGlobalQuota() {
        return this.globalQuota;
    }

    /**
     * <p>
     * Specifies if the quota is a global quota.
     * </p>
     * 
     * @param globalQuota
     *        Specifies if the quota is a global quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaIncreaseRequestInTemplate withGlobalQuota(Boolean globalQuota) {
        setGlobalQuota(globalQuota);
        return this;
    }

    /**
     * <p>
     * Specifies if the quota is a global quota.
     * </p>
     * 
     * @return Specifies if the quota is a global quota.
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
