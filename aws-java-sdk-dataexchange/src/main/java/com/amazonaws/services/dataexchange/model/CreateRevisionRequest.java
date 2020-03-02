/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request body for CreateRevision.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateRevision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRevisionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * A revision tag is an optional label that you can assign to a revision when you create it. Each tag consists of a
     * key and an optional value, both of which you define. When you use tagging, you can also use tag-based access
     * control in IAM policies to control access to these data sets and revisions.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * 
     * @param comment
     *        An optional comment about the revision.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * 
     * @return An optional comment about the revision.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * 
     * @param comment
     *        An optional comment about the revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRevisionRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for a data set.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     * 
     * @return The unique identifier for a data set.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for a data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRevisionRequest withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * A revision tag is an optional label that you can assign to a revision when you create it. Each tag consists of a
     * key and an optional value, both of which you define. When you use tagging, you can also use tag-based access
     * control in IAM policies to control access to these data sets and revisions.
     * </p>
     * 
     * @return A revision tag is an optional label that you can assign to a revision when you create it. Each tag
     *         consists of a key and an optional value, both of which you define. When you use tagging, you can also use
     *         tag-based access control in IAM policies to control access to these data sets and revisions.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A revision tag is an optional label that you can assign to a revision when you create it. Each tag consists of a
     * key and an optional value, both of which you define. When you use tagging, you can also use tag-based access
     * control in IAM policies to control access to these data sets and revisions.
     * </p>
     * 
     * @param tags
     *        A revision tag is an optional label that you can assign to a revision when you create it. Each tag
     *        consists of a key and an optional value, both of which you define. When you use tagging, you can also use
     *        tag-based access control in IAM policies to control access to these data sets and revisions.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A revision tag is an optional label that you can assign to a revision when you create it. Each tag consists of a
     * key and an optional value, both of which you define. When you use tagging, you can also use tag-based access
     * control in IAM policies to control access to these data sets and revisions.
     * </p>
     * 
     * @param tags
     *        A revision tag is an optional label that you can assign to a revision when you create it. Each tag
     *        consists of a key and an optional value, both of which you define. When you use tagging, you can also use
     *        tag-based access control in IAM policies to control access to these data sets and revisions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRevisionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateRevisionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRevisionRequest addTagsEntry(String key, String value) {
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

    public CreateRevisionRequest clearTagsEntries() {
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
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
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

        if (obj instanceof CreateRevisionRequest == false)
            return false;
        CreateRevisionRequest other = (CreateRevisionRequest) obj;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
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

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRevisionRequest clone() {
        return (CreateRevisionRequest) super.clone();
    }

}
