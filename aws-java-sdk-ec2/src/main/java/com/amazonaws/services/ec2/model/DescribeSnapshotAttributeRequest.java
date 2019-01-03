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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeSnapshotAttributeRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeSnapshotAttribute.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeSnapshotAttributeRequest> {

    /**
     * <p>
     * The snapshot attribute you would like to view.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     */
    private String snapshotId;

    /**
     * Default constructor for DescribeSnapshotAttributeRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DescribeSnapshotAttributeRequest() {
    }

    /**
     * Constructs a new DescribeSnapshotAttributeRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param snapshotId
     *        The ID of the EBS snapshot.
     * @param attribute
     *        The snapshot attribute you would like to view.
     */
    public DescribeSnapshotAttributeRequest(String snapshotId, String attribute) {
        setSnapshotId(snapshotId);
        setAttribute(attribute);
    }

    /**
     * Constructs a new DescribeSnapshotAttributeRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param snapshotId
     *        The ID of the EBS snapshot.
     * @param attribute
     *        The snapshot attribute you would like to view.
     */
    public DescribeSnapshotAttributeRequest(String snapshotId, SnapshotAttributeName attribute) {
        setSnapshotId(snapshotId);
        setAttribute(attribute.toString());
    }

    /**
     * <p>
     * The snapshot attribute you would like to view.
     * </p>
     * 
     * @param attribute
     *        The snapshot attribute you would like to view.
     * @see SnapshotAttributeName
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The snapshot attribute you would like to view.
     * </p>
     * 
     * @return The snapshot attribute you would like to view.
     * @see SnapshotAttributeName
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The snapshot attribute you would like to view.
     * </p>
     * 
     * @param attribute
     *        The snapshot attribute you would like to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotAttributeName
     */

    public DescribeSnapshotAttributeRequest withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The snapshot attribute you would like to view.
     * </p>
     * 
     * @param attribute
     *        The snapshot attribute you would like to view.
     * @see SnapshotAttributeName
     */

    public void setAttribute(SnapshotAttributeName attribute) {
        withAttribute(attribute);
    }

    /**
     * <p>
     * The snapshot attribute you would like to view.
     * </p>
     * 
     * @param attribute
     *        The snapshot attribute you would like to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotAttributeName
     */

    public DescribeSnapshotAttributeRequest withAttribute(SnapshotAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the EBS snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     * 
     * @return The ID of the EBS snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the EBS snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotAttributeRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeSnapshotAttributeRequest> getDryRunRequest() {
        Request<DescribeSnapshotAttributeRequest> request = new DescribeSnapshotAttributeRequestMarshaller().marshall(this);
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotAttributeRequest == false)
            return false;
        DescribeSnapshotAttributeRequest other = (DescribeSnapshotAttributeRequest) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotAttributeRequest clone() {
        return (DescribeSnapshotAttributeRequest) super.clone();
    }
}
