/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that describes the name servers for this hosted zone.
 * </p>
 */
public class DelegationSet implements Serializable, Cloneable {

    /**
     * <p>
     * The ID that Amazon Route 53 assigns to a reusable delegation set.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A unique string that identifies the request, and that allows you to retry failed
     * <code>CreateReusableDelegationSet</code> requests without the risk of executing the operation twice. You must use
     * a unique <code>CallerReference</code> string every time you submit a <code>CreateReusableDelegationSet</code>
     * request. <code>CallerReference</code> can be any unique string, for example, a date/time stamp.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * A complex type that contains a list of the authoritative name servers for the hosted zone.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> nameServers;

    /**
     * Default constructor for DelegationSet object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public DelegationSet() {
    }

    /**
     * Constructs a new DelegationSet object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param nameServers
     *        A complex type that contains a list of the authoritative name servers for the hosted zone.
     */
    public DelegationSet(java.util.List<String> nameServers) {
        setNameServers(nameServers);
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigns to a reusable delegation set.
     * </p>
     * 
     * @param id
     *        The ID that Amazon Route 53 assigns to a reusable delegation set.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigns to a reusable delegation set.
     * </p>
     * 
     * @return The ID that Amazon Route 53 assigns to a reusable delegation set.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigns to a reusable delegation set.
     * </p>
     * 
     * @param id
     *        The ID that Amazon Route 53 assigns to a reusable delegation set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegationSet withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request, and that allows you to retry failed
     * <code>CreateReusableDelegationSet</code> requests without the risk of executing the operation twice. You must use
     * a unique <code>CallerReference</code> string every time you submit a <code>CreateReusableDelegationSet</code>
     * request. <code>CallerReference</code> can be any unique string, for example, a date/time stamp.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request, and that allows you to retry failed
     *        <code>CreateReusableDelegationSet</code> requests without the risk of executing the operation twice. You
     *        must use a unique <code>CallerReference</code> string every time you submit a
     *        <code>CreateReusableDelegationSet</code> request. <code>CallerReference</code> can be any unique string,
     *        for example, a date/time stamp.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request, and that allows you to retry failed
     * <code>CreateReusableDelegationSet</code> requests without the risk of executing the operation twice. You must use
     * a unique <code>CallerReference</code> string every time you submit a <code>CreateReusableDelegationSet</code>
     * request. <code>CallerReference</code> can be any unique string, for example, a date/time stamp.
     * </p>
     * 
     * @return A unique string that identifies the request, and that allows you to retry failed
     *         <code>CreateReusableDelegationSet</code> requests without the risk of executing the operation twice. You
     *         must use a unique <code>CallerReference</code> string every time you submit a
     *         <code>CreateReusableDelegationSet</code> request. <code>CallerReference</code> can be any unique string,
     *         for example, a date/time stamp.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request, and that allows you to retry failed
     * <code>CreateReusableDelegationSet</code> requests without the risk of executing the operation twice. You must use
     * a unique <code>CallerReference</code> string every time you submit a <code>CreateReusableDelegationSet</code>
     * request. <code>CallerReference</code> can be any unique string, for example, a date/time stamp.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request, and that allows you to retry failed
     *        <code>CreateReusableDelegationSet</code> requests without the risk of executing the operation twice. You
     *        must use a unique <code>CallerReference</code> string every time you submit a
     *        <code>CreateReusableDelegationSet</code> request. <code>CallerReference</code> can be any unique string,
     *        for example, a date/time stamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegationSet withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * A complex type that contains a list of the authoritative name servers for the hosted zone.
     * </p>
     * 
     * @return A complex type that contains a list of the authoritative name servers for the hosted zone.
     */

    public java.util.List<String> getNameServers() {
        if (nameServers == null) {
            nameServers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return nameServers;
    }

    /**
     * <p>
     * A complex type that contains a list of the authoritative name servers for the hosted zone.
     * </p>
     * 
     * @param nameServers
     *        A complex type that contains a list of the authoritative name servers for the hosted zone.
     */

    public void setNameServers(java.util.Collection<String> nameServers) {
        if (nameServers == null) {
            this.nameServers = null;
            return;
        }

        this.nameServers = new com.amazonaws.internal.SdkInternalList<String>(nameServers);
    }

    /**
     * <p>
     * A complex type that contains a list of the authoritative name servers for the hosted zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNameServers(java.util.Collection)} or {@link #withNameServers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nameServers
     *        A complex type that contains a list of the authoritative name servers for the hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegationSet withNameServers(String... nameServers) {
        if (this.nameServers == null) {
            setNameServers(new com.amazonaws.internal.SdkInternalList<String>(nameServers.length));
        }
        for (String ele : nameServers) {
            this.nameServers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains a list of the authoritative name servers for the hosted zone.
     * </p>
     * 
     * @param nameServers
     *        A complex type that contains a list of the authoritative name servers for the hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegationSet withNameServers(java.util.Collection<String> nameServers) {
        setNameServers(nameServers);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getNameServers() == null ^ this.getNameServers() == null)
            return false;
        if (other.getNameServers() != null && other.getNameServers().equals(this.getNameServers()) == false)
            return false;
        return true;
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
    public DelegationSet clone() {
        try {
            return (DelegationSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
