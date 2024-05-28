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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/PutRestoreValidationResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRestoreValidationResultRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is a unique identifier of a restore job within Backup.
     * </p>
     */
    private String restoreJobId;
    /**
     * <p>
     * This is the status of your restore validation.
     * </p>
     */
    private String validationStatus;
    /**
     * <p>
     * This is an optional message string you can input to describe the validation status for the restore test
     * validation.
     * </p>
     */
    private String validationStatusMessage;

    /**
     * <p>
     * This is a unique identifier of a restore job within Backup.
     * </p>
     * 
     * @param restoreJobId
     *        This is a unique identifier of a restore job within Backup.
     */

    public void setRestoreJobId(String restoreJobId) {
        this.restoreJobId = restoreJobId;
    }

    /**
     * <p>
     * This is a unique identifier of a restore job within Backup.
     * </p>
     * 
     * @return This is a unique identifier of a restore job within Backup.
     */

    public String getRestoreJobId() {
        return this.restoreJobId;
    }

    /**
     * <p>
     * This is a unique identifier of a restore job within Backup.
     * </p>
     * 
     * @param restoreJobId
     *        This is a unique identifier of a restore job within Backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRestoreValidationResultRequest withRestoreJobId(String restoreJobId) {
        setRestoreJobId(restoreJobId);
        return this;
    }

    /**
     * <p>
     * This is the status of your restore validation.
     * </p>
     * 
     * @param validationStatus
     *        This is the status of your restore validation.
     * @see RestoreValidationStatus
     */

    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    /**
     * <p>
     * This is the status of your restore validation.
     * </p>
     * 
     * @return This is the status of your restore validation.
     * @see RestoreValidationStatus
     */

    public String getValidationStatus() {
        return this.validationStatus;
    }

    /**
     * <p>
     * This is the status of your restore validation.
     * </p>
     * 
     * @param validationStatus
     *        This is the status of your restore validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreValidationStatus
     */

    public PutRestoreValidationResultRequest withValidationStatus(String validationStatus) {
        setValidationStatus(validationStatus);
        return this;
    }

    /**
     * <p>
     * This is the status of your restore validation.
     * </p>
     * 
     * @param validationStatus
     *        This is the status of your restore validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreValidationStatus
     */

    public PutRestoreValidationResultRequest withValidationStatus(RestoreValidationStatus validationStatus) {
        this.validationStatus = validationStatus.toString();
        return this;
    }

    /**
     * <p>
     * This is an optional message string you can input to describe the validation status for the restore test
     * validation.
     * </p>
     * 
     * @param validationStatusMessage
     *        This is an optional message string you can input to describe the validation status for the restore test
     *        validation.
     */

    public void setValidationStatusMessage(String validationStatusMessage) {
        this.validationStatusMessage = validationStatusMessage;
    }

    /**
     * <p>
     * This is an optional message string you can input to describe the validation status for the restore test
     * validation.
     * </p>
     * 
     * @return This is an optional message string you can input to describe the validation status for the restore test
     *         validation.
     */

    public String getValidationStatusMessage() {
        return this.validationStatusMessage;
    }

    /**
     * <p>
     * This is an optional message string you can input to describe the validation status for the restore test
     * validation.
     * </p>
     * 
     * @param validationStatusMessage
     *        This is an optional message string you can input to describe the validation status for the restore test
     *        validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRestoreValidationResultRequest withValidationStatusMessage(String validationStatusMessage) {
        setValidationStatusMessage(validationStatusMessage);
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
        if (getRestoreJobId() != null)
            sb.append("RestoreJobId: ").append(getRestoreJobId()).append(",");
        if (getValidationStatus() != null)
            sb.append("ValidationStatus: ").append(getValidationStatus()).append(",");
        if (getValidationStatusMessage() != null)
            sb.append("ValidationStatusMessage: ").append(getValidationStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRestoreValidationResultRequest == false)
            return false;
        PutRestoreValidationResultRequest other = (PutRestoreValidationResultRequest) obj;
        if (other.getRestoreJobId() == null ^ this.getRestoreJobId() == null)
            return false;
        if (other.getRestoreJobId() != null && other.getRestoreJobId().equals(this.getRestoreJobId()) == false)
            return false;
        if (other.getValidationStatus() == null ^ this.getValidationStatus() == null)
            return false;
        if (other.getValidationStatus() != null && other.getValidationStatus().equals(this.getValidationStatus()) == false)
            return false;
        if (other.getValidationStatusMessage() == null ^ this.getValidationStatusMessage() == null)
            return false;
        if (other.getValidationStatusMessage() != null && other.getValidationStatusMessage().equals(this.getValidationStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestoreJobId() == null) ? 0 : getRestoreJobId().hashCode());
        hashCode = prime * hashCode + ((getValidationStatus() == null) ? 0 : getValidationStatus().hashCode());
        hashCode = prime * hashCode + ((getValidationStatusMessage() == null) ? 0 : getValidationStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public PutRestoreValidationResultRequest clone() {
        return (PutRestoreValidationResultRequest) super.clone();
    }

}
