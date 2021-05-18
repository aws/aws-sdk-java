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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateAutoScalingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAutoScalingConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the auto scaling configuration. When you use it for the first time in an AWS Region, App Runner
     * creates revision number <code>1</code> of this name. When you use the same name in subsequent calls, App Runner
     * creates incremental revisions of the configuration.
     * </p>
     */
    private String autoScalingConfigurationName;
    /**
     * <p>
     * The maximum number of concurrent requests that you want an instance to process. If the number of concurrent
     * requests exceeds this limit, App Runner scales up your service.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     */
    private Integer maxConcurrency;
    /**
     * <p>
     * The minimum number of instances that App Runner provisions for your service. The service always has at least
     * <code>MinSize</code> provisioned instances. Some of them actively serve traffic. The rest of them (provisioned
     * and inactive instances) are a cost-effective compute capacity reserve and are ready to be quickly activated. You
     * pay for memory usage of all the provisioned instances. You pay for CPU usage of only the active subset.
     * </p>
     * <p>
     * App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the same
     * capacity for both old and new code.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     */
    private Integer minSize;
    /**
     * <p>
     * The maximum number of instances that your service scales up to. At most <code>MaxSize</code> instances actively
     * serve traffic for your service.
     * </p>
     * <p>
     * Default: <code>25</code>
     * </p>
     */
    private Integer maxSize;
    /**
     * <p>
     * A list of metadata items that you can associate with your auto scaling configuration resource. A tag is a
     * key-value pair.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A name for the auto scaling configuration. When you use it for the first time in an AWS Region, App Runner
     * creates revision number <code>1</code> of this name. When you use the same name in subsequent calls, App Runner
     * creates incremental revisions of the configuration.
     * </p>
     * 
     * @param autoScalingConfigurationName
     *        A name for the auto scaling configuration. When you use it for the first time in an AWS Region, App Runner
     *        creates revision number <code>1</code> of this name. When you use the same name in subsequent calls, App
     *        Runner creates incremental revisions of the configuration.
     */

    public void setAutoScalingConfigurationName(String autoScalingConfigurationName) {
        this.autoScalingConfigurationName = autoScalingConfigurationName;
    }

    /**
     * <p>
     * A name for the auto scaling configuration. When you use it for the first time in an AWS Region, App Runner
     * creates revision number <code>1</code> of this name. When you use the same name in subsequent calls, App Runner
     * creates incremental revisions of the configuration.
     * </p>
     * 
     * @return A name for the auto scaling configuration. When you use it for the first time in an AWS Region, App
     *         Runner creates revision number <code>1</code> of this name. When you use the same name in subsequent
     *         calls, App Runner creates incremental revisions of the configuration.
     */

    public String getAutoScalingConfigurationName() {
        return this.autoScalingConfigurationName;
    }

    /**
     * <p>
     * A name for the auto scaling configuration. When you use it for the first time in an AWS Region, App Runner
     * creates revision number <code>1</code> of this name. When you use the same name in subsequent calls, App Runner
     * creates incremental revisions of the configuration.
     * </p>
     * 
     * @param autoScalingConfigurationName
     *        A name for the auto scaling configuration. When you use it for the first time in an AWS Region, App Runner
     *        creates revision number <code>1</code> of this name. When you use the same name in subsequent calls, App
     *        Runner creates incremental revisions of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingConfigurationRequest withAutoScalingConfigurationName(String autoScalingConfigurationName) {
        setAutoScalingConfigurationName(autoScalingConfigurationName);
        return this;
    }

    /**
     * <p>
     * The maximum number of concurrent requests that you want an instance to process. If the number of concurrent
     * requests exceeds this limit, App Runner scales up your service.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of concurrent requests that you want an instance to process. If the number of
     *        concurrent requests exceeds this limit, App Runner scales up your service.</p>
     *        <p>
     *        Default: <code>100</code>
     */

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of concurrent requests that you want an instance to process. If the number of concurrent
     * requests exceeds this limit, App Runner scales up your service.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * 
     * @return The maximum number of concurrent requests that you want an instance to process. If the number of
     *         concurrent requests exceeds this limit, App Runner scales up your service.</p>
     *         <p>
     *         Default: <code>100</code>
     */

    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of concurrent requests that you want an instance to process. If the number of concurrent
     * requests exceeds this limit, App Runner scales up your service.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of concurrent requests that you want an instance to process. If the number of
     *        concurrent requests exceeds this limit, App Runner scales up your service.</p>
     *        <p>
     *        Default: <code>100</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingConfigurationRequest withMaxConcurrency(Integer maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The minimum number of instances that App Runner provisions for your service. The service always has at least
     * <code>MinSize</code> provisioned instances. Some of them actively serve traffic. The rest of them (provisioned
     * and inactive instances) are a cost-effective compute capacity reserve and are ready to be quickly activated. You
     * pay for memory usage of all the provisioned instances. You pay for CPU usage of only the active subset.
     * </p>
     * <p>
     * App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the same
     * capacity for both old and new code.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * 
     * @param minSize
     *        The minimum number of instances that App Runner provisions for your service. The service always has at
     *        least <code>MinSize</code> provisioned instances. Some of them actively serve traffic. The rest of them
     *        (provisioned and inactive instances) are a cost-effective compute capacity reserve and are ready to be
     *        quickly activated. You pay for memory usage of all the provisioned instances. You pay for CPU usage of
     *        only the active subset.</p>
     *        <p>
     *        App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the
     *        same capacity for both old and new code.
     *        </p>
     *        <p>
     *        Default: <code>1</code>
     */

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum number of instances that App Runner provisions for your service. The service always has at least
     * <code>MinSize</code> provisioned instances. Some of them actively serve traffic. The rest of them (provisioned
     * and inactive instances) are a cost-effective compute capacity reserve and are ready to be quickly activated. You
     * pay for memory usage of all the provisioned instances. You pay for CPU usage of only the active subset.
     * </p>
     * <p>
     * App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the same
     * capacity for both old and new code.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * 
     * @return The minimum number of instances that App Runner provisions for your service. The service always has at
     *         least <code>MinSize</code> provisioned instances. Some of them actively serve traffic. The rest of them
     *         (provisioned and inactive instances) are a cost-effective compute capacity reserve and are ready to be
     *         quickly activated. You pay for memory usage of all the provisioned instances. You pay for CPU usage of
     *         only the active subset.</p>
     *         <p>
     *         App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the
     *         same capacity for both old and new code.
     *         </p>
     *         <p>
     *         Default: <code>1</code>
     */

    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * <p>
     * The minimum number of instances that App Runner provisions for your service. The service always has at least
     * <code>MinSize</code> provisioned instances. Some of them actively serve traffic. The rest of them (provisioned
     * and inactive instances) are a cost-effective compute capacity reserve and are ready to be quickly activated. You
     * pay for memory usage of all the provisioned instances. You pay for CPU usage of only the active subset.
     * </p>
     * <p>
     * App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the same
     * capacity for both old and new code.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * 
     * @param minSize
     *        The minimum number of instances that App Runner provisions for your service. The service always has at
     *        least <code>MinSize</code> provisioned instances. Some of them actively serve traffic. The rest of them
     *        (provisioned and inactive instances) are a cost-effective compute capacity reserve and are ready to be
     *        quickly activated. You pay for memory usage of all the provisioned instances. You pay for CPU usage of
     *        only the active subset.</p>
     *        <p>
     *        App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the
     *        same capacity for both old and new code.
     *        </p>
     *        <p>
     *        Default: <code>1</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingConfigurationRequest withMinSize(Integer minSize) {
        setMinSize(minSize);
        return this;
    }

    /**
     * <p>
     * The maximum number of instances that your service scales up to. At most <code>MaxSize</code> instances actively
     * serve traffic for your service.
     * </p>
     * <p>
     * Default: <code>25</code>
     * </p>
     * 
     * @param maxSize
     *        The maximum number of instances that your service scales up to. At most <code>MaxSize</code> instances
     *        actively serve traffic for your service.</p>
     *        <p>
     *        Default: <code>25</code>
     */

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum number of instances that your service scales up to. At most <code>MaxSize</code> instances actively
     * serve traffic for your service.
     * </p>
     * <p>
     * Default: <code>25</code>
     * </p>
     * 
     * @return The maximum number of instances that your service scales up to. At most <code>MaxSize</code> instances
     *         actively serve traffic for your service.</p>
     *         <p>
     *         Default: <code>25</code>
     */

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * The maximum number of instances that your service scales up to. At most <code>MaxSize</code> instances actively
     * serve traffic for your service.
     * </p>
     * <p>
     * Default: <code>25</code>
     * </p>
     * 
     * @param maxSize
     *        The maximum number of instances that your service scales up to. At most <code>MaxSize</code> instances
     *        actively serve traffic for your service.</p>
     *        <p>
     *        Default: <code>25</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingConfigurationRequest withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
        return this;
    }

    /**
     * <p>
     * A list of metadata items that you can associate with your auto scaling configuration resource. A tag is a
     * key-value pair.
     * </p>
     * 
     * @return A list of metadata items that you can associate with your auto scaling configuration resource. A tag is a
     *         key-value pair.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of metadata items that you can associate with your auto scaling configuration resource. A tag is a
     * key-value pair.
     * </p>
     * 
     * @param tags
     *        A list of metadata items that you can associate with your auto scaling configuration resource. A tag is a
     *        key-value pair.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of metadata items that you can associate with your auto scaling configuration resource. A tag is a
     * key-value pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of metadata items that you can associate with your auto scaling configuration resource. A tag is a
     *        key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingConfigurationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of metadata items that you can associate with your auto scaling configuration resource. A tag is a
     * key-value pair.
     * </p>
     * 
     * @param tags
     *        A list of metadata items that you can associate with your auto scaling configuration resource. A tag is a
     *        key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingConfigurationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAutoScalingConfigurationName() != null)
            sb.append("AutoScalingConfigurationName: ").append(getAutoScalingConfigurationName()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getMinSize() != null)
            sb.append("MinSize: ").append(getMinSize()).append(",");
        if (getMaxSize() != null)
            sb.append("MaxSize: ").append(getMaxSize()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAutoScalingConfigurationRequest == false)
            return false;
        CreateAutoScalingConfigurationRequest other = (CreateAutoScalingConfigurationRequest) obj;
        if (other.getAutoScalingConfigurationName() == null ^ this.getAutoScalingConfigurationName() == null)
            return false;
        if (other.getAutoScalingConfigurationName() != null && other.getAutoScalingConfigurationName().equals(this.getAutoScalingConfigurationName()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getMinSize() == null ^ this.getMinSize() == null)
            return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingConfigurationName() == null) ? 0 : getAutoScalingConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAutoScalingConfigurationRequest clone() {
        return (CreateAutoScalingConfigurationRequest) super.clone();
    }

}
