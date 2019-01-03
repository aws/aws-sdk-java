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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about the result of an approval request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ApprovalResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApprovalResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The summary of the current status of the approval request.
     * </p>
     */
    private String summary;
    /**
     * <p>
     * The response submitted by a reviewer assigned to an approval action request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The summary of the current status of the approval request.
     * </p>
     * 
     * @param summary
     *        The summary of the current status of the approval request.
     */

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * The summary of the current status of the approval request.
     * </p>
     * 
     * @return The summary of the current status of the approval request.
     */

    public String getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * The summary of the current status of the approval request.
     * </p>
     * 
     * @param summary
     *        The summary of the current status of the approval request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalResult withSummary(String summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * The response submitted by a reviewer assigned to an approval action request.
     * </p>
     * 
     * @param status
     *        The response submitted by a reviewer assigned to an approval action request.
     * @see ApprovalStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The response submitted by a reviewer assigned to an approval action request.
     * </p>
     * 
     * @return The response submitted by a reviewer assigned to an approval action request.
     * @see ApprovalStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The response submitted by a reviewer assigned to an approval action request.
     * </p>
     * 
     * @param status
     *        The response submitted by a reviewer assigned to an approval action request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApprovalStatus
     */

    public ApprovalResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The response submitted by a reviewer assigned to an approval action request.
     * </p>
     * 
     * @param status
     *        The response submitted by a reviewer assigned to an approval action request.
     * @see ApprovalStatus
     */

    public void setStatus(ApprovalStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The response submitted by a reviewer assigned to an approval action request.
     * </p>
     * 
     * @param status
     *        The response submitted by a reviewer assigned to an approval action request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApprovalStatus
     */

    public ApprovalResult withStatus(ApprovalStatus status) {
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
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
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

        if (obj instanceof ApprovalResult == false)
            return false;
        ApprovalResult other = (ApprovalResult) obj;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
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

        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ApprovalResult clone() {
        try {
            return (ApprovalResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ApprovalResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
