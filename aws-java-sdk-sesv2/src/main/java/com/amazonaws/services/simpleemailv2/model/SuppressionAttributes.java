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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about the email address suppression preferences for your account in the current
 * AWS Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SuppressionAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuppressionAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list that contains the reasons that email addresses will be automatically added to the suppression list for
     * your account. This list can contain any or all of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLAINT</code> – Amazon SES adds an email address to the suppression list for your account when a message
     * sent to that address results in a complaint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOUNCE</code> – Amazon SES adds an email address to the suppression list for your account when a message
     * sent to that address results in a hard bounce.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> suppressedReasons;

    /**
     * <p>
     * A list that contains the reasons that email addresses will be automatically added to the suppression list for
     * your account. This list can contain any or all of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLAINT</code> – Amazon SES adds an email address to the suppression list for your account when a message
     * sent to that address results in a complaint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOUNCE</code> – Amazon SES adds an email address to the suppression list for your account when a message
     * sent to that address results in a hard bounce.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list that contains the reasons that email addresses will be automatically added to the suppression list
     *         for your account. This list can contain any or all of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COMPLAINT</code> – Amazon SES adds an email address to the suppression list for your account when a
     *         message sent to that address results in a complaint.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BOUNCE</code> – Amazon SES adds an email address to the suppression list for your account when a
     *         message sent to that address results in a hard bounce.
     *         </p>
     *         </li>
     * @see SuppressionListReason
     */

    public java.util.List<String> getSuppressedReasons() {
        return suppressedReasons;
    }

    /**
     * <p>
     * A list that contains the reasons that email addresses will be automatically added to the suppression list for
     * your account. This list can contain any or all of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLAINT</code> – Amazon SES adds an email address to the suppression list for your account when a message
     * sent to that address results in a complaint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOUNCE</code> – Amazon SES adds an email address to the suppression list for your account when a message
     * sent to that address results in a hard bounce.
     * </p>
     * </li>
     * </ul>
     * 
     * @param suppressedReasons
     *        A list that contains the reasons that email addresses will be automatically added to the suppression list
     *        for your account. This list can contain any or all of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLAINT</code> – Amazon SES adds an email address to the suppression list for your account when a
     *        message sent to that address results in a complaint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOUNCE</code> – Amazon SES adds an email address to the suppression list for your account when a
     *        message sent to that address results in a hard bounce.
     *        </p>
     *        </li>
     * @see SuppressionListReason
     */

    public void setSuppressedReasons(java.util.Collection<String> suppressedReasons) {
        if (suppressedReasons == null) {
            this.suppressedReasons = null;
            return;
        }

        this.suppressedReasons = new java.util.ArrayList<String>(suppressedReasons);
    }

    /**
     * <p>
     * A list that contains the reasons that email addresses will be automatically added to the suppression list for
     * your account. This list can contain any or all of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLAINT</code> – Amazon SES adds an email address to the suppression list for your account when a message
     * sent to that address results in a complaint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOUNCE</code> – Amazon SES adds an email address to the suppression list for your account when a message
     * sent to that address results in a hard bounce.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuppressedReasons(java.util.Collection)} or {@link #withSuppressedReasons(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param suppressedReasons
     *        A list that contains the reasons that email addresses will be automatically added to the suppression list
     *        for your account. This list can contain any or all of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLAINT</code> – Amazon SES adds an email address to the suppression list for your account when a
     *        message sent to that address results in a complaint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOUNCE</code> – Amazon SES adds an email address to the suppression list for your account when a
     *        message sent to that address results in a hard bounce.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionListReason
     */

    public SuppressionAttributes withSuppressedReasons(String... suppressedReasons) {
        if (this.suppressedReasons == null) {
            setSuppressedReasons(new java.util.ArrayList<String>(suppressedReasons.length));
        }
        for (String ele : suppressedReasons) {
            this.suppressedReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains the reasons that email addresses will be automatically added to the suppression list for
     * your account. This list can contain any or all of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLAINT</code> – Amazon SES adds an email address to the suppression list for your account when a message
     * sent to that address results in a complaint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOUNCE</code> – Amazon SES adds an email address to the suppression list for your account when a message
     * sent to that address results in a hard bounce.
     * </p>
     * </li>
     * </ul>
     * 
     * @param suppressedReasons
     *        A list that contains the reasons that email addresses will be automatically added to the suppression list
     *        for your account. This list can contain any or all of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLAINT</code> – Amazon SES adds an email address to the suppression list for your account when a
     *        message sent to that address results in a complaint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOUNCE</code> – Amazon SES adds an email address to the suppression list for your account when a
     *        message sent to that address results in a hard bounce.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionListReason
     */

    public SuppressionAttributes withSuppressedReasons(java.util.Collection<String> suppressedReasons) {
        setSuppressedReasons(suppressedReasons);
        return this;
    }

    /**
     * <p>
     * A list that contains the reasons that email addresses will be automatically added to the suppression list for
     * your account. This list can contain any or all of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLAINT</code> – Amazon SES adds an email address to the suppression list for your account when a message
     * sent to that address results in a complaint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOUNCE</code> – Amazon SES adds an email address to the suppression list for your account when a message
     * sent to that address results in a hard bounce.
     * </p>
     * </li>
     * </ul>
     * 
     * @param suppressedReasons
     *        A list that contains the reasons that email addresses will be automatically added to the suppression list
     *        for your account. This list can contain any or all of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLAINT</code> – Amazon SES adds an email address to the suppression list for your account when a
     *        message sent to that address results in a complaint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOUNCE</code> – Amazon SES adds an email address to the suppression list for your account when a
     *        message sent to that address results in a hard bounce.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionListReason
     */

    public SuppressionAttributes withSuppressedReasons(SuppressionListReason... suppressedReasons) {
        java.util.ArrayList<String> suppressedReasonsCopy = new java.util.ArrayList<String>(suppressedReasons.length);
        for (SuppressionListReason value : suppressedReasons) {
            suppressedReasonsCopy.add(value.toString());
        }
        if (getSuppressedReasons() == null) {
            setSuppressedReasons(suppressedReasonsCopy);
        } else {
            getSuppressedReasons().addAll(suppressedReasonsCopy);
        }
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
        if (getSuppressedReasons() != null)
            sb.append("SuppressedReasons: ").append(getSuppressedReasons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuppressionAttributes == false)
            return false;
        SuppressionAttributes other = (SuppressionAttributes) obj;
        if (other.getSuppressedReasons() == null ^ this.getSuppressedReasons() == null)
            return false;
        if (other.getSuppressedReasons() != null && other.getSuppressedReasons().equals(this.getSuppressedReasons()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuppressedReasons() == null) ? 0 : getSuppressedReasons().hashCode());
        return hashCode;
    }

    @Override
    public SuppressionAttributes clone() {
        try {
            return (SuppressionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.SuppressionAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
