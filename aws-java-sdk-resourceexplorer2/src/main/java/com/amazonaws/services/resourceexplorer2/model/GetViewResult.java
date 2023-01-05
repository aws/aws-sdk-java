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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/GetView" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetViewResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Tag key and value pairs that are attached to the view.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A structure that contains the details for the requested view.
     * </p>
     */
    private View view;

    /**
     * <p>
     * Tag key and value pairs that are attached to the view.
     * </p>
     * 
     * @return Tag key and value pairs that are attached to the view.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tag key and value pairs that are attached to the view.
     * </p>
     * 
     * @param tags
     *        Tag key and value pairs that are attached to the view.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tag key and value pairs that are attached to the view.
     * </p>
     * 
     * @param tags
     *        Tag key and value pairs that are attached to the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetViewResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetViewResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetViewResult addTagsEntry(String key, String value) {
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

    public GetViewResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A structure that contains the details for the requested view.
     * </p>
     * 
     * @param view
     *        A structure that contains the details for the requested view.
     */

    public void setView(View view) {
        this.view = view;
    }

    /**
     * <p>
     * A structure that contains the details for the requested view.
     * </p>
     * 
     * @return A structure that contains the details for the requested view.
     */

    public View getView() {
        return this.view;
    }

    /**
     * <p>
     * A structure that contains the details for the requested view.
     * </p>
     * 
     * @param view
     *        A structure that contains the details for the requested view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetViewResult withView(View view) {
        setView(view);
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
        if (getView() != null)
            sb.append("View: ").append(getView());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetViewResult == false)
            return false;
        GetViewResult other = (GetViewResult) obj;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getView() == null ^ this.getView() == null)
            return false;
        if (other.getView() != null && other.getView().equals(this.getView()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getView() == null) ? 0 : getView().hashCode());
        return hashCode;
    }

    @Override
    public GetViewResult clone() {
        try {
            return (GetViewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
