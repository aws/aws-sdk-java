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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UngroupResources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UngroupResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of resources that were successfully removed from the group by this operation.
     * </p>
     */
    private java.util.List<String> succeeded;
    /**
     * <p>
     * A list of any resources that failed to be removed from the group by this operation.
     * </p>
     */
    private java.util.List<FailedResource> failed;
    /**
     * <p>
     * A list of any resources that are still in the process of being removed from the group by this operation. These
     * pending removals continue asynchronously. You can check the status of pending removals by using the
     * <code> <a>ListGroupResources</a> </code> operation. After the resource is successfully removed, it no longer
     * appears in the response.
     * </p>
     */
    private java.util.List<PendingResource> pending;

    /**
     * <p>
     * A list of resources that were successfully removed from the group by this operation.
     * </p>
     * 
     * @return A list of resources that were successfully removed from the group by this operation.
     */

    public java.util.List<String> getSucceeded() {
        return succeeded;
    }

    /**
     * <p>
     * A list of resources that were successfully removed from the group by this operation.
     * </p>
     * 
     * @param succeeded
     *        A list of resources that were successfully removed from the group by this operation.
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
     * A list of resources that were successfully removed from the group by this operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSucceeded(java.util.Collection)} or {@link #withSucceeded(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param succeeded
     *        A list of resources that were successfully removed from the group by this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UngroupResourcesResult withSucceeded(String... succeeded) {
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
     * A list of resources that were successfully removed from the group by this operation.
     * </p>
     * 
     * @param succeeded
     *        A list of resources that were successfully removed from the group by this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UngroupResourcesResult withSucceeded(java.util.Collection<String> succeeded) {
        setSucceeded(succeeded);
        return this;
    }

    /**
     * <p>
     * A list of any resources that failed to be removed from the group by this operation.
     * </p>
     * 
     * @return A list of any resources that failed to be removed from the group by this operation.
     */

    public java.util.List<FailedResource> getFailed() {
        return failed;
    }

    /**
     * <p>
     * A list of any resources that failed to be removed from the group by this operation.
     * </p>
     * 
     * @param failed
     *        A list of any resources that failed to be removed from the group by this operation.
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
     * A list of any resources that failed to be removed from the group by this operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailed(java.util.Collection)} or {@link #withFailed(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param failed
     *        A list of any resources that failed to be removed from the group by this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UngroupResourcesResult withFailed(FailedResource... failed) {
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
     * A list of any resources that failed to be removed from the group by this operation.
     * </p>
     * 
     * @param failed
     *        A list of any resources that failed to be removed from the group by this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UngroupResourcesResult withFailed(java.util.Collection<FailedResource> failed) {
        setFailed(failed);
        return this;
    }

    /**
     * <p>
     * A list of any resources that are still in the process of being removed from the group by this operation. These
     * pending removals continue asynchronously. You can check the status of pending removals by using the
     * <code> <a>ListGroupResources</a> </code> operation. After the resource is successfully removed, it no longer
     * appears in the response.
     * </p>
     * 
     * @return A list of any resources that are still in the process of being removed from the group by this operation.
     *         These pending removals continue asynchronously. You can check the status of pending removals by using the
     *         <code> <a>ListGroupResources</a> </code> operation. After the resource is successfully removed, it no
     *         longer appears in the response.
     */

    public java.util.List<PendingResource> getPending() {
        return pending;
    }

    /**
     * <p>
     * A list of any resources that are still in the process of being removed from the group by this operation. These
     * pending removals continue asynchronously. You can check the status of pending removals by using the
     * <code> <a>ListGroupResources</a> </code> operation. After the resource is successfully removed, it no longer
     * appears in the response.
     * </p>
     * 
     * @param pending
     *        A list of any resources that are still in the process of being removed from the group by this operation.
     *        These pending removals continue asynchronously. You can check the status of pending removals by using the
     *        <code> <a>ListGroupResources</a> </code> operation. After the resource is successfully removed, it no
     *        longer appears in the response.
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
     * A list of any resources that are still in the process of being removed from the group by this operation. These
     * pending removals continue asynchronously. You can check the status of pending removals by using the
     * <code> <a>ListGroupResources</a> </code> operation. After the resource is successfully removed, it no longer
     * appears in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPending(java.util.Collection)} or {@link #withPending(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param pending
     *        A list of any resources that are still in the process of being removed from the group by this operation.
     *        These pending removals continue asynchronously. You can check the status of pending removals by using the
     *        <code> <a>ListGroupResources</a> </code> operation. After the resource is successfully removed, it no
     *        longer appears in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UngroupResourcesResult withPending(PendingResource... pending) {
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
     * A list of any resources that are still in the process of being removed from the group by this operation. These
     * pending removals continue asynchronously. You can check the status of pending removals by using the
     * <code> <a>ListGroupResources</a> </code> operation. After the resource is successfully removed, it no longer
     * appears in the response.
     * </p>
     * 
     * @param pending
     *        A list of any resources that are still in the process of being removed from the group by this operation.
     *        These pending removals continue asynchronously. You can check the status of pending removals by using the
     *        <code> <a>ListGroupResources</a> </code> operation. After the resource is successfully removed, it no
     *        longer appears in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UngroupResourcesResult withPending(java.util.Collection<PendingResource> pending) {
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

        if (obj instanceof UngroupResourcesResult == false)
            return false;
        UngroupResourcesResult other = (UngroupResourcesResult) obj;
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
    public UngroupResourcesResult clone() {
        try {
            return (UngroupResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
