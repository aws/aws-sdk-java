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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon CloudWatch Logs log group where the text and metadata logs are delivered. The log group must exist before
 * you enable logging.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CloudWatchLogGroupLogDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLogGroupLogDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group where text and metadata logs are delivered.
     * </p>
     */
    private String cloudWatchLogGroupArn;
    /**
     * <p>
     * The prefix of the log stream name within the log group that you specified
     * </p>
     */
    private String logPrefix;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group where text and metadata logs are delivered.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Name (ARN) of the log group where text and metadata logs are delivered.
     */

    public void setCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group where text and metadata logs are delivered.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the log group where text and metadata logs are delivered.
     */

    public String getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group where text and metadata logs are delivered.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Name (ARN) of the log group where text and metadata logs are delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogGroupLogDestination withCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        setCloudWatchLogGroupArn(cloudWatchLogGroupArn);
        return this;
    }

    /**
     * <p>
     * The prefix of the log stream name within the log group that you specified
     * </p>
     * 
     * @param logPrefix
     *        The prefix of the log stream name within the log group that you specified
     */

    public void setLogPrefix(String logPrefix) {
        this.logPrefix = logPrefix;
    }

    /**
     * <p>
     * The prefix of the log stream name within the log group that you specified
     * </p>
     * 
     * @return The prefix of the log stream name within the log group that you specified
     */

    public String getLogPrefix() {
        return this.logPrefix;
    }

    /**
     * <p>
     * The prefix of the log stream name within the log group that you specified
     * </p>
     * 
     * @param logPrefix
     *        The prefix of the log stream name within the log group that you specified
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogGroupLogDestination withLogPrefix(String logPrefix) {
        setLogPrefix(logPrefix);
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
        if (getCloudWatchLogGroupArn() != null)
            sb.append("CloudWatchLogGroupArn: ").append(getCloudWatchLogGroupArn()).append(",");
        if (getLogPrefix() != null)
            sb.append("LogPrefix: ").append(getLogPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLogGroupLogDestination == false)
            return false;
        CloudWatchLogGroupLogDestination other = (CloudWatchLogGroupLogDestination) obj;
        if (other.getCloudWatchLogGroupArn() == null ^ this.getCloudWatchLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogGroupArn() != null && other.getCloudWatchLogGroupArn().equals(this.getCloudWatchLogGroupArn()) == false)
            return false;
        if (other.getLogPrefix() == null ^ this.getLogPrefix() == null)
            return false;
        if (other.getLogPrefix() != null && other.getLogPrefix().equals(this.getLogPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogGroupArn() == null) ? 0 : getCloudWatchLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getLogPrefix() == null) ? 0 : getLogPrefix().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchLogGroupLogDestination clone() {
        try {
            return (CloudWatchLogGroupLogDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.CloudWatchLogGroupLogDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
