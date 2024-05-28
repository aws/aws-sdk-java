/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteIntegration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteIntegrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the integration.
     * </p>
     */
    private String integrationIdentifier;

    /**
     * <p>
     * The unique identifier of the integration.
     * </p>
     * 
     * @param integrationIdentifier
     *        The unique identifier of the integration.
     */

    public void setIntegrationIdentifier(String integrationIdentifier) {
        this.integrationIdentifier = integrationIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the integration.
     * </p>
     * 
     * @return The unique identifier of the integration.
     */

    public String getIntegrationIdentifier() {
        return this.integrationIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the integration.
     * </p>
     * 
     * @param integrationIdentifier
     *        The unique identifier of the integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIntegrationRequest withIntegrationIdentifier(String integrationIdentifier) {
        setIntegrationIdentifier(integrationIdentifier);
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
        if (getIntegrationIdentifier() != null)
            sb.append("IntegrationIdentifier: ").append(getIntegrationIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIntegrationRequest == false)
            return false;
        DeleteIntegrationRequest other = (DeleteIntegrationRequest) obj;
        if (other.getIntegrationIdentifier() == null ^ this.getIntegrationIdentifier() == null)
            return false;
        if (other.getIntegrationIdentifier() != null && other.getIntegrationIdentifier().equals(this.getIntegrationIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntegrationIdentifier() == null) ? 0 : getIntegrationIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteIntegrationRequest clone() {
        return (DeleteIntegrationRequest) super.clone();
    }

}
