/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the result of a get test request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetTest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTestResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A test condition that is evaluated.
     * </p>
     */
    private Test test;

    /**
     * <p>
     * A test condition that is evaluated.
     * </p>
     * 
     * @param test
     *        A test condition that is evaluated.
     */

    public void setTest(Test test) {
        this.test = test;
    }

    /**
     * <p>
     * A test condition that is evaluated.
     * </p>
     * 
     * @return A test condition that is evaluated.
     */

    public Test getTest() {
        return this.test;
    }

    /**
     * <p>
     * A test condition that is evaluated.
     * </p>
     * 
     * @param test
     *        A test condition that is evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestResult withTest(Test test) {
        setTest(test);
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
        if (getTest() != null)
            sb.append("Test: ").append(getTest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTestResult == false)
            return false;
        GetTestResult other = (GetTestResult) obj;
        if (other.getTest() == null ^ this.getTest() == null)
            return false;
        if (other.getTest() != null && other.getTest().equals(this.getTest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTest() == null) ? 0 : getTest().hashCode());
        return hashCode;
    }

    @Override
    public GetTestResult clone() {
        try {
            return (GetTestResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
