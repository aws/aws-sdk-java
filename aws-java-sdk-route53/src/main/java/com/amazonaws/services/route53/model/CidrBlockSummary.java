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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that lists the CIDR blocks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CidrBlockSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CidrBlockSummary implements Serializable, Cloneable {

    /**
     * <p>
     * Value for the CIDR block.
     * </p>
     */
    private String cidrBlock;
    /**
     * <p>
     * The location name of the CIDR block.
     * </p>
     */
    private String locationName;

    /**
     * <p>
     * Value for the CIDR block.
     * </p>
     * 
     * @param cidrBlock
     *        Value for the CIDR block.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * Value for the CIDR block.
     * </p>
     * 
     * @return Value for the CIDR block.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * Value for the CIDR block.
     * </p>
     * 
     * @param cidrBlock
     *        Value for the CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CidrBlockSummary withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * <p>
     * The location name of the CIDR block.
     * </p>
     * 
     * @param locationName
     *        The location name of the CIDR block.
     */

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * <p>
     * The location name of the CIDR block.
     * </p>
     * 
     * @return The location name of the CIDR block.
     */

    public String getLocationName() {
        return this.locationName;
    }

    /**
     * <p>
     * The location name of the CIDR block.
     * </p>
     * 
     * @param locationName
     *        The location name of the CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CidrBlockSummary withLocationName(String locationName) {
        setLocationName(locationName);
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
        if (getCidrBlock() != null)
            sb.append("CidrBlock: ").append(getCidrBlock()).append(",");
        if (getLocationName() != null)
            sb.append("LocationName: ").append(getLocationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CidrBlockSummary == false)
            return false;
        CidrBlockSummary other = (CidrBlockSummary) obj;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getLocationName() == null ^ this.getLocationName() == null)
            return false;
        if (other.getLocationName() != null && other.getLocationName().equals(this.getLocationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getLocationName() == null) ? 0 : getLocationName().hashCode());
        return hashCode;
    }

    @Override
    public CidrBlockSummary clone() {
        try {
            return (CidrBlockSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
