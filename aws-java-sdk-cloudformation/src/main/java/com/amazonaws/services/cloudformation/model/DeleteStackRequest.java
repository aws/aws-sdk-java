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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for <a>DeleteStack</a> action.
 * </p>
 */
public class DeleteStackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * For stacks in the <code>DELETE_FAILED</code> state, a list of resource logical IDs that are associated with the
     * resources you want to retain. During deletion, AWS CloudFormation deletes the stack but does not delete the
     * retained resources.
     * </p>
     * <p>
     * Retaining resources is useful when you cannot delete a resource, such as a non-empty S3 bucket, but you want to
     * delete the stack.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> retainResources;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     * assumes to delete the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     */
    private String roleARN;

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name or the unique stack ID that is associated with the stack.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack.
     * </p>
     * 
     * @return The name or the unique stack ID that is associated with the stack.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name or the unique stack ID that is associated with the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStackRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * For stacks in the <code>DELETE_FAILED</code> state, a list of resource logical IDs that are associated with the
     * resources you want to retain. During deletion, AWS CloudFormation deletes the stack but does not delete the
     * retained resources.
     * </p>
     * <p>
     * Retaining resources is useful when you cannot delete a resource, such as a non-empty S3 bucket, but you want to
     * delete the stack.
     * </p>
     * 
     * @return For stacks in the <code>DELETE_FAILED</code> state, a list of resource logical IDs that are associated
     *         with the resources you want to retain. During deletion, AWS CloudFormation deletes the stack but does not
     *         delete the retained resources.</p>
     *         <p>
     *         Retaining resources is useful when you cannot delete a resource, such as a non-empty S3 bucket, but you
     *         want to delete the stack.
     */

    public java.util.List<String> getRetainResources() {
        if (retainResources == null) {
            retainResources = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return retainResources;
    }

    /**
     * <p>
     * For stacks in the <code>DELETE_FAILED</code> state, a list of resource logical IDs that are associated with the
     * resources you want to retain. During deletion, AWS CloudFormation deletes the stack but does not delete the
     * retained resources.
     * </p>
     * <p>
     * Retaining resources is useful when you cannot delete a resource, such as a non-empty S3 bucket, but you want to
     * delete the stack.
     * </p>
     * 
     * @param retainResources
     *        For stacks in the <code>DELETE_FAILED</code> state, a list of resource logical IDs that are associated
     *        with the resources you want to retain. During deletion, AWS CloudFormation deletes the stack but does not
     *        delete the retained resources.</p>
     *        <p>
     *        Retaining resources is useful when you cannot delete a resource, such as a non-empty S3 bucket, but you
     *        want to delete the stack.
     */

    public void setRetainResources(java.util.Collection<String> retainResources) {
        if (retainResources == null) {
            this.retainResources = null;
            return;
        }

        this.retainResources = new com.amazonaws.internal.SdkInternalList<String>(retainResources);
    }

    /**
     * <p>
     * For stacks in the <code>DELETE_FAILED</code> state, a list of resource logical IDs that are associated with the
     * resources you want to retain. During deletion, AWS CloudFormation deletes the stack but does not delete the
     * retained resources.
     * </p>
     * <p>
     * Retaining resources is useful when you cannot delete a resource, such as a non-empty S3 bucket, but you want to
     * delete the stack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRetainResources(java.util.Collection)} or {@link #withRetainResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param retainResources
     *        For stacks in the <code>DELETE_FAILED</code> state, a list of resource logical IDs that are associated
     *        with the resources you want to retain. During deletion, AWS CloudFormation deletes the stack but does not
     *        delete the retained resources.</p>
     *        <p>
     *        Retaining resources is useful when you cannot delete a resource, such as a non-empty S3 bucket, but you
     *        want to delete the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStackRequest withRetainResources(String... retainResources) {
        if (this.retainResources == null) {
            setRetainResources(new com.amazonaws.internal.SdkInternalList<String>(retainResources.length));
        }
        for (String ele : retainResources) {
            this.retainResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For stacks in the <code>DELETE_FAILED</code> state, a list of resource logical IDs that are associated with the
     * resources you want to retain. During deletion, AWS CloudFormation deletes the stack but does not delete the
     * retained resources.
     * </p>
     * <p>
     * Retaining resources is useful when you cannot delete a resource, such as a non-empty S3 bucket, but you want to
     * delete the stack.
     * </p>
     * 
     * @param retainResources
     *        For stacks in the <code>DELETE_FAILED</code> state, a list of resource logical IDs that are associated
     *        with the resources you want to retain. During deletion, AWS CloudFormation deletes the stack but does not
     *        delete the retained resources.</p>
     *        <p>
     *        Retaining resources is useful when you cannot delete a resource, such as a non-empty S3 bucket, but you
     *        want to delete the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStackRequest withRetainResources(java.util.Collection<String> retainResources) {
        setRetainResources(retainResources);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     * assumes to delete the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     *        assumes to delete the stack. AWS CloudFormation uses the role's credentials to make calls on your
     *        behalf.</p>
     *        <p>
     *        If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the
     *        stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your
     *        user credentials.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     * assumes to delete the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS
     *         CloudFormation assumes to delete the stack. AWS CloudFormation uses the role's credentials to make calls
     *         on your behalf.</p>
     *         <p>
     *         If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the
     *         stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your
     *         user credentials.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     * assumes to delete the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     *        assumes to delete the stack. AWS CloudFormation uses the role's credentials to make calls on your
     *        behalf.</p>
     *        <p>
     *        If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the
     *        stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your
     *        user credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStackRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
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
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getRetainResources() != null)
            sb.append("RetainResources: " + getRetainResources() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteStackRequest == false)
            return false;
        DeleteStackRequest other = (DeleteStackRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getRetainResources() == null ^ this.getRetainResources() == null)
            return false;
        if (other.getRetainResources() != null && other.getRetainResources().equals(this.getRetainResources()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getRetainResources() == null) ? 0 : getRetainResources().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        return hashCode;
    }

    @Override
    public DeleteStackRequest clone() {
        return (DeleteStackRequest) super.clone();
    }
}
