/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedblockchainquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The container for the <code>ConfirmationStatusFilter</code> that filters for the <a
 * href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality"> <i>finality</i> </a>
 * of the results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ConfirmationStatusFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfirmationStatusFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The container to determine whether to list results that have only reached <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality"> <i>finality</i>
     * </a>. Transactions that have reached finality are always part of the response.
     * </p>
     */
    private java.util.List<String> include;

    /**
     * <p>
     * The container to determine whether to list results that have only reached <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality"> <i>finality</i>
     * </a>. Transactions that have reached finality are always part of the response.
     * </p>
     * 
     * @return The container to determine whether to list results that have only reached <a
     *         href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality">
     *         <i>finality</i> </a>. Transactions that have reached finality are always part of the response.
     * @see ConfirmationStatus
     */

    public java.util.List<String> getInclude() {
        return include;
    }

    /**
     * <p>
     * The container to determine whether to list results that have only reached <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality"> <i>finality</i>
     * </a>. Transactions that have reached finality are always part of the response.
     * </p>
     * 
     * @param include
     *        The container to determine whether to list results that have only reached <a
     *        href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality">
     *        <i>finality</i> </a>. Transactions that have reached finality are always part of the response.
     * @see ConfirmationStatus
     */

    public void setInclude(java.util.Collection<String> include) {
        if (include == null) {
            this.include = null;
            return;
        }

        this.include = new java.util.ArrayList<String>(include);
    }

    /**
     * <p>
     * The container to determine whether to list results that have only reached <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality"> <i>finality</i>
     * </a>. Transactions that have reached finality are always part of the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclude(java.util.Collection)} or {@link #withInclude(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param include
     *        The container to determine whether to list results that have only reached <a
     *        href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality">
     *        <i>finality</i> </a>. Transactions that have reached finality are always part of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfirmationStatus
     */

    public ConfirmationStatusFilter withInclude(String... include) {
        if (this.include == null) {
            setInclude(new java.util.ArrayList<String>(include.length));
        }
        for (String ele : include) {
            this.include.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The container to determine whether to list results that have only reached <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality"> <i>finality</i>
     * </a>. Transactions that have reached finality are always part of the response.
     * </p>
     * 
     * @param include
     *        The container to determine whether to list results that have only reached <a
     *        href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality">
     *        <i>finality</i> </a>. Transactions that have reached finality are always part of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfirmationStatus
     */

    public ConfirmationStatusFilter withInclude(java.util.Collection<String> include) {
        setInclude(include);
        return this;
    }

    /**
     * <p>
     * The container to determine whether to list results that have only reached <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality"> <i>finality</i>
     * </a>. Transactions that have reached finality are always part of the response.
     * </p>
     * 
     * @param include
     *        The container to determine whether to list results that have only reached <a
     *        href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality">
     *        <i>finality</i> </a>. Transactions that have reached finality are always part of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfirmationStatus
     */

    public ConfirmationStatusFilter withInclude(ConfirmationStatus... include) {
        java.util.ArrayList<String> includeCopy = new java.util.ArrayList<String>(include.length);
        for (ConfirmationStatus value : include) {
            includeCopy.add(value.toString());
        }
        if (getInclude() == null) {
            setInclude(includeCopy);
        } else {
            getInclude().addAll(includeCopy);
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
        if (getInclude() != null)
            sb.append("Include: ").append(getInclude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmationStatusFilter == false)
            return false;
        ConfirmationStatusFilter other = (ConfirmationStatusFilter) obj;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        return hashCode;
    }

    @Override
    public ConfirmationStatusFilter clone() {
        try {
            return (ConfirmationStatusFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.ConfirmationStatusFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
