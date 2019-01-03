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
 * Container for the parameters to the <code><a>RemoveTags</a></code> operation. Specify the <code>ARN</code> for the
 * Elasticsearch domain from which you want to remove the specified <code>TagKey</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <code>ARN</code> for the Elasticsearch domain from which you want to delete the specified tags.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * Specifies the <code>TagKey</code> list which you want to remove from the Elasticsearch domain.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * Specifies the <code>ARN</code> for the Elasticsearch domain from which you want to delete the specified tags.
     * </p>
     * 
     * @param aRN
     *        Specifies the <code>ARN</code> for the Elasticsearch domain from which you want to delete the specified
     *        tags.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * Specifies the <code>ARN</code> for the Elasticsearch domain from which you want to delete the specified tags.
     * </p>
     * 
     * @return Specifies the <code>ARN</code> for the Elasticsearch domain from which you want to delete the specified
     *         tags.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * Specifies the <code>ARN</code> for the Elasticsearch domain from which you want to delete the specified tags.
     * </p>
     * 
     * @param aRN
     *        Specifies the <code>ARN</code> for the Elasticsearch domain from which you want to delete the specified
     *        tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsRequest withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>TagKey</code> list which you want to remove from the Elasticsearch domain.
     * </p>
     * 
     * @return Specifies the <code>TagKey</code> list which you want to remove from the Elasticsearch domain.
     */

    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * Specifies the <code>TagKey</code> list which you want to remove from the Elasticsearch domain.
     * </p>
     * 
     * @param tagKeys
     *        Specifies the <code>TagKey</code> list which you want to remove from the Elasticsearch domain.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * Specifies the <code>TagKey</code> list which you want to remove from the Elasticsearch domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        Specifies the <code>TagKey</code> list which you want to remove from the Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the <code>TagKey</code> list which you want to remove from the Elasticsearch domain.
     * </p>
     * 
     * @param tagKeys
     *        Specifies the <code>TagKey</code> list which you want to remove from the Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTagsRequest == false)
            return false;
        RemoveTagsRequest other = (RemoveTagsRequest) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public RemoveTagsRequest clone() {
        return (RemoveTagsRequest) super.clone();
    }

}
