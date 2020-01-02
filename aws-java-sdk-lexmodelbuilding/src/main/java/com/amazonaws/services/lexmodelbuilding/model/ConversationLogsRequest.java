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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the settings needed for conversation logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/ConversationLogsRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConversationLogsRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The settings for your conversation logs. You can log the conversation text, conversation audio, or both.
     * </p>
     */
    private java.util.List<LogSettingsRequest> logSettings;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to write to your CloudWatch Logs for text logs and
     * your S3 bucket for audio logs. If audio encryption is enabled, this role also provides access permission for the
     * AWS KMS key used for encrypting audio logs. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/conversation-logs-role-and-policy.html">Creating an IAM Role and
     * Policy for Conversation Logs</a>.
     * </p>
     */
    private String iamRoleArn;

    /**
     * <p>
     * The settings for your conversation logs. You can log the conversation text, conversation audio, or both.
     * </p>
     * 
     * @return The settings for your conversation logs. You can log the conversation text, conversation audio, or both.
     */

    public java.util.List<LogSettingsRequest> getLogSettings() {
        return logSettings;
    }

    /**
     * <p>
     * The settings for your conversation logs. You can log the conversation text, conversation audio, or both.
     * </p>
     * 
     * @param logSettings
     *        The settings for your conversation logs. You can log the conversation text, conversation audio, or both.
     */

    public void setLogSettings(java.util.Collection<LogSettingsRequest> logSettings) {
        if (logSettings == null) {
            this.logSettings = null;
            return;
        }

        this.logSettings = new java.util.ArrayList<LogSettingsRequest>(logSettings);
    }

    /**
     * <p>
     * The settings for your conversation logs. You can log the conversation text, conversation audio, or both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogSettings(java.util.Collection)} or {@link #withLogSettings(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param logSettings
     *        The settings for your conversation logs. You can log the conversation text, conversation audio, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLogsRequest withLogSettings(LogSettingsRequest... logSettings) {
        if (this.logSettings == null) {
            setLogSettings(new java.util.ArrayList<LogSettingsRequest>(logSettings.length));
        }
        for (LogSettingsRequest ele : logSettings) {
            this.logSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The settings for your conversation logs. You can log the conversation text, conversation audio, or both.
     * </p>
     * 
     * @param logSettings
     *        The settings for your conversation logs. You can log the conversation text, conversation audio, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLogsRequest withLogSettings(java.util.Collection<LogSettingsRequest> logSettings) {
        setLogSettings(logSettings);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to write to your CloudWatch Logs for text logs and
     * your S3 bucket for audio logs. If audio encryption is enabled, this role also provides access permission for the
     * AWS KMS key used for encrypting audio logs. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/conversation-logs-role-and-policy.html">Creating an IAM Role and
     * Policy for Conversation Logs</a>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role with permission to write to your CloudWatch Logs for text
     *        logs and your S3 bucket for audio logs. If audio encryption is enabled, this role also provides access
     *        permission for the AWS KMS key used for encrypting audio logs. For more information, see <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/conversation-logs-role-and-policy.html">Creating an IAM
     *        Role and Policy for Conversation Logs</a>.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to write to your CloudWatch Logs for text logs and
     * your S3 bucket for audio logs. If audio encryption is enabled, this role also provides access permission for the
     * AWS KMS key used for encrypting audio logs. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/conversation-logs-role-and-policy.html">Creating an IAM Role and
     * Policy for Conversation Logs</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role with permission to write to your CloudWatch Logs for text
     *         logs and your S3 bucket for audio logs. If audio encryption is enabled, this role also provides access
     *         permission for the AWS KMS key used for encrypting audio logs. For more information, see <a
     *         href="https://docs.aws.amazon.com/lex/latest/dg/conversation-logs-role-and-policy.html">Creating an IAM
     *         Role and Policy for Conversation Logs</a>.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to write to your CloudWatch Logs for text logs and
     * your S3 bucket for audio logs. If audio encryption is enabled, this role also provides access permission for the
     * AWS KMS key used for encrypting audio logs. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/conversation-logs-role-and-policy.html">Creating an IAM Role and
     * Policy for Conversation Logs</a>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role with permission to write to your CloudWatch Logs for text
     *        logs and your S3 bucket for audio logs. If audio encryption is enabled, this role also provides access
     *        permission for the AWS KMS key used for encrypting audio logs. For more information, see <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/conversation-logs-role-and-policy.html">Creating an IAM
     *        Role and Policy for Conversation Logs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLogsRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
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
        if (getLogSettings() != null)
            sb.append("LogSettings: ").append(getLogSettings()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConversationLogsRequest == false)
            return false;
        ConversationLogsRequest other = (ConversationLogsRequest) obj;
        if (other.getLogSettings() == null ^ this.getLogSettings() == null)
            return false;
        if (other.getLogSettings() != null && other.getLogSettings().equals(this.getLogSettings()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogSettings() == null) ? 0 : getLogSettings().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public ConversationLogsRequest clone() {
        try {
            return (ConversationLogsRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.ConversationLogsRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
