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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflows"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkflowsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results that can be returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the template.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * The name of the application configured in Application Discovery Service.
     * </p>
     */
    private String adsApplicationConfigurationName;
    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The maximum number of results that can be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that can be returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that can be returned.
     * </p>
     * 
     * @return The maximum number of results that can be returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that can be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that can be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @param templateId
     *        The ID of the template.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @return The ID of the template.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @param templateId
     *        The ID of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsRequest withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * The name of the application configured in Application Discovery Service.
     * </p>
     * 
     * @param adsApplicationConfigurationName
     *        The name of the application configured in Application Discovery Service.
     */

    public void setAdsApplicationConfigurationName(String adsApplicationConfigurationName) {
        this.adsApplicationConfigurationName = adsApplicationConfigurationName;
    }

    /**
     * <p>
     * The name of the application configured in Application Discovery Service.
     * </p>
     * 
     * @return The name of the application configured in Application Discovery Service.
     */

    public String getAdsApplicationConfigurationName() {
        return this.adsApplicationConfigurationName;
    }

    /**
     * <p>
     * The name of the application configured in Application Discovery Service.
     * </p>
     * 
     * @param adsApplicationConfigurationName
     *        The name of the application configured in Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsRequest withAdsApplicationConfigurationName(String adsApplicationConfigurationName) {
        setAdsApplicationConfigurationName(adsApplicationConfigurationName);
        return this;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @param status
     *        The status of the migration workflow.
     * @see MigrationWorkflowStatusEnum
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @return The status of the migration workflow.
     * @see MigrationWorkflowStatusEnum
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @param status
     *        The status of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationWorkflowStatusEnum
     */

    public ListWorkflowsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @param status
     *        The status of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationWorkflowStatusEnum
     */

    public ListWorkflowsRequest withStatus(MigrationWorkflowStatusEnum status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     * 
     * @param name
     *        The name of the migration workflow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     * 
     * @return The name of the migration workflow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     * 
     * @param name
     *        The name of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsRequest withName(String name) {
        setName(name);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getAdsApplicationConfigurationName() != null)
            sb.append("AdsApplicationConfigurationName: ").append(getAdsApplicationConfigurationName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkflowsRequest == false)
            return false;
        ListWorkflowsRequest other = (ListWorkflowsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getAdsApplicationConfigurationName() == null ^ this.getAdsApplicationConfigurationName() == null)
            return false;
        if (other.getAdsApplicationConfigurationName() != null
                && other.getAdsApplicationConfigurationName().equals(this.getAdsApplicationConfigurationName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getAdsApplicationConfigurationName() == null) ? 0 : getAdsApplicationConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkflowsRequest clone() {
        return (ListWorkflowsRequest) super.clone();
    }

}
