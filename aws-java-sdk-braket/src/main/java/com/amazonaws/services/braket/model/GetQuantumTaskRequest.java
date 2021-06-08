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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/GetQuantumTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQuantumTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * the ARN of the task to retrieve.
     * </p>
     */
    private String quantumTaskArn;

    /**
     * <p>
     * the ARN of the task to retrieve.
     * </p>
     * 
     * @param quantumTaskArn
     *        the ARN of the task to retrieve.
     */

    public void setQuantumTaskArn(String quantumTaskArn) {
        this.quantumTaskArn = quantumTaskArn;
    }

    /**
     * <p>
     * the ARN of the task to retrieve.
     * </p>
     * 
     * @return the ARN of the task to retrieve.
     */

    public String getQuantumTaskArn() {
        return this.quantumTaskArn;
    }

    /**
     * <p>
     * the ARN of the task to retrieve.
     * </p>
     * 
     * @param quantumTaskArn
     *        the ARN of the task to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuantumTaskRequest withQuantumTaskArn(String quantumTaskArn) {
        setQuantumTaskArn(quantumTaskArn);
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
        if (getQuantumTaskArn() != null)
            sb.append("QuantumTaskArn: ").append(getQuantumTaskArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQuantumTaskRequest == false)
            return false;
        GetQuantumTaskRequest other = (GetQuantumTaskRequest) obj;
        if (other.getQuantumTaskArn() == null ^ this.getQuantumTaskArn() == null)
            return false;
        if (other.getQuantumTaskArn() != null && other.getQuantumTaskArn().equals(this.getQuantumTaskArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuantumTaskArn() == null) ? 0 : getQuantumTaskArn().hashCode());
        return hashCode;
    }

    @Override
    public GetQuantumTaskRequest clone() {
        return (GetQuantumTaskRequest) super.clone();
    }

}
