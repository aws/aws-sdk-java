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
package com.amazonaws.services.connectcampaign.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Instance onboarding job status object
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/InstanceOnboardingJobStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceOnboardingJobStatus implements Serializable, Cloneable, StructuredPojo {

    private String connectInstanceId;

    private String failureCode;

    private String status;

    /**
     * @param connectInstanceId
     */

    public void setConnectInstanceId(String connectInstanceId) {
        this.connectInstanceId = connectInstanceId;
    }

    /**
     * @return
     */

    public String getConnectInstanceId() {
        return this.connectInstanceId;
    }

    /**
     * @param connectInstanceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceOnboardingJobStatus withConnectInstanceId(String connectInstanceId) {
        setConnectInstanceId(connectInstanceId);
        return this;
    }

    /**
     * @param failureCode
     * @see InstanceOnboardingJobFailureCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * @return
     * @see InstanceOnboardingJobFailureCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * @param failureCode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceOnboardingJobFailureCode
     */

    public InstanceOnboardingJobStatus withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * @param failureCode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceOnboardingJobFailureCode
     */

    public InstanceOnboardingJobStatus withFailureCode(InstanceOnboardingJobFailureCode failureCode) {
        this.failureCode = failureCode.toString();
        return this;
    }

    /**
     * @param status
     * @see InstanceOnboardingJobStatusCode
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     * @see InstanceOnboardingJobStatusCode
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceOnboardingJobStatusCode
     */

    public InstanceOnboardingJobStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceOnboardingJobStatusCode
     */

    public InstanceOnboardingJobStatus withStatus(InstanceOnboardingJobStatusCode status) {
        this.status = status.toString();
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
        if (getConnectInstanceId() != null)
            sb.append("ConnectInstanceId: ").append(getConnectInstanceId()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceOnboardingJobStatus == false)
            return false;
        InstanceOnboardingJobStatus other = (InstanceOnboardingJobStatus) obj;
        if (other.getConnectInstanceId() == null ^ this.getConnectInstanceId() == null)
            return false;
        if (other.getConnectInstanceId() != null && other.getConnectInstanceId().equals(this.getConnectInstanceId()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectInstanceId() == null) ? 0 : getConnectInstanceId().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public InstanceOnboardingJobStatus clone() {
        try {
            return (InstanceOnboardingJobStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcampaign.model.transform.InstanceOnboardingJobStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
