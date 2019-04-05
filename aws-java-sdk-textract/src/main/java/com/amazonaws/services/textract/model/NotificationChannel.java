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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Simple Notification Service (Amazon SNS) topic to which Amazon Textract publishes the completion status of
 * an asynchronous document operation, such as <a>StartDocumentTextDetection</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/NotificationChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationChannel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon SNS topic that Amazon Textract posts the completion status to.
     * </p>
     */
    private String sNSTopicArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that gives Amazon Textract publishing permissions to the Amazon SNS
     * topic.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The Amazon SNS topic that Amazon Textract posts the completion status to.
     * </p>
     * 
     * @param sNSTopicArn
     *        The Amazon SNS topic that Amazon Textract posts the completion status to.
     */

    public void setSNSTopicArn(String sNSTopicArn) {
        this.sNSTopicArn = sNSTopicArn;
    }

    /**
     * <p>
     * The Amazon SNS topic that Amazon Textract posts the completion status to.
     * </p>
     * 
     * @return The Amazon SNS topic that Amazon Textract posts the completion status to.
     */

    public String getSNSTopicArn() {
        return this.sNSTopicArn;
    }

    /**
     * <p>
     * The Amazon SNS topic that Amazon Textract posts the completion status to.
     * </p>
     * 
     * @param sNSTopicArn
     *        The Amazon SNS topic that Amazon Textract posts the completion status to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationChannel withSNSTopicArn(String sNSTopicArn) {
        setSNSTopicArn(sNSTopicArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that gives Amazon Textract publishing permissions to the Amazon SNS
     * topic.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that gives Amazon Textract publishing permissions to the
     *        Amazon SNS topic.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that gives Amazon Textract publishing permissions to the Amazon SNS
     * topic.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that gives Amazon Textract publishing permissions to the
     *         Amazon SNS topic.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that gives Amazon Textract publishing permissions to the Amazon SNS
     * topic.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that gives Amazon Textract publishing permissions to the
     *        Amazon SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationChannel withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getSNSTopicArn() != null)
            sb.append("SNSTopicArn: ").append(getSNSTopicArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationChannel == false)
            return false;
        NotificationChannel other = (NotificationChannel) obj;
        if (other.getSNSTopicArn() == null ^ this.getSNSTopicArn() == null)
            return false;
        if (other.getSNSTopicArn() != null && other.getSNSTopicArn().equals(this.getSNSTopicArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSNSTopicArn() == null) ? 0 : getSNSTopicArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public NotificationChannel clone() {
        try {
            return (NotificationChannel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.NotificationChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
