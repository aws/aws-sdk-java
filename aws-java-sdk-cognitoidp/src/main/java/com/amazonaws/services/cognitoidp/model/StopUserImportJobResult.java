/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the response from the server to the request to stop the user import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/StopUserImportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopUserImportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The job object that represents the user import job.
     * </p>
     */
    private UserImportJobType userImportJob;

    /**
     * <p>
     * The job object that represents the user import job.
     * </p>
     * 
     * @param userImportJob
     *        The job object that represents the user import job.
     */

    public void setUserImportJob(UserImportJobType userImportJob) {
        this.userImportJob = userImportJob;
    }

    /**
     * <p>
     * The job object that represents the user import job.
     * </p>
     * 
     * @return The job object that represents the user import job.
     */

    public UserImportJobType getUserImportJob() {
        return this.userImportJob;
    }

    /**
     * <p>
     * The job object that represents the user import job.
     * </p>
     * 
     * @param userImportJob
     *        The job object that represents the user import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopUserImportJobResult withUserImportJob(UserImportJobType userImportJob) {
        setUserImportJob(userImportJob);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserImportJob() != null)
            sb.append("UserImportJob: ").append(getUserImportJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopUserImportJobResult == false)
            return false;
        StopUserImportJobResult other = (StopUserImportJobResult) obj;
        if (other.getUserImportJob() == null ^ this.getUserImportJob() == null)
            return false;
        if (other.getUserImportJob() != null && other.getUserImportJob().equals(this.getUserImportJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserImportJob() == null) ? 0 : getUserImportJob().hashCode());
        return hashCode;
    }

    @Override
    public StopUserImportJobResult clone() {
        try {
            return (StopUserImportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
