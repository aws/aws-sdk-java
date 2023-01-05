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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about the input that failed to satisfy the constraints specified by a call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/BadRequestDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BadRequestDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Detailed information about the bad request exception error when creating a hosted configuration version.
     * </p>
     */
    private java.util.List<InvalidConfigurationDetail> invalidConfiguration;

    /**
     * <p>
     * Detailed information about the bad request exception error when creating a hosted configuration version.
     * </p>
     * 
     * @return Detailed information about the bad request exception error when creating a hosted configuration version.
     */

    public java.util.List<InvalidConfigurationDetail> getInvalidConfiguration() {
        return invalidConfiguration;
    }

    /**
     * <p>
     * Detailed information about the bad request exception error when creating a hosted configuration version.
     * </p>
     * 
     * @param invalidConfiguration
     *        Detailed information about the bad request exception error when creating a hosted configuration version.
     */

    public void setInvalidConfiguration(java.util.Collection<InvalidConfigurationDetail> invalidConfiguration) {
        if (invalidConfiguration == null) {
            this.invalidConfiguration = null;
            return;
        }

        this.invalidConfiguration = new java.util.ArrayList<InvalidConfigurationDetail>(invalidConfiguration);
    }

    /**
     * <p>
     * Detailed information about the bad request exception error when creating a hosted configuration version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvalidConfiguration(java.util.Collection)} or {@link #withInvalidConfiguration(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param invalidConfiguration
     *        Detailed information about the bad request exception error when creating a hosted configuration version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestDetails withInvalidConfiguration(InvalidConfigurationDetail... invalidConfiguration) {
        if (this.invalidConfiguration == null) {
            setInvalidConfiguration(new java.util.ArrayList<InvalidConfigurationDetail>(invalidConfiguration.length));
        }
        for (InvalidConfigurationDetail ele : invalidConfiguration) {
            this.invalidConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Detailed information about the bad request exception error when creating a hosted configuration version.
     * </p>
     * 
     * @param invalidConfiguration
     *        Detailed information about the bad request exception error when creating a hosted configuration version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestDetails withInvalidConfiguration(java.util.Collection<InvalidConfigurationDetail> invalidConfiguration) {
        setInvalidConfiguration(invalidConfiguration);
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
        if (getInvalidConfiguration() != null)
            sb.append("InvalidConfiguration: ").append(getInvalidConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BadRequestDetails == false)
            return false;
        BadRequestDetails other = (BadRequestDetails) obj;
        if (other.getInvalidConfiguration() == null ^ this.getInvalidConfiguration() == null)
            return false;
        if (other.getInvalidConfiguration() != null && other.getInvalidConfiguration().equals(this.getInvalidConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvalidConfiguration() == null) ? 0 : getInvalidConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public BadRequestDetails clone() {
        try {
            return (BadRequestDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appconfig.model.transform.BadRequestDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
