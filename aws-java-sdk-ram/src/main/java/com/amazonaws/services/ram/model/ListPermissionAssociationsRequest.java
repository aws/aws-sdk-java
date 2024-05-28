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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPermissionAssociations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPermissionAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the managed permission.
     * </p>
     */
    private String permissionArn;
    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that use this version of the managed
     * permission. If you don't provide a value for this parameter, then the operation returns information about
     * associations with resource shares that use any version of the managed permission.
     * </p>
     */
    private Integer permissionVersion;
    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that match this status.
     * </p>
     */
    private String associationStatus;
    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that include at least one resource
     * of this resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that have a <code>featureSet</code>
     * with this value.
     * </p>
     */
    private String featureSet;
    /**
     * <p>
     * When <code>true</code>, specifies that you want to list only those associations with resource shares that use the
     * default version of the specified managed permission.
     * </p>
     * <p>
     * When <code>false</code> (the default value), lists associations with resource shares that use any version of the
     * specified managed permission.
     * </p>
     */
    private Boolean defaultVersion;
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
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the managed permission.
     * </p>
     * 
     * @param permissionArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the managed permission.
     */

    public void setPermissionArn(String permissionArn) {
        this.permissionArn = permissionArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the managed permission.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Name (ARN)</a> of the managed permission.
     */

    public String getPermissionArn() {
        return this.permissionArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the managed permission.
     * </p>
     * 
     * @param permissionArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the managed permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionAssociationsRequest withPermissionArn(String permissionArn) {
        setPermissionArn(permissionArn);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that use this version of the managed
     * permission. If you don't provide a value for this parameter, then the operation returns information about
     * associations with resource shares that use any version of the managed permission.
     * </p>
     * 
     * @param permissionVersion
     *        Specifies that you want to list only those associations with resource shares that use this version of the
     *        managed permission. If you don't provide a value for this parameter, then the operation returns
     *        information about associations with resource shares that use any version of the managed permission.
     */

    public void setPermissionVersion(Integer permissionVersion) {
        this.permissionVersion = permissionVersion;
    }

    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that use this version of the managed
     * permission. If you don't provide a value for this parameter, then the operation returns information about
     * associations with resource shares that use any version of the managed permission.
     * </p>
     * 
     * @return Specifies that you want to list only those associations with resource shares that use this version of the
     *         managed permission. If you don't provide a value for this parameter, then the operation returns
     *         information about associations with resource shares that use any version of the managed permission.
     */

    public Integer getPermissionVersion() {
        return this.permissionVersion;
    }

    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that use this version of the managed
     * permission. If you don't provide a value for this parameter, then the operation returns information about
     * associations with resource shares that use any version of the managed permission.
     * </p>
     * 
     * @param permissionVersion
     *        Specifies that you want to list only those associations with resource shares that use this version of the
     *        managed permission. If you don't provide a value for this parameter, then the operation returns
     *        information about associations with resource shares that use any version of the managed permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionAssociationsRequest withPermissionVersion(Integer permissionVersion) {
        setPermissionVersion(permissionVersion);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that match this status.
     * </p>
     * 
     * @param associationStatus
     *        Specifies that you want to list only those associations with resource shares that match this status.
     * @see ResourceShareAssociationStatus
     */

    public void setAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
    }

    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that match this status.
     * </p>
     * 
     * @return Specifies that you want to list only those associations with resource shares that match this status.
     * @see ResourceShareAssociationStatus
     */

    public String getAssociationStatus() {
        return this.associationStatus;
    }

    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that match this status.
     * </p>
     * 
     * @param associationStatus
     *        Specifies that you want to list only those associations with resource shares that match this status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareAssociationStatus
     */

    public ListPermissionAssociationsRequest withAssociationStatus(String associationStatus) {
        setAssociationStatus(associationStatus);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that match this status.
     * </p>
     * 
     * @param associationStatus
     *        Specifies that you want to list only those associations with resource shares that match this status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareAssociationStatus
     */

    public ListPermissionAssociationsRequest withAssociationStatus(ResourceShareAssociationStatus associationStatus) {
        this.associationStatus = associationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that include at least one resource
     * of this resource type.
     * </p>
     * 
     * @param resourceType
     *        Specifies that you want to list only those associations with resource shares that include at least one
     *        resource of this resource type.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that include at least one resource
     * of this resource type.
     * </p>
     * 
     * @return Specifies that you want to list only those associations with resource shares that include at least one
     *         resource of this resource type.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that include at least one resource
     * of this resource type.
     * </p>
     * 
     * @param resourceType
     *        Specifies that you want to list only those associations with resource shares that include at least one
     *        resource of this resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionAssociationsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that have a <code>featureSet</code>
     * with this value.
     * </p>
     * 
     * @param featureSet
     *        Specifies that you want to list only those associations with resource shares that have a
     *        <code>featureSet</code> with this value.
     * @see PermissionFeatureSet
     */

    public void setFeatureSet(String featureSet) {
        this.featureSet = featureSet;
    }

    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that have a <code>featureSet</code>
     * with this value.
     * </p>
     * 
     * @return Specifies that you want to list only those associations with resource shares that have a
     *         <code>featureSet</code> with this value.
     * @see PermissionFeatureSet
     */

    public String getFeatureSet() {
        return this.featureSet;
    }

    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that have a <code>featureSet</code>
     * with this value.
     * </p>
     * 
     * @param featureSet
     *        Specifies that you want to list only those associations with resource shares that have a
     *        <code>featureSet</code> with this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionFeatureSet
     */

    public ListPermissionAssociationsRequest withFeatureSet(String featureSet) {
        setFeatureSet(featureSet);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list only those associations with resource shares that have a <code>featureSet</code>
     * with this value.
     * </p>
     * 
     * @param featureSet
     *        Specifies that you want to list only those associations with resource shares that have a
     *        <code>featureSet</code> with this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionFeatureSet
     */

    public ListPermissionAssociationsRequest withFeatureSet(PermissionFeatureSet featureSet) {
        this.featureSet = featureSet.toString();
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, specifies that you want to list only those associations with resource shares that use the
     * default version of the specified managed permission.
     * </p>
     * <p>
     * When <code>false</code> (the default value), lists associations with resource shares that use any version of the
     * specified managed permission.
     * </p>
     * 
     * @param defaultVersion
     *        When <code>true</code>, specifies that you want to list only those associations with resource shares that
     *        use the default version of the specified managed permission.</p>
     *        <p>
     *        When <code>false</code> (the default value), lists associations with resource shares that use any version
     *        of the specified managed permission.
     */

    public void setDefaultVersion(Boolean defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    /**
     * <p>
     * When <code>true</code>, specifies that you want to list only those associations with resource shares that use the
     * default version of the specified managed permission.
     * </p>
     * <p>
     * When <code>false</code> (the default value), lists associations with resource shares that use any version of the
     * specified managed permission.
     * </p>
     * 
     * @return When <code>true</code>, specifies that you want to list only those associations with resource shares that
     *         use the default version of the specified managed permission.</p>
     *         <p>
     *         When <code>false</code> (the default value), lists associations with resource shares that use any version
     *         of the specified managed permission.
     */

    public Boolean getDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * <p>
     * When <code>true</code>, specifies that you want to list only those associations with resource shares that use the
     * default version of the specified managed permission.
     * </p>
     * <p>
     * When <code>false</code> (the default value), lists associations with resource shares that use any version of the
     * specified managed permission.
     * </p>
     * 
     * @param defaultVersion
     *        When <code>true</code>, specifies that you want to list only those associations with resource shares that
     *        use the default version of the specified managed permission.</p>
     *        <p>
     *        When <code>false</code> (the default value), lists associations with resource shares that use any version
     *        of the specified managed permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionAssociationsRequest withDefaultVersion(Boolean defaultVersion) {
        setDefaultVersion(defaultVersion);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, specifies that you want to list only those associations with resource shares that use the
     * default version of the specified managed permission.
     * </p>
     * <p>
     * When <code>false</code> (the default value), lists associations with resource shares that use any version of the
     * specified managed permission.
     * </p>
     * 
     * @return When <code>true</code>, specifies that you want to list only those associations with resource shares that
     *         use the default version of the specified managed permission.</p>
     *         <p>
     *         When <code>false</code> (the default value), lists associations with resource shares that use any version
     *         of the specified managed permission.
     */

    public Boolean isDefaultVersion() {
        return this.defaultVersion;
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

    public ListPermissionAssociationsRequest withNextToken(String nextToken) {
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

    public ListPermissionAssociationsRequest withMaxResults(Integer maxResults) {
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
        if (getPermissionArn() != null)
            sb.append("PermissionArn: ").append(getPermissionArn()).append(",");
        if (getPermissionVersion() != null)
            sb.append("PermissionVersion: ").append(getPermissionVersion()).append(",");
        if (getAssociationStatus() != null)
            sb.append("AssociationStatus: ").append(getAssociationStatus()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getFeatureSet() != null)
            sb.append("FeatureSet: ").append(getFeatureSet()).append(",");
        if (getDefaultVersion() != null)
            sb.append("DefaultVersion: ").append(getDefaultVersion()).append(",");
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

        if (obj instanceof ListPermissionAssociationsRequest == false)
            return false;
        ListPermissionAssociationsRequest other = (ListPermissionAssociationsRequest) obj;
        if (other.getPermissionArn() == null ^ this.getPermissionArn() == null)
            return false;
        if (other.getPermissionArn() != null && other.getPermissionArn().equals(this.getPermissionArn()) == false)
            return false;
        if (other.getPermissionVersion() == null ^ this.getPermissionVersion() == null)
            return false;
        if (other.getPermissionVersion() != null && other.getPermissionVersion().equals(this.getPermissionVersion()) == false)
            return false;
        if (other.getAssociationStatus() == null ^ this.getAssociationStatus() == null)
            return false;
        if (other.getAssociationStatus() != null && other.getAssociationStatus().equals(this.getAssociationStatus()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getFeatureSet() == null ^ this.getFeatureSet() == null)
            return false;
        if (other.getFeatureSet() != null && other.getFeatureSet().equals(this.getFeatureSet()) == false)
            return false;
        if (other.getDefaultVersion() == null ^ this.getDefaultVersion() == null)
            return false;
        if (other.getDefaultVersion() != null && other.getDefaultVersion().equals(this.getDefaultVersion()) == false)
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

        hashCode = prime * hashCode + ((getPermissionArn() == null) ? 0 : getPermissionArn().hashCode());
        hashCode = prime * hashCode + ((getPermissionVersion() == null) ? 0 : getPermissionVersion().hashCode());
        hashCode = prime * hashCode + ((getAssociationStatus() == null) ? 0 : getAssociationStatus().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getFeatureSet() == null) ? 0 : getFeatureSet().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersion() == null) ? 0 : getDefaultVersion().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListPermissionAssociationsRequest clone() {
        return (ListPermissionAssociationsRequest) super.clone();
    }

}
