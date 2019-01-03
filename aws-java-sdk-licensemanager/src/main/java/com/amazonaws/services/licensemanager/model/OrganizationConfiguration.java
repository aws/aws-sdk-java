/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object containing configuration information for AWS Organizations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/OrganizationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Flag to activate AWS Organization integration.
     * </p>
     */
    private Boolean enableIntegration;

    /**
     * <p>
     * Flag to activate AWS Organization integration.
     * </p>
     * 
     * @param enableIntegration
     *        Flag to activate AWS Organization integration.
     */

    public void setEnableIntegration(Boolean enableIntegration) {
        this.enableIntegration = enableIntegration;
    }

    /**
     * <p>
     * Flag to activate AWS Organization integration.
     * </p>
     * 
     * @return Flag to activate AWS Organization integration.
     */

    public Boolean getEnableIntegration() {
        return this.enableIntegration;
    }

    /**
     * <p>
     * Flag to activate AWS Organization integration.
     * </p>
     * 
     * @param enableIntegration
     *        Flag to activate AWS Organization integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfiguration withEnableIntegration(Boolean enableIntegration) {
        setEnableIntegration(enableIntegration);
        return this;
    }

    /**
     * <p>
     * Flag to activate AWS Organization integration.
     * </p>
     * 
     * @return Flag to activate AWS Organization integration.
     */

    public Boolean isEnableIntegration() {
        return this.enableIntegration;
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
        if (getEnableIntegration() != null)
            sb.append("EnableIntegration: ").append(getEnableIntegration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationConfiguration == false)
            return false;
        OrganizationConfiguration other = (OrganizationConfiguration) obj;
        if (other.getEnableIntegration() == null ^ this.getEnableIntegration() == null)
            return false;
        if (other.getEnableIntegration() != null && other.getEnableIntegration().equals(this.getEnableIntegration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableIntegration() == null) ? 0 : getEnableIntegration().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationConfiguration clone() {
        try {
            return (OrganizationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.OrganizationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
