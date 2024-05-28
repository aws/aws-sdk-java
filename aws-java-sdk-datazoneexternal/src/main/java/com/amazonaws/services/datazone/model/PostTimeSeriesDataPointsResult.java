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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/PostTimeSeriesDataPoints" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostTimeSeriesDataPointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which you want to post time series data points.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The ID of the asset for which you want to post time series data points.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The type of the asset for which you want to post data points.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * The forms that contain the data points that you have posted.
     * </p>
     */
    private java.util.List<TimeSeriesDataPointFormOutput> forms;

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which you want to post time series data points.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which you want to post time series data points.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which you want to post time series data points.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which you want to post time series data points.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which you want to post time series data points.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which you want to post time series data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTimeSeriesDataPointsResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The ID of the asset for which you want to post time series data points.
     * </p>
     * 
     * @param entityId
     *        The ID of the asset for which you want to post time series data points.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The ID of the asset for which you want to post time series data points.
     * </p>
     * 
     * @return The ID of the asset for which you want to post time series data points.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The ID of the asset for which you want to post time series data points.
     * </p>
     * 
     * @param entityId
     *        The ID of the asset for which you want to post time series data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTimeSeriesDataPointsResult withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The type of the asset for which you want to post data points.
     * </p>
     * 
     * @param entityType
     *        The type of the asset for which you want to post data points.
     * @see TimeSeriesEntityType
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The type of the asset for which you want to post data points.
     * </p>
     * 
     * @return The type of the asset for which you want to post data points.
     * @see TimeSeriesEntityType
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The type of the asset for which you want to post data points.
     * </p>
     * 
     * @param entityType
     *        The type of the asset for which you want to post data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeSeriesEntityType
     */

    public PostTimeSeriesDataPointsResult withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * The type of the asset for which you want to post data points.
     * </p>
     * 
     * @param entityType
     *        The type of the asset for which you want to post data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeSeriesEntityType
     */

    public PostTimeSeriesDataPointsResult withEntityType(TimeSeriesEntityType entityType) {
        this.entityType = entityType.toString();
        return this;
    }

    /**
     * <p>
     * The forms that contain the data points that you have posted.
     * </p>
     * 
     * @return The forms that contain the data points that you have posted.
     */

    public java.util.List<TimeSeriesDataPointFormOutput> getForms() {
        return forms;
    }

    /**
     * <p>
     * The forms that contain the data points that you have posted.
     * </p>
     * 
     * @param forms
     *        The forms that contain the data points that you have posted.
     */

    public void setForms(java.util.Collection<TimeSeriesDataPointFormOutput> forms) {
        if (forms == null) {
            this.forms = null;
            return;
        }

        this.forms = new java.util.ArrayList<TimeSeriesDataPointFormOutput>(forms);
    }

    /**
     * <p>
     * The forms that contain the data points that you have posted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForms(java.util.Collection)} or {@link #withForms(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param forms
     *        The forms that contain the data points that you have posted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTimeSeriesDataPointsResult withForms(TimeSeriesDataPointFormOutput... forms) {
        if (this.forms == null) {
            setForms(new java.util.ArrayList<TimeSeriesDataPointFormOutput>(forms.length));
        }
        for (TimeSeriesDataPointFormOutput ele : forms) {
            this.forms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The forms that contain the data points that you have posted.
     * </p>
     * 
     * @param forms
     *        The forms that contain the data points that you have posted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTimeSeriesDataPointsResult withForms(java.util.Collection<TimeSeriesDataPointFormOutput> forms) {
        setForms(forms);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
        if (getForms() != null)
            sb.append("Forms: ").append(getForms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostTimeSeriesDataPointsResult == false)
            return false;
        PostTimeSeriesDataPointsResult other = (PostTimeSeriesDataPointsResult) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getForms() == null ^ this.getForms() == null)
            return false;
        if (other.getForms() != null && other.getForms().equals(this.getForms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getForms() == null) ? 0 : getForms().hashCode());
        return hashCode;
    }

    @Override
    public PostTimeSeriesDataPointsResult clone() {
        try {
            return (PostTimeSeriesDataPointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
