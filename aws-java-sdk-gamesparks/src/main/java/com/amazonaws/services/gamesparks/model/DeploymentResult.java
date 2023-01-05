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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result of the deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/DeploymentResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the deployment result.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The type of deployment result.
     * </p>
     */
    private String resultCode;

    /**
     * <p>
     * Details about the deployment result.
     * </p>
     * 
     * @param message
     *        Details about the deployment result.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Details about the deployment result.
     * </p>
     * 
     * @return Details about the deployment result.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Details about the deployment result.
     * </p>
     * 
     * @param message
     *        Details about the deployment result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The type of deployment result.
     * </p>
     * 
     * @param resultCode
     *        The type of deployment result.
     * @see ResultCode
     */

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * <p>
     * The type of deployment result.
     * </p>
     * 
     * @return The type of deployment result.
     * @see ResultCode
     */

    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * <p>
     * The type of deployment result.
     * </p>
     * 
     * @param resultCode
     *        The type of deployment result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResultCode
     */

    public DeploymentResult withResultCode(String resultCode) {
        setResultCode(resultCode);
        return this;
    }

    /**
     * <p>
     * The type of deployment result.
     * </p>
     * 
     * @param resultCode
     *        The type of deployment result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResultCode
     */

    public DeploymentResult withResultCode(ResultCode resultCode) {
        this.resultCode = resultCode.toString();
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getResultCode() != null)
            sb.append("ResultCode: ").append(getResultCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentResult == false)
            return false;
        DeploymentResult other = (DeploymentResult) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getResultCode() == null ^ this.getResultCode() == null)
            return false;
        if (other.getResultCode() != null && other.getResultCode().equals(this.getResultCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getResultCode() == null) ? 0 : getResultCode().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentResult clone() {
        try {
            return (DeploymentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamesparks.model.transform.DeploymentResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
