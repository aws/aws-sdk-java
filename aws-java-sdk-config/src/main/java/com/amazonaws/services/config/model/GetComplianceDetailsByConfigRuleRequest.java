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
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#getComplianceDetailsByConfigRule(GetComplianceDetailsByConfigRuleRequest) GetComplianceDetailsByConfigRule operation}.
 * <p>
 * Returns the evaluation results for the specified AWS Config rule. The
 * results indicate which AWS resources were evaluated by the rule, when
 * each resource was last evaluated, and whether each resource complies
 * with the rule.
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#getComplianceDetailsByConfigRule(GetComplianceDetailsByConfigRuleRequest)
 */
public class GetComplianceDetailsByConfigRuleRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the AWS Config rule for which you want compliance
     * information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String configRuleName;

    /**
     * Specify to filter the results by compliance. The valid values are
     * <code>Compliant</code>, <code>NonCompliant</code>, and
     * <code>NotApplicable</code>.
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
     * The name of the AWS Config rule for which you want compliance
     * information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The name of the AWS Config rule for which you want compliance
     *         information.
     */
    public String getConfigRuleName() {
        return configRuleName;
    }
    
    /**
     * The name of the AWS Config rule for which you want compliance
     * information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param configRuleName The name of the AWS Config rule for which you want compliance
     *         information.
     */
    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }
    
    /**
     * The name of the AWS Config rule for which you want compliance
     * information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param configRuleName The name of the AWS Config rule for which you want compliance
     *         information.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetComplianceDetailsByConfigRuleRequest withConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }

    /**
     * Specify to filter the results by compliance. The valid values are
     * <code>Compliant</code>, <code>NonCompliant</code>, and
     * <code>NotApplicable</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @return Specify to filter the results by compliance. The valid values are
     *         <code>Compliant</code>, <code>NonCompliant</code>, and
     *         <code>NotApplicable</code>.
     */
    public java.util.List<String> getComplianceTypes() {
        if (complianceTypes == null) {
              complianceTypes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              complianceTypes.setAutoConstruct(true);
        }
        return complianceTypes;
    }
    
    /**
     * Specify to filter the results by compliance. The valid values are
     * <code>Compliant</code>, <code>NonCompliant</code>, and
     * <code>NotApplicable</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param complianceTypes Specify to filter the results by compliance. The valid values are
     *         <code>Compliant</code>, <code>NonCompliant</code>, and
     *         <code>NotApplicable</code>.
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
     * Specify to filter the results by compliance. The valid values are
     * <code>Compliant</code>, <code>NonCompliant</code>, and
     * <code>NotApplicable</code>.
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
     * @param complianceTypes Specify to filter the results by compliance. The valid values are
     *         <code>Compliant</code>, <code>NonCompliant</code>, and
     *         <code>NotApplicable</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetComplianceDetailsByConfigRuleRequest withComplianceTypes(String... complianceTypes) {
        if (getComplianceTypes() == null) setComplianceTypes(new java.util.ArrayList<String>(complianceTypes.length));
        for (String value : complianceTypes) {
            getComplianceTypes().add(value);
        }
        return this;
    }
    
    /**
     * Specify to filter the results by compliance. The valid values are
     * <code>Compliant</code>, <code>NonCompliant</code>, and
     * <code>NotApplicable</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param complianceTypes Specify to filter the results by compliance. The valid values are
     *         <code>Compliant</code>, <code>NonCompliant</code>, and
     *         <code>NotApplicable</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetComplianceDetailsByConfigRuleRequest withComplianceTypes(java.util.Collection<String> complianceTypes) {
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
     * Specify to filter the results by compliance. The valid values are
     * <code>Compliant</code>, <code>NonCompliant</code>, and
     * <code>NotApplicable</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param complianceTypes Specify to filter the results by compliance. The valid values are
     *         <code>Compliant</code>, <code>NonCompliant</code>, and
     *         <code>NotApplicable</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetComplianceDetailsByConfigRuleRequest withComplianceTypes(ComplianceType... complianceTypes) {
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
    public GetComplianceDetailsByConfigRuleRequest withLimit(Integer limit) {
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
    public GetComplianceDetailsByConfigRuleRequest withNextToken(String nextToken) {
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
        if (getConfigRuleName() != null) sb.append("ConfigRuleName: " + getConfigRuleName() + ",");
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
        
        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode()); 
        hashCode = prime * hashCode + ((getComplianceTypes() == null) ? 0 : getComplianceTypes().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetComplianceDetailsByConfigRuleRequest == false) return false;
        GetComplianceDetailsByConfigRuleRequest other = (GetComplianceDetailsByConfigRuleRequest)obj;
        
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null) return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false) return false; 
        if (other.getComplianceTypes() == null ^ this.getComplianceTypes() == null) return false;
        if (other.getComplianceTypes() != null && other.getComplianceTypes().equals(this.getComplianceTypes()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public GetComplianceDetailsByConfigRuleRequest clone() {
        
            return (GetComplianceDetailsByConfigRuleRequest) super.clone();
    }

}
    