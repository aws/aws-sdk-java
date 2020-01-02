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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>CreateCustomActionType</code> operation.
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
     * Specifies the tags applied to the custom action.
     * </p>
     */
    private java.util.List<Tag> tags;

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
     * <p>
     * Specifies the tags applied to the custom action.
     * </p>
     * 
     * @return Specifies the tags applied to the custom action.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the tags applied to the custom action.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to the custom action.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Specifies the tags applied to the custom action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to the custom action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomActionTypeResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the tags applied to the custom action.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to the custom action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomActionTypeResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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
