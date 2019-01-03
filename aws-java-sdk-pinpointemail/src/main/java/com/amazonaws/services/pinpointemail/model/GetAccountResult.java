/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of details about the email-sending capabilities of your Amazon Pinpoint account in the current AWS Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains information about the per-day and per-second sending limits for your Amazon Pinpoint
     * account in the current AWS Region.
     * </p>
     */
    private SendQuota sendQuota;
    /**
     * <p>
     * Indicates whether or not email sending is enabled for your Amazon Pinpoint account in the current AWS Region.
     * </p>
     */
    private Boolean sendingEnabled;
    /**
     * <p>
     * Indicates whether or not the automatic warm-up feature is enabled for dedicated IP addresses that are associated
     * with your account.
     * </p>
     */
    private Boolean dedicatedIpAutoWarmupEnabled;
    /**
     * <p>
     * The reputation status of your Amazon Pinpoint account. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – There are no reputation-related issues that currently impact your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROBATION</code> – We've identified some issues with your Amazon Pinpoint account. We're placing your
     * account under review while you work on correcting these issues.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHUTDOWN</code> – Your account's ability to send email is currently paused because of an issue with the
     * email sent from your account. When you correct the issue, you can contact us and request that your account's
     * ability to send email is resumed.
     * </p>
     * </li>
     * </ul>
     */
    private String enforcementStatus;
    /**
     * <p>
     * Indicates whether or not your account has production access in the current AWS Region.
     * </p>
     * <p>
     * If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in the
     * sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send
     * in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your
     * maximum sending rate) is 1.
     * </p>
     * <p>
     * If the value is <code>true</code>, then your account has production access. When your account has production
     * access, you can send email to any address. The sending quota and maximum sending rate for your account vary based
     * on your specific use case.
     * </p>
     */
    private Boolean productionAccessEnabled;

    /**
     * <p>
     * An object that contains information about the per-day and per-second sending limits for your Amazon Pinpoint
     * account in the current AWS Region.
     * </p>
     * 
     * @param sendQuota
     *        An object that contains information about the per-day and per-second sending limits for your Amazon
     *        Pinpoint account in the current AWS Region.
     */

    public void setSendQuota(SendQuota sendQuota) {
        this.sendQuota = sendQuota;
    }

    /**
     * <p>
     * An object that contains information about the per-day and per-second sending limits for your Amazon Pinpoint
     * account in the current AWS Region.
     * </p>
     * 
     * @return An object that contains information about the per-day and per-second sending limits for your Amazon
     *         Pinpoint account in the current AWS Region.
     */

    public SendQuota getSendQuota() {
        return this.sendQuota;
    }

    /**
     * <p>
     * An object that contains information about the per-day and per-second sending limits for your Amazon Pinpoint
     * account in the current AWS Region.
     * </p>
     * 
     * @param sendQuota
     *        An object that contains information about the per-day and per-second sending limits for your Amazon
     *        Pinpoint account in the current AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountResult withSendQuota(SendQuota sendQuota) {
        setSendQuota(sendQuota);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not email sending is enabled for your Amazon Pinpoint account in the current AWS Region.
     * </p>
     * 
     * @param sendingEnabled
     *        Indicates whether or not email sending is enabled for your Amazon Pinpoint account in the current AWS
     *        Region.
     */

    public void setSendingEnabled(Boolean sendingEnabled) {
        this.sendingEnabled = sendingEnabled;
    }

    /**
     * <p>
     * Indicates whether or not email sending is enabled for your Amazon Pinpoint account in the current AWS Region.
     * </p>
     * 
     * @return Indicates whether or not email sending is enabled for your Amazon Pinpoint account in the current AWS
     *         Region.
     */

    public Boolean getSendingEnabled() {
        return this.sendingEnabled;
    }

    /**
     * <p>
     * Indicates whether or not email sending is enabled for your Amazon Pinpoint account in the current AWS Region.
     * </p>
     * 
     * @param sendingEnabled
     *        Indicates whether or not email sending is enabled for your Amazon Pinpoint account in the current AWS
     *        Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountResult withSendingEnabled(Boolean sendingEnabled) {
        setSendingEnabled(sendingEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not email sending is enabled for your Amazon Pinpoint account in the current AWS Region.
     * </p>
     * 
     * @return Indicates whether or not email sending is enabled for your Amazon Pinpoint account in the current AWS
     *         Region.
     */

    public Boolean isSendingEnabled() {
        return this.sendingEnabled;
    }

    /**
     * <p>
     * Indicates whether or not the automatic warm-up feature is enabled for dedicated IP addresses that are associated
     * with your account.
     * </p>
     * 
     * @param dedicatedIpAutoWarmupEnabled
     *        Indicates whether or not the automatic warm-up feature is enabled for dedicated IP addresses that are
     *        associated with your account.
     */

    public void setDedicatedIpAutoWarmupEnabled(Boolean dedicatedIpAutoWarmupEnabled) {
        this.dedicatedIpAutoWarmupEnabled = dedicatedIpAutoWarmupEnabled;
    }

    /**
     * <p>
     * Indicates whether or not the automatic warm-up feature is enabled for dedicated IP addresses that are associated
     * with your account.
     * </p>
     * 
     * @return Indicates whether or not the automatic warm-up feature is enabled for dedicated IP addresses that are
     *         associated with your account.
     */

    public Boolean getDedicatedIpAutoWarmupEnabled() {
        return this.dedicatedIpAutoWarmupEnabled;
    }

    /**
     * <p>
     * Indicates whether or not the automatic warm-up feature is enabled for dedicated IP addresses that are associated
     * with your account.
     * </p>
     * 
     * @param dedicatedIpAutoWarmupEnabled
     *        Indicates whether or not the automatic warm-up feature is enabled for dedicated IP addresses that are
     *        associated with your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountResult withDedicatedIpAutoWarmupEnabled(Boolean dedicatedIpAutoWarmupEnabled) {
        setDedicatedIpAutoWarmupEnabled(dedicatedIpAutoWarmupEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the automatic warm-up feature is enabled for dedicated IP addresses that are associated
     * with your account.
     * </p>
     * 
     * @return Indicates whether or not the automatic warm-up feature is enabled for dedicated IP addresses that are
     *         associated with your account.
     */

    public Boolean isDedicatedIpAutoWarmupEnabled() {
        return this.dedicatedIpAutoWarmupEnabled;
    }

    /**
     * <p>
     * The reputation status of your Amazon Pinpoint account. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – There are no reputation-related issues that currently impact your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROBATION</code> – We've identified some issues with your Amazon Pinpoint account. We're placing your
     * account under review while you work on correcting these issues.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHUTDOWN</code> – Your account's ability to send email is currently paused because of an issue with the
     * email sent from your account. When you correct the issue, you can contact us and request that your account's
     * ability to send email is resumed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param enforcementStatus
     *        The reputation status of your Amazon Pinpoint account. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> – There are no reputation-related issues that currently impact your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROBATION</code> – We've identified some issues with your Amazon Pinpoint account. We're placing
     *        your account under review while you work on correcting these issues.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SHUTDOWN</code> – Your account's ability to send email is currently paused because of an issue with
     *        the email sent from your account. When you correct the issue, you can contact us and request that your
     *        account's ability to send email is resumed.
     *        </p>
     *        </li>
     */

    public void setEnforcementStatus(String enforcementStatus) {
        this.enforcementStatus = enforcementStatus;
    }

    /**
     * <p>
     * The reputation status of your Amazon Pinpoint account. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – There are no reputation-related issues that currently impact your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROBATION</code> – We've identified some issues with your Amazon Pinpoint account. We're placing your
     * account under review while you work on correcting these issues.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHUTDOWN</code> – Your account's ability to send email is currently paused because of an issue with the
     * email sent from your account. When you correct the issue, you can contact us and request that your account's
     * ability to send email is resumed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The reputation status of your Amazon Pinpoint account. The status can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HEALTHY</code> – There are no reputation-related issues that currently impact your account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PROBATION</code> – We've identified some issues with your Amazon Pinpoint account. We're placing
     *         your account under review while you work on correcting these issues.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SHUTDOWN</code> – Your account's ability to send email is currently paused because of an issue with
     *         the email sent from your account. When you correct the issue, you can contact us and request that your
     *         account's ability to send email is resumed.
     *         </p>
     *         </li>
     */

    public String getEnforcementStatus() {
        return this.enforcementStatus;
    }

    /**
     * <p>
     * The reputation status of your Amazon Pinpoint account. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – There are no reputation-related issues that currently impact your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROBATION</code> – We've identified some issues with your Amazon Pinpoint account. We're placing your
     * account under review while you work on correcting these issues.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHUTDOWN</code> – Your account's ability to send email is currently paused because of an issue with the
     * email sent from your account. When you correct the issue, you can contact us and request that your account's
     * ability to send email is resumed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param enforcementStatus
     *        The reputation status of your Amazon Pinpoint account. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> – There are no reputation-related issues that currently impact your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROBATION</code> – We've identified some issues with your Amazon Pinpoint account. We're placing
     *        your account under review while you work on correcting these issues.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SHUTDOWN</code> – Your account's ability to send email is currently paused because of an issue with
     *        the email sent from your account. When you correct the issue, you can contact us and request that your
     *        account's ability to send email is resumed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountResult withEnforcementStatus(String enforcementStatus) {
        setEnforcementStatus(enforcementStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not your account has production access in the current AWS Region.
     * </p>
     * <p>
     * If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in the
     * sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send
     * in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your
     * maximum sending rate) is 1.
     * </p>
     * <p>
     * If the value is <code>true</code>, then your account has production access. When your account has production
     * access, you can send email to any address. The sending quota and maximum sending rate for your account vary based
     * on your specific use case.
     * </p>
     * 
     * @param productionAccessEnabled
     *        Indicates whether or not your account has production access in the current AWS Region.</p>
     *        <p>
     *        If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in
     *        the sandbox, you can only send email to verified identities. Additionally, the maximum number of emails
     *        you can send in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can
     *        send per second (your maximum sending rate) is 1.
     *        </p>
     *        <p>
     *        If the value is <code>true</code>, then your account has production access. When your account has
     *        production access, you can send email to any address. The sending quota and maximum sending rate for your
     *        account vary based on your specific use case.
     */

    public void setProductionAccessEnabled(Boolean productionAccessEnabled) {
        this.productionAccessEnabled = productionAccessEnabled;
    }

    /**
     * <p>
     * Indicates whether or not your account has production access in the current AWS Region.
     * </p>
     * <p>
     * If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in the
     * sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send
     * in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your
     * maximum sending rate) is 1.
     * </p>
     * <p>
     * If the value is <code>true</code>, then your account has production access. When your account has production
     * access, you can send email to any address. The sending quota and maximum sending rate for your account vary based
     * on your specific use case.
     * </p>
     * 
     * @return Indicates whether or not your account has production access in the current AWS Region.</p>
     *         <p>
     *         If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in
     *         the sandbox, you can only send email to verified identities. Additionally, the maximum number of emails
     *         you can send in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can
     *         send per second (your maximum sending rate) is 1.
     *         </p>
     *         <p>
     *         If the value is <code>true</code>, then your account has production access. When your account has
     *         production access, you can send email to any address. The sending quota and maximum sending rate for your
     *         account vary based on your specific use case.
     */

    public Boolean getProductionAccessEnabled() {
        return this.productionAccessEnabled;
    }

    /**
     * <p>
     * Indicates whether or not your account has production access in the current AWS Region.
     * </p>
     * <p>
     * If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in the
     * sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send
     * in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your
     * maximum sending rate) is 1.
     * </p>
     * <p>
     * If the value is <code>true</code>, then your account has production access. When your account has production
     * access, you can send email to any address. The sending quota and maximum sending rate for your account vary based
     * on your specific use case.
     * </p>
     * 
     * @param productionAccessEnabled
     *        Indicates whether or not your account has production access in the current AWS Region.</p>
     *        <p>
     *        If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in
     *        the sandbox, you can only send email to verified identities. Additionally, the maximum number of emails
     *        you can send in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can
     *        send per second (your maximum sending rate) is 1.
     *        </p>
     *        <p>
     *        If the value is <code>true</code>, then your account has production access. When your account has
     *        production access, you can send email to any address. The sending quota and maximum sending rate for your
     *        account vary based on your specific use case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountResult withProductionAccessEnabled(Boolean productionAccessEnabled) {
        setProductionAccessEnabled(productionAccessEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not your account has production access in the current AWS Region.
     * </p>
     * <p>
     * If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in the
     * sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send
     * in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your
     * maximum sending rate) is 1.
     * </p>
     * <p>
     * If the value is <code>true</code>, then your account has production access. When your account has production
     * access, you can send email to any address. The sending quota and maximum sending rate for your account vary based
     * on your specific use case.
     * </p>
     * 
     * @return Indicates whether or not your account has production access in the current AWS Region.</p>
     *         <p>
     *         If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in
     *         the sandbox, you can only send email to verified identities. Additionally, the maximum number of emails
     *         you can send in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can
     *         send per second (your maximum sending rate) is 1.
     *         </p>
     *         <p>
     *         If the value is <code>true</code>, then your account has production access. When your account has
     *         production access, you can send email to any address. The sending quota and maximum sending rate for your
     *         account vary based on your specific use case.
     */

    public Boolean isProductionAccessEnabled() {
        return this.productionAccessEnabled;
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
        if (getSendQuota() != null)
            sb.append("SendQuota: ").append(getSendQuota()).append(",");
        if (getSendingEnabled() != null)
            sb.append("SendingEnabled: ").append(getSendingEnabled()).append(",");
        if (getDedicatedIpAutoWarmupEnabled() != null)
            sb.append("DedicatedIpAutoWarmupEnabled: ").append(getDedicatedIpAutoWarmupEnabled()).append(",");
        if (getEnforcementStatus() != null)
            sb.append("EnforcementStatus: ").append(getEnforcementStatus()).append(",");
        if (getProductionAccessEnabled() != null)
            sb.append("ProductionAccessEnabled: ").append(getProductionAccessEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountResult == false)
            return false;
        GetAccountResult other = (GetAccountResult) obj;
        if (other.getSendQuota() == null ^ this.getSendQuota() == null)
            return false;
        if (other.getSendQuota() != null && other.getSendQuota().equals(this.getSendQuota()) == false)
            return false;
        if (other.getSendingEnabled() == null ^ this.getSendingEnabled() == null)
            return false;
        if (other.getSendingEnabled() != null && other.getSendingEnabled().equals(this.getSendingEnabled()) == false)
            return false;
        if (other.getDedicatedIpAutoWarmupEnabled() == null ^ this.getDedicatedIpAutoWarmupEnabled() == null)
            return false;
        if (other.getDedicatedIpAutoWarmupEnabled() != null && other.getDedicatedIpAutoWarmupEnabled().equals(this.getDedicatedIpAutoWarmupEnabled()) == false)
            return false;
        if (other.getEnforcementStatus() == null ^ this.getEnforcementStatus() == null)
            return false;
        if (other.getEnforcementStatus() != null && other.getEnforcementStatus().equals(this.getEnforcementStatus()) == false)
            return false;
        if (other.getProductionAccessEnabled() == null ^ this.getProductionAccessEnabled() == null)
            return false;
        if (other.getProductionAccessEnabled() != null && other.getProductionAccessEnabled().equals(this.getProductionAccessEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSendQuota() == null) ? 0 : getSendQuota().hashCode());
        hashCode = prime * hashCode + ((getSendingEnabled() == null) ? 0 : getSendingEnabled().hashCode());
        hashCode = prime * hashCode + ((getDedicatedIpAutoWarmupEnabled() == null) ? 0 : getDedicatedIpAutoWarmupEnabled().hashCode());
        hashCode = prime * hashCode + ((getEnforcementStatus() == null) ? 0 : getEnforcementStatus().hashCode());
        hashCode = prime * hashCode + ((getProductionAccessEnabled() == null) ? 0 : getProductionAccessEnabled().hashCode());
        return hashCode;
    }

    @Override
    public GetAccountResult clone() {
        try {
            return (GetAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
