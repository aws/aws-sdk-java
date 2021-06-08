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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/TestFunction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestFunctionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that represents the result of running the function with the provided event object.
     * </p>
     */
    private TestResult testResult;

    /**
     * <p>
     * An object that represents the result of running the function with the provided event object.
     * </p>
     * 
     * @param testResult
     *        An object that represents the result of running the function with the provided event object.
     */

    public void setTestResult(TestResult testResult) {
        this.testResult = testResult;
    }

    /**
     * <p>
     * An object that represents the result of running the function with the provided event object.
     * </p>
     * 
     * @return An object that represents the result of running the function with the provided event object.
     */

    public TestResult getTestResult() {
        return this.testResult;
    }

    /**
     * <p>
     * An object that represents the result of running the function with the provided event object.
     * </p>
     * 
     * @param testResult
     *        An object that represents the result of running the function with the provided event object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestFunctionResult withTestResult(TestResult testResult) {
        setTestResult(testResult);
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
        if (getTestResult() != null)
            sb.append("TestResult: ").append(getTestResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestFunctionResult == false)
            return false;
        TestFunctionResult other = (TestFunctionResult) obj;
        if (other.getTestResult() == null ^ this.getTestResult() == null)
            return false;
        if (other.getTestResult() != null && other.getTestResult().equals(this.getTestResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestResult() == null) ? 0 : getTestResult().hashCode());
        return hashCode;
    }

    @Override
    public TestFunctionResult clone() {
        try {
            return (TestFunctionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
