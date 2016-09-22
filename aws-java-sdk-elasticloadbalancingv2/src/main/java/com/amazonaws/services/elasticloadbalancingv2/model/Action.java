/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an action.
 * </p>
 */
public class Action implements Serializable, Cloneable {

    /**
     * <p>
     * The type of action.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     */
    private String targetGroupArn;

    /**
     * <p>
     * The type of action.
     * </p>
     * 
     * @param type
     *        The type of action.
     * @see ActionTypeEnum
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of action.
     * </p>
     * 
     * @return The type of action.
     * @see ActionTypeEnum
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of action.
     * </p>
     * 
     * @param type
     *        The type of action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionTypeEnum
     */

    public Action withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of action.
     * </p>
     * 
     * @param type
     *        The type of action.
     * @see ActionTypeEnum
     */

    public void setType(ActionTypeEnum type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of action.
     * </p>
     * 
     * @param type
     *        The type of action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionTypeEnum
     */

    public Action withType(ActionTypeEnum type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param targetGroupArn
     *        The Amazon Resource Name (ARN) of the target group.
     */

    public void setTargetGroupArn(String targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the target group.
     */

    public String getTargetGroupArn() {
        return this.targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param targetGroupArn
     *        The Amazon Resource Name (ARN) of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withTargetGroupArn(String targetGroupArn) {
        setTargetGroupArn(targetGroupArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Type: " + getType() + ",");
        if (getTargetGroupArn() != null)
            sb.append("TargetGroupArn: " + getTargetGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTargetGroupArn() == null ^ this.getTargetGroupArn() == null)
            return false;
        if (other.getTargetGroupArn() != null && other.getTargetGroupArn().equals(this.getTargetGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupArn() == null) ? 0 : getTargetGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public Action clone() {
        try {
            return (Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
