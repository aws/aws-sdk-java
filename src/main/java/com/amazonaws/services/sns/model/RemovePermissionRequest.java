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
package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#removePermission(RemovePermissionRequest) RemovePermission operation}.
 * <p>
 * The <code>RemovePermission</code> action removes a statement from a topic's access control policy.
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#removePermission(RemovePermissionRequest)
 */
public class RemovePermissionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ARN of the topic whose access control policy you wish to modify.
     */
    private String topicArn;

    /**
     * The unique label of the statement you want to remove.
     */
    private String label;

    /**
     * Default constructor for a new RemovePermissionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RemovePermissionRequest() {}
    
    /**
     * Constructs a new RemovePermissionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param topicArn The ARN of the topic whose access control policy you
     * wish to modify.
     * @param label The unique label of the statement you want to remove.
     */
    public RemovePermissionRequest(String topicArn, String label) {
        setTopicArn(topicArn);
        setLabel(label);
    }

    /**
     * The ARN of the topic whose access control policy you wish to modify.
     *
     * @return The ARN of the topic whose access control policy you wish to modify.
     */
    public String getTopicArn() {
        return topicArn;
    }
    
    /**
     * The ARN of the topic whose access control policy you wish to modify.
     *
     * @param topicArn The ARN of the topic whose access control policy you wish to modify.
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }
    
    /**
     * The ARN of the topic whose access control policy you wish to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicArn The ARN of the topic whose access control policy you wish to modify.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemovePermissionRequest withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * The unique label of the statement you want to remove.
     *
     * @return The unique label of the statement you want to remove.
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * The unique label of the statement you want to remove.
     *
     * @param label The unique label of the statement you want to remove.
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    /**
     * The unique label of the statement you want to remove.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param label The unique label of the statement you want to remove.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemovePermissionRequest withLabel(String label) {
        this.label = label;
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
        if (getTopicArn() != null) sb.append("TopicArn: " + getTopicArn() + ",");
        if (getLabel() != null) sb.append("Label: " + getLabel() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode()); 
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RemovePermissionRequest == false) return false;
        RemovePermissionRequest other = (RemovePermissionRequest)obj;
        
        if (other.getTopicArn() == null ^ this.getTopicArn() == null) return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false) return false; 
        if (other.getLabel() == null ^ this.getLabel() == null) return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false) return false; 
        return true;
    }
    
}
    