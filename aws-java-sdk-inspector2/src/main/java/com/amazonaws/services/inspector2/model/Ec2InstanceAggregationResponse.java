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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A response that contains the results of a finding aggregation by Amazon EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Ec2InstanceAggregationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2InstanceAggregationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account for the Amazon EC2 instance.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Machine Image (AMI) of the Amazon EC2 instance.
     * </p>
     */
    private String ami;
    /**
     * <p>
     * The Amazon EC2 instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The tags attached to the instance.
     * </p>
     */
    private java.util.Map<String, String> instanceTags;
    /**
     * <p>
     * The number of network findings for the Amazon EC2 instance.
     * </p>
     */
    private Long networkFindings;
    /**
     * <p>
     * The operating system of the Amazon EC2 instance.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * An object that contains the count of matched findings per severity.
     * </p>
     */
    private SeverityCounts severityCounts;

    /**
     * <p>
     * The Amazon Web Services account for the Amazon EC2 instance.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account for the Amazon EC2 instance.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account for the Amazon EC2 instance.
     * </p>
     * 
     * @return The Amazon Web Services account for the Amazon EC2 instance.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account for the Amazon EC2 instance.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account for the Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregationResponse withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) of the Amazon EC2 instance.
     * </p>
     * 
     * @param ami
     *        The Amazon Machine Image (AMI) of the Amazon EC2 instance.
     */

    public void setAmi(String ami) {
        this.ami = ami;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) of the Amazon EC2 instance.
     * </p>
     * 
     * @return The Amazon Machine Image (AMI) of the Amazon EC2 instance.
     */

    public String getAmi() {
        return this.ami;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) of the Amazon EC2 instance.
     * </p>
     * 
     * @param ami
     *        The Amazon Machine Image (AMI) of the Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregationResponse withAmi(String ami) {
        setAmi(ami);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance ID.
     * </p>
     * 
     * @param instanceId
     *        The Amazon EC2 instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The Amazon EC2 instance ID.
     * </p>
     * 
     * @return The Amazon EC2 instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The Amazon EC2 instance ID.
     * </p>
     * 
     * @param instanceId
     *        The Amazon EC2 instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregationResponse withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The tags attached to the instance.
     * </p>
     * 
     * @return The tags attached to the instance.
     */

    public java.util.Map<String, String> getInstanceTags() {
        return instanceTags;
    }

    /**
     * <p>
     * The tags attached to the instance.
     * </p>
     * 
     * @param instanceTags
     *        The tags attached to the instance.
     */

    public void setInstanceTags(java.util.Map<String, String> instanceTags) {
        this.instanceTags = instanceTags;
    }

    /**
     * <p>
     * The tags attached to the instance.
     * </p>
     * 
     * @param instanceTags
     *        The tags attached to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregationResponse withInstanceTags(java.util.Map<String, String> instanceTags) {
        setInstanceTags(instanceTags);
        return this;
    }

    /**
     * Add a single InstanceTags entry
     *
     * @see Ec2InstanceAggregationResponse#withInstanceTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregationResponse addInstanceTagsEntry(String key, String value) {
        if (null == this.instanceTags) {
            this.instanceTags = new java.util.HashMap<String, String>();
        }
        if (this.instanceTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.instanceTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into InstanceTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregationResponse clearInstanceTagsEntries() {
        this.instanceTags = null;
        return this;
    }

    /**
     * <p>
     * The number of network findings for the Amazon EC2 instance.
     * </p>
     * 
     * @param networkFindings
     *        The number of network findings for the Amazon EC2 instance.
     */

    public void setNetworkFindings(Long networkFindings) {
        this.networkFindings = networkFindings;
    }

    /**
     * <p>
     * The number of network findings for the Amazon EC2 instance.
     * </p>
     * 
     * @return The number of network findings for the Amazon EC2 instance.
     */

    public Long getNetworkFindings() {
        return this.networkFindings;
    }

    /**
     * <p>
     * The number of network findings for the Amazon EC2 instance.
     * </p>
     * 
     * @param networkFindings
     *        The number of network findings for the Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregationResponse withNetworkFindings(Long networkFindings) {
        setNetworkFindings(networkFindings);
        return this;
    }

    /**
     * <p>
     * The operating system of the Amazon EC2 instance.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system of the Amazon EC2 instance.
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The operating system of the Amazon EC2 instance.
     * </p>
     * 
     * @return The operating system of the Amazon EC2 instance.
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The operating system of the Amazon EC2 instance.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system of the Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregationResponse withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * An object that contains the count of matched findings per severity.
     * </p>
     * 
     * @param severityCounts
     *        An object that contains the count of matched findings per severity.
     */

    public void setSeverityCounts(SeverityCounts severityCounts) {
        this.severityCounts = severityCounts;
    }

    /**
     * <p>
     * An object that contains the count of matched findings per severity.
     * </p>
     * 
     * @return An object that contains the count of matched findings per severity.
     */

    public SeverityCounts getSeverityCounts() {
        return this.severityCounts;
    }

    /**
     * <p>
     * An object that contains the count of matched findings per severity.
     * </p>
     * 
     * @param severityCounts
     *        An object that contains the count of matched findings per severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregationResponse withSeverityCounts(SeverityCounts severityCounts) {
        setSeverityCounts(severityCounts);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getAmi() != null)
            sb.append("Ami: ").append(getAmi()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceTags() != null)
            sb.append("InstanceTags: ").append(getInstanceTags()).append(",");
        if (getNetworkFindings() != null)
            sb.append("NetworkFindings: ").append(getNetworkFindings()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getSeverityCounts() != null)
            sb.append("SeverityCounts: ").append(getSeverityCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ec2InstanceAggregationResponse == false)
            return false;
        Ec2InstanceAggregationResponse other = (Ec2InstanceAggregationResponse) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAmi() == null ^ this.getAmi() == null)
            return false;
        if (other.getAmi() != null && other.getAmi().equals(this.getAmi()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceTags() == null ^ this.getInstanceTags() == null)
            return false;
        if (other.getInstanceTags() != null && other.getInstanceTags().equals(this.getInstanceTags()) == false)
            return false;
        if (other.getNetworkFindings() == null ^ this.getNetworkFindings() == null)
            return false;
        if (other.getNetworkFindings() != null && other.getNetworkFindings().equals(this.getNetworkFindings()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getSeverityCounts() == null ^ this.getSeverityCounts() == null)
            return false;
        if (other.getSeverityCounts() != null && other.getSeverityCounts().equals(this.getSeverityCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAmi() == null) ? 0 : getAmi().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceTags() == null) ? 0 : getInstanceTags().hashCode());
        hashCode = prime * hashCode + ((getNetworkFindings() == null) ? 0 : getNetworkFindings().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getSeverityCounts() == null) ? 0 : getSeverityCounts().hashCode());
        return hashCode;
    }

    @Override
    public Ec2InstanceAggregationResponse clone() {
        try {
            return (Ec2InstanceAggregationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.Ec2InstanceAggregationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
