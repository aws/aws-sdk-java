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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of a provisioned service catalog product. For information about service catalog, see <a
 * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is Amazon Web Services
 * Service Catalog</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ServiceCatalogProvisionedProductDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceCatalogProvisionedProductDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the provisioned product.
     * </p>
     */
    private String provisionedProductId;
    /**
     * <p>
     * The current status of the product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation succeeded and
     * completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for an
     * AVAILABLE status before performing operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the requested
     * operation but is not exactly what was requested. For example, a request to update to a new version failed and the
     * stack rolled back to the current version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not running.
     * For example, CloudFormation received a parameter value that was not valid and could not launch the stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new product,
     * but resources have not yet been created. After reviewing the list of resources to be created, execute the plan.
     * Wait for an AVAILABLE status before performing operations.
     * </p>
     * </li>
     * </ul>
     */
    private String provisionedProductStatusMessage;

    /**
     * <p>
     * The ID of the provisioned product.
     * </p>
     * 
     * @param provisionedProductId
     *        The ID of the provisioned product.
     */

    public void setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
    }

    /**
     * <p>
     * The ID of the provisioned product.
     * </p>
     * 
     * @return The ID of the provisioned product.
     */

    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    /**
     * <p>
     * The ID of the provisioned product.
     * </p>
     * 
     * @param provisionedProductId
     *        The ID of the provisioned product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceCatalogProvisionedProductDetails withProvisionedProductId(String provisionedProductId) {
        setProvisionedProductId(provisionedProductId);
        return this;
    }

    /**
     * <p>
     * The current status of the product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation succeeded and
     * completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for an
     * AVAILABLE status before performing operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the requested
     * operation but is not exactly what was requested. For example, a request to update to a new version failed and the
     * stack rolled back to the current version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not running.
     * For example, CloudFormation received a parameter value that was not valid and could not launch the stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new product,
     * but resources have not yet been created. After reviewing the list of resources to be created, execute the plan.
     * Wait for an AVAILABLE status before performing operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param provisionedProductStatusMessage
     *        The current status of the product.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation succeeded
     *        and completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for
     *        an AVAILABLE status before performing operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the requested
     *        operation but is not exactly what was requested. For example, a request to update to a new version failed
     *        and the stack rolled back to the current version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not
     *        running. For example, CloudFormation received a parameter value that was not valid and could not launch
     *        the stack.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new
     *        product, but resources have not yet been created. After reviewing the list of resources to be created,
     *        execute the plan. Wait for an AVAILABLE status before performing operations.
     *        </p>
     *        </li>
     */

    public void setProvisionedProductStatusMessage(String provisionedProductStatusMessage) {
        this.provisionedProductStatusMessage = provisionedProductStatusMessage;
    }

    /**
     * <p>
     * The current status of the product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation succeeded and
     * completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for an
     * AVAILABLE status before performing operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the requested
     * operation but is not exactly what was requested. For example, a request to update to a new version failed and the
     * stack rolled back to the current version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not running.
     * For example, CloudFormation received a parameter value that was not valid and could not launch the stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new product,
     * but resources have not yet been created. After reviewing the list of resources to be created, execute the plan.
     * Wait for an AVAILABLE status before performing operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the product.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation
     *         succeeded and completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for
     *         an AVAILABLE status before performing operations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the
     *         requested operation but is not exactly what was requested. For example, a request to update to a new
     *         version failed and the stack rolled back to the current version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not
     *         running. For example, CloudFormation received a parameter value that was not valid and could not launch
     *         the stack.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new
     *         product, but resources have not yet been created. After reviewing the list of resources to be created,
     *         execute the plan. Wait for an AVAILABLE status before performing operations.
     *         </p>
     *         </li>
     */

    public String getProvisionedProductStatusMessage() {
        return this.provisionedProductStatusMessage;
    }

    /**
     * <p>
     * The current status of the product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation succeeded and
     * completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for an
     * AVAILABLE status before performing operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the requested
     * operation but is not exactly what was requested. For example, a request to update to a new version failed and the
     * stack rolled back to the current version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not running.
     * For example, CloudFormation received a parameter value that was not valid and could not launch the stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new product,
     * but resources have not yet been created. After reviewing the list of resources to be created, execute the plan.
     * Wait for an AVAILABLE status before performing operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param provisionedProductStatusMessage
     *        The current status of the product.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation succeeded
     *        and completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for
     *        an AVAILABLE status before performing operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the requested
     *        operation but is not exactly what was requested. For example, a request to update to a new version failed
     *        and the stack rolled back to the current version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not
     *        running. For example, CloudFormation received a parameter value that was not valid and could not launch
     *        the stack.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new
     *        product, but resources have not yet been created. After reviewing the list of resources to be created,
     *        execute the plan. Wait for an AVAILABLE status before performing operations.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceCatalogProvisionedProductDetails withProvisionedProductStatusMessage(String provisionedProductStatusMessage) {
        setProvisionedProductStatusMessage(provisionedProductStatusMessage);
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
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: ").append(getProvisionedProductId()).append(",");
        if (getProvisionedProductStatusMessage() != null)
            sb.append("ProvisionedProductStatusMessage: ").append(getProvisionedProductStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceCatalogProvisionedProductDetails == false)
            return false;
        ServiceCatalogProvisionedProductDetails other = (ServiceCatalogProvisionedProductDetails) obj;
        if (other.getProvisionedProductId() == null ^ this.getProvisionedProductId() == null)
            return false;
        if (other.getProvisionedProductId() != null && other.getProvisionedProductId().equals(this.getProvisionedProductId()) == false)
            return false;
        if (other.getProvisionedProductStatusMessage() == null ^ this.getProvisionedProductStatusMessage() == null)
            return false;
        if (other.getProvisionedProductStatusMessage() != null
                && other.getProvisionedProductStatusMessage().equals(this.getProvisionedProductStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisionedProductId() == null) ? 0 : getProvisionedProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductStatusMessage() == null) ? 0 : getProvisionedProductStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public ServiceCatalogProvisionedProductDetails clone() {
        try {
            return (ServiceCatalogProvisionedProductDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ServiceCatalogProvisionedProductDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
