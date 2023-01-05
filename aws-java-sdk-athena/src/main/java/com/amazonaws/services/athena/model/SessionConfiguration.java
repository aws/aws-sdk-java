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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains session configuration information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/SessionConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the execution role used for the session.
     * </p>
     */
    private String executionRole;
    /**
     * <p>
     * The Amazon S3 location that stores information for the notebook.
     * </p>
     */
    private String workingDirectory;
    /**
     * <p>
     * The idle timeout in seconds for the session.
     * </p>
     */
    private Long idleTimeoutSeconds;

    private EncryptionConfiguration encryptionConfiguration;

    /**
     * <p>
     * The ARN of the execution role used for the session.
     * </p>
     * 
     * @param executionRole
     *        The ARN of the execution role used for the session.
     */

    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * The ARN of the execution role used for the session.
     * </p>
     * 
     * @return The ARN of the execution role used for the session.
     */

    public String getExecutionRole() {
        return this.executionRole;
    }

    /**
     * <p>
     * The ARN of the execution role used for the session.
     * </p>
     * 
     * @param executionRole
     *        The ARN of the execution role used for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionConfiguration withExecutionRole(String executionRole) {
        setExecutionRole(executionRole);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location that stores information for the notebook.
     * </p>
     * 
     * @param workingDirectory
     *        The Amazon S3 location that stores information for the notebook.
     */

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    /**
     * <p>
     * The Amazon S3 location that stores information for the notebook.
     * </p>
     * 
     * @return The Amazon S3 location that stores information for the notebook.
     */

    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

    /**
     * <p>
     * The Amazon S3 location that stores information for the notebook.
     * </p>
     * 
     * @param workingDirectory
     *        The Amazon S3 location that stores information for the notebook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionConfiguration withWorkingDirectory(String workingDirectory) {
        setWorkingDirectory(workingDirectory);
        return this;
    }

    /**
     * <p>
     * The idle timeout in seconds for the session.
     * </p>
     * 
     * @param idleTimeoutSeconds
     *        The idle timeout in seconds for the session.
     */

    public void setIdleTimeoutSeconds(Long idleTimeoutSeconds) {
        this.idleTimeoutSeconds = idleTimeoutSeconds;
    }

    /**
     * <p>
     * The idle timeout in seconds for the session.
     * </p>
     * 
     * @return The idle timeout in seconds for the session.
     */

    public Long getIdleTimeoutSeconds() {
        return this.idleTimeoutSeconds;
    }

    /**
     * <p>
     * The idle timeout in seconds for the session.
     * </p>
     * 
     * @param idleTimeoutSeconds
     *        The idle timeout in seconds for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionConfiguration withIdleTimeoutSeconds(Long idleTimeoutSeconds) {
        setIdleTimeoutSeconds(idleTimeoutSeconds);
        return this;
    }

    /**
     * @param encryptionConfiguration
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * @return
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * @param encryptionConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionConfiguration withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
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
        if (getExecutionRole() != null)
            sb.append("ExecutionRole: ").append(getExecutionRole()).append(",");
        if (getWorkingDirectory() != null)
            sb.append("WorkingDirectory: ").append(getWorkingDirectory()).append(",");
        if (getIdleTimeoutSeconds() != null)
            sb.append("IdleTimeoutSeconds: ").append(getIdleTimeoutSeconds()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionConfiguration == false)
            return false;
        SessionConfiguration other = (SessionConfiguration) obj;
        if (other.getExecutionRole() == null ^ this.getExecutionRole() == null)
            return false;
        if (other.getExecutionRole() != null && other.getExecutionRole().equals(this.getExecutionRole()) == false)
            return false;
        if (other.getWorkingDirectory() == null ^ this.getWorkingDirectory() == null)
            return false;
        if (other.getWorkingDirectory() != null && other.getWorkingDirectory().equals(this.getWorkingDirectory()) == false)
            return false;
        if (other.getIdleTimeoutSeconds() == null ^ this.getIdleTimeoutSeconds() == null)
            return false;
        if (other.getIdleTimeoutSeconds() != null && other.getIdleTimeoutSeconds().equals(this.getIdleTimeoutSeconds()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getWorkingDirectory() == null) ? 0 : getWorkingDirectory().hashCode());
        hashCode = prime * hashCode + ((getIdleTimeoutSeconds() == null) ? 0 : getIdleTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SessionConfiguration clone() {
        try {
            return (SessionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.SessionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
