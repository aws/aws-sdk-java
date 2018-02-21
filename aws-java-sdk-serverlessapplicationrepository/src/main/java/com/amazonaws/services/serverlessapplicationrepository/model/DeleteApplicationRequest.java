/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.serverlessapplicationrepository.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/DeleteApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application to get.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The ID of the application to get.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application to get.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application to get.
     * </p>
     * 
     * @return The ID of the application to get.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application to get.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApplicationRequest == false)
            return false;
        DeleteApplicationRequest other = (DeleteApplicationRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApplicationRequest clone() {
        return (DeleteApplicationRequest) super.clone();
    }

}
