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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains statistics about the execution of the protected query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ProtectedQueryStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectedQueryStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The duration of the Protected Query, from creation until query completion.
     * </p>
     */
    private Long totalDurationInMillis;

    /**
     * <p>
     * The duration of the Protected Query, from creation until query completion.
     * </p>
     * 
     * @param totalDurationInMillis
     *        The duration of the Protected Query, from creation until query completion.
     */

    public void setTotalDurationInMillis(Long totalDurationInMillis) {
        this.totalDurationInMillis = totalDurationInMillis;
    }

    /**
     * <p>
     * The duration of the Protected Query, from creation until query completion.
     * </p>
     * 
     * @return The duration of the Protected Query, from creation until query completion.
     */

    public Long getTotalDurationInMillis() {
        return this.totalDurationInMillis;
    }

    /**
     * <p>
     * The duration of the Protected Query, from creation until query completion.
     * </p>
     * 
     * @param totalDurationInMillis
     *        The duration of the Protected Query, from creation until query completion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQueryStatistics withTotalDurationInMillis(Long totalDurationInMillis) {
        setTotalDurationInMillis(totalDurationInMillis);
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
        if (getTotalDurationInMillis() != null)
            sb.append("TotalDurationInMillis: ").append(getTotalDurationInMillis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectedQueryStatistics == false)
            return false;
        ProtectedQueryStatistics other = (ProtectedQueryStatistics) obj;
        if (other.getTotalDurationInMillis() == null ^ this.getTotalDurationInMillis() == null)
            return false;
        if (other.getTotalDurationInMillis() != null && other.getTotalDurationInMillis().equals(this.getTotalDurationInMillis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalDurationInMillis() == null) ? 0 : getTotalDurationInMillis().hashCode());
        return hashCode;
    }

    @Override
    public ProtectedQueryStatistics clone() {
        try {
            return (ProtectedQueryStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ProtectedQueryStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
