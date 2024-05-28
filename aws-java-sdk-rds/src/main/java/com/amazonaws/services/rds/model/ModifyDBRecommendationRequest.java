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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBRecommendation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBRecommendationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the recommendation to update.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * The language of the modified recommendation.
     * </p>
     */
    private String locale;
    /**
     * <p>
     * The recommendation status to update.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * active
     * </p>
     * </li>
     * <li>
     * <p>
     * dismissed
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The list of recommended action status to update. You can update multiple recommended actions at one time.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RecommendedActionUpdate> recommendedActionUpdates;

    /**
     * <p>
     * The identifier of the recommendation to update.
     * </p>
     * 
     * @param recommendationId
     *        The identifier of the recommendation to update.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The identifier of the recommendation to update.
     * </p>
     * 
     * @return The identifier of the recommendation to update.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The identifier of the recommendation to update.
     * </p>
     * 
     * @param recommendationId
     *        The identifier of the recommendation to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBRecommendationRequest withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * The language of the modified recommendation.
     * </p>
     * 
     * @param locale
     *        The language of the modified recommendation.
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The language of the modified recommendation.
     * </p>
     * 
     * @return The language of the modified recommendation.
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * The language of the modified recommendation.
     * </p>
     * 
     * @param locale
     *        The language of the modified recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBRecommendationRequest withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * The recommendation status to update.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * active
     * </p>
     * </li>
     * <li>
     * <p>
     * dismissed
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The recommendation status to update.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        active
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        dismissed
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The recommendation status to update.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * active
     * </p>
     * </li>
     * <li>
     * <p>
     * dismissed
     * </p>
     * </li>
     * </ul>
     * 
     * @return The recommendation status to update.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         active
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         dismissed
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The recommendation status to update.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * active
     * </p>
     * </li>
     * <li>
     * <p>
     * dismissed
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The recommendation status to update.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        active
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        dismissed
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBRecommendationRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The list of recommended action status to update. You can update multiple recommended actions at one time.
     * </p>
     * 
     * @return The list of recommended action status to update. You can update multiple recommended actions at one time.
     */

    public java.util.List<RecommendedActionUpdate> getRecommendedActionUpdates() {
        if (recommendedActionUpdates == null) {
            recommendedActionUpdates = new com.amazonaws.internal.SdkInternalList<RecommendedActionUpdate>();
        }
        return recommendedActionUpdates;
    }

    /**
     * <p>
     * The list of recommended action status to update. You can update multiple recommended actions at one time.
     * </p>
     * 
     * @param recommendedActionUpdates
     *        The list of recommended action status to update. You can update multiple recommended actions at one time.
     */

    public void setRecommendedActionUpdates(java.util.Collection<RecommendedActionUpdate> recommendedActionUpdates) {
        if (recommendedActionUpdates == null) {
            this.recommendedActionUpdates = null;
            return;
        }

        this.recommendedActionUpdates = new com.amazonaws.internal.SdkInternalList<RecommendedActionUpdate>(recommendedActionUpdates);
    }

    /**
     * <p>
     * The list of recommended action status to update. You can update multiple recommended actions at one time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendedActionUpdates(java.util.Collection)} or
     * {@link #withRecommendedActionUpdates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recommendedActionUpdates
     *        The list of recommended action status to update. You can update multiple recommended actions at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBRecommendationRequest withRecommendedActionUpdates(RecommendedActionUpdate... recommendedActionUpdates) {
        if (this.recommendedActionUpdates == null) {
            setRecommendedActionUpdates(new com.amazonaws.internal.SdkInternalList<RecommendedActionUpdate>(recommendedActionUpdates.length));
        }
        for (RecommendedActionUpdate ele : recommendedActionUpdates) {
            this.recommendedActionUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of recommended action status to update. You can update multiple recommended actions at one time.
     * </p>
     * 
     * @param recommendedActionUpdates
     *        The list of recommended action status to update. You can update multiple recommended actions at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBRecommendationRequest withRecommendedActionUpdates(java.util.Collection<RecommendedActionUpdate> recommendedActionUpdates) {
        setRecommendedActionUpdates(recommendedActionUpdates);
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
        if (getRecommendationId() != null)
            sb.append("RecommendationId: ").append(getRecommendationId()).append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRecommendedActionUpdates() != null)
            sb.append("RecommendedActionUpdates: ").append(getRecommendedActionUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBRecommendationRequest == false)
            return false;
        ModifyDBRecommendationRequest other = (ModifyDBRecommendationRequest) obj;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRecommendedActionUpdates() == null ^ this.getRecommendedActionUpdates() == null)
            return false;
        if (other.getRecommendedActionUpdates() != null && other.getRecommendedActionUpdates().equals(this.getRecommendedActionUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRecommendedActionUpdates() == null) ? 0 : getRecommendedActionUpdates().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBRecommendationRequest clone() {
        return (ModifyDBRecommendationRequest) super.clone();
    }

}
