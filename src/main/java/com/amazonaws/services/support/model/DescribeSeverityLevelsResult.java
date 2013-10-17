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
public class DescribeSeverityLevelsResult implements Serializable {

    /**
     * List of available severity levels for the support case. Available
     * severity levels are defined by your service level agreement with AWS.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SeverityLevel> severityLevels;

    /**
     * List of available severity levels for the support case. Available
     * severity levels are defined by your service level agreement with AWS.
     *
     * @return List of available severity levels for the support case. Available
     *         severity levels are defined by your service level agreement with AWS.
     */
    public java.util.List<SeverityLevel> getSeverityLevels() {
        if (severityLevels == null) {
              severityLevels = new com.amazonaws.internal.ListWithAutoConstructFlag<SeverityLevel>();
              severityLevels.setAutoConstruct(true);
        }
        return severityLevels;
    }
    
    /**
     * List of available severity levels for the support case. Available
     * severity levels are defined by your service level agreement with AWS.
     *
     * @param severityLevels List of available severity levels for the support case. Available
     *         severity levels are defined by your service level agreement with AWS.
     */
    public void setSeverityLevels(java.util.Collection<SeverityLevel> severityLevels) {
        if (severityLevels == null) {
            this.severityLevels = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SeverityLevel> severityLevelsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SeverityLevel>(severityLevels.size());
        severityLevelsCopy.addAll(severityLevels);
        this.severityLevels = severityLevelsCopy;
    }
    
    /**
     * List of available severity levels for the support case. Available
     * severity levels are defined by your service level agreement with AWS.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param severityLevels List of available severity levels for the support case. Available
     *         severity levels are defined by your service level agreement with AWS.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSeverityLevelsResult withSeverityLevels(SeverityLevel... severityLevels) {
        if (getSeverityLevels() == null) setSeverityLevels(new java.util.ArrayList<SeverityLevel>(severityLevels.length));
        for (SeverityLevel value : severityLevels) {
            getSeverityLevels().add(value);
        }
        return this;
    }
    
    /**
     * List of available severity levels for the support case. Available
     * severity levels are defined by your service level agreement with AWS.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param severityLevels List of available severity levels for the support case. Available
     *         severity levels are defined by your service level agreement with AWS.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSeverityLevelsResult withSeverityLevels(java.util.Collection<SeverityLevel> severityLevels) {
        if (severityLevels == null) {
            this.severityLevels = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SeverityLevel> severityLevelsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SeverityLevel>(severityLevels.size());
            severityLevelsCopy.addAll(severityLevels);
            this.severityLevels = severityLevelsCopy;
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
        if (getSeverityLevels() != null) sb.append("SeverityLevels: " + getSeverityLevels() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSeverityLevels() == null) ? 0 : getSeverityLevels().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSeverityLevelsResult == false) return false;
        DescribeSeverityLevelsResult other = (DescribeSeverityLevelsResult)obj;
        
        if (other.getSeverityLevels() == null ^ this.getSeverityLevels() == null) return false;
        if (other.getSeverityLevels() != null && other.getSeverityLevels().equals(this.getSeverityLevels()) == false) return false; 
        return true;
    }
    
}
    