/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the instances that belong to the replacement environment in a blue/green deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GreenFleetProvisioningOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GreenFleetProvisioningOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The method used to add instances to a replacement environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISCOVER_EXISTING: Use instances that already exist or will be created manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * COPY_AUTO_SCALING_GROUP: Use settings from a specified Auto Scaling group to define and create instances in a new
     * Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     */
    private String action;

    /**
     * <p>
     * The method used to add instances to a replacement environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISCOVER_EXISTING: Use instances that already exist or will be created manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * COPY_AUTO_SCALING_GROUP: Use settings from a specified Auto Scaling group to define and create instances in a new
     * Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The method used to add instances to a replacement environment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DISCOVER_EXISTING: Use instances that already exist or will be created manually.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COPY_AUTO_SCALING_GROUP: Use settings from a specified Auto Scaling group to define and create instances
     *        in a new Auto Scaling group.
     *        </p>
     *        </li>
     * @see GreenFleetProvisioningAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The method used to add instances to a replacement environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISCOVER_EXISTING: Use instances that already exist or will be created manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * COPY_AUTO_SCALING_GROUP: Use settings from a specified Auto Scaling group to define and create instances in a new
     * Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The method used to add instances to a replacement environment.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DISCOVER_EXISTING: Use instances that already exist or will be created manually.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         COPY_AUTO_SCALING_GROUP: Use settings from a specified Auto Scaling group to define and create instances
     *         in a new Auto Scaling group.
     *         </p>
     *         </li>
     * @see GreenFleetProvisioningAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The method used to add instances to a replacement environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISCOVER_EXISTING: Use instances that already exist or will be created manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * COPY_AUTO_SCALING_GROUP: Use settings from a specified Auto Scaling group to define and create instances in a new
     * Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The method used to add instances to a replacement environment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DISCOVER_EXISTING: Use instances that already exist or will be created manually.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COPY_AUTO_SCALING_GROUP: Use settings from a specified Auto Scaling group to define and create instances
     *        in a new Auto Scaling group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GreenFleetProvisioningAction
     */

    public GreenFleetProvisioningOption withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The method used to add instances to a replacement environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISCOVER_EXISTING: Use instances that already exist or will be created manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * COPY_AUTO_SCALING_GROUP: Use settings from a specified Auto Scaling group to define and create instances in a new
     * Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The method used to add instances to a replacement environment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DISCOVER_EXISTING: Use instances that already exist or will be created manually.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COPY_AUTO_SCALING_GROUP: Use settings from a specified Auto Scaling group to define and create instances
     *        in a new Auto Scaling group.
     *        </p>
     *        </li>
     * @see GreenFleetProvisioningAction
     */

    public void setAction(GreenFleetProvisioningAction action) {
        withAction(action);
    }

    /**
     * <p>
     * The method used to add instances to a replacement environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISCOVER_EXISTING: Use instances that already exist or will be created manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * COPY_AUTO_SCALING_GROUP: Use settings from a specified Auto Scaling group to define and create instances in a new
     * Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The method used to add instances to a replacement environment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DISCOVER_EXISTING: Use instances that already exist or will be created manually.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COPY_AUTO_SCALING_GROUP: Use settings from a specified Auto Scaling group to define and create instances
     *        in a new Auto Scaling group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GreenFleetProvisioningAction
     */

    public GreenFleetProvisioningOption withAction(GreenFleetProvisioningAction action) {
        this.action = action.toString();
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GreenFleetProvisioningOption == false)
            return false;
        GreenFleetProvisioningOption other = (GreenFleetProvisioningOption) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public GreenFleetProvisioningOption clone() {
        try {
            return (GreenFleetProvisioningOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.GreenFleetProvisioningOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
