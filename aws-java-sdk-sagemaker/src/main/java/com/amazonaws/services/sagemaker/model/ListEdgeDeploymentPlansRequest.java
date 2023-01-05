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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEdgeDeploymentPlans" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEdgeDeploymentPlansRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to select (50 by default).
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Selects edge deployment plans created after this time.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * Selects edge deployment plans created before this time.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * Selects edge deployment plans that were last updated after this time.
     * </p>
     */
    private java.util.Date lastModifiedTimeAfter;
    /**
     * <p>
     * Selects edge deployment plans that were last updated before this time.
     * </p>
     */
    private java.util.Date lastModifiedTimeBefore;
    /**
     * <p>
     * Selects edge deployment plans with names containing this name.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * Selects edge deployment plans with a device fleet name containing this name.
     * </p>
     */
    private String deviceFleetNameContains;
    /**
     * <p>
     * The column by which to sort the edge deployment plans. Can be one of <code>NAME</code>,
     * <code>DEVICEFLEETNAME</code>, <code>CREATIONTIME</code>, <code>LASTMODIFIEDTIME</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The direction of the sorting (ascending or descending).
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     * 
     * @param nextToken
     *        The response from the last list when returning a list large enough to need tokening.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     * 
     * @return The response from the last list when returning a list large enough to need tokening.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     * 
     * @param nextToken
     *        The response from the last list when returning a list large enough to need tokening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeDeploymentPlansRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to select (50 by default).
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to select (50 by default).
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to select (50 by default).
     * </p>
     * 
     * @return The maximum number of results to select (50 by default).
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to select (50 by default).
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to select (50 by default).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeDeploymentPlansRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Selects edge deployment plans created after this time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Selects edge deployment plans created after this time.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Selects edge deployment plans created after this time.
     * </p>
     * 
     * @return Selects edge deployment plans created after this time.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * Selects edge deployment plans created after this time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Selects edge deployment plans created after this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeDeploymentPlansRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * Selects edge deployment plans created before this time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Selects edge deployment plans created before this time.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Selects edge deployment plans created before this time.
     * </p>
     * 
     * @return Selects edge deployment plans created before this time.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * Selects edge deployment plans created before this time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Selects edge deployment plans created before this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeDeploymentPlansRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * Selects edge deployment plans that were last updated after this time.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        Selects edge deployment plans that were last updated after this time.
     */

    public void setLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        this.lastModifiedTimeAfter = lastModifiedTimeAfter;
    }

    /**
     * <p>
     * Selects edge deployment plans that were last updated after this time.
     * </p>
     * 
     * @return Selects edge deployment plans that were last updated after this time.
     */

    public java.util.Date getLastModifiedTimeAfter() {
        return this.lastModifiedTimeAfter;
    }

    /**
     * <p>
     * Selects edge deployment plans that were last updated after this time.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        Selects edge deployment plans that were last updated after this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeDeploymentPlansRequest withLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        setLastModifiedTimeAfter(lastModifiedTimeAfter);
        return this;
    }

    /**
     * <p>
     * Selects edge deployment plans that were last updated before this time.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        Selects edge deployment plans that were last updated before this time.
     */

    public void setLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        this.lastModifiedTimeBefore = lastModifiedTimeBefore;
    }

    /**
     * <p>
     * Selects edge deployment plans that were last updated before this time.
     * </p>
     * 
     * @return Selects edge deployment plans that were last updated before this time.
     */

    public java.util.Date getLastModifiedTimeBefore() {
        return this.lastModifiedTimeBefore;
    }

    /**
     * <p>
     * Selects edge deployment plans that were last updated before this time.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        Selects edge deployment plans that were last updated before this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeDeploymentPlansRequest withLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        setLastModifiedTimeBefore(lastModifiedTimeBefore);
        return this;
    }

    /**
     * <p>
     * Selects edge deployment plans with names containing this name.
     * </p>
     * 
     * @param nameContains
     *        Selects edge deployment plans with names containing this name.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Selects edge deployment plans with names containing this name.
     * </p>
     * 
     * @return Selects edge deployment plans with names containing this name.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * Selects edge deployment plans with names containing this name.
     * </p>
     * 
     * @param nameContains
     *        Selects edge deployment plans with names containing this name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeDeploymentPlansRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * Selects edge deployment plans with a device fleet name containing this name.
     * </p>
     * 
     * @param deviceFleetNameContains
     *        Selects edge deployment plans with a device fleet name containing this name.
     */

    public void setDeviceFleetNameContains(String deviceFleetNameContains) {
        this.deviceFleetNameContains = deviceFleetNameContains;
    }

    /**
     * <p>
     * Selects edge deployment plans with a device fleet name containing this name.
     * </p>
     * 
     * @return Selects edge deployment plans with a device fleet name containing this name.
     */

    public String getDeviceFleetNameContains() {
        return this.deviceFleetNameContains;
    }

    /**
     * <p>
     * Selects edge deployment plans with a device fleet name containing this name.
     * </p>
     * 
     * @param deviceFleetNameContains
     *        Selects edge deployment plans with a device fleet name containing this name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeDeploymentPlansRequest withDeviceFleetNameContains(String deviceFleetNameContains) {
        setDeviceFleetNameContains(deviceFleetNameContains);
        return this;
    }

    /**
     * <p>
     * The column by which to sort the edge deployment plans. Can be one of <code>NAME</code>,
     * <code>DEVICEFLEETNAME</code>, <code>CREATIONTIME</code>, <code>LASTMODIFIEDTIME</code>.
     * </p>
     * 
     * @param sortBy
     *        The column by which to sort the edge deployment plans. Can be one of <code>NAME</code>,
     *        <code>DEVICEFLEETNAME</code>, <code>CREATIONTIME</code>, <code>LASTMODIFIEDTIME</code>.
     * @see ListEdgeDeploymentPlansSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The column by which to sort the edge deployment plans. Can be one of <code>NAME</code>,
     * <code>DEVICEFLEETNAME</code>, <code>CREATIONTIME</code>, <code>LASTMODIFIEDTIME</code>.
     * </p>
     * 
     * @return The column by which to sort the edge deployment plans. Can be one of <code>NAME</code>,
     *         <code>DEVICEFLEETNAME</code>, <code>CREATIONTIME</code>, <code>LASTMODIFIEDTIME</code>.
     * @see ListEdgeDeploymentPlansSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The column by which to sort the edge deployment plans. Can be one of <code>NAME</code>,
     * <code>DEVICEFLEETNAME</code>, <code>CREATIONTIME</code>, <code>LASTMODIFIEDTIME</code>.
     * </p>
     * 
     * @param sortBy
     *        The column by which to sort the edge deployment plans. Can be one of <code>NAME</code>,
     *        <code>DEVICEFLEETNAME</code>, <code>CREATIONTIME</code>, <code>LASTMODIFIEDTIME</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListEdgeDeploymentPlansSortBy
     */

    public ListEdgeDeploymentPlansRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The column by which to sort the edge deployment plans. Can be one of <code>NAME</code>,
     * <code>DEVICEFLEETNAME</code>, <code>CREATIONTIME</code>, <code>LASTMODIFIEDTIME</code>.
     * </p>
     * 
     * @param sortBy
     *        The column by which to sort the edge deployment plans. Can be one of <code>NAME</code>,
     *        <code>DEVICEFLEETNAME</code>, <code>CREATIONTIME</code>, <code>LASTMODIFIEDTIME</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListEdgeDeploymentPlansSortBy
     */

    public ListEdgeDeploymentPlansRequest withSortBy(ListEdgeDeploymentPlansSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The direction of the sorting (ascending or descending).
     * </p>
     * 
     * @param sortOrder
     *        The direction of the sorting (ascending or descending).
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The direction of the sorting (ascending or descending).
     * </p>
     * 
     * @return The direction of the sorting (ascending or descending).
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The direction of the sorting (ascending or descending).
     * </p>
     * 
     * @param sortOrder
     *        The direction of the sorting (ascending or descending).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListEdgeDeploymentPlansRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The direction of the sorting (ascending or descending).
     * </p>
     * 
     * @param sortOrder
     *        The direction of the sorting (ascending or descending).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListEdgeDeploymentPlansRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getLastModifiedTimeAfter() != null)
            sb.append("LastModifiedTimeAfter: ").append(getLastModifiedTimeAfter()).append(",");
        if (getLastModifiedTimeBefore() != null)
            sb.append("LastModifiedTimeBefore: ").append(getLastModifiedTimeBefore()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getDeviceFleetNameContains() != null)
            sb.append("DeviceFleetNameContains: ").append(getDeviceFleetNameContains()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEdgeDeploymentPlansRequest == false)
            return false;
        ListEdgeDeploymentPlansRequest other = (ListEdgeDeploymentPlansRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getLastModifiedTimeAfter() == null ^ this.getLastModifiedTimeAfter() == null)
            return false;
        if (other.getLastModifiedTimeAfter() != null && other.getLastModifiedTimeAfter().equals(this.getLastModifiedTimeAfter()) == false)
            return false;
        if (other.getLastModifiedTimeBefore() == null ^ this.getLastModifiedTimeBefore() == null)
            return false;
        if (other.getLastModifiedTimeBefore() != null && other.getLastModifiedTimeBefore().equals(this.getLastModifiedTimeBefore()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getDeviceFleetNameContains() == null ^ this.getDeviceFleetNameContains() == null)
            return false;
        if (other.getDeviceFleetNameContains() != null && other.getDeviceFleetNameContains().equals(this.getDeviceFleetNameContains()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeAfter() == null) ? 0 : getLastModifiedTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeBefore() == null) ? 0 : getLastModifiedTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getDeviceFleetNameContains() == null) ? 0 : getDeviceFleetNameContains().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListEdgeDeploymentPlansRequest clone() {
        return (ListEdgeDeploymentPlansRequest) super.clone();
    }

}
