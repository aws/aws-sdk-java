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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetMacieSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMacieSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the Amazon Macie account was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The frequency with which Macie publishes updates to policy findings for the account. This includes publishing
     * updates to Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * </p>
     */
    private String findingPublishingFrequency;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that allows Macie to monitor and analyze data in Amazon
     * Web Services resources for the account.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * The current status of the Macie account. Possible values are: PAUSED, the account is enabled but all Macie
     * activities are suspended (paused) for the account; and, ENABLED, the account is enabled and all Macie activities
     * are enabled for the account.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the Macie
     * account.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the Amazon Macie account was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the Amazon Macie account was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the Amazon Macie account was created.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the Amazon Macie account was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the Amazon Macie account was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the Amazon Macie account was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMacieSessionResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The frequency with which Macie publishes updates to policy findings for the account. This includes publishing
     * updates to Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * </p>
     * 
     * @param findingPublishingFrequency
     *        The frequency with which Macie publishes updates to policy findings for the account. This includes
     *        publishing updates to Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * @see FindingPublishingFrequency
     */

    public void setFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
    }

    /**
     * <p>
     * The frequency with which Macie publishes updates to policy findings for the account. This includes publishing
     * updates to Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * </p>
     * 
     * @return The frequency with which Macie publishes updates to policy findings for the account. This includes
     *         publishing updates to Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * @see FindingPublishingFrequency
     */

    public String getFindingPublishingFrequency() {
        return this.findingPublishingFrequency;
    }

    /**
     * <p>
     * The frequency with which Macie publishes updates to policy findings for the account. This includes publishing
     * updates to Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * </p>
     * 
     * @param findingPublishingFrequency
     *        The frequency with which Macie publishes updates to policy findings for the account. This includes
     *        publishing updates to Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingPublishingFrequency
     */

    public GetMacieSessionResult withFindingPublishingFrequency(String findingPublishingFrequency) {
        setFindingPublishingFrequency(findingPublishingFrequency);
        return this;
    }

    /**
     * <p>
     * The frequency with which Macie publishes updates to policy findings for the account. This includes publishing
     * updates to Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * </p>
     * 
     * @param findingPublishingFrequency
     *        The frequency with which Macie publishes updates to policy findings for the account. This includes
     *        publishing updates to Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingPublishingFrequency
     */

    public GetMacieSessionResult withFindingPublishingFrequency(FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that allows Macie to monitor and analyze data in Amazon
     * Web Services resources for the account.
     * </p>
     * 
     * @param serviceRole
     *        The Amazon Resource Name (ARN) of the service-linked role that allows Macie to monitor and analyze data in
     *        Amazon Web Services resources for the account.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that allows Macie to monitor and analyze data in Amazon
     * Web Services resources for the account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service-linked role that allows Macie to monitor and analyze data
     *         in Amazon Web Services resources for the account.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that allows Macie to monitor and analyze data in Amazon
     * Web Services resources for the account.
     * </p>
     * 
     * @param serviceRole
     *        The Amazon Resource Name (ARN) of the service-linked role that allows Macie to monitor and analyze data in
     *        Amazon Web Services resources for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMacieSessionResult withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * The current status of the Macie account. Possible values are: PAUSED, the account is enabled but all Macie
     * activities are suspended (paused) for the account; and, ENABLED, the account is enabled and all Macie activities
     * are enabled for the account.
     * </p>
     * 
     * @param status
     *        The current status of the Macie account. Possible values are: PAUSED, the account is enabled but all Macie
     *        activities are suspended (paused) for the account; and, ENABLED, the account is enabled and all Macie
     *        activities are enabled for the account.
     * @see MacieStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the Macie account. Possible values are: PAUSED, the account is enabled but all Macie
     * activities are suspended (paused) for the account; and, ENABLED, the account is enabled and all Macie activities
     * are enabled for the account.
     * </p>
     * 
     * @return The current status of the Macie account. Possible values are: PAUSED, the account is enabled but all
     *         Macie activities are suspended (paused) for the account; and, ENABLED, the account is enabled and all
     *         Macie activities are enabled for the account.
     * @see MacieStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the Macie account. Possible values are: PAUSED, the account is enabled but all Macie
     * activities are suspended (paused) for the account; and, ENABLED, the account is enabled and all Macie activities
     * are enabled for the account.
     * </p>
     * 
     * @param status
     *        The current status of the Macie account. Possible values are: PAUSED, the account is enabled but all Macie
     *        activities are suspended (paused) for the account; and, ENABLED, the account is enabled and all Macie
     *        activities are enabled for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacieStatus
     */

    public GetMacieSessionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the Macie account. Possible values are: PAUSED, the account is enabled but all Macie
     * activities are suspended (paused) for the account; and, ENABLED, the account is enabled and all Macie activities
     * are enabled for the account.
     * </p>
     * 
     * @param status
     *        The current status of the Macie account. Possible values are: PAUSED, the account is enabled but all Macie
     *        activities are suspended (paused) for the account; and, ENABLED, the account is enabled and all Macie
     *        activities are enabled for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacieStatus
     */

    public GetMacieSessionResult withStatus(MacieStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the Macie
     * account.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the
     *        Macie account.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the Macie
     * account.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the
     *         Macie account.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the Macie
     * account.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the
     *        Macie account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMacieSessionResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getFindingPublishingFrequency() != null)
            sb.append("FindingPublishingFrequency: ").append(getFindingPublishingFrequency()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMacieSessionResult == false)
            return false;
        GetMacieSessionResult other = (GetMacieSessionResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getFindingPublishingFrequency() == null ^ this.getFindingPublishingFrequency() == null)
            return false;
        if (other.getFindingPublishingFrequency() != null && other.getFindingPublishingFrequency().equals(this.getFindingPublishingFrequency()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getFindingPublishingFrequency() == null) ? 0 : getFindingPublishingFrequency().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetMacieSessionResult clone() {
        try {
            return (GetMacieSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
