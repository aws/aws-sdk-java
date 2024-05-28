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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeBatchLoadTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBatchLoadTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Description of the batch load task.
     * </p>
     */
    private BatchLoadTaskDescription batchLoadTaskDescription;

    /**
     * <p>
     * Description of the batch load task.
     * </p>
     * 
     * @param batchLoadTaskDescription
     *        Description of the batch load task.
     */

    public void setBatchLoadTaskDescription(BatchLoadTaskDescription batchLoadTaskDescription) {
        this.batchLoadTaskDescription = batchLoadTaskDescription;
    }

    /**
     * <p>
     * Description of the batch load task.
     * </p>
     * 
     * @return Description of the batch load task.
     */

    public BatchLoadTaskDescription getBatchLoadTaskDescription() {
        return this.batchLoadTaskDescription;
    }

    /**
     * <p>
     * Description of the batch load task.
     * </p>
     * 
     * @param batchLoadTaskDescription
     *        Description of the batch load task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBatchLoadTaskResult withBatchLoadTaskDescription(BatchLoadTaskDescription batchLoadTaskDescription) {
        setBatchLoadTaskDescription(batchLoadTaskDescription);
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
        if (getBatchLoadTaskDescription() != null)
            sb.append("BatchLoadTaskDescription: ").append(getBatchLoadTaskDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBatchLoadTaskResult == false)
            return false;
        DescribeBatchLoadTaskResult other = (DescribeBatchLoadTaskResult) obj;
        if (other.getBatchLoadTaskDescription() == null ^ this.getBatchLoadTaskDescription() == null)
            return false;
        if (other.getBatchLoadTaskDescription() != null && other.getBatchLoadTaskDescription().equals(this.getBatchLoadTaskDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchLoadTaskDescription() == null) ? 0 : getBatchLoadTaskDescription().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBatchLoadTaskResult clone() {
        try {
            return (DescribeBatchLoadTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
