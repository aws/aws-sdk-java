/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.logs.AWSLogs#putDestination(PutDestinationRequest) PutDestination operation}.
 * <p>
 * Creates or updates a <code>Destination</code> . A destination
 * encapsulates a physical resource (such as a Kinesis stream) and allows
 * you to subscribe to a real-time stream of log events of a different
 * account, ingested through <code>PutLogEvents</code> requests.
 * Currently, the only supported physical resource is a Amazon Kinesis
 * stream belonging to the same account as the destination.
 * </p>
 * <p>
 * A destination controls what is written to its Amazon Kinesis stream
 * through an access policy. By default, PutDestination does not set any
 * access policy with the destination, which means a cross-account user
 * will not be able to call <code>PutSubscriptionFilter</code> against
 * this destination. To enable that, the destination owner must call
 * <code>PutDestinationPolicy</code> after PutDestination.
 * </p>
 *
 * @see com.amazonaws.services.logs.AWSLogs#putDestination(PutDestinationRequest)
 */
public class PutDestinationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A name for the destination.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String destinationName;

    /**
     * The ARN of an Amazon Kinesis stream to deliver matching log events to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String targetArn;

    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions
     * to do Amazon Kinesis PutRecord requests on the desitnation stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String roleArn;

    /**
     * A name for the destination.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return A name for the destination.
     */
    public String getDestinationName() {
        return destinationName;
    }
    
    /**
     * A name for the destination.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param destinationName A name for the destination.
     */
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }
    
    /**
     * A name for the destination.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param destinationName A name for the destination.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutDestinationRequest withDestinationName(String destinationName) {
        this.destinationName = destinationName;
        return this;
    }

    /**
     * The ARN of an Amazon Kinesis stream to deliver matching log events to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The ARN of an Amazon Kinesis stream to deliver matching log events to.
     */
    public String getTargetArn() {
        return targetArn;
    }
    
    /**
     * The ARN of an Amazon Kinesis stream to deliver matching log events to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param targetArn The ARN of an Amazon Kinesis stream to deliver matching log events to.
     */
    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }
    
    /**
     * The ARN of an Amazon Kinesis stream to deliver matching log events to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param targetArn The ARN of an Amazon Kinesis stream to deliver matching log events to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutDestinationRequest withTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions
     * to do Amazon Kinesis PutRecord requests on the desitnation stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The ARN of an IAM role that grants Amazon CloudWatch Logs permissions
     *         to do Amazon Kinesis PutRecord requests on the desitnation stream.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions
     * to do Amazon Kinesis PutRecord requests on the desitnation stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn The ARN of an IAM role that grants Amazon CloudWatch Logs permissions
     *         to do Amazon Kinesis PutRecord requests on the desitnation stream.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions
     * to do Amazon Kinesis PutRecord requests on the desitnation stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn The ARN of an IAM role that grants Amazon CloudWatch Logs permissions
     *         to do Amazon Kinesis PutRecord requests on the desitnation stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutDestinationRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getDestinationName() != null) sb.append("DestinationName: " + getDestinationName() + ",");
        if (getTargetArn() != null) sb.append("TargetArn: " + getTargetArn() + ",");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode()); 
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode()); 
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutDestinationRequest == false) return false;
        PutDestinationRequest other = (PutDestinationRequest)obj;
        
        if (other.getDestinationName() == null ^ this.getDestinationName() == null) return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false) return false; 
        if (other.getTargetArn() == null ^ this.getTargetArn() == null) return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false) return false; 
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        return true;
    }
    
    @Override
    public PutDestinationRequest clone() {
        
            return (PutDestinationRequest) super.clone();
    }

}
    