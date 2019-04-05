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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the AWS Glue resource to which to add the tags. For more information about AWS Glue resource ARNs, see
     * the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id">AWS
     * Glue ARN string pattern</a>.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Tags to add to this resource.
     * </p>
     */
    private java.util.Map<String, String> tagsToAdd;

    /**
     * <p>
     * The ARN of the AWS Glue resource to which to add the tags. For more information about AWS Glue resource ARNs, see
     * the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id">AWS
     * Glue ARN string pattern</a>.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the AWS Glue resource to which to add the tags. For more information about AWS Glue resource
     *        ARNs, see the <a href=
     *        "http://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id"
     *        >AWS Glue ARN string pattern</a>.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the AWS Glue resource to which to add the tags. For more information about AWS Glue resource ARNs, see
     * the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id">AWS
     * Glue ARN string pattern</a>.
     * </p>
     * 
     * @return The ARN of the AWS Glue resource to which to add the tags. For more information about AWS Glue resource
     *         ARNs, see the <a href=
     *         "http://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id"
     *         >AWS Glue ARN string pattern</a>.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the AWS Glue resource to which to add the tags. For more information about AWS Glue resource ARNs, see
     * the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id">AWS
     * Glue ARN string pattern</a>.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the AWS Glue resource to which to add the tags. For more information about AWS Glue resource
     *        ARNs, see the <a href=
     *        "http://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id"
     *        >AWS Glue ARN string pattern</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Tags to add to this resource.
     * </p>
     * 
     * @return Tags to add to this resource.
     */

    public java.util.Map<String, String> getTagsToAdd() {
        return tagsToAdd;
    }

    /**
     * <p>
     * Tags to add to this resource.
     * </p>
     * 
     * @param tagsToAdd
     *        Tags to add to this resource.
     */

    public void setTagsToAdd(java.util.Map<String, String> tagsToAdd) {
        this.tagsToAdd = tagsToAdd;
    }

    /**
     * <p>
     * Tags to add to this resource.
     * </p>
     * 
     * @param tagsToAdd
     *        Tags to add to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTagsToAdd(java.util.Map<String, String> tagsToAdd) {
        setTagsToAdd(tagsToAdd);
        return this;
    }

    public TagResourceRequest addTagsToAddEntry(String key, String value) {
        if (null == this.tagsToAdd) {
            this.tagsToAdd = new java.util.HashMap<String, String>();
        }
        if (this.tagsToAdd.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tagsToAdd.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TagsToAdd.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest clearTagsToAddEntries() {
        this.tagsToAdd = null;
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
        if (getTagsToAdd() != null)
            sb.append("TagsToAdd: ").append(getTagsToAdd());
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
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTagsToAdd() == null ^ this.getTagsToAdd() == null)
            return false;
        if (other.getTagsToAdd() != null && other.getTagsToAdd().equals(this.getTagsToAdd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTagsToAdd() == null) ? 0 : getTagsToAdd().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
