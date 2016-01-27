/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * 
 */
public class ListVersionsByFunctionResult implements Serializable, Cloneable {

    /**
     * A string, present if there are more function versions.
     */
    private String nextMarker;

    /**
     * A list of Lambda function versions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<FunctionConfiguration> versions;

    /**
     * A string, present if there are more function versions.
     *
     * @return A string, present if there are more function versions.
     */
    public String getNextMarker() {
        return nextMarker;
    }
    
    /**
     * A string, present if there are more function versions.
     *
     * @param nextMarker A string, present if there are more function versions.
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }
    
    /**
     * A string, present if there are more function versions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextMarker A string, present if there are more function versions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListVersionsByFunctionResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * A list of Lambda function versions.
     *
     * @return A list of Lambda function versions.
     */
    public java.util.List<FunctionConfiguration> getVersions() {
        if (versions == null) {
              versions = new com.amazonaws.internal.ListWithAutoConstructFlag<FunctionConfiguration>();
              versions.setAutoConstruct(true);
        }
        return versions;
    }
    
    /**
     * A list of Lambda function versions.
     *
     * @param versions A list of Lambda function versions.
     */
    public void setVersions(java.util.Collection<FunctionConfiguration> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<FunctionConfiguration> versionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<FunctionConfiguration>(versions.size());
        versionsCopy.addAll(versions);
        this.versions = versionsCopy;
    }
    
    /**
     * A list of Lambda function versions.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVersions(java.util.Collection)} or {@link
     * #withVersions(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versions A list of Lambda function versions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListVersionsByFunctionResult withVersions(FunctionConfiguration... versions) {
        if (getVersions() == null) setVersions(new java.util.ArrayList<FunctionConfiguration>(versions.length));
        for (FunctionConfiguration value : versions) {
            getVersions().add(value);
        }
        return this;
    }
    
    /**
     * A list of Lambda function versions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versions A list of Lambda function versions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListVersionsByFunctionResult withVersions(java.util.Collection<FunctionConfiguration> versions) {
        if (versions == null) {
            this.versions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<FunctionConfiguration> versionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<FunctionConfiguration>(versions.size());
            versionsCopy.addAll(versions);
            this.versions = versionsCopy;
        }

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
        if (getNextMarker() != null) sb.append("NextMarker: " + getNextMarker() + ",");
        if (getVersions() != null) sb.append("Versions: " + getVersions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListVersionsByFunctionResult == false) return false;
        ListVersionsByFunctionResult other = (ListVersionsByFunctionResult)obj;
        
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        if (other.getVersions() == null ^ this.getVersions() == null) return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false) return false; 
        return true;
    }
    
    @Override
    public ListVersionsByFunctionResult clone() {
        try {
            return (ListVersionsByFunctionResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    