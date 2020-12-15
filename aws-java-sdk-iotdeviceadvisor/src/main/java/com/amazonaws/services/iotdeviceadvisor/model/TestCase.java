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
 * Shows tests in a test group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/TestCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestCase implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Shows test case name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Shows test case configuration.
     * </p>
     */
    private java.util.Map<String, String> configuration;
    /**
     * <p>
     * Specifies a test.
     * </p>
     */
    private TestCaseDefinition test;

    /**
     * <p>
     * Shows test case name.
     * </p>
     * 
     * @param name
     *        Shows test case name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Shows test case name.
     * </p>
     * 
     * @return Shows test case name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Shows test case name.
     * </p>
     * 
     * @param name
     *        Shows test case name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCase withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Shows test case configuration.
     * </p>
     * 
     * @return Shows test case configuration.
     */

    public java.util.Map<String, String> getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * Shows test case configuration.
     * </p>
     * 
     * @param configuration
     *        Shows test case configuration.
     */

    public void setConfiguration(java.util.Map<String, String> configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Shows test case configuration.
     * </p>
     * 
     * @param configuration
     *        Shows test case configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCase withConfiguration(java.util.Map<String, String> configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * Add a single Configuration entry
     *
     * @see TestCase#withConfiguration
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TestCase addConfigurationEntry(String key, String value) {
        if (null == this.configuration) {
            this.configuration = new java.util.HashMap<String, String>();
        }
        if (this.configuration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.configuration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Configuration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCase clearConfigurationEntries() {
        this.configuration = null;
        return this;
    }

    /**
     * <p>
     * Specifies a test.
     * </p>
     * 
     * @param test
     *        Specifies a test.
     */

    public void setTest(TestCaseDefinition test) {
        this.test = test;
    }

    /**
     * <p>
     * Specifies a test.
     * </p>
     * 
     * @return Specifies a test.
     */

    public TestCaseDefinition getTest() {
        return this.test;
    }

    /**
     * <p>
     * Specifies a test.
     * </p>
     * 
     * @param test
     *        Specifies a test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCase withTest(TestCaseDefinition test) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
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

        if (obj instanceof TestCase == false)
            return false;
        TestCase other = (TestCase) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTest() == null) ? 0 : getTest().hashCode());
        return hashCode;
    }

    @Override
    public TestCase clone() {
        try {
            return (TestCase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotdeviceadvisor.model.transform.TestCaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
