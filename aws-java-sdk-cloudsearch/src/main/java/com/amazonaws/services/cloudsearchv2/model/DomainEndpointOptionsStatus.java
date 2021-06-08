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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The configuration and status of the domain's endpoint options.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainEndpointOptionsStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The domain endpoint options configured for the domain.
     * </p>
     */
    private DomainEndpointOptions options;
    /**
     * <p>
     * The status of the configured domain endpoint options.
     * </p>
     */
    private OptionStatus status;

    /**
     * <p>
     * The domain endpoint options configured for the domain.
     * </p>
     * 
     * @param options
     *        The domain endpoint options configured for the domain.
     */

    public void setOptions(DomainEndpointOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * The domain endpoint options configured for the domain.
     * </p>
     * 
     * @return The domain endpoint options configured for the domain.
     */

    public DomainEndpointOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The domain endpoint options configured for the domain.
     * </p>
     * 
     * @param options
     *        The domain endpoint options configured for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEndpointOptionsStatus withOptions(DomainEndpointOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The status of the configured domain endpoint options.
     * </p>
     * 
     * @param status
     *        The status of the configured domain endpoint options.
     */

    public void setStatus(OptionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the configured domain endpoint options.
     * </p>
     * 
     * @return The status of the configured domain endpoint options.
     */

    public OptionStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the configured domain endpoint options.
     * </p>
     * 
     * @param status
     *        The status of the configured domain endpoint options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEndpointOptionsStatus withStatus(OptionStatus status) {
        setStatus(status);
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
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
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

        if (obj instanceof DomainEndpointOptionsStatus == false)
            return false;
        DomainEndpointOptionsStatus other = (DomainEndpointOptionsStatus) obj;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DomainEndpointOptionsStatus clone() {
        try {
            return (DomainEndpointOptionsStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
