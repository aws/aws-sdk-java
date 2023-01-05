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
 * The word cloud options for a word cloud visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/WordCloudOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WordCloudOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The word orientation options (horizontal, horizontal_and_vertical) for the words in a word cloud.
     * </p>
     */
    private String wordOrientation;
    /**
     * <p>
     * The word scaling options (emphasize, normal) for the words in a word cloud.
     * </p>
     */
    private String wordScaling;
    /**
     * <p>
     * The cloud layout options (fluid, normal) of a word cloud.
     * </p>
     */
    private String cloudLayout;
    /**
     * <p>
     * The word casing options (lower_case, existing_case) for the words in a word cloud.
     * </p>
     */
    private String wordCasing;
    /**
     * <p>
     * The word padding options (none, small, medium, large) for the words in a word cloud.
     * </p>
     */
    private String wordPadding;
    /**
     * <p>
     * The length limit of each word from 1-100.
     * </p>
     */
    private Integer maximumStringLength;

    /**
     * <p>
     * The word orientation options (horizontal, horizontal_and_vertical) for the words in a word cloud.
     * </p>
     * 
     * @param wordOrientation
     *        The word orientation options (horizontal, horizontal_and_vertical) for the words in a word cloud.
     * @see WordCloudWordOrientation
     */

    public void setWordOrientation(String wordOrientation) {
        this.wordOrientation = wordOrientation;
    }

    /**
     * <p>
     * The word orientation options (horizontal, horizontal_and_vertical) for the words in a word cloud.
     * </p>
     * 
     * @return The word orientation options (horizontal, horizontal_and_vertical) for the words in a word cloud.
     * @see WordCloudWordOrientation
     */

    public String getWordOrientation() {
        return this.wordOrientation;
    }

    /**
     * <p>
     * The word orientation options (horizontal, horizontal_and_vertical) for the words in a word cloud.
     * </p>
     * 
     * @param wordOrientation
     *        The word orientation options (horizontal, horizontal_and_vertical) for the words in a word cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WordCloudWordOrientation
     */

    public WordCloudOptions withWordOrientation(String wordOrientation) {
        setWordOrientation(wordOrientation);
        return this;
    }

    /**
     * <p>
     * The word orientation options (horizontal, horizontal_and_vertical) for the words in a word cloud.
     * </p>
     * 
     * @param wordOrientation
     *        The word orientation options (horizontal, horizontal_and_vertical) for the words in a word cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WordCloudWordOrientation
     */

    public WordCloudOptions withWordOrientation(WordCloudWordOrientation wordOrientation) {
        this.wordOrientation = wordOrientation.toString();
        return this;
    }

    /**
     * <p>
     * The word scaling options (emphasize, normal) for the words in a word cloud.
     * </p>
     * 
     * @param wordScaling
     *        The word scaling options (emphasize, normal) for the words in a word cloud.
     * @see WordCloudWordScaling
     */

    public void setWordScaling(String wordScaling) {
        this.wordScaling = wordScaling;
    }

    /**
     * <p>
     * The word scaling options (emphasize, normal) for the words in a word cloud.
     * </p>
     * 
     * @return The word scaling options (emphasize, normal) for the words in a word cloud.
     * @see WordCloudWordScaling
     */

    public String getWordScaling() {
        return this.wordScaling;
    }

    /**
     * <p>
     * The word scaling options (emphasize, normal) for the words in a word cloud.
     * </p>
     * 
     * @param wordScaling
     *        The word scaling options (emphasize, normal) for the words in a word cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WordCloudWordScaling
     */

    public WordCloudOptions withWordScaling(String wordScaling) {
        setWordScaling(wordScaling);
        return this;
    }

    /**
     * <p>
     * The word scaling options (emphasize, normal) for the words in a word cloud.
     * </p>
     * 
     * @param wordScaling
     *        The word scaling options (emphasize, normal) for the words in a word cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WordCloudWordScaling
     */

    public WordCloudOptions withWordScaling(WordCloudWordScaling wordScaling) {
        this.wordScaling = wordScaling.toString();
        return this;
    }

    /**
     * <p>
     * The cloud layout options (fluid, normal) of a word cloud.
     * </p>
     * 
     * @param cloudLayout
     *        The cloud layout options (fluid, normal) of a word cloud.
     * @see WordCloudCloudLayout
     */

    public void setCloudLayout(String cloudLayout) {
        this.cloudLayout = cloudLayout;
    }

    /**
     * <p>
     * The cloud layout options (fluid, normal) of a word cloud.
     * </p>
     * 
     * @return The cloud layout options (fluid, normal) of a word cloud.
     * @see WordCloudCloudLayout
     */

    public String getCloudLayout() {
        return this.cloudLayout;
    }

    /**
     * <p>
     * The cloud layout options (fluid, normal) of a word cloud.
     * </p>
     * 
     * @param cloudLayout
     *        The cloud layout options (fluid, normal) of a word cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WordCloudCloudLayout
     */

    public WordCloudOptions withCloudLayout(String cloudLayout) {
        setCloudLayout(cloudLayout);
        return this;
    }

    /**
     * <p>
     * The cloud layout options (fluid, normal) of a word cloud.
     * </p>
     * 
     * @param cloudLayout
     *        The cloud layout options (fluid, normal) of a word cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WordCloudCloudLayout
     */

    public WordCloudOptions withCloudLayout(WordCloudCloudLayout cloudLayout) {
        this.cloudLayout = cloudLayout.toString();
        return this;
    }

    /**
     * <p>
     * The word casing options (lower_case, existing_case) for the words in a word cloud.
     * </p>
     * 
     * @param wordCasing
     *        The word casing options (lower_case, existing_case) for the words in a word cloud.
     * @see WordCloudWordCasing
     */

    public void setWordCasing(String wordCasing) {
        this.wordCasing = wordCasing;
    }

    /**
     * <p>
     * The word casing options (lower_case, existing_case) for the words in a word cloud.
     * </p>
     * 
     * @return The word casing options (lower_case, existing_case) for the words in a word cloud.
     * @see WordCloudWordCasing
     */

    public String getWordCasing() {
        return this.wordCasing;
    }

    /**
     * <p>
     * The word casing options (lower_case, existing_case) for the words in a word cloud.
     * </p>
     * 
     * @param wordCasing
     *        The word casing options (lower_case, existing_case) for the words in a word cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WordCloudWordCasing
     */

    public WordCloudOptions withWordCasing(String wordCasing) {
        setWordCasing(wordCasing);
        return this;
    }

    /**
     * <p>
     * The word casing options (lower_case, existing_case) for the words in a word cloud.
     * </p>
     * 
     * @param wordCasing
     *        The word casing options (lower_case, existing_case) for the words in a word cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WordCloudWordCasing
     */

    public WordCloudOptions withWordCasing(WordCloudWordCasing wordCasing) {
        this.wordCasing = wordCasing.toString();
        return this;
    }

    /**
     * <p>
     * The word padding options (none, small, medium, large) for the words in a word cloud.
     * </p>
     * 
     * @param wordPadding
     *        The word padding options (none, small, medium, large) for the words in a word cloud.
     * @see WordCloudWordPadding
     */

    public void setWordPadding(String wordPadding) {
        this.wordPadding = wordPadding;
    }

    /**
     * <p>
     * The word padding options (none, small, medium, large) for the words in a word cloud.
     * </p>
     * 
     * @return The word padding options (none, small, medium, large) for the words in a word cloud.
     * @see WordCloudWordPadding
     */

    public String getWordPadding() {
        return this.wordPadding;
    }

    /**
     * <p>
     * The word padding options (none, small, medium, large) for the words in a word cloud.
     * </p>
     * 
     * @param wordPadding
     *        The word padding options (none, small, medium, large) for the words in a word cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WordCloudWordPadding
     */

    public WordCloudOptions withWordPadding(String wordPadding) {
        setWordPadding(wordPadding);
        return this;
    }

    /**
     * <p>
     * The word padding options (none, small, medium, large) for the words in a word cloud.
     * </p>
     * 
     * @param wordPadding
     *        The word padding options (none, small, medium, large) for the words in a word cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WordCloudWordPadding
     */

    public WordCloudOptions withWordPadding(WordCloudWordPadding wordPadding) {
        this.wordPadding = wordPadding.toString();
        return this;
    }

    /**
     * <p>
     * The length limit of each word from 1-100.
     * </p>
     * 
     * @param maximumStringLength
     *        The length limit of each word from 1-100.
     */

    public void setMaximumStringLength(Integer maximumStringLength) {
        this.maximumStringLength = maximumStringLength;
    }

    /**
     * <p>
     * The length limit of each word from 1-100.
     * </p>
     * 
     * @return The length limit of each word from 1-100.
     */

    public Integer getMaximumStringLength() {
        return this.maximumStringLength;
    }

    /**
     * <p>
     * The length limit of each word from 1-100.
     * </p>
     * 
     * @param maximumStringLength
     *        The length limit of each word from 1-100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WordCloudOptions withMaximumStringLength(Integer maximumStringLength) {
        setMaximumStringLength(maximumStringLength);
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
        if (getWordOrientation() != null)
            sb.append("WordOrientation: ").append(getWordOrientation()).append(",");
        if (getWordScaling() != null)
            sb.append("WordScaling: ").append(getWordScaling()).append(",");
        if (getCloudLayout() != null)
            sb.append("CloudLayout: ").append(getCloudLayout()).append(",");
        if (getWordCasing() != null)
            sb.append("WordCasing: ").append(getWordCasing()).append(",");
        if (getWordPadding() != null)
            sb.append("WordPadding: ").append(getWordPadding()).append(",");
        if (getMaximumStringLength() != null)
            sb.append("MaximumStringLength: ").append(getMaximumStringLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WordCloudOptions == false)
            return false;
        WordCloudOptions other = (WordCloudOptions) obj;
        if (other.getWordOrientation() == null ^ this.getWordOrientation() == null)
            return false;
        if (other.getWordOrientation() != null && other.getWordOrientation().equals(this.getWordOrientation()) == false)
            return false;
        if (other.getWordScaling() == null ^ this.getWordScaling() == null)
            return false;
        if (other.getWordScaling() != null && other.getWordScaling().equals(this.getWordScaling()) == false)
            return false;
        if (other.getCloudLayout() == null ^ this.getCloudLayout() == null)
            return false;
        if (other.getCloudLayout() != null && other.getCloudLayout().equals(this.getCloudLayout()) == false)
            return false;
        if (other.getWordCasing() == null ^ this.getWordCasing() == null)
            return false;
        if (other.getWordCasing() != null && other.getWordCasing().equals(this.getWordCasing()) == false)
            return false;
        if (other.getWordPadding() == null ^ this.getWordPadding() == null)
            return false;
        if (other.getWordPadding() != null && other.getWordPadding().equals(this.getWordPadding()) == false)
            return false;
        if (other.getMaximumStringLength() == null ^ this.getMaximumStringLength() == null)
            return false;
        if (other.getMaximumStringLength() != null && other.getMaximumStringLength().equals(this.getMaximumStringLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWordOrientation() == null) ? 0 : getWordOrientation().hashCode());
        hashCode = prime * hashCode + ((getWordScaling() == null) ? 0 : getWordScaling().hashCode());
        hashCode = prime * hashCode + ((getCloudLayout() == null) ? 0 : getCloudLayout().hashCode());
        hashCode = prime * hashCode + ((getWordCasing() == null) ? 0 : getWordCasing().hashCode());
        hashCode = prime * hashCode + ((getWordPadding() == null) ? 0 : getWordPadding().hashCode());
        hashCode = prime * hashCode + ((getMaximumStringLength() == null) ? 0 : getMaximumStringLength().hashCode());
        return hashCode;
    }

    @Override
    public WordCloudOptions clone() {
        try {
            return (WordCloudOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.WordCloudOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
