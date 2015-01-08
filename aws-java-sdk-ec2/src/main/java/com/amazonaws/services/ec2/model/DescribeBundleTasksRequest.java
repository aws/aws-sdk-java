/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeBundleTasksRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeBundleTasks(DescribeBundleTasksRequest) DescribeBundleTasks operation}.
 * <p>
 * Describes one or more of your bundling tasks.
 * </p>
 * <p>
 * <b>NOTE:</b> Completed bundle tasks are listed for only a limited
 * time. If your bundle task is no longer in the list, you can still
 * register an AMI from it. Just use RegisterImage with the Amazon S3
 * bucket name and image manifest name you provided to the bundle task.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeBundleTasks(DescribeBundleTasksRequest)
 */
public class DescribeBundleTasksRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeBundleTasksRequest> {

    /**
     * One or more bundle task IDs. <p>Default: Describes all your bundle
     * tasks.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> bundleIds;

    /**
     * One or more filters. <ul> <li> <p><code>bundle-id</code> - The ID of
     * the bundle task. </li> <li> <p><code>error-code</code> - If the task
     * failed, the error code returned. </li> <li>
     * <p><code>error-message</code> - If the task failed, the error message
     * returned. </li> <li> <p><code>instance-id</code> - The ID of the
     * instance. </li> <li> <p><code>progress</code> - The level of task
     * completion, as a percentage (for example, 20%). </li> <li>
     * <p><code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     * </li> <li> <p><code>s3-prefix</code> - The beginning of the AMI name.
     * </li> <li> <p><code>start-time</code> - The time the task started (for
     * example, 2013-09-15T17:15:20.000Z). </li> <li> <p><code>state</code> -
     * The state of the task (<code>pending</code> |
     * <code>waiting-for-shutdown</code> | <code>bundling</code> |
     * <code>storing</code> | <code>cancelling</code> | <code>complete</code>
     * | <code>failed</code>). </li> <li> <p><code>update-time</code> - The
     * time of the most recent update for the task. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more bundle task IDs. <p>Default: Describes all your bundle
     * tasks.
     *
     * @return One or more bundle task IDs. <p>Default: Describes all your bundle
     *         tasks.
     */
    public java.util.List<String> getBundleIds() {
        if (bundleIds == null) {
              bundleIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              bundleIds.setAutoConstruct(true);
        }
        return bundleIds;
    }
    
    /**
     * One or more bundle task IDs. <p>Default: Describes all your bundle
     * tasks.
     *
     * @param bundleIds One or more bundle task IDs. <p>Default: Describes all your bundle
     *         tasks.
     */
    public void setBundleIds(java.util.Collection<String> bundleIds) {
        if (bundleIds == null) {
            this.bundleIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> bundleIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(bundleIds.size());
        bundleIdsCopy.addAll(bundleIds);
        this.bundleIds = bundleIdsCopy;
    }
    
    /**
     * One or more bundle task IDs. <p>Default: Describes all your bundle
     * tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bundleIds One or more bundle task IDs. <p>Default: Describes all your bundle
     *         tasks.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeBundleTasksRequest withBundleIds(String... bundleIds) {
        if (getBundleIds() == null) setBundleIds(new java.util.ArrayList<String>(bundleIds.length));
        for (String value : bundleIds) {
            getBundleIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more bundle task IDs. <p>Default: Describes all your bundle
     * tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bundleIds One or more bundle task IDs. <p>Default: Describes all your bundle
     *         tasks.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeBundleTasksRequest withBundleIds(java.util.Collection<String> bundleIds) {
        if (bundleIds == null) {
            this.bundleIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> bundleIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(bundleIds.size());
            bundleIdsCopy.addAll(bundleIds);
            this.bundleIds = bundleIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>bundle-id</code> - The ID of
     * the bundle task. </li> <li> <p><code>error-code</code> - If the task
     * failed, the error code returned. </li> <li>
     * <p><code>error-message</code> - If the task failed, the error message
     * returned. </li> <li> <p><code>instance-id</code> - The ID of the
     * instance. </li> <li> <p><code>progress</code> - The level of task
     * completion, as a percentage (for example, 20%). </li> <li>
     * <p><code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     * </li> <li> <p><code>s3-prefix</code> - The beginning of the AMI name.
     * </li> <li> <p><code>start-time</code> - The time the task started (for
     * example, 2013-09-15T17:15:20.000Z). </li> <li> <p><code>state</code> -
     * The state of the task (<code>pending</code> |
     * <code>waiting-for-shutdown</code> | <code>bundling</code> |
     * <code>storing</code> | <code>cancelling</code> | <code>complete</code>
     * | <code>failed</code>). </li> <li> <p><code>update-time</code> - The
     * time of the most recent update for the task. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>bundle-id</code> - The ID of
     *         the bundle task. </li> <li> <p><code>error-code</code> - If the task
     *         failed, the error code returned. </li> <li>
     *         <p><code>error-message</code> - If the task failed, the error message
     *         returned. </li> <li> <p><code>instance-id</code> - The ID of the
     *         instance. </li> <li> <p><code>progress</code> - The level of task
     *         completion, as a percentage (for example, 20%). </li> <li>
     *         <p><code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     *         </li> <li> <p><code>s3-prefix</code> - The beginning of the AMI name.
     *         </li> <li> <p><code>start-time</code> - The time the task started (for
     *         example, 2013-09-15T17:15:20.000Z). </li> <li> <p><code>state</code> -
     *         The state of the task (<code>pending</code> |
     *         <code>waiting-for-shutdown</code> | <code>bundling</code> |
     *         <code>storing</code> | <code>cancelling</code> | <code>complete</code>
     *         | <code>failed</code>). </li> <li> <p><code>update-time</code> - The
     *         time of the most recent update for the task. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>bundle-id</code> - The ID of
     * the bundle task. </li> <li> <p><code>error-code</code> - If the task
     * failed, the error code returned. </li> <li>
     * <p><code>error-message</code> - If the task failed, the error message
     * returned. </li> <li> <p><code>instance-id</code> - The ID of the
     * instance. </li> <li> <p><code>progress</code> - The level of task
     * completion, as a percentage (for example, 20%). </li> <li>
     * <p><code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     * </li> <li> <p><code>s3-prefix</code> - The beginning of the AMI name.
     * </li> <li> <p><code>start-time</code> - The time the task started (for
     * example, 2013-09-15T17:15:20.000Z). </li> <li> <p><code>state</code> -
     * The state of the task (<code>pending</code> |
     * <code>waiting-for-shutdown</code> | <code>bundling</code> |
     * <code>storing</code> | <code>cancelling</code> | <code>complete</code>
     * | <code>failed</code>). </li> <li> <p><code>update-time</code> - The
     * time of the most recent update for the task. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>bundle-id</code> - The ID of
     *         the bundle task. </li> <li> <p><code>error-code</code> - If the task
     *         failed, the error code returned. </li> <li>
     *         <p><code>error-message</code> - If the task failed, the error message
     *         returned. </li> <li> <p><code>instance-id</code> - The ID of the
     *         instance. </li> <li> <p><code>progress</code> - The level of task
     *         completion, as a percentage (for example, 20%). </li> <li>
     *         <p><code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     *         </li> <li> <p><code>s3-prefix</code> - The beginning of the AMI name.
     *         </li> <li> <p><code>start-time</code> - The time the task started (for
     *         example, 2013-09-15T17:15:20.000Z). </li> <li> <p><code>state</code> -
     *         The state of the task (<code>pending</code> |
     *         <code>waiting-for-shutdown</code> | <code>bundling</code> |
     *         <code>storing</code> | <code>cancelling</code> | <code>complete</code>
     *         | <code>failed</code>). </li> <li> <p><code>update-time</code> - The
     *         time of the most recent update for the task. </li> </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>bundle-id</code> - The ID of
     * the bundle task. </li> <li> <p><code>error-code</code> - If the task
     * failed, the error code returned. </li> <li>
     * <p><code>error-message</code> - If the task failed, the error message
     * returned. </li> <li> <p><code>instance-id</code> - The ID of the
     * instance. </li> <li> <p><code>progress</code> - The level of task
     * completion, as a percentage (for example, 20%). </li> <li>
     * <p><code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     * </li> <li> <p><code>s3-prefix</code> - The beginning of the AMI name.
     * </li> <li> <p><code>start-time</code> - The time the task started (for
     * example, 2013-09-15T17:15:20.000Z). </li> <li> <p><code>state</code> -
     * The state of the task (<code>pending</code> |
     * <code>waiting-for-shutdown</code> | <code>bundling</code> |
     * <code>storing</code> | <code>cancelling</code> | <code>complete</code>
     * | <code>failed</code>). </li> <li> <p><code>update-time</code> - The
     * time of the most recent update for the task. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>bundle-id</code> - The ID of
     *         the bundle task. </li> <li> <p><code>error-code</code> - If the task
     *         failed, the error code returned. </li> <li>
     *         <p><code>error-message</code> - If the task failed, the error message
     *         returned. </li> <li> <p><code>instance-id</code> - The ID of the
     *         instance. </li> <li> <p><code>progress</code> - The level of task
     *         completion, as a percentage (for example, 20%). </li> <li>
     *         <p><code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     *         </li> <li> <p><code>s3-prefix</code> - The beginning of the AMI name.
     *         </li> <li> <p><code>start-time</code> - The time the task started (for
     *         example, 2013-09-15T17:15:20.000Z). </li> <li> <p><code>state</code> -
     *         The state of the task (<code>pending</code> |
     *         <code>waiting-for-shutdown</code> | <code>bundling</code> |
     *         <code>storing</code> | <code>cancelling</code> | <code>complete</code>
     *         | <code>failed</code>). </li> <li> <p><code>update-time</code> - The
     *         time of the most recent update for the task. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeBundleTasksRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>bundle-id</code> - The ID of
     * the bundle task. </li> <li> <p><code>error-code</code> - If the task
     * failed, the error code returned. </li> <li>
     * <p><code>error-message</code> - If the task failed, the error message
     * returned. </li> <li> <p><code>instance-id</code> - The ID of the
     * instance. </li> <li> <p><code>progress</code> - The level of task
     * completion, as a percentage (for example, 20%). </li> <li>
     * <p><code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     * </li> <li> <p><code>s3-prefix</code> - The beginning of the AMI name.
     * </li> <li> <p><code>start-time</code> - The time the task started (for
     * example, 2013-09-15T17:15:20.000Z). </li> <li> <p><code>state</code> -
     * The state of the task (<code>pending</code> |
     * <code>waiting-for-shutdown</code> | <code>bundling</code> |
     * <code>storing</code> | <code>cancelling</code> | <code>complete</code>
     * | <code>failed</code>). </li> <li> <p><code>update-time</code> - The
     * time of the most recent update for the task. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>bundle-id</code> - The ID of
     *         the bundle task. </li> <li> <p><code>error-code</code> - If the task
     *         failed, the error code returned. </li> <li>
     *         <p><code>error-message</code> - If the task failed, the error message
     *         returned. </li> <li> <p><code>instance-id</code> - The ID of the
     *         instance. </li> <li> <p><code>progress</code> - The level of task
     *         completion, as a percentage (for example, 20%). </li> <li>
     *         <p><code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     *         </li> <li> <p><code>s3-prefix</code> - The beginning of the AMI name.
     *         </li> <li> <p><code>start-time</code> - The time the task started (for
     *         example, 2013-09-15T17:15:20.000Z). </li> <li> <p><code>state</code> -
     *         The state of the task (<code>pending</code> |
     *         <code>waiting-for-shutdown</code> | <code>bundling</code> |
     *         <code>storing</code> | <code>cancelling</code> | <code>complete</code>
     *         | <code>failed</code>). </li> <li> <p><code>update-time</code> - The
     *         time of the most recent update for the task. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeBundleTasksRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeBundleTasksRequest> getDryRunRequest() {
        Request<DescribeBundleTasksRequest> request = new DescribeBundleTasksRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBundleIds() != null) sb.append("BundleIds: " + getBundleIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeBundleTasksRequest == false) return false;
        DescribeBundleTasksRequest other = (DescribeBundleTasksRequest)obj;
        
        if (other.getBundleIds() == null ^ this.getBundleIds() == null) return false;
        if (other.getBundleIds() != null && other.getBundleIds().equals(this.getBundleIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    