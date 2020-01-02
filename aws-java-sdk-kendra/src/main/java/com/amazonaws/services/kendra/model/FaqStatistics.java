/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides statistical information about the FAQ questions and answers contained in an index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/FaqStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FaqStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of FAQ questions and answers contained in the index.
     * </p>
     */
    private Integer indexedQuestionAnswersCount;

    /**
     * <p>
     * The total number of FAQ questions and answers contained in the index.
     * </p>
     * 
     * @param indexedQuestionAnswersCount
     *        The total number of FAQ questions and answers contained in the index.
     */

    public void setIndexedQuestionAnswersCount(Integer indexedQuestionAnswersCount) {
        this.indexedQuestionAnswersCount = indexedQuestionAnswersCount;
    }

    /**
     * <p>
     * The total number of FAQ questions and answers contained in the index.
     * </p>
     * 
     * @return The total number of FAQ questions and answers contained in the index.
     */

    public Integer getIndexedQuestionAnswersCount() {
        return this.indexedQuestionAnswersCount;
    }

    /**
     * <p>
     * The total number of FAQ questions and answers contained in the index.
     * </p>
     * 
     * @param indexedQuestionAnswersCount
     *        The total number of FAQ questions and answers contained in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaqStatistics withIndexedQuestionAnswersCount(Integer indexedQuestionAnswersCount) {
        setIndexedQuestionAnswersCount(indexedQuestionAnswersCount);
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
        if (getIndexedQuestionAnswersCount() != null)
            sb.append("IndexedQuestionAnswersCount: ").append(getIndexedQuestionAnswersCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FaqStatistics == false)
            return false;
        FaqStatistics other = (FaqStatistics) obj;
        if (other.getIndexedQuestionAnswersCount() == null ^ this.getIndexedQuestionAnswersCount() == null)
            return false;
        if (other.getIndexedQuestionAnswersCount() != null && other.getIndexedQuestionAnswersCount().equals(this.getIndexedQuestionAnswersCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexedQuestionAnswersCount() == null) ? 0 : getIndexedQuestionAnswersCount().hashCode());
        return hashCode;
    }

    @Override
    public FaqStatistics clone() {
        try {
            return (FaqStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.FaqStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
