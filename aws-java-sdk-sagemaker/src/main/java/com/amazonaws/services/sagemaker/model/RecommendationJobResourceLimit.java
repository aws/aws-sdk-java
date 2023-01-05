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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the maximum number of jobs that can run in parallel and the maximum number of jobs that can run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RecommendationJobResourceLimit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationJobResourceLimit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the maximum number of load tests.
     * </p>
     */
    private Integer maxNumberOfTests;
    /**
     * <p>
     * Defines the maximum number of parallel load tests.
     * </p>
     */
    private Integer maxParallelOfTests;

    /**
     * <p>
     * Defines the maximum number of load tests.
     * </p>
     * 
     * @param maxNumberOfTests
     *        Defines the maximum number of load tests.
     */

    public void setMaxNumberOfTests(Integer maxNumberOfTests) {
        this.maxNumberOfTests = maxNumberOfTests;
    }

    /**
     * <p>
     * Defines the maximum number of load tests.
     * </p>
     * 
     * @return Defines the maximum number of load tests.
     */

    public Integer getMaxNumberOfTests() {
        return this.maxNumberOfTests;
    }

    /**
     * <p>
     * Defines the maximum number of load tests.
     * </p>
     * 
     * @param maxNumberOfTests
     *        Defines the maximum number of load tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobResourceLimit withMaxNumberOfTests(Integer maxNumberOfTests) {
        setMaxNumberOfTests(maxNumberOfTests);
        return this;
    }

    /**
     * <p>
     * Defines the maximum number of parallel load tests.
     * </p>
     * 
     * @param maxParallelOfTests
     *        Defines the maximum number of parallel load tests.
     */

    public void setMaxParallelOfTests(Integer maxParallelOfTests) {
        this.maxParallelOfTests = maxParallelOfTests;
    }

    /**
     * <p>
     * Defines the maximum number of parallel load tests.
     * </p>
     * 
     * @return Defines the maximum number of parallel load tests.
     */

    public Integer getMaxParallelOfTests() {
        return this.maxParallelOfTests;
    }

    /**
     * <p>
     * Defines the maximum number of parallel load tests.
     * </p>
     * 
     * @param maxParallelOfTests
     *        Defines the maximum number of parallel load tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobResourceLimit withMaxParallelOfTests(Integer maxParallelOfTests) {
        setMaxParallelOfTests(maxParallelOfTests);
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
        if (getMaxNumberOfTests() != null)
            sb.append("MaxNumberOfTests: ").append(getMaxNumberOfTests()).append(",");
        if (getMaxParallelOfTests() != null)
            sb.append("MaxParallelOfTests: ").append(getMaxParallelOfTests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationJobResourceLimit == false)
            return false;
        RecommendationJobResourceLimit other = (RecommendationJobResourceLimit) obj;
        if (other.getMaxNumberOfTests() == null ^ this.getMaxNumberOfTests() == null)
            return false;
        if (other.getMaxNumberOfTests() != null && other.getMaxNumberOfTests().equals(this.getMaxNumberOfTests()) == false)
            return false;
        if (other.getMaxParallelOfTests() == null ^ this.getMaxParallelOfTests() == null)
            return false;
        if (other.getMaxParallelOfTests() != null && other.getMaxParallelOfTests().equals(this.getMaxParallelOfTests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxNumberOfTests() == null) ? 0 : getMaxNumberOfTests().hashCode());
        hashCode = prime * hashCode + ((getMaxParallelOfTests() == null) ? 0 : getMaxParallelOfTests().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationJobResourceLimit clone() {
        try {
            return (RecommendationJobResourceLimit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RecommendationJobResourceLimitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
