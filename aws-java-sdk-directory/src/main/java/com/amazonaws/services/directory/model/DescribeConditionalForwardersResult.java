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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a DescribeConditionalForwarder request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeConditionalForwarders" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConditionalForwardersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of conditional forwarders that have been created.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConditionalForwarder> conditionalForwarders;

    /**
     * <p>
     * The list of conditional forwarders that have been created.
     * </p>
     * 
     * @return The list of conditional forwarders that have been created.
     */

    public java.util.List<ConditionalForwarder> getConditionalForwarders() {
        if (conditionalForwarders == null) {
            conditionalForwarders = new com.amazonaws.internal.SdkInternalList<ConditionalForwarder>();
        }
        return conditionalForwarders;
    }

    /**
     * <p>
     * The list of conditional forwarders that have been created.
     * </p>
     * 
     * @param conditionalForwarders
     *        The list of conditional forwarders that have been created.
     */

    public void setConditionalForwarders(java.util.Collection<ConditionalForwarder> conditionalForwarders) {
        if (conditionalForwarders == null) {
            this.conditionalForwarders = null;
            return;
        }

        this.conditionalForwarders = new com.amazonaws.internal.SdkInternalList<ConditionalForwarder>(conditionalForwarders);
    }

    /**
     * <p>
     * The list of conditional forwarders that have been created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditionalForwarders(java.util.Collection)} or
     * {@link #withConditionalForwarders(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param conditionalForwarders
     *        The list of conditional forwarders that have been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConditionalForwardersResult withConditionalForwarders(ConditionalForwarder... conditionalForwarders) {
        if (this.conditionalForwarders == null) {
            setConditionalForwarders(new com.amazonaws.internal.SdkInternalList<ConditionalForwarder>(conditionalForwarders.length));
        }
        for (ConditionalForwarder ele : conditionalForwarders) {
            this.conditionalForwarders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of conditional forwarders that have been created.
     * </p>
     * 
     * @param conditionalForwarders
     *        The list of conditional forwarders that have been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConditionalForwardersResult withConditionalForwarders(java.util.Collection<ConditionalForwarder> conditionalForwarders) {
        setConditionalForwarders(conditionalForwarders);
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
        if (getConditionalForwarders() != null)
            sb.append("ConditionalForwarders: ").append(getConditionalForwarders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConditionalForwardersResult == false)
            return false;
        DescribeConditionalForwardersResult other = (DescribeConditionalForwardersResult) obj;
        if (other.getConditionalForwarders() == null ^ this.getConditionalForwarders() == null)
            return false;
        if (other.getConditionalForwarders() != null && other.getConditionalForwarders().equals(this.getConditionalForwarders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConditionalForwarders() == null) ? 0 : getConditionalForwarders().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConditionalForwardersResult clone() {
        try {
            return (DescribeConditionalForwardersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
