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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a set of filters for a path analysis. Use path filters to scope the analysis when there can be multiple
 * resulting paths.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PathFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PathFilter implements Serializable, Cloneable {

    /**
     * <p>
     * The source IPv4 address.
     * </p>
     */
    private String sourceAddress;
    /**
     * <p>
     * The source port range.
     * </p>
     */
    private FilterPortRange sourcePortRange;
    /**
     * <p>
     * The destination IPv4 address.
     * </p>
     */
    private String destinationAddress;
    /**
     * <p>
     * The destination port range.
     * </p>
     */
    private FilterPortRange destinationPortRange;

    /**
     * <p>
     * The source IPv4 address.
     * </p>
     * 
     * @param sourceAddress
     *        The source IPv4 address.
     */

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    /**
     * <p>
     * The source IPv4 address.
     * </p>
     * 
     * @return The source IPv4 address.
     */

    public String getSourceAddress() {
        return this.sourceAddress;
    }

    /**
     * <p>
     * The source IPv4 address.
     * </p>
     * 
     * @param sourceAddress
     *        The source IPv4 address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathFilter withSourceAddress(String sourceAddress) {
        setSourceAddress(sourceAddress);
        return this;
    }

    /**
     * <p>
     * The source port range.
     * </p>
     * 
     * @param sourcePortRange
     *        The source port range.
     */

    public void setSourcePortRange(FilterPortRange sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
    }

    /**
     * <p>
     * The source port range.
     * </p>
     * 
     * @return The source port range.
     */

    public FilterPortRange getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * <p>
     * The source port range.
     * </p>
     * 
     * @param sourcePortRange
     *        The source port range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathFilter withSourcePortRange(FilterPortRange sourcePortRange) {
        setSourcePortRange(sourcePortRange);
        return this;
    }

    /**
     * <p>
     * The destination IPv4 address.
     * </p>
     * 
     * @param destinationAddress
     *        The destination IPv4 address.
     */

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    /**
     * <p>
     * The destination IPv4 address.
     * </p>
     * 
     * @return The destination IPv4 address.
     */

    public String getDestinationAddress() {
        return this.destinationAddress;
    }

    /**
     * <p>
     * The destination IPv4 address.
     * </p>
     * 
     * @param destinationAddress
     *        The destination IPv4 address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathFilter withDestinationAddress(String destinationAddress) {
        setDestinationAddress(destinationAddress);
        return this;
    }

    /**
     * <p>
     * The destination port range.
     * </p>
     * 
     * @param destinationPortRange
     *        The destination port range.
     */

    public void setDestinationPortRange(FilterPortRange destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
    }

    /**
     * <p>
     * The destination port range.
     * </p>
     * 
     * @return The destination port range.
     */

    public FilterPortRange getDestinationPortRange() {
        return this.destinationPortRange;
    }

    /**
     * <p>
     * The destination port range.
     * </p>
     * 
     * @param destinationPortRange
     *        The destination port range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathFilter withDestinationPortRange(FilterPortRange destinationPortRange) {
        setDestinationPortRange(destinationPortRange);
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
        if (getSourceAddress() != null)
            sb.append("SourceAddress: ").append(getSourceAddress()).append(",");
        if (getSourcePortRange() != null)
            sb.append("SourcePortRange: ").append(getSourcePortRange()).append(",");
        if (getDestinationAddress() != null)
            sb.append("DestinationAddress: ").append(getDestinationAddress()).append(",");
        if (getDestinationPortRange() != null)
            sb.append("DestinationPortRange: ").append(getDestinationPortRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PathFilter == false)
            return false;
        PathFilter other = (PathFilter) obj;
        if (other.getSourceAddress() == null ^ this.getSourceAddress() == null)
            return false;
        if (other.getSourceAddress() != null && other.getSourceAddress().equals(this.getSourceAddress()) == false)
            return false;
        if (other.getSourcePortRange() == null ^ this.getSourcePortRange() == null)
            return false;
        if (other.getSourcePortRange() != null && other.getSourcePortRange().equals(this.getSourcePortRange()) == false)
            return false;
        if (other.getDestinationAddress() == null ^ this.getDestinationAddress() == null)
            return false;
        if (other.getDestinationAddress() != null && other.getDestinationAddress().equals(this.getDestinationAddress()) == false)
            return false;
        if (other.getDestinationPortRange() == null ^ this.getDestinationPortRange() == null)
            return false;
        if (other.getDestinationPortRange() != null && other.getDestinationPortRange().equals(this.getDestinationPortRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceAddress() == null) ? 0 : getSourceAddress().hashCode());
        hashCode = prime * hashCode + ((getSourcePortRange() == null) ? 0 : getSourcePortRange().hashCode());
        hashCode = prime * hashCode + ((getDestinationAddress() == null) ? 0 : getDestinationAddress().hashCode());
        hashCode = prime * hashCode + ((getDestinationPortRange() == null) ? 0 : getDestinationPortRange().hashCode());
        return hashCode;
    }

    @Override
    public PathFilter clone() {
        try {
            return (PathFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
