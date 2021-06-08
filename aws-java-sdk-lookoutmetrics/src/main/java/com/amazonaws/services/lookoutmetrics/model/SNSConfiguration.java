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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the SNS topic to which you want to send your alerts and the IAM role that has access to
 * that topic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/SNSConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SNSConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the IAM role that has access to the target SNS topic.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The ARN of the target SNS topic.
     * </p>
     */
    private String snsTopicArn;

    /**
     * <p>
     * The ARN of the IAM role that has access to the target SNS topic.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that has access to the target SNS topic.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that has access to the target SNS topic.
     * </p>
     * 
     * @return The ARN of the IAM role that has access to the target SNS topic.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that has access to the target SNS topic.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that has access to the target SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNSConfiguration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the target SNS topic.
     * </p>
     * 
     * @param snsTopicArn
     *        The ARN of the target SNS topic.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The ARN of the target SNS topic.
     * </p>
     * 
     * @return The ARN of the target SNS topic.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The ARN of the target SNS topic.
     * </p>
     * 
     * @param snsTopicArn
     *        The ARN of the target SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNSConfiguration withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SNSConfiguration == false)
            return false;
        SNSConfiguration other = (SNSConfiguration) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        return hashCode;
    }

    @Override
    public SNSConfiguration clone() {
        try {
            return (SNSConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.SNSConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
