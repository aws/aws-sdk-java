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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of, and adds tags to, an on-premises instance operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/AddTagsToOnPremisesInstances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddTagsToOnPremisesInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The tag key-value pairs to add to the on-premises instances.
     * </p>
     * <p>
     * Keys and values are both required. Keys cannot be null or empty strings. Value-only tags are not allowed.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The names of the on-premises instances to which to add tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceNames;

    /**
     * <p>
     * The tag key-value pairs to add to the on-premises instances.
     * </p>
     * <p>
     * Keys and values are both required. Keys cannot be null or empty strings. Value-only tags are not allowed.
     * </p>
     * 
     * @return The tag key-value pairs to add to the on-premises instances.</p>
     *         <p>
     *         Keys and values are both required. Keys cannot be null or empty strings. Value-only tags are not allowed.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tag key-value pairs to add to the on-premises instances.
     * </p>
     * <p>
     * Keys and values are both required. Keys cannot be null or empty strings. Value-only tags are not allowed.
     * </p>
     * 
     * @param tags
     *        The tag key-value pairs to add to the on-premises instances.</p>
     *        <p>
     *        Keys and values are both required. Keys cannot be null or empty strings. Value-only tags are not allowed.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tag key-value pairs to add to the on-premises instances.
     * </p>
     * <p>
     * Keys and values are both required. Keys cannot be null or empty strings. Value-only tags are not allowed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag key-value pairs to add to the on-premises instances.</p>
     *        <p>
     *        Keys and values are both required. Keys cannot be null or empty strings. Value-only tags are not allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsToOnPremisesInstancesRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag key-value pairs to add to the on-premises instances.
     * </p>
     * <p>
     * Keys and values are both required. Keys cannot be null or empty strings. Value-only tags are not allowed.
     * </p>
     * 
     * @param tags
     *        The tag key-value pairs to add to the on-premises instances.</p>
     *        <p>
     *        Keys and values are both required. Keys cannot be null or empty strings. Value-only tags are not allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsToOnPremisesInstancesRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The names of the on-premises instances to which to add tags.
     * </p>
     * 
     * @return The names of the on-premises instances to which to add tags.
     */

    public java.util.List<String> getInstanceNames() {
        if (instanceNames == null) {
            instanceNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceNames;
    }

    /**
     * <p>
     * The names of the on-premises instances to which to add tags.
     * </p>
     * 
     * @param instanceNames
     *        The names of the on-premises instances to which to add tags.
     */

    public void setInstanceNames(java.util.Collection<String> instanceNames) {
        if (instanceNames == null) {
            this.instanceNames = null;
            return;
        }

        this.instanceNames = new com.amazonaws.internal.SdkInternalList<String>(instanceNames);
    }

    /**
     * <p>
     * The names of the on-premises instances to which to add tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceNames(java.util.Collection)} or {@link #withInstanceNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceNames
     *        The names of the on-premises instances to which to add tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsToOnPremisesInstancesRequest withInstanceNames(String... instanceNames) {
        if (this.instanceNames == null) {
            setInstanceNames(new com.amazonaws.internal.SdkInternalList<String>(instanceNames.length));
        }
        for (String ele : instanceNames) {
            this.instanceNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the on-premises instances to which to add tags.
     * </p>
     * 
     * @param instanceNames
     *        The names of the on-premises instances to which to add tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsToOnPremisesInstancesRequest withInstanceNames(java.util.Collection<String> instanceNames) {
        setInstanceNames(instanceNames);
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getInstanceNames() != null)
            sb.append("InstanceNames: ").append(getInstanceNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddTagsToOnPremisesInstancesRequest == false)
            return false;
        AddTagsToOnPremisesInstancesRequest other = (AddTagsToOnPremisesInstancesRequest) obj;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getInstanceNames() == null ^ this.getInstanceNames() == null)
            return false;
        if (other.getInstanceNames() != null && other.getInstanceNames().equals(this.getInstanceNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getInstanceNames() == null) ? 0 : getInstanceNames().hashCode());
        return hashCode;
    }

    @Override
    public AddTagsToOnPremisesInstancesRequest clone() {
        return (AddTagsToOnPremisesInstancesRequest) super.clone();
    }

}
