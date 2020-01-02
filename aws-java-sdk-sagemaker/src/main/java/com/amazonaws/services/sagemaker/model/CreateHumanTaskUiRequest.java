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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateHumanTaskUi" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHumanTaskUiRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the user interface you are creating.
     * </p>
     */
    private String humanTaskUiName;

    private UiTemplate uiTemplate;
    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize and organize a human review workflow
     * user interface. Each tag consists of a key and a value, both of which you define.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the user interface you are creating.
     * </p>
     * 
     * @param humanTaskUiName
     *        The name of the user interface you are creating.
     */

    public void setHumanTaskUiName(String humanTaskUiName) {
        this.humanTaskUiName = humanTaskUiName;
    }

    /**
     * <p>
     * The name of the user interface you are creating.
     * </p>
     * 
     * @return The name of the user interface you are creating.
     */

    public String getHumanTaskUiName() {
        return this.humanTaskUiName;
    }

    /**
     * <p>
     * The name of the user interface you are creating.
     * </p>
     * 
     * @param humanTaskUiName
     *        The name of the user interface you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHumanTaskUiRequest withHumanTaskUiName(String humanTaskUiName) {
        setHumanTaskUiName(humanTaskUiName);
        return this;
    }

    /**
     * @param uiTemplate
     */

    public void setUiTemplate(UiTemplate uiTemplate) {
        this.uiTemplate = uiTemplate;
    }

    /**
     * @return
     */

    public UiTemplate getUiTemplate() {
        return this.uiTemplate;
    }

    /**
     * @param uiTemplate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHumanTaskUiRequest withUiTemplate(UiTemplate uiTemplate) {
        setUiTemplate(uiTemplate);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize and organize a human review workflow
     * user interface. Each tag consists of a key and a value, both of which you define.
     * </p>
     * 
     * @return An array of key-value pairs that contain metadata to help you categorize and organize a human review
     *         workflow user interface. Each tag consists of a key and a value, both of which you define.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize and organize a human review workflow
     * user interface. Each tag consists of a key and a value, both of which you define.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs that contain metadata to help you categorize and organize a human review
     *        workflow user interface. Each tag consists of a key and a value, both of which you define.
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
     * An array of key-value pairs that contain metadata to help you categorize and organize a human review workflow
     * user interface. Each tag consists of a key and a value, both of which you define.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs that contain metadata to help you categorize and organize a human review
     *        workflow user interface. Each tag consists of a key and a value, both of which you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHumanTaskUiRequest withTags(Tag... tags) {
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
     * An array of key-value pairs that contain metadata to help you categorize and organize a human review workflow
     * user interface. Each tag consists of a key and a value, both of which you define.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs that contain metadata to help you categorize and organize a human review
     *        workflow user interface. Each tag consists of a key and a value, both of which you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHumanTaskUiRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getHumanTaskUiName() != null)
            sb.append("HumanTaskUiName: ").append(getHumanTaskUiName()).append(",");
        if (getUiTemplate() != null)
            sb.append("UiTemplate: ").append(getUiTemplate()).append(",");
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

        if (obj instanceof CreateHumanTaskUiRequest == false)
            return false;
        CreateHumanTaskUiRequest other = (CreateHumanTaskUiRequest) obj;
        if (other.getHumanTaskUiName() == null ^ this.getHumanTaskUiName() == null)
            return false;
        if (other.getHumanTaskUiName() != null && other.getHumanTaskUiName().equals(this.getHumanTaskUiName()) == false)
            return false;
        if (other.getUiTemplate() == null ^ this.getUiTemplate() == null)
            return false;
        if (other.getUiTemplate() != null && other.getUiTemplate().equals(this.getUiTemplate()) == false)
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

        hashCode = prime * hashCode + ((getHumanTaskUiName() == null) ? 0 : getHumanTaskUiName().hashCode());
        hashCode = prime * hashCode + ((getUiTemplate() == null) ? 0 : getUiTemplate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateHumanTaskUiRequest clone() {
        return (CreateHumanTaskUiRequest) super.clone();
    }

}
