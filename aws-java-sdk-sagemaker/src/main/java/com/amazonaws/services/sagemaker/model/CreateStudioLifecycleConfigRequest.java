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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateStudioLifecycleConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStudioLifecycleConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Studio Lifecycle Configuration to create.
     * </p>
     */
    private String studioLifecycleConfigName;
    /**
     * <p>
     * The content of your Studio Lifecycle Configuration script. This content must be base64 encoded.
     * </p>
     */
    private String studioLifecycleConfigContent;
    /**
     * <p>
     * The App type that the Lifecycle Configuration is attached to.
     * </p>
     */
    private String studioLifecycleConfigAppType;
    /**
     * <p>
     * Tags to be associated with the Lifecycle Configuration. Each tag consists of a key and an optional value. Tag
     * keys must be unique per resource. Tags are searchable using the Search API.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the Studio Lifecycle Configuration to create.
     * </p>
     * 
     * @param studioLifecycleConfigName
     *        The name of the Studio Lifecycle Configuration to create.
     */

    public void setStudioLifecycleConfigName(String studioLifecycleConfigName) {
        this.studioLifecycleConfigName = studioLifecycleConfigName;
    }

    /**
     * <p>
     * The name of the Studio Lifecycle Configuration to create.
     * </p>
     * 
     * @return The name of the Studio Lifecycle Configuration to create.
     */

    public String getStudioLifecycleConfigName() {
        return this.studioLifecycleConfigName;
    }

    /**
     * <p>
     * The name of the Studio Lifecycle Configuration to create.
     * </p>
     * 
     * @param studioLifecycleConfigName
     *        The name of the Studio Lifecycle Configuration to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioLifecycleConfigRequest withStudioLifecycleConfigName(String studioLifecycleConfigName) {
        setStudioLifecycleConfigName(studioLifecycleConfigName);
        return this;
    }

    /**
     * <p>
     * The content of your Studio Lifecycle Configuration script. This content must be base64 encoded.
     * </p>
     * 
     * @param studioLifecycleConfigContent
     *        The content of your Studio Lifecycle Configuration script. This content must be base64 encoded.
     */

    public void setStudioLifecycleConfigContent(String studioLifecycleConfigContent) {
        this.studioLifecycleConfigContent = studioLifecycleConfigContent;
    }

    /**
     * <p>
     * The content of your Studio Lifecycle Configuration script. This content must be base64 encoded.
     * </p>
     * 
     * @return The content of your Studio Lifecycle Configuration script. This content must be base64 encoded.
     */

    public String getStudioLifecycleConfigContent() {
        return this.studioLifecycleConfigContent;
    }

    /**
     * <p>
     * The content of your Studio Lifecycle Configuration script. This content must be base64 encoded.
     * </p>
     * 
     * @param studioLifecycleConfigContent
     *        The content of your Studio Lifecycle Configuration script. This content must be base64 encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioLifecycleConfigRequest withStudioLifecycleConfigContent(String studioLifecycleConfigContent) {
        setStudioLifecycleConfigContent(studioLifecycleConfigContent);
        return this;
    }

    /**
     * <p>
     * The App type that the Lifecycle Configuration is attached to.
     * </p>
     * 
     * @param studioLifecycleConfigAppType
     *        The App type that the Lifecycle Configuration is attached to.
     * @see StudioLifecycleConfigAppType
     */

    public void setStudioLifecycleConfigAppType(String studioLifecycleConfigAppType) {
        this.studioLifecycleConfigAppType = studioLifecycleConfigAppType;
    }

    /**
     * <p>
     * The App type that the Lifecycle Configuration is attached to.
     * </p>
     * 
     * @return The App type that the Lifecycle Configuration is attached to.
     * @see StudioLifecycleConfigAppType
     */

    public String getStudioLifecycleConfigAppType() {
        return this.studioLifecycleConfigAppType;
    }

    /**
     * <p>
     * The App type that the Lifecycle Configuration is attached to.
     * </p>
     * 
     * @param studioLifecycleConfigAppType
     *        The App type that the Lifecycle Configuration is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioLifecycleConfigAppType
     */

    public CreateStudioLifecycleConfigRequest withStudioLifecycleConfigAppType(String studioLifecycleConfigAppType) {
        setStudioLifecycleConfigAppType(studioLifecycleConfigAppType);
        return this;
    }

    /**
     * <p>
     * The App type that the Lifecycle Configuration is attached to.
     * </p>
     * 
     * @param studioLifecycleConfigAppType
     *        The App type that the Lifecycle Configuration is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioLifecycleConfigAppType
     */

    public CreateStudioLifecycleConfigRequest withStudioLifecycleConfigAppType(StudioLifecycleConfigAppType studioLifecycleConfigAppType) {
        this.studioLifecycleConfigAppType = studioLifecycleConfigAppType.toString();
        return this;
    }

    /**
     * <p>
     * Tags to be associated with the Lifecycle Configuration. Each tag consists of a key and an optional value. Tag
     * keys must be unique per resource. Tags are searchable using the Search API.
     * </p>
     * 
     * @return Tags to be associated with the Lifecycle Configuration. Each tag consists of a key and an optional value.
     *         Tag keys must be unique per resource. Tags are searchable using the Search API.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to be associated with the Lifecycle Configuration. Each tag consists of a key and an optional value. Tag
     * keys must be unique per resource. Tags are searchable using the Search API.
     * </p>
     * 
     * @param tags
     *        Tags to be associated with the Lifecycle Configuration. Each tag consists of a key and an optional value.
     *        Tag keys must be unique per resource. Tags are searchable using the Search API.
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
     * Tags to be associated with the Lifecycle Configuration. Each tag consists of a key and an optional value. Tag
     * keys must be unique per resource. Tags are searchable using the Search API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to be associated with the Lifecycle Configuration. Each tag consists of a key and an optional value.
     *        Tag keys must be unique per resource. Tags are searchable using the Search API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioLifecycleConfigRequest withTags(Tag... tags) {
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
     * Tags to be associated with the Lifecycle Configuration. Each tag consists of a key and an optional value. Tag
     * keys must be unique per resource. Tags are searchable using the Search API.
     * </p>
     * 
     * @param tags
     *        Tags to be associated with the Lifecycle Configuration. Each tag consists of a key and an optional value.
     *        Tag keys must be unique per resource. Tags are searchable using the Search API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioLifecycleConfigRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getStudioLifecycleConfigName() != null)
            sb.append("StudioLifecycleConfigName: ").append(getStudioLifecycleConfigName()).append(",");
        if (getStudioLifecycleConfigContent() != null)
            sb.append("StudioLifecycleConfigContent: ").append(getStudioLifecycleConfigContent()).append(",");
        if (getStudioLifecycleConfigAppType() != null)
            sb.append("StudioLifecycleConfigAppType: ").append(getStudioLifecycleConfigAppType()).append(",");
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

        if (obj instanceof CreateStudioLifecycleConfigRequest == false)
            return false;
        CreateStudioLifecycleConfigRequest other = (CreateStudioLifecycleConfigRequest) obj;
        if (other.getStudioLifecycleConfigName() == null ^ this.getStudioLifecycleConfigName() == null)
            return false;
        if (other.getStudioLifecycleConfigName() != null && other.getStudioLifecycleConfigName().equals(this.getStudioLifecycleConfigName()) == false)
            return false;
        if (other.getStudioLifecycleConfigContent() == null ^ this.getStudioLifecycleConfigContent() == null)
            return false;
        if (other.getStudioLifecycleConfigContent() != null && other.getStudioLifecycleConfigContent().equals(this.getStudioLifecycleConfigContent()) == false)
            return false;
        if (other.getStudioLifecycleConfigAppType() == null ^ this.getStudioLifecycleConfigAppType() == null)
            return false;
        if (other.getStudioLifecycleConfigAppType() != null && other.getStudioLifecycleConfigAppType().equals(this.getStudioLifecycleConfigAppType()) == false)
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

        hashCode = prime * hashCode + ((getStudioLifecycleConfigName() == null) ? 0 : getStudioLifecycleConfigName().hashCode());
        hashCode = prime * hashCode + ((getStudioLifecycleConfigContent() == null) ? 0 : getStudioLifecycleConfigContent().hashCode());
        hashCode = prime * hashCode + ((getStudioLifecycleConfigAppType() == null) ? 0 : getStudioLifecycleConfigAppType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateStudioLifecycleConfigRequest clone() {
        return (CreateStudioLifecycleConfigRequest) super.clone();
    }

}
