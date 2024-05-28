/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateProvisionedModelThroughput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProvisionedModelThroughputResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this Provisioned Throughput.
     * </p>
     */
    private String provisionedModelArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this Provisioned Throughput.
     * </p>
     * 
     * @param provisionedModelArn
     *        The Amazon Resource Name (ARN) for this Provisioned Throughput.
     */

    public void setProvisionedModelArn(String provisionedModelArn) {
        this.provisionedModelArn = provisionedModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this Provisioned Throughput.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for this Provisioned Throughput.
     */

    public String getProvisionedModelArn() {
        return this.provisionedModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this Provisioned Throughput.
     * </p>
     * 
     * @param provisionedModelArn
     *        The Amazon Resource Name (ARN) for this Provisioned Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedModelThroughputResult withProvisionedModelArn(String provisionedModelArn) {
        setProvisionedModelArn(provisionedModelArn);
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
        if (getProvisionedModelArn() != null)
            sb.append("ProvisionedModelArn: ").append(getProvisionedModelArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProvisionedModelThroughputResult == false)
            return false;
        CreateProvisionedModelThroughputResult other = (CreateProvisionedModelThroughputResult) obj;
        if (other.getProvisionedModelArn() == null ^ this.getProvisionedModelArn() == null)
            return false;
        if (other.getProvisionedModelArn() != null && other.getProvisionedModelArn().equals(this.getProvisionedModelArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisionedModelArn() == null) ? 0 : getProvisionedModelArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateProvisionedModelThroughputResult clone() {
        try {
            return (CreateProvisionedModelThroughputResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
