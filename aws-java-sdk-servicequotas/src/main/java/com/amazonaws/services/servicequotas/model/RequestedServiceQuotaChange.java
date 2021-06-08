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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/RequestedServiceQuotaChange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestedServiceQuotaChange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The case ID.
     * </p>
     */
    private String caseId;
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
     * The new, increased value for the quota.
     * </p>
     */
    private Double desiredValue;
    /**
     * <p>
     * The state of the quota increase request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time when the quota increase request was received and the case ID was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The date and time of the most recent change.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * The IAM identity of the requester.
     * </p>
     */
    private String requester;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quota.
     * </p>
     */
    private String quotaArn;
    /**
     * <p>
     * Indicates whether the quota is global.
     * </p>
     */
    private Boolean globalQuota;
    /**
     * <p>
     * The unit of measurement.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The unique identifier.
     * </p>
     * 
     * @param id
     *        The unique identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier.
     * </p>
     * 
     * @return The unique identifier.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier.
     * </p>
     * 
     * @param id
     *        The unique identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestedServiceQuotaChange withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The case ID.
     * </p>
     * 
     * @param caseId
     *        The case ID.
     */

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * <p>
     * The case ID.
     * </p>
     * 
     * @return The case ID.
     */

    public String getCaseId() {
        return this.caseId;
    }

    /**
     * <p>
     * The case ID.
     * </p>
     * 
     * @param caseId
     *        The case ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestedServiceQuotaChange withCaseId(String caseId) {
        setCaseId(caseId);
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

    public RequestedServiceQuotaChange withServiceCode(String serviceCode) {
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

    public RequestedServiceQuotaChange withServiceName(String serviceName) {
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

    public RequestedServiceQuotaChange withQuotaCode(String quotaCode) {
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

    public RequestedServiceQuotaChange withQuotaName(String quotaName) {
        setQuotaName(quotaName);
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

    public RequestedServiceQuotaChange withDesiredValue(Double desiredValue) {
        setDesiredValue(desiredValue);
        return this;
    }

    /**
     * <p>
     * The state of the quota increase request.
     * </p>
     * 
     * @param status
     *        The state of the quota increase request.
     * @see RequestStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of the quota increase request.
     * </p>
     * 
     * @return The state of the quota increase request.
     * @see RequestStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of the quota increase request.
     * </p>
     * 
     * @param status
     *        The state of the quota increase request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestStatus
     */

    public RequestedServiceQuotaChange withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of the quota increase request.
     * </p>
     * 
     * @param status
     *        The state of the quota increase request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestStatus
     */

    public RequestedServiceQuotaChange withStatus(RequestStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the quota increase request was received and the case ID was created.
     * </p>
     * 
     * @param created
     *        The date and time when the quota increase request was received and the case ID was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time when the quota increase request was received and the case ID was created.
     * </p>
     * 
     * @return The date and time when the quota increase request was received and the case ID was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date and time when the quota increase request was received and the case ID was created.
     * </p>
     * 
     * @param created
     *        The date and time when the quota increase request was received and the case ID was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestedServiceQuotaChange withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The date and time of the most recent change.
     * </p>
     * 
     * @param lastUpdated
     *        The date and time of the most recent change.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The date and time of the most recent change.
     * </p>
     * 
     * @return The date and time of the most recent change.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The date and time of the most recent change.
     * </p>
     * 
     * @param lastUpdated
     *        The date and time of the most recent change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestedServiceQuotaChange withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The IAM identity of the requester.
     * </p>
     * 
     * @param requester
     *        The IAM identity of the requester.
     */

    public void setRequester(String requester) {
        this.requester = requester;
    }

    /**
     * <p>
     * The IAM identity of the requester.
     * </p>
     * 
     * @return The IAM identity of the requester.
     */

    public String getRequester() {
        return this.requester;
    }

    /**
     * <p>
     * The IAM identity of the requester.
     * </p>
     * 
     * @param requester
     *        The IAM identity of the requester.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestedServiceQuotaChange withRequester(String requester) {
        setRequester(requester);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quota.
     * </p>
     * 
     * @param quotaArn
     *        The Amazon Resource Name (ARN) of the quota.
     */

    public void setQuotaArn(String quotaArn) {
        this.quotaArn = quotaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quota.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the quota.
     */

    public String getQuotaArn() {
        return this.quotaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quota.
     * </p>
     * 
     * @param quotaArn
     *        The Amazon Resource Name (ARN) of the quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestedServiceQuotaChange withQuotaArn(String quotaArn) {
        setQuotaArn(quotaArn);
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

    public RequestedServiceQuotaChange withGlobalQuota(Boolean globalQuota) {
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

    public RequestedServiceQuotaChange withUnit(String unit) {
        setUnit(unit);
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
        if (getCaseId() != null)
            sb.append("CaseId: ").append(getCaseId()).append(",");
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getRequester() != null)
            sb.append("Requester: ").append(getRequester()).append(",");
        if (getQuotaArn() != null)
            sb.append("QuotaArn: ").append(getQuotaArn()).append(",");
        if (getGlobalQuota() != null)
            sb.append("GlobalQuota: ").append(getGlobalQuota()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestedServiceQuotaChange == false)
            return false;
        RequestedServiceQuotaChange other = (RequestedServiceQuotaChange) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getRequester() == null ^ this.getRequester() == null)
            return false;
        if (other.getRequester() != null && other.getRequester().equals(this.getRequester()) == false)
            return false;
        if (other.getQuotaArn() == null ^ this.getQuotaArn() == null)
            return false;
        if (other.getQuotaArn() != null && other.getQuotaArn().equals(this.getQuotaArn()) == false)
            return false;
        if (other.getGlobalQuota() == null ^ this.getGlobalQuota() == null)
            return false;
        if (other.getGlobalQuota() != null && other.getGlobalQuota().equals(this.getGlobalQuota()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getQuotaCode() == null) ? 0 : getQuotaCode().hashCode());
        hashCode = prime * hashCode + ((getQuotaName() == null) ? 0 : getQuotaName().hashCode());
        hashCode = prime * hashCode + ((getDesiredValue() == null) ? 0 : getDesiredValue().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getRequester() == null) ? 0 : getRequester().hashCode());
        hashCode = prime * hashCode + ((getQuotaArn() == null) ? 0 : getQuotaArn().hashCode());
        hashCode = prime * hashCode + ((getGlobalQuota() == null) ? 0 : getGlobalQuota().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public RequestedServiceQuotaChange clone() {
        try {
            return (RequestedServiceQuotaChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicequotas.model.transform.RequestedServiceQuotaChangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
