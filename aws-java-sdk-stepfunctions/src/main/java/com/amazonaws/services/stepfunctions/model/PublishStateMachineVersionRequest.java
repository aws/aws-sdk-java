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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/PublishStateMachineVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishStateMachineVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine.
     * </p>
     */
    private String stateMachineArn;
    /**
     * <p>
     * Only publish the state machine version if the current state machine's revision ID matches the specified ID.
     * </p>
     * <p>
     * Use this option to avoid publishing a version if the state machine changed since you last updated it. If the
     * specified revision ID doesn't match the state machine's current revision ID, the API returns
     * <code>ConflictException</code>.
     * </p>
     * <note>
     * <p>
     * To specify an initial revision ID for a state machine with no revision ID assigned, specify the string
     * <code>INITIAL</code> for the <code>revisionId</code> parameter. For example, you can specify a
     * <code>revisionID</code> of <code>INITIAL</code> when you create a state machine using the
     * <a>CreateStateMachine</a> API action.
     * </p>
     * </note>
     */
    private String revisionId;
    /**
     * <p>
     * An optional description of the state machine version.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the state machine.
     */

    public void setStateMachineArn(String stateMachineArn) {
        this.stateMachineArn = stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the state machine.
     */

    public String getStateMachineArn() {
        return this.stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishStateMachineVersionRequest withStateMachineArn(String stateMachineArn) {
        setStateMachineArn(stateMachineArn);
        return this;
    }

    /**
     * <p>
     * Only publish the state machine version if the current state machine's revision ID matches the specified ID.
     * </p>
     * <p>
     * Use this option to avoid publishing a version if the state machine changed since you last updated it. If the
     * specified revision ID doesn't match the state machine's current revision ID, the API returns
     * <code>ConflictException</code>.
     * </p>
     * <note>
     * <p>
     * To specify an initial revision ID for a state machine with no revision ID assigned, specify the string
     * <code>INITIAL</code> for the <code>revisionId</code> parameter. For example, you can specify a
     * <code>revisionID</code> of <code>INITIAL</code> when you create a state machine using the
     * <a>CreateStateMachine</a> API action.
     * </p>
     * </note>
     * 
     * @param revisionId
     *        Only publish the state machine version if the current state machine's revision ID matches the specified
     *        ID.</p>
     *        <p>
     *        Use this option to avoid publishing a version if the state machine changed since you last updated it. If
     *        the specified revision ID doesn't match the state machine's current revision ID, the API returns
     *        <code>ConflictException</code>.
     *        </p>
     *        <note>
     *        <p>
     *        To specify an initial revision ID for a state machine with no revision ID assigned, specify the string
     *        <code>INITIAL</code> for the <code>revisionId</code> parameter. For example, you can specify a
     *        <code>revisionID</code> of <code>INITIAL</code> when you create a state machine using the
     *        <a>CreateStateMachine</a> API action.
     *        </p>
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * Only publish the state machine version if the current state machine's revision ID matches the specified ID.
     * </p>
     * <p>
     * Use this option to avoid publishing a version if the state machine changed since you last updated it. If the
     * specified revision ID doesn't match the state machine's current revision ID, the API returns
     * <code>ConflictException</code>.
     * </p>
     * <note>
     * <p>
     * To specify an initial revision ID for a state machine with no revision ID assigned, specify the string
     * <code>INITIAL</code> for the <code>revisionId</code> parameter. For example, you can specify a
     * <code>revisionID</code> of <code>INITIAL</code> when you create a state machine using the
     * <a>CreateStateMachine</a> API action.
     * </p>
     * </note>
     * 
     * @return Only publish the state machine version if the current state machine's revision ID matches the specified
     *         ID.</p>
     *         <p>
     *         Use this option to avoid publishing a version if the state machine changed since you last updated it. If
     *         the specified revision ID doesn't match the state machine's current revision ID, the API returns
     *         <code>ConflictException</code>.
     *         </p>
     *         <note>
     *         <p>
     *         To specify an initial revision ID for a state machine with no revision ID assigned, specify the string
     *         <code>INITIAL</code> for the <code>revisionId</code> parameter. For example, you can specify a
     *         <code>revisionID</code> of <code>INITIAL</code> when you create a state machine using the
     *         <a>CreateStateMachine</a> API action.
     *         </p>
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * Only publish the state machine version if the current state machine's revision ID matches the specified ID.
     * </p>
     * <p>
     * Use this option to avoid publishing a version if the state machine changed since you last updated it. If the
     * specified revision ID doesn't match the state machine's current revision ID, the API returns
     * <code>ConflictException</code>.
     * </p>
     * <note>
     * <p>
     * To specify an initial revision ID for a state machine with no revision ID assigned, specify the string
     * <code>INITIAL</code> for the <code>revisionId</code> parameter. For example, you can specify a
     * <code>revisionID</code> of <code>INITIAL</code> when you create a state machine using the
     * <a>CreateStateMachine</a> API action.
     * </p>
     * </note>
     * 
     * @param revisionId
     *        Only publish the state machine version if the current state machine's revision ID matches the specified
     *        ID.</p>
     *        <p>
     *        Use this option to avoid publishing a version if the state machine changed since you last updated it. If
     *        the specified revision ID doesn't match the state machine's current revision ID, the API returns
     *        <code>ConflictException</code>.
     *        </p>
     *        <note>
     *        <p>
     *        To specify an initial revision ID for a state machine with no revision ID assigned, specify the string
     *        <code>INITIAL</code> for the <code>revisionId</code> parameter. For example, you can specify a
     *        <code>revisionID</code> of <code>INITIAL</code> when you create a state machine using the
     *        <a>CreateStateMachine</a> API action.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishStateMachineVersionRequest withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * An optional description of the state machine version.
     * </p>
     * 
     * @param description
     *        An optional description of the state machine version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of the state machine version.
     * </p>
     * 
     * @return An optional description of the state machine version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of the state machine version.
     * </p>
     * 
     * @param description
     *        An optional description of the state machine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishStateMachineVersionRequest withDescription(String description) {
        setDescription(description);
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
        if (getStateMachineArn() != null)
            sb.append("StateMachineArn: ").append(getStateMachineArn()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishStateMachineVersionRequest == false)
            return false;
        PublishStateMachineVersionRequest other = (PublishStateMachineVersionRequest) obj;
        if (other.getStateMachineArn() == null ^ this.getStateMachineArn() == null)
            return false;
        if (other.getStateMachineArn() != null && other.getStateMachineArn().equals(this.getStateMachineArn()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStateMachineArn() == null) ? 0 : getStateMachineArn().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public PublishStateMachineVersionRequest clone() {
        return (PublishStateMachineVersionRequest) super.clone();
    }

}
