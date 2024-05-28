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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for remote debugging for the <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_UpdateTrainingJob.html">UpdateTrainingJob</a>
 * API. To learn more about the remote debugging functionality of SageMaker, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-remote-debugging.html">Access a training container
 * through Amazon Web Services Systems Manager (SSM) for remote debugging</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RemoteDebugConfigForUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoteDebugConfigForUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If set to True, enables remote debugging.
     * </p>
     */
    private Boolean enableRemoteDebug;

    /**
     * <p>
     * If set to True, enables remote debugging.
     * </p>
     * 
     * @param enableRemoteDebug
     *        If set to True, enables remote debugging.
     */

    public void setEnableRemoteDebug(Boolean enableRemoteDebug) {
        this.enableRemoteDebug = enableRemoteDebug;
    }

    /**
     * <p>
     * If set to True, enables remote debugging.
     * </p>
     * 
     * @return If set to True, enables remote debugging.
     */

    public Boolean getEnableRemoteDebug() {
        return this.enableRemoteDebug;
    }

    /**
     * <p>
     * If set to True, enables remote debugging.
     * </p>
     * 
     * @param enableRemoteDebug
     *        If set to True, enables remote debugging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteDebugConfigForUpdate withEnableRemoteDebug(Boolean enableRemoteDebug) {
        setEnableRemoteDebug(enableRemoteDebug);
        return this;
    }

    /**
     * <p>
     * If set to True, enables remote debugging.
     * </p>
     * 
     * @return If set to True, enables remote debugging.
     */

    public Boolean isEnableRemoteDebug() {
        return this.enableRemoteDebug;
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
        if (getEnableRemoteDebug() != null)
            sb.append("EnableRemoteDebug: ").append(getEnableRemoteDebug());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoteDebugConfigForUpdate == false)
            return false;
        RemoteDebugConfigForUpdate other = (RemoteDebugConfigForUpdate) obj;
        if (other.getEnableRemoteDebug() == null ^ this.getEnableRemoteDebug() == null)
            return false;
        if (other.getEnableRemoteDebug() != null && other.getEnableRemoteDebug().equals(this.getEnableRemoteDebug()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableRemoteDebug() == null) ? 0 : getEnableRemoteDebug().hashCode());
        return hashCode;
    }

    @Override
    public RemoteDebugConfigForUpdate clone() {
        try {
            return (RemoteDebugConfigForUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RemoteDebugConfigForUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
