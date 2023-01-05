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
 * A union type containing information related to the trigger.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/RecommendationTriggerData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationTriggerData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Data associated with the QUERY RecommendationTriggerType.
     * </p>
     */
    private QueryRecommendationTriggerData query;

    /**
     * <p>
     * Data associated with the QUERY RecommendationTriggerType.
     * </p>
     * 
     * @param query
     *        Data associated with the QUERY RecommendationTriggerType.
     */

    public void setQuery(QueryRecommendationTriggerData query) {
        this.query = query;
    }

    /**
     * <p>
     * Data associated with the QUERY RecommendationTriggerType.
     * </p>
     * 
     * @return Data associated with the QUERY RecommendationTriggerType.
     */

    public QueryRecommendationTriggerData getQuery() {
        return this.query;
    }

    /**
     * <p>
     * Data associated with the QUERY RecommendationTriggerType.
     * </p>
     * 
     * @param query
     *        Data associated with the QUERY RecommendationTriggerType.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTriggerData withQuery(QueryRecommendationTriggerData query) {
        setQuery(query);
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
        if (getQuery() != null)
            sb.append("Query: ").append(getQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationTriggerData == false)
            return false;
        RecommendationTriggerData other = (RecommendationTriggerData) obj;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationTriggerData clone() {
        try {
            return (RecommendationTriggerData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.RecommendationTriggerDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
