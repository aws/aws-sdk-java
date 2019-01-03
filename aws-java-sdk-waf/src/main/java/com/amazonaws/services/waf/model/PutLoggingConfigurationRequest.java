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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/PutLoggingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutLoggingConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Kinesis Data Firehose that contains the inspected traffic information, the redacted fields details,
     * and the Amazon Resource Name (ARN) of the web ACL to monitor.
     * </p>
     */
    private LoggingConfiguration loggingConfiguration;

    /**
     * <p>
     * The Amazon Kinesis Data Firehose that contains the inspected traffic information, the redacted fields details,
     * and the Amazon Resource Name (ARN) of the web ACL to monitor.
     * </p>
     * 
     * @param loggingConfiguration
     *        The Amazon Kinesis Data Firehose that contains the inspected traffic information, the redacted fields
     *        details, and the Amazon Resource Name (ARN) of the web ACL to monitor.
     */

    public void setLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * <p>
     * The Amazon Kinesis Data Firehose that contains the inspected traffic information, the redacted fields details,
     * and the Amazon Resource Name (ARN) of the web ACL to monitor.
     * </p>
     * 
     * @return The Amazon Kinesis Data Firehose that contains the inspected traffic information, the redacted fields
     *         details, and the Amazon Resource Name (ARN) of the web ACL to monitor.
     */

    public LoggingConfiguration getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    /**
     * <p>
     * The Amazon Kinesis Data Firehose that contains the inspected traffic information, the redacted fields details,
     * and the Amazon Resource Name (ARN) of the web ACL to monitor.
     * </p>
     * 
     * @param loggingConfiguration
     *        The Amazon Kinesis Data Firehose that contains the inspected traffic information, the redacted fields
     *        details, and the Amazon Resource Name (ARN) of the web ACL to monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLoggingConfigurationRequest withLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        setLoggingConfiguration(loggingConfiguration);
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
        if (getLoggingConfiguration() != null)
            sb.append("LoggingConfiguration: ").append(getLoggingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLoggingConfigurationRequest == false)
            return false;
        PutLoggingConfigurationRequest other = (PutLoggingConfigurationRequest) obj;
        if (other.getLoggingConfiguration() == null ^ this.getLoggingConfiguration() == null)
            return false;
        if (other.getLoggingConfiguration() != null && other.getLoggingConfiguration().equals(this.getLoggingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoggingConfiguration() == null) ? 0 : getLoggingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutLoggingConfigurationRequest clone() {
        return (PutLoggingConfigurationRequest) super.clone();
    }

}
