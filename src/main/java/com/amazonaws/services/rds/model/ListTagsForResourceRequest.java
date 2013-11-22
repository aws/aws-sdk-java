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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#listTagsForResource(ListTagsForResourceRequest) ListTagsForResource operation}.
 * <p>
 * Lists all tags on an Amazon RDS resource.
 * </p>
 * <p>
 * For an overview on tagging an Amazon RDS resource, see <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html"> Tagging
 * Amazon RDS Resources </a> .
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#listTagsForResource(ListTagsForResourceRequest)
 */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon RDS resource with tags to be listed. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see
     * <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     */
    private String resourceName;

    /**
     * The Amazon RDS resource with tags to be listed. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see
     * <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     *
     * @return The Amazon RDS resource with tags to be listed. This value is an
     *         Amazon Resource Name (ARN). For information about creating an ARN, see
     *         <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing an RDS Amazon Resource Name (ARN)</a>.
     */
    public String getResourceName() {
        return resourceName;
    }
    
    /**
     * The Amazon RDS resource with tags to be listed. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see
     * <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     *
     * @param resourceName The Amazon RDS resource with tags to be listed. This value is an
     *         Amazon Resource Name (ARN). For information about creating an ARN, see
     *         <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing an RDS Amazon Resource Name (ARN)</a>.
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    /**
     * The Amazon RDS resource with tags to be listed. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see
     * <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceName The Amazon RDS resource with tags to be listed. This value is an
     *         Amazon Resource Name (ARN). For information about creating an ARN, see
     *         <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing an RDS Amazon Resource Name (ARN)</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListTagsForResourceRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
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
        if (getResourceName() != null) sb.append("ResourceName: " + getResourceName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTagsForResourceRequest == false) return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest)obj;
        
        if (other.getResourceName() == null ^ this.getResourceName() == null) return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false) return false; 
        return true;
    }
    
}
    