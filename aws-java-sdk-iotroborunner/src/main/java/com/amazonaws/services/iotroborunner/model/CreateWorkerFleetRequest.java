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
package com.amazonaws.services.iotroborunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateWorkerFleet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkerFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String clientToken;

    private String name;

    private String site;

    private String additionalFixedProperties;

    /**
     * @param clientToken
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * @return
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @param clientToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkerFleetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkerFleetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param site
     */

    public void setSite(String site) {
        this.site = site;
    }

    /**
     * @return
     */

    public String getSite() {
        return this.site;
    }

    /**
     * @param site
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkerFleetRequest withSite(String site) {
        setSite(site);
        return this;
    }

    /**
     * @param additionalFixedProperties
     */

    public void setAdditionalFixedProperties(String additionalFixedProperties) {
        this.additionalFixedProperties = additionalFixedProperties;
    }

    /**
     * @return
     */

    public String getAdditionalFixedProperties() {
        return this.additionalFixedProperties;
    }

    /**
     * @param additionalFixedProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkerFleetRequest withAdditionalFixedProperties(String additionalFixedProperties) {
        setAdditionalFixedProperties(additionalFixedProperties);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSite() != null)
            sb.append("Site: ").append(getSite()).append(",");
        if (getAdditionalFixedProperties() != null)
            sb.append("AdditionalFixedProperties: ").append(getAdditionalFixedProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkerFleetRequest == false)
            return false;
        CreateWorkerFleetRequest other = (CreateWorkerFleetRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSite() == null ^ this.getSite() == null)
            return false;
        if (other.getSite() != null && other.getSite().equals(this.getSite()) == false)
            return false;
        if (other.getAdditionalFixedProperties() == null ^ this.getAdditionalFixedProperties() == null)
            return false;
        if (other.getAdditionalFixedProperties() != null && other.getAdditionalFixedProperties().equals(this.getAdditionalFixedProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSite() == null) ? 0 : getSite().hashCode());
        hashCode = prime * hashCode + ((getAdditionalFixedProperties() == null) ? 0 : getAdditionalFixedProperties().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkerFleetRequest clone() {
        return (CreateWorkerFleetRequest) super.clone();
    }

}
