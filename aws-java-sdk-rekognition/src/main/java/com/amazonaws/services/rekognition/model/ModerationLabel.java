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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a single type of moderated content found in an image or video. Each type of moderated
 * content has a label within a hierarchical taxonomy. For more information, see Detecting Unsafe Content in the Amazon
 * Rekognition Developer Guide.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModerationLabel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the confidence that Amazon Rekognition has that the label has been correctly identified.
     * </p>
     * <p>
     * If you don't specify the <code>MinConfidence</code> parameter in the call to <code>DetectModerationLabels</code>,
     * the operation returns labels with a confidence value greater than or equal to 50 percent.
     * </p>
     */
    private Float confidence;
    /**
     * <p>
     * The label name for the type of content detected in the image.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name for the parent label. Labels at the top level of the hierarchy have the parent label <code>""</code>.
     * </p>
     */
    private String parentName;

    /**
     * <p>
     * Specifies the confidence that Amazon Rekognition has that the label has been correctly identified.
     * </p>
     * <p>
     * If you don't specify the <code>MinConfidence</code> parameter in the call to <code>DetectModerationLabels</code>,
     * the operation returns labels with a confidence value greater than or equal to 50 percent.
     * </p>
     * 
     * @param confidence
     *        Specifies the confidence that Amazon Rekognition has that the label has been correctly identified.</p>
     *        <p>
     *        If you don't specify the <code>MinConfidence</code> parameter in the call to
     *        <code>DetectModerationLabels</code>, the operation returns labels with a confidence value greater than or
     *        equal to 50 percent.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Specifies the confidence that Amazon Rekognition has that the label has been correctly identified.
     * </p>
     * <p>
     * If you don't specify the <code>MinConfidence</code> parameter in the call to <code>DetectModerationLabels</code>,
     * the operation returns labels with a confidence value greater than or equal to 50 percent.
     * </p>
     * 
     * @return Specifies the confidence that Amazon Rekognition has that the label has been correctly identified.</p>
     *         <p>
     *         If you don't specify the <code>MinConfidence</code> parameter in the call to
     *         <code>DetectModerationLabels</code>, the operation returns labels with a confidence value greater than or
     *         equal to 50 percent.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * Specifies the confidence that Amazon Rekognition has that the label has been correctly identified.
     * </p>
     * <p>
     * If you don't specify the <code>MinConfidence</code> parameter in the call to <code>DetectModerationLabels</code>,
     * the operation returns labels with a confidence value greater than or equal to 50 percent.
     * </p>
     * 
     * @param confidence
     *        Specifies the confidence that Amazon Rekognition has that the label has been correctly identified.</p>
     *        <p>
     *        If you don't specify the <code>MinConfidence</code> parameter in the call to
     *        <code>DetectModerationLabels</code>, the operation returns labels with a confidence value greater than or
     *        equal to 50 percent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModerationLabel withConfidence(Float confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * The label name for the type of content detected in the image.
     * </p>
     * 
     * @param name
     *        The label name for the type of content detected in the image.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The label name for the type of content detected in the image.
     * </p>
     * 
     * @return The label name for the type of content detected in the image.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The label name for the type of content detected in the image.
     * </p>
     * 
     * @param name
     *        The label name for the type of content detected in the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModerationLabel withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name for the parent label. Labels at the top level of the hierarchy have the parent label <code>""</code>.
     * </p>
     * 
     * @param parentName
     *        The name for the parent label. Labels at the top level of the hierarchy have the parent label
     *        <code>""</code>.
     */

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**
     * <p>
     * The name for the parent label. Labels at the top level of the hierarchy have the parent label <code>""</code>.
     * </p>
     * 
     * @return The name for the parent label. Labels at the top level of the hierarchy have the parent label
     *         <code>""</code>.
     */

    public String getParentName() {
        return this.parentName;
    }

    /**
     * <p>
     * The name for the parent label. Labels at the top level of the hierarchy have the parent label <code>""</code>.
     * </p>
     * 
     * @param parentName
     *        The name for the parent label. Labels at the top level of the hierarchy have the parent label
     *        <code>""</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModerationLabel withParentName(String parentName) {
        setParentName(parentName);
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
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getParentName() != null)
            sb.append("ParentName: ").append(getParentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModerationLabel == false)
            return false;
        ModerationLabel other = (ModerationLabel) obj;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getParentName() == null ^ this.getParentName() == null)
            return false;
        if (other.getParentName() != null && other.getParentName().equals(this.getParentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getParentName() == null) ? 0 : getParentName().hashCode());
        return hashCode;
    }

    @Override
    public ModerationLabel clone() {
        try {
            return (ModerationLabel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.ModerationLabelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
