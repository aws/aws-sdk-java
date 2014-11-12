/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a list applications operation.
 * </p>
 */
public class ListApplicationsResult implements Serializable {

    /**
     * A list of application names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> applications;

    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list applications call to return the next set of applications in the
     * list.
     */
    private String nextToken;

    /**
     * A list of application names.
     *
     * @return A list of application names.
     */
    public java.util.List<String> getApplications() {
        if (applications == null) {
              applications = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              applications.setAutoConstruct(true);
        }
        return applications;
    }
    
    /**
     * A list of application names.
     *
     * @param applications A list of application names.
     */
    public void setApplications(java.util.Collection<String> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> applicationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(applications.size());
        applicationsCopy.addAll(applications);
        this.applications = applicationsCopy;
    }
    
    /**
     * A list of application names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applications A list of application names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListApplicationsResult withApplications(String... applications) {
        if (getApplications() == null) setApplications(new java.util.ArrayList<String>(applications.length));
        for (String value : applications) {
            getApplications().add(value);
        }
        return this;
    }
    
    /**
     * A list of application names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applications A list of application names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListApplicationsResult withApplications(java.util.Collection<String> applications) {
        if (applications == null) {
            this.applications = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> applicationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(applications.size());
            applicationsCopy.addAll(applications);
            this.applications = applicationsCopy;
        }

        return this;
    }

    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list applications call to return the next set of applications in the
     * list.
     *
     * @return If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list applications call to return the next set of applications in the
     *         list.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list applications call to return the next set of applications in the
     * list.
     *
     * @param nextToken If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list applications call to return the next set of applications in the
     *         list.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list applications call to return the next set of applications in the
     * list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list applications call to return the next set of applications in the
     *         list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListApplicationsResult withNextToken(String nextToken) {
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
        if (getApplications() != null) sb.append("Applications: " + getApplications() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListApplicationsResult == false) return false;
        ListApplicationsResult other = (ListApplicationsResult)obj;
        
        if (other.getApplications() == null ^ this.getApplications() == null) return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    