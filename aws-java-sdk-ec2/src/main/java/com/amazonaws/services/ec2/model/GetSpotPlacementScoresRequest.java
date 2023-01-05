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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.GetSpotPlacementScoresRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSpotPlacementScoresRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetSpotPlacementScoresRequest> {

    /**
     * <p>
     * The instance types. We recommend that you specify at least three instance types. If you specify one or two
     * instance types, or specify variations of a single instance type (for example, an <code>m3.xlarge</code> with and
     * without instance storage), the returned placement score will always be low.
     * </p>
     * <p>
     * If you specify <code>InstanceTypes</code>, you can't specify <code>InstanceRequirementsWithMetadata</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceTypes;
    /**
     * <p>
     * The target capacity.
     * </p>
     */
    private Integer targetCapacity;
    /**
     * <p>
     * The unit for the target capacity.
     * </p>
     * <p>
     * Default: <code>units</code> (translates to number of instances)
     * </p>
     */
    private String targetCapacityUnitType;
    /**
     * <p>
     * Specify <code>true</code> so that the response returns a list of scored Availability Zones. Otherwise, the
     * response returns a list of scored Regions.
     * </p>
     * <p>
     * A list of scored Availability Zones is useful if you want to launch all of your Spot capacity into a single
     * Availability Zone.
     * </p>
     */
    private Boolean singleAvailabilityZone;
    /**
     * <p>
     * The Regions used to narrow down the list of Regions to be scored. Enter the Region code, for example,
     * <code>us-east-1</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> regionNames;
    /**
     * <p>
     * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance
     * types with those attributes.
     * </p>
     * <p>
     * If you specify <code>InstanceRequirementsWithMetadata</code>, you can't specify <code>InstanceTypes</code>.
     * </p>
     */
    private InstanceRequirementsWithMetadataRequest instanceRequirementsWithMetadata;
    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and&#x2028; 1000. The default
     * value is 1000. To retrieve the remaining results, make another call with&#x2028; the returned
     * <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The instance types. We recommend that you specify at least three instance types. If you specify one or two
     * instance types, or specify variations of a single instance type (for example, an <code>m3.xlarge</code> with and
     * without instance storage), the returned placement score will always be low.
     * </p>
     * <p>
     * If you specify <code>InstanceTypes</code>, you can't specify <code>InstanceRequirementsWithMetadata</code>.
     * </p>
     * 
     * @return The instance types. We recommend that you specify at least three instance types. If you specify one or
     *         two instance types, or specify variations of a single instance type (for example, an
     *         <code>m3.xlarge</code> with and without instance storage), the returned placement score will always be
     *         low. </p>
     *         <p>
     *         If you specify <code>InstanceTypes</code>, you can't specify
     *         <code>InstanceRequirementsWithMetadata</code>.
     */

    public java.util.List<String> getInstanceTypes() {
        if (instanceTypes == null) {
            instanceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceTypes;
    }

    /**
     * <p>
     * The instance types. We recommend that you specify at least three instance types. If you specify one or two
     * instance types, or specify variations of a single instance type (for example, an <code>m3.xlarge</code> with and
     * without instance storage), the returned placement score will always be low.
     * </p>
     * <p>
     * If you specify <code>InstanceTypes</code>, you can't specify <code>InstanceRequirementsWithMetadata</code>.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types. We recommend that you specify at least three instance types. If you specify one or two
     *        instance types, or specify variations of a single instance type (for example, an <code>m3.xlarge</code>
     *        with and without instance storage), the returned placement score will always be low. </p>
     *        <p>
     *        If you specify <code>InstanceTypes</code>, you can't specify <code>InstanceRequirementsWithMetadata</code>.
     */

    public void setInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
            return;
        }

        this.instanceTypes = new com.amazonaws.internal.SdkInternalList<String>(instanceTypes);
    }

    /**
     * <p>
     * The instance types. We recommend that you specify at least three instance types. If you specify one or two
     * instance types, or specify variations of a single instance type (for example, an <code>m3.xlarge</code> with and
     * without instance storage), the returned placement score will always be low.
     * </p>
     * <p>
     * If you specify <code>InstanceTypes</code>, you can't specify <code>InstanceRequirementsWithMetadata</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypes(java.util.Collection)} or {@link #withInstanceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types. We recommend that you specify at least three instance types. If you specify one or two
     *        instance types, or specify variations of a single instance type (for example, an <code>m3.xlarge</code>
     *        with and without instance storage), the returned placement score will always be low. </p>
     *        <p>
     *        If you specify <code>InstanceTypes</code>, you can't specify <code>InstanceRequirementsWithMetadata</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSpotPlacementScoresRequest withInstanceTypes(String... instanceTypes) {
        if (this.instanceTypes == null) {
            setInstanceTypes(new com.amazonaws.internal.SdkInternalList<String>(instanceTypes.length));
        }
        for (String ele : instanceTypes) {
            this.instanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance types. We recommend that you specify at least three instance types. If you specify one or two
     * instance types, or specify variations of a single instance type (for example, an <code>m3.xlarge</code> with and
     * without instance storage), the returned placement score will always be low.
     * </p>
     * <p>
     * If you specify <code>InstanceTypes</code>, you can't specify <code>InstanceRequirementsWithMetadata</code>.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types. We recommend that you specify at least three instance types. If you specify one or two
     *        instance types, or specify variations of a single instance type (for example, an <code>m3.xlarge</code>
     *        with and without instance storage), the returned placement score will always be low. </p>
     *        <p>
     *        If you specify <code>InstanceTypes</code>, you can't specify <code>InstanceRequirementsWithMetadata</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSpotPlacementScoresRequest withInstanceTypes(java.util.Collection<String> instanceTypes) {
        setInstanceTypes(instanceTypes);
        return this;
    }

    /**
     * <p>
     * The target capacity.
     * </p>
     * 
     * @param targetCapacity
     *        The target capacity.
     */

    public void setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
    }

    /**
     * <p>
     * The target capacity.
     * </p>
     * 
     * @return The target capacity.
     */

    public Integer getTargetCapacity() {
        return this.targetCapacity;
    }

    /**
     * <p>
     * The target capacity.
     * </p>
     * 
     * @param targetCapacity
     *        The target capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSpotPlacementScoresRequest withTargetCapacity(Integer targetCapacity) {
        setTargetCapacity(targetCapacity);
        return this;
    }

    /**
     * <p>
     * The unit for the target capacity.
     * </p>
     * <p>
     * Default: <code>units</code> (translates to number of instances)
     * </p>
     * 
     * @param targetCapacityUnitType
     *        The unit for the target capacity.</p>
     *        <p>
     *        Default: <code>units</code> (translates to number of instances)
     * @see TargetCapacityUnitType
     */

    public void setTargetCapacityUnitType(String targetCapacityUnitType) {
        this.targetCapacityUnitType = targetCapacityUnitType;
    }

    /**
     * <p>
     * The unit for the target capacity.
     * </p>
     * <p>
     * Default: <code>units</code> (translates to number of instances)
     * </p>
     * 
     * @return The unit for the target capacity.</p>
     *         <p>
     *         Default: <code>units</code> (translates to number of instances)
     * @see TargetCapacityUnitType
     */

    public String getTargetCapacityUnitType() {
        return this.targetCapacityUnitType;
    }

    /**
     * <p>
     * The unit for the target capacity.
     * </p>
     * <p>
     * Default: <code>units</code> (translates to number of instances)
     * </p>
     * 
     * @param targetCapacityUnitType
     *        The unit for the target capacity.</p>
     *        <p>
     *        Default: <code>units</code> (translates to number of instances)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetCapacityUnitType
     */

    public GetSpotPlacementScoresRequest withTargetCapacityUnitType(String targetCapacityUnitType) {
        setTargetCapacityUnitType(targetCapacityUnitType);
        return this;
    }

    /**
     * <p>
     * The unit for the target capacity.
     * </p>
     * <p>
     * Default: <code>units</code> (translates to number of instances)
     * </p>
     * 
     * @param targetCapacityUnitType
     *        The unit for the target capacity.</p>
     *        <p>
     *        Default: <code>units</code> (translates to number of instances)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetCapacityUnitType
     */

    public GetSpotPlacementScoresRequest withTargetCapacityUnitType(TargetCapacityUnitType targetCapacityUnitType) {
        this.targetCapacityUnitType = targetCapacityUnitType.toString();
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> so that the response returns a list of scored Availability Zones. Otherwise, the
     * response returns a list of scored Regions.
     * </p>
     * <p>
     * A list of scored Availability Zones is useful if you want to launch all of your Spot capacity into a single
     * Availability Zone.
     * </p>
     * 
     * @param singleAvailabilityZone
     *        Specify <code>true</code> so that the response returns a list of scored Availability Zones. Otherwise, the
     *        response returns a list of scored Regions.</p>
     *        <p>
     *        A list of scored Availability Zones is useful if you want to launch all of your Spot capacity into a
     *        single Availability Zone.
     */

    public void setSingleAvailabilityZone(Boolean singleAvailabilityZone) {
        this.singleAvailabilityZone = singleAvailabilityZone;
    }

    /**
     * <p>
     * Specify <code>true</code> so that the response returns a list of scored Availability Zones. Otherwise, the
     * response returns a list of scored Regions.
     * </p>
     * <p>
     * A list of scored Availability Zones is useful if you want to launch all of your Spot capacity into a single
     * Availability Zone.
     * </p>
     * 
     * @return Specify <code>true</code> so that the response returns a list of scored Availability Zones. Otherwise,
     *         the response returns a list of scored Regions.</p>
     *         <p>
     *         A list of scored Availability Zones is useful if you want to launch all of your Spot capacity into a
     *         single Availability Zone.
     */

    public Boolean getSingleAvailabilityZone() {
        return this.singleAvailabilityZone;
    }

    /**
     * <p>
     * Specify <code>true</code> so that the response returns a list of scored Availability Zones. Otherwise, the
     * response returns a list of scored Regions.
     * </p>
     * <p>
     * A list of scored Availability Zones is useful if you want to launch all of your Spot capacity into a single
     * Availability Zone.
     * </p>
     * 
     * @param singleAvailabilityZone
     *        Specify <code>true</code> so that the response returns a list of scored Availability Zones. Otherwise, the
     *        response returns a list of scored Regions.</p>
     *        <p>
     *        A list of scored Availability Zones is useful if you want to launch all of your Spot capacity into a
     *        single Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSpotPlacementScoresRequest withSingleAvailabilityZone(Boolean singleAvailabilityZone) {
        setSingleAvailabilityZone(singleAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> so that the response returns a list of scored Availability Zones. Otherwise, the
     * response returns a list of scored Regions.
     * </p>
     * <p>
     * A list of scored Availability Zones is useful if you want to launch all of your Spot capacity into a single
     * Availability Zone.
     * </p>
     * 
     * @return Specify <code>true</code> so that the response returns a list of scored Availability Zones. Otherwise,
     *         the response returns a list of scored Regions.</p>
     *         <p>
     *         A list of scored Availability Zones is useful if you want to launch all of your Spot capacity into a
     *         single Availability Zone.
     */

    public Boolean isSingleAvailabilityZone() {
        return this.singleAvailabilityZone;
    }

    /**
     * <p>
     * The Regions used to narrow down the list of Regions to be scored. Enter the Region code, for example,
     * <code>us-east-1</code>.
     * </p>
     * 
     * @return The Regions used to narrow down the list of Regions to be scored. Enter the Region code, for example,
     *         <code>us-east-1</code>.
     */

    public java.util.List<String> getRegionNames() {
        if (regionNames == null) {
            regionNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return regionNames;
    }

    /**
     * <p>
     * The Regions used to narrow down the list of Regions to be scored. Enter the Region code, for example,
     * <code>us-east-1</code>.
     * </p>
     * 
     * @param regionNames
     *        The Regions used to narrow down the list of Regions to be scored. Enter the Region code, for example,
     *        <code>us-east-1</code>.
     */

    public void setRegionNames(java.util.Collection<String> regionNames) {
        if (regionNames == null) {
            this.regionNames = null;
            return;
        }

        this.regionNames = new com.amazonaws.internal.SdkInternalList<String>(regionNames);
    }

    /**
     * <p>
     * The Regions used to narrow down the list of Regions to be scored. Enter the Region code, for example,
     * <code>us-east-1</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegionNames(java.util.Collection)} or {@link #withRegionNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param regionNames
     *        The Regions used to narrow down the list of Regions to be scored. Enter the Region code, for example,
     *        <code>us-east-1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSpotPlacementScoresRequest withRegionNames(String... regionNames) {
        if (this.regionNames == null) {
            setRegionNames(new com.amazonaws.internal.SdkInternalList<String>(regionNames.length));
        }
        for (String ele : regionNames) {
            this.regionNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Regions used to narrow down the list of Regions to be scored. Enter the Region code, for example,
     * <code>us-east-1</code>.
     * </p>
     * 
     * @param regionNames
     *        The Regions used to narrow down the list of Regions to be scored. Enter the Region code, for example,
     *        <code>us-east-1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSpotPlacementScoresRequest withRegionNames(java.util.Collection<String> regionNames) {
        setRegionNames(regionNames);
        return this;
    }

    /**
     * <p>
     * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance
     * types with those attributes.
     * </p>
     * <p>
     * If you specify <code>InstanceRequirementsWithMetadata</code>, you can't specify <code>InstanceTypes</code>.
     * </p>
     * 
     * @param instanceRequirementsWithMetadata
     *        The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify
     *        instance types with those attributes.</p>
     *        <p>
     *        If you specify <code>InstanceRequirementsWithMetadata</code>, you can't specify <code>InstanceTypes</code>.
     */

    public void setInstanceRequirementsWithMetadata(InstanceRequirementsWithMetadataRequest instanceRequirementsWithMetadata) {
        this.instanceRequirementsWithMetadata = instanceRequirementsWithMetadata;
    }

    /**
     * <p>
     * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance
     * types with those attributes.
     * </p>
     * <p>
     * If you specify <code>InstanceRequirementsWithMetadata</code>, you can't specify <code>InstanceTypes</code>.
     * </p>
     * 
     * @return The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify
     *         instance types with those attributes.</p>
     *         <p>
     *         If you specify <code>InstanceRequirementsWithMetadata</code>, you can't specify
     *         <code>InstanceTypes</code>.
     */

    public InstanceRequirementsWithMetadataRequest getInstanceRequirementsWithMetadata() {
        return this.instanceRequirementsWithMetadata;
    }

    /**
     * <p>
     * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance
     * types with those attributes.
     * </p>
     * <p>
     * If you specify <code>InstanceRequirementsWithMetadata</code>, you can't specify <code>InstanceTypes</code>.
     * </p>
     * 
     * @param instanceRequirementsWithMetadata
     *        The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify
     *        instance types with those attributes.</p>
     *        <p>
     *        If you specify <code>InstanceRequirementsWithMetadata</code>, you can't specify <code>InstanceTypes</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSpotPlacementScoresRequest withInstanceRequirementsWithMetadata(InstanceRequirementsWithMetadataRequest instanceRequirementsWithMetadata) {
        setInstanceRequirementsWithMetadata(instanceRequirementsWithMetadata);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and&#x2028; 1000. The default
     * value is 1000. To retrieve the remaining results, make another call with&#x2028; the returned
     * <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. Specify a value between 1 and&#x2028; 1000. The
     *        default value is 1000. To retrieve the remaining results, make another call with&#x2028; the returned
     *        <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and&#x2028; 1000. The default
     * value is 1000. To retrieve the remaining results, make another call with&#x2028; the returned
     * <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. Specify a value between 1 and&#x2028; 1000. The
     *         default value is 1000. To retrieve the remaining results, make another call with&#x2028; the returned
     *         <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and&#x2028; 1000. The default
     * value is 1000. To retrieve the remaining results, make another call with&#x2028; the returned
     * <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. Specify a value between 1 and&#x2028; 1000. The
     *        default value is 1000. To retrieve the remaining results, make another call with&#x2028; the returned
     *        <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSpotPlacementScoresRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSpotPlacementScoresRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetSpotPlacementScoresRequest> getDryRunRequest() {
        Request<GetSpotPlacementScoresRequest> request = new GetSpotPlacementScoresRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getInstanceTypes() != null)
            sb.append("InstanceTypes: ").append(getInstanceTypes()).append(",");
        if (getTargetCapacity() != null)
            sb.append("TargetCapacity: ").append(getTargetCapacity()).append(",");
        if (getTargetCapacityUnitType() != null)
            sb.append("TargetCapacityUnitType: ").append(getTargetCapacityUnitType()).append(",");
        if (getSingleAvailabilityZone() != null)
            sb.append("SingleAvailabilityZone: ").append(getSingleAvailabilityZone()).append(",");
        if (getRegionNames() != null)
            sb.append("RegionNames: ").append(getRegionNames()).append(",");
        if (getInstanceRequirementsWithMetadata() != null)
            sb.append("InstanceRequirementsWithMetadata: ").append(getInstanceRequirementsWithMetadata()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSpotPlacementScoresRequest == false)
            return false;
        GetSpotPlacementScoresRequest other = (GetSpotPlacementScoresRequest) obj;
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null)
            return false;
        if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false)
            return false;
        if (other.getTargetCapacity() == null ^ this.getTargetCapacity() == null)
            return false;
        if (other.getTargetCapacity() != null && other.getTargetCapacity().equals(this.getTargetCapacity()) == false)
            return false;
        if (other.getTargetCapacityUnitType() == null ^ this.getTargetCapacityUnitType() == null)
            return false;
        if (other.getTargetCapacityUnitType() != null && other.getTargetCapacityUnitType().equals(this.getTargetCapacityUnitType()) == false)
            return false;
        if (other.getSingleAvailabilityZone() == null ^ this.getSingleAvailabilityZone() == null)
            return false;
        if (other.getSingleAvailabilityZone() != null && other.getSingleAvailabilityZone().equals(this.getSingleAvailabilityZone()) == false)
            return false;
        if (other.getRegionNames() == null ^ this.getRegionNames() == null)
            return false;
        if (other.getRegionNames() != null && other.getRegionNames().equals(this.getRegionNames()) == false)
            return false;
        if (other.getInstanceRequirementsWithMetadata() == null ^ this.getInstanceRequirementsWithMetadata() == null)
            return false;
        if (other.getInstanceRequirementsWithMetadata() != null
                && other.getInstanceRequirementsWithMetadata().equals(this.getInstanceRequirementsWithMetadata()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getTargetCapacity() == null) ? 0 : getTargetCapacity().hashCode());
        hashCode = prime * hashCode + ((getTargetCapacityUnitType() == null) ? 0 : getTargetCapacityUnitType().hashCode());
        hashCode = prime * hashCode + ((getSingleAvailabilityZone() == null) ? 0 : getSingleAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getRegionNames() == null) ? 0 : getRegionNames().hashCode());
        hashCode = prime * hashCode + ((getInstanceRequirementsWithMetadata() == null) ? 0 : getInstanceRequirementsWithMetadata().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSpotPlacementScoresRequest clone() {
        return (GetSpotPlacementScoresRequest) super.clone();
    }
}
