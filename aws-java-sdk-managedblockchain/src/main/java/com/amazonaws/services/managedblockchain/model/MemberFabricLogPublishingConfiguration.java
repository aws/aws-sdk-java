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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration properties for logging events associated with a member of a Managed Blockchain network using the
 * Hyperledger Fabric framework.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/MemberFabricLogPublishingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberFabricLogPublishingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration properties for logging events associated with a member's Certificate Authority (CA). CA logs help
     * you determine when a member in your account joins the network, or when new peers register with a member CA.
     * </p>
     */
    private LogConfigurations caLogs;

    /**
     * <p>
     * Configuration properties for logging events associated with a member's Certificate Authority (CA). CA logs help
     * you determine when a member in your account joins the network, or when new peers register with a member CA.
     * </p>
     * 
     * @param caLogs
     *        Configuration properties for logging events associated with a member's Certificate Authority (CA). CA logs
     *        help you determine when a member in your account joins the network, or when new peers register with a
     *        member CA.
     */

    public void setCaLogs(LogConfigurations caLogs) {
        this.caLogs = caLogs;
    }

    /**
     * <p>
     * Configuration properties for logging events associated with a member's Certificate Authority (CA). CA logs help
     * you determine when a member in your account joins the network, or when new peers register with a member CA.
     * </p>
     * 
     * @return Configuration properties for logging events associated with a member's Certificate Authority (CA). CA
     *         logs help you determine when a member in your account joins the network, or when new peers register with
     *         a member CA.
     */

    public LogConfigurations getCaLogs() {
        return this.caLogs;
    }

    /**
     * <p>
     * Configuration properties for logging events associated with a member's Certificate Authority (CA). CA logs help
     * you determine when a member in your account joins the network, or when new peers register with a member CA.
     * </p>
     * 
     * @param caLogs
     *        Configuration properties for logging events associated with a member's Certificate Authority (CA). CA logs
     *        help you determine when a member in your account joins the network, or when new peers register with a
     *        member CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberFabricLogPublishingConfiguration withCaLogs(LogConfigurations caLogs) {
        setCaLogs(caLogs);
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
        if (getCaLogs() != null)
            sb.append("CaLogs: ").append(getCaLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberFabricLogPublishingConfiguration == false)
            return false;
        MemberFabricLogPublishingConfiguration other = (MemberFabricLogPublishingConfiguration) obj;
        if (other.getCaLogs() == null ^ this.getCaLogs() == null)
            return false;
        if (other.getCaLogs() != null && other.getCaLogs().equals(this.getCaLogs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaLogs() == null) ? 0 : getCaLogs().hashCode());
        return hashCode;
    }

    @Override
    public MemberFabricLogPublishingConfiguration clone() {
        try {
            return (MemberFabricLogPublishingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.MemberFabricLogPublishingConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
