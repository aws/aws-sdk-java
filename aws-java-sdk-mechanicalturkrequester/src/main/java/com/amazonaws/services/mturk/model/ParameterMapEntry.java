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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This data structure is the data type for the AnswerKey parameter of the ScoreMyKnownAnswers/2011-09-01 Review Policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ParameterMapEntry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterMapEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The QuestionID from the HIT that is used to identify which question requires Mechanical Turk to score as part of
     * the ScoreMyKnownAnswers/2011-09-01 Review Policy.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The list of answers to the question specified in the MapEntry Key element. The Worker must match all values in
     * order for the answer to be scored correctly.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The QuestionID from the HIT that is used to identify which question requires Mechanical Turk to score as part of
     * the ScoreMyKnownAnswers/2011-09-01 Review Policy.
     * </p>
     * 
     * @param key
     *        The QuestionID from the HIT that is used to identify which question requires Mechanical Turk to score as
     *        part of the ScoreMyKnownAnswers/2011-09-01 Review Policy.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The QuestionID from the HIT that is used to identify which question requires Mechanical Turk to score as part of
     * the ScoreMyKnownAnswers/2011-09-01 Review Policy.
     * </p>
     * 
     * @return The QuestionID from the HIT that is used to identify which question requires Mechanical Turk to score as
     *         part of the ScoreMyKnownAnswers/2011-09-01 Review Policy.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The QuestionID from the HIT that is used to identify which question requires Mechanical Turk to score as part of
     * the ScoreMyKnownAnswers/2011-09-01 Review Policy.
     * </p>
     * 
     * @param key
     *        The QuestionID from the HIT that is used to identify which question requires Mechanical Turk to score as
     *        part of the ScoreMyKnownAnswers/2011-09-01 Review Policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterMapEntry withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The list of answers to the question specified in the MapEntry Key element. The Worker must match all values in
     * order for the answer to be scored correctly.
     * </p>
     * 
     * @return The list of answers to the question specified in the MapEntry Key element. The Worker must match all
     *         values in order for the answer to be scored correctly.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The list of answers to the question specified in the MapEntry Key element. The Worker must match all values in
     * order for the answer to be scored correctly.
     * </p>
     * 
     * @param values
     *        The list of answers to the question specified in the MapEntry Key element. The Worker must match all
     *        values in order for the answer to be scored correctly.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The list of answers to the question specified in the MapEntry Key element. The Worker must match all values in
     * order for the answer to be scored correctly.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The list of answers to the question specified in the MapEntry Key element. The Worker must match all
     *        values in order for the answer to be scored correctly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterMapEntry withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of answers to the question specified in the MapEntry Key element. The Worker must match all values in
     * order for the answer to be scored correctly.
     * </p>
     * 
     * @param values
     *        The list of answers to the question specified in the MapEntry Key element. The Worker must match all
     *        values in order for the answer to be scored correctly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterMapEntry withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterMapEntry == false)
            return false;
        ParameterMapEntry other = (ParameterMapEntry) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public ParameterMapEntry clone() {
        try {
            return (ParameterMapEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.ParameterMapEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
