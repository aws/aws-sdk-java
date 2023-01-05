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
package com.amazonaws.services.arczonalshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/GetManagedResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetManagedResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A collection of key-value pairs that indicate whether resources are active in Availability Zones or not. The key
     * name is the Availability Zone where the resource is deployed. The value is 1 or 0.
     * </p>
     */
    private java.util.Map<String, Float> appliedWeights;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The zonal shifts that are currently active for a resource.
     * </p>
     */
    private java.util.List<ZonalShiftInResource> zonalShifts;

    /**
     * <p>
     * A collection of key-value pairs that indicate whether resources are active in Availability Zones or not. The key
     * name is the Availability Zone where the resource is deployed. The value is 1 or 0.
     * </p>
     * 
     * @return A collection of key-value pairs that indicate whether resources are active in Availability Zones or not.
     *         The key name is the Availability Zone where the resource is deployed. The value is 1 or 0.
     */

    public java.util.Map<String, Float> getAppliedWeights() {
        return appliedWeights;
    }

    /**
     * <p>
     * A collection of key-value pairs that indicate whether resources are active in Availability Zones or not. The key
     * name is the Availability Zone where the resource is deployed. The value is 1 or 0.
     * </p>
     * 
     * @param appliedWeights
     *        A collection of key-value pairs that indicate whether resources are active in Availability Zones or not.
     *        The key name is the Availability Zone where the resource is deployed. The value is 1 or 0.
     */

    public void setAppliedWeights(java.util.Map<String, Float> appliedWeights) {
        this.appliedWeights = appliedWeights;
    }

    /**
     * <p>
     * A collection of key-value pairs that indicate whether resources are active in Availability Zones or not. The key
     * name is the Availability Zone where the resource is deployed. The value is 1 or 0.
     * </p>
     * 
     * @param appliedWeights
     *        A collection of key-value pairs that indicate whether resources are active in Availability Zones or not.
     *        The key name is the Availability Zone where the resource is deployed. The value is 1 or 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedResourceResult withAppliedWeights(java.util.Map<String, Float> appliedWeights) {
        setAppliedWeights(appliedWeights);
        return this;
    }

    /**
     * Add a single AppliedWeights entry
     *
     * @see GetManagedResourceResult#withAppliedWeights
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedResourceResult addAppliedWeightsEntry(String key, Float value) {
        if (null == this.appliedWeights) {
            this.appliedWeights = new java.util.HashMap<String, Float>();
        }
        if (this.appliedWeights.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.appliedWeights.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AppliedWeights.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedResourceResult clearAppliedWeightsEntries() {
        this.appliedWeights = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedResourceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedResourceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The zonal shifts that are currently active for a resource.
     * </p>
     * 
     * @return The zonal shifts that are currently active for a resource.
     */

    public java.util.List<ZonalShiftInResource> getZonalShifts() {
        return zonalShifts;
    }

    /**
     * <p>
     * The zonal shifts that are currently active for a resource.
     * </p>
     * 
     * @param zonalShifts
     *        The zonal shifts that are currently active for a resource.
     */

    public void setZonalShifts(java.util.Collection<ZonalShiftInResource> zonalShifts) {
        if (zonalShifts == null) {
            this.zonalShifts = null;
            return;
        }

        this.zonalShifts = new java.util.ArrayList<ZonalShiftInResource>(zonalShifts);
    }

    /**
     * <p>
     * The zonal shifts that are currently active for a resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setZonalShifts(java.util.Collection)} or {@link #withZonalShifts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param zonalShifts
     *        The zonal shifts that are currently active for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedResourceResult withZonalShifts(ZonalShiftInResource... zonalShifts) {
        if (this.zonalShifts == null) {
            setZonalShifts(new java.util.ArrayList<ZonalShiftInResource>(zonalShifts.length));
        }
        for (ZonalShiftInResource ele : zonalShifts) {
            this.zonalShifts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The zonal shifts that are currently active for a resource.
     * </p>
     * 
     * @param zonalShifts
     *        The zonal shifts that are currently active for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedResourceResult withZonalShifts(java.util.Collection<ZonalShiftInResource> zonalShifts) {
        setZonalShifts(zonalShifts);
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
        if (getAppliedWeights() != null)
            sb.append("AppliedWeights: ").append(getAppliedWeights()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getZonalShifts() != null)
            sb.append("ZonalShifts: ").append(getZonalShifts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetManagedResourceResult == false)
            return false;
        GetManagedResourceResult other = (GetManagedResourceResult) obj;
        if (other.getAppliedWeights() == null ^ this.getAppliedWeights() == null)
            return false;
        if (other.getAppliedWeights() != null && other.getAppliedWeights().equals(this.getAppliedWeights()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getZonalShifts() == null ^ this.getZonalShifts() == null)
            return false;
        if (other.getZonalShifts() != null && other.getZonalShifts().equals(this.getZonalShifts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppliedWeights() == null) ? 0 : getAppliedWeights().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getZonalShifts() == null) ? 0 : getZonalShifts().hashCode());
        return hashCode;
    }

    @Override
    public GetManagedResourceResult clone() {
        try {
            return (GetManagedResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
