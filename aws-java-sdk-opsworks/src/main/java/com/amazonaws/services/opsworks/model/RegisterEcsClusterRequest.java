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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterEcsCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterEcsClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster's ARN.
     * </p>
     */
    private String ecsClusterArn;
    /**
     * <p>
     * The stack ID.
     * </p>
     */
    private String stackId;

    /**
     * <p>
     * The cluster's ARN.
     * </p>
     * 
     * @param ecsClusterArn
     *        The cluster's ARN.
     */

    public void setEcsClusterArn(String ecsClusterArn) {
        this.ecsClusterArn = ecsClusterArn;
    }

    /**
     * <p>
     * The cluster's ARN.
     * </p>
     * 
     * @return The cluster's ARN.
     */

    public String getEcsClusterArn() {
        return this.ecsClusterArn;
    }

    /**
     * <p>
     * The cluster's ARN.
     * </p>
     * 
     * @param ecsClusterArn
     *        The cluster's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterEcsClusterRequest withEcsClusterArn(String ecsClusterArn) {
        setEcsClusterArn(ecsClusterArn);
        return this;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @return The stack ID.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterEcsClusterRequest withStackId(String stackId) {
        setStackId(stackId);
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
        if (getEcsClusterArn() != null)
            sb.append("EcsClusterArn: ").append(getEcsClusterArn()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterEcsClusterRequest == false)
            return false;
        RegisterEcsClusterRequest other = (RegisterEcsClusterRequest) obj;
        if (other.getEcsClusterArn() == null ^ this.getEcsClusterArn() == null)
            return false;
        if (other.getEcsClusterArn() != null && other.getEcsClusterArn().equals(this.getEcsClusterArn()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEcsClusterArn() == null) ? 0 : getEcsClusterArn().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        return hashCode;
    }

    @Override
    public RegisterEcsClusterRequest clone() {
        return (RegisterEcsClusterRequest) super.clone();
    }

}
