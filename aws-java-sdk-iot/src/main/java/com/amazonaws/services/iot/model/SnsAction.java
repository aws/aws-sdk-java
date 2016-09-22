/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an action to publish to an Amazon SNS topic.
 * </p>
 */
public class SnsAction implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the SNS topic.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The message format of the message to publish. Optional. Accepted values are "JSON" and "RAW". The default value
     * of the attribute is "RAW". SNS uses this setting to determine if the payload should be parsed and relevant
     * platform-specific bits of the payload should be extracted. To read more about SNS message formats, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"></a> refer to their official documentation.
     * </p>
     */
    private String messageFormat;

    /**
     * <p>
     * The ARN of the SNS topic.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the SNS topic.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic.
     * </p>
     * 
     * @return The ARN of the SNS topic.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnsAction withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * 
     * @return The ARN of the IAM role that grants access.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnsAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The message format of the message to publish. Optional. Accepted values are "JSON" and "RAW". The default value
     * of the attribute is "RAW". SNS uses this setting to determine if the payload should be parsed and relevant
     * platform-specific bits of the payload should be extracted. To read more about SNS message formats, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"></a> refer to their official documentation.
     * </p>
     * 
     * @param messageFormat
     *        The message format of the message to publish. Optional. Accepted values are "JSON" and "RAW". The default
     *        value of the attribute is "RAW". SNS uses this setting to determine if the payload should be parsed and
     *        relevant platform-specific bits of the payload should be extracted. To read more about SNS message
     *        formats, see <a href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"></a> refer to their
     *        official documentation.
     * @see MessageFormat
     */

    public void setMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
    }

    /**
     * <p>
     * The message format of the message to publish. Optional. Accepted values are "JSON" and "RAW". The default value
     * of the attribute is "RAW". SNS uses this setting to determine if the payload should be parsed and relevant
     * platform-specific bits of the payload should be extracted. To read more about SNS message formats, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"></a> refer to their official documentation.
     * </p>
     * 
     * @return The message format of the message to publish. Optional. Accepted values are "JSON" and "RAW". The default
     *         value of the attribute is "RAW". SNS uses this setting to determine if the payload should be parsed and
     *         relevant platform-specific bits of the payload should be extracted. To read more about SNS message
     *         formats, see <a href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"></a> refer to their
     *         official documentation.
     * @see MessageFormat
     */

    public String getMessageFormat() {
        return this.messageFormat;
    }

    /**
     * <p>
     * The message format of the message to publish. Optional. Accepted values are "JSON" and "RAW". The default value
     * of the attribute is "RAW". SNS uses this setting to determine if the payload should be parsed and relevant
     * platform-specific bits of the payload should be extracted. To read more about SNS message formats, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"></a> refer to their official documentation.
     * </p>
     * 
     * @param messageFormat
     *        The message format of the message to publish. Optional. Accepted values are "JSON" and "RAW". The default
     *        value of the attribute is "RAW". SNS uses this setting to determine if the payload should be parsed and
     *        relevant platform-specific bits of the payload should be extracted. To read more about SNS message
     *        formats, see <a href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"></a> refer to their
     *        official documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageFormat
     */

    public SnsAction withMessageFormat(String messageFormat) {
        setMessageFormat(messageFormat);
        return this;
    }

    /**
     * <p>
     * The message format of the message to publish. Optional. Accepted values are "JSON" and "RAW". The default value
     * of the attribute is "RAW". SNS uses this setting to determine if the payload should be parsed and relevant
     * platform-specific bits of the payload should be extracted. To read more about SNS message formats, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"></a> refer to their official documentation.
     * </p>
     * 
     * @param messageFormat
     *        The message format of the message to publish. Optional. Accepted values are "JSON" and "RAW". The default
     *        value of the attribute is "RAW". SNS uses this setting to determine if the payload should be parsed and
     *        relevant platform-specific bits of the payload should be extracted. To read more about SNS message
     *        formats, see <a href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"></a> refer to their
     *        official documentation.
     * @see MessageFormat
     */

    public void setMessageFormat(MessageFormat messageFormat) {
        this.messageFormat = messageFormat.toString();
    }

    /**
     * <p>
     * The message format of the message to publish. Optional. Accepted values are "JSON" and "RAW". The default value
     * of the attribute is "RAW". SNS uses this setting to determine if the payload should be parsed and relevant
     * platform-specific bits of the payload should be extracted. To read more about SNS message formats, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"></a> refer to their official documentation.
     * </p>
     * 
     * @param messageFormat
     *        The message format of the message to publish. Optional. Accepted values are "JSON" and "RAW". The default
     *        value of the attribute is "RAW". SNS uses this setting to determine if the payload should be parsed and
     *        relevant platform-specific bits of the payload should be extracted. To read more about SNS message
     *        formats, see <a href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"></a> refer to their
     *        official documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageFormat
     */

    public SnsAction withMessageFormat(MessageFormat messageFormat) {
        setMessageFormat(messageFormat);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTargetArn() != null)
            sb.append("TargetArn: " + getTargetArn() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getMessageFormat() != null)
            sb.append("MessageFormat: " + getMessageFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnsAction == false)
            return false;
        SnsAction other = (SnsAction) obj;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getMessageFormat() == null ^ this.getMessageFormat() == null)
            return false;
        if (other.getMessageFormat() != null && other.getMessageFormat().equals(this.getMessageFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getMessageFormat() == null) ? 0 : getMessageFormat().hashCode());
        return hashCode;
    }

    @Override
    public SnsAction clone() {
        try {
            return (SnsAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
