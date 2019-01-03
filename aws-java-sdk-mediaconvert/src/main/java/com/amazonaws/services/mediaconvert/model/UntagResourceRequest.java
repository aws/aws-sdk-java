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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UntagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) of the resource that you want to remove tags from. To get the ARN, send a GET
     * request with the resource name.
     */
    private String arn;
    /** The keys of the tags that you want to remove from the resource. */
    private java.util.List<String> tagKeys;

    /**
     * The Amazon Resource Name (ARN) of the resource that you want to remove tags from. To get the ARN, send a GET
     * request with the resource name.
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource that you want to remove tags from. To get the ARN, send a
     *        GET request with the resource name.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The Amazon Resource Name (ARN) of the resource that you want to remove tags from. To get the ARN, send a GET
     * request with the resource name.
     * 
     * @return The Amazon Resource Name (ARN) of the resource that you want to remove tags from. To get the ARN, send a
     *         GET request with the resource name.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The Amazon Resource Name (ARN) of the resource that you want to remove tags from. To get the ARN, send a GET
     * request with the resource name.
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource that you want to remove tags from. To get the ARN, send a
     *        GET request with the resource name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The keys of the tags that you want to remove from the resource.
     * 
     * @return The keys of the tags that you want to remove from the resource.
     */

    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * The keys of the tags that you want to remove from the resource.
     * 
     * @param tagKeys
     *        The keys of the tags that you want to remove from the resource.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * The keys of the tags that you want to remove from the resource.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        The keys of the tags that you want to remove from the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * The keys of the tags that you want to remove from the resource.
     * 
     * @param tagKeys
     *        The keys of the tags that you want to remove from the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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

        if (obj instanceof UntagResourceRequest == false)
            return false;
        UntagResourceRequest other = (UntagResourceRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public UntagResourceRequest clone() {
        return (UntagResourceRequest) super.clone();
    }

}
