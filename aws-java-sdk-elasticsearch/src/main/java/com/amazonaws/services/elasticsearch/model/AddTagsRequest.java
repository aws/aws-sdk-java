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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code><a>AddTags</a></code> operation. Specify the tags that you want to attach
 * to the Elasticsearch domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify the <code>ARN</code> for which you want to add the tags.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * List of <code>Tag</code> that need to be added for the Elasticsearch domain.
     * </p>
     */
    private java.util.List<Tag> tagList;

    /**
     * <p>
     * Specify the <code>ARN</code> for which you want to add the tags.
     * </p>
     * 
     * @param aRN
     *        Specify the <code>ARN</code> for which you want to add the tags.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * Specify the <code>ARN</code> for which you want to add the tags.
     * </p>
     * 
     * @return Specify the <code>ARN</code> for which you want to add the tags.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * Specify the <code>ARN</code> for which you want to add the tags.
     * </p>
     * 
     * @param aRN
     *        Specify the <code>ARN</code> for which you want to add the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsRequest withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * List of <code>Tag</code> that need to be added for the Elasticsearch domain.
     * </p>
     * 
     * @return List of <code>Tag</code> that need to be added for the Elasticsearch domain.
     */

    public java.util.List<Tag> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * List of <code>Tag</code> that need to be added for the Elasticsearch domain.
     * </p>
     * 
     * @param tagList
     *        List of <code>Tag</code> that need to be added for the Elasticsearch domain.
     */

    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new java.util.ArrayList<Tag>(tagList);
    }

    /**
     * <p>
     * List of <code>Tag</code> that need to be added for the Elasticsearch domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     *        List of <code>Tag</code> that need to be added for the Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsRequest withTagList(Tag... tagList) {
        if (this.tagList == null) {
            setTagList(new java.util.ArrayList<Tag>(tagList.length));
        }
        for (Tag ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of <code>Tag</code> that need to be added for the Elasticsearch domain.
     * </p>
     * 
     * @param tagList
     *        List of <code>Tag</code> that need to be added for the Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsRequest withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddTagsRequest == false)
            return false;
        AddTagsRequest other = (AddTagsRequest) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        return hashCode;
    }

    @Override
    public AddTagsRequest clone() {
        return (AddTagsRequest) super.clone();
    }

}
