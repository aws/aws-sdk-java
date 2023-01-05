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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the meta data tags associated with a transit gateway policy rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayPolicyRuleMetaData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayPolicyRuleMetaData implements Serializable, Cloneable {

    /**
     * <p>
     * The key name for the transit gateway policy rule meta data tag.
     * </p>
     */
    private String metaDataKey;
    /**
     * <p>
     * The value of the key for the transit gateway policy rule meta data tag.
     * </p>
     */
    private String metaDataValue;

    /**
     * <p>
     * The key name for the transit gateway policy rule meta data tag.
     * </p>
     * 
     * @param metaDataKey
     *        The key name for the transit gateway policy rule meta data tag.
     */

    public void setMetaDataKey(String metaDataKey) {
        this.metaDataKey = metaDataKey;
    }

    /**
     * <p>
     * The key name for the transit gateway policy rule meta data tag.
     * </p>
     * 
     * @return The key name for the transit gateway policy rule meta data tag.
     */

    public String getMetaDataKey() {
        return this.metaDataKey;
    }

    /**
     * <p>
     * The key name for the transit gateway policy rule meta data tag.
     * </p>
     * 
     * @param metaDataKey
     *        The key name for the transit gateway policy rule meta data tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyRuleMetaData withMetaDataKey(String metaDataKey) {
        setMetaDataKey(metaDataKey);
        return this;
    }

    /**
     * <p>
     * The value of the key for the transit gateway policy rule meta data tag.
     * </p>
     * 
     * @param metaDataValue
     *        The value of the key for the transit gateway policy rule meta data tag.
     */

    public void setMetaDataValue(String metaDataValue) {
        this.metaDataValue = metaDataValue;
    }

    /**
     * <p>
     * The value of the key for the transit gateway policy rule meta data tag.
     * </p>
     * 
     * @return The value of the key for the transit gateway policy rule meta data tag.
     */

    public String getMetaDataValue() {
        return this.metaDataValue;
    }

    /**
     * <p>
     * The value of the key for the transit gateway policy rule meta data tag.
     * </p>
     * 
     * @param metaDataValue
     *        The value of the key for the transit gateway policy rule meta data tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyRuleMetaData withMetaDataValue(String metaDataValue) {
        setMetaDataValue(metaDataValue);
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
        if (getMetaDataKey() != null)
            sb.append("MetaDataKey: ").append(getMetaDataKey()).append(",");
        if (getMetaDataValue() != null)
            sb.append("MetaDataValue: ").append(getMetaDataValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayPolicyRuleMetaData == false)
            return false;
        TransitGatewayPolicyRuleMetaData other = (TransitGatewayPolicyRuleMetaData) obj;
        if (other.getMetaDataKey() == null ^ this.getMetaDataKey() == null)
            return false;
        if (other.getMetaDataKey() != null && other.getMetaDataKey().equals(this.getMetaDataKey()) == false)
            return false;
        if (other.getMetaDataValue() == null ^ this.getMetaDataValue() == null)
            return false;
        if (other.getMetaDataValue() != null && other.getMetaDataValue().equals(this.getMetaDataValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetaDataKey() == null) ? 0 : getMetaDataKey().hashCode());
        hashCode = prime * hashCode + ((getMetaDataValue() == null) ? 0 : getMetaDataValue().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayPolicyRuleMetaData clone() {
        try {
            return (TransitGatewayPolicyRuleMetaData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
