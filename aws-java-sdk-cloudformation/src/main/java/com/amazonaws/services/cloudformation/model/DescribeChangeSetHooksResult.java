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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeChangeSetHooks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChangeSetHooksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The change set identifier (stack ID).
     * </p>
     */
    private String changeSetId;
    /**
     * <p>
     * The change set name.
     * </p>
     */
    private String changeSetName;
    /**
     * <p>
     * List of hook objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ChangeSetHook> hooks;
    /**
     * <p>
     * Provides the status of the change set hook.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Pagination token, <code>null</code> or empty if no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The stack identifier (stack ID).
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The stack name.
     * </p>
     */
    private String stackName;

    /**
     * <p>
     * The change set identifier (stack ID).
     * </p>
     * 
     * @param changeSetId
     *        The change set identifier (stack ID).
     */

    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>
     * The change set identifier (stack ID).
     * </p>
     * 
     * @return The change set identifier (stack ID).
     */

    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * <p>
     * The change set identifier (stack ID).
     * </p>
     * 
     * @param changeSetId
     *        The change set identifier (stack ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetHooksResult withChangeSetId(String changeSetId) {
        setChangeSetId(changeSetId);
        return this;
    }

    /**
     * <p>
     * The change set name.
     * </p>
     * 
     * @param changeSetName
     *        The change set name.
     */

    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * The change set name.
     * </p>
     * 
     * @return The change set name.
     */

    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * <p>
     * The change set name.
     * </p>
     * 
     * @param changeSetName
     *        The change set name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetHooksResult withChangeSetName(String changeSetName) {
        setChangeSetName(changeSetName);
        return this;
    }

    /**
     * <p>
     * List of hook objects.
     * </p>
     * 
     * @return List of hook objects.
     */

    public java.util.List<ChangeSetHook> getHooks() {
        if (hooks == null) {
            hooks = new com.amazonaws.internal.SdkInternalList<ChangeSetHook>();
        }
        return hooks;
    }

    /**
     * <p>
     * List of hook objects.
     * </p>
     * 
     * @param hooks
     *        List of hook objects.
     */

    public void setHooks(java.util.Collection<ChangeSetHook> hooks) {
        if (hooks == null) {
            this.hooks = null;
            return;
        }

        this.hooks = new com.amazonaws.internal.SdkInternalList<ChangeSetHook>(hooks);
    }

    /**
     * <p>
     * List of hook objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHooks(java.util.Collection)} or {@link #withHooks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param hooks
     *        List of hook objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetHooksResult withHooks(ChangeSetHook... hooks) {
        if (this.hooks == null) {
            setHooks(new com.amazonaws.internal.SdkInternalList<ChangeSetHook>(hooks.length));
        }
        for (ChangeSetHook ele : hooks) {
            this.hooks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of hook objects.
     * </p>
     * 
     * @param hooks
     *        List of hook objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetHooksResult withHooks(java.util.Collection<ChangeSetHook> hooks) {
        setHooks(hooks);
        return this;
    }

    /**
     * <p>
     * Provides the status of the change set hook.
     * </p>
     * 
     * @param status
     *        Provides the status of the change set hook.
     * @see ChangeSetHooksStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Provides the status of the change set hook.
     * </p>
     * 
     * @return Provides the status of the change set hook.
     * @see ChangeSetHooksStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Provides the status of the change set hook.
     * </p>
     * 
     * @param status
     *        Provides the status of the change set hook.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeSetHooksStatus
     */

    public DescribeChangeSetHooksResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Provides the status of the change set hook.
     * </p>
     * 
     * @param status
     *        Provides the status of the change set hook.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeSetHooksStatus
     */

    public DescribeChangeSetHooksResult withStatus(ChangeSetHooksStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Pagination token, <code>null</code> or empty if no more results.
     * </p>
     * 
     * @param nextToken
     *        Pagination token, <code>null</code> or empty if no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token, <code>null</code> or empty if no more results.
     * </p>
     * 
     * @return Pagination token, <code>null</code> or empty if no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token, <code>null</code> or empty if no more results.
     * </p>
     * 
     * @param nextToken
     *        Pagination token, <code>null</code> or empty if no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetHooksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The stack identifier (stack ID).
     * </p>
     * 
     * @param stackId
     *        The stack identifier (stack ID).
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack identifier (stack ID).
     * </p>
     * 
     * @return The stack identifier (stack ID).
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack identifier (stack ID).
     * </p>
     * 
     * @param stackId
     *        The stack identifier (stack ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetHooksResult withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The stack name.
     * </p>
     * 
     * @param stackName
     *        The stack name.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The stack name.
     * </p>
     * 
     * @return The stack name.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The stack name.
     * </p>
     * 
     * @param stackName
     *        The stack name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetHooksResult withStackName(String stackName) {
        setStackName(stackName);
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
        if (getChangeSetId() != null)
            sb.append("ChangeSetId: ").append(getChangeSetId()).append(",");
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: ").append(getChangeSetName()).append(",");
        if (getHooks() != null)
            sb.append("Hooks: ").append(getHooks()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChangeSetHooksResult == false)
            return false;
        DescribeChangeSetHooksResult other = (DescribeChangeSetHooksResult) obj;
        if (other.getChangeSetId() == null ^ this.getChangeSetId() == null)
            return false;
        if (other.getChangeSetId() != null && other.getChangeSetId().equals(this.getChangeSetId()) == false)
            return false;
        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getHooks() == null ^ this.getHooks() == null)
            return false;
        if (other.getHooks() != null && other.getHooks().equals(this.getHooks()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeSetId() == null) ? 0 : getChangeSetId().hashCode());
        hashCode = prime * hashCode + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode + ((getHooks() == null) ? 0 : getHooks().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeChangeSetHooksResult clone() {
        try {
            return (DescribeChangeSetHooksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
