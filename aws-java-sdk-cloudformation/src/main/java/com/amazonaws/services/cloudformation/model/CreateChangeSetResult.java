/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output for the <a>CreateChangeSet</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChangeSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the change set.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The unique ID of the stack.
     * </p>
     */
    private String stackId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the change set.
     * </p>
     * 
     * @param id
     *        The Amazon Resource Name (ARN) of the change set.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the change set.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the change set.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the change set.
     * </p>
     * 
     * @param id
     *        The Amazon Resource Name (ARN) of the change set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The unique ID of the stack.
     * </p>
     * 
     * @param stackId
     *        The unique ID of the stack.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The unique ID of the stack.
     * </p>
     * 
     * @return The unique ID of the stack.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The unique ID of the stack.
     * </p>
     * 
     * @param stackId
     *        The unique ID of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetResult withStackId(String stackId) {
        setStackId(stackId);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChangeSetResult == false)
            return false;
        CreateChangeSetResult other = (CreateChangeSetResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        return hashCode;
    }

    @Override
    public CreateChangeSetResult clone() {
        try {
            return (CreateChangeSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
