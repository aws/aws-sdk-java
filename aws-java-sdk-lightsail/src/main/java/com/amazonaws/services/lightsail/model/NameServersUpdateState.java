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
 * Describes the state of the name server records update made by Amazon Lightsail to an Amazon Route 53 registered
 * domain.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/understanding-dns-in-amazon-lightsail">DNS in Amazon
 * Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/NameServersUpdateState" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NameServersUpdateState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status code for the name servers update.
     * </p>
     * <p>
     * Following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The name server records were successfully updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The name server record update is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The name server record update failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTED</code> - The automatic name server record update started.
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
     * The status code for the name servers update.
     * </p>
     * <p>
     * Following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The name server records were successfully updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The name server record update is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The name server record update failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTED</code> - The automatic name server record update started.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The status code for the name servers update.</p>
     *        <p>
     *        Following are the possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - The name server records were successfully updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The name server record update is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The name server record update failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STARTED</code> - The automatic name server record update started.
     *        </p>
     *        </li>
     * @see NameServersUpdateStateCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The status code for the name servers update.
     * </p>
     * <p>
     * Following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The name server records were successfully updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The name server record update is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The name server record update failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTED</code> - The automatic name server record update started.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status code for the name servers update.</p>
     *         <p>
     *         Following are the possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code> - The name server records were successfully updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - The name server record update is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - The name server record update failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STARTED</code> - The automatic name server record update started.
     *         </p>
     *         </li>
     * @see NameServersUpdateStateCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The status code for the name servers update.
     * </p>
     * <p>
     * Following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The name server records were successfully updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The name server record update is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The name server record update failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTED</code> - The automatic name server record update started.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The status code for the name servers update.</p>
     *        <p>
     *        Following are the possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - The name server records were successfully updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The name server record update is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The name server record update failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STARTED</code> - The automatic name server record update started.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NameServersUpdateStateCode
     */

    public NameServersUpdateState withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The status code for the name servers update.
     * </p>
     * <p>
     * Following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The name server records were successfully updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The name server record update is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The name server record update failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTED</code> - The automatic name server record update started.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The status code for the name servers update.</p>
     *        <p>
     *        Following are the possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - The name server records were successfully updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The name server record update is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The name server record update failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STARTED</code> - The automatic name server record update started.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NameServersUpdateStateCode
     */

    public NameServersUpdateState withCode(NameServersUpdateStateCode code) {
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

    public NameServersUpdateState withMessage(String message) {
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

        if (obj instanceof NameServersUpdateState == false)
            return false;
        NameServersUpdateState other = (NameServersUpdateState) obj;
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
    public NameServersUpdateState clone() {
        try {
            return (NameServersUpdateState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.NameServersUpdateStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
