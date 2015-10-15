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
package com.amazonaws.services.kms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.kms.AWSKMS#listRetirableGrants(ListRetirableGrantsRequest) ListRetirableGrants operation}.
 * <p>
 * Returns a list of all grants for which the grant's
 * <code>RetiringPrincipal</code> matches the one specified.
 * </p>
 * <p>
 * A typical use is to list all grants that you are able to retire. To
 * retire a grant, use RetireGrant.
 * </p>
 *
 * @see com.amazonaws.services.kms.AWSKMS#listRetirableGrants(ListRetirableGrantsRequest)
 */
public class ListRetirableGrantsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * When paginating results, specify the maximum number of items to return
     * in the response. If additional items exist beyond the number you
     * specify, the <code>Truncated</code> element in the response is set to
     * true.<p>This value is optional. If you include a value, it must be
     * between 1 and 100, inclusive. If you do not include a value, it
     * defaults to 50.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer limit;

    /**
     * Use this parameter only when paginating results and only in a
     * subsequent request after you receive a response with truncated
     * results. Set it to the value of <code>NextMarker</code> from the
     * response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     */
    private String marker;

    /**
     * The retiring principal for which to list grants. <p>To specify the
     * retiring principal, use the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed
     * role users. For examples of the ARN syntax for specifying a principal,
     * go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS
     * Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>Amazon Web Services General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String retiringPrincipal;

    /**
     * When paginating results, specify the maximum number of items to return
     * in the response. If additional items exist beyond the number you
     * specify, the <code>Truncated</code> element in the response is set to
     * true.<p>This value is optional. If you include a value, it must be
     * between 1 and 100, inclusive. If you do not include a value, it
     * defaults to 50.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return When paginating results, specify the maximum number of items to return
     *         in the response. If additional items exist beyond the number you
     *         specify, the <code>Truncated</code> element in the response is set to
     *         true.<p>This value is optional. If you include a value, it must be
     *         between 1 and 100, inclusive. If you do not include a value, it
     *         defaults to 50.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * When paginating results, specify the maximum number of items to return
     * in the response. If additional items exist beyond the number you
     * specify, the <code>Truncated</code> element in the response is set to
     * true.<p>This value is optional. If you include a value, it must be
     * between 1 and 100, inclusive. If you do not include a value, it
     * defaults to 50.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param limit When paginating results, specify the maximum number of items to return
     *         in the response. If additional items exist beyond the number you
     *         specify, the <code>Truncated</code> element in the response is set to
     *         true.<p>This value is optional. If you include a value, it must be
     *         between 1 and 100, inclusive. If you do not include a value, it
     *         defaults to 50.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * When paginating results, specify the maximum number of items to return
     * in the response. If additional items exist beyond the number you
     * specify, the <code>Truncated</code> element in the response is set to
     * true.<p>This value is optional. If you include a value, it must be
     * between 1 and 100, inclusive. If you do not include a value, it
     * defaults to 50.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param limit When paginating results, specify the maximum number of items to return
     *         in the response. If additional items exist beyond the number you
     *         specify, the <code>Truncated</code> element in the response is set to
     *         true.<p>This value is optional. If you include a value, it must be
     *         between 1 and 100, inclusive. If you do not include a value, it
     *         defaults to 50.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRetirableGrantsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Use this parameter only when paginating results and only in a
     * subsequent request after you receive a response with truncated
     * results. Set it to the value of <code>NextMarker</code> from the
     * response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @return Use this parameter only when paginating results and only in a
     *         subsequent request after you receive a response with truncated
     *         results. Set it to the value of <code>NextMarker</code> from the
     *         response you just received.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Use this parameter only when paginating results and only in a
     * subsequent request after you receive a response with truncated
     * results. Set it to the value of <code>NextMarker</code> from the
     * response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @param marker Use this parameter only when paginating results and only in a
     *         subsequent request after you receive a response with truncated
     *         results. Set it to the value of <code>NextMarker</code> from the
     *         response you just received.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Use this parameter only when paginating results and only in a
     * subsequent request after you receive a response with truncated
     * results. Set it to the value of <code>NextMarker</code> from the
     * response you just received.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @param marker Use this parameter only when paginating results and only in a
     *         subsequent request after you receive a response with truncated
     *         results. Set it to the value of <code>NextMarker</code> from the
     *         response you just received.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRetirableGrantsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * The retiring principal for which to list grants. <p>To specify the
     * retiring principal, use the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed
     * role users. For examples of the ARN syntax for specifying a principal,
     * go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS
     * Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>Amazon Web Services General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The retiring principal for which to list grants. <p>To specify the
     *         retiring principal, use the <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     *         include AWS accounts (root), IAM users, federated users, and assumed
     *         role users. For examples of the ARN syntax for specifying a principal,
     *         go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS
     *         Identity and Access Management (IAM)</a> in the Example ARNs section
     *         of the <i>Amazon Web Services General Reference</i>.
     */
    public String getRetiringPrincipal() {
        return retiringPrincipal;
    }
    
    /**
     * The retiring principal for which to list grants. <p>To specify the
     * retiring principal, use the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed
     * role users. For examples of the ARN syntax for specifying a principal,
     * go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS
     * Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>Amazon Web Services General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param retiringPrincipal The retiring principal for which to list grants. <p>To specify the
     *         retiring principal, use the <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     *         include AWS accounts (root), IAM users, federated users, and assumed
     *         role users. For examples of the ARN syntax for specifying a principal,
     *         go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS
     *         Identity and Access Management (IAM)</a> in the Example ARNs section
     *         of the <i>Amazon Web Services General Reference</i>.
     */
    public void setRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
    }
    
    /**
     * The retiring principal for which to list grants. <p>To specify the
     * retiring principal, use the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed
     * role users. For examples of the ARN syntax for specifying a principal,
     * go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS
     * Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>Amazon Web Services General Reference</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param retiringPrincipal The retiring principal for which to list grants. <p>To specify the
     *         retiring principal, use the <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     *         include AWS accounts (root), IAM users, federated users, and assumed
     *         role users. For examples of the ARN syntax for specifying a principal,
     *         go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS
     *         Identity and Access Management (IAM)</a> in the Example ARNs section
     *         of the <i>Amazon Web Services General Reference</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRetirableGrantsRequest withRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
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
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getRetiringPrincipal() != null) sb.append("RetiringPrincipal: " + getRetiringPrincipal() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getRetiringPrincipal() == null) ? 0 : getRetiringPrincipal().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListRetirableGrantsRequest == false) return false;
        ListRetirableGrantsRequest other = (ListRetirableGrantsRequest)obj;
        
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getRetiringPrincipal() == null ^ this.getRetiringPrincipal() == null) return false;
        if (other.getRetiringPrincipal() != null && other.getRetiringPrincipal().equals(this.getRetiringPrincipal()) == false) return false; 
        return true;
    }
    
    @Override
    public ListRetirableGrantsRequest clone() {
        
            return (ListRetirableGrantsRequest) super.clone();
    }

}
    