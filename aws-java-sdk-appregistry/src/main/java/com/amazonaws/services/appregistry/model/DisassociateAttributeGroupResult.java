/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/DisassociateAttributeGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateAttributeGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the application.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the attribute group.
     * </p>
     */
    private String attributeGroupArn;

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon resource name (ARN) that specifies the application.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the application.
     * </p>
     * 
     * @return The Amazon resource name (ARN) that specifies the application.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon resource name (ARN) that specifies the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateAttributeGroupResult withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the attribute group.
     * </p>
     * 
     * @param attributeGroupArn
     *        The Amazon resource name (ARN) that specifies the attribute group.
     */

    public void setAttributeGroupArn(String attributeGroupArn) {
        this.attributeGroupArn = attributeGroupArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the attribute group.
     * </p>
     * 
     * @return The Amazon resource name (ARN) that specifies the attribute group.
     */

    public String getAttributeGroupArn() {
        return this.attributeGroupArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the attribute group.
     * </p>
     * 
     * @param attributeGroupArn
     *        The Amazon resource name (ARN) that specifies the attribute group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateAttributeGroupResult withAttributeGroupArn(String attributeGroupArn) {
        setAttributeGroupArn(attributeGroupArn);
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
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getAttributeGroupArn() != null)
            sb.append("AttributeGroupArn: ").append(getAttributeGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateAttributeGroupResult == false)
            return false;
        DisassociateAttributeGroupResult other = (DisassociateAttributeGroupResult) obj;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getAttributeGroupArn() == null ^ this.getAttributeGroupArn() == null)
            return false;
        if (other.getAttributeGroupArn() != null && other.getAttributeGroupArn().equals(this.getAttributeGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getAttributeGroupArn() == null) ? 0 : getAttributeGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateAttributeGroupResult clone() {
        try {
            return (DisassociateAttributeGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
