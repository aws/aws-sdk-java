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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about whether an Amazon Redshift cluster finished applying any hardware changes to security module (HSM)
 * settings that were specified in a modify cluster command.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRedshiftClusterHsmStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterHsmStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the HSM client certificate that the Amazon Redshift cluster uses to retrieve the data encryption keys
     * that are stored in an HSM.
     * </p>
     */
    private String hsmClientCertificateIdentifier;
    /**
     * <p>
     * The name of the HSM configuration that contains the information that the Amazon Redshift cluster can use to
     * retrieve and store keys in an HSM.
     * </p>
     */
    private String hsmConfigurationIdentifier;
    /**
     * <p>
     * Indicates whether the Amazon Redshift cluster has finished applying any HSM settings changes specified in a
     * modify cluster command.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>applying</code>
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the HSM client certificate that the Amazon Redshift cluster uses to retrieve the data encryption keys
     * that are stored in an HSM.
     * </p>
     * 
     * @param hsmClientCertificateIdentifier
     *        The name of the HSM client certificate that the Amazon Redshift cluster uses to retrieve the data
     *        encryption keys that are stored in an HSM.
     */

    public void setHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
    }

    /**
     * <p>
     * The name of the HSM client certificate that the Amazon Redshift cluster uses to retrieve the data encryption keys
     * that are stored in an HSM.
     * </p>
     * 
     * @return The name of the HSM client certificate that the Amazon Redshift cluster uses to retrieve the data
     *         encryption keys that are stored in an HSM.
     */

    public String getHsmClientCertificateIdentifier() {
        return this.hsmClientCertificateIdentifier;
    }

    /**
     * <p>
     * The name of the HSM client certificate that the Amazon Redshift cluster uses to retrieve the data encryption keys
     * that are stored in an HSM.
     * </p>
     * 
     * @param hsmClientCertificateIdentifier
     *        The name of the HSM client certificate that the Amazon Redshift cluster uses to retrieve the data
     *        encryption keys that are stored in an HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterHsmStatus withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        setHsmClientCertificateIdentifier(hsmClientCertificateIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the HSM configuration that contains the information that the Amazon Redshift cluster can use to
     * retrieve and store keys in an HSM.
     * </p>
     * 
     * @param hsmConfigurationIdentifier
     *        The name of the HSM configuration that contains the information that the Amazon Redshift cluster can use
     *        to retrieve and store keys in an HSM.
     */

    public void setHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * The name of the HSM configuration that contains the information that the Amazon Redshift cluster can use to
     * retrieve and store keys in an HSM.
     * </p>
     * 
     * @return The name of the HSM configuration that contains the information that the Amazon Redshift cluster can use
     *         to retrieve and store keys in an HSM.
     */

    public String getHsmConfigurationIdentifier() {
        return this.hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * The name of the HSM configuration that contains the information that the Amazon Redshift cluster can use to
     * retrieve and store keys in an HSM.
     * </p>
     * 
     * @param hsmConfigurationIdentifier
     *        The name of the HSM configuration that contains the information that the Amazon Redshift cluster can use
     *        to retrieve and store keys in an HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterHsmStatus withHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        setHsmConfigurationIdentifier(hsmConfigurationIdentifier);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Amazon Redshift cluster has finished applying any HSM settings changes specified in a
     * modify cluster command.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>applying</code>
     * </p>
     * 
     * @param status
     *        Indicates whether the Amazon Redshift cluster has finished applying any HSM settings changes specified in
     *        a modify cluster command.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Valid values: <code>active</code> | <code>applying</code>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates whether the Amazon Redshift cluster has finished applying any HSM settings changes specified in a
     * modify cluster command.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>applying</code>
     * </p>
     * 
     * @return Indicates whether the Amazon Redshift cluster has finished applying any HSM settings changes specified in
     *         a modify cluster command.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Valid values: <code>active</code> | <code>applying</code>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates whether the Amazon Redshift cluster has finished applying any HSM settings changes specified in a
     * modify cluster command.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>applying</code>
     * </p>
     * 
     * @param status
     *        Indicates whether the Amazon Redshift cluster has finished applying any HSM settings changes specified in
     *        a modify cluster command.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Valid values: <code>active</code> | <code>applying</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterHsmStatus withStatus(String status) {
        setStatus(status);
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
        if (getHsmClientCertificateIdentifier() != null)
            sb.append("HsmClientCertificateIdentifier: ").append(getHsmClientCertificateIdentifier()).append(",");
        if (getHsmConfigurationIdentifier() != null)
            sb.append("HsmConfigurationIdentifier: ").append(getHsmConfigurationIdentifier()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRedshiftClusterHsmStatus == false)
            return false;
        AwsRedshiftClusterHsmStatus other = (AwsRedshiftClusterHsmStatus) obj;
        if (other.getHsmClientCertificateIdentifier() == null ^ this.getHsmClientCertificateIdentifier() == null)
            return false;
        if (other.getHsmClientCertificateIdentifier() != null
                && other.getHsmClientCertificateIdentifier().equals(this.getHsmClientCertificateIdentifier()) == false)
            return false;
        if (other.getHsmConfigurationIdentifier() == null ^ this.getHsmConfigurationIdentifier() == null)
            return false;
        if (other.getHsmConfigurationIdentifier() != null && other.getHsmConfigurationIdentifier().equals(this.getHsmConfigurationIdentifier()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHsmClientCertificateIdentifier() == null) ? 0 : getHsmClientCertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getHsmConfigurationIdentifier() == null) ? 0 : getHsmConfigurationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsRedshiftClusterHsmStatus clone() {
        try {
            return (AwsRedshiftClusterHsmStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRedshiftClusterHsmStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
