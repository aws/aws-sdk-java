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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;


/**
 * <p>
 * Represents the destination of the message, consisting of To:, CC:, and BCC: fields.
 * </p>
 */
public class Destination implements Serializable {

    /**
     * The To: field(s) of the message.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> toAddresses;

    /**
     * The CC: field(s) of the message.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ccAddresses;

    /**
     * The BCC: field(s) of the message.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> bccAddresses;

    /**
     * Default constructor for a new Destination object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Destination() {}
    
    /**
     * Constructs a new Destination object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param toAddresses The To: field(s) of the message.
     */
    public Destination(java.util.List<String> toAddresses) {
        setToAddresses(toAddresses);
    }

    /**
     * The To: field(s) of the message.
     *
     * @return The To: field(s) of the message.
     */
    public java.util.List<String> getToAddresses() {
        if (toAddresses == null) {
              toAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              toAddresses.setAutoConstruct(true);
        }
        return toAddresses;
    }
    
    /**
     * The To: field(s) of the message.
     *
     * @param toAddresses The To: field(s) of the message.
     */
    public void setToAddresses(java.util.Collection<String> toAddresses) {
        if (toAddresses == null) {
            this.toAddresses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> toAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(toAddresses.size());
        toAddressesCopy.addAll(toAddresses);
        this.toAddresses = toAddressesCopy;
    }
    
    /**
     * The To: field(s) of the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param toAddresses The To: field(s) of the message.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Destination withToAddresses(String... toAddresses) {
        if (getToAddresses() == null) setToAddresses(new java.util.ArrayList<String>(toAddresses.length));
        for (String value : toAddresses) {
            getToAddresses().add(value);
        }
        return this;
    }
    
    /**
     * The To: field(s) of the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param toAddresses The To: field(s) of the message.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Destination withToAddresses(java.util.Collection<String> toAddresses) {
        if (toAddresses == null) {
            this.toAddresses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> toAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(toAddresses.size());
            toAddressesCopy.addAll(toAddresses);
            this.toAddresses = toAddressesCopy;
        }

        return this;
    }

    /**
     * The CC: field(s) of the message.
     *
     * @return The CC: field(s) of the message.
     */
    public java.util.List<String> getCcAddresses() {
        if (ccAddresses == null) {
              ccAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ccAddresses.setAutoConstruct(true);
        }
        return ccAddresses;
    }
    
    /**
     * The CC: field(s) of the message.
     *
     * @param ccAddresses The CC: field(s) of the message.
     */
    public void setCcAddresses(java.util.Collection<String> ccAddresses) {
        if (ccAddresses == null) {
            this.ccAddresses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> ccAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ccAddresses.size());
        ccAddressesCopy.addAll(ccAddresses);
        this.ccAddresses = ccAddressesCopy;
    }
    
    /**
     * The CC: field(s) of the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ccAddresses The CC: field(s) of the message.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Destination withCcAddresses(String... ccAddresses) {
        if (getCcAddresses() == null) setCcAddresses(new java.util.ArrayList<String>(ccAddresses.length));
        for (String value : ccAddresses) {
            getCcAddresses().add(value);
        }
        return this;
    }
    
    /**
     * The CC: field(s) of the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ccAddresses The CC: field(s) of the message.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Destination withCcAddresses(java.util.Collection<String> ccAddresses) {
        if (ccAddresses == null) {
            this.ccAddresses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> ccAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ccAddresses.size());
            ccAddressesCopy.addAll(ccAddresses);
            this.ccAddresses = ccAddressesCopy;
        }

        return this;
    }

    /**
     * The BCC: field(s) of the message.
     *
     * @return The BCC: field(s) of the message.
     */
    public java.util.List<String> getBccAddresses() {
        if (bccAddresses == null) {
              bccAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              bccAddresses.setAutoConstruct(true);
        }
        return bccAddresses;
    }
    
    /**
     * The BCC: field(s) of the message.
     *
     * @param bccAddresses The BCC: field(s) of the message.
     */
    public void setBccAddresses(java.util.Collection<String> bccAddresses) {
        if (bccAddresses == null) {
            this.bccAddresses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> bccAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(bccAddresses.size());
        bccAddressesCopy.addAll(bccAddresses);
        this.bccAddresses = bccAddressesCopy;
    }
    
    /**
     * The BCC: field(s) of the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bccAddresses The BCC: field(s) of the message.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Destination withBccAddresses(String... bccAddresses) {
        if (getBccAddresses() == null) setBccAddresses(new java.util.ArrayList<String>(bccAddresses.length));
        for (String value : bccAddresses) {
            getBccAddresses().add(value);
        }
        return this;
    }
    
    /**
     * The BCC: field(s) of the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bccAddresses The BCC: field(s) of the message.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Destination withBccAddresses(java.util.Collection<String> bccAddresses) {
        if (bccAddresses == null) {
            this.bccAddresses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> bccAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(bccAddresses.size());
            bccAddressesCopy.addAll(bccAddresses);
            this.bccAddresses = bccAddressesCopy;
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
        if (getToAddresses() != null) sb.append("ToAddresses: " + getToAddresses() + ",");
        if (getCcAddresses() != null) sb.append("CcAddresses: " + getCcAddresses() + ",");
        if (getBccAddresses() != null) sb.append("BccAddresses: " + getBccAddresses() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getToAddresses() == null) ? 0 : getToAddresses().hashCode()); 
        hashCode = prime * hashCode + ((getCcAddresses() == null) ? 0 : getCcAddresses().hashCode()); 
        hashCode = prime * hashCode + ((getBccAddresses() == null) ? 0 : getBccAddresses().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Destination == false) return false;
        Destination other = (Destination)obj;
        
        if (other.getToAddresses() == null ^ this.getToAddresses() == null) return false;
        if (other.getToAddresses() != null && other.getToAddresses().equals(this.getToAddresses()) == false) return false; 
        if (other.getCcAddresses() == null ^ this.getCcAddresses() == null) return false;
        if (other.getCcAddresses() != null && other.getCcAddresses().equals(this.getCcAddresses()) == false) return false; 
        if (other.getBccAddresses() == null ^ this.getBccAddresses() == null) return false;
        if (other.getBccAddresses() != null && other.getBccAddresses().equals(this.getBccAddresses()) == false) return false; 
        return true;
    }
    
}
    