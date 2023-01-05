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
 * A collection of statuses for a Multi-Region Access Point in the various Regions it supports.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/MultiRegionAccessPointReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiRegionAccessPointReport implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Multi-Region Access Point.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The alias for the Multi-Region Access Point. For more information about the distinction between the name and the
     * alias of an Multi-Region Access Point, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html#multi-region-access-point-naming"
     * >Managing Multi-Region Access Points</a>.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * When the Multi-Region Access Point create request was received.
     * </p>
     */
    private java.util.Date createdAt;

    private PublicAccessBlockConfiguration publicAccessBlock;
    /**
     * <p>
     * The current status of the Multi-Region Access Point.
     * </p>
     * <p>
     * <code>CREATING</code> and <code>DELETING</code> are temporary states that exist while the request is propagating
     * and being completed. If a Multi-Region Access Point has a status of <code>PARTIALLY_CREATED</code>, you can retry
     * creation or send a request to delete the Multi-Region Access Point. If a Multi-Region Access Point has a status
     * of <code>PARTIALLY_DELETED</code>, you can retry a delete request to finish the deletion of the Multi-Region
     * Access Point.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A collection of the Regions and buckets associated with the Multi-Region Access Point.
     * </p>
     */
    private java.util.List<RegionReport> regions;

    /**
     * <p>
     * The name of the Multi-Region Access Point.
     * </p>
     * 
     * @param name
     *        The name of the Multi-Region Access Point.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Multi-Region Access Point.
     * </p>
     * 
     * @return The name of the Multi-Region Access Point.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Multi-Region Access Point.
     * </p>
     * 
     * @param name
     *        The name of the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionAccessPointReport withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The alias for the Multi-Region Access Point. For more information about the distinction between the name and the
     * alias of an Multi-Region Access Point, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html#multi-region-access-point-naming"
     * >Managing Multi-Region Access Points</a>.
     * </p>
     * 
     * @param alias
     *        The alias for the Multi-Region Access Point. For more information about the distinction between the name
     *        and the alias of an Multi-Region Access Point, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html#multi-region-access-point-naming"
     *        >Managing Multi-Region Access Points</a>.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias for the Multi-Region Access Point. For more information about the distinction between the name and the
     * alias of an Multi-Region Access Point, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html#multi-region-access-point-naming"
     * >Managing Multi-Region Access Points</a>.
     * </p>
     * 
     * @return The alias for the Multi-Region Access Point. For more information about the distinction between the name
     *         and the alias of an Multi-Region Access Point, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html#multi-region-access-point-naming"
     *         >Managing Multi-Region Access Points</a>.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias for the Multi-Region Access Point. For more information about the distinction between the name and the
     * alias of an Multi-Region Access Point, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html#multi-region-access-point-naming"
     * >Managing Multi-Region Access Points</a>.
     * </p>
     * 
     * @param alias
     *        The alias for the Multi-Region Access Point. For more information about the distinction between the name
     *        and the alias of an Multi-Region Access Point, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html#multi-region-access-point-naming"
     *        >Managing Multi-Region Access Points</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionAccessPointReport withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * When the Multi-Region Access Point create request was received.
     * </p>
     * 
     * @param createdAt
     *        When the Multi-Region Access Point create request was received.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * When the Multi-Region Access Point create request was received.
     * </p>
     * 
     * @return When the Multi-Region Access Point create request was received.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * When the Multi-Region Access Point create request was received.
     * </p>
     * 
     * @param createdAt
     *        When the Multi-Region Access Point create request was received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionAccessPointReport withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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

    public MultiRegionAccessPointReport withPublicAccessBlock(PublicAccessBlockConfiguration publicAccessBlock) {
        setPublicAccessBlock(publicAccessBlock);
        return this;
    }

    /**
     * <p>
     * The current status of the Multi-Region Access Point.
     * </p>
     * <p>
     * <code>CREATING</code> and <code>DELETING</code> are temporary states that exist while the request is propagating
     * and being completed. If a Multi-Region Access Point has a status of <code>PARTIALLY_CREATED</code>, you can retry
     * creation or send a request to delete the Multi-Region Access Point. If a Multi-Region Access Point has a status
     * of <code>PARTIALLY_DELETED</code>, you can retry a delete request to finish the deletion of the Multi-Region
     * Access Point.
     * </p>
     * 
     * @param status
     *        The current status of the Multi-Region Access Point.</p>
     *        <p>
     *        <code>CREATING</code> and <code>DELETING</code> are temporary states that exist while the request is
     *        propagating and being completed. If a Multi-Region Access Point has a status of
     *        <code>PARTIALLY_CREATED</code>, you can retry creation or send a request to delete the Multi-Region Access
     *        Point. If a Multi-Region Access Point has a status of <code>PARTIALLY_DELETED</code>, you can retry a
     *        delete request to finish the deletion of the Multi-Region Access Point.
     * @see MultiRegionAccessPointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the Multi-Region Access Point.
     * </p>
     * <p>
     * <code>CREATING</code> and <code>DELETING</code> are temporary states that exist while the request is propagating
     * and being completed. If a Multi-Region Access Point has a status of <code>PARTIALLY_CREATED</code>, you can retry
     * creation or send a request to delete the Multi-Region Access Point. If a Multi-Region Access Point has a status
     * of <code>PARTIALLY_DELETED</code>, you can retry a delete request to finish the deletion of the Multi-Region
     * Access Point.
     * </p>
     * 
     * @return The current status of the Multi-Region Access Point.</p>
     *         <p>
     *         <code>CREATING</code> and <code>DELETING</code> are temporary states that exist while the request is
     *         propagating and being completed. If a Multi-Region Access Point has a status of
     *         <code>PARTIALLY_CREATED</code>, you can retry creation or send a request to delete the Multi-Region
     *         Access Point. If a Multi-Region Access Point has a status of <code>PARTIALLY_DELETED</code>, you can
     *         retry a delete request to finish the deletion of the Multi-Region Access Point.
     * @see MultiRegionAccessPointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the Multi-Region Access Point.
     * </p>
     * <p>
     * <code>CREATING</code> and <code>DELETING</code> are temporary states that exist while the request is propagating
     * and being completed. If a Multi-Region Access Point has a status of <code>PARTIALLY_CREATED</code>, you can retry
     * creation or send a request to delete the Multi-Region Access Point. If a Multi-Region Access Point has a status
     * of <code>PARTIALLY_DELETED</code>, you can retry a delete request to finish the deletion of the Multi-Region
     * Access Point.
     * </p>
     * 
     * @param status
     *        The current status of the Multi-Region Access Point.</p>
     *        <p>
     *        <code>CREATING</code> and <code>DELETING</code> are temporary states that exist while the request is
     *        propagating and being completed. If a Multi-Region Access Point has a status of
     *        <code>PARTIALLY_CREATED</code>, you can retry creation or send a request to delete the Multi-Region Access
     *        Point. If a Multi-Region Access Point has a status of <code>PARTIALLY_DELETED</code>, you can retry a
     *        delete request to finish the deletion of the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MultiRegionAccessPointStatus
     */

    public MultiRegionAccessPointReport withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the Multi-Region Access Point.
     * </p>
     * <p>
     * <code>CREATING</code> and <code>DELETING</code> are temporary states that exist while the request is propagating
     * and being completed. If a Multi-Region Access Point has a status of <code>PARTIALLY_CREATED</code>, you can retry
     * creation or send a request to delete the Multi-Region Access Point. If a Multi-Region Access Point has a status
     * of <code>PARTIALLY_DELETED</code>, you can retry a delete request to finish the deletion of the Multi-Region
     * Access Point.
     * </p>
     * 
     * @param status
     *        The current status of the Multi-Region Access Point.</p>
     *        <p>
     *        <code>CREATING</code> and <code>DELETING</code> are temporary states that exist while the request is
     *        propagating and being completed. If a Multi-Region Access Point has a status of
     *        <code>PARTIALLY_CREATED</code>, you can retry creation or send a request to delete the Multi-Region Access
     *        Point. If a Multi-Region Access Point has a status of <code>PARTIALLY_DELETED</code>, you can retry a
     *        delete request to finish the deletion of the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MultiRegionAccessPointStatus
     */

    public MultiRegionAccessPointReport withStatus(MultiRegionAccessPointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A collection of the Regions and buckets associated with the Multi-Region Access Point.
     * </p>
     * 
     * @return A collection of the Regions and buckets associated with the Multi-Region Access Point.
     */

    public java.util.List<RegionReport> getRegions() {
        return regions;
    }

    /**
     * <p>
     * A collection of the Regions and buckets associated with the Multi-Region Access Point.
     * </p>
     * 
     * @param regions
     *        A collection of the Regions and buckets associated with the Multi-Region Access Point.
     */

    public void setRegions(java.util.Collection<RegionReport> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<RegionReport>(regions);
    }

    /**
     * <p>
     * A collection of the Regions and buckets associated with the Multi-Region Access Point.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        A collection of the Regions and buckets associated with the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionAccessPointReport withRegions(RegionReport... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<RegionReport>(regions.length));
        }
        for (RegionReport ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of the Regions and buckets associated with the Multi-Region Access Point.
     * </p>
     * 
     * @param regions
     *        A collection of the Regions and buckets associated with the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionAccessPointReport withRegions(java.util.Collection<RegionReport> regions) {
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
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getPublicAccessBlock() != null)
            sb.append("PublicAccessBlock: ").append(getPublicAccessBlock()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof MultiRegionAccessPointReport == false)
            return false;
        MultiRegionAccessPointReport other = (MultiRegionAccessPointReport) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getPublicAccessBlock() == null ^ this.getPublicAccessBlock() == null)
            return false;
        if (other.getPublicAccessBlock() != null && other.getPublicAccessBlock().equals(this.getPublicAccessBlock()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getPublicAccessBlock() == null) ? 0 : getPublicAccessBlock().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        return hashCode;
    }

    @Override
    public MultiRegionAccessPointReport clone() {
        try {
            return (MultiRegionAccessPointReport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
