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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Briefly describes a Fleet Advisor collector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CollectorShortInfoResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollectorShortInfoResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The reference ID of the Fleet Advisor collector.
     * </p>
     */
    private String collectorReferencedId;
    /**
     * <p>
     * The name of the Fleet Advisor collector.
     * </p>
     */
    private String collectorName;

    /**
     * <p>
     * The reference ID of the Fleet Advisor collector.
     * </p>
     * 
     * @param collectorReferencedId
     *        The reference ID of the Fleet Advisor collector.
     */

    public void setCollectorReferencedId(String collectorReferencedId) {
        this.collectorReferencedId = collectorReferencedId;
    }

    /**
     * <p>
     * The reference ID of the Fleet Advisor collector.
     * </p>
     * 
     * @return The reference ID of the Fleet Advisor collector.
     */

    public String getCollectorReferencedId() {
        return this.collectorReferencedId;
    }

    /**
     * <p>
     * The reference ID of the Fleet Advisor collector.
     * </p>
     * 
     * @param collectorReferencedId
     *        The reference ID of the Fleet Advisor collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorShortInfoResponse withCollectorReferencedId(String collectorReferencedId) {
        setCollectorReferencedId(collectorReferencedId);
        return this;
    }

    /**
     * <p>
     * The name of the Fleet Advisor collector.
     * </p>
     * 
     * @param collectorName
     *        The name of the Fleet Advisor collector.
     */

    public void setCollectorName(String collectorName) {
        this.collectorName = collectorName;
    }

    /**
     * <p>
     * The name of the Fleet Advisor collector.
     * </p>
     * 
     * @return The name of the Fleet Advisor collector.
     */

    public String getCollectorName() {
        return this.collectorName;
    }

    /**
     * <p>
     * The name of the Fleet Advisor collector.
     * </p>
     * 
     * @param collectorName
     *        The name of the Fleet Advisor collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorShortInfoResponse withCollectorName(String collectorName) {
        setCollectorName(collectorName);
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
        if (getCollectorReferencedId() != null)
            sb.append("CollectorReferencedId: ").append(getCollectorReferencedId()).append(",");
        if (getCollectorName() != null)
            sb.append("CollectorName: ").append(getCollectorName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CollectorShortInfoResponse == false)
            return false;
        CollectorShortInfoResponse other = (CollectorShortInfoResponse) obj;
        if (other.getCollectorReferencedId() == null ^ this.getCollectorReferencedId() == null)
            return false;
        if (other.getCollectorReferencedId() != null && other.getCollectorReferencedId().equals(this.getCollectorReferencedId()) == false)
            return false;
        if (other.getCollectorName() == null ^ this.getCollectorName() == null)
            return false;
        if (other.getCollectorName() != null && other.getCollectorName().equals(this.getCollectorName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectorReferencedId() == null) ? 0 : getCollectorReferencedId().hashCode());
        hashCode = prime * hashCode + ((getCollectorName() == null) ? 0 : getCollectorName().hashCode());
        return hashCode;
    }

    @Override
    public CollectorShortInfoResponse clone() {
        try {
            return (CollectorShortInfoResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.CollectorShortInfoResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
