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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the Source Network recovery Lifecycle.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/RecoveryLifeCycle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryLifeCycle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time the last Source Network recovery was initiated.
     * </p>
     */
    private java.util.Date apiCallDateTime;
    /**
     * <p>
     * The ID of the Job that was used to last recover the Source Network.
     * </p>
     */
    private String jobID;
    /**
     * <p>
     * The status of the last recovery status of this Source Network.
     * </p>
     */
    private String lastRecoveryResult;

    /**
     * <p>
     * The date and time the last Source Network recovery was initiated.
     * </p>
     * 
     * @param apiCallDateTime
     *        The date and time the last Source Network recovery was initiated.
     */

    public void setApiCallDateTime(java.util.Date apiCallDateTime) {
        this.apiCallDateTime = apiCallDateTime;
    }

    /**
     * <p>
     * The date and time the last Source Network recovery was initiated.
     * </p>
     * 
     * @return The date and time the last Source Network recovery was initiated.
     */

    public java.util.Date getApiCallDateTime() {
        return this.apiCallDateTime;
    }

    /**
     * <p>
     * The date and time the last Source Network recovery was initiated.
     * </p>
     * 
     * @param apiCallDateTime
     *        The date and time the last Source Network recovery was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryLifeCycle withApiCallDateTime(java.util.Date apiCallDateTime) {
        setApiCallDateTime(apiCallDateTime);
        return this;
    }

    /**
     * <p>
     * The ID of the Job that was used to last recover the Source Network.
     * </p>
     * 
     * @param jobID
     *        The ID of the Job that was used to last recover the Source Network.
     */

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    /**
     * <p>
     * The ID of the Job that was used to last recover the Source Network.
     * </p>
     * 
     * @return The ID of the Job that was used to last recover the Source Network.
     */

    public String getJobID() {
        return this.jobID;
    }

    /**
     * <p>
     * The ID of the Job that was used to last recover the Source Network.
     * </p>
     * 
     * @param jobID
     *        The ID of the Job that was used to last recover the Source Network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryLifeCycle withJobID(String jobID) {
        setJobID(jobID);
        return this;
    }

    /**
     * <p>
     * The status of the last recovery status of this Source Network.
     * </p>
     * 
     * @param lastRecoveryResult
     *        The status of the last recovery status of this Source Network.
     * @see RecoveryResult
     */

    public void setLastRecoveryResult(String lastRecoveryResult) {
        this.lastRecoveryResult = lastRecoveryResult;
    }

    /**
     * <p>
     * The status of the last recovery status of this Source Network.
     * </p>
     * 
     * @return The status of the last recovery status of this Source Network.
     * @see RecoveryResult
     */

    public String getLastRecoveryResult() {
        return this.lastRecoveryResult;
    }

    /**
     * <p>
     * The status of the last recovery status of this Source Network.
     * </p>
     * 
     * @param lastRecoveryResult
     *        The status of the last recovery status of this Source Network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecoveryResult
     */

    public RecoveryLifeCycle withLastRecoveryResult(String lastRecoveryResult) {
        setLastRecoveryResult(lastRecoveryResult);
        return this;
    }

    /**
     * <p>
     * The status of the last recovery status of this Source Network.
     * </p>
     * 
     * @param lastRecoveryResult
     *        The status of the last recovery status of this Source Network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecoveryResult
     */

    public RecoveryLifeCycle withLastRecoveryResult(RecoveryResult lastRecoveryResult) {
        this.lastRecoveryResult = lastRecoveryResult.toString();
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
        if (getApiCallDateTime() != null)
            sb.append("ApiCallDateTime: ").append(getApiCallDateTime()).append(",");
        if (getJobID() != null)
            sb.append("JobID: ").append(getJobID()).append(",");
        if (getLastRecoveryResult() != null)
            sb.append("LastRecoveryResult: ").append(getLastRecoveryResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryLifeCycle == false)
            return false;
        RecoveryLifeCycle other = (RecoveryLifeCycle) obj;
        if (other.getApiCallDateTime() == null ^ this.getApiCallDateTime() == null)
            return false;
        if (other.getApiCallDateTime() != null && other.getApiCallDateTime().equals(this.getApiCallDateTime()) == false)
            return false;
        if (other.getJobID() == null ^ this.getJobID() == null)
            return false;
        if (other.getJobID() != null && other.getJobID().equals(this.getJobID()) == false)
            return false;
        if (other.getLastRecoveryResult() == null ^ this.getLastRecoveryResult() == null)
            return false;
        if (other.getLastRecoveryResult() != null && other.getLastRecoveryResult().equals(this.getLastRecoveryResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiCallDateTime() == null) ? 0 : getApiCallDateTime().hashCode());
        hashCode = prime * hashCode + ((getJobID() == null) ? 0 : getJobID().hashCode());
        hashCode = prime * hashCode + ((getLastRecoveryResult() == null) ? 0 : getLastRecoveryResult().hashCode());
        return hashCode;
    }

    @Override
    public RecoveryLifeCycle clone() {
        try {
            return (RecoveryLifeCycle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.RecoveryLifeCycleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
