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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provide expiration lifecycle details of Amazon Security Lake object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DataLakeLifecycleExpiration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLakeLifecycleExpiration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Number of days before data expires in the Amazon Security Lake object.
     * </p>
     */
    private Integer days;

    /**
     * <p>
     * Number of days before data expires in the Amazon Security Lake object.
     * </p>
     * 
     * @param days
     *        Number of days before data expires in the Amazon Security Lake object.
     */

    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * <p>
     * Number of days before data expires in the Amazon Security Lake object.
     * </p>
     * 
     * @return Number of days before data expires in the Amazon Security Lake object.
     */

    public Integer getDays() {
        return this.days;
    }

    /**
     * <p>
     * Number of days before data expires in the Amazon Security Lake object.
     * </p>
     * 
     * @param days
     *        Number of days before data expires in the Amazon Security Lake object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeLifecycleExpiration withDays(Integer days) {
        setDays(days);
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
        if (getDays() != null)
            sb.append("Days: ").append(getDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataLakeLifecycleExpiration == false)
            return false;
        DataLakeLifecycleExpiration other = (DataLakeLifecycleExpiration) obj;
        if (other.getDays() == null ^ this.getDays() == null)
            return false;
        if (other.getDays() != null && other.getDays().equals(this.getDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDays() == null) ? 0 : getDays().hashCode());
        return hashCode;
    }

    @Override
    public DataLakeLifecycleExpiration clone() {
        try {
            return (DataLakeLifecycleExpiration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.DataLakeLifecycleExpirationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
