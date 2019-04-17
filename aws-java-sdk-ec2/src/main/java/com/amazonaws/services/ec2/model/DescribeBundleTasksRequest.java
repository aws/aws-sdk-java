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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeBundleTasksRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBundleTasksRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeBundleTasksRequest> {

    /**
     * <p>
     * One or more bundle task IDs.
     * </p>
     * <p>
     * Default: Describes all your bundle tasks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> bundleIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>bundle-id</code> - The ID of the bundle task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-code</code> - If the task failed, the error code returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-message</code> - If the task failed, the error message returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The level of task completion, as a percentage (for example, 20%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-prefix</code> - The beginning of the AMI name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time the task started (for example, 2013-09-15T17:15:20.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the task (<code>pending</code> | <code>waiting-for-shutdown</code> |
     * <code>bundling</code> | <code>storing</code> | <code>cancelling</code> | <code>complete</code> |
     * <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update for the task.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * One or more bundle task IDs.
     * </p>
     * <p>
     * Default: Describes all your bundle tasks.
     * </p>
     * 
     * @return One or more bundle task IDs.</p>
     *         <p>
     *         Default: Describes all your bundle tasks.
     */

    public java.util.List<String> getBundleIds() {
        if (bundleIds == null) {
            bundleIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return bundleIds;
    }

    /**
     * <p>
     * One or more bundle task IDs.
     * </p>
     * <p>
     * Default: Describes all your bundle tasks.
     * </p>
     * 
     * @param bundleIds
     *        One or more bundle task IDs.</p>
     *        <p>
     *        Default: Describes all your bundle tasks.
     */

    public void setBundleIds(java.util.Collection<String> bundleIds) {
        if (bundleIds == null) {
            this.bundleIds = null;
            return;
        }

        this.bundleIds = new com.amazonaws.internal.SdkInternalList<String>(bundleIds);
    }

    /**
     * <p>
     * One or more bundle task IDs.
     * </p>
     * <p>
     * Default: Describes all your bundle tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBundleIds(java.util.Collection)} or {@link #withBundleIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bundleIds
     *        One or more bundle task IDs.</p>
     *        <p>
     *        Default: Describes all your bundle tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBundleTasksRequest withBundleIds(String... bundleIds) {
        if (this.bundleIds == null) {
            setBundleIds(new com.amazonaws.internal.SdkInternalList<String>(bundleIds.length));
        }
        for (String ele : bundleIds) {
            this.bundleIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more bundle task IDs.
     * </p>
     * <p>
     * Default: Describes all your bundle tasks.
     * </p>
     * 
     * @param bundleIds
     *        One or more bundle task IDs.</p>
     *        <p>
     *        Default: Describes all your bundle tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBundleTasksRequest withBundleIds(java.util.Collection<String> bundleIds) {
        setBundleIds(bundleIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>bundle-id</code> - The ID of the bundle task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-code</code> - If the task failed, the error code returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-message</code> - If the task failed, the error message returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The level of task completion, as a percentage (for example, 20%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-prefix</code> - The beginning of the AMI name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time the task started (for example, 2013-09-15T17:15:20.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the task (<code>pending</code> | <code>waiting-for-shutdown</code> |
     * <code>bundling</code> | <code>storing</code> | <code>cancelling</code> | <code>complete</code> |
     * <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update for the task.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>bundle-id</code> - The ID of the bundle task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>error-code</code> - If the task failed, the error code returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>error-message</code> - If the task failed, the error message returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-id</code> - The ID of the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>progress</code> - The level of task completion, as a percentage (for example, 20%).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3-prefix</code> - The beginning of the AMI name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>start-time</code> - The time the task started (for example, 2013-09-15T17:15:20.000Z).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the task (<code>pending</code> | <code>waiting-for-shutdown</code> |
     *         <code>bundling</code> | <code>storing</code> | <code>cancelling</code> | <code>complete</code> |
     *         <code>failed</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>update-time</code> - The time of the most recent update for the task.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>bundle-id</code> - The ID of the bundle task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-code</code> - If the task failed, the error code returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-message</code> - If the task failed, the error message returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The level of task completion, as a percentage (for example, 20%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-prefix</code> - The beginning of the AMI name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time the task started (for example, 2013-09-15T17:15:20.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the task (<code>pending</code> | <code>waiting-for-shutdown</code> |
     * <code>bundling</code> | <code>storing</code> | <code>cancelling</code> | <code>complete</code> |
     * <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update for the task.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>bundle-id</code> - The ID of the bundle task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>error-code</code> - If the task failed, the error code returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>error-message</code> - If the task failed, the error message returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>progress</code> - The level of task completion, as a percentage (for example, 20%).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3-prefix</code> - The beginning of the AMI name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start-time</code> - The time the task started (for example, 2013-09-15T17:15:20.000Z).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the task (<code>pending</code> | <code>waiting-for-shutdown</code> |
     *        <code>bundling</code> | <code>storing</code> | <code>cancelling</code> | <code>complete</code> |
     *        <code>failed</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>update-time</code> - The time of the most recent update for the task.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>bundle-id</code> - The ID of the bundle task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-code</code> - If the task failed, the error code returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-message</code> - If the task failed, the error message returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The level of task completion, as a percentage (for example, 20%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-prefix</code> - The beginning of the AMI name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time the task started (for example, 2013-09-15T17:15:20.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the task (<code>pending</code> | <code>waiting-for-shutdown</code> |
     * <code>bundling</code> | <code>storing</code> | <code>cancelling</code> | <code>complete</code> |
     * <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update for the task.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>bundle-id</code> - The ID of the bundle task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>error-code</code> - If the task failed, the error code returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>error-message</code> - If the task failed, the error message returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>progress</code> - The level of task completion, as a percentage (for example, 20%).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3-prefix</code> - The beginning of the AMI name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start-time</code> - The time the task started (for example, 2013-09-15T17:15:20.000Z).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the task (<code>pending</code> | <code>waiting-for-shutdown</code> |
     *        <code>bundling</code> | <code>storing</code> | <code>cancelling</code> | <code>complete</code> |
     *        <code>failed</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>update-time</code> - The time of the most recent update for the task.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBundleTasksRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>bundle-id</code> - The ID of the bundle task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-code</code> - If the task failed, the error code returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-message</code> - If the task failed, the error message returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The level of task completion, as a percentage (for example, 20%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-prefix</code> - The beginning of the AMI name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time the task started (for example, 2013-09-15T17:15:20.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the task (<code>pending</code> | <code>waiting-for-shutdown</code> |
     * <code>bundling</code> | <code>storing</code> | <code>cancelling</code> | <code>complete</code> |
     * <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update for the task.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>bundle-id</code> - The ID of the bundle task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>error-code</code> - If the task failed, the error code returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>error-message</code> - If the task failed, the error message returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>progress</code> - The level of task completion, as a percentage (for example, 20%).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3-prefix</code> - The beginning of the AMI name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start-time</code> - The time the task started (for example, 2013-09-15T17:15:20.000Z).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the task (<code>pending</code> | <code>waiting-for-shutdown</code> |
     *        <code>bundling</code> | <code>storing</code> | <code>cancelling</code> | <code>complete</code> |
     *        <code>failed</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>update-time</code> - The time of the most recent update for the task.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBundleTasksRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeBundleTasksRequest> getDryRunRequest() {
        Request<DescribeBundleTasksRequest> request = new DescribeBundleTasksRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getBundleIds() != null)
            sb.append("BundleIds: ").append(getBundleIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBundleTasksRequest == false)
            return false;
        DescribeBundleTasksRequest other = (DescribeBundleTasksRequest) obj;
        if (other.getBundleIds() == null ^ this.getBundleIds() == null)
            return false;
        if (other.getBundleIds() != null && other.getBundleIds().equals(this.getBundleIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleIds() == null) ? 0 : getBundleIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBundleTasksRequest clone() {
        return (DescribeBundleTasksRequest) super.clone();
    }
}
