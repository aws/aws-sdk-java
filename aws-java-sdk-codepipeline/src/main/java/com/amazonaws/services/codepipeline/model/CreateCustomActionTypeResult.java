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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a CreateCustomActionType operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/CreateCustomActionType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomActionTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns information about the details of an action type.
     * </p>
     */
    private ActionType actionType;

    /**
     * <p>
     * Returns information about the details of an action type.
     * </p>
     * 
     * @param actionType
     *        Returns information about the details of an action type.
     */

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * Returns information about the details of an action type.
     * </p>
     * 
     * @return Returns information about the details of an action type.
     */

    public ActionType getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * Returns information about the details of an action type.
     * </p>
     * 
     * @param actionType
     *        Returns information about the details of an action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomActionTypeResult withActionType(ActionType actionType) {
        setActionType(actionType);
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
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomActionTypeResult == false)
            return false;
        CreateCustomActionTypeResult other = (CreateCustomActionTypeResult) obj;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomActionTypeResult clone() {
        try {
            return (CreateCustomActionTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
