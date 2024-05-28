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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The server certificate configuration.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerCertificateConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean value that indicates whether Online Certificate Status Protocol (OCSP) server certificate check is
     * enabled or not.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html">Configuring OCSP
     * server-certificate stapling in domain configuration</a> from Amazon Web Services IoT Core Developer Guide.
     * </p>
     */
    private Boolean enableOCSPCheck;

    /**
     * <p>
     * A Boolean value that indicates whether Online Certificate Status Protocol (OCSP) server certificate check is
     * enabled or not.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html">Configuring OCSP
     * server-certificate stapling in domain configuration</a> from Amazon Web Services IoT Core Developer Guide.
     * </p>
     * 
     * @param enableOCSPCheck
     *        A Boolean value that indicates whether Online Certificate Status Protocol (OCSP) server certificate check
     *        is enabled or not.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html"
     *        >Configuring OCSP server-certificate stapling in domain configuration</a> from Amazon Web Services IoT
     *        Core Developer Guide.
     */

    public void setEnableOCSPCheck(Boolean enableOCSPCheck) {
        this.enableOCSPCheck = enableOCSPCheck;
    }

    /**
     * <p>
     * A Boolean value that indicates whether Online Certificate Status Protocol (OCSP) server certificate check is
     * enabled or not.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html">Configuring OCSP
     * server-certificate stapling in domain configuration</a> from Amazon Web Services IoT Core Developer Guide.
     * </p>
     * 
     * @return A Boolean value that indicates whether Online Certificate Status Protocol (OCSP) server certificate check
     *         is enabled or not.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html"
     *         >Configuring OCSP server-certificate stapling in domain configuration</a> from Amazon Web Services IoT
     *         Core Developer Guide.
     */

    public Boolean getEnableOCSPCheck() {
        return this.enableOCSPCheck;
    }

    /**
     * <p>
     * A Boolean value that indicates whether Online Certificate Status Protocol (OCSP) server certificate check is
     * enabled or not.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html">Configuring OCSP
     * server-certificate stapling in domain configuration</a> from Amazon Web Services IoT Core Developer Guide.
     * </p>
     * 
     * @param enableOCSPCheck
     *        A Boolean value that indicates whether Online Certificate Status Protocol (OCSP) server certificate check
     *        is enabled or not.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html"
     *        >Configuring OCSP server-certificate stapling in domain configuration</a> from Amazon Web Services IoT
     *        Core Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateConfig withEnableOCSPCheck(Boolean enableOCSPCheck) {
        setEnableOCSPCheck(enableOCSPCheck);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether Online Certificate Status Protocol (OCSP) server certificate check is
     * enabled or not.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html">Configuring OCSP
     * server-certificate stapling in domain configuration</a> from Amazon Web Services IoT Core Developer Guide.
     * </p>
     * 
     * @return A Boolean value that indicates whether Online Certificate Status Protocol (OCSP) server certificate check
     *         is enabled or not.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html"
     *         >Configuring OCSP server-certificate stapling in domain configuration</a> from Amazon Web Services IoT
     *         Core Developer Guide.
     */

    public Boolean isEnableOCSPCheck() {
        return this.enableOCSPCheck;
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
        if (getEnableOCSPCheck() != null)
            sb.append("EnableOCSPCheck: ").append(getEnableOCSPCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerCertificateConfig == false)
            return false;
        ServerCertificateConfig other = (ServerCertificateConfig) obj;
        if (other.getEnableOCSPCheck() == null ^ this.getEnableOCSPCheck() == null)
            return false;
        if (other.getEnableOCSPCheck() != null && other.getEnableOCSPCheck().equals(this.getEnableOCSPCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableOCSPCheck() == null) ? 0 : getEnableOCSPCheck().hashCode());
        return hashCode;
    }

    @Override
    public ServerCertificateConfig clone() {
        try {
            return (ServerCertificateConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ServerCertificateConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
