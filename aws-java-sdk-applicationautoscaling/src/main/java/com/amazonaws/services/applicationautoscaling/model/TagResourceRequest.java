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
package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/TagResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies the Application Auto Scaling scalable target that you want to apply tags to.
     * </p>
     * <p>
     * For example:
     * <code>arn:aws:application-autoscaling:us-east-1:123456789012:scalable-target/1234abcd56ab78cd901ef1234567890ab123</code>
     * </p>
     * <p>
     * To get the ARN for a scalable target, use <a>DescribeScalableTargets</a>.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value.
     * </p>
     * <p>
     * You cannot have more than one tag on an Application Auto Scaling scalable target with the same tag key. If you
     * specify an existing tag key with a different tag value, Application Auto Scaling replaces the current tag value
     * with the specified one.
     * </p>
     * <p>
     * For information about the rules that apply to tag keys and tag values, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-defined
     * tag restrictions</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Identifies the Application Auto Scaling scalable target that you want to apply tags to.
     * </p>
     * <p>
     * For example:
     * <code>arn:aws:application-autoscaling:us-east-1:123456789012:scalable-target/1234abcd56ab78cd901ef1234567890ab123</code>
     * </p>
     * <p>
     * To get the ARN for a scalable target, use <a>DescribeScalableTargets</a>.
     * </p>
     * 
     * @param resourceARN
     *        Identifies the Application Auto Scaling scalable target that you want to apply tags to.</p>
     *        <p>
     *        For example:
     *        <code>arn:aws:application-autoscaling:us-east-1:123456789012:scalable-target/1234abcd56ab78cd901ef1234567890ab123</code>
     *        </p>
     *        <p>
     *        To get the ARN for a scalable target, use <a>DescribeScalableTargets</a>.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * Identifies the Application Auto Scaling scalable target that you want to apply tags to.
     * </p>
     * <p>
     * For example:
     * <code>arn:aws:application-autoscaling:us-east-1:123456789012:scalable-target/1234abcd56ab78cd901ef1234567890ab123</code>
     * </p>
     * <p>
     * To get the ARN for a scalable target, use <a>DescribeScalableTargets</a>.
     * </p>
     * 
     * @return Identifies the Application Auto Scaling scalable target that you want to apply tags to.</p>
     *         <p>
     *         For example:
     *         <code>arn:aws:application-autoscaling:us-east-1:123456789012:scalable-target/1234abcd56ab78cd901ef1234567890ab123</code>
     *         </p>
     *         <p>
     *         To get the ARN for a scalable target, use <a>DescribeScalableTargets</a>.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * Identifies the Application Auto Scaling scalable target that you want to apply tags to.
     * </p>
     * <p>
     * For example:
     * <code>arn:aws:application-autoscaling:us-east-1:123456789012:scalable-target/1234abcd56ab78cd901ef1234567890ab123</code>
     * </p>
     * <p>
     * To get the ARN for a scalable target, use <a>DescribeScalableTargets</a>.
     * </p>
     * 
     * @param resourceARN
     *        Identifies the Application Auto Scaling scalable target that you want to apply tags to.</p>
     *        <p>
     *        For example:
     *        <code>arn:aws:application-autoscaling:us-east-1:123456789012:scalable-target/1234abcd56ab78cd901ef1234567890ab123</code>
     *        </p>
     *        <p>
     *        To get the ARN for a scalable target, use <a>DescribeScalableTargets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value.
     * </p>
     * <p>
     * You cannot have more than one tag on an Application Auto Scaling scalable target with the same tag key. If you
     * specify an existing tag key with a different tag value, Application Auto Scaling replaces the current tag value
     * with the specified one.
     * </p>
     * <p>
     * For information about the rules that apply to tag keys and tag values, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-defined
     * tag restrictions</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @return The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services
     *         resource.</p>
     *         <p>
     *         Each tag consists of a tag key and a tag value.
     *         </p>
     *         <p>
     *         You cannot have more than one tag on an Application Auto Scaling scalable target with the same tag key.
     *         If you specify an existing tag key with a different tag value, Application Auto Scaling replaces the
     *         current tag value with the specified one.
     *         </p>
     *         <p>
     *         For information about the rules that apply to tag keys and tag values, see <a
     *         href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html"
     *         >User-defined tag restrictions</a> in the <i>Amazon Web Services Billing and Cost Management User
     *         Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value.
     * </p>
     * <p>
     * You cannot have more than one tag on an Application Auto Scaling scalable target with the same tag key. If you
     * specify an existing tag key with a different tag value, Application Auto Scaling replaces the current tag value
     * with the specified one.
     * </p>
     * <p>
     * For information about the rules that apply to tag keys and tag values, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-defined
     * tag restrictions</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services
     *        resource.</p>
     *        <p>
     *        Each tag consists of a tag key and a tag value.
     *        </p>
     *        <p>
     *        You cannot have more than one tag on an Application Auto Scaling scalable target with the same tag key. If
     *        you specify an existing tag key with a different tag value, Application Auto Scaling replaces the current
     *        tag value with the specified one.
     *        </p>
     *        <p>
     *        For information about the rules that apply to tag keys and tag values, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html"
     *        >User-defined tag restrictions</a> in the <i>Amazon Web Services Billing and Cost Management User
     *        Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value.
     * </p>
     * <p>
     * You cannot have more than one tag on an Application Auto Scaling scalable target with the same tag key. If you
     * specify an existing tag key with a different tag value, Application Auto Scaling replaces the current tag value
     * with the specified one.
     * </p>
     * <p>
     * For information about the rules that apply to tag keys and tag values, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-defined
     * tag restrictions</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services
     *        resource.</p>
     *        <p>
     *        Each tag consists of a tag key and a tag value.
     *        </p>
     *        <p>
     *        You cannot have more than one tag on an Application Auto Scaling scalable target with the same tag key. If
     *        you specify an existing tag key with a different tag value, Application Auto Scaling replaces the current
     *        tag value with the specified one.
     *        </p>
     *        <p>
     *        For information about the rules that apply to tag keys and tag values, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html"
     *        >User-defined tag restrictions</a> in the <i>Amazon Web Services Billing and Cost Management User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see TagResourceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest clearTagsEntries() {
        this.tags = null;
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
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

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
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

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
