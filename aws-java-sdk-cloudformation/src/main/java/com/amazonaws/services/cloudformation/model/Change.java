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
 * The <code>Change</code> structure describes the changes AWS CloudFormation will perform if you execute the change
 * set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/Change" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Change implements Serializable, Cloneable {

    /**
     * <p>
     * The type of entity that AWS CloudFormation changes. Currently, the only entity type is <code>Resource</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A <code>ResourceChange</code> structure that describes the resource and action that AWS CloudFormation will
     * perform.
     * </p>
     */
    private ResourceChange resourceChange;

    /**
     * <p>
     * The type of entity that AWS CloudFormation changes. Currently, the only entity type is <code>Resource</code>.
     * </p>
     * 
     * @param type
     *        The type of entity that AWS CloudFormation changes. Currently, the only entity type is
     *        <code>Resource</code>.
     * @see ChangeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of entity that AWS CloudFormation changes. Currently, the only entity type is <code>Resource</code>.
     * </p>
     * 
     * @return The type of entity that AWS CloudFormation changes. Currently, the only entity type is
     *         <code>Resource</code>.
     * @see ChangeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of entity that AWS CloudFormation changes. Currently, the only entity type is <code>Resource</code>.
     * </p>
     * 
     * @param type
     *        The type of entity that AWS CloudFormation changes. Currently, the only entity type is
     *        <code>Resource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public Change withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of entity that AWS CloudFormation changes. Currently, the only entity type is <code>Resource</code>.
     * </p>
     * 
     * @param type
     *        The type of entity that AWS CloudFormation changes. Currently, the only entity type is
     *        <code>Resource</code>.
     * @see ChangeType
     */

    public void setType(ChangeType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of entity that AWS CloudFormation changes. Currently, the only entity type is <code>Resource</code>.
     * </p>
     * 
     * @param type
     *        The type of entity that AWS CloudFormation changes. Currently, the only entity type is
     *        <code>Resource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public Change withType(ChangeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A <code>ResourceChange</code> structure that describes the resource and action that AWS CloudFormation will
     * perform.
     * </p>
     * 
     * @param resourceChange
     *        A <code>ResourceChange</code> structure that describes the resource and action that AWS CloudFormation
     *        will perform.
     */

    public void setResourceChange(ResourceChange resourceChange) {
        this.resourceChange = resourceChange;
    }

    /**
     * <p>
     * A <code>ResourceChange</code> structure that describes the resource and action that AWS CloudFormation will
     * perform.
     * </p>
     * 
     * @return A <code>ResourceChange</code> structure that describes the resource and action that AWS CloudFormation
     *         will perform.
     */

    public ResourceChange getResourceChange() {
        return this.resourceChange;
    }

    /**
     * <p>
     * A <code>ResourceChange</code> structure that describes the resource and action that AWS CloudFormation will
     * perform.
     * </p>
     * 
     * @param resourceChange
     *        A <code>ResourceChange</code> structure that describes the resource and action that AWS CloudFormation
     *        will perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Change withResourceChange(ResourceChange resourceChange) {
        setResourceChange(resourceChange);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getResourceChange() != null)
            sb.append("ResourceChange: ").append(getResourceChange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Change == false)
            return false;
        Change other = (Change) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResourceChange() == null ^ this.getResourceChange() == null)
            return false;
        if (other.getResourceChange() != null && other.getResourceChange().equals(this.getResourceChange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getResourceChange() == null) ? 0 : getResourceChange().hashCode());
        return hashCode;
    }

    @Override
    public Change clone() {
        try {
            return (Change) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
