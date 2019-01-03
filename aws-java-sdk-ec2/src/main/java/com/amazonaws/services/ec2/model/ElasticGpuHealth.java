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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the status of an Elastic Graphics accelerator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ElasticGpuHealth" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticGpuHealth implements Serializable, Cloneable {

    /**
     * <p>
     * The health status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The health status.
     * </p>
     * 
     * @param status
     *        The health status.
     * @see ElasticGpuStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The health status.
     * </p>
     * 
     * @return The health status.
     * @see ElasticGpuStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The health status.
     * </p>
     * 
     * @param status
     *        The health status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticGpuStatus
     */

    public ElasticGpuHealth withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The health status.
     * </p>
     * 
     * @param status
     *        The health status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticGpuStatus
     */

    public ElasticGpuHealth withStatus(ElasticGpuStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticGpuHealth == false)
            return false;
        ElasticGpuHealth other = (ElasticGpuHealth) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ElasticGpuHealth clone() {
        try {
            return (ElasticGpuHealth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
