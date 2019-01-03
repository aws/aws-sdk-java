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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Description of the CloudWatch logging option.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/CloudWatchLoggingOptionDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLoggingOptionDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ID of the CloudWatch logging option description.
     * </p>
     */
    private String cloudWatchLoggingOptionId;
    /**
     * <p>
     * ARN of the CloudWatch log to receive application messages.
     * </p>
     */
    private String logStreamARN;
    /**
     * <p>
     * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the
     * IAM role used must have the <code>PutLogEvents</code> policy action enabled.
     * </p>
     */
    private String roleARN;

    /**
     * <p>
     * ID of the CloudWatch logging option description.
     * </p>
     * 
     * @param cloudWatchLoggingOptionId
     *        ID of the CloudWatch logging option description.
     */

    public void setCloudWatchLoggingOptionId(String cloudWatchLoggingOptionId) {
        this.cloudWatchLoggingOptionId = cloudWatchLoggingOptionId;
    }

    /**
     * <p>
     * ID of the CloudWatch logging option description.
     * </p>
     * 
     * @return ID of the CloudWatch logging option description.
     */

    public String getCloudWatchLoggingOptionId() {
        return this.cloudWatchLoggingOptionId;
    }

    /**
     * <p>
     * ID of the CloudWatch logging option description.
     * </p>
     * 
     * @param cloudWatchLoggingOptionId
     *        ID of the CloudWatch logging option description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingOptionDescription withCloudWatchLoggingOptionId(String cloudWatchLoggingOptionId) {
        setCloudWatchLoggingOptionId(cloudWatchLoggingOptionId);
        return this;
    }

    /**
     * <p>
     * ARN of the CloudWatch log to receive application messages.
     * </p>
     * 
     * @param logStreamARN
     *        ARN of the CloudWatch log to receive application messages.
     */

    public void setLogStreamARN(String logStreamARN) {
        this.logStreamARN = logStreamARN;
    }

    /**
     * <p>
     * ARN of the CloudWatch log to receive application messages.
     * </p>
     * 
     * @return ARN of the CloudWatch log to receive application messages.
     */

    public String getLogStreamARN() {
        return this.logStreamARN;
    }

    /**
     * <p>
     * ARN of the CloudWatch log to receive application messages.
     * </p>
     * 
     * @param logStreamARN
     *        ARN of the CloudWatch log to receive application messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingOptionDescription withLogStreamARN(String logStreamARN) {
        setLogStreamARN(logStreamARN);
        return this;
    }

    /**
     * <p>
     * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the
     * IAM role used must have the <code>PutLogEvents</code> policy action enabled.
     * </p>
     * 
     * @param roleARN
     *        IAM ARN of the role to use to send application messages. Note: To write application messages to
     *        CloudWatch, the IAM role used must have the <code>PutLogEvents</code> policy action enabled.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the
     * IAM role used must have the <code>PutLogEvents</code> policy action enabled.
     * </p>
     * 
     * @return IAM ARN of the role to use to send application messages. Note: To write application messages to
     *         CloudWatch, the IAM role used must have the <code>PutLogEvents</code> policy action enabled.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the
     * IAM role used must have the <code>PutLogEvents</code> policy action enabled.
     * </p>
     * 
     * @param roleARN
     *        IAM ARN of the role to use to send application messages. Note: To write application messages to
     *        CloudWatch, the IAM role used must have the <code>PutLogEvents</code> policy action enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingOptionDescription withRoleARN(String roleARN) {
        setRoleARN(roleARN);
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
        if (getCloudWatchLoggingOptionId() != null)
            sb.append("CloudWatchLoggingOptionId: ").append(getCloudWatchLoggingOptionId()).append(",");
        if (getLogStreamARN() != null)
            sb.append("LogStreamARN: ").append(getLogStreamARN()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLoggingOptionDescription == false)
            return false;
        CloudWatchLoggingOptionDescription other = (CloudWatchLoggingOptionDescription) obj;
        if (other.getCloudWatchLoggingOptionId() == null ^ this.getCloudWatchLoggingOptionId() == null)
            return false;
        if (other.getCloudWatchLoggingOptionId() != null && other.getCloudWatchLoggingOptionId().equals(this.getCloudWatchLoggingOptionId()) == false)
            return false;
        if (other.getLogStreamARN() == null ^ this.getLogStreamARN() == null)
            return false;
        if (other.getLogStreamARN() != null && other.getLogStreamARN().equals(this.getLogStreamARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLoggingOptionId() == null) ? 0 : getCloudWatchLoggingOptionId().hashCode());
        hashCode = prime * hashCode + ((getLogStreamARN() == null) ? 0 : getLogStreamARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchLoggingOptionDescription clone() {
        try {
            return (CloudWatchLoggingOptionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.CloudWatchLoggingOptionDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
