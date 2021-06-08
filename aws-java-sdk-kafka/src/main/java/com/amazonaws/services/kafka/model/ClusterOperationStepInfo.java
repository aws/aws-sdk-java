/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * State information about the operation step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ClusterOperationStepInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterOperationStepInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The steps current status.
     * </p>
     */
    private String stepStatus;

    /**
     * <p>
     * The steps current status.
     * </p>
     * 
     * @param stepStatus
     *        <p>
     *        The steps current status.
     *        </p>
     */

    public void setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
    }

    /**
     * <p>
     * The steps current status.
     * </p>
     * 
     * @return <p>
     *         The steps current status.
     *         </p>
     */

    public String getStepStatus() {
        return this.stepStatus;
    }

    /**
     * <p>
     * The steps current status.
     * </p>
     * 
     * @param stepStatus
     *        <p>
     *        The steps current status.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationStepInfo withStepStatus(String stepStatus) {
        setStepStatus(stepStatus);
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
        if (getStepStatus() != null)
            sb.append("StepStatus: ").append(getStepStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterOperationStepInfo == false)
            return false;
        ClusterOperationStepInfo other = (ClusterOperationStepInfo) obj;
        if (other.getStepStatus() == null ^ this.getStepStatus() == null)
            return false;
        if (other.getStepStatus() != null && other.getStepStatus().equals(this.getStepStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepStatus() == null) ? 0 : getStepStatus().hashCode());
        return hashCode;
    }

    @Override
    public ClusterOperationStepInfo clone() {
        try {
            return (ClusterOperationStepInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ClusterOperationStepInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
