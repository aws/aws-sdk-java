/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetProgrammaticAccessCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProgrammaticAccessCredentialsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The time duration in which the credentials remain valid.
     * </p>
     */
    private Long durationInMinutes;
    /**
     * <p>
     * The habanero environment identifier.
     * </p>
     */
    private String environmentId;

    /**
     * <p>
     * The time duration in which the credentials remain valid.
     * </p>
     * 
     * @param durationInMinutes
     *        The time duration in which the credentials remain valid.
     */

    public void setDurationInMinutes(Long durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    /**
     * <p>
     * The time duration in which the credentials remain valid.
     * </p>
     * 
     * @return The time duration in which the credentials remain valid.
     */

    public Long getDurationInMinutes() {
        return this.durationInMinutes;
    }

    /**
     * <p>
     * The time duration in which the credentials remain valid.
     * </p>
     * 
     * @param durationInMinutes
     *        The time duration in which the credentials remain valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProgrammaticAccessCredentialsRequest withDurationInMinutes(Long durationInMinutes) {
        setDurationInMinutes(durationInMinutes);
        return this;
    }

    /**
     * <p>
     * The habanero environment identifier.
     * </p>
     * 
     * @param environmentId
     *        The habanero environment identifier.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The habanero environment identifier.
     * </p>
     * 
     * @return The habanero environment identifier.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The habanero environment identifier.
     * </p>
     * 
     * @param environmentId
     *        The habanero environment identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProgrammaticAccessCredentialsRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
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
        if (getDurationInMinutes() != null)
            sb.append("DurationInMinutes: ").append(getDurationInMinutes()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProgrammaticAccessCredentialsRequest == false)
            return false;
        GetProgrammaticAccessCredentialsRequest other = (GetProgrammaticAccessCredentialsRequest) obj;
        if (other.getDurationInMinutes() == null ^ this.getDurationInMinutes() == null)
            return false;
        if (other.getDurationInMinutes() != null && other.getDurationInMinutes().equals(this.getDurationInMinutes()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDurationInMinutes() == null) ? 0 : getDurationInMinutes().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        return hashCode;
    }

    @Override
    public GetProgrammaticAccessCredentialsRequest clone() {
        return (GetProgrammaticAccessCredentialsRequest) super.clone();
    }

}
