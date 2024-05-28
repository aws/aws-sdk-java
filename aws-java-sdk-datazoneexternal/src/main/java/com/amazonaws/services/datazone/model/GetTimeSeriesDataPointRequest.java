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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetTimeSeriesDataPoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTimeSeriesDataPointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon DataZone domain that houses the asset for which you want to get the data point.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The ID of the asset for which you want to get the data point.
     * </p>
     */
    private String entityIdentifier;
    /**
     * <p>
     * The type of the asset for which you want to get the data point.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * The name of the time series form that houses the data point that you want to get.
     * </p>
     */
    private String formName;
    /**
     * <p>
     * The ID of the data point that you want to get.
     * </p>
     */
    private String identifier;

    /**
     * <p>
     * The ID of the Amazon DataZone domain that houses the asset for which you want to get the data point.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain that houses the asset for which you want to get the data point.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain that houses the asset for which you want to get the data point.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain that houses the asset for which you want to get the data point.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain that houses the asset for which you want to get the data point.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain that houses the asset for which you want to get the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesDataPointRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the asset for which you want to get the data point.
     * </p>
     * 
     * @param entityIdentifier
     *        The ID of the asset for which you want to get the data point.
     */

    public void setEntityIdentifier(String entityIdentifier) {
        this.entityIdentifier = entityIdentifier;
    }

    /**
     * <p>
     * The ID of the asset for which you want to get the data point.
     * </p>
     * 
     * @return The ID of the asset for which you want to get the data point.
     */

    public String getEntityIdentifier() {
        return this.entityIdentifier;
    }

    /**
     * <p>
     * The ID of the asset for which you want to get the data point.
     * </p>
     * 
     * @param entityIdentifier
     *        The ID of the asset for which you want to get the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesDataPointRequest withEntityIdentifier(String entityIdentifier) {
        setEntityIdentifier(entityIdentifier);
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

    public GetTimeSeriesDataPointRequest withEntityType(String entityType) {
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

    public GetTimeSeriesDataPointRequest withEntityType(TimeSeriesEntityType entityType) {
        this.entityType = entityType.toString();
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

    public GetTimeSeriesDataPointRequest withFormName(String formName) {
        setFormName(formName);
        return this;
    }

    /**
     * <p>
     * The ID of the data point that you want to get.
     * </p>
     * 
     * @param identifier
     *        The ID of the data point that you want to get.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The ID of the data point that you want to get.
     * </p>
     * 
     * @return The ID of the data point that you want to get.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The ID of the data point that you want to get.
     * </p>
     * 
     * @param identifier
     *        The ID of the data point that you want to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesDataPointRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEntityIdentifier() != null)
            sb.append("EntityIdentifier: ").append(getEntityIdentifier()).append(",");
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
        if (getFormName() != null)
            sb.append("FormName: ").append(getFormName()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTimeSeriesDataPointRequest == false)
            return false;
        GetTimeSeriesDataPointRequest other = (GetTimeSeriesDataPointRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getEntityIdentifier() == null ^ this.getEntityIdentifier() == null)
            return false;
        if (other.getEntityIdentifier() != null && other.getEntityIdentifier().equals(this.getEntityIdentifier()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getFormName() == null ^ this.getFormName() == null)
            return false;
        if (other.getFormName() != null && other.getFormName().equals(this.getFormName()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEntityIdentifier() == null) ? 0 : getEntityIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getFormName() == null) ? 0 : getFormName().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetTimeSeriesDataPointRequest clone() {
        return (GetTimeSeriesDataPointRequest) super.clone();
    }

}
