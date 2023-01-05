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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The options for a paper canvas of a section-based layout.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SectionBasedLayoutPaperCanvasSizeOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SectionBasedLayoutPaperCanvasSizeOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The paper size that is used to define canvas dimensions.
     * </p>
     */
    private String paperSize;
    /**
     * <p>
     * The paper orientation that is used to define canvas dimensions. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PORTRAIT
     * </p>
     * </li>
     * <li>
     * <p>
     * LANDSCAPE
     * </p>
     * </li>
     * </ul>
     */
    private String paperOrientation;
    /**
     * <p>
     * Defines the spacing between the canvas content and the top, bottom, left, and right edges.
     * </p>
     */
    private Spacing paperMargin;

    /**
     * <p>
     * The paper size that is used to define canvas dimensions.
     * </p>
     * 
     * @param paperSize
     *        The paper size that is used to define canvas dimensions.
     * @see PaperSize
     */

    public void setPaperSize(String paperSize) {
        this.paperSize = paperSize;
    }

    /**
     * <p>
     * The paper size that is used to define canvas dimensions.
     * </p>
     * 
     * @return The paper size that is used to define canvas dimensions.
     * @see PaperSize
     */

    public String getPaperSize() {
        return this.paperSize;
    }

    /**
     * <p>
     * The paper size that is used to define canvas dimensions.
     * </p>
     * 
     * @param paperSize
     *        The paper size that is used to define canvas dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaperSize
     */

    public SectionBasedLayoutPaperCanvasSizeOptions withPaperSize(String paperSize) {
        setPaperSize(paperSize);
        return this;
    }

    /**
     * <p>
     * The paper size that is used to define canvas dimensions.
     * </p>
     * 
     * @param paperSize
     *        The paper size that is used to define canvas dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaperSize
     */

    public SectionBasedLayoutPaperCanvasSizeOptions withPaperSize(PaperSize paperSize) {
        this.paperSize = paperSize.toString();
        return this;
    }

    /**
     * <p>
     * The paper orientation that is used to define canvas dimensions. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PORTRAIT
     * </p>
     * </li>
     * <li>
     * <p>
     * LANDSCAPE
     * </p>
     * </li>
     * </ul>
     * 
     * @param paperOrientation
     *        The paper orientation that is used to define canvas dimensions. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PORTRAIT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LANDSCAPE
     *        </p>
     *        </li>
     * @see PaperOrientation
     */

    public void setPaperOrientation(String paperOrientation) {
        this.paperOrientation = paperOrientation;
    }

    /**
     * <p>
     * The paper orientation that is used to define canvas dimensions. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PORTRAIT
     * </p>
     * </li>
     * <li>
     * <p>
     * LANDSCAPE
     * </p>
     * </li>
     * </ul>
     * 
     * @return The paper orientation that is used to define canvas dimensions. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PORTRAIT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LANDSCAPE
     *         </p>
     *         </li>
     * @see PaperOrientation
     */

    public String getPaperOrientation() {
        return this.paperOrientation;
    }

    /**
     * <p>
     * The paper orientation that is used to define canvas dimensions. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PORTRAIT
     * </p>
     * </li>
     * <li>
     * <p>
     * LANDSCAPE
     * </p>
     * </li>
     * </ul>
     * 
     * @param paperOrientation
     *        The paper orientation that is used to define canvas dimensions. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PORTRAIT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LANDSCAPE
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaperOrientation
     */

    public SectionBasedLayoutPaperCanvasSizeOptions withPaperOrientation(String paperOrientation) {
        setPaperOrientation(paperOrientation);
        return this;
    }

    /**
     * <p>
     * The paper orientation that is used to define canvas dimensions. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PORTRAIT
     * </p>
     * </li>
     * <li>
     * <p>
     * LANDSCAPE
     * </p>
     * </li>
     * </ul>
     * 
     * @param paperOrientation
     *        The paper orientation that is used to define canvas dimensions. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PORTRAIT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LANDSCAPE
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaperOrientation
     */

    public SectionBasedLayoutPaperCanvasSizeOptions withPaperOrientation(PaperOrientation paperOrientation) {
        this.paperOrientation = paperOrientation.toString();
        return this;
    }

    /**
     * <p>
     * Defines the spacing between the canvas content and the top, bottom, left, and right edges.
     * </p>
     * 
     * @param paperMargin
     *        Defines the spacing between the canvas content and the top, bottom, left, and right edges.
     */

    public void setPaperMargin(Spacing paperMargin) {
        this.paperMargin = paperMargin;
    }

    /**
     * <p>
     * Defines the spacing between the canvas content and the top, bottom, left, and right edges.
     * </p>
     * 
     * @return Defines the spacing between the canvas content and the top, bottom, left, and right edges.
     */

    public Spacing getPaperMargin() {
        return this.paperMargin;
    }

    /**
     * <p>
     * Defines the spacing between the canvas content and the top, bottom, left, and right edges.
     * </p>
     * 
     * @param paperMargin
     *        Defines the spacing between the canvas content and the top, bottom, left, and right edges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionBasedLayoutPaperCanvasSizeOptions withPaperMargin(Spacing paperMargin) {
        setPaperMargin(paperMargin);
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
        if (getPaperSize() != null)
            sb.append("PaperSize: ").append(getPaperSize()).append(",");
        if (getPaperOrientation() != null)
            sb.append("PaperOrientation: ").append(getPaperOrientation()).append(",");
        if (getPaperMargin() != null)
            sb.append("PaperMargin: ").append(getPaperMargin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SectionBasedLayoutPaperCanvasSizeOptions == false)
            return false;
        SectionBasedLayoutPaperCanvasSizeOptions other = (SectionBasedLayoutPaperCanvasSizeOptions) obj;
        if (other.getPaperSize() == null ^ this.getPaperSize() == null)
            return false;
        if (other.getPaperSize() != null && other.getPaperSize().equals(this.getPaperSize()) == false)
            return false;
        if (other.getPaperOrientation() == null ^ this.getPaperOrientation() == null)
            return false;
        if (other.getPaperOrientation() != null && other.getPaperOrientation().equals(this.getPaperOrientation()) == false)
            return false;
        if (other.getPaperMargin() == null ^ this.getPaperMargin() == null)
            return false;
        if (other.getPaperMargin() != null && other.getPaperMargin().equals(this.getPaperMargin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPaperSize() == null) ? 0 : getPaperSize().hashCode());
        hashCode = prime * hashCode + ((getPaperOrientation() == null) ? 0 : getPaperOrientation().hashCode());
        hashCode = prime * hashCode + ((getPaperMargin() == null) ? 0 : getPaperMargin().hashCode());
        return hashCode;
    }

    @Override
    public SectionBasedLayoutPaperCanvasSizeOptions clone() {
        try {
            return (SectionBasedLayoutPaperCanvasSizeOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SectionBasedLayoutPaperCanvasSizeOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
