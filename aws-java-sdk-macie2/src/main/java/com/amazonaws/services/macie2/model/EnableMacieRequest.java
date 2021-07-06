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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/EnableMacie" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableMacieRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specifies how often to publish updates to policy findings for the account. This includes publishing updates to
     * Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * </p>
     */
    private String findingPublishingFrequency;
    /**
     * <p>
     * Specifies the new status for the account. To enable Amazon Macie and start all Macie activities for the account,
     * set this value to ENABLED.
     * </p>
     */
    private String status;

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableMacieRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies how often to publish updates to policy findings for the account. This includes publishing updates to
     * Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * </p>
     * 
     * @param findingPublishingFrequency
     *        Specifies how often to publish updates to policy findings for the account. This includes publishing
     *        updates to Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * @see FindingPublishingFrequency
     */

    public void setFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
    }

    /**
     * <p>
     * Specifies how often to publish updates to policy findings for the account. This includes publishing updates to
     * Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * </p>
     * 
     * @return Specifies how often to publish updates to policy findings for the account. This includes publishing
     *         updates to Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * @see FindingPublishingFrequency
     */

    public String getFindingPublishingFrequency() {
        return this.findingPublishingFrequency;
    }

    /**
     * <p>
     * Specifies how often to publish updates to policy findings for the account. This includes publishing updates to
     * Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * </p>
     * 
     * @param findingPublishingFrequency
     *        Specifies how often to publish updates to policy findings for the account. This includes publishing
     *        updates to Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingPublishingFrequency
     */

    public EnableMacieRequest withFindingPublishingFrequency(String findingPublishingFrequency) {
        setFindingPublishingFrequency(findingPublishingFrequency);
        return this;
    }

    /**
     * <p>
     * Specifies how often to publish updates to policy findings for the account. This includes publishing updates to
     * Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * </p>
     * 
     * @param findingPublishingFrequency
     *        Specifies how often to publish updates to policy findings for the account. This includes publishing
     *        updates to Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingPublishingFrequency
     */

    public EnableMacieRequest withFindingPublishingFrequency(FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the new status for the account. To enable Amazon Macie and start all Macie activities for the account,
     * set this value to ENABLED.
     * </p>
     * 
     * @param status
     *        Specifies the new status for the account. To enable Amazon Macie and start all Macie activities for the
     *        account, set this value to ENABLED.
     * @see MacieStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the new status for the account. To enable Amazon Macie and start all Macie activities for the account,
     * set this value to ENABLED.
     * </p>
     * 
     * @return Specifies the new status for the account. To enable Amazon Macie and start all Macie activities for the
     *         account, set this value to ENABLED.
     * @see MacieStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the new status for the account. To enable Amazon Macie and start all Macie activities for the account,
     * set this value to ENABLED.
     * </p>
     * 
     * @param status
     *        Specifies the new status for the account. To enable Amazon Macie and start all Macie activities for the
     *        account, set this value to ENABLED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacieStatus
     */

    public EnableMacieRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the new status for the account. To enable Amazon Macie and start all Macie activities for the account,
     * set this value to ENABLED.
     * </p>
     * 
     * @param status
     *        Specifies the new status for the account. To enable Amazon Macie and start all Macie activities for the
     *        account, set this value to ENABLED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacieStatus
     */

    public EnableMacieRequest withStatus(MacieStatus status) {
        this.status = status.toString();
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getFindingPublishingFrequency() != null)
            sb.append("FindingPublishingFrequency: ").append(getFindingPublishingFrequency()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableMacieRequest == false)
            return false;
        EnableMacieRequest other = (EnableMacieRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFindingPublishingFrequency() == null ^ this.getFindingPublishingFrequency() == null)
            return false;
        if (other.getFindingPublishingFrequency() != null && other.getFindingPublishingFrequency().equals(this.getFindingPublishingFrequency()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFindingPublishingFrequency() == null) ? 0 : getFindingPublishingFrequency().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public EnableMacieRequest clone() {
        return (EnableMacieRequest) super.clone();
    }

}
