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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The log configuration.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElasticsearchDomainLogPublishingOptionsLogConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElasticsearchDomainLogPublishingOptionsLogConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the CloudWatch Logs group to publish the logs to.
     * </p>
     */
    private String cloudWatchLogsLogGroupArn;
    /**
     * <p>
     * Whether the log publishing is enabled.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The ARN of the CloudWatch Logs group to publish the logs to.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        The ARN of the CloudWatch Logs group to publish the logs to.
     */

    public void setCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The ARN of the CloudWatch Logs group to publish the logs to.
     * </p>
     * 
     * @return The ARN of the CloudWatch Logs group to publish the logs to.
     */

    public String getCloudWatchLogsLogGroupArn() {
        return this.cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The ARN of the CloudWatch Logs group to publish the logs to.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        The ARN of the CloudWatch Logs group to publish the logs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainLogPublishingOptionsLogConfig withCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        setCloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn);
        return this;
    }

    /**
     * <p>
     * Whether the log publishing is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether the log publishing is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether the log publishing is enabled.
     * </p>
     * 
     * @return Whether the log publishing is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether the log publishing is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether the log publishing is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainLogPublishingOptionsLogConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether the log publishing is enabled.
     * </p>
     * 
     * @return Whether the log publishing is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getCloudWatchLogsLogGroupArn() != null)
            sb.append("CloudWatchLogsLogGroupArn: ").append(getCloudWatchLogsLogGroupArn()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElasticsearchDomainLogPublishingOptionsLogConfig == false)
            return false;
        AwsElasticsearchDomainLogPublishingOptionsLogConfig other = (AwsElasticsearchDomainLogPublishingOptionsLogConfig) obj;
        if (other.getCloudWatchLogsLogGroupArn() == null ^ this.getCloudWatchLogsLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() != null && other.getCloudWatchLogsLogGroupArn().equals(this.getCloudWatchLogsLogGroupArn()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogsLogGroupArn() == null) ? 0 : getCloudWatchLogsLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public AwsElasticsearchDomainLogPublishingOptionsLogConfig clone() {
        try {
            return (AwsElasticsearchDomainLogPublishingOptionsLogConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElasticsearchDomainLogPublishingOptionsLogConfigMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
