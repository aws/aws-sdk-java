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
package com.amazonaws.services.config.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#describeComplianceByResource(DescribeComplianceByResourceRequest) DescribeComplianceByResource operation}.
 * <p>
 * Indicates whether the specified AWS resources are compliant. If a
 * resource is noncompliant, this action returns the number of AWS Config
 * rules that the resource does not comply with.
 * </p>
 * <p>
 * A resource is compliant if it complies with all the AWS Config rules
 * that evaluate it. It is noncompliant if it does not comply with one or
 * more of these rules.
 * </p>
 * <p>
 * If AWS Config has no current evaluation results for the resource, it
 * returns <code>InsufficientData</code> . This result might indicate one
 * of the following conditions about the rules that evaluate the
 * resource:
 * <ul>
 * <li>AWS Config has never invoked an evaluation for the rule. To check
 * whether it has, use the
 * <code>DescribeConfigRuleEvaluationStatus</code> action to get the
 * <code>LastSuccessfulInvocationTime</code> and
 * <code>LastFailedInvocationTime</code> .</li>
 * <li>The rule's AWS Lambda function is failing to send evaluation
 * results to AWS Config. Verify that the role that you assigned to your
 * configuration recorder includes the <code>config:PutEvaluations</code>
 * permission. If the rule is a customer managed rule, verify that the
 * AWS Lambda execution role includes the
 * <code>config:PutEvaluations</code> permission.</li>
 * <li>The rule's AWS Lambda function has returned
 * <code>NOT_APPLICABLE</code> for all evaluation results. This can occur
 * if the resources were deleted or removed from the rule's scope.</li>
 * 
 * </ul>
 * 
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#describeComplianceByResource(DescribeComplianceByResourceRequest)
 */
public class DescribeComplianceByResourceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The types of AWS resources for which you want compliance information;
     * for example, <code>AWS::EC2::Instance</code>. For this action, you can
     * specify that the resource type is an AWS account by specifying
     * <code>AWS::::Account</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String resourceType;

    /**
     * The ID of the AWS resource for which you want compliance information.
     * You can specify only one resource ID. If you specify a resource ID,
     * you must also specify a type for <code>ResourceType</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String resourceId;

    /**
     * Filters the results by compliance. The valid values are
     * <code>Compliant</code> and <code>NonCompliant</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> complianceTypes;

    /**
     * The maximum number of evaluation results returned on each page. The
     * default is 10. You cannot specify a limit greater than 100. If you
     * specify 0, AWS Config uses the default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer limit;

    /**
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     */
    private String nextToken;

    /**
     * The types of AWS resources for which you want compliance information;
     * for example, <code>AWS::EC2::Instance</code>. For this action, you can
     * specify that the resource type is an AWS account by specifying
     * <code>AWS::::Account</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The types of AWS resources for which you want compliance information;
     *         for example, <code>AWS::EC2::Instance</code>. For this action, you can
     *         specify that the resource type is an AWS account by specifying
     *         <code>AWS::::Account</code>.
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The types of AWS resources for which you want compliance information;
     * for example, <code>AWS::EC2::Instance</code>. For this action, you can
     * specify that the resource type is an AWS account by specifying
     * <code>AWS::::Account</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceType The types of AWS resources for which you want compliance information;
     *         for example, <code>AWS::EC2::Instance</code>. For this action, you can
     *         specify that the resource type is an AWS account by specifying
     *         <code>AWS::::Account</code>.
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The types of AWS resources for which you want compliance information;
     * for example, <code>AWS::EC2::Instance</code>. For this action, you can
     * specify that the resource type is an AWS account by specifying
     * <code>AWS::::Account</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceType The types of AWS resources for which you want compliance information;
     *         for example, <code>AWS::EC2::Instance</code>. For this action, you can
     *         specify that the resource type is an AWS account by specifying
     *         <code>AWS::::Account</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeComplianceByResourceRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The ID of the AWS resource for which you want compliance information.
     * You can specify only one resource ID. If you specify a resource ID,
     * you must also specify a type for <code>ResourceType</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The ID of the AWS resource for which you want compliance information.
     *         You can specify only one resource ID. If you specify a resource ID,
     *         you must also specify a type for <code>ResourceType</code>.
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The ID of the AWS resource for which you want compliance information.
     * You can specify only one resource ID. If you specify a resource ID,
     * you must also specify a type for <code>ResourceType</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceId The ID of the AWS resource for which you want compliance information.
     *         You can specify only one resource ID. If you specify a resource ID,
     *         you must also specify a type for <code>ResourceType</code>.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The ID of the AWS resource for which you want compliance information.
     * You can specify only one resource ID. If you specify a resource ID,
     * you must also specify a type for <code>ResourceType</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceId The ID of the AWS resource for which you want compliance information.
     *         You can specify only one resource ID. If you specify a resource ID,
     *         you must also specify a type for <code>ResourceType</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeComplianceByResourceRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Filters the results by compliance. The valid values are
     * <code>Compliant</code> and <code>NonCompliant</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @return Filters the results by compliance. The valid values are
     *         <code>Compliant</code> and <code>NonCompliant</code>.
     */
    public java.util.List<String> getComplianceTypes() {
        if (complianceTypes == null) {
              complianceTypes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              complianceTypes.setAutoConstruct(true);
        }
        return complianceTypes;
    }
    
    /**
     * Filters the results by compliance. The valid values are
     * <code>Compliant</code> and <code>NonCompliant</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param complianceTypes Filters the results by compliance. The valid values are
     *         <code>Compliant</code> and <code>NonCompliant</code>.
     */
    public void setComplianceTypes(java.util.Collection<String> complianceTypes) {
        if (complianceTypes == null) {
            this.complianceTypes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> complianceTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(complianceTypes.size());
        complianceTypesCopy.addAll(complianceTypes);
        this.complianceTypes = complianceTypesCopy;
    }
    
    /**
     * Filters the results by compliance. The valid values are
     * <code>Compliant</code> and <code>NonCompliant</code>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setComplianceTypes(java.util.Collection)} or {@link
     * #withComplianceTypes(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param complianceTypes Filters the results by compliance. The valid values are
     *         <code>Compliant</code> and <code>NonCompliant</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeComplianceByResourceRequest withComplianceTypes(String... complianceTypes) {
        if (getComplianceTypes() == null) setComplianceTypes(new java.util.ArrayList<String>(complianceTypes.length));
        for (String value : complianceTypes) {
            getComplianceTypes().add(value);
        }
        return this;
    }
    
    /**
     * Filters the results by compliance. The valid values are
     * <code>Compliant</code> and <code>NonCompliant</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param complianceTypes Filters the results by compliance. The valid values are
     *         <code>Compliant</code> and <code>NonCompliant</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeComplianceByResourceRequest withComplianceTypes(java.util.Collection<String> complianceTypes) {
        if (complianceTypes == null) {
            this.complianceTypes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> complianceTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(complianceTypes.size());
            complianceTypesCopy.addAll(complianceTypes);
            this.complianceTypes = complianceTypesCopy;
        }

        return this;
    }

    /**
     * Filters the results by compliance. The valid values are
     * <code>Compliant</code> and <code>NonCompliant</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param complianceTypes Filters the results by compliance. The valid values are
     *         <code>Compliant</code> and <code>NonCompliant</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeComplianceByResourceRequest withComplianceTypes(ComplianceType... complianceTypes) {
        java.util.ArrayList<String> complianceTypesCopy = new java.util.ArrayList<String>(complianceTypes.length);
        for (ComplianceType member : complianceTypes) {
            complianceTypesCopy.add(member.toString());
        }
        if (getComplianceTypes() == null) {
            setComplianceTypes(complianceTypesCopy);
        } else {
            getComplianceTypes().addAll(complianceTypesCopy);
        }
        return this;
    }

    /**
     * The maximum number of evaluation results returned on each page. The
     * default is 10. You cannot specify a limit greater than 100. If you
     * specify 0, AWS Config uses the default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return The maximum number of evaluation results returned on each page. The
     *         default is 10. You cannot specify a limit greater than 100. If you
     *         specify 0, AWS Config uses the default.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of evaluation results returned on each page. The
     * default is 10. You cannot specify a limit greater than 100. If you
     * specify 0, AWS Config uses the default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param limit The maximum number of evaluation results returned on each page. The
     *         default is 10. You cannot specify a limit greater than 100. If you
     *         specify 0, AWS Config uses the default.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of evaluation results returned on each page. The
     * default is 10. You cannot specify a limit greater than 100. If you
     * specify 0, AWS Config uses the default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param limit The maximum number of evaluation results returned on each page. The
     *         default is 10. You cannot specify a limit greater than 100. If you
     *         specify 0, AWS Config uses the default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeComplianceByResourceRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     *
     * @return The <code>nextToken</code> string returned on a previous page that you
     *         use to get the next page of results in a paginated response.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     *
     * @param nextToken The <code>nextToken</code> string returned on a previous page that you
     *         use to get the next page of results in a paginated response.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The <code>nextToken</code> string returned on a previous page that you
     *         use to get the next page of results in a paginated response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeComplianceByResourceRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (getComplianceTypes() != null) sb.append("ComplianceTypes: " + getComplianceTypes() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getComplianceTypes() == null) ? 0 : getComplianceTypes().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeComplianceByResourceRequest == false) return false;
        DescribeComplianceByResourceRequest other = (DescribeComplianceByResourceRequest)obj;
        
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        if (other.getComplianceTypes() == null ^ this.getComplianceTypes() == null) return false;
        if (other.getComplianceTypes() != null && other.getComplianceTypes().equals(this.getComplianceTypes()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeComplianceByResourceRequest clone() {
        
            return (DescribeComplianceByResourceRequest) super.clone();
    }

}
    