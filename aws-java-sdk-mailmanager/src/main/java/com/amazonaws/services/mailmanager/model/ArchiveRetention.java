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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The retention policy for an email archive that specifies how long emails are kept before being automatically deleted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ArchiveRetention" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArchiveRetention implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The enum value sets the period for retaining emails in an archive.
     * </p>
     */
    private String retentionPeriod;

    /**
     * <p>
     * The enum value sets the period for retaining emails in an archive.
     * </p>
     * 
     * @param retentionPeriod
     *        The enum value sets the period for retaining emails in an archive.
     * @see RetentionPeriod
     */

    public void setRetentionPeriod(String retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * The enum value sets the period for retaining emails in an archive.
     * </p>
     * 
     * @return The enum value sets the period for retaining emails in an archive.
     * @see RetentionPeriod
     */

    public String getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * The enum value sets the period for retaining emails in an archive.
     * </p>
     * 
     * @param retentionPeriod
     *        The enum value sets the period for retaining emails in an archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionPeriod
     */

    public ArchiveRetention withRetentionPeriod(String retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * The enum value sets the period for retaining emails in an archive.
     * </p>
     * 
     * @param retentionPeriod
     *        The enum value sets the period for retaining emails in an archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionPeriod
     */

    public ArchiveRetention withRetentionPeriod(RetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod.toString();
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
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArchiveRetention == false)
            return false;
        ArchiveRetention other = (ArchiveRetention) obj;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        return hashCode;
    }

    @Override
    public ArchiveRetention clone() {
        try {
            return (ArchiveRetention) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.ArchiveRetentionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
