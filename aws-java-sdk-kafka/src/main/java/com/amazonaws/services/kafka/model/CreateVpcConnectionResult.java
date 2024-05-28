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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateVpcConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The VPC connection ARN.
     * </p>
     */
    private String vpcConnectionArn;
    /**
     * <p>
     * The State of Vpc Connection.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The authentication type of VPC connection.
     * </p>
     */
    private String authentication;
    /**
     * <p>
     * The VPC ID of the VPC connection.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The list of client subnets.
     * </p>
     */
    private java.util.List<String> clientSubnets;
    /**
     * <p>
     * The list of security groups.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * The creation time of VPC connection.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A map of tags for the VPC connection.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The VPC connection ARN.
     * </p>
     * 
     * @param vpcConnectionArn
     *        <p>
     *        The VPC connection ARN.
     *        </p>
     */

    public void setVpcConnectionArn(String vpcConnectionArn) {
        this.vpcConnectionArn = vpcConnectionArn;
    }

    /**
     * <p>
     * The VPC connection ARN.
     * </p>
     * 
     * @return <p>
     *         The VPC connection ARN.
     *         </p>
     */

    public String getVpcConnectionArn() {
        return this.vpcConnectionArn;
    }

    /**
     * <p>
     * The VPC connection ARN.
     * </p>
     * 
     * @param vpcConnectionArn
     *        <p>
     *        The VPC connection ARN.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectionResult withVpcConnectionArn(String vpcConnectionArn) {
        setVpcConnectionArn(vpcConnectionArn);
        return this;
    }

    /**
     * <p>
     * The State of Vpc Connection.
     * </p>
     * 
     * @param state
     *        <p>
     *        The State of Vpc Connection.
     *        </p>
     * @see VpcConnectionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The State of Vpc Connection.
     * </p>
     * 
     * @return <p>
     *         The State of Vpc Connection.
     *         </p>
     * @see VpcConnectionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The State of Vpc Connection.
     * </p>
     * 
     * @param state
     *        <p>
     *        The State of Vpc Connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcConnectionState
     */

    public CreateVpcConnectionResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The State of Vpc Connection.
     * </p>
     * 
     * @param state
     *        <p>
     *        The State of Vpc Connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcConnectionState
     */

    public CreateVpcConnectionResult withState(VpcConnectionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The authentication type of VPC connection.
     * </p>
     * 
     * @param authentication
     *        <p>
     *        The authentication type of VPC connection.
     *        </p>
     */

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    /**
     * <p>
     * The authentication type of VPC connection.
     * </p>
     * 
     * @return <p>
     *         The authentication type of VPC connection.
     *         </p>
     */

    public String getAuthentication() {
        return this.authentication;
    }

    /**
     * <p>
     * The authentication type of VPC connection.
     * </p>
     * 
     * @param authentication
     *        <p>
     *        The authentication type of VPC connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectionResult withAuthentication(String authentication) {
        setAuthentication(authentication);
        return this;
    }

    /**
     * <p>
     * The VPC ID of the VPC connection.
     * </p>
     * 
     * @param vpcId
     *        <p>
     *        The VPC ID of the VPC connection.
     *        </p>
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID of the VPC connection.
     * </p>
     * 
     * @return <p>
     *         The VPC ID of the VPC connection.
     *         </p>
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID of the VPC connection.
     * </p>
     * 
     * @param vpcId
     *        <p>
     *        The VPC ID of the VPC connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectionResult withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The list of client subnets.
     * </p>
     * 
     * @return <p>
     *         The list of client subnets.
     *         </p>
     */

    public java.util.List<String> getClientSubnets() {
        return clientSubnets;
    }

    /**
     * <p>
     * The list of client subnets.
     * </p>
     * 
     * @param clientSubnets
     *        <p>
     *        The list of client subnets.
     *        </p>
     */

    public void setClientSubnets(java.util.Collection<String> clientSubnets) {
        if (clientSubnets == null) {
            this.clientSubnets = null;
            return;
        }

        this.clientSubnets = new java.util.ArrayList<String>(clientSubnets);
    }

    /**
     * <p>
     * The list of client subnets.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClientSubnets(java.util.Collection)} or {@link #withClientSubnets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param clientSubnets
     *        <p>
     *        The list of client subnets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectionResult withClientSubnets(String... clientSubnets) {
        if (this.clientSubnets == null) {
            setClientSubnets(new java.util.ArrayList<String>(clientSubnets.length));
        }
        for (String ele : clientSubnets) {
            this.clientSubnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of client subnets.
     * </p>
     * 
     * @param clientSubnets
     *        <p>
     *        The list of client subnets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectionResult withClientSubnets(java.util.Collection<String> clientSubnets) {
        setClientSubnets(clientSubnets);
        return this;
    }

    /**
     * <p>
     * The list of security groups.
     * </p>
     * 
     * @return <p>
     *         The list of security groups.
     *         </p>
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The list of security groups.
     * </p>
     * 
     * @param securityGroups
     *        <p>
     *        The list of security groups.
     *        </p>
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The list of security groups.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        <p>
     *        The list of security groups.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectionResult withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of security groups.
     * </p>
     * 
     * @param securityGroups
     *        <p>
     *        The list of security groups.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectionResult withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The creation time of VPC connection.
     * </p>
     * 
     * @param creationTime
     *        <p>
     *        The creation time of VPC connection.
     *        </p>
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of VPC connection.
     * </p>
     * 
     * @return <p>
     *         The creation time of VPC connection.
     *         </p>
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of VPC connection.
     * </p>
     * 
     * @param creationTime
     *        <p>
     *        The creation time of VPC connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A map of tags for the VPC connection.
     * </p>
     * 
     * @return <p>
     *         A map of tags for the VPC connection.
     *         </p>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of tags for the VPC connection.
     * </p>
     * 
     * @param tags
     *        <p>
     *        A map of tags for the VPC connection.
     *        </p>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of tags for the VPC connection.
     * </p>
     * 
     * @param tags
     *        <p>
     *        A map of tags for the VPC connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectionResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateVpcConnectionResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectionResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectionResult clearTagsEntries() {
        this.tags = null;
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
        if (getVpcConnectionArn() != null)
            sb.append("VpcConnectionArn: ").append(getVpcConnectionArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getAuthentication() != null)
            sb.append("Authentication: ").append(getAuthentication()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getClientSubnets() != null)
            sb.append("ClientSubnets: ").append(getClientSubnets()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
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

        if (obj instanceof CreateVpcConnectionResult == false)
            return false;
        CreateVpcConnectionResult other = (CreateVpcConnectionResult) obj;
        if (other.getVpcConnectionArn() == null ^ this.getVpcConnectionArn() == null)
            return false;
        if (other.getVpcConnectionArn() != null && other.getVpcConnectionArn().equals(this.getVpcConnectionArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getAuthentication() == null ^ this.getAuthentication() == null)
            return false;
        if (other.getAuthentication() != null && other.getAuthentication().equals(this.getAuthentication()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getClientSubnets() == null ^ this.getClientSubnets() == null)
            return false;
        if (other.getClientSubnets() != null && other.getClientSubnets().equals(this.getClientSubnets()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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

        hashCode = prime * hashCode + ((getVpcConnectionArn() == null) ? 0 : getVpcConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getAuthentication() == null) ? 0 : getAuthentication().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getClientSubnets() == null) ? 0 : getClientSubnets().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcConnectionResult clone() {
        try {
            return (CreateVpcConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
