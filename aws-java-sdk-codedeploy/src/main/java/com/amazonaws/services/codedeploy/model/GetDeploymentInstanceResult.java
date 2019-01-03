/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a GetDeploymentInstance operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the instance.
     * </p>
     */
    private InstanceSummary instanceSummary;

    /**
     * <p>
     * Information about the instance.
     * </p>
     * 
     * @param instanceSummary
     *        Information about the instance.
     */
    @Deprecated
    public void setInstanceSummary(InstanceSummary instanceSummary) {
        this.instanceSummary = instanceSummary;
    }

    /**
     * <p>
     * Information about the instance.
     * </p>
     * 
     * @return Information about the instance.
     */
    @Deprecated
    public InstanceSummary getInstanceSummary() {
        return this.instanceSummary;
    }

    /**
     * <p>
     * Information about the instance.
     * </p>
     * 
     * @param instanceSummary
     *        Information about the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public GetDeploymentInstanceResult withInstanceSummary(InstanceSummary instanceSummary) {
        setInstanceSummary(instanceSummary);
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
        if (getInstanceSummary() != null)
            sb.append("InstanceSummary: ").append(getInstanceSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentInstanceResult == false)
            return false;
        GetDeploymentInstanceResult other = (GetDeploymentInstanceResult) obj;
        if (other.getInstanceSummary() == null ^ this.getInstanceSummary() == null)
            return false;
        if (other.getInstanceSummary() != null && other.getInstanceSummary().equals(this.getInstanceSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceSummary() == null) ? 0 : getInstanceSummary().hashCode());
        return hashCode;
    }

    @Override
    public GetDeploymentInstanceResult clone() {
        try {
            return (GetDeploymentInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
