/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
public class DelegationSet implements Serializable, Cloneable {

    private String id;

    private String callerReference;
    /**
     * <p>
     * A complex type that contains the authoritative name servers for the
     * hosted zone. Use the method provided by your domain registrar to add an
     * NS record to your domain for each <code>NameServer</code> that is
     * assigned to your hosted zone.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> nameServers;

    /**
     * Default constructor for DelegationSet object. Callers should use the
     * setter or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public DelegationSet() {
    }

    /**
     * Constructs a new DelegationSet object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param nameServers
     *        A complex type that contains the authoritative name servers for
     *        the hosted zone. Use the method provided by your domain registrar
     *        to add an NS record to your domain for each
     *        <code>NameServer</code> that is assigned to your hosted zone.
     */
    public DelegationSet(java.util.List<String> nameServers) {
        setNameServers(nameServers);
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DelegationSet withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param callerReference
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * @return
     */
    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * @param callerReference
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DelegationSet withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * A complex type that contains the authoritative name servers for the
     * hosted zone. Use the method provided by your domain registrar to add an
     * NS record to your domain for each <code>NameServer</code> that is
     * assigned to your hosted zone.
     * </p>
     * 
     * @return A complex type that contains the authoritative name servers for
     *         the hosted zone. Use the method provided by your domain registrar
     *         to add an NS record to your domain for each
     *         <code>NameServer</code> that is assigned to your hosted zone.
     */
    public java.util.List<String> getNameServers() {
        if (nameServers == null) {
            nameServers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return nameServers;
    }

    /**
     * <p>
     * A complex type that contains the authoritative name servers for the
     * hosted zone. Use the method provided by your domain registrar to add an
     * NS record to your domain for each <code>NameServer</code> that is
     * assigned to your hosted zone.
     * </p>
     * 
     * @param nameServers
     *        A complex type that contains the authoritative name servers for
     *        the hosted zone. Use the method provided by your domain registrar
     *        to add an NS record to your domain for each
     *        <code>NameServer</code> that is assigned to your hosted zone.
     */
    public void setNameServers(java.util.Collection<String> nameServers) {
        if (nameServers == null) {
            this.nameServers = null;
            return;
        }

        this.nameServers = new com.amazonaws.internal.SdkInternalList<String>(
                nameServers);
    }

    /**
     * <p>
     * A complex type that contains the authoritative name servers for the
     * hosted zone. Use the method provided by your domain registrar to add an
     * NS record to your domain for each <code>NameServer</code> that is
     * assigned to your hosted zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNameServers(java.util.Collection)} or
     * {@link #withNameServers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param nameServers
     *        A complex type that contains the authoritative name servers for
     *        the hosted zone. Use the method provided by your domain registrar
     *        to add an NS record to your domain for each
     *        <code>NameServer</code> that is assigned to your hosted zone.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DelegationSet withNameServers(String... nameServers) {
        if (this.nameServers == null) {
            setNameServers(new com.amazonaws.internal.SdkInternalList<String>(
                    nameServers.length));
        }
        for (String ele : nameServers) {
            this.nameServers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains the authoritative name servers for the
     * hosted zone. Use the method provided by your domain registrar to add an
     * NS record to your domain for each <code>NameServer</code> that is
     * assigned to your hosted zone.
     * </p>
     * 
     * @param nameServers
     *        A complex type that contains the authoritative name servers for
     *        the hosted zone. Use the method provided by your domain registrar
     *        to add an NS record to your domain for each
     *        <code>NameServer</code> that is assigned to your hosted zone.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DelegationSet withNameServers(
            java.util.Collection<String> nameServers) {
        setNameServers(nameServers);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference() + ",");
        if (getNameServers() != null)
            sb.append("NameServers: " + getNameServers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DelegationSet == false)
            return false;
        DelegationSet other = (DelegationSet) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCallerReference() == null
                ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getNameServers() == null ^ this.getNameServers() == null)
            return false;
        if (other.getNameServers() != null
                && other.getNameServers().equals(this.getNameServers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNameServers() == null) ? 0 : getNameServers().hashCode());
        return hashCode;
    }

    @Override
    public DelegationSet clone() {
        try {
            return (DelegationSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}