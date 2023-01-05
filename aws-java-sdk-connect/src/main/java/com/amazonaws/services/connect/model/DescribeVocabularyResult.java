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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeVocabulary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVocabularyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of specific words that you want Contact Lens for Amazon Connect to recognize in your audio input. They are
     * generally domain-specific words and phrases, words that Contact Lens is not recognizing, or proper nouns.
     * </p>
     */
    private Vocabulary vocabulary;

    /**
     * <p>
     * A list of specific words that you want Contact Lens for Amazon Connect to recognize in your audio input. They are
     * generally domain-specific words and phrases, words that Contact Lens is not recognizing, or proper nouns.
     * </p>
     * 
     * @param vocabulary
     *        A list of specific words that you want Contact Lens for Amazon Connect to recognize in your audio input.
     *        They are generally domain-specific words and phrases, words that Contact Lens is not recognizing, or
     *        proper nouns.
     */

    public void setVocabulary(Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
    }

    /**
     * <p>
     * A list of specific words that you want Contact Lens for Amazon Connect to recognize in your audio input. They are
     * generally domain-specific words and phrases, words that Contact Lens is not recognizing, or proper nouns.
     * </p>
     * 
     * @return A list of specific words that you want Contact Lens for Amazon Connect to recognize in your audio input.
     *         They are generally domain-specific words and phrases, words that Contact Lens is not recognizing, or
     *         proper nouns.
     */

    public Vocabulary getVocabulary() {
        return this.vocabulary;
    }

    /**
     * <p>
     * A list of specific words that you want Contact Lens for Amazon Connect to recognize in your audio input. They are
     * generally domain-specific words and phrases, words that Contact Lens is not recognizing, or proper nouns.
     * </p>
     * 
     * @param vocabulary
     *        A list of specific words that you want Contact Lens for Amazon Connect to recognize in your audio input.
     *        They are generally domain-specific words and phrases, words that Contact Lens is not recognizing, or
     *        proper nouns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVocabularyResult withVocabulary(Vocabulary vocabulary) {
        setVocabulary(vocabulary);
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
        if (getVocabulary() != null)
            sb.append("Vocabulary: ").append(getVocabulary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVocabularyResult == false)
            return false;
        DescribeVocabularyResult other = (DescribeVocabularyResult) obj;
        if (other.getVocabulary() == null ^ this.getVocabulary() == null)
            return false;
        if (other.getVocabulary() != null && other.getVocabulary().equals(this.getVocabulary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVocabulary() == null) ? 0 : getVocabulary().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVocabularyResult clone() {
        try {
            return (DescribeVocabularyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
