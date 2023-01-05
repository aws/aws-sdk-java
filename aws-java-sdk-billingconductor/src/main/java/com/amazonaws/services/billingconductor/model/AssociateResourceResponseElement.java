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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A resource association result for a percentage custom line item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/AssociateResourceResponseElement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateResourceResponseElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource ARN that was associated to the custom line item.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * An <code>AssociateResourceError</code> that will populate if the resource association fails.
     * </p>
     */
    private AssociateResourceError error;

    /**
     * <p>
     * The resource ARN that was associated to the custom line item.
     * </p>
     * 
     * @param arn
     *        The resource ARN that was associated to the custom line item.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The resource ARN that was associated to the custom line item.
     * </p>
     * 
     * @return The resource ARN that was associated to the custom line item.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The resource ARN that was associated to the custom line item.
     * </p>
     * 
     * @param arn
     *        The resource ARN that was associated to the custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceResponseElement withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * An <code>AssociateResourceError</code> that will populate if the resource association fails.
     * </p>
     * 
     * @param error
     *        An <code>AssociateResourceError</code> that will populate if the resource association fails.
     */

    public void setError(AssociateResourceError error) {
        this.error = error;
    }

    /**
     * <p>
     * An <code>AssociateResourceError</code> that will populate if the resource association fails.
     * </p>
     * 
     * @return An <code>AssociateResourceError</code> that will populate if the resource association fails.
     */

    public AssociateResourceError getError() {
        return this.error;
    }

    /**
     * <p>
     * An <code>AssociateResourceError</code> that will populate if the resource association fails.
     * </p>
     * 
     * @param error
     *        An <code>AssociateResourceError</code> that will populate if the resource association fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceResponseElement withError(AssociateResourceError error) {
        setError(error);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateResourceResponseElement == false)
            return false;
        AssociateResourceResponseElement other = (AssociateResourceResponseElement) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public AssociateResourceResponseElement clone() {
        try {
            return (AssociateResourceResponseElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.AssociateResourceResponseElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
