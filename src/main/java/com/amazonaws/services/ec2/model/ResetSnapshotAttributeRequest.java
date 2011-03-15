/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#resetSnapshotAttribute(ResetSnapshotAttributeRequest) ResetSnapshotAttribute operation}.
 * <p>
 * Resets permission settings for the specified snapshot.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#resetSnapshotAttribute(ResetSnapshotAttributeRequest)
 */
public class ResetSnapshotAttributeRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the snapshot whose attribute is being reset.
     */
    private String snapshotId;

    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * <code>createVolumePermission</code>
     */
    private String attribute;

    /**
     * Default constructor for a new ResetSnapshotAttributeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ResetSnapshotAttributeRequest() {}
    
    /**
     * Constructs a new ResetSnapshotAttributeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param snapshotId The ID of the snapshot whose attribute is being
     * reset.
     * @param attribute The name of the attribute being reset. <p> Available
     * attribute names: <code>createVolumePermission</code>
     */
    public ResetSnapshotAttributeRequest(String snapshotId, String attribute) {
        this.snapshotId = snapshotId;
        this.attribute = attribute;
    }
    
    /**
     * The ID of the snapshot whose attribute is being reset.
     *
     * @return The ID of the snapshot whose attribute is being reset.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The ID of the snapshot whose attribute is being reset.
     *
     * @param snapshotId The ID of the snapshot whose attribute is being reset.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The ID of the snapshot whose attribute is being reset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The ID of the snapshot whose attribute is being reset.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResetSnapshotAttributeRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * <code>createVolumePermission</code>
     *
     * @return The name of the attribute being reset. <p> Available attribute names:
     *         <code>createVolumePermission</code>
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * <code>createVolumePermission</code>
     *
     * @param attribute The name of the attribute being reset. <p> Available attribute names:
     *         <code>createVolumePermission</code>
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * <code>createVolumePermission</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attribute The name of the attribute being reset. <p> Available attribute names:
     *         <code>createVolumePermission</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResetSnapshotAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
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
        sb.append("SnapshotId: " + snapshotId + ", ");
        sb.append("Attribute: " + attribute + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    