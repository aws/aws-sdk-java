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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the CloudTrail trail being analyzed to generate a policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/TrailProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrailProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Possible values are <code>true</code> or <code>false</code>. If set to <code>true</code>, Access Analyzer
     * retrieves CloudTrail data from all regions to analyze and generate a policy.
     * </p>
     */
    private Boolean allRegions;
    /**
     * <p>
     * Specifies the ARN of the trail. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>.
     * </p>
     */
    private String cloudTrailArn;
    /**
     * <p>
     * A list of regions to get CloudTrail data from and analyze to generate a policy.
     * </p>
     */
    private java.util.List<String> regions;

    /**
     * <p>
     * Possible values are <code>true</code> or <code>false</code>. If set to <code>true</code>, Access Analyzer
     * retrieves CloudTrail data from all regions to analyze and generate a policy.
     * </p>
     * 
     * @param allRegions
     *        Possible values are <code>true</code> or <code>false</code>. If set to <code>true</code>, Access Analyzer
     *        retrieves CloudTrail data from all regions to analyze and generate a policy.
     */

    public void setAllRegions(Boolean allRegions) {
        this.allRegions = allRegions;
    }

    /**
     * <p>
     * Possible values are <code>true</code> or <code>false</code>. If set to <code>true</code>, Access Analyzer
     * retrieves CloudTrail data from all regions to analyze and generate a policy.
     * </p>
     * 
     * @return Possible values are <code>true</code> or <code>false</code>. If set to <code>true</code>, Access Analyzer
     *         retrieves CloudTrail data from all regions to analyze and generate a policy.
     */

    public Boolean getAllRegions() {
        return this.allRegions;
    }

    /**
     * <p>
     * Possible values are <code>true</code> or <code>false</code>. If set to <code>true</code>, Access Analyzer
     * retrieves CloudTrail data from all regions to analyze and generate a policy.
     * </p>
     * 
     * @param allRegions
     *        Possible values are <code>true</code> or <code>false</code>. If set to <code>true</code>, Access Analyzer
     *        retrieves CloudTrail data from all regions to analyze and generate a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrailProperties withAllRegions(Boolean allRegions) {
        setAllRegions(allRegions);
        return this;
    }

    /**
     * <p>
     * Possible values are <code>true</code> or <code>false</code>. If set to <code>true</code>, Access Analyzer
     * retrieves CloudTrail data from all regions to analyze and generate a policy.
     * </p>
     * 
     * @return Possible values are <code>true</code> or <code>false</code>. If set to <code>true</code>, Access Analyzer
     *         retrieves CloudTrail data from all regions to analyze and generate a policy.
     */

    public Boolean isAllRegions() {
        return this.allRegions;
    }

    /**
     * <p>
     * Specifies the ARN of the trail. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>.
     * </p>
     * 
     * @param cloudTrailArn
     *        Specifies the ARN of the trail. The format of a trail ARN is
     *        <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>.
     */

    public void setCloudTrailArn(String cloudTrailArn) {
        this.cloudTrailArn = cloudTrailArn;
    }

    /**
     * <p>
     * Specifies the ARN of the trail. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>.
     * </p>
     * 
     * @return Specifies the ARN of the trail. The format of a trail ARN is
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>.
     */

    public String getCloudTrailArn() {
        return this.cloudTrailArn;
    }

    /**
     * <p>
     * Specifies the ARN of the trail. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>.
     * </p>
     * 
     * @param cloudTrailArn
     *        Specifies the ARN of the trail. The format of a trail ARN is
     *        <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrailProperties withCloudTrailArn(String cloudTrailArn) {
        setCloudTrailArn(cloudTrailArn);
        return this;
    }

    /**
     * <p>
     * A list of regions to get CloudTrail data from and analyze to generate a policy.
     * </p>
     * 
     * @return A list of regions to get CloudTrail data from and analyze to generate a policy.
     */

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * A list of regions to get CloudTrail data from and analyze to generate a policy.
     * </p>
     * 
     * @param regions
     *        A list of regions to get CloudTrail data from and analyze to generate a policy.
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
     * A list of regions to get CloudTrail data from and analyze to generate a policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        A list of regions to get CloudTrail data from and analyze to generate a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrailProperties withRegions(String... regions) {
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
     * A list of regions to get CloudTrail data from and analyze to generate a policy.
     * </p>
     * 
     * @param regions
     *        A list of regions to get CloudTrail data from and analyze to generate a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrailProperties withRegions(java.util.Collection<String> regions) {
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
        if (getAllRegions() != null)
            sb.append("AllRegions: ").append(getAllRegions()).append(",");
        if (getCloudTrailArn() != null)
            sb.append("CloudTrailArn: ").append(getCloudTrailArn()).append(",");
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

        if (obj instanceof TrailProperties == false)
            return false;
        TrailProperties other = (TrailProperties) obj;
        if (other.getAllRegions() == null ^ this.getAllRegions() == null)
            return false;
        if (other.getAllRegions() != null && other.getAllRegions().equals(this.getAllRegions()) == false)
            return false;
        if (other.getCloudTrailArn() == null ^ this.getCloudTrailArn() == null)
            return false;
        if (other.getCloudTrailArn() != null && other.getCloudTrailArn().equals(this.getCloudTrailArn()) == false)
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

        hashCode = prime * hashCode + ((getAllRegions() == null) ? 0 : getAllRegions().hashCode());
        hashCode = prime * hashCode + ((getCloudTrailArn() == null) ? 0 : getCloudTrailArn().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        return hashCode;
    }

    @Override
    public TrailProperties clone() {
        try {
            return (TrailProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.TrailPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
