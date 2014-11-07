/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains name server information.
 * </p>
 */
public class DelegationSet implements Serializable {

    private String id;

    private String callerReference;

    /**
     * A complex type that contains the authoritative name servers for the
     * hosted zone. Use the method provided by your domain registrar to add
     * an NS record to your domain for each <code>NameServer</code> that is
     * assigned to your hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> nameServers;

    /**
     * Default constructor for a new DelegationSet object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DelegationSet() {}
    
    /**
     * Constructs a new DelegationSet object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param nameServers A complex type that contains the authoritative name
     * servers for the hosted zone. Use the method provided by your domain
     * registrar to add an NS record to your domain for each
     * <code>NameServer</code> that is assigned to your hosted zone.
     */
    public DelegationSet(java.util.List<String> nameServers) {
        setNameServers(nameServers);
    }

    /**
     * Returns the value of the Id property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return The value of the Id property for this object.
     */
    public String getId() {
        return id;
    }
    
    /**
     * Sets the value of the Id property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param id The new value for the Id property for this object.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Sets the value of the Id property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param id The new value for the Id property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DelegationSet withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns the value of the CallerReference property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return The value of the CallerReference property for this object.
     */
    public String getCallerReference() {
        return callerReference;
    }
    
    /**
     * Sets the value of the CallerReference property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference The new value for the CallerReference property for this object.
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }
    
    /**
     * Sets the value of the CallerReference property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference The new value for the CallerReference property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DelegationSet withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * A complex type that contains the authoritative name servers for the
     * hosted zone. Use the method provided by your domain registrar to add
     * an NS record to your domain for each <code>NameServer</code> that is
     * assigned to your hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A complex type that contains the authoritative name servers for the
     *         hosted zone. Use the method provided by your domain registrar to add
     *         an NS record to your domain for each <code>NameServer</code> that is
     *         assigned to your hosted zone.
     */
    public java.util.List<String> getNameServers() {
        if (nameServers == null) {
              nameServers = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              nameServers.setAutoConstruct(true);
        }
        return nameServers;
    }
    
    /**
     * A complex type that contains the authoritative name servers for the
     * hosted zone. Use the method provided by your domain registrar to add
     * an NS record to your domain for each <code>NameServer</code> that is
     * assigned to your hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nameServers A complex type that contains the authoritative name servers for the
     *         hosted zone. Use the method provided by your domain registrar to add
     *         an NS record to your domain for each <code>NameServer</code> that is
     *         assigned to your hosted zone.
     */
    public void setNameServers(java.util.Collection<String> nameServers) {
        if (nameServers == null) {
            this.nameServers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> nameServersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(nameServers.size());
        nameServersCopy.addAll(nameServers);
        this.nameServers = nameServersCopy;
    }
    
    /**
     * A complex type that contains the authoritative name servers for the
     * hosted zone. Use the method provided by your domain registrar to add
     * an NS record to your domain for each <code>NameServer</code> that is
     * assigned to your hosted zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nameServers A complex type that contains the authoritative name servers for the
     *         hosted zone. Use the method provided by your domain registrar to add
     *         an NS record to your domain for each <code>NameServer</code> that is
     *         assigned to your hosted zone.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DelegationSet withNameServers(String... nameServers) {
        if (getNameServers() == null) setNameServers(new java.util.ArrayList<String>(nameServers.length));
        for (String value : nameServers) {
            getNameServers().add(value);
        }
        return this;
    }
    
    /**
     * A complex type that contains the authoritative name servers for the
     * hosted zone. Use the method provided by your domain registrar to add
     * an NS record to your domain for each <code>NameServer</code> that is
     * assigned to your hosted zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nameServers A complex type that contains the authoritative name servers for the
     *         hosted zone. Use the method provided by your domain registrar to add
     *         an NS record to your domain for each <code>NameServer</code> that is
     *         assigned to your hosted zone.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DelegationSet withNameServers(java.util.Collection<String> nameServers) {
        if (nameServers == null) {
            this.nameServers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> nameServersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(nameServers.size());
            nameServersCopy.addAll(nameServers);
            this.nameServers = nameServersCopy;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getCallerReference() != null) sb.append("CallerReference: " + getCallerReference() + ",");
        if (getNameServers() != null) sb.append("NameServers: " + getNameServers() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode()); 
        hashCode = prime * hashCode + ((getNameServers() == null) ? 0 : getNameServers().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DelegationSet == false) return false;
        DelegationSet other = (DelegationSet)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getCallerReference() == null ^ this.getCallerReference() == null) return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false) return false; 
        if (other.getNameServers() == null ^ this.getNameServers() == null) return false;
        if (other.getNameServers() != null && other.getNameServers().equals(this.getNameServers()) == false) return false; 
        return true;
    }
    
}
    