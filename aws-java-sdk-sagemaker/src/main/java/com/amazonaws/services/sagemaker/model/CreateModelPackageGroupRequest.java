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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelPackageGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelPackageGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the model group.
     * </p>
     */
    private String modelPackageGroupName;
    /**
     * <p>
     * A description for the model group.
     * </p>
     */
    private String modelPackageGroupDescription;
    /**
     * <p>
     * A list of key value pairs associated with the model group. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the model group.
     * </p>
     * 
     * @param modelPackageGroupName
     *        The name of the model group.
     */

    public void setModelPackageGroupName(String modelPackageGroupName) {
        this.modelPackageGroupName = modelPackageGroupName;
    }

    /**
     * <p>
     * The name of the model group.
     * </p>
     * 
     * @return The name of the model group.
     */

    public String getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    /**
     * <p>
     * The name of the model group.
     * </p>
     * 
     * @param modelPackageGroupName
     *        The name of the model group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageGroupRequest withModelPackageGroupName(String modelPackageGroupName) {
        setModelPackageGroupName(modelPackageGroupName);
        return this;
    }

    /**
     * <p>
     * A description for the model group.
     * </p>
     * 
     * @param modelPackageGroupDescription
     *        A description for the model group.
     */

    public void setModelPackageGroupDescription(String modelPackageGroupDescription) {
        this.modelPackageGroupDescription = modelPackageGroupDescription;
    }

    /**
     * <p>
     * A description for the model group.
     * </p>
     * 
     * @return A description for the model group.
     */

    public String getModelPackageGroupDescription() {
        return this.modelPackageGroupDescription;
    }

    /**
     * <p>
     * A description for the model group.
     * </p>
     * 
     * @param modelPackageGroupDescription
     *        A description for the model group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageGroupRequest withModelPackageGroupDescription(String modelPackageGroupDescription) {
        setModelPackageGroupDescription(modelPackageGroupDescription);
        return this;
    }

    /**
     * <p>
     * A list of key value pairs associated with the model group. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @return A list of key value pairs associated with the model group. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key value pairs associated with the model group. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key value pairs associated with the model group. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
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
     * A list of key value pairs associated with the model group. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key value pairs associated with the model group. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageGroupRequest withTags(Tag... tags) {
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
     * A list of key value pairs associated with the model group. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key value pairs associated with the model group. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getModelPackageGroupName() != null)
            sb.append("ModelPackageGroupName: ").append(getModelPackageGroupName()).append(",");
        if (getModelPackageGroupDescription() != null)
            sb.append("ModelPackageGroupDescription: ").append(getModelPackageGroupDescription()).append(",");
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

        if (obj instanceof CreateModelPackageGroupRequest == false)
            return false;
        CreateModelPackageGroupRequest other = (CreateModelPackageGroupRequest) obj;
        if (other.getModelPackageGroupName() == null ^ this.getModelPackageGroupName() == null)
            return false;
        if (other.getModelPackageGroupName() != null && other.getModelPackageGroupName().equals(this.getModelPackageGroupName()) == false)
            return false;
        if (other.getModelPackageGroupDescription() == null ^ this.getModelPackageGroupDescription() == null)
            return false;
        if (other.getModelPackageGroupDescription() != null && other.getModelPackageGroupDescription().equals(this.getModelPackageGroupDescription()) == false)
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

        hashCode = prime * hashCode + ((getModelPackageGroupName() == null) ? 0 : getModelPackageGroupName().hashCode());
        hashCode = prime * hashCode + ((getModelPackageGroupDescription() == null) ? 0 : getModelPackageGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelPackageGroupRequest clone() {
        return (CreateModelPackageGroupRequest) super.clone();
    }

}
