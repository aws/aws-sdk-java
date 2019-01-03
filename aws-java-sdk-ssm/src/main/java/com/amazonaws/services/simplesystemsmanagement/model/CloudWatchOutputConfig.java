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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration options for sending command output to CloudWatch Logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CloudWatchOutputConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchOutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the CloudWatch log group where you want to send command output. If you don't specify a group name,
     * Systems Manager automatically creates a log group for you. The log group uses the following naming format:
     * aws/ssm/<i>SystemsManagerDocumentName</i>.
     * </p>
     */
    private String cloudWatchLogGroupName;
    /**
     * <p>
     * Enables Systems Manager to send command output to CloudWatch Logs.
     * </p>
     */
    private Boolean cloudWatchOutputEnabled;

    /**
     * <p>
     * The name of the CloudWatch log group where you want to send command output. If you don't specify a group name,
     * Systems Manager automatically creates a log group for you. The log group uses the following naming format:
     * aws/ssm/<i>SystemsManagerDocumentName</i>.
     * </p>
     * 
     * @param cloudWatchLogGroupName
     *        The name of the CloudWatch log group where you want to send command output. If you don't specify a group
     *        name, Systems Manager automatically creates a log group for you. The log group uses the following naming
     *        format: aws/ssm/<i>SystemsManagerDocumentName</i>.
     */

    public void setCloudWatchLogGroupName(String cloudWatchLogGroupName) {
        this.cloudWatchLogGroupName = cloudWatchLogGroupName;
    }

    /**
     * <p>
     * The name of the CloudWatch log group where you want to send command output. If you don't specify a group name,
     * Systems Manager automatically creates a log group for you. The log group uses the following naming format:
     * aws/ssm/<i>SystemsManagerDocumentName</i>.
     * </p>
     * 
     * @return The name of the CloudWatch log group where you want to send command output. If you don't specify a group
     *         name, Systems Manager automatically creates a log group for you. The log group uses the following naming
     *         format: aws/ssm/<i>SystemsManagerDocumentName</i>.
     */

    public String getCloudWatchLogGroupName() {
        return this.cloudWatchLogGroupName;
    }

    /**
     * <p>
     * The name of the CloudWatch log group where you want to send command output. If you don't specify a group name,
     * Systems Manager automatically creates a log group for you. The log group uses the following naming format:
     * aws/ssm/<i>SystemsManagerDocumentName</i>.
     * </p>
     * 
     * @param cloudWatchLogGroupName
     *        The name of the CloudWatch log group where you want to send command output. If you don't specify a group
     *        name, Systems Manager automatically creates a log group for you. The log group uses the following naming
     *        format: aws/ssm/<i>SystemsManagerDocumentName</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchOutputConfig withCloudWatchLogGroupName(String cloudWatchLogGroupName) {
        setCloudWatchLogGroupName(cloudWatchLogGroupName);
        return this;
    }

    /**
     * <p>
     * Enables Systems Manager to send command output to CloudWatch Logs.
     * </p>
     * 
     * @param cloudWatchOutputEnabled
     *        Enables Systems Manager to send command output to CloudWatch Logs.
     */

    public void setCloudWatchOutputEnabled(Boolean cloudWatchOutputEnabled) {
        this.cloudWatchOutputEnabled = cloudWatchOutputEnabled;
    }

    /**
     * <p>
     * Enables Systems Manager to send command output to CloudWatch Logs.
     * </p>
     * 
     * @return Enables Systems Manager to send command output to CloudWatch Logs.
     */

    public Boolean getCloudWatchOutputEnabled() {
        return this.cloudWatchOutputEnabled;
    }

    /**
     * <p>
     * Enables Systems Manager to send command output to CloudWatch Logs.
     * </p>
     * 
     * @param cloudWatchOutputEnabled
     *        Enables Systems Manager to send command output to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchOutputConfig withCloudWatchOutputEnabled(Boolean cloudWatchOutputEnabled) {
        setCloudWatchOutputEnabled(cloudWatchOutputEnabled);
        return this;
    }

    /**
     * <p>
     * Enables Systems Manager to send command output to CloudWatch Logs.
     * </p>
     * 
     * @return Enables Systems Manager to send command output to CloudWatch Logs.
     */

    public Boolean isCloudWatchOutputEnabled() {
        return this.cloudWatchOutputEnabled;
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
        if (getCloudWatchLogGroupName() != null)
            sb.append("CloudWatchLogGroupName: ").append(getCloudWatchLogGroupName()).append(",");
        if (getCloudWatchOutputEnabled() != null)
            sb.append("CloudWatchOutputEnabled: ").append(getCloudWatchOutputEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchOutputConfig == false)
            return false;
        CloudWatchOutputConfig other = (CloudWatchOutputConfig) obj;
        if (other.getCloudWatchLogGroupName() == null ^ this.getCloudWatchLogGroupName() == null)
            return false;
        if (other.getCloudWatchLogGroupName() != null && other.getCloudWatchLogGroupName().equals(this.getCloudWatchLogGroupName()) == false)
            return false;
        if (other.getCloudWatchOutputEnabled() == null ^ this.getCloudWatchOutputEnabled() == null)
            return false;
        if (other.getCloudWatchOutputEnabled() != null && other.getCloudWatchOutputEnabled().equals(this.getCloudWatchOutputEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogGroupName() == null) ? 0 : getCloudWatchLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchOutputEnabled() == null) ? 0 : getCloudWatchOutputEnabled().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchOutputConfig clone() {
        try {
            return (CloudWatchOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.CloudWatchOutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
