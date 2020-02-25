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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisassociateHealthCheck" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateHealthCheckRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object to remove the health check association from.
     * </p>
     */
    private String protectionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the health check that is associated with the protection.
     * </p>
     */
    private String healthCheckArn;

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object to remove the health check association from.
     * </p>
     * 
     * @param protectionId
     *        The unique identifier (ID) for the <a>Protection</a> object to remove the health check association from.
     */

    public void setProtectionId(String protectionId) {
        this.protectionId = protectionId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object to remove the health check association from.
     * </p>
     * 
     * @return The unique identifier (ID) for the <a>Protection</a> object to remove the health check association from.
     */

    public String getProtectionId() {
        return this.protectionId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object to remove the health check association from.
     * </p>
     * 
     * @param protectionId
     *        The unique identifier (ID) for the <a>Protection</a> object to remove the health check association from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateHealthCheckRequest withProtectionId(String protectionId) {
        setProtectionId(protectionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the health check that is associated with the protection.
     * </p>
     * 
     * @param healthCheckArn
     *        The Amazon Resource Name (ARN) of the health check that is associated with the protection.
     */

    public void setHealthCheckArn(String healthCheckArn) {
        this.healthCheckArn = healthCheckArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the health check that is associated with the protection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the health check that is associated with the protection.
     */

    public String getHealthCheckArn() {
        return this.healthCheckArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the health check that is associated with the protection.
     * </p>
     * 
     * @param healthCheckArn
     *        The Amazon Resource Name (ARN) of the health check that is associated with the protection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateHealthCheckRequest withHealthCheckArn(String healthCheckArn) {
        setHealthCheckArn(healthCheckArn);
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
        if (getProtectionId() != null)
            sb.append("ProtectionId: ").append(getProtectionId()).append(",");
        if (getHealthCheckArn() != null)
            sb.append("HealthCheckArn: ").append(getHealthCheckArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateHealthCheckRequest == false)
            return false;
        DisassociateHealthCheckRequest other = (DisassociateHealthCheckRequest) obj;
        if (other.getProtectionId() == null ^ this.getProtectionId() == null)
            return false;
        if (other.getProtectionId() != null && other.getProtectionId().equals(this.getProtectionId()) == false)
            return false;
        if (other.getHealthCheckArn() == null ^ this.getHealthCheckArn() == null)
            return false;
        if (other.getHealthCheckArn() != null && other.getHealthCheckArn().equals(this.getHealthCheckArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectionId() == null) ? 0 : getProtectionId().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckArn() == null) ? 0 : getHealthCheckArn().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateHealthCheckRequest clone() {
        return (DisassociateHealthCheckRequest) super.clone();
    }

}
