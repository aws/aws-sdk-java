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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result of calling the operation. The operation returns one object for each document that is successfully
 * processed by the operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectKeyPhrasesItemResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDetectKeyPhrasesItemResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     */
    private Integer index;
    /**
     * <p>
     * One or more <a>KeyPhrase</a> objects, one for each key phrase detected in the document.
     * </p>
     */
    private java.util.List<KeyPhrase> keyPhrases;

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * 
     * @param index
     *        The zero-based index of the document in the input list.
     */

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * 
     * @return The zero-based index of the document in the input list.
     */

    public Integer getIndex() {
        return this.index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * 
     * @param index
     *        The zero-based index of the document in the input list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectKeyPhrasesItemResult withIndex(Integer index) {
        setIndex(index);
        return this;
    }

    /**
     * <p>
     * One or more <a>KeyPhrase</a> objects, one for each key phrase detected in the document.
     * </p>
     * 
     * @return One or more <a>KeyPhrase</a> objects, one for each key phrase detected in the document.
     */

    public java.util.List<KeyPhrase> getKeyPhrases() {
        return keyPhrases;
    }

    /**
     * <p>
     * One or more <a>KeyPhrase</a> objects, one for each key phrase detected in the document.
     * </p>
     * 
     * @param keyPhrases
     *        One or more <a>KeyPhrase</a> objects, one for each key phrase detected in the document.
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
     * One or more <a>KeyPhrase</a> objects, one for each key phrase detected in the document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyPhrases(java.util.Collection)} or {@link #withKeyPhrases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keyPhrases
     *        One or more <a>KeyPhrase</a> objects, one for each key phrase detected in the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectKeyPhrasesItemResult withKeyPhrases(KeyPhrase... keyPhrases) {
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
     * One or more <a>KeyPhrase</a> objects, one for each key phrase detected in the document.
     * </p>
     * 
     * @param keyPhrases
     *        One or more <a>KeyPhrase</a> objects, one for each key phrase detected in the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectKeyPhrasesItemResult withKeyPhrases(java.util.Collection<KeyPhrase> keyPhrases) {
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
        if (getIndex() != null)
            sb.append("Index: ").append(getIndex()).append(",");
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

        if (obj instanceof BatchDetectKeyPhrasesItemResult == false)
            return false;
        BatchDetectKeyPhrasesItemResult other = (BatchDetectKeyPhrasesItemResult) obj;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getKeyPhrases() == null) ? 0 : getKeyPhrases().hashCode());
        return hashCode;
    }

    @Override
    public BatchDetectKeyPhrasesItemResult clone() {
        try {
            return (BatchDetectKeyPhrasesItemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.BatchDetectKeyPhrasesItemResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
