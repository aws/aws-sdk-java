/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/UpdateStateMachine" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStateMachineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time the state machine was updated.
     * </p>
     */
    private java.util.Date updateDate;
    /**
     * <p>
     * The revision identifier for the updated state machine.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the published state machine version.
     * </p>
     * <p>
     * If the <code>publish</code> parameter isn't set to <code>true</code>, this field returns null.
     * </p>
     */
    private String stateMachineVersionArn;

    /**
     * <p>
     * The date and time the state machine was updated.
     * </p>
     * 
     * @param updateDate
     *        The date and time the state machine was updated.
     */

    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * <p>
     * The date and time the state machine was updated.
     * </p>
     * 
     * @return The date and time the state machine was updated.
     */

    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * <p>
     * The date and time the state machine was updated.
     * </p>
     * 
     * @param updateDate
     *        The date and time the state machine was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStateMachineResult withUpdateDate(java.util.Date updateDate) {
        setUpdateDate(updateDate);
        return this;
    }

    /**
     * <p>
     * The revision identifier for the updated state machine.
     * </p>
     * 
     * @param revisionId
     *        The revision identifier for the updated state machine.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The revision identifier for the updated state machine.
     * </p>
     * 
     * @return The revision identifier for the updated state machine.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The revision identifier for the updated state machine.
     * </p>
     * 
     * @param revisionId
     *        The revision identifier for the updated state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStateMachineResult withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the published state machine version.
     * </p>
     * <p>
     * If the <code>publish</code> parameter isn't set to <code>true</code>, this field returns null.
     * </p>
     * 
     * @param stateMachineVersionArn
     *        The Amazon Resource Name (ARN) of the published state machine version.</p>
     *        <p>
     *        If the <code>publish</code> parameter isn't set to <code>true</code>, this field returns null.
     */

    public void setStateMachineVersionArn(String stateMachineVersionArn) {
        this.stateMachineVersionArn = stateMachineVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the published state machine version.
     * </p>
     * <p>
     * If the <code>publish</code> parameter isn't set to <code>true</code>, this field returns null.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the published state machine version.</p>
     *         <p>
     *         If the <code>publish</code> parameter isn't set to <code>true</code>, this field returns null.
     */

    public String getStateMachineVersionArn() {
        return this.stateMachineVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the published state machine version.
     * </p>
     * <p>
     * If the <code>publish</code> parameter isn't set to <code>true</code>, this field returns null.
     * </p>
     * 
     * @param stateMachineVersionArn
     *        The Amazon Resource Name (ARN) of the published state machine version.</p>
     *        <p>
     *        If the <code>publish</code> parameter isn't set to <code>true</code>, this field returns null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStateMachineResult withStateMachineVersionArn(String stateMachineVersionArn) {
        setStateMachineVersionArn(stateMachineVersionArn);
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
        if (getUpdateDate() != null)
            sb.append("UpdateDate: ").append(getUpdateDate()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getStateMachineVersionArn() != null)
            sb.append("StateMachineVersionArn: ").append(getStateMachineVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStateMachineResult == false)
            return false;
        UpdateStateMachineResult other = (UpdateStateMachineResult) obj;
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null)
            return false;
        if (other.getUpdateDate() != null && other.getUpdateDate().equals(this.getUpdateDate()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getStateMachineVersionArn() == null ^ this.getStateMachineVersionArn() == null)
            return false;
        if (other.getStateMachineVersionArn() != null && other.getStateMachineVersionArn().equals(this.getStateMachineVersionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getStateMachineVersionArn() == null) ? 0 : getStateMachineVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStateMachineResult clone() {
        try {
            return (UpdateStateMachineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
