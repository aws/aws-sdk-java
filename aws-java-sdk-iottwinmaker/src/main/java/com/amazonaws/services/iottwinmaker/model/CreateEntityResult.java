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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEntityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the entity.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The ARN of the entity.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time when the entity was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The current state of the entity.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The ID of the entity.
     * </p>
     * 
     * @param entityId
     *        The ID of the entity.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The ID of the entity.
     * </p>
     * 
     * @return The ID of the entity.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The ID of the entity.
     * </p>
     * 
     * @param entityId
     *        The ID of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEntityResult withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The ARN of the entity.
     * </p>
     * 
     * @param arn
     *        The ARN of the entity.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the entity.
     * </p>
     * 
     * @return The ARN of the entity.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the entity.
     * </p>
     * 
     * @param arn
     *        The ARN of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEntityResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time when the entity was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the entity was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time when the entity was created.
     * </p>
     * 
     * @return The date and time when the entity was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time when the entity was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the entity was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEntityResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The current state of the entity.
     * </p>
     * 
     * @param state
     *        The current state of the entity.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the entity.
     * </p>
     * 
     * @return The current state of the entity.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the entity.
     * </p>
     * 
     * @param state
     *        The current state of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public CreateEntityResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the entity.
     * </p>
     * 
     * @param state
     *        The current state of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public CreateEntityResult withState(State state) {
        this.state = state.toString();
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
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEntityResult == false)
            return false;
        CreateEntityResult other = (CreateEntityResult) obj;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public CreateEntityResult clone() {
        try {
            return (CreateEntityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
