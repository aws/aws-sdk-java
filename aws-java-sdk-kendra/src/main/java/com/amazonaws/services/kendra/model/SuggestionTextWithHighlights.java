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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides text and information about where to highlight the query suggestion text.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SuggestionTextWithHighlights"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuggestionTextWithHighlights implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The query suggestion text to display to the user.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The beginning and end of the query suggestion text that should be highlighted.
     * </p>
     */
    private java.util.List<SuggestionHighlight> highlights;

    /**
     * <p>
     * The query suggestion text to display to the user.
     * </p>
     * 
     * @param text
     *        The query suggestion text to display to the user.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The query suggestion text to display to the user.
     * </p>
     * 
     * @return The query suggestion text to display to the user.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The query suggestion text to display to the user.
     * </p>
     * 
     * @param text
     *        The query suggestion text to display to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestionTextWithHighlights withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The beginning and end of the query suggestion text that should be highlighted.
     * </p>
     * 
     * @return The beginning and end of the query suggestion text that should be highlighted.
     */

    public java.util.List<SuggestionHighlight> getHighlights() {
        return highlights;
    }

    /**
     * <p>
     * The beginning and end of the query suggestion text that should be highlighted.
     * </p>
     * 
     * @param highlights
     *        The beginning and end of the query suggestion text that should be highlighted.
     */

    public void setHighlights(java.util.Collection<SuggestionHighlight> highlights) {
        if (highlights == null) {
            this.highlights = null;
            return;
        }

        this.highlights = new java.util.ArrayList<SuggestionHighlight>(highlights);
    }

    /**
     * <p>
     * The beginning and end of the query suggestion text that should be highlighted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHighlights(java.util.Collection)} or {@link #withHighlights(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param highlights
     *        The beginning and end of the query suggestion text that should be highlighted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestionTextWithHighlights withHighlights(SuggestionHighlight... highlights) {
        if (this.highlights == null) {
            setHighlights(new java.util.ArrayList<SuggestionHighlight>(highlights.length));
        }
        for (SuggestionHighlight ele : highlights) {
            this.highlights.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The beginning and end of the query suggestion text that should be highlighted.
     * </p>
     * 
     * @param highlights
     *        The beginning and end of the query suggestion text that should be highlighted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestionTextWithHighlights withHighlights(java.util.Collection<SuggestionHighlight> highlights) {
        setHighlights(highlights);
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
        if (getHighlights() != null)
            sb.append("Highlights: ").append(getHighlights());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuggestionTextWithHighlights == false)
            return false;
        SuggestionTextWithHighlights other = (SuggestionTextWithHighlights) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getHighlights() == null ^ this.getHighlights() == null)
            return false;
        if (other.getHighlights() != null && other.getHighlights().equals(this.getHighlights()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getHighlights() == null) ? 0 : getHighlights().hashCode());
        return hashCode;
    }

    @Override
    public SuggestionTextWithHighlights clone() {
        try {
            return (SuggestionTextWithHighlights) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SuggestionTextWithHighlightsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
