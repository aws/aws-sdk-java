/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.directconnect.model;
import java.io.Serializable;

/**
 * <p>
 * A connection represents the physical network connection between the Direct Connect location and the customer.
 * </p>
 */
public class DeleteConnectionResult  implements Serializable  {

    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     */
    private String connectionId;

    /**
     * The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     * <p>Default: None
     */
    private String connectionName;

    /**
     * State of the connection. <ul> <li><b>Requested</b>: The initial state
     * of connection immediately after creation. The connection stays in the
     * requested state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: A connection is pending after the
     * customer receives the LOA and remains pending until the completion of
     * the partner circuit.</li> <li><b>Available</b>: A connection that has
     * a completed partner circuit and is ready for use. A connection must be
     * available before virtual interfaces can be created.</li>
     * <li><b>Deleted</b>: A connection that has been deleted.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, deleted
     */
    private String connectionState;

    /**
     * The AWS region where the offering is located. <p>Example: us-east-1
     * <p>Default: None
     */
    private String region;

    /**
     * Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     * <p>Default: None
     */
    private String location;

    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     *
     * @return ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     */
    public String getConnectionId() {
        return connectionId;
    }
    
    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     *
     * @param connectionId ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }
    
    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectionId ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteConnectionResult withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    
    /**
     * The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     * <p>Default: None
     *
     * @return The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     *         <p>Default: None
     */
    public String getConnectionName() {
        return connectionName;
    }
    
    /**
     * The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     * <p>Default: None
     *
     * @param connectionName The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     *         <p>Default: None
     */
    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }
    
    /**
     * The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     * <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectionName The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     *         <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteConnectionResult withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    
    
    /**
     * State of the connection. <ul> <li><b>Requested</b>: The initial state
     * of connection immediately after creation. The connection stays in the
     * requested state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: A connection is pending after the
     * customer receives the LOA and remains pending until the completion of
     * the partner circuit.</li> <li><b>Available</b>: A connection that has
     * a completed partner circuit and is ready for use. A connection must be
     * available before virtual interfaces can be created.</li>
     * <li><b>Deleted</b>: A connection that has been deleted.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, deleted
     *
     * @return State of the connection. <ul> <li><b>Requested</b>: The initial state
     *         of connection immediately after creation. The connection stays in the
     *         requested state until the Letter of Authorization (LOA) is sent to the
     *         customer.</li> <li><b>Pending</b>: A connection is pending after the
     *         customer receives the LOA and remains pending until the completion of
     *         the partner circuit.</li> <li><b>Available</b>: A connection that has
     *         a completed partner circuit and is ready for use. A connection must be
     *         available before virtual interfaces can be created.</li>
     *         <li><b>Deleted</b>: A connection that has been deleted.</li> </ul>
     *
     * @see ConnectionState
     */
    public String getConnectionState() {
        return connectionState;
    }
    
    /**
     * State of the connection. <ul> <li><b>Requested</b>: The initial state
     * of connection immediately after creation. The connection stays in the
     * requested state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: A connection is pending after the
     * customer receives the LOA and remains pending until the completion of
     * the partner circuit.</li> <li><b>Available</b>: A connection that has
     * a completed partner circuit and is ready for use. A connection must be
     * available before virtual interfaces can be created.</li>
     * <li><b>Deleted</b>: A connection that has been deleted.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, deleted
     *
     * @param connectionState State of the connection. <ul> <li><b>Requested</b>: The initial state
     *         of connection immediately after creation. The connection stays in the
     *         requested state until the Letter of Authorization (LOA) is sent to the
     *         customer.</li> <li><b>Pending</b>: A connection is pending after the
     *         customer receives the LOA and remains pending until the completion of
     *         the partner circuit.</li> <li><b>Available</b>: A connection that has
     *         a completed partner circuit and is ready for use. A connection must be
     *         available before virtual interfaces can be created.</li>
     *         <li><b>Deleted</b>: A connection that has been deleted.</li> </ul>
     *
     * @see ConnectionState
     */
    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }
    
    /**
     * State of the connection. <ul> <li><b>Requested</b>: The initial state
     * of connection immediately after creation. The connection stays in the
     * requested state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: A connection is pending after the
     * customer receives the LOA and remains pending until the completion of
     * the partner circuit.</li> <li><b>Available</b>: A connection that has
     * a completed partner circuit and is ready for use. A connection must be
     * available before virtual interfaces can be created.</li>
     * <li><b>Deleted</b>: A connection that has been deleted.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, deleted
     *
     * @param connectionState State of the connection. <ul> <li><b>Requested</b>: The initial state
     *         of connection immediately after creation. The connection stays in the
     *         requested state until the Letter of Authorization (LOA) is sent to the
     *         customer.</li> <li><b>Pending</b>: A connection is pending after the
     *         customer receives the LOA and remains pending until the completion of
     *         the partner circuit.</li> <li><b>Available</b>: A connection that has
     *         a completed partner circuit and is ready for use. A connection must be
     *         available before virtual interfaces can be created.</li>
     *         <li><b>Deleted</b>: A connection that has been deleted.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ConnectionState
     */
    public DeleteConnectionResult withConnectionState(String connectionState) {
        this.connectionState = connectionState;
        return this;
    }
    
    
    /**
     * State of the connection. <ul> <li><b>Requested</b>: The initial state
     * of connection immediately after creation. The connection stays in the
     * requested state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: A connection is pending after the
     * customer receives the LOA and remains pending until the completion of
     * the partner circuit.</li> <li><b>Available</b>: A connection that has
     * a completed partner circuit and is ready for use. A connection must be
     * available before virtual interfaces can be created.</li>
     * <li><b>Deleted</b>: A connection that has been deleted.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, deleted
     *
     * @param connectionState State of the connection. <ul> <li><b>Requested</b>: The initial state
     *         of connection immediately after creation. The connection stays in the
     *         requested state until the Letter of Authorization (LOA) is sent to the
     *         customer.</li> <li><b>Pending</b>: A connection is pending after the
     *         customer receives the LOA and remains pending until the completion of
     *         the partner circuit.</li> <li><b>Available</b>: A connection that has
     *         a completed partner circuit and is ready for use. A connection must be
     *         available before virtual interfaces can be created.</li>
     *         <li><b>Deleted</b>: A connection that has been deleted.</li> </ul>
     *
     * @see ConnectionState
     */
    public void setConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState.toString();
    }
    
    /**
     * State of the connection. <ul> <li><b>Requested</b>: The initial state
     * of connection immediately after creation. The connection stays in the
     * requested state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: A connection is pending after the
     * customer receives the LOA and remains pending until the completion of
     * the partner circuit.</li> <li><b>Available</b>: A connection that has
     * a completed partner circuit and is ready for use. A connection must be
     * available before virtual interfaces can be created.</li>
     * <li><b>Deleted</b>: A connection that has been deleted.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, deleted
     *
     * @param connectionState State of the connection. <ul> <li><b>Requested</b>: The initial state
     *         of connection immediately after creation. The connection stays in the
     *         requested state until the Letter of Authorization (LOA) is sent to the
     *         customer.</li> <li><b>Pending</b>: A connection is pending after the
     *         customer receives the LOA and remains pending until the completion of
     *         the partner circuit.</li> <li><b>Available</b>: A connection that has
     *         a completed partner circuit and is ready for use. A connection must be
     *         available before virtual interfaces can be created.</li>
     *         <li><b>Deleted</b>: A connection that has been deleted.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ConnectionState
     */
    public DeleteConnectionResult withConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState.toString();
        return this;
    }
    
    /**
     * The AWS region where the offering is located. <p>Example: us-east-1
     * <p>Default: None
     *
     * @return The AWS region where the offering is located. <p>Example: us-east-1
     *         <p>Default: None
     */
    public String getRegion() {
        return region;
    }
    
    /**
     * The AWS region where the offering is located. <p>Example: us-east-1
     * <p>Default: None
     *
     * @param region The AWS region where the offering is located. <p>Example: us-east-1
     *         <p>Default: None
     */
    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     * The AWS region where the offering is located. <p>Example: us-east-1
     * <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param region The AWS region where the offering is located. <p>Example: us-east-1
     *         <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteConnectionResult withRegion(String region) {
        this.region = region;
        return this;
    }
    
    
    /**
     * Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     * <p>Default: None
     *
     * @return Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     *         <p>Default: None
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     * <p>Default: None
     *
     * @param location Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     *         <p>Default: None
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     * <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param location Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     *         <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteConnectionResult withLocation(String location) {
        this.location = location;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConnectionId() != null) sb.append("ConnectionId: " + getConnectionId() + ",");
        if (getConnectionName() != null) sb.append("ConnectionName: " + getConnectionName() + ",");
        if (getConnectionState() != null) sb.append("ConnectionState: " + getConnectionState() + ",");
        if (getRegion() != null) sb.append("Region: " + getRegion() + ",");
        if (getLocation() != null) sb.append("Location: " + getLocation() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode()); 
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode()); 
        hashCode = prime * hashCode + ((getConnectionState() == null) ? 0 : getConnectionState().hashCode()); 
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode()); 
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteConnectionResult == false) return false;
        DeleteConnectionResult other = (DeleteConnectionResult)obj;
        
        if (other.getConnectionId() == null ^ this.getConnectionId() == null) return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false) return false; 
        if (other.getConnectionName() == null ^ this.getConnectionName() == null) return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false) return false; 
        if (other.getConnectionState() == null ^ this.getConnectionState() == null) return false;
        if (other.getConnectionState() != null && other.getConnectionState().equals(this.getConnectionState()) == false) return false; 
        if (other.getRegion() == null ^ this.getRegion() == null) return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false) return false; 
        if (other.getLocation() == null ^ this.getLocation() == null) return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) return false; 
        return true;
    }
    
}
    