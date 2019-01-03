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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains information about a configuration for DNS query logging.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/QueryLoggingConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryLoggingConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for a configuration for DNS query logging.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the hosted zone that CloudWatch Logs is logging queries for.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that Amazon Route 53 is publishing logs to.
     * </p>
     */
    private String cloudWatchLogsLogGroupArn;

    /**
     * <p>
     * The ID for a configuration for DNS query logging.
     * </p>
     * 
     * @param id
     *        The ID for a configuration for DNS query logging.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for a configuration for DNS query logging.
     * </p>
     * 
     * @return The ID for a configuration for DNS query logging.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for a configuration for DNS query logging.
     * </p>
     * 
     * @param id
     *        The ID for a configuration for DNS query logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryLoggingConfig withId(String id) {
        setId(id);
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

    public QueryLoggingConfig withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that Amazon Route 53 is publishing logs to.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        The Amazon Resource Name (ARN) of the CloudWatch Logs log group that Amazon Route 53 is publishing logs
     *        to.
     */

    public void setCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that Amazon Route 53 is publishing logs to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the CloudWatch Logs log group that Amazon Route 53 is publishing logs
     *         to.
     */

    public String getCloudWatchLogsLogGroupArn() {
        return this.cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that Amazon Route 53 is publishing logs to.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        The Amazon Resource Name (ARN) of the CloudWatch Logs log group that Amazon Route 53 is publishing logs
     *        to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryLoggingConfig withCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        setCloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getCloudWatchLogsLogGroupArn() != null)
            sb.append("CloudWatchLogsLogGroupArn: ").append(getCloudWatchLogsLogGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryLoggingConfig == false)
            return false;
        QueryLoggingConfig other = (QueryLoggingConfig) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() == null ^ this.getCloudWatchLogsLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() != null && other.getCloudWatchLogsLogGroupArn().equals(this.getCloudWatchLogsLogGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogsLogGroupArn() == null) ? 0 : getCloudWatchLogsLogGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public QueryLoggingConfig clone() {
        try {
            return (QueryLoggingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
