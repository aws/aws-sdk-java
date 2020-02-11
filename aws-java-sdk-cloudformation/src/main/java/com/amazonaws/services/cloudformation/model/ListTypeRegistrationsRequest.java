/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListTypeRegistrations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTypeRegistrationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     */
    private String typeArn;
    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * The default is <code>IN_PROGRESS</code>.
     * </p>
     */
    private String registrationStatusFilter;
    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param type
     *        The kind of type.</p>
     *        <p>
     *        Currently the only valid value is <code>RESOURCE</code>.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @see RegistryType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @return The kind of type.</p>
     *         <p>
     *         Currently the only valid value is <code>RESOURCE</code>.
     *         </p>
     *         <p>
     *         Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @see RegistryType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param type
     *        The kind of type.</p>
     *        <p>
     *        Currently the only valid value is <code>RESOURCE</code>.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public ListTypeRegistrationsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param type
     *        The kind of type.</p>
     *        <p>
     *        Currently the only valid value is <code>RESOURCE</code>.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public ListTypeRegistrationsRequest withType(RegistryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the type.</p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @return The name of the type.</p>
     *         <p>
     *         Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the type.</p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypeRegistrationsRequest withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param typeArn
     *        The Amazon Resource Name (ARN) of the type.</p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     */

    public void setTypeArn(String typeArn) {
        this.typeArn = typeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the type.</p>
     *         <p>
     *         Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     */

    public String getTypeArn() {
        return this.typeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param typeArn
     *        The Amazon Resource Name (ARN) of the type.</p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypeRegistrationsRequest withTypeArn(String typeArn) {
        setTypeArn(typeArn);
        return this;
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * The default is <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param registrationStatusFilter
     *        The current status of the type registration request.</p>
     *        <p>
     *        The default is <code>IN_PROGRESS</code>.
     * @see RegistrationStatus
     */

    public void setRegistrationStatusFilter(String registrationStatusFilter) {
        this.registrationStatusFilter = registrationStatusFilter;
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * The default is <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @return The current status of the type registration request.</p>
     *         <p>
     *         The default is <code>IN_PROGRESS</code>.
     * @see RegistrationStatus
     */

    public String getRegistrationStatusFilter() {
        return this.registrationStatusFilter;
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * The default is <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param registrationStatusFilter
     *        The current status of the type registration request.</p>
     *        <p>
     *        The default is <code>IN_PROGRESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public ListTypeRegistrationsRequest withRegistrationStatusFilter(String registrationStatusFilter) {
        setRegistrationStatusFilter(registrationStatusFilter);
        return this;
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * The default is <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param registrationStatusFilter
     *        The current status of the type registration request.</p>
     *        <p>
     *        The default is <code>IN_PROGRESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public ListTypeRegistrationsRequest withRegistrationStatusFilter(RegistrationStatus registrationStatusFilter) {
        this.registrationStatusFilter = registrationStatusFilter.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned with a single call. If the number of available results
     *        exceeds this maximum, the response includes a <code>NextToken</code> value that you can assign to the
     *        <code>NextToken</code> request parameter to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     * 
     * @return The maximum number of results to be returned with a single call. If the number of available results
     *         exceeds this maximum, the response includes a <code>NextToken</code> value that you can assign to the
     *         <code>NextToken</code> request parameter to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned with a single call. If the number of available results
     *        exceeds this maximum, the response includes a <code>NextToken</code> value that you can assign to the
     *        <code>NextToken</code> request parameter to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypeRegistrationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request didn't return all of the remaining results, the response object's
     *        <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this
     *        action again and assign that token to the request object's <code>NextToken</code> parameter. If there are
     *        no remaining results, the previous response object's <code>NextToken</code> parameter is set to
     *        <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     * 
     * @return If the previous paginated request didn't return all of the remaining results, the response object's
     *         <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this
     *         action again and assign that token to the request object's <code>NextToken</code> parameter. If there are
     *         no remaining results, the previous response object's <code>NextToken</code> parameter is set to
     *         <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request didn't return all of the remaining results, the response object's
     *        <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this
     *        action again and assign that token to the request object's <code>NextToken</code> parameter. If there are
     *        no remaining results, the previous response object's <code>NextToken</code> parameter is set to
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypeRegistrationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getTypeArn() != null)
            sb.append("TypeArn: ").append(getTypeArn()).append(",");
        if (getRegistrationStatusFilter() != null)
            sb.append("RegistrationStatusFilter: ").append(getRegistrationStatusFilter()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTypeRegistrationsRequest == false)
            return false;
        ListTypeRegistrationsRequest other = (ListTypeRegistrationsRequest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getTypeArn() == null ^ this.getTypeArn() == null)
            return false;
        if (other.getTypeArn() != null && other.getTypeArn().equals(this.getTypeArn()) == false)
            return false;
        if (other.getRegistrationStatusFilter() == null ^ this.getRegistrationStatusFilter() == null)
            return false;
        if (other.getRegistrationStatusFilter() != null && other.getRegistrationStatusFilter().equals(this.getRegistrationStatusFilter()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getTypeArn() == null) ? 0 : getTypeArn().hashCode());
        hashCode = prime * hashCode + ((getRegistrationStatusFilter() == null) ? 0 : getRegistrationStatusFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTypeRegistrationsRequest clone() {
        return (ListTypeRegistrationsRequest) super.clone();
    }

}
