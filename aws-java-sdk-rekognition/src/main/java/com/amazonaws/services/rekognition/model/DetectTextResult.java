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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectTextResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of text that was detected in the input image.
     * </p>
     */
    private java.util.List<TextDetection> textDetections;

    /**
     * <p>
     * An array of text that was detected in the input image.
     * </p>
     * 
     * @return An array of text that was detected in the input image.
     */

    public java.util.List<TextDetection> getTextDetections() {
        return textDetections;
    }

    /**
     * <p>
     * An array of text that was detected in the input image.
     * </p>
     * 
     * @param textDetections
     *        An array of text that was detected in the input image.
     */

    public void setTextDetections(java.util.Collection<TextDetection> textDetections) {
        if (textDetections == null) {
            this.textDetections = null;
            return;
        }

        this.textDetections = new java.util.ArrayList<TextDetection>(textDetections);
    }

    /**
     * <p>
     * An array of text that was detected in the input image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTextDetections(java.util.Collection)} or {@link #withTextDetections(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param textDetections
     *        An array of text that was detected in the input image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectTextResult withTextDetections(TextDetection... textDetections) {
        if (this.textDetections == null) {
            setTextDetections(new java.util.ArrayList<TextDetection>(textDetections.length));
        }
        for (TextDetection ele : textDetections) {
            this.textDetections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of text that was detected in the input image.
     * </p>
     * 
     * @param textDetections
     *        An array of text that was detected in the input image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectTextResult withTextDetections(java.util.Collection<TextDetection> textDetections) {
        setTextDetections(textDetections);
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
        if (getTextDetections() != null)
            sb.append("TextDetections: ").append(getTextDetections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectTextResult == false)
            return false;
        DetectTextResult other = (DetectTextResult) obj;
        if (other.getTextDetections() == null ^ this.getTextDetections() == null)
            return false;
        if (other.getTextDetections() != null && other.getTextDetections().equals(this.getTextDetections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextDetections() == null) ? 0 : getTextDetections().hashCode());
        return hashCode;
    }

    @Override
    public DetectTextResult clone() {
        try {
            return (DetectTextResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
