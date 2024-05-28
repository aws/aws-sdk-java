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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteTargetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTargetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the target group.
     * </p>
     */
    private String targetGroupIdentifier;

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param targetGroupIdentifier
     *        The ID or Amazon Resource Name (ARN) of the target group.
     */

    public void setTargetGroupIdentifier(String targetGroupIdentifier) {
        this.targetGroupIdentifier = targetGroupIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the target group.
     */

    public String getTargetGroupIdentifier() {
        return this.targetGroupIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param targetGroupIdentifier
     *        The ID or Amazon Resource Name (ARN) of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTargetGroupRequest withTargetGroupIdentifier(String targetGroupIdentifier) {
        setTargetGroupIdentifier(targetGroupIdentifier);
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
        if (getTargetGroupIdentifier() != null)
            sb.append("TargetGroupIdentifier: ").append(getTargetGroupIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTargetGroupRequest == false)
            return false;
        DeleteTargetGroupRequest other = (DeleteTargetGroupRequest) obj;
        if (other.getTargetGroupIdentifier() == null ^ this.getTargetGroupIdentifier() == null)
            return false;
        if (other.getTargetGroupIdentifier() != null && other.getTargetGroupIdentifier().equals(this.getTargetGroupIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetGroupIdentifier() == null) ? 0 : getTargetGroupIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTargetGroupRequest clone() {
        return (DeleteTargetGroupRequest) super.clone();
    }

}
