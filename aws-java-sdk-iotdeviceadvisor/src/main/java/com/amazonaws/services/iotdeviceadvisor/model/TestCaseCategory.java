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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Gets the test case category.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/TestCaseCategory" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestCaseCategory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lists all the tests name in the specified category.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Lists all the tests in the specified category.
     * </p>
     */
    private java.util.List<TestCase> tests;

    /**
     * <p>
     * Lists all the tests name in the specified category.
     * </p>
     * 
     * @param name
     *        Lists all the tests name in the specified category.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Lists all the tests name in the specified category.
     * </p>
     * 
     * @return Lists all the tests name in the specified category.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Lists all the tests name in the specified category.
     * </p>
     * 
     * @param name
     *        Lists all the tests name in the specified category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseCategory withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Lists all the tests in the specified category.
     * </p>
     * 
     * @return Lists all the tests in the specified category.
     */

    public java.util.List<TestCase> getTests() {
        return tests;
    }

    /**
     * <p>
     * Lists all the tests in the specified category.
     * </p>
     * 
     * @param tests
     *        Lists all the tests in the specified category.
     */

    public void setTests(java.util.Collection<TestCase> tests) {
        if (tests == null) {
            this.tests = null;
            return;
        }

        this.tests = new java.util.ArrayList<TestCase>(tests);
    }

    /**
     * <p>
     * Lists all the tests in the specified category.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTests(java.util.Collection)} or {@link #withTests(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tests
     *        Lists all the tests in the specified category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseCategory withTests(TestCase... tests) {
        if (this.tests == null) {
            setTests(new java.util.ArrayList<TestCase>(tests.length));
        }
        for (TestCase ele : tests) {
            this.tests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists all the tests in the specified category.
     * </p>
     * 
     * @param tests
     *        Lists all the tests in the specified category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseCategory withTests(java.util.Collection<TestCase> tests) {
        setTests(tests);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTests() != null)
            sb.append("Tests: ").append(getTests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestCaseCategory == false)
            return false;
        TestCaseCategory other = (TestCaseCategory) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTests() == null ^ this.getTests() == null)
            return false;
        if (other.getTests() != null && other.getTests().equals(this.getTests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTests() == null) ? 0 : getTests().hashCode());
        return hashCode;
    }

    @Override
    public TestCaseCategory clone() {
        try {
            return (TestCaseCategory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotdeviceadvisor.model.transform.TestCaseCategoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
