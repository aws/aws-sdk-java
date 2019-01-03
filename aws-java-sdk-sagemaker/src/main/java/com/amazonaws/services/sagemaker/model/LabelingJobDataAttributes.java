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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Attributes of the data specified by the customer. Use these to describe the data to be labeled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LabelingJobDataAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelingJobDataAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Declares that your content is free of personally identifiable information or adult content. Amazon SageMaker may
     * restrict the Amazon Mechanical Turk workers that can view your task based on this information.
     * </p>
     */
    private java.util.List<String> contentClassifiers;

    /**
     * <p>
     * Declares that your content is free of personally identifiable information or adult content. Amazon SageMaker may
     * restrict the Amazon Mechanical Turk workers that can view your task based on this information.
     * </p>
     * 
     * @return Declares that your content is free of personally identifiable information or adult content. Amazon
     *         SageMaker may restrict the Amazon Mechanical Turk workers that can view your task based on this
     *         information.
     * @see ContentClassifier
     */

    public java.util.List<String> getContentClassifiers() {
        return contentClassifiers;
    }

    /**
     * <p>
     * Declares that your content is free of personally identifiable information or adult content. Amazon SageMaker may
     * restrict the Amazon Mechanical Turk workers that can view your task based on this information.
     * </p>
     * 
     * @param contentClassifiers
     *        Declares that your content is free of personally identifiable information or adult content. Amazon
     *        SageMaker may restrict the Amazon Mechanical Turk workers that can view your task based on this
     *        information.
     * @see ContentClassifier
     */

    public void setContentClassifiers(java.util.Collection<String> contentClassifiers) {
        if (contentClassifiers == null) {
            this.contentClassifiers = null;
            return;
        }

        this.contentClassifiers = new java.util.ArrayList<String>(contentClassifiers);
    }

    /**
     * <p>
     * Declares that your content is free of personally identifiable information or adult content. Amazon SageMaker may
     * restrict the Amazon Mechanical Turk workers that can view your task based on this information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContentClassifiers(java.util.Collection)} or {@link #withContentClassifiers(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param contentClassifiers
     *        Declares that your content is free of personally identifiable information or adult content. Amazon
     *        SageMaker may restrict the Amazon Mechanical Turk workers that can view your task based on this
     *        information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentClassifier
     */

    public LabelingJobDataAttributes withContentClassifiers(String... contentClassifiers) {
        if (this.contentClassifiers == null) {
            setContentClassifiers(new java.util.ArrayList<String>(contentClassifiers.length));
        }
        for (String ele : contentClassifiers) {
            this.contentClassifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Declares that your content is free of personally identifiable information or adult content. Amazon SageMaker may
     * restrict the Amazon Mechanical Turk workers that can view your task based on this information.
     * </p>
     * 
     * @param contentClassifiers
     *        Declares that your content is free of personally identifiable information or adult content. Amazon
     *        SageMaker may restrict the Amazon Mechanical Turk workers that can view your task based on this
     *        information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentClassifier
     */

    public LabelingJobDataAttributes withContentClassifiers(java.util.Collection<String> contentClassifiers) {
        setContentClassifiers(contentClassifiers);
        return this;
    }

    /**
     * <p>
     * Declares that your content is free of personally identifiable information or adult content. Amazon SageMaker may
     * restrict the Amazon Mechanical Turk workers that can view your task based on this information.
     * </p>
     * 
     * @param contentClassifiers
     *        Declares that your content is free of personally identifiable information or adult content. Amazon
     *        SageMaker may restrict the Amazon Mechanical Turk workers that can view your task based on this
     *        information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentClassifier
     */

    public LabelingJobDataAttributes withContentClassifiers(ContentClassifier... contentClassifiers) {
        java.util.ArrayList<String> contentClassifiersCopy = new java.util.ArrayList<String>(contentClassifiers.length);
        for (ContentClassifier value : contentClassifiers) {
            contentClassifiersCopy.add(value.toString());
        }
        if (getContentClassifiers() == null) {
            setContentClassifiers(contentClassifiersCopy);
        } else {
            getContentClassifiers().addAll(contentClassifiersCopy);
        }
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
        if (getContentClassifiers() != null)
            sb.append("ContentClassifiers: ").append(getContentClassifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobDataAttributes == false)
            return false;
        LabelingJobDataAttributes other = (LabelingJobDataAttributes) obj;
        if (other.getContentClassifiers() == null ^ this.getContentClassifiers() == null)
            return false;
        if (other.getContentClassifiers() != null && other.getContentClassifiers().equals(this.getContentClassifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentClassifiers() == null) ? 0 : getContentClassifiers().hashCode());
        return hashCode;
    }

    @Override
    public LabelingJobDataAttributes clone() {
        try {
            return (LabelingJobDataAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LabelingJobDataAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
