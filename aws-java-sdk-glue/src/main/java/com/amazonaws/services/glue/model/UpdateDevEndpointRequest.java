/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateDevEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDevEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DevEndpoint to be updated.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The public key for the DevEndpoint to use.
     * </p>
     */
    private String publicKey;
    /**
     * <p>
     * Custom Python or Java custom libraries to be loaded in the DevEndpoint.
     * </p>
     */
    private DevEndpointCustomLibraries customLibraries;

    /**
     * <p>
     * The name of the DevEndpoint to be updated.
     * </p>
     * 
     * @param endpointName
     *        The name of the DevEndpoint to be updated.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the DevEndpoint to be updated.
     * </p>
     * 
     * @return The name of the DevEndpoint to be updated.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the DevEndpoint to be updated.
     * </p>
     * 
     * @param endpointName
     *        The name of the DevEndpoint to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevEndpointRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The public key for the DevEndpoint to use.
     * </p>
     * 
     * @param publicKey
     *        The public key for the DevEndpoint to use.
     */

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key for the DevEndpoint to use.
     * </p>
     * 
     * @return The public key for the DevEndpoint to use.
     */

    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * The public key for the DevEndpoint to use.
     * </p>
     * 
     * @param publicKey
     *        The public key for the DevEndpoint to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevEndpointRequest withPublicKey(String publicKey) {
        setPublicKey(publicKey);
        return this;
    }

    /**
     * <p>
     * Custom Python or Java custom libraries to be loaded in the DevEndpoint.
     * </p>
     * 
     * @param customLibraries
     *        Custom Python or Java custom libraries to be loaded in the DevEndpoint.
     */

    public void setCustomLibraries(DevEndpointCustomLibraries customLibraries) {
        this.customLibraries = customLibraries;
    }

    /**
     * <p>
     * Custom Python or Java custom libraries to be loaded in the DevEndpoint.
     * </p>
     * 
     * @return Custom Python or Java custom libraries to be loaded in the DevEndpoint.
     */

    public DevEndpointCustomLibraries getCustomLibraries() {
        return this.customLibraries;
    }

    /**
     * <p>
     * Custom Python or Java custom libraries to be loaded in the DevEndpoint.
     * </p>
     * 
     * @param customLibraries
     *        Custom Python or Java custom libraries to be loaded in the DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevEndpointRequest withCustomLibraries(DevEndpointCustomLibraries customLibraries) {
        setCustomLibraries(customLibraries);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append(getPublicKey()).append(",");
        if (getCustomLibraries() != null)
            sb.append("CustomLibraries: ").append(getCustomLibraries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDevEndpointRequest == false)
            return false;
        UpdateDevEndpointRequest other = (UpdateDevEndpointRequest) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getCustomLibraries() == null ^ this.getCustomLibraries() == null)
            return false;
        if (other.getCustomLibraries() != null && other.getCustomLibraries().equals(this.getCustomLibraries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getCustomLibraries() == null) ? 0 : getCustomLibraries().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDevEndpointRequest clone() {
        return (UpdateDevEndpointRequest) super.clone();
    }

}
