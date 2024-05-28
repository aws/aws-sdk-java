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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DisableHttpEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableHttpEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the DB cluster.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Indicates whether the HTTP endpoint is enabled or disabled for the DB cluster.
     * </p>
     */
    private Boolean httpEndpointEnabled;

    /**
     * <p>
     * The ARN of the DB cluster.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the DB cluster.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the DB cluster.
     * </p>
     * 
     * @return The ARN of the DB cluster.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the DB cluster.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableHttpEndpointResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether the HTTP endpoint is enabled or disabled for the DB cluster.
     * </p>
     * 
     * @param httpEndpointEnabled
     *        Indicates whether the HTTP endpoint is enabled or disabled for the DB cluster.
     */

    public void setHttpEndpointEnabled(Boolean httpEndpointEnabled) {
        this.httpEndpointEnabled = httpEndpointEnabled;
    }

    /**
     * <p>
     * Indicates whether the HTTP endpoint is enabled or disabled for the DB cluster.
     * </p>
     * 
     * @return Indicates whether the HTTP endpoint is enabled or disabled for the DB cluster.
     */

    public Boolean getHttpEndpointEnabled() {
        return this.httpEndpointEnabled;
    }

    /**
     * <p>
     * Indicates whether the HTTP endpoint is enabled or disabled for the DB cluster.
     * </p>
     * 
     * @param httpEndpointEnabled
     *        Indicates whether the HTTP endpoint is enabled or disabled for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableHttpEndpointResult withHttpEndpointEnabled(Boolean httpEndpointEnabled) {
        setHttpEndpointEnabled(httpEndpointEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the HTTP endpoint is enabled or disabled for the DB cluster.
     * </p>
     * 
     * @return Indicates whether the HTTP endpoint is enabled or disabled for the DB cluster.
     */

    public Boolean isHttpEndpointEnabled() {
        return this.httpEndpointEnabled;
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getHttpEndpointEnabled() != null)
            sb.append("HttpEndpointEnabled: ").append(getHttpEndpointEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableHttpEndpointResult == false)
            return false;
        DisableHttpEndpointResult other = (DisableHttpEndpointResult) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getHttpEndpointEnabled() == null ^ this.getHttpEndpointEnabled() == null)
            return false;
        if (other.getHttpEndpointEnabled() != null && other.getHttpEndpointEnabled().equals(this.getHttpEndpointEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getHttpEndpointEnabled() == null) ? 0 : getHttpEndpointEnabled().hashCode());
        return hashCode;
    }

    @Override
    public DisableHttpEndpointResult clone() {
        try {
            return (DisableHttpEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
