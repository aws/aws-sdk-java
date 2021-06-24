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
 * Contains the run command configuration for the cluster.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsClusterConfigurationExecuteCommandConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsClusterConfigurationExecuteCommandConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the KMS key that is used to encrypt the data between the local client and the container.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The log configuration for the results of the run command actions. Required if <code>Logging</code> is
     * <code>NONE</code>.
     * </p>
     */
    private AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails logConfiguration;
    /**
     * <p>
     * The log setting to use for redirecting logs for run command results.
     * </p>
     */
    private String logging;

    /**
     * <p>
     * The identifier of the KMS key that is used to encrypt the data between the local client and the container.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the KMS key that is used to encrypt the data between the local client and the container.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the KMS key that is used to encrypt the data between the local client and the container.
     * </p>
     * 
     * @return The identifier of the KMS key that is used to encrypt the data between the local client and the
     *         container.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the KMS key that is used to encrypt the data between the local client and the container.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the KMS key that is used to encrypt the data between the local client and the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterConfigurationExecuteCommandConfigurationDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The log configuration for the results of the run command actions. Required if <code>Logging</code> is
     * <code>NONE</code>.
     * </p>
     * 
     * @param logConfiguration
     *        The log configuration for the results of the run command actions. Required if <code>Logging</code> is
     *        <code>NONE</code>.
     */

    public void setLogConfiguration(AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails logConfiguration) {
        this.logConfiguration = logConfiguration;
    }

    /**
     * <p>
     * The log configuration for the results of the run command actions. Required if <code>Logging</code> is
     * <code>NONE</code>.
     * </p>
     * 
     * @return The log configuration for the results of the run command actions. Required if <code>Logging</code> is
     *         <code>NONE</code>.
     */

    public AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * <p>
     * The log configuration for the results of the run command actions. Required if <code>Logging</code> is
     * <code>NONE</code>.
     * </p>
     * 
     * @param logConfiguration
     *        The log configuration for the results of the run command actions. Required if <code>Logging</code> is
     *        <code>NONE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterConfigurationExecuteCommandConfigurationDetails withLogConfiguration(
            AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails logConfiguration) {
        setLogConfiguration(logConfiguration);
        return this;
    }

    /**
     * <p>
     * The log setting to use for redirecting logs for run command results.
     * </p>
     * 
     * @param logging
     *        The log setting to use for redirecting logs for run command results.
     */

    public void setLogging(String logging) {
        this.logging = logging;
    }

    /**
     * <p>
     * The log setting to use for redirecting logs for run command results.
     * </p>
     * 
     * @return The log setting to use for redirecting logs for run command results.
     */

    public String getLogging() {
        return this.logging;
    }

    /**
     * <p>
     * The log setting to use for redirecting logs for run command results.
     * </p>
     * 
     * @param logging
     *        The log setting to use for redirecting logs for run command results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterConfigurationExecuteCommandConfigurationDetails withLogging(String logging) {
        setLogging(logging);
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
        if (getLogConfiguration() != null)
            sb.append("LogConfiguration: ").append(getLogConfiguration()).append(",");
        if (getLogging() != null)
            sb.append("Logging: ").append(getLogging());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsClusterConfigurationExecuteCommandConfigurationDetails == false)
            return false;
        AwsEcsClusterConfigurationExecuteCommandConfigurationDetails other = (AwsEcsClusterConfigurationExecuteCommandConfigurationDetails) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getLogConfiguration() == null ^ this.getLogConfiguration() == null)
            return false;
        if (other.getLogConfiguration() != null && other.getLogConfiguration().equals(this.getLogConfiguration()) == false)
            return false;
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getLogConfiguration() == null) ? 0 : getLogConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsClusterConfigurationExecuteCommandConfigurationDetails clone() {
        try {
            return (AwsEcsClusterConfigurationExecuteCommandConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsClusterConfigurationExecuteCommandConfigurationDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
