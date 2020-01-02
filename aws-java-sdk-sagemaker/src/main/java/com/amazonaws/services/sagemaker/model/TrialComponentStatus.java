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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the trial component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrialComponentStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrialComponentStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the trial component.
     * </p>
     */
    private String primaryStatus;
    /**
     * <p>
     * If the component failed, a message describing why.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The status of the trial component.
     * </p>
     * 
     * @param primaryStatus
     *        The status of the trial component.
     * @see TrialComponentPrimaryStatus
     */

    public void setPrimaryStatus(String primaryStatus) {
        this.primaryStatus = primaryStatus;
    }

    /**
     * <p>
     * The status of the trial component.
     * </p>
     * 
     * @return The status of the trial component.
     * @see TrialComponentPrimaryStatus
     */

    public String getPrimaryStatus() {
        return this.primaryStatus;
    }

    /**
     * <p>
     * The status of the trial component.
     * </p>
     * 
     * @param primaryStatus
     *        The status of the trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrialComponentPrimaryStatus
     */

    public TrialComponentStatus withPrimaryStatus(String primaryStatus) {
        setPrimaryStatus(primaryStatus);
        return this;
    }

    /**
     * <p>
     * The status of the trial component.
     * </p>
     * 
     * @param primaryStatus
     *        The status of the trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrialComponentPrimaryStatus
     */

    public TrialComponentStatus withPrimaryStatus(TrialComponentPrimaryStatus primaryStatus) {
        this.primaryStatus = primaryStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the component failed, a message describing why.
     * </p>
     * 
     * @param message
     *        If the component failed, a message describing why.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * If the component failed, a message describing why.
     * </p>
     * 
     * @return If the component failed, a message describing why.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * If the component failed, a message describing why.
     * </p>
     * 
     * @param message
     *        If the component failed, a message describing why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentStatus withMessage(String message) {
        setMessage(message);
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
        if (getPrimaryStatus() != null)
            sb.append("PrimaryStatus: ").append(getPrimaryStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialComponentStatus == false)
            return false;
        TrialComponentStatus other = (TrialComponentStatus) obj;
        if (other.getPrimaryStatus() == null ^ this.getPrimaryStatus() == null)
            return false;
        if (other.getPrimaryStatus() != null && other.getPrimaryStatus().equals(this.getPrimaryStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimaryStatus() == null) ? 0 : getPrimaryStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public TrialComponentStatus clone() {
        try {
            return (TrialComponentStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrialComponentStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
