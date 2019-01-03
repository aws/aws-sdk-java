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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details for the restore.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/RestoreSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the backup from which the table was restored.
     * </p>
     */
    private String sourceBackupArn;
    /**
     * <p>
     * ARN of the source table of the backup that is being restored.
     * </p>
     */
    private String sourceTableArn;
    /**
     * <p>
     * Point in time or source backup time.
     * </p>
     */
    private java.util.Date restoreDateTime;
    /**
     * <p>
     * Indicates if a restore is in progress or not.
     * </p>
     */
    private Boolean restoreInProgress;

    /**
     * <p>
     * ARN of the backup from which the table was restored.
     * </p>
     * 
     * @param sourceBackupArn
     *        ARN of the backup from which the table was restored.
     */

    public void setSourceBackupArn(String sourceBackupArn) {
        this.sourceBackupArn = sourceBackupArn;
    }

    /**
     * <p>
     * ARN of the backup from which the table was restored.
     * </p>
     * 
     * @return ARN of the backup from which the table was restored.
     */

    public String getSourceBackupArn() {
        return this.sourceBackupArn;
    }

    /**
     * <p>
     * ARN of the backup from which the table was restored.
     * </p>
     * 
     * @param sourceBackupArn
     *        ARN of the backup from which the table was restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSummary withSourceBackupArn(String sourceBackupArn) {
        setSourceBackupArn(sourceBackupArn);
        return this;
    }

    /**
     * <p>
     * ARN of the source table of the backup that is being restored.
     * </p>
     * 
     * @param sourceTableArn
     *        ARN of the source table of the backup that is being restored.
     */

    public void setSourceTableArn(String sourceTableArn) {
        this.sourceTableArn = sourceTableArn;
    }

    /**
     * <p>
     * ARN of the source table of the backup that is being restored.
     * </p>
     * 
     * @return ARN of the source table of the backup that is being restored.
     */

    public String getSourceTableArn() {
        return this.sourceTableArn;
    }

    /**
     * <p>
     * ARN of the source table of the backup that is being restored.
     * </p>
     * 
     * @param sourceTableArn
     *        ARN of the source table of the backup that is being restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSummary withSourceTableArn(String sourceTableArn) {
        setSourceTableArn(sourceTableArn);
        return this;
    }

    /**
     * <p>
     * Point in time or source backup time.
     * </p>
     * 
     * @param restoreDateTime
     *        Point in time or source backup time.
     */

    public void setRestoreDateTime(java.util.Date restoreDateTime) {
        this.restoreDateTime = restoreDateTime;
    }

    /**
     * <p>
     * Point in time or source backup time.
     * </p>
     * 
     * @return Point in time or source backup time.
     */

    public java.util.Date getRestoreDateTime() {
        return this.restoreDateTime;
    }

    /**
     * <p>
     * Point in time or source backup time.
     * </p>
     * 
     * @param restoreDateTime
     *        Point in time or source backup time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSummary withRestoreDateTime(java.util.Date restoreDateTime) {
        setRestoreDateTime(restoreDateTime);
        return this;
    }

    /**
     * <p>
     * Indicates if a restore is in progress or not.
     * </p>
     * 
     * @param restoreInProgress
     *        Indicates if a restore is in progress or not.
     */

    public void setRestoreInProgress(Boolean restoreInProgress) {
        this.restoreInProgress = restoreInProgress;
    }

    /**
     * <p>
     * Indicates if a restore is in progress or not.
     * </p>
     * 
     * @return Indicates if a restore is in progress or not.
     */

    public Boolean getRestoreInProgress() {
        return this.restoreInProgress;
    }

    /**
     * <p>
     * Indicates if a restore is in progress or not.
     * </p>
     * 
     * @param restoreInProgress
     *        Indicates if a restore is in progress or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSummary withRestoreInProgress(Boolean restoreInProgress) {
        setRestoreInProgress(restoreInProgress);
        return this;
    }

    /**
     * <p>
     * Indicates if a restore is in progress or not.
     * </p>
     * 
     * @return Indicates if a restore is in progress or not.
     */

    public Boolean isRestoreInProgress() {
        return this.restoreInProgress;
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
        if (getSourceBackupArn() != null)
            sb.append("SourceBackupArn: ").append(getSourceBackupArn()).append(",");
        if (getSourceTableArn() != null)
            sb.append("SourceTableArn: ").append(getSourceTableArn()).append(",");
        if (getRestoreDateTime() != null)
            sb.append("RestoreDateTime: ").append(getRestoreDateTime()).append(",");
        if (getRestoreInProgress() != null)
            sb.append("RestoreInProgress: ").append(getRestoreInProgress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreSummary == false)
            return false;
        RestoreSummary other = (RestoreSummary) obj;
        if (other.getSourceBackupArn() == null ^ this.getSourceBackupArn() == null)
            return false;
        if (other.getSourceBackupArn() != null && other.getSourceBackupArn().equals(this.getSourceBackupArn()) == false)
            return false;
        if (other.getSourceTableArn() == null ^ this.getSourceTableArn() == null)
            return false;
        if (other.getSourceTableArn() != null && other.getSourceTableArn().equals(this.getSourceTableArn()) == false)
            return false;
        if (other.getRestoreDateTime() == null ^ this.getRestoreDateTime() == null)
            return false;
        if (other.getRestoreDateTime() != null && other.getRestoreDateTime().equals(this.getRestoreDateTime()) == false)
            return false;
        if (other.getRestoreInProgress() == null ^ this.getRestoreInProgress() == null)
            return false;
        if (other.getRestoreInProgress() != null && other.getRestoreInProgress().equals(this.getRestoreInProgress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceBackupArn() == null) ? 0 : getSourceBackupArn().hashCode());
        hashCode = prime * hashCode + ((getSourceTableArn() == null) ? 0 : getSourceTableArn().hashCode());
        hashCode = prime * hashCode + ((getRestoreDateTime() == null) ? 0 : getRestoreDateTime().hashCode());
        hashCode = prime * hashCode + ((getRestoreInProgress() == null) ? 0 : getRestoreInProgress().hashCode());
        return hashCode;
    }

    @Override
    public RestoreSummary clone() {
        try {
            return (RestoreSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.RestoreSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
