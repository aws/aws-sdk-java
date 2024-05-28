/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53profiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/CreateProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * <code>ClientToken</code> is an idempotency token that ensures a call to <code>CreateProfile</code> completes only
     * once. You choose the value to pass. For example, an issue might prevent you from getting a response from
     * <code>CreateProfile</code>. In this case, safely retry your call to <code>CreateProfile</code> by using the same
     * <code>CreateProfile</code> parameter value.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A name for the Profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the Route 53 Profile.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * <code>ClientToken</code> is an idempotency token that ensures a call to <code>CreateProfile</code> completes only
     * once. You choose the value to pass. For example, an issue might prevent you from getting a response from
     * <code>CreateProfile</code>. In this case, safely retry your call to <code>CreateProfile</code> by using the same
     * <code>CreateProfile</code> parameter value.
     * </p>
     * 
     * @param clientToken
     *        <code>ClientToken</code> is an idempotency token that ensures a call to <code>CreateProfile</code>
     *        completes only once. You choose the value to pass. For example, an issue might prevent you from getting a
     *        response from <code>CreateProfile</code>. In this case, safely retry your call to
     *        <code>CreateProfile</code> by using the same <code>CreateProfile</code> parameter value.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * <code>ClientToken</code> is an idempotency token that ensures a call to <code>CreateProfile</code> completes only
     * once. You choose the value to pass. For example, an issue might prevent you from getting a response from
     * <code>CreateProfile</code>. In this case, safely retry your call to <code>CreateProfile</code> by using the same
     * <code>CreateProfile</code> parameter value.
     * </p>
     * 
     * @return <code>ClientToken</code> is an idempotency token that ensures a call to <code>CreateProfile</code>
     *         completes only once. You choose the value to pass. For example, an issue might prevent you from getting a
     *         response from <code>CreateProfile</code>. In this case, safely retry your call to
     *         <code>CreateProfile</code> by using the same <code>CreateProfile</code> parameter value.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * <code>ClientToken</code> is an idempotency token that ensures a call to <code>CreateProfile</code> completes only
     * once. You choose the value to pass. For example, an issue might prevent you from getting a response from
     * <code>CreateProfile</code>. In this case, safely retry your call to <code>CreateProfile</code> by using the same
     * <code>CreateProfile</code> parameter value.
     * </p>
     * 
     * @param clientToken
     *        <code>ClientToken</code> is an idempotency token that ensures a call to <code>CreateProfile</code>
     *        completes only once. You choose the value to pass. For example, an issue might prevent you from getting a
     *        response from <code>CreateProfile</code>. In this case, safely retry your call to
     *        <code>CreateProfile</code> by using the same <code>CreateProfile</code> parameter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A name for the Profile.
     * </p>
     * 
     * @param name
     *        A name for the Profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the Profile.
     * </p>
     * 
     * @return A name for the Profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the Profile.
     * </p>
     * 
     * @param name
     *        A name for the Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the Route 53 Profile.
     * </p>
     * 
     * @return A list of the tag keys and values that you want to associate with the Route 53 Profile.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the Route 53 Profile.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the Route 53 Profile.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the Route 53 Profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the Route 53 Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the Route 53 Profile.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the Route 53 Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof CreateProfileRequest == false)
            return false;
        CreateProfileRequest other = (CreateProfileRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProfileRequest clone() {
        return (CreateProfileRequest) super.clone();
    }

}
