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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configures how streaming sessions are backed up when launched from this launch profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StreamConfigurationSessionBackup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamConfigurationSessionBackup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of backups that each streaming session created from this launch profile can have.
     * </p>
     */
    private Integer maxBackupsToRetain;
    /**
     * <p>
     * Specifies how artists sessions are backed up.
     * </p>
     * <p>
     * Configures backups for streaming sessions launched with this launch profile. The default value is
     * <code>DEACTIVATED</code>, which means that backups are deactivated. To allow backups, set this value to
     * <code>AUTOMATIC</code>.
     * </p>
     */
    private String mode;

    /**
     * <p>
     * The maximum number of backups that each streaming session created from this launch profile can have.
     * </p>
     * 
     * @param maxBackupsToRetain
     *        The maximum number of backups that each streaming session created from this launch profile can have.
     */

    public void setMaxBackupsToRetain(Integer maxBackupsToRetain) {
        this.maxBackupsToRetain = maxBackupsToRetain;
    }

    /**
     * <p>
     * The maximum number of backups that each streaming session created from this launch profile can have.
     * </p>
     * 
     * @return The maximum number of backups that each streaming session created from this launch profile can have.
     */

    public Integer getMaxBackupsToRetain() {
        return this.maxBackupsToRetain;
    }

    /**
     * <p>
     * The maximum number of backups that each streaming session created from this launch profile can have.
     * </p>
     * 
     * @param maxBackupsToRetain
     *        The maximum number of backups that each streaming session created from this launch profile can have.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamConfigurationSessionBackup withMaxBackupsToRetain(Integer maxBackupsToRetain) {
        setMaxBackupsToRetain(maxBackupsToRetain);
        return this;
    }

    /**
     * <p>
     * Specifies how artists sessions are backed up.
     * </p>
     * <p>
     * Configures backups for streaming sessions launched with this launch profile. The default value is
     * <code>DEACTIVATED</code>, which means that backups are deactivated. To allow backups, set this value to
     * <code>AUTOMATIC</code>.
     * </p>
     * 
     * @param mode
     *        Specifies how artists sessions are backed up.</p>
     *        <p>
     *        Configures backups for streaming sessions launched with this launch profile. The default value is
     *        <code>DEACTIVATED</code>, which means that backups are deactivated. To allow backups, set this value to
     *        <code>AUTOMATIC</code>.
     * @see SessionBackupMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Specifies how artists sessions are backed up.
     * </p>
     * <p>
     * Configures backups for streaming sessions launched with this launch profile. The default value is
     * <code>DEACTIVATED</code>, which means that backups are deactivated. To allow backups, set this value to
     * <code>AUTOMATIC</code>.
     * </p>
     * 
     * @return Specifies how artists sessions are backed up.</p>
     *         <p>
     *         Configures backups for streaming sessions launched with this launch profile. The default value is
     *         <code>DEACTIVATED</code>, which means that backups are deactivated. To allow backups, set this value to
     *         <code>AUTOMATIC</code>.
     * @see SessionBackupMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Specifies how artists sessions are backed up.
     * </p>
     * <p>
     * Configures backups for streaming sessions launched with this launch profile. The default value is
     * <code>DEACTIVATED</code>, which means that backups are deactivated. To allow backups, set this value to
     * <code>AUTOMATIC</code>.
     * </p>
     * 
     * @param mode
     *        Specifies how artists sessions are backed up.</p>
     *        <p>
     *        Configures backups for streaming sessions launched with this launch profile. The default value is
     *        <code>DEACTIVATED</code>, which means that backups are deactivated. To allow backups, set this value to
     *        <code>AUTOMATIC</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionBackupMode
     */

    public StreamConfigurationSessionBackup withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Specifies how artists sessions are backed up.
     * </p>
     * <p>
     * Configures backups for streaming sessions launched with this launch profile. The default value is
     * <code>DEACTIVATED</code>, which means that backups are deactivated. To allow backups, set this value to
     * <code>AUTOMATIC</code>.
     * </p>
     * 
     * @param mode
     *        Specifies how artists sessions are backed up.</p>
     *        <p>
     *        Configures backups for streaming sessions launched with this launch profile. The default value is
     *        <code>DEACTIVATED</code>, which means that backups are deactivated. To allow backups, set this value to
     *        <code>AUTOMATIC</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionBackupMode
     */

    public StreamConfigurationSessionBackup withMode(SessionBackupMode mode) {
        this.mode = mode.toString();
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
        if (getMaxBackupsToRetain() != null)
            sb.append("MaxBackupsToRetain: ").append(getMaxBackupsToRetain()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamConfigurationSessionBackup == false)
            return false;
        StreamConfigurationSessionBackup other = (StreamConfigurationSessionBackup) obj;
        if (other.getMaxBackupsToRetain() == null ^ this.getMaxBackupsToRetain() == null)
            return false;
        if (other.getMaxBackupsToRetain() != null && other.getMaxBackupsToRetain().equals(this.getMaxBackupsToRetain()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxBackupsToRetain() == null) ? 0 : getMaxBackupsToRetain().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public StreamConfigurationSessionBackup clone() {
        try {
            return (StreamConfigurationSessionBackup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StreamConfigurationSessionBackupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
