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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#deleteApplication(DeleteApplicationRequest) DeleteApplication operation}.
 * <p>
 * Deletes the specified application along with all associated versions
 * and configurations. The application versions will not be deleted from
 * your Amazon S3 bucket.
 * </p>
 * <p>
 * <b>NOTE:</b>You cannot delete an application that has a running
 * environment.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#deleteApplication(DeleteApplicationRequest)
 */
public class DeleteApplicationRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the application to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * When set to true, running environments will be terminated before
     * deleting the application.
     */
    private Boolean terminateEnvByForce;

    /**
     * Default constructor for a new DeleteApplicationRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteApplicationRequest() {}
    
    /**
     * Constructs a new DeleteApplicationRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param applicationName The name of the application to delete.
     */
    public DeleteApplicationRequest(String applicationName) {
        setApplicationName(applicationName);
    }

    /**
     * The name of the application to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application to delete.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application to delete.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteApplicationRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * When set to true, running environments will be terminated before
     * deleting the application.
     *
     * @return When set to true, running environments will be terminated before
     *         deleting the application.
     */
    public Boolean isTerminateEnvByForce() {
        return terminateEnvByForce;
    }
    
    /**
     * When set to true, running environments will be terminated before
     * deleting the application.
     *
     * @param terminateEnvByForce When set to true, running environments will be terminated before
     *         deleting the application.
     */
    public void setTerminateEnvByForce(Boolean terminateEnvByForce) {
        this.terminateEnvByForce = terminateEnvByForce;
    }
    
    /**
     * When set to true, running environments will be terminated before
     * deleting the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminateEnvByForce When set to true, running environments will be terminated before
     *         deleting the application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteApplicationRequest withTerminateEnvByForce(Boolean terminateEnvByForce) {
        this.terminateEnvByForce = terminateEnvByForce;
        return this;
    }

    /**
     * When set to true, running environments will be terminated before
     * deleting the application.
     *
     * @return When set to true, running environments will be terminated before
     *         deleting the application.
     */
    public Boolean getTerminateEnvByForce() {
        return terminateEnvByForce;
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
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (isTerminateEnvByForce() != null) sb.append("TerminateEnvByForce: " + isTerminateEnvByForce() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((isTerminateEnvByForce() == null) ? 0 : isTerminateEnvByForce().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteApplicationRequest == false) return false;
        DeleteApplicationRequest other = (DeleteApplicationRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.isTerminateEnvByForce() == null ^ this.isTerminateEnvByForce() == null) return false;
        if (other.isTerminateEnvByForce() != null && other.isTerminateEnvByForce().equals(this.isTerminateEnvByForce()) == false) return false; 
        return true;
    }
    
}
    