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
package com.amazonaws.services.sagemakeredgemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/GetDeployments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of the configurations of the active deployments on the device.
     * </p>
     */
    private java.util.List<EdgeDeployment> deployments;

    /**
     * <p>
     * Returns a list of the configurations of the active deployments on the device.
     * </p>
     * 
     * @return Returns a list of the configurations of the active deployments on the device.
     */

    public java.util.List<EdgeDeployment> getDeployments() {
        return deployments;
    }

    /**
     * <p>
     * Returns a list of the configurations of the active deployments on the device.
     * </p>
     * 
     * @param deployments
     *        Returns a list of the configurations of the active deployments on the device.
     */

    public void setDeployments(java.util.Collection<EdgeDeployment> deployments) {
        if (deployments == null) {
            this.deployments = null;
            return;
        }

        this.deployments = new java.util.ArrayList<EdgeDeployment>(deployments);
    }

    /**
     * <p>
     * Returns a list of the configurations of the active deployments on the device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeployments(java.util.Collection)} or {@link #withDeployments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deployments
     *        Returns a list of the configurations of the active deployments on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentsResult withDeployments(EdgeDeployment... deployments) {
        if (this.deployments == null) {
            setDeployments(new java.util.ArrayList<EdgeDeployment>(deployments.length));
        }
        for (EdgeDeployment ele : deployments) {
            this.deployments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of the configurations of the active deployments on the device.
     * </p>
     * 
     * @param deployments
     *        Returns a list of the configurations of the active deployments on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentsResult withDeployments(java.util.Collection<EdgeDeployment> deployments) {
        setDeployments(deployments);
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
        if (getDeployments() != null)
            sb.append("Deployments: ").append(getDeployments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentsResult == false)
            return false;
        GetDeploymentsResult other = (GetDeploymentsResult) obj;
        if (other.getDeployments() == null ^ this.getDeployments() == null)
            return false;
        if (other.getDeployments() != null && other.getDeployments().equals(this.getDeployments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeployments() == null) ? 0 : getDeployments().hashCode());
        return hashCode;
    }

    @Override
    public GetDeploymentsResult clone() {
        try {
            return (GetDeploymentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
