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
 * Defines recommendations for a Resilience Hub application component, returned as an object. This object contains
 * component names, configuration recommendations, and recommendation statuses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ComponentRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the application component.
     * </p>
     */
    private String appComponentName;
    /**
     * <p>
     * The list of recommendations.
     * </p>
     */
    private java.util.List<ConfigRecommendation> configRecommendations;
    /**
     * <p>
     * The recommendation status.
     * </p>
     */
    private String recommendationStatus;

    /**
     * <p>
     * The name of the application component.
     * </p>
     * 
     * @param appComponentName
     *        The name of the application component.
     */

    public void setAppComponentName(String appComponentName) {
        this.appComponentName = appComponentName;
    }

    /**
     * <p>
     * The name of the application component.
     * </p>
     * 
     * @return The name of the application component.
     */

    public String getAppComponentName() {
        return this.appComponentName;
    }

    /**
     * <p>
     * The name of the application component.
     * </p>
     * 
     * @param appComponentName
     *        The name of the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentRecommendation withAppComponentName(String appComponentName) {
        setAppComponentName(appComponentName);
        return this;
    }

    /**
     * <p>
     * The list of recommendations.
     * </p>
     * 
     * @return The list of recommendations.
     */

    public java.util.List<ConfigRecommendation> getConfigRecommendations() {
        return configRecommendations;
    }

    /**
     * <p>
     * The list of recommendations.
     * </p>
     * 
     * @param configRecommendations
     *        The list of recommendations.
     */

    public void setConfigRecommendations(java.util.Collection<ConfigRecommendation> configRecommendations) {
        if (configRecommendations == null) {
            this.configRecommendations = null;
            return;
        }

        this.configRecommendations = new java.util.ArrayList<ConfigRecommendation>(configRecommendations);
    }

    /**
     * <p>
     * The list of recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigRecommendations(java.util.Collection)} or
     * {@link #withConfigRecommendations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configRecommendations
     *        The list of recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentRecommendation withConfigRecommendations(ConfigRecommendation... configRecommendations) {
        if (this.configRecommendations == null) {
            setConfigRecommendations(new java.util.ArrayList<ConfigRecommendation>(configRecommendations.length));
        }
        for (ConfigRecommendation ele : configRecommendations) {
            this.configRecommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of recommendations.
     * </p>
     * 
     * @param configRecommendations
     *        The list of recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentRecommendation withConfigRecommendations(java.util.Collection<ConfigRecommendation> configRecommendations) {
        setConfigRecommendations(configRecommendations);
        return this;
    }

    /**
     * <p>
     * The recommendation status.
     * </p>
     * 
     * @param recommendationStatus
     *        The recommendation status.
     * @see RecommendationComplianceStatus
     */

    public void setRecommendationStatus(String recommendationStatus) {
        this.recommendationStatus = recommendationStatus;
    }

    /**
     * <p>
     * The recommendation status.
     * </p>
     * 
     * @return The recommendation status.
     * @see RecommendationComplianceStatus
     */

    public String getRecommendationStatus() {
        return this.recommendationStatus;
    }

    /**
     * <p>
     * The recommendation status.
     * </p>
     * 
     * @param recommendationStatus
     *        The recommendation status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationComplianceStatus
     */

    public ComponentRecommendation withRecommendationStatus(String recommendationStatus) {
        setRecommendationStatus(recommendationStatus);
        return this;
    }

    /**
     * <p>
     * The recommendation status.
     * </p>
     * 
     * @param recommendationStatus
     *        The recommendation status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationComplianceStatus
     */

    public ComponentRecommendation withRecommendationStatus(RecommendationComplianceStatus recommendationStatus) {
        this.recommendationStatus = recommendationStatus.toString();
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
        if (getConfigRecommendations() != null)
            sb.append("ConfigRecommendations: ").append(getConfigRecommendations()).append(",");
        if (getRecommendationStatus() != null)
            sb.append("RecommendationStatus: ").append(getRecommendationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentRecommendation == false)
            return false;
        ComponentRecommendation other = (ComponentRecommendation) obj;
        if (other.getAppComponentName() == null ^ this.getAppComponentName() == null)
            return false;
        if (other.getAppComponentName() != null && other.getAppComponentName().equals(this.getAppComponentName()) == false)
            return false;
        if (other.getConfigRecommendations() == null ^ this.getConfigRecommendations() == null)
            return false;
        if (other.getConfigRecommendations() != null && other.getConfigRecommendations().equals(this.getConfigRecommendations()) == false)
            return false;
        if (other.getRecommendationStatus() == null ^ this.getRecommendationStatus() == null)
            return false;
        if (other.getRecommendationStatus() != null && other.getRecommendationStatus().equals(this.getRecommendationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppComponentName() == null) ? 0 : getAppComponentName().hashCode());
        hashCode = prime * hashCode + ((getConfigRecommendations() == null) ? 0 : getConfigRecommendations().hashCode());
        hashCode = prime * hashCode + ((getRecommendationStatus() == null) ? 0 : getRecommendationStatus().hashCode());
        return hashCode;
    }

    @Override
    public ComponentRecommendation clone() {
        try {
            return (ComponentRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.ComponentRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
