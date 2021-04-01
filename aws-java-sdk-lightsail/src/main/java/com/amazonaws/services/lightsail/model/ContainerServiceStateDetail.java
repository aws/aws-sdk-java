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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the current state of a container service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ContainerServiceStateDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerServiceStateDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state code of the container service.
     * </p>
     * <p>
     * The following state codes are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The following state codes are possible if your container service is in a <code>DEPLOYING</code> or
     * <code>UPDATING</code> state:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING_SYSTEM_RESOURCES</code> - The system resources for your container service are being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING_NETWORK_INFRASTRUCTURE</code> - The network infrastructure for your container service are being
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING_CERTIFICATE</code> - The SSL/TLS certificate for your container service is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING_SERVICE</code> - Your container service is being provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING_DEPLOYMENT</code> - Your deployment is being created on your container service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EVALUATING_HEALTH_CHECK</code> - The health of your deployment is being evaluated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING_DEPLOYMENT</code> - Your deployment is being activated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The following state codes are possible if your container service is in a <code>PENDING</code> state:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CERTIFICATE_LIMIT_EXCEEDED</code> - The SSL/TLS certificate required for your container service exceeds the
     * maximum number of certificates allowed for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN_ERROR</code> - An error was experienced when your container service was being created.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String code;
    /**
     * <p>
     * A message that provides more information for the state code.
     * </p>
     * <note>
     * <p>
     * The state detail is populated only when a container service is in a <code>PENDING</code>, <code>DEPLOYING</code>,
     * or <code>UPDATING</code> state.
     * </p>
     * </note>
     */
    private String message;

    /**
     * <p>
     * The state code of the container service.
     * </p>
     * <p>
     * The following state codes are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The following state codes are possible if your container service is in a <code>DEPLOYING</code> or
     * <code>UPDATING</code> state:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING_SYSTEM_RESOURCES</code> - The system resources for your container service are being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING_NETWORK_INFRASTRUCTURE</code> - The network infrastructure for your container service are being
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING_CERTIFICATE</code> - The SSL/TLS certificate for your container service is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING_SERVICE</code> - Your container service is being provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING_DEPLOYMENT</code> - Your deployment is being created on your container service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EVALUATING_HEALTH_CHECK</code> - The health of your deployment is being evaluated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING_DEPLOYMENT</code> - Your deployment is being activated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The following state codes are possible if your container service is in a <code>PENDING</code> state:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CERTIFICATE_LIMIT_EXCEEDED</code> - The SSL/TLS certificate required for your container service exceeds the
     * maximum number of certificates allowed for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN_ERROR</code> - An error was experienced when your container service was being created.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param code
     *        The state code of the container service.</p>
     *        <p>
     *        The following state codes are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The following state codes are possible if your container service is in a <code>DEPLOYING</code> or
     *        <code>UPDATING</code> state:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING_SYSTEM_RESOURCES</code> - The system resources for your container service are being
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING_NETWORK_INFRASTRUCTURE</code> - The network infrastructure for your container service are
     *        being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING_CERTIFICATE</code> - The SSL/TLS certificate for your container service is being
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING_SERVICE</code> - Your container service is being provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING_DEPLOYMENT</code> - Your deployment is being created on your container service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EVALUATING_HEALTH_CHECK</code> - The health of your deployment is being evaluated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATING_DEPLOYMENT</code> - Your deployment is being activated.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        The following state codes are possible if your container service is in a <code>PENDING</code> state:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CERTIFICATE_LIMIT_EXCEEDED</code> - The SSL/TLS certificate required for your container service
     *        exceeds the maximum number of certificates allowed for your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN_ERROR</code> - An error was experienced when your container service was being created.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see ContainerServiceStateDetailCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The state code of the container service.
     * </p>
     * <p>
     * The following state codes are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The following state codes are possible if your container service is in a <code>DEPLOYING</code> or
     * <code>UPDATING</code> state:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING_SYSTEM_RESOURCES</code> - The system resources for your container service are being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING_NETWORK_INFRASTRUCTURE</code> - The network infrastructure for your container service are being
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING_CERTIFICATE</code> - The SSL/TLS certificate for your container service is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING_SERVICE</code> - Your container service is being provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING_DEPLOYMENT</code> - Your deployment is being created on your container service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EVALUATING_HEALTH_CHECK</code> - The health of your deployment is being evaluated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING_DEPLOYMENT</code> - Your deployment is being activated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The following state codes are possible if your container service is in a <code>PENDING</code> state:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CERTIFICATE_LIMIT_EXCEEDED</code> - The SSL/TLS certificate required for your container service exceeds the
     * maximum number of certificates allowed for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN_ERROR</code> - An error was experienced when your container service was being created.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The state code of the container service.</p>
     *         <p>
     *         The following state codes are possible:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The following state codes are possible if your container service is in a <code>DEPLOYING</code> or
     *         <code>UPDATING</code> state:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING_SYSTEM_RESOURCES</code> - The system resources for your container service are being
     *         created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATING_NETWORK_INFRASTRUCTURE</code> - The network infrastructure for your container service are
     *         being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PROVISIONING_CERTIFICATE</code> - The SSL/TLS certificate for your container service is being
     *         created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PROVISIONING_SERVICE</code> - Your container service is being provisioned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATING_DEPLOYMENT</code> - Your deployment is being created on your container service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EVALUATING_HEALTH_CHECK</code> - The health of your deployment is being evaluated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVATING_DEPLOYMENT</code> - Your deployment is being activated.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         The following state codes are possible if your container service is in a <code>PENDING</code> state:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CERTIFICATE_LIMIT_EXCEEDED</code> - The SSL/TLS certificate required for your container service
     *         exceeds the maximum number of certificates allowed for your account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNKNOWN_ERROR</code> - An error was experienced when your container service was being created.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @see ContainerServiceStateDetailCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The state code of the container service.
     * </p>
     * <p>
     * The following state codes are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The following state codes are possible if your container service is in a <code>DEPLOYING</code> or
     * <code>UPDATING</code> state:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING_SYSTEM_RESOURCES</code> - The system resources for your container service are being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING_NETWORK_INFRASTRUCTURE</code> - The network infrastructure for your container service are being
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING_CERTIFICATE</code> - The SSL/TLS certificate for your container service is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING_SERVICE</code> - Your container service is being provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING_DEPLOYMENT</code> - Your deployment is being created on your container service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EVALUATING_HEALTH_CHECK</code> - The health of your deployment is being evaluated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING_DEPLOYMENT</code> - Your deployment is being activated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The following state codes are possible if your container service is in a <code>PENDING</code> state:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CERTIFICATE_LIMIT_EXCEEDED</code> - The SSL/TLS certificate required for your container service exceeds the
     * maximum number of certificates allowed for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN_ERROR</code> - An error was experienced when your container service was being created.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param code
     *        The state code of the container service.</p>
     *        <p>
     *        The following state codes are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The following state codes are possible if your container service is in a <code>DEPLOYING</code> or
     *        <code>UPDATING</code> state:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING_SYSTEM_RESOURCES</code> - The system resources for your container service are being
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING_NETWORK_INFRASTRUCTURE</code> - The network infrastructure for your container service are
     *        being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING_CERTIFICATE</code> - The SSL/TLS certificate for your container service is being
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING_SERVICE</code> - Your container service is being provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING_DEPLOYMENT</code> - Your deployment is being created on your container service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EVALUATING_HEALTH_CHECK</code> - The health of your deployment is being evaluated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATING_DEPLOYMENT</code> - Your deployment is being activated.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        The following state codes are possible if your container service is in a <code>PENDING</code> state:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CERTIFICATE_LIMIT_EXCEEDED</code> - The SSL/TLS certificate required for your container service
     *        exceeds the maximum number of certificates allowed for your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN_ERROR</code> - An error was experienced when your container service was being created.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerServiceStateDetailCode
     */

    public ContainerServiceStateDetail withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The state code of the container service.
     * </p>
     * <p>
     * The following state codes are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The following state codes are possible if your container service is in a <code>DEPLOYING</code> or
     * <code>UPDATING</code> state:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING_SYSTEM_RESOURCES</code> - The system resources for your container service are being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING_NETWORK_INFRASTRUCTURE</code> - The network infrastructure for your container service are being
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING_CERTIFICATE</code> - The SSL/TLS certificate for your container service is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING_SERVICE</code> - Your container service is being provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING_DEPLOYMENT</code> - Your deployment is being created on your container service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EVALUATING_HEALTH_CHECK</code> - The health of your deployment is being evaluated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING_DEPLOYMENT</code> - Your deployment is being activated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The following state codes are possible if your container service is in a <code>PENDING</code> state:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CERTIFICATE_LIMIT_EXCEEDED</code> - The SSL/TLS certificate required for your container service exceeds the
     * maximum number of certificates allowed for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN_ERROR</code> - An error was experienced when your container service was being created.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param code
     *        The state code of the container service.</p>
     *        <p>
     *        The following state codes are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The following state codes are possible if your container service is in a <code>DEPLOYING</code> or
     *        <code>UPDATING</code> state:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING_SYSTEM_RESOURCES</code> - The system resources for your container service are being
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING_NETWORK_INFRASTRUCTURE</code> - The network infrastructure for your container service are
     *        being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING_CERTIFICATE</code> - The SSL/TLS certificate for your container service is being
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING_SERVICE</code> - Your container service is being provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING_DEPLOYMENT</code> - Your deployment is being created on your container service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EVALUATING_HEALTH_CHECK</code> - The health of your deployment is being evaluated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATING_DEPLOYMENT</code> - Your deployment is being activated.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        The following state codes are possible if your container service is in a <code>PENDING</code> state:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CERTIFICATE_LIMIT_EXCEEDED</code> - The SSL/TLS certificate required for your container service
     *        exceeds the maximum number of certificates allowed for your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN_ERROR</code> - An error was experienced when your container service was being created.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerServiceStateDetailCode
     */

    public ContainerServiceStateDetail withCode(ContainerServiceStateDetailCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * A message that provides more information for the state code.
     * </p>
     * <note>
     * <p>
     * The state detail is populated only when a container service is in a <code>PENDING</code>, <code>DEPLOYING</code>,
     * or <code>UPDATING</code> state.
     * </p>
     * </note>
     * 
     * @param message
     *        A message that provides more information for the state code.</p> <note>
     *        <p>
     *        The state detail is populated only when a container service is in a <code>PENDING</code>,
     *        <code>DEPLOYING</code>, or <code>UPDATING</code> state.
     *        </p>
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message that provides more information for the state code.
     * </p>
     * <note>
     * <p>
     * The state detail is populated only when a container service is in a <code>PENDING</code>, <code>DEPLOYING</code>,
     * or <code>UPDATING</code> state.
     * </p>
     * </note>
     * 
     * @return A message that provides more information for the state code.</p> <note>
     *         <p>
     *         The state detail is populated only when a container service is in a <code>PENDING</code>,
     *         <code>DEPLOYING</code>, or <code>UPDATING</code> state.
     *         </p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message that provides more information for the state code.
     * </p>
     * <note>
     * <p>
     * The state detail is populated only when a container service is in a <code>PENDING</code>, <code>DEPLOYING</code>,
     * or <code>UPDATING</code> state.
     * </p>
     * </note>
     * 
     * @param message
     *        A message that provides more information for the state code.</p> <note>
     *        <p>
     *        The state detail is populated only when a container service is in a <code>PENDING</code>,
     *        <code>DEPLOYING</code>, or <code>UPDATING</code> state.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceStateDetail withMessage(String message) {
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

        if (obj instanceof ContainerServiceStateDetail == false)
            return false;
        ContainerServiceStateDetail other = (ContainerServiceStateDetail) obj;
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
    public ContainerServiceStateDetail clone() {
        try {
            return (ContainerServiceStateDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.ContainerServiceStateDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
