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
 * Information about a deployment error.
 * </p>
 */
public class ErrorInformation implements Serializable {

    /**
     * The error code: <ul> <li>APPLICATION_MISSING: The application was
     * missing. Note that this error code will most likely be raised if the
     * application is deleted after the deployment is created but before it
     * starts.</li> <li>DEPLOYMENT_GROUP_MISSING: The deployment group was
     * missing. Note that this error code will most likely be raised if the
     * deployment group is deleted after the deployment is created but before
     * it starts.</li> <li>REVISION_MISSING: The revision ID was missing.
     * Note that this error code will most likely be raised if the revision
     * is deleted after the deployment is created but before it starts.</li>
     * <li>IAM_ROLE_MISSING: The service role cannot be accessed.</li>
     * <li>IAM_ROLE_PERMISSIONS: The service role does not have the correct
     * permissions.</li> <li>OVER_MAX_INSTANCES: The maximum number of
     * instances was exceeded.</li> <li>NO_INSTANCES: No instances were
     * specified, or no instances can be found.</li> <li>TIMEOUT: The
     * deployment has timed out.</li> <li>HEALTH_CONSTRAINTS_INVALID: The
     * revision can never successfully deploy under the instance health
     * constraints as specified.</li> <li>HEALTH_CONSTRAINTS: The deployment
     * failed on too many instances to be able to successfully deploy under
     * the specified instance health constraints.</li> <li>INTERNAL_ERROR:
     * There was an internal error.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEPLOYMENT_GROUP_MISSING, APPLICATION_MISSING, REVISION_MISSING, IAM_ROLE_MISSING, IAM_ROLE_PERMISSIONS, OVER_MAX_INSTANCES, NO_INSTANCES, TIMEOUT, HEALTH_CONSTRAINTS_INVALID, HEALTH_CONSTRAINTS, INTERNAL_ERROR
     */
    private String code;

    /**
     * An accompanying error message.
     */
    private String message;

    /**
     * The error code: <ul> <li>APPLICATION_MISSING: The application was
     * missing. Note that this error code will most likely be raised if the
     * application is deleted after the deployment is created but before it
     * starts.</li> <li>DEPLOYMENT_GROUP_MISSING: The deployment group was
     * missing. Note that this error code will most likely be raised if the
     * deployment group is deleted after the deployment is created but before
     * it starts.</li> <li>REVISION_MISSING: The revision ID was missing.
     * Note that this error code will most likely be raised if the revision
     * is deleted after the deployment is created but before it starts.</li>
     * <li>IAM_ROLE_MISSING: The service role cannot be accessed.</li>
     * <li>IAM_ROLE_PERMISSIONS: The service role does not have the correct
     * permissions.</li> <li>OVER_MAX_INSTANCES: The maximum number of
     * instances was exceeded.</li> <li>NO_INSTANCES: No instances were
     * specified, or no instances can be found.</li> <li>TIMEOUT: The
     * deployment has timed out.</li> <li>HEALTH_CONSTRAINTS_INVALID: The
     * revision can never successfully deploy under the instance health
     * constraints as specified.</li> <li>HEALTH_CONSTRAINTS: The deployment
     * failed on too many instances to be able to successfully deploy under
     * the specified instance health constraints.</li> <li>INTERNAL_ERROR:
     * There was an internal error.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEPLOYMENT_GROUP_MISSING, APPLICATION_MISSING, REVISION_MISSING, IAM_ROLE_MISSING, IAM_ROLE_PERMISSIONS, OVER_MAX_INSTANCES, NO_INSTANCES, TIMEOUT, HEALTH_CONSTRAINTS_INVALID, HEALTH_CONSTRAINTS, INTERNAL_ERROR
     *
     * @return The error code: <ul> <li>APPLICATION_MISSING: The application was
     *         missing. Note that this error code will most likely be raised if the
     *         application is deleted after the deployment is created but before it
     *         starts.</li> <li>DEPLOYMENT_GROUP_MISSING: The deployment group was
     *         missing. Note that this error code will most likely be raised if the
     *         deployment group is deleted after the deployment is created but before
     *         it starts.</li> <li>REVISION_MISSING: The revision ID was missing.
     *         Note that this error code will most likely be raised if the revision
     *         is deleted after the deployment is created but before it starts.</li>
     *         <li>IAM_ROLE_MISSING: The service role cannot be accessed.</li>
     *         <li>IAM_ROLE_PERMISSIONS: The service role does not have the correct
     *         permissions.</li> <li>OVER_MAX_INSTANCES: The maximum number of
     *         instances was exceeded.</li> <li>NO_INSTANCES: No instances were
     *         specified, or no instances can be found.</li> <li>TIMEOUT: The
     *         deployment has timed out.</li> <li>HEALTH_CONSTRAINTS_INVALID: The
     *         revision can never successfully deploy under the instance health
     *         constraints as specified.</li> <li>HEALTH_CONSTRAINTS: The deployment
     *         failed on too many instances to be able to successfully deploy under
     *         the specified instance health constraints.</li> <li>INTERNAL_ERROR:
     *         There was an internal error.</li> </ul>
     *
     * @see ErrorCode
     */
    public String getCode() {
        return code;
    }
    
    /**
     * The error code: <ul> <li>APPLICATION_MISSING: The application was
     * missing. Note that this error code will most likely be raised if the
     * application is deleted after the deployment is created but before it
     * starts.</li> <li>DEPLOYMENT_GROUP_MISSING: The deployment group was
     * missing. Note that this error code will most likely be raised if the
     * deployment group is deleted after the deployment is created but before
     * it starts.</li> <li>REVISION_MISSING: The revision ID was missing.
     * Note that this error code will most likely be raised if the revision
     * is deleted after the deployment is created but before it starts.</li>
     * <li>IAM_ROLE_MISSING: The service role cannot be accessed.</li>
     * <li>IAM_ROLE_PERMISSIONS: The service role does not have the correct
     * permissions.</li> <li>OVER_MAX_INSTANCES: The maximum number of
     * instances was exceeded.</li> <li>NO_INSTANCES: No instances were
     * specified, or no instances can be found.</li> <li>TIMEOUT: The
     * deployment has timed out.</li> <li>HEALTH_CONSTRAINTS_INVALID: The
     * revision can never successfully deploy under the instance health
     * constraints as specified.</li> <li>HEALTH_CONSTRAINTS: The deployment
     * failed on too many instances to be able to successfully deploy under
     * the specified instance health constraints.</li> <li>INTERNAL_ERROR:
     * There was an internal error.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEPLOYMENT_GROUP_MISSING, APPLICATION_MISSING, REVISION_MISSING, IAM_ROLE_MISSING, IAM_ROLE_PERMISSIONS, OVER_MAX_INSTANCES, NO_INSTANCES, TIMEOUT, HEALTH_CONSTRAINTS_INVALID, HEALTH_CONSTRAINTS, INTERNAL_ERROR
     *
     * @param code The error code: <ul> <li>APPLICATION_MISSING: The application was
     *         missing. Note that this error code will most likely be raised if the
     *         application is deleted after the deployment is created but before it
     *         starts.</li> <li>DEPLOYMENT_GROUP_MISSING: The deployment group was
     *         missing. Note that this error code will most likely be raised if the
     *         deployment group is deleted after the deployment is created but before
     *         it starts.</li> <li>REVISION_MISSING: The revision ID was missing.
     *         Note that this error code will most likely be raised if the revision
     *         is deleted after the deployment is created but before it starts.</li>
     *         <li>IAM_ROLE_MISSING: The service role cannot be accessed.</li>
     *         <li>IAM_ROLE_PERMISSIONS: The service role does not have the correct
     *         permissions.</li> <li>OVER_MAX_INSTANCES: The maximum number of
     *         instances was exceeded.</li> <li>NO_INSTANCES: No instances were
     *         specified, or no instances can be found.</li> <li>TIMEOUT: The
     *         deployment has timed out.</li> <li>HEALTH_CONSTRAINTS_INVALID: The
     *         revision can never successfully deploy under the instance health
     *         constraints as specified.</li> <li>HEALTH_CONSTRAINTS: The deployment
     *         failed on too many instances to be able to successfully deploy under
     *         the specified instance health constraints.</li> <li>INTERNAL_ERROR:
     *         There was an internal error.</li> </ul>
     *
     * @see ErrorCode
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * The error code: <ul> <li>APPLICATION_MISSING: The application was
     * missing. Note that this error code will most likely be raised if the
     * application is deleted after the deployment is created but before it
     * starts.</li> <li>DEPLOYMENT_GROUP_MISSING: The deployment group was
     * missing. Note that this error code will most likely be raised if the
     * deployment group is deleted after the deployment is created but before
     * it starts.</li> <li>REVISION_MISSING: The revision ID was missing.
     * Note that this error code will most likely be raised if the revision
     * is deleted after the deployment is created but before it starts.</li>
     * <li>IAM_ROLE_MISSING: The service role cannot be accessed.</li>
     * <li>IAM_ROLE_PERMISSIONS: The service role does not have the correct
     * permissions.</li> <li>OVER_MAX_INSTANCES: The maximum number of
     * instances was exceeded.</li> <li>NO_INSTANCES: No instances were
     * specified, or no instances can be found.</li> <li>TIMEOUT: The
     * deployment has timed out.</li> <li>HEALTH_CONSTRAINTS_INVALID: The
     * revision can never successfully deploy under the instance health
     * constraints as specified.</li> <li>HEALTH_CONSTRAINTS: The deployment
     * failed on too many instances to be able to successfully deploy under
     * the specified instance health constraints.</li> <li>INTERNAL_ERROR:
     * There was an internal error.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEPLOYMENT_GROUP_MISSING, APPLICATION_MISSING, REVISION_MISSING, IAM_ROLE_MISSING, IAM_ROLE_PERMISSIONS, OVER_MAX_INSTANCES, NO_INSTANCES, TIMEOUT, HEALTH_CONSTRAINTS_INVALID, HEALTH_CONSTRAINTS, INTERNAL_ERROR
     *
     * @param code The error code: <ul> <li>APPLICATION_MISSING: The application was
     *         missing. Note that this error code will most likely be raised if the
     *         application is deleted after the deployment is created but before it
     *         starts.</li> <li>DEPLOYMENT_GROUP_MISSING: The deployment group was
     *         missing. Note that this error code will most likely be raised if the
     *         deployment group is deleted after the deployment is created but before
     *         it starts.</li> <li>REVISION_MISSING: The revision ID was missing.
     *         Note that this error code will most likely be raised if the revision
     *         is deleted after the deployment is created but before it starts.</li>
     *         <li>IAM_ROLE_MISSING: The service role cannot be accessed.</li>
     *         <li>IAM_ROLE_PERMISSIONS: The service role does not have the correct
     *         permissions.</li> <li>OVER_MAX_INSTANCES: The maximum number of
     *         instances was exceeded.</li> <li>NO_INSTANCES: No instances were
     *         specified, or no instances can be found.</li> <li>TIMEOUT: The
     *         deployment has timed out.</li> <li>HEALTH_CONSTRAINTS_INVALID: The
     *         revision can never successfully deploy under the instance health
     *         constraints as specified.</li> <li>HEALTH_CONSTRAINTS: The deployment
     *         failed on too many instances to be able to successfully deploy under
     *         the specified instance health constraints.</li> <li>INTERNAL_ERROR:
     *         There was an internal error.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ErrorCode
     */
    public ErrorInformation withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * The error code: <ul> <li>APPLICATION_MISSING: The application was
     * missing. Note that this error code will most likely be raised if the
     * application is deleted after the deployment is created but before it
     * starts.</li> <li>DEPLOYMENT_GROUP_MISSING: The deployment group was
     * missing. Note that this error code will most likely be raised if the
     * deployment group is deleted after the deployment is created but before
     * it starts.</li> <li>REVISION_MISSING: The revision ID was missing.
     * Note that this error code will most likely be raised if the revision
     * is deleted after the deployment is created but before it starts.</li>
     * <li>IAM_ROLE_MISSING: The service role cannot be accessed.</li>
     * <li>IAM_ROLE_PERMISSIONS: The service role does not have the correct
     * permissions.</li> <li>OVER_MAX_INSTANCES: The maximum number of
     * instances was exceeded.</li> <li>NO_INSTANCES: No instances were
     * specified, or no instances can be found.</li> <li>TIMEOUT: The
     * deployment has timed out.</li> <li>HEALTH_CONSTRAINTS_INVALID: The
     * revision can never successfully deploy under the instance health
     * constraints as specified.</li> <li>HEALTH_CONSTRAINTS: The deployment
     * failed on too many instances to be able to successfully deploy under
     * the specified instance health constraints.</li> <li>INTERNAL_ERROR:
     * There was an internal error.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEPLOYMENT_GROUP_MISSING, APPLICATION_MISSING, REVISION_MISSING, IAM_ROLE_MISSING, IAM_ROLE_PERMISSIONS, OVER_MAX_INSTANCES, NO_INSTANCES, TIMEOUT, HEALTH_CONSTRAINTS_INVALID, HEALTH_CONSTRAINTS, INTERNAL_ERROR
     *
     * @param code The error code: <ul> <li>APPLICATION_MISSING: The application was
     *         missing. Note that this error code will most likely be raised if the
     *         application is deleted after the deployment is created but before it
     *         starts.</li> <li>DEPLOYMENT_GROUP_MISSING: The deployment group was
     *         missing. Note that this error code will most likely be raised if the
     *         deployment group is deleted after the deployment is created but before
     *         it starts.</li> <li>REVISION_MISSING: The revision ID was missing.
     *         Note that this error code will most likely be raised if the revision
     *         is deleted after the deployment is created but before it starts.</li>
     *         <li>IAM_ROLE_MISSING: The service role cannot be accessed.</li>
     *         <li>IAM_ROLE_PERMISSIONS: The service role does not have the correct
     *         permissions.</li> <li>OVER_MAX_INSTANCES: The maximum number of
     *         instances was exceeded.</li> <li>NO_INSTANCES: No instances were
     *         specified, or no instances can be found.</li> <li>TIMEOUT: The
     *         deployment has timed out.</li> <li>HEALTH_CONSTRAINTS_INVALID: The
     *         revision can never successfully deploy under the instance health
     *         constraints as specified.</li> <li>HEALTH_CONSTRAINTS: The deployment
     *         failed on too many instances to be able to successfully deploy under
     *         the specified instance health constraints.</li> <li>INTERNAL_ERROR:
     *         There was an internal error.</li> </ul>
     *
     * @see ErrorCode
     */
    public void setCode(ErrorCode code) {
        this.code = code.toString();
    }
    
    /**
     * The error code: <ul> <li>APPLICATION_MISSING: The application was
     * missing. Note that this error code will most likely be raised if the
     * application is deleted after the deployment is created but before it
     * starts.</li> <li>DEPLOYMENT_GROUP_MISSING: The deployment group was
     * missing. Note that this error code will most likely be raised if the
     * deployment group is deleted after the deployment is created but before
     * it starts.</li> <li>REVISION_MISSING: The revision ID was missing.
     * Note that this error code will most likely be raised if the revision
     * is deleted after the deployment is created but before it starts.</li>
     * <li>IAM_ROLE_MISSING: The service role cannot be accessed.</li>
     * <li>IAM_ROLE_PERMISSIONS: The service role does not have the correct
     * permissions.</li> <li>OVER_MAX_INSTANCES: The maximum number of
     * instances was exceeded.</li> <li>NO_INSTANCES: No instances were
     * specified, or no instances can be found.</li> <li>TIMEOUT: The
     * deployment has timed out.</li> <li>HEALTH_CONSTRAINTS_INVALID: The
     * revision can never successfully deploy under the instance health
     * constraints as specified.</li> <li>HEALTH_CONSTRAINTS: The deployment
     * failed on too many instances to be able to successfully deploy under
     * the specified instance health constraints.</li> <li>INTERNAL_ERROR:
     * There was an internal error.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEPLOYMENT_GROUP_MISSING, APPLICATION_MISSING, REVISION_MISSING, IAM_ROLE_MISSING, IAM_ROLE_PERMISSIONS, OVER_MAX_INSTANCES, NO_INSTANCES, TIMEOUT, HEALTH_CONSTRAINTS_INVALID, HEALTH_CONSTRAINTS, INTERNAL_ERROR
     *
     * @param code The error code: <ul> <li>APPLICATION_MISSING: The application was
     *         missing. Note that this error code will most likely be raised if the
     *         application is deleted after the deployment is created but before it
     *         starts.</li> <li>DEPLOYMENT_GROUP_MISSING: The deployment group was
     *         missing. Note that this error code will most likely be raised if the
     *         deployment group is deleted after the deployment is created but before
     *         it starts.</li> <li>REVISION_MISSING: The revision ID was missing.
     *         Note that this error code will most likely be raised if the revision
     *         is deleted after the deployment is created but before it starts.</li>
     *         <li>IAM_ROLE_MISSING: The service role cannot be accessed.</li>
     *         <li>IAM_ROLE_PERMISSIONS: The service role does not have the correct
     *         permissions.</li> <li>OVER_MAX_INSTANCES: The maximum number of
     *         instances was exceeded.</li> <li>NO_INSTANCES: No instances were
     *         specified, or no instances can be found.</li> <li>TIMEOUT: The
     *         deployment has timed out.</li> <li>HEALTH_CONSTRAINTS_INVALID: The
     *         revision can never successfully deploy under the instance health
     *         constraints as specified.</li> <li>HEALTH_CONSTRAINTS: The deployment
     *         failed on too many instances to be able to successfully deploy under
     *         the specified instance health constraints.</li> <li>INTERNAL_ERROR:
     *         There was an internal error.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ErrorCode
     */
    public ErrorInformation withCode(ErrorCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * An accompanying error message.
     *
     * @return An accompanying error message.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * An accompanying error message.
     *
     * @param message An accompanying error message.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * An accompanying error message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message An accompanying error message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ErrorInformation withMessage(String message) {
        this.message = message;
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
        if (getCode() != null) sb.append("Code: " + getCode() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ErrorInformation == false) return false;
        ErrorInformation other = (ErrorInformation)obj;
        
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        return true;
    }
    
}
    