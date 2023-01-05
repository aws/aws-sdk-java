/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivschat.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a CloudWatch Logs location where chat logs will be stored.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CloudWatchLogsDestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLogsDestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the Amazon Cloudwatch Logs destination where chat activity will be logged.
     * </p>
     */
    private String logGroupName;

    /**
     * <p>
     * Name of the Amazon Cloudwatch Logs destination where chat activity will be logged.
     * </p>
     * 
     * @param logGroupName
     *        Name of the Amazon Cloudwatch Logs destination where chat activity will be logged.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * Name of the Amazon Cloudwatch Logs destination where chat activity will be logged.
     * </p>
     * 
     * @return Name of the Amazon Cloudwatch Logs destination where chat activity will be logged.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * Name of the Amazon Cloudwatch Logs destination where chat activity will be logged.
     * </p>
     * 
     * @param logGroupName
     *        Name of the Amazon Cloudwatch Logs destination where chat activity will be logged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsDestinationConfiguration withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLogsDestinationConfiguration == false)
            return false;
        CloudWatchLogsDestinationConfiguration other = (CloudWatchLogsDestinationConfiguration) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchLogsDestinationConfiguration clone() {
        try {
            return (CloudWatchLogsDestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivschat.model.transform.CloudWatchLogsDestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
