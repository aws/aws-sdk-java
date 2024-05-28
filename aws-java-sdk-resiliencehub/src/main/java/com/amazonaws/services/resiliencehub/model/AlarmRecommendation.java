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
     * Application Component name for the CloudWatch alarm recommendation. This name is saved as the first item in the
     * <code>appComponentNames</code> list.
     * </p>
     */
    @Deprecated
    private String appComponentName;
    /**
     * <p>
     * List of Application Component names for the CloudWatch alarm recommendation.
     * </p>
     */
    private java.util.List<String> appComponentNames;
    /**
     * <p>
     * Description of the alarm recommendation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * List of CloudWatch alarm recommendations.
     * </p>
     */
    private java.util.List<RecommendationItem> items;
    /**
     * <p>
     * Name of the alarm recommendation.
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
     * Identifier of the alarm recommendation.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * Status of the recommended Amazon CloudWatch alarm.
     * </p>
     */
    private String recommendationStatus;
    /**
     * <p>
     * Reference identifier of the alarm recommendation.
     * </p>
     */
    private String referenceId;
    /**
     * <p>
     * Type of alarm recommendation.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Application Component name for the CloudWatch alarm recommendation. This name is saved as the first item in the
     * <code>appComponentNames</code> list.
     * </p>
     * 
     * @param appComponentName
     *        Application Component name for the CloudWatch alarm recommendation. This name is saved as the first item
     *        in the <code>appComponentNames</code> list.
     */
    @Deprecated
    public void setAppComponentName(String appComponentName) {
        this.appComponentName = appComponentName;
    }

    /**
     * <p>
     * Application Component name for the CloudWatch alarm recommendation. This name is saved as the first item in the
     * <code>appComponentNames</code> list.
     * </p>
     * 
     * @return Application Component name for the CloudWatch alarm recommendation. This name is saved as the first item
     *         in the <code>appComponentNames</code> list.
     */
    @Deprecated
    public String getAppComponentName() {
        return this.appComponentName;
    }

    /**
     * <p>
     * Application Component name for the CloudWatch alarm recommendation. This name is saved as the first item in the
     * <code>appComponentNames</code> list.
     * </p>
     * 
     * @param appComponentName
     *        Application Component name for the CloudWatch alarm recommendation. This name is saved as the first item
     *        in the <code>appComponentNames</code> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public AlarmRecommendation withAppComponentName(String appComponentName) {
        setAppComponentName(appComponentName);
        return this;
    }

    /**
     * <p>
     * List of Application Component names for the CloudWatch alarm recommendation.
     * </p>
     * 
     * @return List of Application Component names for the CloudWatch alarm recommendation.
     */

    public java.util.List<String> getAppComponentNames() {
        return appComponentNames;
    }

    /**
     * <p>
     * List of Application Component names for the CloudWatch alarm recommendation.
     * </p>
     * 
     * @param appComponentNames
     *        List of Application Component names for the CloudWatch alarm recommendation.
     */

    public void setAppComponentNames(java.util.Collection<String> appComponentNames) {
        if (appComponentNames == null) {
            this.appComponentNames = null;
            return;
        }

        this.appComponentNames = new java.util.ArrayList<String>(appComponentNames);
    }

    /**
     * <p>
     * List of Application Component names for the CloudWatch alarm recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppComponentNames(java.util.Collection)} or {@link #withAppComponentNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param appComponentNames
     *        List of Application Component names for the CloudWatch alarm recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmRecommendation withAppComponentNames(String... appComponentNames) {
        if (this.appComponentNames == null) {
            setAppComponentNames(new java.util.ArrayList<String>(appComponentNames.length));
        }
        for (String ele : appComponentNames) {
            this.appComponentNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of Application Component names for the CloudWatch alarm recommendation.
     * </p>
     * 
     * @param appComponentNames
     *        List of Application Component names for the CloudWatch alarm recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmRecommendation withAppComponentNames(java.util.Collection<String> appComponentNames) {
        setAppComponentNames(appComponentNames);
        return this;
    }

    /**
     * <p>
     * Description of the alarm recommendation.
     * </p>
     * 
     * @param description
     *        Description of the alarm recommendation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the alarm recommendation.
     * </p>
     * 
     * @return Description of the alarm recommendation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the alarm recommendation.
     * </p>
     * 
     * @param description
     *        Description of the alarm recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmRecommendation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * List of CloudWatch alarm recommendations.
     * </p>
     * 
     * @return List of CloudWatch alarm recommendations.
     */

    public java.util.List<RecommendationItem> getItems() {
        return items;
    }

    /**
     * <p>
     * List of CloudWatch alarm recommendations.
     * </p>
     * 
     * @param items
     *        List of CloudWatch alarm recommendations.
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
     * List of CloudWatch alarm recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        List of CloudWatch alarm recommendations.
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
     * List of CloudWatch alarm recommendations.
     * </p>
     * 
     * @param items
     *        List of CloudWatch alarm recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmRecommendation withItems(java.util.Collection<RecommendationItem> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * Name of the alarm recommendation.
     * </p>
     * 
     * @param name
     *        Name of the alarm recommendation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the alarm recommendation.
     * </p>
     * 
     * @return Name of the alarm recommendation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the alarm recommendation.
     * </p>
     * 
     * @param name
     *        Name of the alarm recommendation.
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
     * Identifier of the alarm recommendation.
     * </p>
     * 
     * @param recommendationId
     *        Identifier of the alarm recommendation.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * Identifier of the alarm recommendation.
     * </p>
     * 
     * @return Identifier of the alarm recommendation.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * Identifier of the alarm recommendation.
     * </p>
     * 
     * @param recommendationId
     *        Identifier of the alarm recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmRecommendation withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * Status of the recommended Amazon CloudWatch alarm.
     * </p>
     * 
     * @param recommendationStatus
     *        Status of the recommended Amazon CloudWatch alarm.
     * @see RecommendationStatus
     */

    public void setRecommendationStatus(String recommendationStatus) {
        this.recommendationStatus = recommendationStatus;
    }

    /**
     * <p>
     * Status of the recommended Amazon CloudWatch alarm.
     * </p>
     * 
     * @return Status of the recommended Amazon CloudWatch alarm.
     * @see RecommendationStatus
     */

    public String getRecommendationStatus() {
        return this.recommendationStatus;
    }

    /**
     * <p>
     * Status of the recommended Amazon CloudWatch alarm.
     * </p>
     * 
     * @param recommendationStatus
     *        Status of the recommended Amazon CloudWatch alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStatus
     */

    public AlarmRecommendation withRecommendationStatus(String recommendationStatus) {
        setRecommendationStatus(recommendationStatus);
        return this;
    }

    /**
     * <p>
     * Status of the recommended Amazon CloudWatch alarm.
     * </p>
     * 
     * @param recommendationStatus
     *        Status of the recommended Amazon CloudWatch alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStatus
     */

    public AlarmRecommendation withRecommendationStatus(RecommendationStatus recommendationStatus) {
        this.recommendationStatus = recommendationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Reference identifier of the alarm recommendation.
     * </p>
     * 
     * @param referenceId
     *        Reference identifier of the alarm recommendation.
     */

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * Reference identifier of the alarm recommendation.
     * </p>
     * 
     * @return Reference identifier of the alarm recommendation.
     */

    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * Reference identifier of the alarm recommendation.
     * </p>
     * 
     * @param referenceId
     *        Reference identifier of the alarm recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmRecommendation withReferenceId(String referenceId) {
        setReferenceId(referenceId);
        return this;
    }

    /**
     * <p>
     * Type of alarm recommendation.
     * </p>
     * 
     * @param type
     *        Type of alarm recommendation.
     * @see AlarmType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of alarm recommendation.
     * </p>
     * 
     * @return Type of alarm recommendation.
     * @see AlarmType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of alarm recommendation.
     * </p>
     * 
     * @param type
     *        Type of alarm recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmType
     */

    public AlarmRecommendation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of alarm recommendation.
     * </p>
     * 
     * @param type
     *        Type of alarm recommendation.
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
        if (getAppComponentNames() != null)
            sb.append("AppComponentNames: ").append(getAppComponentNames()).append(",");
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
        if (getRecommendationStatus() != null)
            sb.append("RecommendationStatus: ").append(getRecommendationStatus()).append(",");
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
        if (other.getAppComponentNames() == null ^ this.getAppComponentNames() == null)
            return false;
        if (other.getAppComponentNames() != null && other.getAppComponentNames().equals(this.getAppComponentNames()) == false)
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
        if (other.getRecommendationStatus() == null ^ this.getRecommendationStatus() == null)
            return false;
        if (other.getRecommendationStatus() != null && other.getRecommendationStatus().equals(this.getRecommendationStatus()) == false)
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
        hashCode = prime * hashCode + ((getAppComponentNames() == null) ? 0 : getAppComponentNames().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPrerequisite() == null) ? 0 : getPrerequisite().hashCode());
        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getRecommendationStatus() == null) ? 0 : getRecommendationStatus().hashCode());
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
