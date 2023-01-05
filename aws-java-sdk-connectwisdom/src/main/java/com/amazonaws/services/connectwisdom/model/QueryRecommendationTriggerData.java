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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data associated with the QUERY RecommendationTriggerType.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/QueryRecommendationTriggerData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryRecommendationTriggerData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text associated with the recommendation trigger.
     * </p>
     */
    private String text;

    /**
     * <p>
     * The text associated with the recommendation trigger.
     * </p>
     * 
     * @param text
     *        The text associated with the recommendation trigger.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text associated with the recommendation trigger.
     * </p>
     * 
     * @return The text associated with the recommendation trigger.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The text associated with the recommendation trigger.
     * </p>
     * 
     * @param text
     *        The text associated with the recommendation trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRecommendationTriggerData withText(String text) {
        setText(text);
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
            sb.append("Text: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryRecommendationTriggerData == false)
            return false;
        QueryRecommendationTriggerData other = (QueryRecommendationTriggerData) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public QueryRecommendationTriggerData clone() {
        try {
            return (QueryRecommendationTriggerData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.QueryRecommendationTriggerDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
