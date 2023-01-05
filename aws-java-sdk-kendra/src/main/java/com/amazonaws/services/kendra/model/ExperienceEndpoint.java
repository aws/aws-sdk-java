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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information for the endpoint for your Amazon Kendra experience.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ExperienceEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperienceEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of endpoint for your Amazon Kendra experience. The type currently available is <code>HOME</code>, which
     * is a unique and fully hosted URL to the home page of your Amazon Kendra experience.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The endpoint of your Amazon Kendra experience.
     * </p>
     */
    private String endpoint;

    /**
     * <p>
     * The type of endpoint for your Amazon Kendra experience. The type currently available is <code>HOME</code>, which
     * is a unique and fully hosted URL to the home page of your Amazon Kendra experience.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint for your Amazon Kendra experience. The type currently available is <code>HOME</code>,
     *        which is a unique and fully hosted URL to the home page of your Amazon Kendra experience.
     * @see EndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint for your Amazon Kendra experience. The type currently available is <code>HOME</code>, which
     * is a unique and fully hosted URL to the home page of your Amazon Kendra experience.
     * </p>
     * 
     * @return The type of endpoint for your Amazon Kendra experience. The type currently available is <code>HOME</code>
     *         , which is a unique and fully hosted URL to the home page of your Amazon Kendra experience.
     * @see EndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of endpoint for your Amazon Kendra experience. The type currently available is <code>HOME</code>, which
     * is a unique and fully hosted URL to the home page of your Amazon Kendra experience.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint for your Amazon Kendra experience. The type currently available is <code>HOME</code>,
     *        which is a unique and fully hosted URL to the home page of your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public ExperienceEndpoint withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of endpoint for your Amazon Kendra experience. The type currently available is <code>HOME</code>, which
     * is a unique and fully hosted URL to the home page of your Amazon Kendra experience.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint for your Amazon Kendra experience. The type currently available is <code>HOME</code>,
     *        which is a unique and fully hosted URL to the home page of your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public ExperienceEndpoint withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The endpoint of your Amazon Kendra experience.
     * </p>
     * 
     * @param endpoint
     *        The endpoint of your Amazon Kendra experience.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint of your Amazon Kendra experience.
     * </p>
     * 
     * @return The endpoint of your Amazon Kendra experience.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint of your Amazon Kendra experience.
     * </p>
     * 
     * @param endpoint
     *        The endpoint of your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperienceEndpoint withEndpoint(String endpoint) {
        setEndpoint(endpoint);
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
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExperienceEndpoint == false)
            return false;
        ExperienceEndpoint other = (ExperienceEndpoint) obj;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public ExperienceEndpoint clone() {
        try {
            return (ExperienceEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ExperienceEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
