/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to modify the delivery options for a configuration set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/PutConfigurationSetDeliveryOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutConfigurationSetDeliveryOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration set that you want to specify the delivery options for.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS).
     * </p>
     */
    private DeliveryOptions deliveryOptions;

    /**
     * <p>
     * The name of the configuration set that you want to specify the delivery options for.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to specify the delivery options for.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to specify the delivery options for.
     * </p>
     * 
     * @return The name of the configuration set that you want to specify the delivery options for.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to specify the delivery options for.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to specify the delivery options for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationSetDeliveryOptionsRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS).
     * </p>
     * 
     * @param deliveryOptions
     *        Specifies whether messages that use the configuration set are required to use Transport Layer Security
     *        (TLS).
     */

    public void setDeliveryOptions(DeliveryOptions deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS).
     * </p>
     * 
     * @return Specifies whether messages that use the configuration set are required to use Transport Layer Security
     *         (TLS).
     */

    public DeliveryOptions getDeliveryOptions() {
        return this.deliveryOptions;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS).
     * </p>
     * 
     * @param deliveryOptions
     *        Specifies whether messages that use the configuration set are required to use Transport Layer Security
     *        (TLS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationSetDeliveryOptionsRequest withDeliveryOptions(DeliveryOptions deliveryOptions) {
        setDeliveryOptions(deliveryOptions);
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
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getDeliveryOptions() != null)
            sb.append("DeliveryOptions: ").append(getDeliveryOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConfigurationSetDeliveryOptionsRequest == false)
            return false;
        PutConfigurationSetDeliveryOptionsRequest other = (PutConfigurationSetDeliveryOptionsRequest) obj;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getDeliveryOptions() == null ^ this.getDeliveryOptions() == null)
            return false;
        if (other.getDeliveryOptions() != null && other.getDeliveryOptions().equals(this.getDeliveryOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getDeliveryOptions() == null) ? 0 : getDeliveryOptions().hashCode());
        return hashCode;
    }

    @Override
    public PutConfigurationSetDeliveryOptionsRequest clone() {
        return (PutConfigurationSetDeliveryOptionsRequest) super.clone();
    }

}
