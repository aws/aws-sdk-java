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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * <p>
 * The response from the GetCognitoEvents request
 * </p>
 */
public class GetCognitoEventsResult implements Serializable, Cloneable {

    /**
     * The Cognito Events returned from the GetCognitoEvents request
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     */
    private java.util.Map<String,String> events;

    /**
     * The Cognito Events returned from the GetCognitoEvents request
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     *
     * @return The Cognito Events returned from the GetCognitoEvents request
     */
    public java.util.Map<String,String> getEvents() {
        
        if (events == null) {
            events = new java.util.HashMap<String,String>();
        }
        return events;
    }
    
    /**
     * The Cognito Events returned from the GetCognitoEvents request
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     *
     * @param events The Cognito Events returned from the GetCognitoEvents request
     */
    public void setEvents(java.util.Map<String,String> events) {
        this.events = events;
    }
    
    /**
     * The Cognito Events returned from the GetCognitoEvents request
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     *
     * @param events The Cognito Events returned from the GetCognitoEvents request
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetCognitoEventsResult withEvents(java.util.Map<String,String> events) {
        setEvents(events);
        return this;
    }

    /**
     * The Cognito Events returned from the GetCognitoEvents request
     * <p>
     * The method adds a new key-value pair into Events parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     *
     * @param key The key of the entry to be added into Events.
     * @param value The corresponding value of the entry to be added into Events.
     */
  public GetCognitoEventsResult addEventsEntry(String key, String value) {
    if (null == this.events) {
      this.events = new java.util.HashMap<String,String>();
    }
    if (this.events.containsKey(key))
      throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
    this.events.put(key, value);
    return this;
  }

  /**
   * Removes all the entries added into Events.
   * <p>
   * Returns a reference to this object so that method calls can be chained together.
   */
  public GetCognitoEventsResult clearEventsEntries() {
    this.events = null;
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
        if (getEvents() != null) sb.append("Events: " + getEvents() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetCognitoEventsResult == false) return false;
        GetCognitoEventsResult other = (GetCognitoEventsResult)obj;
        
        if (other.getEvents() == null ^ this.getEvents() == null) return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false) return false; 
        return true;
    }
    
    @Override
    public GetCognitoEventsResult clone() {
        try {
            return (GetCognitoEventsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    