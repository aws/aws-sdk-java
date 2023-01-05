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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ListTagsForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the DMS resource to list tags for. This returns a
     * list of keys (names of tags) created for the resource and their associated tag values.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * List of ARNs that identify multiple DMS resources that you want to list tags for. This returns a list of keys
     * (tag names) and their associated tag values. It also returns each tag's associated <code>ResourceArn</code>
     * value, which is the ARN of the resource for which each listed tag is created.
     * </p>
     */
    private java.util.List<String> resourceArnList;

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the DMS resource to list tags for. This returns a
     * list of keys (names of tags) created for the resource and their associated tag values.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the DMS resource to list tags for. This
     *        returns a list of keys (names of tags) created for the resource and their associated tag values.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the DMS resource to list tags for. This returns a
     * list of keys (names of tags) created for the resource and their associated tag values.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) string that uniquely identifies the DMS resource to list tags for. This
     *         returns a list of keys (names of tags) created for the resource and their associated tag values.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the DMS resource to list tags for. This returns a
     * list of keys (names of tags) created for the resource and their associated tag values.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the DMS resource to list tags for. This
     *        returns a list of keys (names of tags) created for the resource and their associated tag values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * List of ARNs that identify multiple DMS resources that you want to list tags for. This returns a list of keys
     * (tag names) and their associated tag values. It also returns each tag's associated <code>ResourceArn</code>
     * value, which is the ARN of the resource for which each listed tag is created.
     * </p>
     * 
     * @return List of ARNs that identify multiple DMS resources that you want to list tags for. This returns a list of
     *         keys (tag names) and their associated tag values. It also returns each tag's associated
     *         <code>ResourceArn</code> value, which is the ARN of the resource for which each listed tag is created.
     */

    public java.util.List<String> getResourceArnList() {
        return resourceArnList;
    }

    /**
     * <p>
     * List of ARNs that identify multiple DMS resources that you want to list tags for. This returns a list of keys
     * (tag names) and their associated tag values. It also returns each tag's associated <code>ResourceArn</code>
     * value, which is the ARN of the resource for which each listed tag is created.
     * </p>
     * 
     * @param resourceArnList
     *        List of ARNs that identify multiple DMS resources that you want to list tags for. This returns a list of
     *        keys (tag names) and their associated tag values. It also returns each tag's associated
     *        <code>ResourceArn</code> value, which is the ARN of the resource for which each listed tag is created.
     */

    public void setResourceArnList(java.util.Collection<String> resourceArnList) {
        if (resourceArnList == null) {
            this.resourceArnList = null;
            return;
        }

        this.resourceArnList = new java.util.ArrayList<String>(resourceArnList);
    }

    /**
     * <p>
     * List of ARNs that identify multiple DMS resources that you want to list tags for. This returns a list of keys
     * (tag names) and their associated tag values. It also returns each tag's associated <code>ResourceArn</code>
     * value, which is the ARN of the resource for which each listed tag is created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArnList(java.util.Collection)} or {@link #withResourceArnList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourceArnList
     *        List of ARNs that identify multiple DMS resources that you want to list tags for. This returns a list of
     *        keys (tag names) and their associated tag values. It also returns each tag's associated
     *        <code>ResourceArn</code> value, which is the ARN of the resource for which each listed tag is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceArnList(String... resourceArnList) {
        if (this.resourceArnList == null) {
            setResourceArnList(new java.util.ArrayList<String>(resourceArnList.length));
        }
        for (String ele : resourceArnList) {
            this.resourceArnList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of ARNs that identify multiple DMS resources that you want to list tags for. This returns a list of keys
     * (tag names) and their associated tag values. It also returns each tag's associated <code>ResourceArn</code>
     * value, which is the ARN of the resource for which each listed tag is created.
     * </p>
     * 
     * @param resourceArnList
     *        List of ARNs that identify multiple DMS resources that you want to list tags for. This returns a list of
     *        keys (tag names) and their associated tag values. It also returns each tag's associated
     *        <code>ResourceArn</code> value, which is the ARN of the resource for which each listed tag is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceArnList(java.util.Collection<String> resourceArnList) {
        setResourceArnList(resourceArnList);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceArnList() != null)
            sb.append("ResourceArnList: ").append(getResourceArnList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceArnList() == null ^ this.getResourceArnList() == null)
            return false;
        if (other.getResourceArnList() != null && other.getResourceArnList().equals(this.getResourceArnList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArnList() == null) ? 0 : getResourceArnList().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }

}
