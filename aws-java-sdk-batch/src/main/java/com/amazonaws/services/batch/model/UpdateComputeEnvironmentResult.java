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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UpdateComputeEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateComputeEnvironmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the compute environment.
     * </p>
     */
    private String computeEnvironmentName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the compute environment.
     * </p>
     */
    private String computeEnvironmentArn;

    /**
     * <p>
     * The name of the compute environment.
     * </p>
     * 
     * @param computeEnvironmentName
     *        The name of the compute environment.
     */

    public void setComputeEnvironmentName(String computeEnvironmentName) {
        this.computeEnvironmentName = computeEnvironmentName;
    }

    /**
     * <p>
     * The name of the compute environment.
     * </p>
     * 
     * @return The name of the compute environment.
     */

    public String getComputeEnvironmentName() {
        return this.computeEnvironmentName;
    }

    /**
     * <p>
     * The name of the compute environment.
     * </p>
     * 
     * @param computeEnvironmentName
     *        The name of the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComputeEnvironmentResult withComputeEnvironmentName(String computeEnvironmentName) {
        setComputeEnvironmentName(computeEnvironmentName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the compute environment.
     * </p>
     * 
     * @param computeEnvironmentArn
     *        The Amazon Resource Name (ARN) of the compute environment.
     */

    public void setComputeEnvironmentArn(String computeEnvironmentArn) {
        this.computeEnvironmentArn = computeEnvironmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the compute environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the compute environment.
     */

    public String getComputeEnvironmentArn() {
        return this.computeEnvironmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the compute environment.
     * </p>
     * 
     * @param computeEnvironmentArn
     *        The Amazon Resource Name (ARN) of the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComputeEnvironmentResult withComputeEnvironmentArn(String computeEnvironmentArn) {
        setComputeEnvironmentArn(computeEnvironmentArn);
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
        if (getComputeEnvironmentName() != null)
            sb.append("ComputeEnvironmentName: ").append(getComputeEnvironmentName()).append(",");
        if (getComputeEnvironmentArn() != null)
            sb.append("ComputeEnvironmentArn: ").append(getComputeEnvironmentArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateComputeEnvironmentResult == false)
            return false;
        UpdateComputeEnvironmentResult other = (UpdateComputeEnvironmentResult) obj;
        if (other.getComputeEnvironmentName() == null ^ this.getComputeEnvironmentName() == null)
            return false;
        if (other.getComputeEnvironmentName() != null && other.getComputeEnvironmentName().equals(this.getComputeEnvironmentName()) == false)
            return false;
        if (other.getComputeEnvironmentArn() == null ^ this.getComputeEnvironmentArn() == null)
            return false;
        if (other.getComputeEnvironmentArn() != null && other.getComputeEnvironmentArn().equals(this.getComputeEnvironmentArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputeEnvironmentName() == null) ? 0 : getComputeEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getComputeEnvironmentArn() == null) ? 0 : getComputeEnvironmentArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateComputeEnvironmentResult clone() {
        try {
            return (UpdateComputeEnvironmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
