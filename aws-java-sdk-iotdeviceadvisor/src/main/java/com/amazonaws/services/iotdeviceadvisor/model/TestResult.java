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
 * Show each group result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/TestResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Show each group of test results.
     * </p>
     */
    private java.util.List<GroupResult> groups;

    /**
     * <p>
     * Show each group of test results.
     * </p>
     * 
     * @return Show each group of test results.
     */

    public java.util.List<GroupResult> getGroups() {
        return groups;
    }

    /**
     * <p>
     * Show each group of test results.
     * </p>
     * 
     * @param groups
     *        Show each group of test results.
     */

    public void setGroups(java.util.Collection<GroupResult> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<GroupResult>(groups);
    }

    /**
     * <p>
     * Show each group of test results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        Show each group of test results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestResult withGroups(GroupResult... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<GroupResult>(groups.length));
        }
        for (GroupResult ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Show each group of test results.
     * </p>
     * 
     * @param groups
     *        Show each group of test results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestResult withGroups(java.util.Collection<GroupResult> groups) {
        setGroups(groups);
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
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestResult == false)
            return false;
        TestResult other = (TestResult) obj;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        return hashCode;
    }

    @Override
    public TestResult clone() {
        try {
            return (TestResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotdeviceadvisor.model.transform.TestResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
