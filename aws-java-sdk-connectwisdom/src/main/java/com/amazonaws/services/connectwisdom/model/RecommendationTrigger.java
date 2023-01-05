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
 * A recommendation trigger provides context on the event that produced the referenced recommendations. Recommendations
 * are only referenced in <code>recommendationIds</code> by a single RecommendationTrigger.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/RecommendationTrigger" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationTrigger implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A union type containing information related to the trigger.
     * </p>
     */
    private RecommendationTriggerData data;
    /**
     * <p>
     * The identifier of the recommendation trigger.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifiers of the recommendations.
     * </p>
     */
    private java.util.List<String> recommendationIds;
    /**
     * <p>
     * The source of the recommendation trigger.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ISSUE_DETECTION: The corresponding recommendations were triggered by a Contact Lens issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * RULE_EVALUATION: The corresponding recommendations were triggered by a Contact Lens rule.
     * </p>
     * </li>
     * </ul>
     */
    private String source;
    /**
     * <p>
     * The type of recommendation trigger.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A union type containing information related to the trigger.
     * </p>
     * 
     * @param data
     *        A union type containing information related to the trigger.
     */

    public void setData(RecommendationTriggerData data) {
        this.data = data;
    }

    /**
     * <p>
     * A union type containing information related to the trigger.
     * </p>
     * 
     * @return A union type containing information related to the trigger.
     */

    public RecommendationTriggerData getData() {
        return this.data;
    }

    /**
     * <p>
     * A union type containing information related to the trigger.
     * </p>
     * 
     * @param data
     *        A union type containing information related to the trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTrigger withData(RecommendationTriggerData data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * The identifier of the recommendation trigger.
     * </p>
     * 
     * @param id
     *        The identifier of the recommendation trigger.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the recommendation trigger.
     * </p>
     * 
     * @return The identifier of the recommendation trigger.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the recommendation trigger.
     * </p>
     * 
     * @param id
     *        The identifier of the recommendation trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTrigger withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifiers of the recommendations.
     * </p>
     * 
     * @return The identifiers of the recommendations.
     */

    public java.util.List<String> getRecommendationIds() {
        return recommendationIds;
    }

    /**
     * <p>
     * The identifiers of the recommendations.
     * </p>
     * 
     * @param recommendationIds
     *        The identifiers of the recommendations.
     */

    public void setRecommendationIds(java.util.Collection<String> recommendationIds) {
        if (recommendationIds == null) {
            this.recommendationIds = null;
            return;
        }

        this.recommendationIds = new java.util.ArrayList<String>(recommendationIds);
    }

    /**
     * <p>
     * The identifiers of the recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationIds(java.util.Collection)} or {@link #withRecommendationIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param recommendationIds
     *        The identifiers of the recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTrigger withRecommendationIds(String... recommendationIds) {
        if (this.recommendationIds == null) {
            setRecommendationIds(new java.util.ArrayList<String>(recommendationIds.length));
        }
        for (String ele : recommendationIds) {
            this.recommendationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the recommendations.
     * </p>
     * 
     * @param recommendationIds
     *        The identifiers of the recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTrigger withRecommendationIds(java.util.Collection<String> recommendationIds) {
        setRecommendationIds(recommendationIds);
        return this;
    }

    /**
     * <p>
     * The source of the recommendation trigger.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ISSUE_DETECTION: The corresponding recommendations were triggered by a Contact Lens issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * RULE_EVALUATION: The corresponding recommendations were triggered by a Contact Lens rule.
     * </p>
     * </li>
     * </ul>
     * 
     * @param source
     *        The source of the recommendation trigger.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ISSUE_DETECTION: The corresponding recommendations were triggered by a Contact Lens issue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RULE_EVALUATION: The corresponding recommendations were triggered by a Contact Lens rule.
     *        </p>
     *        </li>
     * @see RecommendationSourceType
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the recommendation trigger.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ISSUE_DETECTION: The corresponding recommendations were triggered by a Contact Lens issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * RULE_EVALUATION: The corresponding recommendations were triggered by a Contact Lens rule.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The source of the recommendation trigger.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ISSUE_DETECTION: The corresponding recommendations were triggered by a Contact Lens issue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RULE_EVALUATION: The corresponding recommendations were triggered by a Contact Lens rule.
     *         </p>
     *         </li>
     * @see RecommendationSourceType
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the recommendation trigger.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ISSUE_DETECTION: The corresponding recommendations were triggered by a Contact Lens issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * RULE_EVALUATION: The corresponding recommendations were triggered by a Contact Lens rule.
     * </p>
     * </li>
     * </ul>
     * 
     * @param source
     *        The source of the recommendation trigger.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ISSUE_DETECTION: The corresponding recommendations were triggered by a Contact Lens issue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RULE_EVALUATION: The corresponding recommendations were triggered by a Contact Lens rule.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationSourceType
     */

    public RecommendationTrigger withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The source of the recommendation trigger.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ISSUE_DETECTION: The corresponding recommendations were triggered by a Contact Lens issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * RULE_EVALUATION: The corresponding recommendations were triggered by a Contact Lens rule.
     * </p>
     * </li>
     * </ul>
     * 
     * @param source
     *        The source of the recommendation trigger.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ISSUE_DETECTION: The corresponding recommendations were triggered by a Contact Lens issue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RULE_EVALUATION: The corresponding recommendations were triggered by a Contact Lens rule.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationSourceType
     */

    public RecommendationTrigger withSource(RecommendationSourceType source) {
        this.source = source.toString();
        return this;
    }

    /**
     * <p>
     * The type of recommendation trigger.
     * </p>
     * 
     * @param type
     *        The type of recommendation trigger.
     * @see RecommendationTriggerType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of recommendation trigger.
     * </p>
     * 
     * @return The type of recommendation trigger.
     * @see RecommendationTriggerType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of recommendation trigger.
     * </p>
     * 
     * @param type
     *        The type of recommendation trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationTriggerType
     */

    public RecommendationTrigger withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of recommendation trigger.
     * </p>
     * 
     * @param type
     *        The type of recommendation trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationTriggerType
     */

    public RecommendationTrigger withType(RecommendationTriggerType type) {
        this.type = type.toString();
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
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRecommendationIds() != null)
            sb.append("RecommendationIds: ").append(getRecommendationIds()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationTrigger == false)
            return false;
        RecommendationTrigger other = (RecommendationTrigger) obj;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRecommendationIds() == null ^ this.getRecommendationIds() == null)
            return false;
        if (other.getRecommendationIds() != null && other.getRecommendationIds().equals(this.getRecommendationIds()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRecommendationIds() == null) ? 0 : getRecommendationIds().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationTrigger clone() {
        try {
            return (RecommendationTrigger) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.RecommendationTriggerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
