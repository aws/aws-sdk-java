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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShareAssociations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceShareAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether you want to retrieve the associations that involve a specified resource or principal.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRINCIPAL</code> – list the principals that are associated with the specified resource share.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE</code> – list the resources that are associated with the specified resource share.
     * </p>
     * </li>
     * </ul>
     */
    private String associationType;
    /**
     * <p>
     * Specifies a list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of the resource share whose associations you want to retrieve.
     * </p>
     */
    private java.util.List<String> resourceShareArns;
    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the resource whose resource shares you want to retrieve.
     * </p>
     * <p>
     * You cannot specify this parameter if the association type is <code>PRINCIPAL</code>.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Specifies the ID of the principal whose resource shares you want to retrieve. This can be an Amazon Web Services
     * account ID, an organization ID, an organizational unit ID, or the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name (ARN)</a>
     * of an individual IAM user or role.
     * </p>
     * <p>
     * You cannot specify this parameter if the association type is <code>RESOURCE</code>.
     * </p>
     */
    private String principal;
    /**
     * <p>
     * Specifies that you want to retrieve only associations with this status.
     * </p>
     */
    private String associationStatus;
    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Specifies whether you want to retrieve the associations that involve a specified resource or principal.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRINCIPAL</code> – list the principals that are associated with the specified resource share.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE</code> – list the resources that are associated with the specified resource share.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associationType
     *        Specifies whether you want to retrieve the associations that involve a specified resource or
     *        principal.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRINCIPAL</code> – list the principals that are associated with the specified resource share.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESOURCE</code> – list the resources that are associated with the specified resource share.
     *        </p>
     *        </li>
     * @see ResourceShareAssociationType
     */

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * Specifies whether you want to retrieve the associations that involve a specified resource or principal.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRINCIPAL</code> – list the principals that are associated with the specified resource share.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE</code> – list the resources that are associated with the specified resource share.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether you want to retrieve the associations that involve a specified resource or
     *         principal.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PRINCIPAL</code> – list the principals that are associated with the specified resource share.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESOURCE</code> – list the resources that are associated with the specified resource share.
     *         </p>
     *         </li>
     * @see ResourceShareAssociationType
     */

    public String getAssociationType() {
        return this.associationType;
    }

    /**
     * <p>
     * Specifies whether you want to retrieve the associations that involve a specified resource or principal.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRINCIPAL</code> – list the principals that are associated with the specified resource share.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE</code> – list the resources that are associated with the specified resource share.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associationType
     *        Specifies whether you want to retrieve the associations that involve a specified resource or
     *        principal.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRINCIPAL</code> – list the principals that are associated with the specified resource share.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESOURCE</code> – list the resources that are associated with the specified resource share.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareAssociationType
     */

    public GetResourceShareAssociationsRequest withAssociationType(String associationType) {
        setAssociationType(associationType);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to retrieve the associations that involve a specified resource or principal.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRINCIPAL</code> – list the principals that are associated with the specified resource share.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE</code> – list the resources that are associated with the specified resource share.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associationType
     *        Specifies whether you want to retrieve the associations that involve a specified resource or
     *        principal.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRINCIPAL</code> – list the principals that are associated with the specified resource share.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESOURCE</code> – list the resources that are associated with the specified resource share.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareAssociationType
     */

    public GetResourceShareAssociationsRequest withAssociationType(ResourceShareAssociationType associationType) {
        this.associationType = associationType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of the resource share whose associations you want to retrieve.
     * </p>
     * 
     * @return Specifies a list of <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> of the resource share whose associations you want to retrieve.
     */

    public java.util.List<String> getResourceShareArns() {
        return resourceShareArns;
    }

    /**
     * <p>
     * Specifies a list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of the resource share whose associations you want to retrieve.
     * </p>
     * 
     * @param resourceShareArns
     *        Specifies a list of <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> of the resource share whose associations you want to retrieve.
     */

    public void setResourceShareArns(java.util.Collection<String> resourceShareArns) {
        if (resourceShareArns == null) {
            this.resourceShareArns = null;
            return;
        }

        this.resourceShareArns = new java.util.ArrayList<String>(resourceShareArns);
    }

    /**
     * <p>
     * Specifies a list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of the resource share whose associations you want to retrieve.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceShareArns(java.util.Collection)} or {@link #withResourceShareArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceShareArns
     *        Specifies a list of <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> of the resource share whose associations you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceShareAssociationsRequest withResourceShareArns(String... resourceShareArns) {
        if (this.resourceShareArns == null) {
            setResourceShareArns(new java.util.ArrayList<String>(resourceShareArns.length));
        }
        for (String ele : resourceShareArns) {
            this.resourceShareArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of the resource share whose associations you want to retrieve.
     * </p>
     * 
     * @param resourceShareArns
     *        Specifies a list of <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> of the resource share whose associations you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceShareAssociationsRequest withResourceShareArns(java.util.Collection<String> resourceShareArns) {
        setResourceShareArns(resourceShareArns);
        return this;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the resource whose resource shares you want to retrieve.
     * </p>
     * <p>
     * You cannot specify this parameter if the association type is <code>PRINCIPAL</code>.
     * </p>
     * 
     * @param resourceArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resoure Name (ARN)</a> of the resource whose resource shares you want to retrieve.</p>
     *        <p>
     *        You cannot specify this parameter if the association type is <code>PRINCIPAL</code>.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the resource whose resource shares you want to retrieve.
     * </p>
     * <p>
     * You cannot specify this parameter if the association type is <code>PRINCIPAL</code>.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resoure Name (ARN)</a> of the resource whose resource shares you want to retrieve.</p>
     *         <p>
     *         You cannot specify this parameter if the association type is <code>PRINCIPAL</code>.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the resource whose resource shares you want to retrieve.
     * </p>
     * <p>
     * You cannot specify this parameter if the association type is <code>PRINCIPAL</code>.
     * </p>
     * 
     * @param resourceArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resoure Name (ARN)</a> of the resource whose resource shares you want to retrieve.</p>
     *        <p>
     *        You cannot specify this parameter if the association type is <code>PRINCIPAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceShareAssociationsRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Specifies the ID of the principal whose resource shares you want to retrieve. This can be an Amazon Web Services
     * account ID, an organization ID, an organizational unit ID, or the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name (ARN)</a>
     * of an individual IAM user or role.
     * </p>
     * <p>
     * You cannot specify this parameter if the association type is <code>RESOURCE</code>.
     * </p>
     * 
     * @param principal
     *        Specifies the ID of the principal whose resource shares you want to retrieve. This can be an Amazon Web
     *        Services account ID, an organization ID, an organizational unit ID, or the <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     *        (ARN)</a> of an individual IAM user or role.</p>
     *        <p>
     *        You cannot specify this parameter if the association type is <code>RESOURCE</code>.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * Specifies the ID of the principal whose resource shares you want to retrieve. This can be an Amazon Web Services
     * account ID, an organization ID, an organizational unit ID, or the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name (ARN)</a>
     * of an individual IAM user or role.
     * </p>
     * <p>
     * You cannot specify this parameter if the association type is <code>RESOURCE</code>.
     * </p>
     * 
     * @return Specifies the ID of the principal whose resource shares you want to retrieve. This can be an Amazon Web
     *         Services account ID, an organization ID, an organizational unit ID, or the <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     *         (ARN)</a> of an individual IAM user or role.</p>
     *         <p>
     *         You cannot specify this parameter if the association type is <code>RESOURCE</code>.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * Specifies the ID of the principal whose resource shares you want to retrieve. This can be an Amazon Web Services
     * account ID, an organization ID, an organizational unit ID, or the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name (ARN)</a>
     * of an individual IAM user or role.
     * </p>
     * <p>
     * You cannot specify this parameter if the association type is <code>RESOURCE</code>.
     * </p>
     * 
     * @param principal
     *        Specifies the ID of the principal whose resource shares you want to retrieve. This can be an Amazon Web
     *        Services account ID, an organization ID, an organizational unit ID, or the <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     *        (ARN)</a> of an individual IAM user or role.</p>
     *        <p>
     *        You cannot specify this parameter if the association type is <code>RESOURCE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceShareAssociationsRequest withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to retrieve only associations with this status.
     * </p>
     * 
     * @param associationStatus
     *        Specifies that you want to retrieve only associations with this status.
     * @see ResourceShareAssociationStatus
     */

    public void setAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
    }

    /**
     * <p>
     * Specifies that you want to retrieve only associations with this status.
     * </p>
     * 
     * @return Specifies that you want to retrieve only associations with this status.
     * @see ResourceShareAssociationStatus
     */

    public String getAssociationStatus() {
        return this.associationStatus;
    }

    /**
     * <p>
     * Specifies that you want to retrieve only associations with this status.
     * </p>
     * 
     * @param associationStatus
     *        Specifies that you want to retrieve only associations with this status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareAssociationStatus
     */

    public GetResourceShareAssociationsRequest withAssociationStatus(String associationStatus) {
        setAssociationStatus(associationStatus);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to retrieve only associations with this status.
     * </p>
     * 
     * @param associationStatus
     *        Specifies that you want to retrieve only associations with this status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareAssociationStatus
     */

    public GetResourceShareAssociationsRequest withAssociationStatus(ResourceShareAssociationStatus associationStatus) {
        this.associationStatus = associationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies that you want to receive the next page of results. Valid only if you received a
     *        <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *        available. Set this parameter to the value provided by the previous call's <code>NextToken</code> response
     *        to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @return Specifies that you want to receive the next page of results. Valid only if you received a
     *         <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *         available. Set this parameter to the value provided by the previous call's <code>NextToken</code>
     *         response to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies that you want to receive the next page of results. Valid only if you received a
     *        <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *        available. Set this parameter to the value provided by the previous call's <code>NextToken</code> response
     *        to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceShareAssociationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @param maxResults
     *        Specifies the total number of results that you want included on each page of the response. If you do not
     *        include this parameter, it defaults to a value that is specific to the operation. If additional items
     *        exist beyond the number you specify, the <code>NextToken</code> response element is returned with a value
     *        (not null). Include the specified value as the <code>NextToken</code> request parameter in the next call
     *        to the operation to get the next part of the results. Note that the service might return fewer results
     *        than the maximum even when there are more results available. You should check <code>NextToken</code> after
     *        every operation to ensure that you receive all of the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @return Specifies the total number of results that you want included on each page of the response. If you do not
     *         include this parameter, it defaults to a value that is specific to the operation. If additional items
     *         exist beyond the number you specify, the <code>NextToken</code> response element is returned with a value
     *         (not null). Include the specified value as the <code>NextToken</code> request parameter in the next call
     *         to the operation to get the next part of the results. Note that the service might return fewer results
     *         than the maximum even when there are more results available. You should check <code>NextToken</code>
     *         after every operation to ensure that you receive all of the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @param maxResults
     *        Specifies the total number of results that you want included on each page of the response. If you do not
     *        include this parameter, it defaults to a value that is specific to the operation. If additional items
     *        exist beyond the number you specify, the <code>NextToken</code> response element is returned with a value
     *        (not null). Include the specified value as the <code>NextToken</code> request parameter in the next call
     *        to the operation to get the next part of the results. Note that the service might return fewer results
     *        than the maximum even when there are more results available. You should check <code>NextToken</code> after
     *        every operation to ensure that you receive all of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceShareAssociationsRequest withMaxResults(Integer maxResults) {
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
        if (getAssociationType() != null)
            sb.append("AssociationType: ").append(getAssociationType()).append(",");
        if (getResourceShareArns() != null)
            sb.append("ResourceShareArns: ").append(getResourceShareArns()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getAssociationStatus() != null)
            sb.append("AssociationStatus: ").append(getAssociationStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof GetResourceShareAssociationsRequest == false)
            return false;
        GetResourceShareAssociationsRequest other = (GetResourceShareAssociationsRequest) obj;
        if (other.getAssociationType() == null ^ this.getAssociationType() == null)
            return false;
        if (other.getAssociationType() != null && other.getAssociationType().equals(this.getAssociationType()) == false)
            return false;
        if (other.getResourceShareArns() == null ^ this.getResourceShareArns() == null)
            return false;
        if (other.getResourceShareArns() != null && other.getResourceShareArns().equals(this.getResourceShareArns()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getAssociationStatus() == null ^ this.getAssociationStatus() == null)
            return false;
        if (other.getAssociationStatus() != null && other.getAssociationStatus().equals(this.getAssociationStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getAssociationType() == null) ? 0 : getAssociationType().hashCode());
        hashCode = prime * hashCode + ((getResourceShareArns() == null) ? 0 : getResourceShareArns().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getAssociationStatus() == null) ? 0 : getAssociationStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceShareAssociationsRequest clone() {
        return (GetResourceShareAssociationsRequest) super.clone();
    }

}
