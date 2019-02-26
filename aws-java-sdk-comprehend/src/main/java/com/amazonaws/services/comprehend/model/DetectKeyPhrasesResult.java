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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectKeyPhrases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectKeyPhrasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A collection of key phrases that Amazon Comprehend identified in the input text. For each key phrase, the
     * response provides the text of the key phrase, where the key phrase begins and ends, and the level of confidence
     * that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     */
    private java.util.List<KeyPhrase> keyPhrases;

    /**
     * <p>
     * A collection of key phrases that Amazon Comprehend identified in the input text. For each key phrase, the
     * response provides the text of the key phrase, where the key phrase begins and ends, and the level of confidence
     * that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     * 
     * @return A collection of key phrases that Amazon Comprehend identified in the input text. For each key phrase, the
     *         response provides the text of the key phrase, where the key phrase begins and ends, and the level of
     *         confidence that Amazon Comprehend has in the accuracy of the detection.
     */

    public java.util.List<KeyPhrase> getKeyPhrases() {
        return keyPhrases;
    }

    /**
     * <p>
     * A collection of key phrases that Amazon Comprehend identified in the input text. For each key phrase, the
     * response provides the text of the key phrase, where the key phrase begins and ends, and the level of confidence
     * that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     * 
     * @param keyPhrases
     *        A collection of key phrases that Amazon Comprehend identified in the input text. For each key phrase, the
     *        response provides the text of the key phrase, where the key phrase begins and ends, and the level of
     *        confidence that Amazon Comprehend has in the accuracy of the detection.
     */

    public void setKeyPhrases(java.util.Collection<KeyPhrase> keyPhrases) {
        if (keyPhrases == null) {
            this.keyPhrases = null;
            return;
        }

        this.keyPhrases = new java.util.ArrayList<KeyPhrase>(keyPhrases);
    }

    /**
     * <p>
     * A collection of key phrases that Amazon Comprehend identified in the input text. For each key phrase, the
     * response provides the text of the key phrase, where the key phrase begins and ends, and the level of confidence
     * that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyPhrases(java.util.Collection)} or {@link #withKeyPhrases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keyPhrases
     *        A collection of key phrases that Amazon Comprehend identified in the input text. For each key phrase, the
     *        response provides the text of the key phrase, where the key phrase begins and ends, and the level of
     *        confidence that Amazon Comprehend has in the accuracy of the detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectKeyPhrasesResult withKeyPhrases(KeyPhrase... keyPhrases) {
        if (this.keyPhrases == null) {
            setKeyPhrases(new java.util.ArrayList<KeyPhrase>(keyPhrases.length));
        }
        for (KeyPhrase ele : keyPhrases) {
            this.keyPhrases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of key phrases that Amazon Comprehend identified in the input text. For each key phrase, the
     * response provides the text of the key phrase, where the key phrase begins and ends, and the level of confidence
     * that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     * 
     * @param keyPhrases
     *        A collection of key phrases that Amazon Comprehend identified in the input text. For each key phrase, the
     *        response provides the text of the key phrase, where the key phrase begins and ends, and the level of
     *        confidence that Amazon Comprehend has in the accuracy of the detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectKeyPhrasesResult withKeyPhrases(java.util.Collection<KeyPhrase> keyPhrases) {
        setKeyPhrases(keyPhrases);
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
        if (getKeyPhrases() != null)
            sb.append("KeyPhrases: ").append(getKeyPhrases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectKeyPhrasesResult == false)
            return false;
        DetectKeyPhrasesResult other = (DetectKeyPhrasesResult) obj;
        if (other.getKeyPhrases() == null ^ this.getKeyPhrases() == null)
            return false;
        if (other.getKeyPhrases() != null && other.getKeyPhrases().equals(this.getKeyPhrases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPhrases() == null) ? 0 : getKeyPhrases().hashCode());
        return hashCode;
    }

    @Override
    public DetectKeyPhrasesResult clone() {
        try {
            return (DetectKeyPhrasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
