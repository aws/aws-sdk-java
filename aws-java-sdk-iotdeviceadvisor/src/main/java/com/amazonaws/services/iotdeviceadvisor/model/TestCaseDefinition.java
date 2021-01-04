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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides test case definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/TestCaseDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestCaseDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides test case definition Id.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Provides test case definition version.
     * </p>
     */
    private String testCaseVersion;

    /**
     * <p>
     * Provides test case definition Id.
     * </p>
     * 
     * @param id
     *        Provides test case definition Id.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Provides test case definition Id.
     * </p>
     * 
     * @return Provides test case definition Id.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Provides test case definition Id.
     * </p>
     * 
     * @param id
     *        Provides test case definition Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseDefinition withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Provides test case definition version.
     * </p>
     * 
     * @param testCaseVersion
     *        Provides test case definition version.
     */

    public void setTestCaseVersion(String testCaseVersion) {
        this.testCaseVersion = testCaseVersion;
    }

    /**
     * <p>
     * Provides test case definition version.
     * </p>
     * 
     * @return Provides test case definition version.
     */

    public String getTestCaseVersion() {
        return this.testCaseVersion;
    }

    /**
     * <p>
     * Provides test case definition version.
     * </p>
     * 
     * @param testCaseVersion
     *        Provides test case definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseDefinition withTestCaseVersion(String testCaseVersion) {
        setTestCaseVersion(testCaseVersion);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getTestCaseVersion() != null)
            sb.append("TestCaseVersion: ").append(getTestCaseVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestCaseDefinition == false)
            return false;
        TestCaseDefinition other = (TestCaseDefinition) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTestCaseVersion() == null ^ this.getTestCaseVersion() == null)
            return false;
        if (other.getTestCaseVersion() != null && other.getTestCaseVersion().equals(this.getTestCaseVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTestCaseVersion() == null) ? 0 : getTestCaseVersion().hashCode());
        return hashCode;
    }

    @Override
    public TestCaseDefinition clone() {
        try {
            return (TestCaseDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotdeviceadvisor.model.transform.TestCaseDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
