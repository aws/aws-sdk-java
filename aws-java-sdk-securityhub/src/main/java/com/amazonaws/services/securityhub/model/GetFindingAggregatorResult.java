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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindingAggregator" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingAggregatorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the finding aggregator.
     * </p>
     */
    private String findingAggregatorArn;
    /**
     * <p>
     * The aggregation Region.
     * </p>
     */
    private String findingAggregationRegion;
    /**
     * <p>
     * Indicates whether to link all Regions, all Regions except for a list of excluded Regions, or a list of included
     * Regions.
     * </p>
     */
    private String regionLinkingMode;
    /**
     * <p>
     * The list of excluded Regions or included Regions.
     * </p>
     */
    private java.util.List<String> regions;

    /**
     * <p>
     * The ARN of the finding aggregator.
     * </p>
     * 
     * @param findingAggregatorArn
     *        The ARN of the finding aggregator.
     */

    public void setFindingAggregatorArn(String findingAggregatorArn) {
        this.findingAggregatorArn = findingAggregatorArn;
    }

    /**
     * <p>
     * The ARN of the finding aggregator.
     * </p>
     * 
     * @return The ARN of the finding aggregator.
     */

    public String getFindingAggregatorArn() {
        return this.findingAggregatorArn;
    }

    /**
     * <p>
     * The ARN of the finding aggregator.
     * </p>
     * 
     * @param findingAggregatorArn
     *        The ARN of the finding aggregator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingAggregatorResult withFindingAggregatorArn(String findingAggregatorArn) {
        setFindingAggregatorArn(findingAggregatorArn);
        return this;
    }

    /**
     * <p>
     * The aggregation Region.
     * </p>
     * 
     * @param findingAggregationRegion
     *        The aggregation Region.
     */

    public void setFindingAggregationRegion(String findingAggregationRegion) {
        this.findingAggregationRegion = findingAggregationRegion;
    }

    /**
     * <p>
     * The aggregation Region.
     * </p>
     * 
     * @return The aggregation Region.
     */

    public String getFindingAggregationRegion() {
        return this.findingAggregationRegion;
    }

    /**
     * <p>
     * The aggregation Region.
     * </p>
     * 
     * @param findingAggregationRegion
     *        The aggregation Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingAggregatorResult withFindingAggregationRegion(String findingAggregationRegion) {
        setFindingAggregationRegion(findingAggregationRegion);
        return this;
    }

    /**
     * <p>
     * Indicates whether to link all Regions, all Regions except for a list of excluded Regions, or a list of included
     * Regions.
     * </p>
     * 
     * @param regionLinkingMode
     *        Indicates whether to link all Regions, all Regions except for a list of excluded Regions, or a list of
     *        included Regions.
     */

    public void setRegionLinkingMode(String regionLinkingMode) {
        this.regionLinkingMode = regionLinkingMode;
    }

    /**
     * <p>
     * Indicates whether to link all Regions, all Regions except for a list of excluded Regions, or a list of included
     * Regions.
     * </p>
     * 
     * @return Indicates whether to link all Regions, all Regions except for a list of excluded Regions, or a list of
     *         included Regions.
     */

    public String getRegionLinkingMode() {
        return this.regionLinkingMode;
    }

    /**
     * <p>
     * Indicates whether to link all Regions, all Regions except for a list of excluded Regions, or a list of included
     * Regions.
     * </p>
     * 
     * @param regionLinkingMode
     *        Indicates whether to link all Regions, all Regions except for a list of excluded Regions, or a list of
     *        included Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingAggregatorResult withRegionLinkingMode(String regionLinkingMode) {
        setRegionLinkingMode(regionLinkingMode);
        return this;
    }

    /**
     * <p>
     * The list of excluded Regions or included Regions.
     * </p>
     * 
     * @return The list of excluded Regions or included Regions.
     */

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * The list of excluded Regions or included Regions.
     * </p>
     * 
     * @param regions
     *        The list of excluded Regions or included Regions.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>
     * The list of excluded Regions or included Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        The list of excluded Regions or included Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingAggregatorResult withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of excluded Regions or included Regions.
     * </p>
     * 
     * @param regions
     *        The list of excluded Regions or included Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingAggregatorResult withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
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
        if (getFindingAggregatorArn() != null)
            sb.append("FindingAggregatorArn: ").append(getFindingAggregatorArn()).append(",");
        if (getFindingAggregationRegion() != null)
            sb.append("FindingAggregationRegion: ").append(getFindingAggregationRegion()).append(",");
        if (getRegionLinkingMode() != null)
            sb.append("RegionLinkingMode: ").append(getRegionLinkingMode()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingAggregatorResult == false)
            return false;
        GetFindingAggregatorResult other = (GetFindingAggregatorResult) obj;
        if (other.getFindingAggregatorArn() == null ^ this.getFindingAggregatorArn() == null)
            return false;
        if (other.getFindingAggregatorArn() != null && other.getFindingAggregatorArn().equals(this.getFindingAggregatorArn()) == false)
            return false;
        if (other.getFindingAggregationRegion() == null ^ this.getFindingAggregationRegion() == null)
            return false;
        if (other.getFindingAggregationRegion() != null && other.getFindingAggregationRegion().equals(this.getFindingAggregationRegion()) == false)
            return false;
        if (other.getRegionLinkingMode() == null ^ this.getRegionLinkingMode() == null)
            return false;
        if (other.getRegionLinkingMode() != null && other.getRegionLinkingMode().equals(this.getRegionLinkingMode()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingAggregatorArn() == null) ? 0 : getFindingAggregatorArn().hashCode());
        hashCode = prime * hashCode + ((getFindingAggregationRegion() == null) ? 0 : getFindingAggregationRegion().hashCode());
        hashCode = prime * hashCode + ((getRegionLinkingMode() == null) ? 0 : getRegionLinkingMode().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingAggregatorResult clone() {
        try {
            return (GetFindingAggregatorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
