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
 * Specifies how to generate the endpoint name for an automatic one-click Autopilot model deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelDeployConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelDeployConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Set to <code>True</code> to automatically generate an endpoint name for a one-click Autopilot model deployment;
     * set to <code>False</code> otherwise. The default value is <code>False</code>.
     * </p>
     * <note>
     * <p>
     * If you set <code>AutoGenerateEndpointName</code> to <code>True</code>, do not specify the
     * <code>EndpointName</code>; otherwise a 400 error is thrown.
     * </p>
     * </note>
     */
    private Boolean autoGenerateEndpointName;
    /**
     * <p>
     * Specifies the endpoint name to use for a one-click Autopilot model deployment if the endpoint name is not
     * generated automatically.
     * </p>
     * <note>
     * <p>
     * Specify the <code>EndpointName</code> if and only if you set <code>AutoGenerateEndpointName</code> to
     * <code>False</code>; otherwise a 400 error is thrown.
     * </p>
     * </note>
     */
    private String endpointName;

    /**
     * <p>
     * Set to <code>True</code> to automatically generate an endpoint name for a one-click Autopilot model deployment;
     * set to <code>False</code> otherwise. The default value is <code>False</code>.
     * </p>
     * <note>
     * <p>
     * If you set <code>AutoGenerateEndpointName</code> to <code>True</code>, do not specify the
     * <code>EndpointName</code>; otherwise a 400 error is thrown.
     * </p>
     * </note>
     * 
     * @param autoGenerateEndpointName
     *        Set to <code>True</code> to automatically generate an endpoint name for a one-click Autopilot model
     *        deployment; set to <code>False</code> otherwise. The default value is <code>False</code>.</p> <note>
     *        <p>
     *        If you set <code>AutoGenerateEndpointName</code> to <code>True</code>, do not specify the
     *        <code>EndpointName</code>; otherwise a 400 error is thrown.
     *        </p>
     */

    public void setAutoGenerateEndpointName(Boolean autoGenerateEndpointName) {
        this.autoGenerateEndpointName = autoGenerateEndpointName;
    }

    /**
     * <p>
     * Set to <code>True</code> to automatically generate an endpoint name for a one-click Autopilot model deployment;
     * set to <code>False</code> otherwise. The default value is <code>False</code>.
     * </p>
     * <note>
     * <p>
     * If you set <code>AutoGenerateEndpointName</code> to <code>True</code>, do not specify the
     * <code>EndpointName</code>; otherwise a 400 error is thrown.
     * </p>
     * </note>
     * 
     * @return Set to <code>True</code> to automatically generate an endpoint name for a one-click Autopilot model
     *         deployment; set to <code>False</code> otherwise. The default value is <code>False</code>.</p> <note>
     *         <p>
     *         If you set <code>AutoGenerateEndpointName</code> to <code>True</code>, do not specify the
     *         <code>EndpointName</code>; otherwise a 400 error is thrown.
     *         </p>
     */

    public Boolean getAutoGenerateEndpointName() {
        return this.autoGenerateEndpointName;
    }

    /**
     * <p>
     * Set to <code>True</code> to automatically generate an endpoint name for a one-click Autopilot model deployment;
     * set to <code>False</code> otherwise. The default value is <code>False</code>.
     * </p>
     * <note>
     * <p>
     * If you set <code>AutoGenerateEndpointName</code> to <code>True</code>, do not specify the
     * <code>EndpointName</code>; otherwise a 400 error is thrown.
     * </p>
     * </note>
     * 
     * @param autoGenerateEndpointName
     *        Set to <code>True</code> to automatically generate an endpoint name for a one-click Autopilot model
     *        deployment; set to <code>False</code> otherwise. The default value is <code>False</code>.</p> <note>
     *        <p>
     *        If you set <code>AutoGenerateEndpointName</code> to <code>True</code>, do not specify the
     *        <code>EndpointName</code>; otherwise a 400 error is thrown.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDeployConfig withAutoGenerateEndpointName(Boolean autoGenerateEndpointName) {
        setAutoGenerateEndpointName(autoGenerateEndpointName);
        return this;
    }

    /**
     * <p>
     * Set to <code>True</code> to automatically generate an endpoint name for a one-click Autopilot model deployment;
     * set to <code>False</code> otherwise. The default value is <code>False</code>.
     * </p>
     * <note>
     * <p>
     * If you set <code>AutoGenerateEndpointName</code> to <code>True</code>, do not specify the
     * <code>EndpointName</code>; otherwise a 400 error is thrown.
     * </p>
     * </note>
     * 
     * @return Set to <code>True</code> to automatically generate an endpoint name for a one-click Autopilot model
     *         deployment; set to <code>False</code> otherwise. The default value is <code>False</code>.</p> <note>
     *         <p>
     *         If you set <code>AutoGenerateEndpointName</code> to <code>True</code>, do not specify the
     *         <code>EndpointName</code>; otherwise a 400 error is thrown.
     *         </p>
     */

    public Boolean isAutoGenerateEndpointName() {
        return this.autoGenerateEndpointName;
    }

    /**
     * <p>
     * Specifies the endpoint name to use for a one-click Autopilot model deployment if the endpoint name is not
     * generated automatically.
     * </p>
     * <note>
     * <p>
     * Specify the <code>EndpointName</code> if and only if you set <code>AutoGenerateEndpointName</code> to
     * <code>False</code>; otherwise a 400 error is thrown.
     * </p>
     * </note>
     * 
     * @param endpointName
     *        Specifies the endpoint name to use for a one-click Autopilot model deployment if the endpoint name is not
     *        generated automatically.</p> <note>
     *        <p>
     *        Specify the <code>EndpointName</code> if and only if you set <code>AutoGenerateEndpointName</code> to
     *        <code>False</code>; otherwise a 400 error is thrown.
     *        </p>
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * Specifies the endpoint name to use for a one-click Autopilot model deployment if the endpoint name is not
     * generated automatically.
     * </p>
     * <note>
     * <p>
     * Specify the <code>EndpointName</code> if and only if you set <code>AutoGenerateEndpointName</code> to
     * <code>False</code>; otherwise a 400 error is thrown.
     * </p>
     * </note>
     * 
     * @return Specifies the endpoint name to use for a one-click Autopilot model deployment if the endpoint name is not
     *         generated automatically.</p> <note>
     *         <p>
     *         Specify the <code>EndpointName</code> if and only if you set <code>AutoGenerateEndpointName</code> to
     *         <code>False</code>; otherwise a 400 error is thrown.
     *         </p>
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * Specifies the endpoint name to use for a one-click Autopilot model deployment if the endpoint name is not
     * generated automatically.
     * </p>
     * <note>
     * <p>
     * Specify the <code>EndpointName</code> if and only if you set <code>AutoGenerateEndpointName</code> to
     * <code>False</code>; otherwise a 400 error is thrown.
     * </p>
     * </note>
     * 
     * @param endpointName
     *        Specifies the endpoint name to use for a one-click Autopilot model deployment if the endpoint name is not
     *        generated automatically.</p> <note>
     *        <p>
     *        Specify the <code>EndpointName</code> if and only if you set <code>AutoGenerateEndpointName</code> to
     *        <code>False</code>; otherwise a 400 error is thrown.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDeployConfig withEndpointName(String endpointName) {
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
        if (getAutoGenerateEndpointName() != null)
            sb.append("AutoGenerateEndpointName: ").append(getAutoGenerateEndpointName()).append(",");
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

        if (obj instanceof ModelDeployConfig == false)
            return false;
        ModelDeployConfig other = (ModelDeployConfig) obj;
        if (other.getAutoGenerateEndpointName() == null ^ this.getAutoGenerateEndpointName() == null)
            return false;
        if (other.getAutoGenerateEndpointName() != null && other.getAutoGenerateEndpointName().equals(this.getAutoGenerateEndpointName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getAutoGenerateEndpointName() == null) ? 0 : getAutoGenerateEndpointName().hashCode());
        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        return hashCode;
    }

    @Override
    public ModelDeployConfig clone() {
        try {
            return (ModelDeployConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelDeployConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
