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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a recommendation for a CloudWatch alarm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/AlarmRecommendation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application component for the CloudWatch alarm recommendation.
     * </p>
     */
    private String appComponentName;
    /**
     * <p>
     * The description of the recommendation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The list of CloudWatch alarm recommendations.
     * </p>
     */
    private java.util.List<RecommendationItem> items;
    /**
     * <p>
     * The name of the alarm recommendation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The prerequisite for the alarm recommendation.
     * </p>
     */
    private String prerequisite;
    /**
     * <p>
     * The identifier of the alarm recommendation.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * The reference identifier of the alarm recommendation.
     * </p>
     */
    private String referenceId;
    /**
     * <p>
     * The type of alarm recommendation.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The application component for the CloudWatch alarm recommendation.
     * </p>
     * 
     * @param appComponentName
     *        The application component for the CloudWatch alarm recommendation.
     */

    public void setAppComponentName(String appComponentName) {
        this.appComponentName = appComponentName;
    }

    /**
     * <p>
     * The application component for the CloudWatch alarm recommendation.
     * </p>
     * 
     * @return The application component for the CloudWatch alarm recommendation.
     */

    public String getAppComponentName() {
        return this.appComponentName;
    }

    /**
     * <p>
     * The application component for the CloudWatch alarm recommendation.
     * </p>
     * 
     * @param appComponentName
     *        The application component for the CloudWatch alarm recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmRecommendation withAppComponentName(String appComponentName) {
        setAppComponentName(appComponentName);
        return this;
    }

    /**
     * <p>
     * The description of the recommendation.
     * </p>
     * 
     * @param description
     *        The description of the recommendation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the recommendation.
     * </p>
     * 
     * @return The description of the recommendation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the recommendation.
     * </p>
     * 
     * @param description
     *        The description of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmRecommendation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The list of CloudWatch alarm recommendations.
     * </p>
     * 
     * @return The list of CloudWatch alarm recommendations.
     */

    public java.util.List<RecommendationItem> getItems() {
        return items;
    }

    /**
     * <p>
     * The list of CloudWatch alarm recommendations.
     * </p>
     * 
     * @param items
     *        The list of CloudWatch alarm recommendations.
     */

    public void setItems(java.util.Collection<RecommendationItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<RecommendationItem>(items);
    }

    /**
     * <p>
     * The list of CloudWatch alarm recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The list of CloudWatch alarm recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmRecommendation withItems(RecommendationItem... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<RecommendationItem>(items.length));
        }
        for (RecommendationItem ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of CloudWatch alarm recommendations.
     * </p>
     * 
     * @param items
     *        The list of CloudWatch alarm recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmRecommendation withItems(java.util.Collection<RecommendationItem> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * The name of the alarm recommendation.
     * </p>
     * 
     * @param name
     *        The name of the alarm recommendation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the alarm recommendation.
     * </p>
     * 
     * @return The name of the alarm recommendation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the alarm recommendation.
     * </p>
     * 
     * @param name
     *        The name of the alarm recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmRecommendation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The prerequisite for the alarm recommendation.
     * </p>
     * 
     * @param prerequisite
     *        The prerequisite for the alarm recommendation.
     */

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    /**
     * <p>
     * The prerequisite for the alarm recommendation.
     * </p>
     * 
     * @return The prerequisite for the alarm recommendation.
     */

    public String getPrerequisite() {
        return this.prerequisite;
    }

    /**
     * <p>
     * The prerequisite for the alarm recommendation.
     * </p>
     * 
     * @param prerequisite
     *        The prerequisite for the alarm recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmRecommendation withPrerequisite(String prerequisite) {
        setPrerequisite(prerequisite);
        return this;
    }

    /**
     * <p>
     * The identifier of the alarm recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The identifier of the alarm recommendation.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The identifier of the alarm recommendation.
     * </p>
     * 
     * @return The identifier of the alarm recommendation.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The identifier of the alarm recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The identifier of the alarm recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmRecommendation withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * The reference identifier of the alarm recommendation.
     * </p>
     * 
     * @param referenceId
     *        The reference identifier of the alarm recommendation.
     */

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * The reference identifier of the alarm recommendation.
     * </p>
     * 
     * @return The reference identifier of the alarm recommendation.
     */

    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * The reference identifier of the alarm recommendation.
     * </p>
     * 
     * @param referenceId
     *        The reference identifier of the alarm recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmRecommendation withReferenceId(String referenceId) {
        setReferenceId(referenceId);
        return this;
    }

    /**
     * <p>
     * The type of alarm recommendation.
     * </p>
     * 
     * @param type
     *        The type of alarm recommendation.
     * @see AlarmType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of alarm recommendation.
     * </p>
     * 
     * @return The type of alarm recommendation.
     * @see AlarmType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of alarm recommendation.
     * </p>
     * 
     * @param type
     *        The type of alarm recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmType
     */

    public AlarmRecommendation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of alarm recommendation.
     * </p>
     * 
     * @param type
     *        The type of alarm recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmType
     */

    public AlarmRecommendation withType(AlarmType type) {
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
        if (getAppComponentName() != null)
            sb.append("AppComponentName: ").append(getAppComponentName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPrerequisite() != null)
            sb.append("Prerequisite: ").append(getPrerequisite()).append(",");
        if (getRecommendationId() != null)
            sb.append("RecommendationId: ").append(getRecommendationId()).append(",");
        if (getReferenceId() != null)
            sb.append("ReferenceId: ").append(getReferenceId()).append(",");
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

        if (obj instanceof AlarmRecommendation == false)
            return false;
        AlarmRecommendation other = (AlarmRecommendation) obj;
        if (other.getAppComponentName() == null ^ this.getAppComponentName() == null)
            return false;
        if (other.getAppComponentName() != null && other.getAppComponentName().equals(this.getAppComponentName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPrerequisite() == null ^ this.getPrerequisite() == null)
            return false;
        if (other.getPrerequisite() != null && other.getPrerequisite().equals(this.getPrerequisite()) == false)
            return false;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
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

        hashCode = prime * hashCode + ((getAppComponentName() == null) ? 0 : getAppComponentName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPrerequisite() == null) ? 0 : getPrerequisite().hashCode());
        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AlarmRecommendation clone() {
        try {
            return (AlarmRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.AlarmRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
