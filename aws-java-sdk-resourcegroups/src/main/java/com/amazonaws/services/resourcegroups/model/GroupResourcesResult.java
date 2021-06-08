/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GroupResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of ARNs of resources that were successfully added to the group by this operation.
     * </p>
     */
    private java.util.List<String> succeeded;
    /**
     * <p>
     * A list of ARNs of any resources that failed to be added to the group by this operation.
     * </p>
     */
    private java.util.List<FailedResource> failed;
    /**
     * <p>
     * A list of ARNs of any resources that are still in the process of being added to the group by this operation.
     * These pending additions continue asynchronously. You can check the status of pending additions by using the
     * <code> <a>ListGroupResources</a> </code> operation, and checking the <code>Resources</code> array in the response
     * and the <code>Status</code> field of each object in that array.
     * </p>
     */
    private java.util.List<PendingResource> pending;

    /**
     * <p>
     * A list of ARNs of resources that were successfully added to the group by this operation.
     * </p>
     * 
     * @return A list of ARNs of resources that were successfully added to the group by this operation.
     */

    public java.util.List<String> getSucceeded() {
        return succeeded;
    }

    /**
     * <p>
     * A list of ARNs of resources that were successfully added to the group by this operation.
     * </p>
     * 
     * @param succeeded
     *        A list of ARNs of resources that were successfully added to the group by this operation.
     */

    public void setSucceeded(java.util.Collection<String> succeeded) {
        if (succeeded == null) {
            this.succeeded = null;
            return;
        }

        this.succeeded = new java.util.ArrayList<String>(succeeded);
    }

    /**
     * <p>
     * A list of ARNs of resources that were successfully added to the group by this operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSucceeded(java.util.Collection)} or {@link #withSucceeded(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param succeeded
     *        A list of ARNs of resources that were successfully added to the group by this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupResourcesResult withSucceeded(String... succeeded) {
        if (this.succeeded == null) {
            setSucceeded(new java.util.ArrayList<String>(succeeded.length));
        }
        for (String ele : succeeded) {
            this.succeeded.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs of resources that were successfully added to the group by this operation.
     * </p>
     * 
     * @param succeeded
     *        A list of ARNs of resources that were successfully added to the group by this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupResourcesResult withSucceeded(java.util.Collection<String> succeeded) {
        setSucceeded(succeeded);
        return this;
    }

    /**
     * <p>
     * A list of ARNs of any resources that failed to be added to the group by this operation.
     * </p>
     * 
     * @return A list of ARNs of any resources that failed to be added to the group by this operation.
     */

    public java.util.List<FailedResource> getFailed() {
        return failed;
    }

    /**
     * <p>
     * A list of ARNs of any resources that failed to be added to the group by this operation.
     * </p>
     * 
     * @param failed
     *        A list of ARNs of any resources that failed to be added to the group by this operation.
     */

    public void setFailed(java.util.Collection<FailedResource> failed) {
        if (failed == null) {
            this.failed = null;
            return;
        }

        this.failed = new java.util.ArrayList<FailedResource>(failed);
    }

    /**
     * <p>
     * A list of ARNs of any resources that failed to be added to the group by this operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailed(java.util.Collection)} or {@link #withFailed(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param failed
     *        A list of ARNs of any resources that failed to be added to the group by this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupResourcesResult withFailed(FailedResource... failed) {
        if (this.failed == null) {
            setFailed(new java.util.ArrayList<FailedResource>(failed.length));
        }
        for (FailedResource ele : failed) {
            this.failed.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs of any resources that failed to be added to the group by this operation.
     * </p>
     * 
     * @param failed
     *        A list of ARNs of any resources that failed to be added to the group by this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupResourcesResult withFailed(java.util.Collection<FailedResource> failed) {
        setFailed(failed);
        return this;
    }

    /**
     * <p>
     * A list of ARNs of any resources that are still in the process of being added to the group by this operation.
     * These pending additions continue asynchronously. You can check the status of pending additions by using the
     * <code> <a>ListGroupResources</a> </code> operation, and checking the <code>Resources</code> array in the response
     * and the <code>Status</code> field of each object in that array.
     * </p>
     * 
     * @return A list of ARNs of any resources that are still in the process of being added to the group by this
     *         operation. These pending additions continue asynchronously. You can check the status of pending additions
     *         by using the <code> <a>ListGroupResources</a> </code> operation, and checking the <code>Resources</code>
     *         array in the response and the <code>Status</code> field of each object in that array.
     */

    public java.util.List<PendingResource> getPending() {
        return pending;
    }

    /**
     * <p>
     * A list of ARNs of any resources that are still in the process of being added to the group by this operation.
     * These pending additions continue asynchronously. You can check the status of pending additions by using the
     * <code> <a>ListGroupResources</a> </code> operation, and checking the <code>Resources</code> array in the response
     * and the <code>Status</code> field of each object in that array.
     * </p>
     * 
     * @param pending
     *        A list of ARNs of any resources that are still in the process of being added to the group by this
     *        operation. These pending additions continue asynchronously. You can check the status of pending additions
     *        by using the <code> <a>ListGroupResources</a> </code> operation, and checking the <code>Resources</code>
     *        array in the response and the <code>Status</code> field of each object in that array.
     */

    public void setPending(java.util.Collection<PendingResource> pending) {
        if (pending == null) {
            this.pending = null;
            return;
        }

        this.pending = new java.util.ArrayList<PendingResource>(pending);
    }

    /**
     * <p>
     * A list of ARNs of any resources that are still in the process of being added to the group by this operation.
     * These pending additions continue asynchronously. You can check the status of pending additions by using the
     * <code> <a>ListGroupResources</a> </code> operation, and checking the <code>Resources</code> array in the response
     * and the <code>Status</code> field of each object in that array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPending(java.util.Collection)} or {@link #withPending(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param pending
     *        A list of ARNs of any resources that are still in the process of being added to the group by this
     *        operation. These pending additions continue asynchronously. You can check the status of pending additions
     *        by using the <code> <a>ListGroupResources</a> </code> operation, and checking the <code>Resources</code>
     *        array in the response and the <code>Status</code> field of each object in that array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupResourcesResult withPending(PendingResource... pending) {
        if (this.pending == null) {
            setPending(new java.util.ArrayList<PendingResource>(pending.length));
        }
        for (PendingResource ele : pending) {
            this.pending.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs of any resources that are still in the process of being added to the group by this operation.
     * These pending additions continue asynchronously. You can check the status of pending additions by using the
     * <code> <a>ListGroupResources</a> </code> operation, and checking the <code>Resources</code> array in the response
     * and the <code>Status</code> field of each object in that array.
     * </p>
     * 
     * @param pending
     *        A list of ARNs of any resources that are still in the process of being added to the group by this
     *        operation. These pending additions continue asynchronously. You can check the status of pending additions
     *        by using the <code> <a>ListGroupResources</a> </code> operation, and checking the <code>Resources</code>
     *        array in the response and the <code>Status</code> field of each object in that array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupResourcesResult withPending(java.util.Collection<PendingResource> pending) {
        setPending(pending);
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
        if (getSucceeded() != null)
            sb.append("Succeeded: ").append(getSucceeded()).append(",");
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed()).append(",");
        if (getPending() != null)
            sb.append("Pending: ").append(getPending());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupResourcesResult == false)
            return false;
        GroupResourcesResult other = (GroupResourcesResult) obj;
        if (other.getSucceeded() == null ^ this.getSucceeded() == null)
            return false;
        if (other.getSucceeded() != null && other.getSucceeded().equals(this.getSucceeded()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        if (other.getPending() == null ^ this.getPending() == null)
            return false;
        if (other.getPending() != null && other.getPending().equals(this.getPending()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSucceeded() == null) ? 0 : getSucceeded().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getPending() == null) ? 0 : getPending().hashCode());
        return hashCode;
    }

    @Override
    public GroupResourcesResult clone() {
        try {
            return (GroupResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
