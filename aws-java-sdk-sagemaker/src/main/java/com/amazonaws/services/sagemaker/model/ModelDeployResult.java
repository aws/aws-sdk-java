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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the endpoint of the model deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelDeployResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelDeployResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the endpoint to which the model has been deployed.
     * </p>
     * <note>
     * <p>
     * If model deployment fails, this field is omitted from the response.
     * </p>
     * </note>
     */
    private String endpointName;

    /**
     * <p>
     * The name of the endpoint to which the model has been deployed.
     * </p>
     * <note>
     * <p>
     * If model deployment fails, this field is omitted from the response.
     * </p>
     * </note>
     * 
     * @param endpointName
     *        The name of the endpoint to which the model has been deployed.</p> <note>
     *        <p>
     *        If model deployment fails, this field is omitted from the response.
     *        </p>
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint to which the model has been deployed.
     * </p>
     * <note>
     * <p>
     * If model deployment fails, this field is omitted from the response.
     * </p>
     * </note>
     * 
     * @return The name of the endpoint to which the model has been deployed.</p> <note>
     *         <p>
     *         If model deployment fails, this field is omitted from the response.
     *         </p>
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the endpoint to which the model has been deployed.
     * </p>
     * <note>
     * <p>
     * If model deployment fails, this field is omitted from the response.
     * </p>
     * </note>
     * 
     * @param endpointName
     *        The name of the endpoint to which the model has been deployed.</p> <note>
     *        <p>
     *        If model deployment fails, this field is omitted from the response.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDeployResult withEndpointName(String endpointName) {
        setEndpointName(endpointName);
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelDeployResult == false)
            return false;
        ModelDeployResult other = (ModelDeployResult) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        return hashCode;
    }

    @Override
    public ModelDeployResult clone() {
        try {
            return (ModelDeployResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelDeployResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
