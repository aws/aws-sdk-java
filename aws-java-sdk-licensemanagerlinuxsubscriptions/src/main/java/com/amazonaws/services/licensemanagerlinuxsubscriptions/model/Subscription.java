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
package com.amazonaws.services.licensemanagerlinuxsubscriptions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object which details a discovered Linux subscription.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-linux-subscriptions-2018-05-10/Subscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subscription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total amount of running instances using this subscription.
     * </p>
     */
    private Long instanceCount;
    /**
     * <p>
     * The name of the subscription.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of subscription. The type can be subscription-included with Amazon EC2, Bring Your Own Subscription
     * model (BYOS), or from the Amazon Web Services Marketplace. Certain subscriptions may use licensing from the
     * Amazon Web Services Marketplace as well as OS licensing from Amazon EC2 or BYOS.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The total amount of running instances using this subscription.
     * </p>
     * 
     * @param instanceCount
     *        The total amount of running instances using this subscription.
     */

    public void setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The total amount of running instances using this subscription.
     * </p>
     * 
     * @return The total amount of running instances using this subscription.
     */

    public Long getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The total amount of running instances using this subscription.
     * </p>
     * 
     * @param instanceCount
     *        The total amount of running instances using this subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withInstanceCount(Long instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The name of the subscription.
     * </p>
     * 
     * @param name
     *        The name of the subscription.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the subscription.
     * </p>
     * 
     * @return The name of the subscription.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the subscription.
     * </p>
     * 
     * @param name
     *        The name of the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of subscription. The type can be subscription-included with Amazon EC2, Bring Your Own Subscription
     * model (BYOS), or from the Amazon Web Services Marketplace. Certain subscriptions may use licensing from the
     * Amazon Web Services Marketplace as well as OS licensing from Amazon EC2 or BYOS.
     * </p>
     * 
     * @param type
     *        The type of subscription. The type can be subscription-included with Amazon EC2, Bring Your Own
     *        Subscription model (BYOS), or from the Amazon Web Services Marketplace. Certain subscriptions may use
     *        licensing from the Amazon Web Services Marketplace as well as OS licensing from Amazon EC2 or BYOS.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of subscription. The type can be subscription-included with Amazon EC2, Bring Your Own Subscription
     * model (BYOS), or from the Amazon Web Services Marketplace. Certain subscriptions may use licensing from the
     * Amazon Web Services Marketplace as well as OS licensing from Amazon EC2 or BYOS.
     * </p>
     * 
     * @return The type of subscription. The type can be subscription-included with Amazon EC2, Bring Your Own
     *         Subscription model (BYOS), or from the Amazon Web Services Marketplace. Certain subscriptions may use
     *         licensing from the Amazon Web Services Marketplace as well as OS licensing from Amazon EC2 or BYOS.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of subscription. The type can be subscription-included with Amazon EC2, Bring Your Own Subscription
     * model (BYOS), or from the Amazon Web Services Marketplace. Certain subscriptions may use licensing from the
     * Amazon Web Services Marketplace as well as OS licensing from Amazon EC2 or BYOS.
     * </p>
     * 
     * @param type
     *        The type of subscription. The type can be subscription-included with Amazon EC2, Bring Your Own
     *        Subscription model (BYOS), or from the Amazon Web Services Marketplace. Certain subscriptions may use
     *        licensing from the Amazon Web Services Marketplace as well as OS licensing from Amazon EC2 or BYOS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withType(String type) {
        setType(type);
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
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subscription == false)
            return false;
        Subscription other = (Subscription) obj;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Subscription clone() {
        try {
            return (Subscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanagerlinuxsubscriptions.model.transform.SubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
