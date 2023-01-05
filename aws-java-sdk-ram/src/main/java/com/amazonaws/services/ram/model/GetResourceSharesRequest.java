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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShares" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceSharesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of individual resource shares that you want information about.
     * </p>
     */
    private java.util.List<String> resourceShareArns;
    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that have this status.
     * </p>
     */
    private String resourceShareStatus;
    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that match the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>SELF</code> </b> – resource shares that your account shares with other accounts
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER-ACCOUNTS</code> </b> – resource shares that other accounts share with your account
     * </p>
     * </li>
     * </ul>
     */
    private String resourceOwner;
    /**
     * <p>
     * Specifies the name of an individual resource share that you want to retrieve details about.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that match the specified tag keys and
     * values.
     * </p>
     */
    private java.util.List<TagFilter> tagFilters;
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
     * Specifies that you want to retrieve details of only those resource shares that use the RAM permission with this
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a>.
     * </p>
     */
    private String permissionArn;

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of individual resource shares that you want information about.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs)</a> of individual resource shares that you want information about.
     */

    public java.util.List<String> getResourceShareArns() {
        return resourceShareArns;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of individual resource shares that you want information about.
     * </p>
     * 
     * @param resourceShareArns
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Names (ARNs)</a> of individual resource shares that you want information about.
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
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of individual resource shares that you want information about.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceShareArns(java.util.Collection)} or {@link #withResourceShareArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceShareArns
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Names (ARNs)</a> of individual resource shares that you want information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesRequest withResourceShareArns(String... resourceShareArns) {
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
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of individual resource shares that you want information about.
     * </p>
     * 
     * @param resourceShareArns
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Names (ARNs)</a> of individual resource shares that you want information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesRequest withResourceShareArns(java.util.Collection<String> resourceShareArns) {
        setResourceShareArns(resourceShareArns);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that have this status.
     * </p>
     * 
     * @param resourceShareStatus
     *        Specifies that you want to retrieve details of only those resource shares that have this status.
     * @see ResourceShareStatus
     */

    public void setResourceShareStatus(String resourceShareStatus) {
        this.resourceShareStatus = resourceShareStatus;
    }

    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that have this status.
     * </p>
     * 
     * @return Specifies that you want to retrieve details of only those resource shares that have this status.
     * @see ResourceShareStatus
     */

    public String getResourceShareStatus() {
        return this.resourceShareStatus;
    }

    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that have this status.
     * </p>
     * 
     * @param resourceShareStatus
     *        Specifies that you want to retrieve details of only those resource shares that have this status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareStatus
     */

    public GetResourceSharesRequest withResourceShareStatus(String resourceShareStatus) {
        setResourceShareStatus(resourceShareStatus);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that have this status.
     * </p>
     * 
     * @param resourceShareStatus
     *        Specifies that you want to retrieve details of only those resource shares that have this status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareStatus
     */

    public GetResourceSharesRequest withResourceShareStatus(ResourceShareStatus resourceShareStatus) {
        this.resourceShareStatus = resourceShareStatus.toString();
        return this;
    }

    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that match the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>SELF</code> </b> – resource shares that your account shares with other accounts
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER-ACCOUNTS</code> </b> – resource shares that other accounts share with your account
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceOwner
     *        Specifies that you want to retrieve details of only those resource shares that match the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>SELF</code> </b> – resource shares that your account shares with other accounts
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>OTHER-ACCOUNTS</code> </b> – resource shares that other accounts share with your account
     *        </p>
     *        </li>
     * @see ResourceOwner
     */

    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that match the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>SELF</code> </b> – resource shares that your account shares with other accounts
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER-ACCOUNTS</code> </b> – resource shares that other accounts share with your account
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies that you want to retrieve details of only those resource shares that match the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>SELF</code> </b> – resource shares that your account shares with other accounts
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>OTHER-ACCOUNTS</code> </b> – resource shares that other accounts share with your account
     *         </p>
     *         </li>
     * @see ResourceOwner
     */

    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that match the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>SELF</code> </b> – resource shares that your account shares with other accounts
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER-ACCOUNTS</code> </b> – resource shares that other accounts share with your account
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceOwner
     *        Specifies that you want to retrieve details of only those resource shares that match the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>SELF</code> </b> – resource shares that your account shares with other accounts
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>OTHER-ACCOUNTS</code> </b> – resource shares that other accounts share with your account
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceOwner
     */

    public GetResourceSharesRequest withResourceOwner(String resourceOwner) {
        setResourceOwner(resourceOwner);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that match the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>SELF</code> </b> – resource shares that your account shares with other accounts
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER-ACCOUNTS</code> </b> – resource shares that other accounts share with your account
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceOwner
     *        Specifies that you want to retrieve details of only those resource shares that match the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>SELF</code> </b> – resource shares that your account shares with other accounts
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>OTHER-ACCOUNTS</code> </b> – resource shares that other accounts share with your account
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceOwner
     */

    public GetResourceSharesRequest withResourceOwner(ResourceOwner resourceOwner) {
        this.resourceOwner = resourceOwner.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the name of an individual resource share that you want to retrieve details about.
     * </p>
     * 
     * @param name
     *        Specifies the name of an individual resource share that you want to retrieve details about.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name of an individual resource share that you want to retrieve details about.
     * </p>
     * 
     * @return Specifies the name of an individual resource share that you want to retrieve details about.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name of an individual resource share that you want to retrieve details about.
     * </p>
     * 
     * @param name
     *        Specifies the name of an individual resource share that you want to retrieve details about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that match the specified tag keys and
     * values.
     * </p>
     * 
     * @return Specifies that you want to retrieve details of only those resource shares that match the specified tag
     *         keys and values.
     */

    public java.util.List<TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that match the specified tag keys and
     * values.
     * </p>
     * 
     * @param tagFilters
     *        Specifies that you want to retrieve details of only those resource shares that match the specified tag
     *        keys and values.
     */

    public void setTagFilters(java.util.Collection<TagFilter> tagFilters) {
        if (tagFilters == null) {
            this.tagFilters = null;
            return;
        }

        this.tagFilters = new java.util.ArrayList<TagFilter>(tagFilters);
    }

    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that match the specified tag keys and
     * values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagFilters(java.util.Collection)} or {@link #withTagFilters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagFilters
     *        Specifies that you want to retrieve details of only those resource shares that match the specified tag
     *        keys and values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesRequest withTagFilters(TagFilter... tagFilters) {
        if (this.tagFilters == null) {
            setTagFilters(new java.util.ArrayList<TagFilter>(tagFilters.length));
        }
        for (TagFilter ele : tagFilters) {
            this.tagFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that match the specified tag keys and
     * values.
     * </p>
     * 
     * @param tagFilters
     *        Specifies that you want to retrieve details of only those resource shares that match the specified tag
     *        keys and values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesRequest withTagFilters(java.util.Collection<TagFilter> tagFilters) {
        setTagFilters(tagFilters);
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

    public GetResourceSharesRequest withNextToken(String nextToken) {
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

    public GetResourceSharesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that use the RAM permission with this
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a>.
     * </p>
     * 
     * @param permissionArn
     *        Specifies that you want to retrieve details of only those resource shares that use the RAM permission with
     *        this <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a>.
     */

    public void setPermissionArn(String permissionArn) {
        this.permissionArn = permissionArn;
    }

    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that use the RAM permission with this
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a>.
     * </p>
     * 
     * @return Specifies that you want to retrieve details of only those resource shares that use the RAM permission
     *         with this <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resoure Name (ARN)</a>.
     */

    public String getPermissionArn() {
        return this.permissionArn;
    }

    /**
     * <p>
     * Specifies that you want to retrieve details of only those resource shares that use the RAM permission with this
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a>.
     * </p>
     * 
     * @param permissionArn
     *        Specifies that you want to retrieve details of only those resource shares that use the RAM permission with
     *        this <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesRequest withPermissionArn(String permissionArn) {
        setPermissionArn(permissionArn);
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
        if (getResourceShareArns() != null)
            sb.append("ResourceShareArns: ").append(getResourceShareArns()).append(",");
        if (getResourceShareStatus() != null)
            sb.append("ResourceShareStatus: ").append(getResourceShareStatus()).append(",");
        if (getResourceOwner() != null)
            sb.append("ResourceOwner: ").append(getResourceOwner()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTagFilters() != null)
            sb.append("TagFilters: ").append(getTagFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getPermissionArn() != null)
            sb.append("PermissionArn: ").append(getPermissionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceSharesRequest == false)
            return false;
        GetResourceSharesRequest other = (GetResourceSharesRequest) obj;
        if (other.getResourceShareArns() == null ^ this.getResourceShareArns() == null)
            return false;
        if (other.getResourceShareArns() != null && other.getResourceShareArns().equals(this.getResourceShareArns()) == false)
            return false;
        if (other.getResourceShareStatus() == null ^ this.getResourceShareStatus() == null)
            return false;
        if (other.getResourceShareStatus() != null && other.getResourceShareStatus().equals(this.getResourceShareStatus()) == false)
            return false;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTagFilters() == null ^ this.getTagFilters() == null)
            return false;
        if (other.getTagFilters() != null && other.getTagFilters().equals(this.getTagFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getPermissionArn() == null ^ this.getPermissionArn() == null)
            return false;
        if (other.getPermissionArn() != null && other.getPermissionArn().equals(this.getPermissionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceShareArns() == null) ? 0 : getResourceShareArns().hashCode());
        hashCode = prime * hashCode + ((getResourceShareStatus() == null) ? 0 : getResourceShareStatus().hashCode());
        hashCode = prime * hashCode + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTagFilters() == null) ? 0 : getTagFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getPermissionArn() == null) ? 0 : getPermissionArn().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceSharesRequest clone() {
        return (GetResourceSharesRequest) super.clone();
    }

}
