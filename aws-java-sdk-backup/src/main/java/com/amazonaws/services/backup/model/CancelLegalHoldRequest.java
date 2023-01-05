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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CancelLegalHold" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelLegalHoldRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Legal hold ID required to remove the specified legal hold on a recovery point.
     * </p>
     */
    private String legalHoldId;
    /**
     * <p>
     * String describing the reason for removing the legal hold.
     * </p>
     */
    private String cancelDescription;
    /**
     * <p>
     * The integer amount in days specifying amount of days after this API operation to remove legal hold.
     * </p>
     */
    private Long retainRecordInDays;

    /**
     * <p>
     * Legal hold ID required to remove the specified legal hold on a recovery point.
     * </p>
     * 
     * @param legalHoldId
     *        Legal hold ID required to remove the specified legal hold on a recovery point.
     */

    public void setLegalHoldId(String legalHoldId) {
        this.legalHoldId = legalHoldId;
    }

    /**
     * <p>
     * Legal hold ID required to remove the specified legal hold on a recovery point.
     * </p>
     * 
     * @return Legal hold ID required to remove the specified legal hold on a recovery point.
     */

    public String getLegalHoldId() {
        return this.legalHoldId;
    }

    /**
     * <p>
     * Legal hold ID required to remove the specified legal hold on a recovery point.
     * </p>
     * 
     * @param legalHoldId
     *        Legal hold ID required to remove the specified legal hold on a recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelLegalHoldRequest withLegalHoldId(String legalHoldId) {
        setLegalHoldId(legalHoldId);
        return this;
    }

    /**
     * <p>
     * String describing the reason for removing the legal hold.
     * </p>
     * 
     * @param cancelDescription
     *        String describing the reason for removing the legal hold.
     */

    public void setCancelDescription(String cancelDescription) {
        this.cancelDescription = cancelDescription;
    }

    /**
     * <p>
     * String describing the reason for removing the legal hold.
     * </p>
     * 
     * @return String describing the reason for removing the legal hold.
     */

    public String getCancelDescription() {
        return this.cancelDescription;
    }

    /**
     * <p>
     * String describing the reason for removing the legal hold.
     * </p>
     * 
     * @param cancelDescription
     *        String describing the reason for removing the legal hold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelLegalHoldRequest withCancelDescription(String cancelDescription) {
        setCancelDescription(cancelDescription);
        return this;
    }

    /**
     * <p>
     * The integer amount in days specifying amount of days after this API operation to remove legal hold.
     * </p>
     * 
     * @param retainRecordInDays
     *        The integer amount in days specifying amount of days after this API operation to remove legal hold.
     */

    public void setRetainRecordInDays(Long retainRecordInDays) {
        this.retainRecordInDays = retainRecordInDays;
    }

    /**
     * <p>
     * The integer amount in days specifying amount of days after this API operation to remove legal hold.
     * </p>
     * 
     * @return The integer amount in days specifying amount of days after this API operation to remove legal hold.
     */

    public Long getRetainRecordInDays() {
        return this.retainRecordInDays;
    }

    /**
     * <p>
     * The integer amount in days specifying amount of days after this API operation to remove legal hold.
     * </p>
     * 
     * @param retainRecordInDays
     *        The integer amount in days specifying amount of days after this API operation to remove legal hold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelLegalHoldRequest withRetainRecordInDays(Long retainRecordInDays) {
        setRetainRecordInDays(retainRecordInDays);
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
        if (getLegalHoldId() != null)
            sb.append("LegalHoldId: ").append(getLegalHoldId()).append(",");
        if (getCancelDescription() != null)
            sb.append("CancelDescription: ").append(getCancelDescription()).append(",");
        if (getRetainRecordInDays() != null)
            sb.append("RetainRecordInDays: ").append(getRetainRecordInDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelLegalHoldRequest == false)
            return false;
        CancelLegalHoldRequest other = (CancelLegalHoldRequest) obj;
        if (other.getLegalHoldId() == null ^ this.getLegalHoldId() == null)
            return false;
        if (other.getLegalHoldId() != null && other.getLegalHoldId().equals(this.getLegalHoldId()) == false)
            return false;
        if (other.getCancelDescription() == null ^ this.getCancelDescription() == null)
            return false;
        if (other.getCancelDescription() != null && other.getCancelDescription().equals(this.getCancelDescription()) == false)
            return false;
        if (other.getRetainRecordInDays() == null ^ this.getRetainRecordInDays() == null)
            return false;
        if (other.getRetainRecordInDays() != null && other.getRetainRecordInDays().equals(this.getRetainRecordInDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLegalHoldId() == null) ? 0 : getLegalHoldId().hashCode());
        hashCode = prime * hashCode + ((getCancelDescription() == null) ? 0 : getCancelDescription().hashCode());
        hashCode = prime * hashCode + ((getRetainRecordInDays() == null) ? 0 : getRetainRecordInDays().hashCode());
        return hashCode;
    }

    @Override
    public CancelLegalHoldRequest clone() {
        return (CancelLegalHoldRequest) super.clone();
    }

}
