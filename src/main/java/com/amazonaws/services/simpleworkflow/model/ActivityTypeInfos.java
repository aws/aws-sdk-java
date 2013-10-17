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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;


/**
 * <p>
 * Contains a paginated list of activity type information structures.
 * </p>
 */
public class ActivityTypeInfos implements Serializable {

    /**
     * List of activity type information.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ActivityTypeInfo> typeInfos;

    /**
     * Returns a value if the results are paginated. To get the next page of
     * results, repeat the request specifying this token and all other
     * arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String nextPageToken;

    /**
     * List of activity type information.
     *
     * @return List of activity type information.
     */
    public java.util.List<ActivityTypeInfo> getTypeInfos() {
        if (typeInfos == null) {
              typeInfos = new com.amazonaws.internal.ListWithAutoConstructFlag<ActivityTypeInfo>();
              typeInfos.setAutoConstruct(true);
        }
        return typeInfos;
    }
    
    /**
     * List of activity type information.
     *
     * @param typeInfos List of activity type information.
     */
    public void setTypeInfos(java.util.Collection<ActivityTypeInfo> typeInfos) {
        if (typeInfos == null) {
            this.typeInfos = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ActivityTypeInfo> typeInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ActivityTypeInfo>(typeInfos.size());
        typeInfosCopy.addAll(typeInfos);
        this.typeInfos = typeInfosCopy;
    }
    
    /**
     * List of activity type information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param typeInfos List of activity type information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTypeInfos withTypeInfos(ActivityTypeInfo... typeInfos) {
        if (getTypeInfos() == null) setTypeInfos(new java.util.ArrayList<ActivityTypeInfo>(typeInfos.length));
        for (ActivityTypeInfo value : typeInfos) {
            getTypeInfos().add(value);
        }
        return this;
    }
    
    /**
     * List of activity type information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param typeInfos List of activity type information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTypeInfos withTypeInfos(java.util.Collection<ActivityTypeInfo> typeInfos) {
        if (typeInfos == null) {
            this.typeInfos = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ActivityTypeInfo> typeInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ActivityTypeInfo>(typeInfos.size());
            typeInfosCopy.addAll(typeInfos);
            this.typeInfos = typeInfosCopy;
        }

        return this;
    }

    /**
     * Returns a value if the results are paginated. To get the next page of
     * results, repeat the request specifying this token and all other
     * arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return Returns a value if the results are paginated. To get the next page of
     *         results, repeat the request specifying this token and all other
     *         arguments unchanged.
     */
    public String getNextPageToken() {
        return nextPageToken;
    }
    
    /**
     * Returns a value if the results are paginated. To get the next page of
     * results, repeat the request specifying this token and all other
     * arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken Returns a value if the results are paginated. To get the next page of
     *         results, repeat the request specifying this token and all other
     *         arguments unchanged.
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
    
    /**
     * Returns a value if the results are paginated. To get the next page of
     * results, repeat the request specifying this token and all other
     * arguments unchanged.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken Returns a value if the results are paginated. To get the next page of
     *         results, repeat the request specifying this token and all other
     *         arguments unchanged.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTypeInfos withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getTypeInfos() != null) sb.append("TypeInfos: " + getTypeInfos() + ",");
        if (getNextPageToken() != null) sb.append("NextPageToken: " + getNextPageToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTypeInfos() == null) ? 0 : getTypeInfos().hashCode()); 
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ActivityTypeInfos == false) return false;
        ActivityTypeInfos other = (ActivityTypeInfos)obj;
        
        if (other.getTypeInfos() == null ^ this.getTypeInfos() == null) return false;
        if (other.getTypeInfos() != null && other.getTypeInfos().equals(this.getTypeInfos()) == false) return false; 
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null) return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false) return false; 
        return true;
    }
    
}
    