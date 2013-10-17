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


/**
 * <p>
 * Returns the objects or data listed below if successful. Otherwise, returns an error.
 * </p>
 */
public class DescribeTrustedAdvisorCheckRefreshStatusesResult implements Serializable {

    /**
     * List of the statuses of the Trusted Advisor checks you've specified
     * for refresh. Status values are: <ul> <li><b>in_progress</b>. The
     * refresh of the check is currently executing. </li>
     * <li><b>successful</b>. The refresh of the check has completed
     * successfully.</li> <li><b>enqueued</b>. The refresh check is queued
     * for execution. </li> <li><b>abandoned</b>. An error has prevented the
     * check from refreshing. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckRefreshStatus> statuses;

    /**
     * List of the statuses of the Trusted Advisor checks you've specified
     * for refresh. Status values are: <ul> <li><b>in_progress</b>. The
     * refresh of the check is currently executing. </li>
     * <li><b>successful</b>. The refresh of the check has completed
     * successfully.</li> <li><b>enqueued</b>. The refresh check is queued
     * for execution. </li> <li><b>abandoned</b>. An error has prevented the
     * check from refreshing. </li> </ul>
     *
     * @return List of the statuses of the Trusted Advisor checks you've specified
     *         for refresh. Status values are: <ul> <li><b>in_progress</b>. The
     *         refresh of the check is currently executing. </li>
     *         <li><b>successful</b>. The refresh of the check has completed
     *         successfully.</li> <li><b>enqueued</b>. The refresh check is queued
     *         for execution. </li> <li><b>abandoned</b>. An error has prevented the
     *         check from refreshing. </li> </ul>
     */
    public java.util.List<TrustedAdvisorCheckRefreshStatus> getStatuses() {
        if (statuses == null) {
              statuses = new com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckRefreshStatus>();
              statuses.setAutoConstruct(true);
        }
        return statuses;
    }
    
    /**
     * List of the statuses of the Trusted Advisor checks you've specified
     * for refresh. Status values are: <ul> <li><b>in_progress</b>. The
     * refresh of the check is currently executing. </li>
     * <li><b>successful</b>. The refresh of the check has completed
     * successfully.</li> <li><b>enqueued</b>. The refresh check is queued
     * for execution. </li> <li><b>abandoned</b>. An error has prevented the
     * check from refreshing. </li> </ul>
     *
     * @param statuses List of the statuses of the Trusted Advisor checks you've specified
     *         for refresh. Status values are: <ul> <li><b>in_progress</b>. The
     *         refresh of the check is currently executing. </li>
     *         <li><b>successful</b>. The refresh of the check has completed
     *         successfully.</li> <li><b>enqueued</b>. The refresh check is queued
     *         for execution. </li> <li><b>abandoned</b>. An error has prevented the
     *         check from refreshing. </li> </ul>
     */
    public void setStatuses(java.util.Collection<TrustedAdvisorCheckRefreshStatus> statuses) {
        if (statuses == null) {
            this.statuses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckRefreshStatus> statusesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckRefreshStatus>(statuses.size());
        statusesCopy.addAll(statuses);
        this.statuses = statusesCopy;
    }
    
    /**
     * List of the statuses of the Trusted Advisor checks you've specified
     * for refresh. Status values are: <ul> <li><b>in_progress</b>. The
     * refresh of the check is currently executing. </li>
     * <li><b>successful</b>. The refresh of the check has completed
     * successfully.</li> <li><b>enqueued</b>. The refresh check is queued
     * for execution. </li> <li><b>abandoned</b>. An error has prevented the
     * check from refreshing. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statuses List of the statuses of the Trusted Advisor checks you've specified
     *         for refresh. Status values are: <ul> <li><b>in_progress</b>. The
     *         refresh of the check is currently executing. </li>
     *         <li><b>successful</b>. The refresh of the check has completed
     *         successfully.</li> <li><b>enqueued</b>. The refresh check is queued
     *         for execution. </li> <li><b>abandoned</b>. An error has prevented the
     *         check from refreshing. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTrustedAdvisorCheckRefreshStatusesResult withStatuses(TrustedAdvisorCheckRefreshStatus... statuses) {
        if (getStatuses() == null) setStatuses(new java.util.ArrayList<TrustedAdvisorCheckRefreshStatus>(statuses.length));
        for (TrustedAdvisorCheckRefreshStatus value : statuses) {
            getStatuses().add(value);
        }
        return this;
    }
    
    /**
     * List of the statuses of the Trusted Advisor checks you've specified
     * for refresh. Status values are: <ul> <li><b>in_progress</b>. The
     * refresh of the check is currently executing. </li>
     * <li><b>successful</b>. The refresh of the check has completed
     * successfully.</li> <li><b>enqueued</b>. The refresh check is queued
     * for execution. </li> <li><b>abandoned</b>. An error has prevented the
     * check from refreshing. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statuses List of the statuses of the Trusted Advisor checks you've specified
     *         for refresh. Status values are: <ul> <li><b>in_progress</b>. The
     *         refresh of the check is currently executing. </li>
     *         <li><b>successful</b>. The refresh of the check has completed
     *         successfully.</li> <li><b>enqueued</b>. The refresh check is queued
     *         for execution. </li> <li><b>abandoned</b>. An error has prevented the
     *         check from refreshing. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTrustedAdvisorCheckRefreshStatusesResult withStatuses(java.util.Collection<TrustedAdvisorCheckRefreshStatus> statuses) {
        if (statuses == null) {
            this.statuses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckRefreshStatus> statusesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckRefreshStatus>(statuses.size());
            statusesCopy.addAll(statuses);
            this.statuses = statusesCopy;
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
        if (getStatuses() != null) sb.append("Statuses: " + getStatuses() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTrustedAdvisorCheckRefreshStatusesResult == false) return false;
        DescribeTrustedAdvisorCheckRefreshStatusesResult other = (DescribeTrustedAdvisorCheckRefreshStatusesResult)obj;
        
        if (other.getStatuses() == null ^ this.getStatuses() == null) return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false) return false; 
        return true;
    }
    
}
    