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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The differences between the base and latest versions of the lens.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/VersionDifferences" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VersionDifferences implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The differences between the base and latest versions of the lens.
     * </p>
     */
    private java.util.List<PillarDifference> pillarDifferences;

    /**
     * <p>
     * The differences between the base and latest versions of the lens.
     * </p>
     * 
     * @return The differences between the base and latest versions of the lens.
     */

    public java.util.List<PillarDifference> getPillarDifferences() {
        return pillarDifferences;
    }

    /**
     * <p>
     * The differences between the base and latest versions of the lens.
     * </p>
     * 
     * @param pillarDifferences
     *        The differences between the base and latest versions of the lens.
     */

    public void setPillarDifferences(java.util.Collection<PillarDifference> pillarDifferences) {
        if (pillarDifferences == null) {
            this.pillarDifferences = null;
            return;
        }

        this.pillarDifferences = new java.util.ArrayList<PillarDifference>(pillarDifferences);
    }

    /**
     * <p>
     * The differences between the base and latest versions of the lens.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPillarDifferences(java.util.Collection)} or {@link #withPillarDifferences(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param pillarDifferences
     *        The differences between the base and latest versions of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionDifferences withPillarDifferences(PillarDifference... pillarDifferences) {
        if (this.pillarDifferences == null) {
            setPillarDifferences(new java.util.ArrayList<PillarDifference>(pillarDifferences.length));
        }
        for (PillarDifference ele : pillarDifferences) {
            this.pillarDifferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The differences between the base and latest versions of the lens.
     * </p>
     * 
     * @param pillarDifferences
     *        The differences between the base and latest versions of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionDifferences withPillarDifferences(java.util.Collection<PillarDifference> pillarDifferences) {
        setPillarDifferences(pillarDifferences);
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
        if (getPillarDifferences() != null)
            sb.append("PillarDifferences: ").append(getPillarDifferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VersionDifferences == false)
            return false;
        VersionDifferences other = (VersionDifferences) obj;
        if (other.getPillarDifferences() == null ^ this.getPillarDifferences() == null)
            return false;
        if (other.getPillarDifferences() != null && other.getPillarDifferences().equals(this.getPillarDifferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPillarDifferences() == null) ? 0 : getPillarDifferences().hashCode());
        return hashCode;
    }

    @Override
    public VersionDifferences clone() {
        try {
            return (VersionDifferences) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.VersionDifferencesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
