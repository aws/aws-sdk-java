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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListTypeVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTypeVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The kind of the type.
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
     * The name of the type for which you want version summary information.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type for which you want version summary information.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     */
    private String arn;
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
     * The deprecation status of the type versions that you want to get summary information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type version is registered and can be used in CloudFormation operations, dependent on its
     * provisioning behavior and visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type version has been deregistered and can no longer be used in CloudFormation
     * operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     */
    private String deprecatedStatus;

    /**
     * <p>
     * The kind of the type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param type
     *        The kind of the type.</p>
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
     * The kind of the type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @return The kind of the type.</p>
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
     * The kind of the type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param type
     *        The kind of the type.</p>
     *        <p>
     *        Currently the only valid value is <code>RESOURCE</code>.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public ListTypeVersionsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The kind of the type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param type
     *        The kind of the type.</p>
     *        <p>
     *        Currently the only valid value is <code>RESOURCE</code>.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public ListTypeVersionsRequest withType(RegistryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the type for which you want version summary information.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the type for which you want version summary information.</p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the type for which you want version summary information.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @return The name of the type for which you want version summary information.</p>
     *         <p>
     *         Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the type for which you want version summary information.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the type for which you want version summary information.</p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypeVersionsRequest withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type for which you want version summary information.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the type for which you want version summary information.</p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type for which you want version summary information.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the type for which you want version summary information.</p>
     *         <p>
     *         Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type for which you want version summary information.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the type for which you want version summary information.</p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypeVersionsRequest withArn(String arn) {
        setArn(arn);
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

    public ListTypeVersionsRequest withMaxResults(Integer maxResults) {
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

    public ListTypeVersionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The deprecation status of the type versions that you want to get summary information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type version is registered and can be used in CloudFormation operations, dependent on its
     * provisioning behavior and visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type version has been deregistered and can no longer be used in CloudFormation
     * operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * 
     * @param deprecatedStatus
     *        The deprecation status of the type versions that you want to get summary information about.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LIVE</code>: The type version is registered and can be used in CloudFormation operations, dependent
     *        on its provisioning behavior and visibility scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code>: The type version has been deregistered and can no longer be used in
     *        CloudFormation operations.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default is <code>LIVE</code>.
     * @see DeprecatedStatus
     */

    public void setDeprecatedStatus(String deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus;
    }

    /**
     * <p>
     * The deprecation status of the type versions that you want to get summary information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type version is registered and can be used in CloudFormation operations, dependent on its
     * provisioning behavior and visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type version has been deregistered and can no longer be used in CloudFormation
     * operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * 
     * @return The deprecation status of the type versions that you want to get summary information about.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LIVE</code>: The type version is registered and can be used in CloudFormation operations, dependent
     *         on its provisioning behavior and visibility scope.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEPRECATED</code>: The type version has been deregistered and can no longer be used in
     *         CloudFormation operations.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default is <code>LIVE</code>.
     * @see DeprecatedStatus
     */

    public String getDeprecatedStatus() {
        return this.deprecatedStatus;
    }

    /**
     * <p>
     * The deprecation status of the type versions that you want to get summary information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type version is registered and can be used in CloudFormation operations, dependent on its
     * provisioning behavior and visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type version has been deregistered and can no longer be used in CloudFormation
     * operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * 
     * @param deprecatedStatus
     *        The deprecation status of the type versions that you want to get summary information about.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LIVE</code>: The type version is registered and can be used in CloudFormation operations, dependent
     *        on its provisioning behavior and visibility scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code>: The type version has been deregistered and can no longer be used in
     *        CloudFormation operations.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default is <code>LIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeprecatedStatus
     */

    public ListTypeVersionsRequest withDeprecatedStatus(String deprecatedStatus) {
        setDeprecatedStatus(deprecatedStatus);
        return this;
    }

    /**
     * <p>
     * The deprecation status of the type versions that you want to get summary information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type version is registered and can be used in CloudFormation operations, dependent on its
     * provisioning behavior and visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type version has been deregistered and can no longer be used in CloudFormation
     * operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * 
     * @param deprecatedStatus
     *        The deprecation status of the type versions that you want to get summary information about.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LIVE</code>: The type version is registered and can be used in CloudFormation operations, dependent
     *        on its provisioning behavior and visibility scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code>: The type version has been deregistered and can no longer be used in
     *        CloudFormation operations.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default is <code>LIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeprecatedStatus
     */

    public ListTypeVersionsRequest withDeprecatedStatus(DeprecatedStatus deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getDeprecatedStatus() != null)
            sb.append("DeprecatedStatus: ").append(getDeprecatedStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTypeVersionsRequest == false)
            return false;
        ListTypeVersionsRequest other = (ListTypeVersionsRequest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDeprecatedStatus() == null ^ this.getDeprecatedStatus() == null)
            return false;
        if (other.getDeprecatedStatus() != null && other.getDeprecatedStatus().equals(this.getDeprecatedStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDeprecatedStatus() == null) ? 0 : getDeprecatedStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListTypeVersionsRequest clone() {
        return (ListTypeVersionsRequest) super.clone();
    }

}
