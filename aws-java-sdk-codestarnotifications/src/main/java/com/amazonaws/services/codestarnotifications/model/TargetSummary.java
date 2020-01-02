/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codestarnotifications.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the targets specified for a notification rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/TargetSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic.
     * </p>
     */
    private String targetAddress;
    /**
     * <p>
     * The type of the target (for example, SNS).
     * </p>
     */
    private String targetType;
    /**
     * <p>
     * The status of the target.
     * </p>
     */
    private String targetStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic.
     * </p>
     * 
     * @param targetAddress
     *        The Amazon Resource Name (ARN) of the SNS topic.
     */

    public void setTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SNS topic.
     */

    public String getTargetAddress() {
        return this.targetAddress;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic.
     * </p>
     * 
     * @param targetAddress
     *        The Amazon Resource Name (ARN) of the SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetSummary withTargetAddress(String targetAddress) {
        setTargetAddress(targetAddress);
        return this;
    }

    /**
     * <p>
     * The type of the target (for example, SNS).
     * </p>
     * 
     * @param targetType
     *        The type of the target (for example, SNS).
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The type of the target (for example, SNS).
     * </p>
     * 
     * @return The type of the target (for example, SNS).
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The type of the target (for example, SNS).
     * </p>
     * 
     * @param targetType
     *        The type of the target (for example, SNS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetSummary withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The status of the target.
     * </p>
     * 
     * @param targetStatus
     *        The status of the target.
     * @see TargetStatus
     */

    public void setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
    }

    /**
     * <p>
     * The status of the target.
     * </p>
     * 
     * @return The status of the target.
     * @see TargetStatus
     */

    public String getTargetStatus() {
        return this.targetStatus;
    }

    /**
     * <p>
     * The status of the target.
     * </p>
     * 
     * @param targetStatus
     *        The status of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetStatus
     */

    public TargetSummary withTargetStatus(String targetStatus) {
        setTargetStatus(targetStatus);
        return this;
    }

    /**
     * <p>
     * The status of the target.
     * </p>
     * 
     * @param targetStatus
     *        The status of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetStatus
     */

    public TargetSummary withTargetStatus(TargetStatus targetStatus) {
        this.targetStatus = targetStatus.toString();
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
        if (getTargetAddress() != null)
            sb.append("TargetAddress: ").append("***Sensitive Data Redacted***").append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType()).append(",");
        if (getTargetStatus() != null)
            sb.append("TargetStatus: ").append(getTargetStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetSummary == false)
            return false;
        TargetSummary other = (TargetSummary) obj;
        if (other.getTargetAddress() == null ^ this.getTargetAddress() == null)
            return false;
        if (other.getTargetAddress() != null && other.getTargetAddress().equals(this.getTargetAddress()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getTargetStatus() == null ^ this.getTargetStatus() == null)
            return false;
        if (other.getTargetStatus() != null && other.getTargetStatus().equals(this.getTargetStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetAddress() == null) ? 0 : getTargetAddress().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getTargetStatus() == null) ? 0 : getTargetStatus().hashCode());
        return hashCode;
    }

    @Override
    public TargetSummary clone() {
        try {
            return (TargetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestarnotifications.model.transform.TargetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
