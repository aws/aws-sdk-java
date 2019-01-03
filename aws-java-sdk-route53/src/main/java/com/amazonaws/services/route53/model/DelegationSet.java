/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that lists the name servers in a delegation set, as well as the <code>CallerReference</code> and the
 * <code>ID</code> for the delegation set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DelegationSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DelegationSet implements Serializable, Cloneable {

    /**
     * <p>
     * The ID that Amazon Route 53 assigns to a reusable delegation set.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The value that you specified for <code>CallerReference</code> when you created the reusable delegation set.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * A complex type that contains a list of the authoritative name servers for a hosted zone or for a reusable
     * delegation set.
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
     *        A complex type that contains a list of the authoritative name servers for a hosted zone or for a reusable
     *        delegation set.
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
     * The value that you specified for <code>CallerReference</code> when you created the reusable delegation set.
     * </p>
     * 
     * @param callerReference
     *        The value that you specified for <code>CallerReference</code> when you created the reusable delegation
     *        set.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * The value that you specified for <code>CallerReference</code> when you created the reusable delegation set.
     * </p>
     * 
     * @return The value that you specified for <code>CallerReference</code> when you created the reusable delegation
     *         set.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * The value that you specified for <code>CallerReference</code> when you created the reusable delegation set.
     * </p>
     * 
     * @param callerReference
     *        The value that you specified for <code>CallerReference</code> when you created the reusable delegation
     *        set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegationSet withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * A complex type that contains a list of the authoritative name servers for a hosted zone or for a reusable
     * delegation set.
     * </p>
     * 
     * @return A complex type that contains a list of the authoritative name servers for a hosted zone or for a reusable
     *         delegation set.
     */

    public java.util.List<String> getNameServers() {
        if (nameServers == null) {
            nameServers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return nameServers;
    }

    /**
     * <p>
     * A complex type that contains a list of the authoritative name servers for a hosted zone or for a reusable
     * delegation set.
     * </p>
     * 
     * @param nameServers
     *        A complex type that contains a list of the authoritative name servers for a hosted zone or for a reusable
     *        delegation set.
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
     * A complex type that contains a list of the authoritative name servers for a hosted zone or for a reusable
     * delegation set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNameServers(java.util.Collection)} or {@link #withNameServers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nameServers
     *        A complex type that contains a list of the authoritative name servers for a hosted zone or for a reusable
     *        delegation set.
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
     * A complex type that contains a list of the authoritative name servers for a hosted zone or for a reusable
     * delegation set.
     * </p>
     * 
     * @param nameServers
     *        A complex type that contains a list of the authoritative name servers for a hosted zone or for a reusable
     *        delegation set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegationSet withNameServers(java.util.Collection<String> nameServers) {
        setNameServers(nameServers);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
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
            sb.append("Id: ").append(getId()).append(",");
        if (getCallerReference() != null)
            sb.append("CallerReference: ").append(getCallerReference()).append(",");
        if (getNameServers() != null)
            sb.append("NameServers: ").append(getNameServers());
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
