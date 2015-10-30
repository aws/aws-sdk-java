/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listEntitiesForPolicy(ListEntitiesForPolicyRequest) ListEntitiesForPolicy operation}.
 * <p>
 * Lists all users, groups, and roles that the specified managed policy
 * is attached to.
 * </p>
 * <p>
 * You can use the optional <code>EntityFilter</code> parameter to limit
 * the results to a particular type of entity (users, groups, or roles).
 * For example, to list only the roles that are attached to the specified
 * policy, set <code>EntityFilter</code> to <code>Role</code> .
 * </p>
 * <p>
 * You can paginate the results using the <code>MaxItems</code> and
 * <code>Marker</code> parameters.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listEntitiesForPolicy(ListEntitiesForPolicyRequest)
 */
public class ListEntitiesForPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String policyArn;

    /**
     * The entity type to use for filtering the results. <p>For example, when
     * <code>EntityFilter</code> is <code>Role</code>, only the roles that
     * are attached to the specified policy are returned. This parameter is
     * optional. If it is not included, all attached entities (users, groups,
     * and roles) are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>User, Role, Group, LocalManagedPolicy, AWSManagedPolicy
     */
    private String entityFilter;

    /**
     * The path prefix for filtering the results. This parameter is optional.
     * If it is not included, it defaults to a slash (/), listing all
     * entities.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(&#92;u002F)|(&#92;u002F[&#92;u0021-&#92;u007F]+&#92;u002F)<br/>
     */
    private String pathPrefix;

    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response that
     * you received to indicate where the next call should start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     */
    private String marker;

    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If additional items exist beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>. <p>This parameter is optional. If you do not
     * include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the
     * <code>IsTruncated</code> response element returns <code>true</code>
     * and <code>Marker</code> contains a value to include in the subsequent
     * call that tells the service where to continue from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxItems;

    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     *         resources. <p>For more information about ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     *         General Reference</i>.
     */
    public String getPolicyArn() {
        return policyArn;
    }
    
    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policyArn The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     *         resources. <p>For more information about ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     *         General Reference</i>.
     */
    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }
    
    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policyArn The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     *         resources. <p>For more information about ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     *         General Reference</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEntitiesForPolicyRequest withPolicyArn(String policyArn) {
        this.policyArn = policyArn;
        return this;
    }

    /**
     * The entity type to use for filtering the results. <p>For example, when
     * <code>EntityFilter</code> is <code>Role</code>, only the roles that
     * are attached to the specified policy are returned. This parameter is
     * optional. If it is not included, all attached entities (users, groups,
     * and roles) are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>User, Role, Group, LocalManagedPolicy, AWSManagedPolicy
     *
     * @return The entity type to use for filtering the results. <p>For example, when
     *         <code>EntityFilter</code> is <code>Role</code>, only the roles that
     *         are attached to the specified policy are returned. This parameter is
     *         optional. If it is not included, all attached entities (users, groups,
     *         and roles) are returned.
     *
     * @see EntityType
     */
    public String getEntityFilter() {
        return entityFilter;
    }
    
    /**
     * The entity type to use for filtering the results. <p>For example, when
     * <code>EntityFilter</code> is <code>Role</code>, only the roles that
     * are attached to the specified policy are returned. This parameter is
     * optional. If it is not included, all attached entities (users, groups,
     * and roles) are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>User, Role, Group, LocalManagedPolicy, AWSManagedPolicy
     *
     * @param entityFilter The entity type to use for filtering the results. <p>For example, when
     *         <code>EntityFilter</code> is <code>Role</code>, only the roles that
     *         are attached to the specified policy are returned. This parameter is
     *         optional. If it is not included, all attached entities (users, groups,
     *         and roles) are returned.
     *
     * @see EntityType
     */
    public void setEntityFilter(String entityFilter) {
        this.entityFilter = entityFilter;
    }
    
    /**
     * The entity type to use for filtering the results. <p>For example, when
     * <code>EntityFilter</code> is <code>Role</code>, only the roles that
     * are attached to the specified policy are returned. This parameter is
     * optional. If it is not included, all attached entities (users, groups,
     * and roles) are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>User, Role, Group, LocalManagedPolicy, AWSManagedPolicy
     *
     * @param entityFilter The entity type to use for filtering the results. <p>For example, when
     *         <code>EntityFilter</code> is <code>Role</code>, only the roles that
     *         are attached to the specified policy are returned. This parameter is
     *         optional. If it is not included, all attached entities (users, groups,
     *         and roles) are returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EntityType
     */
    public ListEntitiesForPolicyRequest withEntityFilter(String entityFilter) {
        this.entityFilter = entityFilter;
        return this;
    }

    /**
     * The entity type to use for filtering the results. <p>For example, when
     * <code>EntityFilter</code> is <code>Role</code>, only the roles that
     * are attached to the specified policy are returned. This parameter is
     * optional. If it is not included, all attached entities (users, groups,
     * and roles) are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>User, Role, Group, LocalManagedPolicy, AWSManagedPolicy
     *
     * @param entityFilter The entity type to use for filtering the results. <p>For example, when
     *         <code>EntityFilter</code> is <code>Role</code>, only the roles that
     *         are attached to the specified policy are returned. This parameter is
     *         optional. If it is not included, all attached entities (users, groups,
     *         and roles) are returned.
     *
     * @see EntityType
     */
    public void setEntityFilter(EntityType entityFilter) {
        this.entityFilter = entityFilter.toString();
    }
    
    /**
     * The entity type to use for filtering the results. <p>For example, when
     * <code>EntityFilter</code> is <code>Role</code>, only the roles that
     * are attached to the specified policy are returned. This parameter is
     * optional. If it is not included, all attached entities (users, groups,
     * and roles) are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>User, Role, Group, LocalManagedPolicy, AWSManagedPolicy
     *
     * @param entityFilter The entity type to use for filtering the results. <p>For example, when
     *         <code>EntityFilter</code> is <code>Role</code>, only the roles that
     *         are attached to the specified policy are returned. This parameter is
     *         optional. If it is not included, all attached entities (users, groups,
     *         and roles) are returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EntityType
     */
    public ListEntitiesForPolicyRequest withEntityFilter(EntityType entityFilter) {
        this.entityFilter = entityFilter.toString();
        return this;
    }

    /**
     * The path prefix for filtering the results. This parameter is optional.
     * If it is not included, it defaults to a slash (/), listing all
     * entities.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(&#92;u002F)|(&#92;u002F[&#92;u0021-&#92;u007F]+&#92;u002F)<br/>
     *
     * @return The path prefix for filtering the results. This parameter is optional.
     *         If it is not included, it defaults to a slash (/), listing all
     *         entities.
     */
    public String getPathPrefix() {
        return pathPrefix;
    }
    
    /**
     * The path prefix for filtering the results. This parameter is optional.
     * If it is not included, it defaults to a slash (/), listing all
     * entities.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(&#92;u002F)|(&#92;u002F[&#92;u0021-&#92;u007F]+&#92;u002F)<br/>
     *
     * @param pathPrefix The path prefix for filtering the results. This parameter is optional.
     *         If it is not included, it defaults to a slash (/), listing all
     *         entities.
     */
    public void setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }
    
    /**
     * The path prefix for filtering the results. This parameter is optional.
     * If it is not included, it defaults to a slash (/), listing all
     * entities.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(&#92;u002F)|(&#92;u002F[&#92;u0021-&#92;u007F]+&#92;u002F)<br/>
     *
     * @param pathPrefix The path prefix for filtering the results. This parameter is optional.
     *         If it is not included, it defaults to a slash (/), listing all
     *         entities.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEntitiesForPolicyRequest withPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }

    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response that
     * you received to indicate where the next call should start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return Use this parameter only when paginating results and only after you
     *         receive a response indicating that the results are truncated. Set it
     *         to the value of the <code>Marker</code> element in the response that
     *         you received to indicate where the next call should start.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response that
     * you received to indicate where the next call should start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker Use this parameter only when paginating results and only after you
     *         receive a response indicating that the results are truncated. Set it
     *         to the value of the <code>Marker</code> element in the response that
     *         you received to indicate where the next call should start.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response that
     * you received to indicate where the next call should start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker Use this parameter only when paginating results and only after you
     *         receive a response indicating that the results are truncated. Set it
     *         to the value of the <code>Marker</code> element in the response that
     *         you received to indicate where the next call should start.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEntitiesForPolicyRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If additional items exist beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>. <p>This parameter is optional. If you do not
     * include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the
     * <code>IsTruncated</code> response element returns <code>true</code>
     * and <code>Marker</code> contains a value to include in the subsequent
     * call that tells the service where to continue from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If additional items exist beyond
     *         the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>. <p>This parameter is optional. If you do not
     *         include it, it defaults to 100. Note that IAM might return fewer
     *         results, even when there are more results available. In that case, the
     *         <code>IsTruncated</code> response element returns <code>true</code>
     *         and <code>Marker</code> contains a value to include in the subsequent
     *         call that tells the service where to continue from.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If additional items exist beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>. <p>This parameter is optional. If you do not
     * include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the
     * <code>IsTruncated</code> response element returns <code>true</code>
     * and <code>Marker</code> contains a value to include in the subsequent
     * call that tells the service where to continue from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If additional items exist beyond
     *         the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>. <p>This parameter is optional. If you do not
     *         include it, it defaults to 100. Note that IAM might return fewer
     *         results, even when there are more results available. In that case, the
     *         <code>IsTruncated</code> response element returns <code>true</code>
     *         and <code>Marker</code> contains a value to include in the subsequent
     *         call that tells the service where to continue from.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If additional items exist beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>. <p>This parameter is optional. If you do not
     * include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the
     * <code>IsTruncated</code> response element returns <code>true</code>
     * and <code>Marker</code> contains a value to include in the subsequent
     * call that tells the service where to continue from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If additional items exist beyond
     *         the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>. <p>This parameter is optional. If you do not
     *         include it, it defaults to 100. Note that IAM might return fewer
     *         results, even when there are more results available. In that case, the
     *         <code>IsTruncated</code> response element returns <code>true</code>
     *         and <code>Marker</code> contains a value to include in the subsequent
     *         call that tells the service where to continue from.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEntitiesForPolicyRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicyArn() != null) sb.append("PolicyArn: " + getPolicyArn() + ",");
        if (getEntityFilter() != null) sb.append("EntityFilter: " + getEntityFilter() + ",");
        if (getPathPrefix() != null) sb.append("PathPrefix: " + getPathPrefix() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode()); 
        hashCode = prime * hashCode + ((getEntityFilter() == null) ? 0 : getEntityFilter().hashCode()); 
        hashCode = prime * hashCode + ((getPathPrefix() == null) ? 0 : getPathPrefix().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListEntitiesForPolicyRequest == false) return false;
        ListEntitiesForPolicyRequest other = (ListEntitiesForPolicyRequest)obj;
        
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null) return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false) return false; 
        if (other.getEntityFilter() == null ^ this.getEntityFilter() == null) return false;
        if (other.getEntityFilter() != null && other.getEntityFilter().equals(this.getEntityFilter()) == false) return false; 
        if (other.getPathPrefix() == null ^ this.getPathPrefix() == null) return false;
        if (other.getPathPrefix() != null && other.getPathPrefix().equals(this.getPathPrefix()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
    @Override
    public ListEntitiesForPolicyRequest clone() {
        
            return (ListEntitiesForPolicyRequest) super.clone();
    }

}
    