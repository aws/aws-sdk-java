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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a strategy recommendation for an application component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ApplicationComponentStrategy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationComponentStrategy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Set to true if the recommendation is set as preferred.
     * </p>
     */
    private Boolean isPreferred;
    /**
     * <p>
     * Strategy recommendation for the application component.
     * </p>
     */
    private RecommendationSet recommendation;
    /**
     * <p>
     * The recommendation status of a strategy for an application component.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Set to true if the recommendation is set as preferred.
     * </p>
     * 
     * @param isPreferred
     *        Set to true if the recommendation is set as preferred.
     */

    public void setIsPreferred(Boolean isPreferred) {
        this.isPreferred = isPreferred;
    }

    /**
     * <p>
     * Set to true if the recommendation is set as preferred.
     * </p>
     * 
     * @return Set to true if the recommendation is set as preferred.
     */

    public Boolean getIsPreferred() {
        return this.isPreferred;
    }

    /**
     * <p>
     * Set to true if the recommendation is set as preferred.
     * </p>
     * 
     * @param isPreferred
     *        Set to true if the recommendation is set as preferred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentStrategy withIsPreferred(Boolean isPreferred) {
        setIsPreferred(isPreferred);
        return this;
    }

    /**
     * <p>
     * Set to true if the recommendation is set as preferred.
     * </p>
     * 
     * @return Set to true if the recommendation is set as preferred.
     */

    public Boolean isPreferred() {
        return this.isPreferred;
    }

    /**
     * <p>
     * Strategy recommendation for the application component.
     * </p>
     * 
     * @param recommendation
     *        Strategy recommendation for the application component.
     */

    public void setRecommendation(RecommendationSet recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * <p>
     * Strategy recommendation for the application component.
     * </p>
     * 
     * @return Strategy recommendation for the application component.
     */

    public RecommendationSet getRecommendation() {
        return this.recommendation;
    }

    /**
     * <p>
     * Strategy recommendation for the application component.
     * </p>
     * 
     * @param recommendation
     *        Strategy recommendation for the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentStrategy withRecommendation(RecommendationSet recommendation) {
        setRecommendation(recommendation);
        return this;
    }

    /**
     * <p>
     * The recommendation status of a strategy for an application component.
     * </p>
     * 
     * @param status
     *        The recommendation status of a strategy for an application component.
     * @see StrategyRecommendation
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The recommendation status of a strategy for an application component.
     * </p>
     * 
     * @return The recommendation status of a strategy for an application component.
     * @see StrategyRecommendation
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The recommendation status of a strategy for an application component.
     * </p>
     * 
     * @param status
     *        The recommendation status of a strategy for an application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StrategyRecommendation
     */

    public ApplicationComponentStrategy withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The recommendation status of a strategy for an application component.
     * </p>
     * 
     * @param status
     *        The recommendation status of a strategy for an application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StrategyRecommendation
     */

    public ApplicationComponentStrategy withStatus(StrategyRecommendation status) {
        this.status = status.toString();
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
        if (getIsPreferred() != null)
            sb.append("IsPreferred: ").append(getIsPreferred()).append(",");
        if (getRecommendation() != null)
            sb.append("Recommendation: ").append(getRecommendation()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationComponentStrategy == false)
            return false;
        ApplicationComponentStrategy other = (ApplicationComponentStrategy) obj;
        if (other.getIsPreferred() == null ^ this.getIsPreferred() == null)
            return false;
        if (other.getIsPreferred() != null && other.getIsPreferred().equals(this.getIsPreferred()) == false)
            return false;
        if (other.getRecommendation() == null ^ this.getRecommendation() == null)
            return false;
        if (other.getRecommendation() != null && other.getRecommendation().equals(this.getRecommendation()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsPreferred() == null) ? 0 : getIsPreferred().hashCode());
        hashCode = prime * hashCode + ((getRecommendation() == null) ? 0 : getRecommendation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationComponentStrategy clone() {
        try {
            return (ApplicationComponentStrategy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ApplicationComponentStrategyMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
