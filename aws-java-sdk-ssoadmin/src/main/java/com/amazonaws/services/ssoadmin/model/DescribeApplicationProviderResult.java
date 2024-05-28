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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeApplicationProvider"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationProviderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the application provider.
     * </p>
     */
    private String applicationProviderArn;
    /**
     * <p>
     * A structure with details about the display data for the application provider.
     * </p>
     */
    private DisplayData displayData;
    /**
     * <p>
     * The protocol used to federate to the application provider.
     * </p>
     */
    private String federationProtocol;
    /**
     * <p>
     * A structure with details about the receiving application.
     * </p>
     */
    private ResourceServerConfig resourceServerConfig;

    /**
     * <p>
     * The ARN of the application provider.
     * </p>
     * 
     * @param applicationProviderArn
     *        The ARN of the application provider.
     */

    public void setApplicationProviderArn(String applicationProviderArn) {
        this.applicationProviderArn = applicationProviderArn;
    }

    /**
     * <p>
     * The ARN of the application provider.
     * </p>
     * 
     * @return The ARN of the application provider.
     */

    public String getApplicationProviderArn() {
        return this.applicationProviderArn;
    }

    /**
     * <p>
     * The ARN of the application provider.
     * </p>
     * 
     * @param applicationProviderArn
     *        The ARN of the application provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationProviderResult withApplicationProviderArn(String applicationProviderArn) {
        setApplicationProviderArn(applicationProviderArn);
        return this;
    }

    /**
     * <p>
     * A structure with details about the display data for the application provider.
     * </p>
     * 
     * @param displayData
     *        A structure with details about the display data for the application provider.
     */

    public void setDisplayData(DisplayData displayData) {
        this.displayData = displayData;
    }

    /**
     * <p>
     * A structure with details about the display data for the application provider.
     * </p>
     * 
     * @return A structure with details about the display data for the application provider.
     */

    public DisplayData getDisplayData() {
        return this.displayData;
    }

    /**
     * <p>
     * A structure with details about the display data for the application provider.
     * </p>
     * 
     * @param displayData
     *        A structure with details about the display data for the application provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationProviderResult withDisplayData(DisplayData displayData) {
        setDisplayData(displayData);
        return this;
    }

    /**
     * <p>
     * The protocol used to federate to the application provider.
     * </p>
     * 
     * @param federationProtocol
     *        The protocol used to federate to the application provider.
     * @see FederationProtocol
     */

    public void setFederationProtocol(String federationProtocol) {
        this.federationProtocol = federationProtocol;
    }

    /**
     * <p>
     * The protocol used to federate to the application provider.
     * </p>
     * 
     * @return The protocol used to federate to the application provider.
     * @see FederationProtocol
     */

    public String getFederationProtocol() {
        return this.federationProtocol;
    }

    /**
     * <p>
     * The protocol used to federate to the application provider.
     * </p>
     * 
     * @param federationProtocol
     *        The protocol used to federate to the application provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FederationProtocol
     */

    public DescribeApplicationProviderResult withFederationProtocol(String federationProtocol) {
        setFederationProtocol(federationProtocol);
        return this;
    }

    /**
     * <p>
     * The protocol used to federate to the application provider.
     * </p>
     * 
     * @param federationProtocol
     *        The protocol used to federate to the application provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FederationProtocol
     */

    public DescribeApplicationProviderResult withFederationProtocol(FederationProtocol federationProtocol) {
        this.federationProtocol = federationProtocol.toString();
        return this;
    }

    /**
     * <p>
     * A structure with details about the receiving application.
     * </p>
     * 
     * @param resourceServerConfig
     *        A structure with details about the receiving application.
     */

    public void setResourceServerConfig(ResourceServerConfig resourceServerConfig) {
        this.resourceServerConfig = resourceServerConfig;
    }

    /**
     * <p>
     * A structure with details about the receiving application.
     * </p>
     * 
     * @return A structure with details about the receiving application.
     */

    public ResourceServerConfig getResourceServerConfig() {
        return this.resourceServerConfig;
    }

    /**
     * <p>
     * A structure with details about the receiving application.
     * </p>
     * 
     * @param resourceServerConfig
     *        A structure with details about the receiving application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationProviderResult withResourceServerConfig(ResourceServerConfig resourceServerConfig) {
        setResourceServerConfig(resourceServerConfig);
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
        if (getApplicationProviderArn() != null)
            sb.append("ApplicationProviderArn: ").append(getApplicationProviderArn()).append(",");
        if (getDisplayData() != null)
            sb.append("DisplayData: ").append(getDisplayData()).append(",");
        if (getFederationProtocol() != null)
            sb.append("FederationProtocol: ").append(getFederationProtocol()).append(",");
        if (getResourceServerConfig() != null)
            sb.append("ResourceServerConfig: ").append(getResourceServerConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationProviderResult == false)
            return false;
        DescribeApplicationProviderResult other = (DescribeApplicationProviderResult) obj;
        if (other.getApplicationProviderArn() == null ^ this.getApplicationProviderArn() == null)
            return false;
        if (other.getApplicationProviderArn() != null && other.getApplicationProviderArn().equals(this.getApplicationProviderArn()) == false)
            return false;
        if (other.getDisplayData() == null ^ this.getDisplayData() == null)
            return false;
        if (other.getDisplayData() != null && other.getDisplayData().equals(this.getDisplayData()) == false)
            return false;
        if (other.getFederationProtocol() == null ^ this.getFederationProtocol() == null)
            return false;
        if (other.getFederationProtocol() != null && other.getFederationProtocol().equals(this.getFederationProtocol()) == false)
            return false;
        if (other.getResourceServerConfig() == null ^ this.getResourceServerConfig() == null)
            return false;
        if (other.getResourceServerConfig() != null && other.getResourceServerConfig().equals(this.getResourceServerConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationProviderArn() == null) ? 0 : getApplicationProviderArn().hashCode());
        hashCode = prime * hashCode + ((getDisplayData() == null) ? 0 : getDisplayData().hashCode());
        hashCode = prime * hashCode + ((getFederationProtocol() == null) ? 0 : getFederationProtocol().hashCode());
        hashCode = prime * hashCode + ((getResourceServerConfig() == null) ? 0 : getResourceServerConfig().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationProviderResult clone() {
        try {
            return (DescribeApplicationProviderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
