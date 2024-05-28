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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetTimeSeriesDataPoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTimeSeriesDataPointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon DataZone domain that houses the asset data point that you want to get.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The ID of the asset for which you want to get the data point.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The type of the asset for which you want to get the data point.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * The time series form that houses the data point that you want to get.
     * </p>
     */
    private TimeSeriesDataPointFormOutput form;
    /**
     * <p>
     * The name of the time series form that houses the data point that you want to get.
     * </p>
     */
    private String formName;

    /**
     * <p>
     * The ID of the Amazon DataZone domain that houses the asset data point that you want to get.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain that houses the asset data point that you want to get.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain that houses the asset data point that you want to get.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain that houses the asset data point that you want to get.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain that houses the asset data point that you want to get.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain that houses the asset data point that you want to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesDataPointResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The ID of the asset for which you want to get the data point.
     * </p>
     * 
     * @param entityId
     *        The ID of the asset for which you want to get the data point.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The ID of the asset for which you want to get the data point.
     * </p>
     * 
     * @return The ID of the asset for which you want to get the data point.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The ID of the asset for which you want to get the data point.
     * </p>
     * 
     * @param entityId
     *        The ID of the asset for which you want to get the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesDataPointResult withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The type of the asset for which you want to get the data point.
     * </p>
     * 
     * @param entityType
     *        The type of the asset for which you want to get the data point.
     * @see TimeSeriesEntityType
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The type of the asset for which you want to get the data point.
     * </p>
     * 
     * @return The type of the asset for which you want to get the data point.
     * @see TimeSeriesEntityType
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The type of the asset for which you want to get the data point.
     * </p>
     * 
     * @param entityType
     *        The type of the asset for which you want to get the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeSeriesEntityType
     */

    public GetTimeSeriesDataPointResult withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * The type of the asset for which you want to get the data point.
     * </p>
     * 
     * @param entityType
     *        The type of the asset for which you want to get the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeSeriesEntityType
     */

    public GetTimeSeriesDataPointResult withEntityType(TimeSeriesEntityType entityType) {
        this.entityType = entityType.toString();
        return this;
    }

    /**
     * <p>
     * The time series form that houses the data point that you want to get.
     * </p>
     * 
     * @param form
     *        The time series form that houses the data point that you want to get.
     */

    public void setForm(TimeSeriesDataPointFormOutput form) {
        this.form = form;
    }

    /**
     * <p>
     * The time series form that houses the data point that you want to get.
     * </p>
     * 
     * @return The time series form that houses the data point that you want to get.
     */

    public TimeSeriesDataPointFormOutput getForm() {
        return this.form;
    }

    /**
     * <p>
     * The time series form that houses the data point that you want to get.
     * </p>
     * 
     * @param form
     *        The time series form that houses the data point that you want to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesDataPointResult withForm(TimeSeriesDataPointFormOutput form) {
        setForm(form);
        return this;
    }

    /**
     * <p>
     * The name of the time series form that houses the data point that you want to get.
     * </p>
     * 
     * @param formName
     *        The name of the time series form that houses the data point that you want to get.
     */

    public void setFormName(String formName) {
        this.formName = formName;
    }

    /**
     * <p>
     * The name of the time series form that houses the data point that you want to get.
     * </p>
     * 
     * @return The name of the time series form that houses the data point that you want to get.
     */

    public String getFormName() {
        return this.formName;
    }

    /**
     * <p>
     * The name of the time series form that houses the data point that you want to get.
     * </p>
     * 
     * @param formName
     *        The name of the time series form that houses the data point that you want to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesDataPointResult withFormName(String formName) {
        setFormName(formName);
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
        if (getForm() != null)
            sb.append("Form: ").append(getForm()).append(",");
        if (getFormName() != null)
            sb.append("FormName: ").append(getFormName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTimeSeriesDataPointResult == false)
            return false;
        GetTimeSeriesDataPointResult other = (GetTimeSeriesDataPointResult) obj;
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
        if (other.getForm() == null ^ this.getForm() == null)
            return false;
        if (other.getForm() != null && other.getForm().equals(this.getForm()) == false)
            return false;
        if (other.getFormName() == null ^ this.getFormName() == null)
            return false;
        if (other.getFormName() != null && other.getFormName().equals(this.getFormName()) == false)
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
        hashCode = prime * hashCode + ((getForm() == null) ? 0 : getForm().hashCode());
        hashCode = prime * hashCode + ((getFormName() == null) ? 0 : getFormName().hashCode());
        return hashCode;
    }

    @Override
    public GetTimeSeriesDataPointResult clone() {
        try {
            return (GetTimeSeriesDataPointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
