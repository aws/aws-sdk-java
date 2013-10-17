/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.support.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.support.AWSSupport#describeTrustedAdvisorCheckRefreshStatuses(DescribeTrustedAdvisorCheckRefreshStatusesRequest) DescribeTrustedAdvisorCheckRefreshStatuses operation}.
 * <p>
 * Returns the status of all refresh requests Trusted Advisor checks called using <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_RefreshTrustedAdvisorCheck.html"> RefreshTrustedAdvisorCheck </a> .
 * </p>
 *
 * @see com.amazonaws.services.support.AWSSupport#describeTrustedAdvisorCheckRefreshStatuses(DescribeTrustedAdvisorCheckRefreshStatusesRequest)
 */
public class DescribeTrustedAdvisorCheckRefreshStatusesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * List of the <i>CheckId</i> values for the Trusted Advisor checks for
     * which you want to refresh the status. You obtain the <i>CheckId</i>
     * values by calling <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     * title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> checkIds;

    /**
     * List of the <i>CheckId</i> values for the Trusted Advisor checks for
     * which you want to refresh the status. You obtain the <i>CheckId</i>
     * values by calling <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     * title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     *
     * @return List of the <i>CheckId</i> values for the Trusted Advisor checks for
     *         which you want to refresh the status. You obtain the <i>CheckId</i>
     *         values by calling <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     *         title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     */
    public java.util.List<String> getCheckIds() {
        if (checkIds == null) {
              checkIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              checkIds.setAutoConstruct(true);
        }
        return checkIds;
    }
    
    /**
     * List of the <i>CheckId</i> values for the Trusted Advisor checks for
     * which you want to refresh the status. You obtain the <i>CheckId</i>
     * values by calling <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     * title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     *
     * @param checkIds List of the <i>CheckId</i> values for the Trusted Advisor checks for
     *         which you want to refresh the status. You obtain the <i>CheckId</i>
     *         values by calling <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     *         title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     */
    public void setCheckIds(java.util.Collection<String> checkIds) {
        if (checkIds == null) {
            this.checkIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> checkIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(checkIds.size());
        checkIdsCopy.addAll(checkIds);
        this.checkIds = checkIdsCopy;
    }
    
    /**
     * List of the <i>CheckId</i> values for the Trusted Advisor checks for
     * which you want to refresh the status. You obtain the <i>CheckId</i>
     * values by calling <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     * title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checkIds List of the <i>CheckId</i> values for the Trusted Advisor checks for
     *         which you want to refresh the status. You obtain the <i>CheckId</i>
     *         values by calling <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     *         title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTrustedAdvisorCheckRefreshStatusesRequest withCheckIds(String... checkIds) {
        if (getCheckIds() == null) setCheckIds(new java.util.ArrayList<String>(checkIds.length));
        for (String value : checkIds) {
            getCheckIds().add(value);
        }
        return this;
    }
    
    /**
     * List of the <i>CheckId</i> values for the Trusted Advisor checks for
     * which you want to refresh the status. You obtain the <i>CheckId</i>
     * values by calling <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     * title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checkIds List of the <i>CheckId</i> values for the Trusted Advisor checks for
     *         which you want to refresh the status. You obtain the <i>CheckId</i>
     *         values by calling <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     *         title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTrustedAdvisorCheckRefreshStatusesRequest withCheckIds(java.util.Collection<String> checkIds) {
        if (checkIds == null) {
            this.checkIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> checkIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(checkIds.size());
            checkIdsCopy.addAll(checkIds);
            this.checkIds = checkIdsCopy;
        }

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
        if (getCheckIds() != null) sb.append("CheckIds: " + getCheckIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCheckIds() == null) ? 0 : getCheckIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTrustedAdvisorCheckRefreshStatusesRequest == false) return false;
        DescribeTrustedAdvisorCheckRefreshStatusesRequest other = (DescribeTrustedAdvisorCheckRefreshStatusesRequest)obj;
        
        if (other.getCheckIds() == null ^ this.getCheckIds() == null) return false;
        if (other.getCheckIds() != null && other.getCheckIds().equals(this.getCheckIds()) == false) return false; 
        return true;
    }
    
}
    