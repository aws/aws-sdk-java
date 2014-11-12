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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#batchGetApplications(BatchGetApplicationsRequest) BatchGetApplications operation}.
 * <p>
 * Gets information about one or more applications.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#batchGetApplications(BatchGetApplicationsRequest)
 */
public class BatchGetApplicationsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A list of application names, with multiple application names separated
     * by spaces.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> applicationNames;

    /**
     * A list of application names, with multiple application names separated
     * by spaces.
     *
     * @return A list of application names, with multiple application names separated
     *         by spaces.
     */
    public java.util.List<String> getApplicationNames() {
        if (applicationNames == null) {
              applicationNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              applicationNames.setAutoConstruct(true);
        }
        return applicationNames;
    }
    
    /**
     * A list of application names, with multiple application names separated
     * by spaces.
     *
     * @param applicationNames A list of application names, with multiple application names separated
     *         by spaces.
     */
    public void setApplicationNames(java.util.Collection<String> applicationNames) {
        if (applicationNames == null) {
            this.applicationNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> applicationNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(applicationNames.size());
        applicationNamesCopy.addAll(applicationNames);
        this.applicationNames = applicationNamesCopy;
    }
    
    /**
     * A list of application names, with multiple application names separated
     * by spaces.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applicationNames A list of application names, with multiple application names separated
     *         by spaces.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BatchGetApplicationsRequest withApplicationNames(String... applicationNames) {
        if (getApplicationNames() == null) setApplicationNames(new java.util.ArrayList<String>(applicationNames.length));
        for (String value : applicationNames) {
            getApplicationNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of application names, with multiple application names separated
     * by spaces.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applicationNames A list of application names, with multiple application names separated
     *         by spaces.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BatchGetApplicationsRequest withApplicationNames(java.util.Collection<String> applicationNames) {
        if (applicationNames == null) {
            this.applicationNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> applicationNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(applicationNames.size());
            applicationNamesCopy.addAll(applicationNames);
            this.applicationNames = applicationNamesCopy;
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
        if (getApplicationNames() != null) sb.append("ApplicationNames: " + getApplicationNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationNames() == null) ? 0 : getApplicationNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BatchGetApplicationsRequest == false) return false;
        BatchGetApplicationsRequest other = (BatchGetApplicationsRequest)obj;
        
        if (other.getApplicationNames() == null ^ this.getApplicationNames() == null) return false;
        if (other.getApplicationNames() != null && other.getApplicationNames().equals(this.getApplicationNames()) == false) return false; 
        return true;
    }
    
}
    