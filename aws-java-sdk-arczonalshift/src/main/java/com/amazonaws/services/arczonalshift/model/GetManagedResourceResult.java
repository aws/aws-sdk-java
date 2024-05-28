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
     * An array of the autoshifts that are active for the resource.
     * </p>
     */
    private java.util.List<AutoshiftInResource> autoshifts;
    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The practice run configuration for zonal autoshift that's associated with the resource.
     * </p>
     */
    private PracticeRunConfiguration practiceRunConfiguration;
    /**
     * <p>
     * The status for zonal autoshift for a resource. When the autoshift status is <code>ENABLED</code>, Amazon Web
     * Services shifts traffic for a resource away from an Availability Zone, on your behalf, when Amazon Web Services
     * determines that there's an issue in the Availability Zone that could potentially affect customers.
     * </p>
     */
    private String zonalAutoshiftStatus;
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
     * An array of the autoshifts that are active for the resource.
     * </p>
     * 
     * @return An array of the autoshifts that are active for the resource.
     */

    public java.util.List<AutoshiftInResource> getAutoshifts() {
        return autoshifts;
    }

    /**
     * <p>
     * An array of the autoshifts that are active for the resource.
     * </p>
     * 
     * @param autoshifts
     *        An array of the autoshifts that are active for the resource.
     */

    public void setAutoshifts(java.util.Collection<AutoshiftInResource> autoshifts) {
        if (autoshifts == null) {
            this.autoshifts = null;
            return;
        }

        this.autoshifts = new java.util.ArrayList<AutoshiftInResource>(autoshifts);
    }

    /**
     * <p>
     * An array of the autoshifts that are active for the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoshifts(java.util.Collection)} or {@link #withAutoshifts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param autoshifts
     *        An array of the autoshifts that are active for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedResourceResult withAutoshifts(AutoshiftInResource... autoshifts) {
        if (this.autoshifts == null) {
            setAutoshifts(new java.util.ArrayList<AutoshiftInResource>(autoshifts.length));
        }
        for (AutoshiftInResource ele : autoshifts) {
            this.autoshifts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the autoshifts that are active for the resource.
     * </p>
     * 
     * @param autoshifts
     *        An array of the autoshifts that are active for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedResourceResult withAutoshifts(java.util.Collection<AutoshiftInResource> autoshifts) {
        setAutoshifts(autoshifts);
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
     * The practice run configuration for zonal autoshift that's associated with the resource.
     * </p>
     * 
     * @param practiceRunConfiguration
     *        The practice run configuration for zonal autoshift that's associated with the resource.
     */

    public void setPracticeRunConfiguration(PracticeRunConfiguration practiceRunConfiguration) {
        this.practiceRunConfiguration = practiceRunConfiguration;
    }

    /**
     * <p>
     * The practice run configuration for zonal autoshift that's associated with the resource.
     * </p>
     * 
     * @return The practice run configuration for zonal autoshift that's associated with the resource.
     */

    public PracticeRunConfiguration getPracticeRunConfiguration() {
        return this.practiceRunConfiguration;
    }

    /**
     * <p>
     * The practice run configuration for zonal autoshift that's associated with the resource.
     * </p>
     * 
     * @param practiceRunConfiguration
     *        The practice run configuration for zonal autoshift that's associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedResourceResult withPracticeRunConfiguration(PracticeRunConfiguration practiceRunConfiguration) {
        setPracticeRunConfiguration(practiceRunConfiguration);
        return this;
    }

    /**
     * <p>
     * The status for zonal autoshift for a resource. When the autoshift status is <code>ENABLED</code>, Amazon Web
     * Services shifts traffic for a resource away from an Availability Zone, on your behalf, when Amazon Web Services
     * determines that there's an issue in the Availability Zone that could potentially affect customers.
     * </p>
     * 
     * @param zonalAutoshiftStatus
     *        The status for zonal autoshift for a resource. When the autoshift status is <code>ENABLED</code>, Amazon
     *        Web Services shifts traffic for a resource away from an Availability Zone, on your behalf, when Amazon Web
     *        Services determines that there's an issue in the Availability Zone that could potentially affect
     *        customers.
     * @see ZonalAutoshiftStatus
     */

    public void setZonalAutoshiftStatus(String zonalAutoshiftStatus) {
        this.zonalAutoshiftStatus = zonalAutoshiftStatus;
    }

    /**
     * <p>
     * The status for zonal autoshift for a resource. When the autoshift status is <code>ENABLED</code>, Amazon Web
     * Services shifts traffic for a resource away from an Availability Zone, on your behalf, when Amazon Web Services
     * determines that there's an issue in the Availability Zone that could potentially affect customers.
     * </p>
     * 
     * @return The status for zonal autoshift for a resource. When the autoshift status is <code>ENABLED</code>, Amazon
     *         Web Services shifts traffic for a resource away from an Availability Zone, on your behalf, when Amazon
     *         Web Services determines that there's an issue in the Availability Zone that could potentially affect
     *         customers.
     * @see ZonalAutoshiftStatus
     */

    public String getZonalAutoshiftStatus() {
        return this.zonalAutoshiftStatus;
    }

    /**
     * <p>
     * The status for zonal autoshift for a resource. When the autoshift status is <code>ENABLED</code>, Amazon Web
     * Services shifts traffic for a resource away from an Availability Zone, on your behalf, when Amazon Web Services
     * determines that there's an issue in the Availability Zone that could potentially affect customers.
     * </p>
     * 
     * @param zonalAutoshiftStatus
     *        The status for zonal autoshift for a resource. When the autoshift status is <code>ENABLED</code>, Amazon
     *        Web Services shifts traffic for a resource away from an Availability Zone, on your behalf, when Amazon Web
     *        Services determines that there's an issue in the Availability Zone that could potentially affect
     *        customers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalAutoshiftStatus
     */

    public GetManagedResourceResult withZonalAutoshiftStatus(String zonalAutoshiftStatus) {
        setZonalAutoshiftStatus(zonalAutoshiftStatus);
        return this;
    }

    /**
     * <p>
     * The status for zonal autoshift for a resource. When the autoshift status is <code>ENABLED</code>, Amazon Web
     * Services shifts traffic for a resource away from an Availability Zone, on your behalf, when Amazon Web Services
     * determines that there's an issue in the Availability Zone that could potentially affect customers.
     * </p>
     * 
     * @param zonalAutoshiftStatus
     *        The status for zonal autoshift for a resource. When the autoshift status is <code>ENABLED</code>, Amazon
     *        Web Services shifts traffic for a resource away from an Availability Zone, on your behalf, when Amazon Web
     *        Services determines that there's an issue in the Availability Zone that could potentially affect
     *        customers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalAutoshiftStatus
     */

    public GetManagedResourceResult withZonalAutoshiftStatus(ZonalAutoshiftStatus zonalAutoshiftStatus) {
        this.zonalAutoshiftStatus = zonalAutoshiftStatus.toString();
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
        if (getAutoshifts() != null)
            sb.append("Autoshifts: ").append(getAutoshifts()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPracticeRunConfiguration() != null)
            sb.append("PracticeRunConfiguration: ").append(getPracticeRunConfiguration()).append(",");
        if (getZonalAutoshiftStatus() != null)
            sb.append("ZonalAutoshiftStatus: ").append(getZonalAutoshiftStatus()).append(",");
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
        if (other.getAutoshifts() == null ^ this.getAutoshifts() == null)
            return false;
        if (other.getAutoshifts() != null && other.getAutoshifts().equals(this.getAutoshifts()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPracticeRunConfiguration() == null ^ this.getPracticeRunConfiguration() == null)
            return false;
        if (other.getPracticeRunConfiguration() != null && other.getPracticeRunConfiguration().equals(this.getPracticeRunConfiguration()) == false)
            return false;
        if (other.getZonalAutoshiftStatus() == null ^ this.getZonalAutoshiftStatus() == null)
            return false;
        if (other.getZonalAutoshiftStatus() != null && other.getZonalAutoshiftStatus().equals(this.getZonalAutoshiftStatus()) == false)
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
        hashCode = prime * hashCode + ((getAutoshifts() == null) ? 0 : getAutoshifts().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPracticeRunConfiguration() == null) ? 0 : getPracticeRunConfiguration().hashCode());
        hashCode = prime * hashCode + ((getZonalAutoshiftStatus() == null) ? 0 : getZonalAutoshiftStatus().hashCode());
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
