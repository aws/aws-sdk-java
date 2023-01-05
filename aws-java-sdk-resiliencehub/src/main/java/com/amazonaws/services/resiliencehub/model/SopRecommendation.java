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
 * Defines a standard operating procedure (SOP) recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/SopRecommendation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SopRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application component name.
     * </p>
     */
    private String appComponentName;
    /**
     * <p>
     * The description of the SOP recommendation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The recommendation items.
     * </p>
     */
    private java.util.List<RecommendationItem> items;
    /**
     * <p>
     * The name of the SOP recommendation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The prerequisite for the SOP recommendation.
     * </p>
     */
    private String prerequisite;
    /**
     * <p>
     * Identifier for the SOP recommendation.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * The reference identifier for the SOP recommendation.
     * </p>
     */
    private String referenceId;
    /**
     * <p>
     * The service type.
     * </p>
     */
    private String serviceType;

    /**
     * <p>
     * The application component name.
     * </p>
     * 
     * @param appComponentName
     *        The application component name.
     */

    public void setAppComponentName(String appComponentName) {
        this.appComponentName = appComponentName;
    }

    /**
     * <p>
     * The application component name.
     * </p>
     * 
     * @return The application component name.
     */

    public String getAppComponentName() {
        return this.appComponentName;
    }

    /**
     * <p>
     * The application component name.
     * </p>
     * 
     * @param appComponentName
     *        The application component name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SopRecommendation withAppComponentName(String appComponentName) {
        setAppComponentName(appComponentName);
        return this;
    }

    /**
     * <p>
     * The description of the SOP recommendation.
     * </p>
     * 
     * @param description
     *        The description of the SOP recommendation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the SOP recommendation.
     * </p>
     * 
     * @return The description of the SOP recommendation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the SOP recommendation.
     * </p>
     * 
     * @param description
     *        The description of the SOP recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SopRecommendation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The recommendation items.
     * </p>
     * 
     * @return The recommendation items.
     */

    public java.util.List<RecommendationItem> getItems() {
        return items;
    }

    /**
     * <p>
     * The recommendation items.
     * </p>
     * 
     * @param items
     *        The recommendation items.
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
     * The recommendation items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The recommendation items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SopRecommendation withItems(RecommendationItem... items) {
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
     * The recommendation items.
     * </p>
     * 
     * @param items
     *        The recommendation items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SopRecommendation withItems(java.util.Collection<RecommendationItem> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * The name of the SOP recommendation.
     * </p>
     * 
     * @param name
     *        The name of the SOP recommendation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SOP recommendation.
     * </p>
     * 
     * @return The name of the SOP recommendation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the SOP recommendation.
     * </p>
     * 
     * @param name
     *        The name of the SOP recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SopRecommendation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The prerequisite for the SOP recommendation.
     * </p>
     * 
     * @param prerequisite
     *        The prerequisite for the SOP recommendation.
     */

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    /**
     * <p>
     * The prerequisite for the SOP recommendation.
     * </p>
     * 
     * @return The prerequisite for the SOP recommendation.
     */

    public String getPrerequisite() {
        return this.prerequisite;
    }

    /**
     * <p>
     * The prerequisite for the SOP recommendation.
     * </p>
     * 
     * @param prerequisite
     *        The prerequisite for the SOP recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SopRecommendation withPrerequisite(String prerequisite) {
        setPrerequisite(prerequisite);
        return this;
    }

    /**
     * <p>
     * Identifier for the SOP recommendation.
     * </p>
     * 
     * @param recommendationId
     *        Identifier for the SOP recommendation.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * Identifier for the SOP recommendation.
     * </p>
     * 
     * @return Identifier for the SOP recommendation.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * Identifier for the SOP recommendation.
     * </p>
     * 
     * @param recommendationId
     *        Identifier for the SOP recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SopRecommendation withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * The reference identifier for the SOP recommendation.
     * </p>
     * 
     * @param referenceId
     *        The reference identifier for the SOP recommendation.
     */

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * The reference identifier for the SOP recommendation.
     * </p>
     * 
     * @return The reference identifier for the SOP recommendation.
     */

    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * The reference identifier for the SOP recommendation.
     * </p>
     * 
     * @param referenceId
     *        The reference identifier for the SOP recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SopRecommendation withReferenceId(String referenceId) {
        setReferenceId(referenceId);
        return this;
    }

    /**
     * <p>
     * The service type.
     * </p>
     * 
     * @param serviceType
     *        The service type.
     * @see SopServiceType
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * The service type.
     * </p>
     * 
     * @return The service type.
     * @see SopServiceType
     */

    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * <p>
     * The service type.
     * </p>
     * 
     * @param serviceType
     *        The service type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SopServiceType
     */

    public SopRecommendation withServiceType(String serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * The service type.
     * </p>
     * 
     * @param serviceType
     *        The service type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SopServiceType
     */

    public SopRecommendation withServiceType(SopServiceType serviceType) {
        this.serviceType = serviceType.toString();
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
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SopRecommendation == false)
            return false;
        SopRecommendation other = (SopRecommendation) obj;
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
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
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
        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        return hashCode;
    }

    @Override
    public SopRecommendation clone() {
        try {
            return (SopRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.SopRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
