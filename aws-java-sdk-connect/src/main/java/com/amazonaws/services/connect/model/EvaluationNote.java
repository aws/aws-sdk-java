/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about notes for a contact evaluation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationNote" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationNote implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The note for an item (section or question) in a contact evaluation.
     * </p>
     * <note>
     * <p>
     * Even though a note in an evaluation can have up to 3072 chars, there is also a limit on the total number of chars
     * for all the notes in the evaluation combined. Assuming there are N questions in the evaluation being submitted,
     * then the max char limit for all notes combined is N x 1024.
     * </p>
     * </note>
     */
    private String value;

    /**
     * <p>
     * The note for an item (section or question) in a contact evaluation.
     * </p>
     * <note>
     * <p>
     * Even though a note in an evaluation can have up to 3072 chars, there is also a limit on the total number of chars
     * for all the notes in the evaluation combined. Assuming there are N questions in the evaluation being submitted,
     * then the max char limit for all notes combined is N x 1024.
     * </p>
     * </note>
     * 
     * @param value
     *        The note for an item (section or question) in a contact evaluation.</p> <note>
     *        <p>
     *        Even though a note in an evaluation can have up to 3072 chars, there is also a limit on the total number
     *        of chars for all the notes in the evaluation combined. Assuming there are N questions in the evaluation
     *        being submitted, then the max char limit for all notes combined is N x 1024.
     *        </p>
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The note for an item (section or question) in a contact evaluation.
     * </p>
     * <note>
     * <p>
     * Even though a note in an evaluation can have up to 3072 chars, there is also a limit on the total number of chars
     * for all the notes in the evaluation combined. Assuming there are N questions in the evaluation being submitted,
     * then the max char limit for all notes combined is N x 1024.
     * </p>
     * </note>
     * 
     * @return The note for an item (section or question) in a contact evaluation.</p> <note>
     *         <p>
     *         Even though a note in an evaluation can have up to 3072 chars, there is also a limit on the total number
     *         of chars for all the notes in the evaluation combined. Assuming there are N questions in the evaluation
     *         being submitted, then the max char limit for all notes combined is N x 1024.
     *         </p>
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The note for an item (section or question) in a contact evaluation.
     * </p>
     * <note>
     * <p>
     * Even though a note in an evaluation can have up to 3072 chars, there is also a limit on the total number of chars
     * for all the notes in the evaluation combined. Assuming there are N questions in the evaluation being submitted,
     * then the max char limit for all notes combined is N x 1024.
     * </p>
     * </note>
     * 
     * @param value
     *        The note for an item (section or question) in a contact evaluation.</p> <note>
     *        <p>
     *        Even though a note in an evaluation can have up to 3072 chars, there is also a limit on the total number
     *        of chars for all the notes in the evaluation combined. Assuming there are N questions in the evaluation
     *        being submitted, then the max char limit for all notes combined is N x 1024.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationNote withValue(String value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationNote == false)
            return false;
        EvaluationNote other = (EvaluationNote) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationNote clone() {
        try {
            return (EvaluationNote) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationNoteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
