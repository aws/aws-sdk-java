/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about notification channels you have configured with DevOps Guru. The one supported notification channel
 * is Amazon Simple Notification Service (Amazon SNS).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/NotificationChannelConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationChannelConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about a notification channel configured in DevOps Guru to send notifications when insights are
     * created.
     * </p>
     * <p>
     * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     * permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using
     * Amazon SNS in your account. DevOps Guru only supports standard SNS topics. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html">Permissions for
     * cross account Amazon SNS topics</a>.
     * </p>
     * <p>
     * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     * permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using
     * Amazon SNS in your account. For more information, see Permissions for cross account Amazon SNS topics.
     * </p>
     * <p>
     * If you use an Amazon SNS topic that is encrypted by an Amazon Web Services Key Management Service
     * customer-managed key (CMK), then you must add permissions to the CMK. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html">Permissions for Amazon
     * Web Services KMS–encrypted Amazon SNS topics</a>.
     * </p>
     */
    private SnsChannelConfig sns;
    /**
     * <p>
     * The filter configurations for the Amazon SNS notification topic you use with DevOps Guru. If you do not provide
     * filter configurations, the default configurations are to receive notifications for all message types of
     * <code>High</code> or <code>Medium</code> severity.
     * </p>
     */
    private NotificationFilterConfig filters;

    /**
     * <p>
     * Information about a notification channel configured in DevOps Guru to send notifications when insights are
     * created.
     * </p>
     * <p>
     * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     * permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using
     * Amazon SNS in your account. DevOps Guru only supports standard SNS topics. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html">Permissions for
     * cross account Amazon SNS topics</a>.
     * </p>
     * <p>
     * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     * permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using
     * Amazon SNS in your account. For more information, see Permissions for cross account Amazon SNS topics.
     * </p>
     * <p>
     * If you use an Amazon SNS topic that is encrypted by an Amazon Web Services Key Management Service
     * customer-managed key (CMK), then you must add permissions to the CMK. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html">Permissions for Amazon
     * Web Services KMS–encrypted Amazon SNS topics</a>.
     * </p>
     * 
     * @param sns
     *        Information about a notification channel configured in DevOps Guru to send notifications when insights are
     *        created. </p>
     *        <p>
     *        If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     *        permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications
     *        using Amazon SNS in your account. DevOps Guru only supports standard SNS topics. For more information, see
     *        <a href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html">
     *        Permissions for cross account Amazon SNS topics</a>.
     *        </p>
     *        <p>
     *        If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     *        permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications
     *        using Amazon SNS in your account. For more information, see Permissions for cross account Amazon SNS
     *        topics.
     *        </p>
     *        <p>
     *        If you use an Amazon SNS topic that is encrypted by an Amazon Web Services Key Management Service
     *        customer-managed key (CMK), then you must add permissions to the CMK. For more information, see <a
     *        href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html">Permissions for
     *        Amazon Web Services KMS–encrypted Amazon SNS topics</a>.
     */

    public void setSns(SnsChannelConfig sns) {
        this.sns = sns;
    }

    /**
     * <p>
     * Information about a notification channel configured in DevOps Guru to send notifications when insights are
     * created.
     * </p>
     * <p>
     * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     * permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using
     * Amazon SNS in your account. DevOps Guru only supports standard SNS topics. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html">Permissions for
     * cross account Amazon SNS topics</a>.
     * </p>
     * <p>
     * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     * permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using
     * Amazon SNS in your account. For more information, see Permissions for cross account Amazon SNS topics.
     * </p>
     * <p>
     * If you use an Amazon SNS topic that is encrypted by an Amazon Web Services Key Management Service
     * customer-managed key (CMK), then you must add permissions to the CMK. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html">Permissions for Amazon
     * Web Services KMS–encrypted Amazon SNS topics</a>.
     * </p>
     * 
     * @return Information about a notification channel configured in DevOps Guru to send notifications when insights
     *         are created. </p>
     *         <p>
     *         If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     *         permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications
     *         using Amazon SNS in your account. DevOps Guru only supports standard SNS topics. For more information,
     *         see <a href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html">
     *         Permissions for cross account Amazon SNS topics</a>.
     *         </p>
     *         <p>
     *         If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     *         permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications
     *         using Amazon SNS in your account. For more information, see Permissions for cross account Amazon SNS
     *         topics.
     *         </p>
     *         <p>
     *         If you use an Amazon SNS topic that is encrypted by an Amazon Web Services Key Management Service
     *         customer-managed key (CMK), then you must add permissions to the CMK. For more information, see <a
     *         href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html">Permissions for
     *         Amazon Web Services KMS–encrypted Amazon SNS topics</a>.
     */

    public SnsChannelConfig getSns() {
        return this.sns;
    }

    /**
     * <p>
     * Information about a notification channel configured in DevOps Guru to send notifications when insights are
     * created.
     * </p>
     * <p>
     * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     * permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using
     * Amazon SNS in your account. DevOps Guru only supports standard SNS topics. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html">Permissions for
     * cross account Amazon SNS topics</a>.
     * </p>
     * <p>
     * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     * permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using
     * Amazon SNS in your account. For more information, see Permissions for cross account Amazon SNS topics.
     * </p>
     * <p>
     * If you use an Amazon SNS topic that is encrypted by an Amazon Web Services Key Management Service
     * customer-managed key (CMK), then you must add permissions to the CMK. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html">Permissions for Amazon
     * Web Services KMS–encrypted Amazon SNS topics</a>.
     * </p>
     * 
     * @param sns
     *        Information about a notification channel configured in DevOps Guru to send notifications when insights are
     *        created. </p>
     *        <p>
     *        If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     *        permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications
     *        using Amazon SNS in your account. DevOps Guru only supports standard SNS topics. For more information, see
     *        <a href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html">
     *        Permissions for cross account Amazon SNS topics</a>.
     *        </p>
     *        <p>
     *        If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     *        permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications
     *        using Amazon SNS in your account. For more information, see Permissions for cross account Amazon SNS
     *        topics.
     *        </p>
     *        <p>
     *        If you use an Amazon SNS topic that is encrypted by an Amazon Web Services Key Management Service
     *        customer-managed key (CMK), then you must add permissions to the CMK. For more information, see <a
     *        href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html">Permissions for
     *        Amazon Web Services KMS–encrypted Amazon SNS topics</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationChannelConfig withSns(SnsChannelConfig sns) {
        setSns(sns);
        return this;
    }

    /**
     * <p>
     * The filter configurations for the Amazon SNS notification topic you use with DevOps Guru. If you do not provide
     * filter configurations, the default configurations are to receive notifications for all message types of
     * <code>High</code> or <code>Medium</code> severity.
     * </p>
     * 
     * @param filters
     *        The filter configurations for the Amazon SNS notification topic you use with DevOps Guru. If you do not
     *        provide filter configurations, the default configurations are to receive notifications for all message
     *        types of <code>High</code> or <code>Medium</code> severity.
     */

    public void setFilters(NotificationFilterConfig filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * The filter configurations for the Amazon SNS notification topic you use with DevOps Guru. If you do not provide
     * filter configurations, the default configurations are to receive notifications for all message types of
     * <code>High</code> or <code>Medium</code> severity.
     * </p>
     * 
     * @return The filter configurations for the Amazon SNS notification topic you use with DevOps Guru. If you do not
     *         provide filter configurations, the default configurations are to receive notifications for all message
     *         types of <code>High</code> or <code>Medium</code> severity.
     */

    public NotificationFilterConfig getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * The filter configurations for the Amazon SNS notification topic you use with DevOps Guru. If you do not provide
     * filter configurations, the default configurations are to receive notifications for all message types of
     * <code>High</code> or <code>Medium</code> severity.
     * </p>
     * 
     * @param filters
     *        The filter configurations for the Amazon SNS notification topic you use with DevOps Guru. If you do not
     *        provide filter configurations, the default configurations are to receive notifications for all message
     *        types of <code>High</code> or <code>Medium</code> severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationChannelConfig withFilters(NotificationFilterConfig filters) {
        setFilters(filters);
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
        if (getSns() != null)
            sb.append("Sns: ").append(getSns()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationChannelConfig == false)
            return false;
        NotificationChannelConfig other = (NotificationChannelConfig) obj;
        if (other.getSns() == null ^ this.getSns() == null)
            return false;
        if (other.getSns() != null && other.getSns().equals(this.getSns()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSns() == null) ? 0 : getSns().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public NotificationChannelConfig clone() {
        try {
            return (NotificationChannelConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.NotificationChannelConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
