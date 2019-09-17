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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlanFromTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBackupPlanFromTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Uniquely identifies a stored backup plan template.
     * </p>
     */
    private String backupPlanTemplateId;

    /**
     * <p>
     * Uniquely identifies a stored backup plan template.
     * </p>
     * 
     * @param backupPlanTemplateId
     *        Uniquely identifies a stored backup plan template.
     */

    public void setBackupPlanTemplateId(String backupPlanTemplateId) {
        this.backupPlanTemplateId = backupPlanTemplateId;
    }

    /**
     * <p>
     * Uniquely identifies a stored backup plan template.
     * </p>
     * 
     * @return Uniquely identifies a stored backup plan template.
     */

    public String getBackupPlanTemplateId() {
        return this.backupPlanTemplateId;
    }

    /**
     * <p>
     * Uniquely identifies a stored backup plan template.
     * </p>
     * 
     * @param backupPlanTemplateId
     *        Uniquely identifies a stored backup plan template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackupPlanFromTemplateRequest withBackupPlanTemplateId(String backupPlanTemplateId) {
        setBackupPlanTemplateId(backupPlanTemplateId);
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
        if (getBackupPlanTemplateId() != null)
            sb.append("BackupPlanTemplateId: ").append(getBackupPlanTemplateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBackupPlanFromTemplateRequest == false)
            return false;
        GetBackupPlanFromTemplateRequest other = (GetBackupPlanFromTemplateRequest) obj;
        if (other.getBackupPlanTemplateId() == null ^ this.getBackupPlanTemplateId() == null)
            return false;
        if (other.getBackupPlanTemplateId() != null && other.getBackupPlanTemplateId().equals(this.getBackupPlanTemplateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupPlanTemplateId() == null) ? 0 : getBackupPlanTemplateId().hashCode());
        return hashCode;
    }

    @Override
    public GetBackupPlanFromTemplateRequest clone() {
        return (GetBackupPlanFromTemplateRequest) super.clone();
    }

}
