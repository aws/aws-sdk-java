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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/TestAvailabilityConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestAvailabilityConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Boolean indicating whether the test passed or failed.
     * </p>
     */
    private Boolean testPassed;
    /**
     * <p>
     * String containing the reason for a failed test if <code>TestPassed</code> is false.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * Boolean indicating whether the test passed or failed.
     * </p>
     * 
     * @param testPassed
     *        Boolean indicating whether the test passed or failed.
     */

    public void setTestPassed(Boolean testPassed) {
        this.testPassed = testPassed;
    }

    /**
     * <p>
     * Boolean indicating whether the test passed or failed.
     * </p>
     * 
     * @return Boolean indicating whether the test passed or failed.
     */

    public Boolean getTestPassed() {
        return this.testPassed;
    }

    /**
     * <p>
     * Boolean indicating whether the test passed or failed.
     * </p>
     * 
     * @param testPassed
     *        Boolean indicating whether the test passed or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAvailabilityConfigurationResult withTestPassed(Boolean testPassed) {
        setTestPassed(testPassed);
        return this;
    }

    /**
     * <p>
     * Boolean indicating whether the test passed or failed.
     * </p>
     * 
     * @return Boolean indicating whether the test passed or failed.
     */

    public Boolean isTestPassed() {
        return this.testPassed;
    }

    /**
     * <p>
     * String containing the reason for a failed test if <code>TestPassed</code> is false.
     * </p>
     * 
     * @param failureReason
     *        String containing the reason for a failed test if <code>TestPassed</code> is false.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * String containing the reason for a failed test if <code>TestPassed</code> is false.
     * </p>
     * 
     * @return String containing the reason for a failed test if <code>TestPassed</code> is false.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * String containing the reason for a failed test if <code>TestPassed</code> is false.
     * </p>
     * 
     * @param failureReason
     *        String containing the reason for a failed test if <code>TestPassed</code> is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAvailabilityConfigurationResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getTestPassed() != null)
            sb.append("TestPassed: ").append(getTestPassed()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestAvailabilityConfigurationResult == false)
            return false;
        TestAvailabilityConfigurationResult other = (TestAvailabilityConfigurationResult) obj;
        if (other.getTestPassed() == null ^ this.getTestPassed() == null)
            return false;
        if (other.getTestPassed() != null && other.getTestPassed().equals(this.getTestPassed()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestPassed() == null) ? 0 : getTestPassed().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public TestAvailabilityConfigurationResult clone() {
        try {
            return (TestAvailabilityConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
