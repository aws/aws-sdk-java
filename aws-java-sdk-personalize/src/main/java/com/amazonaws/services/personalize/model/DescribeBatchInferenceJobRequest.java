/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeBatchInferenceJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBatchInferenceJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the batch inference job to describe.
     * </p>
     */
    private String batchInferenceJobArn;

    /**
     * <p>
     * The ARN of the batch inference job to describe.
     * </p>
     * 
     * @param batchInferenceJobArn
     *        The ARN of the batch inference job to describe.
     */

    public void setBatchInferenceJobArn(String batchInferenceJobArn) {
        this.batchInferenceJobArn = batchInferenceJobArn;
    }

    /**
     * <p>
     * The ARN of the batch inference job to describe.
     * </p>
     * 
     * @return The ARN of the batch inference job to describe.
     */

    public String getBatchInferenceJobArn() {
        return this.batchInferenceJobArn;
    }

    /**
     * <p>
     * The ARN of the batch inference job to describe.
     * </p>
     * 
     * @param batchInferenceJobArn
     *        The ARN of the batch inference job to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBatchInferenceJobRequest withBatchInferenceJobArn(String batchInferenceJobArn) {
        setBatchInferenceJobArn(batchInferenceJobArn);
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
        if (getBatchInferenceJobArn() != null)
            sb.append("BatchInferenceJobArn: ").append(getBatchInferenceJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBatchInferenceJobRequest == false)
            return false;
        DescribeBatchInferenceJobRequest other = (DescribeBatchInferenceJobRequest) obj;
        if (other.getBatchInferenceJobArn() == null ^ this.getBatchInferenceJobArn() == null)
            return false;
        if (other.getBatchInferenceJobArn() != null && other.getBatchInferenceJobArn().equals(this.getBatchInferenceJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchInferenceJobArn() == null) ? 0 : getBatchInferenceJobArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBatchInferenceJobRequest clone() {
        return (DescribeBatchInferenceJobRequest) super.clone();
    }

}
