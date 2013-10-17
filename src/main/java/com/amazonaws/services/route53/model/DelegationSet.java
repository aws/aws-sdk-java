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
package com.amazonaws.services.route53.model;

import java.io.Serializable;


/**
 * <p>
 * A complex type that contains name server information.
 * </p>
 */
public class DelegationSet implements Serializable {

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
        if (getNameServers() != null) sb.append("NameServers: " + getNameServers() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNameServers() == null) ? 0 : getNameServers().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DelegationSet == false) return false;
        DelegationSet other = (DelegationSet)obj;
        
        if (other.getNameServers() == null ^ this.getNameServers() == null) return false;
        if (other.getNameServers() != null && other.getNameServers().equals(this.getNameServers()) == false) return false; 
        return true;
    }
    
}
    