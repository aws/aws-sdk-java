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
package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Determines the interval after which an <code>AppInstanceUser</code> is automatically deleted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ExpirationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExpirationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The period in days after which an <code>AppInstanceUser</code> will be automatically deleted.
     * </p>
     */
    private Integer expirationDays;
    /**
     * <p>
     * Specifies the conditions under which an <code>AppInstanceUser</code> will expire.
     * </p>
     */
    private String expirationCriterion;

    /**
     * <p>
     * The period in days after which an <code>AppInstanceUser</code> will be automatically deleted.
     * </p>
     * 
     * @param expirationDays
     *        The period in days after which an <code>AppInstanceUser</code> will be automatically deleted.
     */

    public void setExpirationDays(Integer expirationDays) {
        this.expirationDays = expirationDays;
    }

    /**
     * <p>
     * The period in days after which an <code>AppInstanceUser</code> will be automatically deleted.
     * </p>
     * 
     * @return The period in days after which an <code>AppInstanceUser</code> will be automatically deleted.
     */

    public Integer getExpirationDays() {
        return this.expirationDays;
    }

    /**
     * <p>
     * The period in days after which an <code>AppInstanceUser</code> will be automatically deleted.
     * </p>
     * 
     * @param expirationDays
     *        The period in days after which an <code>AppInstanceUser</code> will be automatically deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpirationSettings withExpirationDays(Integer expirationDays) {
        setExpirationDays(expirationDays);
        return this;
    }

    /**
     * <p>
     * Specifies the conditions under which an <code>AppInstanceUser</code> will expire.
     * </p>
     * 
     * @param expirationCriterion
     *        Specifies the conditions under which an <code>AppInstanceUser</code> will expire.
     * @see ExpirationCriterion
     */

    public void setExpirationCriterion(String expirationCriterion) {
        this.expirationCriterion = expirationCriterion;
    }

    /**
     * <p>
     * Specifies the conditions under which an <code>AppInstanceUser</code> will expire.
     * </p>
     * 
     * @return Specifies the conditions under which an <code>AppInstanceUser</code> will expire.
     * @see ExpirationCriterion
     */

    public String getExpirationCriterion() {
        return this.expirationCriterion;
    }

    /**
     * <p>
     * Specifies the conditions under which an <code>AppInstanceUser</code> will expire.
     * </p>
     * 
     * @param expirationCriterion
     *        Specifies the conditions under which an <code>AppInstanceUser</code> will expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpirationCriterion
     */

    public ExpirationSettings withExpirationCriterion(String expirationCriterion) {
        setExpirationCriterion(expirationCriterion);
        return this;
    }

    /**
     * <p>
     * Specifies the conditions under which an <code>AppInstanceUser</code> will expire.
     * </p>
     * 
     * @param expirationCriterion
     *        Specifies the conditions under which an <code>AppInstanceUser</code> will expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpirationCriterion
     */

    public ExpirationSettings withExpirationCriterion(ExpirationCriterion expirationCriterion) {
        this.expirationCriterion = expirationCriterion.toString();
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
        if (getExpirationDays() != null)
            sb.append("ExpirationDays: ").append(getExpirationDays()).append(",");
        if (getExpirationCriterion() != null)
            sb.append("ExpirationCriterion: ").append(getExpirationCriterion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpirationSettings == false)
            return false;
        ExpirationSettings other = (ExpirationSettings) obj;
        if (other.getExpirationDays() == null ^ this.getExpirationDays() == null)
            return false;
        if (other.getExpirationDays() != null && other.getExpirationDays().equals(this.getExpirationDays()) == false)
            return false;
        if (other.getExpirationCriterion() == null ^ this.getExpirationCriterion() == null)
            return false;
        if (other.getExpirationCriterion() != null && other.getExpirationCriterion().equals(this.getExpirationCriterion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpirationDays() == null) ? 0 : getExpirationDays().hashCode());
        hashCode = prime * hashCode + ((getExpirationCriterion() == null) ? 0 : getExpirationCriterion().hashCode());
        return hashCode;
    }

    @Override
    public ExpirationSettings clone() {
        try {
            return (ExpirationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkidentity.model.transform.ExpirationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
