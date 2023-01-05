/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeBatchSegmentJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBatchSegmentJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information on the specified batch segment job.
     * </p>
     */
    private BatchSegmentJob batchSegmentJob;

    /**
     * <p>
     * Information on the specified batch segment job.
     * </p>
     * 
     * @param batchSegmentJob
     *        Information on the specified batch segment job.
     */

    public void setBatchSegmentJob(BatchSegmentJob batchSegmentJob) {
        this.batchSegmentJob = batchSegmentJob;
    }

    /**
     * <p>
     * Information on the specified batch segment job.
     * </p>
     * 
     * @return Information on the specified batch segment job.
     */

    public BatchSegmentJob getBatchSegmentJob() {
        return this.batchSegmentJob;
    }

    /**
     * <p>
     * Information on the specified batch segment job.
     * </p>
     * 
     * @param batchSegmentJob
     *        Information on the specified batch segment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBatchSegmentJobResult withBatchSegmentJob(BatchSegmentJob batchSegmentJob) {
        setBatchSegmentJob(batchSegmentJob);
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
        if (getBatchSegmentJob() != null)
            sb.append("BatchSegmentJob: ").append(getBatchSegmentJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBatchSegmentJobResult == false)
            return false;
        DescribeBatchSegmentJobResult other = (DescribeBatchSegmentJobResult) obj;
        if (other.getBatchSegmentJob() == null ^ this.getBatchSegmentJob() == null)
            return false;
        if (other.getBatchSegmentJob() != null && other.getBatchSegmentJob().equals(this.getBatchSegmentJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchSegmentJob() == null) ? 0 : getBatchSegmentJob().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBatchSegmentJobResult clone() {
        try {
            return (DescribeBatchSegmentJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
