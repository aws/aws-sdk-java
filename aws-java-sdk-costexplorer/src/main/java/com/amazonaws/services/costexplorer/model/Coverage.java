/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The amount of instance usage that a reservation covered.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/Coverage" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Coverage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of instance usage that the reservation covered, in hours.
     * </p>
     */
    private CoverageHours coverageHours;
    /**
     * <p>
     * The amount of instance usage that the reservation covered, in normalized units.
     * </p>
     */
    private CoverageNormalizedUnits coverageNormalizedUnits;
    /**
     * <p>
     * The amount of cost that the reservation covered.
     * </p>
     */
    private CoverageCost coverageCost;

    /**
     * <p>
     * The amount of instance usage that the reservation covered, in hours.
     * </p>
     * 
     * @param coverageHours
     *        The amount of instance usage that the reservation covered, in hours.
     */

    public void setCoverageHours(CoverageHours coverageHours) {
        this.coverageHours = coverageHours;
    }

    /**
     * <p>
     * The amount of instance usage that the reservation covered, in hours.
     * </p>
     * 
     * @return The amount of instance usage that the reservation covered, in hours.
     */

    public CoverageHours getCoverageHours() {
        return this.coverageHours;
    }

    /**
     * <p>
     * The amount of instance usage that the reservation covered, in hours.
     * </p>
     * 
     * @param coverageHours
     *        The amount of instance usage that the reservation covered, in hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Coverage withCoverageHours(CoverageHours coverageHours) {
        setCoverageHours(coverageHours);
        return this;
    }

    /**
     * <p>
     * The amount of instance usage that the reservation covered, in normalized units.
     * </p>
     * 
     * @param coverageNormalizedUnits
     *        The amount of instance usage that the reservation covered, in normalized units.
     */

    public void setCoverageNormalizedUnits(CoverageNormalizedUnits coverageNormalizedUnits) {
        this.coverageNormalizedUnits = coverageNormalizedUnits;
    }

    /**
     * <p>
     * The amount of instance usage that the reservation covered, in normalized units.
     * </p>
     * 
     * @return The amount of instance usage that the reservation covered, in normalized units.
     */

    public CoverageNormalizedUnits getCoverageNormalizedUnits() {
        return this.coverageNormalizedUnits;
    }

    /**
     * <p>
     * The amount of instance usage that the reservation covered, in normalized units.
     * </p>
     * 
     * @param coverageNormalizedUnits
     *        The amount of instance usage that the reservation covered, in normalized units.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Coverage withCoverageNormalizedUnits(CoverageNormalizedUnits coverageNormalizedUnits) {
        setCoverageNormalizedUnits(coverageNormalizedUnits);
        return this;
    }

    /**
     * <p>
     * The amount of cost that the reservation covered.
     * </p>
     * 
     * @param coverageCost
     *        The amount of cost that the reservation covered.
     */

    public void setCoverageCost(CoverageCost coverageCost) {
        this.coverageCost = coverageCost;
    }

    /**
     * <p>
     * The amount of cost that the reservation covered.
     * </p>
     * 
     * @return The amount of cost that the reservation covered.
     */

    public CoverageCost getCoverageCost() {
        return this.coverageCost;
    }

    /**
     * <p>
     * The amount of cost that the reservation covered.
     * </p>
     * 
     * @param coverageCost
     *        The amount of cost that the reservation covered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Coverage withCoverageCost(CoverageCost coverageCost) {
        setCoverageCost(coverageCost);
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
        if (getCoverageHours() != null)
            sb.append("CoverageHours: ").append(getCoverageHours()).append(",");
        if (getCoverageNormalizedUnits() != null)
            sb.append("CoverageNormalizedUnits: ").append(getCoverageNormalizedUnits()).append(",");
        if (getCoverageCost() != null)
            sb.append("CoverageCost: ").append(getCoverageCost());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Coverage == false)
            return false;
        Coverage other = (Coverage) obj;
        if (other.getCoverageHours() == null ^ this.getCoverageHours() == null)
            return false;
        if (other.getCoverageHours() != null && other.getCoverageHours().equals(this.getCoverageHours()) == false)
            return false;
        if (other.getCoverageNormalizedUnits() == null ^ this.getCoverageNormalizedUnits() == null)
            return false;
        if (other.getCoverageNormalizedUnits() != null && other.getCoverageNormalizedUnits().equals(this.getCoverageNormalizedUnits()) == false)
            return false;
        if (other.getCoverageCost() == null ^ this.getCoverageCost() == null)
            return false;
        if (other.getCoverageCost() != null && other.getCoverageCost().equals(this.getCoverageCost()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoverageHours() == null) ? 0 : getCoverageHours().hashCode());
        hashCode = prime * hashCode + ((getCoverageNormalizedUnits() == null) ? 0 : getCoverageNormalizedUnits().hashCode());
        hashCode = prime * hashCode + ((getCoverageCost() == null) ? 0 : getCoverageCost().hashCode());
        return hashCode;
    }

    @Override
    public Coverage clone() {
        try {
            return (Coverage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CoverageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
