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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameters for Amazon Athena.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AthenaParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AthenaParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The workgroup that Amazon Athena uses.
     * </p>
     */
    private String workGroup;
    /**
     * <p>
     * Use the <code>RoleArn</code> structure to override an account-wide role for a specific Athena data source. For
     * example, say an account administrator has turned off all Athena access with an account-wide role. The
     * administrator can then use <code>RoleArn</code> to bypass the account-wide role and allow Athena access for the
     * single Athena data source that is specified in the structure, even if the account-wide role forbidding Athena
     * access is still active.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The workgroup that Amazon Athena uses.
     * </p>
     * 
     * @param workGroup
     *        The workgroup that Amazon Athena uses.
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The workgroup that Amazon Athena uses.
     * </p>
     * 
     * @return The workgroup that Amazon Athena uses.
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * <p>
     * The workgroup that Amazon Athena uses.
     * </p>
     * 
     * @param workGroup
     *        The workgroup that Amazon Athena uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaParameters withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
        return this;
    }

    /**
     * <p>
     * Use the <code>RoleArn</code> structure to override an account-wide role for a specific Athena data source. For
     * example, say an account administrator has turned off all Athena access with an account-wide role. The
     * administrator can then use <code>RoleArn</code> to bypass the account-wide role and allow Athena access for the
     * single Athena data source that is specified in the structure, even if the account-wide role forbidding Athena
     * access is still active.
     * </p>
     * 
     * @param roleArn
     *        Use the <code>RoleArn</code> structure to override an account-wide role for a specific Athena data source.
     *        For example, say an account administrator has turned off all Athena access with an account-wide role. The
     *        administrator can then use <code>RoleArn</code> to bypass the account-wide role and allow Athena access
     *        for the single Athena data source that is specified in the structure, even if the account-wide role
     *        forbidding Athena access is still active.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * Use the <code>RoleArn</code> structure to override an account-wide role for a specific Athena data source. For
     * example, say an account administrator has turned off all Athena access with an account-wide role. The
     * administrator can then use <code>RoleArn</code> to bypass the account-wide role and allow Athena access for the
     * single Athena data source that is specified in the structure, even if the account-wide role forbidding Athena
     * access is still active.
     * </p>
     * 
     * @return Use the <code>RoleArn</code> structure to override an account-wide role for a specific Athena data
     *         source. For example, say an account administrator has turned off all Athena access with an account-wide
     *         role. The administrator can then use <code>RoleArn</code> to bypass the account-wide role and allow
     *         Athena access for the single Athena data source that is specified in the structure, even if the
     *         account-wide role forbidding Athena access is still active.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * Use the <code>RoleArn</code> structure to override an account-wide role for a specific Athena data source. For
     * example, say an account administrator has turned off all Athena access with an account-wide role. The
     * administrator can then use <code>RoleArn</code> to bypass the account-wide role and allow Athena access for the
     * single Athena data source that is specified in the structure, even if the account-wide role forbidding Athena
     * access is still active.
     * </p>
     * 
     * @param roleArn
     *        Use the <code>RoleArn</code> structure to override an account-wide role for a specific Athena data source.
     *        For example, say an account administrator has turned off all Athena access with an account-wide role. The
     *        administrator can then use <code>RoleArn</code> to bypass the account-wide role and allow Athena access
     *        for the single Athena data source that is specified in the structure, even if the account-wide role
     *        forbidding Athena access is still active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaParameters withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AthenaParameters == false)
            return false;
        AthenaParameters other = (AthenaParameters) obj;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public AthenaParameters clone() {
        try {
            return (AthenaParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AthenaParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
