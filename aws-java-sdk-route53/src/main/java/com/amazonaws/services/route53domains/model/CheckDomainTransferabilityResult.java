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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The CheckDomainTransferability response includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/CheckDomainTransferability"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckDomainTransferabilityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains information about whether the specified domain can be transferred to Amazon Route
     * 53.
     * </p>
     */
    private DomainTransferability transferability;

    /**
     * <p>
     * A complex type that contains information about whether the specified domain can be transferred to Amazon Route
     * 53.
     * </p>
     * 
     * @param transferability
     *        A complex type that contains information about whether the specified domain can be transferred to Amazon
     *        Route 53.
     */

    public void setTransferability(DomainTransferability transferability) {
        this.transferability = transferability;
    }

    /**
     * <p>
     * A complex type that contains information about whether the specified domain can be transferred to Amazon Route
     * 53.
     * </p>
     * 
     * @return A complex type that contains information about whether the specified domain can be transferred to Amazon
     *         Route 53.
     */

    public DomainTransferability getTransferability() {
        return this.transferability;
    }

    /**
     * <p>
     * A complex type that contains information about whether the specified domain can be transferred to Amazon Route
     * 53.
     * </p>
     * 
     * @param transferability
     *        A complex type that contains information about whether the specified domain can be transferred to Amazon
     *        Route 53.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDomainTransferabilityResult withTransferability(DomainTransferability transferability) {
        setTransferability(transferability);
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
        if (getTransferability() != null)
            sb.append("Transferability: ").append(getTransferability());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckDomainTransferabilityResult == false)
            return false;
        CheckDomainTransferabilityResult other = (CheckDomainTransferabilityResult) obj;
        if (other.getTransferability() == null ^ this.getTransferability() == null)
            return false;
        if (other.getTransferability() != null && other.getTransferability().equals(this.getTransferability()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransferability() == null) ? 0 : getTransferability().hashCode());
        return hashCode;
    }

    @Override
    public CheckDomainTransferabilityResult clone() {
        try {
            return (CheckDomainTransferabilityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
