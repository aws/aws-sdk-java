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
 * The field wells of a word cloud visual.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/WordCloudFieldWells" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WordCloudFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregated field wells of a word cloud.
     * </p>
     */
    private WordCloudAggregatedFieldWells wordCloudAggregatedFieldWells;

    /**
     * <p>
     * The aggregated field wells of a word cloud.
     * </p>
     * 
     * @param wordCloudAggregatedFieldWells
     *        The aggregated field wells of a word cloud.
     */

    public void setWordCloudAggregatedFieldWells(WordCloudAggregatedFieldWells wordCloudAggregatedFieldWells) {
        this.wordCloudAggregatedFieldWells = wordCloudAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field wells of a word cloud.
     * </p>
     * 
     * @return The aggregated field wells of a word cloud.
     */

    public WordCloudAggregatedFieldWells getWordCloudAggregatedFieldWells() {
        return this.wordCloudAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field wells of a word cloud.
     * </p>
     * 
     * @param wordCloudAggregatedFieldWells
     *        The aggregated field wells of a word cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WordCloudFieldWells withWordCloudAggregatedFieldWells(WordCloudAggregatedFieldWells wordCloudAggregatedFieldWells) {
        setWordCloudAggregatedFieldWells(wordCloudAggregatedFieldWells);
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
        if (getWordCloudAggregatedFieldWells() != null)
            sb.append("WordCloudAggregatedFieldWells: ").append(getWordCloudAggregatedFieldWells());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WordCloudFieldWells == false)
            return false;
        WordCloudFieldWells other = (WordCloudFieldWells) obj;
        if (other.getWordCloudAggregatedFieldWells() == null ^ this.getWordCloudAggregatedFieldWells() == null)
            return false;
        if (other.getWordCloudAggregatedFieldWells() != null
                && other.getWordCloudAggregatedFieldWells().equals(this.getWordCloudAggregatedFieldWells()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWordCloudAggregatedFieldWells() == null) ? 0 : getWordCloudAggregatedFieldWells().hashCode());
        return hashCode;
    }

    @Override
    public WordCloudFieldWells clone() {
        try {
            return (WordCloudFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.WordCloudFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
