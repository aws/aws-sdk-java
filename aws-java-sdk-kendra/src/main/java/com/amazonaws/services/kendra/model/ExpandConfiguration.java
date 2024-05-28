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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration information needed to customize how collapsed search result groups expand.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ExpandConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExpandConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of collapsed search result groups to expand. If you set this value to 10, for example, only the first
     * 10 out of 100 result groups will have expand functionality.
     * </p>
     */
    private Integer maxResultItemsToExpand;
    /**
     * <p>
     * The number of expanded results to show per collapsed primary document. For instance, if you set this value to 3,
     * then at most 3 results per collapsed group will be displayed.
     * </p>
     */
    private Integer maxExpandedResultsPerItem;

    /**
     * <p>
     * The number of collapsed search result groups to expand. If you set this value to 10, for example, only the first
     * 10 out of 100 result groups will have expand functionality.
     * </p>
     * 
     * @param maxResultItemsToExpand
     *        The number of collapsed search result groups to expand. If you set this value to 10, for example, only the
     *        first 10 out of 100 result groups will have expand functionality.
     */

    public void setMaxResultItemsToExpand(Integer maxResultItemsToExpand) {
        this.maxResultItemsToExpand = maxResultItemsToExpand;
    }

    /**
     * <p>
     * The number of collapsed search result groups to expand. If you set this value to 10, for example, only the first
     * 10 out of 100 result groups will have expand functionality.
     * </p>
     * 
     * @return The number of collapsed search result groups to expand. If you set this value to 10, for example, only
     *         the first 10 out of 100 result groups will have expand functionality.
     */

    public Integer getMaxResultItemsToExpand() {
        return this.maxResultItemsToExpand;
    }

    /**
     * <p>
     * The number of collapsed search result groups to expand. If you set this value to 10, for example, only the first
     * 10 out of 100 result groups will have expand functionality.
     * </p>
     * 
     * @param maxResultItemsToExpand
     *        The number of collapsed search result groups to expand. If you set this value to 10, for example, only the
     *        first 10 out of 100 result groups will have expand functionality.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpandConfiguration withMaxResultItemsToExpand(Integer maxResultItemsToExpand) {
        setMaxResultItemsToExpand(maxResultItemsToExpand);
        return this;
    }

    /**
     * <p>
     * The number of expanded results to show per collapsed primary document. For instance, if you set this value to 3,
     * then at most 3 results per collapsed group will be displayed.
     * </p>
     * 
     * @param maxExpandedResultsPerItem
     *        The number of expanded results to show per collapsed primary document. For instance, if you set this value
     *        to 3, then at most 3 results per collapsed group will be displayed.
     */

    public void setMaxExpandedResultsPerItem(Integer maxExpandedResultsPerItem) {
        this.maxExpandedResultsPerItem = maxExpandedResultsPerItem;
    }

    /**
     * <p>
     * The number of expanded results to show per collapsed primary document. For instance, if you set this value to 3,
     * then at most 3 results per collapsed group will be displayed.
     * </p>
     * 
     * @return The number of expanded results to show per collapsed primary document. For instance, if you set this
     *         value to 3, then at most 3 results per collapsed group will be displayed.
     */

    public Integer getMaxExpandedResultsPerItem() {
        return this.maxExpandedResultsPerItem;
    }

    /**
     * <p>
     * The number of expanded results to show per collapsed primary document. For instance, if you set this value to 3,
     * then at most 3 results per collapsed group will be displayed.
     * </p>
     * 
     * @param maxExpandedResultsPerItem
     *        The number of expanded results to show per collapsed primary document. For instance, if you set this value
     *        to 3, then at most 3 results per collapsed group will be displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpandConfiguration withMaxExpandedResultsPerItem(Integer maxExpandedResultsPerItem) {
        setMaxExpandedResultsPerItem(maxExpandedResultsPerItem);
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
        if (getMaxResultItemsToExpand() != null)
            sb.append("MaxResultItemsToExpand: ").append(getMaxResultItemsToExpand()).append(",");
        if (getMaxExpandedResultsPerItem() != null)
            sb.append("MaxExpandedResultsPerItem: ").append(getMaxExpandedResultsPerItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpandConfiguration == false)
            return false;
        ExpandConfiguration other = (ExpandConfiguration) obj;
        if (other.getMaxResultItemsToExpand() == null ^ this.getMaxResultItemsToExpand() == null)
            return false;
        if (other.getMaxResultItemsToExpand() != null && other.getMaxResultItemsToExpand().equals(this.getMaxResultItemsToExpand()) == false)
            return false;
        if (other.getMaxExpandedResultsPerItem() == null ^ this.getMaxExpandedResultsPerItem() == null)
            return false;
        if (other.getMaxExpandedResultsPerItem() != null && other.getMaxExpandedResultsPerItem().equals(this.getMaxExpandedResultsPerItem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResultItemsToExpand() == null) ? 0 : getMaxResultItemsToExpand().hashCode());
        hashCode = prime * hashCode + ((getMaxExpandedResultsPerItem() == null) ? 0 : getMaxExpandedResultsPerItem().hashCode());
        return hashCode;
    }

    @Override
    public ExpandConfiguration clone() {
        try {
            return (ExpandConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ExpandConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
