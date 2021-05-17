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
 * Show Group Result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GroupResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Group result Id.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * Group Result Name.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * Tests under Group Result.
     * </p>
     */
    private java.util.List<TestCaseRun> tests;

    /**
     * <p>
     * Group result Id.
     * </p>
     * 
     * @param groupId
     *        Group result Id.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * Group result Id.
     * </p>
     * 
     * @return Group result Id.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * Group result Id.
     * </p>
     * 
     * @param groupId
     *        Group result Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupResult withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * Group Result Name.
     * </p>
     * 
     * @param groupName
     *        Group Result Name.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * Group Result Name.
     * </p>
     * 
     * @return Group Result Name.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * Group Result Name.
     * </p>
     * 
     * @param groupName
     *        Group Result Name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupResult withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * Tests under Group Result.
     * </p>
     * 
     * @return Tests under Group Result.
     */

    public java.util.List<TestCaseRun> getTests() {
        return tests;
    }

    /**
     * <p>
     * Tests under Group Result.
     * </p>
     * 
     * @param tests
     *        Tests under Group Result.
     */

    public void setTests(java.util.Collection<TestCaseRun> tests) {
        if (tests == null) {
            this.tests = null;
            return;
        }

        this.tests = new java.util.ArrayList<TestCaseRun>(tests);
    }

    /**
     * <p>
     * Tests under Group Result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTests(java.util.Collection)} or {@link #withTests(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tests
     *        Tests under Group Result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupResult withTests(TestCaseRun... tests) {
        if (this.tests == null) {
            setTests(new java.util.ArrayList<TestCaseRun>(tests.length));
        }
        for (TestCaseRun ele : tests) {
            this.tests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tests under Group Result.
     * </p>
     * 
     * @param tests
     *        Tests under Group Result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupResult withTests(java.util.Collection<TestCaseRun> tests) {
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
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

        if (obj instanceof GroupResult == false)
            return false;
        GroupResult other = (GroupResult) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
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

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getTests() == null) ? 0 : getTests().hashCode());
        return hashCode;
    }

    @Override
    public GroupResult clone() {
        try {
            return (GroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotdeviceadvisor.model.transform.GroupResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
