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
 * Container for the response to a <code>CancelServiceSoftwareUpdate</code> operation. Contains the status of the
 * update.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelServiceSoftwareUpdateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Container for the state of your domain relative to the latest service software.
     * </p>
     */
    private ServiceSoftwareOptions serviceSoftwareOptions;

    /**
     * <p>
     * Container for the state of your domain relative to the latest service software.
     * </p>
     * 
     * @param serviceSoftwareOptions
     *        Container for the state of your domain relative to the latest service software.
     */

    public void setServiceSoftwareOptions(ServiceSoftwareOptions serviceSoftwareOptions) {
        this.serviceSoftwareOptions = serviceSoftwareOptions;
    }

    /**
     * <p>
     * Container for the state of your domain relative to the latest service software.
     * </p>
     * 
     * @return Container for the state of your domain relative to the latest service software.
     */

    public ServiceSoftwareOptions getServiceSoftwareOptions() {
        return this.serviceSoftwareOptions;
    }

    /**
     * <p>
     * Container for the state of your domain relative to the latest service software.
     * </p>
     * 
     * @param serviceSoftwareOptions
     *        Container for the state of your domain relative to the latest service software.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelServiceSoftwareUpdateResult withServiceSoftwareOptions(ServiceSoftwareOptions serviceSoftwareOptions) {
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

        if (obj instanceof CancelServiceSoftwareUpdateResult == false)
            return false;
        CancelServiceSoftwareUpdateResult other = (CancelServiceSoftwareUpdateResult) obj;
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
    public CancelServiceSoftwareUpdateResult clone() {
        try {
            return (CancelServiceSoftwareUpdateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
