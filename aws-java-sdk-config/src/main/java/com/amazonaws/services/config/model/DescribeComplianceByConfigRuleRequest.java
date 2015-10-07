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
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#describeComplianceByConfigRule(DescribeComplianceByConfigRuleRequest) DescribeComplianceByConfigRule operation}.
 * <p>
 * Indicates whether the specified AWS Config rules are compliant. If a
 * rule is noncompliant, this action returns the number of AWS resources
 * that do not comply with the rule.
 * </p>
 * <p>
 * A rule is compliant if all of the evaluated resources comply with it,
 * and it is noncompliant if any of these resources do not comply.
 * </p>
 * <p>
 * If AWS Config has no current evaluation results for the rule, it
 * returns <code>InsufficientData</code> . This result might indicate one
 * of the following conditions:
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
 * @see com.amazonaws.services.config.AmazonConfig#describeComplianceByConfigRule(DescribeComplianceByConfigRuleRequest)
 */
public class DescribeComplianceByConfigRuleRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Specify one or more AWS Config rule names to filter the results by
     * rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 25<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> configRuleNames;

    /**
     * Filters the results by compliance. The valid values are
     * <code>Compliant</code> and <code>NonCompliant</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> complianceTypes;

    /**
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     */
    private String nextToken;

    /**
     * Specify one or more AWS Config rule names to filter the results by
     * rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 25<br/>
     *
     * @return Specify one or more AWS Config rule names to filter the results by
     *         rule.
     */
    public java.util.List<String> getConfigRuleNames() {
        if (configRuleNames == null) {
              configRuleNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              configRuleNames.setAutoConstruct(true);
        }
        return configRuleNames;
    }
    
    /**
     * Specify one or more AWS Config rule names to filter the results by
     * rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 25<br/>
     *
     * @param configRuleNames Specify one or more AWS Config rule names to filter the results by
     *         rule.
     */
    public void setConfigRuleNames(java.util.Collection<String> configRuleNames) {
        if (configRuleNames == null) {
            this.configRuleNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> configRuleNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(configRuleNames.size());
        configRuleNamesCopy.addAll(configRuleNames);
        this.configRuleNames = configRuleNamesCopy;
    }
    
    /**
     * Specify one or more AWS Config rule names to filter the results by
     * rule.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setConfigRuleNames(java.util.Collection)} or {@link
     * #withConfigRuleNames(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 25<br/>
     *
     * @param configRuleNames Specify one or more AWS Config rule names to filter the results by
     *         rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeComplianceByConfigRuleRequest withConfigRuleNames(String... configRuleNames) {
        if (getConfigRuleNames() == null) setConfigRuleNames(new java.util.ArrayList<String>(configRuleNames.length));
        for (String value : configRuleNames) {
            getConfigRuleNames().add(value);
        }
        return this;
    }
    
    /**
     * Specify one or more AWS Config rule names to filter the results by
     * rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 25<br/>
     *
     * @param configRuleNames Specify one or more AWS Config rule names to filter the results by
     *         rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeComplianceByConfigRuleRequest withConfigRuleNames(java.util.Collection<String> configRuleNames) {
        if (configRuleNames == null) {
            this.configRuleNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> configRuleNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(configRuleNames.size());
            configRuleNamesCopy.addAll(configRuleNames);
            this.configRuleNames = configRuleNamesCopy;
        }

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
    public DescribeComplianceByConfigRuleRequest withComplianceTypes(String... complianceTypes) {
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
    public DescribeComplianceByConfigRuleRequest withComplianceTypes(java.util.Collection<String> complianceTypes) {
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
    public DescribeComplianceByConfigRuleRequest withComplianceTypes(ComplianceType... complianceTypes) {
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
    public DescribeComplianceByConfigRuleRequest withNextToken(String nextToken) {
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
        if (getConfigRuleNames() != null) sb.append("ConfigRuleNames: " + getConfigRuleNames() + ",");
        if (getComplianceTypes() != null) sb.append("ComplianceTypes: " + getComplianceTypes() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConfigRuleNames() == null) ? 0 : getConfigRuleNames().hashCode()); 
        hashCode = prime * hashCode + ((getComplianceTypes() == null) ? 0 : getComplianceTypes().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeComplianceByConfigRuleRequest == false) return false;
        DescribeComplianceByConfigRuleRequest other = (DescribeComplianceByConfigRuleRequest)obj;
        
        if (other.getConfigRuleNames() == null ^ this.getConfigRuleNames() == null) return false;
        if (other.getConfigRuleNames() != null && other.getConfigRuleNames().equals(this.getConfigRuleNames()) == false) return false; 
        if (other.getComplianceTypes() == null ^ this.getComplianceTypes() == null) return false;
        if (other.getComplianceTypes() != null && other.getComplianceTypes().equals(this.getComplianceTypes()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeComplianceByConfigRuleRequest clone() {
        
            return (DescribeComplianceByConfigRuleRequest) super.clone();
    }

}
    