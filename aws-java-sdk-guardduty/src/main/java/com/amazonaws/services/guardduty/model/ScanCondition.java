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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the condition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ScanCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScanCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents an <i>mapEqual</i> <b/> condition to be applied to a single field when triggering for malware scan.
     * </p>
     */
    private java.util.List<ScanConditionPair> mapEquals;

    /**
     * <p>
     * Represents an <i>mapEqual</i> <b/> condition to be applied to a single field when triggering for malware scan.
     * </p>
     * 
     * @return Represents an <i>mapEqual</i> <b/> condition to be applied to a single field when triggering for malware
     *         scan.
     */

    public java.util.List<ScanConditionPair> getMapEquals() {
        return mapEquals;
    }

    /**
     * <p>
     * Represents an <i>mapEqual</i> <b/> condition to be applied to a single field when triggering for malware scan.
     * </p>
     * 
     * @param mapEquals
     *        Represents an <i>mapEqual</i> <b/> condition to be applied to a single field when triggering for malware
     *        scan.
     */

    public void setMapEquals(java.util.Collection<ScanConditionPair> mapEquals) {
        if (mapEquals == null) {
            this.mapEquals = null;
            return;
        }

        this.mapEquals = new java.util.ArrayList<ScanConditionPair>(mapEquals);
    }

    /**
     * <p>
     * Represents an <i>mapEqual</i> <b/> condition to be applied to a single field when triggering for malware scan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMapEquals(java.util.Collection)} or {@link #withMapEquals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mapEquals
     *        Represents an <i>mapEqual</i> <b/> condition to be applied to a single field when triggering for malware
     *        scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanCondition withMapEquals(ScanConditionPair... mapEquals) {
        if (this.mapEquals == null) {
            setMapEquals(new java.util.ArrayList<ScanConditionPair>(mapEquals.length));
        }
        for (ScanConditionPair ele : mapEquals) {
            this.mapEquals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents an <i>mapEqual</i> <b/> condition to be applied to a single field when triggering for malware scan.
     * </p>
     * 
     * @param mapEquals
     *        Represents an <i>mapEqual</i> <b/> condition to be applied to a single field when triggering for malware
     *        scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanCondition withMapEquals(java.util.Collection<ScanConditionPair> mapEquals) {
        setMapEquals(mapEquals);
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
        if (getMapEquals() != null)
            sb.append("MapEquals: ").append(getMapEquals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScanCondition == false)
            return false;
        ScanCondition other = (ScanCondition) obj;
        if (other.getMapEquals() == null ^ this.getMapEquals() == null)
            return false;
        if (other.getMapEquals() != null && other.getMapEquals().equals(this.getMapEquals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMapEquals() == null) ? 0 : getMapEquals().hashCode());
        return hashCode;
    }

    @Override
    public ScanCondition clone() {
        try {
            return (ScanCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ScanConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
