/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The Amazon Resource Name (ARN) and other details of the Amazon CloudWatch Logs log group that Amazon Route 53 is
 * publishing logs to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CloudWatchLogsLogGroupArnConfigDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLogsLogGroupArnConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the CloudWatch Logs log group that Route 53 is publishing logs to.
     * </p>
     */
    private String cloudWatchLogsLogGroupArn;
    /**
     * <p>
     * The ID of the hosted zone that CloudWatch Logs is logging queries for.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * The ID for a DNS query logging configuration.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The ARN of the CloudWatch Logs log group that Route 53 is publishing logs to.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        The ARN of the CloudWatch Logs log group that Route 53 is publishing logs to.
     */

    public void setCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The ARN of the CloudWatch Logs log group that Route 53 is publishing logs to.
     * </p>
     * 
     * @return The ARN of the CloudWatch Logs log group that Route 53 is publishing logs to.
     */

    public String getCloudWatchLogsLogGroupArn() {
        return this.cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The ARN of the CloudWatch Logs log group that Route 53 is publishing logs to.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        The ARN of the CloudWatch Logs log group that Route 53 is publishing logs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsLogGroupArnConfigDetails withCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        setCloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn);
        return this;
    }

    /**
     * <p>
     * The ID of the hosted zone that CloudWatch Logs is logging queries for.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that CloudWatch Logs is logging queries for.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that CloudWatch Logs is logging queries for.
     * </p>
     * 
     * @return The ID of the hosted zone that CloudWatch Logs is logging queries for.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that CloudWatch Logs is logging queries for.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that CloudWatch Logs is logging queries for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsLogGroupArnConfigDetails withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * The ID for a DNS query logging configuration.
     * </p>
     * 
     * @param id
     *        The ID for a DNS query logging configuration.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for a DNS query logging configuration.
     * </p>
     * 
     * @return The ID for a DNS query logging configuration.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for a DNS query logging configuration.
     * </p>
     * 
     * @param id
     *        The ID for a DNS query logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsLogGroupArnConfigDetails withId(String id) {
        setId(id);
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
        if (getCloudWatchLogsLogGroupArn() != null)
            sb.append("CloudWatchLogsLogGroupArn: ").append(getCloudWatchLogsLogGroupArn()).append(",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLogsLogGroupArnConfigDetails == false)
            return false;
        CloudWatchLogsLogGroupArnConfigDetails other = (CloudWatchLogsLogGroupArnConfigDetails) obj;
        if (other.getCloudWatchLogsLogGroupArn() == null ^ this.getCloudWatchLogsLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() != null && other.getCloudWatchLogsLogGroupArn().equals(this.getCloudWatchLogsLogGroupArn()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogsLogGroupArn() == null) ? 0 : getCloudWatchLogsLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchLogsLogGroupArnConfigDetails clone() {
        try {
            return (CloudWatchLogsLogGroupArnConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.CloudWatchLogsLogGroupArnConfigDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
