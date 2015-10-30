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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listPolicyVersions(ListPolicyVersionsRequest) ListPolicyVersions operation}.
 * <p>
 * Lists information about the versions of the specified managed policy,
 * including the version that is set as the policy's default version.
 * </p>
 * <p>
 * For more information about managed policies, refer to
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
 * in the <i>IAM User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listPolicyVersions(ListPolicyVersionsRequest)
 */
public class ListPolicyVersionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

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
    public ListPolicyVersionsRequest withPolicyArn(String policyArn) {
        this.policyArn = policyArn;
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
    public ListPolicyVersionsRequest withMarker(String marker) {
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
    public ListPolicyVersionsRequest withMaxItems(Integer maxItems) {
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
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPolicyVersionsRequest == false) return false;
        ListPolicyVersionsRequest other = (ListPolicyVersionsRequest)obj;
        
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null) return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
    @Override
    public ListPolicyVersionsRequest clone() {
        
            return (ListPolicyVersionsRequest) super.clone();
    }

}
    