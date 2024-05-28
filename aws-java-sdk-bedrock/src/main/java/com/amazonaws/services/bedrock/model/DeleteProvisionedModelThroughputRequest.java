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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteProvisionedModelThroughput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteProvisionedModelThroughputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of the Provisioned Throughput.
     * </p>
     */
    private String provisionedModelId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of the Provisioned Throughput.
     * </p>
     * 
     * @param provisionedModelId
     *        The Amazon Resource Name (ARN) or name of the Provisioned Throughput.
     */

    public void setProvisionedModelId(String provisionedModelId) {
        this.provisionedModelId = provisionedModelId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of the Provisioned Throughput.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) or name of the Provisioned Throughput.
     */

    public String getProvisionedModelId() {
        return this.provisionedModelId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of the Provisioned Throughput.
     * </p>
     * 
     * @param provisionedModelId
     *        The Amazon Resource Name (ARN) or name of the Provisioned Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProvisionedModelThroughputRequest withProvisionedModelId(String provisionedModelId) {
        setProvisionedModelId(provisionedModelId);
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
        if (getProvisionedModelId() != null)
            sb.append("ProvisionedModelId: ").append(getProvisionedModelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteProvisionedModelThroughputRequest == false)
            return false;
        DeleteProvisionedModelThroughputRequest other = (DeleteProvisionedModelThroughputRequest) obj;
        if (other.getProvisionedModelId() == null ^ this.getProvisionedModelId() == null)
            return false;
        if (other.getProvisionedModelId() != null && other.getProvisionedModelId().equals(this.getProvisionedModelId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisionedModelId() == null) ? 0 : getProvisionedModelId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteProvisionedModelThroughputRequest clone() {
        return (DeleteProvisionedModelThroughputRequest) super.clone();
    }

}
