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
 * The model deployment settings for the SageMaker Canvas application.
 * </p>
 * <note>
 * <p>
 * In order to enable model deployment for Canvas, the SageMaker Domain's or user profile's Amazon Web Services IAM
 * execution role must have the <code>AmazonSageMakerCanvasDirectDeployAccess</code> policy attached. You can also turn
 * on model deployment permissions through the SageMaker Domain's or user profile's settings in the SageMaker console.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DirectDeploySettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectDeploySettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes whether model deployment permissions are enabled or disabled in the Canvas application.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Describes whether model deployment permissions are enabled or disabled in the Canvas application.
     * </p>
     * 
     * @param status
     *        Describes whether model deployment permissions are enabled or disabled in the Canvas application.
     * @see FeatureStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes whether model deployment permissions are enabled or disabled in the Canvas application.
     * </p>
     * 
     * @return Describes whether model deployment permissions are enabled or disabled in the Canvas application.
     * @see FeatureStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Describes whether model deployment permissions are enabled or disabled in the Canvas application.
     * </p>
     * 
     * @param status
     *        Describes whether model deployment permissions are enabled or disabled in the Canvas application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public DirectDeploySettings withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Describes whether model deployment permissions are enabled or disabled in the Canvas application.
     * </p>
     * 
     * @param status
     *        Describes whether model deployment permissions are enabled or disabled in the Canvas application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public DirectDeploySettings withStatus(FeatureStatus status) {
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

        if (obj instanceof DirectDeploySettings == false)
            return false;
        DirectDeploySettings other = (DirectDeploySettings) obj;
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

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DirectDeploySettings clone() {
        try {
            return (DirectDeploySettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DirectDeploySettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
