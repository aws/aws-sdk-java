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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitosync.AmazonCognitoSync#setCognitoEvents(SetCognitoEventsRequest) SetCognitoEvents operation}.
 * <p>
 * Sets the AWS Lambda function for a given event type for an identity
 * pool. This request only updates the key/value pair specified. Other
 * key/values pairs are not updated. To remove a key value pair, pass a
 * empty value for the particular key.
 * </p>
 *
 * @see com.amazonaws.services.cognitosync.AmazonCognitoSync#setCognitoEvents(SetCognitoEventsRequest)
 */
public class SetCognitoEventsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Cognito Identity Pool to use when configuring Cognito Events
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * The events to configure
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     */
    private java.util.Map<String,String> events;

    /**
     * The Cognito Identity Pool to use when configuring Cognito Events
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return The Cognito Identity Pool to use when configuring Cognito Events
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }
    
    /**
     * The Cognito Identity Pool to use when configuring Cognito Events
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId The Cognito Identity Pool to use when configuring Cognito Events
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }
    
    /**
     * The Cognito Identity Pool to use when configuring Cognito Events
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId The Cognito Identity Pool to use when configuring Cognito Events
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetCognitoEventsRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * The events to configure
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     *
     * @return The events to configure
     */
    public java.util.Map<String,String> getEvents() {
        
        if (events == null) {
            events = new java.util.HashMap<String,String>();
        }
        return events;
    }
    
    /**
     * The events to configure
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     *
     * @param events The events to configure
     */
    public void setEvents(java.util.Map<String,String> events) {
        this.events = events;
    }
    
    /**
     * The events to configure
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     *
     * @param events The events to configure
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetCognitoEventsRequest withEvents(java.util.Map<String,String> events) {
        setEvents(events);
        return this;
    }

    /**
     * The events to configure
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
  public SetCognitoEventsRequest addEventsEntry(String key, String value) {
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
  public SetCognitoEventsRequest clearEventsEntries() {
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
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getEvents() != null) sb.append("Events: " + getEvents() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetCognitoEventsRequest == false) return false;
        SetCognitoEventsRequest other = (SetCognitoEventsRequest)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getEvents() == null ^ this.getEvents() == null) return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false) return false; 
        return true;
    }
    
    @Override
    public SetCognitoEventsRequest clone() {
        
            return (SetCognitoEventsRequest) super.clone();
    }

}
    