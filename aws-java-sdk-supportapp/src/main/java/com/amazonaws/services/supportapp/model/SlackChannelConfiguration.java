/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.supportapp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for a Slack channel that you added for your Amazon Web Services account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/SlackChannelConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlackChannelConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The channel ID in Slack. This ID identifies a channel within a Slack workspace.
     * </p>
     */
    private String channelId;
    /**
     * <p>
     * The name of the Slack channel that you configured with the Amazon Web Services Support App for your Amazon Web
     * Services account.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that you want to use to perform operations on Amazon Web Services.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/awssupport/latest/user/support-app-permissions.html">Managing access to the
     * Amazon Web Services Support App</a> in the <i>Amazon Web Services Support User Guide</i>.
     * </p>
     */
    private String channelRoleArn;
    /**
     * <p>
     * Whether you want to get notified when a support case has a new correspondence.
     * </p>
     */
    private Boolean notifyOnAddCorrespondenceToCase;
    /**
     * <p>
     * The case severity for a support case that you want to receive notifications.
     * </p>
     */
    private String notifyOnCaseSeverity;
    /**
     * <p>
     * Whether you want to get notified when a support case is created or reopened.
     * </p>
     */
    private Boolean notifyOnCreateOrReopenCase;
    /**
     * <p>
     * Whether you want to get notified when a support case is resolved.
     * </p>
     */
    private Boolean notifyOnResolveCase;
    /**
     * <p>
     * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     * </p>
     */
    private String teamId;

    /**
     * <p>
     * The channel ID in Slack. This ID identifies a channel within a Slack workspace.
     * </p>
     * 
     * @param channelId
     *        The channel ID in Slack. This ID identifies a channel within a Slack workspace.
     */

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * <p>
     * The channel ID in Slack. This ID identifies a channel within a Slack workspace.
     * </p>
     * 
     * @return The channel ID in Slack. This ID identifies a channel within a Slack workspace.
     */

    public String getChannelId() {
        return this.channelId;
    }

    /**
     * <p>
     * The channel ID in Slack. This ID identifies a channel within a Slack workspace.
     * </p>
     * 
     * @param channelId
     *        The channel ID in Slack. This ID identifies a channel within a Slack workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackChannelConfiguration withChannelId(String channelId) {
        setChannelId(channelId);
        return this;
    }

    /**
     * <p>
     * The name of the Slack channel that you configured with the Amazon Web Services Support App for your Amazon Web
     * Services account.
     * </p>
     * 
     * @param channelName
     *        The name of the Slack channel that you configured with the Amazon Web Services Support App for your Amazon
     *        Web Services account.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the Slack channel that you configured with the Amazon Web Services Support App for your Amazon Web
     * Services account.
     * </p>
     * 
     * @return The name of the Slack channel that you configured with the Amazon Web Services Support App for your
     *         Amazon Web Services account.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name of the Slack channel that you configured with the Amazon Web Services Support App for your Amazon Web
     * Services account.
     * </p>
     * 
     * @param channelName
     *        The name of the Slack channel that you configured with the Amazon Web Services Support App for your Amazon
     *        Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackChannelConfiguration withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that you want to use to perform operations on Amazon Web Services.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/awssupport/latest/user/support-app-permissions.html">Managing access to the
     * Amazon Web Services Support App</a> in the <i>Amazon Web Services Support User Guide</i>.
     * </p>
     * 
     * @param channelRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role that you want to use to perform operations on Amazon Web
     *        Services. For more information, see <a
     *        href="https://docs.aws.amazon.com/awssupport/latest/user/support-app-permissions.html">Managing access to
     *        the Amazon Web Services Support App</a> in the <i>Amazon Web Services Support User Guide</i>.
     */

    public void setChannelRoleArn(String channelRoleArn) {
        this.channelRoleArn = channelRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that you want to use to perform operations on Amazon Web Services.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/awssupport/latest/user/support-app-permissions.html">Managing access to the
     * Amazon Web Services Support App</a> in the <i>Amazon Web Services Support User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that you want to use to perform operations on Amazon Web
     *         Services. For more information, see <a
     *         href="https://docs.aws.amazon.com/awssupport/latest/user/support-app-permissions.html">Managing access to
     *         the Amazon Web Services Support App</a> in the <i>Amazon Web Services Support User Guide</i>.
     */

    public String getChannelRoleArn() {
        return this.channelRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that you want to use to perform operations on Amazon Web Services.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/awssupport/latest/user/support-app-permissions.html">Managing access to the
     * Amazon Web Services Support App</a> in the <i>Amazon Web Services Support User Guide</i>.
     * </p>
     * 
     * @param channelRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role that you want to use to perform operations on Amazon Web
     *        Services. For more information, see <a
     *        href="https://docs.aws.amazon.com/awssupport/latest/user/support-app-permissions.html">Managing access to
     *        the Amazon Web Services Support App</a> in the <i>Amazon Web Services Support User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackChannelConfiguration withChannelRoleArn(String channelRoleArn) {
        setChannelRoleArn(channelRoleArn);
        return this;
    }

    /**
     * <p>
     * Whether you want to get notified when a support case has a new correspondence.
     * </p>
     * 
     * @param notifyOnAddCorrespondenceToCase
     *        Whether you want to get notified when a support case has a new correspondence.
     */

    public void setNotifyOnAddCorrespondenceToCase(Boolean notifyOnAddCorrespondenceToCase) {
        this.notifyOnAddCorrespondenceToCase = notifyOnAddCorrespondenceToCase;
    }

    /**
     * <p>
     * Whether you want to get notified when a support case has a new correspondence.
     * </p>
     * 
     * @return Whether you want to get notified when a support case has a new correspondence.
     */

    public Boolean getNotifyOnAddCorrespondenceToCase() {
        return this.notifyOnAddCorrespondenceToCase;
    }

    /**
     * <p>
     * Whether you want to get notified when a support case has a new correspondence.
     * </p>
     * 
     * @param notifyOnAddCorrespondenceToCase
     *        Whether you want to get notified when a support case has a new correspondence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackChannelConfiguration withNotifyOnAddCorrespondenceToCase(Boolean notifyOnAddCorrespondenceToCase) {
        setNotifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase);
        return this;
    }

    /**
     * <p>
     * Whether you want to get notified when a support case has a new correspondence.
     * </p>
     * 
     * @return Whether you want to get notified when a support case has a new correspondence.
     */

    public Boolean isNotifyOnAddCorrespondenceToCase() {
        return this.notifyOnAddCorrespondenceToCase;
    }

    /**
     * <p>
     * The case severity for a support case that you want to receive notifications.
     * </p>
     * 
     * @param notifyOnCaseSeverity
     *        The case severity for a support case that you want to receive notifications.
     * @see NotificationSeverityLevel
     */

    public void setNotifyOnCaseSeverity(String notifyOnCaseSeverity) {
        this.notifyOnCaseSeverity = notifyOnCaseSeverity;
    }

    /**
     * <p>
     * The case severity for a support case that you want to receive notifications.
     * </p>
     * 
     * @return The case severity for a support case that you want to receive notifications.
     * @see NotificationSeverityLevel
     */

    public String getNotifyOnCaseSeverity() {
        return this.notifyOnCaseSeverity;
    }

    /**
     * <p>
     * The case severity for a support case that you want to receive notifications.
     * </p>
     * 
     * @param notifyOnCaseSeverity
     *        The case severity for a support case that you want to receive notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationSeverityLevel
     */

    public SlackChannelConfiguration withNotifyOnCaseSeverity(String notifyOnCaseSeverity) {
        setNotifyOnCaseSeverity(notifyOnCaseSeverity);
        return this;
    }

    /**
     * <p>
     * The case severity for a support case that you want to receive notifications.
     * </p>
     * 
     * @param notifyOnCaseSeverity
     *        The case severity for a support case that you want to receive notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationSeverityLevel
     */

    public SlackChannelConfiguration withNotifyOnCaseSeverity(NotificationSeverityLevel notifyOnCaseSeverity) {
        this.notifyOnCaseSeverity = notifyOnCaseSeverity.toString();
        return this;
    }

    /**
     * <p>
     * Whether you want to get notified when a support case is created or reopened.
     * </p>
     * 
     * @param notifyOnCreateOrReopenCase
     *        Whether you want to get notified when a support case is created or reopened.
     */

    public void setNotifyOnCreateOrReopenCase(Boolean notifyOnCreateOrReopenCase) {
        this.notifyOnCreateOrReopenCase = notifyOnCreateOrReopenCase;
    }

    /**
     * <p>
     * Whether you want to get notified when a support case is created or reopened.
     * </p>
     * 
     * @return Whether you want to get notified when a support case is created or reopened.
     */

    public Boolean getNotifyOnCreateOrReopenCase() {
        return this.notifyOnCreateOrReopenCase;
    }

    /**
     * <p>
     * Whether you want to get notified when a support case is created or reopened.
     * </p>
     * 
     * @param notifyOnCreateOrReopenCase
     *        Whether you want to get notified when a support case is created or reopened.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackChannelConfiguration withNotifyOnCreateOrReopenCase(Boolean notifyOnCreateOrReopenCase) {
        setNotifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase);
        return this;
    }

    /**
     * <p>
     * Whether you want to get notified when a support case is created or reopened.
     * </p>
     * 
     * @return Whether you want to get notified when a support case is created or reopened.
     */

    public Boolean isNotifyOnCreateOrReopenCase() {
        return this.notifyOnCreateOrReopenCase;
    }

    /**
     * <p>
     * Whether you want to get notified when a support case is resolved.
     * </p>
     * 
     * @param notifyOnResolveCase
     *        Whether you want to get notified when a support case is resolved.
     */

    public void setNotifyOnResolveCase(Boolean notifyOnResolveCase) {
        this.notifyOnResolveCase = notifyOnResolveCase;
    }

    /**
     * <p>
     * Whether you want to get notified when a support case is resolved.
     * </p>
     * 
     * @return Whether you want to get notified when a support case is resolved.
     */

    public Boolean getNotifyOnResolveCase() {
        return this.notifyOnResolveCase;
    }

    /**
     * <p>
     * Whether you want to get notified when a support case is resolved.
     * </p>
     * 
     * @param notifyOnResolveCase
     *        Whether you want to get notified when a support case is resolved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackChannelConfiguration withNotifyOnResolveCase(Boolean notifyOnResolveCase) {
        setNotifyOnResolveCase(notifyOnResolveCase);
        return this;
    }

    /**
     * <p>
     * Whether you want to get notified when a support case is resolved.
     * </p>
     * 
     * @return Whether you want to get notified when a support case is resolved.
     */

    public Boolean isNotifyOnResolveCase() {
        return this.notifyOnResolveCase;
    }

    /**
     * <p>
     * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     * </p>
     * 
     * @param teamId
     *        The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     */

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * <p>
     * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     * </p>
     * 
     * @return The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     */

    public String getTeamId() {
        return this.teamId;
    }

    /**
     * <p>
     * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     * </p>
     * 
     * @param teamId
     *        The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackChannelConfiguration withTeamId(String teamId) {
        setTeamId(teamId);
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
        if (getChannelId() != null)
            sb.append("ChannelId: ").append(getChannelId()).append(",");
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getChannelRoleArn() != null)
            sb.append("ChannelRoleArn: ").append(getChannelRoleArn()).append(",");
        if (getNotifyOnAddCorrespondenceToCase() != null)
            sb.append("NotifyOnAddCorrespondenceToCase: ").append(getNotifyOnAddCorrespondenceToCase()).append(",");
        if (getNotifyOnCaseSeverity() != null)
            sb.append("NotifyOnCaseSeverity: ").append(getNotifyOnCaseSeverity()).append(",");
        if (getNotifyOnCreateOrReopenCase() != null)
            sb.append("NotifyOnCreateOrReopenCase: ").append(getNotifyOnCreateOrReopenCase()).append(",");
        if (getNotifyOnResolveCase() != null)
            sb.append("NotifyOnResolveCase: ").append(getNotifyOnResolveCase()).append(",");
        if (getTeamId() != null)
            sb.append("TeamId: ").append(getTeamId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlackChannelConfiguration == false)
            return false;
        SlackChannelConfiguration other = (SlackChannelConfiguration) obj;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getChannelRoleArn() == null ^ this.getChannelRoleArn() == null)
            return false;
        if (other.getChannelRoleArn() != null && other.getChannelRoleArn().equals(this.getChannelRoleArn()) == false)
            return false;
        if (other.getNotifyOnAddCorrespondenceToCase() == null ^ this.getNotifyOnAddCorrespondenceToCase() == null)
            return false;
        if (other.getNotifyOnAddCorrespondenceToCase() != null
                && other.getNotifyOnAddCorrespondenceToCase().equals(this.getNotifyOnAddCorrespondenceToCase()) == false)
            return false;
        if (other.getNotifyOnCaseSeverity() == null ^ this.getNotifyOnCaseSeverity() == null)
            return false;
        if (other.getNotifyOnCaseSeverity() != null && other.getNotifyOnCaseSeverity().equals(this.getNotifyOnCaseSeverity()) == false)
            return false;
        if (other.getNotifyOnCreateOrReopenCase() == null ^ this.getNotifyOnCreateOrReopenCase() == null)
            return false;
        if (other.getNotifyOnCreateOrReopenCase() != null && other.getNotifyOnCreateOrReopenCase().equals(this.getNotifyOnCreateOrReopenCase()) == false)
            return false;
        if (other.getNotifyOnResolveCase() == null ^ this.getNotifyOnResolveCase() == null)
            return false;
        if (other.getNotifyOnResolveCase() != null && other.getNotifyOnResolveCase().equals(this.getNotifyOnResolveCase()) == false)
            return false;
        if (other.getTeamId() == null ^ this.getTeamId() == null)
            return false;
        if (other.getTeamId() != null && other.getTeamId().equals(this.getTeamId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getChannelRoleArn() == null) ? 0 : getChannelRoleArn().hashCode());
        hashCode = prime * hashCode + ((getNotifyOnAddCorrespondenceToCase() == null) ? 0 : getNotifyOnAddCorrespondenceToCase().hashCode());
        hashCode = prime * hashCode + ((getNotifyOnCaseSeverity() == null) ? 0 : getNotifyOnCaseSeverity().hashCode());
        hashCode = prime * hashCode + ((getNotifyOnCreateOrReopenCase() == null) ? 0 : getNotifyOnCreateOrReopenCase().hashCode());
        hashCode = prime * hashCode + ((getNotifyOnResolveCase() == null) ? 0 : getNotifyOnResolveCase().hashCode());
        hashCode = prime * hashCode + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        return hashCode;
    }

    @Override
    public SlackChannelConfiguration clone() {
        try {
            return (SlackChannelConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.supportapp.model.transform.SlackChannelConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
