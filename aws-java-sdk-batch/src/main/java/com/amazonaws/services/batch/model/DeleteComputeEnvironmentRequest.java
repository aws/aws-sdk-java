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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DeleteComputeEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteComputeEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the compute environment to delete.
     * </p>
     */
    private String computeEnvironment;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the compute environment to delete.
     * </p>
     * 
     * @param computeEnvironment
     *        The name or Amazon Resource Name (ARN) of the compute environment to delete.
     */

    public void setComputeEnvironment(String computeEnvironment) {
        this.computeEnvironment = computeEnvironment;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the compute environment to delete.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the compute environment to delete.
     */

    public String getComputeEnvironment() {
        return this.computeEnvironment;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the compute environment to delete.
     * </p>
     * 
     * @param computeEnvironment
     *        The name or Amazon Resource Name (ARN) of the compute environment to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteComputeEnvironmentRequest withComputeEnvironment(String computeEnvironment) {
        setComputeEnvironment(computeEnvironment);
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
        if (getComputeEnvironment() != null)
            sb.append("ComputeEnvironment: ").append(getComputeEnvironment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteComputeEnvironmentRequest == false)
            return false;
        DeleteComputeEnvironmentRequest other = (DeleteComputeEnvironmentRequest) obj;
        if (other.getComputeEnvironment() == null ^ this.getComputeEnvironment() == null)
            return false;
        if (other.getComputeEnvironment() != null && other.getComputeEnvironment().equals(this.getComputeEnvironment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputeEnvironment() == null) ? 0 : getComputeEnvironment().hashCode());
        return hashCode;
    }

    @Override
    public DeleteComputeEnvironmentRequest clone() {
        return (DeleteComputeEnvironmentRequest) super.clone();
    }

}
