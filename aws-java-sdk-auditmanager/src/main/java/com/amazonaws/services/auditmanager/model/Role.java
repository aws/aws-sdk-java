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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The wrapper that contains AWS Audit Manager role information, such as the role type and IAM Amazon Resource Name
 * (ARN).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/Role" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Role implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of customer persona.
     * </p>
     * <note>
     * <p>
     * In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be <code>RESOURCE_OWNER</code>.
     * </p>
     * </note>
     */
    private String roleType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The type of customer persona.
     * </p>
     * <note>
     * <p>
     * In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be <code>RESOURCE_OWNER</code>.
     * </p>
     * </note>
     * 
     * @param roleType
     *        The type of customer persona. </p> <note>
     *        <p>
     *        In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *        </p>
     *        <p>
     *        In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *        </p>
     *        <p>
     *        In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be
     *        <code>RESOURCE_OWNER</code>.
     *        </p>
     * @see RoleType
     */

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    /**
     * <p>
     * The type of customer persona.
     * </p>
     * <note>
     * <p>
     * In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be <code>RESOURCE_OWNER</code>.
     * </p>
     * </note>
     * 
     * @return The type of customer persona. </p> <note>
     *         <p>
     *         In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *         </p>
     *         <p>
     *         In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *         </p>
     *         <p>
     *         In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be
     *         <code>RESOURCE_OWNER</code>.
     *         </p>
     * @see RoleType
     */

    public String getRoleType() {
        return this.roleType;
    }

    /**
     * <p>
     * The type of customer persona.
     * </p>
     * <note>
     * <p>
     * In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be <code>RESOURCE_OWNER</code>.
     * </p>
     * </note>
     * 
     * @param roleType
     *        The type of customer persona. </p> <note>
     *        <p>
     *        In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *        </p>
     *        <p>
     *        In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *        </p>
     *        <p>
     *        In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be
     *        <code>RESOURCE_OWNER</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoleType
     */

    public Role withRoleType(String roleType) {
        setRoleType(roleType);
        return this;
    }

    /**
     * <p>
     * The type of customer persona.
     * </p>
     * <note>
     * <p>
     * In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be <code>RESOURCE_OWNER</code>.
     * </p>
     * </note>
     * 
     * @param roleType
     *        The type of customer persona. </p> <note>
     *        <p>
     *        In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *        </p>
     *        <p>
     *        In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *        </p>
     *        <p>
     *        In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be
     *        <code>RESOURCE_OWNER</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoleType
     */

    public Role withRoleType(RoleType roleType) {
        this.roleType = roleType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Role withRoleArn(String roleArn) {
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
        if (getRoleType() != null)
            sb.append("RoleType: ").append(getRoleType()).append(",");
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

        if (obj instanceof Role == false)
            return false;
        Role other = (Role) obj;
        if (other.getRoleType() == null ^ this.getRoleType() == null)
            return false;
        if (other.getRoleType() != null && other.getRoleType().equals(this.getRoleType()) == false)
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

        hashCode = prime * hashCode + ((getRoleType() == null) ? 0 : getRoleType().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public Role clone() {
        try {
            return (Role) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.RoleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
