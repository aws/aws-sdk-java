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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindingAggregator"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFindingAggregatorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the finding aggregator. To obtain the ARN, use <code>ListFindingAggregators</code>.
     * </p>
     */
    private String findingAggregatorArn;
    /**
     * <p>
     * Indicates whether to aggregate findings from all of the available Regions in the current partition. Also
     * determines whether to automatically aggregate findings from new Regions as Security Hub supports them and you opt
     * into them.
     * </p>
     * <p>
     * The selected option also determines how to use the Regions provided in the Regions list.
     * </p>
     * <p>
     * The options are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_REGIONS</code> - Indicates to aggregate findings from all of the Regions where Security Hub is enabled.
     * When you choose this option, Security Hub also automatically aggregates findings from new Regions as Security Hub
     * supports them and you opt into them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_REGIONS_EXCEPT_SPECIFIED</code> - Indicates to aggregate findings from all of the Regions where
     * Security Hub is enabled, except for the Regions listed in the <code>Regions</code> parameter. When you choose
     * this option, Security Hub also automatically aggregates findings from new Regions as Security Hub supports them
     * and you opt into them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIED_REGIONS</code> - Indicates to aggregate findings only from the Regions listed in the
     * <code>Regions</code> parameter. Security Hub does not automatically aggregate findings from new Regions.
     * </p>
     * </li>
     * </ul>
     */
    private String regionLinkingMode;
    /**
     * <p>
     * If <code>RegionLinkingMode</code> is <code>ALL_REGIONS_EXCEPT_SPECIFIED</code>, then this is a space-separated
     * list of Regions that do not aggregate findings to the aggregation Region.
     * </p>
     * <p>
     * If <code>RegionLinkingMode</code> is <code>SPECIFIED_REGIONS</code>, then this is a space-separated list of
     * Regions that do aggregate findings to the aggregation Region.
     * </p>
     */
    private java.util.List<String> regions;

    /**
     * <p>
     * The ARN of the finding aggregator. To obtain the ARN, use <code>ListFindingAggregators</code>.
     * </p>
     * 
     * @param findingAggregatorArn
     *        The ARN of the finding aggregator. To obtain the ARN, use <code>ListFindingAggregators</code>.
     */

    public void setFindingAggregatorArn(String findingAggregatorArn) {
        this.findingAggregatorArn = findingAggregatorArn;
    }

    /**
     * <p>
     * The ARN of the finding aggregator. To obtain the ARN, use <code>ListFindingAggregators</code>.
     * </p>
     * 
     * @return The ARN of the finding aggregator. To obtain the ARN, use <code>ListFindingAggregators</code>.
     */

    public String getFindingAggregatorArn() {
        return this.findingAggregatorArn;
    }

    /**
     * <p>
     * The ARN of the finding aggregator. To obtain the ARN, use <code>ListFindingAggregators</code>.
     * </p>
     * 
     * @param findingAggregatorArn
     *        The ARN of the finding aggregator. To obtain the ARN, use <code>ListFindingAggregators</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFindingAggregatorRequest withFindingAggregatorArn(String findingAggregatorArn) {
        setFindingAggregatorArn(findingAggregatorArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether to aggregate findings from all of the available Regions in the current partition. Also
     * determines whether to automatically aggregate findings from new Regions as Security Hub supports them and you opt
     * into them.
     * </p>
     * <p>
     * The selected option also determines how to use the Regions provided in the Regions list.
     * </p>
     * <p>
     * The options are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_REGIONS</code> - Indicates to aggregate findings from all of the Regions where Security Hub is enabled.
     * When you choose this option, Security Hub also automatically aggregates findings from new Regions as Security Hub
     * supports them and you opt into them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_REGIONS_EXCEPT_SPECIFIED</code> - Indicates to aggregate findings from all of the Regions where
     * Security Hub is enabled, except for the Regions listed in the <code>Regions</code> parameter. When you choose
     * this option, Security Hub also automatically aggregates findings from new Regions as Security Hub supports them
     * and you opt into them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIED_REGIONS</code> - Indicates to aggregate findings only from the Regions listed in the
     * <code>Regions</code> parameter. Security Hub does not automatically aggregate findings from new Regions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param regionLinkingMode
     *        Indicates whether to aggregate findings from all of the available Regions in the current partition. Also
     *        determines whether to automatically aggregate findings from new Regions as Security Hub supports them and
     *        you opt into them.</p>
     *        <p>
     *        The selected option also determines how to use the Regions provided in the Regions list.
     *        </p>
     *        <p>
     *        The options are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_REGIONS</code> - Indicates to aggregate findings from all of the Regions where Security Hub is
     *        enabled. When you choose this option, Security Hub also automatically aggregates findings from new Regions
     *        as Security Hub supports them and you opt into them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_REGIONS_EXCEPT_SPECIFIED</code> - Indicates to aggregate findings from all of the Regions where
     *        Security Hub is enabled, except for the Regions listed in the <code>Regions</code> parameter. When you
     *        choose this option, Security Hub also automatically aggregates findings from new Regions as Security Hub
     *        supports them and you opt into them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPECIFIED_REGIONS</code> - Indicates to aggregate findings only from the Regions listed in the
     *        <code>Regions</code> parameter. Security Hub does not automatically aggregate findings from new Regions.
     *        </p>
     *        </li>
     */

    public void setRegionLinkingMode(String regionLinkingMode) {
        this.regionLinkingMode = regionLinkingMode;
    }

    /**
     * <p>
     * Indicates whether to aggregate findings from all of the available Regions in the current partition. Also
     * determines whether to automatically aggregate findings from new Regions as Security Hub supports them and you opt
     * into them.
     * </p>
     * <p>
     * The selected option also determines how to use the Regions provided in the Regions list.
     * </p>
     * <p>
     * The options are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_REGIONS</code> - Indicates to aggregate findings from all of the Regions where Security Hub is enabled.
     * When you choose this option, Security Hub also automatically aggregates findings from new Regions as Security Hub
     * supports them and you opt into them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_REGIONS_EXCEPT_SPECIFIED</code> - Indicates to aggregate findings from all of the Regions where
     * Security Hub is enabled, except for the Regions listed in the <code>Regions</code> parameter. When you choose
     * this option, Security Hub also automatically aggregates findings from new Regions as Security Hub supports them
     * and you opt into them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIED_REGIONS</code> - Indicates to aggregate findings only from the Regions listed in the
     * <code>Regions</code> parameter. Security Hub does not automatically aggregate findings from new Regions.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether to aggregate findings from all of the available Regions in the current partition. Also
     *         determines whether to automatically aggregate findings from new Regions as Security Hub supports them and
     *         you opt into them.</p>
     *         <p>
     *         The selected option also determines how to use the Regions provided in the Regions list.
     *         </p>
     *         <p>
     *         The options are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL_REGIONS</code> - Indicates to aggregate findings from all of the Regions where Security Hub is
     *         enabled. When you choose this option, Security Hub also automatically aggregates findings from new
     *         Regions as Security Hub supports them and you opt into them.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL_REGIONS_EXCEPT_SPECIFIED</code> - Indicates to aggregate findings from all of the Regions where
     *         Security Hub is enabled, except for the Regions listed in the <code>Regions</code> parameter. When you
     *         choose this option, Security Hub also automatically aggregates findings from new Regions as Security Hub
     *         supports them and you opt into them.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SPECIFIED_REGIONS</code> - Indicates to aggregate findings only from the Regions listed in the
     *         <code>Regions</code> parameter. Security Hub does not automatically aggregate findings from new Regions.
     *         </p>
     *         </li>
     */

    public String getRegionLinkingMode() {
        return this.regionLinkingMode;
    }

    /**
     * <p>
     * Indicates whether to aggregate findings from all of the available Regions in the current partition. Also
     * determines whether to automatically aggregate findings from new Regions as Security Hub supports them and you opt
     * into them.
     * </p>
     * <p>
     * The selected option also determines how to use the Regions provided in the Regions list.
     * </p>
     * <p>
     * The options are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_REGIONS</code> - Indicates to aggregate findings from all of the Regions where Security Hub is enabled.
     * When you choose this option, Security Hub also automatically aggregates findings from new Regions as Security Hub
     * supports them and you opt into them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_REGIONS_EXCEPT_SPECIFIED</code> - Indicates to aggregate findings from all of the Regions where
     * Security Hub is enabled, except for the Regions listed in the <code>Regions</code> parameter. When you choose
     * this option, Security Hub also automatically aggregates findings from new Regions as Security Hub supports them
     * and you opt into them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIED_REGIONS</code> - Indicates to aggregate findings only from the Regions listed in the
     * <code>Regions</code> parameter. Security Hub does not automatically aggregate findings from new Regions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param regionLinkingMode
     *        Indicates whether to aggregate findings from all of the available Regions in the current partition. Also
     *        determines whether to automatically aggregate findings from new Regions as Security Hub supports them and
     *        you opt into them.</p>
     *        <p>
     *        The selected option also determines how to use the Regions provided in the Regions list.
     *        </p>
     *        <p>
     *        The options are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_REGIONS</code> - Indicates to aggregate findings from all of the Regions where Security Hub is
     *        enabled. When you choose this option, Security Hub also automatically aggregates findings from new Regions
     *        as Security Hub supports them and you opt into them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_REGIONS_EXCEPT_SPECIFIED</code> - Indicates to aggregate findings from all of the Regions where
     *        Security Hub is enabled, except for the Regions listed in the <code>Regions</code> parameter. When you
     *        choose this option, Security Hub also automatically aggregates findings from new Regions as Security Hub
     *        supports them and you opt into them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPECIFIED_REGIONS</code> - Indicates to aggregate findings only from the Regions listed in the
     *        <code>Regions</code> parameter. Security Hub does not automatically aggregate findings from new Regions.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFindingAggregatorRequest withRegionLinkingMode(String regionLinkingMode) {
        setRegionLinkingMode(regionLinkingMode);
        return this;
    }

    /**
     * <p>
     * If <code>RegionLinkingMode</code> is <code>ALL_REGIONS_EXCEPT_SPECIFIED</code>, then this is a space-separated
     * list of Regions that do not aggregate findings to the aggregation Region.
     * </p>
     * <p>
     * If <code>RegionLinkingMode</code> is <code>SPECIFIED_REGIONS</code>, then this is a space-separated list of
     * Regions that do aggregate findings to the aggregation Region.
     * </p>
     * 
     * @return If <code>RegionLinkingMode</code> is <code>ALL_REGIONS_EXCEPT_SPECIFIED</code>, then this is a
     *         space-separated list of Regions that do not aggregate findings to the aggregation Region.</p>
     *         <p>
     *         If <code>RegionLinkingMode</code> is <code>SPECIFIED_REGIONS</code>, then this is a space-separated list
     *         of Regions that do aggregate findings to the aggregation Region.
     */

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * If <code>RegionLinkingMode</code> is <code>ALL_REGIONS_EXCEPT_SPECIFIED</code>, then this is a space-separated
     * list of Regions that do not aggregate findings to the aggregation Region.
     * </p>
     * <p>
     * If <code>RegionLinkingMode</code> is <code>SPECIFIED_REGIONS</code>, then this is a space-separated list of
     * Regions that do aggregate findings to the aggregation Region.
     * </p>
     * 
     * @param regions
     *        If <code>RegionLinkingMode</code> is <code>ALL_REGIONS_EXCEPT_SPECIFIED</code>, then this is a
     *        space-separated list of Regions that do not aggregate findings to the aggregation Region.</p>
     *        <p>
     *        If <code>RegionLinkingMode</code> is <code>SPECIFIED_REGIONS</code>, then this is a space-separated list
     *        of Regions that do aggregate findings to the aggregation Region.
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
     * If <code>RegionLinkingMode</code> is <code>ALL_REGIONS_EXCEPT_SPECIFIED</code>, then this is a space-separated
     * list of Regions that do not aggregate findings to the aggregation Region.
     * </p>
     * <p>
     * If <code>RegionLinkingMode</code> is <code>SPECIFIED_REGIONS</code>, then this is a space-separated list of
     * Regions that do aggregate findings to the aggregation Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        If <code>RegionLinkingMode</code> is <code>ALL_REGIONS_EXCEPT_SPECIFIED</code>, then this is a
     *        space-separated list of Regions that do not aggregate findings to the aggregation Region.</p>
     *        <p>
     *        If <code>RegionLinkingMode</code> is <code>SPECIFIED_REGIONS</code>, then this is a space-separated list
     *        of Regions that do aggregate findings to the aggregation Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFindingAggregatorRequest withRegions(String... regions) {
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
     * If <code>RegionLinkingMode</code> is <code>ALL_REGIONS_EXCEPT_SPECIFIED</code>, then this is a space-separated
     * list of Regions that do not aggregate findings to the aggregation Region.
     * </p>
     * <p>
     * If <code>RegionLinkingMode</code> is <code>SPECIFIED_REGIONS</code>, then this is a space-separated list of
     * Regions that do aggregate findings to the aggregation Region.
     * </p>
     * 
     * @param regions
     *        If <code>RegionLinkingMode</code> is <code>ALL_REGIONS_EXCEPT_SPECIFIED</code>, then this is a
     *        space-separated list of Regions that do not aggregate findings to the aggregation Region.</p>
     *        <p>
     *        If <code>RegionLinkingMode</code> is <code>SPECIFIED_REGIONS</code>, then this is a space-separated list
     *        of Regions that do aggregate findings to the aggregation Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFindingAggregatorRequest withRegions(java.util.Collection<String> regions) {
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

        if (obj instanceof UpdateFindingAggregatorRequest == false)
            return false;
        UpdateFindingAggregatorRequest other = (UpdateFindingAggregatorRequest) obj;
        if (other.getFindingAggregatorArn() == null ^ this.getFindingAggregatorArn() == null)
            return false;
        if (other.getFindingAggregatorArn() != null && other.getFindingAggregatorArn().equals(this.getFindingAggregatorArn()) == false)
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
        hashCode = prime * hashCode + ((getRegionLinkingMode() == null) ? 0 : getRegionLinkingMode().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFindingAggregatorRequest clone() {
        return (UpdateFindingAggregatorRequest) super.clone();
    }

}
