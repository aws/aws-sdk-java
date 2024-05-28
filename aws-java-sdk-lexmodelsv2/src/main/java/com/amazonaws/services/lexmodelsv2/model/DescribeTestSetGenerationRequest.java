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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeTestSetGeneration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTestSetGenerationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the test set generation.
     * </p>
     */
    private String testSetGenerationId;

    /**
     * <p>
     * The unique identifier of the test set generation.
     * </p>
     * 
     * @param testSetGenerationId
     *        The unique identifier of the test set generation.
     */

    public void setTestSetGenerationId(String testSetGenerationId) {
        this.testSetGenerationId = testSetGenerationId;
    }

    /**
     * <p>
     * The unique identifier of the test set generation.
     * </p>
     * 
     * @return The unique identifier of the test set generation.
     */

    public String getTestSetGenerationId() {
        return this.testSetGenerationId;
    }

    /**
     * <p>
     * The unique identifier of the test set generation.
     * </p>
     * 
     * @param testSetGenerationId
     *        The unique identifier of the test set generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetGenerationRequest withTestSetGenerationId(String testSetGenerationId) {
        setTestSetGenerationId(testSetGenerationId);
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
        if (getTestSetGenerationId() != null)
            sb.append("TestSetGenerationId: ").append(getTestSetGenerationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTestSetGenerationRequest == false)
            return false;
        DescribeTestSetGenerationRequest other = (DescribeTestSetGenerationRequest) obj;
        if (other.getTestSetGenerationId() == null ^ this.getTestSetGenerationId() == null)
            return false;
        if (other.getTestSetGenerationId() != null && other.getTestSetGenerationId().equals(this.getTestSetGenerationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestSetGenerationId() == null) ? 0 : getTestSetGenerationId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTestSetGenerationRequest clone() {
        return (DescribeTestSetGenerationRequest) super.clone();
    }

}
