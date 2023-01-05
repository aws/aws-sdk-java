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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateComponentType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateComponentTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the component type.
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
     * The current state of the component type.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The ARN of the component type.
     * </p>
     * 
     * @param arn
     *        The ARN of the component type.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the component type.
     * </p>
     * 
     * @return The ARN of the component type.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the component type.
     * </p>
     * 
     * @param arn
     *        The ARN of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentTypeResult withArn(String arn) {
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

    public CreateComponentTypeResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The current state of the component type.
     * </p>
     * 
     * @param state
     *        The current state of the component type.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the component type.
     * </p>
     * 
     * @return The current state of the component type.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the component type.
     * </p>
     * 
     * @param state
     *        The current state of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public CreateComponentTypeResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the component type.
     * </p>
     * 
     * @param state
     *        The current state of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public CreateComponentTypeResult withState(State state) {
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

        if (obj instanceof CreateComponentTypeResult == false)
            return false;
        CreateComponentTypeResult other = (CreateComponentTypeResult) obj;
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public CreateComponentTypeResult clone() {
        try {
            return (CreateComponentTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
