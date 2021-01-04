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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServiceDeployments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContainerServiceDeploymentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array of objects that describe deployments for a container service.
     * </p>
     */
    private java.util.List<ContainerServiceDeployment> deployments;

    /**
     * <p>
     * An array of objects that describe deployments for a container service.
     * </p>
     * 
     * @return An array of objects that describe deployments for a container service.
     */

    public java.util.List<ContainerServiceDeployment> getDeployments() {
        return deployments;
    }

    /**
     * <p>
     * An array of objects that describe deployments for a container service.
     * </p>
     * 
     * @param deployments
     *        An array of objects that describe deployments for a container service.
     */

    public void setDeployments(java.util.Collection<ContainerServiceDeployment> deployments) {
        if (deployments == null) {
            this.deployments = null;
            return;
        }

        this.deployments = new java.util.ArrayList<ContainerServiceDeployment>(deployments);
    }

    /**
     * <p>
     * An array of objects that describe deployments for a container service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeployments(java.util.Collection)} or {@link #withDeployments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deployments
     *        An array of objects that describe deployments for a container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerServiceDeploymentsResult withDeployments(ContainerServiceDeployment... deployments) {
        if (this.deployments == null) {
            setDeployments(new java.util.ArrayList<ContainerServiceDeployment>(deployments.length));
        }
        for (ContainerServiceDeployment ele : deployments) {
            this.deployments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe deployments for a container service.
     * </p>
     * 
     * @param deployments
     *        An array of objects that describe deployments for a container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerServiceDeploymentsResult withDeployments(java.util.Collection<ContainerServiceDeployment> deployments) {
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

        if (obj instanceof GetContainerServiceDeploymentsResult == false)
            return false;
        GetContainerServiceDeploymentsResult other = (GetContainerServiceDeploymentsResult) obj;
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
    public GetContainerServiceDeploymentsResult clone() {
        try {
            return (GetContainerServiceDeploymentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
