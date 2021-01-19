/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAppInstanceUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAppInstanceUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the <code>AppInstance</code> request.
     * </p>
     */
    private String appInstanceArn;
    /**
     * <p>
     * The user ID of the <code>AppInstance</code>.
     * </p>
     */
    private String appInstanceUserId;
    /**
     * <p>
     * The user's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The request's metadata. Limited to a 1KB string in UTF-8.
     * </p>
     */
    private String metadata;
    /**
     * <p>
     * The token assigned to the user requesting an <code>AppInstance</code>.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Tags assigned to the <code>AppInstanceUser</code>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ARN of the <code>AppInstance</code> request.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the <code>AppInstance</code> request.
     */

    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code> request.
     * </p>
     * 
     * @return The ARN of the <code>AppInstance</code> request.
     */

    public String getAppInstanceArn() {
        return this.appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code> request.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the <code>AppInstance</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppInstanceUserRequest withAppInstanceArn(String appInstanceArn) {
        setAppInstanceArn(appInstanceArn);
        return this;
    }

    /**
     * <p>
     * The user ID of the <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceUserId
     *        The user ID of the <code>AppInstance</code>.
     */

    public void setAppInstanceUserId(String appInstanceUserId) {
        this.appInstanceUserId = appInstanceUserId;
    }

    /**
     * <p>
     * The user ID of the <code>AppInstance</code>.
     * </p>
     * 
     * @return The user ID of the <code>AppInstance</code>.
     */

    public String getAppInstanceUserId() {
        return this.appInstanceUserId;
    }

    /**
     * <p>
     * The user ID of the <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceUserId
     *        The user ID of the <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppInstanceUserRequest withAppInstanceUserId(String appInstanceUserId) {
        setAppInstanceUserId(appInstanceUserId);
        return this;
    }

    /**
     * <p>
     * The user's name.
     * </p>
     * 
     * @param name
     *        The user's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The user's name.
     * </p>
     * 
     * @return The user's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The user's name.
     * </p>
     * 
     * @param name
     *        The user's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppInstanceUserRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The request's metadata. Limited to a 1KB string in UTF-8.
     * </p>
     * 
     * @param metadata
     *        The request's metadata. Limited to a 1KB string in UTF-8.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The request's metadata. Limited to a 1KB string in UTF-8.
     * </p>
     * 
     * @return The request's metadata. Limited to a 1KB string in UTF-8.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The request's metadata. Limited to a 1KB string in UTF-8.
     * </p>
     * 
     * @param metadata
     *        The request's metadata. Limited to a 1KB string in UTF-8.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppInstanceUserRequest withMetadata(String metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The token assigned to the user requesting an <code>AppInstance</code>.
     * </p>
     * 
     * @param clientRequestToken
     *        The token assigned to the user requesting an <code>AppInstance</code>.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The token assigned to the user requesting an <code>AppInstance</code>.
     * </p>
     * 
     * @return The token assigned to the user requesting an <code>AppInstance</code>.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The token assigned to the user requesting an <code>AppInstance</code>.
     * </p>
     * 
     * @param clientRequestToken
     *        The token assigned to the user requesting an <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppInstanceUserRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Tags assigned to the <code>AppInstanceUser</code>.
     * </p>
     * 
     * @return Tags assigned to the <code>AppInstanceUser</code>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags assigned to the <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the <code>AppInstanceUser</code>.
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
     * Tags assigned to the <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the <code>AppInstanceUser</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppInstanceUserRequest withTags(Tag... tags) {
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
     * Tags assigned to the <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the <code>AppInstanceUser</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppInstanceUserRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getAppInstanceArn() != null)
            sb.append("AppInstanceArn: ").append(getAppInstanceArn()).append(",");
        if (getAppInstanceUserId() != null)
            sb.append("AppInstanceUserId: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof CreateAppInstanceUserRequest == false)
            return false;
        CreateAppInstanceUserRequest other = (CreateAppInstanceUserRequest) obj;
        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
        if (other.getAppInstanceUserId() == null ^ this.getAppInstanceUserId() == null)
            return false;
        if (other.getAppInstanceUserId() != null && other.getAppInstanceUserId().equals(this.getAppInstanceUserId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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

        hashCode = prime * hashCode + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getAppInstanceUserId() == null) ? 0 : getAppInstanceUserId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAppInstanceUserRequest clone() {
        return (CreateAppInstanceUserRequest) super.clone();
    }

}
