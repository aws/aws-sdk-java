/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request body for CreateJob.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The details for the CreateJob request.
     * </p>
     */
    private RequestDetails details;
    /**
     * <p>
     * The type of job to be created.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The details for the CreateJob request.
     * </p>
     * 
     * @param details
     *        The details for the CreateJob request.
     */

    public void setDetails(RequestDetails details) {
        this.details = details;
    }

    /**
     * <p>
     * The details for the CreateJob request.
     * </p>
     * 
     * @return The details for the CreateJob request.
     */

    public RequestDetails getDetails() {
        return this.details;
    }

    /**
     * <p>
     * The details for the CreateJob request.
     * </p>
     * 
     * @param details
     *        The details for the CreateJob request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withDetails(RequestDetails details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * The type of job to be created.
     * </p>
     * 
     * @param type
     *        The type of job to be created.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of job to be created.
     * </p>
     * 
     * @return The type of job to be created.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of job to be created.
     * </p>
     * 
     * @param type
     *        The type of job to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public CreateJobRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of job to be created.
     * </p>
     * 
     * @param type
     *        The type of job to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public CreateJobRequest withType(Type type) {
        this.type = type.toString();
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
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobRequest == false)
            return false;
        CreateJobRequest other = (CreateJobRequest) obj;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobRequest clone() {
        return (CreateJobRequest) super.clone();
    }

}
