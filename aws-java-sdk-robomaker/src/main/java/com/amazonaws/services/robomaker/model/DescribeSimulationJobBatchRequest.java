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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeSimulationJobBatch"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSimulationJobBatchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The id of the batch to describe.
     * </p>
     */
    private String batch;

    /**
     * <p>
     * The id of the batch to describe.
     * </p>
     * 
     * @param batch
     *        The id of the batch to describe.
     */

    public void setBatch(String batch) {
        this.batch = batch;
    }

    /**
     * <p>
     * The id of the batch to describe.
     * </p>
     * 
     * @return The id of the batch to describe.
     */

    public String getBatch() {
        return this.batch;
    }

    /**
     * <p>
     * The id of the batch to describe.
     * </p>
     * 
     * @param batch
     *        The id of the batch to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSimulationJobBatchRequest withBatch(String batch) {
        setBatch(batch);
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
        if (getBatch() != null)
            sb.append("Batch: ").append(getBatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSimulationJobBatchRequest == false)
            return false;
        DescribeSimulationJobBatchRequest other = (DescribeSimulationJobBatchRequest) obj;
        if (other.getBatch() == null ^ this.getBatch() == null)
            return false;
        if (other.getBatch() != null && other.getBatch().equals(this.getBatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatch() == null) ? 0 : getBatch().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSimulationJobBatchRequest clone() {
        return (DescribeSimulationJobBatchRequest) super.clone();
    }

}
