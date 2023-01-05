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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/AssociateResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the group. You can specify the group name, the ARN, or the group ID as the <code>GroupIdentifier</code>
     * .
     * </p>
     */
    private String groupIdentifier;
    /**
     * <p>
     * The ARN of the canary that you want to associate with the specified group.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * Specifies the group. You can specify the group name, the ARN, or the group ID as the <code>GroupIdentifier</code>
     * .
     * </p>
     * 
     * @param groupIdentifier
     *        Specifies the group. You can specify the group name, the ARN, or the group ID as the
     *        <code>GroupIdentifier</code>.
     */

    public void setGroupIdentifier(String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }

    /**
     * <p>
     * Specifies the group. You can specify the group name, the ARN, or the group ID as the <code>GroupIdentifier</code>
     * .
     * </p>
     * 
     * @return Specifies the group. You can specify the group name, the ARN, or the group ID as the
     *         <code>GroupIdentifier</code>.
     */

    public String getGroupIdentifier() {
        return this.groupIdentifier;
    }

    /**
     * <p>
     * Specifies the group. You can specify the group name, the ARN, or the group ID as the <code>GroupIdentifier</code>
     * .
     * </p>
     * 
     * @param groupIdentifier
     *        Specifies the group. You can specify the group name, the ARN, or the group ID as the
     *        <code>GroupIdentifier</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceRequest withGroupIdentifier(String groupIdentifier) {
        setGroupIdentifier(groupIdentifier);
        return this;
    }

    /**
     * <p>
     * The ARN of the canary that you want to associate with the specified group.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the canary that you want to associate with the specified group.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the canary that you want to associate with the specified group.
     * </p>
     * 
     * @return The ARN of the canary that you want to associate with the specified group.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the canary that you want to associate with the specified group.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the canary that you want to associate with the specified group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getGroupIdentifier() != null)
            sb.append("GroupIdentifier: ").append(getGroupIdentifier()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateResourceRequest == false)
            return false;
        AssociateResourceRequest other = (AssociateResourceRequest) obj;
        if (other.getGroupIdentifier() == null ^ this.getGroupIdentifier() == null)
            return false;
        if (other.getGroupIdentifier() != null && other.getGroupIdentifier().equals(this.getGroupIdentifier()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupIdentifier() == null) ? 0 : getGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public AssociateResourceRequest clone() {
        return (AssociateResourceRequest) super.clone();
    }

}
