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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A value that indicates whether the update was successful.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LastUpdateStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LastUpdateStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value that indicates whether the update was made successful.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If the update wasn't successful, indicates the reason why it failed.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * A value that indicates whether the update was made successful.
     * </p>
     * 
     * @param status
     *        A value that indicates whether the update was made successful.
     * @see LastUpdateStatusValue
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A value that indicates whether the update was made successful.
     * </p>
     * 
     * @return A value that indicates whether the update was made successful.
     * @see LastUpdateStatusValue
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A value that indicates whether the update was made successful.
     * </p>
     * 
     * @param status
     *        A value that indicates whether the update was made successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastUpdateStatusValue
     */

    public LastUpdateStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the update was made successful.
     * </p>
     * 
     * @param status
     *        A value that indicates whether the update was made successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastUpdateStatusValue
     */

    public LastUpdateStatus withStatus(LastUpdateStatusValue status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the update wasn't successful, indicates the reason why it failed.
     * </p>
     * 
     * @param failureReason
     *        If the update wasn't successful, indicates the reason why it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the update wasn't successful, indicates the reason why it failed.
     * </p>
     * 
     * @return If the update wasn't successful, indicates the reason why it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the update wasn't successful, indicates the reason why it failed.
     * </p>
     * 
     * @param failureReason
     *        If the update wasn't successful, indicates the reason why it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastUpdateStatus withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LastUpdateStatus == false)
            return false;
        LastUpdateStatus other = (LastUpdateStatus) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public LastUpdateStatus clone() {
        try {
            return (LastUpdateStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LastUpdateStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
