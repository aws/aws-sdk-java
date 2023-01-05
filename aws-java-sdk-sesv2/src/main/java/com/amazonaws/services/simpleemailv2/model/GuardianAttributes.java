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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing additional settings for your VDM configuration as applicable to the Guardian.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GuardianAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardianAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the status of your VDM optimized shared delivery. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – Amazon SES enables optimized shared delivery for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – Amazon SES disables optimized shared delivery for your account.
     * </p>
     * </li>
     * </ul>
     */
    private String optimizedSharedDelivery;

    /**
     * <p>
     * Specifies the status of your VDM optimized shared delivery. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – Amazon SES enables optimized shared delivery for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – Amazon SES disables optimized shared delivery for your account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param optimizedSharedDelivery
     *        Specifies the status of your VDM optimized shared delivery. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – Amazon SES enables optimized shared delivery for your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – Amazon SES disables optimized shared delivery for your account.
     *        </p>
     *        </li>
     * @see FeatureStatus
     */

    public void setOptimizedSharedDelivery(String optimizedSharedDelivery) {
        this.optimizedSharedDelivery = optimizedSharedDelivery;
    }

    /**
     * <p>
     * Specifies the status of your VDM optimized shared delivery. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – Amazon SES enables optimized shared delivery for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – Amazon SES disables optimized shared delivery for your account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the status of your VDM optimized shared delivery. Can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> – Amazon SES enables optimized shared delivery for your account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> – Amazon SES disables optimized shared delivery for your account.
     *         </p>
     *         </li>
     * @see FeatureStatus
     */

    public String getOptimizedSharedDelivery() {
        return this.optimizedSharedDelivery;
    }

    /**
     * <p>
     * Specifies the status of your VDM optimized shared delivery. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – Amazon SES enables optimized shared delivery for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – Amazon SES disables optimized shared delivery for your account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param optimizedSharedDelivery
     *        Specifies the status of your VDM optimized shared delivery. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – Amazon SES enables optimized shared delivery for your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – Amazon SES disables optimized shared delivery for your account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public GuardianAttributes withOptimizedSharedDelivery(String optimizedSharedDelivery) {
        setOptimizedSharedDelivery(optimizedSharedDelivery);
        return this;
    }

    /**
     * <p>
     * Specifies the status of your VDM optimized shared delivery. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – Amazon SES enables optimized shared delivery for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – Amazon SES disables optimized shared delivery for your account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param optimizedSharedDelivery
     *        Specifies the status of your VDM optimized shared delivery. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – Amazon SES enables optimized shared delivery for your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – Amazon SES disables optimized shared delivery for your account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public GuardianAttributes withOptimizedSharedDelivery(FeatureStatus optimizedSharedDelivery) {
        this.optimizedSharedDelivery = optimizedSharedDelivery.toString();
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
        if (getOptimizedSharedDelivery() != null)
            sb.append("OptimizedSharedDelivery: ").append(getOptimizedSharedDelivery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardianAttributes == false)
            return false;
        GuardianAttributes other = (GuardianAttributes) obj;
        if (other.getOptimizedSharedDelivery() == null ^ this.getOptimizedSharedDelivery() == null)
            return false;
        if (other.getOptimizedSharedDelivery() != null && other.getOptimizedSharedDelivery().equals(this.getOptimizedSharedDelivery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptimizedSharedDelivery() == null) ? 0 : getOptimizedSharedDelivery().hashCode());
        return hashCode;
    }

    @Override
    public GuardianAttributes clone() {
        try {
            return (GuardianAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.GuardianAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
