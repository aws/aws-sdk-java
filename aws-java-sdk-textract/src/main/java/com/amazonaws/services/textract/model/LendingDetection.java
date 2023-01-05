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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The results extracted for a lending document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/LendingDetection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LendingDetection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text extracted for a detected value in a lending document.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The selection status of a selection element, such as an option button or check box.
     * </p>
     */
    private String selectionStatus;

    private Geometry geometry;
    /**
     * <p>
     * The confidence level for the text of a detected value in a lending document.
     * </p>
     */
    private Float confidence;

    /**
     * <p>
     * The text extracted for a detected value in a lending document.
     * </p>
     * 
     * @param text
     *        The text extracted for a detected value in a lending document.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text extracted for a detected value in a lending document.
     * </p>
     * 
     * @return The text extracted for a detected value in a lending document.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The text extracted for a detected value in a lending document.
     * </p>
     * 
     * @param text
     *        The text extracted for a detected value in a lending document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingDetection withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The selection status of a selection element, such as an option button or check box.
     * </p>
     * 
     * @param selectionStatus
     *        The selection status of a selection element, such as an option button or check box.
     * @see SelectionStatus
     */

    public void setSelectionStatus(String selectionStatus) {
        this.selectionStatus = selectionStatus;
    }

    /**
     * <p>
     * The selection status of a selection element, such as an option button or check box.
     * </p>
     * 
     * @return The selection status of a selection element, such as an option button or check box.
     * @see SelectionStatus
     */

    public String getSelectionStatus() {
        return this.selectionStatus;
    }

    /**
     * <p>
     * The selection status of a selection element, such as an option button or check box.
     * </p>
     * 
     * @param selectionStatus
     *        The selection status of a selection element, such as an option button or check box.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelectionStatus
     */

    public LendingDetection withSelectionStatus(String selectionStatus) {
        setSelectionStatus(selectionStatus);
        return this;
    }

    /**
     * <p>
     * The selection status of a selection element, such as an option button or check box.
     * </p>
     * 
     * @param selectionStatus
     *        The selection status of a selection element, such as an option button or check box.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelectionStatus
     */

    public LendingDetection withSelectionStatus(SelectionStatus selectionStatus) {
        this.selectionStatus = selectionStatus.toString();
        return this;
    }

    /**
     * @param geometry
     */

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    /**
     * @return
     */

    public Geometry getGeometry() {
        return this.geometry;
    }

    /**
     * @param geometry
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingDetection withGeometry(Geometry geometry) {
        setGeometry(geometry);
        return this;
    }

    /**
     * <p>
     * The confidence level for the text of a detected value in a lending document.
     * </p>
     * 
     * @param confidence
     *        The confidence level for the text of a detected value in a lending document.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence level for the text of a detected value in a lending document.
     * </p>
     * 
     * @return The confidence level for the text of a detected value in a lending document.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The confidence level for the text of a detected value in a lending document.
     * </p>
     * 
     * @param confidence
     *        The confidence level for the text of a detected value in a lending document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingDetection withConfidence(Float confidence) {
        setConfidence(confidence);
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
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getSelectionStatus() != null)
            sb.append("SelectionStatus: ").append(getSelectionStatus()).append(",");
        if (getGeometry() != null)
            sb.append("Geometry: ").append(getGeometry()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LendingDetection == false)
            return false;
        LendingDetection other = (LendingDetection) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getSelectionStatus() == null ^ this.getSelectionStatus() == null)
            return false;
        if (other.getSelectionStatus() != null && other.getSelectionStatus().equals(this.getSelectionStatus()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getSelectionStatus() == null) ? 0 : getSelectionStatus().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public LendingDetection clone() {
        try {
            return (LendingDetection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.LendingDetectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
