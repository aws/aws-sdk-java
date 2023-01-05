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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the names of the data sources that couldn't be enabled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UnprocessedDataSourcesResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnprocessedDataSourcesResult implements Serializable, Cloneable, StructuredPojo {

    private MalwareProtectionConfigurationResult malwareProtection;

    /**
     * @param malwareProtection
     */

    public void setMalwareProtection(MalwareProtectionConfigurationResult malwareProtection) {
        this.malwareProtection = malwareProtection;
    }

    /**
     * @return
     */

    public MalwareProtectionConfigurationResult getMalwareProtection() {
        return this.malwareProtection;
    }

    /**
     * @param malwareProtection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedDataSourcesResult withMalwareProtection(MalwareProtectionConfigurationResult malwareProtection) {
        setMalwareProtection(malwareProtection);
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
        if (getMalwareProtection() != null)
            sb.append("MalwareProtection: ").append(getMalwareProtection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnprocessedDataSourcesResult == false)
            return false;
        UnprocessedDataSourcesResult other = (UnprocessedDataSourcesResult) obj;
        if (other.getMalwareProtection() == null ^ this.getMalwareProtection() == null)
            return false;
        if (other.getMalwareProtection() != null && other.getMalwareProtection().equals(this.getMalwareProtection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMalwareProtection() == null) ? 0 : getMalwareProtection().hashCode());
        return hashCode;
    }

    @Override
    public UnprocessedDataSourcesResult clone() {
        try {
            return (UnprocessedDataSourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.UnprocessedDataSourcesResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
