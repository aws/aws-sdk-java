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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the execute command configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ExecuteCommandConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteCommandConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify an AWS Key Management Service key ID to encrypt the data between the local client and the container.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The log setting to use for redirecting logs for your execute command results. The following log settings are
     * available.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The execute command session is not logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEFAULT</code>: The <code>awslogs</code> configuration in the task definition is used. If no logging
     * parameter is specified, it defaults to this value. If no <code>awslogs</code> log driver is configured in the
     * task definition, the output won't be logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERRIDE</code>: Specify the logging details as a part of <code>logConfiguration</code>. If the
     * <code>OVERRIDE</code> logging option is specified, the <code>logConfiguration</code> is required.
     * </p>
     * </li>
     * </ul>
     */
    private String logging;
    /**
     * <p>
     * The log configuration for the results of the execute command actions. The logs can be sent to CloudWatch Logs or
     * an Amazon S3 bucket. When <code>logging=OVERRIDE</code> is specified, a <code>logConfiguration</code> must be
     * provided.
     * </p>
     */
    private ExecuteCommandLogConfiguration logConfiguration;

    /**
     * <p>
     * Specify an AWS Key Management Service key ID to encrypt the data between the local client and the container.
     * </p>
     * 
     * @param kmsKeyId
     *        Specify an AWS Key Management Service key ID to encrypt the data between the local client and the
     *        container.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Specify an AWS Key Management Service key ID to encrypt the data between the local client and the container.
     * </p>
     * 
     * @return Specify an AWS Key Management Service key ID to encrypt the data between the local client and the
     *         container.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Specify an AWS Key Management Service key ID to encrypt the data between the local client and the container.
     * </p>
     * 
     * @param kmsKeyId
     *        Specify an AWS Key Management Service key ID to encrypt the data between the local client and the
     *        container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteCommandConfiguration withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The log setting to use for redirecting logs for your execute command results. The following log settings are
     * available.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The execute command session is not logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEFAULT</code>: The <code>awslogs</code> configuration in the task definition is used. If no logging
     * parameter is specified, it defaults to this value. If no <code>awslogs</code> log driver is configured in the
     * task definition, the output won't be logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERRIDE</code>: Specify the logging details as a part of <code>logConfiguration</code>. If the
     * <code>OVERRIDE</code> logging option is specified, the <code>logConfiguration</code> is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @param logging
     *        The log setting to use for redirecting logs for your execute command results. The following log settings
     *        are available.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The execute command session is not logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEFAULT</code>: The <code>awslogs</code> configuration in the task definition is used. If no logging
     *        parameter is specified, it defaults to this value. If no <code>awslogs</code> log driver is configured in
     *        the task definition, the output won't be logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OVERRIDE</code>: Specify the logging details as a part of <code>logConfiguration</code>. If the
     *        <code>OVERRIDE</code> logging option is specified, the <code>logConfiguration</code> is required.
     *        </p>
     *        </li>
     * @see ExecuteCommandLogging
     */

    public void setLogging(String logging) {
        this.logging = logging;
    }

    /**
     * <p>
     * The log setting to use for redirecting logs for your execute command results. The following log settings are
     * available.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The execute command session is not logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEFAULT</code>: The <code>awslogs</code> configuration in the task definition is used. If no logging
     * parameter is specified, it defaults to this value. If no <code>awslogs</code> log driver is configured in the
     * task definition, the output won't be logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERRIDE</code>: Specify the logging details as a part of <code>logConfiguration</code>. If the
     * <code>OVERRIDE</code> logging option is specified, the <code>logConfiguration</code> is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The log setting to use for redirecting logs for your execute command results. The following log settings
     *         are available.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: The execute command session is not logged.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEFAULT</code>: The <code>awslogs</code> configuration in the task definition is used. If no
     *         logging parameter is specified, it defaults to this value. If no <code>awslogs</code> log driver is
     *         configured in the task definition, the output won't be logged.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OVERRIDE</code>: Specify the logging details as a part of <code>logConfiguration</code>. If the
     *         <code>OVERRIDE</code> logging option is specified, the <code>logConfiguration</code> is required.
     *         </p>
     *         </li>
     * @see ExecuteCommandLogging
     */

    public String getLogging() {
        return this.logging;
    }

    /**
     * <p>
     * The log setting to use for redirecting logs for your execute command results. The following log settings are
     * available.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The execute command session is not logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEFAULT</code>: The <code>awslogs</code> configuration in the task definition is used. If no logging
     * parameter is specified, it defaults to this value. If no <code>awslogs</code> log driver is configured in the
     * task definition, the output won't be logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERRIDE</code>: Specify the logging details as a part of <code>logConfiguration</code>. If the
     * <code>OVERRIDE</code> logging option is specified, the <code>logConfiguration</code> is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @param logging
     *        The log setting to use for redirecting logs for your execute command results. The following log settings
     *        are available.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The execute command session is not logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEFAULT</code>: The <code>awslogs</code> configuration in the task definition is used. If no logging
     *        parameter is specified, it defaults to this value. If no <code>awslogs</code> log driver is configured in
     *        the task definition, the output won't be logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OVERRIDE</code>: Specify the logging details as a part of <code>logConfiguration</code>. If the
     *        <code>OVERRIDE</code> logging option is specified, the <code>logConfiguration</code> is required.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecuteCommandLogging
     */

    public ExecuteCommandConfiguration withLogging(String logging) {
        setLogging(logging);
        return this;
    }

    /**
     * <p>
     * The log setting to use for redirecting logs for your execute command results. The following log settings are
     * available.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The execute command session is not logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEFAULT</code>: The <code>awslogs</code> configuration in the task definition is used. If no logging
     * parameter is specified, it defaults to this value. If no <code>awslogs</code> log driver is configured in the
     * task definition, the output won't be logged.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERRIDE</code>: Specify the logging details as a part of <code>logConfiguration</code>. If the
     * <code>OVERRIDE</code> logging option is specified, the <code>logConfiguration</code> is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @param logging
     *        The log setting to use for redirecting logs for your execute command results. The following log settings
     *        are available.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The execute command session is not logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEFAULT</code>: The <code>awslogs</code> configuration in the task definition is used. If no logging
     *        parameter is specified, it defaults to this value. If no <code>awslogs</code> log driver is configured in
     *        the task definition, the output won't be logged.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OVERRIDE</code>: Specify the logging details as a part of <code>logConfiguration</code>. If the
     *        <code>OVERRIDE</code> logging option is specified, the <code>logConfiguration</code> is required.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecuteCommandLogging
     */

    public ExecuteCommandConfiguration withLogging(ExecuteCommandLogging logging) {
        this.logging = logging.toString();
        return this;
    }

    /**
     * <p>
     * The log configuration for the results of the execute command actions. The logs can be sent to CloudWatch Logs or
     * an Amazon S3 bucket. When <code>logging=OVERRIDE</code> is specified, a <code>logConfiguration</code> must be
     * provided.
     * </p>
     * 
     * @param logConfiguration
     *        The log configuration for the results of the execute command actions. The logs can be sent to CloudWatch
     *        Logs or an Amazon S3 bucket. When <code>logging=OVERRIDE</code> is specified, a
     *        <code>logConfiguration</code> must be provided.
     */

    public void setLogConfiguration(ExecuteCommandLogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
    }

    /**
     * <p>
     * The log configuration for the results of the execute command actions. The logs can be sent to CloudWatch Logs or
     * an Amazon S3 bucket. When <code>logging=OVERRIDE</code> is specified, a <code>logConfiguration</code> must be
     * provided.
     * </p>
     * 
     * @return The log configuration for the results of the execute command actions. The logs can be sent to CloudWatch
     *         Logs or an Amazon S3 bucket. When <code>logging=OVERRIDE</code> is specified, a
     *         <code>logConfiguration</code> must be provided.
     */

    public ExecuteCommandLogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * <p>
     * The log configuration for the results of the execute command actions. The logs can be sent to CloudWatch Logs or
     * an Amazon S3 bucket. When <code>logging=OVERRIDE</code> is specified, a <code>logConfiguration</code> must be
     * provided.
     * </p>
     * 
     * @param logConfiguration
     *        The log configuration for the results of the execute command actions. The logs can be sent to CloudWatch
     *        Logs or an Amazon S3 bucket. When <code>logging=OVERRIDE</code> is specified, a
     *        <code>logConfiguration</code> must be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteCommandConfiguration withLogConfiguration(ExecuteCommandLogConfiguration logConfiguration) {
        setLogConfiguration(logConfiguration);
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getLogging() != null)
            sb.append("Logging: ").append(getLogging()).append(",");
        if (getLogConfiguration() != null)
            sb.append("LogConfiguration: ").append(getLogConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteCommandConfiguration == false)
            return false;
        ExecuteCommandConfiguration other = (ExecuteCommandConfiguration) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false)
            return false;
        if (other.getLogConfiguration() == null ^ this.getLogConfiguration() == null)
            return false;
        if (other.getLogConfiguration() != null && other.getLogConfiguration().equals(this.getLogConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        hashCode = prime * hashCode + ((getLogConfiguration() == null) ? 0 : getLogConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteCommandConfiguration clone() {
        try {
            return (ExecuteCommandConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ExecuteCommandConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
