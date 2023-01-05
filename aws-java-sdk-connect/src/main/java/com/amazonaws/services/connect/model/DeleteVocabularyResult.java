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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteVocabulary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVocabularyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     */
    private String vocabularyArn;
    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     */
    private String vocabularyId;
    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     * 
     * @param vocabularyArn
     *        The Amazon Resource Name (ARN) of the custom vocabulary.
     */

    public void setVocabularyArn(String vocabularyArn) {
        this.vocabularyArn = vocabularyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom vocabulary.
     */

    public String getVocabularyArn() {
        return this.vocabularyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     * 
     * @param vocabularyArn
     *        The Amazon Resource Name (ARN) of the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVocabularyResult withVocabularyArn(String vocabularyArn) {
        setVocabularyArn(vocabularyArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * 
     * @param vocabularyId
     *        The identifier of the custom vocabulary.
     */

    public void setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * 
     * @return The identifier of the custom vocabulary.
     */

    public String getVocabularyId() {
        return this.vocabularyId;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * 
     * @param vocabularyId
     *        The identifier of the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVocabularyResult withVocabularyId(String vocabularyId) {
        setVocabularyId(vocabularyId);
        return this;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * 
     * @param state
     *        The current state of the custom vocabulary.
     * @see VocabularyState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * 
     * @return The current state of the custom vocabulary.
     * @see VocabularyState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * 
     * @param state
     *        The current state of the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public DeleteVocabularyResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * 
     * @param state
     *        The current state of the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public DeleteVocabularyResult withState(VocabularyState state) {
        this.state = state.toString();
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
        if (getVocabularyArn() != null)
            sb.append("VocabularyArn: ").append(getVocabularyArn()).append(",");
        if (getVocabularyId() != null)
            sb.append("VocabularyId: ").append(getVocabularyId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVocabularyResult == false)
            return false;
        DeleteVocabularyResult other = (DeleteVocabularyResult) obj;
        if (other.getVocabularyArn() == null ^ this.getVocabularyArn() == null)
            return false;
        if (other.getVocabularyArn() != null && other.getVocabularyArn().equals(this.getVocabularyArn()) == false)
            return false;
        if (other.getVocabularyId() == null ^ this.getVocabularyId() == null)
            return false;
        if (other.getVocabularyId() != null && other.getVocabularyId().equals(this.getVocabularyId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVocabularyArn() == null) ? 0 : getVocabularyArn().hashCode());
        hashCode = prime * hashCode + ((getVocabularyId() == null) ? 0 : getVocabularyId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVocabularyResult clone() {
        try {
            return (DeleteVocabularyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
