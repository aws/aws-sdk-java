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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/AbortEnvironmentUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbortEnvironmentUpdateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This specifies the ID of the environment with the in-progress update that you want to cancel.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * This specifies the name of the environment with the in-progress update that you want to cancel.
     * </p>
     */
    private String environmentName;

    /**
     * <p>
     * This specifies the ID of the environment with the in-progress update that you want to cancel.
     * </p>
     * 
     * @param environmentId
     *        This specifies the ID of the environment with the in-progress update that you want to cancel.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * This specifies the ID of the environment with the in-progress update that you want to cancel.
     * </p>
     * 
     * @return This specifies the ID of the environment with the in-progress update that you want to cancel.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * This specifies the ID of the environment with the in-progress update that you want to cancel.
     * </p>
     * 
     * @param environmentId
     *        This specifies the ID of the environment with the in-progress update that you want to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbortEnvironmentUpdateRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * This specifies the name of the environment with the in-progress update that you want to cancel.
     * </p>
     * 
     * @param environmentName
     *        This specifies the name of the environment with the in-progress update that you want to cancel.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * This specifies the name of the environment with the in-progress update that you want to cancel.
     * </p>
     * 
     * @return This specifies the name of the environment with the in-progress update that you want to cancel.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * This specifies the name of the environment with the in-progress update that you want to cancel.
     * </p>
     * 
     * @param environmentName
     *        This specifies the name of the environment with the in-progress update that you want to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbortEnvironmentUpdateRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AbortEnvironmentUpdateRequest == false)
            return false;
        AbortEnvironmentUpdateRequest other = (AbortEnvironmentUpdateRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        return hashCode;
    }

    @Override
    public AbortEnvironmentUpdateRequest clone() {
        return (AbortEnvironmentUpdateRequest) super.clone();
    }

}
