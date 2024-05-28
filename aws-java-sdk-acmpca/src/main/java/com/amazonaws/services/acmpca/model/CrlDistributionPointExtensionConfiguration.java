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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configuration information for the default behavior of the CRL Distribution Point (CDP) extension in
 * certificates issued by your CA. This extension contains a link to download the CRL, so you can check whether a
 * certificate has been revoked. To choose whether you want this extension omitted or not in certificates issued by your
 * CA, you can set the <b>OmitExtension</b> parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CrlDistributionPointExtensionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrlDistributionPointExtensionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configures whether the CRL Distribution Point extension should be populated with the default URL to the CRL. If
     * set to <code>true</code>, then the CDP extension will not be present in any certificates issued by that CA unless
     * otherwise specified through CSR or API passthrough.
     * </p>
     * <note>
     * <p>
     * Only set this if you have another way to distribute the CRL Distribution Points ffor certificates issued by your
     * CA, such as the Matter Distributed Compliance Ledger
     * </p>
     * <p>
     * This configuration cannot be enabled with a custom CNAME set.
     * </p>
     * </note>
     */
    private Boolean omitExtension;

    /**
     * <p>
     * Configures whether the CRL Distribution Point extension should be populated with the default URL to the CRL. If
     * set to <code>true</code>, then the CDP extension will not be present in any certificates issued by that CA unless
     * otherwise specified through CSR or API passthrough.
     * </p>
     * <note>
     * <p>
     * Only set this if you have another way to distribute the CRL Distribution Points ffor certificates issued by your
     * CA, such as the Matter Distributed Compliance Ledger
     * </p>
     * <p>
     * This configuration cannot be enabled with a custom CNAME set.
     * </p>
     * </note>
     * 
     * @param omitExtension
     *        Configures whether the CRL Distribution Point extension should be populated with the default URL to the
     *        CRL. If set to <code>true</code>, then the CDP extension will not be present in any certificates issued by
     *        that CA unless otherwise specified through CSR or API passthrough.</p> <note>
     *        <p>
     *        Only set this if you have another way to distribute the CRL Distribution Points ffor certificates issued
     *        by your CA, such as the Matter Distributed Compliance Ledger
     *        </p>
     *        <p>
     *        This configuration cannot be enabled with a custom CNAME set.
     *        </p>
     */

    public void setOmitExtension(Boolean omitExtension) {
        this.omitExtension = omitExtension;
    }

    /**
     * <p>
     * Configures whether the CRL Distribution Point extension should be populated with the default URL to the CRL. If
     * set to <code>true</code>, then the CDP extension will not be present in any certificates issued by that CA unless
     * otherwise specified through CSR or API passthrough.
     * </p>
     * <note>
     * <p>
     * Only set this if you have another way to distribute the CRL Distribution Points ffor certificates issued by your
     * CA, such as the Matter Distributed Compliance Ledger
     * </p>
     * <p>
     * This configuration cannot be enabled with a custom CNAME set.
     * </p>
     * </note>
     * 
     * @return Configures whether the CRL Distribution Point extension should be populated with the default URL to the
     *         CRL. If set to <code>true</code>, then the CDP extension will not be present in any certificates issued
     *         by that CA unless otherwise specified through CSR or API passthrough.</p> <note>
     *         <p>
     *         Only set this if you have another way to distribute the CRL Distribution Points ffor certificates issued
     *         by your CA, such as the Matter Distributed Compliance Ledger
     *         </p>
     *         <p>
     *         This configuration cannot be enabled with a custom CNAME set.
     *         </p>
     */

    public Boolean getOmitExtension() {
        return this.omitExtension;
    }

    /**
     * <p>
     * Configures whether the CRL Distribution Point extension should be populated with the default URL to the CRL. If
     * set to <code>true</code>, then the CDP extension will not be present in any certificates issued by that CA unless
     * otherwise specified through CSR or API passthrough.
     * </p>
     * <note>
     * <p>
     * Only set this if you have another way to distribute the CRL Distribution Points ffor certificates issued by your
     * CA, such as the Matter Distributed Compliance Ledger
     * </p>
     * <p>
     * This configuration cannot be enabled with a custom CNAME set.
     * </p>
     * </note>
     * 
     * @param omitExtension
     *        Configures whether the CRL Distribution Point extension should be populated with the default URL to the
     *        CRL. If set to <code>true</code>, then the CDP extension will not be present in any certificates issued by
     *        that CA unless otherwise specified through CSR or API passthrough.</p> <note>
     *        <p>
     *        Only set this if you have another way to distribute the CRL Distribution Points ffor certificates issued
     *        by your CA, such as the Matter Distributed Compliance Ledger
     *        </p>
     *        <p>
     *        This configuration cannot be enabled with a custom CNAME set.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrlDistributionPointExtensionConfiguration withOmitExtension(Boolean omitExtension) {
        setOmitExtension(omitExtension);
        return this;
    }

    /**
     * <p>
     * Configures whether the CRL Distribution Point extension should be populated with the default URL to the CRL. If
     * set to <code>true</code>, then the CDP extension will not be present in any certificates issued by that CA unless
     * otherwise specified through CSR or API passthrough.
     * </p>
     * <note>
     * <p>
     * Only set this if you have another way to distribute the CRL Distribution Points ffor certificates issued by your
     * CA, such as the Matter Distributed Compliance Ledger
     * </p>
     * <p>
     * This configuration cannot be enabled with a custom CNAME set.
     * </p>
     * </note>
     * 
     * @return Configures whether the CRL Distribution Point extension should be populated with the default URL to the
     *         CRL. If set to <code>true</code>, then the CDP extension will not be present in any certificates issued
     *         by that CA unless otherwise specified through CSR or API passthrough.</p> <note>
     *         <p>
     *         Only set this if you have another way to distribute the CRL Distribution Points ffor certificates issued
     *         by your CA, such as the Matter Distributed Compliance Ledger
     *         </p>
     *         <p>
     *         This configuration cannot be enabled with a custom CNAME set.
     *         </p>
     */

    public Boolean isOmitExtension() {
        return this.omitExtension;
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
        if (getOmitExtension() != null)
            sb.append("OmitExtension: ").append(getOmitExtension());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrlDistributionPointExtensionConfiguration == false)
            return false;
        CrlDistributionPointExtensionConfiguration other = (CrlDistributionPointExtensionConfiguration) obj;
        if (other.getOmitExtension() == null ^ this.getOmitExtension() == null)
            return false;
        if (other.getOmitExtension() != null && other.getOmitExtension().equals(this.getOmitExtension()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOmitExtension() == null) ? 0 : getOmitExtension().hashCode());
        return hashCode;
    }

    @Override
    public CrlDistributionPointExtensionConfiguration clone() {
        try {
            return (CrlDistributionPointExtensionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.CrlDistributionPointExtensionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
