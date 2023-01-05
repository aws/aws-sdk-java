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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Specifies target details for an activated hook.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ChangeSetHookTargetDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeSetHookTargetDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the type.
     * </p>
     */
    private String targetType;
    /**
     * <p>
     * Required if <code>TargetType</code> is <code>RESOURCE</code>.
     * </p>
     */
    private ChangeSetHookResourceTargetDetails resourceTargetDetails;

    /**
     * <p>
     * The name of the type.
     * </p>
     * 
     * @param targetType
     *        The name of the type.
     * @see HookTargetType
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The name of the type.
     * </p>
     * 
     * @return The name of the type.
     * @see HookTargetType
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The name of the type.
     * </p>
     * 
     * @param targetType
     *        The name of the type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HookTargetType
     */

    public ChangeSetHookTargetDetails withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The name of the type.
     * </p>
     * 
     * @param targetType
     *        The name of the type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HookTargetType
     */

    public ChangeSetHookTargetDetails withTargetType(HookTargetType targetType) {
        this.targetType = targetType.toString();
        return this;
    }

    /**
     * <p>
     * Required if <code>TargetType</code> is <code>RESOURCE</code>.
     * </p>
     * 
     * @param resourceTargetDetails
     *        Required if <code>TargetType</code> is <code>RESOURCE</code>.
     */

    public void setResourceTargetDetails(ChangeSetHookResourceTargetDetails resourceTargetDetails) {
        this.resourceTargetDetails = resourceTargetDetails;
    }

    /**
     * <p>
     * Required if <code>TargetType</code> is <code>RESOURCE</code>.
     * </p>
     * 
     * @return Required if <code>TargetType</code> is <code>RESOURCE</code>.
     */

    public ChangeSetHookResourceTargetDetails getResourceTargetDetails() {
        return this.resourceTargetDetails;
    }

    /**
     * <p>
     * Required if <code>TargetType</code> is <code>RESOURCE</code>.
     * </p>
     * 
     * @param resourceTargetDetails
     *        Required if <code>TargetType</code> is <code>RESOURCE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetHookTargetDetails withResourceTargetDetails(ChangeSetHookResourceTargetDetails resourceTargetDetails) {
        setResourceTargetDetails(resourceTargetDetails);
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
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType()).append(",");
        if (getResourceTargetDetails() != null)
            sb.append("ResourceTargetDetails: ").append(getResourceTargetDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeSetHookTargetDetails == false)
            return false;
        ChangeSetHookTargetDetails other = (ChangeSetHookTargetDetails) obj;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getResourceTargetDetails() == null ^ this.getResourceTargetDetails() == null)
            return false;
        if (other.getResourceTargetDetails() != null && other.getResourceTargetDetails().equals(this.getResourceTargetDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getResourceTargetDetails() == null) ? 0 : getResourceTargetDetails().hashCode());
        return hashCode;
    }

    @Override
    public ChangeSetHookTargetDetails clone() {
        try {
            return (ChangeSetHookTargetDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
