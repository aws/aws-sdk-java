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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ExportBackupPlanTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportBackupPlanTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The body of a backup plan template in JSON format.
     * </p>
     * <note>
     * <p>
     * This is a signed JSON document that cannot be modified before being passed to <code>GetBackupPlanFromJSON.</code>
     * </p>
     * </note>
     */
    private String backupPlanTemplateJson;

    /**
     * <p>
     * The body of a backup plan template in JSON format.
     * </p>
     * <note>
     * <p>
     * This is a signed JSON document that cannot be modified before being passed to <code>GetBackupPlanFromJSON.</code>
     * </p>
     * </note>
     * 
     * @param backupPlanTemplateJson
     *        The body of a backup plan template in JSON format.</p> <note>
     *        <p>
     *        This is a signed JSON document that cannot be modified before being passed to
     *        <code>GetBackupPlanFromJSON.</code>
     *        </p>
     */

    public void setBackupPlanTemplateJson(String backupPlanTemplateJson) {
        this.backupPlanTemplateJson = backupPlanTemplateJson;
    }

    /**
     * <p>
     * The body of a backup plan template in JSON format.
     * </p>
     * <note>
     * <p>
     * This is a signed JSON document that cannot be modified before being passed to <code>GetBackupPlanFromJSON.</code>
     * </p>
     * </note>
     * 
     * @return The body of a backup plan template in JSON format.</p> <note>
     *         <p>
     *         This is a signed JSON document that cannot be modified before being passed to
     *         <code>GetBackupPlanFromJSON.</code>
     *         </p>
     */

    public String getBackupPlanTemplateJson() {
        return this.backupPlanTemplateJson;
    }

    /**
     * <p>
     * The body of a backup plan template in JSON format.
     * </p>
     * <note>
     * <p>
     * This is a signed JSON document that cannot be modified before being passed to <code>GetBackupPlanFromJSON.</code>
     * </p>
     * </note>
     * 
     * @param backupPlanTemplateJson
     *        The body of a backup plan template in JSON format.</p> <note>
     *        <p>
     *        This is a signed JSON document that cannot be modified before being passed to
     *        <code>GetBackupPlanFromJSON.</code>
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportBackupPlanTemplateResult withBackupPlanTemplateJson(String backupPlanTemplateJson) {
        setBackupPlanTemplateJson(backupPlanTemplateJson);
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
        if (getBackupPlanTemplateJson() != null)
            sb.append("BackupPlanTemplateJson: ").append(getBackupPlanTemplateJson());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportBackupPlanTemplateResult == false)
            return false;
        ExportBackupPlanTemplateResult other = (ExportBackupPlanTemplateResult) obj;
        if (other.getBackupPlanTemplateJson() == null ^ this.getBackupPlanTemplateJson() == null)
            return false;
        if (other.getBackupPlanTemplateJson() != null && other.getBackupPlanTemplateJson().equals(this.getBackupPlanTemplateJson()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupPlanTemplateJson() == null) ? 0 : getBackupPlanTemplateJson().hashCode());
        return hashCode;
    }

    @Override
    public ExportBackupPlanTemplateResult clone() {
        try {
            return (ExportBackupPlanTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
