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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * (Resource record sets only): A complex type that lets you specify where your resources are located. Only one of
 * <code>LocalZoneGroup</code>, <code>Coordinates</code>, or <code>Amazon Web ServicesRegion</code> is allowed per
 * request at a time.
 * </p>
 * <p>
 * For more information about geoproximity routing, see <a
 * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy-geoproximity.html">Geoproximity
 * routing</a> in the <i>Amazon Route 53 Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GeoProximityLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeoProximityLocation implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services Region the resource you are directing DNS traffic to, is in.
     * </p>
     */
    private String aWSRegion;
    /**
     * <p>
     * Specifies an Amazon Web Services Local Zone Group.
     * </p>
     * <p>
     * A local Zone Group is usually the Local Zone code without the ending character. For example, if the Local Zone is
     * <code>us-east-1-bue-1a</code> the Local Zone Group is <code>us-east-1-bue-1</code>.
     * </p>
     * <p>
     * You can identify the Local Zones Group for a specific Local Zone by using the <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-availability-zones.html"
     * >describe-availability-zones</a> CLI command:
     * </p>
     * <p>
     * This command returns: <code>"GroupName": "us-west-2-den-1"</code>, specifying that the Local Zone
     * <code>us-west-2-den-1a</code> belongs to the Local Zone Group <code>us-west-2-den-1</code>.
     * </p>
     */
    private String localZoneGroup;
    /**
     * <p>
     * Contains the longitude and latitude for a geographic region.
     * </p>
     */
    private Coordinates coordinates;
    /**
     * <p>
     * The bias increases or decreases the size of the geographic region from which Route 53 routes traffic to a
     * resource.
     * </p>
     * <p>
     * To use <code>Bias</code> to change the size of the geographic region, specify the applicable value for the bias:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To expand the size of the geographic region from which Route 53 routes traffic to a resource, specify a positive
     * integer from 1 to 99 for the bias. Route 53 shrinks the size of adjacent regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * To shrink the size of the geographic region from which Route 53 routes traffic to a resource, specify a negative
     * bias of -1 to -99. Route 53 expands the size of adjacent regions.
     * </p>
     * </li>
     * </ul>
     */
    private Integer bias;

    /**
     * <p>
     * The Amazon Web Services Region the resource you are directing DNS traffic to, is in.
     * </p>
     * 
     * @param aWSRegion
     *        The Amazon Web Services Region the resource you are directing DNS traffic to, is in.
     */

    public void setAWSRegion(String aWSRegion) {
        this.aWSRegion = aWSRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region the resource you are directing DNS traffic to, is in.
     * </p>
     * 
     * @return The Amazon Web Services Region the resource you are directing DNS traffic to, is in.
     */

    public String getAWSRegion() {
        return this.aWSRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region the resource you are directing DNS traffic to, is in.
     * </p>
     * 
     * @param aWSRegion
     *        The Amazon Web Services Region the resource you are directing DNS traffic to, is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoProximityLocation withAWSRegion(String aWSRegion) {
        setAWSRegion(aWSRegion);
        return this;
    }

    /**
     * <p>
     * Specifies an Amazon Web Services Local Zone Group.
     * </p>
     * <p>
     * A local Zone Group is usually the Local Zone code without the ending character. For example, if the Local Zone is
     * <code>us-east-1-bue-1a</code> the Local Zone Group is <code>us-east-1-bue-1</code>.
     * </p>
     * <p>
     * You can identify the Local Zones Group for a specific Local Zone by using the <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-availability-zones.html"
     * >describe-availability-zones</a> CLI command:
     * </p>
     * <p>
     * This command returns: <code>"GroupName": "us-west-2-den-1"</code>, specifying that the Local Zone
     * <code>us-west-2-den-1a</code> belongs to the Local Zone Group <code>us-west-2-den-1</code>.
     * </p>
     * 
     * @param localZoneGroup
     *        Specifies an Amazon Web Services Local Zone Group. </p>
     *        <p>
     *        A local Zone Group is usually the Local Zone code without the ending character. For example, if the Local
     *        Zone is <code>us-east-1-bue-1a</code> the Local Zone Group is <code>us-east-1-bue-1</code>.
     *        </p>
     *        <p>
     *        You can identify the Local Zones Group for a specific Local Zone by using the <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-availability-zones.html"
     *        >describe-availability-zones</a> CLI command:
     *        </p>
     *        <p>
     *        This command returns: <code>"GroupName": "us-west-2-den-1"</code>, specifying that the Local Zone
     *        <code>us-west-2-den-1a</code> belongs to the Local Zone Group <code>us-west-2-den-1</code>.
     */

    public void setLocalZoneGroup(String localZoneGroup) {
        this.localZoneGroup = localZoneGroup;
    }

    /**
     * <p>
     * Specifies an Amazon Web Services Local Zone Group.
     * </p>
     * <p>
     * A local Zone Group is usually the Local Zone code without the ending character. For example, if the Local Zone is
     * <code>us-east-1-bue-1a</code> the Local Zone Group is <code>us-east-1-bue-1</code>.
     * </p>
     * <p>
     * You can identify the Local Zones Group for a specific Local Zone by using the <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-availability-zones.html"
     * >describe-availability-zones</a> CLI command:
     * </p>
     * <p>
     * This command returns: <code>"GroupName": "us-west-2-den-1"</code>, specifying that the Local Zone
     * <code>us-west-2-den-1a</code> belongs to the Local Zone Group <code>us-west-2-den-1</code>.
     * </p>
     * 
     * @return Specifies an Amazon Web Services Local Zone Group. </p>
     *         <p>
     *         A local Zone Group is usually the Local Zone code without the ending character. For example, if the Local
     *         Zone is <code>us-east-1-bue-1a</code> the Local Zone Group is <code>us-east-1-bue-1</code>.
     *         </p>
     *         <p>
     *         You can identify the Local Zones Group for a specific Local Zone by using the <a
     *         href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-availability-zones.html"
     *         >describe-availability-zones</a> CLI command:
     *         </p>
     *         <p>
     *         This command returns: <code>"GroupName": "us-west-2-den-1"</code>, specifying that the Local Zone
     *         <code>us-west-2-den-1a</code> belongs to the Local Zone Group <code>us-west-2-den-1</code>.
     */

    public String getLocalZoneGroup() {
        return this.localZoneGroup;
    }

    /**
     * <p>
     * Specifies an Amazon Web Services Local Zone Group.
     * </p>
     * <p>
     * A local Zone Group is usually the Local Zone code without the ending character. For example, if the Local Zone is
     * <code>us-east-1-bue-1a</code> the Local Zone Group is <code>us-east-1-bue-1</code>.
     * </p>
     * <p>
     * You can identify the Local Zones Group for a specific Local Zone by using the <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-availability-zones.html"
     * >describe-availability-zones</a> CLI command:
     * </p>
     * <p>
     * This command returns: <code>"GroupName": "us-west-2-den-1"</code>, specifying that the Local Zone
     * <code>us-west-2-den-1a</code> belongs to the Local Zone Group <code>us-west-2-den-1</code>.
     * </p>
     * 
     * @param localZoneGroup
     *        Specifies an Amazon Web Services Local Zone Group. </p>
     *        <p>
     *        A local Zone Group is usually the Local Zone code without the ending character. For example, if the Local
     *        Zone is <code>us-east-1-bue-1a</code> the Local Zone Group is <code>us-east-1-bue-1</code>.
     *        </p>
     *        <p>
     *        You can identify the Local Zones Group for a specific Local Zone by using the <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-availability-zones.html"
     *        >describe-availability-zones</a> CLI command:
     *        </p>
     *        <p>
     *        This command returns: <code>"GroupName": "us-west-2-den-1"</code>, specifying that the Local Zone
     *        <code>us-west-2-den-1a</code> belongs to the Local Zone Group <code>us-west-2-den-1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoProximityLocation withLocalZoneGroup(String localZoneGroup) {
        setLocalZoneGroup(localZoneGroup);
        return this;
    }

    /**
     * <p>
     * Contains the longitude and latitude for a geographic region.
     * </p>
     * 
     * @param coordinates
     *        Contains the longitude and latitude for a geographic region.
     */

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * <p>
     * Contains the longitude and latitude for a geographic region.
     * </p>
     * 
     * @return Contains the longitude and latitude for a geographic region.
     */

    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    /**
     * <p>
     * Contains the longitude and latitude for a geographic region.
     * </p>
     * 
     * @param coordinates
     *        Contains the longitude and latitude for a geographic region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoProximityLocation withCoordinates(Coordinates coordinates) {
        setCoordinates(coordinates);
        return this;
    }

    /**
     * <p>
     * The bias increases or decreases the size of the geographic region from which Route 53 routes traffic to a
     * resource.
     * </p>
     * <p>
     * To use <code>Bias</code> to change the size of the geographic region, specify the applicable value for the bias:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To expand the size of the geographic region from which Route 53 routes traffic to a resource, specify a positive
     * integer from 1 to 99 for the bias. Route 53 shrinks the size of adjacent regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * To shrink the size of the geographic region from which Route 53 routes traffic to a resource, specify a negative
     * bias of -1 to -99. Route 53 expands the size of adjacent regions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bias
     *        The bias increases or decreases the size of the geographic region from which Route 53 routes traffic to a
     *        resource. </p>
     *        <p>
     *        To use <code>Bias</code> to change the size of the geographic region, specify the applicable value for the
     *        bias:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To expand the size of the geographic region from which Route 53 routes traffic to a resource, specify a
     *        positive integer from 1 to 99 for the bias. Route 53 shrinks the size of adjacent regions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To shrink the size of the geographic region from which Route 53 routes traffic to a resource, specify a
     *        negative bias of -1 to -99. Route 53 expands the size of adjacent regions.
     *        </p>
     *        </li>
     */

    public void setBias(Integer bias) {
        this.bias = bias;
    }

    /**
     * <p>
     * The bias increases or decreases the size of the geographic region from which Route 53 routes traffic to a
     * resource.
     * </p>
     * <p>
     * To use <code>Bias</code> to change the size of the geographic region, specify the applicable value for the bias:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To expand the size of the geographic region from which Route 53 routes traffic to a resource, specify a positive
     * integer from 1 to 99 for the bias. Route 53 shrinks the size of adjacent regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * To shrink the size of the geographic region from which Route 53 routes traffic to a resource, specify a negative
     * bias of -1 to -99. Route 53 expands the size of adjacent regions.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The bias increases or decreases the size of the geographic region from which Route 53 routes traffic to a
     *         resource. </p>
     *         <p>
     *         To use <code>Bias</code> to change the size of the geographic region, specify the applicable value for
     *         the bias:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To expand the size of the geographic region from which Route 53 routes traffic to a resource, specify a
     *         positive integer from 1 to 99 for the bias. Route 53 shrinks the size of adjacent regions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To shrink the size of the geographic region from which Route 53 routes traffic to a resource, specify a
     *         negative bias of -1 to -99. Route 53 expands the size of adjacent regions.
     *         </p>
     *         </li>
     */

    public Integer getBias() {
        return this.bias;
    }

    /**
     * <p>
     * The bias increases or decreases the size of the geographic region from which Route 53 routes traffic to a
     * resource.
     * </p>
     * <p>
     * To use <code>Bias</code> to change the size of the geographic region, specify the applicable value for the bias:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To expand the size of the geographic region from which Route 53 routes traffic to a resource, specify a positive
     * integer from 1 to 99 for the bias. Route 53 shrinks the size of adjacent regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * To shrink the size of the geographic region from which Route 53 routes traffic to a resource, specify a negative
     * bias of -1 to -99. Route 53 expands the size of adjacent regions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bias
     *        The bias increases or decreases the size of the geographic region from which Route 53 routes traffic to a
     *        resource. </p>
     *        <p>
     *        To use <code>Bias</code> to change the size of the geographic region, specify the applicable value for the
     *        bias:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To expand the size of the geographic region from which Route 53 routes traffic to a resource, specify a
     *        positive integer from 1 to 99 for the bias. Route 53 shrinks the size of adjacent regions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To shrink the size of the geographic region from which Route 53 routes traffic to a resource, specify a
     *        negative bias of -1 to -99. Route 53 expands the size of adjacent regions.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoProximityLocation withBias(Integer bias) {
        setBias(bias);
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
        if (getAWSRegion() != null)
            sb.append("AWSRegion: ").append(getAWSRegion()).append(",");
        if (getLocalZoneGroup() != null)
            sb.append("LocalZoneGroup: ").append(getLocalZoneGroup()).append(",");
        if (getCoordinates() != null)
            sb.append("Coordinates: ").append(getCoordinates()).append(",");
        if (getBias() != null)
            sb.append("Bias: ").append(getBias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoProximityLocation == false)
            return false;
        GeoProximityLocation other = (GeoProximityLocation) obj;
        if (other.getAWSRegion() == null ^ this.getAWSRegion() == null)
            return false;
        if (other.getAWSRegion() != null && other.getAWSRegion().equals(this.getAWSRegion()) == false)
            return false;
        if (other.getLocalZoneGroup() == null ^ this.getLocalZoneGroup() == null)
            return false;
        if (other.getLocalZoneGroup() != null && other.getLocalZoneGroup().equals(this.getLocalZoneGroup()) == false)
            return false;
        if (other.getCoordinates() == null ^ this.getCoordinates() == null)
            return false;
        if (other.getCoordinates() != null && other.getCoordinates().equals(this.getCoordinates()) == false)
            return false;
        if (other.getBias() == null ^ this.getBias() == null)
            return false;
        if (other.getBias() != null && other.getBias().equals(this.getBias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAWSRegion() == null) ? 0 : getAWSRegion().hashCode());
        hashCode = prime * hashCode + ((getLocalZoneGroup() == null) ? 0 : getLocalZoneGroup().hashCode());
        hashCode = prime * hashCode + ((getCoordinates() == null) ? 0 : getCoordinates().hashCode());
        hashCode = prime * hashCode + ((getBias() == null) ? 0 : getBias().hashCode());
        return hashCode;
    }

    @Override
    public GeoProximityLocation clone() {
        try {
            return (GeoProximityLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
