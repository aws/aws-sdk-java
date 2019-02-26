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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateBackupSelection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackupSelectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     * </p>
     */
    private String backupPlanId;
    /**
     * <p>
     * Specifies the body of a request to assign a set of resources to a backup plan.
     * </p>
     * <p>
     * It includes an array of resources, an optional array of patterns to exclude resources, an optional role to
     * provide access to the AWS service the resource belongs to, and an optional array of tags used to identify a set
     * of resources.
     * </p>
     */
    private BackupSelection backupSelection;
    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to be retried without the risk of
     * executing the operation twice.
     * </p>
     */
    private String creatorRequestId;

    /**
     * <p>
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     * </p>
     * 
     * @param backupPlanId
     *        Uniquely identifies the backup plan to be associated with the selection of resources.
     */

    public void setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
    }

    /**
     * <p>
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     * </p>
     * 
     * @return Uniquely identifies the backup plan to be associated with the selection of resources.
     */

    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * <p>
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     * </p>
     * 
     * @param backupPlanId
     *        Uniquely identifies the backup plan to be associated with the selection of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupSelectionRequest withBackupPlanId(String backupPlanId) {
        setBackupPlanId(backupPlanId);
        return this;
    }

    /**
     * <p>
     * Specifies the body of a request to assign a set of resources to a backup plan.
     * </p>
     * <p>
     * It includes an array of resources, an optional array of patterns to exclude resources, an optional role to
     * provide access to the AWS service the resource belongs to, and an optional array of tags used to identify a set
     * of resources.
     * </p>
     * 
     * @param backupSelection
     *        Specifies the body of a request to assign a set of resources to a backup plan.</p>
     *        <p>
     *        It includes an array of resources, an optional array of patterns to exclude resources, an optional role to
     *        provide access to the AWS service the resource belongs to, and an optional array of tags used to identify
     *        a set of resources.
     */

    public void setBackupSelection(BackupSelection backupSelection) {
        this.backupSelection = backupSelection;
    }

    /**
     * <p>
     * Specifies the body of a request to assign a set of resources to a backup plan.
     * </p>
     * <p>
     * It includes an array of resources, an optional array of patterns to exclude resources, an optional role to
     * provide access to the AWS service the resource belongs to, and an optional array of tags used to identify a set
     * of resources.
     * </p>
     * 
     * @return Specifies the body of a request to assign a set of resources to a backup plan.</p>
     *         <p>
     *         It includes an array of resources, an optional array of patterns to exclude resources, an optional role
     *         to provide access to the AWS service the resource belongs to, and an optional array of tags used to
     *         identify a set of resources.
     */

    public BackupSelection getBackupSelection() {
        return this.backupSelection;
    }

    /**
     * <p>
     * Specifies the body of a request to assign a set of resources to a backup plan.
     * </p>
     * <p>
     * It includes an array of resources, an optional array of patterns to exclude resources, an optional role to
     * provide access to the AWS service the resource belongs to, and an optional array of tags used to identify a set
     * of resources.
     * </p>
     * 
     * @param backupSelection
     *        Specifies the body of a request to assign a set of resources to a backup plan.</p>
     *        <p>
     *        It includes an array of resources, an optional array of patterns to exclude resources, an optional role to
     *        provide access to the AWS service the resource belongs to, and an optional array of tags used to identify
     *        a set of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupSelectionRequest withBackupSelection(BackupSelection backupSelection) {
        setBackupSelection(backupSelection);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to be retried without the risk of
     * executing the operation twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and allows failed requests to be retried without the risk of
     *        executing the operation twice.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to be retried without the risk of
     * executing the operation twice.
     * </p>
     * 
     * @return A unique string that identifies the request and allows failed requests to be retried without the risk of
     *         executing the operation twice.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to be retried without the risk of
     * executing the operation twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and allows failed requests to be retried without the risk of
     *        executing the operation twice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupSelectionRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
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
        if (getBackupPlanId() != null)
            sb.append("BackupPlanId: ").append(getBackupPlanId()).append(",");
        if (getBackupSelection() != null)
            sb.append("BackupSelection: ").append(getBackupSelection()).append(",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackupSelectionRequest == false)
            return false;
        CreateBackupSelectionRequest other = (CreateBackupSelectionRequest) obj;
        if (other.getBackupPlanId() == null ^ this.getBackupPlanId() == null)
            return false;
        if (other.getBackupPlanId() != null && other.getBackupPlanId().equals(this.getBackupPlanId()) == false)
            return false;
        if (other.getBackupSelection() == null ^ this.getBackupSelection() == null)
            return false;
        if (other.getBackupSelection() != null && other.getBackupSelection().equals(this.getBackupSelection()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupPlanId() == null) ? 0 : getBackupPlanId().hashCode());
        hashCode = prime * hashCode + ((getBackupSelection() == null) ? 0 : getBackupSelection().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackupSelectionRequest clone() {
        return (CreateBackupSelectionRequest) super.clone();
    }

}
