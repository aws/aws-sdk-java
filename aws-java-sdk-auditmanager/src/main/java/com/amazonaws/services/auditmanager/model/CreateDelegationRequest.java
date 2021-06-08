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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of attributes used to create a delegation for an assessment in AWS Audit Manager.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateDelegationRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDelegationRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A comment related to the delegation request.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The unique identifier for the control set.
     * </p>
     */
    private String controlSetId;
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
     */
    private String roleType;

    /**
     * <p>
     * A comment related to the delegation request.
     * </p>
     * 
     * @param comment
     *        A comment related to the delegation request.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A comment related to the delegation request.
     * </p>
     * 
     * @return A comment related to the delegation request.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A comment related to the delegation request.
     * </p>
     * 
     * @param comment
     *        A comment related to the delegation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDelegationRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the control set.
     * </p>
     * 
     * @param controlSetId
     *        The unique identifier for the control set.
     */

    public void setControlSetId(String controlSetId) {
        this.controlSetId = controlSetId;
    }

    /**
     * <p>
     * The unique identifier for the control set.
     * </p>
     * 
     * @return The unique identifier for the control set.
     */

    public String getControlSetId() {
        return this.controlSetId;
    }

    /**
     * <p>
     * The unique identifier for the control set.
     * </p>
     * 
     * @param controlSetId
     *        The unique identifier for the control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDelegationRequest withControlSetId(String controlSetId) {
        setControlSetId(controlSetId);
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

    public CreateDelegationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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

    public CreateDelegationRequest withRoleType(String roleType) {
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

    public CreateDelegationRequest withRoleType(RoleType roleType) {
        this.roleType = roleType.toString();
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
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getControlSetId() != null)
            sb.append("ControlSetId: ").append(getControlSetId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRoleType() != null)
            sb.append("RoleType: ").append(getRoleType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDelegationRequest == false)
            return false;
        CreateDelegationRequest other = (CreateDelegationRequest) obj;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getControlSetId() == null ^ this.getControlSetId() == null)
            return false;
        if (other.getControlSetId() != null && other.getControlSetId().equals(this.getControlSetId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRoleType() == null ^ this.getRoleType() == null)
            return false;
        if (other.getRoleType() != null && other.getRoleType().equals(this.getRoleType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getControlSetId() == null) ? 0 : getControlSetId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRoleType() == null) ? 0 : getRoleType().hashCode());
        return hashCode;
    }

    @Override
    public CreateDelegationRequest clone() {
        try {
            return (CreateDelegationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.CreateDelegationRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
