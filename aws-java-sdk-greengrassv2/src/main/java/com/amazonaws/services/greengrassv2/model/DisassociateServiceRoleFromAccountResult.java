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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DisassociateServiceRoleFromAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateServiceRoleFromAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The time when the service role was disassociated from IoT Greengrass for your Amazon Web Services account in this
     * Amazon Web Services Region.
     * </p>
     */
    private String disassociatedAt;

    /**
     * <p>
     * The time when the service role was disassociated from IoT Greengrass for your Amazon Web Services account in this
     * Amazon Web Services Region.
     * </p>
     * 
     * @param disassociatedAt
     *        The time when the service role was disassociated from IoT Greengrass for your Amazon Web Services account
     *        in this Amazon Web Services Region.
     */

    public void setDisassociatedAt(String disassociatedAt) {
        this.disassociatedAt = disassociatedAt;
    }

    /**
     * <p>
     * The time when the service role was disassociated from IoT Greengrass for your Amazon Web Services account in this
     * Amazon Web Services Region.
     * </p>
     * 
     * @return The time when the service role was disassociated from IoT Greengrass for your Amazon Web Services account
     *         in this Amazon Web Services Region.
     */

    public String getDisassociatedAt() {
        return this.disassociatedAt;
    }

    /**
     * <p>
     * The time when the service role was disassociated from IoT Greengrass for your Amazon Web Services account in this
     * Amazon Web Services Region.
     * </p>
     * 
     * @param disassociatedAt
     *        The time when the service role was disassociated from IoT Greengrass for your Amazon Web Services account
     *        in this Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateServiceRoleFromAccountResult withDisassociatedAt(String disassociatedAt) {
        setDisassociatedAt(disassociatedAt);
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
        if (getDisassociatedAt() != null)
            sb.append("DisassociatedAt: ").append(getDisassociatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateServiceRoleFromAccountResult == false)
            return false;
        DisassociateServiceRoleFromAccountResult other = (DisassociateServiceRoleFromAccountResult) obj;
        if (other.getDisassociatedAt() == null ^ this.getDisassociatedAt() == null)
            return false;
        if (other.getDisassociatedAt() != null && other.getDisassociatedAt().equals(this.getDisassociatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisassociatedAt() == null) ? 0 : getDisassociatedAt().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateServiceRoleFromAccountResult clone() {
        try {
            return (DisassociateServiceRoleFromAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
