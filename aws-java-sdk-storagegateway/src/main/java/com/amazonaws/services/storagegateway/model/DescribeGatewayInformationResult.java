/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeGatewayInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGatewayInformationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon
     * Resource Name (ARN), which you use as input for other operations.
     * </p>
     */
    private String gatewayId;
    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     */
    private String gatewayName;
    /**
     * <p>
     * A value that indicates the time zone configured for the gateway.
     * </p>
     */
    private String gatewayTimezone;
    /**
     * <p>
     * A value that indicates the operating state of the gateway.
     * </p>
     */
    private String gatewayState;
    /**
     * <p>
     * A <a>NetworkInterface</a> array that contains descriptions of the gateway network interfaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NetworkInterface> gatewayNetworkInterfaces;
    /**
     * <p>
     * The type of the gateway.
     * </p>
     */
    private String gatewayType;
    /**
     * <p>
     * The date on which an update to the gateway is available. This date is in the time zone of the gateway. If the
     * gateway is not available for an update this field is not returned in the response.
     * </p>
     */
    private String nextUpdateAvailabilityDate;
    /**
     * <p>
     * The date on which the last software update was applied to the gateway. If the gateway has never been updated,
     * this field does not return a value in the response.
     * </p>
     */
    private String lastSoftwareUpdate;
    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     */
    private String ec2InstanceId;
    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     */
    private String ec2InstanceRegion;
    /**
     * <p>
     * A list of up to 50 tags assigned to the gateway, sorted alphabetically by key name. Each tag is a key-value pair.
     * For a gateway with more than 10 tags assigned, you can view all tags using the <code>ListTagsForResource</code>
     * API operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayInformationResult withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon
     * Resource Name (ARN), which you use as input for other operations.
     * </p>
     * 
     * @param gatewayId
     *        The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway
     *        Amazon Resource Name (ARN), which you use as input for other operations.
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon
     * Resource Name (ARN), which you use as input for other operations.
     * </p>
     * 
     * @return The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway
     *         Amazon Resource Name (ARN), which you use as input for other operations.
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon
     * Resource Name (ARN), which you use as input for other operations.
     * </p>
     * 
     * @param gatewayId
     *        The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway
     *        Amazon Resource Name (ARN), which you use as input for other operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayInformationResult withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     * 
     * @param gatewayName
     *        The name you configured for your gateway.
     */

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     * 
     * @return The name you configured for your gateway.
     */

    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     * 
     * @param gatewayName
     *        The name you configured for your gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayInformationResult withGatewayName(String gatewayName) {
        setGatewayName(gatewayName);
        return this;
    }

    /**
     * <p>
     * A value that indicates the time zone configured for the gateway.
     * </p>
     * 
     * @param gatewayTimezone
     *        A value that indicates the time zone configured for the gateway.
     */

    public void setGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
    }

    /**
     * <p>
     * A value that indicates the time zone configured for the gateway.
     * </p>
     * 
     * @return A value that indicates the time zone configured for the gateway.
     */

    public String getGatewayTimezone() {
        return this.gatewayTimezone;
    }

    /**
     * <p>
     * A value that indicates the time zone configured for the gateway.
     * </p>
     * 
     * @param gatewayTimezone
     *        A value that indicates the time zone configured for the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayInformationResult withGatewayTimezone(String gatewayTimezone) {
        setGatewayTimezone(gatewayTimezone);
        return this;
    }

    /**
     * <p>
     * A value that indicates the operating state of the gateway.
     * </p>
     * 
     * @param gatewayState
     *        A value that indicates the operating state of the gateway.
     */

    public void setGatewayState(String gatewayState) {
        this.gatewayState = gatewayState;
    }

    /**
     * <p>
     * A value that indicates the operating state of the gateway.
     * </p>
     * 
     * @return A value that indicates the operating state of the gateway.
     */

    public String getGatewayState() {
        return this.gatewayState;
    }

    /**
     * <p>
     * A value that indicates the operating state of the gateway.
     * </p>
     * 
     * @param gatewayState
     *        A value that indicates the operating state of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayInformationResult withGatewayState(String gatewayState) {
        setGatewayState(gatewayState);
        return this;
    }

    /**
     * <p>
     * A <a>NetworkInterface</a> array that contains descriptions of the gateway network interfaces.
     * </p>
     * 
     * @return A <a>NetworkInterface</a> array that contains descriptions of the gateway network interfaces.
     */

    public java.util.List<NetworkInterface> getGatewayNetworkInterfaces() {
        if (gatewayNetworkInterfaces == null) {
            gatewayNetworkInterfaces = new com.amazonaws.internal.SdkInternalList<NetworkInterface>();
        }
        return gatewayNetworkInterfaces;
    }

    /**
     * <p>
     * A <a>NetworkInterface</a> array that contains descriptions of the gateway network interfaces.
     * </p>
     * 
     * @param gatewayNetworkInterfaces
     *        A <a>NetworkInterface</a> array that contains descriptions of the gateway network interfaces.
     */

    public void setGatewayNetworkInterfaces(java.util.Collection<NetworkInterface> gatewayNetworkInterfaces) {
        if (gatewayNetworkInterfaces == null) {
            this.gatewayNetworkInterfaces = null;
            return;
        }

        this.gatewayNetworkInterfaces = new com.amazonaws.internal.SdkInternalList<NetworkInterface>(gatewayNetworkInterfaces);
    }

    /**
     * <p>
     * A <a>NetworkInterface</a> array that contains descriptions of the gateway network interfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGatewayNetworkInterfaces(java.util.Collection)} or
     * {@link #withGatewayNetworkInterfaces(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param gatewayNetworkInterfaces
     *        A <a>NetworkInterface</a> array that contains descriptions of the gateway network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayInformationResult withGatewayNetworkInterfaces(NetworkInterface... gatewayNetworkInterfaces) {
        if (this.gatewayNetworkInterfaces == null) {
            setGatewayNetworkInterfaces(new com.amazonaws.internal.SdkInternalList<NetworkInterface>(gatewayNetworkInterfaces.length));
        }
        for (NetworkInterface ele : gatewayNetworkInterfaces) {
            this.gatewayNetworkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A <a>NetworkInterface</a> array that contains descriptions of the gateway network interfaces.
     * </p>
     * 
     * @param gatewayNetworkInterfaces
     *        A <a>NetworkInterface</a> array that contains descriptions of the gateway network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayInformationResult withGatewayNetworkInterfaces(java.util.Collection<NetworkInterface> gatewayNetworkInterfaces) {
        setGatewayNetworkInterfaces(gatewayNetworkInterfaces);
        return this;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * 
     * @param gatewayType
     *        The type of the gateway.
     */

    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * 
     * @return The type of the gateway.
     */

    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * 
     * @param gatewayType
     *        The type of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayInformationResult withGatewayType(String gatewayType) {
        setGatewayType(gatewayType);
        return this;
    }

    /**
     * <p>
     * The date on which an update to the gateway is available. This date is in the time zone of the gateway. If the
     * gateway is not available for an update this field is not returned in the response.
     * </p>
     * 
     * @param nextUpdateAvailabilityDate
     *        The date on which an update to the gateway is available. This date is in the time zone of the gateway. If
     *        the gateway is not available for an update this field is not returned in the response.
     */

    public void setNextUpdateAvailabilityDate(String nextUpdateAvailabilityDate) {
        this.nextUpdateAvailabilityDate = nextUpdateAvailabilityDate;
    }

    /**
     * <p>
     * The date on which an update to the gateway is available. This date is in the time zone of the gateway. If the
     * gateway is not available for an update this field is not returned in the response.
     * </p>
     * 
     * @return The date on which an update to the gateway is available. This date is in the time zone of the gateway. If
     *         the gateway is not available for an update this field is not returned in the response.
     */

    public String getNextUpdateAvailabilityDate() {
        return this.nextUpdateAvailabilityDate;
    }

    /**
     * <p>
     * The date on which an update to the gateway is available. This date is in the time zone of the gateway. If the
     * gateway is not available for an update this field is not returned in the response.
     * </p>
     * 
     * @param nextUpdateAvailabilityDate
     *        The date on which an update to the gateway is available. This date is in the time zone of the gateway. If
     *        the gateway is not available for an update this field is not returned in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayInformationResult withNextUpdateAvailabilityDate(String nextUpdateAvailabilityDate) {
        setNextUpdateAvailabilityDate(nextUpdateAvailabilityDate);
        return this;
    }

    /**
     * <p>
     * The date on which the last software update was applied to the gateway. If the gateway has never been updated,
     * this field does not return a value in the response.
     * </p>
     * 
     * @param lastSoftwareUpdate
     *        The date on which the last software update was applied to the gateway. If the gateway has never been
     *        updated, this field does not return a value in the response.
     */

    public void setLastSoftwareUpdate(String lastSoftwareUpdate) {
        this.lastSoftwareUpdate = lastSoftwareUpdate;
    }

    /**
     * <p>
     * The date on which the last software update was applied to the gateway. If the gateway has never been updated,
     * this field does not return a value in the response.
     * </p>
     * 
     * @return The date on which the last software update was applied to the gateway. If the gateway has never been
     *         updated, this field does not return a value in the response.
     */

    public String getLastSoftwareUpdate() {
        return this.lastSoftwareUpdate;
    }

    /**
     * <p>
     * The date on which the last software update was applied to the gateway. If the gateway has never been updated,
     * this field does not return a value in the response.
     * </p>
     * 
     * @param lastSoftwareUpdate
     *        The date on which the last software update was applied to the gateway. If the gateway has never been
     *        updated, this field does not return a value in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayInformationResult withLastSoftwareUpdate(String lastSoftwareUpdate) {
        setLastSoftwareUpdate(lastSoftwareUpdate);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     * 
     * @param ec2InstanceId
     *        The ID of the Amazon EC2 instance that was used to launch the gateway.
     */

    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     * 
     * @return The ID of the Amazon EC2 instance that was used to launch the gateway.
     */

    public String getEc2InstanceId() {
        return this.ec2InstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     * 
     * @param ec2InstanceId
     *        The ID of the Amazon EC2 instance that was used to launch the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayInformationResult withEc2InstanceId(String ec2InstanceId) {
        setEc2InstanceId(ec2InstanceId);
        return this;
    }

    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     * 
     * @param ec2InstanceRegion
     *        The AWS Region where the Amazon EC2 instance is located.
     */

    public void setEc2InstanceRegion(String ec2InstanceRegion) {
        this.ec2InstanceRegion = ec2InstanceRegion;
    }

    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     * 
     * @return The AWS Region where the Amazon EC2 instance is located.
     */

    public String getEc2InstanceRegion() {
        return this.ec2InstanceRegion;
    }

    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     * 
     * @param ec2InstanceRegion
     *        The AWS Region where the Amazon EC2 instance is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayInformationResult withEc2InstanceRegion(String ec2InstanceRegion) {
        setEc2InstanceRegion(ec2InstanceRegion);
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the gateway, sorted alphabetically by key name. Each tag is a key-value pair.
     * For a gateway with more than 10 tags assigned, you can view all tags using the <code>ListTagsForResource</code>
     * API operation.
     * </p>
     * 
     * @return A list of up to 50 tags assigned to the gateway, sorted alphabetically by key name. Each tag is a
     *         key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *         <code>ListTagsForResource</code> API operation.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the gateway, sorted alphabetically by key name. Each tag is a key-value pair.
     * For a gateway with more than 10 tags assigned, you can view all tags using the <code>ListTagsForResource</code>
     * API operation.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags assigned to the gateway, sorted alphabetically by key name. Each tag is a
     *        key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *        <code>ListTagsForResource</code> API operation.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the gateway, sorted alphabetically by key name. Each tag is a key-value pair.
     * For a gateway with more than 10 tags assigned, you can view all tags using the <code>ListTagsForResource</code>
     * API operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags assigned to the gateway, sorted alphabetically by key name. Each tag is a
     *        key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *        <code>ListTagsForResource</code> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayInformationResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the gateway, sorted alphabetically by key name. Each tag is a key-value pair.
     * For a gateway with more than 10 tags assigned, you can view all tags using the <code>ListTagsForResource</code>
     * API operation.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags assigned to the gateway, sorted alphabetically by key name. Each tag is a
     *        key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *        <code>ListTagsForResource</code> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayInformationResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getGatewayId() != null)
            sb.append("GatewayId: ").append(getGatewayId()).append(",");
        if (getGatewayName() != null)
            sb.append("GatewayName: ").append(getGatewayName()).append(",");
        if (getGatewayTimezone() != null)
            sb.append("GatewayTimezone: ").append(getGatewayTimezone()).append(",");
        if (getGatewayState() != null)
            sb.append("GatewayState: ").append(getGatewayState()).append(",");
        if (getGatewayNetworkInterfaces() != null)
            sb.append("GatewayNetworkInterfaces: ").append(getGatewayNetworkInterfaces()).append(",");
        if (getGatewayType() != null)
            sb.append("GatewayType: ").append(getGatewayType()).append(",");
        if (getNextUpdateAvailabilityDate() != null)
            sb.append("NextUpdateAvailabilityDate: ").append(getNextUpdateAvailabilityDate()).append(",");
        if (getLastSoftwareUpdate() != null)
            sb.append("LastSoftwareUpdate: ").append(getLastSoftwareUpdate()).append(",");
        if (getEc2InstanceId() != null)
            sb.append("Ec2InstanceId: ").append(getEc2InstanceId()).append(",");
        if (getEc2InstanceRegion() != null)
            sb.append("Ec2InstanceRegion: ").append(getEc2InstanceRegion()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGatewayInformationResult == false)
            return false;
        DescribeGatewayInformationResult other = (DescribeGatewayInformationResult) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getGatewayName() == null ^ this.getGatewayName() == null)
            return false;
        if (other.getGatewayName() != null && other.getGatewayName().equals(this.getGatewayName()) == false)
            return false;
        if (other.getGatewayTimezone() == null ^ this.getGatewayTimezone() == null)
            return false;
        if (other.getGatewayTimezone() != null && other.getGatewayTimezone().equals(this.getGatewayTimezone()) == false)
            return false;
        if (other.getGatewayState() == null ^ this.getGatewayState() == null)
            return false;
        if (other.getGatewayState() != null && other.getGatewayState().equals(this.getGatewayState()) == false)
            return false;
        if (other.getGatewayNetworkInterfaces() == null ^ this.getGatewayNetworkInterfaces() == null)
            return false;
        if (other.getGatewayNetworkInterfaces() != null && other.getGatewayNetworkInterfaces().equals(this.getGatewayNetworkInterfaces()) == false)
            return false;
        if (other.getGatewayType() == null ^ this.getGatewayType() == null)
            return false;
        if (other.getGatewayType() != null && other.getGatewayType().equals(this.getGatewayType()) == false)
            return false;
        if (other.getNextUpdateAvailabilityDate() == null ^ this.getNextUpdateAvailabilityDate() == null)
            return false;
        if (other.getNextUpdateAvailabilityDate() != null && other.getNextUpdateAvailabilityDate().equals(this.getNextUpdateAvailabilityDate()) == false)
            return false;
        if (other.getLastSoftwareUpdate() == null ^ this.getLastSoftwareUpdate() == null)
            return false;
        if (other.getLastSoftwareUpdate() != null && other.getLastSoftwareUpdate().equals(this.getLastSoftwareUpdate()) == false)
            return false;
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null)
            return false;
        if (other.getEc2InstanceId() != null && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false)
            return false;
        if (other.getEc2InstanceRegion() == null ^ this.getEc2InstanceRegion() == null)
            return false;
        if (other.getEc2InstanceRegion() != null && other.getEc2InstanceRegion().equals(this.getEc2InstanceRegion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode());
        hashCode = prime * hashCode + ((getGatewayTimezone() == null) ? 0 : getGatewayTimezone().hashCode());
        hashCode = prime * hashCode + ((getGatewayState() == null) ? 0 : getGatewayState().hashCode());
        hashCode = prime * hashCode + ((getGatewayNetworkInterfaces() == null) ? 0 : getGatewayNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getGatewayType() == null) ? 0 : getGatewayType().hashCode());
        hashCode = prime * hashCode + ((getNextUpdateAvailabilityDate() == null) ? 0 : getNextUpdateAvailabilityDate().hashCode());
        hashCode = prime * hashCode + ((getLastSoftwareUpdate() == null) ? 0 : getLastSoftwareUpdate().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceRegion() == null) ? 0 : getEc2InstanceRegion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGatewayInformationResult clone() {
        try {
            return (DescribeGatewayInformationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
