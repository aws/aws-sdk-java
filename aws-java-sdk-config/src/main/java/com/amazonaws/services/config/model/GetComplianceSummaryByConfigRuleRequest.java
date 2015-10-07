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
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#getComplianceSummaryByConfigRule(GetComplianceSummaryByConfigRuleRequest) GetComplianceSummaryByConfigRule operation}.
 * <p>
 * Returns the number of AWS Config rules that are compliant and
 * noncompliant, up to a maximum of 25 for each.
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#getComplianceSummaryByConfigRule(GetComplianceSummaryByConfigRuleRequest)
 */
public class GetComplianceSummaryByConfigRuleRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

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
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetComplianceSummaryByConfigRuleRequest == false) return false;
        GetComplianceSummaryByConfigRuleRequest other = (GetComplianceSummaryByConfigRuleRequest)obj;
        
        return true;
    }
    
    @Override
    public GetComplianceSummaryByConfigRuleRequest clone() {
        
            return (GetComplianceSummaryByConfigRuleRequest) super.clone();
    }

}
    