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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * UntagResourceRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UntagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the resource to remove the tags from.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Specifies the keys in the tags that you want to remove.
     * </p>
     */
    private java.util.List<String> keys;

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the resource to remove the tags from.
     * </p>
     * 
     * @param resourceArn
     *        Specifies the Amazon Resource Name (ARN) of the resource to remove the tags from.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the resource to remove the tags from.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the resource to remove the tags from.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the resource to remove the tags from.
     * </p>
     * 
     * @param resourceArn
     *        Specifies the Amazon Resource Name (ARN) of the resource to remove the tags from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Specifies the keys in the tags that you want to remove.
     * </p>
     * 
     * @return Specifies the keys in the tags that you want to remove.
     */

    public java.util.List<String> getKeys() {
        return keys;
    }

    /**
     * <p>
     * Specifies the keys in the tags that you want to remove.
     * </p>
     * 
     * @param keys
     *        Specifies the keys in the tags that you want to remove.
     */

    public void setKeys(java.util.Collection<String> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        this.keys = new java.util.ArrayList<String>(keys);
    }

    /**
     * <p>
     * Specifies the keys in the tags that you want to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeys(java.util.Collection)} or {@link #withKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param keys
     *        Specifies the keys in the tags that you want to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withKeys(String... keys) {
        if (this.keys == null) {
            setKeys(new java.util.ArrayList<String>(keys.length));
        }
        for (String ele : keys) {
            this.keys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the keys in the tags that you want to remove.
     * </p>
     * 
     * @param keys
     *        Specifies the keys in the tags that you want to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withKeys(java.util.Collection<String> keys) {
        setKeys(keys);
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
        if (getKeys() != null)
            sb.append("Keys: ").append(getKeys());
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
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        return hashCode;
    }

    @Override
    public UntagResourceRequest clone() {
        return (UntagResourceRequest) super.clone();
    }

}
