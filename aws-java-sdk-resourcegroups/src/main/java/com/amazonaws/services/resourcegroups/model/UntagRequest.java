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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/Untag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the resource from which to remove tags.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The keys of the tags to be removed.
     * </p>
     */
    private java.util.List<String> keys;

    /**
     * <p>
     * The ARN of the resource from which to remove tags.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource from which to remove tags.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the resource from which to remove tags.
     * </p>
     * 
     * @return The ARN of the resource from which to remove tags.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the resource from which to remove tags.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource from which to remove tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The keys of the tags to be removed.
     * </p>
     * 
     * @return The keys of the tags to be removed.
     */

    public java.util.List<String> getKeys() {
        return keys;
    }

    /**
     * <p>
     * The keys of the tags to be removed.
     * </p>
     * 
     * @param keys
     *        The keys of the tags to be removed.
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
     * The keys of the tags to be removed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeys(java.util.Collection)} or {@link #withKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param keys
     *        The keys of the tags to be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagRequest withKeys(String... keys) {
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
     * The keys of the tags to be removed.
     * </p>
     * 
     * @param keys
     *        The keys of the tags to be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagRequest withKeys(java.util.Collection<String> keys) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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

        if (obj instanceof UntagRequest == false)
            return false;
        UntagRequest other = (UntagRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        return hashCode;
    }

    @Override
    public UntagRequest clone() {
        return (UntagRequest) super.clone();
    }

}
