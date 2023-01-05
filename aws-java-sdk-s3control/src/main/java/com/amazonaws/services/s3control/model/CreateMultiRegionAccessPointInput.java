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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A container for the information associated with a <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html"
 * >CreateMultiRegionAccessPoint</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateMultiRegionAccessPointInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMultiRegionAccessPointInput implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Multi-Region Access Point associated with this request.
     * </p>
     */
    private String name;

    private PublicAccessBlockConfiguration publicAccessBlock;
    /**
     * <p>
     * The buckets in different Regions that are associated with the Multi-Region Access Point.
     * </p>
     */
    private java.util.List<Region> regions;

    /**
     * <p>
     * The name of the Multi-Region Access Point associated with this request.
     * </p>
     * 
     * @param name
     *        The name of the Multi-Region Access Point associated with this request.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Multi-Region Access Point associated with this request.
     * </p>
     * 
     * @return The name of the Multi-Region Access Point associated with this request.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Multi-Region Access Point associated with this request.
     * </p>
     * 
     * @param name
     *        The name of the Multi-Region Access Point associated with this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiRegionAccessPointInput withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param publicAccessBlock
     */

    public void setPublicAccessBlock(PublicAccessBlockConfiguration publicAccessBlock) {
        this.publicAccessBlock = publicAccessBlock;
    }

    /**
     * @return
     */

    public PublicAccessBlockConfiguration getPublicAccessBlock() {
        return this.publicAccessBlock;
    }

    /**
     * @param publicAccessBlock
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiRegionAccessPointInput withPublicAccessBlock(PublicAccessBlockConfiguration publicAccessBlock) {
        setPublicAccessBlock(publicAccessBlock);
        return this;
    }

    /**
     * <p>
     * The buckets in different Regions that are associated with the Multi-Region Access Point.
     * </p>
     * 
     * @return The buckets in different Regions that are associated with the Multi-Region Access Point.
     */

    public java.util.List<Region> getRegions() {
        return regions;
    }

    /**
     * <p>
     * The buckets in different Regions that are associated with the Multi-Region Access Point.
     * </p>
     * 
     * @param regions
     *        The buckets in different Regions that are associated with the Multi-Region Access Point.
     */

    public void setRegions(java.util.Collection<Region> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<Region>(regions);
    }

    /**
     * <p>
     * The buckets in different Regions that are associated with the Multi-Region Access Point.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        The buckets in different Regions that are associated with the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiRegionAccessPointInput withRegions(Region... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<Region>(regions.length));
        }
        for (Region ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The buckets in different Regions that are associated with the Multi-Region Access Point.
     * </p>
     * 
     * @param regions
     *        The buckets in different Regions that are associated with the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiRegionAccessPointInput withRegions(java.util.Collection<Region> regions) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPublicAccessBlock() != null)
            sb.append("PublicAccessBlock: ").append(getPublicAccessBlock()).append(",");
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

        if (obj instanceof CreateMultiRegionAccessPointInput == false)
            return false;
        CreateMultiRegionAccessPointInput other = (CreateMultiRegionAccessPointInput) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPublicAccessBlock() == null ^ this.getPublicAccessBlock() == null)
            return false;
        if (other.getPublicAccessBlock() != null && other.getPublicAccessBlock().equals(this.getPublicAccessBlock()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPublicAccessBlock() == null) ? 0 : getPublicAccessBlock().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        return hashCode;
    }

    @Override
    public CreateMultiRegionAccessPointInput clone() {
        try {
            return (CreateMultiRegionAccessPointInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
