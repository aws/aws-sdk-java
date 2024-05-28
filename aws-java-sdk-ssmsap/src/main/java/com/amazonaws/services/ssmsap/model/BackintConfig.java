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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration parameters for AWS Backint Agent for SAP HANA. You can backup your SAP HANA database with AWS Backup or
 * Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/BackintConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackintConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * AWS service for your database backup.
     * </p>
     */
    private String backintMode;
    /** <p/> */
    private Boolean ensureNoBackupInProcess;

    /**
     * <p>
     * AWS service for your database backup.
     * </p>
     * 
     * @param backintMode
     *        AWS service for your database backup.
     * @see BackintMode
     */

    public void setBackintMode(String backintMode) {
        this.backintMode = backintMode;
    }

    /**
     * <p>
     * AWS service for your database backup.
     * </p>
     * 
     * @return AWS service for your database backup.
     * @see BackintMode
     */

    public String getBackintMode() {
        return this.backintMode;
    }

    /**
     * <p>
     * AWS service for your database backup.
     * </p>
     * 
     * @param backintMode
     *        AWS service for your database backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackintMode
     */

    public BackintConfig withBackintMode(String backintMode) {
        setBackintMode(backintMode);
        return this;
    }

    /**
     * <p>
     * AWS service for your database backup.
     * </p>
     * 
     * @param backintMode
     *        AWS service for your database backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackintMode
     */

    public BackintConfig withBackintMode(BackintMode backintMode) {
        this.backintMode = backintMode.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param ensureNoBackupInProcess
     */

    public void setEnsureNoBackupInProcess(Boolean ensureNoBackupInProcess) {
        this.ensureNoBackupInProcess = ensureNoBackupInProcess;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean getEnsureNoBackupInProcess() {
        return this.ensureNoBackupInProcess;
    }

    /**
     * <p/>
     * 
     * @param ensureNoBackupInProcess
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackintConfig withEnsureNoBackupInProcess(Boolean ensureNoBackupInProcess) {
        setEnsureNoBackupInProcess(ensureNoBackupInProcess);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean isEnsureNoBackupInProcess() {
        return this.ensureNoBackupInProcess;
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
        if (getBackintMode() != null)
            sb.append("BackintMode: ").append(getBackintMode()).append(",");
        if (getEnsureNoBackupInProcess() != null)
            sb.append("EnsureNoBackupInProcess: ").append(getEnsureNoBackupInProcess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackintConfig == false)
            return false;
        BackintConfig other = (BackintConfig) obj;
        if (other.getBackintMode() == null ^ this.getBackintMode() == null)
            return false;
        if (other.getBackintMode() != null && other.getBackintMode().equals(this.getBackintMode()) == false)
            return false;
        if (other.getEnsureNoBackupInProcess() == null ^ this.getEnsureNoBackupInProcess() == null)
            return false;
        if (other.getEnsureNoBackupInProcess() != null && other.getEnsureNoBackupInProcess().equals(this.getEnsureNoBackupInProcess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackintMode() == null) ? 0 : getBackintMode().hashCode());
        hashCode = prime * hashCode + ((getEnsureNoBackupInProcess() == null) ? 0 : getEnsureNoBackupInProcess().hashCode());
        return hashCode;
    }

    @Override
    public BackintConfig clone() {
        try {
            return (BackintConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.BackintConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
