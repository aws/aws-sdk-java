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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ResetSnapshotAttributeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#resetSnapshotAttribute(ResetSnapshotAttributeRequest) ResetSnapshotAttribute operation}.
 * <p>
 * Resets permission settings for the specified snapshot.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#resetSnapshotAttribute(ResetSnapshotAttributeRequest)
 */
public class ResetSnapshotAttributeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ResetSnapshotAttributeRequest> {

    /**
     * The ID of the snapshot whose attribute is being reset.
     */
    private String snapshotId;

    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * <code>createVolumePermission</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
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
        setSnapshotId(snapshotId);
        setAttribute(attribute);
    }

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
    public ResetSnapshotAttributeRequest(String snapshotId, SnapshotAttributeName attribute) {
        this.snapshotId = snapshotId;
        this.attribute = attribute.toString();
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @return The name of the attribute being reset. <p> Available attribute names:
     *         <code>createVolumePermission</code>
     *
     * @see SnapshotAttributeName
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * <code>createVolumePermission</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute The name of the attribute being reset. <p> Available attribute names:
     *         <code>createVolumePermission</code>
     *
     * @see SnapshotAttributeName
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * <code>createVolumePermission</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute The name of the attribute being reset. <p> Available attribute names:
     *         <code>createVolumePermission</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SnapshotAttributeName
     */
    public ResetSnapshotAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * <code>createVolumePermission</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute The name of the attribute being reset. <p> Available attribute names:
     *         <code>createVolumePermission</code>
     *
     * @see SnapshotAttributeName
     */
    public void setAttribute(SnapshotAttributeName attribute) {
        this.attribute = attribute.toString();
    }
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * <code>createVolumePermission</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute The name of the attribute being reset. <p> Available attribute names:
     *         <code>createVolumePermission</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SnapshotAttributeName
     */
    public ResetSnapshotAttributeRequest withAttribute(SnapshotAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ResetSnapshotAttributeRequest> getDryRunRequest() {
        Request<ResetSnapshotAttributeRequest> request = new ResetSnapshotAttributeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getAttribute() != null) sb.append("Attribute: " + getAttribute() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResetSnapshotAttributeRequest == false) return false;
        ResetSnapshotAttributeRequest other = (ResetSnapshotAttributeRequest)obj;
        
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        if (other.getAttribute() == null ^ this.getAttribute() == null) return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false) return false; 
        return true;
    }
    
}
    