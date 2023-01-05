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
 * A structure for a Multi-Region Access Point that indicates where Amazon S3 traffic can be routed. Routes can be
 * either active or passive. Active routes can process Amazon S3 requests through the Multi-Region Access Point, but
 * passive routes are not eligible to process Amazon S3 requests.
 * </p>
 * <p>
 * Each route contains the Amazon S3 bucket name and the Amazon Web Services Region that the bucket is located in. The
 * route also includes the <code>TrafficDialPercentage</code> value, which shows whether the bucket and Region are
 * active (indicated by a value of <code>100</code>) or passive (indicated by a value of <code>0</code>).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/MultiRegionAccessPointRoute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiRegionAccessPointRoute implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon S3 bucket for which you'll submit a routing configuration change. Either the
     * <code>Bucket</code> or the <code>Region</code> value must be provided. If both are provided, the bucket must be
     * in the specified Region.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The Amazon Web Services Region to which you'll be submitting a routing configuration change. Either the
     * <code>Bucket</code> or the <code>Region</code> value must be provided. If both are provided, the bucket must be
     * in the specified Region.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The traffic state for the specified bucket or Amazon Web Services Region.
     * </p>
     * <p>
     * A value of <code>0</code> indicates a passive state, which means that no new traffic will be routed to the
     * Region.
     * </p>
     * <p>
     * A value of <code>100</code> indicates an active state, which means that traffic will be routed to the specified
     * Region.
     * </p>
     * <p>
     * When the routing configuration for a Region is changed from active to passive, any in-progress operations
     * (uploads, copies, deletes, and so on) to the formerly active Region will continue to run to until a final success
     * or failure status is reached.
     * </p>
     * <p>
     * If all Regions in the routing configuration are designated as passive, you'll receive an
     * <code>InvalidRequest</code> error.
     * </p>
     */
    private Integer trafficDialPercentage;

    /**
     * <p>
     * The name of the Amazon S3 bucket for which you'll submit a routing configuration change. Either the
     * <code>Bucket</code> or the <code>Region</code> value must be provided. If both are provided, the bucket must be
     * in the specified Region.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket for which you'll submit a routing configuration change. Either the
     *        <code>Bucket</code> or the <code>Region</code> value must be provided. If both are provided, the bucket
     *        must be in the specified Region.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket for which you'll submit a routing configuration change. Either the
     * <code>Bucket</code> or the <code>Region</code> value must be provided. If both are provided, the bucket must be
     * in the specified Region.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket for which you'll submit a routing configuration change. Either the
     *         <code>Bucket</code> or the <code>Region</code> value must be provided. If both are provided, the bucket
     *         must be in the specified Region.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket for which you'll submit a routing configuration change. Either the
     * <code>Bucket</code> or the <code>Region</code> value must be provided. If both are provided, the bucket must be
     * in the specified Region.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket for which you'll submit a routing configuration change. Either the
     *        <code>Bucket</code> or the <code>Region</code> value must be provided. If both are provided, the bucket
     *        must be in the specified Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionAccessPointRoute withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region to which you'll be submitting a routing configuration change. Either the
     * <code>Bucket</code> or the <code>Region</code> value must be provided. If both are provided, the bucket must be
     * in the specified Region.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region to which you'll be submitting a routing configuration change. Either the
     *        <code>Bucket</code> or the <code>Region</code> value must be provided. If both are provided, the bucket
     *        must be in the specified Region.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region to which you'll be submitting a routing configuration change. Either the
     * <code>Bucket</code> or the <code>Region</code> value must be provided. If both are provided, the bucket must be
     * in the specified Region.
     * </p>
     * 
     * @return The Amazon Web Services Region to which you'll be submitting a routing configuration change. Either the
     *         <code>Bucket</code> or the <code>Region</code> value must be provided. If both are provided, the bucket
     *         must be in the specified Region.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region to which you'll be submitting a routing configuration change. Either the
     * <code>Bucket</code> or the <code>Region</code> value must be provided. If both are provided, the bucket must be
     * in the specified Region.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region to which you'll be submitting a routing configuration change. Either the
     *        <code>Bucket</code> or the <code>Region</code> value must be provided. If both are provided, the bucket
     *        must be in the specified Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionAccessPointRoute withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The traffic state for the specified bucket or Amazon Web Services Region.
     * </p>
     * <p>
     * A value of <code>0</code> indicates a passive state, which means that no new traffic will be routed to the
     * Region.
     * </p>
     * <p>
     * A value of <code>100</code> indicates an active state, which means that traffic will be routed to the specified
     * Region.
     * </p>
     * <p>
     * When the routing configuration for a Region is changed from active to passive, any in-progress operations
     * (uploads, copies, deletes, and so on) to the formerly active Region will continue to run to until a final success
     * or failure status is reached.
     * </p>
     * <p>
     * If all Regions in the routing configuration are designated as passive, you'll receive an
     * <code>InvalidRequest</code> error.
     * </p>
     * 
     * @param trafficDialPercentage
     *        The traffic state for the specified bucket or Amazon Web Services Region. </p>
     *        <p>
     *        A value of <code>0</code> indicates a passive state, which means that no new traffic will be routed to the
     *        Region.
     *        </p>
     *        <p>
     *        A value of <code>100</code> indicates an active state, which means that traffic will be routed to the
     *        specified Region.
     *        </p>
     *        <p>
     *        When the routing configuration for a Region is changed from active to passive, any in-progress operations
     *        (uploads, copies, deletes, and so on) to the formerly active Region will continue to run to until a final
     *        success or failure status is reached.
     *        </p>
     *        <p>
     *        If all Regions in the routing configuration are designated as passive, you'll receive an
     *        <code>InvalidRequest</code> error.
     */

    public void setTrafficDialPercentage(Integer trafficDialPercentage) {
        this.trafficDialPercentage = trafficDialPercentage;
    }

    /**
     * <p>
     * The traffic state for the specified bucket or Amazon Web Services Region.
     * </p>
     * <p>
     * A value of <code>0</code> indicates a passive state, which means that no new traffic will be routed to the
     * Region.
     * </p>
     * <p>
     * A value of <code>100</code> indicates an active state, which means that traffic will be routed to the specified
     * Region.
     * </p>
     * <p>
     * When the routing configuration for a Region is changed from active to passive, any in-progress operations
     * (uploads, copies, deletes, and so on) to the formerly active Region will continue to run to until a final success
     * or failure status is reached.
     * </p>
     * <p>
     * If all Regions in the routing configuration are designated as passive, you'll receive an
     * <code>InvalidRequest</code> error.
     * </p>
     * 
     * @return The traffic state for the specified bucket or Amazon Web Services Region. </p>
     *         <p>
     *         A value of <code>0</code> indicates a passive state, which means that no new traffic will be routed to
     *         the Region.
     *         </p>
     *         <p>
     *         A value of <code>100</code> indicates an active state, which means that traffic will be routed to the
     *         specified Region.
     *         </p>
     *         <p>
     *         When the routing configuration for a Region is changed from active to passive, any in-progress operations
     *         (uploads, copies, deletes, and so on) to the formerly active Region will continue to run to until a final
     *         success or failure status is reached.
     *         </p>
     *         <p>
     *         If all Regions in the routing configuration are designated as passive, you'll receive an
     *         <code>InvalidRequest</code> error.
     */

    public Integer getTrafficDialPercentage() {
        return this.trafficDialPercentage;
    }

    /**
     * <p>
     * The traffic state for the specified bucket or Amazon Web Services Region.
     * </p>
     * <p>
     * A value of <code>0</code> indicates a passive state, which means that no new traffic will be routed to the
     * Region.
     * </p>
     * <p>
     * A value of <code>100</code> indicates an active state, which means that traffic will be routed to the specified
     * Region.
     * </p>
     * <p>
     * When the routing configuration for a Region is changed from active to passive, any in-progress operations
     * (uploads, copies, deletes, and so on) to the formerly active Region will continue to run to until a final success
     * or failure status is reached.
     * </p>
     * <p>
     * If all Regions in the routing configuration are designated as passive, you'll receive an
     * <code>InvalidRequest</code> error.
     * </p>
     * 
     * @param trafficDialPercentage
     *        The traffic state for the specified bucket or Amazon Web Services Region. </p>
     *        <p>
     *        A value of <code>0</code> indicates a passive state, which means that no new traffic will be routed to the
     *        Region.
     *        </p>
     *        <p>
     *        A value of <code>100</code> indicates an active state, which means that traffic will be routed to the
     *        specified Region.
     *        </p>
     *        <p>
     *        When the routing configuration for a Region is changed from active to passive, any in-progress operations
     *        (uploads, copies, deletes, and so on) to the formerly active Region will continue to run to until a final
     *        success or failure status is reached.
     *        </p>
     *        <p>
     *        If all Regions in the routing configuration are designated as passive, you'll receive an
     *        <code>InvalidRequest</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionAccessPointRoute withTrafficDialPercentage(Integer trafficDialPercentage) {
        setTrafficDialPercentage(trafficDialPercentage);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getTrafficDialPercentage() != null)
            sb.append("TrafficDialPercentage: ").append(getTrafficDialPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiRegionAccessPointRoute == false)
            return false;
        MultiRegionAccessPointRoute other = (MultiRegionAccessPointRoute) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getTrafficDialPercentage() == null ^ this.getTrafficDialPercentage() == null)
            return false;
        if (other.getTrafficDialPercentage() != null && other.getTrafficDialPercentage().equals(this.getTrafficDialPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getTrafficDialPercentage() == null) ? 0 : getTrafficDialPercentage().hashCode());
        return hashCode;
    }

    @Override
    public MultiRegionAccessPointRoute clone() {
        try {
            return (MultiRegionAccessPointRoute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
