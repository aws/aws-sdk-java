/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs.model;

/**
 * <p>
 * 
 * </p>
 */
public class GetQueueAttributesResult {

    /**
     * A list of attributes.
     */
    private java.util.Map<String,String> attributes;

    /**
     * A list of attributes.
     *
     * @return A list of attributes.
     */
    public java.util.Map<String,String> getAttributes() {
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * A list of attributes.
     *
     * @param attributes A list of attributes.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * A list of attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes A list of attributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetQueueAttributesResult withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
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
        sb.append("Attributes: " + attributes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    