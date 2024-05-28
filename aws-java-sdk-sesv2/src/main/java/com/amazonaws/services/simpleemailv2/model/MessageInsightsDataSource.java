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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains filters applied when performing the Message Insights export.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/MessageInsightsDataSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageInsightsDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents the start date for the export interval as a timestamp. The start date is inclusive.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * Represents the end date for the export interval as a timestamp. The end date is inclusive.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * Filters for results to be included in the export file.
     * </p>
     */
    private MessageInsightsFilters include;
    /**
     * <p>
     * Filters for results to be excluded from the export file.
     * </p>
     */
    private MessageInsightsFilters exclude;
    /**
     * <p>
     * The maximum number of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Represents the start date for the export interval as a timestamp. The start date is inclusive.
     * </p>
     * 
     * @param startDate
     *        Represents the start date for the export interval as a timestamp. The start date is inclusive.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * Represents the start date for the export interval as a timestamp. The start date is inclusive.
     * </p>
     * 
     * @return Represents the start date for the export interval as a timestamp. The start date is inclusive.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * Represents the start date for the export interval as a timestamp. The start date is inclusive.
     * </p>
     * 
     * @param startDate
     *        Represents the start date for the export interval as a timestamp. The start date is inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageInsightsDataSource withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * Represents the end date for the export interval as a timestamp. The end date is inclusive.
     * </p>
     * 
     * @param endDate
     *        Represents the end date for the export interval as a timestamp. The end date is inclusive.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * Represents the end date for the export interval as a timestamp. The end date is inclusive.
     * </p>
     * 
     * @return Represents the end date for the export interval as a timestamp. The end date is inclusive.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * Represents the end date for the export interval as a timestamp. The end date is inclusive.
     * </p>
     * 
     * @param endDate
     *        Represents the end date for the export interval as a timestamp. The end date is inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageInsightsDataSource withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * Filters for results to be included in the export file.
     * </p>
     * 
     * @param include
     *        Filters for results to be included in the export file.
     */

    public void setInclude(MessageInsightsFilters include) {
        this.include = include;
    }

    /**
     * <p>
     * Filters for results to be included in the export file.
     * </p>
     * 
     * @return Filters for results to be included in the export file.
     */

    public MessageInsightsFilters getInclude() {
        return this.include;
    }

    /**
     * <p>
     * Filters for results to be included in the export file.
     * </p>
     * 
     * @param include
     *        Filters for results to be included in the export file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageInsightsDataSource withInclude(MessageInsightsFilters include) {
        setInclude(include);
        return this;
    }

    /**
     * <p>
     * Filters for results to be excluded from the export file.
     * </p>
     * 
     * @param exclude
     *        Filters for results to be excluded from the export file.
     */

    public void setExclude(MessageInsightsFilters exclude) {
        this.exclude = exclude;
    }

    /**
     * <p>
     * Filters for results to be excluded from the export file.
     * </p>
     * 
     * @return Filters for results to be excluded from the export file.
     */

    public MessageInsightsFilters getExclude() {
        return this.exclude;
    }

    /**
     * <p>
     * Filters for results to be excluded from the export file.
     * </p>
     * 
     * @param exclude
     *        Filters for results to be excluded from the export file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageInsightsDataSource withExclude(MessageInsightsFilters exclude) {
        setExclude(exclude);
        return this;
    }

    /**
     * <p>
     * The maximum number of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results.
     * </p>
     * 
     * @return The maximum number of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageInsightsDataSource withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getInclude() != null)
            sb.append("Include: ").append(getInclude()).append(",");
        if (getExclude() != null)
            sb.append("Exclude: ").append(getExclude()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageInsightsDataSource == false)
            return false;
        MessageInsightsDataSource other = (MessageInsightsDataSource) obj;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        if (other.getExclude() == null ^ this.getExclude() == null)
            return false;
        if (other.getExclude() != null && other.getExclude().equals(this.getExclude()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        hashCode = prime * hashCode + ((getExclude() == null) ? 0 : getExclude().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public MessageInsightsDataSource clone() {
        try {
            return (MessageInsightsDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.MessageInsightsDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
