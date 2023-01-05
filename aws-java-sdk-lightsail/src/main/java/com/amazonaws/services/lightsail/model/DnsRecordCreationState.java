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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the creation state of the canonical name (CNAME) records that are automatically added by Amazon Lightsail
 * to the DNS of a domain to validate domain ownership for an SSL/TLS certificate.
 * </p>
 * <p>
 * When you create an SSL/TLS certificate for a Lightsail resource, you must add a set of CNAME records to the DNS of
 * the domains for the certificate to validate that you own the domains. Lightsail can automatically add the CNAME
 * records to the DNS of the domain if the DNS zone for the domain exists within your Lightsail account. If automatic
 * record addition fails, or if you manage the DNS of your domain using a third-party service, then you must manually
 * add the CNAME records to the DNS of your domain. For more information, see <a
 * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/verify-tls-ssl-certificate-using-dns-cname-https"
 * >Verify an SSL/TLS certificate in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DnsRecordCreationState" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnsRecordCreationState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status code for the automated DNS record creation.
     * </p>
     * <p>
     * Following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The validation records were successfully added to the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTED</code> - The automatic DNS record creation has started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The validation records failed to be added to the domain.
     * </p>
     * </li>
     * </ul>
     */
    private String code;
    /**
     * <p>
     * The message that describes the reason for the status code.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The status code for the automated DNS record creation.
     * </p>
     * <p>
     * Following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The validation records were successfully added to the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTED</code> - The automatic DNS record creation has started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The validation records failed to be added to the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The status code for the automated DNS record creation.</p>
     *        <p>
     *        Following are the possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - The validation records were successfully added to the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STARTED</code> - The automatic DNS record creation has started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The validation records failed to be added to the domain.
     *        </p>
     *        </li>
     * @see DnsRecordCreationStateCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The status code for the automated DNS record creation.
     * </p>
     * <p>
     * Following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The validation records were successfully added to the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTED</code> - The automatic DNS record creation has started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The validation records failed to be added to the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status code for the automated DNS record creation.</p>
     *         <p>
     *         Following are the possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code> - The validation records were successfully added to the domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STARTED</code> - The automatic DNS record creation has started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - The validation records failed to be added to the domain.
     *         </p>
     *         </li>
     * @see DnsRecordCreationStateCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The status code for the automated DNS record creation.
     * </p>
     * <p>
     * Following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The validation records were successfully added to the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTED</code> - The automatic DNS record creation has started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The validation records failed to be added to the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The status code for the automated DNS record creation.</p>
     *        <p>
     *        Following are the possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - The validation records were successfully added to the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STARTED</code> - The automatic DNS record creation has started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The validation records failed to be added to the domain.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsRecordCreationStateCode
     */

    public DnsRecordCreationState withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The status code for the automated DNS record creation.
     * </p>
     * <p>
     * Following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The validation records were successfully added to the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTED</code> - The automatic DNS record creation has started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The validation records failed to be added to the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The status code for the automated DNS record creation.</p>
     *        <p>
     *        Following are the possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - The validation records were successfully added to the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STARTED</code> - The automatic DNS record creation has started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The validation records failed to be added to the domain.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsRecordCreationStateCode
     */

    public DnsRecordCreationState withCode(DnsRecordCreationStateCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * The message that describes the reason for the status code.
     * </p>
     * 
     * @param message
     *        The message that describes the reason for the status code.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message that describes the reason for the status code.
     * </p>
     * 
     * @return The message that describes the reason for the status code.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message that describes the reason for the status code.
     * </p>
     * 
     * @param message
     *        The message that describes the reason for the status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRecordCreationState withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsRecordCreationState == false)
            return false;
        DnsRecordCreationState other = (DnsRecordCreationState) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public DnsRecordCreationState clone() {
        try {
            return (DnsRecordCreationState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.DnsRecordCreationStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
