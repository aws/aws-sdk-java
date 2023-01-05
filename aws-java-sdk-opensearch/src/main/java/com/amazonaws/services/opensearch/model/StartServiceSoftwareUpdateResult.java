/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>StartServiceSoftwareUpdate</code> operation. Contains the status of the update.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartServiceSoftwareUpdateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the OpenSearch Service software update.
     * </p>
     */
    private ServiceSoftwareOptions serviceSoftwareOptions;

    /**
     * <p>
     * The current status of the OpenSearch Service software update.
     * </p>
     * 
     * @param serviceSoftwareOptions
     *        The current status of the OpenSearch Service software update.
     */

    public void setServiceSoftwareOptions(ServiceSoftwareOptions serviceSoftwareOptions) {
        this.serviceSoftwareOptions = serviceSoftwareOptions;
    }

    /**
     * <p>
     * The current status of the OpenSearch Service software update.
     * </p>
     * 
     * @return The current status of the OpenSearch Service software update.
     */

    public ServiceSoftwareOptions getServiceSoftwareOptions() {
        return this.serviceSoftwareOptions;
    }

    /**
     * <p>
     * The current status of the OpenSearch Service software update.
     * </p>
     * 
     * @param serviceSoftwareOptions
     *        The current status of the OpenSearch Service software update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartServiceSoftwareUpdateResult withServiceSoftwareOptions(ServiceSoftwareOptions serviceSoftwareOptions) {
        setServiceSoftwareOptions(serviceSoftwareOptions);
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
        if (getServiceSoftwareOptions() != null)
            sb.append("ServiceSoftwareOptions: ").append(getServiceSoftwareOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartServiceSoftwareUpdateResult == false)
            return false;
        StartServiceSoftwareUpdateResult other = (StartServiceSoftwareUpdateResult) obj;
        if (other.getServiceSoftwareOptions() == null ^ this.getServiceSoftwareOptions() == null)
            return false;
        if (other.getServiceSoftwareOptions() != null && other.getServiceSoftwareOptions().equals(this.getServiceSoftwareOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceSoftwareOptions() == null) ? 0 : getServiceSoftwareOptions().hashCode());
        return hashCode;
    }

    @Override
    public StartServiceSoftwareUpdateResult clone() {
        try {
            return (StartServiceSoftwareUpdateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
